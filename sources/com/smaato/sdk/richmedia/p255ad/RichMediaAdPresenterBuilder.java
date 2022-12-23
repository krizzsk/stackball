package com.smaato.sdk.richmedia.p255ad;

import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.flow.Action1;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;
import com.smaato.sdk.flow.Publisher;
import com.smaato.sdk.richmedia.p255ad.LoadedWebViewCache;
import com.smaato.sdk.richmedia.p255ad.RichMediaAdObject;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdPresenterBuilder */
abstract class RichMediaAdPresenterBuilder<Presenter extends AdPresenter> implements AdPresenterBuilder {
    private final Logger logger;
    private final Function<RichMediaAdInteractor, Presenter> presenterProviderFunction;
    private final Function<RichMediaAdObject, RichMediaAdInteractor> richMediaAdInteractorProviderFunction;
    private final RichMediaAdResponseParser richMediaAdResponseParser;
    private final WebViewRenderer richMediaRenderer;
    private final LoadedWebViewCache webViewCache;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.richmedia.ad.RichMediaAdObject, com.smaato.sdk.richmedia.ad.RichMediaAdInteractor>] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.smaato.sdk.core.util.fi.Function<com.smaato.sdk.richmedia.ad.RichMediaAdInteractor, Presenter>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    RichMediaAdPresenterBuilder(com.smaato.sdk.core.log.Logger r1, com.smaato.sdk.richmedia.p255ad.RichMediaAdResponseParser r2, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.richmedia.p255ad.RichMediaAdObject, com.smaato.sdk.richmedia.p255ad.RichMediaAdInteractor> r3, com.smaato.sdk.core.util.p251fi.Function<com.smaato.sdk.richmedia.p255ad.RichMediaAdInteractor, Presenter> r4, com.smaato.sdk.richmedia.p255ad.WebViewRenderer r5, com.smaato.sdk.richmedia.p255ad.LoadedWebViewCache r6) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.log.Logger r1 = (com.smaato.sdk.core.log.Logger) r1
            r0.logger = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser r1 = (com.smaato.sdk.richmedia.p255ad.RichMediaAdResponseParser) r1
            r0.richMediaAdResponseParser = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p251fi.Function) r1
            r0.richMediaAdInteractorProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.fi.Function r1 = (com.smaato.sdk.core.util.p251fi.Function) r1
            r0.presenterProviderFunction = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.richmedia.ad.WebViewRenderer r1 = (com.smaato.sdk.richmedia.p255ad.WebViewRenderer) r1
            r0.richMediaRenderer = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.richmedia.ad.LoadedWebViewCache r1 = (com.smaato.sdk.richmedia.p255ad.LoadedWebViewCache) r1
            r0.webViewCache = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p255ad.RichMediaAdPresenterBuilder.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.richmedia.ad.WebViewRenderer, com.smaato.sdk.richmedia.ad.LoadedWebViewCache):void");
    }

    public void buildAdPresenter(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener) {
        Objects.requireNonNull(somaApiContext);
        ApiAdResponse apiAdResponse = somaApiContext.getApiAdResponse();
        Flow fromCallable = Flow.fromCallable(new Callable() {
            public final Object call() {
                return RichMediaAdPresenterBuilder.lambda$parseResponse$3(ApiAdResponse.this);
            }
        });
        RichMediaAdResponseParser richMediaAdResponseParser2 = this.richMediaAdResponseParser;
        richMediaAdResponseParser2.getClass();
        fromCallable.map(new Function1() {
            public final Object apply(Object obj) {
                return RichMediaAdResponseParser.this.parseResponse((String) obj);
            }
        }).switchIfError(C8884x85036194.INSTANCE).doOnError(new Action1(apiAdResponse) {
            public final /* synthetic */ ApiAdResponse f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$parseResponse$5$RichMediaAdPresenterBuilder(this.f$1, (Throwable) obj);
            }
        }).flatMap(new Function1(somaApiContext) {
            public final /* synthetic */ SomaApiContext f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return RichMediaAdPresenterBuilder.this.lambda$buildAdPresenter$0$RichMediaAdPresenterBuilder(this.f$1, (RichMediaAdResponse) obj);
            }
        }).subscribe(new Action1(listener) {
            public final /* synthetic */ AdPresenterBuilder.Listener f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$buildAdPresenter$1$RichMediaAdPresenterBuilder(this.f$1, (AdPresenter) obj);
            }
        }, (Action1<? super Throwable>) new Action1(listener) {
            public final /* synthetic */ AdPresenterBuilder.Listener f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$buildAdPresenter$2$RichMediaAdPresenterBuilder(this.f$1, (Throwable) obj);
            }
        });
    }

    public /* synthetic */ void lambda$buildAdPresenter$1$RichMediaAdPresenterBuilder(AdPresenterBuilder.Listener listener, AdPresenter adPresenter) throws Throwable {
        listener.onAdPresenterBuildSuccess(this, adPresenter);
    }

    public /* synthetic */ void lambda$buildAdPresenter$2$RichMediaAdPresenterBuilder(AdPresenterBuilder.Listener listener, Throwable th) throws Throwable {
        listener.onAdPresenterBuildError(this, th instanceof AdPresenterBuilderException ? (AdPresenterBuilderException) th : new AdPresenterBuilderException(AdPresenterBuilder.Error.GENERIC, (Exception) th));
    }

    static /* synthetic */ String lambda$parseResponse$3(ApiAdResponse apiAdResponse) throws Exception {
        return new String(apiAdResponse.getBody(), apiAdResponse.getCharset());
    }

    public /* synthetic */ void lambda$parseResponse$5$RichMediaAdPresenterBuilder(ApiAdResponse apiAdResponse, Throwable th) throws Throwable {
        this.logger.error(LogDomain.AD, th, "Invalid AdResponse: %s", apiAdResponse);
    }

    public /* synthetic */ RichMediaAdObject lambda$prepareAdPresenter$6$RichMediaAdPresenterBuilder(SomaApiContext somaApiContext, RichMediaAdResponse richMediaAdResponse, RichMediaWebView richMediaWebView) throws Throwable {
        String sessionId = somaApiContext.getApiAdResponse().getSessionId();
        RichMediaAdObject build = new RichMediaAdObject.Builder().setSomaApiContext(somaApiContext).setWidth(richMediaAdResponse.width).setHeight(richMediaAdResponse.height).setContent(richMediaAdResponse.content).setClickTrackingUrls(richMediaAdResponse.clickTrackingUrls).setImpressionTrackingUrls(richMediaAdResponse.impressionTrackingUrls).setExtensions(richMediaAdResponse.extensions).setWebViewKey(sessionId).build();
        this.webViewCache.save(sessionId, new LoadedWebViewCache.Item(richMediaWebView, new WeakReference(build)));
        return build;
    }

    public /* synthetic */ AdPresenter lambda$prepareAdPresenter$7$RichMediaAdPresenterBuilder(RichMediaAdObject richMediaAdObject) throws Throwable {
        return (AdPresenter) this.presenterProviderFunction.apply(this.richMediaAdInteractorProviderFunction.apply(richMediaAdObject));
    }

    public /* synthetic */ void lambda$prepareAdPresenter$9$RichMediaAdPresenterBuilder(Throwable th) throws Throwable {
        this.logger.error(LogDomain.AD, th, "Failed to build AdPresenter", new Object[0]);
    }

    public /* synthetic */ Publisher lambda$buildAdPresenter$0$RichMediaAdPresenterBuilder(SomaApiContext somaApiContext, RichMediaAdResponse richMediaAdResponse) throws Throwable {
        return this.richMediaRenderer.render(richMediaAdResponse.content, somaApiContext.getApiAdRequest()).map(new Function1(somaApiContext, richMediaAdResponse) {
            public final /* synthetic */ SomaApiContext f$1;
            public final /* synthetic */ RichMediaAdResponse f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return RichMediaAdPresenterBuilder.this.lambda$prepareAdPresenter$6$RichMediaAdPresenterBuilder(this.f$1, this.f$2, (RichMediaWebView) obj);
            }
        }).map(new Function1() {
            public final Object apply(Object obj) {
                return RichMediaAdPresenterBuilder.this.lambda$prepareAdPresenter$7$RichMediaAdPresenterBuilder((RichMediaAdObject) obj);
            }
        }).switchIfError(C8885x40bea78.INSTANCE).doOnError(new Action1() {
            public final void invoke(Object obj) {
                RichMediaAdPresenterBuilder.this.lambda$prepareAdPresenter$9$RichMediaAdPresenterBuilder((Throwable) obj);
            }
        });
    }
}
