package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.impl.p265ob.C10992Zf;

/* renamed from: com.yandex.metrica.impl.ob.q2 */
class C11670q2 {

    /* renamed from: a */
    private final Revenue f28000a;

    /* renamed from: b */
    private final C10650Pn<String> f28001b;

    /* renamed from: c */
    private final C10650Pn<String> f28002c;

    /* renamed from: d */
    private final C10650Pn<String> f28003d;

    /* renamed from: e */
    private final C10380Im f28004e;

    C11670q2(Revenue revenue, C10380Im im) {
        this.f28004e = im;
        this.f28000a = revenue;
        this.f28001b = new C10531Mn(30720, "revenue payload", im);
        this.f28002c = new C10617On(new C10531Mn(184320, "receipt data", im), "<truncated data was not sent, see METRIKALIB-4568>");
        this.f28003d = new C10617On(new C10581Nn(1000, "receipt signature", im), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<byte[], Integer> mo63527a() {
        C10992Zf zf = new C10992Zf();
        zf.f26430d = this.f28000a.currency.getCurrencyCode().getBytes();
        if (C10796U2.m27891a((Object) this.f28000a.price)) {
            zf.f26429c = this.f28000a.price.doubleValue();
        }
        if (C10796U2.m27891a((Object) this.f28000a.priceMicros)) {
            zf.f26434h = this.f28000a.priceMicros.longValue();
        }
        zf.f26431e = C10585O2.m27107d(new C10581Nn(200, "revenue productID", this.f28004e).mo61205a(this.f28000a.productID));
        Integer num = this.f28000a.quantity;
        if (num == null) {
            num = 1;
        }
        zf.f26428b = num.intValue();
        zf.f26432f = C10585O2.m27107d(this.f28001b.mo61205a(this.f28000a.payload));
        int i = 0;
        if (C10796U2.m27891a((Object) this.f28000a.receipt)) {
            C10992Zf.C10993a aVar = new C10992Zf.C10993a();
            String a = this.f28002c.mo61205a(this.f28000a.receipt.data);
            if (C11327i.m29172a(this.f28000a.receipt.data, a)) {
                i = this.f28000a.receipt.data.length() + 0;
            }
            aVar.f26440b = C10585O2.m27107d(a);
            aVar.f26441c = C10585O2.m27107d(this.f28003d.mo61205a(this.f28000a.receipt.signature));
            zf.f26433g = aVar;
        }
        return new Pair<>(C11169e.m28804a((C11169e) zf), Integer.valueOf(i));
    }
}
