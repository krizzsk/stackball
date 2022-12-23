package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.mo */
public class C8465mo extends C8457mi implements C8464mn, C8494no {

    /* renamed from: c */
    private final int f21694c;

    /* renamed from: d */
    private final int f21695d = 0;

    public C8465mo(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2);
        this.f21694c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C8491nl mo53965b() {
        return C8470mt.m23887a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8465mo) {
            C8465mo moVar = (C8465mo) obj;
            return C8467mq.m23880a((Object) mo53968e(), (Object) moVar.mo53968e()) && mo53969f().equals(moVar.mo53969f()) && mo53970g().equals(moVar.mo53970g()) && this.f21695d == moVar.f21695d && this.f21694c == moVar.f21694c && C8467mq.m23880a(mo53966c(), moVar.mo53966c());
        } else if (obj instanceof C8494no) {
            return obj.equals(mo53967d());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo53968e() == null ? 0 : mo53968e().hashCode() * 31) + mo53969f().hashCode()) * 31) + mo53970g().hashCode();
    }

    public String toString() {
        C8491nl d = mo53967d();
        if (d != this) {
            return d.toString();
        }
        if ("<init>".equals(mo53969f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo53969f() + " (Kotlin reflection is not available)";
    }
}
