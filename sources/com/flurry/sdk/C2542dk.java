package com.flurry.sdk;

import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.dk */
public class C2542dk extends C2625eq {

    /* renamed from: e */
    static final String f5964e = C2542dk.class.getSimpleName();

    /* renamed from: a */
    private final C2504cq<String, String> f5965a = new C2504cq<>();

    /* renamed from: b */
    private final Object f5966b = new Object();

    /* renamed from: c */
    private int f5967c;

    /* renamed from: d */
    private int f5968d;

    /* renamed from: f */
    public final C2504cq<String, String> f5969f = new C2504cq<>();

    /* renamed from: g */
    public String f5970g;

    /* renamed from: h */
    public C2545a f5971h;

    /* renamed from: i */
    public int f5972i = 10000;

    /* renamed from: j */
    public int f5973j = 15000;

    /* renamed from: k */
    public boolean f5974k = true;

    /* renamed from: l */
    C2546b f5975l;

    /* renamed from: m */
    public boolean f5976m;

    /* renamed from: n */
    long f5977n = -1;

    /* renamed from: o */
    public long f5978o = -1;

    /* renamed from: p */
    public Exception f5979p;

    /* renamed from: q */
    public int f5980q = -1;

    /* renamed from: r */
    public boolean f5981r;

    /* renamed from: s */
    public int f5982s = 25000;

    /* renamed from: t */
    public boolean f5983t;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public HttpURLConnection f5984v;

    /* renamed from: w */
    private boolean f5985w;

    /* renamed from: x */
    private boolean f5986x;

    /* renamed from: y */
    private C2540dj f5987y = new C2540dj(this);

    /* renamed from: com.flurry.sdk.dk$b */
    public interface C2546b {
        /* renamed from: a */
        void mo17752a();

        /* renamed from: a */
        void mo17753a(C2542dk dkVar, InputStream inputStream) throws Exception;

        /* renamed from: a */
        void mo17754a(OutputStream outputStream) throws Exception;
    }

    /* renamed from: a */
    public final void mo17759a(String str, String str2) {
        this.f5965a.mo17704a(str, str2);
    }

    /* renamed from: b */
    public final boolean mo17760b() {
        return !mo17761c() && mo17762d();
    }

    /* renamed from: c */
    public final boolean mo17761c() {
        return this.f5979p != null;
    }

    /* renamed from: d */
    public final boolean mo17762d() {
        int i = this.f5980q;
        return i >= 200 && i < 400 && !this.f5983t;
    }

