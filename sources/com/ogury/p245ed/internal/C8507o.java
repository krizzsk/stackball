package com.ogury.p245ed.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ogury.p245ed.internal.C8530p;
import java.util.Calendar;

/* renamed from: com.ogury.ed.internal.o */
public final class C8507o<T extends ViewGroup & C8530p> implements C8477n {

    /* renamed from: a */
    public static final C8508a f21720a = new C8508a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8477n f21721f = new C8509b();

    /* renamed from: b */
    private final T f21722b;

    /* renamed from: c */
    private float f21723c;

    /* renamed from: d */
    private float f21724d;

    /* renamed from: e */
    private long f21725e;

    public C8507o(T t) {
        C8467mq.m23881b(t, "adLayout");
        this.f21722b = t;
    }

    /* renamed from: com.ogury.ed.internal.o$a */
    public static final class C8508a {
        public /* synthetic */ C8508a(byte b) {
            this();
        }

        private C8508a() {
        }

        /* renamed from: a */
        public static C8477n m23935a() {
            return C8507o.f21721f;
        }

        /* renamed from: a */
        public static C8477n m23936a(C8248g gVar, boolean z) {
            C8467mq.m23881b(gVar, "adLayout");
            if (z) {
                return new C8507o(gVar);
            }
            return m23935a();
        }
    }

    /* renamed from: com.ogury.ed.internal.o$b */
    public static final class C8509b implements C8477n {
        /* renamed from: a */
        public final boolean mo53982a(MotionEvent motionEvent) {
            C8467mq.m23881b(motionEvent, "ev");
            return false;
        }

        C8509b() {
        }
    }

    /* renamed from: a */
    public final boolean mo53982a(MotionEvent motionEvent) {
        C8467mq.m23881b(motionEvent, "ev");
        if (m23930b(motionEvent)) {
            return false;
        }
        m23928b();
        return true;
    }

    /* renamed from: b */
    private final boolean m23930b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21725e = Calendar.getInstance().getTimeInMillis();
        } else if (action == 1) {
            ((C8530p) this.f21722b).mo53573b();
            if (Calendar.getInstance().getTimeInMillis() - this.f21725e < 200) {
                return true;
            }
            return false;
        }
        m23931c(motionEvent);
        return true;
    }

    /* renamed from: c */
    private final void m23931c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            m23932d(motionEvent);
        } else if (action == 2) {
            m23933e(motionEvent);
        }
    }

    /* renamed from: d */
    private final void m23932d(MotionEvent motionEvent) {
        this.f21723c = this.f21722b.getX() - motionEvent.getRawX();
        this.f21724d = this.f21722b.getY() - motionEvent.getRawY();
    }

    /* renamed from: e */
    private final void m23933e(MotionEvent motionEvent) {
        this.f21722b.bringToFront();
        if (m23927a(motionEvent.getRawX() + this.f21723c + ((float) (this.f21722b.getWidth() / 4)))) {
            this.f21722b.setX(motionEvent.getRawX() + this.f21723c);
        }
        if (m23929b(motionEvent.getRawY() + this.f21724d + ((float) (this.f21722b.getHeight() / 4)))) {
            this.f21722b.setY(motionEvent.getRawY() + this.f21724d);
        }
    }

    /* renamed from: a */
    private final boolean m23927a(float f) {
        return f > 0.0f && f + ((float) (this.f21722b.getWidth() / 2)) < ((float) ((C8530p) this.f21722b).getContainerWidth());
    }

    /* renamed from: b */
    private final boolean m23929b(float f) {
        return f > 0.0f && f + ((float) (this.f21722b.getHeight() / 2)) < ((float) ((C8530p) this.f21722b).getContainerHeight());
    }

    /* renamed from: b */
    private final void m23928b() {
        int childCount = this.f21722b.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = this.f21722b.getChildAt(i);
                if (childAt instanceof C8362jh) {
                    ((C8362jh) childAt).mo53809f();
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
