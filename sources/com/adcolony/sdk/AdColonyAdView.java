package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C0580a0;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;

public class AdColonyAdView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0589c f90a = C0578a.m143c().mo9597d().mo9504c().get(this.f93d);

    /* renamed from: b */
    private AdColonyAdViewListener f91b;

    /* renamed from: c */
    private AdColonyAdSize f92c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f93d;

    /* renamed from: e */
    private String f94e;

    /* renamed from: f */
    private String f95f;

    /* renamed from: g */
    private String f96g;

    /* renamed from: h */
    private ImageView f97h;

    /* renamed from: i */
    private C0742k0 f98i;

    /* renamed from: j */
    private C0645d0 f99j;

    /* renamed from: k */
    private boolean f100k;

    /* renamed from: l */
    private boolean f101l;

    /* renamed from: m */
    private boolean f102m;

    /* renamed from: n */
    private boolean f103n;

    /* renamed from: o */
    private boolean f104o;

    /* renamed from: p */
    private int f105p;

    /* renamed from: q */
    private int f106q;

    /* renamed from: r */
    private int f107r;

    /* renamed from: s */
    private int f108s;

    /* renamed from: t */
    private int f109t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C0572c f110u;

    /* renamed from: com.adcolony.sdk.AdColonyAdView$a */
    class C0570a implements Runnable {
        C0570a() {
        }

        public void run() {
            Context b = C0578a.m141b();
            if (b instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) b).mo9247b();
            }
            C0612d d = C0578a.m143c().mo9597d();
            d.mo9493a(AdColonyAdView.this.f93d);
            d.mo9496a(AdColonyAdView.this.f90a);
            C0897z0 b2 = C0894y.m1151b();
            C0894y.m1148a(b2, "id", AdColonyAdView.this.f93d);
            new C0645d0("AdSession.on_ad_view_destroyed", 1, b2).mo9536d();
            if (AdColonyAdView.this.f110u != null) {
                AdColonyAdView.this.f110u.mo9246a();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$b */
    class C0571b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f112a;

        C0571b(Context context) {
            this.f112a = context;
        }

        public void onClick(View view) {
            Context context = this.f112a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).mo9247b();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyAdView$c */
    interface C0572c {
        /* renamed from: a */
        void mo9246a();
    }

    AdColonyAdView(Context context, C0645d0 d0Var, AdColonyAdViewListener adColonyAdViewListener) {
        super(context);
        this.f91b = adColonyAdViewListener;
        this.f94e = adColonyAdViewListener.mo9261c();
        C0897z0 b = d0Var.mo9532b();
        this.f93d = C0894y.m1169h(b, "id");
        this.f95f = C0894y.m1169h(b, "close_button_filepath");
        this.f100k = C0894y.m1155b(b, "trusted_demand_source");
        this.f104o = C0894y.m1155b(b, "close_button_snap_to_webview");
        this.f108s = C0894y.m1163d(b, "close_button_width");
        this.f109t = C0894y.m1163d(b, "close_button_height");
        this.f92c = adColonyAdViewListener.mo9256a();
        setLayoutParams(new FrameLayout.LayoutParams(this.f90a.mo9453d(), this.f90a.mo9447b()));
        setBackgroundColor(0);
        addView(this.f90a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9222d() {
        return this.f101l;
    }

    public boolean destroy() {
        if (this.f101l) {
            new C0580a0.C0581a().mo9419a("Ignoring duplicate call to destroy().").mo9421a(C0580a0.f189g);
            return false;
        }
        this.f101l = true;
        C0742k0 k0Var = this.f98i;
        if (!(k0Var == null || k0Var.mo9694c() == null)) {
            this.f98i.mo9693b();
        }
        C0849u0.m931b((Runnable) new C0570a());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9224e() {
        if (this.f98i != null) {
            getWebView().mo9964i();
        }
    }

    public AdColonyAdSize getAdSize() {
        return this.f92c;
    }

    /* access modifiers changed from: package-private */
    public String getClickOverride() {
        return this.f96g;
    }

    /* access modifiers changed from: package-private */
    public C0589c getContainer() {
        return this.f90a;
    }

    public AdColonyAdViewListener getListener() {
        return this.f91b;
    }

    /* access modifiers changed from: package-private */
    public C0742k0 getOmidManager() {
        return this.f98i;
    }

    /* access modifiers changed from: package-private */
    public int getOrientation() {
        return this.f105p;
    }

    /* access modifiers changed from: package-private */
    public boolean getTrustedDemandSource() {
        return this.f100k;
    }

    /* access modifiers changed from: package-private */
    public C0872w0 getWebView() {
        C0589c cVar = this.f90a;
        if (cVar == null) {
            return null;
        }
        return cVar.mo9472n().get(2);
    }

    public String getZoneId() {
        return this.f94e;
    }

    /* access modifiers changed from: package-private */
    public void setClickOverride(String str) {
        this.f96g = str;
    }

    /* access modifiers changed from: package-private */
    public void setExpandMessage(C0645d0 d0Var) {
        this.f99j = d0Var;
    }

    /* access modifiers changed from: package-private */
    public void setExpandedHeight(int i) {
        this.f107r = (int) (((float) i) * C0578a.m143c().mo9611o().mo9750o());
    }

    /* access modifiers changed from: package-private */
    public void setExpandedWidth(int i) {
        this.f106q = (int) (((float) i) * C0578a.m143c().mo9611o().mo9750o());
    }

    public void setListener(AdColonyAdViewListener adColonyAdViewListener) {
        this.f91b = adColonyAdViewListener;
    }

    /* access modifiers changed from: package-private */
    public void setNoCloseButton(boolean z) {
        this.f102m = this.f100k && z;
    }

    /* access modifiers changed from: package-private */
    public void setOmidManager(C0742k0 k0Var) {
        this.f98i = k0Var;
    }

    /* access modifiers changed from: package-private */
    public void setOnDestroyListenerOrCall(C0572c cVar) {
        if (this.f101l) {
            cVar.mo9246a();
        } else {
            this.f110u = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void setOrientation(int i) {
        this.f105p = i;
    }

    /* access modifiers changed from: package-private */
    public void setUserInteraction(boolean z) {
        this.f103n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9219a() {
        if (this.f100k || this.f103n) {
            float o = C0578a.m143c().mo9611o().mo9750o();
            this.f90a.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) this.f92c.getWidth()) * o), (int) (((float) this.f92c.getHeight()) * o)));
            C0872w0 webView = getWebView();
            if (webView != null) {
                C0645d0 d0Var = new C0645d0("WebView.set_bounds", 0);
                C0897z0 b = C0894y.m1151b();
                C0894y.m1156b(b, "x", webView.mo9975t());
                C0894y.m1156b(b, "y", webView.mo9976u());
                C0894y.m1156b(b, "width", webView.mo9974s());
                C0894y.m1156b(b, "height", webView.mo9973r());
                d0Var.mo9533b(b);
                webView.mo9953a(d0Var);
                C0897z0 b2 = C0894y.m1151b();
                C0894y.m1148a(b2, "ad_session_id", this.f93d);
                new C0645d0("MRAID.on_close", this.f90a.mo9469k(), b2).mo9536d();
            }
            ImageView imageView = this.f97h;
            if (imageView != null) {
                this.f90a.removeView(imageView);
                this.f90a.mo9443a((View) this.f97h);
            }
            addView(this.f90a);
            AdColonyAdViewListener adColonyAdViewListener = this.f91b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onClosed(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9220b() {
        int i;
        if (this.f100k || this.f103n) {
            C0756n o = C0578a.m143c().mo9611o();
            Rect s = o.mo9754s();
            int i2 = this.f106q;
            if (i2 <= 0) {
                i2 = s.width();
            }
            int i3 = this.f107r;
            if (i3 <= 0) {
                i3 = s.height();
            }
            int width = (s.width() - i2) / 2;
            int height = (s.height() - i3) / 2;
            this.f90a.setLayoutParams(new FrameLayout.LayoutParams(s.width(), s.height()));
            C0872w0 webView = getWebView();
            if (webView != null) {
                C0645d0 d0Var = new C0645d0("WebView.set_bounds", 0);
                C0897z0 b = C0894y.m1151b();
                C0894y.m1156b(b, "x", width);
                C0894y.m1156b(b, "y", height);
                C0894y.m1156b(b, "width", i2);
                C0894y.m1156b(b, "height", i3);
                d0Var.mo9533b(b);
                webView.mo9953a(d0Var);
                float o2 = o.mo9750o();
                C0897z0 b2 = C0894y.m1151b();
                C0894y.m1156b(b2, "app_orientation", C0849u0.m938d(C0849u0.m945f()));
                C0894y.m1156b(b2, "width", (int) (((float) i2) / o2));
                C0894y.m1156b(b2, "height", (int) (((float) i3) / o2));
                C0894y.m1156b(b2, "x", C0849u0.m902a((View) webView));
                C0894y.m1156b(b2, "y", C0849u0.m922b((View) webView));
                C0894y.m1148a(b2, "ad_session_id", this.f93d);
                new C0645d0("MRAID.on_size_change", this.f90a.mo9469k(), b2).mo9536d();
            }
            ImageView imageView = this.f97h;
            if (imageView != null) {
                this.f90a.removeView(imageView);
            }
            Context b3 = C0578a.m141b();
            if (!(b3 == null || this.f102m || webView == null)) {
                float o3 = C0578a.m143c().mo9611o().mo9750o();
                int i4 = (int) (((float) this.f108s) * o3);
                int i5 = (int) (((float) this.f109t) * o3);
                if (this.f104o) {
                    i = webView.mo9971p() + webView.mo9969o();
                } else {
                    i = s.width();
                }
                int q = this.f104o ? webView.mo9972q() : 0;
                ImageView imageView2 = new ImageView(b3.getApplicationContext());
                this.f97h = imageView2;
                imageView2.setImageURI(Uri.fromFile(new File(this.f95f)));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
                layoutParams.setMargins(i - i4, q, 0, 0);
                this.f97h.setOnClickListener(new C0571b(b3));
                this.f90a.addView(this.f97h, layoutParams);
                this.f90a.mo9444a((View) this.f97h, FriendlyObstructionPurpose.CLOSE_AD);
            }
            if (this.f99j != null) {
                C0897z0 b4 = C0894y.m1151b();
                C0894y.m1158b(b4, "success", true);
                this.f99j.mo9530a(b4).mo9536d();
                this.f99j = null;
            }
            return true;
        }
        if (this.f99j != null) {
            C0897z0 b5 = C0894y.m1151b();
            C0894y.m1158b(b5, "success", false);
            this.f99j.mo9530a(b5).mo9536d();
            this.f99j = null;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9221c() {
        return this.f103n;
    }
}
