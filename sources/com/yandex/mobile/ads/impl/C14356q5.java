package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.internal.NativeProtocol;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.q5 */
public final class C14356q5 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TextView f38995a;

    /* renamed from: b */
    private View.OnAttachStateChangeListener f38996b;

    /* renamed from: c */
    private ViewTreeObserver.OnPreDrawListener f38997c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C14357a f38998d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f38999e;

    /* renamed from: com.yandex.mobile.ads.impl.q5$a */
    public static final class C14357a {

        /* renamed from: a */
        private final int f39000a;

        /* renamed from: b */
        private final int f39001b;

        public C14357a(int i, int i2) {
            this.f39000a = i;
            this.f39001b = i2;
        }

        /* renamed from: a */
        public final int mo69490a() {
            return this.f39000a;
        }

        /* renamed from: b */
        public final int mo69491b() {
            return this.f39000a + this.f39001b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14357a)) {
                return false;
            }
            C14357a aVar = (C14357a) obj;
            return this.f39000a == aVar.f39000a && this.f39001b == aVar.f39001b;
        }

        public int hashCode() {
            return (this.f39000a * 31) + this.f39001b;
        }

        public String toString() {
            return "Params(maxLines=" + this.f39000a + ", minHiddenLines=" + this.f39001b + ')';
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.q5$b */
    public static final class C14358b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C14356q5 f39002a;

        C14358b(C14356q5 q5Var) {
            this.f39002a = q5Var;
        }

        public boolean onPreDraw() {
            C14357a b = this.f39002a.f38998d;
            if (b == null || TextUtils.isEmpty(this.f39002a.f38995a.getText())) {
                return true;
            }
            if (this.f39002a.f38999e) {
                this.f39002a.m41091b();
                this.f39002a.f38999e = false;
                return true;
            }
            Integer num = Integer.MAX_VALUE;
            C14356q5 q5Var = this.f39002a;
            num.intValue();
            if (!(q5Var.f38995a.getLineCount() <= b.mo69491b())) {
                num = null;
            }
            int a = num == null ? b.mo69490a() : num.intValue();
            if (a != this.f39002a.f38995a.getMaxLines()) {
                this.f39002a.f38995a.setMaxLines(a);
                this.f39002a.f38999e = true;
                return false;
            }
            this.f39002a.m41091b();
            return true;
        }
    }

    public C14356q5(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f38995a = textView;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m41091b() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f38997c;
        if (onPreDrawListener != null) {
            ViewTreeObserver viewTreeObserver = this.f38995a.getViewTreeObserver();
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "textView.viewTreeObserver");
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
        this.f38997c = null;
    }

    /* renamed from: c */
    public final void mo69489c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f38996b;
        if (onAttachStateChangeListener != null) {
            this.f38995a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.f38996b = null;
        m41091b();
    }

    /* renamed from: a */
    public final void mo69488a(C14357a aVar) {
        Intrinsics.checkNotNullParameter(aVar, NativeProtocol.WEB_DIALOG_PARAMS);
        if (!Intrinsics.areEqual((Object) this.f38998d, (Object) aVar)) {
            this.f38998d = aVar;
            if (ViewCompat.isAttachedToWindow(this.f38995a)) {
                m41087a();
            }
            if (this.f38996b == null) {
                C14440r5 r5Var = new C14440r5(this);
                this.f38995a.addOnAttachStateChangeListener(r5Var);
                this.f38996b = r5Var;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m41087a() {
        if (this.f38997c == null) {
            C14358b bVar = new C14358b(this);
            ViewTreeObserver viewTreeObserver = this.f38995a.getViewTreeObserver();
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "textView.viewTreeObserver");
            viewTreeObserver.addOnPreDrawListener(bVar);
            this.f38997c = bVar;
        }
    }
}
