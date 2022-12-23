package com.p243my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.facebook.appevents.AppEventsConstants;
import com.p243my.target.C7524l3;
import com.p243my.target.C7765z0;
import com.p243my.target.common.MyTargetPrivacy;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.mediation.MediationAdapter;
import com.p243my.target.mediation.MediationNativeBannerAdAdapter;
import com.p243my.target.mediation.MediationNativeBannerAdConfig;
import com.p243my.target.mediation.MyTargetNativeBannerAdAdapter;
import com.p243my.target.nativeads.NativeBannerAd;
import com.p243my.target.nativeads.banners.NativeBanner;
import com.p243my.target.nativeads.views.IconAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.c1 */
public class C7339c1 extends C7765z0<MediationNativeBannerAdAdapter> implements C7630r0 {

    /* renamed from: k */
    public final NativeBannerAd f18391k;

    /* renamed from: l */
    public NativeBanner f18392l;

    /* renamed from: m */
    public WeakReference<IconAdView> f18393m;

    /* renamed from: n */
    public WeakReference<View> f18394n;

    /* renamed from: com.my.target.c1$a */
    public class C7340a implements MediationNativeBannerAdAdapter.MediationNativeBannerAdListener {

        /* renamed from: a */
        public final C7560n2 f18395a;

        public C7340a(C7560n2 n2Var) {
            this.f18395a = n2Var;
        }

        /* renamed from: a */
        public final boolean mo49790a() {
            return !"myTarget".equals(this.f18395a.mo50966b()) && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(this.f18395a.mo50967c().get("lg"));
        }

