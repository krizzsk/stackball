package com.smaato.sdk.richmedia.p255ad;

import android.content.Context;
import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.flow.Action1;
import com.smaato.sdk.flow.Emitter;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter;
import com.smaato.sdk.util.Schedulers;
import java.io.IOException;

/* renamed from: com.smaato.sdk.richmedia.ad.WebViewRendererImpl */
final class WebViewRendererImpl implements WebViewRenderer {
    private final Context context;
    private final Schedulers executors;
    private final RichMediaWebViewFactory webViewFactory;

    WebViewRendererImpl(Context context2, Schedulers schedulers, RichMediaWebViewFactory richMediaWebViewFactory) {
        this.context = (Context) Objects.requireNonNull(context2);
        this.executors = (Schedulers) Objects.requireNonNull(schedulers);
        this.webViewFactory = (RichMediaWebViewFactory) Objects.requireNonNull(richMediaWebViewFactory);
    }

    public final Flow<RichMediaWebView> render(String str, ApiAdRequest apiAdRequest) {
        return Flow.create(new Action1(apiAdRequest, str) {
            public final /* synthetic */ ApiAdRequest f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                WebViewRendererImpl.this.lambda$render$0$WebViewRendererImpl(this.f$1, this.f$2, (Emitter) obj);
            }
        }).subscribeOn(this.executors.main());
    }

    public /* synthetic */ void lambda$render$0$WebViewRendererImpl(ApiAdRequest apiAdRequest, String str, final Emitter emitter) throws Throwable {
        MraidEnvironmentProperties build = new MraidEnvironmentProperties.Builder(this.context.getPackageName(), apiAdRequest).build();
        final RichMediaWebView create = this.webViewFactory.create(this.context);
        create.loadData(str, build);
        create.setCallback(new RichMediaWebViewCallbackAdapter() {
            public final void onWebViewLoaded() {
                create.setCallback((RichMediaWebView.Callback) null);
                emitter.onNext(create);
            }

            public final void onError() {
                create.setCallback((RichMediaWebView.Callback) null);
                emitter.onError(new IOException("Failed to render HTML into the WebView"));
            }
        });
    }
}
