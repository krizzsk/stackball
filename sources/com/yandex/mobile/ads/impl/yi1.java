package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.Verification;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class yi1 {

    /* renamed from: a */
    private final hr1 f42873a = new hr1();

    /* renamed from: a */
    public String mo71089a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.f42873a.getClass();
        xmlPullParser.require(2, (String) null, Verification.VERIFICATION_PARAMETERS);
        String c = this.f42873a.mo67617c(xmlPullParser);
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        return null;
    }
}
