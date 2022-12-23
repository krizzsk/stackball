package com.p243my.target;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p243my.target.C7353c9;
import com.p243my.target.instreamads.InstreamAdPlayer;

/* renamed from: com.my.target.t5 */
public class C7673t5 extends FrameLayout implements InstreamAdPlayer, C7353c9.C7354a {

    /* renamed from: a */
    public final C7757y5 f19377a;

    /* renamed from: b */
    public boolean f19378b;

    /* renamed from: c */
    public InstreamAdPlayer.AdPlayerListener f19379c;

    /* renamed from: d */
    public int f19380d;

    /* renamed from: e */
    public int f19381e;

    /* renamed from: f */
    public boolean f19382f;

    /* renamed from: g */
    public boolean f19383g;

    /* renamed from: h */
    public C7353c9 f19384h;

    public C7673t5(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7673t5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7673t5(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new C7757y5(context));
    }

    public C7673t5(Context context, AttributeSet attributeSet, int i, C7757y5 y5Var) {
        super(context, attributeSet, i);
        this.f19378b = true;
        this.f19377a = y5Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(y5Var, layoutParams);
    }

    /* renamed from: a */
    public void mo49870a(float f) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f19379c;
        if (adPlayerListener != null) {
            adPlayerListener.onVolumeChanged(f);
        }
    }

    /* renamed from: a */
    public void mo49871a(float f, float f2) {
    }

    /* renamed from: a */
    public void mo49872a(String str) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f19379c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoError(str);
        }
    }

    public void destroy() {
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            c9Var.destroy();
        }
    }

    /* renamed from: f */
    public void mo49873f() {
        this.f19383g = true;
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f19379c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoPaused();
        }
    }

    /* renamed from: g */
    public void mo49874g() {
    }

    public InstreamAdPlayer.AdPlayerListener getAdPlayerListener() {
        return this.f19379c;
    }

    public float getAdVideoDuration() {
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            return c9Var.mo49866m();
        }
        return 0.0f;
    }

    public float getAdVideoPosition() {
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            return ((float) c9Var.mo49867n()) / 1000.0f;
        }
        return 0.0f;
    }

    public int getPlaceholderHeight() {
        return this.f19381e;
    }

    public int getPlaceholderWidth() {
        return this.f19380d;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo49875h() {
        if (this.f19383g) {
            InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f19379c;
            if (adPlayerListener != null) {
                adPlayerListener.onAdVideoResumed();
            }
            this.f19383g = false;
        }
    }

    /* renamed from: j */
    public void mo49876j() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f19379c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoStopped();
        }
    }

    /* renamed from: l */
    public void mo49877l() {
    }

    /* renamed from: o */
    public void mo49878o() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener;
        if (!this.f19382f && (adPlayerListener = this.f19379c) != null) {
            adPlayerListener.onAdVideoStarted();
            this.f19382f = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r9 > r1) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r9 > r3) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r9 > r1) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r3 = java.lang.Math.round(((float) r1) / r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        if (r9 > r3) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        r1 = java.lang.Math.round(((float) r3) * r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0016
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0016:
            if (r2 != 0) goto L_0x001a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x001a:
            int r5 = r7.f19381e
            if (r5 == 0) goto L_0x0092
            int r6 = r7.f19380d
            if (r6 != 0) goto L_0x0024
            goto L_0x0092
        L_0x0024:
            float r8 = (float) r6
            float r9 = (float) r5
            float r8 = r8 / r9
            r9 = 0
            if (r3 == 0) goto L_0x002d
            float r9 = (float) r1
            float r5 = (float) r3
            float r9 = r9 / r5
        L_0x002d:
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r0 != r6) goto L_0x0035
            if (r2 != r6) goto L_0x0035
            goto L_0x0086
        L_0x0035:
            if (r0 != r4) goto L_0x0056
            if (r2 != r4) goto L_0x0056
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0049
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L_0x006c
            if (r9 <= r1) goto L_0x006c
            goto L_0x0065
        L_0x0049:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L_0x0054
            if (r9 <= r3) goto L_0x0054
            goto L_0x007c
        L_0x0054:
            r3 = r9
            goto L_0x0086
        L_0x0056:
            if (r0 != r4) goto L_0x006e
            if (r2 != r6) goto L_0x006e
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L_0x006c
            if (r9 <= r1) goto L_0x006c
        L_0x0065:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r3 = java.lang.Math.round(r9)
            goto L_0x0086
        L_0x006c:
            r1 = r9
            goto L_0x0086
        L_0x006e:
            if (r0 != r6) goto L_0x0084
            if (r2 != r4) goto L_0x0084
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L_0x0054
            if (r9 <= r3) goto L_0x0054
        L_0x007c:
            float r9 = (float) r3
            float r9 = r9 * r8
            int r1 = java.lang.Math.round(r9)
            goto L_0x0086
        L_0x0084:
            r1 = 0
            r3 = 0
        L_0x0086:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            super.onMeasure(r8, r9)
            return
        L_0x0092:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7673t5.onMeasure(int, int):void");
    }

    public void onVideoCompleted() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f19379c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoCompleted();
        }
    }

    public void pauseAdVideo() {
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            c9Var.mo49854b();
        }
    }

    public void playAdVideo(Uri uri, int i, int i2) {
        this.f19380d = i;
        this.f19381e = i2;
        this.f19382f = false;
        if (this.f19384h == null) {
            C7353c9 p = (!this.f19378b || !C7566n8.m19950a()) ? C7370d9.m18958p() : C7389e9.m19051a(getContext());
            this.f19384h = p;
            p.mo49852a((C7353c9.C7354a) this);
        }
        this.f19377a.mo51888a(i, i2);
        this.f19384h.mo49851a(uri, this.f19377a);
    }

    public void playAdVideo(Uri uri, int i, int i2, float f) {
        playAdVideo(uri, i, i2);
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            c9Var.mo49849a((long) (f * 1000.0f));
        }
    }

    public void resumeAdVideo() {
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            c9Var.mo49848a();
        }
    }

    public void setAdPlayerListener(InstreamAdPlayer.AdPlayerListener adPlayerListener) {
        this.f19379c = adPlayerListener;
    }

    public void setUseExoPlayer(boolean z) {
        this.f19378b = z;
    }

    public void setVideoPlayer(C7389e9 e9Var) {
        this.f19384h = e9Var;
    }

    public void setVolume(float f) {
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            c9Var.setVolume(f);
        }
    }

    public void stopAdVideo() {
        C7353c9 c9Var = this.f19384h;
        if (c9Var != null) {
            c9Var.mo49858e();
        }
    }
}