    /* renamed from: a */
    public final List<String> mo17758a(String str) {
        return this.f5969f.mo17701a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo17763e() {
        if (this.f5975l != null && !mo17765g()) {
            this.f5975l.mo17752a();
        }
    }

    /* renamed from: f */
    public final void mo17764f() {
        String str = f5964e;
        C2530db.m5474a(3, str, "Cancelling http request: " + this.f5970g);
        synchronized (this.f5966b) {
            this.f5986x = true;
        }
        m5520i();
    }

    /* renamed from: g */
    public final boolean mo17765g() {
        boolean z;
        synchronized (this.f5966b) {
            z = this.f5986x;
        }
        return z;
    }

    /* renamed from: i */
    private void m5520i() {
        if (!this.f5985w) {
            this.f5985w = true;
            if (this.f5984v != null) {
                new Thread() {
                    public final void run() {
                        try {
                            if (C2542dk.this.f5984v != null) {
                                C2542dk.this.f5984v.disconnect();
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }.start();
            }
        }
    }

    /* renamed from: a */
    public void mo17573a() {
        try {
            if (this.f5970g != null) {
                if (!C2468by.m5319a().f5763c) {
                    String str = f5964e;
                    C2530db.m5474a(3, str, "Network not available, aborting http request: " + this.f5970g);
                } else {
                    if (this.f5971h == null || C2545a.kUnknown.equals(this.f5971h)) {
                        this.f5971h = C2545a.kGet;
                    }
                    m5521j();
                    String str2 = f5964e;
                    C2530db.m5474a(4, str2, "HTTP status: " + this.f5980q + " for url: " + this.f5970g);
                }
            }
        } catch (Exception e) {
            String str3 = f5964e;
            C2530db.m5474a(4, str3, "HTTP status: " + this.f5980q + " for url: " + this.f5970g);
            String str4 = f5964e;
            StringBuilder sb = new StringBuilder("Exception during http request: ");
            sb.append(this.f5970g);
            C2530db.m5475a(3, str4, sb.toString(), e);
            if (this.f5984v != null) {
                this.f5968d = this.f5984v.getReadTimeout();
                this.f5967c = this.f5984v.getConnectTimeout();
            }
            this.f5979p = e;
        } catch (Throwable th) {
            this.f5987y.mo17755a();
            mo17763e();
            throw th;
        }
        this.f5987y.mo17755a();
        mo17763e();
    }

    /* renamed from: j */
    private void m5521j() throws Exception {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStream inputStream;
        BufferedOutputStream bufferedOutputStream;
        Throwable th2;
        OutputStream outputStream;
        if (!this.f5986x) {
            this.f5970g = C2619em.m5695a(this.f5970g);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f5970g).openConnection();
            this.f5984v = httpURLConnection;
            httpURLConnection.setConnectTimeout(this.f5972i);
            this.f5984v.setReadTimeout(this.f5973j);
            this.f5984v.setRequestMethod(this.f5971h.toString());
            this.f5984v.setInstanceFollowRedirects(this.f5974k);
            this.f5984v.setDoOutput(C2545a.kPost.equals(this.f5971h));
            this.f5984v.setDoInput(true);
            for (Map.Entry next : this.f5965a.mo17705b()) {
                this.f5984v.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            if (!C2545a.kGet.equals(this.f5971h) && !C2545a.kPost.equals(this.f5971h)) {
                this.f5984v.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "");
            }
            if (this.f5986x) {
                m5522k();
                return;
            }
            if (C2545a.kPost.equals(this.f5971h)) {
                try {
                    outputStream = this.f5984v.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(outputStream);
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        bufferedOutputStream = null;
                        th2 = th4;
                        C2619em.m5698a((Closeable) bufferedOutputStream);
                        C2619em.m5698a((Closeable) outputStream);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    bufferedOutputStream = null;
                    th2 = th5;
                    outputStream = null;
                    C2619em.m5698a((Closeable) bufferedOutputStream);
                    C2619em.m5698a((Closeable) outputStream);
                    throw th2;
                }
                try {
                    if (this.f5975l != null && !mo17765g()) {
                        this.f5975l.mo17754a(bufferedOutputStream);
                    }
                    C2619em.m5698a((Closeable) bufferedOutputStream);
                    C2619em.m5698a((Closeable) outputStream);
                } catch (Throwable th6) {
                    m5522k();
                    throw th6;
                }
            }
            if (this.f5976m) {
                this.f5977n = System.currentTimeMillis();
            }
            if (this.f5981r) {
                this.f5987y.mo17756a((long) this.f5982s);
            }
            this.f5980q = this.f5984v.getResponseCode();
            if (this.f5976m && this.f5977n != -1) {
                this.f5978o = System.currentTimeMillis() - this.f5977n;
            }
            this.f5987y.mo17755a();
            for (Map.Entry entry : this.f5984v.getHeaderFields().entrySet()) {
                for (String a : (List) entry.getValue()) {
                    this.f5969f.mo17704a(entry.getKey(), a);
                }
            }
            if (!C2545a.kGet.equals(this.f5971h) && !C2545a.kPost.equals(this.f5971h)) {
                m5522k();
            } else if (this.f5986x) {
                m5522k();
            } else {
                try {
                    inputStream = this.f5984v.getInputStream();
                    try {
                        bufferedInputStream = new BufferedInputStream(inputStream);
                        try {
                            if (this.f5975l != null && !mo17765g()) {
                                this.f5975l.mo17753a(this, bufferedInputStream);
                            }
                            C2619em.m5698a((Closeable) bufferedInputStream);
                            C2619em.m5698a((Closeable) inputStream);
                            m5522k();
                        } catch (Throwable th7) {
                            th = th7;
                            C2619em.m5698a((Closeable) bufferedInputStream);
                            C2619em.m5698a((Closeable) inputStream);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        Throwable th9 = th8;
                        bufferedInputStream = null;
                        th = th9;
                        C2619em.m5698a((Closeable) bufferedInputStream);
                        C2619em.m5698a((Closeable) inputStream);
                        throw th;
                    }
                } catch (Throwable th10) {
                    bufferedInputStream = null;
                    th = th10;
                    inputStream = null;
                    C2619em.m5698a((Closeable) bufferedInputStream);
                    C2619em.m5698a((Closeable) inputStream);
                    throw th;
                }
            }
        }
    }

    /* renamed from: k */
    private void m5522k() {
        if (!this.f5985w) {
            this.f5985w = true;
            HttpURLConnection httpURLConnection = this.f5984v;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    /* renamed from: h */
    public final void mo17766h() {
        mo17764f();
    }

    /* renamed from: com.flurry.sdk.dk$2 */
    static /* synthetic */ class C25442 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5989a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.flurry.sdk.dk$a[] r0 = com.flurry.sdk.C2542dk.C2545a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5989a = r0
                com.flurry.sdk.dk$a r1 = com.flurry.sdk.C2542dk.C2545a.kPost     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5989a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.dk$a r1 = com.flurry.sdk.C2542dk.C2545a.kPut     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5989a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.flurry.sdk.dk$a r1 = com.flurry.sdk.C2542dk.C2545a.kDelete     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5989a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.flurry.sdk.dk$a r1 = com.flurry.sdk.C2542dk.C2545a.kHead     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5989a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.flurry.sdk.dk$a r1 = com.flurry.sdk.C2542dk.C2545a.kGet     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2542dk.C25442.<clinit>():void");
        }
    }

    /* renamed from: com.flurry.sdk.dk$a */
    public enum C2545a {
        kUnknown,
        kGet,
        kPost,
        kPut,
        kDelete,
        kHead;

        public final String toString() {
            int i = C25442.f5989a[ordinal()];
            if (i == 1) {
                return "POST";
            }
            if (i == 2) {
                return "PUT";
            }
            if (i == 3) {
                return "DELETE";
            }
            if (i == 4) {
                return VersionInfo.GIT_BRANCH;
            }
            if (i != 5) {
                return null;
            }
            return "GET";
        }
    }
}
