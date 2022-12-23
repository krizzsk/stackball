package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ei */
public class C11211ei {

    /* renamed from: a */
    private final Context f26836a;

    /* renamed from: b */
    private final C11532mi f26837b;

    /* renamed from: c */
    private final C10815Uh f26838c;

    /* renamed from: d */
    private C11390ji f26839d;

    /* renamed from: e */
    private C11390ji f26840e;

    /* renamed from: f */
    private C10675Qi f26841f;

    public C11211ei(Context context) {
        this(context, new C11532mi(), new C10815Uh(context));
    }

    /* renamed from: a */
    public synchronized void mo62834a(C10675Qi qi) {
        this.f26841f = qi;
        C11390ji jiVar = this.f26839d;
        if (jiVar == null) {
            C11532mi miVar = this.f26837b;
            Context context = this.f26836a;
            miVar.getClass();
            this.f26839d = new C11390ji(context, qi, new C10725Rh(), new C11468ki(miVar), new C10889Wh("open", "http"), new C10889Wh("port_already_in_use", "http"), "Http");
        } else {
            jiVar.mo63110a(qi);
        }
        this.f26838c.mo62364a(qi, this);
    }

    /* renamed from: b */
    public synchronized void mo62836b() {
        C11390ji jiVar = this.f26839d;
        if (jiVar != null) {
            jiVar.mo63116b();
        }
        C11390ji jiVar2 = this.f26840e;
        if (jiVar2 != null) {
            jiVar2.mo63116b();
        }
    }

    C11211ei(Context context, C11532mi miVar, C10815Uh uh) {
        this.f26836a = context;
        this.f26837b = miVar;
        this.f26838c = uh;
    }

    /* renamed from: b */
    public synchronized void mo62837b(C10675Qi qi) {
        this.f26841f = qi;
        this.f26838c.mo62364a(qi, this);
        C11390ji jiVar = this.f26839d;
        if (jiVar != null) {
            jiVar.mo63118b(qi);
        }
        C11390ji jiVar2 = this.f26840e;
        if (jiVar2 != null) {
            jiVar2.mo63118b(qi);
        }
    }

    /* renamed from: a */
    public synchronized void mo62833a() {
        C11390ji jiVar = this.f26839d;
        if (jiVar != null) {
            jiVar.mo63109a();
        }
        C11390ji jiVar2 = this.f26840e;
        if (jiVar2 != null) {
            jiVar2.mo63109a();
        }
    }

    /* renamed from: a */
    public synchronized void mo62835a(File file) {
        C11390ji jiVar = this.f26840e;
        if (jiVar == null) {
            C11532mi miVar = this.f26837b;
            Context context = this.f26836a;
            C10675Qi qi = this.f26841f;
            miVar.getClass();
            this.f26840e = new C11390ji(context, qi, new C10855Vh(file), new C11503li(miVar), new C10889Wh("open", "https"), new C10889Wh("port_already_in_use", "https"), "Https");
        } else {
            jiVar.mo63110a(this.f26841f);
        }
    }
}
