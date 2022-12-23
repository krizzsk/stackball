package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.adcolony.sdk.b0 */
class C0587b0 {

    /* renamed from: e */
    static final SimpleDateFormat f213e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);

    /* renamed from: f */
    static final String f214f = "message";

    /* renamed from: g */
    static final String f215g = "timestamp";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Date f216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f217b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0892x f218c;

    /* renamed from: d */
    protected String f219d;

    /* renamed from: com.adcolony.sdk.b0$a */
    static class C0588a {

        /* renamed from: a */
        protected C0587b0 f220a = new C0587b0();

        C0588a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0588a mo9435a(int i) {
            int unused = this.f220a.f217b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0588a mo9436a(C0892x xVar) {
            C0892x unused = this.f220a.f218c = xVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0588a mo9437a(String str) {
            this.f220a.f219d = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0588a mo9438a(Date date) {
            Date unused = this.f220a.f216a = date;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0587b0 mo9439a() {
            if (this.f220a.f216a == null) {
                Date unused = this.f220a.f216a = new Date(System.currentTimeMillis());
            }
            return this.f220a;
        }
    }

    C0587b0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9430b() {
        return this.f217b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9431c() {
        int i = this.f217b;
        if (i == -1) {
            return "Fatal";
        }
        if (i == 0) {
            return "Error";
        }
        if (i == 1) {
            return "Warn";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return "Info";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9432d() {
        return this.f219d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo9433e() {
        return f213e.format(this.f216a);
    }

    public String toString() {
        return mo9433e() + " " + mo9431c() + "/" + mo9427a().mo10007a() + ": " + mo9432d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9429a(C0892x xVar) {
        this.f218c = xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9428a(int i) {
        this.f217b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0892x mo9427a() {
        return this.f218c;
    }
}
