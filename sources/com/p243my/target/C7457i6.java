package com.p243my.target;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.p243my.target.C7457i6;

/* renamed from: com.my.target.i6 */
public class C7457i6 extends C7307a6 {

    /* renamed from: b */
    public C7458a f18764b;

    /* renamed from: c */
    public boolean f18765c;

    /* renamed from: d */
    public boolean f18766d;

    /* renamed from: e */
    public int f18767e;

    /* renamed from: com.my.target.i6$a */
    public interface C7458a {
        /* renamed from: a */
        void mo50409a(boolean z);

        /* renamed from: c */
        void mo50410c();
    }

    /* renamed from: com.my.target.i6$b */
    public static class C7459b extends GestureDetector {

        /* renamed from: a */
        public final View f18768a;

        /* renamed from: b */
        public C7460a f18769b;

        /* renamed from: com.my.target.i6$b$a */
        public interface C7460a {
            /* renamed from: a */
            void mo49470a();
        }

        public C7459b(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        public C7459b(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f18768a = view;
            setIsLongpressEnabled(false);
        }

        /* renamed from: a */
        public void mo50411a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2 || !mo50413a(motionEvent, this.f18768a)) {
                        return;
                    }
                } else if (this.f18769b != null) {
                    C7374e0.m18989a("Gestures: user clicked");
                    this.f18769b.mo49470a();
                    return;
                } else {
                    C7374e0.m18989a("View's onUserClick() is not registered.");
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo50412a(C7460a aVar) {
            this.f18769b = aVar;
        }

        /* renamed from: a */
        public final boolean mo50413a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }
    }

    public C7457i6(Context context) {
        super(context);
        this.f18765c = getVisibility() == 0;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
        C7459b bVar = new C7459b(getContext(), this);
        bVar.mo50412a((C7459b.C7460a) new C7459b.C7460a() {
            /* renamed from: a */
            public final void mo49470a() {
                C7457i6.this.m19383i();
            }
        });
        setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C7457i6.C7459b.this.mo50411a(motionEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m19383i() {
        this.f18766d = true;
    }

    /* renamed from: a */
    public final void mo50402a(int i, int i2) {
        int i3 = ((float) i) / ((float) i2) > 1.0f ? 2 : 1;
        if (i3 != this.f18767e) {
            this.f18767e = i3;
            C7458a aVar = this.f18764b;
            if (aVar != null) {
                aVar.mo50410c();
            }
        }
    }

    /* renamed from: a */
    public void mo50403a(boolean z) {
        C7374e0.m18989a("MraidWebView: pause, finishing " + z);
        if (z) {
            mo49591f();
            mo49585a("");
        }
        mo49589d();
    }

    /* renamed from: g */
    public boolean mo50404g() {
        return this.f18766d;
    }

    /* renamed from: h */
    public boolean mo50405h() {
        return this.f18765c;
    }

    public void onMeasure(int i, int i2) {
        mo50402a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (z != this.f18765c) {
            this.f18765c = z;
            C7458a aVar = this.f18764b;
            if (aVar != null) {
                aVar.mo50409a(z);
            }
        }
    }

    public void setClicked(boolean z) {
        this.f18766d = z;
    }

    public void setVisibilityChangedListener(C7458a aVar) {
        this.f18764b = aVar;
    }
}
