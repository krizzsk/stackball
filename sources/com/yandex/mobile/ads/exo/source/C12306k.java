package com.yandex.mobile.ads.exo.source;

import android.os.Looper;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.C12186c;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.C13416ik;
import com.yandex.mobile.ads.impl.C13477j7;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.q70;
import com.yandex.mobile.ads.impl.wn0;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.source.k */
public class C12306k implements ke1 {

    /* renamed from: a */
    private final C12304j f30189a;

    /* renamed from: b */
    private final C12307a f30190b = new C12307a();

    /* renamed from: c */
    private final C12188d<?> f30191c;

    /* renamed from: d */
    private C12308b f30192d;

    /* renamed from: e */
    private final Looper f30193e;

    /* renamed from: f */
    private Format f30194f;

    /* renamed from: g */
    private C12186c<?> f30195g;

    /* renamed from: h */
    private int f30196h = 1000;

    /* renamed from: i */
    private int[] f30197i = new int[1000];

    /* renamed from: j */
    private long[] f30198j = new long[1000];

    /* renamed from: k */
    private int[] f30199k = new int[1000];

    /* renamed from: l */
    private int[] f30200l = new int[1000];

    /* renamed from: m */
    private long[] f30201m = new long[1000];

    /* renamed from: n */
    private ke1.C13702a[] f30202n = new ke1.C13702a[1000];

    /* renamed from: o */
    private Format[] f30203o = new Format[1000];

    /* renamed from: p */
    private int f30204p;

    /* renamed from: q */
    private int f30205q;

    /* renamed from: r */
    private int f30206r;

    /* renamed from: s */
    private int f30207s;

    /* renamed from: t */
    private long f30208t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f30209u = Long.MIN_VALUE;

    /* renamed from: v */
    private boolean f30210v;

    /* renamed from: w */
    private boolean f30211w = true;

    /* renamed from: x */
    private boolean f30212x = true;

    /* renamed from: y */
    private Format f30213y;

    /* renamed from: z */
    private Format f30214z;

    /* renamed from: com.yandex.mobile.ads.exo.source.k$a */
    static final class C12307a {

        /* renamed from: a */
        public int f30215a;

        /* renamed from: b */
        public long f30216b;

        /* renamed from: c */
        public ke1.C13702a f30217c;

        C12307a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.k$b */
    public interface C12308b {
    }

    public C12306k(C13477j7 j7Var, Looper looper, C12188d<?> dVar) {
        this.f30189a = new C12304j(j7Var);
        this.f30193e = looper;
        this.f30191c = dVar;
    }

    /* renamed from: g */
    private boolean m32405g() {
        return this.f30207s != this.f30204p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo65343a(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m32405g()     // Catch:{ all -> 0x0030 }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r4 != 0) goto L_0x0018
            boolean r4 = r3.f30210v     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x0018
            com.yandex.mobile.ads.exo.Format r4 = r3.f30213y     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0017
            com.yandex.mobile.ads.exo.Format r0 = r3.f30194f     // Catch:{ all -> 0x0030 }
            if (r4 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r3)
            return r1
        L_0x001a:
            int r4 = r3.f30207s     // Catch:{ all -> 0x0030 }
            int r4 = r3.m32403c(r4)     // Catch:{ all -> 0x0030 }
            com.yandex.mobile.ads.exo.Format[] r0 = r3.f30203o     // Catch:{ all -> 0x0030 }
            r0 = r0[r4]     // Catch:{ all -> 0x0030 }
            com.yandex.mobile.ads.exo.Format r2 = r3.f30194f     // Catch:{ all -> 0x0030 }
            if (r0 == r2) goto L_0x002a
            monitor-exit(r3)
            return r1
        L_0x002a:
            boolean r4 = r3.m32404d(r4)     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)
            return r4
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12306k.mo65343a(boolean):boolean");
    }

    /* renamed from: b */
    public void mo65345b(boolean z) {
        this.f30189a.mo65330b();
        this.f30204p = 0;
        this.f30205q = 0;
        this.f30206r = 0;
        this.f30207s = 0;
        this.f30211w = true;
        this.f30208t = Long.MIN_VALUE;
        this.f30209u = Long.MIN_VALUE;
        this.f30210v = false;
        this.f30214z = null;
        if (z) {
            this.f30213y = null;
            this.f30212x = true;
        }
    }

