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
import com.p243my.target.mediation.MediationNativeAdAdapter;
import com.p243my.target.mediation.MediationNativeAdConfig;
import com.p243my.target.mediation.MyTargetNativeAdAdapter;
import com.p243my.target.nativeads.NativeAd;
import com.p243my.target.nativeads.banners.NativePromoBanner;
import com.p243my.target.nativeads.views.IconAdView;
import com.p243my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.b1 */
public class C7324b1 extends C7765z0<MediationNativeAdAdapter> implements C7616q0 {

    /* renamed from: k */
    public final NativeAd f18348k;

    /* renamed from: l */
    public NativePromoBanner f18349l;

    /* renamed from: m */
    public WeakReference<MediaAdView> f18350m;

    /* renamed from: n */
    public WeakReference<View> f18351n;

    /* renamed from: o */
    public WeakReference<IconAdView> f18352o;

    /* renamed from: com.my.target.b1$a */
    public class C7325a implements MediationNativeAdAdapter.MediationNativeAdListener {

        /* renamed from: a */
        public final C7560n2 f18353a;

        public C7325a(C7560n2 n2Var) {
            this.f18353a = n2Var;
        }

        /* renamed from: a */
        public final boolean mo49707a() {
            return !"myTarget".equals(this.f18353a.mo50966b()) && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(this.f18353a.mo50967c().get("lg"));
        }

