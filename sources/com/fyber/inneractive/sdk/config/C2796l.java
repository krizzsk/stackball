package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.config.C2802p;
import java.io.Serializable;

/* renamed from: com.fyber.inneractive.sdk.config.l */
public final class C2796l implements C2802p.C2804a {

    /* renamed from: a */
    Context f6593a;

    /* renamed from: b */
    private C2798b f6594b;

    /* renamed from: com.fyber.inneractive.sdk.config.l$a */
    private static class C2797a {

        /* renamed from: a */
        static C2796l f6595a = new C2796l((byte) 0);
    }

    /* synthetic */ C2796l(byte b) {
        this();
    }

    /* renamed from: com.fyber.inneractive.sdk.config.l$b */
    private static class C2798b implements Serializable {
        static final long serialVersionUID = 2;

        /* renamed from: a */
        String f6596a;

        /* renamed from: b */
        boolean f6597b;

        /* renamed from: c */
        boolean f6598c;

        private C2798b() {
        }

        /* synthetic */ C2798b(byte b) {
            this();
        }
    }

    private C2796l() {
        this.f6594b = new C2798b((byte) 0);
    }

    /* renamed from: a */
    public final synchronized void mo18056a(String str, boolean z, boolean z2) {
        this.f6594b.f6596a = str;
        this.f6594b.f6597b = z;
        this.f6594b.f6598c = z2;
    }

    /* renamed from: a */
    public static String m6100a() {
        if (C2797a.f6595a.f6594b != null) {
            return C2797a.f6595a.f6594b.f6596a;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m6101b() {
        if (C2797a.f6595a.f6594b != null) {
            return C2797a.f6595a.f6594b.f6598c;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m6102c() {
        if (C2797a.f6595a.f6594b != null) {
            return C2797a.f6595a.f6594b.f6597b;
        }
        return false;
    }
}
