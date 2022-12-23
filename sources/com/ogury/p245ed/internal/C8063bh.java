package com.ogury.p245ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bh */
public final class C8063bh implements C8066bk {

    /* renamed from: a */
    private final Rect f20935a;

    /* renamed from: b */
    private final Rect f20936b;

    /* renamed from: c */
    private final float f20937c;

    public C8063bh(Rect rect, Rect rect2, float f) {
        C8467mq.m23881b(rect, "adLayoutRect");
        C8467mq.m23881b(rect2, "containerRect");
        this.f20935a = rect;
        this.f20936b = rect2;
        this.f20937c = f;
    }

    /* renamed from: a */
    public final void mo53208a(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "adLayoutRect");
        C8467mq.m23881b(rect2, "containerRect");
        mo53209a();
    }

    /* renamed from: a */
    public final boolean mo53209a() {
        return m22456c() || m22457d() || m22458e() || m22459f();
    }

    /* renamed from: c */
    private final boolean m22456c() {
        if (this.f20935a.left < this.f20936b.left) {
            this.f20935a.right += this.f20936b.left - this.f20935a.left;
            this.f20935a.left = this.f20936b.left;
        }
        return m22460g();
    }

    /* renamed from: d */
    private final boolean m22457d() {
        if (this.f20935a.top < this.f20936b.top) {
            this.f20935a.bottom += this.f20936b.top - this.f20935a.top;
            this.f20935a.top = this.f20936b.top;
        }
        return m22460g();
    }

    /* renamed from: e */
    private final boolean m22458e() {
        if (this.f20935a.right > this.f20936b.right) {
            int i = this.f20935a.right - this.f20936b.right;
            this.f20935a.left -= i;
            this.f20935a.right -= i;
        }
        return m22460g();
    }

    /* renamed from: f */
    private final boolean m22459f() {
        if (this.f20935a.bottom > this.f20936b.bottom) {
            int i = this.f20935a.bottom - this.f20936b.bottom;
            this.f20935a.top -= i;
            this.f20935a.bottom -= i;
        }
        return m22460g();
    }

    /* renamed from: g */
    private final boolean m22460g() {
        return mo53210b() >= this.f20937c;
    }

    /* renamed from: b */
    public final float mo53210b() {
        Rect c = C8051ay.m22429c(this.f20935a, this.f20936b);
        if (c == null) {
            return 0.0f;
        }
        return ((float) (c.width() * c.height())) / ((float) (this.f20935a.width() * this.f20935a.height()));
    }
}
