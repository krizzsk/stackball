package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Extension;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class v50 {

    /* renamed from: a */
    private final hr1 f41190a;

    /* renamed from: b */
    private final q81 f41191b;

    public v50(hr1 hr1) {
        this.f41190a = hr1;
        this.f41191b = new q81(hr1);
    }

    /* renamed from: a */
    public List<r50> mo70448a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f41190a.getClass();
        xmlPullParser.require(2, (String) null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (this.f41190a.mo67614a(xmlPullParser)) {
            if (this.f41190a.mo67616b(xmlPullParser)) {
                if (Extension.NAME.equals(xmlPullParser.getName())) {
                    r50 b = this.f41191b.mo66931a(xmlPullParser);
                    if (b != null) {
                        arrayList.add(b);
                    }
                } else {
                    this.f41190a.mo67618d(xmlPullParser);
                }
            }
        }
        return arrayList;
    }
}
