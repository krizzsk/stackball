package com.p243my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: com.my.target.j6 */
public class C7485j6 extends View {

    /* renamed from: a */
    public static final Paint f18830a;

    /* renamed from: b */
    public static final Path f18831b = new Path();

    static {
        Paint paint = new Paint();
        f18830a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public C7485j6(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static Path m19515a(float f) {
        Path path = f18831b;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f2 = 0.45f * f;
        double d = (double) f;
        float f3 = f * 2.0f;
        path.moveTo((float) ((Math.sin(0.0d) * d) + d), f3 - ((float) ((Math.cos(0.0d) * d) + d)));
        double d2 = (double) f2;
        path.lineTo((float) ((Math.sin(0.6283185307179586d) * d2) + d), f3 - ((float) ((Math.cos(0.6283185307179586d) * d2) + d)));
        for (int i = 1; i < 5; i++) {
            Path path2 = f18831b;
            double d3 = ((double) i) * 1.2566370614359172d;
            path2.lineTo((float) ((Math.sin(d3) * d) + d), f3 - ((float) ((Math.cos(d3) * d) + d)));
            double d4 = d3 + 0.6283185307179586d;
            path2.lineTo((float) ((Math.sin(d4) * d2) + d), f3 - ((float) ((Math.cos(d4) * d2) + d)));
        }
        Path path3 = f18831b;
        path3.close();
        return path3;
    }

    public void onDraw(Canvas canvas) {
        float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
        if (measuredHeight != 0.0f) {
            canvas.drawPath(m19515a(measuredHeight), f18830a);
        }
    }

    public void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        setMeasuredDimension(min, min);
    }

    public void setColor(int i) {
        f18830a.setColor(i);
        invalidate();
    }
}
