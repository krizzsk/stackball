package com.tapjoy.internal;

import android.graphics.Bitmap;
import com.tapjoy.internal.C9071ap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.tapjoy.internal.hx */
public final class C9396hx {

    /* renamed from: e */
    public static final C9093bi f23294e = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            return new C9396hx(bnVar);
        }
    };

    /* renamed from: f */
    private static final C9069an f23295f;

    /* renamed from: a */
    public URL f23296a;

    /* renamed from: b */
    public Bitmap f23297b;

    /* renamed from: c */
    public byte[] f23298c;

    /* renamed from: d */
    public C9409ie f23299d;

    static {
        C9069an arVar = new C9074ar();
        if (!(arVar instanceof C9075as)) {
            arVar = new C9071ap.C9072a((C9073aq) arVar);
        }
        f23295f = arVar;
    }

    public C9396hx(URL url) {
        this.f23296a = url;
    }

    /* renamed from: a */
    public final boolean mo58329a() {
        return (this.f23297b == null && this.f23298c == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58330b() {
        /*
            r14 = this;
            com.tapjoy.internal.fy r0 = com.tapjoy.internal.C9300ga.m24930b()
            java.lang.String r1 = "mm_external_cache_enabled"
            r2 = 1
            boolean r0 = r0.mo58209a(r1, r2)
            r1 = r0 ^ 1
            if (r1 == 0) goto L_0x001e
            com.tapjoy.internal.an r2 = f23295f
            java.net.URL r3 = r14.f23296a
            java.lang.Object r2 = r2.mo57770a(r3)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r14.f23297b = r2
            if (r2 == 0) goto L_0x001e
            return
        L_0x001e:
            if (r0 == 0) goto L_0x005f
            com.tapjoy.internal.ht r2 = com.tapjoy.internal.C9386ht.f23261a
            java.net.URL r3 = r14.f23296a
            java.io.File r2 = r2.mo58320a((java.net.URL) r3)
            if (r2 == 0) goto L_0x005f
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r14.m25229a(r4)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            com.tapjoy.internal.C9476jz.m25460a(r4)
            goto L_0x0044
        L_0x0037:
            r0 = move-exception
            r3 = r4
            goto L_0x003d
        L_0x003a:
            r3 = r4
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            com.tapjoy.internal.C9476jz.m25460a(r3)
            throw r0
        L_0x0041:
            com.tapjoy.internal.C9476jz.m25460a(r3)
        L_0x0044:
            android.graphics.Bitmap r3 = r14.f23297b
            if (r3 != 0) goto L_0x0051
            byte[] r3 = r14.f23298c
            if (r3 == 0) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            r2.delete()
            goto L_0x005f
        L_0x0051:
            if (r1 == 0) goto L_0x005e
            android.graphics.Bitmap r0 = r14.f23297b
            if (r0 == 0) goto L_0x005e
            com.tapjoy.internal.an r1 = f23295f
            java.net.URL r2 = r14.f23296a
            r1.mo57771a(r2, r0)
        L_0x005e:
            return
        L_0x005f:
            java.net.URL r2 = r14.f23296a
            java.net.URLConnection r2 = com.tapjoy.internal.C9272fj.m24875a(r2)
            r3 = 0
            java.lang.String r5 = "Cache-Control"
            java.lang.String r5 = r2.getHeaderField(r5)
            boolean r6 = com.tapjoy.internal.C9465jq.m25449c(r5)
            if (r6 != 0) goto L_0x0099
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r7 = 0
        L_0x007b:
            if (r7 >= r6) goto L_0x0099
            r8 = r5[r7]
            java.lang.String r8 = r8.trim()
            java.lang.String r9 = "max-age="
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0096
            r5 = 8
            java.lang.String r5 = r8.substring(r5)
            long r3 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0099 }
            goto L_0x0099
        L_0x0096:
            int r7 = r7 + 1
            goto L_0x007b
        L_0x0099:
            r12 = r3
            java.io.InputStream r2 = r2.getInputStream()
            java.io.ByteArrayInputStream r11 = r14.m25229a(r2)
            com.tapjoy.internal.C9476jz.m25460a(r2)
            com.tapjoy.internal.ht r2 = com.tapjoy.internal.C9386ht.f23261a
            boolean r2 = com.tapjoy.internal.C9386ht.m25212a((long) r12)
            if (r2 == 0) goto L_0x00ca
            if (r0 == 0) goto L_0x00ca
            android.graphics.Bitmap r0 = r14.f23297b
            if (r0 != 0) goto L_0x00b7
            byte[] r0 = r14.f23298c
            if (r0 == 0) goto L_0x00ca
        L_0x00b7:
            com.tapjoy.internal.ht r9 = com.tapjoy.internal.C9386ht.f23261a
            java.net.URL r10 = r14.f23296a
            android.content.Context r0 = r9.f23262b
            if (r0 == 0) goto L_0x00ca
            java.util.concurrent.ExecutorService r0 = r9.f23265e
            com.tapjoy.internal.ht$2 r2 = new com.tapjoy.internal.ht$2
            r8 = r2
            r8.<init>(r10, r11, r12)
            r0.submit(r2)
        L_0x00ca:
            if (r1 == 0) goto L_0x00d7
            android.graphics.Bitmap r0 = r14.f23297b
            if (r0 == 0) goto L_0x00d7
            com.tapjoy.internal.an r1 = f23295f
            java.net.URL r2 = r14.f23296a
            r1.mo57771a(r2, r0)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9396hx.mo58330b():void");
    }

    /* renamed from: a */
    private ByteArrayInputStream m25229a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C9474jx.m25457a(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        C9410if ifVar = new C9410if();
        ifVar.mo58341a(byteArray);
        C9409ie a = ifVar.mo58340a();
        if (a.f23363b == 0) {
            this.f23298c = byteArray;
            this.f23299d = a;
        } else {
            C9498s sVar = C9498s.f23602a;
            this.f23297b = C9498s.m25534a((InputStream) byteArrayInputStream);
            byteArrayInputStream.reset();
        }
        return byteArrayInputStream;
    }

    C9396hx(C9101bn bnVar) {
        if (bnVar.mo57871k() == C9110bs.STRING) {
            this.f23296a = bnVar.mo57861e();
            return;
        }
        bnVar.mo57868h();
        String l = bnVar.mo57872l();
        while (bnVar.mo57870j()) {
            if ("url".equals(l)) {
                this.f23296a = bnVar.mo57861e();
            } else {
                bnVar.mo57879s();
            }
        }
        bnVar.mo57869i();
    }
}
