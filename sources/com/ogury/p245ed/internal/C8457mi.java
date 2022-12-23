package com.ogury.p245ed.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.mi */
public abstract class C8457mi implements C8491nl, Serializable {

    /* renamed from: b */
    public static final Object f21678b = C8458a.f21685a;

    /* renamed from: a */
    protected final Object f21679a;

    /* renamed from: c */
    private transient C8491nl f21680c;

    /* renamed from: d */
    private final Class f21681d;

    /* renamed from: e */
    private final String f21682e;

    /* renamed from: f */
    private final String f21683f;

    /* renamed from: g */
    private final boolean f21684g = false;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C8491nl mo53965b();

    /* renamed from: com.ogury.ed.internal.mi$a */
    static class C8458a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8458a f21685a = new C8458a();

        private C8458a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f21685a;
        }
    }

    protected C8457mi(Object obj, Class cls, String str, String str2) {
        this.f21679a = obj;
        this.f21681d = cls;
        this.f21682e = str;
        this.f21683f = str2;
    }

    /* renamed from: c */
    public final Object mo53966c() {
        return this.f21679a;
    }

    /* renamed from: d */
    public final C8491nl mo53967d() {
        C8491nl nlVar = this.f21680c;
        if (nlVar != null) {
            return nlVar;
        }
        C8491nl b = mo53965b();
        this.f21680c = b;
        return b;
    }

    /* renamed from: e */
    public final C8493nn mo53968e() {
        Class cls = this.f21681d;
        if (cls == null) {
            return null;
        }
        return this.f21684g ? C8470mt.m23886a(cls) : C8470mt.m23889b(cls);
    }

    /* renamed from: f */
    public final String mo53969f() {
        return this.f21682e;
    }

    /* renamed from: g */
    public final String mo53970g() {
        return this.f21683f;
    }
}
