package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.facebook.appevents.UserDataStore;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class vf1 extends s81 {

    /* renamed from: o */
    private static final Pattern f41268o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p */
    private static final Pattern f41269p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q */
    private static final Pattern f41270q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r */
    private static final Pattern f41271r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    private static final Pattern f41272s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    private static final Pattern f41273t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    private static final C14887b f41274u = new C14887b(30.0f, 1, 1);

    /* renamed from: v */
    private static final C14886a f41275v = new C14886a(32, 15);

    /* renamed from: n */
    private final XmlPullParserFactory f41276n;

    /* renamed from: com.yandex.mobile.ads.impl.vf1$a */
    private static final class C14886a {

        /* renamed from: a */
        final int f41277a;

        C14886a(int i, int i2) {
            this.f41277a = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vf1$b */
    private static final class C14887b {

        /* renamed from: a */
        final float f41278a;

        /* renamed from: b */
        final int f41279b;

        /* renamed from: c */
        final int f41280c;

        C14887b(float f, int i, int i2) {
            this.f41278a = f;
            this.f41279b = i;
            this.f41280c = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vf1$c */
    private static final class C14888c {

        /* renamed from: a */
        final int f41281a;

        /* renamed from: b */
        final int f41282b;

        C14888c(int i, int i2) {
            this.f41281a = i;
            this.f41282b = i2;
        }
    }

    public vf1() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f41276n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: b */
    private C14888c m43119b(XmlPullParser xmlPullParser) {
        String a = jr1.m37962a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f41272s.matcher(a);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", "Ignoring non-pixel tts extent: " + a);
            return null;
        }
        try {
            return new C14888c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", "Ignoring malformed tts extent: " + a);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public yb1 mo65718a(byte[] bArr, int i, boolean z) throws ac1 {
        zf1 zf1;
        C14887b bVar;
        try {
            XmlPullParser newPullParser = this.f41276n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new xf1((String) null, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f));
            C14888c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C14887b bVar2 = f41274u;
            C14886a aVar = f41275v;
            zf1 zf12 = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                wf1 wf1 = (wf1) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m43112a(newPullParser);
                            aVar = m43111a(newPullParser, f41275v);
                            cVar = m43119b(newPullParser);
                        }
                        C14888c cVar2 = cVar;
                        C14887b bVar3 = bVar2;
                        C14886a aVar2 = aVar;
                        if (!m43118a(name)) {
                            Log.i("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            zf1 = zf12;
                            bVar = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                zf1 = zf12;
                                bVar = bVar3;
                                m43116a(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                zf1 = zf12;
                                bVar = bVar3;
                                try {
                                    wf1 a = m43113a(newPullParser, wf1, hashMap2, bVar);
                                    arrayDeque.push(a);
                                    if (wf1 != null) {
                                        wf1.mo70699a(a);
                                    }
                                } catch (ac1 e) {
                                    bk0.m34271b("TtmlDecoder", "Suppressing parser error", e);
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                        bVar2 = bVar;
                        cVar = cVar2;
                        aVar = aVar2;
                    } else {
                        zf1 = zf12;
                        if (eventType == 4) {
                            wf1.mo70699a(wf1.m43628a(newPullParser.getText()));
                        } else if (eventType == 3) {
                            zf12 = newPullParser.getName().equals("tt") ? new zf1((wf1) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : zf1;
                            arrayDeque.pop();
                            newPullParser.next();
                        }
                    }
                    zf12 = zf1;
                    newPullParser.next();
                } else {
                    zf1 = zf12;
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i2--;
                        }
                        zf12 = zf1;
                        newPullParser.next();
                    }
                }
                i2++;
                zf12 = zf1;
                newPullParser.next();
            }
            return zf12;
        } catch (XmlPullParserException e2) {
            throw new ac1("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }

    /* renamed from: b */
    private String[] m43120b(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = ih1.f34858a;
        return trim.split("\\s+", -1);
    }

    /* renamed from: a */
    private C14887b m43112a(XmlPullParser xmlPullParser) throws ac1 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = ih1.f34858a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new ac1("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C14887b bVar = f41274u;
        int i2 = bVar.f41279b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.f41280c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C14887b(((float) parseInt) * f, i2, i3);
    }

    /* renamed from: a */
    private C14886a m43111a(XmlPullParser xmlPullParser, C14886a aVar) throws ac1 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f41273t.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C14886a(parseInt, parseInt2);
            }
            throw new ac1("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0219  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.yandex.mobile.ads.impl.yf1> m43116a(org.xmlpull.v1.XmlPullParser r20, java.util.Map<java.lang.String, com.yandex.mobile.ads.impl.yf1> r21, com.yandex.mobile.ads.impl.vf1.C14886a r22, com.yandex.mobile.ads.impl.vf1.C14888c r23, java.util.Map<java.lang.String, com.yandex.mobile.ads.impl.xf1> r24, java.util.Map<java.lang.String, java.lang.String> r25) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
        L_0x0008:
            r20.next()
            java.lang.String r4 = "style"
            boolean r5 = com.yandex.mobile.ads.impl.jr1.m37964c(r1, r4)
            if (r5 == 0) goto L_0x004b
            java.lang.String r4 = com.yandex.mobile.ads.impl.jr1.m37962a(r1, r4)
            com.yandex.mobile.ads.impl.yf1 r5 = new com.yandex.mobile.ads.impl.yf1
            r5.<init>()
            com.yandex.mobile.ads.impl.yf1 r5 = r0.m43115a((org.xmlpull.v1.XmlPullParser) r1, (com.yandex.mobile.ads.impl.yf1) r5)
            if (r4 == 0) goto L_0x0038
            java.lang.String[] r4 = r0.m43120b((java.lang.String) r4)
            int r7 = r4.length
            r6 = 0
        L_0x0028:
            if (r6 >= r7) goto L_0x0038
            r8 = r4[r6]
            java.lang.Object r8 = r2.get(r8)
            com.yandex.mobile.ads.impl.yf1 r8 = (com.yandex.mobile.ads.impl.yf1) r8
            r5.mo71057a((com.yandex.mobile.ads.impl.yf1) r8)
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0038:
            java.lang.String r4 = r5.mo71070f()
            if (r4 == 0) goto L_0x0045
            java.lang.String r4 = r5.mo71070f()
            r2.put(r4, r5)
        L_0x0045:
            r4 = r22
        L_0x0047:
            r7 = r24
            goto L_0x0251
        L_0x004b:
            java.lang.String r4 = "region"
            boolean r4 = com.yandex.mobile.ads.impl.jr1.m37964c(r1, r4)
            java.lang.String r5 = "id"
            if (r4 == 0) goto L_0x0221
            java.lang.String r8 = com.yandex.mobile.ads.impl.jr1.m37962a(r1, r5)
            if (r8 != 0) goto L_0x0060
        L_0x005b:
            r4 = r22
        L_0x005d:
            r5 = 0
            goto L_0x0217
        L_0x0060:
            java.lang.String r5 = "origin"
            java.lang.String r5 = com.yandex.mobile.ads.impl.jr1.m37962a(r1, r5)
            java.lang.String r7 = "TtmlDecoder"
            if (r5 == 0) goto L_0x020e
            java.util.regex.Pattern r9 = f41271r
            java.util.regex.Matcher r10 = r9.matcher(r5)
            java.util.regex.Pattern r11 = f41272s
            java.util.regex.Matcher r12 = r11.matcher(r5)
            boolean r13 = r10.matches()
            java.lang.String r14 = "Ignoring region with malformed origin: "
            java.lang.String r15 = "Ignoring region with missing tts:extent: "
            r16 = 1120403456(0x42c80000, float:100.0)
            r4 = 2
            r6 = 1
            if (r13 == 0) goto L_0x00b1
            java.lang.String r12 = r10.group(r6)     // Catch:{ NumberFormatException -> 0x009e }
            float r12 = java.lang.Float.parseFloat(r12)     // Catch:{ NumberFormatException -> 0x009e }
            float r12 = r12 / r16
            java.lang.String r10 = r10.group(r4)     // Catch:{ NumberFormatException -> 0x009e }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x009e }
            float r10 = r10 / r16
            r18 = r12
            r12 = r10
            r10 = r18
            goto L_0x00e6
        L_0x009e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r7, r4)
            goto L_0x005b
        L_0x00b1:
            boolean r10 = r12.matches()
            if (r10 == 0) goto L_0x01f6
            if (r3 != 0) goto L_0x00cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r7, r4)
            goto L_0x005b
        L_0x00cc:
            java.lang.String r10 = r12.group(r6)     // Catch:{ NumberFormatException -> 0x01e0 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01e0 }
            java.lang.String r12 = r12.group(r4)     // Catch:{ NumberFormatException -> 0x01e0 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01e0 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01e0 }
            int r13 = r3.f41281a     // Catch:{ NumberFormatException -> 0x01e0 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01e0 }
            float r10 = r10 / r13
            float r12 = (float) r12     // Catch:{ NumberFormatException -> 0x01e0 }
            int r13 = r3.f41282b     // Catch:{ NumberFormatException -> 0x01e0 }
            float r13 = (float) r13
            float r12 = r12 / r13
        L_0x00e6:
            java.lang.String r13 = "extent"
            java.lang.String r13 = com.yandex.mobile.ads.impl.jr1.m37962a(r1, r13)
            if (r13 == 0) goto L_0x01d7
            java.util.regex.Matcher r9 = r9.matcher(r13)
            java.util.regex.Matcher r11 = r11.matcher(r13)
            boolean r13 = r9.matches()
            java.lang.String r14 = "Ignoring region with malformed extent: "
            if (r13 == 0) goto L_0x0129
            java.lang.String r11 = r9.group(r6)     // Catch:{ NumberFormatException -> 0x0115 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x0115 }
            float r11 = r11 / r16
            java.lang.String r9 = r9.group(r4)     // Catch:{ NumberFormatException -> 0x0115 }
            float r5 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0115 }
            float r5 = r5 / r16
            r14 = r5
            r13 = r11
            goto L_0x0161
        L_0x0115:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r7, r4)
            goto L_0x005b
        L_0x0129:
            boolean r9 = r11.matches()
            if (r9 == 0) goto L_0x01bf
            if (r3 != 0) goto L_0x0145
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r7, r4)
            goto L_0x005b
        L_0x0145:
            java.lang.String r9 = r11.group(r6)     // Catch:{ NumberFormatException -> 0x01a9 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01a9 }
            java.lang.String r11 = r11.group(r4)     // Catch:{ NumberFormatException -> 0x01a9 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01a9 }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01a9 }
            int r13 = r3.f41281a     // Catch:{ NumberFormatException -> 0x01a9 }
            float r13 = (float) r13     // Catch:{ NumberFormatException -> 0x01a9 }
            float r9 = r9 / r13
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x01a9 }
            int r5 = r3.f41282b     // Catch:{ NumberFormatException -> 0x01a9 }
            float r5 = (float) r5
            float r11 = r11 / r5
            r13 = r9
            r14 = r11
        L_0x0161:
            java.lang.String r5 = "displayAlign"
            java.lang.String r5 = com.yandex.mobile.ads.impl.jr1.m37962a(r1, r5)
            if (r5 == 0) goto L_0x0191
            java.lang.String r5 = com.yandex.mobile.ads.impl.ih1.m37399e((java.lang.String) r5)
            r5.getClass()
            java.lang.String r7 = "center"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L_0x0187
            java.lang.String r6 = "after"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0181
            goto L_0x0191
        L_0x0181:
            float r12 = r12 + r14
            r4 = r22
            r17 = 2
            goto L_0x0195
        L_0x0187:
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r14 / r4
            float r12 = r12 + r4
            r4 = r22
            r17 = 1
            goto L_0x0195
        L_0x0191:
            r4 = r22
            r17 = 0
        L_0x0195:
            int r5 = r4.f41277a
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r16 = r6 / r5
            com.yandex.mobile.ads.impl.xf1 r5 = new com.yandex.mobile.ads.impl.xf1
            r11 = 0
            r15 = 1
            r7 = r5
            r9 = r10
            r10 = r12
            r12 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0217
        L_0x01a9:
            r4 = r22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r7, r5)
            goto L_0x005d
        L_0x01bf:
            r4 = r22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Ignoring region with unsupported extent: "
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r7, r5)
            goto L_0x005d
        L_0x01d7:
            r4 = r22
            java.lang.String r5 = "Ignoring region without an extent"
            android.util.Log.w(r7, r5)
            goto L_0x005d
        L_0x01e0:
            r4 = r22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r7, r5)
            goto L_0x005d
        L_0x01f6:
            r4 = r22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Ignoring region with unsupported origin: "
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r7, r5)
            goto L_0x005d
        L_0x020e:
            r4 = r22
            java.lang.String r5 = "Ignoring region without an origin"
            android.util.Log.w(r7, r5)
            goto L_0x005d
        L_0x0217:
            if (r5 == 0) goto L_0x0047
            java.lang.String r6 = r5.f42551a
            r7 = r24
            r7.put(r6, r5)
            goto L_0x0251
        L_0x0221:
            r4 = r22
            r7 = r24
            java.lang.String r6 = "metadata"
            boolean r8 = com.yandex.mobile.ads.impl.jr1.m37964c(r1, r6)
            if (r8 == 0) goto L_0x0251
        L_0x022d:
            r20.next()
            java.lang.String r8 = "image"
            boolean r8 = com.yandex.mobile.ads.impl.jr1.m37964c(r1, r8)
            if (r8 == 0) goto L_0x0248
            java.lang.String r8 = com.yandex.mobile.ads.impl.jr1.m37962a(r1, r5)
            if (r8 == 0) goto L_0x0248
            java.lang.String r9 = r20.nextText()
            r10 = r25
            r10.put(r8, r9)
            goto L_0x024a
        L_0x0248:
            r10 = r25
        L_0x024a:
            boolean r8 = com.yandex.mobile.ads.impl.jr1.m37963b(r1, r6)
            if (r8 == 0) goto L_0x022d
            goto L_0x0253
        L_0x0251:
            r10 = r25
        L_0x0253:
            java.lang.String r5 = "head"
            boolean r5 = com.yandex.mobile.ads.impl.jr1.m37963b(r1, r5)
            if (r5 == 0) goto L_0x0008
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vf1.m43116a(org.xmlpull.v1.XmlPullParser, java.util.Map, com.yandex.mobile.ads.impl.vf1$a, com.yandex.mobile.ads.impl.vf1$c, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.mobile.ads.impl.yf1 m43115a(org.xmlpull.v1.XmlPullParser r12, com.yandex.mobile.ads.impl.yf1 r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0228
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = 4
            r7 = -1
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x007c;
                case -1224696685: goto L_0x0071;
                case -1065511464: goto L_0x0066;
                case -879295043: goto L_0x005b;
                case -734428249: goto L_0x0050;
                case 3355: goto L_0x0045;
                case 94842723: goto L_0x003a;
                case 365601008: goto L_0x002f;
                case 1287124693: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0087
        L_0x0021:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002b
            goto L_0x0087
        L_0x002b:
            r4 = 8
            goto L_0x0088
        L_0x002f:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0038
            goto L_0x0087
        L_0x0038:
            r4 = 7
            goto L_0x0088
        L_0x003a:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0043
            goto L_0x0087
        L_0x0043:
            r4 = 6
            goto L_0x0088
        L_0x0045:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x004e
            goto L_0x0087
        L_0x004e:
            r4 = 5
            goto L_0x0088
        L_0x0050:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0059
            goto L_0x0087
        L_0x0059:
            r4 = 4
            goto L_0x0088
        L_0x005b:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0064
            goto L_0x0087
        L_0x0064:
            r4 = 3
            goto L_0x0088
        L_0x0066:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006f
            goto L_0x0087
        L_0x006f:
            r4 = 2
            goto L_0x0088
        L_0x0071:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            r4 = 1
            goto L_0x0088
        L_0x007c:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r4 = 0
            goto L_0x0088
        L_0x0087:
            r4 = -1
        L_0x0088:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x0216;
                case 1: goto L_0x020d;
                case 2: goto L_0x0186;
                case 3: goto L_0x011a;
                case 4: goto L_0x010a;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00b2;
                case 8: goto L_0x008f;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0224
        L_0x008f:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            int r4 = com.yandex.mobile.ads.impl.C13320hg.m36965b(r3)     // Catch:{ IllegalArgumentException -> 0x009c }
            r13.mo71055a((int) r4)     // Catch:{ IllegalArgumentException -> 0x009c }
            goto L_0x0224
        L_0x009c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r5, r3)
            goto L_0x0224
        L_0x00b2:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)     // Catch:{ ac1 -> 0x00bb }
            m43117a((java.lang.String) r3, (com.yandex.mobile.ads.impl.yf1) r13)     // Catch:{ ac1 -> 0x00bb }
            goto L_0x0224
        L_0x00bb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r5, r3)
            goto L_0x0224
        L_0x00d1:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            int r4 = com.yandex.mobile.ads.impl.C13320hg.m36965b(r3)     // Catch:{ IllegalArgumentException -> 0x00de }
            r13.mo71061b((int) r4)     // Catch:{ IllegalArgumentException -> 0x00de }
            goto L_0x0224
        L_0x00de:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r5, r3)
            goto L_0x0224
        L_0x00f4:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0224
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71062b((java.lang.String) r3)
            goto L_0x0224
        L_0x010a:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71059a((boolean) r3)
            goto L_0x0224
        L_0x011a:
            java.lang.String r3 = com.yandex.mobile.ads.impl.ih1.m37399e((java.lang.String) r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x014a;
                case -1026963764: goto L_0x013f;
                case 913457136: goto L_0x0134;
                case 1679736913: goto L_0x0129;
                default: goto L_0x0128;
            }
        L_0x0128:
            goto L_0x0154
        L_0x0129:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0132
            goto L_0x0154
        L_0x0132:
            r7 = 3
            goto L_0x0154
        L_0x0134:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x013d
            goto L_0x0154
        L_0x013d:
            r7 = 2
            goto L_0x0154
        L_0x013f:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0148
            goto L_0x0154
        L_0x0148:
            r7 = 1
            goto L_0x0154
        L_0x014a:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r7 = 0
        L_0x0154:
            if (r7 == 0) goto L_0x017c
            if (r7 == r10) goto L_0x0172
            if (r7 == r9) goto L_0x0168
            if (r7 == r8) goto L_0x015e
            goto L_0x0224
        L_0x015e:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71065c((boolean) r10)
            goto L_0x0224
        L_0x0168:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71065c((boolean) r1)
            goto L_0x0224
        L_0x0172:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71068d(r10)
            goto L_0x0224
        L_0x017c:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71068d(r1)
            goto L_0x0224
        L_0x0186:
            java.lang.String r3 = com.yandex.mobile.ads.impl.ih1.m37399e((java.lang.String) r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x01c1;
                case 100571: goto L_0x01b6;
                case 3317767: goto L_0x01ab;
                case 108511772: goto L_0x01a0;
                case 109757538: goto L_0x0195;
                default: goto L_0x0194;
            }
        L_0x0194:
            goto L_0x01cb
        L_0x0195:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x019e
            goto L_0x01cb
        L_0x019e:
            r7 = 4
            goto L_0x01cb
        L_0x01a0:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01a9
            goto L_0x01cb
        L_0x01a9:
            r7 = 3
            goto L_0x01cb
        L_0x01ab:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01b4
            goto L_0x01cb
        L_0x01b4:
            r7 = 2
            goto L_0x01cb
        L_0x01b6:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01bf
            goto L_0x01cb
        L_0x01bf:
            r7 = 1
            goto L_0x01cb
        L_0x01c1:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r7 = 0
        L_0x01cb:
            if (r7 == 0) goto L_0x0202
            if (r7 == r10) goto L_0x01f7
            if (r7 == r9) goto L_0x01ec
            if (r7 == r8) goto L_0x01e1
            if (r7 == r6) goto L_0x01d6
            goto L_0x0224
        L_0x01d6:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71056a((android.text.Layout.Alignment) r3)
            goto L_0x0224
        L_0x01e1:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71056a((android.text.Layout.Alignment) r3)
            goto L_0x0224
        L_0x01ec:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71056a((android.text.Layout.Alignment) r3)
            goto L_0x0224
        L_0x01f7:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71056a((android.text.Layout.Alignment) r3)
            goto L_0x0224
        L_0x0202:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71056a((android.text.Layout.Alignment) r3)
            goto L_0x0224
        L_0x020d:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71058a((java.lang.String) r3)
            goto L_0x0224
        L_0x0216:
            com.yandex.mobile.ads.impl.yf1 r13 = r11.m43114a((com.yandex.mobile.ads.impl.yf1) r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.yandex.mobile.ads.impl.yf1 r13 = r13.mo71063b((boolean) r3)
        L_0x0224:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0228:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vf1.m43115a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.yf1):com.yandex.mobile.ads.impl.yf1");
    }

    /* renamed from: a */
    private yf1 m43114a(yf1 yf1) {
        return yf1 == null ? new yf1() : yf1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.mobile.ads.impl.wf1 m43113a(org.xmlpull.v1.XmlPullParser r21, com.yandex.mobile.ads.impl.wf1 r22, java.util.Map<java.lang.String, com.yandex.mobile.ads.impl.xf1> r23, com.yandex.mobile.ads.impl.vf1.C14887b r24) throws com.yandex.mobile.ads.impl.ac1 {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r21.getAttributeCount()
            r5 = 0
            com.yandex.mobile.ads.impl.yf1 r11 = r0.m43115a((org.xmlpull.v1.XmlPullParser) r1, (com.yandex.mobile.ads.impl.yf1) r5)
            java.lang.String r9 = ""
            r12 = r5
            r14 = r12
            r13 = r9
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0026:
            if (r5 >= r4) goto L_0x00c6
            java.lang.String r6 = r1.getAttributeName(r5)
            java.lang.String r7 = r1.getAttributeValue(r5)
            r6.getClass()
            int r19 = r6.hashCode()
            switch(r19) {
                case -934795532: goto L_0x0072;
                case 99841: goto L_0x0067;
                case 100571: goto L_0x005c;
                case 93616297: goto L_0x0051;
                case 109780401: goto L_0x0046;
                case 1292595405: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x007d
        L_0x003b:
            java.lang.String r8 = "backgroundImage"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0044
            goto L_0x007d
        L_0x0044:
            r8 = 5
            goto L_0x007e
        L_0x0046:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x004f
            goto L_0x007d
        L_0x004f:
            r8 = 4
            goto L_0x007e
        L_0x0051:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            r8 = 3
            goto L_0x007e
        L_0x005c:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0065
            goto L_0x007d
        L_0x0065:
            r8 = 2
            goto L_0x007e
        L_0x0067:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            r8 = 1
            goto L_0x007e
        L_0x0072:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r8 = 0
            goto L_0x007e
        L_0x007d:
            r8 = -1
        L_0x007e:
            if (r8 == 0) goto L_0x00b9
            r6 = 1
            if (r8 == r6) goto L_0x00b2
            r6 = 2
            if (r8 == r6) goto L_0x00ad
            r6 = 3
            if (r8 == r6) goto L_0x00a8
            r6 = 4
            if (r8 == r6) goto L_0x009f
            r6 = 5
            if (r8 == r6) goto L_0x0090
            goto L_0x00b6
        L_0x0090:
            java.lang.String r6 = "#"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x00b6
            r6 = 1
            java.lang.String r6 = r7.substring(r6)
            r14 = r6
            goto L_0x00b6
        L_0x009f:
            java.lang.String[] r6 = r0.m43120b((java.lang.String) r7)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x00b6
            r12 = r6
            goto L_0x00b6
        L_0x00a8:
            long r9 = m43110a((java.lang.String) r7, (com.yandex.mobile.ads.impl.vf1.C14887b) r3)
            goto L_0x00b6
        L_0x00ad:
            long r15 = m43110a((java.lang.String) r7, (com.yandex.mobile.ads.impl.vf1.C14887b) r3)
            goto L_0x00b6
        L_0x00b2:
            long r17 = m43110a((java.lang.String) r7, (com.yandex.mobile.ads.impl.vf1.C14887b) r3)
        L_0x00b6:
            r6 = r23
            goto L_0x00c2
        L_0x00b9:
            r6 = r23
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00c2
            r13 = r7
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x00c6:
            if (r2 == 0) goto L_0x00de
            long r3 = r2.f42001d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e3
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00d8
            long r9 = r9 + r3
        L_0x00d8:
            int r7 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e3
            long r15 = r15 + r3
            goto L_0x00e3
        L_0x00de:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e3:
            r7 = r9
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00fb
            int r3 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00f1
            long r17 = r7 + r17
            r9 = r17
            goto L_0x00fc
        L_0x00f1:
            if (r2 == 0) goto L_0x00fb
            long r2 = r2.f42002e
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00fb
            r9 = r2
            goto L_0x00fc
        L_0x00fb:
            r9 = r15
        L_0x00fc:
            java.lang.String r6 = r21.getName()
            com.yandex.mobile.ads.impl.wf1 r1 = com.yandex.mobile.ads.impl.wf1.m43629a(r6, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vf1.m43113a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.wf1, java.util.Map, com.yandex.mobile.ads.impl.vf1$b):com.yandex.mobile.ads.impl.wf1");
    }

    /* renamed from: a */
    private static boolean m43118a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    /* renamed from: a */
    private static void m43117a(String str, yf1 yf1) throws ac1 {
        Matcher matcher;
        int i = ih1.f34858a;
        char c = 65535;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f41270q.matcher(str);
        } else if (split.length == 2) {
            matcher = f41270q.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new ac1("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && group.equals("px")) {
                        c = 2;
                    }
                } else if (group.equals(UserDataStore.EMAIL)) {
                    c = 1;
                }
            } else if (group.equals("%")) {
                c = 0;
            }
            if (c == 0) {
                yf1.mo71064c(3);
            } else if (c == 1) {
                yf1.mo71064c(2);
            } else if (c == 2) {
                yf1.mo71064c(1);
            } else {
                throw new ac1("Invalid unit for fontSize: '" + group + "'.");
            }
            yf1.mo71054a(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new ac1("Invalid expression for fontSize: '" + str + "'.");
    }

    /* renamed from: a */
    private static long m43110a(String str, C14887b bVar) throws ac1 {
        double d;
        double d2;
        Matcher matcher = f41268o.matcher(str);
        if (matcher.matches()) {
            double parseLong = ((double) (Long.parseLong(matcher.group(1)) * 3600)) + ((double) (Long.parseLong(matcher.group(2)) * 60)) + ((double) Long.parseLong(matcher.group(3)));
            String group = matcher.group(4);
            double d3 = 0.0d;
            double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d);
            String group2 = matcher.group(5);
            double parseLong2 = parseDouble + (group2 != null ? (double) (((float) Long.parseLong(group2)) / bVar.f41278a) : 0.0d);
            String group3 = matcher.group(6);
            if (group3 != null) {
                d3 = (((double) Long.parseLong(group3)) / ((double) bVar.f41279b)) / ((double) bVar.f41278a);
            }
            return (long) ((parseLong2 + d3) * 1000000.0d);
        }
        Matcher matcher2 = f41269p.matcher(str);
        if (matcher2.matches()) {
            double parseDouble2 = Double.parseDouble(matcher2.group(1));
            String group4 = matcher2.group(2);
            group4.getClass();
            char c = 65535;
            int hashCode = group4.hashCode();
            if (hashCode != 102) {
                if (hashCode != 104) {
                    if (hashCode != 109) {
                        if (hashCode != 116) {
                            if (hashCode == 3494 && group4.equals("ms")) {
                                c = 4;
                            }
                        } else if (group4.equals("t")) {
                            c = 3;
                        }
                    } else if (group4.equals(InneractiveMediationDefs.GENDER_MALE)) {
                        c = 2;
                    }
                } else if (group4.equals("h")) {
                    c = 1;
                }
            } else if (group4.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    d2 = 3600.0d;
                } else if (c == 2) {
                    d2 = 60.0d;
                } else if (c != 3) {
                    if (c == 4) {
                        d = 1000.0d;
                    }
                    return (long) (parseDouble2 * 1000000.0d);
                } else {
                    d = (double) bVar.f41280c;
                }
                parseDouble2 *= d2;
                return (long) (parseDouble2 * 1000000.0d);
            }
            d = (double) bVar.f41278a;
            parseDouble2 /= d;
            return (long) (parseDouble2 * 1000000.0d);
        }
        throw new ac1("Malformed time expression: " + str);
    }
}
