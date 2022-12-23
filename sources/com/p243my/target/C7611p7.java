package com.p243my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.p243my.target.C7589o7;

/* renamed from: com.my.target.p7 */
public class C7611p7 extends ViewGroup implements C7589o7, View.OnClickListener {

    /* renamed from: a */
    public final C7506k6 f19196a;

    /* renamed from: b */
    public final C7485j6 f19197b;

    /* renamed from: c */
    public final TextView f19198c;

    /* renamed from: d */
    public final TextView f19199d;

    /* renamed from: e */
    public final TextView f19200e;

    /* renamed from: f */
    public final TextView f19201f;

    /* renamed from: g */
    public final TextView f19202g;

    /* renamed from: h */
    public final Button f19203h;

    /* renamed from: i */
    public final C7589o7.C7590a f19204i;

    /* renamed from: j */
    public final int f19205j;

    /* renamed from: k */
    public final int f19206k;

    /* renamed from: l */
    public final int f19207l;

    /* renamed from: m */
    public final int f19208m;

    /* renamed from: n */
    public final int f19209n;

    /* renamed from: o */
    public final int f19210o;

    /* renamed from: p */
    public final int f19211p;

    /* renamed from: q */
    public final C7740x7 f19212q;

    /* renamed from: r */
    public final int f19213r;

    /* renamed from: s */
    public final int f19214s;

    /* renamed from: t */
    public final int f19215t;

    /* renamed from: u */
    public C7613b f19216u = C7613b.PORTRAIT;

    /* renamed from: v */
    public boolean f19217v;

