package com.smaato.sdk.richmedia.util;

import android.content.Context;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;

public final class RichMediaHtmlUtils {
    private final boolean loggingEnabled;

    public RichMediaHtmlUtils(Boolean bool) {
        this.loggingEnabled = ((Boolean) Objects.requireNonNull(bool)).booleanValue();
    }

    public final String createHtml(String str, Context context, MraidEnvironmentProperties mraidEnvironmentProperties) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(context);
        Objects.requireNonNull(mraidEnvironmentProperties);
        StringBuilder sb = new StringBuilder("<!DOCTYPE html><html style='margin: 0px; padding: 0px; width: 100%; height: 100%;'><head><meta name='viewport' content='initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no'/><style>body {margin: 0px; min-height: 100%%; position: relative; padding: 0px; width: 100%%; height: 100%%;}</style><script src=\"file:///android_asset/mraid.js\"></script><script>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("window.MRAID_ENV = {\n");
        sb2.append(String.format("version:'%s',\n", new Object[]{MraidEnvironmentProperties.VERSION}));
        sb2.append(String.format("sdk: '%s',\n", new Object[]{MraidEnvironmentProperties.SDK}));
        sb2.append(String.format("sdkVersion: '%s',\n", new Object[]{mraidEnvironmentProperties.sdkVersion}));
        sb2.append(String.format("appId: '%s',\n", new Object[]{mraidEnvironmentProperties.appId}));
        Objects.onNotNull(mraidEnvironmentProperties.googleAdId, new Consumer(sb2) {
            public final /* synthetic */ StringBuilder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.append(String.format("ifa: '%s',\n", new Object[]{(String) obj}));
            }
        });
        Objects.onNotNull(mraidEnvironmentProperties.googleDnt, new Consumer(sb2) {
            public final /* synthetic */ StringBuilder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.append(String.format("limitAdTracking: %b,\n", new Object[]{(Boolean) obj}));
            }
        });
        Objects.onNotNull(mraidEnvironmentProperties.coppa, new Consumer(sb2) {
            public final /* synthetic */ StringBuilder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                RichMediaHtmlUtils.lambda$getMraidEnvironmentDetails$2(this.f$0, (Integer) obj);
            }
        });
        sb2.append("};");
        sb.append(sb2.toString());
        sb.append("</script></head><body><script src=\"file:///android_asset/omsdk-v1.js\"></script>");
        sb.append(str.replaceAll("mraid.js", "file:///android_asset/mraid.js"));
        sb.append("</body></html>");
        return sb.toString();
    }

    static /* synthetic */ void lambda$getMraidEnvironmentDetails$2(StringBuilder sb, Integer num) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (num.intValue() != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        sb.append(String.format("coppa: %b,\n", objArr));
    }

    public final boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }
}