        public void onClick(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            C7339c1 c1Var = C7339c1.this;
            if (c1Var.f19731d == mediationNativeBannerAdAdapter) {
                Context l = c1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18395a.mo50972h().mo49800a("click"), l);
                }
                NativeBannerAd.NativeBannerAdListener listener = C7339c1.this.f18391k.getListener();
                if (listener != null) {
                    listener.onClick(C7339c1.this.f18391k);
                }
            }
        }

        public void onLoad(NativeBanner nativeBanner, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (C7339c1.this.f19731d == mediationNativeBannerAdAdapter) {
                String b = this.f18395a.mo50966b();
                C7374e0.m18989a("MediationNativeBannerAdEngine: data from " + b + " ad network loaded successfully");
                Context l = C7339c1.this.mo51914l();
                if (mo49790a() && l != null) {
                    C7614p8.m20114b(b, nativeBanner, l);
                }
                C7339c1.this.mo51910a(this.f18395a, true);
                C7339c1 c1Var = C7339c1.this;
                c1Var.f18392l = nativeBanner;
                NativeBannerAd.NativeBannerAdListener listener = c1Var.f18391k.getListener();
                if (listener != null) {
                    listener.onLoad(nativeBanner, C7339c1.this.f18391k);
                }
            }
        }

        public void onNoAd(String str, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (C7339c1.this.f19731d == mediationNativeBannerAdAdapter) {
                C7374e0.m18989a("MediationNativeBannerAdEngine: no data from " + this.f18395a.mo50966b() + " ad network");
                C7339c1.this.mo51910a(this.f18395a, false);
            }
        }

        public void onShow(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            C7339c1 c1Var = C7339c1.this;
            if (c1Var.f19731d == mediationNativeBannerAdAdapter) {
                Context l = c1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18395a.mo50972h().mo49800a("playbackStarted"), l);
                }
                NativeBannerAd.NativeBannerAdListener listener = C7339c1.this.f18391k.getListener();
                if (listener != null) {
                    listener.onShow(C7339c1.this.f18391k);
                }
            }
        }
    }

    /* renamed from: com.my.target.c1$b */
    public static class C7341b extends C7765z0.C7766a implements MediationNativeBannerAdConfig {

        /* renamed from: g */
        public final int f18397g;

        /* renamed from: h */
        public final int f18398h;

        public C7341b(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            super(str, str2, map, i, i2, myTargetPrivacy);
            this.f18397g = i3;
            this.f18398h = i4;
        }

        /* renamed from: a */
        public static C7341b m18842a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            return new C7341b(str, str2, map, i, i2, myTargetPrivacy, i3, i4);
        }

        public int getAdChoicesPlacement() {
            return this.f18398h;
        }

        public int getCachePolicy() {
            return this.f18397g;
        }
    }

    public C7339c1(NativeBannerAd nativeBannerAd, C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        super(m2Var, aVar, aVar2);
        this.f18391k = nativeBannerAd;
    }

    /* renamed from: a */
    public static C7339c1 m18829a(NativeBannerAd nativeBannerAd, C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7339c1(nativeBannerAd, m2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public final void mo49781a(ImageData imageData, C7506k6 k6Var) {
        if (imageData != null) {
            C7509k8.m19619a(imageData, (ImageView) k6Var);
        }
        k6Var.setImageData((ImageData) null);
    }

    /* renamed from: a */
    public void mo49536a(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter, C7560n2 n2Var, Context context) {
        C7341b a = C7341b.m18842a(n2Var.mo50969e(), n2Var.mo50968d(), n2Var.mo50967c(), this.f19728a.getCustomParams().getAge(), this.f19728a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), this.f19728a.getCachePolicy(), this.f18391k.getAdChoicesPlacement());
        if (mediationNativeBannerAdAdapter instanceof MyTargetNativeBannerAdAdapter) {
            C7618q2 g = n2Var.mo50971g();
            if (g instanceof C7699v2) {
                ((MyTargetNativeBannerAdAdapter) mediationNativeBannerAdAdapter).setSection((C7699v2) g);
            }
        }
        try {
            mediationNativeBannerAdAdapter.load(a, new C7340a(n2Var), context);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationNativeBannerAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo49783a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        C7374e0.m18989a("NativeBannerAdMediaListener is not currently supported for mediation");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49784a(com.p243my.target.nativeads.views.IconAdView r3, android.view.View r4, com.p243my.target.common.models.ImageData r5, java.util.List<android.view.View> r6) {
        /*
            r2 = this;
            if (r5 != 0) goto L_0x0007
            r0 = 0
        L_0x0003:
            r3.setPlaceHolderDimension(r0, r0)
            goto L_0x0021
        L_0x0007:
            int r0 = r5.getWidth()
            if (r0 <= 0) goto L_0x001f
            int r0 = r5.getHeight()
            if (r0 <= 0) goto L_0x001f
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r3.setPlaceHolderDimension(r0, r1)
            goto L_0x0021
        L_0x001f:
            r0 = 1
            goto L_0x0003
        L_0x0021:
            if (r4 == 0) goto L_0x0038
            java.lang.String r5 = "MediationNativeBannerAdEngine: got IconView from adapter"
            com.p243my.target.C7374e0.m18989a(r5)
            r3.addView(r4)
            int r3 = r6.indexOf(r3)
            if (r3 < 0) goto L_0x0041
            r6.remove(r3)
            r6.add(r4)
            goto L_0x0041
        L_0x0038:
            android.widget.ImageView r3 = r3.getImageView()
            com.my.target.k6 r3 = (com.p243my.target.C7506k6) r3
            r2.mo49785b(r5, r3)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7339c1.mo49784a(com.my.target.nativeads.views.IconAdView, android.view.View, com.my.target.common.models.ImageData, java.util.List):void");
    }

    /* renamed from: a */
    public boolean mo49539a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeBannerAdAdapter;
    }

    /* renamed from: b */
    public final void mo49785b(ImageData imageData, C7506k6 k6Var) {
        k6Var.setImageData(imageData);
        if (imageData != null && imageData.getBitmap() == null) {
            C7509k8.m19623b(imageData, k6Var);
        }
    }

    /* renamed from: h */
    public NativeBanner mo49786h() {
        return this.f18392l;
    }

    /* renamed from: j */
    public void mo49542j() {
        NativeBannerAd.NativeBannerAdListener listener = this.f18391k.getListener();
        if (listener != null) {
            listener.onNoAd("No data for available ad networks", this.f18391k);
        }
    }

    /* renamed from: n */
    public MediationNativeBannerAdAdapter mo49543k() {
        return new MyTargetNativeBannerAdAdapter();
    }

    public void registerView(View view, List<View> list, int i) {
        String str;
        if (this.f19731d == null) {
            str = "MediationNativeBannerAdEngine error: can't register view, adapter is not set";
        } else if (this.f18392l == null) {
            str = "MediationNativeBannerAdEngine error: can't register view, banner is null or not loaded yet";
        } else {
            unregisterView();
            List arrayList = list != null ? new ArrayList(list) : Collections.EMPTY_LIST;
            if (!(this.f19731d instanceof MyTargetNativeBannerAdAdapter) && (view instanceof ViewGroup)) {
                IconAdView e = C7639r8.m20259c((ViewGroup) view).mo51468e();
                if (e != null) {
                    this.f18393m = new WeakReference<>(e);
                    View view2 = null;
                    try {
                        view2 = ((MediationNativeBannerAdAdapter) this.f19731d).getIconView(view.getContext());
                    } catch (Throwable th) {
                        C7374e0.m18990b("MediationNativeBannerAdEngine error: " + th.toString());
                    }
                    if (view2 != null) {
                        this.f18394n = new WeakReference<>(view2);
                    }
                    mo49784a(e, view2, this.f18392l.getIcon(), (List<View>) arrayList);
                } else {
                    str = "IconView component not found in ad view  " + view + ". It's required";
                }
            }
            try {
                ((MediationNativeBannerAdAdapter) this.f19731d).registerView(view, arrayList, i);
                return;
            } catch (Throwable th2) {
                C7374e0.m18990b("MediationNativeBannerAdEngine error: " + th2.toString());
                return;
            }
        }
        C7374e0.m18990b(str);
    }

    public void unregisterView() {
        if (this.f19731d == null) {
            C7374e0.m18990b("MediationNativeBannerAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference<View> weakReference = this.f18394n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.f18394n.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference<IconAdView> weakReference2 = this.f18393m;
        IconAdView iconAdView = weakReference2 != null ? (IconAdView) weakReference2.get() : null;
        if (iconAdView != null) {
            this.f18393m.clear();
            NativeBanner nativeBanner = this.f18392l;
            mo49781a(nativeBanner != null ? nativeBanner.getIcon() : null, (C7506k6) iconAdView.getImageView());
        }
        this.f18394n = null;
        this.f18393m = null;
        try {
            ((MediationNativeBannerAdAdapter) this.f19731d).unregisterView();
        } catch (Throwable th) {
            C7374e0.m18990b("MediationNativeBannerAdEngine error: " + th.toString());
        }
    }
}
