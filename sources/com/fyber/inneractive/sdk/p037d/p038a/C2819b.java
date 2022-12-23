package com.fyber.inneractive.sdk.p037d.p038a;

import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2922g;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.d.a.b */
public final class C2819b implements Comparator<C2917b> {

    /* renamed from: a */
    private int f6684a;

    /* renamed from: b */
    private int f6685b;

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C2917b bVar = (C2917b) obj;
        C2917b bVar2 = (C2917b) obj2;
        int i = bVar.f6951c * bVar.f6952d;
        int i2 = bVar2.f6951c * bVar2.f6952d;
        int i3 = this.f6684a * this.f6685b;
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i3);
        if (abs < abs2) {
            return -1;
        }
        if (abs > abs2) {
            return 1;
        }
        float floatValue = Float.valueOf((float) this.f6684a).floatValue() / Float.valueOf((float) this.f6685b).floatValue();
        float abs3 = Math.abs(floatValue - (Float.valueOf((float) bVar.f6951c).floatValue() / Float.valueOf((float) bVar.f6952d).floatValue()));
        float abs4 = Math.abs(floatValue - (Float.valueOf((float) bVar2.f6951c).floatValue() / Float.valueOf((float) bVar2.f6952d).floatValue()));
        if (abs3 < abs4) {
            return -1;
        }
        if (abs3 > abs4) {
            return 1;
        }
        int compareTo = m6172a(bVar2).compareTo(m6172a(bVar));
        if (compareTo != 0) {
            return compareTo;
        }
        return 0;
    }

    public C2819b(int i, int i2) {
        this.f6684a = i;
        this.f6685b = i2;
    }

    /* renamed from: a */
    private static Integer m6172a(C2917b bVar) {
        C2922g gVar = bVar.f6949a;
        if (gVar == C2922g.Html) {
            return 3;
        }
        if (gVar == C2922g.Iframe) {
            return 2;
        }
        if (gVar == C2922g.Static) {
            return 1;
        }
        return -1;
    }
}