        public void onClick(MediationNativeAdAdapter mediationNativeAdAdapter) {
            C7324b1 b1Var = C7324b1.this;
            if (b1Var.f19731d == mediationNativeAdAdapter) {
                Context l = b1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18353a.mo50972h().mo49800a("click"), l);
                }
                NativeAd.NativeAdListener listener = C7324b1.this.f18348k.getListener();
                if (listener != null) {
                    listener.onClick(C7324b1.this.f18348k);
                }
            }
        }

        public void onLoad(NativePromoBanner nativePromoBanner, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (C7324b1.this.f19731d == mediationNativeAdAdapter) {
                String b = this.f18353a.mo50966b();
                C7374e0.m18989a("MediationNativeAdEngine: data from " + b + " ad network loaded successfully");
                Context l = C7324b1.this.mo51914l();
                if (mo49707a() && l != null) {
                    C7614p8.m20115b(b, nativePromoBanner, l);
                }
                C7324b1.this.mo51910a(this.f18353a, true);
                C7324b1 b1Var = C7324b1.this;
                b1Var.f18349l = nativePromoBanner;
                NativeAd.NativeAdListener listener = b1Var.f18348k.getListener();
                if (listener != null) {
                    listener.onLoad(nativePromoBanner, C7324b1.this.f18348k);
                }
            }
        }

        public void onNoAd(String str, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (C7324b1.this.f19731d == mediationNativeAdAdapter) {
                C7374e0.m18989a("MediationNativeAdEngine: no data from " + this.f18353a.mo50966b() + " ad network");
                C7324b1.this.mo51910a(this.f18353a, false);
            }
        }

        public void onShow(MediationNativeAdAdapter mediationNativeAdAdapter) {
            C7324b1 b1Var = C7324b1.this;
            if (b1Var.f19731d == mediationNativeAdAdapter) {
                Context l = b1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18353a.mo50972h().mo49800a("playbackStarted"), l);
                }
                NativeAd.NativeAdListener listener = C7324b1.this.f18348k.getListener();
                if (listener != null) {
                    listener.onShow(C7324b1.this.f18348k);
                }
            }
        }

        public void onVideoComplete(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            C7324b1 b1Var = C7324b1.this;
            if (b1Var.f19731d == mediationNativeAdAdapter && (listener = b1Var.f18348k.getListener()) != null) {
                listener.onVideoComplete(C7324b1.this.f18348k);
            }
        }

        public void onVideoPause(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            C7324b1 b1Var = C7324b1.this;
            if (b1Var.f19731d == mediationNativeAdAdapter && (listener = b1Var.f18348k.getListener()) != null) {
                listener.onVideoPause(C7324b1.this.f18348k);
            }
        }

        public void onVideoPlay(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            C7324b1 b1Var = C7324b1.this;
            if (b1Var.f19731d == mediationNativeAdAdapter && (listener = b1Var.f18348k.getListener()) != null) {
                listener.onVideoPlay(C7324b1.this.f18348k);
            }
        }
    }

    /* renamed from: com.my.target.b1$b */
    public static class C7326b extends C7765z0.C7766a implements MediationNativeAdConfig {

        /* renamed from: g */
        public final int f18355g;

        /* renamed from: h */
        public final int f18356h;

        public C7326b(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            super(str, str2, map, i, i2, myTargetPrivacy);
            this.f18355g = i3;
            this.f18356h = i4;
        }

        /* renamed from: a */
        public static C7326b m18774a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4) {
            return new C7326b(str, str2, map, i, i2, myTargetPrivacy, i3, i4);
        }

        public int getAdChoicesPlacement() {
            return this.f18356h;
        }

        public int getCachePolicy() {
            return this.f18355g;
        }

        @Deprecated
        public boolean isAutoLoadImages() {
            int i = this.f18355g;
            return i == 0 || i == 1;
        }

        @Deprecated
        public boolean isAutoLoadVideo() {
            int i = this.f18355g;
            return i == 0 || i == 2;
        }
    }

    public C7324b1(NativeAd nativeAd, C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        super(m2Var, aVar, aVar2);
        this.f18348k = nativeAd;
    }

    /* renamed from: a */
    public static final C7324b1 m18760a(NativeAd nativeAd, C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7324b1(nativeAd, m2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public void mo49698a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        ArrayList arrayList;
        String str;
        if (this.f19731d == null) {
            str = "MediationNativeAdEngine error: can't register view, adapter is not set";
        } else if (this.f18349l == null) {
            str = "MediationNativeAdEngine error: can't register view, banner is null or not loaded yet";
        } else {
            unregisterView();
            View view2 = null;
            if (list != null) {
                arrayList = new ArrayList();
                for (View next : list) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = null;
            }
            if (!(this.f19731d instanceof MyTargetNativeAdAdapter) && (view instanceof ViewGroup)) {
                C7639r8 a = C7639r8.m20256a((ViewGroup) view, mediaAdView);
                MediaAdView f = a.mo51469f();
                if (f != null) {
                    this.f18350m = new WeakReference<>(f);
                    try {
                        view2 = ((MediationNativeAdAdapter) this.f19731d).getMediaView(view.getContext());
                    } catch (Throwable th) {
                        C7374e0.m18990b("MediationNativeAdEngine error: " + th.toString());
                    }
                    View view3 = view2;
                    if (view3 != null) {
                        this.f18351n = new WeakReference<>(view3);
                    }
                    mo49702a(f, view3, this.f18349l.getImage(), this.f18349l.hasVideo(), arrayList);
                }
                IconAdView e = a.mo51468e();
                ImageData icon = this.f18349l.getIcon();
                if (!(e == null || icon == null)) {
                    this.f18352o = new WeakReference<>(e);
                    mo49703b(icon, (C7506k6) e.getImageView());
                }
            }
            try {
                ((MediationNativeAdAdapter) this.f19731d).registerView(view, arrayList, i);
                return;
            } catch (Throwable th2) {
                C7374e0.m18990b("MediationNativeAdEngine error: " + th2.toString());
                return;
            }
        }
        C7374e0.m18990b(str);
    }

    /* renamed from: a */
    public final void mo49699a(ImageData imageData, C7506k6 k6Var) {
        if (imageData != null) {
            C7509k8.m19619a(imageData, (ImageView) k6Var);
        }
        k6Var.setImageData((ImageData) null);
    }

    /* renamed from: a */
    public void mo49536a(MediationNativeAdAdapter mediationNativeAdAdapter, C7560n2 n2Var, Context context) {
        C7326b a = C7326b.m18774a(n2Var.mo50969e(), n2Var.mo50968d(), n2Var.mo50967c(), this.f19728a.getCustomParams().getAge(), this.f19728a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), this.f19728a.getCachePolicy(), this.f18348k.getAdChoicesPlacement());
        if (mediationNativeAdAdapter instanceof MyTargetNativeAdAdapter) {
            C7618q2 g = n2Var.mo50971g();
            if (g instanceof C7699v2) {
                ((MyTargetNativeAdAdapter) mediationNativeAdAdapter).setSection((C7699v2) g);
            }
        }
        try {
            mediationNativeAdAdapter.load(a, new C7325a(n2Var), context);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationNativeAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo49701a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        C7374e0.m18989a("NativeAdMediaListener is not currently supported for mediation");
    }

    /* renamed from: a */
    public final void mo49702a(MediaAdView mediaAdView, View view, ImageData imageData, boolean z, List<View> list) {
        int indexOf;
        int i;
        int i2;
        if (imageData != null || z) {
            if (imageData == null || imageData.getWidth() <= 0 || imageData.getHeight() <= 0) {
                i = 16;
                i2 = 10;
            } else {
                i = imageData.getWidth();
                i2 = imageData.getHeight();
            }
            mediaAdView.setPlaceHolderDimension(i, i2);
        } else {
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        if (view != null) {
            C7374e0.m18989a("MediationNativeAdEngine: got MediaView from adapter");
            mediaAdView.addView(view);
            if (list != null && (indexOf = list.indexOf(mediaAdView)) >= 0) {
                list.remove(indexOf);
                list.add(view);
                return;
            }
            return;
        }
        mo49703b(imageData, (C7506k6) mediaAdView.getImageView());
    }

    /* renamed from: a */
    public boolean mo49539a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeAdAdapter;
    }

    /* renamed from: b */
    public final void mo49703b(ImageData imageData, C7506k6 k6Var) {
        k6Var.setImageData(imageData);
        if (imageData != null && imageData.getBitmap() == null) {
            C7509k8.m19623b(imageData, k6Var);
        }
    }

    /* renamed from: g */
    public NativePromoBanner mo49704g() {
        return this.f18349l;
    }

    /* renamed from: j */
    public void mo49542j() {
        NativeAd.NativeAdListener listener = this.f18348k.getListener();
        if (listener != null) {
            listener.onNoAd("No data for available ad networks", this.f18348k);
        }
    }

    /* renamed from: n */
    public MediationNativeAdAdapter mo49543k() {
        return new MyTargetNativeAdAdapter();
    }

    public void unregisterView() {
        if (this.f19731d == null) {
            C7374e0.m18990b("MediationNativeAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference<View> weakReference = this.f18351n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.f18351n.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference<MediaAdView> weakReference2 = this.f18350m;
        MediaAdView mediaAdView = weakReference2 != null ? (MediaAdView) weakReference2.get() : null;
        if (mediaAdView != null) {
            this.f18350m.clear();
            NativePromoBanner nativePromoBanner = this.f18349l;
            mo49699a(nativePromoBanner != null ? nativePromoBanner.getImage() : null, (C7506k6) mediaAdView.getImageView());
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        WeakReference<IconAdView> weakReference3 = this.f18352o;
        IconAdView iconAdView = weakReference3 != null ? (IconAdView) weakReference3.get() : null;
        if (iconAdView != null) {
            this.f18352o.clear();
            NativePromoBanner nativePromoBanner2 = this.f18349l;
            mo49699a(nativePromoBanner2 != null ? nativePromoBanner2.getIcon() : null, (C7506k6) iconAdView.getImageView());
        }
        this.f18351n = null;
        this.f18350m = null;
        try {
            ((MediationNativeAdAdapter) this.f19731d).unregisterView();
        } catch (Throwable th) {
            C7374e0.m18990b("MediationNativeAdEngine error: " + th.toString());
        }
    }
}
