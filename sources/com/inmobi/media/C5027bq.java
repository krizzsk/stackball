package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.bq */
/* compiled from: NativeTimerView */
public class C5027bq extends View {

    /* renamed from: a */
    public long f11449a;

    /* renamed from: b */
    public long f11450b;

    /* renamed from: c */
    public ValueAnimator f11451c;

    /* renamed from: d */
    private Bitmap f11452d;

    /* renamed from: e */
    private Canvas f11453e;

    /* renamed from: f */
    private RectF f11454f;

    /* renamed from: g */
    private RectF f11455g;

    /* renamed from: h */
    private Rect f11456h;

    /* renamed from: i */
    private Paint f11457i;

    /* renamed from: j */
    private Paint f11458j;

    /* renamed from: k */
    private Paint f11459k;

    /* renamed from: l */
    private Paint f11460l;

    /* renamed from: m */
    private Paint f11461m;

    /* renamed from: n */
    private float f11462n;

    /* renamed from: o */
    private C5029b f11463o;

    /* renamed from: com.inmobi.media.bq$b */
    /* compiled from: NativeTimerView */
    public interface C5029b {
        /* renamed from: a */
        void mo40201a();
    }

    public C5027bq(Context context) {
        this(context, (byte) 0);
    }

    private C5027bq(Context context, byte b) {
        this(context, 0);
    }

    private C5027bq(Context context, char c) {
        super(context, (AttributeSet) null, 0);
        this.f11449a = 0;
        Paint paint = new Paint();
        this.f11457i = paint;
        paint.setAntiAlias(true);
        this.f11457i.setColor(-723724);
        Paint paint2 = new Paint();
        this.f11461m = paint2;
        paint2.setAntiAlias(true);
        this.f11461m.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f11461m.setTextAlign(Paint.Align.CENTER);
        this.f11461m.setAntiAlias(true);
        this.f11456h = new Rect();
        Paint paint3 = new Paint();
        this.f11458j = paint3;
        paint3.setAntiAlias(true);
        this.f11458j.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint4 = new Paint();
        this.f11459k = paint4;
        paint4.setAntiAlias(true);
        this.f11459k.setColor(0);
        this.f11459k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint5 = new Paint();
        this.f11460l = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.f11460l.setAntiAlias(true);
        this.f11460l.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    public void setTimerEventsListener(C5029b bVar) {
        this.f11463o = bVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == i3 && i2 == i4)) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f11452d = createBitmap;
            createBitmap.eraseColor(0);
            this.f11453e = new Canvas(this.f11452d);
        }
        super.onSizeChanged(i, i2, i3, i4);
        float a = (float) C5343hf.m12332a((int) (((float) getWidth()) * 4.0f * 0.007f));
        float a2 = (float) C5343hf.m12332a((int) (((float) getWidth()) * 5.0f * 0.007f));
        this.f11454f = new RectF(a2, a2, ((float) getWidth()) - a2, ((float) getHeight()) - a2);
        this.f11455g = new RectF(this.f11454f.left + a, this.f11454f.top + a, this.f11454f.right - a, this.f11454f.bottom - a);
        this.f11460l.setStrokeWidth((float) C5343hf.m12332a((int) (((float) getWidth()) * 1.5f * 0.007f)));
        this.f11461m.setTextSize((float) C5343hf.m12332a((int) (((float) getWidth()) * 14.0f * 0.007f)));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f11453e.drawColor(0, PorterDuff.Mode.CLEAR);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(width, height);
        int a = C5343hf.m12332a((int) (((float) getWidth()) * 7.0f * 0.007f));
        float f = (float) width;
        float f2 = (float) height;
        canvas.drawCircle(f, f2, (float) min, this.f11457i);
        canvas.drawCircle(f, f2, (float) (min - a), this.f11460l);
        ValueAnimator valueAnimator = this.f11451c;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f11449a - (valueAnimator.getCurrentPlayTime() / 1000));
            if (((double) ((Float) this.f11451c.getAnimatedValue()).floatValue()) >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f11461m;
            Rect rect = this.f11456h;
            String valueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
            canvas.drawText(valueOf, (float) (getWidth() / 2), ((float) (getHeight() / 2)) + (((paint.descent() - paint.ascent()) / 2.0f) - paint.descent()), paint);
            if (((double) ((Float) this.f11451c.getAnimatedValue()).floatValue()) >= 1.0d) {
                m11451c();
            }
        }
        float f3 = this.f11462n;
        if (f3 > 0.0f) {
            this.f11453e.drawArc(this.f11454f, 270.0f, f3, true, this.f11458j);
            this.f11453e.drawOval(this.f11455g, this.f11459k);
        }
        canvas.drawBitmap(this.f11452d, 0.0f, 0.0f, (Paint) null);
    }

    public void setTimerValue(long j) {
        this.f11449a = j;
    }

    /* renamed from: com.inmobi.media.bq$a */
    /* compiled from: NativeTimerView */
    public static class C5028a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public WeakReference<C5027bq> f11464a;

        public C5028a(C5027bq bqVar) {
            this.f11464a = new WeakReference<>(bqVar);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5027bq bqVar = (C5027bq) this.f11464a.get();
            if (bqVar != null) {
                int visibility = bqVar.getVisibility();
                if (visibility != 4 && visibility != 8) {
                    bqVar.mo40193a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                } else if (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) >= 1.0d) {
                    bqVar.m11451c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40192a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f11451c = ofFloat;
        ofFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f11449a));
        this.f11451c.setInterpolator(new LinearInterpolator());
        this.f11451c.addUpdateListener(new C5028a(this));
        this.f11451c.start();
    }

    /* renamed from: b */
    public final void mo40194b() {
        ValueAnimator valueAnimator = this.f11451c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f11450b = this.f11451c.getCurrentPlayTime();
            this.f11451c.cancel();
        }
    }

    /* renamed from: a */
    public final void mo40193a(float f) {
        this.f11462n = f * 360.0f;
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11451c() {
        C5029b bVar = this.f11463o;
        if (bVar != null) {
            bVar.mo40201a();
            this.f11451c.cancel();
            this.f11451c = null;
        }
    }
}
