package com.yandex.metrica.impl.p265ob;

import android.telephony.CellIdentityLte;
import kotlin.Metadata;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, mo72093d2 = {"Lcom/yandex/metrica/impl/ob/qk;", "Lcom/yandex/metrica/impl/ob/nk;", "Landroid/telephony/CellIdentityLte;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityLte;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.qk */
public final class C11692qk implements C11568nk<CellIdentityLte> {
    /* renamed from: a */
    public Integer mo63388b(CellIdentityLte cellIdentityLte) {
        return Integer.valueOf(cellIdentityLte.getMcc());
    }

    /* renamed from: b */
    public Integer mo63387a(CellIdentityLte cellIdentityLte) {
        return Integer.valueOf(cellIdentityLte.getMnc());
    }
}
