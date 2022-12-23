package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class fr1<T> implements gr1<List<T>> {

    /* renamed from: a */
    private final hr1 f33596a = new hr1();

    /* renamed from: b */
    private final String f33597b;

    /* renamed from: c */
    private final String f33598c;

    /* renamed from: d */
    private final gr1<T> f33599d;

    public fr1(gr1<T> gr1, String str, String str2) {
        this.f33599d = gr1;
        this.f33597b = str;
        this.f33598c = str2;
    }

    /* renamed from: b */
    public List<T> mo66931a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        ArrayList arrayList = new ArrayList();
        this.f33596a.mo67615b(xmlPullParser, this.f33597b);
        while (this.f33596a.mo67614a(xmlPullParser)) {
            if (this.f33596a.mo67616b(xmlPullParser)) {
                if (this.f33598c.equals(xmlPullParser.getName())) {
                    T a = this.f33599d.mo66931a(xmlPullParser);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    this.f33596a.mo67618d(xmlPullParser);
                }
            }
        }
        return arrayList;
    }
}
