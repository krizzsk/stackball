package com.p243my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* renamed from: com.my.target.c6 */
public class C7346c6 extends FrameLayout {

    /* renamed from: a */
    public final int f18404a;

    /* renamed from: b */
    public final BitmapDrawable f18405b;

    /* renamed from: c */
    public final int f18406c;

    /* renamed from: d */
    public final int f18407d;

    /* renamed from: e */
    public final int f18408e;

    /* renamed from: f */
    public final Rect f18409f = new Rect();

    /* renamed from: g */
    public final Rect f18410g = new Rect();

    /* renamed from: h */
    public final Rect f18411h = new Rect();

    /* renamed from: i */
    public final Rect f18412i = new Rect();

    /* renamed from: j */
    public C7347a f18413j;

    /* renamed from: k */
    public boolean f18414k;

    /* renamed from: l */
    public boolean f18415l;

    /* renamed from: m */
    public int f18416m = 8388661;

    /* renamed from: com.my.target.c6$a */
    public interface C7347a {
        /* renamed from: d */
        void mo49437d();
    }

    public C7346c6(Context context) {
        super(context);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C7607p5.m20092a(C7761y8.m20950c(context).mo51902b(30)));
        this.f18405b = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.f18404a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f18406c = C7761y8.m20931a(50, context);
        this.f18407d = C7761y8.m20931a(30, context);
        this.f18408e = C7761y8.m20931a(8, context);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void mo49813a() {
        playSoundEffect(0);
        C7347a aVar = this.f18413j;
        if (aVar != null) {
            aVar.mo49437d();
        }
    }

    /* renamed from: a */
    public final void mo49814a(int i, Rect rect, Rect rect2) {
        Gravity.apply(this.f18416m, i, i, rect, rect2);
    }

    /* renamed from: a */
    public boolean mo49815a(int i, int i2, int i3) {
        Rect rect = this.f18410g;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    /* renamed from: b */
    public void mo49816b(int i, Rect rect, Rect rect2) {
        int i2 = this.f18407d;
        Gravity.apply(i, i2, i2, rect, rect2);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f18414k) {
            this.f18414k = false;
            this.f18409f.set(0, 0, getWidth(), getHeight());
            mo49814a(this.f18406c, this.f18409f, this.f18410g);
            this.f18412i.set(this.f18410g);
            Rect rect = this.f18412i;
            int i = this.f18408e;
            rect.inset(i, i);
            mo49814a(this.f18407d, this.f18412i, this.f18411h);
            this.f18405b.setBounds(this.f18411h);
        }
        if (this.f18405b.isVisible()) {
            this.f18405b.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return mo49815a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f18414k = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r5 != 3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getX()
            int r0 = (int) r0
            float r1 = r5.getY()
            int r1 = (int) r1
            android.graphics.drawable.BitmapDrawable r2 = r4.f18405b
            boolean r2 = r2.isVisible()
            r3 = 0
            if (r2 == 0) goto L_0x0035
            int r2 = r4.f18404a
            boolean r0 = r4.mo49815a((int) r0, (int) r1, (int) r2)
            if (r0 == 0) goto L_0x0035
            int r5 = r5.getAction()
            r0 = 1
            if (r5 == 0) goto L_0x0032
            if (r5 == r0) goto L_0x0028
            r1 = 3
            if (r5 == r1) goto L_0x002f
            goto L_0x0034
        L_0x0028:
            boolean r5 = r4.f18415l
            if (r5 == 0) goto L_0x0034
            r4.mo49813a()
        L_0x002f:
            r4.f18415l = r3
            goto L_0x0034
        L_0x0032:
            r4.f18415l = r0
        L_0x0034:
            return r0
        L_0x0035:
            super.onTouchEvent(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7346c6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCloseBounds(Rect rect) {
        this.f18410g.set(rect);
    }

    public void setCloseGravity(int i) {
        this.f18416m = i;
    }

    public void setCloseVisible(boolean z) {
        C7761y8.m20940a((View) this, z ? "close_button" : "closeable_layout");
        if (this.f18405b.setVisible(z, false)) {
            invalidate(this.f18410g);
        }
    }

    public void setOnCloseListener(C7347a aVar) {
        this.f18413j = aVar;
    }
}
