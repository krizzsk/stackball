package com.ogury.p245ed.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bq */
public final class C8073bq {

    /* renamed from: a */
    private final C8226fh f20959a;

    /* renamed from: b */
    private final Class<? extends Activity> f20960b;

    /* renamed from: c */
    private List<String> f20961c = new ArrayList();

    /* renamed from: d */
    private List<String> f20962d = new ArrayList();

    public C8073bq(C8226fh fhVar, Class<? extends Activity> cls) {
        C8467mq.m23881b(fhVar, "overlayActivityConfig");
        C8467mq.m23881b(cls, "showActivityClass");
        this.f20959a = fhVar;
        this.f20960b = cls;
        m22495b();
        m22493a();
    }

    /* renamed from: a */
    public final void mo53224a(List<String> list) {
        C8467mq.m23881b(list, "list");
        if (this.f20959a.mo53499c()) {
            this.f20961c.addAll(list);
        }
    }

    /* renamed from: b */
    public final void mo53225b(List<? extends Class<? extends Activity>> list) {
        C8467mq.m23881b(list, "activities");
        if (this.f20959a.mo53501d()) {
            for (Class canonicalName : list) {
                List<String> list2 = this.f20962d;
                String canonicalName2 = canonicalName.getCanonicalName();
                C8467mq.m23878a((Object) canonicalName2, "it.canonicalName");
                list2.add(canonicalName2);
            }
        }
    }

    /* renamed from: a */
    public final void mo53223a(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        if (this.f20959a.mo53497b()) {
            this.f20961c.add(C8094cc.m22563a(activity));
        }
    }

    /* renamed from: a */
    private final void m22493a() {
        if (!this.f20959a.mo53502e().isEmpty()) {
            this.f20961c.addAll(this.f20959a.mo53502e());
        }
    }

    /* renamed from: b */
    private final void m22495b() {
        if (!this.f20959a.mo53503f().isEmpty()) {
            this.f20962d.addAll(this.f20959a.mo53503f());
        }
    }

    /* renamed from: b */
    public final boolean mo53226b(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        if (activity instanceof C8133dd) {
            return false;
        }
        if ((this.f20959a.mo53493a() || C8467mq.m23880a((Object) activity.getClass(), (Object) this.f20960b)) && !m22494a(C8094cc.m22564a((Object) activity)) && m22496b(C8094cc.m22564a((Object) activity))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m22494a(String str) {
        Iterable<String> iterable = this.f20962d;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String b : iterable) {
            if (C8516oc.m23952b(str, b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m22496b(String str) {
        Iterable<String> iterable = this.f20961c;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (String b : iterable) {
            if (C8516oc.m23952b(str, b)) {
                return true;
            }
        }
        return false;
    }
}
