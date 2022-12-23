package com.fyber.inneractive.sdk.p049h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.C3618aa;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.h.ag */
public final class C2943ag extends C2937ab<C2944a> {

    /* renamed from: a */
    private final String f7084a;

    /* renamed from: g */
    public final boolean mo18407g() {
        return false;
    }

    /* renamed from: h */
    public final int mo18408h() {
        return 0;
    }

    public C2943ag(C2977r<C2944a> rVar, String str) {
        super(rVar, new C2957f());
        this.f7084a = str;
    }

    /* renamed from: c */
    public final C2984u mo18406c() {
        return C2984u.GET;
    }

    /* renamed from: k */
    public final String mo18409k() {
        return this.f7084a;
    }

    /* renamed from: a */
    public final C2986w<C2944a> mo18405a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        List list;
        C2987x xVar = new C2987x();
        T aVar = new C2944a();
        if (inputStream != null) {
            Bitmap bitmap = null;
            if (map != null) {
                try {
                    list = map.get(HttpHeaders.CONTENT_LENGTH);
                } catch (Exception e) {
                    IAlog.m9035c("SimpleImageLoader: Exception on load image %s %s", e.getMessage(), e.toString());
                    aVar.f7086b = e.getMessage();
                } catch (OutOfMemoryError e2) {
                    IAlog.m9035c("SimpleImageLoader: OutOfMemoryError on load image %s", e2.getMessage());
                    if (aVar.f7085a != null) {
                        aVar.f7085a.recycle();
                    }
                    aVar.f7086b = e2.getMessage();
                }
            } else {
                list = null;
            }
            int i2 = -1;
            if (list != null) {
                i2 = C3670q.m9151a((String) list.get(0), -1);
            }
            AtomicInteger atomicInteger = new AtomicInteger(0);
            Bitmap decodeStream = BitmapFactory.decodeStream(new BufferedInputStream(inputStream, atomicInteger) {

                /* renamed from: a */
                final /* synthetic */ AtomicInteger f9877a;

                {
                    this.f9877a = r2;
                }

                public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
                    int read;
                    read = super.read(bArr, i, i2);
                    if (read != -1) {
                        this.f9877a.getAndAdd(read);
                    }
                    return read;
                }

                public final synchronized long skip(long j) throws IOException {
                    long skip;
                    skip = super.skip(j);
                    this.f9877a.addAndGet((int) skip);
                    return skip;
                }

                public final synchronized void reset() throws IOException {
                    this.f9877a.set(0);
                    super.reset();
                }
            });
            if (atomicInteger.get() == i2) {
                bitmap = decodeStream;
            }
            if (bitmap != null) {
                if (C3618aa.m9042a(bitmap)) {
                    aVar.f7085a = bitmap;
                    IAlog.m9034b("SimpleImageLoader: Got a valid bitmap %s", this.f7084a);
                }
            }
            IAlog.m9034b("SimpleImageLoader: Got an invalid bitmap", new Object[0]);
            aVar.f7086b = "Got an invalid bitmap";
        }
        xVar.f7270a = aVar;
        return xVar;
    }

    /* renamed from: m */
    public final int mo18410m() {
        return C2945ah.f7088b;
    }

    /* renamed from: com.fyber.inneractive.sdk.h.ag$a */
    public static class C2944a {

        /* renamed from: a */
        public Bitmap f7085a = null;

        /* renamed from: b */
        public String f7086b = null;

        C2944a() {
        }
    }
}
