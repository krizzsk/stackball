package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C6347k;

public class MBridgeImageView extends ImageView {
    public static final int GRADIENT_ALL = 4;
    public static final int GRADIENT_BORDER = 1;
    public static final int GRADIENT_LABEL = 2;
    public static final int GRADIENT_LABEL_BACKGROUND = 3;
    public static final int GRADIENT_NONE = 0;

    /* renamed from: K */
    private static final C6985a[] f17221K = {C6985a.NORMAL, C6985a.CIRCLE, C6985a.ROUND_RECT};

    /* renamed from: A */
    private ColorStateList f17222A;

    /* renamed from: B */
    private int f17223B;

    /* renamed from: C */
    private int f17224C;

    /* renamed from: D */
    private int f17225D;

    /* renamed from: E */
    private int[] f17226E;

    /* renamed from: F */
    private float[] f17227F;

    /* renamed from: G */
    private int f17228G;

    /* renamed from: H */
    private int f17229H;

    /* renamed from: I */
    private Shader f17230I;

    /* renamed from: J */
    private int f17231J;

    /* renamed from: a */
    private Paint f17232a;

    /* renamed from: b */
    private float f17233b;

    /* renamed from: c */
    private ColorStateList f17234c;

    /* renamed from: d */
    private ColorStateList f17235d;

    /* renamed from: e */
    private ColorStateList f17236e;

    /* renamed from: f */
    private int f17237f;

    /* renamed from: g */
    private boolean f17238g;

    /* renamed from: h */
    private float f17239h;

    /* renamed from: i */
    private float f17240i;

    /* renamed from: j */
    private float f17241j;

    /* renamed from: k */
    private float f17242k;

    /* renamed from: l */
    private C6985a f17243l;

    /* renamed from: m */
    private boolean f17244m;

    /* renamed from: n */
    private String f17245n;

    /* renamed from: o */
    private int f17246o;

    /* renamed from: p */
    private int f17247p;

    /* renamed from: q */
    private int f17248q;

    /* renamed from: r */
    private int f17249r;

    /* renamed from: s */
    private int f17250s;

    /* renamed from: t */
    private int f17251t;

    /* renamed from: u */
    private int f17252u;

    /* renamed from: v */
    private int f17253v;

    /* renamed from: w */
    private TextPaint f17254w;

    /* renamed from: x */
    private String f17255x;

    /* renamed from: y */
    private ColorStateList f17256y;

    /* renamed from: z */
    private ColorStateList f17257z;

    /* renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeImageView$a */
    public enum C6985a {
        NORMAL(0),
        CIRCLE(1),
        ROUND_RECT(2);
        

        /* renamed from: d */
        final int f17263d;

        private C6985a(int i) {
            this.f17263d = i;
        }
    }

