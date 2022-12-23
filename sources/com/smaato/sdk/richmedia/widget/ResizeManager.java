package com.smaato.sdk.richmedia.widget;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.ViewUtils;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.Views;
import com.smaato.sdk.richmedia.widget.ClosableView;
import com.smaato.sdk.richmedia.widget.ResizeManager;

final class ResizeManager {
    private final ClosableView closableView;
    Listener listener;
    private final Logger logger;
    private final Rect maxSizeInPx;
    private final View viewToResize;

    public interface Listener {
        void onCloseClicked(ImageButton imageButton);

        void onResizeFailed(String str);

        void onResized(ImageButton imageButton);
    }

    ResizeManager(Logger logger2, View view, Rect rect) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.viewToResize = (View) Objects.requireNonNull(view);
        this.maxSizeInPx = (Rect) Objects.requireNonNull(rect);
        ClosableView closableView2 = new ClosableView(view.getContext());
        this.closableView = closableView2;
        closableView2.setOnCloseClickListener(new ClosableView.OnCloseClickListener() {
            public final void onCloseClick() {
                ResizeManager.this.lambda$new$1$ResizeManager();
            }
        });
    }

    public /* synthetic */ void lambda$new$1$ResizeManager() {
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                ResizeManager.this.lambda$null$0$ResizeManager((ResizeManager.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$0$ResizeManager(Listener listener2) {
        listener2.onCloseClicked(this.closableView.getCloseButton());
    }

    /* access modifiers changed from: package-private */
    public final void resize(Rect rect) {
        View rootView = ViewUtils.getRootView(this.viewToResize);
        if (!(rootView instanceof ViewGroup)) {
            onFailedToResize("Cannot find a root view for a resizable-view");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        ClosableView closableView2 = this.closableView;
        Rect rect2 = this.maxSizeInPx;
        Rect rect3 = new Rect();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) closableView2.close.getLayoutParams();
        Gravity.apply(layoutParams.gravity, layoutParams.width, layoutParams.height, rect, rect3);
        if (!rect2.contains(rect3)) {
            onFailedToResize("The close region cannot appear within the maximum allowed size");
            return;
        }
        ClosableView closableView3 = this.closableView;
        if (!(closableView3.container.getChildCount() > 0 && closableView3.getParent() != null)) {
            ViewUtils.removeFromParent(this.viewToResize);
            this.closableView.addContent(this.viewToResize);
            viewGroup.addView(this.closableView);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.closableView.getLayoutParams();
        marginLayoutParams.width = rect.width();
        marginLayoutParams.height = rect.height();
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.leftMargin = rect.left;
        this.closableView.setLayoutParams(marginLayoutParams);
        Views.addOnPreDrawListener(this.closableView, new Runnable() {
            public final void run() {
                ResizeManager.this.lambda$resize$3$ResizeManager();
            }
        });
    }

    public /* synthetic */ void lambda$null$2$ResizeManager(Listener listener2) {
        listener2.onResized(this.closableView.getCloseButton());
    }

    public /* synthetic */ void lambda$resize$3$ResizeManager() {
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                ResizeManager.this.lambda$null$2$ResizeManager((ResizeManager.Listener) obj);
            }
        });
    }

    private void onFailedToResize(String str) {
        this.logger.error(LogDomain.RICH_MEDIA, str, new Object[0]);
        Objects.onNotNull(this.listener, new Consumer(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((ResizeManager.Listener) obj).onResizeFailed(this.f$0);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void collapse() {
        Threads.runOnNextUiFrame(new Runnable() {
            public final void run() {
                ResizeManager.this.lambda$collapse$5$ResizeManager();
            }
        });
    }

    public /* synthetic */ void lambda$collapse$5$ResizeManager() {
        ViewUtils.removeFromParent(this.closableView);
    }
}
