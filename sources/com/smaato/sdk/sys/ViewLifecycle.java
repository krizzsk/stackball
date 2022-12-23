package com.smaato.sdk.sys;

import android.view.View;
import com.smaato.sdk.sys.Lifecycle;
import com.smaato.sdk.view.Views;

final class ViewLifecycle implements View.OnAttachStateChangeListener, Lifecycle {
    private final LifecycleRegistry registry;

    ViewLifecycle(View view) {
        this.registry = new LifecycleRegistry(view);
        if (Views.isAttachedToWindow(view)) {
            this.registry.dispatch(Lifecycle.Event.ON_RESUME);
        }
        view.addOnAttachStateChangeListener(this);
    }

    public final Lifecycle.State currentState() {
        return this.registry.currentState();
    }

    public final void addObserver(Lifecycle.Observer observer) {
        if (observer != null) {
            this.registry.addObserver(observer);
            return;
        }
        throw new NullPointerException("'observer' specified as non-null is null");
    }

    public final void removeObserver(Lifecycle.Observer observer) {
        if (observer != null) {
            this.registry.removeObserver(observer);
            return;
        }
        throw new NullPointerException("'observer' specified as non-null is null");
    }

    public final void onViewAttachedToWindow(View view) {
        this.registry.dispatch(Lifecycle.Event.ON_RESUME);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.registry.dispatch(Lifecycle.Event.ON_DESTROY);
    }
}
