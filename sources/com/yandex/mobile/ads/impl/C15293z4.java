package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.z4 */
class C15293z4 {

    /* renamed from: a */
    private final hr1 f43015a;

    public C15293z4(hr1 hr1) {
        this.f43015a = hr1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C15233y4 mo71152a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f43015a.getClass();
        xmlPullParser.require(2, (String) null, "AdTagURI");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "templateType");
        String c = this.f43015a.mo67617c(xmlPullParser);
        if (!TextUtils.isEmpty(c)) {
            return fp1.m36103a(c, attributeValue);
        }
        return null;
    }
}
