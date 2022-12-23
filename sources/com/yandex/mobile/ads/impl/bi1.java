package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class bi1 {

    /* renamed from: a */
    private final hr1 f31335a = new hr1();

    /* renamed from: b */
    private final jk1 f31336b;

    bi1(Context context) {
        this.f31336b = new jk1(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public xh1 mo66075a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f31335a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "version");
        ArrayList arrayList = new ArrayList();
        while (this.f31335a.mo67614a(xmlPullParser)) {
            if (this.f31335a.mo67616b(xmlPullParser)) {
                if ("Ad".equals(xmlPullParser.getName())) {
                    lj1 a = this.f31336b.mo68021a(xmlPullParser);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    this.f31335a.mo67618d(xmlPullParser);
                }
            }
        }
        if (!TextUtils.isEmpty(attributeValue)) {
            return new xh1(attributeValue, arrayList);
        }
        return null;
    }
}
