package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ti1 {

    /* renamed from: a */
    private final hr1 f40342a = new hr1();

    /* renamed from: b */
    private final bi1 f40343b;

    public ti1(Context context) {
        this.f40343b = new bi1(context);
    }

    /* renamed from: a */
    public xh1 mo70188a(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        this.f40342a.getClass();
        newPullParser.require(2, (String) null, VastTree.VAST);
        return this.f40343b.mo66075a(newPullParser);
    }
}
