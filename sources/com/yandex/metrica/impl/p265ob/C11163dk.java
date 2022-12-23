package com.yandex.metrica.impl.p265ob;

import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\b¨\u0006\u000b"}, mo72093d2 = {"Lcom/yandex/metrica/impl/ob/dk;", "", "Landroid/telephony/CellIdentityWcdma;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityWcdma;)I", "Landroid/telephony/CellIdentityLte;", "(Landroid/telephony/CellIdentityLte;)I", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.dk */
public final class C11163dk {

    /* renamed from: a */
    public static final C11163dk f26749a = new C11163dk();

    private C11163dk() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m28798a(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma.getUarfcn();
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m28797a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getEarfcn();
    }
}
