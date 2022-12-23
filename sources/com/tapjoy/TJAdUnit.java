package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C9277fm;
import com.tapjoy.internal.C9314gf;
import com.tapjoy.internal.C9376hn;
import com.tapjoy.internal.C9465jq;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONObject;

public class TJAdUnit implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public static TJVideoListener f21855a;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f21856A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f21857B;

    /* renamed from: C */
    private int f21858C = -1;

    /* renamed from: D */
    private int f21859D;

    /* renamed from: E */
    private int f21860E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f21861F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f21862G;

    /* renamed from: H */
    private C9277fm f21863H;

    /* renamed from: I */
    private final Runnable f21864I = new Runnable() {
        public final void run() {
            int streamVolume = TJAdUnit.this.f21884s.getStreamVolume(3);
            if (TJAdUnit.this.f21885t != streamVolume) {
                int unused = TJAdUnit.this.f21885t = streamVolume;
                TJAdUnit.this.f21867b.onVolumeChanged();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final Runnable f21865J = new Runnable() {
        public final void run() {
            if (TJAdUnit.this.f21870e.getCurrentPosition() != 0) {
                if (!TJAdUnit.this.f21881p) {
                    boolean unused = TJAdUnit.this.f21881p = true;
                }
                TJAdUnit.this.f21867b.onVideoStarted(TJAdUnit.this.f21879n);
                TJAdUnit.this.f21866K.run();
            } else if (!TJAdUnit.this.f21861F) {
                TJAdUnit.this.f21874i.postDelayed(TJAdUnit.this.f21865J, 200);
            } else {
                boolean unused2 = TJAdUnit.this.f21862G = true;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final Runnable f21866K = new Runnable() {
        public final void run() {
            TJAdUnit.this.f21867b.onVideoProgress(TJAdUnit.this.f21870e.getCurrentPosition());
            TJAdUnit.this.f21874i.postDelayed(TJAdUnit.this.f21866K, 500);
        }
    };
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public TJAdUnitJSBridge f21867b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public TJWebView f21868c;
    /* access modifiers changed from: package-private */

    /* renamed from: d */
    public TJWebView f21869d;

    /* renamed from: e */
    VideoView f21870e;

    /* renamed from: f */
    volatile boolean f21871f;

    /* renamed from: g */
    WebViewClient f21872g = new WebViewClient() {
        public final void onLoadResource(WebView webView, String str) {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return m24160a(str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return m24160a(webResourceRequest.getUrl().toString());
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            TapjoyLog.m24273d("TJAdUnit", "onPageStarted: " + str);
            if (TJAdUnit.this.f21867b != null) {
                TJAdUnit.this.f21867b.allowRedirect = true;
                TJAdUnit.this.f21867b.customClose = false;
                TJAdUnit.this.f21867b.closeRequested = false;
                TJAdUnit.this.m24125a();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.m24273d("TJAdUnit", "onPageFinished: " + str);
            if (TJAdUnit.this.f21877l != null) {
                TJAdUnit.this.f21877l.setProgressSpinnerVisibility(false);
            }
            boolean unused = TJAdUnit.this.f21857B = true;
            if (TJAdUnit.this.f21890y) {
                TJAdUnit.this.f21867b.display();
            }
            TJAdUnit.this.f21867b.flushMessageQueue();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.m24273d("TJAdUnit", "error:" + str);
            if (TJAdUnit.this.f21877l != null) {
                TJAdUnit.this.f21877l.showErrorDialog();
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            TapjoyCachedAssetData cachedDataForURL;
            WebResourceResponse a;
            if (TapjoyCache.getInstance() == null || (cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(str)) == null || (a = m24159a(cachedDataForURL)) == null) {
                return super.shouldInterceptRequest(webView, str);
            }
            TapjoyLog.m24273d("TJAdUnit", "Reading request for " + str + " from cache -- localPath: " + cachedDataForURL.getLocalFilePath());
            return a;
        }

        /* renamed from: a */
        private boolean m24160a(String str) {
            if (!TJAdUnit.this.m24139e() || !URLUtil.isValidUrl(str)) {
                if (TJAdUnit.this.f21877l != null) {
                    TJAdUnit.this.f21877l.showErrorDialog();
                }
                return true;
            } else if (TJAdUnit.m24133b(str)) {
                return false;
            } else {
                if (TJAdUnit.this.f21867b.allowRedirect) {
                    Uri parse = Uri.parse(str);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    if (TJAdUnit.this.f21869d.getContext() != null) {
                        try {
                            TJAdUnit.this.f21869d.getContext().startActivity(intent);
                            return true;
                        } catch (Exception e) {
                            TapjoyLog.m24275e("TJAdUnit", "Exception in loading URL. " + e.getMessage());
                        }
                    }
                } else if (str.startsWith("javascript:") && Build.VERSION.SDK_INT >= 19) {
                    try {
                        TJAdUnit.this.f21869d.evaluateJavascript(str.replaceFirst("javascript:", ""), (ValueCallback) null);
                        return true;
                    } catch (Exception e2) {
                        TapjoyLog.m24275e("TJAdUnit", "Exception in evaluateJavascript. Device not supported. " + e2.toString());
                    }
                }
                return false;
            }
        }

        /* renamed from: a */
        private static WebResourceResponse m24159a(TapjoyCachedAssetData tapjoyCachedAssetData) {
            if (tapjoyCachedAssetData == null) {
                return null;
            }
            try {
                return new WebResourceResponse(tapjoyCachedAssetData.getMimeType(), "UTF-8", new FileInputStream(tapjoyCachedAssetData.getLocalFilePath()));
            } catch (Exception unused) {
                return null;
            }
        }
    };

    /* renamed from: h */
    WebChromeClient f21873h = new WebChromeClient() {
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            TapjoyLog.m24273d("TJAdUnit", str2);
            return false;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (!TJAdUnit.this.f21867b.closeRequested) {
                return true;
            }
            String[] strArr = {"Uncaught", "uncaught", "Error", "error", "not defined"};
            if (TJAdUnit.this.f21877l == null) {
                return true;
            }
            for (int i = 0; i < 5; i++) {
                if (consoleMessage.message().contains(strArr[i])) {
                    TJAdUnit.this.f21877l.handleClose();
                    return true;
                }
            }
            return true;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Handler f21874i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private TJAdUnitWebViewListener f21875j;

    /* renamed from: k */
    private TJAdUnitVideoListener f21876k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public TJAdUnitActivity f21877l;

    /* renamed from: m */
    private MediaPlayer f21878m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f21879n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f21880o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f21881p;

    /* renamed from: q */
    private boolean f21882q;
    @Nullable

    /* renamed from: r */
    private ScheduledFuture f21883r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public AudioManager f21884s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f21885t = 0;

    /* renamed from: u */
    private int f21886u;

    /* renamed from: v */
    private boolean f21887v;

    /* renamed from: w */
    private boolean f21888w;

    /* renamed from: x */
    private boolean f21889x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f21890y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f21891z;

    public interface TJAdUnitVideoListener {
        void onVideoCompleted();

        void onVideoError(String str);

        void onVideoStart();
    }

    public interface TJAdUnitWebViewListener {
        void onClick();

        void onClosed();

        void onContentReady();
    }

    /* renamed from: a */
    private static boolean m24126a(int i) {
        return i == 0 || i == 8 || i == 6 || i == 11;
    }

    /* renamed from: b */
    private static boolean m24131b(int i) {
        return i == 1 || i == 9 || i == 7 || i == 12;
    }

    public boolean preload(TJPlacementData tJPlacementData, Context context) {
        if (this.f21891z || !tJPlacementData.isPrerenderingRequested() || !TJPlacementManager.canPreRenderPlacement() || TapjoyConnectCore.isViewOpen()) {
            fireContentReady();
            return false;
        }
        TapjoyLog.m24276i("TJAdUnit", "Pre-rendering ad unit for placement: " + tJPlacementData.getPlacementName());
        TJPlacementManager.incrementPlacementPreRenderCount();
        load(tJPlacementData, true, context);
        return true;
    }

    public void load(final TJPlacementData tJPlacementData, final boolean z, final Context context) {
        this.f21891z = false;
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                TJAdUnit tJAdUnit = TJAdUnit.this;
                Context context = context;
                boolean z = true;
                if (Looper.myLooper() == Looper.getMainLooper() && !tJAdUnit.f21871f && context != null) {
                    TapjoyLog.m24273d("TJAdUnit", "Constructing ad unit");
                    tJAdUnit.f21871f = true;
                    tJAdUnit.f21868c = new TJWebView(context);
                    tJAdUnit.f21868c.loadDataWithBaseURL((String) null, "<!DOCTYPE html><html><head><title>Tapjoy Background Webview</title></head></html>", WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
                    tJAdUnit.f21869d = new TJWebView(context);
                    tJAdUnit.f21869d.setWebViewClient(tJAdUnit.f21872g);
                    tJAdUnit.f21869d.setWebChromeClient(tJAdUnit.f21873h);
                    tJAdUnit.f21870e = new VideoView(context);
                    tJAdUnit.f21870e.setOnCompletionListener(tJAdUnit);
                    tJAdUnit.f21870e.setOnErrorListener(tJAdUnit);
                    tJAdUnit.f21870e.setOnPreparedListener(tJAdUnit);
                    tJAdUnit.f21870e.setVisibility(4);
                    tJAdUnit.f21867b = new TJAdUnitJSBridge(context, tJAdUnit);
                    if (context instanceof TJAdUnitActivity) {
                        tJAdUnit.setAdUnitActivity((TJAdUnitActivity) context);
                    }
                }
                if (tJAdUnit.f21871f) {
                    TapjoyLog.m24276i("TJAdUnit", "Loading ad unit content");
                    boolean unused = TJAdUnit.this.f21891z = true;
                    if (!C9465jq.m25449c(tJPlacementData.getRedirectURL())) {
                        if (tJPlacementData.isPreloadDisabled()) {
                            TJAdUnit.this.f21869d.postUrl(tJPlacementData.getRedirectURL(), (byte[]) null);
                        } else {
                            TJAdUnit.this.f21869d.loadUrl(tJPlacementData.getRedirectURL());
                        }
                    } else if (tJPlacementData.getBaseURL() == null || tJPlacementData.getHttpResponse() == null) {
                        TapjoyLog.m24274e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                        boolean unused2 = TJAdUnit.this.f21891z = false;
                    } else {
                        TJAdUnit.this.f21869d.loadDataWithBaseURL(tJPlacementData.getBaseURL(), tJPlacementData.getHttpResponse(), WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
                    }
                    TJAdUnit tJAdUnit2 = TJAdUnit.this;
                    if (!tJAdUnit2.f21891z || !z) {
                        z = false;
                    }
                    boolean unused3 = tJAdUnit2.f21856A = z;
                }
            }
        });
    }

    public void resume(TJAdUnitSaveStateData tJAdUnitSaveStateData) {
        if (this.f21867b.didLaunchOtherActivity) {
            TapjoyLog.m24273d("TJAdUnit", "onResume bridge.didLaunchOtherActivity callbackID: " + this.f21867b.otherActivityCallbackID);
            TJAdUnitJSBridge tJAdUnitJSBridge = this.f21867b;
            tJAdUnitJSBridge.invokeJSCallback(tJAdUnitJSBridge.otherActivityCallbackID, Boolean.TRUE);
            this.f21867b.didLaunchOtherActivity = false;
        }
        this.f21861F = false;
        this.f21867b.setEnabled(true);
        if (tJAdUnitSaveStateData != null) {
            int i = tJAdUnitSaveStateData.seekTime;
            this.f21879n = i;
            this.f21870e.seekTo(i);
            if (this.f21878m != null) {
                this.f21887v = tJAdUnitSaveStateData.isVideoMuted;
            }
        }
        if (this.f21862G) {
            this.f21862G = false;
            this.f21874i.postDelayed(this.f21865J, 200);
        }
    }

    public void pause() {
        this.f21861F = true;
        this.f21867b.setEnabled(false);
        pauseVideo();
    }

    public void invokeBridgeCallback(String str, Object... objArr) {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f21867b;
        if (tJAdUnitJSBridge != null && str != null) {
            tJAdUnitJSBridge.invokeJSCallback(str, objArr);
        }
    }

    public void destroy() {
        this.f21867b.destroy();
        m24134c();
        TJWebView tJWebView = this.f21868c;
        if (tJWebView != null) {
            tJWebView.removeAllViews();
            this.f21868c = null;
        }
        TJWebView tJWebView2 = this.f21869d;
        if (tJWebView2 != null) {
            tJWebView2.removeAllViews();
            this.f21869d = null;
        }
        this.f21871f = false;
        this.f21890y = false;
        setAdUnitActivity((TJAdUnitActivity) null);
        m24125a();
        this.f21878m = null;
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f21875j;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClosed();
        }
        resetContentLoadState();
    }

    public void resetContentLoadState() {
        this.f21891z = false;
        this.f21857B = false;
        this.f21856A = false;
        this.f21858C = -1;
        this.f21889x = false;
        this.f21887v = false;
    }

    public void setVisible(boolean z) {
        this.f21867b.notifyOrientationChanged(getScreenOrientationString(), this.f21859D, this.f21860E);
        this.f21890y = z;
        if (z && this.f21857B) {
            this.f21867b.display();
        }
    }

    public void fireContentReady() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f21875j;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onContentReady();
        }
    }

    public void fireOnClick() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.f21875j;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClick();
        }
    }

    public void closeRequested(boolean z) {
        this.f21867b.closeRequested(Boolean.valueOf(z));
    }

    public void setOrientation(int i) {
        TJAdUnitActivity tJAdUnitActivity = this.f21877l;
        if (tJAdUnitActivity != null) {
            int b = m24129b();
            int i2 = this.f21858C;
            if (i2 != -1) {
                b = i2;
            }
            if ((m24126a(b) && m24126a(i)) || (m24131b(b) && m24131b(i))) {
                i = b;
            }
            tJAdUnitActivity.setRequestedOrientation(i);
            this.f21858C = i;
            this.f21889x = true;
        }
    }

    public void unsetOrientation() {
        TJAdUnitActivity tJAdUnitActivity = this.f21877l;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.setRequestedOrientation(-1);
        }
        this.f21858C = -1;
        this.f21889x = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24125a() {
        TapjoyLog.m24273d("TJAdUnit", "detachVolumeListener");
        ScheduledFuture scheduledFuture = this.f21883r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f21883r = null;
        }
        this.f21884s = null;
    }

    /* renamed from: b */
    private int m24129b() {
        TJAdUnitActivity tJAdUnitActivity = this.f21877l;
        if (tJAdUnitActivity == null) {
            return -1;
        }
        int rotation = tJAdUnitActivity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        tJAdUnitActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f21859D = displayMetrics.widthPixels;
        this.f21860E = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && this.f21860E > this.f21859D) || ((rotation == 1 || rotation == 3) && this.f21859D > this.f21860E)) {
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                            return 1;
                        }
                        return 8;
                    }
                }
                return 0;
            }
            return 1;
        }
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation == 2) {
                    return 8;
                }
                if (rotation != 3) {
                    TapjoyLog.m24278w("TJAdUnit", "Unknown screen orientation. Defaulting to landscape.");
                }
            }
            return 1;
        }
        return 0;
        return 9;
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.f21877l = tJAdUnitActivity;
        TJAdUnitJSBridge tJAdUnitJSBridge = this.f21867b;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setAdUnitActivity(tJAdUnitActivity);
        }
    }

    public void setAdContentTracker(C9277fm fmVar) {
        this.f21863H = fmVar;
    }

    public void setBackgroundColor(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TapjoyLog.m24273d("TJAdUnit", "setBackgroundColor: " + str);
                    TJAdUnit.this.f21868c.setBackgroundColor(Color.parseColor(str));
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.m24273d("TJAdUnit", "Error setting background color. backgroundWebView: " + TJAdUnit.this.f21868c + ", hexColor: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setBackgroundContent(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TapjoyLog.m24273d("TJAdUnit", "setBackgroundContent: " + str);
                    TJAdUnit.this.f21868c.loadDataWithBaseURL((String) null, str, WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
                    adUnitAsyncTaskListner.onComplete(true);
                } catch (Exception unused) {
                    TapjoyLog.m24273d("TJAdUnit", "Error setting background content. backgroundWebView: " + TJAdUnit.this.f21868c + ", content: " + str);
                    adUnitAsyncTaskListner.onComplete(false);
                }
            }
        });
    }

    public void setWebViewListener(TJAdUnitWebViewListener tJAdUnitWebViewListener) {
        this.f21875j = tJAdUnitWebViewListener;
    }

    public void setVideoListener(TJAdUnitVideoListener tJAdUnitVideoListener) {
        this.f21876k = tJAdUnitVideoListener;
    }

    public int getLockedOrientation() {
        return this.f21858C;
    }

    public int getScreenWidth() {
        return this.f21859D;
    }

    public int getScreenHeight() {
        return this.f21860E;
    }

    public String getScreenOrientationString() {
        return m24126a(m24129b()) ? "landscape" : "portrait";
    }

    public boolean hasCalledLoad() {
        return this.f21891z;
    }

    public boolean isPrerendered() {
        return this.f21856A;
    }

    public boolean isLockedOrientation() {
        return this.f21889x;
    }

    public TJWebView getBackgroundWebView() {
        return this.f21868c;
    }

    public TJWebView getWebView() {
        return this.f21869d;
    }

    public boolean getCloseRequested() {
        return this.f21867b.closeRequested;
    }

    public void loadVideoUrl(final String str, final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnit.this.f21870e != null) {
                    TapjoyLog.m24276i("TJAdUnit", "loadVideoUrl: " + str);
                    TJAdUnit.this.f21870e.setVideoPath(str);
                    TJAdUnit.this.f21870e.setVisibility(0);
                    TJAdUnit.this.f21870e.seekTo(0);
                    adUnitAsyncTaskListner.onComplete(true);
                    return;
                }
                adUnitAsyncTaskListner.onComplete(false);
            }
        });
    }

    public boolean playVideo() {
        TapjoyLog.m24276i("TJAdUnit", MraidJsMethods.PLAY_VIDEO);
        VideoView videoView = this.f21870e;
        if (videoView == null) {
            return false;
        }
        videoView.start();
        this.f21882q = false;
        this.f21874i.postDelayed(this.f21865J, 200);
        return true;
    }

    public boolean pauseVideo() {
        m24134c();
        VideoView videoView = this.f21870e;
        if (videoView == null || !videoView.isPlaying()) {
            return false;
        }
        this.f21870e.pause();
        this.f21879n = this.f21870e.getCurrentPosition();
        TapjoyLog.m24276i("TJAdUnit", "Video paused at: " + this.f21879n);
        this.f21867b.onVideoPaused(this.f21879n);
        return true;
    }

    public void clearVideo(final TJAdUnitJSBridge.AdUnitAsyncTaskListner adUnitAsyncTaskListner, final boolean z) {
        if (this.f21870e != null) {
            m24134c();
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnit.this.f21870e.setVisibility(z ? 0 : 4);
                    TJAdUnit.this.f21870e.stopPlayback();
                    boolean unused = TJAdUnit.this.f21881p = false;
                    boolean unused2 = TJAdUnit.this.f21880o = false;
                    int unused3 = TJAdUnit.this.f21879n = 0;
                    adUnitAsyncTaskListner.onComplete(true);
                }
            });
            return;
        }
        adUnitAsyncTaskListner.onComplete(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57326a(boolean z) {
        MediaPlayer mediaPlayer = this.f21878m;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
            if (this.f21888w != z) {
                this.f21888w = z;
                this.f21867b.onVolumeChanged();
                return;
            }
            return;
        }
        this.f21887v = z;
    }

    public void attachVolumeListener(boolean z, int i) {
        TJAdUnitActivity tJAdUnitActivity;
        TapjoyLog.m24273d("TJAdUnit", "attachVolumeListener: isAttached=" + z + "; interval=" + i);
        m24125a();
        if (z && (tJAdUnitActivity = this.f21877l) != null) {
            AudioManager audioManager = (AudioManager) tJAdUnitActivity.getSystemService("audio");
            this.f21884s = audioManager;
            this.f21885t = audioManager.getStreamVolume(3);
            this.f21886u = this.f21884s.getStreamMaxVolume(3);
            long j = (long) i;
            this.f21883r = C9376hn.f23241a.scheduleWithFixedDelay(this.f21864I, j, j, TimeUnit.MILLISECONDS);
        }
    }

    public VideoView getVideoView() {
        return this.f21870e;
    }

    public int getVideoSeekTime() {
        return this.f21879n;
    }

    public boolean isVideoComplete() {
        return this.f21882q;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        TapjoyLog.m24276i("TJAdUnit", "video -- onPrepared");
        final int duration = this.f21870e.getDuration();
        final int measuredWidth = this.f21870e.getMeasuredWidth();
        final int measuredHeight = this.f21870e.getMeasuredHeight();
        this.f21878m = mediaPlayer;
        boolean z = this.f21887v;
        if (z) {
            mo57326a(z);
        }
        if (this.f21879n <= 0 || this.f21870e.getCurrentPosition() == this.f21879n) {
            this.f21867b.onVideoReady(duration, measuredWidth, measuredHeight);
        } else {
            this.f21878m.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
                public final void onSeekComplete(MediaPlayer mediaPlayer) {
                    TJAdUnit.this.f21867b.onVideoReady(duration, measuredWidth, measuredHeight);
                }
            });
        }
        this.f21878m.setOnInfoListener(this);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        TapjoyLog.m24274e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating the VideoView: " + i + " - " + i2));
        this.f21880o = true;
        m24134c();
        String str2 = (i != 100 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERROR_SERVER_DIED") + " -- ";
        if (i2 == -1010) {
            str = str2 + "MEDIA_ERROR_UNSUPPORTED";
        } else if (i2 == -1007) {
            str = str2 + "MEDIA_ERROR_MALFORMED";
        } else if (i2 == -1004) {
            str = str2 + "MEDIA_ERROR_IO";
        } else if (i2 != -110) {
            str = str2 + "MEDIA_ERROR_EXTRA_UNKNOWN";
        } else {
            str = str2 + "MEDIA_ERROR_TIMED_OUT";
        }
        this.f21867b.onVideoError(str);
        if (i == 1 || i2 == -1004) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m24134c() {
        this.f21874i.removeCallbacks(this.f21865J);
        this.f21874i.removeCallbacks(this.f21866K);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        TapjoyLog.m24276i("TJAdUnit", "video -- onCompletion");
        m24134c();
        this.f21882q = true;
        if (!this.f21880o) {
            this.f21867b.onVideoCompletion();
        }
        this.f21880o = false;
    }

    public void fireOnVideoStart() {
        TapjoyLog.m24277v("TJAdUnit", "Firing onVideoStart");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoStart();
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f21876k;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoStart();
        }
    }

    public void fireOnVideoError(String str) {
        TapjoyLog.m24275e("TJAdUnit", "Firing onVideoError with error: " + str);
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoError(3);
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f21876k;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoError(str);
        }
    }

    public void fireOnVideoComplete() {
        TapjoyLog.m24277v("TJAdUnit", "Firing onVideoComplete");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoComplete();
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.f21876k;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoCompleted();
        }
    }

    public float getVolume() {
        return ((float) this.f21885t) / ((float) this.f21886u);
    }

    public boolean isMuted() {
        return this.f21888w;
    }

    public void startAdContentTracking(String str, JSONObject jSONObject) {
        C9277fm fmVar = this.f21863H;
        if (fmVar != null) {
            fmVar.mo58135a(str, jSONObject);
        }
    }

    public void endAdContentTracking(String str, JSONObject jSONObject) {
        if (this.f21863H != null) {
            m24138d();
            this.f21863H.mo58136b(str, jSONObject);
        }
    }

    public void sendAdContentTracking(String str, JSONObject jSONObject) {
        if (this.f21863H != null) {
            m24138d();
            C9277fm fmVar = this.f21863H;
            Map a = C9277fm.m24884a(jSONObject);
            C9314gf.m24967e(str).mo58200a(fmVar.f22962a).mo58200a(a).mo58203b(C9277fm.m24885b(jSONObject)).mo58204c();
        }
    }

    /* renamed from: d */
    private void m24138d() {
        C9277fm fmVar = this.f21863H;
        if (fmVar != null) {
            fmVar.mo58148a("prerendered", Boolean.valueOf(this.f21856A));
        }
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        if (i == 3) {
            str = "MEDIA_INFO_VIDEO_RENDERING_START";
        } else if (i != 801) {
            switch (i) {
                case 700:
                    str = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                    break;
                case 701:
                    str = "MEDIA_INFO_BUFFERING_START";
                    break;
                case 702:
                    str = "MEDIA_INFO_BUFFERING_END";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "MEDIA_INFO_NOT_SEEKABLE";
        }
        this.f21867b.onVideoInfo(str);
        return false;
    }

    public TJVideoListener getPublisherVideoListener() {
        return f21855a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m24133b(String str) {
        try {
            String host = new URL(TapjoyConfig.TJC_SERVICE_URL).getHost();
            if ((host == null || !str.contains(host)) && !str.contains(TapjoyConnectCore.getRedirectDomain()) && !str.contains(TapjoyUtil.getRedirectDomain(TapjoyConnectCore.getPlacementURL()))) {
                return false;
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m24139e() {
        NetworkInfo activeNetworkInfo;
        try {
            if (this.f21869d.getContext() == null || (activeNetworkInfo = ((ConnectivityManager) this.f21869d.getContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TapjoyLog.m24273d("TJAdUnit", "Exception getting NetworkInfo: " + e.getLocalizedMessage());
        }
        return false;
    }

    public void notifyOrientationChanged() {
        this.f21867b.notifyOrientationChanged(getScreenOrientationString(), this.f21859D, this.f21860E);
    }
}
