package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p243my.target.C7311a9;
import com.p243my.target.C7409g0;
import com.p243my.target.C7509k8;
import com.p243my.target.C7514l0;
import com.p243my.target.C7536m0;
import com.p243my.target.C7608p6;
import com.p243my.target.C7707v6;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.nativeads.views.IconAdView;
import com.p243my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.n0 */
public final class C7555n0 {

    /* renamed from: a */
    public final boolean f19052a;

    /* renamed from: b */
    public final C7452i1 f19053b;

    /* renamed from: c */
    public final C7558c f19054c;

    /* renamed from: d */
    public final C7435h2 f19055d;

    /* renamed from: e */
    public final C7491k0 f19056e;

    /* renamed from: f */
    public final C7311a9 f19057f;

    /* renamed from: g */
    public final C7311a9.C7314c f19058g;

    /* renamed from: h */
    public final C7608p6.C7609a f19059h;

    /* renamed from: i */
    public boolean f19060i;

    /* renamed from: j */
    public boolean f19061j;

    /* renamed from: k */
    public boolean f19062k;

    /* renamed from: l */
    public boolean f19063l = true;

    /* renamed from: m */
    public boolean f19064m;

    /* renamed from: n */
    public int f19065n = 0;

    /* renamed from: o */
    public C7536m0 f19066o;

    /* renamed from: p */
    public Parcelable f19067p;

    /* renamed from: q */
    public C7639r8 f19068q;

    /* renamed from: r */
    public View.OnClickListener f19069r;

    /* renamed from: com.my.target.n0$a */
    public class C7556a extends C7311a9.C7314c {
        public C7556a() {
        }

        /* renamed from: a */
        public void mo49625a() {
            C7555n0.this.mo50948c();
        }

        /* renamed from: a */
        public void mo49626a(boolean z) {
            C7555n0.this.mo50956e(z);
        }
    }

    /* renamed from: com.my.target.n0$b */
    public class C7557b implements C7409g0.C7411b {
        public C7557b() {
        }

        /* renamed from: a */
        public void mo49488a(Context context) {
            C7741x8.m20827c((List<C7328b3>) C7555n0.this.f19055d.getStatHolder().mo49800a("closedByUser"), context);
            ViewGroup h = C7555n0.this.f19068q != null ? C7555n0.this.f19068q.mo51472h() : null;
            C7555n0.this.f19057f.mo49622b();
            C7555n0.this.f19057f.mo49620a((C7311a9.C7314c) null);
            C7555n0.this.mo50943a(false);
            boolean unused = C7555n0.this.f19064m = true;
            if (h != null) {
                h.setVisibility(4);
            }
        }
    }

    /* renamed from: com.my.target.n0$c */
    public interface C7558c extends C7536m0.C7539c, C7707v6.C7708a, View.OnClickListener, C7514l0.C7515a {
        /* renamed from: a */
        void mo50110a(View view);

        /* renamed from: b */
        void mo50114b();

        /* renamed from: g */
        void mo50119g();
    }

    public C7555n0(C7435h2 h2Var, C7558c cVar, C7452i1 i1Var) {
        boolean z = true;
        this.f19054c = cVar;
        this.f19055d = h2Var;
        this.f19052a = h2Var.getNativeAdCards().size() > 0;
        this.f19053b = i1Var;
        C7413g2<VideoData> videoBanner = h2Var.getVideoBanner();
        this.f19060i = (videoBanner == null || videoBanner.getMediaData() == null) ? false : true;
        this.f19056e = C7491k0.m19526b(h2Var.getAdChoices());
        this.f19057f = C7311a9.m18723a(h2Var.getViewability(), h2Var.getStatHolder(), videoBanner != null ? false : z);
        this.f19058g = new C7556a();
        this.f19059h = new C7608p6.C7609a() {
            /* renamed from: a */
            public final void mo49442a(boolean z) {
                C7555n0.this.mo50953d(z);
            }
        };
    }

