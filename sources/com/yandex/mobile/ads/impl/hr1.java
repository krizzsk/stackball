package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class hr1 {
    /* renamed from: a */
    public boolean mo67614a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return xmlPullParser.next() != 3;
    }

    /* renamed from: b */
    public boolean mo67616b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: d */
    public void mo67618d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public Boolean mo67613a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Boolean.valueOf(Boolean.parseBoolean(attributeValue));
        }
        return null;
    }

    /* renamed from: b */
    public void mo67615b(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, (String) null, str);
    }

    /* renamed from: c */
    public String mo67617c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str;
        if (xmlPullParser.next() == 4) {
            str = xmlPullParser.getText();
            xmlPullParser.nextTag();
        } else {
            str = "";
        }
        return str.trim();
    }
}
