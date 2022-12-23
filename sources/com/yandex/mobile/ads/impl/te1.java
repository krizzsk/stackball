package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.C8938Tracking;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class te1 {

    /* renamed from: a */
    private final hr1 f40301a = new hr1();

    /* renamed from: b */
    private final se1 f40302b = new se1();

    /* renamed from: a */
    public Map<String, List<String>> mo70173a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f40301a.getClass();
        xmlPullParser.require(2, (String) null, "TrackingEvents");
        HashMap hashMap = new HashMap();
        while (this.f40301a.mo67614a(xmlPullParser)) {
            if (this.f40301a.mo67616b(xmlPullParser)) {
                if (C8938Tracking.NAME.equals(xmlPullParser.getName())) {
                    qe1 b = this.f40302b.mo66931a(xmlPullParser);
                    if (b != null) {
                        String a = b.mo69585a();
                        String c = b.mo69587c();
                        if (!hashMap.containsKey(a)) {
                            hashMap.put(a, new ArrayList());
                        }
                        ((List) hashMap.get(a)).add(c);
                    }
                } else {
                    this.f40301a.mo67618d(xmlPullParser);
                }
            }
        }
        return hashMap;
    }
}
