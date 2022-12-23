package com.amazon.device.ads;

import com.amazon.device.ads.AdvertisingIdentifier;
import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.SISRequest;
import com.amazon.device.ads.SISRequestor;
import com.amazon.device.ads.ThreadUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

class SISRegistration {
    protected static final long DEFAULT_SIS_CHECKIN_INTERVAL = 86400000;
    private static final String LOGTAG = SISRegistration.class.getSimpleName();
    private static final String SIS_LAST_CHECKIN_PREF_NAME = "amzn-ad-sis-last-checkin";
    private static final ThreadUtils.SingleThreadScheduler singleThreadScheduler = new ThreadUtils.SingleThreadScheduler();
    private final AdvertisingIdentifier advertisingIdentifier;
    private final AppEventRegistrationHandler appEventRegistrationHandler;
    private final Configuration configuration;
    private final DebugProperties debugProperties;
    private final ThreadUtils.RunnableExecutor executor;
    private final MobileAdsInfoStore infoStore;
    private final MobileAdsLogger logger;
    private final Settings settings;
    private final SISRequest.SISRequestFactory sisRequestFactory;
    private final SISRequestor.SISRequestorFactory sisRequestorFactory;
    private final SystemTime systemTime;
    private final ThreadUtils.ThreadVerify threadVerify;

    public SISRegistration() {
        this(new SISRequest.SISRequestFactory(), new SISRequestor.SISRequestorFactory(), new AdvertisingIdentifier(), MobileAdsInfoStore.getInstance(), Configuration.getInstance(), Settings.getInstance(), AppEventRegistrationHandler.getInstance(), new SystemTime(), singleThreadScheduler, new ThreadUtils.ThreadVerify(), new MobileAdsLoggerFactory(), DebugProperties.getInstance());
    }

    SISRegistration(SISRequest.SISRequestFactory sISRequestFactory, SISRequestor.SISRequestorFactory sISRequestorFactory, AdvertisingIdentifier advertisingIdentifier2, MobileAdsInfoStore mobileAdsInfoStore, Configuration configuration2, Settings settings2, AppEventRegistrationHandler appEventRegistrationHandler2, SystemTime systemTime2, ThreadUtils.RunnableExecutor runnableExecutor, ThreadUtils.ThreadVerify threadVerify2, MobileAdsLoggerFactory mobileAdsLoggerFactory, DebugProperties debugProperties2) {
        this.sisRequestFactory = sISRequestFactory;
        this.sisRequestorFactory = sISRequestorFactory;
        this.advertisingIdentifier = advertisingIdentifier2;
        this.infoStore = mobileAdsInfoStore;
        this.configuration = configuration2;
        this.settings = settings2;
        this.appEventRegistrationHandler = appEventRegistrationHandler2;
        this.systemTime = systemTime2;
        this.executor = runnableExecutor;
        this.threadVerify = threadVerify2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.debugProperties = debugProperties2;
    }

    /* access modifiers changed from: private */
    public MobileAdsLogger getLogger() {
        return this.logger;
    }

