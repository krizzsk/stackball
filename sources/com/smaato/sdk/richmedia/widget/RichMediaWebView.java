package com.smaato.sdk.richmedia.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StubOnGestureListener;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebView;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.core.webview.WebViewHelperUtil;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.smaato.sdk.richmedia.util.RichMediaHtmlUtils;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;

public final class RichMediaWebView extends BaseWebView {
    /* access modifiers changed from: private */
    public Callback callback;
    /* access modifiers changed from: private */
    public boolean clicked = false;
    private boolean destroyed = false;
    /* access modifiers changed from: private */
    public final RichMediaHtmlUtils htmlUtils;
    private boolean loadingStarted = false;
    /* access modifiers changed from: private */
    public final Logger logger;

    public interface Callback {
        void handleMraidUrl(String str, boolean z);

        void onAdViolation(String str, String str2);

        void onError();

        void onRenderProcessGone();

        void onUrlClicked(String str);

        void onWebViewLoaded();
    }

    public RichMediaWebView(Context context, Logger logger2, RichMediaHtmlUtils richMediaHtmlUtils) {
        super((Context) Objects.requireNonNull(context));
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.htmlUtils = (RichMediaHtmlUtils) Objects.requireNonNull(richMediaHtmlUtils);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVisibility(4);
        setBackgroundColor(getResources().getColor(17170445));
        WebSettings settings = getSettings();
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(false);
        BaseWebViewClient baseWebViewClient = new BaseWebViewClient();
        baseWebViewClient.setWebViewClientCallback(new BaseWebViewClient.WebViewClientCallback() {
            public final boolean shouldOverrideUrlLoading(String str) {
                RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "shouldOverrideUrlLoading: %s", str);
                if (str.startsWith("smaato://")) {
                    Objects.onNotNull(RichMediaWebView.this.callback, new Consumer(str) {
                        public final /* synthetic */ String f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void accept(Object obj) {
                            RichMediaWebView.C89172.this.lambda$shouldOverrideUrlLoading$0$RichMediaWebView$2(this.f$1, (RichMediaWebView.Callback) obj);
                        }
                    });
                    return true;
                } else if (str.startsWith("mraid://")) {
                    return true;
                } else {
                    if (RichMediaWebView.this.clicked) {
                        boolean unused = RichMediaWebView.this.clicked = false;
                        RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "shouldOverrideUrlLoading: going to call Callback::onUrlClicked() with %s", str);
                        Objects.onNotNull(RichMediaWebView.this.callback, new Consumer(str) {
                            public final /* synthetic */ String f$0;

                            {
                                this.f$0 = r1;
                            }

                            public final void accept(Object obj) {
                                ((RichMediaWebView.Callback) obj).onUrlClicked(this.f$0);
                            }
                        });
                        return true;
                    }
                    Objects.onNotNull(RichMediaWebView.this.callback, new Consumer(str) {
                        public final /* synthetic */ String f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void accept(Object obj) {
                            ((RichMediaWebView.Callback) obj).onAdViolation("AUTO_REDIRECT", this.f$0);
                        }
                    });
                    return true;
                }
            }

            public /* synthetic */ void lambda$shouldOverrideUrlLoading$0$RichMediaWebView$2(String str, Callback callback) {
                callback.handleMraidUrl(str, RichMediaWebView.this.clicked);
            }

            public final void onPageStartedLoading(String str) {
                RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onPageStartedLoading: %s", str);
            }

            public final void onPageFinishedLoading(String str) {
                RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onPageFinishedLoading: %s", str);
                RichMediaWebView.this.setVisibility(0);
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$L14kfwa0l1zsvAGZIyaguiHFWzE.INSTANCE);
            }

            public final void onHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onHttpError: request = %s, errorResponse = %s", webResourceRequest, webResourceResponse);
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$L2M72mlcdoLDCyEQRP1edhgylLs.INSTANCE);
            }

            public final void onGeneralError(int i, String str, String str2) {
                RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onGeneralError: errorCode = %d, description = %s, failingUrl = %s", Integer.valueOf(i), str, str2);
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$L2M72mlcdoLDCyEQRP1edhgylLs.INSTANCE);
            }

            public final void onRenderProcessGone() {
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$l3UkVyLdA8nZg35COCp9BoswidI.INSTANCE);
            }
        });
        setWebViewClient(baseWebViewClient);
        setWebChromeClient(new WebChromeClient() {
            public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$RichMediaWebView$3$iMqSgKkISMEQVpLrFDJKrD0dHk.INSTANCE);
                jsResult.confirm();
                return true;
            }

            public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$RichMediaWebView$3$CkKR7LmLrG2pgBuxfJc0xxknt4Q.INSTANCE);
                jsResult.confirm();
                return true;
            }

            public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$RichMediaWebView$3$FXPG6VyXTaZZVKgcZEIjW987NI.INSTANCE);
                jsPromptResult.confirm();
                return true;
            }

            public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                Objects.onNotNull(RichMediaWebView.this.callback, $$Lambda$RichMediaWebView$3$1AfgQvZ9ZVN8DuRi6oRxmlNKo.INSTANCE);
                jsResult.confirm();
                return true;
            }

            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return !RichMediaWebView.this.htmlUtils.isLoggingEnabled() || super.onConsoleMessage(consoleMessage);
            }
        });
    }

    public final void setCallback(Callback callback2) {
        this.callback = callback2;
    }

    public final void loadData(String str, MraidEnvironmentProperties mraidEnvironmentProperties) {
        Threads.ensureMainThread();
        if (!this.loadingStarted) {
            this.loadingStarted = true;
            initClickDetector();
            loadHtml(this.htmlUtils.createHtml(str, getContext(), mraidEnvironmentProperties));
        }
    }

    public final void loadUrlContent(String str) {
        Threads.ensureMainThread();
        if (!this.loadingStarted) {
            this.loadingStarted = true;
            initClickDetector();
            loadUrl(str);
        }
    }

    public final void destroy() {
        Threads.ensureMainThread();
        if (this.destroyed) {
            this.logger.debug(LogDomain.WIDGET, "release() has been already called, ignoring this call", new Object[0]);
            return;
        }
        this.destroyed = true;
        WebViewHelperUtil.resetAndDestroyWebViewSafely(this);
    }

    public final void resetClickedFlag() {
        this.clicked = false;
    }

    private void initClickDetector() {
        setOnTouchListener(new View.OnTouchListener(new GestureDetector(getContext(), new StubOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                boolean unused = RichMediaWebView.this.clicked = true;
                return true;
            }
        })) {
            public final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.onTouchEvent(motionEvent);
            }
        });
    }
}
