package com.facebook.internal.logging.dumpsys;

import android.webkit.ValueCallback;
import com.facebook.internal.logging.dumpsys.WebViewDumpHelper;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo72093d2 = {"<anonymous>", "", "html", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: WebViewDumpHelper.kt */
final class WebViewDumpHelper$handle$1<T> implements ValueCallback {
    final /* synthetic */ WebViewDumpHelper.WebViewData $data;
    final /* synthetic */ WebViewDumpHelper this$0;

    WebViewDumpHelper$handle$1(WebViewDumpHelper webViewDumpHelper, WebViewDumpHelper.WebViewData webViewData) {
        this.this$0 = webViewDumpHelper;
        this.$data = webViewData;
    }

    public final void onReceiveValue(String str) {
        Map access$getWebViewHTMLs$p = this.this$0.webViewHTMLs;
        String key = this.$data.getKey();
        Intrinsics.checkNotNullExpressionValue(str, TJAdUnitConstants.String.HTML);
        access$getWebViewHTMLs$p.put(key, str);
    }
}
