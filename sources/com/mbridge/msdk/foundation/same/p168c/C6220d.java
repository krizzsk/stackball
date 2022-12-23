package com.mbridge.msdk.foundation.same.p168c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p179h.C6285b;
import com.mbridge.msdk.foundation.same.p170e.C6225a;
import java.io.File;

/* renamed from: com.mbridge.msdk.foundation.same.c.d */
/* compiled from: CommonImageTask */
public final class C6220d extends C6225a {

    /* renamed from: a */
    private String f15457a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f15458e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f15459f;

    /* renamed from: g */
    private boolean f15460g = false;

    /* renamed from: h */
    private C6222a f15461h;

    /* renamed from: com.mbridge.msdk.foundation.same.c.d$a */
    /* compiled from: CommonImageTask */
    public interface C6222a {
        /* renamed from: a */
        void mo43790a(String str, String str2);

        /* renamed from: b */
        void mo43791b(String str, String str2);
    }

    /* renamed from: b */
    public final void mo42877b() {
    }

    /* renamed from: a */
    public final void mo43795a(boolean z) {
        this.f15460g = z;
    }

    /* renamed from: a */
    public final void mo43794a(C6222a aVar) {
        this.f15461h = aVar;
    }

    public C6220d(String str, String str2, String str3) {
        this.f15457a = str;
        this.f15458e = str2;
        this.f15459f = str3;
    }

    /* renamed from: e */
    private void m15747e() {
        try {
            File file = new File(this.f15459f);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            C6285b.m15878a(file, this.f15458e, new C6269f<Void>() {
                /* renamed from: a */
                public final void mo43797a(long j, long j2) {
                }

                /* renamed from: b */
                public final void mo43800b() {
                }

                /* renamed from: a */
                public final void mo43799a(C6293k kVar) {
                    String unused = C6220d.this.f15459f;
                    C6220d.this.mo43796c();
                }

                /* renamed from: a */
                public final void mo43798a(C6240a aVar) {
                    C6220d dVar = C6220d.this;
                    String b = dVar.f15458e;
                    dVar.m15745a(b, "load image from http faild because http return code: " + aVar.f15490a + ".image url is " + C6220d.this.f15458e);
                }
            });
        } catch (Exception e) {
            m15745a(this.f15458e, e.getMessage());
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (OutOfMemoryError e2) {
            m15745a(this.f15458e, e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo43796c() {
        if (new File(this.f15459f).exists()) {
            String str = this.f15458e;
            String str2 = this.f15459f;
            C6222a aVar = this.f15461h;
            if (aVar != null) {
                aVar.mo43790a(str, str2);
                return;
            }
            return;
        }
        m15745a(this.f15458e, "load image faild.because file[" + this.f15459f + "] is not exist!");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15745a(String str, String str2) {
        C6222a aVar = this.f15461h;
        if (aVar != null) {
            aVar.mo43791b(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo42876a() {
        if (this.f15460g) {
            m15747e();
        } else if (TextUtils.isEmpty(this.f15459f)) {
            m15745a(this.f15458e, "save path is null.");
        } else {
            File file = new File(this.f15459f);
            if (!file.exists() || file.length() <= 0) {
                m15747e();
            } else {
                mo43796c();
            }
        }
    }
}
