package com.fyber.inneractive.sdk.p084ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.C3657l;

/* renamed from: com.fyber.inneractive.sdk.ui.IAcloseButton */
public class IAcloseButton extends View {

    /* renamed from: a */
    Paint f9850a;

    /* renamed from: b */
    Path f9851b;

    public IAcloseButton(Context context, int i) {
        super(context);
        int b = C3657l.m9119b(10);
        int i2 = ((i - (b * 2)) / 4) + b;
        Point point = new Point(i2, i2);
        int i3 = i - i2;
        Point point2 = new Point(i2, i3);
        Point point3 = new Point(i3, i3);
        Point point4 = new Point(i3, i2);
        Path path = new Path();
        this.f9851b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f9851b.moveTo((float) point.x, (float) point.y);
        this.f9851b.lineTo((float) point3.x, (float) point3.y);
        this.f9851b.moveTo((float) point2.x, (float) point2.y);
        this.f9851b.lineTo((float) point4.x, (float) point4.y);
        this.f9851b.close();
        Paint paint = new Paint(1);
        this.f9850a = paint;
        paint.setStrokeWidth((float) C3657l.m9119b(2));
        this.f9850a.setColor(-1);
        this.f9850a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9850a.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1436657061);
        gradientDrawable.setStroke(C3657l.m9119b(2), -1);
        C3657l.m9112a((View) this, (Drawable) gradientDrawable);
        setPadding(b, b, b, b);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f9851b, this.f9850a);
    }
}
