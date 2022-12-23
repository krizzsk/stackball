package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.lz0;
import com.yandex.mobile.ads.impl.qb0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

public final class nb0 implements Closeable {

    /* renamed from: D */
    public static final C14078b f37718D = new C14078b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static final e81 f37719E;

    /* renamed from: A */
    private final sb0 f37720A;

    /* renamed from: B */
    private final C14081d f37721B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Set<Integer> f37722C;

    /* renamed from: b */
    private final boolean f37723b;

    /* renamed from: c */
    private final C14079c f37724c;

    /* renamed from: d */
    private final Map<Integer, rb0> f37725d = new LinkedHashMap();

    /* renamed from: e */
    private final String f37726e;

    /* renamed from: f */
    private int f37727f;

    /* renamed from: g */
    private int f37728g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f37729h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final cd1 f37730i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final bd1 f37731j;

    /* renamed from: k */
    private final bd1 f37732k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final bd1 f37733l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final f21 f37734m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f37735n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f37736o;

    /* renamed from: p */
    private long f37737p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f37738q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f37739r;

    /* renamed from: s */
    private long f37740s;

    /* renamed from: t */
    private final e81 f37741t;

    /* renamed from: u */
    private e81 f37742u;

    /* renamed from: v */
    private long f37743v;

    /* renamed from: w */
    private long f37744w;

    /* renamed from: x */
    private long f37745x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public long f37746y;

    /* renamed from: z */
    private final Socket f37747z;

    /* renamed from: com.yandex.mobile.ads.impl.nb0$b */
    public static final class C14078b {
        private C14078b() {
        }

        public /* synthetic */ C14078b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$c */
    public static abstract class C14079c {

        /* renamed from: a */
        public static final C14079c f37757a = new C14080a();

        /* renamed from: com.yandex.mobile.ads.impl.nb0$c$a */
        public static final class C14080a extends C14079c {
            C14080a() {
            }

