package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Verification;
import com.yandex.mobile.ads.impl.lj1;
import java.io.IOException;
import java.util.Collection;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class vj1 {

    /* renamed from: a */
    private final hr1 f41304a = new hr1();

    /* renamed from: b */
    private final fr1<C13413ii> f41305b = new fr1<>(new C14186oi(), "Creatives", Creative.NAME);

    /* renamed from: c */
    private final fr1<vi1> f41306c = new fr1<>(new zi1(), "AdVerifications", Verification.NAME);

    /* renamed from: d */
    private final so1 f41307d = new so1();

    /* renamed from: e */
    private final zj1 f41308e = new zj1();

    vj1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70499a(XmlPullParser xmlPullParser, lj1.C13860a aVar) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if ("Impression".equals(name)) {
            aVar.mo68475a("impression", this.f41304a.mo67617c(xmlPullParser));
        } else if ("ViewableImpression".equals(name)) {
            aVar.mo68470a(this.f41307d.mo66931a(xmlPullParser));
        } else if ("Error".equals(name)) {
            aVar.mo68475a("error", this.f41304a.mo67617c(xmlPullParser));
        } else if ("Survey".equals(name)) {
            aVar.mo68482d(this.f41304a.mo67617c(xmlPullParser));
        } else if (InLine.DESCRIPTION.equals(name)) {
            aVar.mo68481c(this.f41304a.mo67617c(xmlPullParser));
        } else if (InLine.AD_TITLE.equals(name)) {
            aVar.mo68479b(this.f41304a.mo67617c(xmlPullParser));
        } else if ("AdSystem".equals(name)) {
            aVar.mo68474a(this.f41304a.mo67617c(xmlPullParser));
        } else if ("Creatives".equals(name)) {
            aVar.mo68480b((Collection<C13413ii>) this.f41305b.mo66931a(xmlPullParser));
        } else if ("AdVerifications".equals(name)) {
            aVar.mo68476a((Collection<vi1>) this.f41306c.mo66931a(xmlPullParser));
        } else if ("Extensions".equals(name)) {
            aVar.mo68471a(this.f41308e.mo71250a(xmlPullParser));
        } else {
            this.f41304a.mo67618d(xmlPullParser);
        }
    }
}