    /* renamed from: c */
    public final synchronized long mo65346c() {
        return this.f30209u;
    }

    /* renamed from: d */
    public final int mo65347d() {
        return this.f30205q + this.f30207s;
    }

    /* renamed from: e */
    public final synchronized Format mo65348e() {
        return this.f30212x ? null : this.f30213y;
    }

    /* renamed from: f */
    public final int mo65349f() {
        return this.f30205q + this.f30204p;
    }

    /* renamed from: h */
    public final synchronized boolean mo65350h() {
        return this.f30210v;
    }

    /* renamed from: i */
    public void mo65351i() throws IOException {
        C12186c<?> cVar = this.f30195g;
        if (cVar != null && cVar.mo64858b() == 1) {
            C12186c.C12187a d = this.f30195g.mo64860d();
            d.getClass();
            throw d;
        }
    }

    /* renamed from: j */
    public void mo65352j() {
        mo65344b();
        C12186c<?> cVar = this.f30195g;
        if (cVar != null) {
            cVar.release();
            this.f30195g = null;
            this.f30194f = null;
        }
    }

    /* renamed from: k */
    public void mo65353k() {
        mo65345b(true);
        C12186c<?> cVar = this.f30195g;
        if (cVar != null) {
            cVar.release();
            this.f30195g = null;
            this.f30194f = null;
        }
    }

