package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.AppEventsConstants;
import com.p243my.target.C7308a7;
import com.p243my.target.C7543m4;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.common.views.StarsRatingView;

/* renamed from: com.my.target.e7 */
public class C7382e7 extends ViewGroup implements C7781z6 {

    /* renamed from: A */
    public C7543m4.C7544a f18496A;

    /* renamed from: B */
    public int f18497B;

    /* renamed from: C */
    public float f18498C;

    /* renamed from: D */
    public boolean f18499D;

    /* renamed from: E */
    public boolean f18500E;

    /* renamed from: F */
    public final int f18501F;

    /* renamed from: G */
    public String f18502G;

    /* renamed from: H */
    public String f18503H;

    /* renamed from: I */
    public boolean f18504I;

    /* renamed from: a */
    public final C7385c f18505a;

    /* renamed from: b */
    public final TextView f18506b;

    /* renamed from: c */
    public final StarsRatingView f18507c;

    /* renamed from: d */
    public final Button f18508d;

    /* renamed from: e */
    public final TextView f18509e;

    /* renamed from: f */
    public final C7761y8 f18510f;

    /* renamed from: g */
    public final LinearLayout f18511g;

    /* renamed from: h */
    public final TextView f18512h;

    /* renamed from: i */
    public final FrameLayout f18513i;

    /* renamed from: j */
    public final C7364d7 f18514j;

    /* renamed from: k */
    public final TextView f18515k;

    /* renamed from: l */
    public final C7564n6 f18516l;

    /* renamed from: m */
    public final C7422g6 f18517m;

    /* renamed from: n */
    public final C7759y6 f18518n;

    /* renamed from: o */
    public final C7759y6 f18519o;

    /* renamed from: p */
    public final C7759y6 f18520p;

    /* renamed from: q */
    public final Runnable f18521q = new C7386d();

    /* renamed from: r */
    public final C7387e f18522r = new C7387e();

    /* renamed from: s */
    public final C7384b f18523s = new C7384b();

    /* renamed from: t */
    public final C7722w5 f18524t;

    /* renamed from: u */
    public final int f18525u;

    /* renamed from: v */
    public final int f18526v;

    /* renamed from: w */
    public final Bitmap f18527w;

    /* renamed from: x */
    public final Bitmap f18528x;

    /* renamed from: y */
    public float f18529y;

    /* renamed from: z */
    public C7308a7.C7309a f18530z;

    /* renamed from: com.my.target.e7$b */
    public class C7384b implements View.OnClickListener {
        public C7384b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (com.p243my.target.C7382e7.m19020e(r1.f18531a) != null) goto L_0x0059;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.my.target.e7 r0 = com.p243my.target.C7382e7.this
                android.widget.LinearLayout r0 = r0.f18511g
                if (r2 != r0) goto L_0x0011
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.m4$a r2 = r2.f18496A
                if (r2 == 0) goto L_0x0062
                goto L_0x0059
            L_0x0011:
                com.my.target.e7 r0 = com.p243my.target.C7382e7.this
                com.my.target.y6 r0 = r0.f18518n
                if (r2 != r0) goto L_0x0037
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.d7 r2 = r2.f18514j
                boolean r2 = r2.mo50007d()
                if (r2 == 0) goto L_0x0081
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.m4$a r2 = r2.f18496A
                if (r2 == 0) goto L_0x0081
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.m4$a r2 = r2.f18496A
                r2.mo50019c()
                goto L_0x0081
            L_0x0037:
                com.my.target.e7 r0 = com.p243my.target.C7382e7.this
                com.my.target.y6 r0 = r0.f18519o
                if (r2 != r0) goto L_0x0068
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.m4$a r2 = r2.f18496A
                if (r2 == 0) goto L_0x0062
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                boolean r2 = r2.mo49836f()
                if (r2 == 0) goto L_0x0059
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.m4$a r2 = r2.f18496A
                r2.mo50021n()
                goto L_0x0062
            L_0x0059:
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.m4$a r2 = r2.f18496A
                r2.mo50020m()
            L_0x0062:
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                r2.mo50074e()
                goto L_0x0081
            L_0x0068:
                com.my.target.e7 r0 = com.p243my.target.C7382e7.this
                com.my.target.w5 r0 = r0.f18524t
                if (r2 != r0) goto L_0x0081
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.a7$a r2 = r2.f18530z
                if (r2 == 0) goto L_0x0081
                com.my.target.e7 r2 = com.p243my.target.C7382e7.this
                com.my.target.a7$a r2 = r2.f18530z
                r2.mo49609d()
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7382e7.C7384b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.my.target.e7$c */
    public class C7385c implements View.OnClickListener {
        public C7385c() {
        }

