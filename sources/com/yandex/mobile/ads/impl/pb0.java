package com.yandex.mobile.ads.impl;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.q90;
import com.yandex.mobile.ads.impl.rb0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import okio.Sink;
import okio.Source;

public final class pb0 implements e40 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final List<String> f38572g = jh1.m37823a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final List<String> f38573h = jh1.m37823a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a */
    private final y21 f38574a;

    /* renamed from: b */
    private final c31 f38575b;

    /* renamed from: c */
    private final nb0 f38576c;

    /* renamed from: d */
    private volatile rb0 f38577d;

    /* renamed from: e */
    private final w11 f38578e;

    /* renamed from: f */
    private volatile boolean f38579f;

    public pb0(hw0 hw0, y21 y21, c31 c31, nb0 nb0) {
        Intrinsics.checkNotNullParameter(hw0, "client");
        Intrinsics.checkNotNullParameter(y21, "connection");
        Intrinsics.checkNotNullParameter(c31, "chain");
        Intrinsics.checkNotNullParameter(nb0, "http2Connection");
        this.f38574a = y21;
        this.f38575b = c31;
        this.f38576c = nb0;
        List<w11> r = hw0.mo67660r();
        w11 w11 = w11.H2_PRIOR_KNOWLEDGE;
        this.f38578e = !r.contains(w11) ? w11.HTTP_2 : w11;
    }

    /* renamed from: a */
    public Sink mo66755a(m41 m41, long j) {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        rb0 rb0 = this.f38577d;
        Intrinsics.checkNotNull(rb0);
        return rb0.mo69730j();
    }

    /* renamed from: b */
    public void mo66760b() {
        rb0 rb0 = this.f38577d;
        Intrinsics.checkNotNull(rb0);
        ((rb0.C14449a) rb0.mo69730j()).close();
    }

    /* renamed from: c */
    public void mo66761c() {
        this.f38576c.flush();
    }

    /* renamed from: d */
    public y21 mo66762d() {
        return this.f38574a;
    }

    /* renamed from: a */
    public void mo66758a(m41 m41) {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        if (this.f38577d == null) {
            int i = 0;
            boolean z = m41.mo68561a() != null;
            Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
            q90 d = m41.mo68565d();
            ArrayList arrayList = new ArrayList(d.size() + 4);
            arrayList.add(new o90(o90.f38119f, m41.mo68567f()));
            ByteString byteString = o90.f38120g;
            fc0 g = m41.mo68568g();
            Intrinsics.checkNotNullParameter(g, "url");
            String c = g.mo66953c();
            String e = g.mo66955e();
            if (e != null) {
                c = c + '?' + e;
            }
            arrayList.add(new o90(byteString, c));
            String a = m41.mo68562a(HttpHeaders.HOST);
            if (a != null) {
                arrayList.add(new o90(o90.f38122i, a));
            }
            arrayList.add(new o90(o90.f38121h, m41.mo68568g().mo66964l()));
            int size = d.size();
            if (size > 0) {
                while (true) {
                    int i2 = i + 1;
                    String a2 = d.mo69509a(i);
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "US");
                    if (a2 != null) {
                        String lowerCase = a2.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        if (!f38572g.contains(lowerCase) || (Intrinsics.areEqual((Object) lowerCase, (Object) "te") && Intrinsics.areEqual((Object) d.mo69511b(i), (Object) "trailers"))) {
                            arrayList.add(new o90(lowerCase, d.mo69511b(i)));
                        }
                        if (i2 >= size) {
                            break;
                        }
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            this.f38577d = this.f38576c.mo68968a((List<o90>) arrayList, z);
            if (!this.f38579f) {
                rb0 rb0 = this.f38577d;
                Intrinsics.checkNotNull(rb0);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                rb0.mo69738r().timeout((long) this.f38575b.mo66197e(), timeUnit);
                rb0 rb02 = this.f38577d;
                Intrinsics.checkNotNull(rb02);
                rb02.mo69741u().timeout((long) this.f38575b.mo66199g(), timeUnit);
                return;
            }
            rb0 rb03 = this.f38577d;
            Intrinsics.checkNotNull(rb03);
            rb03.mo69714a(o30.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: b */
    public long mo66759b(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        if (!yb0.m44243a(b51)) {
            return 0;
        }
        return jh1.m37815a(b51);
    }

    /* renamed from: a */
    public b51.C12571a mo66754a(boolean z) {
        jb1 jb1;
        rb0 rb0 = this.f38577d;
        Intrinsics.checkNotNull(rb0);
        q90 s = rb0.mo69739s();
        w11 w11 = this.f38578e;
        Intrinsics.checkNotNullParameter(s, "headerBlock");
        Intrinsics.checkNotNullParameter(w11, "protocol");
        q90.C14366a aVar = new q90.C14366a();
        int size = s.size();
        if (size > 0) {
            int i = 0;
            jb1 = null;
            while (true) {
                int i2 = i + 1;
                String a = s.mo69509a(i);
                String b = s.mo69511b(i);
                if (Intrinsics.areEqual((Object) a, (Object) ":status")) {
                    jb1 = jb1.f35211d.mo67962a(Intrinsics.stringPlus("HTTP/1.1 ", b));
                } else if (!f38573h.contains(a)) {
                    aVar.mo69519a(a, b);
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        } else {
            jb1 = null;
        }
        if (jb1 != null) {
            b51.C12571a a2 = new b51.C12571a().mo65998a(w11).mo65991a(jb1.f35213b).mo65999a(jb1.f35214c).mo65997a(aVar.mo69520a());
            if (!z || a2.mo66003b() != 100) {
                return a2;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public Source mo66756a(b51 b51) {
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        rb0 rb0 = this.f38577d;
        Intrinsics.checkNotNull(rb0);
        return rb0.mo69732l();
    }

    /* renamed from: a */
    public void mo66757a() {
        this.f38579f = true;
        rb0 rb0 = this.f38577d;
        if (rb0 != null) {
            rb0.mo69714a(o30.CANCEL);
        }
    }
}
