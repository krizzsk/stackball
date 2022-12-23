package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.C14662tb;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.ib */
public abstract class C13403ib<T> extends ne1<C14645t1, AdResponse<T>> {

    /* renamed from: v */
    private final String f34812v;

    /* renamed from: w */
    private final Context f34813w;

    /* renamed from: x */
    private final C14645t1 f34814x;

    /* renamed from: y */
    private final C13950m2 f34815y = new C13950m2();

    /* renamed from: z */
    private final jv0<T> f34816z;

    public C13403ib(Context context, C14645t1 t1Var, String str, String str2, jv0<T> jv0, C14662tb.C14663a<AdResponse<T>> aVar, w41<C14645t1, AdResponse<T>> w41) {
        super(context, t1Var.mo70104j().mo68325g(), str, aVar, t1Var, w41);
        m37330a(context, t1Var.mo70103i());
        this.f34812v = str2;
        this.f34814x = t1Var;
        this.f34813w = context.getApplicationContext();
        this.f34816z = jv0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c51<AdResponse<T>> mo67765a(fv0 fv0, int i) {
        if (mo67766b(fv0, i)) {
            Map<String, String> map = fv0.f33757c;
            C12115n a = C12115n.m31422a(map.get(wb0.YMAD_TYPE.mo70671a()));
            boolean z = true;
            if (a == this.f34814x.mo70092b()) {
                AdResponse<T> a2 = this.f34816z.mo68098a(this.f34813w, this.f34814x).mo67895a(fv0, map, a);
                if (204 != i) {
                    z = false;
                }
                if (!z) {
                    return c51.m34589a(a2, xb0.m43996a(fv0));
                }
            }
        }
        return c51.m34588a(C15026w1.m43467a(fv0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo67766b(fv0 fv0, int i) {
        if (200 == i) {
            byte[] bArr = fv0.f33756b;
            if (bArr != null && bArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public Map<String, String> mo67426e() throws C13965ma {
        HashMap hashMap = new HashMap();
        Context context = this.f34813w;
        int i = C13278h5.f34274b;
        String string = context.getSharedPreferences("YadPreferenceFile", 0).getString("SessionData", (String) null);
        if (string != null) {
            hashMap.put(wb0.YMAD_SESSION_DATA.mo70671a(), string);
        }
        hashMap.put(wb0.YMAD_RENDER_AD_IDS.mo70671a(), this.f34815y.mo68553b(this.f34813w));
        hashMap.put(wb0.YMAD_IMPRESSION_AD_IDS.mo70671a(), this.f34815y.mo68552a(this.f34813w));
        hashMap.putAll(this.f34814x.mo70104j().mo68320d());
        d71 a = l71.m38631c().mo68362a(this.f34813w);
        if (a != null && a.mo66470r()) {
            hashMap.put("encrypted-request", "1");
        }
        return hashMap;
    }

    /* renamed from: l */
    public String mo67768l() {
        StringBuilder sb = new StringBuilder();
        if (mo68344f() == 0) {
            sb.append(this.f34812v);
        }
        List<h21> f = this.f34814x.mo70104j().mo68324f();
        if (sb.length() != 0 && f.size() > 0) {
            sb.append("&");
        }
        for (int i = 0; i < f.size(); i++) {
            if (i != 0) {
                sb.append("&");
            }
            f.get(i).getClass();
            sb.append(String.format("%s=%s", new Object[]{null, null}));
        }
        return Uri.parse(super.mo67768l()).buildUpon().encodedQuery(sb.toString()).build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public op1 mo67425b(op1 op1) {
        op1.getClass();
        return super.mo67425b(C15026w1.m43467a(op1.f38296b));
    }

    /* renamed from: b */
    public byte[] mo67767b() throws C13965ma {
        if (1 == mo68344f()) {
            try {
                String str = this.f34812v;
                if (str != null) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m37330a(Context context, int i) {
        mo68330a(new C12353a4().mo65667a(context, i));
    }
}
