package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.ViewableImpression;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class so1 implements gr1<ro1> {

    /* renamed from: a */
    private final hr1 f40099a = new hr1();

    so1() {
    }

    /* renamed from: b */
    public ro1 mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f40099a.getClass();
        xmlPullParser.require(2, (String) null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (this.f40099a.mo67614a(xmlPullParser)) {
            if (this.f40099a.mo67616b(xmlPullParser)) {
                if (ViewableImpression.VIEWABLE.equals(xmlPullParser.getName())) {
                    arrayList.add(this.f40099a.mo67617c(xmlPullParser));
                } else {
                    this.f40099a.mo67618d(xmlPullParser);
                }
            }
        }
        return new ro1(arrayList);
    }
}
