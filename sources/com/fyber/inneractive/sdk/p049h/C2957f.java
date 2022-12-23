package com.fyber.inneractive.sdk.p049h;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.h.f */
public final class C2957f implements C2956e {

    /* renamed from: a */
    private HttpURLConnection f7114a;

    /* renamed from: b */
    private URL f7115b;

    /* renamed from: b */
    private C2958g m6624b() throws C2949al, C2951b {
        String str;
        try {
            InputStream a = m6621a((URLConnection) this.f7114a);
            int responseCode = this.f7114a.getResponseCode();
            Map headerFields = this.f7114a.getHeaderFields();
            if (this.f7114a == null) {
                str = null;
            } else {
                str = this.f7114a.getHeaderField(HttpHeaders.LAST_MODIFIED);
            }
            C2958g gVar = new C2958g(a, responseCode, headerFields, str);
            if (gVar.f7116a / 100 != 5) {
                return gVar;
            }
            throw new C2951b(String.format("server returned error %d", new Object[]{Integer.valueOf(gVar.f7116a)}));
        } catch (C2951b e) {
            IAlog.m9032a("failed executing network request", (Throwable) e, new Object[0]);
            throw new C2951b((Throwable) e);
        } catch (Exception e2) {
            IAlog.m9032a("failed reading network response", (Throwable) e2, new Object[0]);
            throw new C2949al(e2);
        }
    }

    /* renamed from: a */
    public final void mo18422a() {
        if (this.f7114a != null) {
            IAlog.m9034b("HttpExecutorImpl: disconnect: %s", this.f7115b.toString());
            try {
                this.f7114a.disconnect();
            } catch (Exception unused) {
                IAlog.m9034b("HttpExecutorImpl: exception during disconnect: %s", this.f7115b.toString());
            }
        }
        this.f7114a = null;
    }

    /* renamed from: a */
    private static InputStream m6621a(URLConnection uRLConnection) {
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                IAlog.m9034b("HttpExecutorImpl: getInputStream found gzip encoding", new Object[0]);
                return new GZIPInputStream(inputStream);
            }
            IAlog.m9034b("HttpExecutorImpl: getInputStream no gzip encoding", new Object[0]);
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> void m6622a(C2988y<T> yVar) {
        Map<String, String> d = yVar.mo18394d();
        if (d != null) {
            for (String next : d.keySet()) {
                m6623a(next, d.get(next));
            }
        }
    }

    /* renamed from: a */
    private void m6623a(String str, String str2) {
        if (this.f7114a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IAlog.m9030a(IAlog.f9871b, "%s %s : %s", "REQUEST_HEADER", str, str2);
            this.f7114a.addRequestProperty(str, str2);
        }
    }

    /* renamed from: a */
    public final C2958g mo18421a(C2988y yVar, String str, String str2) throws Exception {
        try {
            URL url = new URL(yVar.mo18409k());
            this.f7115b = url;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            this.f7114a = httpURLConnection;
            C2948ak q = yVar.mo18403q();
            httpURLConnection.setConnectTimeout(q.f7096a);
            httpURLConnection.setReadTimeout(q.f7097b);
            m6623a("User-Agent", str);
            m6623a(HttpHeaders.IF_MODIFIED_SINCE, str2);
            m6623a(HttpHeaders.ACCEPT_ENCODING, "gzip");
            m6622a(yVar);
            if (yVar.mo18406c() != C2984u.POST) {
                if (yVar.mo18406c() != C2984u.PUT) {
                    this.f7114a.connect();
                    return m6624b();
                }
            }
            this.f7114a.setRequestMethod(yVar.mo18406c().f7269e);
            this.f7114a.setDoInput(true);
            this.f7114a.setDoOutput(true);
            byte[] e = yVar.mo18395e();
            this.f7114a.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(e != null ? e.length : 0));
            this.f7114a.setRequestProperty("Content-Type", yVar.mo18396f());
            this.f7114a.connect();
            OutputStream outputStream = this.f7114a.getOutputStream();
            outputStream.write(e);
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
            return m6624b();
        } catch (MalformedURLException e2) {
            IAlog.m9032a("failed creating request URL", (Throwable) e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m9032a("failed executing network request", (Throwable) e3, new Object[0]);
            throw new C2951b((Throwable) e3);
        }
    }
}
