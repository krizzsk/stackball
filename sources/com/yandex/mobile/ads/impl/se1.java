package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.yandex.mobile.ads.video.parser.offset.C15571a;
import com.yandex.mobile.ads.video.parser.offset.C15572b;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class se1 implements gr1<qe1> {

    /* renamed from: a */
    private final hr1 f39946a = new hr1();

    /* renamed from: b */
    private final C15572b f39947b = new C15572b(new HashSet(Arrays.asList(C15571a.values())));

    /* renamed from: b */
    public qe1 mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f39946a.getClass();
        VastTimeOffset vastTimeOffset = null;
        xmlPullParser.require(2, (String) null, C8938Tracking.NAME);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "offset");
        String c = this.f39946a.mo67617c(xmlPullParser);
        boolean z = !TextUtils.isEmpty(attributeValue);
        boolean z2 = !TextUtils.isEmpty(c);
        if (!z || !z2) {
            return null;
        }
        if (attributeValue2 != null) {
            vastTimeOffset = this.f39947b.mo72005a(attributeValue2);
        }
        return new qe1(attributeValue, c, vastTimeOffset);
    }
}
