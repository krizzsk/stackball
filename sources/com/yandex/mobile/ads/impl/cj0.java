package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.Icon;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.yandex.mobile.ads.impl.C13413ii;
import com.yandex.mobile.ads.impl.g91;
import com.yandex.mobile.ads.video.models.p268ad.C15561a;
import com.yandex.mobile.ads.video.models.p268ad.C15566b;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class cj0 {

    /* renamed from: a */
    private final hr1 f31943a = new hr1();

    /* renamed from: b */
    private final zl1 f31944b = new zl1();

    /* renamed from: c */
    private final n20 f31945c = new n20();

    /* renamed from: d */
    private final h91 f31946d = new h91();

    /* renamed from: e */
    private final fr1<C15566b> f31947e = new fr1<>(new vl0(), Linear.MEDIA_FILES, MediaFile.NAME);

    /* renamed from: f */
    private final fr1<C15561a> f31948f = new fr1<>(new kc0(), Linear.ICONS, Icon.NAME);

    /* renamed from: g */
    private final fr1<qe1> f31949g = new fr1<>(new se1(), "TrackingEvents", C8938Tracking.NAME);

    cj0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66310a(XmlPullParser xmlPullParser, C13413ii.C13414a aVar) throws IOException, XmlPullParserException {
        this.f31943a.getClass();
        xmlPullParser.require(2, (String) null, "Linear");
        this.f31946d.getClass();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, Linear.SKIPOFFSET);
        aVar.mo67794a(!TextUtils.isEmpty(attributeValue) ? new g91.C13183a(attributeValue).mo67211a() : null);
        while (this.f31943a.mo67614a(xmlPullParser)) {
            if (this.f31943a.mo67616b(xmlPullParser)) {
                String name = xmlPullParser.getName();
                if (Linear.DURATION.equals(name)) {
                    aVar.mo67793a(this.f31945c.mo68880a(xmlPullParser));
                } else if ("TrackingEvents".equals(name)) {
                    Iterator it = ((ArrayList) this.f31949g.mo66931a(xmlPullParser)).iterator();
                    while (it.hasNext()) {
                        aVar.mo67796a((qe1) it.next());
                    }
                } else if (Linear.MEDIA_FILES.equals(name)) {
                    aVar.mo67802b((Collection<C15566b>) this.f31947e.mo66931a(xmlPullParser));
                } else if ("VideoClicks".equals(name)) {
                    yl1 b = this.f31944b.mo66931a(xmlPullParser);
                    aVar.mo67797a(b.mo71099a());
                    for (String qe1 : b.mo71100b()) {
                        aVar.mo67796a(new qe1("clickTracking", qe1, (VastTimeOffset) null));
                    }
                } else if (Linear.ICONS.equals(name)) {
                    aVar.mo67798a((Collection<C15561a>) this.f31948f.mo66931a(xmlPullParser));
                } else {
                    this.f31943a.mo67618d(xmlPullParser);
                }
            }
        }
    }
}
