package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class zl1 implements gr1<yl1> {

    /* renamed from: a */
    private final hr1 f43227a = new hr1();

    zl1() {
    }

    /* renamed from: b */
    public yl1 mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f43227a.getClass();
        String str = null;
        xmlPullParser.require(2, (String) null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (this.f43227a.mo67614a(xmlPullParser)) {
            if (this.f43227a.mo67616b(xmlPullParser)) {
                String name = xmlPullParser.getName();
                if (VideoClicks.CLICK_THROUGH.equals(name)) {
                    String c = this.f43227a.mo67617c(xmlPullParser);
                    if (!TextUtils.isEmpty(c)) {
                        str = c;
                    }
                } else if (VideoClicks.CLICK_TRACKING.equals(name)) {
                    String c2 = this.f43227a.mo67617c(xmlPullParser);
                    if (!TextUtils.isEmpty(c2)) {
                        arrayList.add(c2);
                    }
                } else {
                    this.f43227a.mo67618d(xmlPullParser);
                }
            }
        }
        return new yl1(arrayList, str);
    }
}
