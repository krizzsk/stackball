package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.MediaFile;
import com.yandex.mobile.ads.video.models.p268ad.C15566b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class vl0 implements gr1<C15566b> {

    /* renamed from: a */
    private final hr1 f41321a = new hr1();

    vl0() {
    }

    /* renamed from: a */
    public Object mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f41321a.getClass();
        xmlPullParser.require(2, (String) null, MediaFile.NAME);
        this.f41321a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, MediaFile.DELIVERY);
        this.f41321a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "type");
        this.f41321a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "height");
        this.f41321a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue((String) null, "width");
        this.f41321a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue((String) null, MediaFile.BITRATE);
        this.f41321a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue((String) null, "id");
        this.f41321a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue((String) null, MediaFile.CODEC);
        this.f41321a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue((String) null, "vmaf");
        String c = this.f41321a.mo67617c(xmlPullParser);
        C15566b.C15567a h = new C15566b.C15567a().mo71994d(attributeValue6).mo71992b(attributeValue).mo71993c(attributeValue3).mo71998h(attributeValue4);
        try {
            h.f44154i = Integer.valueOf(attributeValue5).intValue();
        } catch (Exception unused) {
        }
        return h.mo71995e(attributeValue2).mo71996f(c).mo71990a(attributeValue7).mo71997g(attributeValue8).mo71991a();
    }
}
