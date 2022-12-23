package com.smaato.sdk.image.p252ad;

import android.graphics.Bitmap;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderErrorMapper;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderException;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceLoaderException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.image.p252ad.ImageAdObject;
import com.smaato.sdk.image.p252ad.ImageAdResponseParser;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.smaato.sdk.image.ad.ImageAdPresenterBuilder */
abstract class ImageAdPresenterBuilder<Presenter extends AdPresenter> implements AdPresenterBuilder {
    /* access modifiers changed from: private */
    public final ImageAdPresenterBuilderAdQualityViolationUtils adQualityViolationUtils;
    private final Function<ImageAdObject, ImageAdInteractor> imageAdInteractorProviderFunction;
    private final ImageAdResponseParser imageAdResponseParser;
    private final ResourceLoader<InputStream, Bitmap> imageResourceLoader;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final Function<ImageAdInteractor, Presenter> presenterProviderFunction;

    /* JADX WARNING: type inference failed for: r5v0, types: [com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.image.ad.ImageAdObject, com.smaato.sdk.image.ad.ImageAdInteractor>, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.image.ad.ImageAdInteractor, Presenter>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    ImageAdPresenterBuilder(com.smaato.sdk.core.log.Logger r1, com.smaato.sdk.image.p252ad.ImageAdResponseParser r2, com.smaato.sdk.core.resourceloader.ResourceLoader<java.io.InputStream, android.graphics.Bitmap> r3, com.smaato.sdk.image.p252ad.ImageAdPresenterBuilderAdQualityViolationUtils r4, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.image.p252ad.ImageAdObject, com.smaato.sdk.image.p252ad.ImageAdInteractor> r5, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.image.p252ad.ImageAdInteractor, Presenter> r6) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.log.Logger r1 = (com.smaato.sdk.core.log.Logger) r1
            r0.logger = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p251fi.Function) r1
            r0.imageAdInteractorProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p251fi.Function) r1
            r0.presenterProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.image.ad.ImageAdResponseParser r1 = (com.smaato.sdk.image.p252ad.ImageAdResponseParser) r1
            r0.imageAdResponseParser = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.resourceloader.ResourceLoader r1 = (com.smaato.sdk.core.resourceloader.ResourceLoader) r1
            r0.imageResourceLoader = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.image.ad.ImageAdPresenterBuilderAdQualityViolationUtils r1 = (com.smaato.sdk.image.p252ad.ImageAdPresenterBuilderAdQualityViolationUtils) r1
            r0.adQualityViolationUtils = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p252ad.ImageAdPresenterBuilder.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.image.ad.ImageAdResponseParser, com.smaato.sdk.core.resourceloader.ResourceLoader, com.smaato.sdk.image.ad.ImageAdPresenterBuilderAdQualityViolationUtils, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.util.fi.Function):void");
    }

    public void buildAdPresenter(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener) {
        Objects.requireNonNull(somaApiContext, "Parameter somaApiContext cannot be null for ImageAdPresenterBuilder::buildAdPresenter");
        ApiAdResponse apiAdResponse = somaApiContext.getApiAdResponse();
        try {
            try {
                final ImageAdResponse parseResponse = this.imageAdResponseParser.parseResponse(new String(apiAdResponse.getBody(), apiAdResponse.getCharset()));
                this.logger.info(LogDomain.AD, "Loading image from address %s", parseResponse.getImageUrl());
                String imageUrl = parseResponse.getImageUrl();
                final SomaApiContext somaApiContext2 = somaApiContext;
                final AdPresenterBuilder.Listener listener2 = listener;
                final String str = imageUrl;
                this.imageResourceLoader.loadResource(imageUrl, somaApiContext, new ResourceLoader.Listener<Bitmap>() {
                    public final void onResourceLoaded(Bitmap bitmap) {
                        ImageAdPresenterBuilder.access$000(ImageAdPresenterBuilder.this, parseResponse, somaApiContext2, bitmap, listener2);
                    }

                    public final void onFailure(ResourceLoaderException resourceLoaderException) {
                        ImageAdPresenterBuilder.this.logger.error(LogDomain.AD, "Failed to load Image url: %s with error: %s", str, resourceLoaderException);
                        listener2.onAdPresenterBuildError(ImageAdPresenterBuilder.this, AdPresenterBuilderErrorMapper.mapError(ImageAdPresenterBuilder.this.adQualityViolationUtils.substituteReasonWithAdQualityViolationExceptionIfRequired(somaApiContext2, resourceLoaderException)));
                    }
                });
            } catch (ImageAdResponseParser.ParsingException e) {
                this.logger.error(LogDomain.AD, e, "Invalid AdResponse: %s", apiAdResponse);
                listener.onAdPresenterBuildError(this, new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, e));
            }
        } catch (UnsupportedEncodingException e2) {
            this.logger.error(LogDomain.AD, e2, "Invalid AdResponse: %s. Cannot parse AdResponse with provided charset: %s", apiAdResponse, apiAdResponse.getCharset());
            listener.onAdPresenterBuildError(this, new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, e2));
        }
    }

    static /* synthetic */ void access$000(ImageAdPresenterBuilder imageAdPresenterBuilder, ImageAdResponse imageAdResponse, SomaApiContext somaApiContext, Bitmap bitmap, AdPresenterBuilder.Listener listener) {
        try {
            ImageAdObject build = new ImageAdObject.Builder().setSomaApiContext(somaApiContext).setBitmap(bitmap).setImageUrl(imageAdResponse.getImageUrl()).setWidth(imageAdResponse.getWidth()).setHeight(imageAdResponse.getHeight()).setClickUrl(imageAdResponse.getClickUrl()).setClickTrackingUrls(imageAdResponse.getClickTrackingUrls()).setImpressionTrackingUrls(imageAdResponse.getImpressionTrackingUrls()).setExtensions(imageAdResponse.getExtensions()).build();
            Bitmap bitmap2 = build.getBitmap();
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int width2 = build.getWidth();
            int height2 = build.getHeight();
            if (!(width == width2 && height == height2)) {
                imageAdPresenterBuilder.logger.error(LogDomain.AD, "Image dimensions do not match response dimensions Image[%d x %d] should be [%d x %d]", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(width2), Integer.valueOf(height2));
            }
            listener.onAdPresenterBuildSuccess(imageAdPresenterBuilder, (AdPresenter) imageAdPresenterBuilder.presenterProviderFunction.apply(imageAdPresenterBuilder.imageAdInteractorProviderFunction.apply(build)));
        } catch (Exception e) {
            imageAdPresenterBuilder.logger.error(LogDomain.AD, e, "Failed to build ImageAdObject", new Object[0]);
            listener.onAdPresenterBuildError(imageAdPresenterBuilder, new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, e));
        }
    }
}
