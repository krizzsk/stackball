package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class pp1 {

    /* renamed from: a */
    public static String f38779a = "Volley";

    /* renamed from: b */
    public static boolean f38780b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    private static final String f38781c = pp1.class.getName();

    /* renamed from: a */
    public static void m40898a(Throwable th, String str, Object... objArr) {
        Log.e(f38779a, m40897a(str, objArr), th);
    }

    /* renamed from: b */
    public static void m40899b(String str, Object... objArr) {
        Log.d(f38779a, m40897a(str, objArr));
    }

    /* renamed from: c */
    public static void m40900c(String str, Object... objArr) {
        Log.e(f38779a, m40897a(str, objArr));
    }

    /* renamed from: d */
    public static void m40901d(String str, Object... objArr) {
        if (f38780b) {
            Log.v(f38779a, m40897a(str, objArr));
        }
    }

    /* renamed from: a */
    private static String m40897a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f38781c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    /* renamed from: com.yandex.mobile.ads.impl.pp1$a */
    static class C14303a {

        /* renamed from: c */
        public static final boolean f38782c = pp1.f38780b;

        /* renamed from: a */
        private final List<C14304a> f38783a = new ArrayList();

        /* renamed from: b */
        private boolean f38784b = false;

        /* renamed from: com.yandex.mobile.ads.impl.pp1$a$a */
        private static class C14304a {

            /* renamed from: a */
            public final String f38785a;

            /* renamed from: b */
            public final long f38786b;

            /* renamed from: c */
            public final long f38787c;

            public C14304a(String str, long j, long j2) {
                this.f38785a = str;
                this.f38786b = j;
                this.f38787c = j2;
            }
        }

        C14303a() {
        }

        /* renamed from: a */
        public synchronized void mo69394a(String str, long j) {
            if (!this.f38784b) {
                this.f38783a.add(new C14304a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            if (!this.f38784b) {
                mo69393a("Request on the loose");
                pp1.m40900c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        public synchronized void mo69393a(String str) {
            long j;
            this.f38784b = true;
            if (this.f38783a.size() == 0) {
                j = 0;
            } else {
                long j2 = this.f38783a.get(0).f38787c;
                List<C14304a> list = this.f38783a;
                j = list.get(list.size() - 1).f38787c - j2;
            }
            if (j > 0) {
                long j3 = this.f38783a.get(0).f38787c;
                pp1.m40899b("(%-4d ms) %s", Long.valueOf(j), str);
                for (C14304a next : this.f38783a) {
                    long j4 = next.f38787c;
                    pp1.m40899b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(next.f38786b), next.f38785a);
                    j3 = j4;
                }
            }
        }
    }
}
