package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.video.p259fi.NonNullConsumer;
import com.smaato.sdk.video.vast.model.VastScenario;
import com.smaato.sdk.video.vast.player.VastVideoPlayerModel;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;

public class VastVideoPlayerCreator {
    private final VastVideoPlayerModelFactory vastVideoPlayerModelFactory;
    private final VastVideoPlayerPresenterFactory vastVideoPlayerPresenterFactory;
    private final VastVideoPlayerViewFactory vastVideoPlayerViewFactory;

    VastVideoPlayerCreator(VastVideoPlayerViewFactory vastVideoPlayerViewFactory2, VastVideoPlayerModelFactory vastVideoPlayerModelFactory2, VastVideoPlayerPresenterFactory vastVideoPlayerPresenterFactory2) {
        this.vastVideoPlayerViewFactory = (VastVideoPlayerViewFactory) Objects.requireNonNull(vastVideoPlayerViewFactory2);
        this.vastVideoPlayerModelFactory = (VastVideoPlayerModelFactory) Objects.requireNonNull(vastVideoPlayerModelFactory2);
        this.vastVideoPlayerPresenterFactory = (VastVideoPlayerPresenterFactory) Objects.requireNonNull(vastVideoPlayerPresenterFactory2);
    }

    public void createVastVideoPlayer(Logger logger, SomaApiContext somaApiContext, VastScenario vastScenario, VastErrorTracker vastErrorTracker, NonNullConsumer<Either<VastVideoPlayer, Exception>> nonNullConsumer, VideoTimings videoTimings) {
        Logger logger2 = logger;
        SomaApiContext somaApiContext2 = somaApiContext;
        VastScenario vastScenario2 = vastScenario;
        Objects.requireNonNull(logger);
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(vastScenario);
        Objects.requireNonNull(vastErrorTracker);
        Objects.requireNonNull(nonNullConsumer);
        VastVideoPlayerModelFactory vastVideoPlayerModelFactory2 = this.vastVideoPlayerModelFactory;
        VideoTimings videoTimings2 = videoTimings;
        boolean z = videoTimings2.isVideoClickable;
        ComponentClickHandler componentClickHandler = new ComponentClickHandler(logger2, somaApiContext2, vastVideoPlayerModelFactory2.linkResolver, vastScenario2.vastMediaFileScenario.videoClicks);
        VastErrorTracker vastErrorTracker2 = vastErrorTracker;
        VastVideoPlayerModel vastVideoPlayerModel = new VastVideoPlayerModel(vastErrorTracker2, vastVideoPlayerModelFactory2.vastEventTrackerCreator.createEventTracker(vastScenario2, somaApiContext2), vastVideoPlayerModelFactory2.vastBeaconTrackerCreator.createBeaconTracker(vastScenario2, somaApiContext2), componentClickHandler, vastVideoPlayerModelFactory2.isInitiallyMuted, z, ChangeSenderUtils.createUniqueValueChangeSender(VastVideoPlayerModel.Quartile.ZERO));
        this.vastVideoPlayerPresenterFactory.createVideoPlayerPresenter(logger2, somaApiContext2, vastScenario2, vastVideoPlayerModel, vastErrorTracker, new NonNullConsumer(logger2, nonNullConsumer) {
            public final /* synthetic */ Logger f$1;
            public final /* synthetic */ NonNullConsumer f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                VastVideoPlayerCreator.this.lambda$createVastVideoPlayer$0$VastVideoPlayerCreator(this.f$1, this.f$2, (Either) obj);
            }
        }, videoTimings2);
    }

    public /* synthetic */ void lambda$createVastVideoPlayer$0$VastVideoPlayerCreator(Logger logger, NonNullConsumer nonNullConsumer, Either either) {
        Exception exc = (Exception) either.right();
        if (exc != null) {
            nonNullConsumer.accept(Either.right(exc));
        } else {
            nonNullConsumer.accept(Either.left(new VastVideoPlayer((VastVideoPlayerPresenter) Objects.requireNonNull(either.left()), this.vastVideoPlayerViewFactory)));
        }
    }
}
