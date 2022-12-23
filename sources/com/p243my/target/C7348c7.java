package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.p243my.target.C7308a7;
import com.p243my.target.C7543m4;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;

/* renamed from: com.my.target.c7 */
public class C7348c7 extends RelativeLayout implements C7781z6 {

    /* renamed from: a */
    public static final int f18417a = C7761y8.m20948c();

    /* renamed from: b */
    public final C7350b f18418b;

    /* renamed from: c */
    public final C7506k6 f18419c;

    /* renamed from: d */
    public final C7405f7 f18420d;

    /* renamed from: e */
    public final C7364d7 f18421e;

    /* renamed from: f */
    public final C7332b7 f18422f;

    /* renamed from: g */
    public final C7422g6 f18423g;

    /* renamed from: h */
    public final C7564n6 f18424h;

    /* renamed from: i */
    public final C7761y8 f18425i;

    /* renamed from: j */
    public final C7422g6 f18426j;

    /* renamed from: k */
    public final C7722w5 f18427k;

    /* renamed from: l */
    public final Bitmap f18428l;

    /* renamed from: m */
    public final Bitmap f18429m;

    /* renamed from: n */
    public final int f18430n;

    /* renamed from: o */
    public final int f18431o;

    /* renamed from: p */
    public final int f18432p;

    /* renamed from: q */
    public final int f18433q;

    /* renamed from: r */
    public float f18434r;

    /* renamed from: s */
    public C7308a7.C7309a f18435s;

    /* renamed from: t */
    public C7543m4.C7544a f18436t;

    /* renamed from: u */
    public final int f18437u;

    /* renamed from: com.my.target.c7$a */
    public class C7349a implements View.OnClickListener {
        public C7349a() {
        }

        public void onClick(View view) {
            if (C7348c7.this.f18435s != null) {
                C7348c7.this.f18435s.mo49609d();
            }
        }
    }

    /* renamed from: com.my.target.c7$b */
    public class C7350b implements View.OnClickListener {
        public C7350b() {
        }

        public void onClick(View view) {
            if (view.isEnabled() && C7348c7.this.f18435s != null) {
                C7348c7.this.f18435s.mo49610e();
            }
        }
    }

