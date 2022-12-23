package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.impl.p265ob.C10344Hk;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zl */
class C12036zl {

    /* renamed from: a */
    private final C11536ml f28912a;

    /* renamed from: b */
    private final C10468Lk f28913b;

    /* renamed from: c */
    private final C10248F9 f28914c;

    /* renamed from: d */
    private volatile C10378Il f28915d;

    /* renamed from: e */
    private final C11292gm f28916e;

    /* renamed from: f */
    private final C10344Hk.C10346b f28917f;

    /* renamed from: g */
    private final C10377Ik f28918g;

    /* renamed from: com.yandex.metrica.impl.ob.zl$a */
    class C12037a implements C11536ml {
        C12037a(C12036zl zlVar) {
        }

        public void onError(String str) {
        }

        public void onResult(JSONObject jSONObject) {
        }
    }

    C12036zl(C10378Il il, C10468Lk lk, C10248F9 f9, C11292gm gmVar, C10377Ik ik) {
        this(il, lk, f9, gmVar, ik, new C10344Hk.C10346b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64203a(C10378Il il) {
        this.f28915d = il;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo64204b(Activity activity) {
        C10378Il il = this.f28915d;
        if (this.f28918g.mo61559a(activity, il) == C11992yl.f28811a) {
            m31081a(activity, 0, il, il.f24923e);
        }
    }

    C12036zl(C10378Il il, C10468Lk lk, C10248F9 f9, C11292gm gmVar, C10377Ik ik, C10344Hk.C10346b bVar) {
        this.f28912a = new C12037a(this);
        this.f28915d = il;
        this.f28913b = lk;
        this.f28914c = f9;
        this.f28916e = gmVar;
        this.f28917f = bVar;
        this.f28918g = ik;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64202a(Activity activity) {
        C10378Il il = this.f28915d;
        if (this.f28918g.mo61559a(activity, il) == C11992yl.f28811a) {
            C11091bm bmVar = il.f24923e;
            m31081a(activity, bmVar.f26622d, il, bmVar);
        }
    }

    /* renamed from: a */
    private void m31081a(Activity activity, long j, C10378Il il, C11091bm bmVar) {
        C11292gm gmVar = this.f28916e;
        C10344Hk.C10346b bVar = this.f28917f;
        C10468Lk lk = this.f28913b;
        C10248F9 f9 = this.f28914c;
        C11536ml mlVar = this.f28912a;
        bVar.getClass();
        gmVar.mo62975a(activity, j, il, bmVar, Collections.singletonList(new C10344Hk(lk, f9, false, mlVar, new C10344Hk.C10345a())));
    }
}
