package com.yandex.mobile.ads.exo;

import android.os.Looper;
import com.yandex.mobile.ads.exo.C12263o;
import com.yandex.mobile.ads.exo.drm.C12186c;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.source.C12309l;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C14387qj;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.j40;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.ml0;
import com.yandex.mobile.ads.impl.q70;
import com.yandex.mobile.ads.impl.u31;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.d */
public abstract class C12178d implements C12263o {

    /* renamed from: b */
    private final int f29563b;

    /* renamed from: c */
    private final q70 f29564c = new q70();

    /* renamed from: d */
    private u31 f29565d;

    /* renamed from: e */
    private int f29566e;

    /* renamed from: f */
    private int f29567f;

    /* renamed from: g */
    private C12309l f29568g;

    /* renamed from: h */
    private Format[] f29569h;

    /* renamed from: i */
    private long f29570i;

    /* renamed from: j */
    private long f29571j = Long.MIN_VALUE;

    /* renamed from: k */
    private boolean f29572k;

    /* renamed from: l */
    private boolean f29573l;

    public C12178d(int i) {
        this.f29563b = i;
    }

    /* renamed from: b */
    public static int m31711b(int i) {
        return i | 0 | 0;
    }

    /* renamed from: A */
    public int mo64794A() throws k40 {
        return 0;
    }

    /* renamed from: a */
    public abstract int mo64795a(Format format) throws k40;

    /* renamed from: a */
    public /* synthetic */ void mo64800a(float f) throws k40 {
        C12263o.CC.$default$a(this, f);
    }

    /* renamed from: a */
    public final void mo64801a(int i) {
        this.f29566e = i;
    }

    /* renamed from: a */
    public void mo64802a(int i, Object obj) throws k40 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo64804a(long j, boolean z) throws k40;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64806a(boolean z) throws k40 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo64807a(Format[] formatArr, long j) throws k40;

    /* renamed from: b */
    public final int mo64809b() {
        return this.f29567f;
    }

    /* renamed from: d */
    public final void mo64811d() throws k40 {
        C13479j9.m37708b(this.f29567f == 2);
        this.f29567f = 1;
        mo64830z();
    }

    /* renamed from: f */
    public final void mo64812f() {
        boolean z = true;
        if (this.f29567f != 1) {
            z = false;
        }
        C13479j9.m37708b(z);
        this.f29564c.mo69503a();
        this.f29567f = 0;
        this.f29568g = null;
        this.f29569h = null;
        this.f29572k = false;
        mo64827w();
    }

    /* renamed from: g */
    public final void mo64813g() {
        C13479j9.m37708b(this.f29567f == 0);
        this.f29564c.mo69503a();
        mo64828x();
    }

    /* renamed from: h */
    public final void mo64814h() {
        this.f29572k = true;
    }

    /* renamed from: i */
    public final void mo64815i() throws IOException {
        this.f29568g.mo65271a();
    }

    /* renamed from: j */
    public final long mo64816j() {
        return this.f29571j;
    }

    /* renamed from: k */
    public final boolean mo64817k() {
        return this.f29571j == Long.MIN_VALUE;
    }

    /* renamed from: l */
    public final boolean mo64818l() {
        return this.f29572k;
    }

    /* renamed from: n */
    public ml0 mo64819n() {
        return null;
    }

    /* renamed from: o */
    public final int mo64820o() {
        return this.f29563b;
    }

    /* renamed from: p */
    public final C12178d mo64821p() {
        return this;
    }

    /* renamed from: q */
    public final C12309l mo64822q() {
        return this.f29568g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final u31 mo64823s() {
        return this.f29565d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final q70 mo64824t() {
        this.f29564c.mo69503a();
        return this.f29564c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Format[] mo64825u() {
        return this.f29569h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo64826v() {
        return mo64817k() ? this.f29572k : this.f29568g.mo65273c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo64827w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo64828x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo64829y() throws k40 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo64830z() throws k40 {
    }

    /* renamed from: a */
    public final void mo64805a(u31 u31, Format[] formatArr, C12309l lVar, long j, boolean z, long j2) throws k40 {
        C13479j9.m37708b(this.f29567f == 0);
        this.f29565d = u31;
        this.f29567f = 1;
        mo64806a(z);
        C13479j9.m37708b(!this.f29572k);
        this.f29568g = lVar;
        this.f29571j = j2;
        this.f29569h = formatArr;
        this.f29570i = j2;
        mo64807a(formatArr, j2);
        mo64804a(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo64810b(long j) {
        return this.f29568g.mo65269a(j - this.f29570i);
    }

    /* renamed from: a */
    public final void mo64799a() throws k40 {
        boolean z = true;
        if (this.f29567f != 1) {
            z = false;
        }
        C13479j9.m37708b(z);
        this.f29567f = 2;
        mo64829y();
    }

    /* renamed from: a */
    public final void mo64808a(Format[] formatArr, C12309l lVar, long j) throws k40 {
        C13479j9.m37708b(!this.f29572k);
        this.f29568g = lVar;
        this.f29571j = j;
        this.f29569h = formatArr;
        this.f29570i = j;
        mo64807a(formatArr, j);
    }

    /* renamed from: a */
    public final void mo64803a(long j) throws k40 {
        this.f29572k = false;
        this.f29571j = j;
        mo64804a(j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends j40> C12186c<T> mo64797a(Format format, Format format2, C12188d<T> dVar, C12186c<T> cVar) throws k40 {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = format2.f29533m;
        C12186c<T> cVar2 = null;
        if (format == null) {
            drmInitData = null;
        } else {
            drmInitData = format.f29533m;
        }
        if (!(!ih1.m37382a((Object) drmInitData2, (Object) drmInitData))) {
            return cVar;
        }
        if (format2.f29533m != null) {
            if (dVar != null) {
                Looper myLooper = Looper.myLooper();
                myLooper.getClass();
                cVar2 = dVar.mo64851a(myLooper, format2.f29533m);
            } else {
                throw mo64798a((Exception) new IllegalStateException("Media requires a DrmSessionManager"), format2);
            }
        }
        if (cVar != null) {
            cVar.release();
        }
        return cVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final k40 mo64798a(Exception exc, Format format) {
        int i;
        if (format != null && !this.f29573l) {
            this.f29573l = true;
            try {
                i = mo64795a(format) & 7;
            } catch (k40 unused) {
            } finally {
                this.f29573l = false;
            }
            return k40.m38183a(exc, this.f29566e, format, i);
        }
        i = 4;
        return k40.m38183a(exc, this.f29566e, format, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64796a(q70 q70, C14387qj qjVar, boolean z) {
        int a = this.f29568g.mo65270a(q70, qjVar, z);
        if (a == -4) {
            if (qjVar.mo71021e()) {
                this.f29571j = Long.MIN_VALUE;
                if (this.f29572k) {
                    return -4;
                }
                return -3;
            }
            long j = qjVar.f39149f + this.f29570i;
            qjVar.f39149f = j;
            this.f29571j = Math.max(this.f29571j, j);
        } else if (a == -5) {
            Format format = q70.f39018c;
            long j2 = format.f29534n;
            if (j2 != Long.MAX_VALUE) {
                q70.f39018c = format.mo64769a(j2 + this.f29570i);
            }
        }
        return a;
    }

    /* renamed from: a */
    protected static boolean m31710a(C12188d<?> dVar, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (dVar == null) {
            return false;
        }
        return dVar.mo64853a(drmInitData);
    }
}
