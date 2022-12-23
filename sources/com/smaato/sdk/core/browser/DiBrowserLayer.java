package com.smaato.sdk.core.browser;

import android.app.Application;
import android.content.ClipboardManager;
import android.webkit.CookieManager;
import com.smaato.sdk.core.deeplink.DiDeepLinkLayer;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.webview.DiWebViewLayer;

public final class DiBrowserLayer {
    private DiBrowserLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiBrowserLayer$0pdorI6_yUnFA697NyX04olySEY.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$6(DiRegistry diRegistry) {
        diRegistry.registerFactory(CookieSyncManagerHolder.class, $$Lambda$DiBrowserLayer$PNiG02AdL5BkX1V2ltdAHjsUzA.INSTANCE);
        diRegistry.registerFactory(ClipboardManager.class, $$Lambda$DiBrowserLayer$gKAMlDaKz1M5Fy4y3RSqSmyGomM.INSTANCE);
        diRegistry.registerFactory(CookieManager.class, $$Lambda$DiBrowserLayer$mosSdIKY6KG7GSs8CfCvmhC_68.INSTANCE);
        diRegistry.registerFactory(SmaatoCookieManager.class, $$Lambda$DiBrowserLayer$WjGcGjViY_95sDa38I2z7PLsrqs.INSTANCE);
        diRegistry.registerFactory(BrowserModel.class, $$Lambda$DiBrowserLayer$BrSdp1_X5_knozSnVV3csr2e0X4.INSTANCE);
        diRegistry.registerFactory(BrowserPresenter.class, $$Lambda$DiBrowserLayer$pdv80w433GpJL6tnDGTSg1UHY.INSTANCE);
    }

    static /* synthetic */ CookieSyncManagerHolder lambda$null$0(DiConstructor diConstructor) {
        return new CookieSyncManagerHolder((Application) diConstructor.get(Application.class));
    }

    static /* synthetic */ ClipboardManager lambda$null$1(DiConstructor diConstructor) {
        return (ClipboardManager) Objects.requireNonNull((ClipboardManager) ((Application) diConstructor.get(Application.class)).getSystemService("clipboard"));
    }

    static /* synthetic */ SmaatoCookieManager lambda$null$3(DiConstructor diConstructor) {
        return new SmaatoCookieManager((CookieManager) diConstructor.get(CookieManager.class), (CookieSyncManagerHolder) diConstructor.get(CookieSyncManagerHolder.class));
    }

    static /* synthetic */ BrowserModel lambda$null$4(DiConstructor diConstructor) {
        return new BrowserModel(DiLogLayer.getLoggerFrom(diConstructor), DiWebViewLayer.getBaseWebViewClientFrom(diConstructor), DiWebViewLayer.getBaseWebChromeClientFrom(diConstructor), (SmaatoCookieManager) diConstructor.get(SmaatoCookieManager.class));
    }

    static /* synthetic */ BrowserPresenter lambda$null$5(DiConstructor diConstructor) {
        return new BrowserPresenter(DiLogLayer.getLoggerFrom(diConstructor), (BrowserModel) diConstructor.get(BrowserModel.class), DiNetworkLayer.getUrlCreatorFrom(diConstructor), DiDeepLinkLayer.getLinkResolverFrom(diConstructor), (ClipboardManager) diConstructor.get(ClipboardManager.class));
    }
}