    public C7348c7(Context context, C7552m7 m7Var) {
        super(context);
        boolean z = (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
        C7761y8 c = C7761y8.m20950c(context);
        this.f18425i = c;
        C7506k6 k6Var = new C7506k6(context);
        this.f18419c = k6Var;
        C7405f7 b = m7Var.mo50894b(c, z);
        this.f18420d = b;
        C7364d7 a = m7Var.mo50890a(c, z);
        this.f18421e = a;
        int i = f18417a;
        a.setId(i);
        C7422g6 g6Var = new C7422g6(context);
        this.f18423g = g6Var;
        C7564n6 n6Var = new C7564n6(context);
        this.f18424h = n6Var;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14, -1);
        C7332b7 b7Var = new C7332b7(context, c);
        this.f18422f = b7Var;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12, -1);
        b7Var.setLayoutParams(layoutParams3);
        C7422g6 g6Var2 = new C7422g6(context);
        this.f18426j = g6Var2;
        this.f18428l = C7622q5.m20203f(context);
        this.f18429m = C7622q5.m20202e(context);
        this.f18418b = new C7350b();
        this.f18430n = c.mo51902b(64);
        this.f18431o = c.mo51902b(20);
        C7722w5 w5Var = new C7722w5(context);
        this.f18427k = w5Var;
        int b2 = c.mo51902b(28);
        this.f18437u = b2;
        w5Var.setFixedHeight(b2);
        C7761y8.m20947b(k6Var, ViewHierarchyConstants.ICON_BITMAP);
        C7761y8.m20947b(g6Var2, "sound_button");
        C7761y8.m20947b(b, "vertical_view");
        C7761y8.m20947b(a, "media_view");
        C7761y8.m20947b(b7Var, "panel_view");
        C7761y8.m20947b(g6Var, "close_button");
        C7761y8.m20947b(n6Var, "progress_wheel");
        addView(b7Var, 0);
        addView(k6Var, 0);
        addView(b, 0, layoutParams);
        addView(a, 0, layoutParams2);
        addView(g6Var2);
        addView(w5Var);
        addView(g6Var);
        addView(n6Var);
        this.f18432p = c.mo51902b(28);
        this.f18433q = c.mo51902b(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18866a(View view) {
        C7543m4.C7544a aVar = this.f18436t;
        if (aVar != null) {
            aVar.mo50868a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m18867b(View view) {
        C7308a7.C7309a aVar = this.f18435s;
        if (aVar != null) {
            aVar.mo49610e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m18868e() {
        this.f18422f.mo49755b(this.f18426j);
    }

    /* renamed from: a */
    public void mo49825a() {
        this.f18422f.mo49754a(this.f18426j);
        this.f18421e.mo50009f();
    }

    /* renamed from: a */
    public void mo49826a(int i) {
        this.f18421e.mo49998a(i);
    }

    /* renamed from: a */
    public void mo49827a(C7399f2 f2Var) {
        this.f18426j.setVisibility(8);
        this.f18423g.setVisibility(0);
        mo49829a(false);
        this.f18421e.mo50003b(f2Var);
    }

    /* renamed from: a */
    public final void mo49828a(C7596p1 p1Var) {
        this.f18427k.setImageBitmap(p1Var.mo51318c().getBitmap());
        this.f18427k.setOnClickListener(new C7349a());
    }

    /* renamed from: a */
    public void mo49829a(boolean z) {
        this.f18424h.setVisibility(8);
        this.f18422f.mo49758e(this.f18426j);
        this.f18421e.mo50005b(z);
    }

    /* renamed from: b */
    public void mo49830b() {
        this.f18422f.mo49758e(this.f18426j);
        this.f18421e.mo50008e();
    }

    /* renamed from: b */
    public final void mo49831b(boolean z) {
        C7422g6 g6Var;
        String str;
        if (z) {
            this.f18426j.mo50226a(this.f18429m, false);
            g6Var = this.f18426j;
            str = "sound_off";
        } else {
            this.f18426j.mo50226a(this.f18428l, false);
            g6Var = this.f18426j;
            str = "sound_on";
        }
        g6Var.setContentDescription(str);
    }

    /* renamed from: b */
    public final boolean mo49832b(C7399f2 f2Var) {
        int i;
        int i2;
        C7685u1 u1Var;
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner == null ? (u1Var = f2Var.getImage()) == null : (u1Var = videoBanner.getMediaData()) == null) {
            i = 0;
            i2 = 0;
        } else {
            i2 = u1Var.getHeight();
            i = u1Var.getWidth();
        }
        if (i2 <= 0 || i <= 0) {
            return false;
        }
        return i2 > i || ((float) i) / ((float) i2) < 1.4f;
    }

    /* renamed from: c */
    public void mo49833c(boolean z) {
        this.f18422f.mo49754a(this.f18426j);
        this.f18421e.mo50001a(z);
    }

    /* renamed from: c */
    public boolean mo49834c() {
        return this.f18421e.mo50007d();
    }

    /* renamed from: d */
    public void mo49603d() {
        this.f18423g.setVisibility(0);
    }

    public void destroy() {
        this.f18421e.mo49997a();
    }

    /* renamed from: f */
    public boolean mo49836f() {
        return this.f18421e.mo50006c();
    }

    /* renamed from: g */
    public void mo49837g() {
        this.f18421e.mo50013h();
    }

    public View getCloseButton() {
        return this.f18423g;
    }

    public C7364d7 getPromoMediaView() {
        return this.f18421e;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo49839h() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C7422g6 g6Var = this.f18423g;
        g6Var.layout(i3 - g6Var.getMeasuredWidth(), 0, i3, this.f18423g.getMeasuredHeight());
        C7564n6 n6Var = this.f18424h;
        int i5 = this.f18433q;
        n6Var.layout(i5, i5, n6Var.getMeasuredWidth() + this.f18433q, this.f18424h.getMeasuredHeight() + this.f18433q);
        C7761y8.m20938a((View) this.f18427k, this.f18423g.getLeft() - this.f18427k.getMeasuredWidth(), this.f18423g.getTop(), this.f18423g.getLeft(), this.f18423g.getBottom());
        if (i4 > i3) {
            if (this.f18426j.getTranslationY() > 0.0f) {
                this.f18426j.setTranslationY(0.0f);
            }
            setBackgroundColor(-1);
            int measuredWidth = (i3 - this.f18421e.getMeasuredWidth()) / 2;
            C7364d7 d7Var = this.f18421e;
            d7Var.layout(measuredWidth, 0, d7Var.getMeasuredWidth() + measuredWidth, this.f18421e.getMeasuredHeight());
            this.f18420d.layout(0, this.f18421e.getBottom(), i3, i4);
            int i6 = this.f18431o;
            if (this.f18421e.getMeasuredHeight() != 0) {
                i6 = this.f18421e.getBottom() - (this.f18419c.getMeasuredHeight() / 2);
            }
            C7506k6 k6Var = this.f18419c;
            int i7 = this.f18431o;
            k6Var.layout(i7, i6, k6Var.getMeasuredWidth() + i7, this.f18419c.getMeasuredHeight() + i6);
            this.f18422f.layout(0, 0, 0, 0);
            C7422g6 g6Var2 = this.f18426j;
            g6Var2.layout(i3 - g6Var2.getMeasuredWidth(), this.f18421e.getBottom() - this.f18426j.getMeasuredHeight(), i3, this.f18421e.getBottom());
            return;
        }
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int measuredWidth2 = (i3 - this.f18421e.getMeasuredWidth()) / 2;
        int measuredHeight = (i4 - this.f18421e.getMeasuredHeight()) / 2;
        C7364d7 d7Var2 = this.f18421e;
        d7Var2.layout(measuredWidth2, measuredHeight, d7Var2.getMeasuredWidth() + measuredWidth2, this.f18421e.getMeasuredHeight() + measuredHeight);
        this.f18419c.layout(0, 0, 0, 0);
        this.f18420d.layout(0, 0, 0, 0);
        C7332b7 b7Var = this.f18422f;
        b7Var.layout(0, i4 - b7Var.getMeasuredHeight(), i3, i4);
        C7422g6 g6Var3 = this.f18426j;
        g6Var3.layout(i3 - g6Var3.getMeasuredWidth(), this.f18422f.getTop() - this.f18426j.getMeasuredHeight(), i3, this.f18422f.getTop());
        if (this.f18421e.mo50007d()) {
            this.f18422f.mo49755b(this.f18426j);
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f18426j.measure(i, i2);
        this.f18423g.measure(i, i2);
        this.f18424h.measure(View.MeasureSpec.makeMeasureSpec(this.f18432p, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18432p, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        C7722w5 w5Var = this.f18427k;
        int i3 = this.f18437u;
        C7761y8.m20937a(w5Var, i3, i3, 1073741824);
        if (size2 > size) {
            this.f18422f.setVisibility(8);
            this.f18421e.measure(makeMeasureSpec, makeMeasureSpec2);
            this.f18420d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - this.f18421e.getMeasuredHeight(), Integer.MIN_VALUE));
            this.f18419c.measure(View.MeasureSpec.makeMeasureSpec(this.f18430n, Integer.MIN_VALUE), makeMeasureSpec2);
        } else {
            this.f18422f.setVisibility(0);
            this.f18421e.measure(makeMeasureSpec, makeMeasureSpec2);
            this.f18422f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), makeMeasureSpec2);
        }
        setMeasuredDimension(i, i2);
    }

    public void setBanner(C7399f2 f2Var) {
        int i;
        int i2;
        String str;
        C7422g6 g6Var;
        this.f18424h.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f18432p, this.f18425i.mo51902b(28));
        layoutParams.addRule(9);
        layoutParams.topMargin = this.f18425i.mo51902b(10);
        layoutParams.leftMargin = this.f18425i.mo51902b(10);
        this.f18424h.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        this.f18423g.setVisibility(8);
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner == null) {
            this.f18426j.setVisibility(8);
        }
        this.f18423g.setLayoutParams(layoutParams2);
        Point b = C7761y8.m20944b(getContext());
        boolean z = b.x + b.y < 1280 || mo49832b(f2Var);
        this.f18422f.mo49751a();
        this.f18422f.setBanner(f2Var);
        this.f18420d.mo50156a(b.x, b.y, z);
        this.f18420d.setBanner(f2Var);
        this.f18421e.mo50002b();
        this.f18421e.mo50004b(f2Var, 0);
        ImageData closeIcon = f2Var.getCloseIcon();
        if (closeIcon == null || closeIcon.getData() == null) {
            Bitmap a = C7607p5.m20092a(this.f18437u);
            if (a != null) {
                this.f18423g.mo50226a(a, false);
            }
        } else {
            this.f18423g.mo50226a(closeIcon.getData(), true);
        }
        ImageData icon = f2Var.getIcon();
        if (icon != null) {
            i2 = icon.getWidth();
            i = icon.getHeight();
        } else {
            i2 = 0;
            i = 0;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = this.f18425i.mo51902b(4);
        if (!(i2 == 0 || i == 0)) {
            int b2 = (int) (((float) this.f18425i.mo51902b(64)) * (((float) i) / ((float) i2)));
            layoutParams3.width = this.f18430n;
            layoutParams3.height = b2;
            if (!z) {
                layoutParams3.bottomMargin = (-b2) / 2;
            }
        }
        layoutParams3.addRule(8, f18417a);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(this.f18425i.mo51902b(20));
        } else {
            layoutParams3.leftMargin = this.f18425i.mo51902b(20);
        }
        this.f18419c.setLayoutParams(layoutParams3);
        if (icon != null) {
            this.f18419c.setImageBitmap(icon.getData());
        }
        if (videoBanner != null && videoBanner.isAutoPlay()) {
            mo49833c(true);
            post(new Runnable() {
                public final void run() {
                    C7348c7.this.m18868e();
                }
            });
        }
        if (videoBanner != null) {
            this.f18434r = videoBanner.getDuration();
            if (videoBanner.isAutoMute()) {
                this.f18426j.mo50226a(this.f18429m, false);
                g6Var = this.f18426j;
                str = "sound_off";
            } else {
                this.f18426j.mo50226a(this.f18428l, false);
                g6Var = this.f18426j;
                str = "sound_on";
            }
            g6Var.setContentDescription(str);
        }
        this.f18426j.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C7348c7.this.m18866a(view);
            }
        });
        C7596p1 adChoices = f2Var.getAdChoices();
        if (adChoices != null) {
            mo49828a(adChoices);
        } else {
            this.f18427k.setVisibility(8);
        }
    }

    public void setClickArea(C7631r1 r1Var) {
        C7374e0.m18989a("Apply click area " + r1Var.mo51444a() + " to view");
        if (r1Var.f19280e || r1Var.f19290o) {
            this.f18419c.setOnClickListener(this.f18418b);
        } else {
            this.f18419c.setOnClickListener((View.OnClickListener) null);
        }
        this.f18420d.mo50157a(r1Var, this.f18418b);
        this.f18422f.mo49753a(r1Var, (View.OnClickListener) this.f18418b);
        if (r1Var.f19281f || r1Var.f19290o) {
            this.f18421e.getClickableLayout().setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C7348c7.this.m18867b(view);
                }
            });
            return;
        }
        this.f18421e.getClickableLayout().setOnClickListener((View.OnClickListener) null);
        this.f18421e.getClickableLayout().setEnabled(false);
    }

    public void setInterstitialPromoViewListener(C7308a7.C7309a aVar) {
        this.f18435s = aVar;
    }

    public void setMediaListener(C7543m4.C7544a aVar) {
        this.f18436t = aVar;
        this.f18421e.setInterstitialPromoViewListener(aVar);
        this.f18421e.mo50010g();
    }

    public void setTimeChanged(float f) {
        this.f18424h.setVisibility(0);
        float f2 = this.f18434r;
        if (f2 > 0.0f) {
            this.f18424h.setProgress(f / f2);
        }
        this.f18424h.setDigit((int) ((this.f18434r - f) + 1.0f));
    }
}
