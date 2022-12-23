package com.ogury.p245ed.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cg */
public final class C8098cg {

    /* renamed from: a */
    public static final C8099a f21020a = new C8099a((byte) 0);

    /* renamed from: b */
    private final List<String> f21021b;

    /* renamed from: c */
    private final List<String> f21022c;

    public C8098cg(List<String> list, List<String> list2) {
        C8467mq.m23881b(list, "whitelist");
        C8467mq.m23881b(list2, "blacklist");
        this.f21021b = list;
        this.f21022c = list2;
    }

    /* renamed from: a */
    public final List<String> mo53268a() {
        return this.f21021b;
    }

    /* renamed from: b */
    public final List<String> mo53269b() {
        return this.f21022c;
    }

    /* renamed from: com.ogury.ed.internal.cg$a */
    public static final class C8099a {
        public /* synthetic */ C8099a(byte b) {
            this();
        }

        private C8099a() {
        }

        /* renamed from: a */
        public static C8098cg m22574a(Activity activity, C8228fj fjVar, C8105ck ckVar) {
            C8467mq.m23881b(activity, "activity");
            C8467mq.m23881b(fjVar, "fragmentOverlayConfig");
            C8467mq.m23881b(ckVar, "publisherFragmentFilter");
            return new C8098cg(m22576a(fjVar, ckVar, activity), m22575a(fjVar, ckVar));
        }

        /* renamed from: a */
        private static List<String> m22576a(C8228fj fjVar, C8105ck ckVar, Activity activity) {
            List<String> arrayList = new ArrayList<>();
            arrayList.addAll(fjVar.mo53502e());
            if (fjVar.mo53499c()) {
                arrayList.addAll(ckVar.mo53271a());
            }
            if (fjVar.mo53497b()) {
                arrayList.add(C8094cc.m22563a(activity));
            }
            return arrayList;
        }

        /* renamed from: a */
        private static List<String> m22575a(C8228fj fjVar, C8105ck ckVar) {
            List<String> arrayList = new ArrayList<>();
            arrayList.addAll(fjVar.mo53503f());
            if (fjVar.mo53501d()) {
                for (Class cls : ckVar.mo53273b()) {
                    String canonicalName = cls.getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = cls.getName();
                    }
                    C8467mq.m23878a((Object) canonicalName, "fullName");
                    arrayList.add(canonicalName);
                }
            }
            return arrayList;
        }
    }
}
