package com.p243my.tracker.obfuscated;

import android.text.TextUtils;
import com.p243my.tracker.MyTrackerConfig;
import com.p243my.tracker.obfuscated.C7872t;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.my.tracker.obfuscated.f0 */
public final class C7811f0 extends C7872t<String> {

    /* renamed from: a */
    final MyTrackerConfig.OkHttpClientProvider f19877a;

    C7811f0(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f19877a = okHttpClientProvider;
    }

    /* renamed from: a */
    public C7872t.C7874b<String> mo52289a(String str) {
        Response response;
        Throwable th;
        C7872t.C7874b<String> c = C7872t.C7874b.m21537c();
        T t = null;
        try {
            C7877u0.m21547a("OkHttpGetRequest: send request to " + str);
            response = this.f19877a.getOkHttpClient().newCall(new Request.Builder().url(str).get().build()).execute();
            try {
                int code = response.code();
                if (code == 200) {
                    C7877u0.m21547a("OkHttpGetRequest: response successfully received");
                    c.f20166a = true;
                } else {
                    C7877u0.m21547a("OkHttpGetRequest error: response code " + code);
                    c.f20166a = false;
                }
                if (code == 200) {
                    C7877u0.m21547a("OkHttpGetRequest: processing server response");
                    ResponseBody body = response.body();
                    if (body != null) {
                        t = body.string();
                    }
                    if (!TextUtils.isEmpty(t)) {
                        c.f20167b = t;
                    } else {
                        C7877u0.m21547a("OkHttpGetRequest: response data is empty");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    C7877u0.m21548a("OkHttpGetRequest error: error while sending data", th);
                    c.f20166a = false;
                    c.f20168c = "OkHttpGetRequest error: error while sending data";
                } finally {
                    if (response != null) {
                        response.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            response = null;
            C7877u0.m21548a("OkHttpGetRequest error: error while sending data", th);
            c.f20166a = false;
            c.f20168c = "OkHttpGetRequest error: error while sending data";
        }
        return c;
    }
}
