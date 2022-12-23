package com.flurry.sdk;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.flurry.sdk.et */
public class C2628et {

    /* renamed from: b */
    private static final String f6174b = C2628et.class.getCanonicalName();

    /* renamed from: c */
    private static final char[] f6175c = {'F', 'C', 'B', 'M'};

    /* renamed from: d */
    private static final String f6176d = new String(f6175c);

    /* renamed from: e */
    private static final int f6177e;

    /* renamed from: f */
    private static final int f6178f;

    /* renamed from: g */
    private static final int f6179g;

    /* renamed from: h */
    private static final int f6180h;

    /* renamed from: a */
    public ByteBuffer f6181a;

    /* renamed from: i */
    private short f6182i;

    /* renamed from: j */
    private boolean f6183j;

    /* renamed from: b */
    public static int m5722b() {
        return 1;
    }

    static {
        char[] cArr = f6175c;
        f6177e = (cArr.length * 2) + 2 + 1 + 105984;
        int length = cArr.length * 2;
        f6178f = length;
        int i = length + 2;
        f6179g = i;
        f6180h = i + 1;
    }

    public C2628et() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f6177e);
        this.f6181a = allocateDirect;
        allocateDirect.asCharBuffer().put(f6175c);
    }

    public C2628et(File file) {
        int i;
        boolean z = true;
        C2530db.m5474a(3, f6174b, String.format(Locale.getDefault(), "Loading crash breadcrumbs from %s", new Object[]{file.getAbsolutePath()}));
        this.f6181a = ByteBuffer.allocate(f6177e);
        if (file.length() != ((long) this.f6181a.capacity())) {
            C2530db.m5474a(6, f6174b, String.format(Locale.getDefault(), "Crash breadcrumbs invalid file length %s != %s", new Object[]{Long.valueOf(file.length()), Integer.valueOf(this.f6181a.capacity())}));
            this.f6181a = null;
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            try {
                i = channel.read(this.f6181a);
            } catch (IOException unused) {
                C2530db.m5474a(6, f6174b, "Issue reading breadcrumbs from file.");
                i = 0;
            }
            C2619em.m5698a((Closeable) channel);
            C2619em.m5698a((Closeable) fileInputStream);
            if (i != this.f6181a.capacity()) {
                C2530db.m5474a(6, f6174b, String.format(Locale.getDefault(), "YCrashBreadcrumbs unexpected read size %s != %s", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f6181a.capacity())}));
                this.f6181a = null;
                return;
            }
            this.f6181a.position(0);
            String obj = this.f6181a.asCharBuffer().limit(f6175c.length).toString();
            if (!obj.equals(f6176d)) {
                C2530db.m5474a(6, f6174b, String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid magic string: '%s'", new Object[]{obj}));
                this.f6181a = null;
                return;
            }
            short s = this.f6181a.getShort(f6178f);
            this.f6182i = s;
            if (s < 0 || s >= 207) {
                C2530db.m5474a(6, f6174b, String.format(Locale.getDefault(), "YCrashBreadcrumbs invalid index: '%s'", new Object[]{Short.valueOf(this.f6182i)}));
                this.f6181a = null;
                return;
            }
            this.f6183j = this.f6181a.get(f6179g) != 1 ? false : z;
        } catch (FileNotFoundException unused2) {
            C2530db.m5474a(6, f6174b, "Issue reading breadcrumbs file.");
            this.f6181a = null;
        }
    }

    /* renamed from: a */
    private C2627es m5721a(int i) {
        this.f6181a.position(f6180h + (i * 512));
        return new C2627es(this.f6181a.asCharBuffer().limit(this.f6181a.getInt()).toString(), this.f6181a.getLong());
    }

    /* renamed from: a */
    public final List<C2627es> mo17829a() {
        ArrayList arrayList = new ArrayList();
        if (this.f6181a == null) {
            return arrayList;
        }
        if (this.f6183j) {
            for (int i = this.f6182i; i < 207; i++) {
                arrayList.add(m5721a(i));
            }
        }
        for (int i2 = 0; i2 < this.f6182i; i2++) {
            arrayList.add(m5721a(i2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo17830a(C2627es esVar) {
        String str = esVar.f6172a;
        if (TextUtils.isEmpty(str)) {
            C2530db.m5482b(f6174b, "Breadcrumb may not be null or empty.");
            return;
        }
        long j = esVar.f6173b;
        int min = Math.min(str.length(), 250);
        this.f6181a.position((this.f6182i * 512) + f6180h);
        this.f6181a.putLong(j);
        this.f6181a.putInt(min);
        byte b = 0;
        this.f6181a.asCharBuffer().put(str, 0, min);
        short s = (short) (this.f6182i + 1);
        this.f6182i = s;
        if (s >= 207) {
            this.f6182i = 0;
            this.f6183j = true;
        }
        this.f6181a.putShort(f6178f, this.f6182i);
        ByteBuffer byteBuffer = this.f6181a;
        int i = f6179g;
        if (this.f6183j) {
            b = 1;
        }
        byteBuffer.put(i, b);
    }

    public synchronized String toString() {
        short s;
        StringBuilder sb;
        if (this.f6181a == null) {
            s = 0;
        } else {
            s = this.f6183j ? 207 : this.f6182i;
        }
        sb = new StringBuilder();
        sb.append("Total number of breadcrumbs: " + s + "\n");
        for (C2627es esVar : mo17829a()) {
            sb.append(esVar.toString());
        }
        return sb.toString();
    }
}
