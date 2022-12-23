package com.fyber.inneractive.sdk.player.p083e;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.p056m.C3037c;
import com.fyber.inneractive.sdk.p084ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.C3617a;
import com.fyber.inneractive.sdk.util.C3630ak;
import com.fyber.inneractive.sdk.util.C3644b;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.videokit.C3708R;

/* renamed from: com.fyber.inneractive.sdk.player.e.g */
public abstract class C3602g extends C3596a {

    /* renamed from: A */
    C3630ak f9798A;

    /* renamed from: B */
    public int f9799B;

    /* renamed from: C */
    public int f9800C;

    /* renamed from: D */
    public Runnable f9801D;

    /* renamed from: E */
    private boolean f9802E;

    /* renamed from: F */
    private C3630ak f9803F;

    /* renamed from: i */
    protected ImageView f9804i;

    /* renamed from: j */
    protected ViewGroup f9805j;

    /* renamed from: k */
    protected TextView f9806k;

    /* renamed from: l */
    protected Button f9807l;

    /* renamed from: m */
    public TextView f9808m;

    /* renamed from: n */
    protected TextView f9809n;

    /* renamed from: o */
    protected View f9810o;

    /* renamed from: p */
    protected int f9811p;

    /* renamed from: q */
    protected int f9812q;

    /* renamed from: r */
    boolean f9813r;

    /* renamed from: s */
    public ImageView f9814s;

    /* renamed from: t */
    public ImageView f9815t;

    /* renamed from: u */
    public IAsmoothProgressBar f9816u;

    /* renamed from: v */
    protected View f9817v;

    /* renamed from: w */
    protected View f9818w;

    /* renamed from: x */
    protected ViewGroup f9819x;

    /* renamed from: y */
    protected View f9820y;

    /* renamed from: z */
    C3630ak f9821z;

    /* renamed from: d */
    public abstract void mo19494d();

    public C3602g(Context context) {
        this(context, (byte) 0);
    }

    private C3602g(Context context, byte b) {
        this(context, 0);
    }

    private C3602g(Context context, char c) {
        super(context);
        this.f9811p = -1;
        this.f9812q = -1;
        this.f9813r = false;
        this.f9802E = false;
        this.f9821z = new C3630ak(0, 0);
        this.f9803F = new C3630ak(0, 0);
        IAlog.m9034b("%sctor called", IAlog.m9029a((Object) this));
        LayoutInflater.from(context).inflate(C3708R.layout.ia_video_view, this, true);
        setBackgroundColor(getResources().getColor(C3708R.color.ia_video_background_color));
        this.f9804i = (ImageView) findViewById(C3708R.C3710id.ia_iv_last_frame);
        this.f9805j = (ViewGroup) findViewById(C3708R.C3710id.ia_texture_view_host);
        this.f9814s = (ImageView) findViewById(C3708R.C3710id.ia_iv_mute_button);
        this.f9806k = (TextView) findViewById(C3708R.C3710id.ia_tv_call_to_action);
        this.f9815t = (ImageView) findViewById(C3708R.C3710id.ia_iv_expand_collapse_button);
        this.f9808m = (TextView) findViewById(C3708R.C3710id.ia_tv_remaining_time);
        this.f9816u = (IAsmoothProgressBar) findViewById(C3708R.C3710id.ia_video_progressbar);
        this.f9818w = findViewById(C3708R.C3710id.ia_default_endcard_video_overlay);
        this.f9819x = (ViewGroup) findViewById(C3708R.C3710id.ia_endcard_video_overlay);
        this.f9817v = findViewById(C3708R.C3710id.ia_paused_video_overlay);
        this.f9820y = findViewById(C3708R.C3710id.ia_buffering_overlay);
        this.f9809n = (TextView) findViewById(C3708R.C3710id.ia_tv_skip);
        this.f9807l = (Button) findViewById(C3708R.C3710id.ia_b_end_card_call_to_action);
        m8980a((View) this.f9814s, 1);
        m8980a((View) this.f9806k, 3);
        m8980a((View) this.f9807l, 8);
        m8980a((View) this.f9815t, 5);
        m8980a((View) this.f9805j, 7);
        m8980a((View) this.f9809n, 6);
        m8980a(this.f9817v, 9);
        m8980a(findViewById(C3708R.C3710id.ia_default_endcard_video_overlay), -1);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public ViewGroup getTextureHost() {
        return this.f9805j;
    }

    /* renamed from: a */
    public final void mo19498a(int i, int i2, boolean z) {
        this.f9811p = i;
        this.f9812q = i2;
        this.f9813r = z;
    }

    /* renamed from: a */
    public final void mo19501a(boolean z) {
        ImageView imageView;
        ImageView imageView2;
        if (this.f9804i != null) {
            ViewGroup viewGroup = this.f9819x;
            int i = 0;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                imageView = this.f9804i;
                if (!z) {
                    imageView2 = imageView;
                }
                imageView.setVisibility(i);
            }
            IAlog.m9034b("end card is visible and requested to show last frame image with value of %s", Boolean.valueOf(z));
            imageView2 = this.f9804i;
            i = 8;
            imageView = imageView2;
            imageView.setVisibility(i);
        }
    }

