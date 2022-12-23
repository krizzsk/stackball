package com.yandex.metrica.impl.p265ob;

import android.telephony.CellSignalStrengthLte;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\u000b"}, mo72093d2 = {"Lcom/yandex/metrica/impl/ob/ek;", "", "Landroid/telephony/CellSignalStrengthLte;", "cellSignalStrengthLte", "", "b", "(Landroid/telephony/CellSignalStrengthLte;)I", "c", "a", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.ek */
public final class C11213ek {

    /* renamed from: a */
    public static final C11213ek f26843a = new C11213ek();

    private C11213ek() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m28889a(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getCqi();
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m28890b(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRsrq();
    }

    @JvmStatic
    /* renamed from: c */
    public static final int m28891c(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRssnr();
    }
}
