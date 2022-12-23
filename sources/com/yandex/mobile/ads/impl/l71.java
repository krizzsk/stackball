package com.yandex.mobile.ads.impl;

import android.content.Context;

public class l71 {

    /* renamed from: f */
    private static final Object f36549f = new Object();

    /* renamed from: g */
    private static volatile l71 f36550g;

    /* renamed from: a */
    private d71 f36551a;

    /* renamed from: b */
    private Boolean f36552b;

    /* renamed from: c */
    private boolean f36553c = false;

    /* renamed from: d */
    private boolean f36554d;

    /* renamed from: e */
    private boolean f36555e = true;

    private l71() {
    }

    /* renamed from: c */
    public static l71 m38631c() {
        if (f36550g == null) {
            synchronized (f36549f) {
                if (f36550g == null) {
                    f36550g = new l71();
                }
            }
        }
        return f36550g;
    }

    /* renamed from: a */
    public d71 mo68362a(Context context) {
        d71 d71;
        synchronized (f36549f) {
            if (this.f36551a == null) {
                this.f36551a = C13378i5.m37276a(context);
            }
            d71 = this.f36551a;
        }
        return d71;
    }

    @Deprecated
    /* renamed from: b */
    public synchronized io0 mo68366b() {
        synchronized (f36549f) {
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo68369d() {
        synchronized (f36549f) {
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo68370e() {
        boolean z;
        synchronized (f36549f) {
            z = this.f36554d;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo68371f() {
        boolean z;
        synchronized (f36549f) {
            z = this.f36553c;
        }
        return z;
    }

    /* renamed from: g */
    public Boolean mo68372g() {
        Boolean bool;
        synchronized (f36549f) {
            bool = this.f36552b;
        }
        return bool;
    }

    /* renamed from: h */
    public boolean mo68373h() {
        boolean z;
        synchronized (f36549f) {
            z = this.f36555e;
        }
        return z;
    }

    /* renamed from: b */
    public void mo68367b(boolean z) {
        synchronized (f36549f) {
            this.f36553c = z;
        }
    }

    /* renamed from: a */
    public void mo68364a(Context context, d71 d71) {
        synchronized (f36549f) {
            this.f36551a = d71;
            C13378i5.m37278a(context, d71);
        }
    }

    /* renamed from: c */
    public void mo68368c(boolean z) {
        synchronized (f36549f) {
            this.f36552b = Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public pa0 mo68363a() {
        synchronized (f36549f) {
        }
        return null;
    }

    /* renamed from: a */
    public void mo68365a(boolean z) {
        synchronized (f36549f) {
            this.f36554d = z;
            this.f36555e = z;
        }
    }
}
