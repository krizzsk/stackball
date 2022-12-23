package com.applovin.impl.adview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.app.NotificationCompat;

/* renamed from: com.applovin.impl.adview.f */
public class C1083f extends View {

    /* renamed from: s */
    private static final int f1933s = Color.rgb(66, 145, 241);

    /* renamed from: t */
    private static final int f1934t = Color.rgb(66, 145, 241);

    /* renamed from: u */
    private static final int f1935u = Color.rgb(66, 145, 241);

    /* renamed from: a */
    protected Paint f1936a;

    /* renamed from: b */
    protected Paint f1937b;

    /* renamed from: c */
    private Paint f1938c;

    /* renamed from: d */
    private Paint f1939d;

    /* renamed from: e */
    private RectF f1940e;

    /* renamed from: f */
    private float f1941f;

    /* renamed from: g */
    private int f1942g;

    /* renamed from: h */
    private int f1943h;

    /* renamed from: i */
    private int f1944i;

    /* renamed from: j */
    private int f1945j;

    /* renamed from: k */
    private int f1946k;

    /* renamed from: l */
    private float f1947l;

    /* renamed from: m */
    private int f1948m;

    /* renamed from: n */
    private String f1949n;

    /* renamed from: o */
    private String f1950o;

    /* renamed from: p */
    private float f1951p;

    /* renamed from: q */
    private String f1952q;

    /* renamed from: r */
    private float f1953r;

    /* renamed from: v */
    private final float f1954v;

    /* renamed from: w */
    private final float f1955w;

    /* renamed from: x */
    private final float f1956x;

    /* renamed from: y */
    private final int f1957y;

    /* renamed from: com.applovin.impl.adview.f$a */
    private static class C1084a {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public static float m1598c(Resources resources, float f) {
            return (f * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static float m1599d(Resources resources, float f) {
            return f * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public C1083f(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1083f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1083f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1940e = new RectF();
        this.f1944i = 0;
        this.f1949n = "";
        this.f1950o = "";
        this.f1952q = "";
        this.f1955w = C1084a.m1599d(getResources(), 14.0f);
        this.f1957y = (int) C1084a.m1598c(getResources(), 100.0f);
        this.f1954v = C1084a.m1598c(getResources(), 4.0f);
        this.f1956x = C1084a.m1599d(getResources(), 18.0f);
        mo11920b();
        mo11919a();
    }

    /* renamed from: a */
    private int m1593a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.f1957y;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    private float getProgressAngle() {
        return (((float) getProgress()) / ((float) this.f1945j)) * 360.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11919a() {
        TextPaint textPaint = new TextPaint();
        this.f1936a = textPaint;
        textPaint.setColor(this.f1942g);
        this.f1936a.setTextSize(this.f1941f);
        this.f1936a.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f1937b = textPaint2;
        textPaint2.setColor(this.f1943h);
        this.f1937b.setTextSize(this.f1951p);
        this.f1937b.setAntiAlias(true);
        Paint paint = new Paint();
        this.f1938c = paint;
        paint.setColor(this.f1946k);
        this.f1938c.setStyle(Paint.Style.STROKE);
        this.f1938c.setAntiAlias(true);
        this.f1938c.setStrokeWidth(this.f1947l);
        Paint paint2 = new Paint();
        this.f1939d = paint2;
        paint2.setColor(this.f1948m);
        this.f1939d.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11920b() {
        this.f1946k = f1933s;
        this.f1942g = f1934t;
        this.f1941f = this.f1955w;
        setMax(100);
        setProgress(0);
        this.f1947l = this.f1954v;
        this.f1948m = 0;
        this.f1951p = this.f1956x;
        this.f1943h = f1935u;
    }

    public int getFinishedStrokeColor() {
        return this.f1946k;
    }

    public float getFinishedStrokeWidth() {
        return this.f1947l;
    }

    public int getInnerBackgroundColor() {
        return this.f1948m;
    }

    public String getInnerBottomText() {
        return this.f1952q;
    }

    public int getInnerBottomTextColor() {
        return this.f1943h;
    }

    public float getInnerBottomTextSize() {
        return this.f1951p;
    }

    public int getMax() {
        return this.f1945j;
    }

    public String getPrefixText() {
        return this.f1949n;
    }

    public int getProgress() {
        return this.f1944i;
    }

    public String getSuffixText() {
        return this.f1950o;
    }

    public int getTextColor() {
        return this.f1942g;
    }

    public float getTextSize() {
        return this.f1941f;
    }

    public void invalidate() {
        mo11919a();
        super.invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f1947l;
        this.f1940e.set(f, f, ((float) getWidth()) - f, ((float) getHeight()) - f);
        float f2 = this.f1947l;
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((((float) getWidth()) - f2) + f2) / 2.0f, this.f1939d);
        canvas.drawArc(this.f1940e, 270.0f, -getProgressAngle(), false, this.f1938c);
        String str = this.f1949n + this.f1944i + this.f1950o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (((float) getWidth()) - this.f1936a.measureText(str)) / 2.0f, (((float) getWidth()) - (this.f1936a.descent() + this.f1936a.ascent())) / 2.0f, this.f1936a);
        }
        if (!TextUtils.isEmpty(getInnerBottomText())) {
            this.f1937b.setTextSize(this.f1951p);
            canvas.drawText(getInnerBottomText(), (((float) getWidth()) - this.f1937b.measureText(getInnerBottomText())) / 2.0f, (((float) getHeight()) - this.f1953r) - ((this.f1936a.descent() + this.f1936a.ascent()) / 2.0f), this.f1937b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m1593a(i), m1593a(i2));
        this.f1953r = (float) (getHeight() - ((getHeight() * 3) / 4));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f1942g = bundle.getInt("text_color");
            this.f1941f = bundle.getFloat("text_size");
            this.f1951p = bundle.getFloat("inner_bottom_text_size");
            this.f1952q = bundle.getString("inner_bottom_text");
            this.f1943h = bundle.getInt("inner_bottom_text_color");
            this.f1946k = bundle.getInt("finished_stroke_color");
            this.f1947l = bundle.getFloat("finished_stroke_width");
            this.f1948m = bundle.getInt("inner_background_color");
            mo11919a();
            setMax(bundle.getInt("max"));
            setProgress(bundle.getInt(NotificationCompat.CATEGORY_PROGRESS));
            this.f1949n = bundle.getString("prefix");
            this.f1950o = bundle.getString("suffix");
            super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", (float) getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt(NotificationCompat.CATEGORY_PROGRESS, getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i) {
        this.f1946k = i;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f) {
        this.f1947l = f;
        invalidate();
    }

    public void setInnerBackgroundColor(int i) {
        this.f1948m = i;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f1952q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i) {
        this.f1943h = i;
        invalidate();
    }

    public void setInnerBottomTextSize(float f) {
        this.f1951p = f;
        invalidate();
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f1945j = i;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f1949n = str;
        invalidate();
    }

    public void setProgress(int i) {
        this.f1944i = i;
        if (i > getMax()) {
            this.f1944i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f1950o = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f1942g = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f1941f = f;
        invalidate();
    }
}
