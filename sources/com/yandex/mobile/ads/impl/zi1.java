package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.Verification;
import com.yandex.mobile.ads.video.models.p268ad.JavaScriptResource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class zi1 implements gr1<vi1> {

    /* renamed from: a */
    private final hr1 f43148a = new hr1();

    /* renamed from: b */
    private final sh0 f43149b = new sh0();

    /* renamed from: c */
    private final yi1 f43150c = new yi1();

    /* renamed from: d */
    private final te1 f43151d = new te1();

    /* renamed from: a */
    public Object mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f43148a.getClass();
        xmlPullParser.require(2, (String) null, Verification.NAME);
        this.f43148a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, Verification.VENDOR);
        Map<String, List<String>> hashMap = new HashMap<>();
        JavaScriptResource javaScriptResource = null;
        String str = null;
        while (this.f43148a.mo67614a(xmlPullParser)) {
            if (this.f43148a.mo67616b(xmlPullParser)) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    javaScriptResource = this.f43149b.mo69973a(xmlPullParser);
                } else if (Verification.VERIFICATION_PARAMETERS.equals(name)) {
                    str = this.f43150c.mo71089a(xmlPullParser);
                } else if ("TrackingEvents".equals(name)) {
                    hashMap = this.f43151d.mo70173a(xmlPullParser);
                } else {
                    this.f43148a.mo67618d(xmlPullParser);
                }
            }
        }
        if (!TextUtils.isEmpty(attributeValue)) {
            return new vi1(attributeValue, javaScriptResource, str, hashMap);
        }
        return null;
    }
}
