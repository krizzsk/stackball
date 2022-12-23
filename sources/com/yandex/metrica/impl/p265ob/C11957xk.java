package com.yandex.metrica.impl.p265ob;

import android.telephony.SubscriptionInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, mo72093d2 = {"Lcom/yandex/metrica/impl/ob/xk;", "", "Landroid/telephony/SubscriptionInfo;", "subscriptionInfo", "", "a", "(Landroid/telephony/SubscriptionInfo;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.xk */
public final class C11957xk {

    /* renamed from: a */
    public static final C11957xk f28728a = new C11957xk();

    private C11957xk() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Integer m30857a(SubscriptionInfo subscriptionInfo) {
        return C11327i.m29175b(subscriptionInfo.getMccString());
    }

    @JvmStatic
    /* renamed from: b */
    public static final Integer m30858b(SubscriptionInfo subscriptionInfo) {
        return C11327i.m29175b(subscriptionInfo.getMncString());
    }
}
