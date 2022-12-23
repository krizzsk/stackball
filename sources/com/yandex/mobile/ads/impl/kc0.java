package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Icon;
import com.yandex.mobile.ads.video.models.p268ad.C15561a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class kc0 implements gr1<C15561a> {

    /* renamed from: a */
    private final hr1 f36091a = new hr1();

    kc0() {
    }

    /* renamed from: a */
    public Object mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        boolean z;
        this.f36091a.getClass();
        xmlPullParser.require(2, (String) null, Icon.NAME);
        C15561a.C15562a aVar = new C15561a.C15562a();
        this.f36091a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, Icon.PROGRAM);
        this.f36091a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "height");
        this.f36091a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "width");
        this.f36091a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue((String) null, Icon.X_POSITION);
        this.f36091a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue((String) null, Icon.Y_POSITION);
        this.f36091a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue((String) null, "apiFramework");
        this.f36091a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue((String) null, "offset");
        this.f36091a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue((String) null, "duration");
        while (this.f36091a.mo67614a(xmlPullParser)) {
            if (this.f36091a.mo67616b(xmlPullParser)) {
                String name = xmlPullParser.getName();
                Iterator it = Arrays.asList(C15561a.C15564c.values()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C15561a.C15564c) it.next()).f44132b.equals(name)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    aVar.mo71978g(name).mo71979h(this.f36091a.mo67617c(xmlPullParser));
                } else {
                    this.f36091a.mo67618d(xmlPullParser);
                }
            }
        }
        return aVar.mo71977f(attributeValue).mo71974c(attributeValue2).mo71981j(attributeValue3).mo71975d(attributeValue4).mo71980i(attributeValue5).mo71971a(attributeValue6).mo71976e(attributeValue7).mo71973b(attributeValue8).mo71972a();
    }
}
