package com.mbridge.msdk.video.p214bt.module.p217b;

import android.content.Context;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import com.mbridge.msdk.videocommon.p239d.C7179c;

/* renamed from: com.mbridge.msdk.video.bt.module.b.d */
/* compiled from: ProxyShowRewardListener */
public final class C6917d extends C6915b {

    /* renamed from: a */
    private C6922h f17054a;

    /* renamed from: b */
    private C7179c f17055b;

    /* renamed from: c */
    private String f17056c;

    /* renamed from: d */
    private String f17057d;

    /* renamed from: e */
    private boolean f17058e;

    /* renamed from: f */
    private Context f17059f;

    /* renamed from: g */
    private boolean f17060g = false;

    /* renamed from: h */
    private boolean f17061h = false;

    /* renamed from: i */
    private boolean f17062i = false;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e A[Catch:{ Exception -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6917d(android.content.Context r4, boolean r5, com.mbridge.msdk.videocommon.p239d.C7179c r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.video.p214bt.module.p217b.C6922h r8, java.lang.String r9, java.lang.String r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f17060g = r0
            r3.f17061h = r0
            r3.f17062i = r0
            r3.f17054a = r8
            r3.f17055b = r6
            r3.f17056c = r10
            r3.f17057d = r9
            r3.f17058e = r5
            r3.f17059f = r4
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = r4.mo42896e()     // Catch:{ Exception -> 0x0072 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0072 }
            r8 = 0
            if (r5 != 0) goto L_0x0043
            com.mbridge.msdk.b.b r5 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x0072 }
            com.mbridge.msdk.b.a r4 = r5.mo42749b(r4)     // Catch:{ Exception -> 0x0072 }
            if (r4 != 0) goto L_0x0038
            com.mbridge.msdk.b.b r4 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x0072 }
            com.mbridge.msdk.b.a r4 = r4.mo42748b()     // Catch:{ Exception -> 0x0072 }
        L_0x0038:
            if (r4 == 0) goto L_0x0043
            long r4 = r4.mo42726p()     // Catch:{ Exception -> 0x0072 }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            goto L_0x0044
        L_0x0043:
            r4 = r8
        L_0x0044:
            com.mbridge.msdk.videocommon.d.b r10 = com.mbridge.msdk.videocommon.p239d.C7177b.m18135a()     // Catch:{ Exception -> 0x0072 }
            com.mbridge.msdk.videocommon.d.a r10 = r10.mo49112b()     // Catch:{ Exception -> 0x0072 }
            if (r10 == 0) goto L_0x0052
            long r8 = r10.mo49098d()     // Catch:{ Exception -> 0x0072 }
        L_0x0052:
            if (r7 == 0) goto L_0x0072
            boolean r4 = r7.isSpareOffer(r8, r4)     // Catch:{ Exception -> 0x0072 }
            if (r4 == 0) goto L_0x006c
            r4 = 1
            r7.setSpareOfferFlag(r4)     // Catch:{ Exception -> 0x0072 }
            int r5 = r6.mo49168y()     // Catch:{ Exception -> 0x0072 }
            if (r5 != r4) goto L_0x0068
            r7.setCbt(r4)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0072
        L_0x0068:
            r7.setCbt(r0)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0072
        L_0x006c:
            r7.setSpareOfferFlag(r0)     // Catch:{ Exception -> 0x0072 }
            r7.setCbt(r0)     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.module.p217b.C6917d.<init>(android.content.Context, boolean, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.video.bt.module.b.h, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo47003a() {
        super.mo47003a();
        C6922h hVar = this.f17054a;
        if (hVar != null && !this.f17060g) {
            this.f17060g = true;
            hVar.mo47003a();
            this.f17054a.mo47004a(2, this.f17057d, this.f17056c);
        }
    }

    /* renamed from: a */
    public final void mo47008a(boolean z, C7170c cVar) {
        super.mo47008a(z, cVar);
        C6922h hVar = this.f17054a;
        if (hVar != null && !this.f17062i) {
            this.f17062i = true;
            hVar.mo47004a(7, this.f17057d, this.f17056c);
            this.f17054a.mo47008a(z, cVar);
        }
    }

    /* renamed from: a */
    public final void mo47007a(boolean z, int i) {
        super.mo47007a(z, i);
        C6922h hVar = this.f17054a;
        if (hVar != null && !this.f17062i) {
            hVar.mo47007a(z, i);
        }
    }

    /* renamed from: a */
    public final void mo47005a(String str) {
        super.mo47005a(str);
        C6922h hVar = this.f17054a;
        if (hVar != null && !this.f17061h) {
            this.f17061h = true;
            hVar.mo47005a(str);
            this.f17054a.mo47004a(4, this.f17057d, this.f17056c);
        }
    }

    /* renamed from: a */
    public final void mo47009a(boolean z, String str, String str2) {
        super.mo47009a(z, str, str2);
        C6922h hVar = this.f17054a;
        if (hVar != null) {
            hVar.mo47009a(z, str, str2);
        }
    }

    /* renamed from: b */
    public final void mo47010b(String str, String str2) {
        super.mo47010b(str, str2);
        C6922h hVar = this.f17054a;
        if (hVar != null) {
            hVar.mo47010b(str, str2);
            this.f17054a.mo47004a(6, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo47006a(String str, String str2) {
        super.mo47006a(str, str2);
        C6922h hVar = this.f17054a;
        if (hVar != null) {
            hVar.mo47006a(str, str2);
            this.f17054a.mo47004a(5, str, str2);
        }
    }
}
