package com.p243my.target;

import android.content.Context;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.p243my.target.common.CustomParams;
import com.p243my.target.common.MyTargetConfig;
import com.p243my.target.common.MyTargetManager;
import com.p243my.target.common.MyTargetPrivacy;
import com.p243my.target.common.MyTargetVersion;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.e */
public abstract class C7372e {

    /* renamed from: com.my.target.e$a */
    public static class C7373a extends C7372e {

        /* renamed from: a */
        public static String f18488a = "https://m.mradx.net/mobile/";

        /* renamed from: a */
        public C7617q1 mo50041a(C7298a aVar, Context context) {
            int cachePolicy = aVar.getCachePolicy();
            boolean z = false;
            C7725w8.m20764a(cachePolicy == 0 || cachePolicy == 1);
            if (cachePolicy == 0 || cachePolicy == 2) {
                z = true;
            }
            C7725w8.m20766b(z);
            return C7617q1.m20129a(f18488a + aVar.getSlotId() + "/", C7466i8.m19411a(mo50043c(aVar, context)));
        }

        /* renamed from: b */
        public int mo50042b(C7298a aVar, Context context) {
            return C7725w8.m20762a();
        }

        /* renamed from: c */
        public Map<String, String> mo50043c(C7298a aVar, Context context) {
            String str;
            HashMap hashMap = new HashMap();
            hashMap.put("formats", aVar.getFormat());
            hashMap.put("adman_ver", MyTargetVersion.VERSION);
            hashMap.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
            MyTargetPrivacy currentPrivacy = MyTargetPrivacy.currentPrivacy();
            Boolean bool = currentPrivacy.userConsent;
            String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            if (bool != null) {
                hashMap.put("user_consent", bool.booleanValue() ? "1" : str2);
            }
            Boolean bool2 = currentPrivacy.ccpaUserConsent;
            if (bool2 != null) {
                hashMap.put("ccpa_user_consent", bool2.booleanValue() ? "1" : str2);
            }
            Boolean bool3 = currentPrivacy.iabUserConsent;
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    str2 = "1";
                }
                hashMap.put("iab_user_consent", str2);
            }
            if (currentPrivacy.userAgeRestricted) {
                hashMap.put("user_age_restricted", "1");
            }
            if (aVar.getCachePolicy() == 0 || aVar.getCachePolicy() == 2) {
                hashMap.put("preloadvideo", "1");
            }
            int bannersCount = aVar.getBannersCount();
            if (bannersCount > 0) {
                hashMap.put("count", Integer.toString(bannersCount));
            }
            String bidId = aVar.getBidId();
            if (bidId != null) {
                hashMap.put("bid_id", bidId);
            }
            CustomParams customParams = aVar.getCustomParams();
            if (currentPrivacy.isConsent()) {
                customParams.putDataTo(hashMap);
            } else {
                customParams.putCustomDataToMap(hashMap);
            }
            C7456i5 c = C7456i5.m19373c();
            c.mo50398a(currentPrivacy.isConsent());
            MyTargetConfig sdkConfig = MyTargetManager.getSdkConfig();
            try {
                C7416g5 b = c.mo50399b();
                b.mo50221a(sdkConfig.isTrackingEnvironmentEnabled);
                b.mo50223b(sdkConfig.isTrackingLocationEnabled);
                c.collectData(context);
            } catch (Throwable th) {
                C7374e0.m18989a("Error collecting data: " + th);
            }
            c.putDataTo(hashMap);
            String lang = customParams.getLang();
            if (lang != null) {
                hashMap.put(ServerParameters.LANG, lang);
            }
            int b2 = mo50042b(aVar, context);
            if (b2 >= 0) {
                hashMap.put("sdk_flags", String.valueOf(b2));
            }
            String[] strArr = sdkConfig.testDevices;
            String str3 = (String) hashMap.get("instance_id");
            if (str3 == null) {
                return hashMap;
            }
            if (strArr == null || !C7406f8.m19147a(strArr, str3)) {
                str = "Device instanceId is " + str3 + ". Use this value in adInstance.withTestDevices() to enable test mode on this device.";
            } else {
                hashMap.put("test_mode", "1");
                str = "Test mode is enabled on current device";
            }
            C7374e0.m18989a(str);
            return hashMap;
        }
    }

    /* renamed from: a */
    public static C7372e m18984a() {
        return new C7373a();
    }

    /* renamed from: a */
    public abstract C7617q1 mo50041a(C7298a aVar, Context context);
}
