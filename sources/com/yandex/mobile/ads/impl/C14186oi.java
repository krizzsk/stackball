package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Creative;
import com.yandex.mobile.ads.impl.C13413ii;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.oi */
class C14186oi implements gr1<C13413ii> {

    /* renamed from: a */
    private final hr1 f38230a = new hr1();

    /* renamed from: b */
    private final cj0 f38231b = new cj0();

    /* renamed from: c */
    private final C13858li f38232c = new C13858li();

    C14186oi() {
    }

    /* renamed from: a */
    public Object mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f38230a.getClass();
        xmlPullParser.require(2, (String) null, Creative.NAME);
        this.f38230a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "id");
        C13413ii.C13414a aVar = new C13413ii.C13414a();
        aVar.mo67801b(attributeValue);
        boolean z = false;
        while (this.f38230a.mo67614a(xmlPullParser)) {
            if (this.f38230a.mo67616b(xmlPullParser)) {
                String name = xmlPullParser.getName();
                if ("Linear".equals(name)) {
                    this.f38231b.mo66310a(xmlPullParser, aVar);
                    z = true;
                } else if (Creative.CREATIVE_EXTENSIONS.equals(name)) {
                    aVar.mo67795a(this.f38232c.mo68436a(xmlPullParser));
                } else {
                    this.f38230a.mo67618d(xmlPullParser);
                }
            }
        }
        if (z) {
            return aVar.mo67800a();
        }
        return null;
    }
}
