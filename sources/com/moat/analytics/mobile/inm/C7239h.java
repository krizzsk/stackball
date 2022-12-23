package com.moat.analytics.mobile.inm;

import android.view.View;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.h */
abstract class C7239h extends C7228c {

    /* renamed from: l */
    int f18141l = Integer.MIN_VALUE;

    /* renamed from: m */
    private C7241a f18142m = C7241a.UNINITIALIZED;

    /* renamed from: n */
    private int f18143n = Integer.MIN_VALUE;

    /* renamed from: o */
    private double f18144o = Double.NaN;

    /* renamed from: p */
    private int f18145p = Integer.MIN_VALUE;

    /* renamed from: q */
    private int f18146q = 0;

    /* renamed from: com.moat.analytics.mobile.inm.h$a */
    enum C7241a {
        UNINITIALIZED,
        PAUSED,
        PLAYING,
        STOPPED,
        COMPLETED
    }

    C7239h(String str) {
        super(str);
    }

    /* renamed from: t */
    private void m18437t() {
        this.f18115i.postDelayed(new Runnable() {
            public void run() {
                try {
                    if (!C7239h.this.mo49376n() || C7239h.this.mo49363m()) {
                        C7239h.this.mo49362l();
                    } else if (C7239h.this.mo49381s()) {
                        C7239h.this.f18115i.postDelayed(this, 200);
                    } else {
                        C7239h.this.mo49362l();
                    }
                } catch (Exception e) {
                    C7239h.this.mo49362l();
                    C7252m.m18508a(e);
                }
            }
        }, 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo49355a(MoatAdEvent moatAdEvent) {
        Integer num;
        int i;
        if (!moatAdEvent.f18084b.equals(MoatAdEvent.f18082a)) {
            num = moatAdEvent.f18084b;
        } else {
            try {
                num = mo49377o();
            } catch (Exception unused) {
                num = Integer.valueOf(this.f18143n);
            }
            moatAdEvent.f18084b = num;
        }
        if (moatAdEvent.f18084b.intValue() < 0 || (moatAdEvent.f18084b.intValue() == 0 && moatAdEvent.f18086d == MoatAdEventType.AD_EVT_COMPLETE && this.f18143n > 0)) {
            num = Integer.valueOf(this.f18143n);
            moatAdEvent.f18084b = num;
        }
        if (moatAdEvent.f18086d == MoatAdEventType.AD_EVT_COMPLETE) {
            if (num.intValue() == Integer.MIN_VALUE || (i = this.f18141l) == Integer.MIN_VALUE || !mo49356a(num, Integer.valueOf(i))) {
                this.f18142m = C7241a.STOPPED;
                moatAdEvent.f18086d = MoatAdEventType.AD_EVT_STOPPED;
            } else {
                this.f18142m = C7241a.COMPLETED;
            }
        }
        return super.mo49355a(moatAdEvent);
    }

    /* renamed from: a */
    public boolean mo49357a(Map<String, String> map, View view) {
        try {
            boolean a = super.mo49357a(map, view);
            if (!a || !mo49378p()) {
                return a;
            }
            m18437t();
            return a;
        } catch (Exception e) {
            C7261p.m18544a(3, "IntervalVideoTracker", (Object) this, "Problem with video loop");
            mo49340a("trackVideoAd", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract boolean mo49376n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract Integer mo49377o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo49378p() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo49379q();

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract Integer mo49380r();

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096 A[Catch:{ Exception -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[Catch:{ Exception -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8 A[Catch:{ Exception -> 0x00cd }] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49381s() {
        /*
            r12 = this;
            boolean r0 = r12.mo49376n()
            r1 = 0
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r12.mo49363m()
            if (r0 == 0) goto L_0x000f
            goto L_0x00d8
        L_0x000f:
            r0 = 1
            java.lang.Integer r2 = r12.mo49377o()     // Catch:{ Exception -> 0x00cd }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x00cd }
            int r3 = r12.f18143n     // Catch:{ Exception -> 0x00cd }
            if (r3 < 0) goto L_0x001f
            if (r2 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            r12.f18143n = r2     // Catch:{ Exception -> 0x00cd }
            if (r2 != 0) goto L_0x0024
            return r0
        L_0x0024:
            java.lang.Integer r3 = r12.mo49380r()     // Catch:{ Exception -> 0x00cd }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x00cd }
            boolean r4 = r12.mo49379q()     // Catch:{ Exception -> 0x00cd }
            double r5 = (double) r3     // Catch:{ Exception -> 0x00cd }
            r7 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r5 = r5 / r7
            java.lang.Double r7 = r12.mo49360j()     // Catch:{ Exception -> 0x00cd }
            double r7 = r7.doubleValue()     // Catch:{ Exception -> 0x00cd }
            r9 = 0
            int r10 = r12.f18145p     // Catch:{ Exception -> 0x00cd }
            if (r2 <= r10) goto L_0x0043
            r12.f18145p = r2     // Catch:{ Exception -> 0x00cd }
        L_0x0043:
            int r10 = r12.f18141l     // Catch:{ Exception -> 0x00cd }
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r11) goto L_0x004b
            r12.f18141l = r3     // Catch:{ Exception -> 0x00cd }
        L_0x004b:
            if (r4 == 0) goto L_0x0089
            com.moat.analytics.mobile.inm.h$a r3 = r12.f18142m     // Catch:{ Exception -> 0x00cd }
            com.moat.analytics.mobile.inm.h$a r4 = com.moat.analytics.mobile.inm.C7239h.C7241a.UNINITIALIZED     // Catch:{ Exception -> 0x00cd }
            if (r3 != r4) goto L_0x005a
            com.moat.analytics.mobile.inm.MoatAdEventType r9 = com.moat.analytics.mobile.inm.MoatAdEventType.AD_EVT_START     // Catch:{ Exception -> 0x00cd }
            com.moat.analytics.mobile.inm.h$a r3 = com.moat.analytics.mobile.inm.C7239h.C7241a.PLAYING     // Catch:{ Exception -> 0x00cd }
        L_0x0057:
            r12.f18142m = r3     // Catch:{ Exception -> 0x00cd }
            goto L_0x0094
        L_0x005a:
            com.moat.analytics.mobile.inm.h$a r3 = r12.f18142m     // Catch:{ Exception -> 0x00cd }
            com.moat.analytics.mobile.inm.h$a r4 = com.moat.analytics.mobile.inm.C7239h.C7241a.PAUSED     // Catch:{ Exception -> 0x00cd }
            if (r3 != r4) goto L_0x0065
            com.moat.analytics.mobile.inm.MoatAdEventType r9 = com.moat.analytics.mobile.inm.MoatAdEventType.AD_EVT_PLAYING     // Catch:{ Exception -> 0x00cd }
            com.moat.analytics.mobile.inm.h$a r3 = com.moat.analytics.mobile.inm.C7239h.C7241a.PLAYING     // Catch:{ Exception -> 0x00cd }
            goto L_0x0057
        L_0x0065:
            double r3 = (double) r2     // Catch:{ Exception -> 0x00cd }
            double r3 = r3 / r5
            double r3 = java.lang.Math.floor(r3)     // Catch:{ Exception -> 0x00cd }
            int r3 = (int) r3     // Catch:{ Exception -> 0x00cd }
            int r3 = r3 - r0
            if (r3 < 0) goto L_0x0094
            r4 = 3
            if (r3 >= r4) goto L_0x0094
            com.moat.analytics.mobile.inm.MoatAdEventType[] r4 = f18113g     // Catch:{ Exception -> 0x00cd }
            r3 = r4[r3]     // Catch:{ Exception -> 0x00cd }
            java.util.Map r4 = r12.f18114h     // Catch:{ Exception -> 0x00cd }
            boolean r4 = r4.containsKey(r3)     // Catch:{ Exception -> 0x00cd }
            if (r4 != 0) goto L_0x0094
            java.util.Map r4 = r12.f18114h     // Catch:{ Exception -> 0x00cd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00cd }
            r4.put(r3, r5)     // Catch:{ Exception -> 0x00cd }
            r9 = r3
            goto L_0x0094
        L_0x0089:
            com.moat.analytics.mobile.inm.h$a r3 = r12.f18142m     // Catch:{ Exception -> 0x00cd }
            com.moat.analytics.mobile.inm.h$a r4 = com.moat.analytics.mobile.inm.C7239h.C7241a.PAUSED     // Catch:{ Exception -> 0x00cd }
            if (r3 == r4) goto L_0x0094
            com.moat.analytics.mobile.inm.MoatAdEventType r9 = com.moat.analytics.mobile.inm.MoatAdEventType.AD_EVT_PAUSED     // Catch:{ Exception -> 0x00cd }
            com.moat.analytics.mobile.inm.h$a r3 = com.moat.analytics.mobile.inm.C7239h.C7241a.PAUSED     // Catch:{ Exception -> 0x00cd }
            goto L_0x0057
        L_0x0094:
            if (r9 == 0) goto L_0x0098
            r3 = 1
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            if (r3 != 0) goto L_0x00b6
            double r4 = r12.f18144o     // Catch:{ Exception -> 0x00cd }
            boolean r4 = java.lang.Double.isNaN(r4)     // Catch:{ Exception -> 0x00cd }
            if (r4 != 0) goto L_0x00b6
            double r4 = r12.f18144o     // Catch:{ Exception -> 0x00cd }
            double r4 = r4 - r7
            double r4 = java.lang.Math.abs(r4)     // Catch:{ Exception -> 0x00cd }
            r10 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b6
            com.moat.analytics.mobile.inm.MoatAdEventType r9 = com.moat.analytics.mobile.inm.MoatAdEventType.AD_EVT_VOLUME_CHANGE     // Catch:{ Exception -> 0x00cd }
            r3 = 1
        L_0x00b6:
            if (r3 == 0) goto L_0x00c8
            com.moat.analytics.mobile.inm.MoatAdEvent r3 = new com.moat.analytics.mobile.inm.MoatAdEvent     // Catch:{ Exception -> 0x00cd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.Double r4 = r12.mo49361k()     // Catch:{ Exception -> 0x00cd }
            r3.<init>(r9, r2, r4)     // Catch:{ Exception -> 0x00cd }
            r12.dispatchEvent(r3)     // Catch:{ Exception -> 0x00cd }
        L_0x00c8:
            r12.f18144o = r7     // Catch:{ Exception -> 0x00cd }
            r12.f18146q = r1     // Catch:{ Exception -> 0x00cd }
            return r0
        L_0x00cd:
            int r2 = r12.f18146q
            int r3 = r2 + 1
            r12.f18146q = r3
            r3 = 5
            if (r2 >= r3) goto L_0x00d8
            return r0
        L_0x00d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moat.analytics.mobile.inm.C7239h.mo49381s():boolean");
    }

    public void setPlayerVolume(Double d) {
        super.setPlayerVolume(d);
        this.f18144o = mo49360j().doubleValue();
    }

    public void stopTracking() {
        try {
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
            super.stopTracking();
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }
}
