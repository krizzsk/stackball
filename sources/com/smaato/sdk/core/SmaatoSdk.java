package com.smaato.sdk.core;

import android.app.Application;
import android.util.Log;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.configcheck.AppConfigChecker;
import com.smaato.sdk.core.framework.AdPresenterModuleInterface;
import com.smaato.sdk.core.framework.ModuleInterface;
import com.smaato.sdk.core.framework.SdkInitialisationObserver;
import com.smaato.sdk.core.framework.ServiceModuleInterface;
import com.smaato.sdk.core.init.AdPresenterModuleInterfaceUtils;
import com.smaato.sdk.core.init.BaseDiRegistryUtils;
import com.smaato.sdk.core.init.BaseModuleValidationUtils;
import com.smaato.sdk.core.init.ModuleInterfaceUtils;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;

public final class SmaatoSdk {
    private static volatile SmaatoInstance instance;

    public static String getVersion() {
        return "21.5.7";
    }

    static /* synthetic */ AdPresenterNameShaper lambda$null$0(AdPresenterNameShaper adPresenterNameShaper, DiConstructor diConstructor) {
        return adPresenterNameShaper;
    }

    private SmaatoSdk() {
    }

    public static void init(Application application, String str) {
        init(application, Config.builder().build(), str);
    }

    public static void init(Application application, Config config, String str) {
        Config config2;
        ClassLoader classLoader = application.getClassLoader();
        ServiceLoader<S> load = ServiceLoader.load(ModuleInterface.class, classLoader);
        ServiceLoader<S> load2 = ServiceLoader.load(AdPresenterModuleInterface.class, classLoader);
        ServiceLoader<S> load3 = ServiceLoader.load(ServiceModuleInterface.class, classLoader);
        ServiceLoader<S> load4 = ServiceLoader.load(SdkInitialisationObserver.class, classLoader);
        Application application2 = application;
        Objects.requireNonNull(application, "Parameter application cannot be null for SmaatoSdk::init");
        Objects.requireNonNull(load, "Parameter foundModulesToRegister cannot be null for SmaatoSdk::init");
        Objects.requireNonNull(str, "Parameter publisherId cannot be null for SmaatoSdk::init");
        if (!str.isEmpty()) {
            if (instance == null) {
                synchronized (SmaatoSdk.class) {
                    if (instance == null) {
                        if (config == null) {
                            config2 = Config.builder().build();
                            Log.w(LogDomain.CORE.name(), String.format("null config parameter is ignored, a default config is used instead (logLevel: %s, httpsOnly: %b)", new Object[]{config2.getConsoleLogLevel(), Boolean.valueOf(config2.isHttpsOnly())}));
                        } else {
                            config2 = config;
                        }
                        List<ModuleInterface> validInitialisedModuleInterfaces = ModuleInterfaceUtils.getValidInitialisedModuleInterfaces(application.getClassLoader(), load);
                        List<T> validModuleInterfaces = BaseModuleValidationUtils.getValidModuleInterfaces(getVersion(), load2);
                        List<T> validModuleInterfaces2 = BaseModuleValidationUtils.getValidModuleInterfaces(getVersion(), load3);
                        for (T init : validModuleInterfaces2) {
                            init.init(validInitialisedModuleInterfaces);
                        }
                        AdPresenterNameShaper adPresenterNameShaper = new AdPresenterNameShaper();
                        SmaatoInstance smaatoInstance = new SmaatoInstance(application, config2, Lists.join(Collections.singletonList(DiRegistry.m24065of(new Consumer() {
                            public final void accept(Object obj) {
                                ((DiRegistry) obj).registerSingletonFactory(AdPresenterNameShaper.class, new ClassFactory() {
                                    public final Object get(DiConstructor diConstructor) {
                                        return SmaatoSdk.lambda$null$0(AdPresenterNameShaper.this, diConstructor);
                                    }
                                });
                            }
                        })), ModuleInterfaceUtils.getDiOfModules(validInitialisedModuleInterfaces), BaseDiRegistryUtils.getDiOfModules(validModuleInterfaces2), AdPresenterModuleInterfaceUtils.getDiOfModules(adPresenterNameShaper, validModuleInterfaces)), ModuleInterfaceUtils.getExpectedManifestEntriesFromModules(validInitialisedModuleInterfaces), str);
                        DiConstructor diConstructor = smaatoInstance.diConstructor;
                        boolean isAppConfiguredProperly = ((AppConfigChecker) diConstructor.get(AppConfigChecker.class)).check().isAppConfiguredProperly();
                        if (!isAppConfiguredProperly) {
                            ((Logger) diConstructor.get(Logger.class)).error(LogDomain.CORE, "Cannot initialize SmaatoSdk. Check specific reason(s) in the error/warning message(s) above.", new Object[0]);
                        }
                        if (isAppConfiguredProperly) {
                            smaatoInstance.diConstructor.get(AppBackgroundDetector.class);
                            smaatoInstance.diConstructor.get(ConnectionStatusWatcher.class);
                            instance = smaatoInstance;
                        } else {
                            return;
                        }
                    }
                }
            }
            for (S onInitialised : load4) {
                onInitialised.onInitialised();
            }
            return;
        }
        throw new IllegalArgumentException("Parameter publisherId cannot be empty for SmaatoSdk::init");
    }

