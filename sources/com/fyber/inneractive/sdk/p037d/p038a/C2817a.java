package com.fyber.inneractive.sdk.p037d.p038a;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.p047g.p048a.C2916a;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2918c;
import com.fyber.inneractive.sdk.p047g.p048a.C2919d;
import com.fyber.inneractive.sdk.p047g.p048a.C2921f;
import com.fyber.inneractive.sdk.p047g.p048a.C2922g;
import com.fyber.inneractive.sdk.p047g.p048a.C2923h;
import com.fyber.inneractive.sdk.p047g.p048a.C2925j;
import com.fyber.inneractive.sdk.p047g.p048a.C2928m;
import com.fyber.inneractive.sdk.p047g.p048a.C2932q;
import com.fyber.inneractive.sdk.p047g.p048a.C2933r;
import com.fyber.inneractive.sdk.p047g.p048a.C2934s;
import com.fyber.inneractive.sdk.p051j.C3022i;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.d.a.a */
public final class C2817a {

    /* renamed from: a */
    public int f6675a = -1;

    /* renamed from: b */
    public int f6676b = -1;

    /* renamed from: c */
    public int f6677c = -1;

    /* renamed from: d */
    public boolean f6678d = false;

    /* renamed from: e */
    public boolean f6679e = false;

    /* renamed from: f */
    public Map<C2928m, C2820c> f6680f = new LinkedHashMap();

    /* renamed from: g */
    public List<C2921f> f6681g = new ArrayList();

