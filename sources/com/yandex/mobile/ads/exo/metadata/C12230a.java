package com.yandex.mobile.ads.exo.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.exo.C12178d;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C14387qj;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.nn0;
import com.yandex.mobile.ads.impl.on0;
import com.yandex.mobile.ads.impl.pn0;
import com.yandex.mobile.ads.impl.q70;
import com.yandex.mobile.ads.impl.qn0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.exo.metadata.a */
public final class C12230a extends C12178d implements Handler.Callback {

    /* renamed from: m */
    private final on0 f29861m;

    /* renamed from: n */
    private final qn0 f29862n;

    /* renamed from: o */
    private final Handler f29863o;

    /* renamed from: p */
    private final pn0 f29864p;

    /* renamed from: q */
    private final Metadata[] f29865q;

    /* renamed from: r */
    private final long[] f29866r;

    /* renamed from: s */
    private int f29867s;

    /* renamed from: t */
    private int f29868t;

    /* renamed from: u */
    private nn0 f29869u;

    /* renamed from: v */
    private boolean f29870v;

    /* renamed from: w */
    private long f29871w;

    public C12230a(qn0 qn0, Looper looper, on0 on0) {
        super(4);
        Handler handler;
        this.f29862n = (qn0) C13479j9.m37703a(qn0);
        if (looper == null) {
            handler = null;
        } else {
            handler = ih1.m37370a(looper, (Handler.Callback) this);
        }
        this.f29863o = handler;
        this.f29861m = (on0) C13479j9.m37703a(on0);
        this.f29864p = new pn0();
        this.f29865q = new Metadata[5];
        this.f29866r = new long[5];
    }

    /* renamed from: a */
    public int mo64795a(Format format) {
        if (!this.f29861m.mo69237b(format)) {
            return C12178d.m31711b(0);
        }
        return C12178d.m31711b(C12178d.m31710a((C12188d<?>) null, format.f29533m) ? 4 : 2);
    }

    /* renamed from: c */
    public boolean mo65006c() {
        return true;
    }

    /* renamed from: e */
    public boolean mo65007e() {
        return this.f29870v;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f29862n.mo65167a((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64827w() {
        Arrays.fill(this.f29865q, (Object) null);
        this.f29867s = 0;
        this.f29868t = 0;
        this.f29869u = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64807a(Format[] formatArr, long j) {
        this.f29869u = this.f29861m.mo69236a(formatArr[0]);
    }

    /* renamed from: a */
    public void mo65005a(long j, long j2) {
        if (!this.f29870v && this.f29868t < 5) {
            this.f29864p.mo66557b();
            q70 t = mo64824t();
            int a = mo64796a(t, (C14387qj) this.f29864p, false);
            if (a == -4) {
                if (this.f29864p.mo71021e()) {
                    this.f29870v = true;
                } else if (!this.f29864p.mo71018d()) {
                    pn0 pn0 = this.f29864p;
                    pn0.f38750i = this.f29871w;
                    pn0.mo69600g();
                    nn0 nn0 = this.f29869u;
                    int i = ih1.f34858a;
                    Metadata a2 = nn0.mo65103a(this.f29864p);
                    if (a2 != null) {
                        ArrayList arrayList = new ArrayList(a2.mo64997c());
                        m32037a(a2, (List<Metadata.Entry>) arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata((List<? extends Metadata.Entry>) arrayList);
                            int i2 = this.f29867s;
                            int i3 = this.f29868t;
                            int i4 = (i2 + i3) % 5;
                            this.f29865q[i4] = metadata;
                            this.f29866r[i4] = this.f29864p.f39149f;
                            this.f29868t = i3 + 1;
                        }
                    }
                }
            } else if (a == -5) {
                Format format = t.f39018c;
                format.getClass();
                this.f29871w = format.f29534n;
            }
        }
        if (this.f29868t > 0) {
            long[] jArr = this.f29866r;
            int i5 = this.f29867s;
            if (jArr[i5] <= j) {
                Metadata metadata2 = this.f29865q[i5];
                int i6 = ih1.f34858a;
                Handler handler = this.f29863o;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.f29862n.mo65167a(metadata2);
                }
                Metadata[] metadataArr = this.f29865q;
                int i7 = this.f29867s;
                metadataArr[i7] = null;
                this.f29867s = (i7 + 1) % 5;
                this.f29868t--;
            }
        }
    }

    /* renamed from: a */
    private void m32037a(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.mo64997c(); i++) {
            Format b = metadata.mo64994a(i).mo64873b();
            if (b == null || !this.f29861m.mo69237b(b)) {
                list.add(metadata.mo64994a(i));
            } else {
                nn0 a = this.f29861m.mo69236a(b);
                byte[] a2 = metadata.mo64994a(i).mo64872a();
                a2.getClass();
                this.f29864p.mo66557b();
                this.f29864p.mo69601g(a2.length);
                ByteBuffer byteBuffer = this.f29864p.f39147d;
                int i2 = ih1.f34858a;
                byteBuffer.put(a2);
                this.f29864p.mo69600g();
                Metadata a3 = a.mo65103a(this.f29864p);
                if (a3 != null) {
                    m32037a(a3, list);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64804a(long j, boolean z) {
        Arrays.fill(this.f29865q, (Object) null);
        this.f29867s = 0;
        this.f29868t = 0;
        this.f29870v = false;
    }
}
