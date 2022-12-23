package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.utils.u */
public class C1561u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1505q f3805a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Stack<C1563a> f3806b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public StringBuilder f3807c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f3808d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1563a f3809e;

    /* renamed from: com.applovin.impl.sdk.utils.u$a */
    private static class C1563a extends C1560t {
        C1563a(String str, Map<String, String> map, C1560t tVar) {
            super(str, map, tVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo13376a(C1560t tVar) {
            if (tVar != null) {
                this.f3801c.add(tVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo13377d(String str) {
            this.f3800b = str;
        }
    }

    C1561u(C1469j jVar) {
        if (jVar != null) {
            this.f3805a = jVar.mo13139v();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    public static C1560t m3647a(String str, C1469j jVar) throws SAXException {
        return new C1561u(jVar).mo13364a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m3650a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            hashMap.put(attributes.getQName(i), attributes.getValue(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public C1560t mo13364a(String str) throws SAXException {
        if (str != null) {
            this.f3807c = new StringBuilder();
            this.f3806b = new Stack<>();
            this.f3809e = null;
            Xml.parse(str, new ContentHandler() {
                public void characters(char[] cArr, int i, int i2) {
                    String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                    if (C1553o.m3554b(trim)) {
                        C1561u.this.f3807c.append(trim);
                    }
                }

                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C1561u.this.f3808d;
                    C1505q a = C1561u.this.f3805a;
                    a.mo13277b("XmlParser", "Finished parsing in " + seconds + " seconds");
                }

                public void endElement(String str, String str2, String str3) {
                    C1561u uVar = C1561u.this;
                    C1563a unused = uVar.f3809e = (C1563a) uVar.f3806b.pop();
                    C1561u.this.f3809e.mo13377d(C1561u.this.f3807c.toString().trim());
                    C1561u.this.f3807c.setLength(0);
                }

                public void endPrefixMapping(String str) {
                }

                public void ignorableWhitespace(char[] cArr, int i, int i2) {
                }

                public void processingInstruction(String str, String str2) {
                }

                public void setDocumentLocator(Locator locator) {
                }

                public void skippedEntity(String str) {
                }

                public void startDocument() {
                    C1561u.this.f3805a.mo13277b("XmlParser", "Begin parsing...");
                    long unused = C1561u.this.f3808d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
                    C1563a aVar = null;
                    try {
                        if (!C1561u.this.f3806b.isEmpty()) {
                            aVar = (C1563a) C1561u.this.f3806b.peek();
                        }
                        C1563a aVar2 = new C1563a(str2, C1561u.this.m3650a(attributes), aVar);
                        if (aVar != null) {
                            aVar.mo13376a(aVar2);
                        }
                        C1561u.this.f3806b.push(aVar2);
                    } catch (Exception e) {
                        C1505q a = C1561u.this.f3805a;
                        a.mo13278b("XmlParser", "Unable to process element <" + str2 + ">", e);
                        throw new SAXException("Failed to start element", e);
                    }
                }

                public void startPrefixMapping(String str, String str2) {
                }
            });
            C1563a aVar = this.f3809e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
