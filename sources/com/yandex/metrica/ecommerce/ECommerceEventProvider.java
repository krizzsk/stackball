package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p265ob.C10104Ab;
import com.yandex.metrica.impl.p265ob.C10132Bb;
import com.yandex.metrica.impl.p265ob.C10160Cb;
import com.yandex.metrica.impl.p265ob.C10219Eb;
import com.yandex.metrica.impl.p265ob.C10308Gb;
import com.yandex.metrica.impl.p265ob.C10335Hb;
import com.yandex.metrica.impl.p265ob.C10366Ib;
import com.yandex.metrica.impl.p265ob.C10400Jb;
import com.yandex.metrica.impl.p265ob.C10427Kb;
import com.yandex.metrica.impl.p265ob.C11311hb;
import com.yandex.metrica.impl.p265ob.C11524mb;
import com.yandex.metrica.impl.p265ob.C11846vb;
import com.yandex.metrica.impl.p265ob.C11909wb;
import com.yandex.metrica.impl.p265ob.C11941xb;
import com.yandex.metrica.impl.p265ob.C12024zb;

public class ECommerceEventProvider {
    public ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C12024zb(4, new C10104Ab(eCommerceCartItem), new C11311hb());
    }

    public ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C10132Bb(6, new C10160Cb(eCommerceOrder), new C11524mb());
    }

    public ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C10132Bb(7, new C10160Cb(eCommerceOrder), new C11524mb());
    }

    public ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C12024zb(5, new C10104Ab(eCommerceCartItem), new C11311hb());
    }

    public ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C10366Ib(new C10219Eb(eCommerceProduct), new C10335Hb(eCommerceScreen), new C11846vb());
    }

    public ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        C10308Gb gb;
        C10219Eb eb = new C10219Eb(eCommerceProduct);
        if (eCommerceReferrer == null) {
            gb = null;
        } else {
            gb = new C10308Gb(eCommerceReferrer);
        }
        return new C10400Jb(eb, gb, new C11909wb());
    }

    public ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C10427Kb(new C10335Hb(eCommerceScreen), new C11941xb());
    }
}
