package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.Extension;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class q81 implements gr1<r50> {

    /* renamed from: a */
    private final hr1 f39022a;

    public q81(hr1 hr1) {
        this.f39022a = hr1;
    }

    /* renamed from: b */
    public r50 mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f39022a.getClass();
        xmlPullParser.require(2, (String) null, Extension.NAME);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "type");
        String c = this.f39022a.mo67617c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(c)) {
            return null;
        }
        return C14098ng.m40036a(attributeValue, c);
    }
}