    public MBridgeImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface = null;
        this.f17232a = null;
        this.f17233b = 2.0f;
        this.f17237f = Color.parseColor("#ff000000");
        this.f17244m = false;
        this.f17246o = -1;
        this.f17247p = 15;
        this.f17248q = Color.parseColor("#9FFF0000");
        this.f17249r = 2;
        this.f17250s = 15;
        this.f17251t = 20;
        this.f17252u = 0;
        this.f17253v = 0;
        this.f17254w = null;
        setLayerType(2, (Paint) null);
        this.f17232a = new Paint();
        this.f17254w = new TextPaint();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6347k.m16085a(context, "RoundImageView"));
            this.f17233b = obtainStyledAttributes.getDimension(C6347k.m16086b(context, "RoundImageView_borderWidth", "styleable"), this.f17233b);
            this.f17234c = obtainStyledAttributes.getColorStateList(C6347k.m16086b(context, "RoundImageView_borderColor", "styleable"));
            this.f17238g = obtainStyledAttributes.getBoolean(C6347k.m16086b(context, "RoundImageView_displayBorder", "styleable"), this.f17238g);
            this.f17239h = obtainStyledAttributes.getDimension(C6347k.m16086b(context, "RoundImageView_android_topLeftRadius", "styleable"), this.f17239h);
            this.f17240i = obtainStyledAttributes.getDimension(C6347k.m16086b(context, "RoundImageView_android_topRightRadius", "styleable"), this.f17240i);
            this.f17241j = obtainStyledAttributes.getDimension(C6347k.m16086b(context, "RoundImageView_android_bottomLeftRadius", "styleable"), this.f17241j);
            this.f17242k = obtainStyledAttributes.getDimension(C6347k.m16086b(context, "RoundImageView_android_bottomRightRadius", "styleable"), this.f17242k);
            float dimension = obtainStyledAttributes.getDimension(C6347k.m16086b(context, "RoundImageView_android_radius", "styleable"), 0.0f);
            if (dimension > 0.0f) {
                this.f17242k = dimension;
                this.f17240i = dimension;
                this.f17241j = dimension;
                this.f17239h = dimension;
            }
            int i2 = obtainStyledAttributes.getInt(C6347k.m16086b(context, "RoundImageView_displayType", "styleable"), -1);
            if (i2 >= 0) {
                this.f17243l = f17221K[i2];
            } else {
                this.f17243l = C6985a.NORMAL;
            }
            this.f17244m = obtainStyledAttributes.getBoolean(C6347k.m16086b(context, "RoundImageView_displayLabel", "styleable"), this.f17244m);
            this.f17245n = obtainStyledAttributes.getString(C6347k.m16086b(context, "RoundImageView_android_text", "styleable"));
            this.f17236e = obtainStyledAttributes.getColorStateList(C6347k.m16086b(context, "RoundImageView_labelBackground", "styleable"));
            this.f17247p = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundImageView_android_textSize", "styleable"), this.f17247p);
            this.f17235d = obtainStyledAttributes.getColorStateList(C6347k.m16086b(context, "RoundImageView_android_textColor", "styleable"));
            this.f17250s = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundImageView_labelWidth", "styleable"), this.f17250s);
            this.f17252u = obtainStyledAttributes.getInteger(C6347k.m16086b(context, "RoundImageView_ratioWidth", "styleable"), this.f17252u);
            this.f17253v = obtainStyledAttributes.getInteger(C6347k.m16086b(context, "RoundImageView_ratioHeight", "styleable"), this.f17253v);
            this.f17249r = obtainStyledAttributes.getInt(C6347k.m16086b(context, "RoundImageView_labelGravity", "styleable"), this.f17249r);
            this.f17251t = obtainStyledAttributes.getDimensionPixelSize(C6347k.m16086b(context, "RoundImageView_startMargin", "styleable"), this.f17251t);
            this.f17229H = obtainStyledAttributes.getInt(C6347k.m16086b(context, "RoundImageView_android_type", "styleable"), 0);
            this.f17256y = obtainStyledAttributes.getColorStateList(C6347k.m16086b(context, "RoundImageView_android_startColor", "styleable"));
            this.f17257z = obtainStyledAttributes.getColorStateList(C6347k.m16086b(context, "RoundImageView_android_centerColor", "styleable"));
            this.f17222A = obtainStyledAttributes.getColorStateList(C6347k.m16086b(context, "RoundImageView_android_endColor", "styleable"));
            this.f17228G = obtainStyledAttributes.getInt(C6347k.m16086b(context, "RoundImageView_gradientContent", "styleable"), 0);
            this.f17231J = obtainStyledAttributes.getInt(C6347k.m16086b(context, "RoundImageView_android_orientation", "styleable"), 0);
            int i3 = obtainStyledAttributes.getInt(C6347k.m16086b(context, "RoundImageView_android_typeface", "styleable"), -1);
            int i4 = obtainStyledAttributes.getInt(C6347k.m16086b(context, "RoundImageView_android_textStyle", "styleable"), -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                typeface = Typeface.SERIF;
            } else if (i3 == 3) {
                typeface = Typeface.MONOSPACE;
            }
            setTypeface(typeface, i4);
            this.f17255x = this.f17245n;
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f17252u;
        if (!(i4 == 0 || (i3 = this.f17253v) == 0 || size == 0)) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((float) ((i3 * size) / i4)), 1073741824);
        }
        if (this.f17243l == C6985a.CIRCLE) {
            if (size >= size2) {
                i = i2;
            }
            if (size > 0) {
                i2 = i;
            }
            super.onMeasure(i2, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
            this.f17239h = Math.min(this.f17239h, min);
            this.f17240i = Math.min(this.f17240i, min);
            this.f17241j = Math.min(this.f17241j, min);
            this.f17242k = Math.min(this.f17242k, min);
            float f = min / 2.0f;
            this.f17233b = Math.min(this.f17233b, f);
            int min2 = (int) Math.min((float) this.f17250s, f);
            this.f17250s = min2;
            this.f17247p = Math.min(this.f17247p, min2);
            this.f17251t = Math.min(this.f17251t, (int) ((min * 2.0f) - m17618a()));
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap);
            super.onDraw(canvas2);
            this.f17232a.reset();
            this.f17232a.setAntiAlias(true);
            this.f17232a.setDither(true);
            if (this.f17243l != C6985a.NORMAL) {
                this.f17232a.setStyle(Paint.Style.FILL);
                this.f17232a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                Path b = m17619b();
                b.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                canvas2.drawPath(b, this.f17232a);
                this.f17232a.setXfermode((Xfermode) null);
            }
            if (this.f17228G != 0) {
                int i = this.f17229H;
                if (i != 0) {
                    if (i == 1) {
                        this.f17230I = new RadialGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) (getWidth() > getHeight() ? getWidth() : getHeight())) / 2.0f, this.f17226E, this.f17227F, Shader.TileMode.CLAMP);
                    } else if (i == 2) {
                        this.f17230I = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f17226E, this.f17227F);
                    }
                } else if (this.f17231J == 1) {
                    this.f17230I = new LinearGradient(0.0f, 0.0f, 0.0f, (float) getHeight(), this.f17226E, this.f17227F, Shader.TileMode.CLAMP);
                } else {
                    this.f17230I = new LinearGradient(0.0f, 0.0f, (float) getWidth(), 0.0f, this.f17226E, this.f17227F, Shader.TileMode.CLAMP);
                }
            }
            if (this.f17238g) {
                this.f17232a.setStyle(Paint.Style.STROKE);
                this.f17232a.setStrokeWidth(this.f17233b);
                int i2 = this.f17228G;
                if (i2 == 4 || i2 == 1) {
                    this.f17232a.setShader(this.f17230I);
                } else {
                    this.f17232a.setShader((Shader) null);
                    this.f17232a.setColor(this.f17237f);
                }
                canvas2.drawPath(m17619b(), this.f17232a);
            }
            if (this.f17244m) {
                Path path = new Path();
                Path path2 = new Path();
                float a = m17618a();
                int i3 = this.f17249r;
                if (i3 == 0) {
                    path.moveTo((float) this.f17251t, 0.0f);
                    path.rLineTo(a, 0.0f);
                    path.lineTo(0.0f, ((float) this.f17251t) + a);
                    path.rLineTo(0.0f, -a);
                    path.close();
                    float f2 = a / 2.0f;
                    path2.moveTo(0.0f, ((float) this.f17251t) + f2);
                    path2.lineTo(((float) this.f17251t) + f2, 0.0f);
                } else if (i3 == 1) {
                    path.moveTo((float) this.f17251t, (float) getHeight());
                    path.rLineTo(a, 0.0f);
                    path.lineTo(0.0f, ((float) getHeight()) - (((float) this.f17251t) + a));
                    path.rLineTo(0.0f, a);
                    path.close();
                    float f3 = a / 2.0f;
                    path2.moveTo(0.0f, ((float) getHeight()) - (((float) this.f17251t) + f3));
                    path2.lineTo(((float) this.f17251t) + f3, (float) getHeight());
                } else if (i3 == 2) {
                    path.moveTo((float) (getWidth() - this.f17251t), 0.0f);
                    float f4 = -a;
                    path.rLineTo(f4, 0.0f);
                    path.lineTo((float) getWidth(), ((float) this.f17251t) + a);
                    path.rLineTo(0.0f, f4);
                    path.close();
                    float f5 = a / 2.0f;
                    path2.moveTo(((float) getWidth()) - (((float) this.f17251t) + f5), 0.0f);
                    path2.lineTo((float) getWidth(), ((float) this.f17251t) + f5);
                } else if (i3 == 3) {
                    path.moveTo((float) (getWidth() - this.f17251t), (float) getHeight());
                    path.rLineTo(-a, 0.0f);
                    path.lineTo((float) getWidth(), ((float) getHeight()) - (((float) this.f17251t) + a));
                    path.rLineTo(0.0f, a);
                    path.close();
                    float f6 = a / 2.0f;
                    path2.moveTo(((float) getWidth()) - (((float) this.f17251t) + f6), (float) getHeight());
                    path2.lineTo((float) getWidth(), ((float) getHeight()) - (((float) this.f17251t) + f6));
                }
                this.f17254w.setAntiAlias(true);
                this.f17254w.setStyle(Paint.Style.FILL);
                int i4 = this.f17228G;
                if (i4 == 3 || i4 == 4) {
                    this.f17254w.setShader(this.f17230I);
                } else {
                    this.f17254w.setShader((Shader) null);
                    this.f17254w.setColor(this.f17248q);
                }
                canvas2.drawPath(path, this.f17254w);
                this.f17254w.setTextSize((float) this.f17247p);
                if (this.f17228G == 2) {
                    this.f17254w.setShader(this.f17230I);
                } else {
                    this.f17254w.setShader((Shader) null);
                    this.f17254w.setColor(this.f17246o);
                }
                if (this.f17255x == null) {
                    this.f17255x = "";
                }
                this.f17254w.setTextAlign(Paint.Align.CENTER);
                float measureText = this.f17254w.measureText(this.f17255x);
                float length = new PathMeasure(path2, false).getLength();
                if (measureText > length) {
                    float length2 = measureText / ((float) this.f17255x.length());
                    StringBuilder sb = new StringBuilder();
                    String str = this.f17255x;
                    sb.append(str.substring(0, str.length() - (((int) Math.floor((double) ((measureText - length) / length2))) + 2)));
                    sb.append("...");
                    this.f17255x = sb.toString();
                }
                Paint.FontMetricsInt fontMetricsInt = this.f17254w.getFontMetricsInt();
                canvas2.drawTextOnPath(this.f17255x, path2, 0.0f, (((float) (fontMetricsInt.bottom - fontMetricsInt.top)) / 2.0f) - ((float) fontMetricsInt.bottom), this.f17254w);
            }
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.f17232a);
            if (createBitmap != null && !createBitmap.isRecycled()) {
                createBitmap.recycle();
                return;
            }
            return;
        }
        Canvas canvas3 = canvas;
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private float m17618a() {
        return (float) Math.sqrt(Math.pow((double) this.f17250s, 2.0d) * 2.0d);
    }

    /* renamed from: b */
    private Path m17619b() {
        Path path = new Path();
        float f = this.f17233b / 2.0f;
        int i = C69841.f17258a[this.f17243l.ordinal()];
        if (i == 1) {
            path.addCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (((float) getWidth()) / 2.0f) - f, Path.Direction.CW);
        } else if (i != 2) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            rectF.inset(f, f);
            path.addRect(rectF, Path.Direction.CW);
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            rectF2.inset(f, f);
            float f2 = this.f17239h;
            float f3 = this.f17240i;
            float f4 = this.f17242k;
            float f5 = this.f17241j;
            path.addRoundRect(rectF2, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
        }
        return path;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeImageView$1 */
    static /* synthetic */ class C69841 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17258a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mbridge.msdk.video.dynview.widget.MBridgeImageView$a[] r0 = com.mbridge.msdk.video.dynview.widget.MBridgeImageView.C6985a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17258a = r0
                com.mbridge.msdk.video.dynview.widget.MBridgeImageView$a r1 = com.mbridge.msdk.video.dynview.widget.MBridgeImageView.C6985a.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17258a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.video.dynview.widget.MBridgeImageView$a r1 = com.mbridge.msdk.video.dynview.widget.MBridgeImageView.C6985a.ROUND_RECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeImageView.C69841.<clinit>():void");
        }
    }

    public float getBorderWidth() {
        return this.f17233b;
    }

    public void setBorderWidth(float f) {
        if (this.f17233b != f) {
            this.f17233b = f;
            if (this.f17238g) {
                postInvalidate();
            }
        }
    }

    public int getBorderColor() {
        return this.f17237f;
    }

    public void setBorderColor(int i) {
        if (this.f17237f != i) {
            this.f17237f = i;
            if (this.f17238g) {
                postInvalidate();
            }
        }
    }

    public boolean isDisplayBorder() {
        return this.f17238g;
    }

    public void setDisplayBorder(boolean z) {
        if (this.f17238g != z) {
            this.f17238g = z;
            postInvalidate();
        }
    }

    public float getLeftTopRadius() {
        return this.f17239h;
    }

    public void setLeftTopRadius(float f) {
        if (this.f17239h != f) {
            this.f17239h = f;
            if (this.f17243l != C6985a.NORMAL) {
                postInvalidate();
            }
        }
    }

    public float getRightTopRadius() {
        return this.f17240i;
    }

    public void setRightTopRadius(float f) {
        if (this.f17240i != f) {
            this.f17240i = f;
            if (this.f17243l != C6985a.NORMAL) {
                postInvalidate();
            }
        }
    }

    public float getLeftBottomRadius() {
        return this.f17241j;
    }

    public void setLeftBottomRadius(float f) {
        if (this.f17241j != f) {
            this.f17241j = f;
            if (this.f17243l != C6985a.NORMAL) {
                postInvalidate();
            }
        }
    }

    public float getRightBottomRadius() {
        return this.f17242k;
    }

    public void setRightBottomRadius(float f) {
        if (this.f17242k != f) {
            this.f17242k = f;
            if (this.f17243l != C6985a.NORMAL) {
                postInvalidate();
            }
        }
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        if (this.f17239h != f || this.f17240i != f2 || this.f17241j != f3 || this.f17242k != f4) {
            this.f17239h = f;
            this.f17240i = f2;
            this.f17241j = f3;
            this.f17242k = f4;
            if (this.f17243l != C6985a.NORMAL) {
                postInvalidate();
            }
        }
    }

    public void setRadius(float f) {
        setRadius(f, f, f, f);
    }

    public C6985a getDisplayType() {
        return this.f17243l;
    }

    public void setDisplayType(C6985a aVar) {
        if (this.f17243l != aVar) {
            this.f17243l = aVar;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public void setDisplayLabel(boolean z) {
        if (this.f17244m != z) {
            this.f17244m = z;
            if (z) {
                postInvalidate();
            }
        }
    }

    public void setLabelText(String str) {
        if (!TextUtils.equals(this.f17245n, str)) {
            this.f17245n = str;
            this.f17255x = str;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public void setTextColor(int i) {
        if (this.f17246o != i) {
            this.f17246o = i;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f17235d = colorStateList;
        if (this.f17244m) {
            invalidate();
        }
    }

    public void setTextSize(int i) {
        if (this.f17247p != i) {
            this.f17247p = i;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public void setLabelBackground(int i) {
        if (this.f17248q != i) {
            this.f17248q = i;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public void setLabelBackground(ColorStateList colorStateList) {
        this.f17236e = colorStateList;
        if (this.f17244m) {
            invalidate();
        }
    }

    public void setLabelGravity(int i) {
        if (this.f17249r != i) {
            this.f17249r = i;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public void setLabelWidth(int i) {
        if (this.f17250s != i) {
            this.f17250s = i;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public void setStartMargin(int i) {
        if (this.f17251t != i) {
            this.f17251t = i;
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public boolean isDisplayLabel() {
        return this.f17244m;
    }

    public String getLabelText() {
        return this.f17245n;
    }

    public int getTextColor() {
        return this.f17246o;
    }

    public int getTextSize() {
        return this.f17247p;
    }

    public int getLabelBackground() {
        return this.f17248q;
    }

    public int getLabelGravity() {
        return this.f17249r;
    }

    public int getLabelWidth() {
        return this.f17250s;
    }

    public int getStartMargin() {
        return this.f17251t;
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f17254w;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f17254w;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f17254w.setFakeBoldText(false);
        this.f17254w.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    public void setTypeface(Typeface typeface) {
        if (this.f17254w.getTypeface() != typeface) {
            this.f17254w.setTypeface(typeface);
            if (this.f17244m) {
                postInvalidate();
            }
        }
    }

    public Typeface getTypeface() {
        return this.f17254w.getTypeface();
    }

    public void setGradientType(int i) {
        if (this.f17229H != i) {
            this.f17229H = i;
            invalidate();
        }
    }

    public void setGradientContent(int i) {
        if (this.f17228G != i) {
            this.f17228G = i;
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if (this.f17231J != i) {
            this.f17231J = i;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        updateColorState();
    }

    public void updateColorState() {
        boolean z;
        int colorForState;
        int colorForState2;
        int colorForState3;
        int colorForState4;
        int colorForState5;
        int colorForState6;
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f17234c;
        if (colorStateList == null || this.f17237f == (colorForState6 = colorStateList.getColorForState(drawableState, 0))) {
            z = false;
        } else {
            this.f17237f = colorForState6;
            z = true;
        }
        ColorStateList colorStateList2 = this.f17236e;
        if (!(colorStateList2 == null || (colorForState5 = colorStateList2.getColorForState(drawableState, 0)) == this.f17248q)) {
            this.f17248q = colorForState5;
            z = true;
        }
        ColorStateList colorStateList3 = this.f17235d;
        if (!(colorStateList3 == null || this.f17246o == (colorForState4 = colorStateList3.getColorForState(drawableState, 0)))) {
            this.f17246o = colorForState4;
            z = true;
        }
        ColorStateList colorStateList4 = this.f17256y;
        if (!(colorStateList4 == null || (colorForState3 = colorStateList4.getColorForState(drawableState, 0)) == this.f17223B)) {
            this.f17223B = colorForState3;
            z = true;
        }
        ColorStateList colorStateList5 = this.f17257z;
        if (!(colorStateList5 == null || (colorForState2 = colorStateList5.getColorForState(drawableState, 0)) == this.f17224C)) {
            this.f17224C = colorForState2;
            z = true;
        }
        ColorStateList colorStateList6 = this.f17222A;
        if (!(colorStateList6 == null || (colorForState = colorStateList6.getColorForState(drawableState, 0)) == this.f17225D)) {
            this.f17225D = colorForState;
            z = true;
        }
        if (z) {
            if (this.f17256y != null && this.f17257z != null && this.f17222A != null) {
                this.f17226E = new int[]{this.f17223B, this.f17224C, this.f17225D};
                this.f17227F = new float[]{0.0f, 0.5f, 1.0f};
            } else if (this.f17256y != null && this.f17222A != null) {
                this.f17226E = new int[]{this.f17223B, this.f17225D};
                this.f17227F = new float[]{0.0f, 1.0f};
            } else if (this.f17256y != null && this.f17257z != null) {
                this.f17226E = new int[]{this.f17223B, this.f17224C};
                this.f17227F = new float[]{0.0f, 0.5f};
            } else if (!(this.f17257z == null || this.f17222A == null)) {
                this.f17226E = new int[]{this.f17224C, this.f17225D};
                this.f17227F = new float[]{0.5f, 1.0f};
            }
            invalidate();
        }
    }

    public void invalidate() {
        postInvalidate();
    }

    public void postInvalidate() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            super.postInvalidate();
        } else {
            super.invalidate();
        }
    }
}
