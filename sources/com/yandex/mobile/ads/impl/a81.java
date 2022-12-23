package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a81 {

    /* renamed from: a */
    private final hr1 f30466a = new hr1();

    a81() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo65694a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f30466a.getClass();
        xmlPullParser.require(2, (String) null, "Ad");
        Integer b = sl1.m42057b(xmlPullParser.getAttributeValue((String) null, "sequence"));
        if (b == null || b.intValue() >= 0) {
            return b;
        }
        return null;
    }
}
