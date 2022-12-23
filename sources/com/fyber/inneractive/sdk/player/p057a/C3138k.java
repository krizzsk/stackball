package com.fyber.inneractive.sdk.player.p057a;

import com.fyber.inneractive.sdk.util.C3645c;
import com.fyber.inneractive.sdk.util.C3669p;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: com.fyber.inneractive.sdk.player.a.k */
final class C3138k implements Closeable {

    /* renamed from: a */
    final Executor f7746a;

    /* renamed from: b */
    private final Socket f7747b;

    /* renamed from: c */
    private final C3119f f7748c;

    /* renamed from: d */
    private InputStream f7749d;

    /* renamed from: e */
    private OutputStream f7750e;

    /* renamed from: f */
    private C3103a f7751f;

    /* renamed from: g */
    private int f7752g = 0;

    /* renamed from: h */
    private int f7753h = -1;

    /* renamed from: i */
    private boolean f7754i = false;

    /* renamed from: j */
    private boolean f7755j = false;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3138k(com.fyber.inneractive.sdk.player.p057a.C3119f r3, java.net.Socket r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f7752g = r0
            r1 = -1
            r2.f7753h = r1
            r2.f7754i = r0
            r2.f7755j = r0
            r2.f7747b = r4
            r2.f7748c = r3
            java.util.concurrent.Executor r3 = r3.f7698g
            r2.f7746a = r3
            java.net.Socket r3 = r2.f7747b     // Catch:{ SocketException -> 0x001a }
            r3.setKeepAlive(r0)     // Catch:{ SocketException -> 0x001a }
        L_0x001a:
            java.net.Socket r3 = r2.f7747b     // Catch:{ SocketException -> 0x0021 }
            r4 = 2500(0x9c4, float:3.503E-42)
            r3.setSoTimeout(r4)     // Catch:{ SocketException -> 0x0021 }
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3138k.<init>(com.fyber.inneractive.sdk.player.a.f, java.net.Socket):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7406a() throws java.io.IOException {
        /*
            r10 = this;
            java.net.Socket r0 = r10.f7747b
            java.io.InputStream r0 = r0.getInputStream()
            r10.f7749d = r0
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.net.Socket r1 = r10.f7747b
            java.io.OutputStream r1 = r1.getOutputStream()
            r0.<init>(r1)
            r10.f7750e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r3 = r10.f7749d
            r2.<init>(r3)
            r1.<init>(r2)
            r2 = 1
        L_0x0027:
            r3 = 1
        L_0x0028:
            r4 = 0
            if (r3 == 0) goto L_0x004c
            java.lang.String r3 = r1.readLine()
            r0.add(r3)
            if (r3 == 0) goto L_0x003d
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r3
            java.lang.String r6 = "StreamingHandler lineReader - %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r6, r5)
        L_0x003d:
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.trim()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x004a
            goto L_0x0027
        L_0x004a:
            r3 = 0
            goto L_0x0028
        L_0x004c:
            int r1 = r0.size()
            if (r1 != r2) goto L_0x005a
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0088
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x006c
            java.lang.String[] r3 = new java.lang.String[r4]
            goto L_0x0076
        L_0x006c:
            java.lang.String r3 = r3.trim()
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)
        L_0x0076:
            int r5 = r3.length
            r6 = 3
            if (r5 != r6) goto L_0x0088
            r3 = r3[r2]
            com.fyber.inneractive.sdk.player.a.f r5 = r10.f7748c
            com.fyber.inneractive.sdk.player.a.a r3 = r5.mo18710a((java.lang.String) r3)
            if (r3 == 0) goto L_0x0088
            r10.f7751f = r3
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            int r5 = r0.size()
            if (r5 <= r2) goto L_0x00d5
            com.fyber.inneractive.sdk.player.a.a r5 = r10.f7751f
            if (r5 == 0) goto L_0x00d5
            java.lang.String r5 = "[Rr]{1}ange:{1}\\s*bytes=(\\d*)-"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r6 = 1
        L_0x009a:
            int r7 = r0.size()
            int r7 = r7 - r2
            if (r6 >= r7) goto L_0x00d5
            java.lang.Object r7 = r0.get(r6)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.util.regex.Matcher r7 = r5.matcher(r7)
            boolean r8 = r7.matches()
            if (r8 == 0) goto L_0x00d2
            java.lang.String r7 = r7.group(r2)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r7
            java.lang.String r9 = "StreamingHandler Found start range of %s"
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r9, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00d2
            boolean r8 = android.text.TextUtils.isDigitsOnly(r7)
            if (r8 == 0) goto L_0x00d2
            int r7 = java.lang.Integer.parseInt(r7)
            r10.f7752g = r7
            r10.f7755j = r2
        L_0x00d2:
            int r6 = r6 + 1
            goto L_0x009a
        L_0x00d5:
            if (r1 != 0) goto L_0x01a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.fyber.inneractive.sdk.player.a.a r1 = r10.f7751f
            if (r1 == 0) goto L_0x0170
            boolean r1 = r10.f7755j
            if (r1 == 0) goto L_0x00e7
            java.lang.String r1 = "HTTP/1.1 206 PARTIAL CONTENT\n"
            goto L_0x00e9
        L_0x00e7:
            java.lang.String r1 = "HTTP/1.1 200 OK\n"
        L_0x00e9:
            r0.append(r1)
            com.fyber.inneractive.sdk.player.a.a r1 = r10.f7751f
            boolean r1 = r1.f7626c
            if (r1 == 0) goto L_0x00fb
            com.fyber.inneractive.sdk.player.a.a r1 = r10.f7751f
            java.lang.String r5 = "http.file.length"
            java.lang.String r1 = r1.mo18673a((java.lang.String) r5)
            goto L_0x0109
        L_0x00fb:
            com.fyber.inneractive.sdk.player.a.a r1 = r10.f7751f
            java.io.File r1 = r1.mo18672a()
            long r5 = r1.length()
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L_0x0109:
            java.lang.String r5 = "Connection: close\n"
            r0.append(r5)
            java.lang.String r5 = "Accept-Ranges: bytes\n"
            r0.append(r5)
            java.lang.String r5 = "Cache-Control: no-cache, no-store, must-revalidate\n"
            r0.append(r5)
            java.lang.String r5 = "Server: StreamingHandler/1.0\n"
            r0.append(r5)
            if (r1 == 0) goto L_0x015e
            int r5 = java.lang.Integer.parseInt(r1)
            boolean r6 = r10.f7755j
            java.lang.String r7 = "Content-Length: "
            java.lang.String r8 = "\n"
            if (r6 == 0) goto L_0x0155
            r0.append(r7)
            int r6 = r10.f7752g
            int r5 = r5 - r6
            r0.append(r5)
            r0.append(r8)
            java.lang.String r5 = "Content-Range: bytes "
            r0.append(r5)
            int r5 = r10.f7752g
            r0.append(r5)
            java.lang.String r5 = "-"
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = "/"
            r0.append(r5)
            r0.append(r1)
            r0.append(r8)
            goto L_0x015e
        L_0x0155:
            r0.append(r7)
            r0.append(r1)
            r0.append(r8)
        L_0x015e:
            java.lang.String r1 = "Content-Type: "
            r0.append(r1)
            com.fyber.inneractive.sdk.player.a.a r1 = r10.f7751f
            java.lang.String r1 = r1.f7627d
            r0.append(r1)
            java.lang.String r1 = "\n\n"
            r0.append(r1)
            goto L_0x0175
        L_0x0170:
            java.lang.String r1 = "HTTP/1.1 404 Not Found\n\nContent-Type: text/html; charset=UTF-8\nContent-Length: 2\n\n{}"
            r0.append(r1)
        L_0x0175:
            com.fyber.inneractive.sdk.player.a.a r1 = r10.f7751f
            if (r1 == 0) goto L_0x017f
            boolean r1 = r1.f7626c
            if (r1 == 0) goto L_0x017f
            r1 = 1
            goto L_0x0180
        L_0x017f:
            r1 = 0
        L_0x0180:
            r10.f7754i = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = r0.toString()
            r1[r4] = r2
            java.lang.String r2 = "StreamingHandler replying with %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r2, r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "US-ASCII"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            byte[] r0 = r0.getBytes(r1)
            java.io.OutputStream r1 = r10.f7750e     // Catch:{ IOException -> 0x01a7 }
            r1.write(r0)     // Catch:{ IOException -> 0x01a7 }
            java.io.OutputStream r0 = r10.f7750e     // Catch:{ IOException -> 0x01a7 }
            r0.flush()     // Catch:{ IOException -> 0x01a7 }
        L_0x01a7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3138k.m7406a():boolean");
    }

    /* renamed from: a */
    private void m7404a(int i, int i2) throws IOException {
        IAlog.m9033a("StreamingHandler serveContent from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this.f7751f.f7628e) {
            FileInputStream fileInputStream = new FileInputStream(this.f7751f.mo18672a());
            ByteBuffer b = C3645c.m9069a().mo19569b();
            try {
                C3645c.m9069a();
                byte[] b2 = C3645c.m9070b(b);
                if (i > 0) {
                    fileInputStream.skip((long) i);
                }
                int i3 = i2 - i;
                int min = Math.min(b2.length, i3);
                int i4 = 0;
                do {
                    int read = fileInputStream.read(b2, 0, min);
                    if (read == -1) {
                        break;
                    }
                    this.f7750e.write(b2, 0, read);
                    i4 += read;
                    i3 -= read;
                    min = Math.min(b2.length, i3);
                } while (min != 0);
                IAlog.m9033a("StreamingHandler wrote %d to socket", Integer.valueOf(i4));
                C3645c.m9069a().mo19568a(b);
                C3142m.m7409a((Closeable) fileInputStream);
                IAlog.m9033a("StreamingHandler servedContent from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
            } catch (SocketException e) {
                throw e;
            } catch (Throwable th) {
                C3645c.m9069a().mo19568a(b);
                C3142m.m7409a((Closeable) fileInputStream);
                IAlog.m9033a("StreamingHandler servedContent from %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
                throw th;
            }
        }
    }

    public final void close() throws IOException {
        IAlog.m9034b("StreamingHandler closing socket connection", new Object[0]);
        C3142m.m7409a((Closeable) this.f7750e);
        C3142m.m7409a((Closeable) this.f7749d);
        C3142m.m7411a(this.f7747b);
        C3119f fVar = this.f7748c;
        if (fVar != null) {
            fVar.f7699h.remove(this);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7405a(C3138k kVar) throws Throwable {
        int i;
        int i2;
        if (kVar.m7406a()) {
            String a = kVar.f7751f.f7626c ? kVar.f7751f.mo18673a("http.file.length") : String.valueOf(kVar.f7751f.mo18672a().length());
            if (a == null) {
                i = -1;
            } else {
                i = Integer.parseInt(a);
            }
            if (a == null) {
                i2 = -1;
            } else {
                i2 = Integer.parseInt(a);
            }
            if (kVar.f7754i) {
                int length = (int) kVar.f7751f.mo18672a().length();
                kVar.f7753h = length;
                int i3 = kVar.f7752g;
                if (i3 > length) {
                    C3669p.m9148a(kVar.f7751f.f7625b, i3, kVar.f7750e);
                    IAlog.m9034b("StreamingHandler flushing, http serve", new Object[0]);
                    kVar.f7750e.flush();
                    kVar.close();
                    return;
                }
                do {
                    kVar.m7404a(kVar.f7752g, kVar.f7753h);
                    if (i2 == -1) {
                        if (!kVar.f7751f.f7626c) {
                            i2 = (int) kVar.f7751f.mo18672a().length();
                        }
                    } else if (!kVar.f7751f.f7626c && kVar.f7753h >= i2 - 1) {
                        IAlog.m9033a("StreamingHandler[%s] end range exceeds total, dieing", kVar);
                        kVar.f7750e.flush();
                        kVar.close();
                        return;
                    }
                    kVar.f7752g = kVar.f7753h;
                    kVar.f7753h = (int) kVar.f7751f.mo18672a().length();
                    while (true) {
                        if (kVar.f7752g < kVar.f7753h) {
                            break;
                        }
                        kVar.f7753h = (int) kVar.f7751f.mo18672a().length();
                        try {
                            Thread.sleep(0, 10);
                        } catch (Exception unused) {
                        }
                        int i4 = kVar.f7752g;
                        int i5 = kVar.f7753h;
                        if (i4 == i5 && i5 == i) {
                            IAlog.m9034b("StreamingHandler flushing, range has reached fSize", new Object[0]);
                            kVar.f7750e.flush();
                            kVar.close();
                            break;
                        }
                    }
                } while (kVar.f7747b.isConnected());
                IAlog.m9033a("StreamingHandler[%s] socket is not connected, dieing", kVar);
                return;
            }
            kVar.m7404a(kVar.f7752g, i2);
            IAlog.m9034b("StreamingHandler flushing, vanilla serve", new Object[0]);
            kVar.f7750e.flush();
            kVar.close();
        }
    }
}
