package com.ogury.p245ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.ca */
public final class C8091ca {

    /* renamed from: a */
    public static final C8092a f21011a = new C8092a((byte) 0);

    /* renamed from: b */
    private final C8093cb f21012b;

    /* renamed from: com.ogury.ed.internal.ca$a */
    public static final class C8092a {
        public /* synthetic */ C8092a(byte b) {
            this();
        }

        private C8092a() {
        }

        /* renamed from: a */
        public static C8091ca m22560a(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            return new C8091ca(new C8093cb(activity));
        }
    }

    public C8091ca(C8093cb cbVar) {
        C8467mq.m23881b(cbVar, "overlayScreenArea");
        this.f21012b = cbVar;
    }

    /* renamed from: a */
    public final int mo53260a(C8089bz bzVar, C8204et etVar) {
        C8467mq.m23881b(bzVar, "overlayPosition");
        C8467mq.m23881b(etVar, "overlayAdResponse");
        if (C8211ey.m22964a(bzVar.mo53254a())) {
            return bzVar.mo53255b();
        }
        return C8258gi.m23194a((this.f21012b.mo53262a() - C8258gi.m23195b(bzVar.mo53255b())) - etVar.mo53435b());
    }

    /* renamed from: b */
    public final int mo53261b(C8089bz bzVar, C8204et etVar) {
        C8467mq.m23881b(bzVar, "overlayPosition");
        C8467mq.m23881b(etVar, "overlayAdResponse");
        if (C8211ey.m22965b(bzVar.mo53254a())) {
            return bzVar.mo53256c();
        }
        return C8258gi.m23194a((this.f21012b.mo53263b() - C8258gi.m23195b(bzVar.mo53256c())) - etVar.mo53437c());
    }
}
