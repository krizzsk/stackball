package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.Creative;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.C13709ki;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.yandex.mobile.ads.impl.li */
public class C13858li {

    /* renamed from: a */
    private final hr1 f36672a = new hr1();

    /* renamed from: b */
    private final C13503ji<FalseClick> f36673b = m38752a();

    /* renamed from: c */
    private final fr1<qe1> f36674c = m38753b();

    /* renamed from: b */
    private fr1<qe1> m38753b() {
        return new fr1<>(new se1(), "CreativeExtension", C8938Tracking.NAME);
    }

    /* renamed from: a */
    public C13709ki mo68436a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f36672a.getClass();
        xmlPullParser.require(2, (String) null, Creative.CREATIVE_EXTENSIONS);
        C13709ki.C13710a aVar = new C13709ki.C13710a();
        while (this.f36672a.mo67614a(xmlPullParser)) {
            if (this.f36672a.mo67616b(xmlPullParser)) {
                if ("CreativeExtension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue((String) null, "type");
                    if ("false_click".equals(attributeValue)) {
                        aVar.mo68235a(this.f36673b.mo66931a(xmlPullParser));
                    } else if ("yandex_tracking_events".equals(attributeValue)) {
                        aVar.mo68236a(this.f36674c.mo66931a(xmlPullParser));
                    } else {
                        this.f36672a.mo67618d(xmlPullParser);
                    }
                } else {
                    this.f36672a.mo67618d(xmlPullParser);
                }
            }
        }
        return new C13709ki(aVar);
    }

    /* renamed from: a */
    private C13503ji<FalseClick> m38752a() {
        return new C13503ji<>(new f60());
    }
}
