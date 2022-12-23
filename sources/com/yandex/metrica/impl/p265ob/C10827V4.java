package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.google.common.net.HttpHeaders;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10766T1;
import com.yandex.metrica.impl.p265ob.C10872W4;
import com.yandex.metrica.impl.p265ob.C11831v0;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.V4 */
public class C10827V4 extends C10907X1<C11531mh, C11831v0.C11832a> {

    /* renamed from: o */
    private final C10946Y4 f25979o;

    /* renamed from: p */
    private final C11411k0 f25980p;

    /* renamed from: q */
    private final C10980Z4 f25981q;

    /* renamed from: r */
    private final C10872W4.C10874b f25982r;

    /* renamed from: s */
    private final C10616Om f25983s;

    /* renamed from: t */
    private C11889vm f25984t;

    /* renamed from: u */
    private final String f25985u;

    /* renamed from: v */
    private final C10363I8 f25986v;

    /* renamed from: w */
    private C10912X4 f25987w;

    public C10827V4(C10946Y4 y4, C11411k0 k0Var, C10980Z4 z4, C10363I8 i8) {
        this(y4, k0Var, z4, i8, new C10872W4.C10874b(), new C10580Nm(), new C11889vm(), new C11531mh(), new C11772t0());
    }

    /* renamed from: A */
    public boolean mo61729A() {
        return super.mo61729A() & (!mo62263m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61643a(Uri.Builder builder) {
        C10912X4 x4 = this.f25987w;
        ((C11531mh) this.f25817j).getClass();
        builder.appendPath("diagnostic");
        builder.appendQueryParameter("deviceid", x4.mo62778g());
        builder.appendQueryParameter("uuid", x4.mo62795x());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("analytics_sdk_version_name", "5.0.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45001354");
        builder.appendQueryParameter("analytics_sdk_build_type", x4.mo62782k());
        if (x4.mo62782k().contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter(ServerParameters.APP_VERSION_NAME, x4.mo62777f());
        builder.appendQueryParameter("app_build_number", x4.mo62769b());
        builder.appendQueryParameter(ServerParameters.MODEL, x4.mo62785n());
        builder.appendQueryParameter("manufacturer", x4.mo62784m());
        builder.appendQueryParameter(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, x4.mo62787p());
        builder.appendQueryParameter("os_api_level", String.valueOf(x4.mo62786o()));
        builder.appendQueryParameter("screen_width", String.valueOf(x4.mo62793v()));
        builder.appendQueryParameter("screen_height", String.valueOf(x4.mo62792u()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(x4.mo62791t()));
        builder.appendQueryParameter("scalefactor", String.valueOf(x4.mo62790s()));
        builder.appendQueryParameter("locale", x4.mo62783l());
        builder.appendQueryParameter(TapjoyConstants.TJC_DEVICE_TYPE_NAME, x4.mo62781j());
        builder.appendQueryParameter("app_id", x4.mo62788q());
        builder.appendQueryParameter("api_key_128", x4.mo62471C());
        builder.appendQueryParameter("app_debuggable", x4.mo62969A());
        builder.appendQueryParameter("is_rooted", x4.mo62780i());
        builder.appendQueryParameter("app_framework", x4.mo62771c());
    }

    /* renamed from: b */
    public C10766T1.C10767a mo61644b() {
        return C10766T1.C10767a.DIAGNOSTIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61645b(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo61647o() {
        C10912X4 a = this.f25979o.mo62274a();
        this.f25987w = a;
        if (!(a.mo62796y() && !C10796U2.m27896b((Collection) this.f25987w.mo62472D()))) {
            return false;
        }
        mo62251a(this.f25987w.mo62472D());
        C10872W4.C10874b bVar = this.f25982r;
        C11411k0 k0Var = this.f25980p;
        C10912X4 x4 = this.f25987w;
        C10980Z4 z4 = this.f25981q;
        C10363I8 i8 = this.f25986v;
        bVar.getClass();
        byte[] a2 = new C10872W4(k0Var, x4, z4, new C11333i4(i8), new C10531Mn(1024, "diagnostic event name", C12038zm.m31085a()), new C10531Mn(204800, "diagnostic event value", C12038zm.m31085a()), new C10580Nm()).mo62440a();
        byte[] bArr = null;
        try {
            this.f25984t.getClass();
            bArr = C10823V0.m27969b(a2);
        } catch (Throwable unused) {
        }
        if (!C10796U2.m27893a(bArr)) {
            mo62249a(HttpHeaders.CONTENT_ENCODING, "gzip");
            a2 = bArr;
        }
        mo62252a(a2);
        return true;
    }

    /* renamed from: p */
    public boolean mo62265p() {
        boolean p = super.mo62265p();
        mo62248a(this.f25983s.mo61840a());
        return p;
    }

    /* renamed from: r */
    public boolean mo61648r() {
        C11831v0.C11832a aVar = (C11831v0.C11832a) mo62463B();
        return aVar != null && "accepted".equals(aVar.f28443a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo61650t() {
    }

    C10827V4(C10946Y4 y4, C11411k0 k0Var, C10980Z4 z4, C10363I8 i8, C10872W4.C10874b bVar, C10616Om om, C11889vm vmVar, C11531mh mhVar, C11772t0 t0Var) {
        super(t0Var, mhVar);
        this.f25979o = y4;
        this.f25980p = k0Var;
        this.f25981q = z4;
        this.f25986v = i8;
        this.f25982r = bVar;
        this.f25983s = om;
        this.f25984t = vmVar;
        this.f25985u = C10827V4.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    /* renamed from: a */
    public String mo61642a() {
        return this.f25985u;
    }
}
