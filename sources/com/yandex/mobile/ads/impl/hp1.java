package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Xml;
import com.yandex.mobile.ads.video.parser.vmap.configurator.C15575a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class hp1 {

    /* renamed from: a */
    private final C12846d1 f34503a;

    /* renamed from: b */
    private final v50 f34504b;

    /* renamed from: c */
    private final hr1 f34505c;

    /* renamed from: d */
    private final C13947m1 f34506d = new C13947m1();

    /* renamed from: e */
    private final C15575a f34507e = new C15575a();

    public hp1() {
        hr1 hr1 = new hr1();
        this.f34505c = hr1;
        v50 v50 = new v50(hr1);
        this.f34504b = v50;
        this.f34503a = new C12846d1(hr1, v50);
    }

    /* renamed from: a */
    public ep1 mo67587a(String str) throws IOException, XmlPullParserException, gp1 {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        this.f34505c.getClass();
        newPullParser.require(2, (String) null, "VMAP");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String attributeValue = newPullParser.getAttributeValue((String) null, "version");
        while (this.f34505c.mo67614a(newPullParser)) {
            if (this.f34505c.mo67616b(newPullParser)) {
                String name = newPullParser.getName();
                if ("AdBreak".equals(name)) {
                    C12563b1 a = this.f34503a.mo66383a(newPullParser);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else if ("Extensions".equals(name)) {
                    arrayList2.addAll(this.f34504b.mo70448a(newPullParser));
                } else {
                    this.f34505c.mo67618d(newPullParser);
                }
            }
        }
        if (!TextUtils.isEmpty(attributeValue)) {
            this.f34506d.mo68551a(arrayList, this.f34507e.mo72016a(arrayList2));
            return fp1.m36100a(attributeValue, arrayList, arrayList2);
        }
        throw new gp1("Empty version attribute");
    }
}
