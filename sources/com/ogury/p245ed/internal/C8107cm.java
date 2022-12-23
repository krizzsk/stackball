package com.ogury.p245ed.internal;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cm */
public final class C8107cm {
    /* renamed from: a */
    public static final C8185eb m22598a(List<C8185eb> list, String str) {
        C8467mq.m23881b(list, "<this>");
        C8467mq.m23881b(str, "nextAdId");
        if (list.isEmpty()) {
            return null;
        }
        if ((str.length() == 0) || C8467mq.m23880a((Object) str, (Object) "null")) {
            return list.remove(0);
        }
        return m22600b(list, str);
    }

    /* renamed from: com.ogury.ed.internal.cm$a */
    static final class C8108a extends C8468mr implements C8432lk<C8185eb, Boolean> {

        /* renamed from: a */
        public static final C8108a f21037a = new C8108a();

        C8108a() {
            super(1);
        }

        /* renamed from: a */
        private static Boolean m22601a(C8185eb ebVar) {
            C8467mq.m23881b(ebVar, "it");
            return Boolean.valueOf(ebVar.mo53378u());
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            return m22601a((C8185eb) obj);
        }
    }

    /* renamed from: a */
    public static final void m22599a(List<C8185eb> list) {
        C8467mq.m23881b(list, "<this>");
        C8394km.m23761a(list, C8108a.f21037a);
    }

    /* renamed from: b */
    private static final C8185eb m22600b(List<C8185eb> list, String str) {
        Iterator<C8185eb> it = list.iterator();
        while (it.hasNext()) {
            C8185eb next = it.next();
            if (C8467mq.m23880a((Object) next.mo53338b(), (Object) str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }
}
