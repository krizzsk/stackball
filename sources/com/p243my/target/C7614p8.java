package com.p243my.target;

import android.content.Context;
import com.appsflyer.ServerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p243my.target.nativeads.banners.NativeBanner;
import com.p243my.target.nativeads.banners.NativePromoBanner;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.my.target.p8 */
public final class C7614p8 {
    /* renamed from: a */
    public static String m20109a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, int i, boolean z, Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance_id", C7456i5.m19373c().mo50400b(context));
            jSONObject.put(ServerParameters.NETWORK, str);
            jSONObject.put("navigationType", str2);
            if (m20113a(str3)) {
                jSONObject.put("title", str3);
            }
            if (m20113a(str4)) {
                jSONObject.put("ctaText", str4);
            }
            if (m20113a(str5)) {
                jSONObject.put("domain", str5);
            }
            if (m20113a(str6)) {
                jSONObject.put("ageRestrictions", str6);
            }
            if (m20113a(str7)) {
                jSONObject.put("disclaimer", str7);
            }
            if (f > 0.0f) {
                jSONObject.put(CampaignEx.JSON_KEY_STAR, String.valueOf(f));
            }
            if (i > 0) {
                jSONObject.put("votes", String.valueOf(i));
            }
            if (m20113a(str8)) {
                jSONObject.put("description", str8);
            }
            if (z) {
                jSONObject.put("hasVideo", "true");
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m20110a(String str, Context context) {
        if (str != null) {
            C7414g3.m19172d().mo50288b("https://ad.mail.ru/mobile/adcontext", C7466i8.m19412b(str), context);
        }
    }

    /* renamed from: a */
    public static boolean m20113a(String str) {
        return str != null && str.length() > 0;
    }

    /* renamed from: b */
    public static void m20114b(String str, NativeBanner nativeBanner, Context context) {
        C7395f0.m19088b(new Runnable(str, nativeBanner, context) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ NativeBanner f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7614p8.m20110a(C7614p8.m20109a(this.f$0, this.f$1.getNavigationType(), this.f$1.getTitle(), this.f$1.getCtaText(), this.f$1.getDomain(), this.f$1.getAgeRestrictions(), this.f$1.getDisclaimer(), this.f$1.getDescription(), this.f$1.getRating(), this.f$1.getVotes(), false, this.f$2), this.f$2);
            }
        });
    }

    /* renamed from: b */
    public static void m20115b(String str, NativePromoBanner nativePromoBanner, Context context) {
        C7395f0.m19088b(new Runnable(str, nativePromoBanner, context) {
            public final /* synthetic */ String f$0;
            public final /* synthetic */ NativePromoBanner f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7614p8.m20110a(C7614p8.m20109a(this.f$0, this.f$1.getNavigationType(), this.f$1.getTitle(), this.f$1.getCtaText(), this.f$1.getDomain(), this.f$1.getAgeRestrictions(), this.f$1.getDisclaimer(), this.f$1.getDescription(), this.f$1.getRating(), this.f$1.getVotes(), this.f$1.hasVideo(), this.f$2), this.f$2);
            }
        });
    }
}
