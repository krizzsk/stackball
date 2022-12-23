package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.iq1;
import java.util.ArrayList;
import java.util.List;

public final class kq1 extends s81 {

    /* renamed from: n */
    private final jq1 f36380n = new jq1();

    /* renamed from: o */
    private final fy0 f36381o = new fy0();

    /* renamed from: p */
    private final iq1.C13435b f36382p = new iq1.C13435b();

    /* renamed from: q */
    private final C14600si f36383q = new C14600si();

    /* renamed from: r */
    private final List<hq1> f36384r = new ArrayList();

    public kq1() {
        super("WebvttDecoder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public yb1 mo65718a(byte[] bArr, int i, boolean z) throws ac1 {
        this.f36381o.mo67103a(bArr, i);
        this.f36382p.mo67880b();
        this.f36384r.clear();
        try {
            lq1.m38895a(this.f36381o);
            do {
            } while (!TextUtils.isEmpty(this.f36381o.mo67116h()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                fy0 fy0 = this.f36381o;
                char c = 65535;
                int i2 = 0;
                while (c == 65535) {
                    i2 = fy0.mo67105b();
                    String h = fy0.mo67116h();
                    if (h == null) {
                        c = 0;
                    } else if ("STYLE".equals(h)) {
                        c = 2;
                    } else {
                        c = h.startsWith("NOTE") ? (char) 1 : 3;
                    }
                }
                fy0.mo67112e(i2);
                if (c == 0) {
                    return new mq1(arrayList);
                }
                if (c == 1) {
                    do {
                    } while (!TextUtils.isEmpty(this.f36381o.mo67116h()));
                } else if (c == 2) {
                    if (arrayList.isEmpty()) {
                        this.f36381o.mo67116h();
                        this.f36384r.addAll(this.f36383q.mo69998a(this.f36381o));
                    } else {
                        throw new ac1("A style block was found after the first cue.");
                    }
                } else if (c == 3 && this.f36380n.mo68082a(this.f36381o, this.f36382p, this.f36384r)) {
                    arrayList.add(this.f36382p.mo67876a());
                    this.f36382p.mo67880b();
                }
            }
        } catch (jy0 e) {
            throw new ac1((Exception) e);
        }
    }
}
