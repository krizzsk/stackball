package com.p243my.target;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.p243my.target.nativeads.views.MediaAdView;

/* renamed from: com.my.target.f7 */
public class C7405f7 extends RelativeLayout {

    /* renamed from: a */
    public static final int f18594a = C7761y8.m20948c();

    /* renamed from: b */
    public static final int f18595b = C7761y8.m20948c();

    /* renamed from: c */
    public final C7723w6 f18596c;

    /* renamed from: d */
    public final Button f18597d;

    /* renamed from: e */
    public final C7331b6 f18598e;

    /* renamed from: f */
    public final C7737x6 f18599f;

    /* renamed from: g */
    public final C7761y8 f18600g;

    /* renamed from: h */
    public final boolean f18601h;

    public C7405f7(Context context, C7761y8 y8Var, boolean z) {
        super(context);
        this.f18600g = y8Var;
        this.f18601h = z;
        C7737x6 x6Var = new C7737x6(context, y8Var, z);
        this.f18599f = x6Var;
        C7761y8.m20947b(x6Var, "footer_layout");
        C7723w6 w6Var = new C7723w6(context, y8Var, z);
        this.f18596c = w6Var;
        C7761y8.m20947b(w6Var, "body_layout");
        Button button = new Button(context);
        this.f18597d = button;
        C7761y8.m20947b(button, "cta_button");
        C7331b6 b6Var = new C7331b6(context);
        this.f18598e = b6Var;
        C7761y8.m20947b(b6Var, "age_bordering");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m19142a(C7631r1 r1Var, View.OnClickListener onClickListener, View view, MotionEvent motionEvent) {
        if (!r1Var.f19285j) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18596c.setBackgroundColor(-3806472);
        } else if (action == 1) {
            this.f18596c.setBackgroundColor(-1);
            onClickListener.onClick(view);
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    /* renamed from: a */
    public void mo50156a(int i, int i2, boolean z) {
        float f;
        Button button;
        boolean z2 = z;
        int max = Math.max(i2, i) / 8;
        this.f18596c.mo51801a(z2);
        this.f18599f.mo51834a();
        View view = new View(getContext());
        view.setBackgroundColor(-5592406);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
        C7737x6 x6Var = this.f18599f;
        int i3 = f18594a;
        x6Var.setId(i3);
        this.f18599f.mo51835a(max, z2);
        this.f18597d.setPadding(this.f18600g.mo51902b(15), 0, this.f18600g.mo51902b(15), 0);
        this.f18597d.setMinimumWidth(this.f18600g.mo51902b(100));
        this.f18597d.setTransformationMethod((TransformationMethod) null);
        this.f18597d.setSingleLine();
        this.f18597d.setEllipsize(TextUtils.TruncateAt.END);
        this.f18598e.mo49746a(1, -7829368);
        this.f18598e.setPadding(this.f18600g.mo51902b(2), 0, 0, 0);
        this.f18598e.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        this.f18598e.setMaxEms(5);
        this.f18598e.mo49747a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f18600g.mo51902b(3));
        this.f18598e.setBackgroundColor(1711276032);
        C7723w6 w6Var = this.f18596c;
        int i4 = f18595b;
        w6Var.setId(i4);
        if (z2) {
            this.f18596c.setPadding(this.f18600g.mo51902b(4), this.f18600g.mo51902b(4), this.f18600g.mo51902b(4), this.f18600g.mo51902b(4));
        } else {
            this.f18596c.setPadding(this.f18600g.mo51902b(16), this.f18600g.mo51902b(16), this.f18600g.mo51902b(16), this.f18600g.mo51902b(16));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, i3);
        this.f18596c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        C7761y8 y8Var = this.f18600g;
        layoutParams2.setMargins(this.f18600g.mo51902b(16), z2 ? y8Var.mo51902b(8) : y8Var.mo51902b(16), this.f18600g.mo51902b(16), this.f18600g.mo51902b(4));
        layoutParams2.addRule(Build.VERSION.SDK_INT >= 17 ? 21 : 11, -1);
        this.f18598e.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, this.f18601h ? this.f18600g.mo51902b(64) : this.f18600g.mo51902b(52));
        layoutParams3.addRule(14, -1);
        layoutParams3.addRule(8, i4);
        int i5 = -this.f18600g.mo51902b(52);
        layoutParams3.bottomMargin = z2 ? (int) (((double) i5) / 1.5d) : i5 / 2;
        this.f18597d.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, max);
        layoutParams4.addRule(12, -1);
        this.f18599f.setLayoutParams(layoutParams4);
        addView(this.f18596c);
        addView(view);
        addView(this.f18598e);
        addView(this.f18599f);
        addView(this.f18597d);
        setClickable(true);
        if (this.f18601h) {
            button = this.f18597d;
            f = 32.0f;
        } else {
            button = this.f18597d;
            f = 22.0f;
        }
        button.setTextSize(2, f);
    }

    /* renamed from: a */
    public void mo50157a(C7631r1 r1Var, View.OnClickListener onClickListener) {
        boolean z;
        Button button;
        this.f18596c.mo51800a(r1Var, onClickListener);
        if (r1Var.f19290o) {
            this.f18597d.setOnClickListener(onClickListener);
            return;
        }
        if (r1Var.f19284i) {
            this.f18597d.setOnClickListener(onClickListener);
            button = this.f18597d;
            z = true;
        } else {
            this.f18597d.setOnClickListener((View.OnClickListener) null);
            button = this.f18597d;
            z = false;
        }
        button.setEnabled(z);
        this.f18598e.setOnTouchListener(new View.OnTouchListener(r1Var, onClickListener) {
            public final /* synthetic */ C7631r1 f$1;
            public final /* synthetic */ View.OnClickListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C7405f7.this.m19142a(this.f$1, this.f$2, view, motionEvent);
            }
        });
    }

    public void setBanner(C7399f2 f2Var) {
        this.f18596c.setBanner(f2Var);
        this.f18597d.setText(f2Var.getCtaText());
        this.f18599f.setBackgroundColor(-39322);
        if (TextUtils.isEmpty(f2Var.getAgeRestrictions())) {
            this.f18598e.setVisibility(8);
        } else {
            this.f18598e.setText(f2Var.getAgeRestrictions());
        }
        C7761y8.m20946b(this.f18597d, -16733198, -16746839, this.f18600g.mo51902b(2));
        this.f18597d.setTextColor(-1);
    }
}
