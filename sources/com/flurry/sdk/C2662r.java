package com.flurry.sdk;

import com.flurry.sdk.C2649g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import javax.net.ssl.SSLException;

/* renamed from: com.flurry.sdk.r */
public abstract class C2662r implements Runnable {

    /* renamed from: i */
    private static final String f6260i = C2662r.class.getSimpleName();

    /* renamed from: j */
    private static ExecutorService f6261j;

    /* renamed from: a */
    protected String f6262a;

    /* renamed from: b */
    protected C2649g f6263b;

    /* renamed from: c */
    protected String f6264c;

    /* renamed from: d */
    protected String f6265d;

    /* renamed from: e */
    protected String f6266e;

    /* renamed from: f */
    protected String f6267f;

    /* renamed from: g */
    protected String f6268g;

    /* renamed from: h */
    public String f6269h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo17863a() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo17864a(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo17865b();

    /* renamed from: c */
    public boolean mo17866c() {
        return true;
    }

    /* renamed from: a */
    public static Future<?> m5794a(Runnable runnable) {
        C2530db.m5476a(f6260i, "Submit transport task.");
        if (f6261j == null) {
            f6261j = Executors.newFixedThreadPool(2, new ThreadFactory() {

                /* renamed from: a */
                int f6270a = 0;

                public final Thread newThread(Runnable runnable) {
                    StringBuilder sb = new StringBuilder("Flurry-Config-Background-");
                    int i = this.f6270a + 1;
                    this.f6270a = i;
                    sb.append(i);
                    return new Thread(runnable, sb.toString());
                }
            });
        }
        return f6261j.submit(runnable);
    }

    public void run() {
        this.f6263b = C2649g.f6211a;
        InputStream inputStream = null;
        try {
            inputStream = mo17863a();
            if (this.f6263b != C2649g.f6211a) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        C2530db.m5483b(f6260i, e.getMessage(), (Throwable) e);
                    }
                }
                mo17865b();
            } else if (inputStream == null) {
                C2530db.m5482b(f6260i, "Null InputStream");
                this.f6263b = new C2649g(C2649g.C2650a.IO, "Null InputStream");
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        C2530db.m5483b(f6260i, e2.getMessage(), (Throwable) e2);
                    }
                }
                mo17865b();
            } else {
                ReadableByteChannel newChannel = Channels.newChannel(inputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel newChannel2 = Channels.newChannel(byteArrayOutputStream);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
                while (true) {
                    if (newChannel.read(allocateDirect) < 0) {
                        if (allocateDirect.position() <= 0) {
                            break;
                        }
                    }
                    allocateDirect.flip();
                    newChannel2.write(allocateDirect);
                    allocateDirect.compact();
                }
                byteArrayOutputStream.flush();
                if (!mo17864a(byteArrayOutputStream.toString())) {
                    this.f6263b = new C2649g(C2649g.C2650a.AUTHENTICATE, "Signature Error.");
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            C2530db.m5483b(f6260i, e3.getMessage(), (Throwable) e3);
                        }
                    }
                    mo17865b();
                    return;
                }
                this.f6269h = new String(byteArrayOutputStream.toByteArray(), "utf-8");
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        C2530db.m5483b(f6260i, e4.getMessage(), (Throwable) e4);
                    }
                }
                mo17865b();
            }
        } catch (MalformedURLException e5) {
            this.f6263b = new C2649g(C2649g.C2650a.OTHER, e5.toString());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    C2530db.m5483b(f6260i, e6.getMessage(), (Throwable) e6);
                }
            }
            mo17865b();
        } catch (SSLException e7) {
            C2530db.m5477a(f6260i, e7.getMessage(), (Throwable) e7);
            this.f6263b = new C2649g(C2649g.C2650a.UNKNOWN_CERTIFICATE, e7.toString());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    C2530db.m5483b(f6260i, e8.getMessage(), (Throwable) e8);
                }
            }
            mo17865b();
        } catch (IOException e9) {
            C2530db.m5477a(f6260i, e9.getMessage(), (Throwable) e9);
            this.f6263b = new C2649g(C2649g.C2650a.IO, e9.toString());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    C2530db.m5483b(f6260i, e10.getMessage(), (Throwable) e10);
                }
            }
            mo17865b();
        } catch (Exception e11) {
            this.f6263b = new C2649g(C2649g.C2650a.OTHER, e11.toString());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    C2530db.m5483b(f6260i, e12.getMessage(), (Throwable) e12);
                }
            }
            mo17865b();
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    C2530db.m5483b(f6260i, e13.getMessage(), (Throwable) e13);
                }
            }
            mo17865b();
            throw th;
        }
    }

    /* renamed from: d */
    public final String mo17867d() {
        return this.f6264c;
    }

    /* renamed from: e */
    public final String mo17868e() {
        return this.f6265d;
    }

    /* renamed from: f */
    public final String mo17869f() {
        return this.f6267f;
    }

    /* renamed from: g */
    public final String mo17870g() {
        return this.f6268g;
    }

    /* renamed from: h */
    public final C2649g mo17871h() {
        return this.f6263b;
    }
}
