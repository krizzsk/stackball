package com.amazon.device.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;

class AdContainer extends FrameLayout implements Destroyable {
    private static final String CONTENT_DESCRIPTION_AD_CONTAINER = "adContainerObject";
    private boolean allowClicks;
    private String baseUrl;
    private boolean disableHardwareAcceleration;
    private String html;
    private final NativeCloseButton nativeCloseButton;
    private PreloadCallback preloadCallback;
    private boolean shouldPreload;
    private ViewManager viewManager;

    public AdContainer(Context context, AdCloser adCloser) {
        this(context, adCloser, new ViewManagerFactory(), (NativeCloseButton) null);
    }

    AdContainer(Context context, AdCloser adCloser, ViewManagerFactory viewManagerFactory, NativeCloseButton nativeCloseButton2) {
        super(context);
        this.disableHardwareAcceleration = false;
        this.allowClicks = true;
        this.viewManager = viewManagerFactory.withViewGroup(this).createViewManager();
        setContentDescription(CONTENT_DESCRIPTION_AD_CONTAINER);
        if (nativeCloseButton2 == null) {
            this.nativeCloseButton = new NativeCloseButton(this, adCloser);
        } else {
            this.nativeCloseButton = nativeCloseButton2;
        }
    }

    public void initialize() throws IllegalStateException {
        this.viewManager.disableHardwareAcceleration(this.disableHardwareAcceleration);
        this.viewManager.initialize();
    }

    public void setAdWebViewClient(AdWebViewClient adWebViewClient) {
        this.viewManager.setWebViewClient(adWebViewClient);
    }

    public void disableHardwareAcceleration(boolean z) {
        this.disableHardwareAcceleration = z;
        ViewManager viewManager2 = this.viewManager;
        if (viewManager2 != null) {
            viewManager2.disableHardwareAcceleration(z);
        }
    }

    public void destroy() {
        this.viewManager.destroy();
    }

    public void injectJavascript(String str, boolean z) {
        ViewManager viewManager2 = this.viewManager;
        viewManager2.loadUrl("javascript:" + str, z, (PreloadCallback) null);
    }

    public void setViewHeight(int i) {
        this.viewManager.setHeight(i);
    }

    public void setViewLayoutParams(int i, int i2, int i3) {
        this.viewManager.setLayoutParams(i, i2, i3);
    }

    public int getViewWidth() {
        return this.viewManager.getWidth();
    }

    public int getViewHeight() {
        return this.viewManager.getHeight();
    }

    public void getViewLocationOnScreen(int[] iArr) {
        this.viewManager.getLocationOnScreen(iArr);
    }

    public boolean canShowViews() {
        return this.viewManager.canShowViews();
    }

    public void loadHtml(String str, String str2, boolean z, PreloadCallback preloadCallback2) {
        this.baseUrl = str;
        this.html = str2;
        this.shouldPreload = z;
        this.preloadCallback = preloadCallback2;
        this.viewManager.loadDataWithBaseURL(str, str2, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null, z, preloadCallback2);
    }

    public WebView getCurrentAdView() {
        return this.viewManager.getCurrentAdView();
    }

    public void removePreviousInterfaces() {
        this.viewManager.removePreviousInterfaces();
    }

    public void addJavascriptInterface(Object obj, boolean z, String str) {
        this.viewManager.addJavascriptInterface(obj, z, str);
    }

    public void reload() {
        loadHtml(this.baseUrl, this.html, this.shouldPreload, this.preloadCallback);
    }

    public boolean isCurrentView(View view) {
        return this.viewManager.isCurrentView(view);
    }

    public void stashView() {
        this.viewManager.stashView();
    }

    public boolean popView() {
        return this.viewManager.popView();
    }

    public void enableNativeCloseButton(boolean z, RelativePosition relativePosition) {
        this.nativeCloseButton.enable(z, relativePosition);
    }

    public void removeNativeCloseButton() {
        this.nativeCloseButton.remove();
    }

    public void showNativeCloseButtonImage(boolean z) {
        this.nativeCloseButton.showImage(z);
    }

    public void listenForKey(View.OnKeyListener onKeyListener) {
        this.viewManager.listenForKey(onKeyListener);
    }

    public void setAllowClicks(boolean z) {
        this.allowClicks = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.allowClicks;
    }

    static class AdContainerFactory {
        AdContainerFactory() {
        }

        public AdContainer createAdContainer(Context context, AdCloser adCloser) {
            return new AdContainer(context, adCloser);
        }
    }
}
