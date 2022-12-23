package com.fyber.inneractive.sdk.util;

import android.content.Context;
import com.fyber.inneractive.sdk.config.C2788f;
import com.fyber.inneractive.sdk.logger.C3027a;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IAlog {

    /* renamed from: a */
    public static int f9870a = 4;

    /* renamed from: b */
    public static int f9871b = 1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C3027a f9872c = new C3027a();

    /* renamed from: d */
    private static List<FMPLogger> f9873d = new ArrayList<FMPLogger>() {
        {
            add(IAlog.f9872c);
        }
    };

    /* renamed from: a */
    public static void m9031a(Context context) {
        f9873d.retainAll(Collections.singleton(f9872c));
        String b = C2788f.m6074b();
        if (b != null) {
            for (String cls : b.split(",")) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(cls).newInstance();
                    fMPLogger.initialize(context);
                    f9873d.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9033a(String str, Object... objArr) {
        for (FMPLogger verbose : f9873d) {
            verbose.verbose(str, objArr);
        }
    }

    /* renamed from: b */
    public static void m9034b(String str, Object... objArr) {
        for (FMPLogger debug : f9873d) {
            debug.debug(str, objArr);
        }
    }

    /* renamed from: c */
    public static void m9035c(String str, Object... objArr) {
        for (FMPLogger info : f9873d) {
            info.info(str, objArr);
        }
    }

    /* renamed from: d */
    public static void m9036d(String str, Object... objArr) {
        for (FMPLogger warning : f9873d) {
            warning.warning(str, objArr);
        }
    }

    /* renamed from: e */
    public static void m9037e(String str, Object... objArr) {
        for (FMPLogger error : f9873d) {
            error.error(str, (Throwable) null, objArr);
        }
    }

    /* renamed from: a */
    public static void m9032a(String str, Throwable th, Object... objArr) {
        for (FMPLogger error : f9873d) {
            error.error(str, th, objArr);
        }
    }

    /* renamed from: a */
    public static void m9030a(int i, String str, Object... objArr) {
        for (FMPLogger log : f9873d) {
            log.log(i, (Exception) null, str, objArr);
        }
    }

    /* renamed from: a */
    public static String m9029a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    /* renamed from: a */
    public static String m9028a(Class<?> cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }

    /* renamed from: com.fyber.inneractive.sdk.util.IAlog$a */
    public static class C3616a {

        /* renamed from: a */
        long f9874a = System.currentTimeMillis();

        /* renamed from: b */
        String f9875b;

        /* renamed from: c */
        String f9876c;

        public C3616a(String str, String str2) {
            this.f9876c = str;
            this.f9875b = str2;
        }

        /* renamed from: a */
        public final void mo19544a() {
            IAlog.m9033a(this.f9876c + "timelog: " + this.f9875b + " took " + (System.currentTimeMillis() - this.f9874a) + " msec", new Object[0]);
        }
    }
}
