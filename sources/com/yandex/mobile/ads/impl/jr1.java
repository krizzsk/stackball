package com.yandex.mobile.ads.impl;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class jr1 {
    /* renamed from: a */
    public static String m37962a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m37963b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (!(xmlPullParser.getEventType() == 3) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m37964c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (!(xmlPullParser.getEventType() == 2) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }
}
