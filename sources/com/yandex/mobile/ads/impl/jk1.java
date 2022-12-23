package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.lj1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class jk1 {

    /* renamed from: a */
    private final Context f35346a;

    /* renamed from: b */
    private final hr1 f35347b = new hr1();

    /* renamed from: c */
    private final zd0 f35348c = new zd0();

    /* renamed from: d */
    private final cr1 f35349d = new cr1();

    /* renamed from: e */
    private final a81 f35350e = new a81();

    jk1(Context context) {
        this.f35346a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public lj1 mo68021a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Integer a = this.f35350e.mo65694a(xmlPullParser);
        this.f35347b.getClass();
        lj1 lj1 = null;
        xmlPullParser.require(2, (String) null, "Ad");
        while (this.f35347b.mo67614a(xmlPullParser)) {
            if (this.f35347b.mo67616b(xmlPullParser)) {
                String name = xmlPullParser.getName();
                if ("InLine".equals(name)) {
                    lj1.C13860a aVar = new lj1.C13860a(this.f35346a, false);
                    aVar.mo68473a(a);
                    lj1 = this.f35348c.mo71212a(xmlPullParser, aVar);
                } else if ("Wrapper".equals(name)) {
                    lj1.C13860a aVar2 = new lj1.C13860a(this.f35346a, true);
                    aVar2.mo68473a(a);
                    lj1 = this.f35349d.mo66349a(xmlPullParser, aVar2);
                } else {
                    this.f35347b.mo67618d(xmlPullParser);
                }
            }
        }
        return lj1;
    }
}