    /* renamed from: a */
    public static C7555n0 m19862a(C7435h2 h2Var, C7558c cVar, C7452i1 i1Var) {
        return new C7555n0(h2Var, cVar, i1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19863a(View view) {
        mo50935a(view, this.f19066o);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19867b(boolean z) {
        if (z) {
            this.f19054c.mo50119g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m19869c(boolean z) {
        if (z) {
            this.f19054c.mo50114b();
        }
    }

    /* renamed from: a */
    public final C7692u5 mo50931a(C7479j2 j2Var, MediaAdView mediaAdView) {
        C7692u5 a = mo50932a(mediaAdView);
        if (a == null) {
            a = new C7692u5(mediaAdView.getContext());
            mediaAdView.addView(a, new ViewGroup.LayoutParams(-2, -2));
        }
        a.mo51680a(this.f19055d.getCtcText(), this.f19055d.getCtcIcon());
        $$Lambda$n0$ORVoNLa0pO74sR6TJHwTVVOMWs r5 = new View.OnClickListener(j2Var) {
            public final /* synthetic */ C7479j2 f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C7555n0.this.m19864a(this.f$1, view);
            }
        };
        this.f19069r = r5;
        a.setOnClickListener(r5);
        return a;
    }

    /* renamed from: a */
    public final C7692u5 mo50932a(MediaAdView mediaAdView) {
        int childCount = mediaAdView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof C7692u5) {
                return (C7692u5) childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo50933a() {
        MediaAdView f;
        this.f19060i = false;
        this.f19065n = 0;
        C7536m0 m0Var = this.f19066o;
        if (m0Var != null) {
            m0Var.mo50817A();
        }
        C7639r8 r8Var = this.f19068q;
        if (r8Var != null && (f = r8Var.mo51469f()) != null) {
            ImageData image = this.f19055d.getImage();
            f.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
            C7693u6 b = mo50944b(f);
            if (b != null) {
                this.f19067p = b.getState();
                b.dispose();
                ((View) b).setVisibility(8);
            }
            mo50939a(f, image);
            f.getImageView().setVisibility(0);
            f.getProgressBarView().setVisibility(8);
            f.getPlayButtonView().setVisibility(8);
            if (this.f19063l) {
                f.setOnClickListener(this.f19054c);
            }
        }
    }

    /* renamed from: a */
    public void m19864a(View view, C7479j2 j2Var) {
        C7514l0 a = C7514l0.m19634a(j2Var);
        a.mo50749a((C7514l0.C7515a) this.f19054c);
        a.mo50748a(view.getContext());
    }

    /* renamed from: a */
    public void mo50935a(View view, C7536m0 m0Var) {
        C7479j2 content = this.f19055d.getContent();
        if (content != null) {
            m19864a(view, content);
        } else {
            m0Var.mo50828b(view);
        }
    }

    /* renamed from: a */
    public void mo50936a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        if (!(view instanceof ViewGroup)) {
            C7374e0.m18990b("unable to register view for displaying NativeAd " + view + ", should be instance of ViewGroup");
        } else if (this.f19064m) {
            C7374e0.m18990b("Registering ad was disabled by user");
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
            ViewGroup viewGroup = (ViewGroup) view;
            C7639r8 a = C7639r8.m20258a(viewGroup, list, mediaAdView, this.f19054c);
            this.f19068q = a;
            MediaAdView f = a.mo51469f();
            C7707v6 g = this.f19068q.mo51471g();
            IconAdView e = this.f19068q.mo51468e();
            this.f19063l = this.f19068q.mo51474j();
            if (e == null) {
                C7374e0.m18990b("IconAdView component not found in ad view " + viewGroup.getClass().getName() + ". It will be required in future versions of sdk.");
            } else {
                C7725w8.m20768c();
            }
            if (f == null) {
                C7374e0.m18990b("MediaAdView component not found in ad view " + viewGroup.getClass().getName() + ". It will be required in future versions of sdk.");
            } else {
                C7725w8.m20769d();
            }
            this.f19057f.mo49620a(this.f19058g);
            mo50937a(viewGroup);
            this.f19056e.mo50610a(viewGroup, this.f19068q.mo51466c(), new C7557b(), i);
            if (this.f19052a && g != null) {
                mo50942a(g);
            } else if (f != null) {
                mo50949c(f);
            }
            if (e != null) {
                mo50938a(e);
            }
            C7725w8.m20765b(viewGroup.getContext());
            if (mo50954d() || this.f19061j) {
                this.f19057f.mo49623b(viewGroup);
            }
        }
    }

    /* renamed from: a */
    public final void mo50937a(ViewGroup viewGroup) {
        C7639r8 r8Var = this.f19068q;
        if (r8Var != null) {
            C7608p6 i = r8Var.mo51473i();
            if (i == null) {
                i = new C7608p6(viewGroup.getContext());
                C7761y8.m20947b(i, "viewability_view");
                try {
                    viewGroup.addView(i);
                    this.f19068q.mo51459a(i);
                } catch (Throwable th) {
                    C7374e0.m18989a("Unable to add Viewability View: " + th.getMessage());
                    this.f19061j = true;
                    return;
                }
            }
            i.setViewabilityListener(this.f19059h);
        }
    }

    /* renamed from: a */
    public final void mo50938a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof C7506k6) {
            ImageData icon = this.f19055d.getIcon();
            if (icon != null) {
                Bitmap bitmap = icon.getBitmap();
                int width = icon.getWidth();
                int height = icon.getHeight();
                if (width <= 0 || height <= 0) {
                    width = 100;
                    height = 100;
                }
                ((C7506k6) imageView).setPlaceholderDimensions(width, height);
                if (bitmap == null) {
                    C7509k8.m19620a(icon, imageView, new C7509k8.C7510a() {
                        /* renamed from: a */
                        public final void mo49454a(boolean z) {
                            C7555n0.this.m19869c(z);
                        }
                    });
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } else {
                imageView.setImageBitmap((Bitmap) null);
                ((C7506k6) imageView).setPlaceholderDimensions(0, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo50939a(MediaAdView mediaAdView, ImageData imageData) {
        if (imageData != null) {
            int width = imageData.getWidth();
            int height = imageData.getHeight();
            if (this.f19062k || width <= 0 || height <= 0) {
                mediaAdView.setPlaceHolderDimension(16, 9);
                this.f19062k = true;
                return;
            }
            mediaAdView.setPlaceHolderDimension(width, height);
            return;
        }
        mediaAdView.setPlaceHolderDimension(0, 0);
    }

    /* renamed from: a */
    public final void mo50940a(MediaAdView mediaAdView, C7536m0 m0Var) {
        m0Var.mo50820a((View.OnClickListener) this.f19054c);
        C7639r8 r8Var = this.f19068q;
        if (r8Var != null) {
            m0Var.mo50823a(mediaAdView, r8Var.mo51467d());
        }
    }

    /* renamed from: a */
    public final void mo50941a(MediaAdView mediaAdView, boolean z, C7536m0.C7539c cVar) {
        VideoData videoData;
        this.f19065n = 1;
        C7413g2<VideoData> videoBanner = this.f19055d.getVideoBanner();
        if (videoBanner != null) {
            mediaAdView.setPlaceHolderDimension(videoBanner.getWidth(), videoBanner.getHeight());
            videoData = videoBanner.getMediaData();
        } else {
            videoData = null;
        }
        if (this.f19066o == null && videoData != null) {
            this.f19065n = 1;
            this.f19066o = new C7536m0(this.f19055d, videoBanner, videoData, this.f19053b);
        }
        if (this.f19066o != null) {
            mediaAdView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C7555n0.this.m19863a(view);
                }
            });
            this.f19066o.mo50822a(cVar);
            this.f19066o.mo50829c(z);
            this.f19066o.mo50826a(z);
            mo50940a(mediaAdView, this.f19066o);
        }
    }

    /* renamed from: a */
    public final void mo50942a(C7707v6 v6Var) {
        this.f19065n = 2;
        v6Var.setPromoCardSliderListener(this.f19054c);
        Parcelable parcelable = this.f19067p;
        if (parcelable != null) {
            v6Var.restoreState(parcelable);
        }
    }

    /* renamed from: a */
    public void mo50943a(boolean z) {
        C7536m0 m0Var = this.f19066o;
        if (m0Var != null) {
            if (z) {
                m0Var.mo50838v();
            } else {
                m0Var.mo50837u();
            }
        }
    }

    /* renamed from: b */
    public final C7693u6 mo50944b(MediaAdView mediaAdView) {
        if (!this.f19052a) {
            return null;
        }
        for (int i = 0; i < mediaAdView.getChildCount(); i++) {
            View childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof C7707v6) {
                return (C7693u6) childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo50945b(IconAdView iconAdView) {
        iconAdView.setOnClickListener((View.OnClickListener) null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap((Bitmap) null);
        if (imageView instanceof C7506k6) {
            ((C7506k6) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData icon = this.f19055d.getIcon();
        if (icon != null) {
            C7509k8.m19619a(icon, imageView);
        }
    }

    /* renamed from: b */
    public final void mo50946b(MediaAdView mediaAdView, ImageData imageData) {
        C7506k6 k6Var = (C7506k6) mediaAdView.getImageView();
        if (imageData != null) {
            Bitmap bitmap = imageData.getBitmap();
            if (bitmap != null) {
                k6Var.setImageBitmap(bitmap);
                return;
            }
            k6Var.setImageBitmap((Bitmap) null);
            C7509k8.m19620a(imageData, k6Var, new C7509k8.C7510a() {
                /* renamed from: a */
                public final void mo49454a(boolean z) {
                    C7555n0.this.m19867b(z);
                }
            });
            return;
        }
        k6Var.setImageBitmap((Bitmap) null);
    }

    /* renamed from: b */
    public int[] mo50947b() {
        MediaAdView f;
        C7693u6 b;
        C7639r8 r8Var = this.f19068q;
        if (r8Var == null) {
            return null;
        }
        int i = this.f19065n;
        if (i == 2) {
            C7707v6 g = r8Var.mo51471g();
            if (g == null) {
                return null;
            }
            return g.getVisibleCardNumbers();
        } else if (i != 3 || (f = r8Var.mo51469f()) == null || (b = mo50944b(f)) == null) {
            return null;
        } else {
            return b.getVisibleCardNumbers();
        }
    }

    /* renamed from: c */
    public void mo50948c() {
        C7639r8 r8Var;
        C7639r8 r8Var2 = this.f19068q;
        ViewGroup h = r8Var2 != null ? r8Var2.mo51472h() : null;
        if (h != null) {
            this.f19054c.mo50110a(h);
        }
        if (this.f19065n != 1 && (r8Var = this.f19068q) != null) {
            r8Var.mo51456a();
        }
    }

    /* renamed from: c */
    public final void mo50949c(MediaAdView mediaAdView) {
        ImageData image = this.f19055d.getImage();
        if (this.f19052a) {
            mo50950c(mediaAdView, image);
            return;
        }
        mo50946b(mediaAdView, image);
        C7692u5 u5Var = null;
        C7479j2 content = this.f19055d.getContent();
        if (content != null) {
            u5Var = mo50931a(content, mediaAdView);
        }
        if (this.f19060i) {
            mo50941a(mediaAdView, u5Var != null, (C7536m0.C7539c) this.f19054c);
        } else {
            mo50952d(mediaAdView, image);
        }
    }

    /* renamed from: c */
    public final void mo50950c(MediaAdView mediaAdView, ImageData imageData) {
        mo50939a(mediaAdView, imageData);
        if (this.f19065n != 2) {
            this.f19065n = 3;
            Context context = mediaAdView.getContext();
            C7693u6 b = mo50944b(mediaAdView);
            if (b == null) {
                b = new C7674t6(context);
                mediaAdView.addView(b.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
            Parcelable parcelable = this.f19067p;
            if (parcelable != null) {
                b.restoreState(parcelable);
            }
            b.getView().setClickable(this.f19063l);
            b.setupCards(this.f19055d.getNativeAdCards());
            b.setPromoCardSliderListener(this.f19054c);
            mediaAdView.setBackgroundColor(0);
            b.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo50951d(MediaAdView mediaAdView) {
        ImageData image = this.f19055d.getImage();
        C7506k6 k6Var = (C7506k6) mediaAdView.getImageView();
        if (image != null) {
            C7509k8.m19619a(image, (ImageView) k6Var);
        }
        mediaAdView.getProgressBarView().setVisibility(8);
        mediaAdView.getPlayButtonView().setVisibility(8);
        k6Var.setImageData((ImageData) null);
        mediaAdView.setPlaceHolderDimension(0, 0);
        mediaAdView.setOnClickListener((View.OnClickListener) null);
        mediaAdView.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        C7693u6 b = mo50944b(mediaAdView);
        if (b != null) {
            this.f19067p = b.getState();
            b.dispose();
            ((View) b).setVisibility(8);
        }
        C7692u5 a = mo50932a(mediaAdView);
        if (a != null) {
            mediaAdView.removeView(a);
        }
    }

    /* renamed from: d */
    public final void mo50952d(MediaAdView mediaAdView, ImageData imageData) {
        mo50939a(mediaAdView, imageData);
        this.f19065n = 0;
        mediaAdView.getImageView().setVisibility(0);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.getProgressBarView().setVisibility(8);
        if (this.f19063l) {
            mediaAdView.setOnClickListener(this.f19054c);
        }
    }

    /* renamed from: d */
    public void mo50953d(boolean z) {
        ViewGroup h;
        if (z) {
            C7639r8 r8Var = this.f19068q;
            if (r8Var != null && (h = r8Var.mo51472h()) != null) {
                this.f19057f.mo49623b(h);
                return;
            }
            return;
        }
        mo50943a(false);
        this.f19057f.mo49622b();
    }

    /* renamed from: d */
    public final boolean mo50954d() {
        C7608p6 i;
        C7639r8 r8Var = this.f19068q;
        if (r8Var == null || (i = r8Var.mo51473i()) == null) {
            return false;
        }
        return i.mo51337a();
    }

    /* renamed from: e */
    public final void mo50955e() {
        C7536m0 m0Var = this.f19066o;
        if (m0Var != null) {
            m0Var.mo50817A();
        }
    }

    /* renamed from: e */
    public void mo50956e(boolean z) {
        C7639r8 r8Var = this.f19068q;
        if (r8Var == null || r8Var.mo51472h() == null) {
            mo50957f();
        } else if (this.f19065n == 1) {
            mo50943a(z);
        }
    }

    /* renamed from: f */
    public void mo50957f() {
        this.f19057f.mo49622b();
        this.f19057f.mo49620a((C7311a9.C7314c) null);
        mo50955e();
        C7639r8 r8Var = this.f19068q;
        if (r8Var != null) {
            IconAdView e = r8Var.mo51468e();
            if (e != null) {
                mo50945b(e);
            }
            MediaAdView f = this.f19068q.mo51469f();
            if (f != null) {
                mo50951d(f);
            }
            C7707v6 g = this.f19068q.mo51471g();
            if (g != null) {
                g.setPromoCardSliderListener((C7707v6.C7708a) null);
                this.f19067p = g.getState();
                g.dispose();
            }
            ViewGroup h = this.f19068q.mo51472h();
            if (h != null) {
                this.f19056e.mo50609a(h);
                h.setVisibility(0);
            }
            this.f19068q.mo51462b();
            this.f19068q = null;
        }
    }
}
