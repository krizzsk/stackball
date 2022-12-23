package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.pa */
public final class C14267pa {

    /* renamed from: a */
    private final b30 f38568a;

    /* renamed from: b */
    private boolean f38569b;

    /* renamed from: c */
    private ViewTreeObserver.OnPreDrawListener f38570c;

    public C14267pa(b30 b30) {
        Intrinsics.checkNotNullParameter(b30, "textView");
        this.f38568a = b30;
    }

    /* renamed from: a */
    public final void mo69344a(boolean z) {
        this.f38569b = z;
    }

    /* renamed from: b */
    public final void mo69345b() {
        if (this.f38569b) {
            m40716a();
        }
    }

    /* renamed from: c */
    public final void mo69346c() {
        if (this.f38570c != null) {
            this.f38568a.getViewTreeObserver().removeOnPreDrawListener(this.f38570c);
            this.f38570c = null;
        }
    }

    /* renamed from: a */
    private final void m40716a() {
        if (this.f38570c == null) {
            this.f38570c = new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    return C14267pa.m40717a(C14267pa.this);
                }
            };
            this.f38568a.getViewTreeObserver().addOnPreDrawListener(this.f38570c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m40717a(C14267pa paVar) {
        Layout layout;
        Intrinsics.checkNotNullParameter(paVar, "this$0");
        if (!paVar.f38569b || (layout = paVar.f38568a.getLayout()) == null) {
            return true;
        }
        b30 b30 = paVar.f38568a;
        int min = Math.min(layout.getLineCount(), b30.getHeight() / b30.getLineHeight());
        if (layout.getLineBottom(min - 1) - ((b30.getHeight() - b30.getPaddingTop()) - b30.getPaddingBottom()) > 3) {
            min--;
        }
        int max = Math.max(0, min);
        if (max != paVar.f38568a.getMaxLines()) {
            paVar.f38568a.setMaxLines(max);
            return false;
        } else if (paVar.f38570c == null) {
            return true;
        } else {
            paVar.f38568a.getViewTreeObserver().removeOnPreDrawListener(paVar.f38570c);
            paVar.f38570c = null;
            return true;
        }
    }
}
