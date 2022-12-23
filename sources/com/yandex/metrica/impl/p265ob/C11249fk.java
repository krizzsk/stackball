package com.yandex.metrica.impl.p265ob;

import android.telephony.CellIdentityLte;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo72093d2 = {"Lcom/yandex/metrica/impl/ob/fk;", "", "Landroid/telephony/CellIdentityLte;", "cellIdentityLte", "", "a", "(Landroid/telephony/CellIdentityLte;)I", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.fk */
public final class C11249fk {

    /* renamed from: a */
    public static final C11249fk f26917a = new C11249fk();

    private C11249fk() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m29006a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getBandwidth();
    }
}
