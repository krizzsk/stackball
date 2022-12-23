package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.p033c.C2727c;
import com.fyber.inneractive.sdk.p051j.C3014a;

/* renamed from: com.fyber.inneractive.sdk.util.r */
public final class C3671r {

    /* renamed from: com.fyber.inneractive.sdk.util.r$a */
    public interface C3673a {
        /* renamed from: a */
        C3674b mo18655a();

        /* renamed from: a */
        boolean mo18656a(String str);
    }

    /* renamed from: com.fyber.inneractive.sdk.util.r$b */
    public enum C3674b {
        Mraid,
        Video
    }

    /* renamed from: com.fyber.inneractive.sdk.util.r$1 */
    static /* synthetic */ class C36721 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9955a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.util.r$b[] r0 = com.fyber.inneractive.sdk.util.C3671r.C3674b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9955a = r0
                com.fyber.inneractive.sdk.util.r$b r1 = com.fyber.inneractive.sdk.util.C3671r.C3674b.Mraid     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9955a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.util.r$b r1 = com.fyber.inneractive.sdk.util.C3671r.C3674b.Video     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3671r.C36721.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m9162a(C3674b bVar) {
        int i = C36721.f9955a[bVar.ordinal()];
        if (i == 1) {
            return C2727c.C2728a.f6415a.mo17968c(C3014a.RETURNED_ADTYPE_HTML);
        }
        if (i != 2) {
            return false;
        }
        return C2727c.C2728a.f6415a.mo17968c(C3014a.RETURNED_ADTYPE_VAST);
    }
}
