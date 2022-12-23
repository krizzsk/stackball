package com.smaato.sdk.video.vast.utils;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;
import com.smaato.sdk.video.vast.utils.VastScenarioResourceHtmlHelper;
import java.util.Locale;

public class VastScenarioResourceDataConverter {
    public String getUriFromResources(VastScenarioResourceData vastScenarioResourceData, int i, int i2) {
        String str;
        String str2 = "100%";
        if (i == 0) {
            str = str2;
        } else {
            str = i + "px";
        }
        if (i2 != 0) {
            str2 = i2 + "px";
        }
        if (vastScenarioResourceData.staticResources != null) {
            StaticResource staticResource = vastScenarioResourceData.staticResources;
            StaticResource.CreativeType creativeType = staticResource.creativeType;
            if (!URLUtil.isValidUrl(staticResource.uri)) {
                return "";
            }
            int i3 = VastScenarioResourceHtmlHelper.C89561.f21842xf02e4b7d[creativeType.ordinal()];
            if (i3 == 1) {
                return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\"><img src=\"%1$s\" width=\"100%%\" style=\"max-width:100%%;max-height:100%%;\" /></body></html>", new Object[]{staticResource.uri});
            } else if (i3 == 2) {
                return String.format(Locale.US, "<script src=\"%1$s\"></script>", new Object[]{staticResource.uri});
            } else if (i3 != 3) {
                return "";
            } else {
                return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">%1$s</body></html>", new Object[]{staticResource.uri});
            }
        } else if (!TextUtils.isEmpty(vastScenarioResourceData.htmlResources)) {
            return String.format(Locale.US, "<html><head></head><body style=\"margin:0;padding:0;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);\">%1$s</body></html>", new Object[]{vastScenarioResourceData.htmlResources});
        } else if (TextUtils.isEmpty(vastScenarioResourceData.iFrameResources)) {
            return null;
        } else {
            return String.format(Locale.US, "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border:0px;margin:0;padding:0\" width=\"%1$s\" height=\"%2$s\" src=\"%3$s\"></iframe>", new Object[]{str, str2, vastScenarioResourceData.iFrameResources});
        }
    }
}
