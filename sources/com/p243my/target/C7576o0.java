package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p243my.target.C7311a9;
import com.p243my.target.C7409g0;
import com.p243my.target.C7509k8;
import com.p243my.target.C7608p6;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.nativeads.views.IconAdView;
import java.util.List;

/* renamed from: com.my.target.o0 */
public class C7576o0 {

    /* renamed from: a */
    public final C7579c f19104a;

    /* renamed from: b */
    public final C7435h2 f19105b;

    /* renamed from: c */
    public final C7491k0 f19106c;

    /* renamed from: d */
    public final C7311a9 f19107d;

    /* renamed from: e */
    public final C7311a9.C7314c f19108e = new C7577a();

    /* renamed from: f */
    public final C7608p6.C7609a f19109f = new C7608p6.C7609a() {
        /* renamed from: a */
        public final void mo49442a(boolean z) {
            C7576o0.this.mo51268b(z);
        }
    };

    /* renamed from: g */
    public boolean f19110g;

    /* renamed from: h */
    public C7639r8 f19111h;

    /* renamed from: i */
    public boolean f19112i;

    /* renamed from: com.my.target.o0$a */
    public class C7577a extends C7311a9.C7314c {
        public C7577a() {
        }

        /* renamed from: a */
        public void mo49625a() {
            C7576o0.this.mo51263a();
        }
    }

    /* renamed from: com.my.target.o0$b */
    public class C7578b implements C7409g0.C7411b {
        public C7578b() {
        }

        /* renamed from: a */
        public void mo49488a(Context context) {
            C7741x8.m20827c((List<C7328b3>) C7576o0.this.f19105b.getStatHolder().mo49800a("closedByUser"), context);
            ViewGroup h = C7576o0.this.f19111h != null ? C7576o0.this.f19111h.mo51472h() : null;
            C7576o0.this.f19107d.mo49622b();
            C7576o0.this.f19107d.mo49620a((C7311a9.C7314c) null);
            boolean unused = C7576o0.this.f19112i = true;
            if (h != null) {
                h.setVisibility(4);
            }
        }
    }

    /* renamed from: com.my.target.o0$c */
    public interface C7579c extends View.OnClickListener {
        /* renamed from: a */
        void mo50273a(View view);

        /* renamed from: b */
        void mo50274b();
    }

    public C7576o0(C7435h2 h2Var, C7579c cVar) {
        this.f19104a = cVar;
        this.f19105b = h2Var;
        this.f19106c = C7491k0.m19526b(h2Var.getAdChoices());
        this.f19107d = C7311a9.m18723a(h2Var.getViewability(), h2Var.getStatHolder(), true);
    }

    /* renamed from: a */
    public static C7576o0 m19970a(C7435h2 h2Var, C7579c cVar) {
        return new C7576o0(h2Var, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19971a(boolean z) {
        if (z) {
            this.f19104a.mo50274b();
        }
    }

    /* renamed from: a */
    public void mo51263a() {
        C7639r8 r8Var = this.f19111h;
        ViewGroup h = r8Var != null ? r8Var.mo51472h() : null;
        if (h != null) {
            this.f19104a.mo50273a(h);
        }
        C7639r8 r8Var2 = this.f19111h;
        if (r8Var2 != null) {
            r8Var2.mo51456a();
        }
    }

    /* renamed from: a */
    public void mo51264a(View view, List<View> list, int i) {
        if (this.f19112i) {
            C7374e0.m18990b("Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            C7374e0.m18990b("unable to register view for displaying NativeBannerAd " + view + ", should be instance of ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C7639r8 a = C7639r8.m20257a(viewGroup, list, this.f19104a);
        this.f19111h = a;
        IconAdView e = a.mo51468e();
        if (e == null) {
            C7374e0.m18990b("IconAdView component not found in ad view  " + viewGroup + ". It's required");
            return;
        }
        C7725w8.m20768c();
        mo51266a(e);
        this.f19107d.mo49620a(this.f19108e);
        mo51265a(viewGroup);
        this.f19106c.mo50610a(viewGroup, this.f19111h.mo51466c(), new C7578b(), i);
        if (mo51269b() || this.f19110g) {
            this.f19107d.mo49623b(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo51265a(ViewGroup viewGroup) {
        C7639r8 r8Var = this.f19111h;
        if (r8Var != null) {
            C7608p6 i = r8Var.mo51473i();
            if (i == null) {
                i = new C7608p6(viewGroup.getContext());
                C7761y8.m20947b(i, "viewability_view");
                try {
                    viewGroup.addView(i);
                    this.f19111h.mo51459a(i);
                } catch (Throwable th) {
                    C7374e0.m18989a("Unable to add Viewability View: " + th.getMessage());
                    this.f19110g = true;
                    return;
                }
            }
            i.setViewabilityListener(this.f19109f);
        }
    }

    /* renamed from: a */
    public final void mo51266a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof C7506k6) {
            ImageData icon = this.f19105b.getIcon();
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
                            C7576o0.this.m19971a(z);
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

    /* renamed from: b */
    public final void mo51267b(IconAdView iconAdView) {
        iconAdView.setOnClickListener((View.OnClickListener) null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap((Bitmap) null);
        if (imageView instanceof C7506k6) {
            ((C7506k6) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData icon = this.f19105b.getIcon();
        if (icon != null) {
            C7509k8.m19619a(icon, imageView);
        }
    }

    /* renamed from: b */
    public void mo51268b(boolean z) {
        ViewGroup h;
        if (z) {
            C7639r8 r8Var = this.f19111h;
            if (r8Var != null && (h = r8Var.mo51472h()) != null) {
                this.f19107d.mo49623b(h);
                return;
            }
            return;
        }
        this.f19107d.mo49622b();
    }

    /* renamed from: b */
    public final boolean mo51269b() {
        C7608p6 i;
        C7639r8 r8Var = this.f19111h;
        if (r8Var == null || (i = r8Var.mo51473i()) == null) {
            return false;
        }
        return i.mo51337a();
    }

    /* renamed from: c */
    public void mo51270c() {
        this.f19107d.mo49622b();
        this.f19107d.mo49620a((C7311a9.C7314c) null);
        C7639r8 r8Var = this.f19111h;
        if (r8Var != null) {
            IconAdView e = r8Var.mo51468e();
            if (e != null) {
                mo51267b(e);
            }
            ViewGroup h = this.f19111h.mo51472h();
            if (h != null) {
                this.f19106c.mo50609a(h);
                h.setVisibility(0);
            }
            this.f19111h.mo51462b();
            this.f19111h = null;
        }
    }
}