    /* access modifiers changed from: protected */
    public boolean canRegister(long j) {
        RegistrationInfo registrationInfo = this.infoStore.getRegistrationInfo();
        if (exceededCheckinInterval(j) || registrationInfo.shouldGetNewSISDeviceIdentifer() || registrationInfo.shouldGetNewSISRegistration() || this.debugProperties.getDebugPropertyAsBoolean(DebugProperties.DEBUG_SHOULD_REGISTER_SIS, false).booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean shouldUpdateDeviceInfo() {
        return this.infoStore.getRegistrationInfo().isRegisteredWithSIS();
    }

    public void registerApp() {
        this.executor.execute(new Runnable() {
            public void run() {
                SISRegistration.this.waitForConfigurationThenBeginRegistration();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void waitForConfigurationThenBeginRegistration() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.configuration.queueConfigurationListener(new Configuration.ConfigurationListener() {
            public void onConfigurationReady() {
                atomicBoolean.set(true);
                countDownLatch.countDown();
            }

            public void onConfigurationFailure() {
                SISRegistration.this.getLogger().mo10942w("Configuration fetching failed so device registration will not proceed.");
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        if (atomicBoolean.get()) {
            registerAppWorker();
        }
    }

    /* access modifiers changed from: package-private */
    public void registerAppWorker() {
        long currentTimeMillis = this.systemTime.currentTimeMillis();
        if (this.advertisingIdentifier.getAdvertisingIdentifierInfo().canDo() && canRegister(currentTimeMillis)) {
            putLastSISCheckin(currentTimeMillis);
            if (shouldUpdateDeviceInfo()) {
                updateDeviceInfo(this.advertisingIdentifier);
            } else {
                register(this.advertisingIdentifier);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean exceededCheckinInterval(long j) {
        return j - getLastSISCheckin() > this.debugProperties.getDebugPropertyAsLong(DebugProperties.DEBUG_SIS_CHECKIN_INTERVAL, Long.valueOf(DEFAULT_SIS_CHECKIN_INTERVAL)).longValue();
    }

    /* access modifiers changed from: protected */
    public void register(AdvertisingIdentifier advertisingIdentifier2) {
        SISDeviceRequest createDeviceRequest = this.sisRequestFactory.createDeviceRequest(SISRequest.SISDeviceRequestType.GENERATE_DID, advertisingIdentifier2);
        RegisterEventsSISRequestorCallback registerEventsSISRequestorCallback = new RegisterEventsSISRequestorCallback(this);
        this.sisRequestorFactory.createSISRequestor(registerEventsSISRequestorCallback, createDeviceRequest).startCallSIS();
    }

    /* access modifiers changed from: protected */
    public void updateDeviceInfo(AdvertisingIdentifier advertisingIdentifier2) {
        SISDeviceRequest createDeviceRequest = this.sisRequestFactory.createDeviceRequest(SISRequest.SISDeviceRequestType.UPDATE_DEVICE_INFO, advertisingIdentifier2);
        RegisterEventsSISRequestorCallback registerEventsSISRequestorCallback = new RegisterEventsSISRequestorCallback(this);
        this.sisRequestorFactory.createSISRequestor(registerEventsSISRequestorCallback, createDeviceRequest).startCallSIS();
    }

    /* access modifiers changed from: protected */
    public long getLastSISCheckin() {
        return this.settings.getLong(SIS_LAST_CHECKIN_PREF_NAME, 0);
    }

    private void putLastSISCheckin(long j) {
        this.settings.putLong(SIS_LAST_CHECKIN_PREF_NAME, j);
    }

    /* access modifiers changed from: protected */
    public void registerEvents() {
        JSONArray appEventsJSONArray;
        if (this.threadVerify.isOnMainThread()) {
            getLogger().mo10939e("Registering events must be done on a background thread.");
            return;
        }
        AdvertisingIdentifier.Info advertisingIdentifierInfo = this.advertisingIdentifier.getAdvertisingIdentifierInfo();
        if (advertisingIdentifierInfo.hasSISDeviceIdentifier() && (appEventsJSONArray = this.appEventRegistrationHandler.getAppEventsJSONArray()) != null) {
            SISRegisterEventRequest createRegisterEventRequest = this.sisRequestFactory.createRegisterEventRequest(advertisingIdentifierInfo, appEventsJSONArray);
            this.sisRequestorFactory.createSISRequestor(createRegisterEventRequest).startCallSIS();
        }
    }

    protected static class RegisterEventsSISRequestorCallback implements SISRequestorCallback {
        private final SISRegistration sisRegistration;

        public RegisterEventsSISRequestorCallback(SISRegistration sISRegistration) {
            this.sisRegistration = sISRegistration;
        }

        public void onSISCallComplete() {
            this.sisRegistration.registerEvents();
        }
    }
}
