package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chartboost.sdk.Libraries.C1830i;

/* renamed from: com.chartboost.sdk.impl.p1 */
public abstract class C1967p1 extends RelativeLayout {

    /* renamed from: a */
    final C1970c f5057a;

    /* renamed from: b */
    private final Rect f5058b;

    /* renamed from: c */
    protected Button f5059c;

    /* renamed from: d */
    boolean f5060d;

    /* renamed from: com.chartboost.sdk.impl.p1$a */
    class C1968a implements View.OnTouchListener {
        C1968a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean a = C1967p1.this.mo14760a(view, motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    if (C1967p1.this.getVisibility() == 0 && C1967p1.this.isEnabled() && a) {
                        C1967p1.this.mo14620a(motionEvent);
                    }
                    C1967p1.this.f5057a.mo14763a(false);
                } else if (actionMasked == 2) {
                    C1967p1.this.f5057a.mo14763a(a);
                } else if (actionMasked == 3 || actionMasked == 4) {
                    C1967p1.this.f5057a.mo14763a(false);
                }
                return true;
            }
            C1967p1.this.f5057a.mo14763a(a);
            return a;
        }
    }

    /* renamed from: com.chartboost.sdk.impl.p1$b */
    class C1969b implements View.OnClickListener {
        C1969b() {
        }

        public void onClick(View view) {
            C1967p1.this.mo14620a((MotionEvent) null);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.p1$c */
    private class C1970c extends C1963o1 {

        /* renamed from: c */
        private boolean f5063c;

        public C1970c(Context context) {
            super(context);
            this.f5063c = false;
            this.f5063c = false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14763a(boolean z) {
            if (!C1967p1.this.f5060d || !z) {
                if (this.f5063c) {
                    if (getDrawable() != null) {
                        getDrawable().clearColorFilter();
                    } else if (getBackground() != null) {
                        getBackground().clearColorFilter();
                    }
                    invalidate();
                    this.f5063c = false;
                }
            } else if (!this.f5063c) {
                if (getDrawable() != null) {
                    getDrawable().setColorFilter(1996488704, PorterDuff.Mode.SRC_ATOP);
                } else if (getBackground() != null) {
                    getBackground().setColorFilter(1996488704, PorterDuff.Mode.SRC_ATOP);
                }
                invalidate();
                this.f5063c = true;
            }
        }

        public boolean performClick() {
            super.performClick();
            return true;
        }
    }

    public C1967p1(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14620a(MotionEvent motionEvent);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14760a(View view, MotionEvent motionEvent) {
        view.getLocalVisibleRect(this.f5058b);
        this.f5058b.left += view.getPaddingLeft();
        this.f5058b.top += view.getPaddingTop();
        this.f5058b.right -= view.getPaddingRight();
        this.f5058b.bottom -= view.getPaddingBottom();
        return this.f5058b.contains(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
    }

    public C1967p1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5058b = new Rect();
        this.f5059c = null;
        this.f5060d = true;
        C1970c cVar = new C1970c(getContext());
        this.f5057a = cVar;
        cVar.setOnTouchListener(new C1968a());
        addView(this.f5057a, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo14758a(String str) {
        if (str != null) {
            mo14755a().setText(str);
            addView(mo14755a(), new RelativeLayout.LayoutParams(-1, -1));
            this.f5057a.setVisibility(8);
            mo14759a(false);
            this.f5059c.setOnClickListener(new C1969b());
        } else if (this.f5059c != null) {
            removeView(mo14755a());
            this.f5059c = null;
            this.f5057a.setVisibility(0);
            mo14759a(true);
        }
    }

    /* renamed from: a */
    public TextView mo14755a() {
        if (this.f5059c == null) {
            Button button = new Button(getContext());
            this.f5059c = button;
            button.setGravity(17);
        }
        this.f5059c.postInvalidate();
        return this.f5059c;
    }

    /* renamed from: a */
    public void mo14757a(C1830i iVar) {
        if (iVar != null && iVar.mo14248e()) {
            this.f5057a.mo14746a(iVar);
            mo14758a((String) null);
        }
    }

    /* renamed from: a */
    public void mo14756a(ImageView.ScaleType scaleType) {
        this.f5057a.setScaleType(scaleType);
    }

    /* renamed from: a */
    public void mo14759a(boolean z) {
        this.f5060d = z;
    }
}
