package com.fyber.inneractive.sdk.p037d.p038a;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.p047g.p048a.C2928m;
import com.fyber.inneractive.sdk.p047g.p048a.C2930o;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.d.a.d */
public final class C2822d implements Comparator<C2928m> {

    /* renamed from: a */
    private int f6697a;

    /* renamed from: b */
    private int f6698b;

    /* renamed from: c */
    private int f6699c;

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C2928m mVar = (C2928m) obj;
        C2928m mVar2 = (C2928m) obj2;
        if (TextUtils.equals("VPAID", mVar2.f7013g)) {
            return -1;
        }
        if (TextUtils.equals("VPAID", mVar.f7013g)) {
            return 1;
        }
        if (mVar.f7012f == null) {
            i = 0;
        } else {
            i = mVar.f7012f.intValue();
        }
        if (mVar2.f7012f == null) {
            i2 = 0;
        } else {
            i2 = mVar2.f7012f.intValue();
        }
        int i7 = this.f6697a;
        if (i2 > i7 && i <= i7) {
            return -1;
        }
        int i8 = this.f6697a;
        if (i > i8 && i2 <= i8) {
            return 1;
        }
        int compareTo = m6173a(mVar2.f7010d).compareTo(m6173a(mVar.f7010d));
        if (compareTo != 0) {
            return compareTo;
        }
        if (i < i2) {
            return 1;
        }
        if (i > i2) {
            return -1;
        }
        if (mVar.f7008b == null) {
            i3 = 0;
        } else {
            i3 = mVar.f7008b.intValue();
        }
        if (mVar.f7009c == null) {
            i4 = 0;
        } else {
            i4 = mVar.f7009c.intValue();
        }
        if (mVar2.f7008b == null) {
            i5 = 0;
        } else {
            i5 = mVar2.f7008b.intValue();
        }
        if (mVar2.f7009c == null) {
            i6 = 0;
        } else {
            i6 = mVar2.f7009c.intValue();
        }
        int i9 = i3 * i4;
        int i10 = i5 * i6;
        int i11 = this.f6698b * this.f6699c;
        int abs = Math.abs(i9 - i11);
        int abs2 = Math.abs(i10 - i11);
        if (abs < abs2) {
            return -1;
        }
        if (abs > abs2) {
            return 1;
        }
        return 0;
    }

    public C2822d(int i, int i2, int i3) {
        this.f6697a = i;
        this.f6698b = i2;
        this.f6699c = i3;
    }

    /* renamed from: a */
    private static Integer m6173a(String str) {
        C2930o a = C2930o.m6557a(str);
        if (a == C2930o.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (a == C2930o.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (a == C2930o.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }
}
