package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.exo.C12178d;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.impl.bc1;
import java.util.Collections;
import java.util.List;

public final class od1 extends C12178d implements Handler.Callback {

    /* renamed from: m */
    private final Handler f38155m;

    /* renamed from: n */
    private final nd1 f38156n;

    /* renamed from: o */
    private final bc1 f38157o;

    /* renamed from: p */
    private final q70 f38158p;

    /* renamed from: q */
    private boolean f38159q;

    /* renamed from: r */
    private boolean f38160r;

    /* renamed from: s */
    private int f38161s;

    /* renamed from: t */
    private Format f38162t;

    /* renamed from: u */
    private zb1 f38163u;

    /* renamed from: v */
    private cc1 f38164v;

    /* renamed from: w */
    private dc1 f38165w;

    /* renamed from: x */
    private dc1 f38166x;

    /* renamed from: y */
    private int f38167y;

    public od1(nd1 nd1, Looper looper, bc1 bc1) {
        super(3);
        Handler handler;
        this.f38156n = (nd1) C13479j9.m37703a(nd1);
        if (looper == null) {
            handler = null;
        } else {
            handler = ih1.m37370a(looper, (Handler.Callback) this);
        }
        this.f38155m = handler;
        this.f38157o = bc1;
        this.f38158p = new q70();
    }

    /* renamed from: B */
    private long m40363B() {
        int i = this.f38167y;
        if (i == -1 || i >= this.f38165w.mo66066a()) {
            return Long.MAX_VALUE;
        }
        return this.f38165w.mo66068a(this.f38167y);
    }

    /* renamed from: C */
    private void m40364C() {
        this.f38164v = null;
        this.f38167y = -1;
        dc1 dc1 = this.f38165w;
        if (dc1 != null) {
            dc1.mo68281g();
            this.f38165w = null;
        }
        dc1 dc12 = this.f38166x;
        if (dc12 != null) {
            dc12.mo68281g();
            this.f38166x = null;
        }
    }

    /* renamed from: D */
    private void m40365D() {
        m40364C();
        this.f38163u.release();
        this.f38163u = null;
        this.f38161s = 0;
        this.f38163u = ((bc1.C12582a) this.f38157o).mo66040a(this.f38162t);
    }

    /* renamed from: E */
    private void m40366E() {
        List emptyList = Collections.emptyList();
        Handler handler = this.f38155m;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f38156n.onCues(emptyList);
        }
        if (this.f38161s != 0) {
            m40365D();
            return;
        }
        m40364C();
        this.f38163u.flush();
    }

    /* renamed from: a */
    public int mo64795a(Format format) {
        ((bc1.C12582a) this.f38157o).getClass();
        String str = format.f29530j;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) {
            return C12178d.m31711b(C12178d.m31710a((C12188d<?>) null, format.f29533m) ? 4 : 2);
        } else if (wn0.m43729f(format.f29530j)) {
            return C12178d.m31711b(1);
        } else {
            return C12178d.m31711b(0);
        }
    }

    /* renamed from: c */
    public boolean mo65006c() {
        return true;
    }

    /* renamed from: e */
    public boolean mo65007e() {
        return this.f38160r;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.f38156n.onCues((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64827w() {
        this.f38162t = null;
        List emptyList = Collections.emptyList();
        Handler handler = this.f38155m;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f38156n.onCues(emptyList);
        }
        m40364C();
        this.f38163u.release();
        this.f38163u = null;
        this.f38161s = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64807a(Format[] formatArr, long j) {
        Format format = formatArr[0];
        this.f38162t = format;
        if (this.f38163u != null) {
            this.f38161s = 1;
        } else {
            this.f38163u = ((bc1.C12582a) this.f38157o).mo66040a(format);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64804a(long j, boolean z) {
        this.f38159q = false;
        this.f38160r = false;
        m40366E();
    }

    /* renamed from: a */
    public void mo65005a(long j, long j2) {
        boolean z;
        if (!this.f38160r) {
            if (this.f38166x == null) {
                this.f38163u.mo69357a(j);
                try {
                    this.f38166x = (dc1) this.f38163u.mo69164a();
                } catch (ac1 e) {
                    m40367a(e);
                    return;
                }
            }
            if (mo64809b() == 2) {
                if (this.f38165w != null) {
                    long B = m40363B();
                    z = false;
                    while (B <= j) {
                        this.f38167y++;
                        B = m40363B();
                        z = true;
                    }
                } else {
                    z = false;
                }
                dc1 dc1 = this.f38166x;
                if (dc1 != null) {
                    if (dc1.mo71021e()) {
                        if (!z && m40363B() == Long.MAX_VALUE) {
                            if (this.f38161s == 2) {
                                m40365D();
                            } else {
                                m40364C();
                                this.f38160r = true;
                            }
                        }
                    } else if (this.f38166x.f36447c <= j) {
                        dc1 dc12 = this.f38165w;
                        if (dc12 != null) {
                            dc12.mo68281g();
                        }
                        dc1 dc13 = this.f38166x;
                        this.f38165w = dc13;
                        this.f38166x = null;
                        this.f38167y = dc13.mo66067a(j);
                        z = true;
                    }
                }
                if (z) {
                    List<C14683ti> b = this.f38165w.mo66069b(j);
                    Handler handler = this.f38155m;
                    if (handler != null) {
                        handler.obtainMessage(0, b).sendToTarget();
                    } else {
                        this.f38156n.onCues(b);
                    }
                }
                if (this.f38161s != 2) {
                    while (!this.f38159q) {
                        try {
                            if (this.f38164v == null) {
                                cc1 cc1 = (cc1) this.f38163u.mo69166b();
                                this.f38164v = cc1;
                                if (cc1 == null) {
                                    return;
                                }
                            }
                            if (this.f38161s == 1) {
                                this.f38164v.mo71020e(4);
                                this.f38163u.mo69165a(this.f38164v);
                                this.f38164v = null;
                                this.f38161s = 2;
                                return;
                            }
                            int a = mo64796a(this.f38158p, (C14387qj) this.f38164v, false);
                            if (a == -4) {
                                if (this.f38164v.mo71021e()) {
                                    this.f38159q = true;
                                } else {
                                    cc1 cc12 = this.f38164v;
                                    cc12.f31888i = this.f38158p.f39018c.f29534n;
                                    cc12.mo69600g();
                                }
                                this.f38163u.mo69165a(this.f38164v);
                                this.f38164v = null;
                            } else if (a == -3) {
                                return;
                            }
                        } catch (ac1 e2) {
                            m40367a(e2);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m40367a(ac1 ac1) {
        bk0.m34269a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f38162t, ac1);
        m40366E();
    }
}
