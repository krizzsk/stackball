package com.ogury.p245ed.internal;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ogury.ed.internal.gy */
public final class C8278gy {

    /* renamed from: a */
    private Rect f21396a;

    /* renamed from: b */
    private List<Rect> f21397b;

    /* renamed from: c */
    private float f21398c;

    public C8278gy() {
        List<Rect> emptyList = Collections.emptyList();
        C8467mq.m23878a((Object) emptyList, "emptyList()");
        this.f21397b = emptyList;
    }

    /* renamed from: a */
    public final Rect mo53628a() {
        return this.f21396a;
    }

    /* renamed from: a */
    public final void mo53630a(Rect rect) {
        this.f21396a = rect;
    }

    /* renamed from: a */
    public final void mo53631a(List<Rect> list) {
        C8467mq.m23881b(list, "<set-?>");
        this.f21397b = list;
    }

    /* renamed from: b */
    public final List<Rect> mo53632b() {
        return this.f21397b;
    }

    /* renamed from: a */
    public final void mo53629a(float f) {
        this.f21398c = f;
    }

    /* renamed from: c */
    public final float mo53633c() {
        return this.f21398c;
    }
}
