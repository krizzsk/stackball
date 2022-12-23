package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo72093d2 = {"Lcom/yandex/metrica/impl/ob/wk;", "", "Landroid/content/Context;", "context", "", "Lcom/yandex/metrica/impl/ob/uk;", "a", "(Landroid/content/Context;)Ljava/util/List;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.wk */
public final class C11918wk {

    /* renamed from: a */
    public static final C11918wk f28677a = new C11918wk();

    /* renamed from: com.yandex.metrica.impl.ob.wk$a */
    static final class C11919a<T, R> implements C10897Wm<SubscriptionManager, List<? extends SubscriptionInfo>> {

        /* renamed from: a */
        public static final C11919a f28678a = new C11919a();

        C11919a() {
        }

        /* renamed from: a */
        public Object mo61337a(Object obj) {
            return ((SubscriptionManager) obj).getActiveSubscriptionInfoList();
        }
    }

    private C11918wk() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<C11825uk> m30795a(Context context) {
        Integer num;
        Integer num2;
        List<SubscriptionInfo> list = (List) C10796U2.m27875a(C11919a.f28678a, context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager");
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            if (C10796U2.m27890a(29)) {
                num = C11957xk.m30857a(subscriptionInfo);
            } else {
                num = Integer.valueOf(subscriptionInfo.getMcc());
            }
            if (C10796U2.m27890a(29)) {
                num2 = C11957xk.m30858b(subscriptionInfo);
            } else {
                num2 = Integer.valueOf(subscriptionInfo.getMnc());
            }
            boolean z = true;
            if (subscriptionInfo.getDataRoaming() != 1) {
                z = false;
            }
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C11825uk(num, num2, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}
