package com.fyber.inneractive.sdk.p051j;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.C3697x;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.fyber.inneractive.sdk.j.h */
public final class C3021h {

    /* renamed from: a */
    boolean f7432a = false;

    /* renamed from: b */
    public String f7433b;

    public C3021h(String str) throws Exception {
        try {
            m7042a(str);
            this.f7432a = true;
            IAlog.m9034b("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.m9037e("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    private void m7042a(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        IAlog.m9034b("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, (String) null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, (String) null, "tns:Ad");
                    IAlog.m9034b("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.m9036d("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.m9033a("Ad content: %s", trim);
                    if (trim == null) {
                        str3 = null;
                    } else {
                        str3 = C3697x.f10001c.mo19601a(trim);
                    }
                    this.f7433b = str3;
                } else {
                    m7043a(newPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m7043a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }
}
