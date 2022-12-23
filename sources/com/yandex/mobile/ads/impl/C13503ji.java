package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.ji */
public class C13503ji<T> implements gr1<T> {

    /* renamed from: a */
    private final hr1 f35312a = new hr1();

    /* renamed from: b */
    private final gr1<T> f35313b;

    C13503ji(gr1<T> gr1) {
        this.f35313b = gr1;
    }

    /* renamed from: a */
    public T mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f35312a.getClass();
        T t = null;
        xmlPullParser.require(2, (String) null, "CreativeExtension");
        while (this.f35312a.mo67614a(xmlPullParser)) {
            if (this.f35312a.mo67616b(xmlPullParser)) {
                t = this.f35313b.mo66931a(xmlPullParser);
            }
        }
        return t;
    }
}
