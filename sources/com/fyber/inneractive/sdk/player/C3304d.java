package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.p037d.C2829d;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p047g.p048a.C2916a;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p047g.p048a.C2928m;
import com.fyber.inneractive.sdk.p047g.p048a.C2933r;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p050i.C2991a;
import com.fyber.inneractive.sdk.p050i.C2996c;
import com.fyber.inneractive.sdk.p050i.C3011h;
import com.fyber.inneractive.sdk.p050i.C3013i;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.p051j.C3022i;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.player.C3101a;
import com.fyber.inneractive.sdk.player.enums.C3607a;
import com.fyber.inneractive.sdk.player.enums.C3608b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p058b.C3154b;
import com.fyber.inneractive.sdk.player.p058b.C3155c;
import com.fyber.inneractive.sdk.player.p058b.C3161f;
import com.fyber.inneractive.sdk.player.p083e.C3600e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.d */
public final class C3304d extends C3145b implements C3101a.C3102a {

    /* renamed from: v */
    private static final HashMap<String, C3309a> f8541v = new HashMap<String, C3309a>() {
        {
            put("[CLICKAREA]", new C3309a() {
                /* renamed from: a */
                public final String mo19109a(C3161f fVar, VideoClickOrigin videoClickOrigin) {
                    return videoClickOrigin.name().toLowerCase();
                }
            });
            put("[ADPLAYHEAD]", new C3309a() {
                /* renamed from: a */
                public final String mo19109a(C3161f fVar, VideoClickOrigin videoClickOrigin) {
                    int g;
                    if (fVar == null || (g = fVar.mo18782g()) <= 0) {
                        return "00:00:00.000";
                    }
                    long j = (long) g;
                    long hours = TimeUnit.MILLISECONDS.toHours(j);
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(j - TimeUnit.HOURS.toMillis(hours));
                    long seconds = TimeUnit.MILLISECONDS.toSeconds((j - TimeUnit.HOURS.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes));
                    return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(TimeUnit.MILLISECONDS.toMillis(((j - TimeUnit.HOURS.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)))});
                }
            });
        }
    };

    /* renamed from: q */
    protected C2809u f8542q;

    /* renamed from: r */
    private C2916a f8543r;

    /* renamed from: s */
    private C3607a f8544s;

    /* renamed from: t */
    private boolean f8545t;

    /* renamed from: u */
    private C2829d f8546u;

    /* renamed from: com.fyber.inneractive.sdk.player.d$a */
    public interface C3309a {
        /* renamed from: a */
        String mo19109a(C3161f fVar, VideoClickOrigin videoClickOrigin);
    }

    /* renamed from: t */
    public final void mo18838t() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3304d(android.content.Context r7, com.fyber.inneractive.sdk.p051j.C3020g r8, com.fyber.inneractive.sdk.config.C2809u r9, com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.p037d.C2857q r11) {
        /*
            r6 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0005
            r1 = r0
            goto L_0x000b
        L_0x0005:
            com.fyber.inneractive.sdk.config.x r1 = r9.mo18068e()
            java.util.Set<com.fyber.inneractive.sdk.config.enums.Vendor> r1 = r1.f6663c
        L_0x000b:
            if (r11 != 0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            com.fyber.inneractive.sdk.config.a.s r0 = r11.mo18132i()
        L_0x0012:
            r6.<init>(r7, r1, r0)
            com.fyber.inneractive.sdk.player.enums.a r0 = com.fyber.inneractive.sdk.player.enums.C3607a.Uninitialized
            r6.f8544s = r0
            if (r8 == 0) goto L_0x00e4
            com.fyber.inneractive.sdk.g.a.a r0 = r8.f7426E
            if (r0 == 0) goto L_0x00e4
            r6.f7776d = r11
            com.fyber.inneractive.sdk.g.a.a r0 = r8.f7426E
            r6.f8543r = r0
            com.fyber.inneractive.sdk.d.d r0 = new com.fyber.inneractive.sdk.d.d
            com.fyber.inneractive.sdk.d.q r1 = r6.f7776d
            com.fyber.inneractive.sdk.config.a.s r1 = r1.mo18132i()
            r0.<init>(r7, r8, r10, r1)
            r6.f8546u = r0
            r6.f7777e = r10
            int r7 = com.fyber.inneractive.sdk.util.IAlog.f9870a
            r0 = 1
            r1 = 3
            r2 = 0
            if (r7 > r1) goto L_0x0070
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r3 = "IAVastMediaPlayerFlowManager:ctor - got media files: "
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r3, r7)
            r7 = 0
        L_0x0043:
            com.fyber.inneractive.sdk.g.a.a r3 = r6.f8543r
            java.util.PriorityQueue<com.fyber.inneractive.sdk.g.a.m> r3 = r3.f6944e
            int r3 = r3.size()
            if (r7 >= r3) goto L_0x0070
            com.fyber.inneractive.sdk.g.a.a r3 = r6.f8543r
            java.util.List r3 = r3.mo18378b()
            java.lang.Object r3 = r3.get(r7)
            com.fyber.inneractive.sdk.g.a.m r3 = (com.fyber.inneractive.sdk.p047g.p048a.C2928m) r3
            if (r3 == 0) goto L_0x006d
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4[r2] = r5
            java.lang.String r3 = r3.f7016j
            r4[r0] = r3
            java.lang.String r3 = "IAVastMediaPlayerFlowManager(%d): %s"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r3, r4)
        L_0x006d:
            int r7 = r7 + 1
            goto L_0x0043
        L_0x0070:
            if (r9 == 0) goto L_0x0089
            r6.f8542q = r9
            com.fyber.inneractive.sdk.config.w r7 = r9.mo18070g()
            if (r7 == 0) goto L_0x0089
            com.fyber.inneractive.sdk.config.w r7 = r9.mo18070g()
            java.lang.Boolean r7 = r7.mo18073a()
            boolean r7 = r7.booleanValue()
            r6.mo18747b(r7)
        L_0x0089:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = r8.f7415r
            if (r10 == 0) goto L_0x0095
            boolean r10 = r10.getAllowFullscreen()
            if (r10 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            int r10 = r8.f7404g
            int r3 = r8.f7405h
            com.fyber.inneractive.sdk.d.d r4 = r6.f8546u
            r4.f6726l = r7
            r4.f6727m = r0
            r4.f6728n = r10
            r4.f6729o = r3
            r4.f6730p = r9
            com.fyber.inneractive.sdk.config.a.s r7 = r11.mo18132i()
            java.lang.String r9 = "prebuffer_interstitial"
            java.lang.String r10 = "prebuffer_rewarded"
            if (r7 == 0) goto L_0x00cd
            com.fyber.inneractive.sdk.config.a.s r7 = r11.mo18132i()
            java.lang.Class<com.fyber.inneractive.sdk.config.a.a.f> r11 = com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.class
            com.fyber.inneractive.sdk.config.a.a.d r7 = r7.mo18010a(r11)
            com.fyber.inneractive.sdk.config.a.a.f r7 = (com.fyber.inneractive.sdk.config.p034a.p035a.C2746f) r7
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r8 = r8.f7415r
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r11 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r8 != r11) goto L_0x00c6
            int r7 = r7.mo17981a((java.lang.String) r9, (int) r1)
            goto L_0x00ca
        L_0x00c6:
            int r7 = r7.mo17981a((java.lang.String) r10, (int) r1)
        L_0x00ca:
            r6.f7787o = r7
            return
        L_0x00cd:
            com.fyber.inneractive.sdk.config.j r7 = com.fyber.inneractive.sdk.config.IAConfigManager.m5929c()
            com.fyber.inneractive.sdk.config.i r7 = r7.f6586a
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r8 = r8.f7415r
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r11 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r8 != r11) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r9 = r10
        L_0x00db:
            r8 = 10
            int r7 = r7.mo18046a(r9, r8, r2)
            r6.f7787o = r7
            return
        L_0x00e4:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "IAVastMediaPlayerFlowManager ctor - vastData can't be null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C3304d.<init>(android.content.Context, com.fyber.inneractive.sdk.j.g, com.fyber.inneractive.sdk.config.u, com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.d.q):void");
    }

    /* renamed from: a */
    public final void mo18738a() {
        super.mo18738a();
        C2829d dVar = this.f8546u;
        if (dVar != null) {
            dVar.f6720f = false;
            if (!(dVar.f6721g == null || !(dVar.f6721g instanceof C3037c) || dVar.f6723i == null)) {
                C3155c cVar = dVar.f6723i;
                if (cVar.f7812a != null) {
                    cVar.f7812a.mo18553c();
                    cVar.f7812a = null;
                }
            }
            if (dVar.f6725k != null) {
                dVar.f6725k.f7066c = true;
            }
            dVar.f6723i = null;
        }
        this.f8546u = null;
    }

    /* renamed from: a */
    public final void mo18670a(String str, String... strArr) {
        if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
            this.f8545t = true;
        } else if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
            for (String a : strArr) {
                mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.m6560a(a));
            }
        }
    }

    /* renamed from: a */
    public final void mo18669a(C3011h hVar, C3154b bVar, C3600e eVar, C2900c.C2901a aVar) {
        if (bVar == null) {
            aVar.dismissAd(true);
        } else if (eVar.mo19496e()) {
            if (hVar.mo18230a()) {
                aVar.dismissAd(true);
            }
        } else if (bVar.mo18795c()) {
            bVar.mo18797d(true);
        }
    }

    /* renamed from: a */
    public final C3013i mo18666a(boolean z, C3312g gVar) {
        return z ? new C2996c(gVar) : new C2991a(gVar);
    }

    /* renamed from: b */
    public final boolean mo18671b() {
        return this.f7774b != null;
    }

    /* renamed from: h */
    public final View mo18754h() {
        C2829d dVar = this.f8546u;
        if (dVar == null || !dVar.f6720f) {
            return null;
        }
        return dVar.f6721g;
    }

    /* renamed from: i */
    public final C3155c mo18755i() {
        C2829d dVar = this.f8546u;
        if (dVar != null) {
            return dVar.f6723i;
        }
        return null;
    }

    /* renamed from: j */
    public final void mo18756j() {
        if (this.f8543r.f6946g != null && !this.f8546u.f6724j) {
            mo18741a((C3022i) this.f8543r.f6946g, VideoClickOrigin.COMPANION, C2933r.EVENT_CREATIVE_VIEW);
            C2829d dVar = this.f8546u;
            if (!dVar.f6724j) {
                C2968n.C2969a aVar = new C2968n.C2969a(C2967m.VAST_COMPANION_DISPLAYED, dVar.f6716b, (C3018e) dVar.f6717c, dVar.f6718d.mo18013b());
                aVar.mo18435a("companion_data", dVar.f6719e.f6946g.mo18379a());
                aVar.mo18436b((String) null);
            }
            dVar.f6724j = true;
        }
    }

    /* renamed from: n */
    public final C2917b mo18760n() {
        C2916a aVar = this.f8543r;
        if (aVar != null) {
            return aVar.f6946g;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18742a(VideoClickOrigin videoClickOrigin, C2933r... rVarArr) {
        mo18741a((C3022i) this.f8543r, videoClickOrigin, rVarArr);
    }

    /* renamed from: a */
    public final void mo18743a(C3608b bVar) {
        super.mo18743a(bVar);
        int i = C33082.f8549a[bVar.ordinal()];
        if (i != 2) {
            if (i == 3) {
                m8167a(C3607a.f9837g);
            }
        } else if (this.f8544s.equals(C3607a.f9837g)) {
            m8167a(C3607a.Restarted);
        }
    }

    /* renamed from: a */
    public final void mo18837a(int i) {
        int h = this.f7774b.mo18783h();
        int i2 = C33082.f8550b[this.f8544s.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4 && i > (h / 4) * 3) {
                        m8167a(C3607a.ThirdPQuarter);
                    }
                } else if (i > h / 2) {
                    m8167a(C3607a.MidPoint);
                }
            } else if (i > h / 4) {
                m8167a(C3607a.FirstQuarter);
            }
        } else if (this.f7774b.mo18824p() != C3608b.Buffering) {
            m8167a(C3607a.Started);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.d$2 */
    static /* synthetic */ class C33082 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8549a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8550b;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        static {
            /*
                com.fyber.inneractive.sdk.player.enums.a[] r0 = com.fyber.inneractive.sdk.player.enums.C3607a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8550b = r0
                r1 = 1
                com.fyber.inneractive.sdk.player.enums.a r2 = com.fyber.inneractive.sdk.player.enums.C3607a.Uninitialized     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8550b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.player.enums.a r3 = com.fyber.inneractive.sdk.player.enums.C3607a.Started     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8550b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.player.enums.a r4 = com.fyber.inneractive.sdk.player.enums.C3607a.FirstQuarter     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f8550b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.player.enums.a r4 = com.fyber.inneractive.sdk.player.enums.C3607a.MidPoint     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f8550b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.player.enums.a r4 = com.fyber.inneractive.sdk.player.enums.C3607a.ThirdPQuarter     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f8550b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fyber.inneractive.sdk.player.enums.a r4 = com.fyber.inneractive.sdk.player.enums.C3607a.f9837g     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.fyber.inneractive.sdk.player.enums.b[] r3 = com.fyber.inneractive.sdk.player.enums.C3608b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f8549a = r3
                com.fyber.inneractive.sdk.player.enums.b r4 = com.fyber.inneractive.sdk.player.enums.C3608b.Prepared     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f8549a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.fyber.inneractive.sdk.player.enums.b r3 = com.fyber.inneractive.sdk.player.enums.C3608b.Playing     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f8549a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C3608b.f9847i     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C3304d.C33082.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18740a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_ERROR);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!(this.f7788p == null || inneractiveVideoError.getPlayerError() == InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES)) {
                jSONObject.put("url", this.f7788p.f7016j);
                jSONObject.put(MediaFile.BITRATE, this.f7788p.f7012f);
                jSONObject.put("mime", this.f7788p.f7010d);
                jSONObject.put(MediaFile.DELIVERY, this.f7788p.f7007a);
            }
            jSONObject.put("player", this.f7774b != null ? this.f7774b.mo18787l() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put("message", inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.m9034b("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
        super.mo18740a(inneractiveVideoError, jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo18757k() {
        mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_CREATIVE_VIEW);
    }

    /* renamed from: l */
    public final String mo18758l() {
        C2916a aVar = this.f8543r;
        if (aVar != null) {
            return aVar.f6941b;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo18759m() {
        this.f8546u.mo18118a();
    }

    /* renamed from: a */
    public final void mo18741a(C3022i iVar, VideoClickOrigin videoClickOrigin, C2933r... rVarArr) {
        if (rVarArr.length == 0) {
            IAlog.m9036d("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
        } else if (iVar == null) {
            IAlog.m9036d("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (C2933r rVar : rVarArr) {
                String str = rVar.f7056w;
                IAlog.m9034b("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
                List<String> a = iVar.mo18376a(rVar);
                if (a == null || a.size() == 0) {
                    IAlog.m9034b("IAVastMediaPlayerFlowManager: no events for type: %s", str);
                } else {
                    arrayList.addAll(a);
                    IAlog.m9034b("found %d events for type: %s", Integer.valueOf(a.size()), str);
                    for (String next : a) {
                        IAlog.m9034b("   event url: %s", next);
                        if (!TextUtils.isEmpty(next)) {
                            IAlog.m9030a(IAlog.f9871b, "%s %s %s", "VAST_EVENT", rVar.f7056w, next);
                            IAlog.m9030a(IAlog.f9871b, "Tracking URLs array: %s", "VPAID", next);
                        }
                    }
                }
                m8168a((List<String>) arrayList, rVar, videoClickOrigin);
            }
            m7429a((List<String>) arrayList);
        }
    }

    /* renamed from: a */
    private void m8167a(C3607a aVar) {
        if (this.f8544s != aVar) {
            if (aVar == C3607a.Started) {
                this.f8545t = false;
                mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_IMPRESSION, C2933r.EVENT_START);
            } else if (aVar == C3607a.FirstQuarter) {
                mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_FIRSTQ);
            } else if (aVar == C3607a.MidPoint) {
                mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_MID);
            } else if (aVar == C3607a.ThirdPQuarter) {
                mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_THIRDQ);
            } else if (aVar == C3607a.f9837g && !this.f8545t) {
                this.f8545t = true;
                mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_COMPLETE);
            } else if (aVar == C3607a.Restarted) {
                mo18742a(VideoClickOrigin.InvalidOrigin, C2933r.EVENT_REWIND);
            }
            this.f8544s = aVar;
        }
    }

    /* renamed from: s */
    public final C2809u mo18765s() {
        return this.f8542q;
    }

    /* renamed from: a */
    public final void mo18668a(C2928m mVar, C3311f fVar) {
        mo18746b(mVar, fVar);
    }

    /* renamed from: a */
    private void m8168a(List<String> list, C2933r rVar, VideoClickOrigin videoClickOrigin) {
        if (rVar == C2933r.EVENT_CLICK) {
            for (Map.Entry next : f8541v.entrySet()) {
                String str = (String) next.getKey();
                String a = ((C3309a) next.getValue()).mo19109a(this.f7774b, videoClickOrigin);
                for (int i = 0; i < list.size(); i++) {
                    String str2 = list.get(i);
                    if (str2.contains(str)) {
                        list.set(i, str2.replace(str, a));
                    }
                }
            }
        }
    }
}