        public void onClick(View view) {
            if (view.isEnabled() && C7382e7.this.f18530z != null) {
                C7382e7.this.f18530z.mo49610e();
            }
        }
    }

    /* renamed from: com.my.target.e7$d */
    public class C7386d implements Runnable {
        public C7386d() {
        }

        public void run() {
            if (C7382e7.this.f18497B == 2 || C7382e7.this.f18497B == 0) {
                C7382e7.this.mo50074e();
            }
        }
    }

    /* renamed from: com.my.target.e7$e */
    public class C7387e implements View.OnClickListener {
        public C7387e() {
        }

        public void onClick(View view) {
            C7382e7 e7Var = C7382e7.this;
            e7Var.removeCallbacks(e7Var.f18521q);
            if (C7382e7.this.f18497B == 2) {
                C7382e7.this.mo50074e();
                return;
            }
            if (C7382e7.this.f18497B == 0 || C7382e7.this.f18497B == 3) {
                C7382e7.this.mo50076j();
            }
            C7382e7 e7Var2 = C7382e7.this;
            e7Var2.postDelayed(e7Var2.f18521q, 4000);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7382e7(Context context, boolean z) {
        super(context);
        Context context2 = context;
        TextView textView = new TextView(context2);
        this.f18509e = textView;
        TextView textView2 = new TextView(context2);
        this.f18506b = textView2;
        StarsRatingView starsRatingView = new StarsRatingView(context2);
        this.f18507c = starsRatingView;
        Button button = new Button(context2);
        this.f18508d = button;
        TextView textView3 = new TextView(context2);
        this.f18512h = textView3;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f18513i = frameLayout;
        C7759y6 y6Var = new C7759y6(context2);
        this.f18518n = y6Var;
        C7759y6 y6Var2 = new C7759y6(context2);
        this.f18519o = y6Var2;
        C7759y6 y6Var3 = new C7759y6(context2);
        this.f18520p = y6Var3;
        TextView textView4 = new TextView(context2);
        this.f18515k = textView4;
        C7364d7 d7Var = new C7364d7(context2, C7761y8.m20950c(context), false, z);
        this.f18514j = d7Var;
        C7564n6 n6Var = new C7564n6(context2);
        this.f18516l = n6Var;
        C7422g6 g6Var = new C7422g6(context2);
        this.f18517m = g6Var;
        this.f18511g = new LinearLayout(context2);
        C7761y8 c = C7761y8.m20950c(context);
        this.f18510f = c;
        this.f18524t = new C7722w5(context2);
        C7761y8.m20947b(textView, "dismiss_button");
        C7761y8.m20947b(textView2, "title_text");
        C7761y8.m20947b(starsRatingView, "stars_view");
        C7761y8.m20947b(button, "cta_button");
        C7761y8.m20947b(textView3, "replay_text");
        C7761y8.m20947b(frameLayout, "shadow");
        C7761y8.m20947b(y6Var, "pause_button");
        C7761y8.m20947b(y6Var2, "play_button");
        C7761y8.m20947b(y6Var3, "replay_button");
        C7761y8.m20947b(textView4, "domain_text");
        C7761y8.m20947b(d7Var, "media_view");
        C7761y8.m20947b(n6Var, "video_progress_wheel");
        C7761y8.m20947b(g6Var, "sound_button");
        C7761y8 y8Var = c;
        this.f18501F = y8Var.mo51902b(28);
        this.f18525u = y8Var.mo51902b(16);
        this.f18526v = y8Var.mo51902b(4);
        this.f18527w = C7622q5.m20203f(context);
        this.f18528x = C7622q5.m20202e(context);
        this.f18505a = new C7385c();
        mo50075i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19016a(View view) {
        C7543m4.C7544a aVar = this.f18496A;
        if (aVar != null) {
            aVar.mo50868a();
        }
    }

    /* renamed from: a */
    public void mo49825a() {
        this.f18514j.mo50009f();
    }

    /* renamed from: a */
    public void mo49826a(int i) {
        this.f18514j.mo49998a(i);
    }

    /* renamed from: a */
    public void mo49827a(C7399f2 f2Var) {
        this.f18514j.setOnClickListener((View.OnClickListener) null);
        this.f18517m.setVisibility(8);
        this.f18514j.mo50003b(f2Var);
        mo49603d();
        this.f18497B = 4;
        this.f18511g.setVisibility(8);
        this.f18519o.setVisibility(8);
        this.f18518n.setVisibility(8);
        this.f18513i.setVisibility(8);
        this.f18516l.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo50073a(C7596p1 p1Var) {
        this.f18524t.setImageBitmap(p1Var.mo51318c().getBitmap());
        this.f18524t.setOnClickListener(this.f18523s);
    }

    /* renamed from: a */
    public void mo49829a(boolean z) {
        this.f18514j.mo50005b(true);
    }

    /* renamed from: b */
    public void mo49830b() {
        int i = this.f18497B;
        if (i == 0 || i == 2) {
            mo50077k();
            this.f18514j.mo50008e();
        }
    }

    /* renamed from: b */
    public final void mo49831b(boolean z) {
        String str;
        C7422g6 g6Var = this.f18517m;
        if (z) {
            g6Var.mo50226a(this.f18528x, false);
            str = "sound_off";
        } else {
            g6Var.mo50226a(this.f18527w, false);
            str = "sound_on";
        }
        g6Var.setContentDescription(str);
    }

    /* renamed from: c */
    public void mo49833c(boolean z) {
        this.f18514j.mo50001a(z);
        mo50074e();
    }

    /* renamed from: c */
    public boolean mo49834c() {
        return this.f18514j.mo50007d();
    }

    /* renamed from: d */
    public void mo49603d() {
        this.f18509e.setText(this.f18502G);
        this.f18509e.setTextSize(2, 16.0f);
        this.f18509e.setVisibility(0);
        this.f18509e.setTextColor(-1);
        this.f18509e.setEnabled(true);
        TextView textView = this.f18509e;
        int i = this.f18525u;
        textView.setPadding(i, i, i, i);
        C7761y8.m20939a(this.f18509e, -2013265920, -1, -1, this.f18510f.mo51902b(1), this.f18510f.mo51902b(4));
        this.f18504I = true;
    }

    public void destroy() {
        this.f18514j.mo49997a();
    }

    /* renamed from: e */
    public void mo50074e() {
        this.f18497B = 0;
        this.f18511g.setVisibility(8);
        this.f18519o.setVisibility(8);
        this.f18518n.setVisibility(8);
        this.f18513i.setVisibility(8);
    }

    /* renamed from: f */
    public boolean mo49836f() {
        return this.f18514j.mo50006c();
    }

    /* renamed from: g */
    public void mo49837g() {
        this.f18514j.mo50013h();
        mo50078l();
    }

    public View getCloseButton() {
        return this.f18509e;
    }

    public C7364d7 getPromoMediaView() {
        return this.f18514j;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo49839h() {
        this.f18516l.setVisibility(8);
        mo50079m();
    }

    /* renamed from: i */
    public final void mo50075i() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i = this.f18525u;
        this.f18514j.setOnClickListener(this.f18522r);
        this.f18514j.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f18514j.mo50002b();
        this.f18513i.setBackgroundColor(-1728053248);
        this.f18513i.setVisibility(8);
        this.f18509e.setTextSize(2, 16.0f);
        this.f18509e.setTransformationMethod((TransformationMethod) null);
        this.f18509e.setEllipsize(TextUtils.TruncateAt.END);
        this.f18509e.setVisibility(8);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f18509e.setTextAlignment(4);
        }
        this.f18509e.setTextColor(-1);
        C7761y8.m20939a(this.f18509e, -2013265920, -1, -1, this.f18510f.mo51902b(1), this.f18510f.mo51902b(4));
        this.f18506b.setMaxLines(2);
        this.f18506b.setEllipsize(TextUtils.TruncateAt.END);
        this.f18506b.setTextSize(2, 18.0f);
        this.f18506b.setTextColor(-1);
        C7761y8.m20939a(this.f18508d, -2013265920, -1, -1, this.f18510f.mo51902b(1), this.f18510f.mo51902b(4));
        this.f18508d.setTextColor(-1);
        this.f18508d.setTransformationMethod((TransformationMethod) null);
        this.f18508d.setGravity(1);
        this.f18508d.setTextSize(2, 16.0f);
        this.f18508d.setMinimumWidth(this.f18510f.mo51902b(100));
        this.f18508d.setPadding(i, i, i, i);
        this.f18506b.setShadowLayer((float) this.f18510f.mo51902b(1), (float) this.f18510f.mo51902b(1), (float) this.f18510f.mo51902b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f18515k.setTextColor(-3355444);
        this.f18515k.setMaxEms(10);
        this.f18515k.setShadowLayer((float) this.f18510f.mo51902b(1), (float) this.f18510f.mo51902b(1), (float) this.f18510f.mo51902b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f18511g.setOnClickListener(this.f18523s);
        this.f18511g.setGravity(17);
        this.f18511g.setVisibility(8);
        this.f18511g.setPadding(this.f18510f.mo51902b(8), 0, this.f18510f.mo51902b(8), 0);
        this.f18512h.setSingleLine();
        this.f18512h.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.f18512h;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f18512h.setTextColor(-1);
        this.f18512h.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f18510f.mo51902b(4);
        this.f18520p.setPadding(this.f18510f.mo51902b(16), this.f18510f.mo51902b(16), this.f18510f.mo51902b(16), this.f18510f.mo51902b(16));
        this.f18518n.setOnClickListener(this.f18523s);
        this.f18518n.setVisibility(8);
        this.f18518n.setPadding(this.f18510f.mo51902b(16), this.f18510f.mo51902b(16), this.f18510f.mo51902b(16), this.f18510f.mo51902b(16));
        this.f18519o.setOnClickListener(this.f18523s);
        this.f18519o.setVisibility(8);
        this.f18519o.setPadding(this.f18510f.mo51902b(16), this.f18510f.mo51902b(16), this.f18510f.mo51902b(16), this.f18510f.mo51902b(16));
        Bitmap c = C7622q5.m20200c(getContext());
        if (c != null) {
            this.f18519o.setImageBitmap(c);
        }
        Bitmap b = C7622q5.m20199b(getContext());
        if (b != null) {
            this.f18518n.setImageBitmap(b);
        }
        C7761y8.m20939a(this.f18518n, -2013265920, -1, -1, this.f18510f.mo51902b(1), this.f18510f.mo51902b(4));
        C7761y8.m20939a(this.f18519o, -2013265920, -1, -1, this.f18510f.mo51902b(1), this.f18510f.mo51902b(4));
        C7761y8.m20939a(this.f18520p, -2013265920, -1, -1, this.f18510f.mo51902b(1), this.f18510f.mo51902b(4));
        this.f18507c.setStarSize(this.f18510f.mo51902b(12));
        this.f18516l.setVisibility(8);
        this.f18524t.setFixedHeight(this.f18501F);
        addView(this.f18514j);
        addView(this.f18513i);
        addView(this.f18517m);
        addView(this.f18509e);
        addView(this.f18516l);
        addView(this.f18511g);
        addView(this.f18518n);
        addView(this.f18519o);
        addView(this.f18507c);
        addView(this.f18515k);
        addView(this.f18508d);
        addView(this.f18506b);
        addView(this.f18524t);
        this.f18511g.addView(this.f18520p);
        this.f18511g.addView(this.f18512h, layoutParams);
    }

    /* renamed from: j */
    public final void mo50076j() {
        this.f18497B = 2;
        this.f18511g.setVisibility(8);
        this.f18519o.setVisibility(8);
        this.f18518n.setVisibility(0);
        this.f18513i.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo50077k() {
        this.f18497B = 1;
        this.f18511g.setVisibility(8);
        this.f18519o.setVisibility(0);
        this.f18518n.setVisibility(8);
        this.f18513i.setVisibility(0);
    }

    /* renamed from: l */
    public final void mo50078l() {
        this.f18511g.setVisibility(8);
        this.f18519o.setVisibility(8);
        if (this.f18497B != 2) {
            this.f18518n.setVisibility(8);
        }
    }

    /* renamed from: m */
    public final void mo50079m() {
        this.f18497B = 4;
        if (this.f18500E) {
            this.f18511g.setVisibility(0);
            this.f18513i.setVisibility(0);
        }
        this.f18519o.setVisibility(8);
        this.f18518n.setVisibility(8);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.f18514j.getMeasuredWidth();
        int measuredHeight = this.f18514j.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.f18514j.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.f18513i.layout(this.f18514j.getLeft(), this.f18514j.getTop(), this.f18514j.getRight(), this.f18514j.getBottom());
        int measuredWidth2 = this.f18519o.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.f18519o.getMeasuredHeight() >> 1;
        this.f18519o.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.f18518n.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.f18518n.getMeasuredHeight() >> 1;
        this.f18518n.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.f18511g.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f18511g.getMeasuredHeight() >> 1;
        this.f18511g.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        TextView textView = this.f18509e;
        int i14 = this.f18525u;
        textView.layout(i14, i14, textView.getMeasuredWidth() + i14, this.f18525u + this.f18509e.getMeasuredHeight());
        if (i5 > i6) {
            int max = Math.max(this.f18508d.getMeasuredHeight(), Math.max(this.f18506b.getMeasuredHeight(), this.f18507c.getMeasuredHeight()));
            Button button = this.f18508d;
            int measuredWidth5 = (i5 - this.f18525u) - button.getMeasuredWidth();
            int measuredHeight5 = ((i6 - this.f18525u) - this.f18508d.getMeasuredHeight()) - ((max - this.f18508d.getMeasuredHeight()) >> 1);
            int i15 = this.f18525u;
            button.layout(measuredWidth5, measuredHeight5, i5 - i15, (i6 - i15) - ((max - this.f18508d.getMeasuredHeight()) >> 1));
            this.f18517m.layout((this.f18508d.getRight() - this.f18517m.getMeasuredWidth()) + this.f18517m.getPadding(), (((this.f18514j.getBottom() - (this.f18525u << 1)) - this.f18517m.getMeasuredHeight()) - max) + this.f18517m.getPadding(), this.f18508d.getRight() + this.f18517m.getPadding(), ((this.f18514j.getBottom() - (this.f18525u << 1)) - max) + this.f18517m.getPadding());
            this.f18524t.layout(this.f18508d.getRight() - this.f18524t.getMeasuredWidth(), this.f18525u, this.f18508d.getRight(), this.f18525u + this.f18524t.getMeasuredHeight());
            StarsRatingView starsRatingView = this.f18507c;
            int left = (this.f18508d.getLeft() - this.f18525u) - this.f18507c.getMeasuredWidth();
            int measuredHeight6 = ((i6 - this.f18525u) - this.f18507c.getMeasuredHeight()) - ((max - this.f18507c.getMeasuredHeight()) >> 1);
            int left2 = this.f18508d.getLeft();
            int i16 = this.f18525u;
            starsRatingView.layout(left, measuredHeight6, left2 - i16, (i6 - i16) - ((max - this.f18507c.getMeasuredHeight()) >> 1));
            TextView textView2 = this.f18515k;
            int left3 = (this.f18508d.getLeft() - this.f18525u) - this.f18515k.getMeasuredWidth();
            int measuredHeight7 = ((i6 - this.f18525u) - this.f18515k.getMeasuredHeight()) - ((max - this.f18515k.getMeasuredHeight()) >> 1);
            int left4 = this.f18508d.getLeft();
            int i17 = this.f18525u;
            textView2.layout(left3, measuredHeight7, left4 - i17, (i6 - i17) - ((max - this.f18515k.getMeasuredHeight()) >> 1));
            int min = Math.min(this.f18507c.getLeft(), this.f18515k.getLeft());
            TextView textView3 = this.f18506b;
            int measuredWidth6 = (min - this.f18525u) - textView3.getMeasuredWidth();
            int measuredHeight8 = ((i6 - this.f18525u) - this.f18506b.getMeasuredHeight()) - ((max - this.f18506b.getMeasuredHeight()) >> 1);
            int i18 = this.f18525u;
            textView3.layout(measuredWidth6, measuredHeight8, min - i18, (i6 - i18) - ((max - this.f18506b.getMeasuredHeight()) >> 1));
            C7564n6 n6Var = this.f18516l;
            int i19 = this.f18525u;
            n6Var.layout(i19, ((i6 - i19) - n6Var.getMeasuredHeight()) - ((max - this.f18516l.getMeasuredHeight()) >> 1), this.f18525u + this.f18516l.getMeasuredWidth(), (i6 - this.f18525u) - ((max - this.f18516l.getMeasuredHeight()) >> 1));
            return;
        }
        this.f18517m.layout(((this.f18514j.getRight() - this.f18525u) - this.f18517m.getMeasuredWidth()) + this.f18517m.getPadding(), ((this.f18514j.getBottom() - this.f18525u) - this.f18517m.getMeasuredHeight()) + this.f18517m.getPadding(), (this.f18514j.getRight() - this.f18525u) + this.f18517m.getPadding(), (this.f18514j.getBottom() - this.f18525u) + this.f18517m.getPadding());
        this.f18524t.layout((this.f18514j.getRight() - this.f18525u) - this.f18524t.getMeasuredWidth(), this.f18514j.getTop() + this.f18525u, this.f18514j.getRight() - this.f18525u, this.f18514j.getTop() + this.f18525u + this.f18524t.getMeasuredHeight());
        int i20 = this.f18525u;
        int measuredHeight9 = this.f18506b.getMeasuredHeight() + this.f18507c.getMeasuredHeight() + this.f18515k.getMeasuredHeight() + this.f18508d.getMeasuredHeight();
        int bottom = getBottom() - this.f18514j.getBottom();
        if ((i20 * 3) + measuredHeight9 > bottom) {
            i20 = (bottom - measuredHeight9) / 3;
        }
        TextView textView4 = this.f18506b;
        int i21 = i5 >> 1;
        textView4.layout(i21 - (textView4.getMeasuredWidth() >> 1), this.f18514j.getBottom() + i20, (this.f18506b.getMeasuredWidth() >> 1) + i21, this.f18514j.getBottom() + i20 + this.f18506b.getMeasuredHeight());
        StarsRatingView starsRatingView2 = this.f18507c;
        starsRatingView2.layout(i21 - (starsRatingView2.getMeasuredWidth() >> 1), this.f18506b.getBottom() + i20, (this.f18507c.getMeasuredWidth() >> 1) + i21, this.f18506b.getBottom() + i20 + this.f18507c.getMeasuredHeight());
        TextView textView5 = this.f18515k;
        textView5.layout(i21 - (textView5.getMeasuredWidth() >> 1), this.f18506b.getBottom() + i20, (this.f18515k.getMeasuredWidth() >> 1) + i21, this.f18506b.getBottom() + i20 + this.f18515k.getMeasuredHeight());
        Button button2 = this.f18508d;
        button2.layout(i21 - (button2.getMeasuredWidth() >> 1), this.f18507c.getBottom() + i20, i21 + (this.f18508d.getMeasuredWidth() >> 1), this.f18507c.getBottom() + i20 + this.f18508d.getMeasuredHeight());
        this.f18516l.layout(this.f18525u, (this.f18514j.getBottom() - this.f18525u) - this.f18516l.getMeasuredHeight(), this.f18525u + this.f18516l.getMeasuredWidth(), this.f18514j.getBottom() - this.f18525u);
    }

    public void onMeasure(int i, int i2) {
        this.f18517m.measure(View.MeasureSpec.makeMeasureSpec(this.f18501F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18501F, 1073741824));
        this.f18516l.measure(View.MeasureSpec.makeMeasureSpec(this.f18501F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18501F, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f18514j.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.f18525u << 1;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.f18509e.measure(View.MeasureSpec.makeMeasureSpec(i4 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18524t.measure(View.MeasureSpec.makeMeasureSpec(this.f18501F, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f18501F, Integer.MIN_VALUE));
        this.f18518n.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18519o.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18511g.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18507c.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18513i.measure(View.MeasureSpec.makeMeasureSpec(this.f18514j.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18514j.getMeasuredHeight(), 1073741824));
        this.f18508d.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18506b.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18515k.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.f18508d.getMeasuredWidth();
            int measuredWidth2 = this.f18506b.getMeasuredWidth();
            if (this.f18516l.getMeasuredWidth() + measuredWidth2 + Math.max(this.f18507c.getMeasuredWidth(), this.f18515k.getMeasuredWidth()) + measuredWidth + (this.f18525u * 3) > i4) {
                int measuredWidth3 = (i4 - this.f18516l.getMeasuredWidth()) - (this.f18525u * 3);
                int i6 = measuredWidth3 / 3;
                this.f18508d.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f18507c.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f18515k.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f18506b.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.f18508d.getMeasuredWidth()) - this.f18515k.getMeasuredWidth()) - this.f18507c.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        } else {
            int measuredHeight = this.f18506b.getMeasuredHeight() + this.f18507c.getMeasuredHeight() + this.f18515k.getMeasuredHeight() + this.f18508d.getMeasuredHeight();
            int measuredHeight2 = (size2 - this.f18514j.getMeasuredHeight()) / 2;
            int i7 = this.f18525u;
            if (measuredHeight + (i7 * 3) > measuredHeight2) {
                int i8 = i7 / 2;
                this.f18508d.setPadding(i7, i8, i7, i8);
                this.f18508d.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setBanner(C7399f2 f2Var) {
        String str;
        this.f18514j.mo50004b(f2Var, 1);
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            this.f18516l.setMax(f2Var.getDuration());
            this.f18500E = videoBanner.isAllowReplay();
            this.f18499D = f2Var.isAllowClose();
            this.f18508d.setText(f2Var.getCtaText());
            this.f18506b.setText(f2Var.getTitle());
            if ("store".equals(f2Var.getNavigationType())) {
                if (f2Var.getRating() > 0.0f) {
                    this.f18507c.setVisibility(0);
                    this.f18507c.setRating(f2Var.getRating());
                } else {
                    this.f18507c.setVisibility(8);
                }
                this.f18515k.setVisibility(8);
            } else {
                this.f18507c.setVisibility(8);
                this.f18515k.setVisibility(0);
                this.f18515k.setText(f2Var.getDomain());
            }
            this.f18502G = videoBanner.getCloseActionText();
            this.f18503H = videoBanner.getCloseDelayActionText();
            this.f18509e.setText(this.f18502G);
            if (videoBanner.isAllowClose() && videoBanner.isAutoPlay()) {
                if (videoBanner.getAllowCloseDelay() > 0.0f) {
                    this.f18498C = videoBanner.getAllowCloseDelay();
                    this.f18509e.setEnabled(false);
                    this.f18509e.setTextColor(-3355444);
                    TextView textView = this.f18509e;
                    int i = this.f18526v;
                    textView.setPadding(i, i, i, i);
                    C7761y8.m20939a(this.f18509e, -2013265920, -2013265920, -3355444, this.f18510f.mo51902b(1), this.f18510f.mo51902b(4));
                    this.f18509e.setTextSize(2, 12.0f);
                } else {
                    TextView textView2 = this.f18509e;
                    int i2 = this.f18525u;
                    textView2.setPadding(i2, i2, i2, i2);
                    this.f18509e.setVisibility(0);
                }
            }
            this.f18512h.setText(videoBanner.getReplayActionText());
            Bitmap d = C7622q5.m20201d(getContext());
            if (d != null) {
                this.f18520p.setImageBitmap(d);
            }
            if (videoBanner.isAutoPlay()) {
                mo49833c(true);
                mo50074e();
            } else {
                mo50077k();
            }
            this.f18529y = videoBanner.getDuration();
            C7422g6 g6Var = this.f18517m;
            g6Var.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C7382e7.this.m19016a(view);
                }
            });
            if (videoBanner.isAutoMute()) {
                g6Var.mo50226a(this.f18528x, false);
                str = "sound_off";
            } else {
                g6Var.mo50226a(this.f18527w, false);
                str = "sound_on";
            }
            g6Var.setContentDescription(str);
            C7596p1 adChoices = f2Var.getAdChoices();
            if (adChoices != null) {
                mo50073a(adChoices);
            } else {
                this.f18524t.setVisibility(8);
            }
        }
    }

    public void setClickArea(C7631r1 r1Var) {
        TextView textView;
        C7374e0.m18989a("Apply click area " + r1Var.mo51444a() + " to view");
        if (r1Var.f19290o) {
            setOnClickListener(this.f18505a);
        }
        C7385c cVar = null;
        if (r1Var.f19284i || r1Var.f19290o) {
            this.f18508d.setOnClickListener(this.f18505a);
        } else {
            this.f18508d.setOnClickListener((View.OnClickListener) null);
            this.f18508d.setEnabled(false);
        }
        if (r1Var.f19278c || r1Var.f19290o) {
            this.f18506b.setOnClickListener(this.f18505a);
        } else {
            this.f18506b.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19282g || r1Var.f19290o) {
            this.f18507c.setOnClickListener(this.f18505a);
        } else {
            this.f18507c.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19287l || r1Var.f19290o) {
            textView = this.f18515k;
            cVar = this.f18505a;
        } else {
            textView = this.f18515k;
        }
        textView.setOnClickListener(cVar);
        if (r1Var.f19289n || r1Var.f19290o) {
            setOnClickListener(this.f18505a);
        }
    }

    public void setInterstitialPromoViewListener(C7308a7.C7309a aVar) {
        this.f18530z = aVar;
    }

    public void setMediaListener(C7543m4.C7544a aVar) {
        this.f18496A = aVar;
        this.f18514j.setInterstitialPromoViewListener(aVar);
    }

    public void setTimeChanged(float f) {
        if (!this.f18504I && this.f18499D) {
            float f2 = this.f18498C;
            if (f2 > 0.0f && f2 >= f) {
                if (this.f18509e.getVisibility() != 0) {
                    this.f18509e.setVisibility(0);
                }
                if (this.f18503H != null) {
                    int ceil = (int) Math.ceil((double) (this.f18498C - f));
                    String valueOf = String.valueOf(ceil);
                    if (this.f18498C > 9.0f && ceil <= 9) {
                        valueOf = AppEventsConstants.EVENT_PARAM_VALUE_NO + valueOf;
                    }
                    this.f18509e.setText(this.f18503H.replace("%d", valueOf));
                }
            }
        }
        if (this.f18516l.getVisibility() != 0) {
            this.f18516l.setVisibility(0);
        }
        this.f18516l.setProgress(f / this.f18529y);
        this.f18516l.setDigit((int) Math.ceil((double) (this.f18529y - f)));
    }
}
