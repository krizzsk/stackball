package com.inmobi.ads.rendering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.audio.WavUtil;
import com.inmobi.media.C5016bj;
import com.inmobi.media.C5031bs;
import com.inmobi.media.C5041ca;
import com.inmobi.media.C5096cx;
import com.inmobi.media.C5098cz;
import com.inmobi.media.C5184eo;
import com.inmobi.media.C5197ep;
import com.inmobi.media.C5220ev;
import com.inmobi.media.C5238ex;
import com.inmobi.media.C5275fn;
import com.inmobi.media.C5308gk;
import com.inmobi.media.C5314go;
import com.inmobi.media.C5320gt;
import com.inmobi.media.C5327gw;
import com.inmobi.media.C5331h;
import com.inmobi.media.C5343hf;
import com.inmobi.media.C5397j;
import com.inmobi.media.C5410k;
import com.inmobi.media.C5415m;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InMobiAdActivity extends Activity {

    /* renamed from: b */
    public static Map<Integer, C4918a> f11083b = new HashMap();

    /* renamed from: c */
    public static Map<Integer, Intent> f11084c = new HashMap();

    /* renamed from: d */
    public static Integer f11085d = 0;

    /* renamed from: e */
    public static Map<Integer, Object> f11086e = new HashMap();

    /* renamed from: f */
    public static Integer f11087f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f11088g = InMobiAdActivity.class.getSimpleName();

    /* renamed from: h */
    private static SparseArray<C5331h> f11089h = new SparseArray<>();

    /* renamed from: i */
    private static C5415m f11090i;

    /* renamed from: j */
    private static C5415m.C5432a f11091j;

    /* renamed from: a */
    public boolean f11092a = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5331h f11093k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C5415m f11094l;

    /* renamed from: m */
    private C5041ca f11095m;

    /* renamed from: n */
    private C5041ca f11096n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C5184eo f11097o;

    /* renamed from: p */
    private int f11098p;

    /* renamed from: q */
    private int f11099q;

    /* renamed from: r */
    private boolean f11100r = false;

    /* renamed from: s */
    private boolean f11101s = false;

    /* renamed from: com.inmobi.ads.rendering.InMobiAdActivity$a */
    public interface C4918a {
    }

    /* renamed from: a */
    public static int m11053a(C5331h hVar) {
        int hashCode = hVar.hashCode();
        f11089h.put(hashCode, hVar);
        return hashCode;
    }

    /* renamed from: a */
    public static void m11058a(Object obj) {
        f11089h.remove(obj.hashCode());
    }

    /* renamed from: a */
    public static void m11057a(C5415m mVar) {
        f11090i = mVar;
    }

    /* renamed from: a */
    public static void m11056a(C5415m.C5432a aVar) {
        f11091j = aVar;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C5184eo eoVar;
        super.onResume();
        if (!this.f11092a) {
            int i = this.f11098p;
            if (100 == i) {
                C5415m mVar = this.f11094l;
                if (!(mVar == null || mVar.getFullScreenEventsListener() == null)) {
                    try {
                        if (!this.f11100r) {
                            this.f11100r = true;
                            this.f11094l.getFullScreenEventsListener().mo40701a(this.f11094l);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (this.f11099q == 200 && 102 == i) {
                C5331h hVar = this.f11093k;
                if (!(hVar == null || hVar.getFullScreenEventsListener() == null)) {
                    if (!this.f11100r) {
                        this.f11100r = true;
                        this.f11093k.getFullScreenEventsListener().mo40701a((Object) null);
                    }
                }
            } else if (201 == this.f11099q) {
                if (!(this.f11093k instanceof C5410k) || (eoVar = this.f11097o) == null) {
                    C5331h hVar2 = this.f11093k;
                    if (hVar2 instanceof C5397j) {
                        try {
                            if (!this.f11100r) {
                                this.f11100r = true;
                                hVar2.getFullScreenEventsListener().mo40701a((Object) null);
                            }
                        } catch (Exception e) {
                            C5275fn.m12068a().mo40590a(new C5308gk(e));
                        }
                    }
                } else {
                    final C5031bs bsVar = (C5031bs) eoVar.getTag();
                    if (bsVar != null && this.f11101s) {
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            public final void run() {
                                if (InMobiAdActivity.this.f11093k == null) {
                                    return;
                                }
                                if (InMobiAdActivity.this.f11093k.getPlacementType() != 1 || !((Boolean) bsVar.f11380v.get("didCompleteQ4")).booleanValue()) {
                                    InMobiAdActivity.this.f11097o.start();
                                }
                            }
                        }, 50);
                    }
                    if (this.f11093k.getFullScreenEventsListener() != null) {
                        try {
                            if (!this.f11100r) {
                                this.f11100r = true;
                                this.f11093k.getFullScreenEventsListener().mo40701a(bsVar);
                            }
                        } catch (Exception e2) {
                            C5275fn.m12068a().mo40590a(new C5308gk(e2));
                        }
                    }
                }
            }
            this.f11101s = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:36|37|(2:39|49)(1:52)) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        if (r7.f11093k.getFullScreenEventsListener() != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        r7.f11093k.getFullScreenEventsListener().mo40700a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0099 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart() {
        /*
            r7 = this;
            java.lang.String r0 = "time"
            super.onStart()
            boolean r1 = r7.f11092a
            if (r1 != 0) goto L_0x00c9
            r1 = 102(0x66, float:1.43E-43)
            int r2 = r7.f11098p
            if (r1 != r2) goto L_0x00c9
            com.inmobi.media.h r1 = r7.f11093k
            if (r1 == 0) goto L_0x00c9
            com.inmobi.media.cz r1 = r1.getViewableAd()
            r2 = 200(0xc8, float:2.8E-43)
            int r3 = r7.f11099q
            r4 = 0
            if (r2 != r3) goto L_0x0049
            com.inmobi.media.h r0 = r7.f11093k
            byte r0 = r0.getPlacementType()
            r2 = 1
            if (r2 != r0) goto L_0x00c9
            r0 = 2
            android.view.View[] r0 = new android.view.View[r0]     // Catch:{ Exception -> 0x0036 }
            com.inmobi.media.ca r3 = r7.f11095m     // Catch:{ Exception -> 0x0036 }
            r0[r4] = r3     // Catch:{ Exception -> 0x0036 }
            com.inmobi.media.ca r3 = r7.f11096n     // Catch:{ Exception -> 0x0036 }
            r0[r2] = r3     // Catch:{ Exception -> 0x0036 }
            r1.mo40370a((android.view.View[]) r0)     // Catch:{ Exception -> 0x0036 }
            return
        L_0x0036:
            com.inmobi.media.h r0 = r7.f11093k
            com.inmobi.media.h$a r0 = r0.getFullScreenEventsListener()
            if (r0 == 0) goto L_0x0048
            com.inmobi.media.h r0 = r7.f11093k
            com.inmobi.media.h$a r0 = r0.getFullScreenEventsListener()
            r0.mo40700a()
        L_0x0048:
            return
        L_0x0049:
            r2 = 201(0xc9, float:2.82E-43)
            if (r2 != r3) goto L_0x00c9
            com.inmobi.media.h r2 = r7.f11093k     // Catch:{ Exception -> 0x00ab }
            com.inmobi.media.ev r2 = r2.getAdConfig()     // Catch:{ Exception -> 0x00ab }
            android.view.View r3 = r1.mo40371b()     // Catch:{ Exception -> 0x00ab }
            if (r3 == 0) goto L_0x00aa
            com.inmobi.media.h r3 = r7.f11093k     // Catch:{ Exception -> 0x00ab }
            boolean r3 = r3 instanceof com.inmobi.media.C5410k     // Catch:{ Exception -> 0x00ab }
            if (r3 == 0) goto L_0x008d
            com.inmobi.media.eo r3 = r7.f11097o     // Catch:{ Exception -> 0x00ab }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x00ab }
            com.inmobi.media.bs r3 = (com.inmobi.media.C5031bs) r3     // Catch:{ Exception -> 0x00ab }
            if (r3 == 0) goto L_0x008c
            com.inmobi.media.ev$k r2 = r2.viewability     // Catch:{ Exception -> 0x00ab }
            com.inmobi.media.ev$j r5 = r2.video     // Catch:{ Exception -> 0x00ab }
            int r5 = r5.impressionMinTimeViewed     // Catch:{ Exception -> 0x00ab }
            java.util.Map<java.lang.String, java.lang.Object> r6 = r3.f11478G     // Catch:{ Exception -> 0x00ab }
            boolean r6 = r6.containsKey(r0)     // Catch:{ Exception -> 0x00ab }
            if (r6 == 0) goto L_0x0083
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f11478G     // Catch:{ Exception -> 0x00ab }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ Exception -> 0x00ab }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x00ab }
            int r5 = r0.intValue()     // Catch:{ Exception -> 0x00ab }
        L_0x0083:
            com.inmobi.media.ev$j r0 = r2.video     // Catch:{ Exception -> 0x00ab }
            r0.impressionMinTimeViewed = r5     // Catch:{ Exception -> 0x00ab }
            android.view.View[] r0 = new android.view.View[r4]     // Catch:{ Exception -> 0x00ab }
            r1.mo40370a((android.view.View[]) r0)     // Catch:{ Exception -> 0x00ab }
        L_0x008c:
            return
        L_0x008d:
            com.inmobi.media.h r0 = r7.f11093k     // Catch:{ Exception -> 0x00ab }
            boolean r0 = r0 instanceof com.inmobi.media.C5397j     // Catch:{ Exception -> 0x00ab }
            if (r0 == 0) goto L_0x00aa
            android.view.View[] r0 = new android.view.View[r4]     // Catch:{ Exception -> 0x0099 }
            r1.mo40370a((android.view.View[]) r0)     // Catch:{ Exception -> 0x0099 }
            return
        L_0x0099:
            com.inmobi.media.h r0 = r7.f11093k     // Catch:{ Exception -> 0x00ab }
            com.inmobi.media.h$a r0 = r0.getFullScreenEventsListener()     // Catch:{ Exception -> 0x00ab }
            if (r0 == 0) goto L_0x00aa
            com.inmobi.media.h r0 = r7.f11093k     // Catch:{ Exception -> 0x00ab }
            com.inmobi.media.h$a r0 = r0.getFullScreenEventsListener()     // Catch:{ Exception -> 0x00ab }
            r0.mo40700a()     // Catch:{ Exception -> 0x00ab }
        L_0x00aa:
            return
        L_0x00ab:
            r0 = move-exception
            com.inmobi.media.h r1 = r7.f11093k
            com.inmobi.media.h$a r1 = r1.getFullScreenEventsListener()
            if (r1 == 0) goto L_0x00bd
            com.inmobi.media.h r1 = r7.f11093k
            com.inmobi.media.h$a r1 = r1.getFullScreenEventsListener()
            r1.mo40700a()
        L_0x00bd:
            com.inmobi.media.fn r1 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r2 = new com.inmobi.media.gk
            r2.<init>(r0)
            r1.mo40590a((com.inmobi.media.C5308gk) r2)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onStart():void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int intExtra;
        String[] stringArrayExtra;
        C5197ep epVar;
        C5220ev evVar;
        super.onCreate(bundle);
        if (!C5314go.m12197a()) {
            finish();
            C5327gw.m12263a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f11100r = false;
        if (Build.VERSION.SDK_INT >= 29) {
            C5343hf.m12334a((Context) this);
        }
        int intExtra2 = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.f11098p = intExtra2;
        if (intExtra2 == 100) {
            String stringExtra = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
            long longExtra = getIntent().getLongExtra(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, Long.MIN_VALUE);
            boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
            String stringExtra2 = getIntent().getStringExtra("impressionId");
            String stringExtra3 = getIntent().getStringExtra("creativeId");
            C5415m.C5432a aVar = C5415m.f12420a;
            C5415m mVar = f11090i;
            if (mVar != null) {
                aVar = mVar.getListener();
                evVar = f11090i.getAdConfig();
            } else {
                evVar = (C5220ev) C5238ex.m11980a(CampaignUnit.JSON_KEY_ADS, C5314go.m12211f());
                C5415m.C5432a aVar2 = f11091j;
                if (aVar2 != null) {
                    aVar = aVar2;
                }
            }
            try {
                C5415m mVar2 = new C5415m(this, (byte) 1, (Set<C5096cx>) null, stringExtra2);
                this.f11094l = mVar2;
                mVar2.setPlacementId(longExtra);
                this.f11094l.setCreativeId(stringExtra3);
                this.f11094l.setAllowAutoRedirection(booleanExtra);
                this.f11094l.setShouldFireRenderBeacon(false);
                this.f11094l.setIsInAppBrowser(true);
                this.f11094l.mo40849a(aVar, evVar, false, false);
                RelativeLayout relativeLayout = new RelativeLayout(this);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                layoutParams.addRule(2, 65533);
                relativeLayout.setBackgroundColor(-1);
                relativeLayout.addView(this.f11094l, layoutParams);
                float f = C5343hf.m12333a().f12242c;
                LinearLayout linearLayout = new LinearLayout(this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f));
                linearLayout.setOrientation(0);
                linearLayout.setId(65533);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setBackgroundResource(17301658);
                linearLayout.setBackgroundColor(-7829368);
                layoutParams2.addRule(12);
                relativeLayout.addView(linearLayout, layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.weight = 25.0f;
                C5041ca caVar = new C5041ca(this, f, (byte) 2);
                caVar.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            boolean unused = InMobiAdActivity.this.f11092a = true;
                            InMobiAdActivity.this.finish();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout.addView(caVar, layoutParams3);
                C5041ca caVar2 = new C5041ca(this, f, (byte) 3);
                caVar2.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            InMobiAdActivity.this.f11094l.reload();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout.addView(caVar2, layoutParams3);
                C5041ca caVar3 = new C5041ca(this, f, (byte) 4);
                caVar3.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            if (InMobiAdActivity.this.f11094l.canGoBack()) {
                                InMobiAdActivity.this.f11094l.goBack();
                            } else {
                                boolean unused = InMobiAdActivity.this.f11092a = true;
                                InMobiAdActivity.this.finish();
                            }
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout.addView(caVar3, layoutParams3);
                C5041ca caVar4 = new C5041ca(this, f, (byte) 6);
                caVar4.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            if (InMobiAdActivity.this.f11094l.canGoForward()) {
                                InMobiAdActivity.this.f11094l.goForward();
                            }
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout.addView(caVar4, layoutParams3);
                setContentView(relativeLayout);
                this.f11094l.loadUrl(stringExtra);
                this.f11094l.setFullScreenActivityContext(this);
            } catch (Exception e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
                aVar.mo40816c();
                finish();
            }
        } else if (intExtra2 == 102) {
            if (getIntent().hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
                C5331h hVar = f11089h.get(getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
                this.f11093k = hVar;
                if (hVar == null) {
                    finish();
                    return;
                }
                int intExtra3 = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
                this.f11099q = intExtra3;
                if (intExtra3 == 0) {
                    if (this.f11093k.getFullScreenEventsListener() != null) {
                        this.f11093k.getFullScreenEventsListener().mo40700a();
                    }
                    finish();
                    return;
                }
                if (getIntent().getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false)) {
                    requestWindowFeature(1);
                    getWindow().setFlags(1024, 1024);
                }
                if ((200 != this.f11099q || TJAdUnitConstants.String.HTML.equals(this.f11093k.getMarkupType())) && (201 != this.f11099q || "inmobiJson".equals(this.f11093k.getMarkupType()))) {
                    try {
                        this.f11093k.setFullScreenActivityContext(this);
                        FrameLayout frameLayout = (FrameLayout) findViewById(16908290);
                        RelativeLayout relativeLayout2 = new RelativeLayout(getApplicationContext());
                        relativeLayout2.setId(WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        float f2 = C5343hf.m12333a().f12242c;
                        if (TJAdUnitConstants.String.HTML.equals(this.f11093k.getMarkupType())) {
                            relativeLayout2.setBackgroundColor(0);
                            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
                            layoutParams4.addRule(10);
                            int i = (int) (50.0f * f2);
                            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(i, i);
                            layoutParams5.addRule(11);
                            C5041ca caVar5 = new C5041ca(this, f2, (byte) 0);
                            this.f11095m = caVar5;
                            caVar5.setId(65532);
                            this.f11095m.setOnClickListener(new View.OnClickListener() {
                                public final void onClick(View view) {
                                    boolean unused = InMobiAdActivity.this.f11092a = true;
                                    try {
                                        InMobiAdActivity.this.f11093k.mo40686b();
                                    } catch (Exception unused2) {
                                        String unused3 = InMobiAdActivity.f11088g;
                                        C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                                    }
                                }
                            });
                            C5041ca caVar6 = new C5041ca(this, f2, (byte) 1);
                            this.f11096n = caVar6;
                            caVar6.setId(65531);
                            this.f11096n.setOnClickListener(new View.OnClickListener() {
                                public final void onClick(View view) {
                                    boolean unused = InMobiAdActivity.this.f11092a = true;
                                    try {
                                        InMobiAdActivity.this.f11093k.mo40686b();
                                    } catch (Exception unused2) {
                                        String unused3 = InMobiAdActivity.f11088g;
                                        C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                                    }
                                }
                            });
                            View c = this.f11093k.getViewableAd().mo40372c();
                            if (c != null) {
                                ViewGroup viewGroup = (ViewGroup) c.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(c);
                                }
                                relativeLayout2.addView(c, layoutParams4);
                                relativeLayout2.addView(this.f11095m, layoutParams5);
                                relativeLayout2.addView(this.f11096n, layoutParams5);
                                ((C5415m) this.f11093k).mo40853a(((C5415m) this.f11093k).f12470o);
                                ((C5415m) this.f11093k).mo40856b(((C5415m) this.f11093k).f12467l);
                            }
                        } else if ("inmobiJson".equals(this.f11093k.getMarkupType())) {
                            byte placementType = this.f11093k.getPlacementType();
                            relativeLayout2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                            C5016bj bjVar = (C5016bj) this.f11093k.getDataModel();
                            Point point = bjVar.f11405d.f11361c.f11384a;
                            C5098cz viewableAd = this.f11093k.getViewableAd();
                            View b = bjVar.f11404c ? viewableAd.mo40371b() : null;
                            if (b == null) {
                                b = viewableAd.mo40365a((View) null, relativeLayout2, false);
                            }
                            if ((this.f11093k instanceof C5410k) && (epVar = (C5197ep) this.f11093k.getVideoContainerView()) != null) {
                                C5184eo videoView = epVar.getVideoView();
                                this.f11097o = videoView;
                                videoView.requestFocus();
                                C5031bs bsVar = (C5031bs) this.f11097o.getTag();
                                if (bsVar.f11383y != null) {
                                    bsVar.mo40203a((C5031bs) bsVar.f11383y);
                                }
                                if (placementType == 0) {
                                    bsVar.f11380v.put("placementType", (byte) 0);
                                } else {
                                    bsVar.f11380v.put("placementType", (byte) 1);
                                }
                            }
                            if (b != null) {
                                relativeLayout2.addView(b, new RelativeLayout.LayoutParams(point.x, point.y));
                            }
                            this.f11093k.mo40688d();
                        } else {
                            if (this.f11093k.getFullScreenEventsListener() != null) {
                                this.f11093k.getFullScreenEventsListener().mo40700a();
                            }
                            finish();
                            return;
                        }
                        frameLayout.addView(relativeLayout2, new RelativeLayout.LayoutParams(-1, -1));
                    } catch (Exception e2) {
                        this.f11093k.setFullScreenActivityContext((Activity) null);
                        if (this.f11093k.getFullScreenEventsListener() != null) {
                            this.f11093k.getFullScreenEventsListener().mo40700a();
                        }
                        finish();
                        C5275fn.m12068a().mo40590a(new C5308gk(e2));
                    }
                } else {
                    if (this.f11093k.getFullScreenEventsListener() != null) {
                        this.f11093k.getFullScreenEventsListener().mo40700a();
                    }
                    finish();
                }
            }
        } else if (intExtra2 == 103) {
            int intExtra4 = getIntent().getIntExtra("id", -1);
            if (intExtra4 != -1) {
                startActivityForResult(f11084c.get(Integer.valueOf(intExtra4)), intExtra4);
            }
        } else if (intExtra2 == 104 && (intExtra = getIntent().getIntExtra("id", -1)) != -1 && (stringArrayExtra = getIntent().getStringArrayExtra("permissions")) != null && stringArrayExtra.length > 0 && Build.VERSION.SDK_INT >= 23) {
            C5320gt.m12249b();
            requestPermissions(stringArrayExtra, intExtra);
        }
    }

    public void onStop() {
        super.onStop();
        if (!this.f11092a) {
            this.f11101s = true;
            C5184eo eoVar = this.f11097o;
            if (eoVar != null) {
                eoVar.pause();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C5331h hVar;
        C5031bs bsVar;
        C5331h hVar2;
        if (this.f11092a) {
            int i = this.f11098p;
            if (100 == i) {
                C5415m mVar = this.f11094l;
                if (!(mVar == null || mVar.getFullScreenEventsListener() == null)) {
                    try {
                        this.f11094l.getFullScreenEventsListener().mo40702b(this.f11094l);
                        this.f11094l.destroy();
                        this.f11094l = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (!(102 != i || (hVar2 = this.f11093k) == null || hVar2.getFullScreenEventsListener() == null)) {
                int i2 = this.f11099q;
                if (200 == i2) {
                    try {
                        this.f11093k.getFullScreenEventsListener().mo40702b((Object) null);
                    } catch (Exception unused2) {
                        C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                    }
                } else if (201 == i2) {
                    C5331h hVar3 = this.f11093k;
                    if (hVar3 instanceof C5410k) {
                        C5197ep epVar = (C5197ep) ((C5410k) hVar3).getVideoContainerView();
                        if (epVar != null) {
                            try {
                                this.f11093k.getFullScreenEventsListener().mo40702b((C5031bs) epVar.getVideoView().getTag());
                            } catch (Exception e) {
                                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                                C5275fn.m12068a().mo40590a(new C5308gk(e));
                            }
                        }
                    } else if (hVar3 instanceof C5397j) {
                        try {
                            hVar3.getFullScreenEventsListener().mo40702b((Object) null);
                        } catch (Exception e2) {
                            C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                            C5275fn.m12068a().mo40590a(new C5308gk(e2));
                        }
                    }
                }
            }
            C5331h hVar4 = this.f11093k;
            if (hVar4 != null) {
                hVar4.destroy();
                this.f11093k = null;
            }
        } else {
            int i3 = this.f11098p;
            if (!(100 == i3 || 102 != i3 || (hVar = this.f11093k) == null)) {
                int i4 = this.f11099q;
                if (200 == i4) {
                    C5415m mVar2 = (C5415m) hVar;
                    mVar2.setFullScreenActivityContext((Activity) null);
                    try {
                        mVar2.mo40686b();
                    } catch (Exception unused3) {
                        C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                    }
                } else if (201 == i4) {
                    if (hVar instanceof C5410k) {
                        C5410k kVar = (C5410k) hVar;
                        C5184eo eoVar = this.f11097o;
                        if (!(eoVar == null || (bsVar = (C5031bs) eoVar.getTag()) == null)) {
                            if (1 == kVar.getPlacementType()) {
                                this.f11097o.mo40485a();
                            }
                            if (this.f11093k.getFullScreenEventsListener() != null) {
                                try {
                                    this.f11093k.getFullScreenEventsListener().mo40702b(bsVar);
                                } catch (Exception e3) {
                                    C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                                    C5275fn.m12068a().mo40590a(new C5308gk(e3));
                                }
                            }
                        }
                    } else if ((hVar instanceof C5397j) && hVar.getFullScreenEventsListener() != null) {
                        try {
                            this.f11093k.getFullScreenEventsListener().mo40702b((Object) null);
                        } catch (Exception e4) {
                            C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                            C5275fn.m12068a().mo40590a(new C5308gk(e4));
                        }
                    }
                }
                m11058a((Object) this.f11093k);
                this.f11093k.destroy();
                this.f11093k = null;
            }
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5415m mVar = this.f11094l;
        if (mVar != null && "Resized".equals(mVar.f12459d) && mVar.getResizeProperties() != null) {
            mVar.f12462g.mo40327a();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (f11083b.remove(Integer.valueOf(i)) != null) {
            f11084c.remove(Integer.valueOf(i));
            this.f11092a = true;
            finish();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        if (!z) {
            C5415m mVar = this.f11094l;
            if (mVar != null) {
                mVar.setOrientationProperties(mVar.getOrientationProperties());
            }
            C5331h hVar = this.f11093k;
            if (hVar != null) {
                hVar.mo40688d();
            }
        }
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        onMultiWindowModeChanged(z);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C5320gt.m12250c();
        f11086e.remove(Integer.valueOf(i));
        finish();
    }

    public void onBackPressed() {
        int i = this.f11098p;
        if (i == 102) {
            C5331h hVar = this.f11093k;
            if (hVar != null && !hVar.mo40687c()) {
                if (200 == this.f11099q) {
                    C5415m mVar = (C5415m) this.f11093k;
                    if (mVar != null) {
                        if (mVar.f12472q != null) {
                            mVar.mo40850a(mVar.f12472q, "broadcastEvent('backButtonPressed')");
                        }
                        if (!mVar.f12471p) {
                            this.f11092a = true;
                            try {
                                mVar.mo40686b();
                            } catch (Exception unused) {
                                C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                            }
                        }
                    }
                } else {
                    C5331h hVar2 = this.f11093k;
                    if (hVar2 instanceof C5410k) {
                        C5410k kVar = (C5410k) hVar2;
                        if (kVar != null && !kVar.mo40784k().f11403b) {
                            this.f11092a = true;
                            C5184eo eoVar = this.f11097o;
                            if (eoVar != null) {
                                C5031bs bsVar = (C5031bs) eoVar.getTag();
                                if (bsVar != null) {
                                    if (1 == kVar.getPlacementType()) {
                                        this.f11097o.mo40485a();
                                    }
                                    try {
                                        if (((Boolean) bsVar.f11380v.get("isFullScreen")).booleanValue()) {
                                            bsVar.f11380v.put("seekPosition", Integer.valueOf(this.f11097o.getCurrentPosition()));
                                            if (!kVar.f12382k && ((Boolean) bsVar.f11380v.get("didRequestFullScreen")).booleanValue()) {
                                                bsVar.f11380v.put("didRequestFullScreen", Boolean.FALSE);
                                                if (bsVar.f11383y != null) {
                                                    bsVar.f11383y.f11380v.put("didRequestFullScreen", Boolean.FALSE);
                                                }
                                                kVar.mo40686b();
                                                bsVar.f11380v.put("isFullScreen", Boolean.FALSE);
                                            }
                                        }
                                    } catch (Exception e) {
                                        C5327gw.m12263a((byte) 2, "InMobi", "SDK encountered unexpected error in closing video");
                                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                                    }
                                }
                            } else {
                                finish();
                            }
                        }
                    } else if (hVar2 instanceof C5397j) {
                        C5397j jVar = (C5397j) hVar2;
                        if (jVar == null) {
                            finish();
                        } else if (!jVar.mo40784k().f11403b) {
                            jVar.mo40686b();
                        }
                    }
                }
            }
        } else if (i == 100) {
            this.f11092a = true;
            finish();
        }
    }
}