    /* renamed from: com.my.target.p7$a */
    public static /* synthetic */ class C7612a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19218a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.my.target.p7$b[] r0 = com.p243my.target.C7611p7.C7613b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19218a = r0
                com.my.target.p7$b r1 = com.p243my.target.C7611p7.C7613b.SQUARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19218a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.my.target.p7$b r1 = com.p243my.target.C7611p7.C7613b.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19218a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.my.target.p7$b r1 = com.p243my.target.C7611p7.C7613b.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7611p7.C7612a.<clinit>():void");
        }
    }

    /* renamed from: com.my.target.p7$b */
    public enum C7613b {
        PORTRAIT,
        LANDSCAPE,
        SQUARE
    }

    public C7611p7(C7740x7 x7Var, Context context, C7589o7.C7590a aVar) {
        super(context);
        this.f19204i = aVar;
        this.f19212q = x7Var;
        this.f19205j = x7Var.mo51837a(C7740x7.f19601C);
        this.f19206k = x7Var.mo51837a(C7740x7.f19602D);
        this.f19215t = x7Var.mo51837a(C7740x7.f19603E);
        this.f19207l = x7Var.mo51837a(C7740x7.f19604F);
        this.f19208m = x7Var.mo51837a(C7740x7.f19633l);
        this.f19209n = x7Var.mo51837a(C7740x7.f19632k);
        int a = x7Var.mo51837a(C7740x7.f19609K);
        this.f19213r = a;
        int a2 = x7Var.mo51837a(C7740x7.f19616R);
        this.f19210o = a2;
        this.f19211p = x7Var.mo51837a(C7740x7.f19615Q);
        this.f19214s = C7761y8.m20931a(a, context);
        C7506k6 k6Var = new C7506k6(context);
        this.f19196a = k6Var;
        C7485j6 j6Var = new C7485j6(context);
        this.f19197b = j6Var;
        TextView textView = new TextView(context);
        this.f19198c = textView;
        textView.setMaxLines(1);
        textView.setTextSize(1, (float) x7Var.mo51837a(C7740x7.f19605G));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.f19199d = textView2;
        textView2.setTextSize(1, (float) x7Var.mo51837a(C7740x7.f19607I));
        textView2.setMaxLines(x7Var.mo51837a(C7740x7.f19608J));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setIncludeFontPadding(false);
        TextView textView3 = new TextView(context);
        this.f19200e = textView3;
        float f = (float) a;
        textView3.setTextSize(1, f);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setLines(1);
        textView3.setIncludeFontPadding(false);
        TextView textView4 = new TextView(context);
        this.f19201f = textView4;
        textView4.setTextSize(1, f);
        textView4.setIncludeFontPadding(false);
        Button button = new Button(context);
        this.f19203h = button;
        button.setLines(1);
        button.setTextSize(1, (float) x7Var.mo51837a(C7740x7.f19641t));
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setMinimumWidth(a2);
        button.setIncludeFontPadding(false);
        int a3 = x7Var.mo51837a(C7740x7.f19642u);
        int i = a3 * 2;
        button.setPadding(i, a3, i, a3);
        TextView textView5 = new TextView(context);
        this.f19202g = textView5;
        textView5.setPadding(x7Var.mo51837a(C7740x7.f19643v), 0, 0, 0);
        textView5.setTextColor(-1);
        textView5.setMaxLines(x7Var.mo51837a(C7740x7.f19646y));
        textView5.setIncludeFontPadding(false);
        textView5.setTextSize(1, (float) x7Var.mo51837a(C7740x7.f19647z));
        C7761y8.m20940a((View) k6Var, "panel_icon");
        C7761y8.m20940a((View) textView, "panel_title");
        C7761y8.m20940a((View) textView2, "panel_description");
        C7761y8.m20940a((View) textView3, "panel_domain");
        C7761y8.m20940a((View) textView4, "panel_rating");
        C7761y8.m20940a((View) button, "panel_cta");
        C7761y8.m20940a((View) textView5, "age_bordering");
        addView(k6Var);
        addView(j6Var);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
        addView(button);
        addView(textView5);
    }

    private void setClickArea(C7631r1 r1Var) {
        if (r1Var.f19290o) {
            setOnClickListener(this);
            this.f19203h.setOnClickListener(this);
            return;
        }
        if (r1Var.f19284i) {
            this.f19203h.setOnClickListener(this);
        } else {
            this.f19203h.setEnabled(false);
        }
        if (r1Var.f19289n) {
            setOnClickListener(this);
        } else {
            setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19278c) {
            this.f19198c.setOnClickListener(this);
        } else {
            this.f19198c.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19280e) {
            this.f19196a.setOnClickListener(this);
        } else {
            this.f19196a.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19279d) {
            this.f19199d.setOnClickListener(this);
        } else {
            this.f19199d.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19282g) {
            this.f19201f.setOnClickListener(this);
            this.f19197b.setOnClickListener(this);
        } else {
            this.f19201f.setOnClickListener((View.OnClickListener) null);
            this.f19197b.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19287l) {
            this.f19200e.setOnClickListener(this);
        } else {
            this.f19200e.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19285j) {
            this.f19202g.setOnClickListener(this);
        } else {
            this.f19202g.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    public View mo51305a() {
        return this;
    }

    /* renamed from: a */
    public final void mo51347a(int i, int i2) {
        this.f19198c.setGravity(1);
        this.f19199d.setGravity(1);
        this.f19199d.setVisibility(0);
        this.f19203h.setVisibility(0);
        this.f19202g.setVisibility(8);
        this.f19198c.setTypeface(Typeface.defaultFromStyle(0));
        this.f19198c.setTextSize(1, (float) this.f19212q.mo51837a(C7740x7.f19606H));
        this.f19203h.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f19211p, 1073741824));
        C7761y8.m20937a(this.f19198c, i2, i2, Integer.MIN_VALUE);
        C7761y8.m20937a(this.f19199d, i2, i2, Integer.MIN_VALUE);
        setMeasuredDimension(i, i);
    }

    /* renamed from: a */
    public final void mo51348a(int i, int i2, int i3) {
        C7506k6 k6Var = this.f19196a;
        int i4 = this.f19206k;
        C7761y8.m20951c(k6Var, i4, i4);
        int right = this.f19196a.getRight() + (this.f19206k / 2);
        int a = C7761y8.m20933a(this.f19201f.getMeasuredHeight(), i3, i2);
        int a2 = C7761y8.m20933a(i + this.f19206k, this.f19196a.getTop());
        if (this.f19196a.getMeasuredHeight() > 0) {
            a2 += (((this.f19196a.getMeasuredHeight() - this.f19198c.getMeasuredHeight()) - this.f19207l) - a) / 2;
        }
        TextView textView = this.f19198c;
        textView.layout(right, a2, textView.getMeasuredWidth() + right, this.f19198c.getMeasuredHeight() + a2);
        C7761y8.m20935a(this.f19198c.getBottom() + this.f19207l, right, this.f19198c.getBottom() + this.f19207l + a, this.f19206k / 4, this.f19197b, this.f19201f, this.f19200e);
        C7761y8.m20954e(this.f19202g, this.f19198c.getBottom(), this.f19198c.getRight() + this.f19207l);
    }

    /* renamed from: a */
    public final void mo51349a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int measuredHeight = this.f19196a.getMeasuredHeight();
        if (measuredHeight > 0) {
            i6 = measuredHeight + 0;
            i5 = 1;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int measuredHeight2 = this.f19198c.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            i5++;
            i6 += measuredHeight2;
        }
        int measuredHeight3 = this.f19199d.getMeasuredHeight();
        if (measuredHeight3 > 0) {
            i5++;
            i6 += measuredHeight3;
        }
        int max = Math.max(this.f19197b.getMeasuredHeight(), this.f19200e.getMeasuredHeight());
        if (max > 0) {
            i5++;
            i6 += max;
        }
        int measuredHeight4 = this.f19203h.getMeasuredHeight();
        if (measuredHeight4 > 0) {
            i5++;
            i6 += measuredHeight4;
        }
        int i7 = (i4 - i2) - i6;
        int a = C7761y8.m20930a(this.f19207l, this.f19206k, i7 / i5);
        int i8 = (i7 - (i5 * a)) / 2;
        int i9 = i3 - i;
        C7761y8.m20938a((View) this.f19196a, 0, i8, i9, measuredHeight + i8);
        int a2 = C7761y8.m20933a(i8, this.f19196a.getBottom() + a);
        C7761y8.m20938a((View) this.f19198c, 0, a2, i9, measuredHeight2 + a2);
        int a3 = C7761y8.m20933a(a2, this.f19198c.getBottom() + a);
        C7761y8.m20938a((View) this.f19199d, 0, a3, i9, measuredHeight3 + a3);
        int a4 = C7761y8.m20933a(a3, this.f19199d.getBottom() + a);
        int measuredWidth = ((i9 - this.f19201f.getMeasuredWidth()) - this.f19197b.getMeasuredWidth()) - this.f19200e.getMeasuredWidth();
        int i10 = this.f19207l;
        C7761y8.m20935a(a4, (measuredWidth - (i10 * 2)) / 2, max + a4, i10, this.f19197b, this.f19201f, this.f19200e);
        int a5 = C7761y8.m20933a(a4, this.f19200e.getBottom(), this.f19197b.getBottom()) + a;
        C7761y8.m20938a((View) this.f19203h, 0, a5, i9, measuredHeight4 + a5);
    }

    /* renamed from: a */
    public final void mo51350a(int i, int i2, int i3, int i4, int i5, int i6) {
        C7506k6 k6Var = this.f19196a;
        int i7 = i4 - i2;
        int i8 = this.f19215t;
        C7761y8.m20954e(k6Var, i7 - i8, i8);
        Button button = this.f19203h;
        int i9 = this.f19215t;
        C7761y8.m20952d(button, i7 - i9, (i3 - i) - i9);
        int right = this.f19196a.getRight() + this.f19206k;
        int a = C7761y8.m20933a(this.f19201f.getMeasuredHeight(), i6, i5);
        int a2 = C7761y8.m20933a(this.f19196a.getTop(), this.f19207l) + ((((this.f19196a.getMeasuredHeight() - this.f19198c.getMeasuredHeight()) - this.f19207l) - a) / 2);
        TextView textView = this.f19198c;
        textView.layout(right, a2, textView.getMeasuredWidth() + right, this.f19198c.getMeasuredHeight() + a2);
        C7761y8.m20935a(this.f19198c.getBottom() + this.f19207l, right, this.f19198c.getBottom() + this.f19207l + a, this.f19206k / 4, this.f19197b, this.f19201f, this.f19200e);
        C7761y8.m20954e(this.f19202g, this.f19198c.getBottom(), this.f19198c.getRight() + (this.f19206k / 2));
    }

    /* renamed from: b */
    public final void mo51351b(int i, int i2, int i3) {
        this.f19198c.setGravity(GravityCompat.START);
        this.f19199d.setVisibility(8);
        this.f19203h.setVisibility(0);
        this.f19198c.setTextSize((float) this.f19212q.mo51837a(C7740x7.f19606H));
        this.f19202g.setVisibility(0);
        TextView textView = this.f19198c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f19198c.setTextSize(1, (float) this.f19212q.mo51837a(C7740x7.f19605G));
        this.f19203h.measure(View.MeasureSpec.makeMeasureSpec(i2 / 3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f19211p, 1073741824));
        C7761y8.m20937a(this.f19202g, i2, i3, Integer.MIN_VALUE);
        int measuredWidth = i2 - ((((this.f19196a.getMeasuredWidth() + this.f19203h.getMeasuredWidth()) + (this.f19206k * 2)) + this.f19202g.getMeasuredWidth()) + this.f19207l);
        C7761y8.m20937a(this.f19198c, measuredWidth, i3, Integer.MIN_VALUE);
        C7761y8.m20937a(this.f19200e, measuredWidth, i3, Integer.MIN_VALUE);
        int measuredHeight = this.f19203h.getMeasuredHeight() + (this.f19215t * 2);
        if (this.f19217v) {
            measuredHeight += this.f19209n;
        }
        setMeasuredDimension(i, measuredHeight);
    }

    /* renamed from: c */
    public final void mo51352c(int i, int i2, int i3) {
        this.f19198c.setGravity(GravityCompat.START);
        this.f19199d.setVisibility(8);
        this.f19203h.setVisibility(8);
        this.f19202g.setVisibility(0);
        TextView textView = this.f19198c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f19198c.setTextSize(1, (float) this.f19212q.mo51837a(C7740x7.f19605G));
        C7761y8.m20937a(this.f19202g, i2, i3, Integer.MIN_VALUE);
        C7761y8.m20937a(this.f19198c, ((i2 - this.f19196a.getMeasuredWidth()) - (this.f19206k * 2)) - this.f19202g.getMeasuredWidth(), this.f19196a.getMeasuredHeight() - (this.f19207l * 2), Integer.MIN_VALUE);
        setMeasuredDimension(i, C7761y8.m20933a(this.f19196a.getMeasuredHeight() + (this.f19206k * 2), this.f19198c.getMeasuredHeight() + C7761y8.m20933a(this.f19213r, this.f19200e.getMeasuredHeight()) + this.f19206k));
    }

    public void onClick(View view) {
        this.f19204i.mo51307a((C7768z1) null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = this.f19200e.getMeasuredHeight();
        int measuredHeight2 = this.f19197b.getMeasuredHeight();
        int i5 = C7612a.f19218a[this.f19216u.ordinal()];
        if (i5 == 1) {
            mo51349a(i, i2, i3, i4);
        } else if (i5 != 3) {
            mo51348a(i2, measuredHeight, measuredHeight2);
        } else {
            mo51350a(i, i2, i3, i4, measuredHeight, measuredHeight2);
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f19206k * 2;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.f19216u = i4 == i5 ? C7613b.SQUARE : i4 > i5 ? C7613b.LANDSCAPE : C7613b.PORTRAIT;
        C7506k6 k6Var = this.f19196a;
        int i6 = this.f19205j;
        C7761y8.m20937a(k6Var, i6, i6, 1073741824);
        if (this.f19201f.getVisibility() != 8) {
            C7761y8.m20937a(this.f19201f, (i4 - this.f19196a.getMeasuredWidth()) - this.f19207l, i5, Integer.MIN_VALUE);
            C7485j6 j6Var = this.f19197b;
            int i7 = this.f19214s;
            C7761y8.m20937a(j6Var, i7, i7, 1073741824);
        }
        if (this.f19200e.getVisibility() != 8) {
            C7761y8.m20937a(this.f19200e, (i4 - this.f19196a.getMeasuredWidth()) - (this.f19206k * 2), i5, Integer.MIN_VALUE);
        }
        C7613b bVar = this.f19216u;
        if (bVar == C7613b.SQUARE) {
            int i8 = this.f19215t * 2;
            mo51347a(size - i8, i4 - i8);
        } else if (bVar == C7613b.LANDSCAPE) {
            mo51351b(size, i4, i5);
        } else {
            mo51352c(size, i4, i5);
        }
    }

    public void setBanner(C7399f2 f2Var) {
        C7698v1 promoStyleSettings = f2Var.getPromoStyleSettings();
        int j = promoStyleSettings.mo51724j();
        this.f19198c.setTextColor(promoStyleSettings.mo51725k());
        this.f19199d.setTextColor(j);
        this.f19200e.setTextColor(j);
        this.f19201f.setTextColor(j);
        this.f19197b.setColor(j);
        this.f19217v = f2Var.getVideoBanner() != null;
        this.f19196a.setImageData(f2Var.getIcon());
        this.f19198c.setText(f2Var.getTitle());
        this.f19199d.setText(f2Var.getDescription());
        if (f2Var.getNavigationType().equals("store")) {
            this.f19200e.setVisibility(8);
            if (f2Var.getRating() > 0.0f) {
                this.f19201f.setVisibility(0);
                String valueOf = String.valueOf(f2Var.getRating());
                if (valueOf.length() > 3) {
                    valueOf = valueOf.substring(0, 3);
                }
                this.f19201f.setText(valueOf);
            } else {
                this.f19201f.setVisibility(8);
            }
        } else {
            this.f19201f.setVisibility(8);
            this.f19200e.setVisibility(0);
            this.f19200e.setText(f2Var.getDomain());
            this.f19200e.setTextColor(promoStyleSettings.mo51718g());
        }
        this.f19203h.setText(f2Var.getCtaText());
        C7761y8.m20946b(this.f19203h, promoStyleSettings.mo51712d(), promoStyleSettings.mo51716f(), this.f19208m);
        this.f19203h.setTextColor(promoStyleSettings.mo51724j());
        setClickArea(f2Var.getClickArea());
        this.f19202g.setText(f2Var.getAgeRestrictions());
    }
}
