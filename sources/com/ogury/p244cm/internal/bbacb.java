package com.ogury.p244cm.internal;

import android.content.Context;
import java.io.Serializable;

/* renamed from: com.ogury.cm.internal.bbacb */
public final class bbacb {

    /* renamed from: com.ogury.cm.internal.bbacb$aaaaa */
    public static final class aaaaa implements Serializable {

        /* renamed from: a */
        public boolean f20618a;

        public final String toString() {
            return String.valueOf(this.f20618a);
        }
    }

    /* renamed from: com.ogury.cm.internal.bbacb$aaaab */
    public static final class aaaab<T> implements Serializable {

        /* renamed from: a */
        public T f20619a;

        public final String toString() {
            return String.valueOf(this.f20619a);
        }
    }

    /* renamed from: a */
    public static boolean m22052a(Context context) {
        bbabc.m22051b(context, "context");
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