    /* renamed from: f */
    public final void mo19508f() {
        ViewGroup viewGroup = this.f9805j;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void mo19503b(boolean z) {
        ImageView imageView = this.f9814s;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    public void setMuteButtonState(boolean z) {
        this.f9814s.setSelected(z);
    }

    /* renamed from: a */
    public final void mo19502a(boolean z, boolean z2) {
        TextView textView = this.f9806k;
        if (textView != null) {
            textView.setAllCaps(z2);
            this.f9806k.setText(C3708R.string.ia_video_install_now_text);
            this.f9806k.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: c */
    public final void mo19505c(boolean z) {
        IAsmoothProgressBar iAsmoothProgressBar = this.f9816u;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: d */
    public final void mo19506d(boolean z) {
        TextView textView = this.f9808m;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: g */
    public final void mo19510g() {
        ImageView imageView = this.f9815t;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f9815t.setSelected(true);
        }
    }

    /* renamed from: e */
    public final void mo19507e(boolean z) {
        TextView textView = this.f9809n;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    public void setSkipText(String str) {
        TextView textView = this.f9809n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: h */
    public final void mo19516h() {
        TextView textView = this.f9809n;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* renamed from: i */
    public final boolean mo19517i() {
        TextView textView = this.f9809n;
        return textView != null && textView.getVisibility() == 0 && this.f9809n.isEnabled();
    }

    /* renamed from: f */
    public final void mo19509f(boolean z) {
        View view = this.f9817v;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo19499a(View view) {
        this.f9810o = view;
        if (view != null && this.f9819x != null) {
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            this.f9819x.setVisibility(0);
            this.f9819x.addView(view, 0);
            if (!(view instanceof C3037c)) {
                m8980a(view, 4);
            }
        }
    }

    /* renamed from: b */
    public final void mo19504b(boolean z, boolean z2) {
        View view = this.f9818w;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            this.f9807l.setAllCaps(z2);
            this.f9807l.setText(C3708R.string.ia_video_install_now_text);
            UnitDisplayType h = this.f9791c.mo18070g().mo18080h();
            if (h.equals(UnitDisplayType.LANDSCAPE) || h.equals(UnitDisplayType.MRECT)) {
                this.f9807l.setBackgroundResource(C3708R.C3709drawable.bg_green_medium);
                this.f9807l.setTextSize(0, getResources().getDimension(C3708R.dimen.ia_video_overlay_text_large));
            } else {
                this.f9807l.setBackgroundResource(C3708R.C3709drawable.bg_green);
                this.f9807l.setTextSize(0, getResources().getDimension(C3708R.dimen.ia_video_overlay_text_large_plus));
            }
            this.f9807l.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8979a(Bitmap bitmap) {
        if (bitmap != null) {
            C3630ak akVar = new C3630ak(0, 0);
            mo19500a(akVar, bitmap.getWidth(), bitmap.getHeight(), this.f9821z.f9896a, this.f9821z.f9897b);
            ImageView imageView = this.f9804i;
            if (imageView != null) {
                imageView.getLayoutParams().width = akVar.f9896a;
                this.f9804i.getLayoutParams().height = akVar.f9897b;
            }
        }
    }

    public void setLastFrameBitmapBlurred(Bitmap bitmap) {
        if (this.f9804i != null && bitmap != null) {
            C3644b bVar = new C3644b();
            bVar.f9924c = 20;
            bVar.f9925d = 1;
            bVar.f9922a = bitmap.getWidth();
            bVar.f9923b = bitmap.getHeight();
            this.f9804i.setImageBitmap(C3617a.m9040a(getContext(), bitmap, bVar));
        }
    }

    /* renamed from: g */
    public final void mo19511g(boolean z) {
        View view = this.f9820y;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public int getVideoWidth() {
        return this.f9811p;
    }

    public int getVideoHeight() {
        return this.f9812q;
    }

    public void setRemainingTime(String str) {
        TextView textView = this.f9808m;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo19484a() {
        super.mo19484a();
        IAlog.m9034b("%sdestroyed called", IAlog.m9029a((Object) this));
        Runnable runnable = this.f9801D;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f9801D = null;
        }
        ViewGroup viewGroup = this.f9805j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    /* renamed from: a */
    private void m8980a(final View view, final int i) {
        if (view != null) {
            final int[] iArr = new int[2];
            final GestureDetector gestureDetector = new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() {
                public final boolean onDown(MotionEvent motionEvent) {
                    return true;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    return true;
                }

                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.getRootView().getLocationOnScreen(iArr);
                        C3602g.this.f9789a.mo19549a(motionEvent.getRawX() - ((float) iArr[0]), motionEvent.getRawY() - ((float) iArr[1]));
                    }
                    if (C3602g.this.f9795g != null) {
                        C3602g.this.f9795g.mo18851a(i, C3602g.this.f9789a);
                    }
                    return true;
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo19485a(this.f9803F, size, size2);
        if (this.f9803F.f9896a <= 0 || this.f9803F.f9897b <= 0) {
            this.f9803F.f9896a = size;
            this.f9803F.f9897b = size2;
        } else {
            i = View.MeasureSpec.makeMeasureSpec(this.f9803F.f9896a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f9803F.f9897b, 1073741824);
        }
        if (!this.f9821z.equals(this.f9803F)) {
            C3630ak akVar = this.f9821z;
            C3630ak akVar2 = this.f9803F;
            akVar.f9896a = akVar2.f9896a;
            akVar.f9897b = akVar2.f9897b;
            mo19494d();
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19500a(C3630ak akVar, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2;
            if (this.f9792d == UnitDisplayType.SQUARE) {
                i3 = (int) (((float) i4) * f3);
            } else {
                if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                    Math.abs(f3 - 1.3333334f);
                }
                float min = Math.min(((float) i3) / f, 10.0f);
                float f4 = (float) i4;
                float f5 = min * f2;
                if (f4 > f5) {
                    i3 = (int) (min * f);
                    i4 = (int) f5;
                } else {
                    float min2 = Math.min(f4 / f2, 10.0f);
                    i4 = (int) (min2 * f2);
                    i3 = (int) (f * min2);
                }
            }
        }
        akVar.f9896a = i3;
        akVar.f9897b = i4;
    }

    public View getEndCardView() {
        return this.f9810o;
    }

    /* renamed from: e */
    public final boolean mo19496e() {
        return this.f9818w.getVisibility() == 0 || this.f9819x.getChildCount() > 0;
    }

    public void setLastFrameBitmap(final Bitmap bitmap) {
        IAlog.m9034b("%ssetLastFrameBitmap - %s", IAlog.m9029a((Object) this), bitmap);
        ImageView imageView = this.f9804i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        if (this.f9821z.f9896a == 0 || this.f9821z.f9897b == 0) {
            mo19501a(false);
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (C3602g.this.getWidth() > 0 && C3602g.this.getHeight() > 0) {
                        C3602g.this.mo19501a(true);
                        C3602g.this.removeOnLayoutChangeListener(this);
                        C3602g.this.m8979a(bitmap);
                    }
                }
            });
            return;
        }
        m8979a(bitmap);
    }
}
