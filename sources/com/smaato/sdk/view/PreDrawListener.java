package com.smaato.sdk.view;

import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.util.Consumer;
import com.smaato.sdk.util.Disposable;
import java.util.Collection;

final class PreDrawListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener, Disposable {
    private final Consumer<Disposable> action;
    private final View view;
    private ViewTreeObserver viewTreeObserver;

    public /* synthetic */ void addTo(Collection<Disposable> collection) {
        Disposable.CC.$default$addTo(this, collection);
    }

    PreDrawListener(View view2, Consumer<Disposable> consumer) {
        this.view = view2;
        this.action = consumer;
        this.viewTreeObserver = view2.getViewTreeObserver();
    }

    public final boolean onPreDraw() {
        this.action.accept(this);
        return true;
    }

    public final void onViewAttachedToWindow(View view2) {
        this.viewTreeObserver = view2.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view2) {
        dispose();
    }

    public final void dispose() {
        ViewTreeObserver viewTreeObserver2 = this.viewTreeObserver;
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                this.viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                this.view.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            this.view.removeOnAttachStateChangeListener(this);
        }
    }
}
