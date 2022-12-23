package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.facebook.share.internal.ShareConstants;
import com.yandex.mobile.ads.impl.jh0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class c31 implements jh0.C13502a {

    /* renamed from: a */
    private final x21 f31796a;

    /* renamed from: b */
    private final List<jh0> f31797b;

    /* renamed from: c */
    private final int f31798c;

    /* renamed from: d */
    private final d40 f31799d;

    /* renamed from: e */
    private final m41 f31800e;

    /* renamed from: f */
    private final int f31801f;

    /* renamed from: g */
    private final int f31802g;

    /* renamed from: h */
    private final int f31803h;

    /* renamed from: i */
    private int f31804i;

    public c31(x21 x21, List<? extends jh0> list, int i, d40 d40, m41 m41, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(list, "interceptors");
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        this.f31796a = x21;
        this.f31797b = list;
        this.f31798c = i;
        this.f31799d = d40;
        this.f31800e = m41;
        this.f31801f = i2;
        this.f31802g = i3;
        this.f31803h = i4;
    }

    /* renamed from: a */
    public static c31 m34573a(c31 c31, int i, d40 d40, m41 m41, int i2, int i3, int i4, int i5) {
        c31 c312 = c31;
        int i6 = (i5 & 1) != 0 ? c312.f31798c : i;
        d40 d402 = (i5 & 2) != 0 ? c312.f31799d : d40;
        m41 m412 = (i5 & 4) != 0 ? c312.f31800e : m41;
        int i7 = (i5 & 8) != 0 ? c312.f31801f : i2;
        int i8 = (i5 & 16) != 0 ? c312.f31802g : i3;
        int i9 = (i5 & 32) != 0 ? c312.f31803h : i4;
        Intrinsics.checkNotNullParameter(m412, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        return new c31(c312.f31796a, c312.f31797b, i6, d402, m412, i7, i8, i9);
    }

    /* renamed from: b */
    public final x21 mo66194b() {
        return this.f31796a;
    }

    /* renamed from: c */
    public final int mo66195c() {
        return this.f31801f;
    }

    /* renamed from: d */
    public final d40 mo66196d() {
        return this.f31799d;
    }

    /* renamed from: e */
    public final int mo66197e() {
        return this.f31802g;
    }

    /* renamed from: f */
    public final m41 mo66198f() {
        return this.f31800e;
    }

    /* renamed from: g */
    public final int mo66199g() {
        return this.f31803h;
    }

    /* renamed from: h */
    public int mo66200h() {
        return this.f31802g;
    }

    /* renamed from: i */
    public m41 mo66201i() {
        return this.f31800e;
    }

    /* renamed from: a */
    public C12380ae mo66192a() {
        return this.f31796a;
    }

    /* renamed from: a */
    public b51 mo66193a(m41 m41) throws IOException {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        boolean z = false;
        if (this.f31798c < this.f31797b.size()) {
            this.f31804i++;
            d40 d40 = this.f31799d;
            if (d40 != null) {
                if (d40.mo66416h().mo66918a(m41.mo68568g())) {
                    if (!(this.f31804i == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f31797b.get(this.f31798c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f31797b.get(this.f31798c - 1) + " must retain the same host and port").toString());
                }
            }
            c31 a = m34573a(this, this.f31798c + 1, (d40) null, m41, 0, 0, 0, 58);
            jh0 jh0 = this.f31797b.get(this.f31798c);
            b51 a2 = jh0.mo66058a(a);
            if (a2 != null) {
                if (this.f31799d != null) {
                    if (!(this.f31798c + 1 >= this.f31797b.size() || a.f31804i == 1)) {
                        throw new IllegalStateException(("network interceptor " + jh0 + " must call proceed() exactly once").toString());
                    }
                }
                if (a2.mo65974b() != null) {
                    z = true;
                }
                if (z) {
                    return a2;
                }
                throw new IllegalStateException(("interceptor " + jh0 + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + jh0 + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
