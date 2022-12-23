package com.smaato.sdk.view;

import android.os.Build;
import android.view.View;
import com.smaato.sdk.util.Consumer;
import com.smaato.sdk.util.Disposable;
import com.smaato.sdk.view.Views;
import java.util.Collection;

public abstract class Views {
    private static final Disposable EMPTY_DISPOSABLE = $$Lambda$Views$DI0CfoPCCSHhB9BTjOvjVrlktiU.INSTANCE;

    static /* synthetic */ void lambda$static$0() {
    }

    private Views() {
    }

    public static boolean isAttachedToWindow(View view) {
        if (view == null) {
            throw new NullPointerException("'view' specified as non-null is null");
        } else if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        } else {
            return view.getWindowToken() != null;
        }
    }

    public static void doOnPreDraw(View view, Consumer<Disposable> consumer) {
        if (view == null) {
            throw new NullPointerException("'view' specified as non-null is null");
        } else if (consumer != null) {
            PreDrawListener preDrawListener = new PreDrawListener(view, consumer);
            view.getViewTreeObserver().addOnPreDrawListener(preDrawListener);
            view.addOnAttachStateChangeListener(preDrawListener);
        } else {
            throw new NullPointerException("'action' specified as non-null is null");
        }
    }

    public static void doOnAttach(View view, final Consumer<Disposable> consumer) {
        if (view == null) {
            throw new NullPointerException("'view' specified as non-null is null");
        } else if (consumer == null) {
            throw new NullPointerException("'action' specified as non-null is null");
        } else if (isAttachedToWindow(view)) {
            consumer.accept(EMPTY_DISPOSABLE);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                }

                public /* synthetic */ void lambda$onViewAttachedToWindow$0$Views$1(View view) {
                    view.removeOnAttachStateChangeListener(this);
                }

                public final void onViewAttachedToWindow(View view) {
                    consumer.accept(new Disposable(view) {
                        public final /* synthetic */ View f$1;

                        {
                            this.f$1 = r2;
                        }

                        public /* synthetic */ void addTo(Collection<Disposable> collection) {
                            Disposable.CC.$default$addTo(this, collection);
                        }

                        public final void dispose() {
                            Views.C89631.this.lambda$onViewAttachedToWindow$0$Views$1(this.f$1);
                        }
                    });
                }
            });
        }
    }

    public static void doOnDetach(View view, final Consumer<Disposable> consumer) {
        if (view == null) {
            throw new NullPointerException("'view' specified as non-null is null");
        } else if (consumer != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public final void onViewAttachedToWindow(View view) {
                }

                public /* synthetic */ void lambda$onViewDetachedFromWindow$0$Views$2(View view) {
                    view.removeOnAttachStateChangeListener(this);
                }

                public final void onViewDetachedFromWindow(View view) {
                    consumer.accept(new Disposable(view) {
                        public final /* synthetic */ View f$1;

                        {
                            this.f$1 = r2;
                        }

                        public /* synthetic */ void addTo(Collection<Disposable> collection) {
                            Disposable.CC.$default$addTo(this, collection);
                        }

                        public final void dispose() {
                            Views.C89642.this.lambda$onViewDetachedFromWindow$0$Views$2(this.f$1);
                        }
                    });
                }
            });
        } else {
            throw new NullPointerException("'action' specified as non-null is null");
        }
    }
}
