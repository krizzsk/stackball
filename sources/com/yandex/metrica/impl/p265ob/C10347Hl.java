package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.impl.p265ob.C11165dm;

/* renamed from: com.yandex.metrica.impl.ob.Hl */
class C10347Hl {

    /* renamed from: a */
    private final C10938Xl f24849a;

    /* renamed from: b */
    private final C11165dm.C11166a f24850b;

    /* renamed from: c */
    private final C10968Yl f24851c;

    C10347Hl() {
        this(new C10938Xl(), new C11165dm.C11166a(), new C10968Yl());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10319Gl mo61472a(Activity activity, C11091bm bmVar, C11090bl blVar, C11356il ilVar, boolean z) throws Throwable {
        if (z) {
            return new C10319Gl();
        }
        C10968Yl yl = this.f24851c;
        this.f24850b.getClass();
        return yl.mo62553a(activity, ilVar, bmVar, blVar, new C11165dm(bmVar, C10611Oh.m27142a()), this.f24849a);
    }

    C10347Hl(C10938Xl xl, C11165dm.C11166a aVar, C10968Yl yl) {
        this.f24849a = xl;
        this.f24850b = aVar;
        this.f24851c = yl;
    }
}