    public static String getKeywords() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.keywords;
    }

    public static void setKeywords(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.keywords = str;
        }
    }

    public static String getSearchQuery() {
        return (String) Objects.transformOrNull(getInitializedSmaatoInstance(), $$Lambda$riTQVy3CKV6gs8rNZyikdi3CTnI.INSTANCE);
    }

    public static void setSearchQuery(String str) {
        Objects.onNotNull(getInitializedSmaatoInstance(), new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((SmaatoInstance) obj).searchQuery = this.f$0;
            }
        });
    }

    public static Gender getGender() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.gender;
    }

    public static void setGender(Gender gender) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.gender = gender;
        }
    }

    public static Integer getAge() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.age;
    }

    public static void setAge(Integer num) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.age = num;
        }
    }

    public static LatLng getLatLng() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.latLng;
    }

    public static void setLatLng(LatLng latLng) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            if (latLng == null || latLng.isValid()) {
                initializedSmaatoInstance.latLng = latLng;
                return;
            }
            Log.e(LogDomain.CORE.name(), "Provided location is invalid and will be discarded: ".concat(String.valueOf(latLng)));
            initializedSmaatoInstance.latLng = null;
        }
    }

    public static boolean isGPSEnabled() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.isGPSEnabled;
    }

    public static void setGPSEnabled(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.isGPSEnabled = z;
        }
    }

    public static String getPublisherId() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.publisherId;
    }

    public static String getRegion() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.region;
    }

    public static void setRegion(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.region = str;
        }
    }

    public static String getZip() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.zip;
    }

    public static void setZip(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.zip = str;
        }
    }

    public static String getLanguage() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.language;
    }

    public static void setLanguage(String str) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.language = str;
        }
    }

    public static boolean getCoppa() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.coppa;
    }

    public static void setCoppa(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.coppa = z;
        }
    }

    public static boolean isWatermarkEnabled() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.isWatermarkEnabled;
    }

    public static void setWatermarkEnabled(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.isWatermarkEnabled = z;
        }
    }

    public static String getUsPrivacyString() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance == null ? "" : initializedSmaatoInstance.ccpaDataStorage.getUsPrivacyString();
    }

    public static boolean isCompanionAdSkippable() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        return initializedSmaatoInstance != null && initializedSmaatoInstance.isCompanionAdSkippable;
    }

    public static void setIsCompanionAdSkippable(boolean z) {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance != null) {
            initializedSmaatoInstance.isCompanionAdSkippable = z;
        }
    }

    public static AdContentRating getAdContentRating() {
        SmaatoInstance initializedSmaatoInstance = getInitializedSmaatoInstance();
        if (initializedSmaatoInstance == null) {
            return null;
        }
        return initializedSmaatoInstance.adContentRating;
    }

    private static SmaatoInstance getInitializedSmaatoInstance() {
        SmaatoInstance smaatoInstance = instance;
        if (smaatoInstance != null) {
            return smaatoInstance;
        }
        Log.e(LogDomain.CORE.name(), "SmaatoSdk.init() should be called first.");
        return null;
    }
}
