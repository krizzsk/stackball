package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.C1892h;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.C1830i;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.impl.C1927i0;
import com.chartboost.sdk.impl.C1945l1;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.o0 */
public class C1957o0 extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: o */
    private static final CharSequence f5029o = "00:00";

    /* renamed from: a */
    final RelativeLayout f5030a;

    /* renamed from: b */
    final C1954n0 f5031b;

    /* renamed from: c */
    final C1954n0 f5032c;

    /* renamed from: d */
    final C1967p1 f5033d;

    /* renamed from: e */
    final TextView f5034e;

    /* renamed from: f */
    final C1940k0 f5035f;

    /* renamed from: g */
    final C1945l1 f5036g;

    /* renamed from: h */
    final C1927i0 f5037h;

    /* renamed from: i */
    private boolean f5038i = false;

    /* renamed from: j */
    private boolean f5039j = false;

    /* renamed from: k */
    final Handler f5040k;

    /* renamed from: l */
    private final Runnable f5041l = new C1959b();

    /* renamed from: m */
    private final Runnable f5042m = new C1960c();

    /* renamed from: n */
    final Runnable f5043n = new C1961d();

    /* renamed from: com.chartboost.sdk.impl.o0$a */
    class C1958a extends C1967p1 {
        C1958a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14620a(MotionEvent motionEvent) {
            C1957o0.this.f5037h.mo14523a(C1825e.m4025a(C1825e.m4023a("x", (Object) Float.valueOf(motionEvent.getX())), C1825e.m4023a("y", (Object) Float.valueOf(motionEvent.getY())), C1825e.m4023a("w", (Object) Integer.valueOf(C1957o0.this.f5033d.getWidth())), C1825e.m4023a("h", (Object) Integer.valueOf(C1957o0.this.f5033d.getHeight()))));
        }
    }

    /* renamed from: com.chartboost.sdk.impl.o0$b */
    class C1959b implements Runnable {
        C1959b() {
        }

        public void run() {
            C1957o0.this.mo14730d(false);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.o0$c */
    class C1960c implements Runnable {
        C1960c() {
        }

        public void run() {
            C1954n0 n0Var = C1957o0.this.f5031b;
            if (n0Var != null) {
                n0Var.setVisibility(8);
            }
            C1957o0 o0Var = C1957o0.this;
            if (o0Var.f5037h.f4906S) {
                o0Var.f5035f.setVisibility(8);
            }
            C1957o0.this.f5032c.setVisibility(8);
            C1967p1 p1Var = C1957o0.this.f5033d;
            if (p1Var != null) {
                p1Var.setEnabled(false);
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.o0$d */
    class C1961d implements Runnable {

        /* renamed from: a */
        private int f5047a = 0;

        C1961d() {
        }

        public void run() {
            C1927i0.C1929b o = C1957o0.this.f5037h.mo14532i();
            if (o != null) {
                if (C1957o0.this.f5036g.mo14694a().mo14659c()) {
                    int d = C1957o0.this.f5036g.mo14694a().mo14660d();
                    if (d > 0) {
                        C1927i0 i0Var = C1957o0.this.f5037h;
                        i0Var.f4916z = d;
                        if (((float) d) / 1000.0f > 0.0f && !i0Var.mo14634s()) {
                            C1957o0.this.f5037h.mo14637v();
                            C1957o0.this.f5037h.mo14629a(true);
                        }
                    }
                    float b = ((float) d) / ((float) C1957o0.this.f5036g.mo14694a().mo14658b());
                    C1957o0 o0Var = C1957o0.this;
                    if (o0Var.f5037h.f4906S) {
                        o0Var.f5035f.mo14672a(b);
                    }
                    int i = d / 1000;
                    if (this.f5047a != i) {
                        this.f5047a = i;
                        C1957o0.this.f5034e.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}));
                    }
                }
                if (o.mo14643f()) {
                    C1967p1 c = o.mo14639c(true);
                    if (c.getVisibility() == 8) {
                        C1957o0.this.f5037h.mo14521a(true, (View) c);
                        c.setEnabled(true);
                    }
                }
                C1957o0 o0Var2 = C1957o0.this;
                o0Var2.f5040k.removeCallbacks(o0Var2.f5043n);
                C1957o0 o0Var3 = C1957o0.this;
                o0Var3.f5040k.postDelayed(o0Var3.f5043n, 16);
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.o0$e */
    class C1962e implements Runnable {
        C1962e() {
        }

        public void run() {
            C1957o0.this.f5036g.setVisibility(0);
        }
    }

    public C1957o0(Context context, C1927i0 i0Var) {
        super(context);
        this.f5037h = i0Var;
        this.f5040k = i0Var.f4711a;
        JSONObject e = i0Var.mo14528e();
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = 10.0f * f;
        int round = Math.round(f2);
        C1892h a = C1892h.m4431a();
        this.f5036g = (C1945l1) a.mo14549a(new C1945l1(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        addView(this.f5036g, layoutParams);
        this.f5030a = (RelativeLayout) a.mo14549a(new RelativeLayout(context));
        if (e == null || e.isNull("video-click-button")) {
            this.f5031b = null;
            this.f5033d = null;
        } else {
            C1954n0 n0Var = (C1954n0) a.mo14549a(new C1954n0(context));
            this.f5031b = n0Var;
            n0Var.setVisibility(8);
            C1958a aVar = new C1958a(context);
            this.f5033d = aVar;
            aVar.mo14756a(ImageView.ScaleType.FIT_CENTER);
            C1830i iVar = i0Var.f4902O;
            Point b = i0Var.mo14625b("video-click-button");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = Math.round(((float) b.x) / iVar.mo14242a());
            layoutParams2.topMargin = Math.round(((float) b.y) / iVar.mo14242a());
            i0Var.mo14624a(layoutParams2, iVar, 1.0f);
            this.f5033d.mo14757a(iVar);
            this.f5031b.addView(this.f5033d, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, Math.round(((float) layoutParams2.height) + f2));
            layoutParams3.addRule(10);
            this.f5030a.addView(this.f5031b, layoutParams3);
        }
        C1954n0 n0Var2 = (C1954n0) a.mo14549a(new C1954n0(context));
        this.f5032c = n0Var2;
        n0Var2.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, Math.round(f * 32.5f));
        layoutParams4.addRule(12);
        this.f5030a.addView(this.f5032c, layoutParams4);
        this.f5032c.setGravity(16);
        this.f5032c.setPadding(round, round, round, round);
        TextView textView = (TextView) a.mo14549a(new TextView(context));
        this.f5034e = textView;
        textView.setTextColor(-1);
        this.f5034e.setTextSize(2, 11.0f);
        this.f5034e.setText(f5029o);
        this.f5034e.setPadding(0, 0, round, 0);
        this.f5034e.setSingleLine();
        this.f5034e.measure(0, 0);
        int measuredWidth = this.f5034e.getMeasuredWidth();
        this.f5034e.setGravity(17);
        this.f5032c.addView(this.f5034e, new LinearLayout.LayoutParams(measuredWidth, -1));
        C1940k0 k0Var = (C1940k0) a.mo14549a(new C1940k0(context));
        this.f5035f = k0Var;
        k0Var.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, Math.round(f2));
        layoutParams5.setMargins(0, CBUtility.m4000a(1, context), 0, 0);
        this.f5032c.addView(this.f5035f, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(6, this.f5036g.getId());
        layoutParams6.addRule(8, this.f5036g.getId());
        layoutParams6.addRule(5, this.f5036g.getId());
        layoutParams6.addRule(7, this.f5036g.getId());
        addView(this.f5030a, layoutParams6);
        mo14734h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14724a(boolean z, boolean z2) {
        C1954n0 n0Var;
        this.f5040k.removeCallbacks(this.f5041l);
        this.f5040k.removeCallbacks(this.f5042m);
        C1927i0 i0Var = this.f5037h;
        if (i0Var.f4892E && i0Var.mo14633r() && z != this.f5038i) {
            this.f5038i = z;
            AlphaAnimation alphaAnimation = z ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(z2 ? 100 : 200);
            alphaAnimation.setFillAfter(true);
            if (!this.f5039j && (n0Var = this.f5031b) != null) {
                n0Var.setVisibility(0);
                this.f5031b.startAnimation(alphaAnimation);
                C1967p1 p1Var = this.f5033d;
                if (p1Var != null) {
                    p1Var.setEnabled(true);
                }
            }
            if (this.f5037h.f4906S) {
                this.f5035f.setVisibility(0);
            }
            this.f5032c.setVisibility(0);
            this.f5032c.startAnimation(alphaAnimation);
            if (this.f5038i) {
                this.f5040k.postDelayed(this.f5041l, 3000);
            } else {
                this.f5040k.postDelayed(this.f5042m, alphaAnimation.getDuration());
            }
        }
    }

    /* renamed from: b */
    public void mo14726b(boolean z) {
        setBackgroundColor(z ? ViewCompat.MEASURED_STATE_MASK : 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (!z) {
            layoutParams.addRule(6, this.f5036g.getId());
            layoutParams.addRule(8, this.f5036g.getId());
            layoutParams.addRule(5, this.f5036g.getId());
            layoutParams.addRule(7, this.f5036g.getId());
        }
        this.f5030a.setLayoutParams(layoutParams);
        C1954n0 n0Var = this.f5031b;
        if (n0Var != null) {
            n0Var.setGravity(8388627);
            this.f5031b.requestLayout();
        }
    }

    /* renamed from: c */
    public void mo14728c(boolean z) {
        this.f5034e.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14730d(boolean z) {
        mo14724a(!this.f5038i, z);
    }

    /* renamed from: e */
    public void mo14731e() {
        if (this.f5036g.mo14694a().mo14659c()) {
            this.f5037h.f4916z = this.f5036g.mo14694a().mo14660d();
        }
        this.f5036g.mo14694a().mo14661e();
        this.f5040k.removeCallbacks(this.f5043n);
    }

    /* renamed from: f */
    public void mo14732f() {
        this.f5040k.postDelayed(new C1962e(), 500);
        this.f5036g.mo14694a().mo14650a();
        this.f5040k.removeCallbacks(this.f5043n);
        this.f5040k.postDelayed(this.f5043n, 16);
    }

    /* renamed from: g */
    public void mo14733g() {
        if (this.f5036g.mo14694a().mo14659c()) {
            this.f5037h.f4916z = this.f5036g.mo14694a().mo14660d();
            this.f5036g.mo14694a().mo14661e();
        }
        if (this.f5037h.mo14532i().f4881l.getVisibility() == 0) {
            this.f5037h.mo14532i().f4881l.postInvalidate();
        }
        this.f5040k.removeCallbacks(this.f5043n);
    }

    /* renamed from: h */
    public void mo14734h() {
        mo14726b(CBUtility.m4009b(CBUtility.m4006b(getContext())));
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f5037h.f4916z = this.f5036g.mo14694a().mo14658b();
        if (this.f5037h.mo14532i() != null) {
            this.f5037h.mo14532i().mo14641e();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5040k.removeCallbacks(this.f5043n);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f5037h.mo14636u();
        return false;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f5037h.f4888A = this.f5036g.mo14694a().mo14658b();
        this.f5037h.mo14532i().mo14542a(true);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5036g.mo14694a().mo14659c() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (this.f5037h != null) {
            mo14730d(true);
        }
        return true;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        C1967p1 p1Var = this.f5033d;
        if (p1Var != null) {
            p1Var.setEnabled(z);
        }
        if (z) {
            mo14723a(false);
        }
    }

    /* renamed from: c */
    public void mo14727c() {
        this.f5036g.setVisibility(8);
        invalidate();
    }

    /* renamed from: d */
    public void mo14729d() {
        C1954n0 n0Var = this.f5031b;
        if (n0Var != null) {
            n0Var.setVisibility(8);
        }
        this.f5039j = true;
        C1967p1 p1Var = this.f5033d;
        if (p1Var != null) {
            p1Var.setEnabled(false);
        }
    }

    /* renamed from: b */
    public C1940k0 mo14725b() {
        return this.f5035f;
    }

    /* renamed from: a */
    public void mo14723a(boolean z) {
        C1954n0 n0Var;
        this.f5040k.removeCallbacks(this.f5041l);
        this.f5040k.removeCallbacks(this.f5042m);
        if (z) {
            if (!this.f5039j && (n0Var = this.f5031b) != null) {
                n0Var.setVisibility(0);
            }
            if (this.f5037h.f4906S) {
                this.f5035f.setVisibility(0);
            }
            this.f5032c.setVisibility(0);
            C1967p1 p1Var = this.f5033d;
            if (p1Var != null) {
                p1Var.setEnabled(true);
            }
        } else {
            C1954n0 n0Var2 = this.f5031b;
            if (n0Var2 != null) {
                n0Var2.clearAnimation();
                this.f5031b.setVisibility(8);
            }
            this.f5032c.clearAnimation();
            if (this.f5037h.f4906S) {
                this.f5035f.setVisibility(8);
            }
            this.f5032c.setVisibility(8);
            C1967p1 p1Var2 = this.f5033d;
            if (p1Var2 != null) {
                p1Var2.setEnabled(false);
            }
        }
        this.f5038i = z;
    }

    /* renamed from: a */
    public C1945l1.C1946a mo14720a() {
        return this.f5036g.mo14694a();
    }

    /* renamed from: a */
    public void mo14721a(int i) {
        C1954n0 n0Var = this.f5031b;
        if (n0Var != null) {
            n0Var.setBackgroundColor(i);
        }
        this.f5032c.setBackgroundColor(i);
    }

    /* renamed from: a */
    public void mo14722a(String str) {
        this.f5036g.mo14694a().mo14653a((MediaPlayer.OnCompletionListener) this);
        this.f5036g.mo14694a().mo14654a((MediaPlayer.OnErrorListener) this);
        this.f5036g.mo14694a().mo14655a((MediaPlayer.OnPreparedListener) this);
        this.f5036g.mo14694a().mo14656a(Uri.parse(str));
    }
}
