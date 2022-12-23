package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.tools.C6348l;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.mbridge.msdk.foundation.same.net.m */
/* compiled from: SocketManager */
public class C6295m {

    /* renamed from: a */
    private static final String f15630a = C6295m.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f15631b = C6348l.m16089b("DkPtYdQTLkfAW+xUhoPwLkPTHkJBDkM/Yr5T");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static int f15632c = 9377;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile AtomicInteger f15633d = new AtomicInteger(1);

    /* renamed from: e */
    private ExecutorService f15634e;

    /* renamed from: com.mbridge.msdk.foundation.same.net.m$b */
    /* compiled from: SocketManager */
    private static final class C6298b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C6295m f15642a = new C6295m();
    }

    /* renamed from: a */
    public final void mo43898a(String str) {
        f15631b = str;
    }

    /* renamed from: a */
    public final void mo43897a(int i) {
        f15632c = i;
    }

    private C6295m() {
        this.f15634e = Executors.newCachedThreadPool();
    }

    /* renamed from: a */
    public static C6295m m15932a() {
        return C6298b.f15642a;
    }

    /* renamed from: a */
    public final synchronized void mo43899a(String str, C6263e eVar) {
        this.f15634e.execute(new C6297a(str, eVar));
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.m$a */
    /* compiled from: SocketManager */
    private class C6297a implements Runnable {

        /* renamed from: b */
        private String f15636b;

        /* renamed from: c */
        private ByteBuffer f15637c;

        /* renamed from: d */
        private OutputStream f15638d;

        /* renamed from: e */
        private boolean f15639e = false;

        /* renamed from: f */
        private C6263e f15640f;

        /* renamed from: g */
        private Socket f15641g;

        C6297a(String str, C6263e eVar) {
            this.f15636b = str;
            this.f15639e = false;
            this.f15640f = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0109, code lost:
            if (r8.f15640f != null) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x010b, code lost:
            r8.f15640f.mo43798a(new com.mbridge.msdk.foundation.same.net.p172a.C6240a(2, new com.mbridge.msdk.foundation.same.net.p177f.C6272c(404, (byte[]) null, (java.util.List<com.mbridge.msdk.foundation.same.net.p174c.C6245b>) null)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x012a, code lost:
            r1 = r8.f15641g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x012c, code lost:
            if (r1 != null) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0132, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0133, code lost:
            r1.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0136, code lost:
            r8.f15640f = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0138, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0107 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                r0 = 404(0x194, float:5.66E-43)
                r1 = 2
                r2 = 0
                java.net.Socket r3 = new java.net.Socket     // Catch:{ all -> 0x0107 }
                java.lang.String r4 = com.mbridge.msdk.foundation.same.net.C6295m.f15631b     // Catch:{ all -> 0x0107 }
                int r5 = com.mbridge.msdk.foundation.same.net.C6295m.f15632c     // Catch:{ all -> 0x0107 }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x0107 }
                r8.f15641g = r3     // Catch:{ all -> 0x0107 }
                r4 = 15000(0x3a98, float:2.102E-41)
                r3.setSoTimeout(r4)     // Catch:{ all -> 0x0107 }
                java.net.Socket r3 = r8.f15641g     // Catch:{ all -> 0x0107 }
                java.io.OutputStream r3 = r3.getOutputStream()     // Catch:{ all -> 0x0107 }
                r8.f15638d = r3     // Catch:{ all -> 0x0107 }
                r3 = 8
                byte[] r4 = new byte[r3]     // Catch:{ all -> 0x0107 }
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch:{ all -> 0x0107 }
                r8.f15637c = r4     // Catch:{ all -> 0x0107 }
                java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0107 }
                r4.order(r5)     // Catch:{ all -> 0x0107 }
                java.nio.ByteBuffer r4 = r8.f15637c     // Catch:{ all -> 0x0107 }
                r5 = 1
                r4.put(r5)     // Catch:{ all -> 0x0107 }
                java.lang.String r4 = r8.f15636b     // Catch:{ all -> 0x0107 }
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0107 }
                if (r4 == 0) goto L_0x0043
                java.nio.ByteBuffer r4 = r8.f15637c     // Catch:{ all -> 0x0107 }
                r4.put(r5)     // Catch:{ all -> 0x0107 }
                goto L_0x004f
            L_0x0043:
                java.nio.ByteBuffer r4 = r8.f15637c     // Catch:{ all -> 0x0107 }
                boolean r6 = r8.f15639e     // Catch:{ all -> 0x0107 }
                if (r6 == 0) goto L_0x004b
                r6 = 3
                goto L_0x004c
            L_0x004b:
                r6 = 2
            L_0x004c:
                r4.put(r6)     // Catch:{ all -> 0x0107 }
            L_0x004f:
                java.nio.ByteBuffer r4 = r8.f15637c     // Catch:{ all -> 0x0107 }
                java.util.concurrent.atomic.AtomicInteger r6 = com.mbridge.msdk.foundation.same.net.C6295m.f15633d     // Catch:{ all -> 0x0107 }
                int r6 = r6.getAndIncrement()     // Catch:{ all -> 0x0107 }
                short r6 = (short) r6     // Catch:{ all -> 0x0107 }
                r4.putShort(r6)     // Catch:{ all -> 0x0107 }
                java.lang.String r4 = r8.f15636b     // Catch:{ all -> 0x0107 }
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0107 }
                r6 = 0
                if (r4 == 0) goto L_0x0077
                java.nio.ByteBuffer r4 = r8.f15637c     // Catch:{ all -> 0x0107 }
                r4.putInt(r6)     // Catch:{ all -> 0x0107 }
                java.io.OutputStream r4 = r8.f15638d     // Catch:{ all -> 0x0107 }
                java.nio.ByteBuffer r7 = r8.f15637c     // Catch:{ all -> 0x0107 }
                byte[] r7 = r7.array()     // Catch:{ all -> 0x0107 }
                r4.write(r7)     // Catch:{ all -> 0x0107 }
                goto L_0x0099
            L_0x0077:
                java.lang.String r4 = r8.f15636b     // Catch:{ all -> 0x0107 }
                byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x0107 }
                int r4 = r4.length     // Catch:{ all -> 0x0107 }
                java.nio.ByteBuffer r7 = r8.f15637c     // Catch:{ all -> 0x0107 }
                r7.putInt(r4)     // Catch:{ all -> 0x0107 }
                java.io.OutputStream r4 = r8.f15638d     // Catch:{ all -> 0x0107 }
                java.nio.ByteBuffer r7 = r8.f15637c     // Catch:{ all -> 0x0107 }
                byte[] r7 = r7.array()     // Catch:{ all -> 0x0107 }
                r4.write(r7)     // Catch:{ all -> 0x0107 }
                java.io.OutputStream r4 = r8.f15638d     // Catch:{ all -> 0x0107 }
                java.lang.String r7 = r8.f15636b     // Catch:{ all -> 0x0107 }
                byte[] r7 = r7.getBytes()     // Catch:{ all -> 0x0107 }
                r4.write(r7)     // Catch:{ all -> 0x0107 }
            L_0x0099:
                java.io.OutputStream r4 = r8.f15638d     // Catch:{ all -> 0x0107 }
                r4.flush()     // Catch:{ all -> 0x0107 }
                java.net.Socket r4 = r8.f15641g     // Catch:{ all -> 0x0107 }
                java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x0107 }
                byte[] r7 = new byte[r3]     // Catch:{ all -> 0x0107 }
                r4.read(r7, r6, r3)     // Catch:{ all -> 0x0107 }
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r7)     // Catch:{ all -> 0x0107 }
                r8.f15637c = r3     // Catch:{ all -> 0x0107 }
                java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x0107 }
                r3.order(r7)     // Catch:{ all -> 0x0107 }
                java.nio.ByteBuffer r3 = r8.f15637c     // Catch:{ all -> 0x0107 }
                r7 = 4
                int r3 = r3.getInt(r7)     // Catch:{ all -> 0x0107 }
                byte[] r7 = new byte[r3]     // Catch:{ all -> 0x0107 }
                r4.read(r7, r6, r3)     // Catch:{ all -> 0x0107 }
                if (r3 < r5) goto L_0x00db
                byte r3 = r7[r6]     // Catch:{ all -> 0x0107 }
                if (r3 != r5) goto L_0x00db
                com.mbridge.msdk.foundation.same.net.e r3 = r8.f15640f     // Catch:{ all -> 0x0107 }
                if (r3 == 0) goto L_0x00ee
                com.mbridge.msdk.foundation.same.net.e r3 = r8.f15640f     // Catch:{ all -> 0x0107 }
                com.mbridge.msdk.foundation.same.net.f.c r5 = new com.mbridge.msdk.foundation.same.net.f.c     // Catch:{ all -> 0x0107 }
                r6 = 200(0xc8, float:2.8E-43)
                r5.<init>(r6, r2, r2)     // Catch:{ all -> 0x0107 }
                com.mbridge.msdk.foundation.same.net.k r5 = com.mbridge.msdk.foundation.same.net.C6293k.m15930a(r2, r5)     // Catch:{ all -> 0x0107 }
                r3.mo43799a(r5)     // Catch:{ all -> 0x0107 }
                goto L_0x00ee
            L_0x00db:
                com.mbridge.msdk.foundation.same.net.e r3 = r8.f15640f     // Catch:{ all -> 0x0107 }
                if (r3 == 0) goto L_0x00ee
                com.mbridge.msdk.foundation.same.net.e r3 = r8.f15640f     // Catch:{ all -> 0x0107 }
                com.mbridge.msdk.foundation.same.net.a.a r5 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x0107 }
                com.mbridge.msdk.foundation.same.net.f.c r6 = new com.mbridge.msdk.foundation.same.net.f.c     // Catch:{ all -> 0x0107 }
                r6.<init>(r0, r2, r2)     // Catch:{ all -> 0x0107 }
                r5.<init>(r1, r6)     // Catch:{ all -> 0x0107 }
                r3.mo43798a((com.mbridge.msdk.foundation.same.net.p172a.C6240a) r5)     // Catch:{ all -> 0x0107 }
            L_0x00ee:
                java.net.Socket r3 = r8.f15641g     // Catch:{ all -> 0x0107 }
                r3.close()     // Catch:{ all -> 0x0107 }
                r8.f15637c = r2     // Catch:{ all -> 0x0107 }
                r4.close()     // Catch:{ all -> 0x0107 }
                java.io.OutputStream r3 = r8.f15638d     // Catch:{ all -> 0x0107 }
                r3.close()     // Catch:{ all -> 0x0107 }
                java.net.Socket r0 = r8.f15641g
                if (r0 == 0) goto L_0x0126
                r0.close()     // Catch:{ IOException -> 0x0105 }
                goto L_0x0126
            L_0x0105:
                r0 = move-exception
                goto L_0x0123
            L_0x0107:
                com.mbridge.msdk.foundation.same.net.e r3 = r8.f15640f     // Catch:{ all -> 0x0129 }
                if (r3 == 0) goto L_0x011a
                com.mbridge.msdk.foundation.same.net.e r3 = r8.f15640f     // Catch:{ all -> 0x0129 }
                com.mbridge.msdk.foundation.same.net.a.a r4 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x0129 }
                com.mbridge.msdk.foundation.same.net.f.c r5 = new com.mbridge.msdk.foundation.same.net.f.c     // Catch:{ all -> 0x0129 }
                r5.<init>(r0, r2, r2)     // Catch:{ all -> 0x0129 }
                r4.<init>(r1, r5)     // Catch:{ all -> 0x0129 }
                r3.mo43798a((com.mbridge.msdk.foundation.same.net.p172a.C6240a) r4)     // Catch:{ all -> 0x0129 }
            L_0x011a:
                java.net.Socket r0 = r8.f15641g
                if (r0 == 0) goto L_0x0126
                r0.close()     // Catch:{ IOException -> 0x0122 }
                goto L_0x0126
            L_0x0122:
                r0 = move-exception
            L_0x0123:
                r0.printStackTrace()
            L_0x0126:
                r8.f15640f = r2
                return
            L_0x0129:
                r0 = move-exception
                java.net.Socket r1 = r8.f15641g
                if (r1 == 0) goto L_0x0136
                r1.close()     // Catch:{ IOException -> 0x0132 }
                goto L_0x0136
            L_0x0132:
                r1 = move-exception
                r1.printStackTrace()
            L_0x0136:
                r8.f15640f = r2
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.C6295m.C6297a.run():void");
        }
    }
}
