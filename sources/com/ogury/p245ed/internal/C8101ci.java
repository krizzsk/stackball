package com.ogury.p245ed.internal;

import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ci */
public final class C8101ci {

    /* renamed from: a */
    private final C8098cg f21023a;

    public C8101ci(C8098cg cgVar) {
        C8467mq.m23881b(cgVar, "filterSettings");
        this.f21023a = cgVar;
    }

    /* renamed from: a */
    public final boolean mo53270a(List<? extends Object> list) {
        C8467mq.m23881b(list, "fragments");
        Iterable<Object> iterable = list;
        for (Object a : iterable) {
            if (m22579a(a)) {
                return false;
            }
        }
        for (Object b : iterable) {
            if (m22580b(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m22579a(Object obj) {
        String a = C8094cc.m22564a(obj);
        Iterable<String> b = this.f21023a.mo53269b();
        if ((b instanceof Collection) && ((Collection) b).isEmpty()) {
            return false;
        }
        for (String a2 : b) {
            if (C8467mq.m23880a((Object) a2, (Object) a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m22580b(Object obj) {
        String a = C8094cc.m22564a(obj);
        Iterable<String> a2 = this.f21023a.mo53268a();
        if ((a2 instanceof Collection) && ((Collection) a2).isEmpty()) {
            return false;
        }
        for (String b : a2) {
            if (C8516oc.m23952b(a, b)) {
                return true;
            }
        }
        return false;
    }
}
