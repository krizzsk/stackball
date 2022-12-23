package com.ogury.p245ed.internal;

import android.content.res.Configuration;
import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bl */
public final class C8067bl implements C8066bk {

    /* renamed from: a */
    private final Configuration f20940a;

    /* renamed from: b */
    private Rect f20941b = new Rect();

    /* renamed from: c */
    private Rect f20942c = new Rect();

    /* renamed from: d */
    private int f20943d = this.f20940a.orientation;

    public C8067bl(Configuration configuration) {
        C8467mq.m23881b(configuration, "configuration");
        this.f20940a = configuration;
    }

    /* renamed from: a */
    public final void mo53208a(Rect rect, Rect rect2) {
        C8467mq.m23881b(rect, "adLayoutRect");
        C8467mq.m23881b(rect2, "containerRect");
        int i = this.f20940a.orientation;
        if (this.f20943d != i) {
            m22468b(rect, rect2);
            m22469c(rect, rect2);
        }
        this.f20941b = new Rect(rect2);
        this.f20943d = i;
    }

    /* renamed from: b */
    private final void m22468b(Rect rect, Rect rect2) {
        int i = this.f20942c.left - this.f20941b.left;
        int width = this.f20941b.width() - this.f20942c.width();
        if (width != 0) {
            float f = ((float) i) / ((float) width);
            int width2 = rect.width();
            rect.left = rect2.left + C8480nc.m23906a(((float) (rect2.width() - width2)) * f);
            rect.right = rect.left + width2;
        }
    }

    /* renamed from: c */
    private final void m22469c(Rect rect, Rect rect2) {
        int i = this.f20942c.top - this.f20941b.top;
        int height = this.f20941b.height() - this.f20942c.height();
        if (height != 0) {
            float f = ((float) i) / ((float) height);
            int height2 = rect.height();
            rect.top = rect2.top + C8480nc.m23906a(((float) (rect2.height() - height2)) * f);
            rect.bottom = rect.top + height2;
        }
    }

    /* renamed from: a */
    public final void mo53212a(Rect rect) {
        C8467mq.m23881b(rect, "adLayoutRect");
        this.f20942c = new Rect(rect);
    }
}
