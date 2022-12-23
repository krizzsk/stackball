package com.p243my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.nativeads.views.MediaAdView;

/* renamed from: com.my.target.h6 */
public class C7439h6 extends RelativeLayout {

    /* renamed from: a */
    public static final int f18693a = C7761y8.m20948c();

    /* renamed from: b */
    public final C7422g6 f18694b;

    /* renamed from: c */
    public final RelativeLayout.LayoutParams f18695c;

    /* renamed from: d */
    public final C7506k6 f18696d;

    /* renamed from: e */
    public final C7331b6 f18697e;

    /* renamed from: f */
    public final C7761y8 f18698f;

    /* renamed from: g */
    public ImageData f18699g;

    /* renamed from: h */
    public ImageData f18700h;

    /* renamed from: i */
    public final C7722w5 f18701i;

    public C7439h6(Context context) {
        super(context);
        setBackgroundColor(0);
        C7761y8 c = C7761y8.m20950c(context);
        this.f18698f = c;
        C7506k6 k6Var = new C7506k6(context);
        this.f18696d = k6Var;
        int i = f18693a;
        k6Var.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        k6Var.setLayoutParams(layoutParams);
        C7761y8.m20947b(k6Var, "image_view");
        addView(k6Var);
        C7422g6 g6Var = new C7422g6(context);
        this.f18694b = g6Var;
        g6Var.mo50226a(C7607p5.m20092a((int) TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics())), false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        this.f18695c = layoutParams2;
        layoutParams2.addRule(7, i);
        layoutParams2.addRule(6, i);
        g6Var.setLayoutParams(layoutParams2);
        C7331b6 b6Var = new C7331b6(context);
        this.f18697e = b6Var;
        C7722w5 w5Var = new C7722w5(context);
        this.f18701i = w5Var;
        w5Var.setVisibility(8);
        int b = c.mo51902b(10);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = b;
        layoutParams3.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(b, b, b, b);
        layoutParams4.addRule(5, i);
        layoutParams4.addRule(6, i);
        linearLayout.setOrientation(0);
        linearLayout.addView(b6Var);
        linearLayout.addView(w5Var, layoutParams3);
        C7761y8.m20947b(g6Var, "close_button");
        addView(g6Var);
        C7761y8.m20947b(b6Var, "age_bordering");
        addView(linearLayout, layoutParams4);
    }

    /* renamed from: a */
    public final void mo50303a() {
        Point b = C7761y8.m20944b(getContext());
        int i = b.x;
        int i2 = b.y;
        if (i > 0 && i2 > 0) {
            ImageData imageData = ((float) i) / ((float) i2) > 1.0f ? this.f18700h : this.f18699g;
            if (imageData == null && (imageData = this.f18700h) == null) {
                imageData = this.f18699g;
            }
            if (imageData != null) {
                this.f18696d.setImageData(imageData);
            }
        }
    }

    /* renamed from: a */
    public void mo50304a(ImageData imageData, ImageData imageData2, ImageData imageData3) {
        this.f18700h = imageData;
        this.f18699g = imageData2;
        Bitmap bitmap = imageData3 != null ? imageData3.getBitmap() : null;
        if (bitmap != null) {
            this.f18694b.mo50226a(bitmap, true);
            RelativeLayout.LayoutParams layoutParams = this.f18695c;
            int i = -this.f18694b.getMeasuredWidth();
            layoutParams.leftMargin = i;
            layoutParams.bottomMargin = i;
        }
        mo50303a();
    }

    /* renamed from: a */
    public void mo50305a(C7596p1 p1Var, View.OnClickListener onClickListener) {
        this.f18701i.setVisibility(0);
        this.f18701i.setImageBitmap(p1Var.mo51318c().getBitmap());
        this.f18701i.setOnClickListener(onClickListener);
    }

    public C7422g6 getCloseButton() {
        return this.f18694b;
    }

    public ImageView getImageView() {
        return this.f18696d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo50303a();
    }

    public void setAgeRestrictions(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f18697e.mo49746a(1, -7829368);
            this.f18697e.setPadding(this.f18698f.mo51902b(2), 0, 0, 0);
            this.f18697e.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
            this.f18697e.mo49747a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f18698f.mo51902b(3));
            this.f18697e.setBackgroundColor(1711276032);
            this.f18697e.setText(str);
            return;
        }
        this.f18697e.setVisibility(8);
    }
}
