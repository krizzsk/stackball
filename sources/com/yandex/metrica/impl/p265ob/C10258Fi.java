package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C11464kh;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.Fi */
public class C10258Fi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11007Zm<String, C10466Li> f24696a = new C11007Zm<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final HashMap<String, C10757Si> f24697b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10675Qi f24698c = null;

    /* renamed from: d */
    private final C10645Pi f24699d = new C10259a();

    /* renamed from: com.yandex.metrica.impl.ob.Fi$a */
    class C10259a implements C10645Pi {
        C10259a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Fi$b */
    private static final class C10260b {

        /* renamed from: a */
        static final C10258Fi f24701a = new C10258Fi();
    }

    /* renamed from: a */
    public static final C10258Fi m26314a() {
        return C10260b.f24701a;
    }

    /* renamed from: a */
    public C10757Si mo61330a(Context context, C11101c4 c4Var, C11464kh.C11466b bVar) {
        C10757Si si = this.f24697b.get(c4Var.mo62716b());
        boolean z = true;
        if (si == null) {
            synchronized (this.f24697b) {
                si = this.f24697b.get(c4Var.mo62716b());
                if (si == null) {
                    C10757Si si2 = new C10757Si(context, c4Var.mo62716b(), bVar, this.f24699d);
                    this.f24697b.put(c4Var.mo62716b(), si2);
                    si = si2;
                    z = false;
                }
            }
        }
        if (z) {
            si.mo62237a(bVar);
        }
        return si;
    }

    /* renamed from: a */
    public void mo61331a(C11101c4 c4Var, C10466Li li) {
        synchronized (this.f24697b) {
            this.f24696a.mo62601a(c4Var.mo62716b(), li);
            C10675Qi qi = this.f24698c;
            if (qi != null) {
                li.mo61738a(qi);
            }
        }
    }
}
