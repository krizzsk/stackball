package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Wrapper;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.u4 */
class C14738u4 {

    /* renamed from: a */
    private final hr1 f40563a;

    /* renamed from: b */
    private final C15293z4 f40564b;

    public C14738u4(hr1 hr1) {
        this.f40563a = hr1;
        this.f40564b = new C15293z4(hr1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C14652t4 mo70282a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f40563a.getClass();
        C14652t4 t4Var = null;
        xmlPullParser.require(2, (String) null, "AdSource");
        Boolean a = this.f40563a.mo67613a(xmlPullParser, Wrapper.ALLOW_MULTIPLE_ADS);
        Boolean a2 = this.f40563a.mo67613a(xmlPullParser, "followRedirects");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "id");
        while (this.f40563a.mo67614a(xmlPullParser)) {
            if (this.f40563a.mo67616b(xmlPullParser)) {
                if ("AdTagURI".equals(xmlPullParser.getName())) {
                    C15233y4 a3 = this.f40564b.mo71152a(xmlPullParser);
                    if (a3 != null) {
                        t4Var = fp1.m36101a(a3, a, a2, attributeValue);
                    }
                } else {
                    this.f40563a.mo67618d(xmlPullParser);
                }
            }
        }
        return t4Var;
    }
}
