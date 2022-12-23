package com.smaato.sdk.image.p252ad;

import android.graphics.Bitmap;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.p251fi.Function;
import java.io.InputStream;

/* renamed from: com.smaato.sdk.image.ad.BannerImageAdPresenterBuilder */
final class BannerImageAdPresenterBuilder extends ImageAdPresenterBuilder<BannerAdPresenter> {
    BannerImageAdPresenterBuilder(Logger logger, Function<ImageAdObject, ImageAdInteractor> function, ImageAdResponseParser imageAdResponseParser, VisibilityTrackerCreator visibilityTrackerCreator, ResourceLoader<InputStream, Bitmap> resourceLoader, AppBackgroundDetector appBackgroundDetector, ImageAdPresenterBuilderAdQualityViolationUtils imageAdPresenterBuilderAdQualityViolationUtils) {
        super(logger, imageAdResponseParser, resourceLoader, imageAdPresenterBuilderAdQualityViolationUtils, function, new Function(visibilityTrackerCreator, appBackgroundDetector) {
            public final /* synthetic */ VisibilityTrackerCreator f$1;
            public final /* synthetic */ AppBackgroundDetector f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return BannerImageAdPresenterBuilder.lambda$new$0(Logger.this, this.f$1, this.f$2, (ImageAdInteractor) obj);
            }
        });
    }

    static /* synthetic */ BannerAdPresenter lambda$new$0(Logger logger, VisibilityTrackerCreator visibilityTrackerCreator, AppBackgroundDetector appBackgroundDetector, ImageAdInteractor imageAdInteractor) {
        return new BannerImageAdPresenter(logger, imageAdInteractor, visibilityTrackerCreator, appBackgroundDetector);
    }
}
