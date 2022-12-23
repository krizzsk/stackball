package com.inmobi.media;

/* renamed from: com.inmobi.media.fi */
/* compiled from: NetworkType */
public final class C5258fi {
    public C5259a others;
    public C5259a wifi;

    /* renamed from: a */
    public final boolean mo40578a(int i) {
        return this.wifi.mo40579a(i) && this.others.mo40579a(i);
    }

    /* renamed from: com.inmobi.media.fi$a */
    /* compiled from: NetworkType */
    public static final class C5259a {
        public int maxBatchSize;
        public int minBatchSize;
        public long retryInterval;

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
            r6 = r5.minBatchSize;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo40579a(int r6) {
            /*
                r5 = this;
                int r0 = r5.maxBatchSize
                if (r0 > r6) goto L_0x0016
                long r1 = r5.retryInterval
                r3 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L_0x0016
                if (r0 <= 0) goto L_0x0016
                int r6 = r5.minBatchSize
                if (r6 <= 0) goto L_0x0016
                if (r6 > r0) goto L_0x0016
                r6 = 1
                return r6
            L_0x0016:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5258fi.C5259a.mo40579a(int):boolean");
        }
    }
}
