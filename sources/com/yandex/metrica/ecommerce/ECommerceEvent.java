package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p265ob.C10250Fb;
import com.yandex.metrica.impl.p265ob.C10265Fn;
import com.yandex.metrica.impl.p265ob.C10705Rf;
import com.yandex.metrica.impl.p265ob.C11786tb;
import java.util.List;

public abstract class ECommerceEvent implements C10250Fb {

    /* renamed from: a */
    private static ECommerceEventProvider f24251a = new ECommerceEventProvider();

    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f24251a.addCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return f24251a.beginCheckoutEvent(eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return f24251a.purchaseEvent(eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f24251a.removeCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return f24251a.showProductCardEvent(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return f24251a.showProductDetailsEvent(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return f24251a.showScreenEvent(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    public abstract /* synthetic */ List<C11786tb<C10705Rf, C10265Fn>> toProto();
}