            /* renamed from: a */
            public void mo69012a(rb0 rb0) throws IOException {
                Intrinsics.checkNotNullParameter(rb0, "stream");
                rb0.mo69715a(o30.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo69011a(nb0 nb0, e81 e81) {
            Intrinsics.checkNotNullParameter(nb0, "connection");
            Intrinsics.checkNotNullParameter(e81, "settings");
        }

        /* renamed from: a */
        public abstract void mo69012a(rb0 rb0) throws IOException;
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$e */
    public static final class C14085e extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37768e;

        /* renamed from: f */
        final /* synthetic */ int f37769f;

        /* renamed from: g */
        final /* synthetic */ Buffer f37770g;

        /* renamed from: h */
        final /* synthetic */ int f37771h;

        /* renamed from: i */
        final /* synthetic */ boolean f37772i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14085e(String str, boolean z, nb0 nb0, int i, Buffer buffer, int i2, boolean z2) {
            super(str, z);
            this.f37768e = nb0;
            this.f37769f = i;
            this.f37770g = buffer;
            this.f37771h = i2;
            this.f37772i = z2;
        }

        /* renamed from: e */
        public long mo65736e() {
            try {
                boolean a = this.f37768e.f37734m.mo66745a(this.f37769f, this.f37770g, this.f37771h, this.f37772i);
                if (a) {
                    this.f37768e.mo68997l().mo69928a(this.f37769f, o30.CANCEL);
                }
                if (!a && !this.f37772i) {
                    return -1;
                }
                synchronized (this.f37768e) {
                    this.f37768e.f37722C.remove(Integer.valueOf(this.f37769f));
                }
                return -1;
            } catch (IOException unused) {
                return -1;
            } catch (Throwable th) {
                nb0 nb0 = this.f37768e;
                throw th;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$f */
    public static final class C14086f extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37773e;

        /* renamed from: f */
        final /* synthetic */ int f37774f;

        /* renamed from: g */
        final /* synthetic */ List f37775g;

        /* renamed from: h */
        final /* synthetic */ boolean f37776h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14086f(String str, boolean z, nb0 nb0, int i, List list, boolean z2) {
            super(str, z);
            this.f37773e = nb0;
            this.f37774f = i;
            this.f37775g = list;
            this.f37776h = z2;
        }

        /* renamed from: e */
        public long mo65736e() {
            boolean a = this.f37773e.f37734m.mo66744a(this.f37774f, this.f37775g, this.f37776h);
            if (a) {
                try {
                    this.f37773e.mo68997l().mo69928a(this.f37774f, o30.CANCEL);
                } catch (IOException unused) {
                    return -1;
                } catch (Throwable th) {
                    nb0 nb0 = this.f37773e;
                    throw th;
                }
            }
            if (!a && !this.f37776h) {
                return -1;
            }
            synchronized (this.f37773e) {
                this.f37773e.f37722C.remove(Integer.valueOf(this.f37774f));
            }
            return -1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$g */
    public static final class C14087g extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37777e;

        /* renamed from: f */
        final /* synthetic */ int f37778f;

        /* renamed from: g */
        final /* synthetic */ List f37779g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14087g(String str, boolean z, nb0 nb0, int i, List list) {
            super(str, z);
            this.f37777e = nb0;
            this.f37778f = i;
            this.f37779g = list;
        }

        /* renamed from: e */
        public long mo65736e() {
            if (!this.f37777e.f37734m.mo66743a(this.f37778f, (List<o90>) this.f37779g)) {
                return -1;
            }
            try {
                this.f37777e.mo68997l().mo69928a(this.f37778f, o30.CANCEL);
                synchronized (this.f37777e) {
                    this.f37777e.f37722C.remove(Integer.valueOf(this.f37778f));
                }
                return -1;
            } catch (IOException unused) {
                return -1;
            } catch (Throwable th) {
                nb0 nb0 = this.f37777e;
                throw th;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$h */
    public static final class C14088h extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37780e;

        /* renamed from: f */
        final /* synthetic */ int f37781f;

        /* renamed from: g */
        final /* synthetic */ o30 f37782g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14088h(String str, boolean z, nb0 nb0, int i, o30 o30) {
            super(str, z);
            this.f37780e = nb0;
            this.f37781f = i;
            this.f37782g = o30;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: e */
        public long mo65736e() {
            this.f37780e.f37734m.mo66742a(this.f37781f, this.f37782g);
            synchronized (this.f37780e) {
                try {
                    this.f37780e.f37722C.remove(Integer.valueOf(this.f37781f));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    nb0 nb0 = this.f37780e;
                    throw th;
                }
            }
            return -1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$i */
    public static final class C14089i extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37783e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14089i(String str, boolean z, nb0 nb0) {
            super(str, z);
            this.f37783e = nb0;
        }

        /* renamed from: e */
        public long mo65736e() {
            this.f37783e.mo68978a(false, 2, 0);
            return -1;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$j */
    public static final class C14090j extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37784e;

        /* renamed from: f */
        final /* synthetic */ long f37785f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14090j(String str, nb0 nb0, long j) {
            super(str, false, 2);
            this.f37784e = nb0;
            this.f37785f = j;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: e */
        public long mo65736e() {
            boolean z;
            synchronized (this.f37784e) {
                try {
                    if (this.f37784e.f37736o < this.f37784e.f37735n) {
                        z = true;
                    } else {
                        nb0 nb0 = this.f37784e;
                        nb0.f37735n = nb0.f37735n + 1;
                        z = false;
                    }
                    nb0 nb02 = this.f37784e;
                    if (z) {
                        o30 o30 = o30.PROTOCOL_ERROR;
                        nb02.mo68977a(o30, o30, (IOException) null);
                        return -1;
                    }
                    nb02.mo68978a(false, 1, 0);
                    return this.f37785f;
                } catch (Throwable th) {
                    nb0 nb03 = this.f37784e;
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$k */
    public static final class C14091k extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37786e;

        /* renamed from: f */
        final /* synthetic */ int f37787f;

        /* renamed from: g */
        final /* synthetic */ o30 f37788g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14091k(String str, boolean z, nb0 nb0, int i, o30 o30) {
            super(str, z);
            this.f37786e = nb0;
            this.f37787f = i;
            this.f37788g = o30;
        }

        /* renamed from: e */
        public long mo65736e() {
            try {
                this.f37786e.mo68980b(this.f37787f, this.f37788g);
                return -1;
            } catch (IOException e) {
                nb0 nb0 = this.f37786e;
                o30 o30 = o30.PROTOCOL_ERROR;
                nb0.mo68977a(o30, o30, e);
                return -1;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$l */
    public static final class C14092l extends xc1 {

        /* renamed from: e */
        final /* synthetic */ nb0 f37789e;

        /* renamed from: f */
        final /* synthetic */ int f37790f;

        /* renamed from: g */
        final /* synthetic */ long f37791g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14092l(String str, boolean z, nb0 nb0, int i, long j) {
            super(str, z);
            this.f37789e = nb0;
            this.f37790f = i;
            this.f37791g = j;
        }

        /* renamed from: e */
        public long mo65736e() {
            try {
                this.f37789e.mo68997l().mo69927a(this.f37790f, this.f37791g);
                return -1;
            } catch (IOException e) {
                nb0 nb0 = this.f37789e;
                o30 o30 = o30.PROTOCOL_ERROR;
                nb0.mo68977a(o30, o30, e);
                return -1;
            }
        }
    }

    static {
        e81 e81 = new e81();
        e81.mo66778a(7, 65535);
        e81.mo66778a(5, 16384);
        f37719E = e81;
    }

    public nb0(C14077a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "builder");
        boolean a = aVar.mo69002a();
        this.f37723b = a;
        this.f37724c = aVar.mo69004c();
        String b = aVar.mo69003b();
        this.f37726e = b;
        this.f37728g = aVar.mo69002a() ? 3 : 2;
        cd1 i = aVar.mo69010i();
        this.f37730i = i;
        bd1 e = i.mo66262e();
        this.f37731j = e;
        this.f37732k = i.mo66262e();
        this.f37733l = i.mo66262e();
        this.f37734m = aVar.mo69006e();
        e81 e81 = new e81();
        if (aVar.mo69002a()) {
            e81.mo66778a(7, 16777216);
        }
        Unit unit = Unit.INSTANCE;
        this.f37741t = e81;
        e81 e812 = f37719E;
        this.f37742u = e812;
        this.f37746y = (long) e812.mo66780b();
        this.f37747z = aVar.mo69008g();
        this.f37720A = new sb0(aVar.mo69007f(), a);
        this.f37721B = new C14081d(this, new qb0(aVar.mo69009h(), a));
        this.f37722C = new LinkedHashSet();
        if (aVar.mo69005d() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) aVar.mo69005d());
            e.mo66046a(new C14090j(Intrinsics.stringPlus(b, " ping"), this, nanos), nanos);
        }
    }

    /* renamed from: b */
    public final boolean mo68982b(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public void close() {
        mo68977a(o30.NO_ERROR, o30.CANCEL, (IOException) null);
    }

    public final void flush() throws IOException {
        this.f37720A.flush();
    }

    /* renamed from: k */
    public final long mo68996k() {
        return this.f37746y;
    }

    /* renamed from: l */
    public final sb0 mo68997l() {
        return this.f37720A;
    }

    /* renamed from: m */
    public final void mo68998m() {
        synchronized (this) {
            long j = this.f37738q;
            long j2 = this.f37737p;
            if (j >= j2) {
                this.f37737p = j2 + 1;
                this.f37740s = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.INSTANCE;
                this.f37731j.mo66046a(new C14089i(Intrinsics.stringPlus(this.f37726e, " ping"), true, this), 0);
            }
        }
    }

    /* renamed from: f */
    public final C14079c mo68990f() {
        return this.f37724c;
    }

    /* renamed from: g */
    public final int mo68992g() {
        return this.f37728g;
    }

    /* renamed from: h */
    public final e81 mo68993h() {
        return this.f37741t;
    }

    /* renamed from: i */
    public final e81 mo68994i() {
        return this.f37742u;
    }

    /* renamed from: j */
    public final Map<Integer, rb0> mo68995j() {
        return this.f37725d;
    }

    /* renamed from: c */
    public final boolean mo68985c() {
        return this.f37723b;
    }

    /* renamed from: d */
    public final String mo68987d() {
        return this.f37726e;
    }

    /* renamed from: e */
    public final int mo68989e() {
        return this.f37727f;
    }

    /* renamed from: a */
    public final void mo68975a(e81 e81) {
        Intrinsics.checkNotNullParameter(e81, "<set-?>");
        this.f37742u = e81;
    }

    /* renamed from: b */
    public final synchronized void mo68981b(long j) {
        long j2 = this.f37743v + j;
        this.f37743v = j2;
        long j3 = j2 - this.f37744w;
        if (j3 >= ((long) (this.f37741t.mo66780b() / 2))) {
            mo68969a(0, j3);
            this.f37744w += j3;
        }
    }

    /* renamed from: c */
    public final synchronized rb0 mo68983c(int i) {
        rb0 remove;
        remove = this.f37725d.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: d */
    public final void mo68988d(int i) {
        this.f37727f = i;
    }

    /* renamed from: a */
    public final synchronized rb0 mo68967a(int i) {
        return this.f37725d.get(Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.yandex.mobile.ads.impl.rb0 mo68968a(java.util.List<com.yandex.mobile.ads.impl.o90> r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r12 ^ 1
            com.yandex.mobile.ads.impl.sb0 r7 = r10.f37720A
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0071 }
            int r1 = r10.f37728g     // Catch:{ all -> 0x006e }
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 <= r2) goto L_0x0017
            com.yandex.mobile.ads.impl.o30 r1 = com.yandex.mobile.ads.impl.o30.REFUSED_STREAM     // Catch:{ all -> 0x006e }
            r10.mo68976a((com.yandex.mobile.ads.impl.o30) r1)     // Catch:{ all -> 0x006e }
        L_0x0017:
            boolean r1 = r10.f37729h     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0068
            int r8 = r10.f37728g     // Catch:{ all -> 0x006e }
            int r1 = r8 + 2
            r10.f37728g = r1     // Catch:{ all -> 0x006e }
            com.yandex.mobile.ads.impl.rb0 r9 = new com.yandex.mobile.ads.impl.rb0     // Catch:{ all -> 0x006e }
            r6 = 0
            r5 = 0
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x006e }
            if (r12 == 0) goto L_0x0045
            long r1 = r10.f37745x     // Catch:{ all -> 0x006e }
            long r3 = r10.f37746y     // Catch:{ all -> 0x006e }
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x0045
            long r1 = r9.mo69734n()     // Catch:{ all -> 0x006e }
            long r3 = r9.mo69733m()     // Catch:{ all -> 0x006e }
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 < 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r12 = 0
            goto L_0x0046
        L_0x0045:
            r12 = 1
        L_0x0046:
            boolean r1 = r9.mo69737q()     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0055
            java.util.Map<java.lang.Integer, com.yandex.mobile.ads.impl.rb0> r1 = r10.f37725d     // Catch:{ all -> 0x006e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x006e }
            r1.put(r2, r9)     // Catch:{ all -> 0x006e }
        L_0x0055:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006e }
            monitor-exit(r10)     // Catch:{ all -> 0x0071 }
            com.yandex.mobile.ads.impl.sb0 r1 = r10.f37720A     // Catch:{ all -> 0x0071 }
            r1.mo69932a((boolean) r0, (int) r8, (java.util.List<com.yandex.mobile.ads.impl.o90>) r11)     // Catch:{ all -> 0x0071 }
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0071 }
            monitor-exit(r7)
            if (r12 == 0) goto L_0x0067
            com.yandex.mobile.ads.impl.sb0 r11 = r10.f37720A
            r11.flush()
        L_0x0067:
            return r9
        L_0x0068:
            com.yandex.mobile.ads.impl.ih r11 = new com.yandex.mobile.ads.impl.ih     // Catch:{ all -> 0x006e }
            r11.<init>()     // Catch:{ all -> 0x006e }
            throw r11     // Catch:{ all -> 0x006e }
        L_0x006e:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0071 }
            throw r11     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nb0.mo68968a(java.util.List, boolean):com.yandex.mobile.ads.impl.rb0");
    }

    /* renamed from: b */
    public final void mo68980b(int i, o30 o30) throws IOException {
        Intrinsics.checkNotNullParameter(o30, "statusCode");
        this.f37720A.mo69928a(i, o30);
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$d */
    public final class C14081d implements qb0.C14377c, Function0<Unit> {

        /* renamed from: b */
        private final qb0 f37758b;

        /* renamed from: c */
        final /* synthetic */ nb0 f37759c;

        /* renamed from: com.yandex.mobile.ads.impl.nb0$d$a */
        public static final class C14082a extends xc1 {

            /* renamed from: e */
            final /* synthetic */ nb0 f37760e;

            /* renamed from: f */
            final /* synthetic */ rb0 f37761f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14082a(String str, boolean z, nb0 nb0, rb0 rb0) {
                super(str, z);
                this.f37760e = nb0;
                this.f37761f = rb0;
            }

            /* renamed from: e */
            public long mo65736e() {
                try {
                    this.f37760e.mo68990f().mo69012a(this.f37761f);
                    return -1;
                } catch (IOException e) {
                    lz0.C13944a aVar = lz0.f37135a;
                    lz0.f37136b.mo68534a(Intrinsics.stringPlus("Http2Connection.Listener failure for ", this.f37760e.mo68987d()), 4, (Throwable) e);
                    try {
                        this.f37761f.mo69715a(o30.PROTOCOL_ERROR, e);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.nb0$d$b */
        public static final class C14083b extends xc1 {

            /* renamed from: e */
            final /* synthetic */ nb0 f37762e;

            /* renamed from: f */
            final /* synthetic */ int f37763f;

            /* renamed from: g */
            final /* synthetic */ int f37764g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14083b(String str, boolean z, nb0 nb0, int i, int i2) {
                super(str, z);
                this.f37762e = nb0;
                this.f37763f = i;
                this.f37764g = i2;
            }

            /* renamed from: e */
            public long mo65736e() {
                this.f37762e.mo68978a(true, this.f37763f, this.f37764g);
                return -1;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.nb0$d$c */
        public static final class C14084c extends xc1 {

            /* renamed from: e */
            final /* synthetic */ C14081d f37765e;

            /* renamed from: f */
            final /* synthetic */ boolean f37766f;

            /* renamed from: g */
            final /* synthetic */ e81 f37767g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14084c(String str, boolean z, C14081d dVar, boolean z2, e81 e81) {
                super(str, z);
                this.f37765e = dVar;
                this.f37766f = z2;
                this.f37767g = e81;
            }

            /* renamed from: e */
            public long mo65736e() {
                long b;
                int i;
                rb0[] rb0Arr;
                C14081d dVar = this.f37765e;
                boolean z = this.f37766f;
                T t = this.f37767g;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(t, "settings");
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                sb0 l = dVar.f37759c.mo68997l();
                nb0 nb0 = dVar.f37759c;
                synchronized (l) {
                    synchronized (nb0) {
                        e81 i2 = nb0.mo68994i();
                        if (!z) {
                            T e81 = new e81();
                            e81.mo66779a(i2);
                            e81.mo66779a((e81) t);
                            Unit unit = Unit.INSTANCE;
                            t = e81;
                        }
                        objectRef.element = t;
                        b = ((long) t.mo66780b()) - ((long) i2.mo66780b());
                        i = 0;
                        if (b != 0) {
                            if (!nb0.mo68995j().isEmpty()) {
                                Object[] array = nb0.mo68995j().values().toArray(new rb0[0]);
                                if (array != null) {
                                    rb0Arr = (rb0[]) array;
                                    nb0.mo68975a((e81) objectRef.element);
                                    nb0.f37733l.mo66046a(new ob0(Intrinsics.stringPlus(nb0.mo68987d(), " onSettings"), true, nb0, objectRef), 0);
                                    Unit unit2 = Unit.INSTANCE;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        rb0Arr = null;
                        nb0.mo68975a((e81) objectRef.element);
                        nb0.f37733l.mo66046a(new ob0(Intrinsics.stringPlus(nb0.mo68987d(), " onSettings"), true, nb0, objectRef), 0);
                        Unit unit22 = Unit.INSTANCE;
                    }
                    try {
                        nb0.mo68997l().mo69930a((e81) objectRef.element);
                    } catch (IOException e) {
                        o30 o30 = o30.PROTOCOL_ERROR;
                        nb0.mo68977a(o30, o30, e);
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                if (rb0Arr == null) {
                    return -1;
                }
                int length = rb0Arr.length;
                while (i < length) {
                    rb0 rb0 = rb0Arr[i];
                    i++;
                    synchronized (rb0) {
                        rb0.mo69713a(b);
                        Unit unit4 = Unit.INSTANCE;
                    }
                }
                return -1;
            }
        }

        public C14081d(nb0 nb0, qb0 qb0) {
            Intrinsics.checkNotNullParameter(nb0, "this$0");
            Intrinsics.checkNotNullParameter(qb0, "reader");
            this.f37759c = nb0;
            this.f37758b = qb0;
        }

        /* renamed from: a */
        public void mo69013a() {
        }

        /* renamed from: a */
        public void mo69014a(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: a */
        public void mo69021a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(bufferedSource, "source");
            if (this.f37759c.mo68982b(i)) {
                this.f37759c.mo68973a(i, bufferedSource, i2, z);
                return;
            }
            rb0 a = this.f37759c.mo68967a(i);
            if (a == null) {
                this.f37759c.mo68984c(i, o30.PROTOCOL_ERROR);
                long j = (long) i2;
                this.f37759c.mo68981b(j);
                bufferedSource.skip(j);
                return;
            }
            a.mo69717a(bufferedSource, i2);
            if (z) {
                a.mo69716a(jh1.f35306b, true);
            }
        }

        public Object invoke() {
            o30 o30;
            Throwable th;
            o30 o302;
            o30 o303 = o30.INTERNAL_ERROR;
            e = null;
            try {
                this.f37758b.mo69566a(this);
                while (this.f37758b.mo69567a(false, (qb0.C14377c) this)) {
                }
                o302 = o30.NO_ERROR;
                try {
                    this.f37759c.mo68977a(o302, o30.CANCEL, (IOException) null);
                    jh1.m37826a((Closeable) this.f37758b);
                } catch (IOException e) {
                    e = e;
                    try {
                        o30 o304 = o30.PROTOCOL_ERROR;
                        this.f37759c.mo68977a(o304, o304, e);
                        jh1.m37826a((Closeable) this.f37758b);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        o30 = o302;
                        th = th3;
                        this.f37759c.mo68977a(o30, o303, e);
                        jh1.m37826a((Closeable) this.f37758b);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                o302 = o303;
                o30 o3042 = o30.PROTOCOL_ERROR;
                this.f37759c.mo68977a(o3042, o3042, e);
                jh1.m37826a((Closeable) this.f37758b);
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                o30 = o303;
                this.f37759c.mo68977a(o30, o303, e);
                jh1.m37826a((Closeable) this.f37758b);
                throw th;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public void mo69020a(boolean z, int i, int i2, List<o90> list) {
            Intrinsics.checkNotNullParameter(list, "headerBlock");
            if (this.f37759c.mo68982b(i)) {
                this.f37759c.mo68972a(i, list, z);
                return;
            }
            nb0 nb0 = this.f37759c;
            synchronized (nb0) {
                rb0 a = nb0.mo68967a(i);
                if (a != null) {
                    Unit unit = Unit.INSTANCE;
                    a.mo69716a(jh1.m37818a(list), z);
                } else if (!nb0.f37729h) {
                    if (i > nb0.mo68989e()) {
                        if (i % 2 != nb0.mo68992g() % 2) {
                            rb0 rb0 = new rb0(i, nb0, false, z, jh1.m37818a(list));
                            nb0.mo68988d(i);
                            nb0.mo68995j().put(Integer.valueOf(i), rb0);
                            bd1 e = nb0.f37730i.mo66262e();
                            e.mo66046a(new C14082a(nb0.mo68987d() + '[' + i + "] onStream", true, nb0, rb0), 0);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo69017a(int i, o30 o30) {
            Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
            if (this.f37759c.mo68982b(i)) {
                this.f37759c.mo68970a(i, o30);
                return;
            }
            rb0 c = this.f37759c.mo68983c(i);
            if (c != null) {
                c.mo69720b(o30);
            }
        }

        /* renamed from: a */
        public void mo69022a(boolean z, e81 e81) {
            Intrinsics.checkNotNullParameter(e81, "settings");
            this.f37759c.f37731j.mo66046a(new C14084c(Intrinsics.stringPlus(this.f37759c.mo68987d(), " applyAndAckSettings"), true, this, z, e81), 0);
        }

        /* renamed from: a */
        public void mo69019a(boolean z, int i, int i2) {
            if (z) {
                nb0 nb0 = this.f37759c;
                synchronized (nb0) {
                    if (i == 1) {
                        nb0.f37736o = nb0.f37736o + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            nb0.f37739r = nb0.f37739r + 1;
                            nb0.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        nb0.f37738q = nb0.f37738q + 1;
                    }
                }
                return;
            }
            this.f37759c.f37731j.mo66046a(new C14083b(Intrinsics.stringPlus(this.f37759c.mo68987d(), " ping"), true, this.f37759c, i, i2), 0);
        }

        /* renamed from: a */
        public void mo69018a(int i, o30 o30, ByteString byteString) {
            int i2;
            Object[] array;
            Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
            Intrinsics.checkNotNullParameter(byteString, "debugData");
            byteString.size();
            nb0 nb0 = this.f37759c;
            synchronized (nb0) {
                i2 = 0;
                array = nb0.mo68995j().values().toArray(new rb0[0]);
                if (array != null) {
                    nb0.f37729h = true;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            rb0[] rb0Arr = (rb0[]) array;
            int length = rb0Arr.length;
            while (i2 < length) {
                rb0 rb0 = rb0Arr[i2];
                i2++;
                if (rb0.mo69726f() > i && rb0.mo69736p()) {
                    rb0.mo69720b(o30.REFUSED_STREAM);
                    this.f37759c.mo68983c(rb0.mo69726f());
                }
            }
        }

        /* renamed from: a */
        public void mo69016a(int i, long j) {
            if (i == 0) {
                nb0 nb0 = this.f37759c;
                synchronized (nb0) {
                    nb0.f37746y = nb0.mo68996k() + j;
                    nb0.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            rb0 a = this.f37759c.mo68967a(i);
            if (a != null) {
                synchronized (a) {
                    a.mo69713a(j);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        /* renamed from: a */
        public void mo69015a(int i, int i2, List<o90> list) {
            Intrinsics.checkNotNullParameter(list, "requestHeaders");
            this.f37759c.mo68971a(i2, list);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f37720A.mo69936c());
        r6 = (long) r3;
        r8.f37745x += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68974a(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            com.yandex.mobile.ads.impl.sb0 r12 = r8.f37720A
            r12.mo69933a((boolean) r10, (int) r9, (okio.Buffer) r11, (int) r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x006c
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f37745x     // Catch:{ InterruptedException -> 0x005d }
            long r5 = r8.f37746y     // Catch:{ InterruptedException -> 0x005d }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, com.yandex.mobile.ads.impl.rb0> r3 = r8.f37725d     // Catch:{ InterruptedException -> 0x005d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005d }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005d }
            if (r3 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005d }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005d }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005d }
            throw r9     // Catch:{ InterruptedException -> 0x005d }
        L_0x0032:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch:{ all -> 0x005b }
            int r4 = (int) r3     // Catch:{ all -> 0x005b }
            com.yandex.mobile.ads.impl.sb0 r3 = r8.f37720A     // Catch:{ all -> 0x005b }
            int r3 = r3.mo69936c()     // Catch:{ all -> 0x005b }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x005b }
            long r4 = r8.f37745x     // Catch:{ all -> 0x005b }
            long r6 = (long) r3     // Catch:{ all -> 0x005b }
            long r4 = r4 + r6
            r8.f37745x = r4     // Catch:{ all -> 0x005b }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005b }
            monitor-exit(r8)
            long r12 = r12 - r6
            com.yandex.mobile.ads.impl.sb0 r4 = r8.f37720A
            if (r10 == 0) goto L_0x0056
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            r4.mo69933a((boolean) r5, (int) r9, (okio.Buffer) r11, (int) r3)
            goto L_0x000d
        L_0x005b:
            r9 = move-exception
            goto L_0x006a
        L_0x005d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x005b }
            r9.interrupt()     // Catch:{ all -> 0x005b }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x005b }
            r9.<init>()     // Catch:{ all -> 0x005b }
            throw r9     // Catch:{ all -> 0x005b }
        L_0x006a:
            monitor-exit(r8)
            throw r9
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nb0.mo68974a(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: com.yandex.mobile.ads.impl.nb0$a */
    public static final class C14077a {

        /* renamed from: a */
        private boolean f37748a;

        /* renamed from: b */
        private final cd1 f37749b;

        /* renamed from: c */
        public Socket f37750c;

        /* renamed from: d */
        public String f37751d;

        /* renamed from: e */
        public BufferedSource f37752e;

        /* renamed from: f */
        public BufferedSink f37753f;

        /* renamed from: g */
        private C14079c f37754g = C14079c.f37757a;

        /* renamed from: h */
        private f21 f37755h = f21.f33213a;

        /* renamed from: i */
        private int f37756i;

        public C14077a(boolean z, cd1 cd1) {
            Intrinsics.checkNotNullParameter(cd1, "taskRunner");
            this.f37748a = z;
            this.f37749b = cd1;
        }

        /* renamed from: a */
        public final C14077a mo69000a(C14079c cVar) {
            Intrinsics.checkNotNullParameter(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f37754g = cVar;
            return this;
        }

        /* renamed from: b */
        public final String mo69003b() {
            String str = this.f37751d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            throw null;
        }

        /* renamed from: c */
        public final C14079c mo69004c() {
            return this.f37754g;
        }

        /* renamed from: d */
        public final int mo69005d() {
            return this.f37756i;
        }

        /* renamed from: e */
        public final f21 mo69006e() {
            return this.f37755h;
        }

        /* renamed from: f */
        public final BufferedSink mo69007f() {
            BufferedSink bufferedSink = this.f37753f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            throw null;
        }

        /* renamed from: g */
        public final Socket mo69008g() {
            Socket socket = this.f37750c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            throw null;
        }

        /* renamed from: h */
        public final BufferedSource mo69009h() {
            BufferedSource bufferedSource = this.f37752e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            throw null;
        }

        /* renamed from: i */
        public final cd1 mo69010i() {
            return this.f37749b;
        }

        /* renamed from: a */
        public final C14077a mo69001a(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) throws IOException {
            String str2;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(str, "peerName");
            Intrinsics.checkNotNullParameter(bufferedSource, "source");
            Intrinsics.checkNotNullParameter(bufferedSink, "sink");
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f37750c = socket;
            if (this.f37748a) {
                str2 = jh1.f35311g + ' ' + str;
            } else {
                str2 = Intrinsics.stringPlus("MockWebServer ", str);
            }
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            this.f37751d = str2;
            Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.f37752e = bufferedSource;
            Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.f37753f = bufferedSink;
            return this;
        }

        /* renamed from: a */
        public final boolean mo69002a() {
            return this.f37748a;
        }

        /* renamed from: a */
        public final C14077a mo68999a(int i) {
            this.f37756i = i;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo68969a(int i, long j) {
        bd1 bd1 = this.f37731j;
        bd1.mo66046a(new C14092l(this.f37726e + '[' + i + "] windowUpdate", true, this, i, j), 0);
    }

    /* renamed from: c */
    public final void mo68984c(int i, o30 o30) {
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
        bd1 bd1 = this.f37731j;
        bd1.mo66046a(new C14091k(this.f37726e + '[' + i + "] writeSynReset", true, this, i, o30), 0);
    }

    /* renamed from: a */
    public final void mo68978a(boolean z, int i, int i2) {
        try {
            this.f37720A.mo69931a(z, i, i2);
        } catch (IOException e) {
            o30 o30 = o30.PROTOCOL_ERROR;
            mo68977a(o30, o30, e);
        }
    }

    /* renamed from: a */
    public final void mo68976a(o30 o30) throws IOException {
        Intrinsics.checkNotNullParameter(o30, "statusCode");
        synchronized (this.f37720A) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (!this.f37729h) {
                    this.f37729h = true;
                    int i = this.f37727f;
                    intRef.element = i;
                    Unit unit = Unit.INSTANCE;
                    this.f37720A.mo69929a(i, o30, jh1.f35305a);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m39940a(nb0 nb0, boolean z, cd1 cd1, int i) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        cd1 cd12 = (i & 2) != 0 ? cd1.f31895i : null;
        Intrinsics.checkNotNullParameter(cd12, "taskRunner");
        if (z) {
            nb0.f37720A.mo69934b();
            nb0.f37720A.mo69935b(nb0.f37741t);
            int b = nb0.f37741t.mo66780b();
            if (b != 65535) {
                nb0.f37720A.mo69927a(0, (long) (b - 65535));
            }
        }
        cd12.mo66262e().mo66046a(new ad1(nb0.f37721B, nb0.f37726e, true), 0);
    }

    /* renamed from: a */
    public final synchronized boolean mo68979a(long j) {
        if (this.f37729h) {
            return false;
        }
        if (this.f37738q >= this.f37737p || j < this.f37740s) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68971a(int i, List<o90> list) {
        Intrinsics.checkNotNullParameter(list, "requestHeaders");
        synchronized (this) {
            if (this.f37722C.contains(Integer.valueOf(i))) {
                mo68984c(i, o30.PROTOCOL_ERROR);
                return;
            }
            this.f37722C.add(Integer.valueOf(i));
            bd1 bd1 = this.f37732k;
            bd1.mo66046a(new C14087g(this.f37726e + '[' + i + "] onRequest", true, this, i, list), 0);
        }
    }

    /* renamed from: a */
    public final void mo68972a(int i, List<o90> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "requestHeaders");
        bd1 bd1 = this.f37732k;
        bd1.mo66046a(new C14086f(this.f37726e + '[' + i + "] onHeaders", true, this, i, list, z), 0);
    }

    /* renamed from: a */
    public final void mo68973a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "source");
        Buffer buffer = new Buffer();
        long j = (long) i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        bd1 bd1 = this.f37732k;
        bd1.mo66046a(new C14085e(this.f37726e + '[' + i + "] onData", true, this, i, buffer, i2, z), 0);
    }

    /* renamed from: a */
    public final void mo68970a(int i, o30 o30) {
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
        bd1 bd1 = this.f37732k;
        bd1.mo66046a(new C14088h(this.f37726e + '[' + i + "] onReset", true, this, i, o30), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:6|7|8|40|21|(2:23|(5:25|26|27|40|28))|30|31|32|33|34|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0080 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68977a(com.yandex.mobile.ads.impl.o30 r4, com.yandex.mobile.ads.impl.o30 r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = com.yandex.mobile.ads.impl.jh1.f35310f
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x003c
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x003c:
            r3.mo68976a((com.yandex.mobile.ads.impl.o30) r4)     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, com.yandex.mobile.ads.impl.rb0> r0 = r3.f37725d     // Catch:{ all -> 0x0095 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0095 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0068
            java.util.Map<java.lang.Integer, com.yandex.mobile.ads.impl.rb0> r4 = r3.f37725d     // Catch:{ all -> 0x0095 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0095 }
            com.yandex.mobile.ads.impl.rb0[] r0 = new com.yandex.mobile.ads.impl.rb0[r1]     // Catch:{ all -> 0x0095 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x0060
            java.util.Map<java.lang.Integer, com.yandex.mobile.ads.impl.rb0> r0 = r3.f37725d     // Catch:{ all -> 0x0095 }
            r0.clear()     // Catch:{ all -> 0x0095 }
            goto L_0x0068
        L_0x0060:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0095 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0095 }
            throw r4     // Catch:{ all -> 0x0095 }
        L_0x0068:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0095 }
            monitor-exit(r3)
            com.yandex.mobile.ads.impl.rb0[] r4 = (com.yandex.mobile.ads.impl.rb0[]) r4
            if (r4 != 0) goto L_0x0070
            goto L_0x007b
        L_0x0070:
            int r0 = r4.length
        L_0x0071:
            if (r1 >= r0) goto L_0x007b
            r2 = r4[r1]
            r2.mo69715a((com.yandex.mobile.ads.impl.o30) r5, (java.io.IOException) r6)     // Catch:{ IOException -> 0x0078 }
        L_0x0078:
            int r1 = r1 + 1
            goto L_0x0071
        L_0x007b:
            com.yandex.mobile.ads.impl.sb0 r4 = r3.f37720A     // Catch:{ IOException -> 0x0080 }
            r4.close()     // Catch:{ IOException -> 0x0080 }
        L_0x0080:
            java.net.Socket r4 = r3.f37747z     // Catch:{ IOException -> 0x0085 }
            r4.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            com.yandex.mobile.ads.impl.bd1 r4 = r3.f37731j
            r4.mo66056i()
            com.yandex.mobile.ads.impl.bd1 r4 = r3.f37732k
            r4.mo66056i()
            com.yandex.mobile.ads.impl.bd1 r4 = r3.f37733l
            r4.mo66056i()
            return
        L_0x0095:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nb0.mo68977a(com.yandex.mobile.ads.impl.o30, com.yandex.mobile.ads.impl.o30, java.io.IOException):void");
    }
}