    /* renamed from: c */
    private int m32403c(int i) {
        int i2 = this.f30206r + i;
        int i3 = this.f30196h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: d */
    private boolean m32404d(int i) {
        C12186c<?> cVar;
        if (this.f30191c == C12188d.f29588a || (cVar = this.f30195g) == null || cVar.mo64858b() == 4) {
            return true;
        }
        if ((this.f30200l[i] & 1073741824) != 0 || !this.f30195g.mo64848a()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:66:0x00e4=Splitter:B:66:0x00e4, B:87:0x0135=Splitter:B:87:0x0135} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo65336a(com.yandex.mobile.ads.impl.q70 r14, com.yandex.mobile.ads.impl.C14387qj r15, boolean r16, boolean r17, long r18) {
        /*
            r13 = this;
            r1 = r13
            r0 = r14
            r2 = r15
            com.yandex.mobile.ads.exo.source.k$a r3 = r1.f30190b
            monitor-enter(r13)
            r4 = 0
            r2.f39148e = r4     // Catch:{ all -> 0x0154 }
            r5 = -1
            r6 = -1
        L_0x000b:
            boolean r7 = r13.m32405g()     // Catch:{ all -> 0x0154 }
            r8 = 4
            r9 = 1
            if (r7 == 0) goto L_0x00c9
            int r6 = r1.f30207s     // Catch:{ all -> 0x0154 }
            int r6 = r13.m32403c(r6)     // Catch:{ all -> 0x0154 }
            long[] r10 = r1.f30201m     // Catch:{ all -> 0x0154 }
            r11 = r10[r6]     // Catch:{ all -> 0x0154 }
            int r10 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c9
            com.yandex.mobile.ads.exo.Format[] r10 = r1.f30203o     // Catch:{ all -> 0x0154 }
            r10 = r10[r6]     // Catch:{ all -> 0x0154 }
            java.lang.String r10 = r10.f29530j     // Catch:{ all -> 0x0154 }
            int r11 = com.yandex.mobile.ads.impl.wn0.f42066b     // Catch:{ all -> 0x0154 }
            if (r10 != 0) goto L_0x002d
            goto L_0x00bf
        L_0x002d:
            int r11 = r10.hashCode()
            switch(r11) {
                case -2123537834: goto L_0x00ad;
                case -432837260: goto L_0x00a2;
                case -432837259: goto L_0x0097;
                case 187078296: goto L_0x008c;
                case 187094639: goto L_0x0081;
                case 1504578661: goto L_0x0076;
                case 1504619009: goto L_0x006b;
                case 1504831518: goto L_0x0060;
                case 1504891608: goto L_0x0052;
                case 1903231877: goto L_0x0044;
                case 1903589369: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x00b8
        L_0x0036:
            java.lang.String r11 = "audio/g711-mlaw"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0040
            goto L_0x00b8
        L_0x0040:
            r10 = 10
            goto L_0x00b9
        L_0x0044:
            java.lang.String r11 = "audio/g711-alaw"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x004e
            goto L_0x00b8
        L_0x004e:
            r10 = 9
            goto L_0x00b9
        L_0x0052:
            java.lang.String r11 = "audio/opus"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x005c
            goto L_0x00b8
        L_0x005c:
            r10 = 8
            goto L_0x00b9
        L_0x0060:
            java.lang.String r11 = "audio/mpeg"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0069
            goto L_0x00b8
        L_0x0069:
            r10 = 7
            goto L_0x00b9
        L_0x006b:
            java.lang.String r11 = "audio/flac"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0074
            goto L_0x00b8
        L_0x0074:
            r10 = 6
            goto L_0x00b9
        L_0x0076:
            java.lang.String r11 = "audio/eac3"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x007f
            goto L_0x00b8
        L_0x007f:
            r10 = 5
            goto L_0x00b9
        L_0x0081:
            java.lang.String r11 = "audio/raw"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x008a
            goto L_0x00b8
        L_0x008a:
            r10 = 4
            goto L_0x00b9
        L_0x008c:
            java.lang.String r11 = "audio/ac3"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0095
            goto L_0x00b8
        L_0x0095:
            r10 = 3
            goto L_0x00b9
        L_0x0097:
            java.lang.String r11 = "audio/mpeg-L2"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00a0
            goto L_0x00b8
        L_0x00a0:
            r10 = 2
            goto L_0x00b9
        L_0x00a2:
            java.lang.String r11 = "audio/mpeg-L1"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00ab
            goto L_0x00b8
        L_0x00ab:
            r10 = 1
            goto L_0x00b9
        L_0x00ad:
            java.lang.String r11 = "audio/eac3-joc"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r10 = 0
            goto L_0x00b9
        L_0x00b8:
            r10 = -1
        L_0x00b9:
            switch(r10) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00bd;
                case 8: goto L_0x00bd;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00bd;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            goto L_0x00bf
        L_0x00bd:
            r10 = 1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            if (r10 == 0) goto L_0x00c9
            int r7 = r1.f30207s     // Catch:{ all -> 0x0154 }
            int r7 = r7 + r9
            r1.f30207s = r7     // Catch:{ all -> 0x0154 }
            goto L_0x000b
        L_0x00c9:
            r4 = -3
            r5 = -4
            if (r7 != 0) goto L_0x00e8
            if (r17 != 0) goto L_0x00e4
            boolean r3 = r1.f30210v     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x00d4
            goto L_0x00e4
        L_0x00d4:
            com.yandex.mobile.ads.exo.Format r3 = r1.f30213y     // Catch:{ all -> 0x0154 }
            if (r3 == 0) goto L_0x00e2
            if (r16 != 0) goto L_0x00de
            com.yandex.mobile.ads.exo.Format r6 = r1.f30194f     // Catch:{ all -> 0x0154 }
            if (r3 == r6) goto L_0x00e2
        L_0x00de:
            r13.m32401a((com.yandex.mobile.ads.exo.Format) r3, (com.yandex.mobile.ads.impl.q70) r14)     // Catch:{ all -> 0x0154 }
            goto L_0x013c
        L_0x00e2:
            monitor-exit(r13)
            goto L_0x013e
        L_0x00e4:
            r15.mo71020e(r8)     // Catch:{ all -> 0x0154 }
            goto L_0x0132
        L_0x00e8:
            if (r16 != 0) goto L_0x0135
            com.yandex.mobile.ads.exo.Format[] r7 = r1.f30203o     // Catch:{ all -> 0x0154 }
            r7 = r7[r6]     // Catch:{ all -> 0x0154 }
            com.yandex.mobile.ads.exo.Format r8 = r1.f30194f     // Catch:{ all -> 0x0154 }
            if (r7 == r8) goto L_0x00f3
            goto L_0x0135
        L_0x00f3:
            boolean r0 = r13.m32404d(r6)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00fd
            r2.f39148e = r9     // Catch:{ all -> 0x0154 }
            monitor-exit(r13)
            goto L_0x013e
        L_0x00fd:
            int[] r0 = r1.f30200l     // Catch:{ all -> 0x0154 }
            r0 = r0[r6]     // Catch:{ all -> 0x0154 }
            r15.mo71020e(r0)     // Catch:{ all -> 0x0154 }
            long[] r0 = r1.f30201m     // Catch:{ all -> 0x0154 }
            r7 = r0[r6]     // Catch:{ all -> 0x0154 }
            r2.f39149f = r7     // Catch:{ all -> 0x0154 }
            int r0 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x0113
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r15.mo71015b(r0)     // Catch:{ all -> 0x0154 }
        L_0x0113:
            boolean r0 = r15.mo69603i()     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x011b
            monitor-exit(r13)
            goto L_0x0133
        L_0x011b:
            int[] r0 = r1.f30199k     // Catch:{ all -> 0x0154 }
            r0 = r0[r6]     // Catch:{ all -> 0x0154 }
            r3.f30215a = r0     // Catch:{ all -> 0x0154 }
            long[] r0 = r1.f30198j     // Catch:{ all -> 0x0154 }
            r7 = r0[r6]     // Catch:{ all -> 0x0154 }
            r3.f30216b = r7     // Catch:{ all -> 0x0154 }
            com.yandex.mobile.ads.impl.ke1$a[] r0 = r1.f30202n     // Catch:{ all -> 0x0154 }
            r0 = r0[r6]     // Catch:{ all -> 0x0154 }
            r3.f30217c = r0     // Catch:{ all -> 0x0154 }
            int r0 = r1.f30207s     // Catch:{ all -> 0x0154 }
            int r0 = r0 + r9
            r1.f30207s = r0     // Catch:{ all -> 0x0154 }
        L_0x0132:
            monitor-exit(r13)
        L_0x0133:
            r4 = -4
            goto L_0x013e
        L_0x0135:
            com.yandex.mobile.ads.exo.Format[] r3 = r1.f30203o     // Catch:{ all -> 0x0154 }
            r3 = r3[r6]     // Catch:{ all -> 0x0154 }
            r13.m32401a((com.yandex.mobile.ads.exo.Format) r3, (com.yandex.mobile.ads.impl.q70) r14)     // Catch:{ all -> 0x0154 }
        L_0x013c:
            r4 = -5
            monitor-exit(r13)
        L_0x013e:
            if (r4 != r5) goto L_0x0153
            boolean r0 = r15.mo71021e()
            if (r0 != 0) goto L_0x0153
            boolean r0 = r15.mo69603i()
            if (r0 != 0) goto L_0x0153
            com.yandex.mobile.ads.exo.source.j r0 = r1.f30189a
            com.yandex.mobile.ads.exo.source.k$a r3 = r1.f30190b
            r0.mo65329a((com.yandex.mobile.ads.impl.C14387qj) r15, (com.yandex.mobile.ads.exo.source.C12306k.C12307a) r3)
        L_0x0153:
            return r4
        L_0x0154:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12306k.mo65336a(com.yandex.mobile.ads.impl.q70, com.yandex.mobile.ads.impl.qj, boolean, boolean, long):int");
    }

    /* renamed from: b */
    public final void mo65344b() {
        long j;
        C12304j jVar = this.f30189a;
        synchronized (this) {
            int i = this.f30204p;
            if (i == 0) {
                j = -1;
            } else {
                j = m32400a(i);
            }
        }
        jVar.mo65327a(j);
    }

    /* renamed from: b */
    private long m32402b(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int c = m32403c(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f30201m[c]);
            if ((this.f30200l[c] & 1) != 0) {
                break;
            }
            c--;
            if (c == -1) {
                c = this.f30196h - 1;
            }
        }
        return j;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized boolean mo65342a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            monitor-enter(r8)     // Catch:{ all -> 0x0047 }
            r0 = 0
            r8.f30207s = r0     // Catch:{ all -> 0x0044 }
            com.yandex.mobile.ads.exo.source.j r1 = r8.f30189a     // Catch:{ all -> 0x0044 }
            r1.mo65331c()     // Catch:{ all -> 0x0044 }
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            int r1 = r8.f30207s     // Catch:{ all -> 0x0047 }
            int r3 = r8.m32403c(r1)     // Catch:{ all -> 0x0047 }
            boolean r1 = r8.m32405g()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0042
            long[] r1 = r8.f30201m     // Catch:{ all -> 0x0047 }
            r4 = r1[r3]     // Catch:{ all -> 0x0047 }
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            long r1 = r8.f30209u     // Catch:{ all -> 0x0047 }
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0028
            if (r11 != 0) goto L_0x0028
            goto L_0x0042
        L_0x0028:
            int r11 = r8.f30204p     // Catch:{ all -> 0x0047 }
            int r1 = r8.f30207s     // Catch:{ all -> 0x0047 }
            int r4 = r11 - r1
            r7 = 1
            r2 = r8
            r5 = r9
            int r9 = r2.m32399a(r3, r4, r5, r7)     // Catch:{ all -> 0x0047 }
            r10 = -1
            if (r9 != r10) goto L_0x003a
            monitor-exit(r8)
            return r0
        L_0x003a:
            int r10 = r8.f30207s     // Catch:{ all -> 0x0047 }
            int r10 = r10 + r9
            r8.f30207s = r10     // Catch:{ all -> 0x0047 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x0042:
            monitor-exit(r8)
            return r0
        L_0x0044:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            throw r9     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12306k.mo65342a(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo65334a(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f30207s     // Catch:{ all -> 0x0032 }
            int r2 = r8.m32403c(r0)     // Catch:{ all -> 0x0032 }
            boolean r0 = r8.m32405g()     // Catch:{ all -> 0x0032 }
            r7 = 0
            if (r0 == 0) goto L_0x0030
            long[] r0 = r8.f30201m     // Catch:{ all -> 0x0032 }
            r3 = r0[r2]     // Catch:{ all -> 0x0032 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x0030
        L_0x0017:
            int r0 = r8.f30204p     // Catch:{ all -> 0x0032 }
            int r1 = r8.f30207s     // Catch:{ all -> 0x0032 }
            int r3 = r0 - r1
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m32399a(r2, r3, r4, r6)     // Catch:{ all -> 0x0032 }
            r10 = -1
            if (r9 != r10) goto L_0x0029
            monitor-exit(r8)
            return r7
        L_0x0029:
            int r10 = r8.f30207s     // Catch:{ all -> 0x0032 }
            int r10 = r10 + r9
            r8.f30207s = r10     // Catch:{ all -> 0x0032 }
            monitor-exit(r8)
            return r9
        L_0x0030:
            monitor-exit(r8)
            return r7
        L_0x0032:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12306k.mo65334a(long):int");
    }

    /* renamed from: a */
    public final synchronized int mo65333a() {
        int i;
        int i2 = this.f30204p;
        i = i2 - this.f30207s;
        this.f30207s = i2;
        return i;
    }

    /* renamed from: a */
    public final void mo65338a(long j, boolean z, boolean z2) {
        long j2;
        int i;
        C12304j jVar = this.f30189a;
        synchronized (this) {
            int i2 = this.f30204p;
            if (i2 != 0) {
                long[] jArr = this.f30201m;
                int i3 = this.f30206r;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.f30207s) != i2) {
                        i2 = i + 1;
                    }
                    int a = m32399a(i3, i2, j, z);
                    if (a != -1) {
                        j2 = m32400a(a);
                    }
                }
            }
            j2 = -1;
        }
        jVar.mo65327a(j2);
    }

    /* renamed from: a */
    public final void mo65340a(C12308b bVar) {
        this.f30192d = bVar;
    }

    /* renamed from: a */
    public final void mo65339a(Format format) {
        boolean z;
        synchronized (this) {
            z = true;
            if (format == null) {
                this.f30212x = true;
            } else {
                this.f30212x = false;
                if (!ih1.m37382a((Object) format, (Object) this.f30213y)) {
                    if (ih1.m37382a((Object) format, (Object) this.f30214z)) {
                        this.f30213y = this.f30214z;
                    } else {
                        this.f30213y = format;
                    }
                }
            }
            z = false;
        }
        C12308b bVar = this.f30192d;
        if (bVar != null && z) {
            ((C12295h) bVar).mo65306a(format);
        }
    }

    /* renamed from: a */
    public final int mo65335a(C13416ik ikVar, int i, boolean z) throws IOException, InterruptedException {
        return this.f30189a.mo65325a(ikVar, i, z);
    }

    /* renamed from: a */
    public final void mo65341a(fy0 fy0, int i) {
        this.f30189a.mo65328a(fy0, i);
    }

    /* renamed from: a */
    public final void mo65337a(long j, int i, int i2, int i3, ke1.C13702a aVar) {
        long j2 = j + 0;
        long a = (this.f30189a.mo65326a() - ((long) i2)) - ((long) i3);
        synchronized (this) {
            if (this.f30211w) {
                if ((i & 1) != 0) {
                    this.f30211w = false;
                }
            }
            C13479j9.m37708b(!this.f30212x);
            this.f30210v = (536870912 & i) != 0;
            this.f30209u = Math.max(this.f30209u, j2);
            int c = m32403c(this.f30204p);
            this.f30201m[c] = j2;
            long[] jArr = this.f30198j;
            jArr[c] = a;
            this.f30199k[c] = i2;
            this.f30200l[c] = i;
            this.f30202n[c] = aVar;
            Format[] formatArr = this.f30203o;
            Format format = this.f30213y;
            formatArr[c] = format;
            this.f30197i[c] = 0;
            this.f30214z = format;
            int i4 = this.f30204p + 1;
            this.f30204p = i4;
            int i5 = this.f30196h;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                int[] iArr = new int[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr2 = new int[i6];
                int[] iArr3 = new int[i6];
                ke1.C13702a[] aVarArr = new ke1.C13702a[i6];
                Format[] formatArr2 = new Format[i6];
                int i7 = this.f30206r;
                int i8 = i5 - i7;
                System.arraycopy(jArr, i7, jArr2, 0, i8);
                System.arraycopy(this.f30201m, this.f30206r, jArr3, 0, i8);
                System.arraycopy(this.f30200l, this.f30206r, iArr2, 0, i8);
                System.arraycopy(this.f30199k, this.f30206r, iArr3, 0, i8);
                System.arraycopy(this.f30202n, this.f30206r, aVarArr, 0, i8);
                System.arraycopy(this.f30203o, this.f30206r, formatArr2, 0, i8);
                System.arraycopy(this.f30197i, this.f30206r, iArr, 0, i8);
                int i9 = this.f30206r;
                System.arraycopy(this.f30198j, 0, jArr2, i8, i9);
                System.arraycopy(this.f30201m, 0, jArr3, i8, i9);
                System.arraycopy(this.f30200l, 0, iArr2, i8, i9);
                System.arraycopy(this.f30199k, 0, iArr3, i8, i9);
                System.arraycopy(this.f30202n, 0, aVarArr, i8, i9);
                System.arraycopy(this.f30203o, 0, formatArr2, i8, i9);
                System.arraycopy(this.f30197i, 0, iArr, i8, i9);
                this.f30198j = jArr2;
                this.f30201m = jArr3;
                this.f30200l = iArr2;
                this.f30199k = iArr3;
                this.f30202n = aVarArr;
                this.f30203o = formatArr2;
                this.f30197i = iArr;
                this.f30206r = 0;
                this.f30196h = i6;
            }
        }
    }

    /* renamed from: a */
    private void m32401a(Format format, q70 q70) {
        DrmInitData drmInitData;
        C12186c<?> cVar;
        q70.f39018c = format;
        Format format2 = this.f30194f;
        boolean z = format2 == null;
        if (z) {
            drmInitData = null;
        } else {
            drmInitData = format2.f29533m;
        }
        this.f30194f = format;
        if (this.f30191c != C12188d.f29588a) {
            DrmInitData drmInitData2 = format.f29533m;
            q70.f39016a = true;
            q70.f39017b = this.f30195g;
            if (z || !ih1.m37382a((Object) drmInitData, (Object) drmInitData2)) {
                C12186c<?> cVar2 = this.f30195g;
                if (drmInitData2 != null) {
                    cVar = this.f30191c.mo64851a(this.f30193e, drmInitData2);
                } else {
                    cVar = this.f30191c.mo64850a(this.f30193e, wn0.m43727d(format.f29530j));
                }
                this.f30195g = cVar;
                q70.f39017b = cVar;
                if (cVar2 != null) {
                    cVar2.release();
                }
            }
        }
    }

    /* renamed from: a */
    private int m32399a(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f30201m[i] <= j; i4++) {
            if (!z || (this.f30200l[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f30196h) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private long m32400a(int i) {
        this.f30208t = Math.max(this.f30208t, m32402b(i));
        int i2 = this.f30204p - i;
        this.f30204p = i2;
        this.f30205q += i;
        int i3 = this.f30206r + i;
        this.f30206r = i3;
        int i4 = this.f30196h;
        if (i3 >= i4) {
            this.f30206r = i3 - i4;
        }
        int i5 = this.f30207s - i;
        this.f30207s = i5;
        if (i5 < 0) {
            this.f30207s = 0;
        }
        if (i2 != 0) {
            return this.f30198j[this.f30206r];
        }
        int i6 = this.f30206r;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.f30198j[i7] + ((long) this.f30199k[i7]);
    }
}
