package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.se */
public class C11748se extends C11715re {

    /* renamed from: l */
    private static final C11984ye f28139l = new C11984ye(IronSourceConstants.TYPE_UUID, (String) null);

    /* renamed from: m */
    private static final C11984ye f28140m = new C11984ye("DEVICEID_3", (String) null);

    /* renamed from: n */
    private static final C11984ye f28141n = new C11984ye("AD_URL_GET", (String) null);

    /* renamed from: o */
    private static final C11984ye f28142o = new C11984ye("AD_URL_REPORT", (String) null);

    /* renamed from: p */
    private static final C11984ye f28143p = new C11984ye("HOST_URL", (String) null);

    /* renamed from: q */
    private static final C11984ye f28144q = new C11984ye("SERVER_TIME_OFFSET", (String) null);

    /* renamed from: r */
    private static final C11984ye f28145r = new C11984ye("CLIDS", (String) null);

    /* renamed from: f */
    private C11984ye f28146f = new C11984ye(f28139l.mo64147b());

    /* renamed from: g */
    private C11984ye f28147g = new C11984ye(f28140m.mo64147b());

    /* renamed from: h */
    private C11984ye f28148h = new C11984ye(f28141n.mo64147b());

    /* renamed from: i */
    private C11984ye f28149i = new C11984ye(f28142o.mo64147b());

    /* renamed from: j */
    private C11984ye f28150j;

    /* renamed from: k */
    private C11984ye f28151k;

    public C11748se(Context context) {
        super(context, (String) null);
        new C11984ye(f28143p.mo64147b());
        this.f28150j = new C11984ye(f28144q.mo64147b());
        this.f28151k = new C11984ye(f28145r.mo64147b());
    }

    /* renamed from: a */
    public long mo63631a(long j) {
        return this.f28085b.getLong(this.f28150j.mo64147b(), j);
    }

    /* renamed from: b */
    public String mo63632b(String str) {
        return this.f28085b.getString(this.f28148h.mo64145a(), (String) null);
    }

    /* renamed from: c */
    public String mo63633c(String str) {
        return this.f28085b.getString(this.f28149i.mo64145a(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63538d() {
        return "_startupinfopreferences";
    }

    /* renamed from: d */
    public String mo63634d(String str) {
        return this.f28085b.getString(this.f28151k.mo64145a(), (String) null);
    }

    /* renamed from: e */
    public String mo63635e(String str) {
        return this.f28085b.getString(this.f28147g.mo64145a(), (String) null);
    }

    /* renamed from: f */
    public String mo63637f(String str) {
        return this.f28085b.getString(this.f28146f.mo64145a(), (String) null);
    }

    /* renamed from: g */
    public Map<String, ?> mo63638g() {
        return this.f28085b.getAll();
    }

    /* renamed from: f */
    public C11748se mo63636f() {
        return (C11748se) mo63601e();
    }
}
