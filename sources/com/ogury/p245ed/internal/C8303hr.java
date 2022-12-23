package com.ogury.p245ed.internal;

import android.widget.FrameLayout;
import com.ogury.p245ed.internal.C8297ho;
import p269io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.hr */
public final class C8303hr {

    /* renamed from: a */
    public static final C8304a f21445a = new C8304a((byte) 0);

    /* renamed from: b */
    private final C8308hu f21446b;

    /* renamed from: c */
    private final ShortcutActivity f21447c;

    /* renamed from: d */
    private final C8345iv f21448d;

    /* renamed from: e */
    private final C8312hw f21449e;

    /* renamed from: f */
    private final C8297ho.C8298a f21450f;

    /* renamed from: g */
    private C8297ho f21451g;

    private C8303hr(C8308hu huVar, ShortcutActivity shortcutActivity, C8345iv ivVar, C8312hw hwVar, C8297ho.C8298a aVar) {
        C8467mq.m23881b(huVar, "shortcutPrefs");
        C8467mq.m23881b(shortcutActivity, "activity");
        C8467mq.m23881b(ivVar, "foregroundHandlerFactory");
        C8467mq.m23881b(hwVar, "webViewArgsParser");
        C8467mq.m23881b(aVar, "browserFactory");
        this.f21446b = huVar;
        this.f21447c = shortcutActivity;
        this.f21448d = ivVar;
        this.f21449e = hwVar;
        this.f21450f = aVar;
    }

    public /* synthetic */ C8303hr(C8308hu huVar, ShortcutActivity shortcutActivity, C8345iv ivVar) {
        this(huVar, shortcutActivity, ivVar, C8312hw.f21474a, C8297ho.f21420a);
    }

    /* renamed from: com.ogury.ed.internal.hr$a */
    public static final class C8304a {
        public /* synthetic */ C8304a(byte b) {
            this();
        }

        private C8304a() {
        }

        /* renamed from: a */
        public static C8303hr m23388a(C8308hu huVar, ShortcutActivity shortcutActivity, C8345iv ivVar) {
            C8467mq.m23881b(huVar, "shortcutPrefs");
            C8467mq.m23881b(shortcutActivity, "activity");
            C8467mq.m23881b(ivVar, "foregroundHandlerFactory");
            return new C8303hr(huVar, shortcutActivity, ivVar);
        }
    }

    /* renamed from: a */
    public final boolean mo53687a(String str, String str2, FrameLayout frameLayout) {
        C8310hv a;
        C8467mq.m23881b(str, "intentArgs");
        C8467mq.m23881b(str2, "shortcutId");
        C8467mq.m23881b(frameLayout, TtmlNode.RUBY_CONTAINER);
        String b = this.f21446b.mo53691b(str2);
        if (b.length() > 0) {
            str = b;
        }
        if ((str.length() == 0) || (a = C8312hw.m23430a(str)) == null) {
            return false;
        }
        if (!this.f21446b.mo53690a(a.mo53701c()) && !this.f21446b.mo53692c(a.mo53701c())) {
            return false;
        }
        m23385a(frameLayout, a);
        return true;
    }

    /* renamed from: a */
    private final void m23385a(FrameLayout frameLayout, C8310hv hvVar) {
        C8185eb ebVar = new C8185eb();
        ebVar.mo53356h("http://ogury.io");
        C8297ho a = C8297ho.C8298a.m23362a(this.f21447c, ebVar, frameLayout, this.f21448d);
        this.f21451g = a;
        if (a != null) {
            a.mo53664a(hvVar);
        }
    }

    /* renamed from: a */
    public final void mo53686a() {
        C8297ho hoVar = this.f21451g;
        if (hoVar != null) {
            hoVar.mo53674d();
        }
    }
}
