package com.amazon.device.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

public class AdActivity extends Activity {
    static final String ADAPTER_KEY = "adapter";
    /* access modifiers changed from: private */
    public static final String LOGTAG = AdActivity.class.getSimpleName();
    private ActivityAdapterFactory activityAdapterFactory;
    private AdActivityAdapter adapter;
    private AdRegistrationExecutor amazonAdRegistration;
    private MobileAdsLogger logger;

    public interface AdActivityAdapter {
        boolean onBackPressed();

        void onConfigurationChanged(Configuration configuration);

        void onCreate();

        void onDestroy();

        void onPause();

        void onResume();

        void onStop();

        void onWindowFocusChanged();

        void preOnCreate();

        void setActivity(Activity activity);
    }

    public AdActivity() {
        this(new MobileAdsLoggerFactory(), AdRegistration.getAmazonAdRegistrationExecutor(), new ActivityAdapterFactory(new MobileAdsLoggerFactory()));
    }

    AdActivity(MobileAdsLoggerFactory mobileAdsLoggerFactory, AdRegistrationExecutor adRegistrationExecutor, ActivityAdapterFactory activityAdapterFactory2) {
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.amazonAdRegistration = adRegistrationExecutor;
        this.activityAdapterFactory = activityAdapterFactory2;
    }

    public void onCreate(Bundle bundle) {
        initializeSdk();
        AdActivityAdapter createAdapter = this.activityAdapterFactory.createAdapter(getIntent());
        this.adapter = createAdapter;
        if (createAdapter == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        createAdapter.setActivity(this);
        this.adapter.preOnCreate();
        super.onCreate(bundle);
        this.adapter.onCreate();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.adapter.onWindowFocusChanged();
        }
    }

    private void initializeSdk() {
        if (this.logger == null) {
            setLoggerFactory(new MobileAdsLoggerFactory());
        }
        if (this.amazonAdRegistration == null) {
            setAmazonAdRegistrationExecutor(AdRegistration.getAmazonAdRegistrationExecutor());
        }
        if (this.activityAdapterFactory == null) {
            setActivityAdapterFactory(new ActivityAdapterFactory(new MobileAdsLoggerFactory()));
        }
        this.amazonAdRegistration.initializeAds(getApplicationContext());
    }

    /* access modifiers changed from: package-private */
    public void setLoggerFactory(MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
    }

    /* access modifiers changed from: package-private */
    public void setAmazonAdRegistrationExecutor(AdRegistrationExecutor adRegistrationExecutor) {
        this.amazonAdRegistration = adRegistrationExecutor;
    }

    /* access modifiers changed from: package-private */
    public void setActivityAdapterFactory(ActivityAdapterFactory activityAdapterFactory2) {
        this.activityAdapterFactory = activityAdapterFactory2;
    }

    public void onPause() {
        super.onPause();
        this.adapter.onPause();
    }

    public void onResume() {
        super.onResume();
        this.adapter.onResume();
    }

    public void onStop() {
        this.adapter.onStop();
        super.onStop();
    }

    public void onDestroy() {
        this.adapter.onDestroy();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.adapter.onConfigurationChanged(configuration);
    }

    public void onBackPressed() {
        if (!this.adapter.onBackPressed()) {
            super.onBackPressed();
        }
    }

    static class ActivityAdapterFactory {
        private final MobileAdsLogger logger;

        public ActivityAdapterFactory(MobileAdsLoggerFactory mobileAdsLoggerFactory) {
            this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(AdActivity.LOGTAG);
        }

        /* access modifiers changed from: package-private */
        public AdActivityAdapter createAdapter(Intent intent) {
            String stringExtra = intent.getStringExtra(AdActivity.ADAPTER_KEY);
            if (stringExtra == null) {
                this.logger.mo10939e("Unable to launch the AdActivity due to an internal error.");
                return null;
            }
            try {
                try {
                    try {
                        return (AdActivityAdapter) Class.forName(stringExtra).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (IllegalArgumentException unused) {
                        this.logger.mo10939e("Illegal arguments given to the default constructor.");
                        return null;
                    } catch (InstantiationException unused2) {
                        this.logger.mo10939e("Instantiation exception when instantiating the adapter.");
                        return null;
                    } catch (IllegalAccessException unused3) {
                        this.logger.mo10939e("Illegal access exception when instantiating the adapter.");
                        return null;
                    } catch (InvocationTargetException unused4) {
                        this.logger.mo10939e("Invocation target exception when instantiating the adapter.");
                        return null;
                    }
                } catch (SecurityException unused5) {
                    this.logger.mo10939e("Security exception when trying to get the default constructor.");
                    return null;
                } catch (NoSuchMethodException unused6) {
                    this.logger.mo10939e("No default constructor exists for the adapter.");
                    return null;
                }
            } catch (ClassNotFoundException unused7) {
                this.logger.mo10939e("Unable to get the adapter class.");
                return null;
            }
        }
    }
}