    /* renamed from: a */
    public final C2916a mo18094a(C2918c cVar, List<C2918c> list) throws C2823e {
        IAlog.m9034b("%sprocess started", "VastProcessor: ");
        if (cVar == null || cVar.f6961c == null) {
            IAlog.m9034b("%sno inline found", "VastProcessor: ");
            throw new C2823e("ErrorNoMediaFiles", "Empty inline ad found");
        }
        int x = C3657l.m9133x();
        int w = C3657l.m9132w();
        C2916a aVar = new C2916a(new C2822d(this.f6677c, x, w), new C2819b(x, w));
        aVar.f6940a = cVar.f6959a;
        List<C2925j> list2 = cVar.f6961c.f6965d;
        if (list2 == null || list2.isEmpty()) {
            throw new C2823e("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        if (list != null) {
            for (C2918c cVar2 : list) {
                C2934s sVar = cVar2.f6960b;
                if (sVar != null) {
                    m6168a(aVar, (C2919d) sVar);
                }
            }
        }
        m6168a(aVar, (C2919d) cVar.f6961c);
        if (aVar.f6944e.size() != 0) {
            if (IAlog.f9870a == 2) {
                IAlog.m9033a("%sLogging merged model media files: ", "VastProcessor: ");
                int i = 0;
                for (C2928m mVar : aVar.mo18378b()) {
                    IAlog.m9033a("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), mVar);
                    i++;
                }
            }
            if (IAlog.f9870a == 2) {
                IAlog.m9033a("%sLogging merged model companion ads: ", "VastProcessor: ");
                ArrayList<C2917b> arrayList = new ArrayList<>(aVar.f6945f);
                if (arrayList.size() > 0) {
                    int i2 = 0;
                    for (C2917b a : arrayList) {
                        IAlog.m9033a("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), a.mo18379a());
                        i2++;
                    }
                } else {
                    IAlog.m9033a("%sNo companion ads found!", "VastProcessor: ");
                }
            }
            return aVar;
        } else if (this.f6680f.size() == 0) {
            throw new C2823e("ErrorNoMediaFiles", "No media files exist after merge");
        } else {
            throw new C2823e("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0240 A[Catch:{ a -> 0x0386 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x028b A[Catch:{ a -> 0x0386 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0348 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x033f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6168a(com.fyber.inneractive.sdk.p047g.p048a.C2916a r25, com.fyber.inneractive.sdk.p047g.p048a.C2919d r26) {
        /*
            r24 = this;
            r1 = r24
            r11 = r25
            r0 = r26
            r12 = 2
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r13 = 0
            java.lang.String r14 = "VastProcessor: "
            r2[r13] = r14
            r15 = 1
            r2[r15] = r0
            java.lang.String r3 = "%sprocessing ad element: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r2)
            java.util.List<java.lang.String> r2 = r0.f6964c
            if (r2 == 0) goto L_0x003b
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r13] = r14
            r4[r15] = r3
            java.lang.String r5 = "%sadding impression url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r5, r4)
            com.fyber.inneractive.sdk.g.a.r r4 = com.fyber.inneractive.sdk.p047g.p048a.C2933r.EVENT_IMPRESSION
            m6170a(r11, r4, r3)
            goto L_0x001e
        L_0x003b:
            java.lang.String r2 = r0.f6963b
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0053
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r13] = r14
            r3[r15] = r2
            java.lang.String r4 = "%sadding error url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r4, r3)
            com.fyber.inneractive.sdk.g.a.r r3 = com.fyber.inneractive.sdk.p047g.p048a.C2933r.EVENT_ERROR
            r11.mo18377a(r3, r2)
        L_0x0053:
            java.util.List<com.fyber.inneractive.sdk.g.a.j> r0 = r0.f6965d
            java.util.Iterator r16 = r0.iterator()
        L_0x0059:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03a6
            java.lang.Object r0 = r16.next()
            com.fyber.inneractive.sdk.g.a.j r0 = (com.fyber.inneractive.sdk.p047g.p048a.C2925j) r0
            com.fyber.inneractive.sdk.g.a.l r2 = r0.f6998d
            if (r2 == 0) goto L_0x01d8
            java.util.List<com.fyber.inneractive.sdk.g.a.m> r3 = r2.f7002a
            if (r3 == 0) goto L_0x018e
            int r4 = r3.size()
            r11.f6948i = r4
            java.util.Iterator r3 = r3.iterator()
        L_0x0077:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x018e
            java.lang.Object r4 = r3.next()
            com.fyber.inneractive.sdk.g.a.m r4 = (com.fyber.inneractive.sdk.p047g.p048a.C2928m) r4
            java.lang.String r5 = r4.f7007a
            com.fyber.inneractive.sdk.g.a.n r6 = com.fyber.inneractive.sdk.p047g.p048a.C2929n.progressive
            java.lang.String r6 = r6.f7020c
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x009c
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.UNSUPPORTED_DELIVERY
            com.fyber.inneractive.sdk.g.a.n r7 = com.fyber.inneractive.sdk.p047g.p048a.C2929n.progressive
            java.lang.String r7 = r7.f7020c
            r5.<init>(r6, r7)
            goto L_0x014f
        L_0x009c:
            int r5 = r1.f6676b
            if (r5 < 0) goto L_0x00a2
            r5 = 1
            goto L_0x00a3
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            if (r5 == 0) goto L_0x00e3
            java.lang.Integer r5 = r4.f7012f
            if (r5 == 0) goto L_0x00e3
            java.lang.Integer r5 = r4.f7012f
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x00e3
            java.lang.Integer r5 = r4.f7012f
            int r5 = r5.intValue()
            int r6 = r1.f6675a
            if (r5 >= r6) goto L_0x00ca
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.BITRATE_NOT_IN_RANGE
            int r7 = r1.f6675a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.<init>(r6, r7)
            goto L_0x014f
        L_0x00ca:
            java.lang.Integer r5 = r4.f7012f
            int r5 = r5.intValue()
            int r6 = r1.f6676b
            if (r5 <= r6) goto L_0x00e3
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.BITRATE_NOT_IN_RANGE
            int r7 = r1.f6676b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.<init>(r6, r7)
            goto L_0x014f
        L_0x00e3:
            java.lang.String r5 = r4.f7010d
            com.fyber.inneractive.sdk.g.a.o r5 = com.fyber.inneractive.sdk.p047g.p048a.C2930o.m6557a(r5)
            com.fyber.inneractive.sdk.g.a.o r6 = com.fyber.inneractive.sdk.p047g.p048a.C2930o.UNKNOWN
            if (r5 == r6) goto L_0x00ef
            r5 = 1
            goto L_0x00f0
        L_0x00ef:
            r5 = 0
        L_0x00f0:
            if (r5 != 0) goto L_0x00fa
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.UNSUPPORTED_MIME_TYPE
            r5.<init>(r6)
            goto L_0x014f
        L_0x00fa:
            boolean r5 = r1.f6678d
            if (r5 == 0) goto L_0x0114
            java.lang.Integer r5 = r4.f7008b
            int r5 = r5.intValue()
            java.lang.Integer r6 = r4.f7009c
            int r6 = r6.intValue()
            if (r5 < r6) goto L_0x0114
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.VERTICAL_VIDEO_EXPECTED
            r5.<init>(r6)
            goto L_0x014f
        L_0x0114:
            java.lang.String r5 = r4.f7013g
            if (r5 == 0) goto L_0x012e
            boolean r5 = r1.f6679e
            if (r5 == 0) goto L_0x012e
            java.lang.String r5 = r4.f7013g
            java.lang.String r6 = "VPAID"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x012e
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.FILTERED_BY_APP_OR_UNIT
            r5.<init>(r6)
            goto L_0x014f
        L_0x012e:
            java.lang.String r5 = r4.f7016j
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x013e
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.NO_CONTENT
            r5.<init>(r6)
            goto L_0x014f
        L_0x013e:
            java.lang.String r5 = r4.f7016j
            boolean r5 = com.fyber.inneractive.sdk.util.C3685u.m9187g(r5)
            if (r5 != 0) goto L_0x014e
            com.fyber.inneractive.sdk.d.a.c r5 = new com.fyber.inneractive.sdk.d.a.c
            com.fyber.inneractive.sdk.d.a.c$a r6 = com.fyber.inneractive.sdk.p037d.p038a.C2820c.C2821a.UNSECURED_VIDEO_URL
            r5.<init>(r6)
            goto L_0x014f
        L_0x014e:
            r5 = 0
        L_0x014f:
            if (r5 == 0) goto L_0x0177
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r13] = r14
            r6[r15] = r4
            java.lang.String r7 = "%smedia file filtered!: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r13] = r14
            r6[r15] = r4
            java.lang.String r7 = "%s-- %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r13] = r14
            r6[r15] = r5
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r7, r6)
            java.util.Map<com.fyber.inneractive.sdk.g.a.m, com.fyber.inneractive.sdk.d.a.c> r6 = r1.f6680f
            r6.put(r4, r5)
            goto L_0x0077
        L_0x0177:
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r5[r13] = r14
            r5[r15] = r4
            java.lang.String r6 = "%sadding media file: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r6, r5)
            java.util.PriorityQueue<com.fyber.inneractive.sdk.g.a.m> r5 = r11.f6944e
            r5.add(r4)
            int r4 = r11.f6947h
            int r4 = r4 + r15
            r11.f6947h = r4
            goto L_0x0077
        L_0x018e:
            java.util.List<java.lang.String> r3 = r2.f7005d
            if (r3 == 0) goto L_0x01a8
            java.util.Iterator r3 = r3.iterator()
        L_0x0196:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01a8
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.fyber.inneractive.sdk.g.a.r r5 = com.fyber.inneractive.sdk.p047g.p048a.C2933r.EVENT_CLICK
            m6170a(r11, r5, r4)
            goto L_0x0196
        L_0x01a8:
            java.util.List<com.fyber.inneractive.sdk.g.a.q> r3 = r2.f7003b
            if (r3 == 0) goto L_0x01cc
            java.util.Iterator r3 = r3.iterator()
        L_0x01b0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01cc
            java.lang.Object r4 = r3.next()
            com.fyber.inneractive.sdk.g.a.q r4 = (com.fyber.inneractive.sdk.p047g.p048a.C2932q) r4
            java.lang.String r5 = r4.f7030a
            com.fyber.inneractive.sdk.g.a.r r5 = com.fyber.inneractive.sdk.p047g.p048a.C2933r.m6560a(r5)
            com.fyber.inneractive.sdk.g.a.r r6 = com.fyber.inneractive.sdk.p047g.p048a.C2933r.UNKNOWN
            if (r5 == r6) goto L_0x01b0
            java.lang.String r4 = r4.f7031b
            r11.mo18377a(r5, r4)
            goto L_0x01b0
        L_0x01cc:
            java.lang.String r3 = r2.f7004c
            r11.f6941b = r3
            java.lang.String r2 = r2.f7006e
            int r2 = m6167a(r2)
            r11.f6942c = r2
        L_0x01d8:
            java.util.List<com.fyber.inneractive.sdk.g.a.f> r0 = r0.f6999e
            if (r0 == 0) goto L_0x03a2
            java.util.Iterator r17 = r0.iterator()
        L_0x01e0:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r0 = r17.next()
            r10 = r0
            com.fyber.inneractive.sdk.g.a.f r10 = (com.fyber.inneractive.sdk.p047g.p048a.C2921f) r10
            java.lang.String r0 = r10.f6974f     // Catch:{ a -> 0x0386 }
            boolean r2 = com.fyber.inneractive.sdk.util.C3685u.m9187g(r0)     // Catch:{ a -> 0x0386 }
            if (r2 == 0) goto L_0x036f
            java.util.List<java.lang.String> r9 = r10.f6975g     // Catch:{ a -> 0x0386 }
            if (r9 == 0) goto L_0x0224
            java.util.Iterator r2 = r9.iterator()     // Catch:{ a -> 0x0386 }
        L_0x01fd:
            boolean r3 = r2.hasNext()     // Catch:{ a -> 0x0386 }
            if (r3 == 0) goto L_0x0224
            java.lang.Object r3 = r2.next()     // Catch:{ a -> 0x0386 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ a -> 0x0386 }
            boolean r3 = com.fyber.inneractive.sdk.util.C3685u.m9187g(r3)     // Catch:{ a -> 0x0386 }
            if (r3 == 0) goto L_0x0210
            goto L_0x01fd
        L_0x0210:
            com.fyber.inneractive.sdk.d.a.a$a r0 = new com.fyber.inneractive.sdk.d.a.a$a     // Catch:{ a -> 0x0386 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x0386 }
            java.lang.String r3 = "Found non secure click tracking url for companion: "
            r2.<init>(r3)     // Catch:{ a -> 0x0386 }
            r2.append(r10)     // Catch:{ a -> 0x0386 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x0386 }
            r0.<init>(r2, r13)     // Catch:{ a -> 0x0386 }
            throw r0     // Catch:{ a -> 0x0386 }
        L_0x0224:
            java.lang.Integer r8 = r10.f6969a     // Catch:{ a -> 0x0386 }
            java.lang.Integer r7 = r10.f6970b     // Catch:{ a -> 0x0386 }
            if (r8 == 0) goto L_0x023d
            if (r7 != 0) goto L_0x022d
            goto L_0x023d
        L_0x022d:
            int r2 = r8.intValue()     // Catch:{ a -> 0x0386 }
            r3 = 100
            if (r2 < r3) goto L_0x023d
            int r2 = r7.intValue()     // Catch:{ a -> 0x0386 }
            if (r2 < r3) goto L_0x023d
            r2 = 1
            goto L_0x023e
        L_0x023d:
            r2 = 0
        L_0x023e:
            if (r2 == 0) goto L_0x0348
            java.util.List<com.fyber.inneractive.sdk.g.a.q> r6 = r10.f6977i     // Catch:{ a -> 0x0386 }
            if (r6 == 0) goto L_0x0271
            java.util.Iterator r2 = r6.iterator()     // Catch:{ a -> 0x0386 }
        L_0x0248:
            boolean r3 = r2.hasNext()     // Catch:{ a -> 0x0386 }
            if (r3 == 0) goto L_0x0271
            java.lang.Object r3 = r2.next()     // Catch:{ a -> 0x0386 }
            com.fyber.inneractive.sdk.g.a.q r3 = (com.fyber.inneractive.sdk.p047g.p048a.C2932q) r3     // Catch:{ a -> 0x0386 }
            java.lang.String r4 = r3.f7031b     // Catch:{ a -> 0x0386 }
            boolean r4 = com.fyber.inneractive.sdk.util.C3685u.m9187g(r4)     // Catch:{ a -> 0x0386 }
            if (r4 == 0) goto L_0x025d
            goto L_0x0248
        L_0x025d:
            com.fyber.inneractive.sdk.d.a.a$a r0 = new com.fyber.inneractive.sdk.d.a.a$a     // Catch:{ a -> 0x0386 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x0386 }
            java.lang.String r4 = "Found non secure tracking event: "
            r2.<init>(r4)     // Catch:{ a -> 0x0386 }
            r2.append(r3)     // Catch:{ a -> 0x0386 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x0386 }
            r0.<init>(r2, r13)     // Catch:{ a -> 0x0386 }
            throw r0     // Catch:{ a -> 0x0386 }
        L_0x0271:
            java.lang.String r2 = r10.f6972d     // Catch:{ a -> 0x0386 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ a -> 0x0386 }
            if (r2 == 0) goto L_0x0288
            java.lang.String r2 = r10.f6973e     // Catch:{ a -> 0x0386 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ a -> 0x0386 }
            if (r2 == 0) goto L_0x0288
            com.fyber.inneractive.sdk.g.a.i r2 = r10.f6971c     // Catch:{ a -> 0x0386 }
            if (r2 == 0) goto L_0x0286
            goto L_0x0288
        L_0x0286:
            r2 = 0
            goto L_0x0289
        L_0x0288:
            r2 = 1
        L_0x0289:
            if (r2 == 0) goto L_0x033f
            java.lang.String r5 = r10.f6972d     // Catch:{ a -> 0x0386 }
            boolean r2 = com.fyber.inneractive.sdk.util.C3685u.m9187g(r5)     // Catch:{ a -> 0x0386 }
            if (r2 == 0) goto L_0x0326
            com.fyber.inneractive.sdk.g.a.i r2 = r10.f6971c     // Catch:{ a -> 0x0386 }
            if (r2 == 0) goto L_0x02df
            java.lang.String r3 = r2.f6993a     // Catch:{ a -> 0x0386 }
            com.fyber.inneractive.sdk.g.a.h r18 = com.fyber.inneractive.sdk.p047g.p048a.C2923h.m6554a(r3)     // Catch:{ a -> 0x0386 }
            if (r18 == 0) goto L_0x02c8
            com.fyber.inneractive.sdk.g.a.g r3 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Static     // Catch:{ a -> 0x0386 }
            int r4 = r8.intValue()     // Catch:{ a -> 0x0386 }
            int r19 = r7.intValue()     // Catch:{ a -> 0x0386 }
            java.lang.String r2 = r2.f6994b     // Catch:{ a -> 0x0386 }
            r20 = r2
            r2 = r25
            r26 = r5
            r5 = r19
            r19 = r6
            r6 = r0
            r21 = r7
            r7 = r9
            r22 = r8
            r8 = r19
            r23 = r9
            r9 = r20
            r15 = r10
            r10 = r18
            m6169a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ a -> 0x0384 }
            goto L_0x02ea
        L_0x02c8:
            r15 = r10
            com.fyber.inneractive.sdk.d.a.a$a r0 = new com.fyber.inneractive.sdk.d.a.a$a     // Catch:{ a -> 0x0384 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ a -> 0x0384 }
            java.lang.String r4 = "Found invalid creative type:"
            r3.<init>(r4)     // Catch:{ a -> 0x0384 }
            java.lang.String r2 = r2.f6993a     // Catch:{ a -> 0x0384 }
            r3.append(r2)     // Catch:{ a -> 0x0384 }
            java.lang.String r2 = r3.toString()     // Catch:{ a -> 0x0384 }
            r0.<init>(r2, r13)     // Catch:{ a -> 0x0384 }
            throw r0     // Catch:{ a -> 0x0384 }
        L_0x02df:
            r26 = r5
            r19 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r15 = r10
        L_0x02ea:
            boolean r2 = android.text.TextUtils.isEmpty(r26)     // Catch:{ a -> 0x0384 }
            if (r2 != 0) goto L_0x0307
            com.fyber.inneractive.sdk.g.a.g r3 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Iframe     // Catch:{ a -> 0x0384 }
            int r4 = r22.intValue()     // Catch:{ a -> 0x0384 }
            int r5 = r21.intValue()     // Catch:{ a -> 0x0384 }
            r10 = 0
            r2 = r25
            r6 = r0
            r7 = r23
            r8 = r19
            r9 = r26
            m6169a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ a -> 0x0384 }
        L_0x0307:
            java.lang.String r9 = r15.f6973e     // Catch:{ a -> 0x0384 }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ a -> 0x0384 }
            if (r2 != 0) goto L_0x039f
            com.fyber.inneractive.sdk.g.a.g r3 = com.fyber.inneractive.sdk.p047g.p048a.C2922g.Html     // Catch:{ a -> 0x0384 }
            int r4 = r22.intValue()     // Catch:{ a -> 0x0384 }
            int r5 = r21.intValue()     // Catch:{ a -> 0x0384 }
            r10 = 0
            r2 = r25
            r6 = r0
            r7 = r23
            r8 = r19
            m6169a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ a -> 0x0384 }
            goto L_0x039f
        L_0x0326:
            r26 = r5
            r15 = r10
            com.fyber.inneractive.sdk.d.a.a$a r0 = new com.fyber.inneractive.sdk.d.a.a$a     // Catch:{ a -> 0x0384 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x0384 }
            java.lang.String r3 = "Found non secure iframe url:"
            r2.<init>(r3)     // Catch:{ a -> 0x0384 }
            r3 = r26
            r2.append(r3)     // Catch:{ a -> 0x0384 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x0384 }
            r0.<init>(r2, r13)     // Catch:{ a -> 0x0384 }
            throw r0     // Catch:{ a -> 0x0384 }
        L_0x033f:
            r15 = r10
            com.fyber.inneractive.sdk.d.a.a$a r0 = new com.fyber.inneractive.sdk.d.a.a$a     // Catch:{ a -> 0x0384 }
            java.lang.String r2 = "None sources of companion avaliable"
            r0.<init>(r2, r13)     // Catch:{ a -> 0x0384 }
            throw r0     // Catch:{ a -> 0x0384 }
        L_0x0348:
            r21 = r7
            r22 = r8
            r15 = r10
            com.fyber.inneractive.sdk.d.a.a$a r0 = new com.fyber.inneractive.sdk.d.a.a$a     // Catch:{ a -> 0x0384 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x0384 }
            java.lang.String r3 = "Incompatible size: "
            r2.<init>(r3)     // Catch:{ a -> 0x0384 }
            r3 = r22
            r2.append(r3)     // Catch:{ a -> 0x0384 }
            java.lang.String r3 = ","
            r2.append(r3)     // Catch:{ a -> 0x0384 }
            r3 = r21
            r2.append(r3)     // Catch:{ a -> 0x0384 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x0384 }
            r3 = 16
            r0.<init>(r2, r3)     // Catch:{ a -> 0x0384 }
            throw r0     // Catch:{ a -> 0x0384 }
        L_0x036f:
            r15 = r10
            com.fyber.inneractive.sdk.d.a.a$a r2 = new com.fyber.inneractive.sdk.d.a.a$a     // Catch:{ a -> 0x0384 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ a -> 0x0384 }
            java.lang.String r4 = "Found non secure click through url: "
            r3.<init>(r4)     // Catch:{ a -> 0x0384 }
            r3.append(r0)     // Catch:{ a -> 0x0384 }
            java.lang.String r0 = r3.toString()     // Catch:{ a -> 0x0384 }
            r2.<init>(r0, r13)     // Catch:{ a -> 0x0384 }
            throw r2     // Catch:{ a -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            goto L_0x0388
        L_0x0386:
            r0 = move-exception
            r15 = r10
        L_0x0388:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r13] = r15
            java.lang.String r3 = r0.getMessage()
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "Failed processing companion ad: %s error = %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r2)
            r15.f6976h = r0
            java.util.List<com.fyber.inneractive.sdk.g.a.f> r0 = r1.f6681g
            r0.add(r15)
        L_0x039f:
            r15 = 1
            goto L_0x01e0
        L_0x03a2:
            r4 = 1
            r15 = 1
            goto L_0x0059
        L_0x03a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p037d.p038a.C2817a.m6168a(com.fyber.inneractive.sdk.g.a.a, com.fyber.inneractive.sdk.g.a.d):void");
    }

    /* renamed from: a */
    private static void m6170a(C3022i iVar, C2933r rVar, String str) throws C2823e {
        if (C3685u.m9187g(str)) {
            iVar.mo18377a(rVar, str);
            return;
        }
        throw new C2823e("VastErrorUnsecure", "found unsecure tracking event: " + rVar.f7056w);
    }

    /* renamed from: a */
    private static void m6169a(C2916a aVar, C2922g gVar, int i, int i2, String str, List<String> list, List<C2932q> list2, String str2, C2923h hVar) {
        C2917b bVar = new C2917b(gVar, i, i2);
        bVar.f6954f = str;
        if (list2 != null) {
            for (C2932q next : list2) {
                bVar.mo18377a(C2933r.m6560a(next.f7030a), next.f7031b);
            }
        }
        if (list != null) {
            for (String a : list) {
                bVar.mo18377a(C2933r.EVENT_CLICK, a);
            }
        }
        bVar.f6953e = str2;
        bVar.f6950b = hVar;
        aVar.f6945f.add(bVar);
    }

    /* renamed from: a */
    private static int m6167a(String str) {
        String[] split;
        int parseInt;
        int parseInt2;
        if (TextUtils.isEmpty(str) || (split = str.split(CertificateUtil.DELIMITER)) == null || split.length > 3) {
            return 0;
        }
        if (split.length == 1) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 0;
            }
        } else {
            if (split.length == 2) {
                try {
                    parseInt = Integer.parseInt(split[1]);
                    parseInt2 = Integer.parseInt(split[0]) * 60;
                } catch (NumberFormatException unused2) {
                    return 0;
                }
            } else {
                try {
                    parseInt = Integer.parseInt(split[2]) + (Integer.parseInt(split[1]) * 60);
                    parseInt2 = Integer.parseInt(split[0]) * 3600;
                } catch (NumberFormatException unused3) {
                    return 0;
                }
            }
            return parseInt + parseInt2;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.d.a.a$a */
    public class C2818a extends Exception {

        /* renamed from: a */
        public int f6682a;

        C2818a(String str, int i) {
            super(str);
            this.f6682a = i;
        }
    }
}
