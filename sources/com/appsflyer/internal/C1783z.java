package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.z */
public final class C1783z {

    /* renamed from: ǃ */
    private C1786d f4258 = new C1786d() {
        /* renamed from: Ι */
        public final Class<?> mo14110(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* renamed from: com.appsflyer.internal.z$d */
    interface C1786d {
        /* renamed from: Ι */
        Class<?> mo14110(String str) throws ClassNotFoundException;
    }

    /* renamed from: ǃ */
    public final String mo14109() {
        for (C1785c cVar : C1785c.values()) {
            if (m3920(cVar.f4273)) {
                return cVar.f4274;
            }
        }
        return C1785c.DEFAULT.f4274;
    }

    /* renamed from: ι */
    private boolean m3920(String str) {
        try {
            this.f4258.mo14110(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: com.appsflyer.internal.z$c */
    enum C1785c {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        SEGMENT("android_segment", "com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.app.XamarinAndroidEnvironmentVariables");
        
        /* access modifiers changed from: private */

        /* renamed from: ɨ */
        public String f4273;
        /* access modifiers changed from: private */

        /* renamed from: ɾ */
        public String f4274;

        private C1785c(String str, String str2) {
            this.f4274 = str;
            this.f4273 = str2;
        }
    }
}
