package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import com.appsflyer.ServerParameters;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.fd */
class C11239fd extends C10621P2<Location> {

    /* renamed from: d */
    public static final long f26904d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: e */
    public static final List<String> f26905e = Arrays.asList(new String[]{"gps", ServerParameters.NETWORK});

    /* renamed from: c */
    private C11240a f26906c;

    /* renamed from: com.yandex.metrica.impl.ob.fd$a */
    public static class C11240a {

        /* renamed from: a */
        public final long f26907a;

        public C11240a(long j, long j2, long j3) {
            this.f26907a = j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11239fd(com.yandex.metrica.impl.p265ob.C11659pi r9) {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.fd$a r7 = new com.yandex.metrica.impl.ob.fd$a
            long r1 = f26904d
            r3 = 200(0xc8, double:9.9E-322)
            r5 = 50
            r0 = r7
            r0.<init>(r1, r3, r5)
            if (r9 == 0) goto L_0x0011
            long r0 = r9.f27983c
            goto L_0x0015
        L_0x0011:
            com.yandex.metrica.impl.ob.kg$c r0 = com.yandex.metrica.impl.p265ob.C10582O.f25302e
            long r0 = r0.f27453d
        L_0x0015:
            r2 = r0
            r0 = 2
            if (r9 == 0) goto L_0x001d
            long r4 = r9.f27983c
            goto L_0x0021
        L_0x001d:
            com.yandex.metrica.impl.ob.kg$c r9 = com.yandex.metrica.impl.p265ob.C10582O.f25302e
            long r4 = r9.f27453d
        L_0x0021:
            long r4 = r4 * r0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11239fd.<init>(com.yandex.metrica.impl.ob.pi):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo61942a(Object obj) {
        Location location = (Location) obj;
        return f26905e.contains(location.getProvider()) && (this.f25435a.mo61847b() || this.f25435a.mo61849d() || m28978a(location, (Location) this.f25435a.mo61844a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo61943b(C11659pi piVar) {
        return piVar.f27983c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo61940a(C11659pi piVar) {
        return piVar.f27983c * 2;
    }

    /* renamed from: a */
    private boolean m28978a(Location location, Location location2) {
        boolean z;
        long j = this.f26906c.f26907a;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > j;
        boolean z3 = time < (-j);
        boolean z4 = time > 0;
        if (z2) {
            return true;
        }
        if (!z3) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z5 = accuracy > 0;
            boolean z6 = accuracy < 0;
            boolean z7 = ((long) accuracy) > 200;
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider == null) {
                z = provider2 == null;
            } else {
                z = provider.equals(provider2);
            }
            if (z6) {
                return true;
            }
            if (z4 && !z5) {
                return true;
            }
            if (!z4 || z7 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    C11239fd(C11240a aVar, long j, long j2) {
        super(j, j2);
        this.f26906c = aVar;
    }
}
