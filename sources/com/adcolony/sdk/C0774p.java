package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0580a0;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.model.Advertisement;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.adcolony.sdk.p */
class C0774p implements Runnable {

    /* renamed from: a */
    private final int f1261a = 4096;

    /* renamed from: b */
    private final int f1262b = 299;

    /* renamed from: c */
    private final int f1263c = 60000;

    /* renamed from: d */
    private HttpURLConnection f1264d;

    /* renamed from: e */
    private InputStream f1265e;

    /* renamed from: f */
    private C0645d0 f1266f;

    /* renamed from: g */
    private C0775a f1267g;

    /* renamed from: h */
    private String f1268h;

    /* renamed from: i */
    private int f1269i = 0;

    /* renamed from: j */
    private boolean f1270j = false;

    /* renamed from: k */
    private Map<String, List<String>> f1271k;

    /* renamed from: l */
    private String f1272l = "";

    /* renamed from: m */
    private String f1273m = "";

    /* renamed from: n */
    String f1274n = "";

    /* renamed from: o */
    String f1275o = "";

    /* renamed from: p */
    boolean f1276p;

    /* renamed from: q */
    int f1277q;

    /* renamed from: r */
    int f1278r;

    /* renamed from: com.adcolony.sdk.p$a */
    interface C0775a {
        /* renamed from: a */
        void mo9627a(C0774p pVar, C0645d0 d0Var, Map<String, List<String>> map);
    }

    C0774p(C0645d0 d0Var, C0775a aVar) {
        this.f1266f = d0Var;
        this.f1267g = aVar;
    }

