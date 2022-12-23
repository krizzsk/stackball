package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f60 implements gr1<FalseClick> {

    /* renamed from: a */
    private final hr1 f33249a = new hr1();

    /* renamed from: a */
    public Object mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Long l;
        String c;
        this.f33249a.getClass();
        xmlPullParser.require(2, (String) null, "FalseClick");
        this.f33249a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, TJAdUnitConstants.String.INTERVAL);
        if (attributeValue != null) {
            try {
                l = Long.valueOf(Long.parseLong(attributeValue));
            } catch (Exception unused) {
            }
            c = this.f33249a.mo67617c(xmlPullParser);
            if (TextUtils.isEmpty(c) && l != null) {
                return new FalseClick(c, l.longValue());
            }
        }
        l = null;
        c = this.f33249a.mo67617c(xmlPullParser);
        return TextUtils.isEmpty(c) ? null : null;
    }
}
