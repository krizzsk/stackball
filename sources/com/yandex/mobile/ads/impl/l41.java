package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.C13045fd;
import com.yandex.mobile.ads.impl.c51;
import com.yandex.mobile.ads.impl.pp1;
import java.util.Collections;
import java.util.Map;

public abstract class l41<T> implements Comparable<l41<T>> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final pp1.C14303a f36519b;

    /* renamed from: c */
    private final int f36520c;

    /* renamed from: d */
    private final String f36521d;

    /* renamed from: e */
    private final int f36522e;

    /* renamed from: f */
    private final Object f36523f;

    /* renamed from: g */
    private c51.C12699a f36524g;

    /* renamed from: h */
    private Integer f36525h;

    /* renamed from: i */
    private u41 f36526i;

    /* renamed from: j */
    private boolean f36527j;

    /* renamed from: k */
    private boolean f36528k;

    /* renamed from: l */
    private boolean f36529l;

    /* renamed from: m */
    private C14602sk f36530m;

    /* renamed from: n */
    private C13045fd.C13046a f36531n;

    /* renamed from: o */
    private Object f36532o;

    /* renamed from: p */
    private C13832b f36533p;

    /* renamed from: com.yandex.mobile.ads.impl.l41$a */
    class C13831a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f36534b;

        /* renamed from: c */
        final /* synthetic */ long f36535c;

        C13831a(String str, long j) {
            this.f36534b = str;
            this.f36535c = j;
        }

        public void run() {
            l41.this.f36519b.mo69394a(this.f36534b, this.f36535c);
            l41.this.f36519b.mo69393a(l41.this.toString());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.l41$b */
    interface C13832b {
    }

    /* renamed from: com.yandex.mobile.ads.impl.l41$c */
    public enum C13833c {
        LOW,
        NORMAL
    }

    public l41(int i, String str, c51.C12699a aVar) {
        this.f36519b = pp1.C14303a.f38782c ? new pp1.C14303a() : null;
        this.f36523f = new Object();
        this.f36527j = true;
        this.f36528k = false;
        this.f36529l = false;
        this.f36531n = null;
        this.f36520c = i;
        this.f36521d = str;
        this.f36524g = aVar;
        mo68330a(new C14602sk());
        this.f36522e = m38581b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract c51<T> mo66994a(fv0 fv0);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo66996a(T t);

    /* renamed from: b */
    public l41<?> mo68339b(Object obj) {
        this.f36532o = obj;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public op1 mo67425b(op1 op1) {
        return op1;
    }

    /* renamed from: b */
    public byte[] mo67767b() throws C13965ma {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo68341c(String str) {
        u41 u41 = this.f36526i;
        if (u41 != null) {
            u41.mo70288b(this);
        }
        if (pp1.C14303a.f38782c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C13831a(str, id));
                return;
            }
            this.f36519b.mo69394a(str, id);
            this.f36519b.mo69393a(toString());
        }
    }

    public int compareTo(Object obj) {
        l41 l41 = (l41) obj;
        C13833c g = mo66997g();
        C13833c g2 = l41.mo66997g();
        return g == g2 ? this.f36525h.intValue() - l41.f36525h.intValue() : g2.ordinal() - g.ordinal();
    }

    /* renamed from: d */
    public String mo68343d() {
        String l = mo67768l();
        int i = this.f36520c;
        if (i == 0 || i == -1) {
            return l;
        }
        return Integer.toString(i) + '-' + l;
    }

    /* renamed from: e */
    public Map<String, String> mo67426e() throws C13965ma {
        return Collections.emptyMap();
    }

    /* renamed from: f */
    public int mo68344f() {
        return this.f36520c;
    }

    /* renamed from: g */
    public C13833c mo66997g() {
        return C13833c.NORMAL;
    }

    /* renamed from: h */
    public C14602sk mo68345h() {
        return this.f36530m;
    }

    /* renamed from: i */
    public Object mo68346i() {
        return this.f36532o;
    }

    /* renamed from: j */
    public final int mo68347j() {
        return this.f36530m.mo70004b();
    }

    /* renamed from: k */
    public int mo68348k() {
        return this.f36522e;
    }

    /* renamed from: l */
    public String mo67768l() {
        return this.f36521d;
    }

    /* renamed from: m */
    public boolean mo68349m() {
        boolean z;
        synchronized (this.f36523f) {
            z = this.f36529l;
        }
        return z;
    }

    /* renamed from: n */
    public boolean mo68350n() {
        boolean z;
        synchronized (this.f36523f) {
            z = this.f36528k;
        }
        return z;
    }

    /* renamed from: o */
    public void mo68351o() {
        synchronized (this.f36523f) {
            this.f36529l = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo68352p() {
        C13832b bVar;
        synchronized (this.f36523f) {
            bVar = this.f36533p;
        }
        if (bVar != null) {
            ((wp1) bVar).mo70738b(this);
        }
    }

    /* renamed from: q */
    public final boolean mo68353q() {
        return this.f36527j;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(this.f36522e);
        StringBuilder sb = new StringBuilder();
        sb.append(mo68350n() ? "[X] " : "[ ] ");
        sb.append(mo67768l());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(mo66997g());
        sb.append(" ");
        sb.append(this.f36525h);
        return sb.toString();
    }

    /* renamed from: b */
    private static int m38581b(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: a */
    public l41<?> mo68330a(C14602sk skVar) {
        this.f36530m = skVar;
        return this;
    }

    /* renamed from: a */
    public void mo68337a(String str) {
        if (pp1.C14303a.f38782c) {
            this.f36519b.mo69394a(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68333a(int i) {
        u41 u41 = this.f36526i;
        if (u41 != null) {
            u41.mo70286a(this, i);
        }
    }

    /* renamed from: a */
    public l41<?> mo68331a(u41 u41) {
        this.f36526i = u41;
        return this;
    }

    /* renamed from: a */
    public l41<?> mo68329a(C13045fd.C13046a aVar) {
        this.f36531n = aVar;
        return this;
    }

    /* renamed from: b */
    public final l41<?> mo68338b(int i) {
        this.f36525h = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public void mo66995a() {
        synchronized (this.f36523f) {
            this.f36528k = true;
            this.f36524g = null;
        }
    }

    /* renamed from: a */
    public final l41<?> mo68332a(boolean z) {
        this.f36527j = z;
        return this;
    }

    /* renamed from: a */
    public void mo68336a(op1 op1) {
        c51.C12699a aVar;
        synchronized (this.f36523f) {
            aVar = this.f36524g;
        }
        if (aVar != null) {
            aVar.mo64579a(op1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68335a(C13832b bVar) {
        synchronized (this.f36523f) {
            this.f36533p = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68334a(c51<?> c51) {
        C13832b bVar;
        synchronized (this.f36523f) {
            bVar = this.f36533p;
        }
        if (bVar != null) {
            ((wp1) bVar).mo70736a(this, c51);
        }
    }

    /* renamed from: c */
    public C13045fd.C13046a mo68340c() {
        return this.f36531n;
    }
}
