package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C14593sh;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.mobile.ads.impl.zd */
class C15303zd {

    /* renamed from: a */
    private final HashMap<String, C15242yd> f43078a;

    /* renamed from: b */
    private final SparseArray<String> f43079b;

    /* renamed from: c */
    private final SparseBooleanArray f43080c;

    /* renamed from: d */
    private final SparseBooleanArray f43081d;

    /* renamed from: e */
    private C15306c f43082e;

    /* renamed from: f */
    private C15306c f43083f;

    /* renamed from: com.yandex.mobile.ads.impl.zd$b */
    private static class C15305b implements C15306c {

        /* renamed from: a */
        private final boolean f43089a;

        /* renamed from: b */
        private final Cipher f43090b;

        /* renamed from: c */
        private final SecretKeySpec f43091c;

        /* renamed from: d */
        private final Random f43092d;

        /* renamed from: e */
        private final C12576ba f43093e;

        /* renamed from: f */
        private boolean f43094f;

        /* renamed from: g */
        private m51 f43095g;

        public C15305b(File file, byte[] bArr, boolean z) {
            SecretKeySpec secretKeySpec;
            Cipher cipher;
            Random random = null;
            if (bArr != null) {
                C13479j9.m37705a(bArr.length == 16);
                try {
                    cipher = C15303zd.m44532a();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                C13479j9.m37705a(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f43089a = z;
            this.f43090b = cipher;
            this.f43091c = secretKeySpec;
            this.f43092d = z ? new Random() : random;
            this.f43093e = new C12576ba(file);
        }

        /* renamed from: a */
        public void mo71204a(long j) {
        }

        /* renamed from: a */
        public boolean mo71209a() {
            return this.f43093e.mo66024b();
        }

        /* renamed from: b */
        public void mo71210b() {
            this.f43093e.mo66022a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b4  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m44556b(java.util.HashMap<java.lang.String, com.yandex.mobile.ads.impl.C15242yd> r11, android.util.SparseArray<java.lang.String> r12) {
            /*
                r10 = this;
                com.yandex.mobile.ads.impl.ba r0 = r10.f43093e
                boolean r0 = r0.mo66024b()
                r1 = 1
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 0
                r2 = 0
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                com.yandex.mobile.ads.impl.ba r4 = r10.f43093e     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                java.io.InputStream r4 = r4.mo66025c()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                r3.<init>(r4)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                r4.<init>(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                if (r0 < 0) goto L_0x00a1
                r5 = 2
                if (r0 <= r5) goto L_0x0027
                goto L_0x00a1
            L_0x0027:
                int r6 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r6 = r6 & r1
                if (r6 == 0) goto L_0x0060
                javax.crypto.Cipher r6 = r10.f43090b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                if (r6 != 0) goto L_0x0036
                com.yandex.mobile.ads.impl.ih1.m37379a((java.io.Closeable) r4)
                return r2
            L_0x0036:
                r6 = 16
                byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r4.readFully(r6)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r7.<init>(r6)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.Cipher r6 = r10.f43090b     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                javax.crypto.spec.SecretKeySpec r8 = r10.f43091c     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                r6.init(r5, r8, r7)     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.Cipher r7 = r10.f43090b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r6.<init>(r3, r7)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r5.<init>(r6)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r4 = r5
                goto L_0x0066
            L_0x0057:
                r11 = move-exception
                goto L_0x005a
            L_0x0059:
                r11 = move-exception
            L_0x005a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r12.<init>(r11)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                throw r12     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
            L_0x0060:
                boolean r3 = r10.f43089a     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                if (r3 == 0) goto L_0x0066
                r10.f43094f = r1     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
            L_0x0066:
                int r3 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r5 = 0
                r6 = 0
            L_0x006c:
                if (r5 >= r3) goto L_0x0086
                com.yandex.mobile.ads.impl.yd r7 = r10.m44555a((int) r0, (java.io.DataInputStream) r4)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                java.lang.String r8 = r7.f42808b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r11.put(r8, r7)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r8 = r7.f42807a     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                java.lang.String r9 = r7.f42808b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r12.put(r8, r9)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r7 = r10.m44554a((com.yandex.mobile.ads.impl.C15242yd) r7, (int) r0)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r6 = r6 + r7
                int r5 = r5 + 1
                goto L_0x006c
            L_0x0086:
                int r11 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r12 = r4.read()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r0 = -1
                if (r12 != r0) goto L_0x0093
                r12 = 1
                goto L_0x0094
            L_0x0093:
                r12 = 0
            L_0x0094:
                if (r11 != r6) goto L_0x009d
                if (r12 != 0) goto L_0x0099
                goto L_0x009d
            L_0x0099:
                com.yandex.mobile.ads.impl.ih1.m37379a((java.io.Closeable) r4)
                return r1
            L_0x009d:
                com.yandex.mobile.ads.impl.ih1.m37379a((java.io.Closeable) r4)
                return r2
            L_0x00a1:
                com.yandex.mobile.ads.impl.ih1.m37379a((java.io.Closeable) r4)
                return r2
            L_0x00a5:
                r11 = move-exception
                r0 = r4
                goto L_0x00ab
            L_0x00a8:
                r0 = r4
                goto L_0x00b2
            L_0x00aa:
                r11 = move-exception
            L_0x00ab:
                if (r0 == 0) goto L_0x00b0
                com.yandex.mobile.ads.impl.ih1.m37379a((java.io.Closeable) r0)
            L_0x00b0:
                throw r11
            L_0x00b1:
            L_0x00b2:
                if (r0 == 0) goto L_0x00b7
                com.yandex.mobile.ads.impl.ih1.m37379a((java.io.Closeable) r0)
            L_0x00b7:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15303zd.C15305b.m44556b(java.util.HashMap, android.util.SparseArray):boolean");
        }

        /* renamed from: a */
        public void mo71208a(HashMap<String, C15242yd> hashMap, SparseArray<String> sparseArray) {
            C13479j9.m37708b(!this.f43094f);
            if (!m44556b(hashMap, sparseArray)) {
                hashMap.clear();
                sparseArray.clear();
                this.f43093e.mo66022a();
            }
        }

        /* renamed from: a */
        public void mo71207a(HashMap<String, C15242yd> hashMap) throws IOException {
            if (this.f43094f) {
                mo71211b(hashMap);
            }
        }

        /* renamed from: a */
        public void mo71205a(C15242yd ydVar) {
            this.f43094f = true;
        }

        /* renamed from: a */
        public void mo71206a(C15242yd ydVar, boolean z) {
            this.f43094f = true;
        }

        /* renamed from: a */
        private int m44554a(C15242yd ydVar, int i) {
            int hashCode = (ydVar.f42807a * 31) + ydVar.f42808b.hashCode();
            if (i >= 2) {
                return (hashCode * 31) + ydVar.mo71024a().hashCode();
            }
            long a = C14593sh.CC.m41975a(ydVar.mo71024a());
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }

        /* renamed from: a */
        private C15242yd m44555a(int i, DataInputStream dataInputStream) throws IOException {
            C12742ck ckVar;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                C14680th thVar = new C14680th();
                C14680th.m42345a(thVar, readLong);
                ckVar = C12742ck.f31958c.mo66312a(thVar);
            } else {
                ckVar = C15303zd.m44531a(dataInputStream);
            }
            return new C15242yd(readInt, readUTF, ckVar);
        }

        /* renamed from: b */
        public void mo71211b(HashMap<String, C15242yd> hashMap) throws IOException {
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream d = this.f43093e.mo66026d();
                m51 m51 = this.f43095g;
                if (m51 == null) {
                    this.f43095g = new m51(d);
                } else {
                    m51.mo68578a(d);
                }
                dataOutputStream = new DataOutputStream(this.f43095g);
                try {
                    dataOutputStream.writeInt(2);
                    dataOutputStream.writeInt(this.f43089a ? 1 : 0);
                    if (this.f43089a) {
                        byte[] bArr = new byte[16];
                        this.f43092d.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        this.f43090b.init(1, this.f43091c, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.f43095g, this.f43090b));
                    }
                    try {
                        dataOutputStream.writeInt(hashMap.size());
                        int i = 0;
                        for (C15242yd next : hashMap.values()) {
                            dataOutputStream.writeInt(next.f42807a);
                            dataOutputStream.writeUTF(next.f42808b);
                            C15303zd.m44533a(next.mo71024a(), dataOutputStream);
                            i += m44554a(next, 2);
                        }
                        dataOutputStream.writeInt(i);
                        this.f43093e.mo66023a(dataOutputStream);
                        int i2 = ih1.f34858a;
                        this.f43094f = false;
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream2 = dataOutputStream;
                        dataOutputStream = dataOutputStream2;
                        ih1.m37379a((Closeable) dataOutputStream);
                        throw th;
                    }
                } catch (InvalidKeyException e) {
                    e = e;
                    throw new IllegalStateException(e);
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    throw new IllegalStateException(e);
                } catch (Throwable th2) {
                    th = th2;
                    ih1.m37379a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = dataOutputStream2;
                ih1.m37379a((Closeable) dataOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zd$c */
    private interface C15306c {
        /* renamed from: a */
        void mo71204a(long j);

        /* renamed from: a */
        void mo71205a(C15242yd ydVar);

        /* renamed from: a */
        void mo71206a(C15242yd ydVar, boolean z);

        /* renamed from: a */
        void mo71207a(HashMap<String, C15242yd> hashMap) throws IOException;

        /* renamed from: a */
        void mo71208a(HashMap<String, C15242yd> hashMap, SparseArray<String> sparseArray) throws IOException;

        /* renamed from: a */
        boolean mo71209a() throws IOException;

        /* renamed from: b */
        void mo71210b() throws IOException;

        /* renamed from: b */
        void mo71211b(HashMap<String, C15242yd> hashMap) throws IOException;
    }

    public C15303zd(C13859lj ljVar, File file, byte[] bArr, boolean z, boolean z2) {
        C13479j9.m37708b((ljVar == null && file == null) ? false : true);
        this.f43078a = new HashMap<>();
        this.f43079b = new SparseArray<>();
        this.f43080c = new SparseBooleanArray();
        this.f43081d = new SparseBooleanArray();
        C15305b bVar = null;
        C15304a aVar = ljVar != null ? new C15304a(ljVar) : null;
        bVar = file != null ? new C15305b(new File(file, CachedContentIndex.FILE_NAME), bArr, z) : bVar;
        if (aVar == null || (bVar != null && z2)) {
            this.f43082e = bVar;
            this.f43083f = aVar;
            return;
        }
        this.f43082e = aVar;
        this.f43083f = bVar;
    }

    /* renamed from: a */
    public void mo71196a(long j) throws IOException {
        C15306c cVar;
        this.f43082e.mo71204a(j);
        C15306c cVar2 = this.f43083f;
        if (cVar2 != null) {
            cVar2.mo71204a(j);
        }
        if (this.f43082e.mo71209a() || (cVar = this.f43083f) == null || !cVar.mo71209a()) {
            this.f43082e.mo71208a(this.f43078a, this.f43079b);
        } else {
            this.f43083f.mo71208a(this.f43078a, this.f43079b);
            this.f43082e.mo71211b(this.f43078a);
        }
        C15306c cVar3 = this.f43083f;
        if (cVar3 != null) {
            cVar3.mo71210b();
            this.f43083f = null;
        }
    }

    /* renamed from: b */
    public C14593sh mo71198b(String str) {
        C15242yd ydVar = this.f43078a.get(str);
        return ydVar != null ? ydVar.mo71024a() : C12742ck.f31958c;
    }

    /* renamed from: c */
    public C15242yd mo71200c(String str) {
        int i;
        C15242yd ydVar = this.f43078a.get(str);
        if (ydVar != null) {
            return ydVar;
        }
        SparseArray<String> sparseArray = this.f43079b;
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
        C15242yd ydVar2 = new C15242yd(i, str, C12742ck.f31958c);
        this.f43078a.put(str, ydVar2);
        this.f43079b.put(i, str);
        this.f43081d.put(i, true);
        this.f43082e.mo71205a(ydVar2);
        return ydVar2;
    }

    /* renamed from: d */
    public void mo71202d() throws IOException {
        this.f43082e.mo71207a(this.f43078a);
        int size = this.f43080c.size();
        for (int i = 0; i < size; i++) {
            this.f43079b.remove(this.f43080c.keyAt(i));
        }
        this.f43080c.clear();
        this.f43081d.clear();
    }

    /* renamed from: com.yandex.mobile.ads.impl.zd$a */
    private static final class C15304a implements C15306c {

        /* renamed from: e */
        private static final String[] f43084e = {"id", SDKConstants.PARAM_KEY, "metadata"};

        /* renamed from: a */
        private final C13859lj f43085a;

        /* renamed from: b */
        private final SparseArray<C15242yd> f43086b = new SparseArray<>();

        /* renamed from: c */
        private String f43087c;

        /* renamed from: d */
        private String f43088d;

        public C15304a(C13859lj ljVar) {
            this.f43085a = ljVar;
        }

        /* renamed from: a */
        public void mo71204a(long j) {
            String hexString = Long.toHexString(j);
            this.f43087c = hexString;
            this.f43088d = "ExoPlayerCacheIndex" + hexString;
        }

        /* renamed from: b */
        public void mo71210b() throws C13713kj {
            SQLiteDatabase writableDatabase;
            C13859lj ljVar = this.f43085a;
            String str = this.f43087c;
            try {
                String str2 = "ExoPlayerCacheIndex" + str;
                writableDatabase = ljVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                hj1.m36996b(writableDatabase, 1, str);
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C13713kj(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }

        /* renamed from: a */
        public boolean mo71209a() throws C13713kj {
            if (hj1.m36993a(this.f43085a.getReadableDatabase(), 1, this.f43087c) != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo71208a(HashMap<String, C15242yd> hashMap, SparseArray<String> sparseArray) throws IOException {
            Cursor query;
            SQLiteDatabase writableDatabase;
            C13479j9.m37708b(this.f43086b.size() == 0);
            try {
                if (hj1.m36993a(this.f43085a.getReadableDatabase(), 1, this.f43087c) != 1) {
                    writableDatabase = this.f43085a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    m44544a(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
                query = this.f43085a.getReadableDatabase().query(this.f43088d, f43084e, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                while (query.moveToNext()) {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    hashMap.put(string, new C15242yd(i, string, C15303zd.m44531a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                }
                query.close();
                return;
            } catch (SQLiteException e) {
                hashMap.clear();
                sparseArray.clear();
                throw new C13713kj(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
            throw th;
        }

        /* renamed from: b */
        public void mo71211b(HashMap<String, C15242yd> hashMap) throws IOException {
            SQLiteDatabase writableDatabase;
            try {
                writableDatabase = this.f43085a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                m44544a(writableDatabase);
                for (C15242yd a : hashMap.values()) {
                    m44545a(writableDatabase, a);
                }
                writableDatabase.setTransactionSuccessful();
                this.f43086b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C13713kj(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo71207a(HashMap<String, C15242yd> hashMap) throws IOException {
            SQLiteDatabase writableDatabase;
            if (this.f43086b.size() != 0) {
                try {
                    writableDatabase = this.f43085a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    for (int i = 0; i < this.f43086b.size(); i++) {
                        C15242yd valueAt = this.f43086b.valueAt(i);
                        if (valueAt == null) {
                            int keyAt = this.f43086b.keyAt(i);
                            writableDatabase.delete(this.f43088d, "id = ?", new String[]{Integer.toString(keyAt)});
                        } else {
                            m44545a(writableDatabase, valueAt);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f43086b.clear();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new C13713kj(e);
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public void mo71205a(C15242yd ydVar) {
            this.f43086b.put(ydVar.f42807a, ydVar);
        }

        /* renamed from: a */
        public void mo71206a(C15242yd ydVar, boolean z) {
            if (z) {
                this.f43086b.delete(ydVar.f42807a);
            } else {
                this.f43086b.put(ydVar.f42807a, (Object) null);
            }
        }

        /* renamed from: a */
        private void m44544a(SQLiteDatabase sQLiteDatabase) throws C13713kj {
            hj1.m36994a(sQLiteDatabase, 1, this.f43087c, 1);
            String str = this.f43088d;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f43088d + " " + "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        /* renamed from: a */
        private void m44545a(SQLiteDatabase sQLiteDatabase, C15242yd ydVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C15303zd.m44533a(ydVar.mo71024a(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(ydVar.f42807a));
            contentValues.put(SDKConstants.PARAM_KEY, ydVar.f42808b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow(this.f43088d, (String) null, contentValues);
        }
    }

    /* renamed from: b */
    public Collection<C15242yd> mo71199b() {
        return this.f43078a.values();
    }

    /* renamed from: d */
    public void mo71203d(String str) {
        C15242yd ydVar = this.f43078a.get(str);
        if (ydVar != null && ydVar.mo71032c() && !ydVar.mo71033d()) {
            this.f43078a.remove(str);
            int i = ydVar.f42807a;
            boolean z = this.f43081d.get(i);
            this.f43082e.mo71206a(ydVar, z);
            if (z) {
                this.f43079b.remove(i);
                this.f43081d.delete(i);
                return;
            }
            this.f43079b.put(i, (Object) null);
            this.f43080c.put(i, true);
        }
    }

    /* renamed from: c */
    public void mo71201c() {
        int size = this.f43078a.size();
        String[] strArr = new String[size];
        this.f43078a.keySet().toArray(strArr);
        for (int i = 0; i < size; i++) {
            mo71203d(strArr[i]);
        }
    }

    /* renamed from: a */
    public C15242yd mo71194a(String str) {
        return this.f43078a.get(str);
    }

    /* renamed from: a */
    public String mo71195a(int i) {
        return this.f43079b.get(i);
    }

    /* renamed from: a */
    public void mo71197a(String str, C14680th thVar) {
        C15242yd c = mo71200c(str);
        if (c.mo71029a(thVar)) {
            this.f43082e.mo71205a(c);
        }
    }

    /* renamed from: a */
    static Cipher m44532a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (ih1.f34858a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    /* renamed from: a */
    static C12742ck m44531a(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = ih1.f34863f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
                i++;
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new C12742ck(hashMap);
    }

    /* renamed from: a */
    static void m44533a(C12742ck ckVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> a = ckVar.mo66314a();
        dataOutputStream.writeInt(a.size());
        for (Map.Entry next : a) {
            dataOutputStream.writeUTF((String) next.getKey());
            byte[] bArr = (byte[]) next.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }
}
