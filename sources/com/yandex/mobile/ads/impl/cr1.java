package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Wrapper;
import com.yandex.mobile.ads.impl.lj1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class cr1 {

    /* renamed from: a */
    private final hr1 f32026a = new hr1();

    /* renamed from: b */
    private final vj1 f32027b = new vj1();

    /* renamed from: c */
    private final ar1 f32028c = new ar1();

    cr1() {
    }

    /* renamed from: a */
    public lj1 mo66349a(XmlPullParser xmlPullParser, lj1.C13860a aVar) throws IOException, XmlPullParserException {
        this.f32026a.getClass();
        xmlPullParser.require(2, (String) null, "Wrapper");
        this.f32028c.getClass();
        aVar.mo68472a(new zq1(Boolean.parseBoolean(xmlPullParser.getAttributeValue((String) null, Wrapper.ALLOW_MULTIPLE_ADS)), Boolean.parseBoolean(xmlPullParser.getAttributeValue((String) null, Wrapper.FOLLOW_ADDITIONAL_WRAPPERS))));
        while (this.f32026a.mo67614a(xmlPullParser)) {
            if (this.f32026a.mo67616b(xmlPullParser)) {
                if ("VASTAdTagURI".equals(xmlPullParser.getName())) {
                    aVar.mo68483e(this.f32026a.mo67617c(xmlPullParser));
                } else {
                    this.f32027b.mo70499a(xmlPullParser, aVar);
                }
            }
        }
        return aVar.mo68478a();
    }
}
