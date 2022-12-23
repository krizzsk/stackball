package com.smaato.sdk.video.vast.widget.icon;

import android.os.SystemClock;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeAction;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.utils.AnimationHelper;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.model.IconClicks;
import com.smaato.sdk.video.vast.model.VastIconScenario;
import com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.element.VastElementPresentationManager;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenterImpl;
import com.smaato.sdk.video.vast.widget.element.VastElementView;

final class IconPresenterImpl extends VastElementPresenterImpl {
    private final AnimationHelper animationHelper;
    private final VastIconScenario iconScenario;
    private final OneTimeActionFactory oneTimeActionFactory;
    private long startedLoadingAtMillis;
    private final long videoDurationMillis;

    IconPresenterImpl(Logger logger, VastElementPresentationManager vastElementPresentationManager, VastWebComponentSecurityPolicy vastWebComponentSecurityPolicy, SomaApiContext somaApiContext, VisibilityTrackerCreator visibilityTrackerCreator, VastElementErrorCodeStrategy vastElementErrorCodeStrategy, VastIconScenario vastIconScenario, OneTimeActionFactory oneTimeActionFactory2, AnimationHelper animationHelper2, long j) {
        super(logger, vastElementPresentationManager, vastWebComponentSecurityPolicy, somaApiContext, visibilityTrackerCreator, vastElementErrorCodeStrategy);
        this.iconScenario = (VastIconScenario) Objects.requireNonNull(vastIconScenario);
        this.oneTimeActionFactory = (OneTimeActionFactory) Objects.requireNonNull(oneTimeActionFactory2);
        this.animationHelper = (AnimationHelper) Objects.requireNonNull(animationHelper2);
        this.videoDurationMillis = j;
    }

    public final void onContentStartedToLoad() {
        this.startedLoadingAtMillis = SystemClock.uptimeMillis();
    }

    public final void onClicked(String str) {
        String str2;
        IconClicks iconClicks = this.iconScenario.iconClicks;
        if (iconClicks == null) {
            str2 = null;
        } else {
            str2 = iconClicks.iconClickThrough;
        }
        super.onClicked(str2);
    }

    public final void onContentLoaded() {
        super.onContentLoaded();
        long uptimeMillis = SystemClock.uptimeMillis() - this.startedLoadingAtMillis;
        this.oneTimeActionFactory.createOneTimeAction(new OneTimeAction.Listener(uptimeMillis) {
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void doAction() {
                IconPresenterImpl.this.lambda$showAfterDelay$1$IconPresenterImpl(this.f$1);
            }
        }).start(Math.max(this.iconScenario.offset - uptimeMillis, 0));
    }

    public /* synthetic */ void lambda$showAfterDelay$1$IconPresenterImpl(long j) {
        Objects.onNotNull(getView(), new Consumer(j) {
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                IconPresenterImpl.this.lambda$null$0$IconPresenterImpl(this.f$1, (VastElementView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$null$0$IconPresenterImpl(long j, VastElementView vastElementView) {
        this.animationHelper.showWithAnim(vastElementView);
        long j2 = this.iconScenario.duration;
        if (((float) j2) <= 0.0f) {
            j2 = this.videoDurationMillis - j;
        }
        if (((float) j2) > 0.0f) {
            this.oneTimeActionFactory.createOneTimeAction(new OneTimeAction.Listener() {
                public final void doAction() {
                    IconPresenterImpl.this.lambda$hideAfterDelay$2$IconPresenterImpl();
                }
            }).start(j2);
        }
    }

    public /* synthetic */ void lambda$hideAfterDelay$2$IconPresenterImpl() {
        VastElementView view = getView();
        AnimationHelper animationHelper2 = this.animationHelper;
        animationHelper2.getClass();
        Objects.onNotNull(view, new Consumer() {
            public final void accept(Object obj) {
                AnimationHelper.this.hideWithAnim((VastElementView) obj);
            }
        });
    }
}
