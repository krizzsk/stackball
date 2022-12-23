package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Linear;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class n20 {

    /* renamed from: a */
    private final hr1 f37627a = new hr1();

    n20() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo68880a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f37627a.getClass();
        xmlPullParser.require(2, (String) null, Linear.DURATION);
        Long a = sl1.m42055a(this.f37627a.mo67617c(xmlPullParser));
        if (a != null) {
            return a.intValue();
        }
        return 0;
    }
}
