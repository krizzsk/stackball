package com.p243my.target;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.p243my.target.common.MyTargetVersion;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.my.target.k3 */
public class C7498k3 {

    /* renamed from: a */
    public static String f18872a = "https://ad.mail.ru/sdk/log/";

    /* renamed from: b */
    public static boolean f18873b = true;

    /* renamed from: c */
    public final String f18874c;

    /* renamed from: d */
    public final String f18875d;

    /* renamed from: e */
    public String f18876e;

    /* renamed from: f */
    public int f18877f;

    /* renamed from: g */
    public String f18878g;

    /* renamed from: h */
    public String f18879h;

    /* renamed from: i */
    public String f18880i;

    public C7498k3(String str, String str2) {
        this.f18874c = str;
        this.f18875d = str2;
    }

    /* renamed from: a */
    public static C7498k3 m19572a(String str) {
        return new C7498k3(str, "error");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19573a(Context context) {
        String a = mo50700a();
        C7374e0.m18989a("send message to log:\n " + a);
        if (f18873b) {
            C7414g3.m19172d().mo50288b(f18872a, Base64.encodeToString(a.getBytes(Charset.forName("UTF-8")), 0), context);
        }
    }

    /* renamed from: a */
    public C7498k3 mo50699a(int i) {
        this.f18877f = i;
        return this;
    }

    /* renamed from: a */
    public String mo50700a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk", "myTarget");
            jSONObject.put("sdkver", MyTargetVersion.VERSION);
            jSONObject.put("os", "Android");
            jSONObject.put("osver", Build.VERSION.RELEASE);
            jSONObject.put("type", this.f18875d);
            jSONObject.put("name", this.f18874c);
            String str = this.f18876e;
            if (str != null) {
                jSONObject.put("message", str);
            }
            int i = this.f18877f;
            if (i > 0) {
                jSONObject.put("slot", i);
            }
            String str2 = this.f18878g;
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            String str3 = this.f18879h;
            if (str3 != null) {
                jSONObject.put("bannerId", str3);
            }
            String str4 = this.f18880i;
            if (str4 != null) {
                jSONObject.put("data", str4);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public C7498k3 mo50701b(String str) {
        this.f18878g = str;
        return this;
    }

    /* renamed from: b */
    public void mo50702b(Context context) {
        C7395f0.m19088b(new Runnable(context) {
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7498k3.this.m19573a(this.f$1);
            }
        });
    }

    /* renamed from: c */
    public C7498k3 mo50703c(String str) {
        this.f18879h = str;
        return this;
    }

    /* renamed from: d */
    public C7498k3 mo50704d(String str) {
        this.f18876e = str;
        return this;
    }
}
