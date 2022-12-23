package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import com.yandex.metrica.impl.p265ob.C11565nh;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.T1 */
public abstract class C10766T1<T extends C11565nh> {

    /* renamed from: a */
    private String f25808a;

    /* renamed from: b */
    private int f25809b = 1;

    /* renamed from: c */
    private final Map<String, List<String>> f25810c = new HashMap();

    /* renamed from: d */
    private byte[] f25811d;

    /* renamed from: e */
    private int f25812e;

    /* renamed from: f */
    private byte[] f25813f;

    /* renamed from: g */
    protected Map<String, List<String>> f25814g;

    /* renamed from: h */
    private int f25815h = -1;

    /* renamed from: i */
    private List<String> f25816i;

    /* renamed from: j */
    protected final T f25817j;

    /* renamed from: k */
    private Long f25818k;

    /* renamed from: l */
    private Integer f25819l;

    /* renamed from: m */
    private C10768b f25820m = C10768b.EMPTY;

    /* renamed from: com.yandex.metrica.impl.ob.T1$a */
    public enum C10767a {
        REPORT,
        f25822b,
        STARTUP,
        DIAGNOSTIC
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$b */
    private enum C10768b {
        EMPTY,
        PENDING,
        PREPARING,
        EXECUTING,
        SUCCESS,
        FAILED,
        SHOULD_NOT_EXECUTE,
        FINISHED,
        REMOVED
    }

    public C10766T1(T t) {
        this.f25817j = t;
    }

