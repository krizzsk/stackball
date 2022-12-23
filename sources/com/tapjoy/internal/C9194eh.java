package com.tapjoy.internal;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: com.tapjoy.internal.eh */
public abstract class C9194eh implements Serializable {

    /* renamed from: a */
    transient int f22592a = 0;

    /* renamed from: b */
    protected transient int f22593b = 0;

    /* renamed from: c */
    private final transient C9197ej f22594c;

    /* renamed from: d */
    private final transient C9434iu f22595d;

    protected C9194eh(C9197ej ejVar, C9434iu iuVar) {
        if (ejVar == null) {
            throw new NullPointerException("adapter == null");
        } else if (iuVar != null) {
            this.f22594c = ejVar;
            this.f22595d = iuVar;
        } else {
            throw new NullPointerException("unknownFields == null");
        }
    }

    /* renamed from: a */
    public final C9434iu mo57988a() {
        C9434iu iuVar = this.f22595d;
        if (iuVar != null) {
            return iuVar;
        }
        return C9434iu.f23449b;
    }

    public String toString() {
        return C9197ej.m24596c(this);
    }

    /* renamed from: com.tapjoy.internal.eh$a */
    public static abstract class C9195a {

        /* renamed from: a */
        C9431ir f22596a;

        /* renamed from: b */
        C9214el f22597b;

        protected C9195a() {
        }

        /* renamed from: a */
        public final C9195a mo57991a(C9434iu iuVar) {
            if (iuVar.mo58413c() > 0) {
                if (this.f22597b == null) {
                    C9431ir irVar = new C9431ir();
                    this.f22596a = irVar;
                    this.f22597b = new C9214el(irVar);
                }
                try {
                    this.f22597b.mo58009a(iuVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C9195a mo57990a(int i, C9192eg egVar, Object obj) {
            if (this.f22597b == null) {
                C9431ir irVar = new C9431ir();
                this.f22596a = irVar;
                this.f22597b = new C9214el(irVar);
            }
            try {
                egVar.mo57987a().mo57997a(this.f22597b, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public final C9434iu mo57992a() {
            C9431ir irVar = this.f22596a;
            return irVar != null ? new C9434iu(irVar.clone().mo58403g()) : C9434iu.f23449b;
        }
    }
}
