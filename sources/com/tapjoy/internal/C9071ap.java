package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ap */
public final class C9071ap {

    /* renamed from: com.tapjoy.internal.ap$a */
    public static final class C9072a implements C9075as {

        /* renamed from: a */
        private final C9073aq f22363a;

        public C9072a(C9073aq aqVar) {
            this.f22363a = aqVar;
        }

        /* renamed from: a */
        public final Object mo57770a(Object obj) {
            C9070ao a;
            Object a2;
            synchronized (this.f22363a) {
                a = this.f22363a.mo57772a(obj, false);
            }
            if (a == null) {
                return null;
            }
            synchronized (a) {
                a2 = a.mo57768a();
            }
            return a2;
        }

        /* renamed from: a */
        public final void mo57771a(Object obj, Object obj2) {
            C9070ao a;
            synchronized (this.f22363a) {
                a = this.f22363a.mo57772a(obj, true);
            }
            synchronized (a) {
                a.mo57769a(obj2);
            }
        }
    }
}
