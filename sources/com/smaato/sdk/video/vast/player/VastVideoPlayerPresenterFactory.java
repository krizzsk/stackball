package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;
import com.smaato.sdk.video.vast.widget.companion.CompanionPresenterFactory;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;
import com.smaato.sdk.video.vast.widget.icon.IconPresenterFactory;

class VastVideoPlayerPresenterFactory {
    private final CompanionPresenterFactory companionPresenterFactory;
    private final IconPresenterFactory iconPresenterFactory;
    private final VastVideoPlayerStateMachineFactory vastVideoPlayerStateMachineFactory;
    private final VideoPlayerPresenterFactory videoPlayerPresenterFactory;
    private final VisibilityTrackerCreator visibilityTrackerCreator;

    VastVideoPlayerPresenterFactory(VideoPlayerPresenterFactory videoPlayerPresenterFactory2, CompanionPresenterFactory companionPresenterFactory2, IconPresenterFactory iconPresenterFactory2, VisibilityTrackerCreator visibilityTrackerCreator2, VastVideoPlayerStateMachineFactory vastVideoPlayerStateMachineFactory2) {
        this.videoPlayerPresenterFactory = (VideoPlayerPresenterFactory) Objects.requireNonNull(videoPlayerPresenterFactory2);
        this.companionPresenterFactory = (CompanionPresenterFactory) Objects.requireNonNull(companionPresenterFactory2);
        this.iconPresenterFactory = (IconPresenterFactory) Objects.requireNonNull(iconPresenterFactory2);
        this.visibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator2);
        this.vastVideoPlayerStateMachineFactory = (VastVideoPlayerStateMachineFactory) Objects.requireNonNull(vastVideoPlayerStateMachineFactory2);
    }

    /* access modifiers changed from: package-private */
    public final void createVideoPlayerPresenter(Logger logger, SomaApiContext somaApiContext, VastScenario vastScenario, VastVideoPlayerModel vastVideoPlayerModel, VastErrorTracker vastErrorTracker, NonNullConsumer<Either<VastVideoPlayerPresenter, Exception>> nonNullConsumer, VideoTimings videoTimings) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(vastVideoPlayerModel);
        Objects.requireNonNull(nonNullConsumer);
        VastScenario vastScenario2 = vastScenario;
        this.videoPlayerPresenterFactory.createVideoPlayerPresenter(logger, vastScenario2.vastMediaFileScenario, vastErrorTracker, new NonNullConsumer(logger, somaApiContext, vastScenario2, vastVideoPlayerModel, nonNullConsumer) {
            public final /* synthetic */ Logger f$1;
            public final /* synthetic */ SomaApiContext f$2;
            public final /* synthetic */ VastScenario f$3;
            public final /* synthetic */ VastVideoPlayerModel f$4;
            public final /* synthetic */ NonNullConsumer f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void accept(Object obj) {
                VastVideoPlayerPresenterFactory.this.mo56868x9dc1361f(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Either) obj);
            }
        }, videoTimings);
    }

    /* renamed from: lambda$createVideoPlayerPresenter$0$VastVideoPlayerPresenterFactory */
    public /* synthetic */ void mo56868x9dc1361f(Logger logger, SomaApiContext somaApiContext, VastScenario vastScenario, VastVideoPlayerModel vastVideoPlayerModel, NonNullConsumer nonNullConsumer, Either either) {
        Exception exc = (Exception) either.right();
        if (exc != null) {
            nonNullConsumer.accept(Either.right(exc));
            return;
        }
        VastElementPresenter create = this.iconPresenterFactory.create(logger, vastScenario.vastMediaFileScenario, somaApiContext);
        Logger logger2 = logger;
        VastVideoPlayerModel vastVideoPlayerModel2 = vastVideoPlayerModel;
        nonNullConsumer.accept(Either.left(new VastVideoPlayerPresenter(logger2, vastVideoPlayerModel2, this.companionPresenterFactory.create(logger, vastScenario, somaApiContext), create, (VideoPlayerPresenter) Objects.requireNonNull(either.left()), this.vastVideoPlayerStateMachineFactory.create(vastScenario))));
    }
}
