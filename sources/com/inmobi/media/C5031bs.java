package com.inmobi.media;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bs */
/* compiled from: NativeVideoAsset */
public final class C5031bs extends C5010bf {

    /* renamed from: A */
    public boolean f11472A;

    /* renamed from: B */
    public boolean f11473B;

    /* renamed from: C */
    public boolean f11474C;

    /* renamed from: D */
    public boolean f11475D;

    /* renamed from: E */
    public int f11476E;

    /* renamed from: F */
    public int f11477F;

    /* renamed from: G */
    public Map<String, Object> f11478G;

    /* renamed from: H */
    private boolean f11479H;

    /* renamed from: z */
    List<C5010bf> f11480z = new ArrayList();

    /* renamed from: com.inmobi.media.bs$a */
    /* compiled from: NativeVideoAsset */
    static class C5032a extends C5011bg {
        public C5032a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C5024bo boVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, "none", "straight", "#ff000000", "#00000000", boVar);
        }
    }

    public C5031bs(String str, String str2, C5011bg bgVar, C5095cw cwVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<C5030br> list, JSONObject jSONObject, boolean z6) {
        super(str, str2, ShareConstants.VIDEO_URL, bgVar);
        this.f11363e = cwVar;
        this.f11367i = 2;
        this.f11472A = z;
        this.f11473B = z2;
        this.f11474C = z3;
        this.f11475D = z4;
        this.f11479H = z6;
        if (cwVar != null) {
            this.f11376r = cwVar.mo40356a();
            List<C5030br> d = cwVar.mo40361d();
            Map<String, String> map = null;
            if (list != null) {
                for (C5030br next : list) {
                    if ("OMID_VIEWABILITY".equals(next.f11469d)) {
                        map = next.f11470e;
                        if (!TextUtils.isEmpty(next.f11467b)) {
                            d.add(next);
                        }
                    } else {
                        d.add(next);
                    }
                }
            }
            for (C5030br next2 : d) {
                if ("OMID_VIEWABILITY".equals(next2.f11469d)) {
                    next2.f11470e = map;
                }
            }
            if (!d.isEmpty()) {
                mo40164a(d);
            }
        }
        if (jSONObject != null) {
            this.f11364f = jSONObject;
        }
        this.f11380v.put("placementType", (byte) 0);
        this.f11380v.put("lastVisibleTimestamp", Integer.MIN_VALUE);
        this.f11380v.put(TJAdUnitConstants.String.VISIBLE, Boolean.FALSE);
        this.f11380v.put("seekPosition", 0);
        this.f11380v.put("didStartPlaying", Boolean.FALSE);
        this.f11380v.put("didPause", Boolean.FALSE);
        this.f11380v.put("didCompleteQ1", Boolean.FALSE);
        this.f11380v.put("didCompleteQ2", Boolean.FALSE);
        this.f11380v.put("didCompleteQ3", Boolean.FALSE);
        this.f11380v.put("didCompleteQ4", Boolean.FALSE);
        this.f11380v.put("didRequestFullScreen", Boolean.FALSE);
        this.f11380v.put("isFullScreen", Boolean.FALSE);
        this.f11380v.put("didImpressionFire", Boolean.FALSE);
        this.f11380v.put("mapViewabilityParams", new HashMap());
        this.f11380v.put("didSignalVideoCompleted", Boolean.FALSE);
        this.f11380v.put("shouldAutoPlay", Boolean.valueOf(z5));
        this.f11380v.put("lastMediaVolume", 0);
        this.f11380v.put("currentMediaVolume", 0);
        this.f11380v.put("didQ4Fire", Boolean.FALSE);
    }

    /* renamed from: a */
    public final boolean mo40204a() {
        if (this.f11479H) {
            return this.f11472A && !C5314go.m12210e();
        }
        return this.f11472A;
    }

    /* renamed from: a */
    public final void mo40203a(C5031bs bsVar) {
        this.f11380v.putAll(bsVar.f11380v);
        this.f11478G.putAll(bsVar.f11478G);
        this.f11379u = bsVar.f11379u;
    }

    /* renamed from: b */
    public final C5095cw mo40205b() {
        if (this.f11363e == null) {
            return null;
        }
        return (C5095cw) this.f11363e;
    }
}