    /* renamed from: a */
    private boolean m720a(InputStream inputStream, OutputStream outputStream) throws Exception {
        BufferedInputStream bufferedInputStream;
        Exception e;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        int i = this.f1277q + read;
                        this.f1277q = i;
                        if (this.f1270j) {
                            if (i > this.f1269i) {
                                throw new Exception("Data exceeds expected maximum (" + this.f1277q + "/" + this.f1269i + "): " + this.f1264d.getURL().toString());
                            }
                        }
                        outputStream.write(bArr, 0, read);
                    } else {
                        String str = "UTF-8";
                        String str2 = this.f1268h;
                        if (str2 != null && !str2.isEmpty()) {
                            str = this.f1268h;
                        }
                        if (outputStream instanceof ByteArrayOutputStream) {
                            this.f1275o = ((ByteArrayOutputStream) outputStream).toString(str);
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        bufferedInputStream.close();
                        return true;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            bufferedInputStream = null;
            e = exc;
            throw e;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            bufferedInputStream = null;
            th = th3;
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m721c() throws IOException {
        C0897z0 b = this.f1266f.mo9532b();
        String h = C0894y.m1169h(b, FirebaseAnalytics.Param.CONTENT_TYPE);
        String h2 = C0894y.m1169h(b, "content");
        String h3 = C0894y.m1169h(b, "user_agent");
        int a = C0894y.m1132a(b, "read_timeout", 60000);
        int a2 = C0894y.m1132a(b, "connect_timeout", 60000);
        boolean b2 = C0894y.m1155b(b, "no_redirect");
        this.f1274n = C0894y.m1169h(b, "url");
        this.f1272l = C0894y.m1169h(b, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(C0578a.m143c().mo9571C().mo9830d());
        String str = this.f1272l;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.f1273m = sb.toString();
        this.f1268h = C0894y.m1169h(b, "encoding");
        int a3 = C0894y.m1132a(b, "max_size", 0);
        this.f1269i = a3;
        this.f1270j = a3 != 0;
        this.f1277q = 0;
        this.f1265e = null;
        this.f1264d = null;
        this.f1271k = null;
        if (!this.f1274n.startsWith(Advertisement.FILE_SCHEME)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f1274n).openConnection();
            this.f1264d = httpURLConnection;
            httpURLConnection.setReadTimeout(a);
            this.f1264d.setConnectTimeout(a2);
            this.f1264d.setInstanceFollowRedirects(!b2);
            this.f1264d.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, "UTF-8");
            if (h3 != null && !h3.equals("")) {
                this.f1264d.setRequestProperty("User-Agent", h3);
            }
            if (!h.equals("")) {
                this.f1264d.setRequestProperty("Content-Type", h);
            }
            if (this.f1266f.mo9535c().equals("WebServices.post")) {
                this.f1264d.setDoOutput(true);
                this.f1264d.setFixedLengthStreamingMode(h2.getBytes("UTF-8").length);
                new PrintStream(this.f1264d.getOutputStream()).print(h2);
            }
        } else if (this.f1274n.startsWith("file:///android_asset/")) {
            Context b3 = C0578a.m141b();
            if (b3 != null) {
                this.f1265e = b3.getAssets().open(this.f1274n.substring(22));
            }
        } else {
            this.f1265e = new FileInputStream(this.f1274n.substring(7));
        }
        if (this.f1264d == null && this.f1265e == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m722d() throws Exception {
        OutputStream outputStream;
        InputStream inputStream;
        String c = this.f1266f.mo9535c();
        if (this.f1265e != null) {
            outputStream = this.f1272l.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.f1272l).getAbsolutePath());
        } else if (c.equals("WebServices.download")) {
            this.f1265e = this.f1264d.getInputStream();
            outputStream = new FileOutputStream(this.f1273m);
        } else if (c.equals("WebServices.get")) {
            this.f1265e = this.f1264d.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (c.equals("WebServices.post")) {
            this.f1264d.connect();
            if (this.f1264d.getResponseCode() < 200 || this.f1264d.getResponseCode() > 299) {
                inputStream = this.f1264d.getErrorStream();
            } else {
                inputStream = this.f1264d.getInputStream();
            }
            this.f1265e = inputStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f1264d;
        if (httpURLConnection != null) {
            this.f1278r = httpURLConnection.getResponseCode();
            this.f1271k = this.f1264d.getHeaderFields();
        }
        return m720a(this.f1265e, outputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0645d0 mo9811b() {
        return this.f1266f;
    }

    public void run() {
        boolean z = false;
        this.f1276p = false;
        try {
            if (m721c()) {
                this.f1276p = m722d();
                if (this.f1266f.mo9535c().equals("WebServices.post") && this.f1278r != 200) {
                    this.f1276p = false;
                }
            }
        } catch (MalformedURLException e) {
            new C0580a0.C0581a().mo9419a("MalformedURLException: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            this.f1276p = true;
        } catch (OutOfMemoryError unused) {
            C0580a0.C0581a a = new C0580a0.C0581a().mo9419a("Out of memory error - disabling AdColony. (").mo9417a(this.f1277q).mo9419a("/").mo9417a(this.f1269i);
            a.mo9419a("): " + this.f1274n).mo9421a(C0580a0.f191i);
            C0578a.m143c().mo9595b(true);
        } catch (IOException e2) {
            new C0580a0.C0581a().mo9419a("Download of ").mo9419a(this.f1274n).mo9419a(" failed: ").mo9419a(e2.toString()).mo9421a(C0580a0.f190h);
            int i = this.f1278r;
            if (i == 0) {
                i = 504;
            }
            this.f1278r = i;
        } catch (IllegalStateException e3) {
            new C0580a0.C0581a().mo9419a("okhttp error: ").mo9419a(e3.toString()).mo9421a(C0580a0.f191i);
            e3.printStackTrace();
        } catch (Exception e4) {
            new C0580a0.C0581a().mo9419a("Exception: ").mo9419a(e4.toString()).mo9421a(C0580a0.f191i);
            e4.printStackTrace();
        }
        z = true;
        if (z) {
            if (this.f1266f.mo9535c().equals("WebServices.download")) {
                m719a(this.f1273m, this.f1272l);
            }
            this.f1267g.mo9627a(this, this.f1266f, this.f1271k);
        }
    }

    /* renamed from: a */
    private void m719a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (!str2.equals("") && !substring.equals(C0578a.m143c().mo9571C().mo9830d()) && !new File(str).renameTo(new File(str2))) {
                new C0580a0.C0581a().mo9419a("Moving of ").mo9419a(str).mo9419a(" failed.").mo9421a(C0580a0.f190h);
            }
        } catch (Exception e) {
            new C0580a0.C0581a().mo9419a("Exception: ").mo9419a(e.toString()).mo9421a(C0580a0.f191i);
            e.printStackTrace();
        }
    }
}
