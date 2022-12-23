package com.p243my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.my.target.x6 */
public class C7737x6 extends RelativeLayout {

    /* renamed from: a */
    public final RelativeLayout f19592a;

    /* renamed from: b */
    public final ImageView f19593b;

    /* renamed from: c */
    public final ImageView f19594c;

    /* renamed from: d */
    public final C7761y8 f19595d;

    /* renamed from: e */
    public final boolean f19596e;

    /* renamed from: f */
    public final View.OnClickListener f19597f;

    /* renamed from: com.my.target.x6$b */
    public static class C7739b implements View.OnClickListener {

        /* renamed from: a */
        public final Context f19598a;

        public C7739b(Context context) {
            this.f19598a = context;
        }

        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://target.my.com/"));
                if (!(this.f19598a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.f19598a.startActivity(intent);
            } catch (Throwable th) {
                C7374e0.m18989a(th.getMessage());
            }
        }
    }

    public C7737x6(Context context, C7761y8 y8Var, boolean z) {
        super(context);
        this.f19592a = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.f19593b = imageView;
        C7761y8.m20947b(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.f19594c = imageView2;
        C7761y8.m20947b(imageView2, "store_image");
        this.f19595d = y8Var;
        this.f19596e = z;
        this.f19597f = new C7739b(context);
    }

    /* renamed from: a */
    public void mo51834a() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f19592a.setLayoutParams(layoutParams);
        this.f19593b.setImageBitmap(C7622q5.m20197a(getContext()));
        this.f19592a.addView(this.f19593b);
        this.f19592a.addView(this.f19594c);
        addView(this.f19592a);
    }

    /* renamed from: a */
    public void mo51835a(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i / 3;
        if (this.f19596e) {
            i9 = i / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i9);
        int b = this.f19595d.mo51902b(24);
        C7761y8 y8Var = this.f19595d;
        if (z) {
            i4 = y8Var.mo51902b(4);
            i3 = this.f19595d.mo51902b(24);
            i2 = this.f19595d.mo51902b(8);
        } else {
            i4 = y8Var.mo51902b(16);
            i3 = this.f19595d.mo51902b(24);
            i2 = this.f19595d.mo51902b(16);
        }
        layoutParams.setMargins(b, i4, i3, i2);
        layoutParams.addRule(15, -1);
        int i10 = Build.VERSION.SDK_INT;
        layoutParams.addRule(i10 >= 17 ? 20 : 9);
        this.f19594c.setScaleType(ImageView.ScaleType.FIT_START);
        this.f19594c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i9);
        if (z) {
            i5 = this.f19595d.mo51902b(8);
            i8 = this.f19595d.mo51902b(4);
            i7 = this.f19595d.mo51902b(8);
            i6 = this.f19595d.mo51902b(8);
        } else {
            i5 = this.f19595d.mo51902b(24);
            i8 = this.f19595d.mo51902b(16);
            i7 = this.f19595d.mo51902b(24);
            i6 = this.f19595d.mo51902b(16);
        }
        layoutParams2.setMargins(i5, i8, i7, i6);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(i10 >= 17 ? 21 : 11);
        this.f19593b.setScaleType(ImageView.ScaleType.FIT_END);
        this.f19593b.setLayoutParams(layoutParams2);
        this.f19593b.setOnClickListener(this.f19597f);
    }
}
