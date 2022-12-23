package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lj1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class zd0 {

    /* renamed from: a */
    private final vj1 f43096a = new vj1();

    /* renamed from: b */
    private final hr1 f43097b = new hr1();

    zd0() {
    }

    /* renamed from: a */
    public lj1 mo71212a(XmlPullParser xmlPullParser, lj1.C13860a aVar) throws IOException, XmlPullParserException {
        this.f43097b.getClass();
        xmlPullParser.require(2, (String) null, "InLine");
        while (this.f43097b.mo67614a(xmlPullParser)) {
            if (this.f43097b.mo67616b(xmlPullParser)) {
                this.f43096a.mo70499a(xmlPullParser, aVar);
            }
        }
        lj1 a = aVar.mo68478a();
        if (a.mo68458e().isEmpty()) {
            return null;
        }
        return a;
    }
}
