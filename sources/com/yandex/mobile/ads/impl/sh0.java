package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.video.models.p268ad.JavaScriptResource;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class sh0 {

    /* renamed from: a */
    private final hr1 f39983a = new hr1();

    /* renamed from: a */
    public JavaScriptResource mo69973a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f39983a.getClass();
        xmlPullParser.require(2, (String) null, "JavaScriptResource");
        this.f39983a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "apiFramework");
        Boolean a = this.f39983a.mo67613a(xmlPullParser, com.smaato.sdk.video.vast.model.JavaScriptResource.BROWSER_OPTIONAL);
        String c = this.f39983a.mo67617c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || a == null || TextUtils.isEmpty(c)) {
            return null;
        }
        return new JavaScriptResource(attributeValue, c, a.booleanValue());
    }
}
