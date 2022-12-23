package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.Extension;
import com.yandex.mobile.ads.impl.yj1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class zj1 {

    /* renamed from: d */
    private static final List<String> f43216d = CollectionsKt.listOf("ad_system", "social_ad_info", "yandex_ad_info");

    /* renamed from: a */
    private final hr1 f43217a;

    /* renamed from: b */
    private final q81 f43218b;

    /* renamed from: c */
    private final fr1<qe1> f43219c = m44708a();

    public zj1() {
        hr1 hr1 = new hr1();
        this.f43217a = hr1;
        this.f43218b = new q81(hr1);
    }

    /* renamed from: a */
    public final yj1 mo71250a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "parser");
        this.f43217a.getClass();
        xmlPullParser.require(2, (String) null, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yj1.C15255a aVar = new yj1.C15255a();
        while (this.f43217a.mo67614a(xmlPullParser)) {
            if (this.f43217a.mo67616b(xmlPullParser)) {
                if (Intrinsics.areEqual((Object) Extension.NAME, (Object) xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue((String) null, "type");
                    if (f43216d.contains(attributeValue)) {
                        r50 b = this.f43218b.mo66931a(xmlPullParser);
                        if (b != null) {
                            arrayList2.add(b);
                        }
                    } else if (Intrinsics.areEqual((Object) "yandex_tracking_events", (Object) attributeValue)) {
                        List<qe1> b2 = this.f43219c.mo66931a(xmlPullParser);
                        Intrinsics.checkNotNullExpressionValue(b2, "trackingEventsParser.parseElement(parser)");
                        arrayList.addAll(b2);
                    } else {
                        this.f43217a.mo67618d(xmlPullParser);
                    }
                } else {
                    this.f43217a.mo67618d(xmlPullParser);
                }
            }
        }
        aVar.mo71093a(arrayList2);
        aVar.mo71095b(arrayList);
        return aVar.mo71094a();
    }

    /* renamed from: a */
    private final fr1<qe1> m44708a() {
        return new fr1<>(new se1(), Extension.NAME, C8938Tracking.NAME);
    }
}