    /* renamed from: A */
    public boolean mo61729A() {
        C10768b bVar = this.f25820m;
        return (bVar == C10768b.REMOVED || bVar == C10768b.FINISHED || this.f25815h + 1 >= this.f25816i.size()) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61643a(Uri.Builder builder);

    /* renamed from: a */
    public final void mo62250a(Throwable th) {
        C10768b bVar = C10768b.FAILED;
        if (m27743a(bVar)) {
            mo61645b(th);
            this.f25820m = bVar;
        }
    }

    /* renamed from: b */
    public abstract C10767a mo61644b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo61645b(Throwable th);

    /* renamed from: b */
    public void mo62253b(byte[] bArr) {
        this.f25813f = bArr;
    }

    /* renamed from: c */
    public List<String> mo62254c() {
        return this.f25816i;
    }

    /* renamed from: d */
    public C10839Vd mo62255d() {
        return new C10885Wd(this.f25808a);
    }

    /* renamed from: e */
    public int mo62256e() {
        return this.f25809b;
    }

    /* renamed from: f */
    public Map<String, List<String>> mo62257f() {
        return this.f25810c;
    }

    /* renamed from: g */
    public byte[] mo62258g() {
        return this.f25811d;
    }

    /* renamed from: h */
    public int mo62259h() {
        return this.f25812e;
    }

    /* renamed from: i */
    public byte[] mo62260i() {
        return this.f25813f;
    }

    /* renamed from: j */
    public C10167Ci mo61646j() {
        return null;
    }

    /* renamed from: k */
    public Long mo62261k() {
        return this.f25818k;
    }

    /* renamed from: l */
    public Integer mo62262l() {
        return this.f25819l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo62263m() {
        return this.f25812e == 400;
    }

    /* renamed from: n */
    public final boolean mo62264n() {
        C10768b bVar = C10768b.PREPARING;
        if (!m27743a(bVar)) {
            return false;
        }
        this.f25820m = bVar;
        return mo61647o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract boolean mo61647o();

    /* renamed from: p */
    public boolean mo62265p() {
        C10768b bVar = C10768b.EXECUTING;
        if (!m27743a(bVar)) {
            return false;
        }
        this.f25820m = bVar;
        int i = this.f25815h + 1;
        this.f25815h = i;
        Uri.Builder buildUpon = Uri.parse(this.f25816i.get(i)).buildUpon();
        mo61643a(buildUpon);
        this.f25808a = buildUpon.build().toString();
        return true;
    }

    /* renamed from: q */
    public final boolean mo62266q() {
        C10768b bVar = C10768b.SUCCESS;
        C10768b bVar2 = C10768b.FAILED;
        if (!m27743a(bVar, bVar2)) {
            return false;
        }
        boolean r = mo61648r();
        if (r) {
            this.f25820m = bVar;
        } else {
            this.f25820m = bVar2;
        }
        return r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo61648r();

    /* renamed from: s */
    public void mo61649s() {
        C10768b bVar = C10768b.SHOULD_NOT_EXECUTE;
        if (m27743a(bVar)) {
            this.f25820m = bVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo61650t();

    /* renamed from: u */
    public final boolean mo62267u() {
        C10768b bVar = C10768b.PENDING;
        if (!m27743a(bVar)) {
            return false;
        }
        boolean v = mo62268v();
        this.f25820m = bVar;
        return v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo62268v() {
        return true;
    }

    /* renamed from: w */
    public void mo62269w() {
        C10768b bVar = C10768b.FINISHED;
        if (m27743a(bVar)) {
            C10768b bVar2 = this.f25820m;
            if (bVar2 == C10768b.SUCCESS) {
                mo61650t();
            } else if (bVar2 == C10768b.FAILED || bVar2 == C10768b.SHOULD_NOT_EXECUTE) {
                mo61651y();
            }
            this.f25820m = bVar;
        }
    }

    /* renamed from: x */
    public void mo62270x() {
        C10768b bVar = C10768b.REMOVED;
        if (m27743a(bVar)) {
            this.f25820m = bVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo61651y() {
    }

    /* renamed from: z */
    public boolean mo61652z() {
        return false;
    }

    /* renamed from: a */
    public void mo62252a(byte[] bArr) {
        this.f25809b = 2;
        this.f25811d = bArr;
    }

    /* renamed from: a */
    public void mo62247a(int i) {
        this.f25812e = i;
    }

    /* renamed from: a */
    public String mo61642a() {
        return getClass().getName();
    }

    /* renamed from: a */
    public void mo62251a(List<String> list) {
        this.f25816i = list;
    }

    /* renamed from: a */
    public void mo62249a(String str, String... strArr) {
        this.f25810c.put(str, Arrays.asList(strArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62248a(long j) {
        this.f25818k = Long.valueOf(j);
        this.f25819l = Integer.valueOf(C11327i.m29162a(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27743a(com.yandex.metrica.impl.p265ob.C10766T1.C10768b... r9) {
        /*
            r8 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.yandex.metrica.impl.ob.T1$b r1 = r8.f25820m
            int r2 = r9.length
            r3 = 0
            r4 = 0
        L_0x0007:
            if (r4 >= r2) goto L_0x009c
            r5 = r9[r4]
            int r5 = r5.ordinal()
            r6 = 1
            switch(r5) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0080;
                case 2: goto L_0x0072;
                case 3: goto L_0x005b;
                case 4: goto L_0x004d;
                case 5: goto L_0x004d;
                case 6: goto L_0x0072;
                case 7: goto L_0x002a;
                case 8: goto L_0x0017;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x008d
        L_0x0017:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.EMPTY
            if (r1 != r5) goto L_0x001d
            goto L_0x008c
        L_0x001d:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.REMOVED
            if (r1 == r5) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x008d
        L_0x002a:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.SUCCESS
            if (r1 == r5) goto L_0x004a
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.FAILED
            if (r1 == r5) goto L_0x004a
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.SHOULD_NOT_EXECUTE
            if (r1 == r5) goto L_0x004a
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.PENDING
            if (r1 == r5) goto L_0x004a
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.PREPARING
            if (r1 == r5) goto L_0x004a
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.EXECUTING
            if (r1 != r5) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.REMOVED
            if (r1 != r5) goto L_0x008c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x008d
        L_0x004a:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x008d
        L_0x004d:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.EXECUTING
            if (r1 != r5) goto L_0x0054
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x008d
        L_0x0054:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.REMOVED
            if (r1 != r5) goto L_0x008c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x008d
        L_0x005b:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.PREPARING
            if (r1 == r5) goto L_0x006f
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.SUCCESS
            if (r1 == r5) goto L_0x006f
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.FAILED
            if (r1 != r5) goto L_0x0068
            goto L_0x006f
        L_0x0068:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.REMOVED
            if (r1 != r5) goto L_0x008c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x008d
        L_0x006f:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x008d
        L_0x0072:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.PENDING
            if (r1 != r5) goto L_0x0079
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x008d
        L_0x0079:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.REMOVED
            if (r1 != r5) goto L_0x008c
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x008d
        L_0x0080:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p265ob.C10766T1.C10768b.EMPTY
            if (r1 != r5) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r7 = r7.equals(r5)
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0098
            r0 = r5
            goto L_0x009c
        L_0x0098:
            int r4 = r4 + 1
            goto L_0x0007
        L_0x009c:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r9.equals(r0)
            boolean r9 = r9.equals(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10766T1.m27743a(com.yandex.metrica.impl.ob.T1$b[]):boolean");
    }
}
