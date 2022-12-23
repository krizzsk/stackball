package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3480a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3536b;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3552o;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.i */
final class C3492i {

    /* renamed from: a */
    final HashMap<String, C3491h> f9462a = new HashMap<>();

    /* renamed from: b */
    final SparseArray<String> f9463b = new SparseArray<>();

    /* renamed from: c */
    final C3536b f9464c;

    /* renamed from: d */
    boolean f9465d;

    /* renamed from: e */
    private final Cipher f9466e = null;

    /* renamed from: f */
    private final SecretKeySpec f9467f = null;

    /* renamed from: g */
    private C3552o f9468g;

    public C3492i(File file) {
        this.f9464c = new C3536b(new File(file, CachedContentIndex.FILE_NAME));
    }

    /* renamed from: a */
    public final void mo19331a() throws C3480a.C3481a {
        if (this.f9465d) {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream a = this.f9464c.mo19363a();
                if (this.f9468g == null) {
                    this.f9468g = new C3552o(a);
                } else {
                    this.f9468g.mo19414a(a);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.f9468g);
                try {
                    dataOutputStream2.writeInt(1);
                    dataOutputStream2.writeInt(this.f9466e != null ? 1 : 0);
                    if (this.f9466e != null) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            this.f9466e.init(1, this.f9467f, new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f9468g, this.f9466e));
                        } catch (InvalidKeyException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(this.f9462a.size());
                    int i = 0;
                    for (C3491h next : this.f9462a.values()) {
                        dataOutputStream2.writeInt(next.f9458a);
                        dataOutputStream2.writeUTF(next.f9459b);
                        dataOutputStream2.writeLong(next.f9461d);
                        i += next.mo19328a();
                    }
                    dataOutputStream2.writeInt(i);
                    C3536b bVar = this.f9464c;
                    dataOutputStream2.close();
                    bVar.f9587b.delete();
                    C3560t.m8881a((Closeable) null);
                    this.f9465d = false;
                } catch (IOException e3) {
                    DataOutputStream dataOutputStream3 = dataOutputStream2;
                    e = e3;
                    dataOutputStream = dataOutputStream3;
                    try {
                        throw new C3480a.C3481a(e);
                    } catch (Throwable th) {
                        th = th;
                        C3560t.m8881a((Closeable) dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    DataOutputStream dataOutputStream4 = dataOutputStream2;
                    th = th2;
                    dataOutputStream = dataOutputStream4;
                    C3560t.m8881a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                throw new C3480a.C3481a(e);
            }
        }
    }

    /* renamed from: a */
    public final C3491h mo19329a(String str) {
        C3491h hVar = this.f9462a.get(str);
        return hVar == null ? mo19330a(str, -1) : hVar;
    }

    /* renamed from: b */
    public final C3491h mo19332b(String str) {
        return this.f9462a.get(str);
    }

    /* renamed from: c */
    public final int mo19334c(String str) {
        return mo19329a(str).f9458a;
    }

    /* renamed from: d */
    public final void mo19336d(String str) {
        C3491h remove = this.f9462a.remove(str);
        if (remove != null) {
            C3535a.m8784b(remove.f9460c.isEmpty());
            this.f9463b.remove(remove.f9458a);
            this.f9465d = true;
        }
    }

    /* renamed from: b */
    public final void mo19333b() {
        LinkedList linkedList = new LinkedList();
        for (C3491h next : this.f9462a.values()) {
            if (next.f9460c.isEmpty()) {
                linkedList.add(next.f9459b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            mo19336d((String) it.next());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19335c() {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            com.fyber.inneractive.sdk.player.c.k.b r3 = r8.f9464c     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            java.io.File r4 = r3.f9587b     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            boolean r4 = r4.exists()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            if (r4 == 0) goto L_0x001a
            java.io.File r4 = r3.f9586a     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r4.delete()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            java.io.File r4 = r3.f9587b     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            java.io.File r5 = r3.f9586a     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r4.renameTo(r5)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
        L_0x001a:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            java.io.File r3 = r3.f9586a     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            r4 = 1
            if (r1 == r4) goto L_0x0034
            com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8881a((java.io.Closeable) r3)
            return r0
        L_0x0034:
            int r1 = r3.readInt()     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            r1 = r1 & r4
            if (r1 == 0) goto L_0x006d
            javax.crypto.Cipher r1 = r8.f9466e     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            if (r1 != 0) goto L_0x0043
            com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8881a((java.io.Closeable) r3)
            return r0
        L_0x0043:
            r1 = 16
            byte[] r1 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            r3.readFully(r1)     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            javax.crypto.Cipher r1 = r8.f9466e     // Catch:{ InvalidKeyException -> 0x0066, InvalidAlgorithmParameterException -> 0x0064 }
            r6 = 2
            javax.crypto.spec.SecretKeySpec r7 = r8.f9467f     // Catch:{ InvalidKeyException -> 0x0066, InvalidAlgorithmParameterException -> 0x0064 }
            r1.init(r6, r7, r5)     // Catch:{ InvalidKeyException -> 0x0066, InvalidAlgorithmParameterException -> 0x0064 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            javax.crypto.Cipher r6 = r8.f9466e     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            r5.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            goto L_0x0074
        L_0x0064:
            r1 = move-exception
            goto L_0x0067
        L_0x0066:
            r1 = move-exception
        L_0x0067:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            throw r2     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
        L_0x006d:
            javax.crypto.Cipher r1 = r8.f9466e     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
            if (r1 == 0) goto L_0x0073
            r8.f9465d = r4     // Catch:{ FileNotFoundException -> 0x00a2, IOException -> 0x009f, all -> 0x009c }
        L_0x0073:
            r1 = r3
        L_0x0074:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r3 = 0
            r5 = 0
        L_0x007a:
            if (r3 >= r2) goto L_0x008c
            com.fyber.inneractive.sdk.player.c.j.a.h r6 = new com.fyber.inneractive.sdk.player.c.j.a.h     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            r8.m8671a((com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3491h) r6)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            int r6 = r6.mo19328a()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L_0x007a
        L_0x008c:
            int r2 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x00a6 }
            if (r2 == r5) goto L_0x0096
            com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8881a((java.io.Closeable) r1)
            return r0
        L_0x0096:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8881a((java.io.Closeable) r1)
            return r4
        L_0x009a:
            goto L_0x00ba
        L_0x009c:
            r0 = move-exception
            r1 = r3
            goto L_0x00b4
        L_0x009f:
            r2 = move-exception
            r1 = r3
            goto L_0x00a7
        L_0x00a2:
            r1 = r3
            goto L_0x00ba
        L_0x00a4:
            r0 = move-exception
            goto L_0x00b4
        L_0x00a6:
            r2 = move-exception
        L_0x00a7:
            java.lang.String r3 = "CachedContentIndex"
            java.lang.String r4 = "Error reading cache content index file."
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x00b3
            com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8881a((java.io.Closeable) r1)
        L_0x00b3:
            return r0
        L_0x00b4:
            if (r1 == 0) goto L_0x00b9
            com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8881a((java.io.Closeable) r1)
        L_0x00b9:
            throw r0
        L_0x00ba:
            if (r1 == 0) goto L_0x00bf
            com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8881a((java.io.Closeable) r1)
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3492i.mo19335c():boolean");
    }

    /* renamed from: a */
    private void m8671a(C3491h hVar) {
        this.f9462a.put(hVar.f9459b, hVar);
        this.f9463b.put(hVar.f9458a, hVar.f9459b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3491h mo19330a(String str, long j) {
        int i;
        SparseArray<String> sparseArray = this.f9463b;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            i = i2;
        }
        C3491h hVar = new C3491h(i, str, j);
        m8671a(hVar);
        this.f9465d = true;
        return hVar;
    }
}
