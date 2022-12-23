package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.Yl */
public class C10968Yl {

    /* renamed from: a */
    private final C10970b f26374a;

    /* renamed from: b */
    private final C10969a f26375b;

    /* renamed from: com.yandex.metrica.impl.ob.Yl$a */
    static class C10969a {
        C10969a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Yl$b */
    static class C10970b {
        C10970b() {
        }
    }

    public C10968Yl() {
        this(new C10970b(), new C10969a());
    }

    /* renamed from: a */
    public C10319Gl mo62553a(Activity activity, C11356il ilVar, C11091bm bmVar, C11090bl blVar, C11165dm dmVar, C10938Xl xl) {
        ViewGroup viewGroup;
        C11091bm bmVar2 = bmVar;
        C11165dm dmVar2 = dmVar;
        C10319Gl gl = new C10319Gl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(16908290);
        } catch (Throwable th) {
            dmVar2.mo62798a("ui_parsing_root", th);
            viewGroup = null;
        }
        if (viewGroup != null) {
            this.f26374a.getClass();
            C11091bm bmVar3 = bmVar;
            C11090bl blVar2 = blVar;
            C11165dm dmVar3 = dmVar;
            C10938Xl xl2 = xl;
            C11796tl tlVar = new C11796tl(bmVar3, new C11472km(dmVar2), new C10789Tk(bmVar2.f26621c), blVar2, Collections.singletonList(new C11610ol()), Arrays.asList(new C10730Rk[]{new C10196Dl(bmVar2.f26620b)}), dmVar3, xl2, new C11537mm());
            gl.mo61404a(tlVar, (View) viewGroup, ilVar);
            if (bmVar2.f26623e) {
                this.f26375b.getClass();
                C10760Sk sk = new C10760Sk(tlVar.mo63751a());
                for (C10229El a : tlVar.mo63753b()) {
                    sk.mo62244a(a);
                }
            }
        }
        return gl;
    }

    C10968Yl(C10970b bVar, C10969a aVar) {
        this.f26374a = bVar;
        this.f26375b = aVar;
    }
}
