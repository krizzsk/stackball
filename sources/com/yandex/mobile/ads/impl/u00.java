package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13452ix;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

public class u00 extends w10<Boolean> {
    /* renamed from: a */
    public Object mo65638a(C13091fq fqVar, j50 j50) {
        Intrinsics.checkNotNullParameter(fqVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65645a(C14406qq qqVar, j50 j50) {
        Intrinsics.checkNotNullParameter(qqVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65639a(C13111fs fsVar, j50 j50) {
        Intrinsics.checkNotNullParameter(fsVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65641a(C13885ls lsVar, j50 j50) {
        Intrinsics.checkNotNullParameter(lsVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65647a(C14924vs vsVar, j50 j50) {
        boolean z;
        Integer a;
        Integer a2;
        Intrinsics.checkNotNullParameter(vsVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        int intValue = vsVar.f41502j.mo66924a(j50).intValue();
        int[] iArr = new int[intValue];
        Iterator<T> it = vsVar.f41511s.iterator();
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (it.hasNext()) {
                C15177xl xlVar = (C15177xl) it.next();
                Integer minOrNull = ArraysKt.minOrNull(iArr);
                int intValue2 = minOrNull == null ? 0 : minOrNull.intValue();
                int indexOf = ArraysKt.indexOf(iArr, intValue2);
                for (int i4 = 0; i4 < intValue; i4++) {
                    iArr[i4] = Math.max(0, iArr[i4] - intValue2);
                }
                C14697tn b = xlVar.mo70911b();
                f50<Integer> a3 = b.mo66142a();
                int intValue3 = (a3 == null || (a2 = a3.mo66924a(j50)) == null) ? 1 : a2.intValue();
                f50<Integer> o = b.mo66157o();
                if (!(o == null || (a = o.mo66924a(j50)) == null)) {
                    i3 = a.intValue();
                }
                int i5 = intValue3 + indexOf;
                if (i5 > intValue) {
                    return Boolean.FALSE;
                }
                while (indexOf < i5) {
                    int i6 = indexOf + 1;
                    if (iArr[indexOf] > 0) {
                        return Boolean.FALSE;
                    }
                    iArr[indexOf] = i3;
                    indexOf = i6;
                }
                if (b.mo66147f() instanceof C13452ix.C13456d) {
                    i++;
                }
                if (b.mo66148g() instanceof C13452ix.C13456d) {
                    i2++;
                }
            } else if ((vsVar.mo66147f() instanceof C13452ix.C13457e) && i == vsVar.f41511s.size()) {
                return Boolean.FALSE;
            } else {
                if ((vsVar.mo66148g() instanceof C13452ix.C13457e) && i2 == vsVar.f41511s.size()) {
                    return Boolean.FALSE;
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= intValue) {
                        z2 = true;
                        break;
                    }
                    int i8 = iArr[i7];
                    i7++;
                    if (i8 == ArraysKt.first(iArr)) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        break;
                    }
                }
                return Boolean.valueOf(z2);
            }
        }
    }

    /* renamed from: a */
    public Object mo65637a(C12997et etVar, j50 j50) {
        Intrinsics.checkNotNullParameter(etVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65648a(C15107wt wtVar, j50 j50) {
        Intrinsics.checkNotNullParameter(wtVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65644a(C14215ov ovVar, j50 j50) {
        Intrinsics.checkNotNullParameter(ovVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65646a(C14841uw uwVar, j50 j50) {
        Intrinsics.checkNotNullParameter(uwVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65643a(C14141nx nxVar, j50 j50) {
        Intrinsics.checkNotNullParameter(nxVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65640a(C13358hy hyVar, j50 j50) {
        Intrinsics.checkNotNullParameter(hyVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65636a(C12667bz bzVar, j50 j50) {
        Intrinsics.checkNotNullParameter(bzVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public Object mo65642a(C13915lz lzVar, j50 j50) {
        Intrinsics.checkNotNullParameter(lzVar, "data");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        return Boolean.TRUE;
    }
}
