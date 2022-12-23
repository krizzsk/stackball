package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.device.ads.AdConstants;
import com.facebook.appevents.AppEventsConstants;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.model.Fields;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acbba */
public final class acbba extends acbac {

    /* renamed from: b */
    public static final aaaaa f20541b = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbba$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: com.ogury.cm.internal.acbba$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ acbba f20542a;

        /* renamed from: b */
        final /* synthetic */ Context f20543b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(acbba acbba, Context context) {
            super(0);
            this.f20542a = acbba;
            this.f20543b = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            JSONObject j = acbba.m21940a().mo52716j();
            if (j != null) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f20543b.getApplicationContext()).edit();
                acbba acbba = this.f20542a;
                bbabc.m22048a((Object) edit, "editor");
                String optString = j.optString(Fields.VENDOR_CONSENTS);
                bbabc.m22048a((Object) optString, "it.optString(VENDOR_CONSENTS)");
                acbba.m21942a(acbba, edit, optString);
                acbba.m21943a(this.f20542a, edit, j.optJSONObject(Fields.PUBLISHER_RESTRICTIONS));
                acbba acbba2 = this.f20542a;
                String optString2 = j.optString("vendorLegitimateInterests");
                bbabc.m22048a((Object) optString2, "it.optString(VENDOR_LEGITIMATE_INTERESTS)");
                acbba.m21945b(acbba2, edit, optString2);
                aacba aacba = aacba.f20368a;
                edit.putString("IABTCF_PublisherConsent", aacba.m21779a(j.optInt("publisherConsent")));
                edit.putInt("IABTCF_CmpSdkID", j.optInt("cmpSdkId"));
                edit.putInt("IABTCF_CmpSdkVersion", j.optInt("cmpSdkVersion"));
                edit.putInt("IABTCF_PolicyVersion", j.optInt("policyVersion"));
                abbba abbba = abbba.f20411a;
                edit.putInt(AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2, abbba.m21830c().mo52680c().mo52701b() ? 1 : 0);
                edit.putString("IABTCF_PublisherCC", j.optString("publisherCC"));
                edit.putInt("IABTCF_PurposeOneTreatment", j.optInt("purposeOneTreatment"));
                edit.putInt("IABTCF_UseNonStandardStacks", j.optInt("useNonStandardStacks"));
                abbba abbba2 = abbba.f20411a;
                edit.putString(AdConstants.IABCONSENT_CONSENT_STRING_TCF2, abbba.m21830c().mo52680c().mo52698a());
                aacba aacba2 = aacba.f20368a;
                edit.putString("IABTCF_PurposeConsents", aacba.m21779a(j.optInt("purposeConsents")));
                aacba aacba3 = aacba.f20368a;
                edit.putString("IABTCF_PurposeLegitimateInterests", aacba.m21779a(j.optInt("purposeLegitimateInterests")));
                aacba aacba4 = aacba.f20368a;
                edit.putString("IABTCF_SpecialFeaturesOptIns", aacba.m21779a(j.optInt("specialFeaturesOptIns")));
                aacba aacba5 = aacba.f20368a;
                edit.putString("IABTCF_PublisherLegitimateInterests", aacba.m21779a(j.optInt("publisherLegitimateInterests")));
                aacba aacba6 = aacba.f20368a;
                edit.putString("IABTCF_PublisherCustomPurposesConsents", aacba.m21779a(j.optInt("publisherCustomPurposesConsents")));
                aacba aacba7 = aacba.f20368a;
                edit.putString("IABTCF_PublisherCustomPurposesLegitimateInterests", aacba.m21779a(j.optInt("publisherCustomPurposesLegitimateInterests")));
                edit.apply();
            }
            return babcc.f20603a;
        }
    }

    /* renamed from: a */
    public static abcac m21940a() {
        abbba abbba = abbba.f20411a;
        return (abcac) abcab.m21880d();
    }

    /* renamed from: a */
    private static String m21941a(String str) {
        if (str != null) {
            String substring = str.substring(1);
            bbabc.m22048a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new babca("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21942a(acbba acbba, SharedPreferences.Editor editor, String str) {
        aacba aacba = aacba.f20368a;
        String a = aacba.m21780a(str);
        editor.putString("IABTCF_VendorConsents", a.length() > 0 ? m21941a(a) : m21944b());
    }

    /* renamed from: a */
    public static final /* synthetic */ void m21943a(acbba acbba, SharedPreferences.Editor editor, JSONObject jSONObject) {
        if (jSONObject != null) {
            aacba aacba = aacba.f20368a;
            bbabc.m22051b(jSONObject, "jsonObject");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            bbabc.m22048a((Object) keys, "purposeIds");
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                String optString = optJSONObject.optString(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                bbabc.m22048a((Object) optString, "arrayOfValuesForPurpose.optString(\"0\")");
                String a = aacba.m21780a(optString);
                int length = a.length();
                String optString2 = optJSONObject.optString("1");
                bbabc.m22048a((Object) optString2, "arrayOfValuesForPurpose.optString(\"1\")");
                String a2 = aacba.m21780a(optString2);
                if (a2.length() > length) {
                    length = a2.length();
                }
                String optString3 = optJSONObject.optString("2");
                bbabc.m22048a((Object) optString3, "arrayOfValuesForPurpose.optString(\"2\")");
                String a3 = aacba.m21780a(optString3);
                if (a3.length() > length) {
                    length = a3.length();
                }
                int i = 1;
                String str = "";
                while (i < length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((a.length() <= i || a.charAt(i) != '1') ? (a2.length() <= i || a2.charAt(i) != '1') ? (a3.length() <= i || a3.charAt(i) != '1') ? ExifInterface.GPS_MEASUREMENT_3D : "2" : "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    str = sb.toString();
                    i++;
                }
                bbabc.m22048a((Object) next, BitLength.PURPOSE_ID);
                hashMap.put(next, str);
            }
            for (String str2 : hashMap.keySet()) {
                editor.putString("IABTCF_PublisherRestrictions".concat(String.valueOf(str2)), (String) hashMap.get(str2));
            }
        }
    }

    /* renamed from: b */
    private static String m21944b() {
        int l = m21940a().mo52718l();
        bbabc.m22051b(r0, "receiver$0");
        int i = 1;
        if (!(l >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + l + '.').toString());
        } else if (l == 0) {
            return "";
        } else {
            if (l == 1) {
                return r0.toString();
            }
            int length = r0.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(r0.length() * l);
                if (l > 0) {
                    while (true) {
                        sb.append(r0);
                        if (i == l) {
                            break;
                        }
                        i++;
                    }
                }
                String sb2 = sb.toString();
                bbabc.m22048a((Object) sb2, "sb.toString()");
                return sb2;
            }
            char charAt = r0.charAt(0);
            char[] cArr = new char[l];
            for (int i2 = 0; i2 < l; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m21945b(acbba acbba, SharedPreferences.Editor editor, String str) {
        aacba aacba = aacba.f20368a;
        String a = aacba.m21780a(str);
        editor.putString("IABTCF_VendorLegitimateInterests", (!(a.length() > 0) || a.length() <= 1) ? m21944b() : m21941a(a));
    }

    /* renamed from: a */
    public final void mo52746a(Context context) {
        bbabc.m22051b(context, "context");
        abbba abbba = abbba.f20411a;
        if (abbba.m21837f("TCF")) {
            bacbb.m22034a(false, false, (ClassLoader) null, (String) null, 0, new aaaab(this, context), 31, (Object) null);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        if (defaultSharedPreferences.getInt(AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2, 0) != 0) {
            defaultSharedPreferences.edit().putInt(AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2, 0).apply();
        }
    }
}
