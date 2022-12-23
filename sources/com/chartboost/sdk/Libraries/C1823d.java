package com.chartboost.sdk.Libraries;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.util.Base64;
import com.chartboost.sdk.C1893i;
import com.chartboost.sdk.impl.C1935i1;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Libraries.d */
public class C1823d {

    /* renamed from: a */
    private int f4381a = -1;

    /* renamed from: b */
    private String f4382b = null;

    /* renamed from: c */
    private String f4383c;

    /* renamed from: com.chartboost.sdk.Libraries.d$a */
    public static class C1824a {

        /* renamed from: a */
        public final int f4384a;

        /* renamed from: b */
        public final String f4385b;

        /* renamed from: c */
        public final String f4386c;

        /* renamed from: d */
        public final String f4387d;

        public C1824a(int i, String str, String str2, String str3) {
            this.f4384a = i;
            this.f4385b = str;
            this.f4386c = str2;
            this.f4387d = str3;
        }

        /* renamed from: a */
        public synchronized Boolean mo14232a() {
            boolean z;
            z = true;
            if (this.f4384a != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private static boolean m4019a() {
        return !"Amazon".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* renamed from: b */
    private void m4020b(Context context) {
        C1820a aVar = new C1820a(context);
        this.f4381a = aVar.f4377a;
        this.f4382b = aVar.f4378b;
    }

    /* renamed from: c */
    public synchronized C1824a mo14231c(Context context) {
        String str;
        if (Looper.myLooper() != Looper.getMainLooper() || "robolectric".equals(Build.FINGERPRINT)) {
            if (m4019a()) {
                m4020b(context);
            } else {
                m4018a(context);
            }
            String str2 = this.f4382b;
            boolean z = true;
            if (this.f4381a != 1) {
                z = false;
            }
            this.f4383c = C1935i1.m4635a(context, z);
            JSONObject jSONObject = new JSONObject();
            String str3 = this.f4383c;
            if (str3 != null && str2 == null) {
                C1825e.m4026a(jSONObject, "uuid", str3);
            }
            if (str2 != null) {
                C1825e.m4026a(jSONObject, VungleApiClient.GAID, str2);
            }
            if (C1893i.f4747a) {
                C1893i.m4434a(str2);
                if (str2 != null) {
                    str = "000000000";
                } else {
                    str = this.f4383c;
                }
                C1893i.m4436b(str);
            }
            return new C1824a(this.f4381a, Base64.encodeToString(jSONObject.toString().getBytes(), 0), str2 != null ? "000000000" : this.f4383c, str2);
        }
        CBLogging.m3993b("CBIdentity", "I must be called from a background thread");
        return null;
    }

    /* renamed from: a */
    private void m4018a(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (!(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0)) {
                String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
                if ("00000000-0000-0000-0000-000000000000".equals(string)) {
                    this.f4381a = 1;
                    this.f4382b = null;
                    return;
                }
                this.f4381a = 0;
                this.f4382b = string;
                return;
            }
            this.f4381a = 1;
            this.f4382b = null;
        } catch (Settings.SettingNotFoundException unused) {
            this.f4381a = -1;
            this.f4382b = null;
        }
    }
}
