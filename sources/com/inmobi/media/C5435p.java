package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.referrer.Payload;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C4960ap;
import com.inmobi.media.C5139dx;
import com.inmobi.media.C5239ey;
import com.inmobi.media.C5397j;
import com.inmobi.media.C5415m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p243my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.C8937Ad;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.squareup.picasso.Picasso;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.p */
/* compiled from: AdUnit */
public abstract class C5435p implements C4960ap.C4965a, C5006bb, C5077cm, C5093cu, C5239ey.C5242c, C5415m.C5432a, C5467u {

    /* renamed from: a */
    static final String f12510a = C5435p.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f12511A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C5415m f12512B;

    /* renamed from: C */
    private C5078cn f12513C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C5415m.C5432a f12514D = new C5415m.C5432a() {
        /* renamed from: a */
        public final void mo40811a(String str, Map<String, Object> map) {
        }

        /* renamed from: a */
        public final void mo40812a(HashMap<Object, Object> hashMap) {
        }

        /* renamed from: b */
        public final void mo40814b(C5415m mVar) {
        }

        /* renamed from: b */
        public final void mo40815b(HashMap<Object, Object> hashMap) {
        }

        /* renamed from: c */
        public final void mo40816c() {
        }

        /* renamed from: c */
        public final void mo40817c(C5415m mVar) {
        }

        /* renamed from: d */
        public final void mo40818d() {
        }

        /* renamed from: d */
        public final void mo40819d(C5415m mVar) {
        }

        /* renamed from: e */
        public final void mo40820e() {
        }

        /* renamed from: f */
        public final void mo40822f() {
        }

        /* renamed from: g */
        public final void mo40823g() {
        }

        /* renamed from: a */
        public final void mo40809a() {
            if (2 == C5435p.this.mo41001k()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C5435p.this.mo40997e((byte) 2);
                        boolean unused = C5435p.this.f12511A = true;
                        C5435p.this.mo40964P();
                    }
                });
            }
        }

        /* renamed from: b */
        public final void mo40813b() {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5435p.this.mo40997e((byte) 2);
                    C5435p.this.mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
                }
            });
        }

        /* renamed from: a */
        public final void mo40810a(C5415m mVar) {
            if (2 == C5435p.this.mo41001k()) {
                C5435p.this.mo40965R();
            }
        }

        /* renamed from: e */
        public final void mo40821e(C5415m mVar) {
            if (2 == C5435p.this.mo41001k()) {
                C5435p.this.mo40997e((byte) 2);
                C5435p.this.mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
            }
        }

        /* renamed from: h */
        public final C5394ik mo40824h() {
            return C5435p.this.f12534u;
        }
    };

    /* renamed from: b */
    byte f12515b;

    /* renamed from: c */
    C5220ev f12516c;

    /* renamed from: d */
    Set<String> f12517d;

    /* renamed from: e */
    String f12518e;

    /* renamed from: f */
    long f12519f;

    /* renamed from: g */
    long f12520g = 0;

    /* renamed from: h */
    public C5397j f12521h;

    /* renamed from: i */
    byte f12522i;

    /* renamed from: j */
    public Handler f12523j;

    /* renamed from: k */
    boolean f12524k;

    /* renamed from: l */
    boolean f12525l;

    /* renamed from: m */
    boolean f12526m = false;

    /* renamed from: n */
    boolean f12527n;

    /* renamed from: o */
    C5034bu f12528o;
    /* access modifiers changed from: package-private */

    /* renamed from: p */
    public C4955an f12529p;

    /* renamed from: q */
    C4958ao f12530q;

    /* renamed from: r */
    boolean f12531r = false;

    /* renamed from: s */
    final C5316gq f12532s = C5316gq.m12231a();

    /* renamed from: t */
    private WeakReference<Context> f12533t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C5394ik f12534u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f12535v;

    /* renamed from: w */
    private C4960ap f12536w;

    /* renamed from: x */
    private WeakReference<C5453a> f12537x;

    /* renamed from: y */
    private C5415m f12538y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Set<C5096cx> f12539z;

    /* renamed from: com.inmobi.media.p$a */
    /* compiled from: AdUnit */
    public static abstract class C5453a {
        /* renamed from: a */
        public void mo39965a() {
        }

        /* renamed from: a */
        public void mo39966a(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: a */
        public void mo39999a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo41026a(C4955an anVar, C4958ao aoVar) {
        }

        /* renamed from: a */
        public void mo40000a(C5435p pVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo40001a(C5435p pVar, boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: a */
        public void mo40002a(Map<Object, Object> map) {
        }

        /* renamed from: a */
        public void mo39968a(boolean z) {
        }

        /* renamed from: a */
        public void mo40003a(byte[] bArr) {
        }

        /* renamed from: b */
        public void mo40007b() {
        }

        /* renamed from: b */
        public void mo39969b(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: b */
        public void mo40008b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: b */
        public void mo40010b(C5435p pVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        }

        /* renamed from: b */
        public void mo40012b(Map<Object, Object> map) {
        }

        /* renamed from: c */
        public void mo40013c() {
        }

        /* renamed from: c */
        public void mo40014c(AdMetaInfo adMetaInfo) {
        }

        /* renamed from: d */
        public void mo40017d() {
        }

        /* renamed from: e */
        public void mo39971e() {
        }

        /* renamed from: f */
        public void mo39972f() {
        }

        /* renamed from: g */
        public boolean mo41027g() {
            return true;
        }

        /* renamed from: h */
        public void mo39973h() {
        }

        /* renamed from: i */
        public void mo41028i() {
        }

        /* renamed from: j */
        public void mo41029j() {
        }

        /* renamed from: k */
        public void mo41030k() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo40957I() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo39948Q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo40965R() {
    }

    /* renamed from: T */
    public abstract void mo39949T();

    /* renamed from: a */
    public void mo40810a(C5415m mVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo39955b(C4955an anVar, boolean z) {
    }

    /* renamed from: b */
    public void mo40814b(C5415m mVar) {
    }

    /* renamed from: c */
    public void mo40817c(C5415m mVar) {
    }

    /* renamed from: d */
    public void mo40819d(C5415m mVar) {
    }

    /* renamed from: e */
    public void mo40820e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo39957f(C5453a aVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo39958g(C5453a aVar) {
    }

    /* renamed from: l */
    public abstract String mo39959l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract byte mo39960m();

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Integer mo41013z() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r5 != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5435p(android.content.Context r3, com.inmobi.media.C4955an r4, com.inmobi.media.C5435p.C5453a r5) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f12520g = r0
            r0 = 0
            r2.f12526m = r0
            r2.f12531r = r0
            com.inmobi.media.gq r1 = com.inmobi.media.C5316gq.m12231a()
            r2.f12532s = r1
            com.inmobi.media.p$3 r1 = new com.inmobi.media.p$3
            r1.<init>()
            r2.f12514D = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r2.f12533t = r1
            r2.f12529p = r4
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r5)
            r2.f12537x = r3
            java.lang.String r3 = com.inmobi.media.C5314go.m12211f()
            java.lang.String r4 = "ads"
            com.inmobi.media.ex r4 = com.inmobi.media.C5239ey.m11987a(r4, r3, r2)
            com.inmobi.media.ev r4 = (com.inmobi.media.C5220ev) r4
            r2.f12516c = r4
            java.lang.String r4 = "pk"
            r5 = 0
            com.inmobi.media.C5239ey.m11987a(r4, r3, r5)
            com.inmobi.media.an r3 = r2.f12529p
            java.lang.String r3 = r3.mo40062a()
            java.lang.String r4 = "AerServ"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0058
            com.inmobi.media.ig r3 = com.inmobi.media.C5384ii.m12471b()
            if (r3 == 0) goto L_0x0055
            com.inmobi.media.ik r5 = r3.mo40746f()
        L_0x0055:
            if (r5 == 0) goto L_0x0058
            goto L_0x005c
        L_0x0058:
            com.inmobi.media.ev r3 = r2.f12516c
            com.inmobi.media.ik r5 = r3.timeouts
        L_0x005c:
            r2.f12534u = r5
            r2.f12515b = r0
            com.inmobi.media.ap r3 = new com.inmobi.media.ap
            com.inmobi.media.an r4 = r2.f12529p
            r3.<init>(r2, r2, r4)
            r2.f12536w = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f12539z = r3
            r3 = -1
            r2.f12522i = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r2.f12523j = r3
            r2.f12524k = r0
            r2.f12535v = r0
            com.inmobi.media.cn r3 = new com.inmobi.media.cn
            r3.<init>(r2)
            r2.f12513C = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5435p.<init>(android.content.Context, com.inmobi.media.an, com.inmobi.media.p$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40974a(Context context, C4955an anVar, C5453a aVar) {
        mo39952a(context);
        mo40979a(aVar);
        this.f12529p = anVar;
    }

    /* renamed from: a */
    public void mo40121a(C5238ex exVar) {
        if (exVar instanceof C5220ev) {
            this.f12516c = (C5220ev) exVar;
        }
    }

    /* renamed from: i */
    public final Context mo40999i() {
        WeakReference<Context> weakReference = this.f12533t;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* renamed from: a */
    public void mo39952a(Context context) {
        this.f12533t = new WeakReference<>(context);
    }

    /* renamed from: j */
    public final C4955an mo41000j() {
        return this.f12529p;
    }

    /* renamed from: k */
    public final byte mo41001k() {
        return this.f12515b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Map<String, String> mo39961n() {
        return new HashMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final String mo41002o() {
        C4948ah v = mo41009v();
        if (v == null) {
            return "unknown";
        }
        return v.mo40039i();
    }

    /* renamed from: p */
    public final C5220ev mo41003p() {
        return this.f12516c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C5453a mo41004q() {
        C5453a aVar = (C5453a) this.f12537x.get();
        if (aVar == null) {
            C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo40979a(C5453a aVar) {
        this.f12537x = new WeakReference<>(aVar);
    }

    /* renamed from: r */
    public final boolean mo41005r() {
        C4948ah v = mo41009v();
        return v != null && v.mo40031a(this.f12516c.mo40556a(mo39959l()).timeToLive);
    }

    /* renamed from: s */
    public final C4960ap mo41006s() {
        if (this.f12536w == null) {
            this.f12536w = new C4960ap(this, this, mo41000j());
        }
        return this.f12536w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.inmobi.media.C5331h mo41007t() {
        /*
            r6 = this;
            byte r0 = r6.mo41001k()
            java.lang.String r1 = r6.mo41002o()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0023
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002d
            r1 = 1
            goto L_0x002e
        L_0x0023:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002d
            r1 = 2
            goto L_0x002e
        L_0x002d:
            r1 = -1
        L_0x002e:
            r2 = 3
            r3 = 0
            if (r1 == r5) goto L_0x0042
            if (r1 == r4) goto L_0x0035
            return r3
        L_0x0035:
            if (r0 == 0) goto L_0x0041
            if (r5 == r0) goto L_0x0041
            if (r2 == r0) goto L_0x0041
            if (r4 != r0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            com.inmobi.media.j r0 = r6.f12521h
            return r0
        L_0x0041:
            return r3
        L_0x0042:
            if (r0 == 0) goto L_0x004e
            if (r5 == r0) goto L_0x004e
            if (r2 != r0) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            com.inmobi.media.m r0 = r6.mo41008u()
            return r0
        L_0x004e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5435p.mo41007t():com.inmobi.media.h");
    }

    /* renamed from: u */
    public C5415m mo41008u() {
        return this.f12538y;
    }

    /* renamed from: v */
    public C4948ah mo41009v() {
        C4958ao aoVar = this.f12530q;
        if (aoVar == null) {
            return null;
        }
        return aoVar.mo40108k();
    }

    /* renamed from: Y */
    private AdMetaInfo mo39950Y() {
        C4948ah v = mo41009v();
        if (v == null) {
            return null;
        }
        return v.mo40037g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40989b(C5453a aVar) {
        AdMetaInfo Y = mo39950Y();
        if (Y == null) {
            aVar.mo39999a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            aVar.mo39966a(Y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo40992c(C5453a aVar) {
        AdMetaInfo Y = mo39950Y();
        if (Y == null) {
            aVar.mo40000a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        } else {
            aVar.mo39969b(Y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo40994d(C5453a aVar) {
        AdMetaInfo Y = mo39950Y();
        if (Y == null) {
            aVar.mo39965a();
        } else {
            aVar.mo40014c(Y);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        r3 = com.inmobi.media.C5314go.m12203c();
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0139 A[Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013f A[Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014d A[Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40987a(com.inmobi.media.C4948ah r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "macros"
            java.lang.String r2 = "customReferenceData"
            java.lang.String r3 = "isolateVerificationScripts"
            java.lang.String r4 = "omidEnabled"
            java.lang.String r5 = "omsdkInfo"
            java.lang.String r6 = "metaInfo"
            java.lang.String r7 = "tracking"
            java.lang.String r8 = "viewability"
            java.lang.String r9 = "creativeType"
            java.lang.String r10 = "unknown"
            r11 = 0
            org.json.JSONObject r12 = r22.mo40033c()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.String r13 = r22.mo40039i()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.String r14 = "allowAutoRedirection"
            boolean r14 = r12.optBoolean(r14, r11)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r1.f12535v = r14     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r14 = r10.equals(r13)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r14 == 0) goto L_0x002e
            return r11
        L_0x002e:
            java.lang.String r14 = r22.mo40041k()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r1.f12518e = r14     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            int r14 = r14.length()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r15 = 1
            if (r14 == 0) goto L_0x0057
            java.lang.String r14 = r1.f12518e     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.String r11 = "@__imm_aft@"
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r18 = r2
            r19 = r3
            long r2 = r1.f12519f     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            long r16 = r16 - r2
            java.lang.String r2 = java.lang.String.valueOf(r16)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.String r2 = r14.replace(r11, r2)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r1.f12518e = r2     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r2 = 1
            goto L_0x005c
        L_0x0057:
            r18 = r2
            r19 = r3
            r2 = 0
        L_0x005c:
            java.lang.String r3 = "mediationJson"
            boolean r3 = r3.equals(r13)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r3 == 0) goto L_0x0065
            return r2
        L_0x0065:
            android.content.Context r3 = com.inmobi.media.C5314go.m12203c()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r3 != 0) goto L_0x006c
            return r2
        L_0x006c:
            java.util.Set<com.inmobi.media.cx> r11 = r1.f12539z     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r11 = r11.isEmpty()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r11 == 0) goto L_0x0197
            com.inmobi.media.ev r11 = r1.f12516c     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            com.inmobi.media.ev$k r11 = r11.viewability     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r11 = r11.moatEnabled     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r11 == 0) goto L_0x00af
            boolean r11 = r12.has(r8)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r11 == 0) goto L_0x00af
            org.json.JSONArray r8 = r12.getJSONArray(r8)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.util.Map r8 = com.inmobi.media.C5435p.C5454b.m12903a(r8)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r8 == 0) goto L_0x00af
            java.lang.String r11 = "enabled"
            java.lang.Object r11 = r8.get(r11)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r11 = r11.booleanValue()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r11 == 0) goto L_0x00af
            android.app.Application r11 = com.inmobi.media.C5314go.m12206d()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r11 == 0) goto L_0x00af
            com.inmobi.media.C5125dl.m11693a(r11)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            com.inmobi.media.cx r11 = new com.inmobi.media.cx     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r11.<init>(r15)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r11.f11687b = r8     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.util.Set<com.inmobi.media.cx> r8 = r1.f12539z     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r8.add(r11)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
        L_0x00af:
            com.inmobi.media.ev r8 = r1.f12516c     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            com.inmobi.media.ev$k r8 = r8.viewability     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            com.inmobi.media.ev$f r8 = r8.omidConfig     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r8 = r8.omidEnabled     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r8 == 0) goto L_0x0177
            boolean r8 = r12.has(r6)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r8 == 0) goto L_0x0177
            org.json.JSONObject r6 = r12.getJSONObject(r6)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r8 = r6.has(r5)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r8 == 0) goto L_0x0177
            org.json.JSONObject r5 = r6.getJSONObject(r5)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r8 = r5.has(r4)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r8 == 0) goto L_0x0177
            boolean r4 = r5.getBoolean(r4)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r4 == 0) goto L_0x0177
            boolean r4 = r6.has(r9)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r4 == 0) goto L_0x00e4
            java.lang.String r4 = r6.getString(r9)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            goto L_0x00e5
        L_0x00e4:
            r4 = r10
        L_0x00e5:
            android.os.Handler r6 = r1.f12523j     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            com.inmobi.media.p$1 r8 = new com.inmobi.media.p$1     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r8.<init>(r3)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r6.post(r8)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            com.inmobi.media.cx r3 = new com.inmobi.media.cx     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r6 = 3
            r3.<init>(r6)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r6 = r19
            boolean r8 = r5.optBoolean(r6)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r11 = r18
            java.lang.String r13 = r5.optString(r11)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r14.<init>()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r16 = -1
            int r15 = r4.hashCode()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r17 = r2
            java.lang.String r2 = "nonvideo"
            r19 = r10
            java.lang.String r10 = "video"
            r20 = r7
            r7 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r15 == r7) goto L_0x012d
            r7 = 1425678798(0x54fa21ce, float:8.5944718E12)
            if (r15 == r7) goto L_0x0125
            goto L_0x0135
        L_0x0125:
            boolean r4 = r4.equals(r2)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r4 == 0) goto L_0x0135
            r4 = 1
            goto L_0x0136
        L_0x012d:
            boolean r4 = r4.equals(r10)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r4 == 0) goto L_0x0135
            r4 = 2
            goto L_0x0136
        L_0x0135:
            r4 = -1
        L_0x0136:
            r7 = 1
            if (r4 == r7) goto L_0x013f
            r7 = 2
            if (r4 == r7) goto L_0x0140
            r10 = r19
            goto L_0x0140
        L_0x013f:
            r10 = r2
        L_0x0140:
            r14.put(r9, r10)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r14.put(r11, r13)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r2.<init>()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r5 == 0) goto L_0x0165
            java.util.Iterator r4 = r5.keys()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
        L_0x0151:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r7 == 0) goto L_0x0165
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.String r9 = r5.optString(r7)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r2.put(r7, r9)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            goto L_0x0151
        L_0x0165:
            r14.put(r0, r2)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r14.put(r6, r0)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r3.f11687b = r14     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            java.util.Set<com.inmobi.media.cx> r0 = r1.f12539z     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            r0.add(r3)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            goto L_0x017b
        L_0x0177:
            r17 = r2
            r20 = r7
        L_0x017b:
            r0 = r20
            boolean r2 = r12.has(r0)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r2 == 0) goto L_0x0199
            java.lang.String r2 = "web"
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01ab, IllegalArgumentException -> 0x019c }
            if (r0 == 0) goto L_0x0199
            r2 = 0
            r1.f12522i = r2     // Catch:{ JSONException -> 0x0195, IllegalArgumentException -> 0x0193 }
            goto L_0x0199
        L_0x0193:
            r0 = move-exception
            goto L_0x019e
        L_0x0195:
            r0 = move-exception
            goto L_0x01ad
        L_0x0197:
            r17 = r2
        L_0x0199:
            r11 = r17
            goto L_0x01ba
        L_0x019c:
            r0 = move-exception
            r2 = 0
        L_0x019e:
            com.inmobi.media.fn r3 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r4 = new com.inmobi.media.gk
            r4.<init>(r0)
            r3.mo40590a((com.inmobi.media.C5308gk) r4)
            goto L_0x01b9
        L_0x01ab:
            r0 = move-exception
            r2 = 0
        L_0x01ad:
            com.inmobi.media.fn r3 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r4 = new com.inmobi.media.gk
            r4.<init>(r0)
            r3.mo40590a((com.inmobi.media.C5308gk) r4)
        L_0x01b9:
            r11 = 0
        L_0x01ba:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5435p.mo40987a(com.inmobi.media.ah):boolean");
    }

    /* renamed from: w */
    public void mo41010w() {
        this.f12532s.mo40658a(hashCode(), new C5468v(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo39956b(C4958ao aoVar) {
        mo41010w();
        if (mo41001k() == 1) {
            this.f12530q = aoVar;
            C4948ah k = aoVar.mo40108k();
            if (k == null) {
                mo39954a(false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else {
                this.f12532s.mo40658a(hashCode(), new C4934ae(this, k, false, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR)));
            }
        }
    }

    /* renamed from: a */
    public final void mo40976a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z, byte b) {
        if (mo41001k() == 1 && z) {
            this.f12515b = 3;
        }
        C5453a q = mo41004q();
        if (q != null) {
            q.mo40000a(this, inMobiAdRequestStatus);
        }
        mo40971a(b);
    }

    /* renamed from: a */
    public void mo40980a(String str) {
        this.f12529p.mo40065b(str);
    }

    /* renamed from: a */
    public void mo40984a(Map<String, String> map) {
        this.f12529p.mo40066b(map);
    }

    /* renamed from: y */
    public Map<String, String> mo41012y() {
        return this.f12529p.mo40067c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo40950A() {
        try {
            RecyclerView.class.getName();
            Picasso.class.getName();
            CustomTabsClient.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* renamed from: a */
    public void mo40985a(final JSONObject jSONObject) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C5435p.this.f12532s.mo40658a(C5435p.this.hashCode(), new C5455q(C5435p.this, jSONObject));
            }
        });
    }

    /* renamed from: B */
    public void mo39947B() {
        this.f12520g = SystemClock.elapsedRealtime();
        if (!C5328gx.m12274a()) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
        } else {
            mo39951Z();
        }
    }

    /* renamed from: a */
    public void mo40986a(byte[] bArr) {
        if (!mo40952D()) {
            if (bArr == null || bArr.length == 0) {
                mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (byte) 3);
                return;
            }
            if (this.f12528o == null) {
                this.f12528o = new C5034bu(this);
            }
            this.f12515b = 1;
            this.f12532s.mo40658a(hashCode(), new C4923aa(this, this.f12528o, bArr, mo41000j().mo40070e()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo40991c(C4958ao aoVar) {
        mo40978a(aoVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40951C() {
        /*
            r6 = this;
            com.inmobi.media.p$a r0 = r6.mo41004q()
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = r6.f12527n
            r4 = 1
            if (r3 == 0) goto L_0x0017
            r0 = 2
            java.lang.String r3 = "InMobi"
            java.lang.String r5 = "getSignals() call is already in progress. Please wait for its execution to get complete"
            com.inmobi.media.C5327gw.m12263a((byte) r0, (java.lang.String) r3, (java.lang.String) r5)
        L_0x0015:
            r0 = 1
            goto L_0x0030
        L_0x0017:
            boolean r3 = r6.mo40950A()
            if (r3 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x0029
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r5 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r3.<init>(r5)
            r0.mo40008b((com.inmobi.ads.InMobiAdRequestStatus) r3)
        L_0x0029:
            r0 = 39
            r6.mo40972a((int) r0, (long) r1)
            goto L_0x0015
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0033
            return
        L_0x0033:
            r6.f12527n = r4
            com.inmobi.media.bu r0 = r6.f12528o
            if (r0 != 0) goto L_0x0040
            com.inmobi.media.bu r0 = new com.inmobi.media.bu
            r0.<init>(r6)
            r6.f12528o = r0
        L_0x0040:
            com.inmobi.media.gq r0 = r6.f12532s
            int r3 = r6.hashCode()
            com.inmobi.media.w r4 = new com.inmobi.media.w
            r4.<init>(r6, r1)
            r0.mo40658a(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5435p.mo40951C():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final boolean mo40952D() {
        if (!C5328gx.m12274a()) {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE), true, (byte) 5);
            return true;
        } else if (!C5346hh.m12351h()) {
            mo40955G();
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), false, (byte) Ascii.NAK);
            return true;
        } else {
            byte b = this.f12515b;
            if (b == 1) {
                mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (byte) Ascii.DC2);
                return true;
            } else if (b != 7) {
                return false;
            } else {
                mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) Ascii.f10109SI);
                mo40971a((byte) Ascii.f10109SI);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final byte mo40996e(C5453a aVar) {
        HashMap<String, String> hashMap;
        C5094cv cvVar;
        final WeakReference weakReference = new WeakReference(aVar);
        try {
            byte m = mo39960m();
            JSONObject jSONObject = new JSONObject(this.f12518e);
            C5220ev p = mo41003p();
            if (this.f12530q == null) {
                hashMap = null;
            } else {
                hashMap = C5328gx.m12270a(this.f12530q.mo40109l());
            }
            C4948ah v = mo41009v();
            if (v != null) {
                if (v instanceof C5002ay) {
                    C5002ay ayVar = (C5002ay) v;
                    C4967ar.m11264a();
                    C4949ai b = C4967ar.m11267b(ayVar.f11345a);
                    if (b == null || !b.mo40053a()) {
                        throw new IllegalStateException("Asset not available in cache");
                    }
                    cvVar = new C5094cv(b.f11193e, ayVar.f11346b, ayVar.f11347c, ayVar.f11348d, ayVar.f11349e, mo41003p().vastVideo);
                } else {
                    cvVar = null;
                }
                C5016bj bjVar = new C5016bj((int) m, jSONObject, p, hashMap, cvVar);
                C4948ah v2 = mo41009v();
                if (!bjVar.mo40186d() || mo40999i() == null || v2 == null) {
                    return Ascii.DC4;
                }
                C5397j a = C5397j.C5408b.m12593a(mo40999i(), mo39960m(), bjVar, v2.mo40036f(), this.f12539z, mo41003p(), this.f12529p.mo40070e(), this.f12535v, v2.mo40051u(), v2.mo40028a());
                a.mo40775a((C5397j.C5409c) new C5397j.C5409c() {
                    /* renamed from: a */
                    public final void mo40826a() {
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo39965a();
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo40829b() {
                        C5435p.this.mo40997e((byte) 4);
                        if (!C5435p.this.f12526m) {
                            C5435p.this.f12523j.post(new Runnable() {
                                public final void run() {
                                    C5435p.this.mo39957f((C5453a) weakReference.get());
                                }
                            });
                        }
                    }

                    /* renamed from: c */
                    public final void mo40830c() {
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo40007b();
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: d */
                    public final void mo40831d() {
                        C5327gw.m12263a((byte) 2, "InMobi", "Successfully impressed ad for placement id: " + C5435p.this.f12529p.toString());
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo39971e();
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: e */
                    public final void mo40832e() {
                        C5327gw.m12263a((byte) 2, "InMobi", "Ad interaction for placement id: " + C5435p.this.f12529p.toString());
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo40002a((Map<Object, Object>) new HashMap());
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: f */
                    public final void mo40833f() {
                        if (!C5435p.this.f12526m) {
                            C5327gw.m12263a((byte) 2, "InMobi", "Ad dismissed for placement id: " + C5435p.this.f12529p.toString());
                            C5435p.this.f12523j.post(new Runnable() {
                                public final void run() {
                                    C5435p.this.mo39958g((C5453a) weakReference.get());
                                }
                            });
                        }
                    }

                    /* renamed from: a */
                    public final void mo40827a(Map<String, String> map) {
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo40012b((Map<Object, Object>) new HashMap(map));
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: g */
                    public final void mo40834g() {
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo40017d();
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: h */
                    public final void mo40835h() {
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo39972f();
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: i */
                    public final void mo40836i() {
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo39973h();
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo40828a(boolean z) {
                        if (!C5435p.this.f12526m) {
                            C5453a aVar = (C5453a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo39968a(z);
                            } else {
                                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                            }
                        }
                    }
                });
                this.f12521h = a;
                return 0;
            }
            throw new IllegalStateException("No ad");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return Ascii.f10100CR;
        } catch (IllegalStateException unused) {
            return Ascii.f10100CR;
        } catch (Exception e2) {
            C5275fn.m12068a().mo40590a(new C5308gk(e2));
            return Ascii.f10100CR;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo40953E() {
        C5331h t = mo41007t();
        if (t != null) {
            t.mo40684a((byte) 2, (Map<String, String>) null);
        }
    }

    /* renamed from: F */
    public C5037bx mo40954F() {
        Map<String, Long> a = C5318gr.m12236a();
        this.f12517d = a != null ? new HashSet(a.keySet()) : null;
        String str = this.f12516c.url;
        C5361hu huVar = new C5361hu(this.f12516c.mo40563f());
        C4967ar.m11264a();
        C5037bx bxVar = new C5037bx(str, huVar, C4967ar.m11272e(), this.f12529p, a);
        bxVar.f11494c = this.f12529p.mo40068d();
        bxVar.f11493b = mo39959l();
        bxVar.f11492a = "unifiedSdkJson";
        bxVar.f11495d = mo39961n();
        bxVar.f12132k = this.f12516c.fetchTimeout * 1000;
        bxVar.f12133l = this.f12516c.fetchTimeout * 1000;
        bxVar.f12140s = this.f12516c.rendering.enablePubMuteControl && C5314go.m12210e();
        bxVar.f11497f = this.f12529p.mo40073g();
        return bxVar;
    }

    /* renamed from: G */
    public void mo40955G() {
        if (!this.f12526m) {
            this.f12526m = true;
            this.f12539z.clear();
            mo40956H();
            this.f12515b = 0;
            this.f12532s.mo40657a(hashCode());
            this.f12511A = false;
            this.f12512B = null;
            this.f12524k = false;
            this.f12525l = false;
            this.f12535v = false;
            this.f12527n = false;
            this.f12530q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo40956H() {
        C5397j jVar = this.f12521h;
        if (jVar != null) {
            jVar.destroy();
            this.f12521h = null;
        }
        C5415m mVar = this.f12538y;
        if (mVar != null) {
            mVar.f12479x = false;
            mVar.destroy();
            this.f12538y = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo40958J() {
        mo40971a((byte) Ascii.SYN);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo40959K() {
        if (2 == mo41001k()) {
            mo40997e((byte) 2);
            this.f12515b = 3;
            mo40971a((byte) 42);
            if (mo41004q() != null) {
                mo41004q().mo40000a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    /* renamed from: b */
    private void m12742b(InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (mo40960L()) {
            try {
                C5415m N = mo40962N();
                if (N != null) {
                    N.stopLoading();
                    return;
                }
                C5331h t = mo41007t();
                if (t instanceof C5415m) {
                    ((C5415m) t).stopLoading();
                }
                this.f12515b = 3;
                mo40971a((byte) 41);
                if (mo41004q() != null) {
                    mo41004q().mo40000a(this, inMobiAdRequestStatus);
                }
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo40960L() {
        return mo41001k() == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo40961M() {
        HashMap hashMap = new HashMap();
        hashMap.put(C8937Ad.AD_TYPE, mo39959l());
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f12520g));
        hashMap.put("networkType", C5342he.m12330b());
        mo40993c("AdLoadSuccessful", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40971a(byte b) {
        HashMap hashMap = new HashMap();
        hashMap.put("networkType", C5342he.m12330b());
        hashMap.put(C8937Ad.AD_TYPE, mo39959l());
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f12520g));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Byte.valueOf(b));
        AdMetaInfo Y = mo39950Y();
        if (!(Y == null || Y.getCreativeID() == null)) {
            hashMap.put("creativeId", "\"" + Y.getCreativeID() + "\"");
        }
        mo40993c("AdLoadFailed", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40972a(int i, long j) {
        this.f12527n = false;
        HashMap hashMap = new HashMap();
        hashMap.put(C8937Ad.AD_TYPE, mo39959l());
        hashMap.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - j));
        hashMap.put("networkType", C5342he.m12330b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo40993c("AdGetSignalsFailed", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40973a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(C8937Ad.AD_TYPE, mo39959l());
        hashMap.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - j));
        hashMap.put("networkType", C5342he.m12330b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo40993c("AdShowFailed", hashMap);
    }

    /* renamed from: a */
    public void mo40811a(String str, Map<String, Object> map) {
        mo40993c(str, map);
    }

    /* renamed from: b */
    public final void mo40159b(String str, Map<String, Object> map) {
        mo40993c(str, map);
    }

    /* renamed from: c */
    public void mo40993c(String str, Map<String, Object> map) {
        C5309gl.m12169a().mo40652a(str, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40988b(C4948ah ahVar) {
        HashMap<String, String> a;
        VerificationScriptResource verificationScriptResource;
        Context i = mo40999i();
        if (mo41003p().viewability.omidConfig.omidEnabled && C5139dx.C5140a.f11804a.mo40417a()) {
            boolean z = ahVar instanceof C5002ay;
            for (C5096cx next : this.f12539z) {
                if (3 == next.f11686a) {
                    if ("video" != next.f11687b.get(StaticResource.CREATIVE_TYPE) || !z) {
                        m12738a(i, next);
                    } else {
                        C5002ay ayVar = (C5002ay) ahVar;
                        try {
                            C5094cv cvVar = new C5094cv(ayVar.f11345a, ayVar.f11346b, ayVar.f11347c, ayVar.f11348d, ayVar.f11349e, mo41003p().vastVideo);
                            byte m = mo39960m();
                            JSONObject jSONObject = new JSONObject(this.f12518e);
                            C5220ev p = mo41003p();
                            if (this.f12530q == null) {
                                a = null;
                            } else {
                                a = C5328gx.m12270a(this.f12530q.mo40109l());
                            }
                            C5016bj bjVar = new C5016bj((int) m, jSONObject, p, a, cvVar);
                            C5031bs bsVar = (C5031bs) bjVar.mo40185c(ShareConstants.VIDEO_URL).get(0);
                            if (i != null) {
                                ArrayList arrayList = new ArrayList();
                                for (C5030br next2 : bsVar.f11379u) {
                                    if ("OMID_VIEWABILITY".equals(next2.f11469d) && (next2 instanceof C5133ds)) {
                                        C5133ds dsVar = (C5133ds) next2;
                                        Map map = (Map) next.mo40364a("macros", Map.class);
                                        String d = m12745d(dsVar.f11785g, map);
                                        String str = dsVar.f11786h;
                                        String d2 = m12745d(dsVar.f11467b, map);
                                        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(str)) {
                                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d2), d);
                                        } else if (!TextUtils.isEmpty(str)) {
                                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(str, new URL(d2));
                                        } else {
                                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d2));
                                        }
                                        arrayList.add(verificationScriptResource);
                                    }
                                }
                                if (arrayList.size() != 0) {
                                    C5010bf a2 = m12736a(bjVar);
                                    if (a2 != null) {
                                        next.f11687b.put("videoSkippable", Boolean.TRUE);
                                        next.f11687b.put("videoSkipOffset", Integer.valueOf(a2.f11373o));
                                    } else {
                                        next.f11687b.put("videoSkippable", Boolean.FALSE);
                                        next.f11687b.put("videoSkipOffset", 0);
                                    }
                                    next.f11687b.put("videoAutoPlay", bsVar.f11380v.get("shouldAutoPlay"));
                                    next.f11687b.put("omidAdSession", C5138dw.m11758a((List<VerificationScriptResource>) arrayList, (String) next.f11687b.get(StaticResource.CREATIVE_TYPE)));
                                    next.f11687b.put("deferred", Boolean.TRUE);
                                }
                            }
                        } catch (Exception e) {
                            C5275fn.m12068a().mo40590a(new C5308gk(e));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m12738a(Context context, C5096cx cxVar) {
        HashMap<String, String> a;
        VerificationScriptResource verificationScriptResource;
        try {
            byte m = mo39960m();
            JSONObject jSONObject = new JSONObject(this.f12518e);
            C5220ev p = mo41003p();
            if (this.f12530q == null) {
                a = null;
            } else {
                a = C5328gx.m12270a(this.f12530q.mo40109l());
            }
            C5010bf bfVar = new C5016bj((int) m, jSONObject, p, a, (C5094cv) null).mo40185c("CONTAINER").get(0);
            if (context != null) {
                ArrayList arrayList = new ArrayList();
                for (C5030br next : bfVar.f11379u) {
                    if ("OMID_VIEWABILITY".equals(next.f11469d) && (next instanceof C5133ds)) {
                        C5133ds dsVar = (C5133ds) next;
                        Map map = (Map) cxVar.mo40364a("macros", Map.class);
                        String d = m12745d(dsVar.f11785g, map);
                        String str = dsVar.f11786h;
                        String d2 = m12745d(dsVar.f11467b, map);
                        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(str)) {
                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(str, new URL(d2), d);
                        } else if (!TextUtils.isEmpty(str)) {
                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(str, new URL(d2));
                        } else {
                            verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(d2));
                        }
                        arrayList.add(verificationScriptResource);
                    }
                }
                if (arrayList.size() != 0) {
                    cxVar.f11687b.put("omidAdSession", C5137dv.m11749a((List<VerificationScriptResource>) arrayList, (String) cxVar.f11687b.get(StaticResource.CREATIVE_TYPE)));
                    cxVar.f11687b.put("deferred", Boolean.TRUE);
                }
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    /* renamed from: a */
    private static C5010bf m12736a(C5016bj bjVar) {
        for (String c : bjVar.mo40187e()) {
            C5010bf bfVar = bjVar.mo40185c(c).get(0);
            if (2 == bfVar.f11370l) {
                return bfVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo40998f(C5415m mVar) {
        if (mo41003p().viewability.omidConfig.omidEnabled && C5139dx.C5140a.f11804a.mo40417a()) {
            for (C5096cx next : this.f12539z) {
                if (3 == next.f11686a) {
                    try {
                        C5131dq a = C5136du.m11740a((String) next.mo40364a(StaticResource.CREATIVE_TYPE, String.class), mVar, (String) next.mo40364a("customReferenceData", String.class), ((Boolean) next.mo40364a("isolateVerificationScripts", Boolean.class)).booleanValue());
                        if (a != null) {
                            next.f11687b.put("omidAdSession", a);
                            next.f11687b.put("deferred", Boolean.TRUE);
                        }
                    } catch (Exception e) {
                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static String m12745d(String str, Map map) {
        if (!(map == null || str == null)) {
            for (Object next : map.keySet()) {
                str = str.replace(next.toString(), map.get(next).toString());
            }
        }
        return str;
    }

    /* renamed from: com.inmobi.media.p$b */
    /* compiled from: AdUnit */
    public static class C5454b {
        /* renamed from: a */
        public static HashMap<String, String> m12902a(String str, String str2, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) {
            HashMap<String, String> hashMap = new HashMap<>();
            int i = 0;
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    int i2 = 0;
                    while (i2 < length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        int i3 = i2 + 1;
                        sb.append(i3);
                        hashMap.put(sb.toString(), jSONArray.getString(i2));
                        i2 = i3;
                    }
                } catch (Exception e) {
                    String str3 = C5435p.f12510a;
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }
            if (jSONArray2 != null) {
                int length2 = jSONArray2.length();
                while (i < length2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    int i4 = i + 1;
                    sb2.append(i4);
                    hashMap.put(sb2.toString(), jSONArray2.getString(i));
                    i = i4;
                }
            }
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        static Map<String, Object> m12903a(JSONArray jSONArray) {
            JSONObject jSONObject;
            try {
                int length = jSONArray.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        jSONObject = null;
                        break;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.has("moat")) {
                        jSONObject = jSONObject2.getJSONObject("moat");
                        break;
                    }
                    i++;
                }
                if (jSONObject == null) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(TJAdUnitConstants.String.ENABLED, Boolean.valueOf(jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED)));
                hashMap.put("instrumentVideo", Boolean.valueOf(jSONObject.optBoolean("instrumentVideo", false)));
                hashMap.put("partnerCode", jSONObject.optString("partnerCode", (String) null));
                hashMap.put("clientLevels", jSONObject.optJSONArray("clientLevels"));
                hashMap.put("clientSlicers", jSONObject.optJSONArray("clientSlicers"));
                hashMap.put("zMoatExtras", jSONObject.optJSONObject("zMoatExtras"));
                return hashMap;
            } catch (JSONException e) {
                String str = C5435p.f12510a;
                C5275fn.m12068a().mo40590a(new C5308gk(e));
                return null;
            }
        }
    }

    /* renamed from: N */
    public C5415m mo40962N() {
        return this.f12512B;
    }

    /* renamed from: a */
    public void mo40981a(final String str, final String str2) {
        this.f12532s.mo40658a(hashCode(), new C5456r<C5435p>(this) {
            /* renamed from: a */
            public final void mo39944a() {
                C5435p pVar = (C5435p) this.f12573f.get();
                if (pVar != null) {
                    C4948ah v = pVar.mo41009v();
                    if (v == null || str == null || !v.mo40036f().equals(str2)) {
                        String str = C5435p.f12510a;
                        return;
                    }
                    C5435p.m12739a(pVar, v, str);
                    String str2 = C5435p.f12510a;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo40982a(String str, String str2, C5373i iVar, String str3) {
        final String str4 = str3;
        final C5373i iVar2 = iVar;
        final String str5 = str;
        final String str6 = str2;
        this.f12532s.mo40658a(hashCode(), new C5456r<C5435p>(this) {
            /* renamed from: a */
            public final void mo39944a() {
                C5435p pVar = (C5435p) this.f12573f.get();
                if (pVar != null) {
                    try {
                        C4948ah v = pVar.mo41009v();
                        if (v == null || !v.mo40036f().equals(str4)) {
                            String str = C5435p.f12510a;
                            iVar2.mo40737a(str5, str6, "");
                            return;
                        }
                        iVar2.mo40737a(str5, str6, v.mo40034d());
                        String str2 = C5435p.f12510a;
                    } catch (Exception e) {
                        String str3 = C5435p.f12510a;
                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo40963O() {
        this.f12532s.mo40658a(hashCode(), new C5456r<C5435p>(this) {
            /* renamed from: a */
            public final void mo39944a() {
                HashMap<String, String> a;
                C5435p pVar = (C5435p) this.f12573f.get();
                if (pVar != null) {
                    try {
                        byte m = pVar.mo39960m();
                        JSONObject jSONObject = new JSONObject(pVar.f12518e);
                        C5220ev p = pVar.mo41003p();
                        if (pVar.f12530q == null) {
                            a = null;
                        } else {
                            a = C5328gx.m12270a(pVar.f12530q.mo40109l());
                        }
                        final C5016bj bjVar = new C5016bj((int) m, jSONObject, p, a, (C5094cv) null);
                        C5435p.this.f12523j.post(new Runnable() {
                            public final void run() {
                                try {
                                    C5033bt btVar = bjVar.f11412k;
                                    C4948ah v = C5435p.this.mo41009v();
                                    if (btVar != null && C5435p.this.mo40999i() != null && v != null) {
                                        C5435p pVar = C5435p.this;
                                        Context i = C5435p.this.mo40999i();
                                        byte m = C5435p.this.mo39960m();
                                        Set b = C5435p.this.f12539z;
                                        C5435p pVar2 = C5435p.this;
                                        C5415m unused = pVar.f12512B = new C5415m(i, m, b, pVar2.f12530q == null ? null : pVar2.f12530q.mo40101d());
                                        C5435p.this.f12512B.mo40849a(C5435p.this.f12514D, C5435p.this.mo41003p(), C5435p.this.mo40968V(), false);
                                        C5435p.this.f12512B.f12464i = true;
                                        C5435p.this.f12512B.setBlobProvider(C5435p.this);
                                        C5435p.this.f12512B.setIsPreload(true);
                                        C5435p.this.f12512B.setPlacementId(C5435p.this.f12529p.mo40070e());
                                        C5435p.this.f12512B.setCreativeId(v.mo40051u());
                                        C5435p.this.f12512B.setAllowAutoRedirection(C5435p.this.f12535v);
                                        C5435p.this.f12512B.setShouldFireRenderBeacon(false);
                                        if (C5435p.this.f12522i == 0) {
                                            C5435p.this.mo40998f(C5435p.this.f12512B);
                                        }
                                        if (C5435p.this.mo40995d((byte) 2)) {
                                            if ("URL".equals(btVar.f11483z)) {
                                                C5435p.this.f12512B.mo40857c((String) btVar.f11363e);
                                            } else {
                                                C5435p.this.f12512B.mo40854b((String) btVar.f11363e);
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    String str = C5435p.f12510a;
                                    C5435p.this.f12515b = 3;
                                    C5435p.this.mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) Ascii.f10100CR);
                                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                                }
                            }
                        });
                    } catch (Exception e) {
                        String str = C5435p.f12510a;
                        pVar.f12515b = 3;
                        pVar.mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) Ascii.f10100CR);
                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                    }
                }
            }

            /* renamed from: b */
            public final void mo39946b() {
                super.mo39946b();
                C5435p pVar = (C5435p) this.f12573f.get();
                if (pVar != null) {
                    pVar.f12515b = 3;
                    pVar.mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), false, (byte) 40);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo40964P() {
        if (this.f12524k && this.f12525l && this.f12511A) {
            mo39948Q();
        }
    }

    /* renamed from: a */
    public void mo40975a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C4958ao aoVar = this.f12530q;
        C4948ah j = aoVar == null ? null : aoVar.mo40107j();
        if (j == null) {
            C5453a q = mo41004q();
            if (q != null) {
                q.mo40001a(this, false, inMobiAdRequestStatus);
                return;
            }
            return;
        }
        this.f12532s.mo40658a(hashCode(), new C4934ae(this, j, true, inMobiAdRequestStatus));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean mo40966S() {
        C4948ah v = mo41009v();
        if (v != null && 4 == mo41001k() && !mo41005r()) {
            C5453a q = mo41004q();
            if (q != null) {
                mo40992c(q);
            }
            return true;
        } else if (v != null && 2 == mo41001k() && !mo41005r()) {
            return false;
        } else {
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (byte) 49);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo40967U() throws IllegalStateException {
        C4948ah aa = mo41034aa();
        if (aa != null) {
            aa.mo40036f();
            String i = aa.mo40039i();
            char c = 65535;
            int hashCode = i.hashCode();
            if (hashCode != -1470802432) {
                if (hashCode != -1084172778) {
                    if (hashCode == 3213227 && i.equals(TJAdUnitConstants.String.HTML)) {
                        c = 2;
                    }
                } else if (i.equals("inmobiJson")) {
                    c = 3;
                }
            } else if (i.equals("mediationJson")) {
                c = 1;
            }
            if (c != 2) {
                if (c == 3) {
                    C4958ao aoVar = this.f12530q;
                    if (aoVar != null) {
                        aoVar.mo40097a(this.f12516c, (C5093cu) this);
                    }
                } else {
                    aa.mo40039i();
                    throw new IllegalStateException("Can not handle fallback for markup type: " + aa.mo40039i());
                }
            }
            List<String> v = aa.mo40052v();
            if (v != null) {
                for (String a : v) {
                    C4983ax.m11340a().mo40134a(a, true);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to get topAd");
    }

    /* renamed from: aa */
    private C4948ah mo41034aa() {
        C4948ah v = mo41009v();
        if (v != null && !mo41005r()) {
            return v;
        }
        return null;
    }

    /* renamed from: a */
    public void mo39953a(C4948ah ahVar, boolean z) {
        C4958ao aoVar;
        C4948ah aa = mo41034aa();
        if (aa != null) {
            aa.mo40036f();
            String i = aa.mo40039i();
            char c = 65535;
            int hashCode = i.hashCode();
            if (hashCode != -1470802432) {
                if (hashCode != -1084172778) {
                    if (hashCode == 3213227 && i.equals(TJAdUnitConstants.String.HTML)) {
                        c = 2;
                    }
                } else if (i.equals("inmobiJson")) {
                    c = 3;
                }
            } else if (i.equals("mediationJson")) {
                c = 1;
            }
            if (c == 2) {
                return;
            }
            if (c != 3) {
                aa.mo40039i();
                throw new IllegalStateException("Can not handle fallback for markup type: " + aa.mo40039i());
            } else if (mo41001k() == 2 && (aoVar = this.f12530q) != null) {
                aoVar.mo40096a(ahVar);
                C4960ap s = mo41006s();
                String g = this.f12530q.mo40104g();
                if (ahVar != null) {
                    Set<C5005ba> h = ahVar.mo40038h();
                    if (h.size() == 0) {
                        s.f11246a.mo40117a(s.f11247b, true);
                        return;
                    }
                    C4951aj ajVar = new C4951aj(UUID.randomUUID().toString(), g, h, s.f11249d);
                    C4970at a = C4970at.m11277a();
                    a.f11261a.execute(new Runnable(ajVar, ahVar.mo40032b()) {

                        /* renamed from: a */
                        final /* synthetic */ C4951aj f11278a;

                        /* renamed from: b */
                        final /* synthetic */ String f11279b;

                        public final void run(
/*
Method generation error in method: com.inmobi.media.at.4.run():void, dex: classes3.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.at.4.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final boolean mo40968V() {
        C4948ah v = mo41009v();
        return v != null && v.mo40049s();
    }

    /* renamed from: f */
    public void mo40822f() {
        mo40997e((byte) 4);
        C5453a q = mo41004q();
        if (q != null) {
            q.mo41030k();
            q.mo39971e();
        }
    }

    /* renamed from: g */
    public void mo40823g() {
        this.f12523j.post(new Runnable() {
            public final void run() {
                C5453a q;
                if ((C5435p.this.mo41001k() == 6 || C5435p.this.mo41001k() == 7) && (q = C5435p.this.mo41004q()) != null) {
                    q.mo41029j();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo40337b(byte b) {
        C5453a q;
        if (b == 0) {
            mo40977a(this.f12529p, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
        } else if (b != 1) {
            if (b == 2) {
                m12742b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            } else if (b == 4 && (q = mo41004q()) != null) {
                q.mo41028i();
            }
        } else if (2 == mo41001k()) {
            this.f12515b = 3;
            C5453a q2 = mo41004q();
            if (q2 != null) {
                q2.mo40010b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            mo40971a((byte) 47);
        }
    }

    /* renamed from: c */
    public void mo40338c(byte b) {
        C5453a q;
        if (b == 0) {
            mo40977a(this.f12529p, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
        } else if (b != 1) {
            if (b == 2) {
                m12742b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            } else if (b == 4 && (q = mo41004q()) != null) {
                q.mo41028i();
            }
        } else if (2 == mo41001k()) {
            this.f12515b = 3;
            C5453a q2 = mo41004q();
            if (q2 != null) {
                q2.mo40010b(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY));
            }
            mo40971a((byte) 40);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo40995d(byte b) {
        int i;
        if (b == 0) {
            i = this.f12534u.mo40759c();
        } else if (b == 1) {
            i = this.f12534u.mo40762f();
        } else if (b == 2) {
            i = this.f12534u.mo40765i();
        } else if (b != 4) {
            return false;
        } else {
            i = this.f12534u.mo40763g();
        }
        long j = (long) i;
        C5078cn cnVar = this.f12513C;
        return cnVar != null && cnVar.mo40340a(b, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo40997e(byte b) {
        C5078cn cnVar = this.f12513C;
        if (cnVar != null) {
            cnVar.mo40339a(b);
        }
    }

    /* renamed from: h */
    public C5394ik mo40824h() {
        return this.f12534u;
    }

    /* renamed from: W */
    public boolean mo40969W() {
        return this.f12531r;
    }

    /* renamed from: X */
    public void mo40970X() {
        this.f12531r = false;
    }

    /* renamed from: a */
    public void mo40117a(C4955an anVar, boolean z) {
        if (!this.f12526m && mo40999i() != null) {
            mo39955b(anVar, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40978a(C4958ao aoVar) {
        if (!this.f12526m && mo40999i() != null) {
            mo39956b(aoVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39954a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            this.f12515b = 2;
        } else {
            mo40976a(inMobiAdRequestStatus, true, (byte) 1);
        }
    }

    /* renamed from: a */
    public void mo40977a(C4955an anVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (!this.f12526m && mo40999i() != null) {
            if (inMobiAdRequestStatus.getStatusCode() == InMobiAdRequestStatus.StatusCode.NO_FILL) {
                mo41010w();
            }
            try {
                if (this.f12529p.equals(anVar) && mo41001k() == 1) {
                    C5327gw.m12263a((byte) 2, "InMobi", "Failed to fetch ad for placement id: " + this.f12529p.toString() + ", reason phrase available in onAdLoadFailed callback.");
                    inMobiAdRequestStatus.getMessage();
                    this.f12515b = 3;
                    mo40971a((byte) 7);
                    C5453a q = mo41004q();
                    if (q != null) {
                        q.mo39999a(inMobiAdRequestStatus);
                    }
                }
            } catch (Exception e) {
                C5327gw.m12263a((byte) 1, "InMobi", "Unable to load Ad; SDK encountered an unexpected error");
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo41011x() {
        String str;
        try {
            Context i = mo40999i();
            if (i != null) {
                try {
                    if (this.f12538y == null || this.f12538y.f12473r.get()) {
                        this.f12538y = new C5415m(i, mo39960m(), this.f12539z, mo41009v().mo40036f());
                        if (this.f12529p.mo40078k().equals(AdFormat.BANNER)) {
                            this.f12538y.setAdSize(this.f12529p.mo40079l());
                        }
                        this.f12538y.mo40849a((C5415m.C5432a) this, mo41003p(), mo40968V(), true);
                        C5415m mVar = this.f12538y;
                        C4948ah v = mo41009v();
                        if (v == null) {
                            str = null;
                        } else {
                            str = v.mo40028a();
                        }
                        mVar.setBundleId(str);
                        this.f12538y.setPlacementId(this.f12529p.mo40070e());
                        this.f12538y.setAllowAutoRedirection(this.f12535v);
                        AdMetaInfo Y = mo39950Y();
                        if (Y != null) {
                            this.f12538y.setCreativeId(Y.getCreativeID());
                        }
                        if (this.f12529p.mo40072f()) {
                            this.f12538y.mo40683a();
                        }
                    }
                } catch (Exception e) {
                    mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
                    C5275fn.m12068a().mo40590a(new C5308gk(e));
                }
            }
            if (mo40995d((byte) 2)) {
                if (this.f12538y != null) {
                    this.f12538y.mo40854b(this.f12518e);
                }
                mo40998f(this.f12538y);
            }
        } catch (Exception e2) {
            mo40997e((byte) 2);
            C5327gw.m12263a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
            C5275fn.m12068a().mo40590a(new C5308gk(e2));
            mo40976a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    /* renamed from: Z */
    private int mo39951Z() {
        try {
            this.f12515b = 1;
            C5359ht.m12386a().mo40719c();
            if (!mo40995d((byte) 0)) {
                return -2;
            }
            this.f12532s.mo40658a(hashCode(), new C5434o(this));
            return 0;
        } catch (Exception e) {
            C5327gw.m12263a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an unexpected error");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40983a(WeakReference<C5453a> weakReference, byte b, InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f12515b = 3;
        mo40971a(b);
        if (!this.f12526m) {
            C5453a aVar = (C5453a) weakReference.get();
            if (aVar == null) {
                C5327gw.m12263a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            } else if ("int".equals(mo39959l())) {
                aVar.mo39965a();
            } else {
                aVar.mo40000a(this, inMobiAdRequestStatus);
            }
        }
    }

    /* renamed from: a */
    public final void mo40809a() {
        if (!this.f12526m && mo40999i() != null) {
            this.f12523j.post(new Runnable() {
                public final void run() {
                    C5435p.this.mo40957I();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo40813b() {
        if (!this.f12526m && mo40999i() != null) {
            this.f12523j.post(new Runnable() {
                public final void run() {
                    C5435p.this.mo40958J();
                }
            });
        }
    }

    /* renamed from: c */
    public void mo40816c() {
        if (!this.f12526m && mo40999i() != null) {
            this.f12523j.post(new Runnable() {
                public final void run() {
                    if (6 == C5435p.this.mo41001k()) {
                        C5435p.this.f12515b = 3;
                        if (C5435p.this.mo41004q() != null) {
                            C5435p.this.mo41004q().mo39965a();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public void mo40821e(final C5415m mVar) {
        if (!this.f12526m && mo40999i() != null) {
            try {
                this.f12523j.post(new Runnable() {
                    public final void run() {
                        C5435p.this.mo40959K();
                    }
                });
            } catch (Exception unused) {
                C5327gw.m12263a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
            }
        }
    }

    /* renamed from: a */
    public void mo40812a(HashMap<Object, Object> hashMap) {
        if (!this.f12526m && mo40999i() != null && mo41004q() != null) {
            mo41004q().mo40012b((Map<Object, Object>) hashMap);
        }
    }

    /* renamed from: b */
    public void mo40815b(HashMap<Object, Object> hashMap) {
        if (!this.f12526m && mo40999i() != null && mo41004q() != null) {
            mo41004q().mo40002a((Map<Object, Object>) hashMap);
        }
    }

    /* renamed from: d */
    public void mo40818d() {
        if (!this.f12526m && mo40999i() != null && mo41004q() != null) {
            mo41004q().mo40017d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40990b(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z) {
            this.f12515b = 2;
        }
        C5453a q = mo41004q();
        if (q != null) {
            q.mo40001a(this, z, inMobiAdRequestStatus);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12739a(C5435p pVar, C4948ah ahVar, String str) {
        ahVar.mo40029a(str);
        C4958ao aoVar = pVar.f12530q;
        if (aoVar != null) {
            aoVar.mo40096a(ahVar);
        }
    }
}
