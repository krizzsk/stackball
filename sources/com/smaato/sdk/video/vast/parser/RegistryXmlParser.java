package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.video.p259fi.CheckedFunction;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class RegistryXmlParser {
    private static final CheckedFunction<String, Boolean> booleanAttributeConvertion = $$Lambda$RegistryXmlParser$zohLPw0ZkxUd2pR7SJOIU8Uz0Tk.INSTANCE;
    private final Map<String, XmlClassParser> parsers;
    private final XmlPullParser xmlPullParser;

    static /* synthetic */ String lambda$parseStringAttribute$1(String str) throws Exception {
        return str;
    }

    static /* synthetic */ Boolean lambda$static$0(String str) throws Exception {
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        throw new ParsingCoverterException("Cannot convert: \"" + str + "\" to boolean");
    }

    public RegistryXmlParser(XmlPullParser xmlPullParser2, Map<String, XmlClassParser> map) {
        this.xmlPullParser = (XmlPullParser) Objects.requireNonNull(xmlPullParser2);
        this.parsers = (Map) Objects.requireNonNull(map);
    }

    public <T> void registerParser(String str, XmlClassParser<T> xmlClassParser) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(xmlClassParser);
        this.parsers.put(str, xmlClassParser);
    }

    public RegistryXmlParser prepare(InputStream inputStream, String str) throws XmlPullParserException, IOException {
        Objects.requireNonNull(inputStream);
        if (TextUtils.isEmpty(str) || !XmlEncodingUtils.isSupported(str)) {
            str = null;
        }
        this.xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        this.xmlPullParser.setInput(inputStream, str);
        this.xmlPullParser.nextTag();
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r6.accept(com.smaato.sdk.video.vast.parser.ParseResult.error(r5, new java.lang.Exception("Exception while parsing ".concat(java.lang.String.valueOf(r5)), r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        skipToEndTag();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x000d, B:5:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Result> com.smaato.sdk.video.vast.parser.RegistryXmlParser parseClass(java.lang.String r5, com.smaato.sdk.video.p259fi.NonNullConsumer<com.smaato.sdk.video.vast.parser.ParseResult<Result>> r6) {
        /*
            r4 = this;
            com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            java.util.Map<java.lang.String, com.smaato.sdk.video.vast.parser.XmlClassParser> r0 = r4.parsers
            java.lang.Object r0 = r0.get(r5)
            com.smaato.sdk.video.vast.parser.XmlClassParser r0 = (com.smaato.sdk.video.vast.parser.XmlClassParser) r0
            if (r0 != 0) goto L_0x0030
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x003d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = "XmlClassParser for "
            r1.<init>(r2)     // Catch:{ Exception -> 0x003d }
            r1.append(r5)     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = " is not found"
            r1.append(r2)     // Catch:{ Exception -> 0x003d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x003d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x003d }
            com.smaato.sdk.video.vast.parser.ParseResult r0 = com.smaato.sdk.video.vast.parser.ParseResult.error(r5, r0)     // Catch:{ Exception -> 0x003d }
            r6.accept(r0)     // Catch:{ Exception -> 0x003d }
            r4.skip()     // Catch:{ Exception -> 0x003d }
            goto L_0x0054
        L_0x0030:
            com.smaato.sdk.video.vast.parser.ParseResult r0 = r0.parse(r4)     // Catch:{ Exception -> 0x003d }
            r6.accept(r0)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0054
        L_0x0038:
            r0 = move-exception
            r4.skipToEndTag()     // Catch:{ Exception -> 0x003d }
            throw r0     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r0 = move-exception
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "Exception while parsing "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2, r0)
            com.smaato.sdk.video.vast.parser.ParseResult r5 = com.smaato.sdk.video.vast.parser.ParseResult.error(r5, r1)
            r6.accept(r5)
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.parser.RegistryXmlParser.parseClass(java.lang.String, com.smaato.sdk.video.fi.NonNullConsumer):com.smaato.sdk.video.vast.parser.RegistryXmlParser");
    }

    public RegistryXmlParser parseString(Consumer<String> consumer, Consumer<Exception> consumer2) {
        try {
            String str = null;
            if (this.xmlPullParser.next() == 4) {
                String text = this.xmlPullParser.getText();
                if (text != null) {
                    str = text.trim();
                }
                this.xmlPullParser.nextTag();
            }
            consumer.accept(str);
        } catch (IOException | XmlPullParserException e) {
            consumer2.accept(e);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[Catch:{ IOException | XmlPullParserException -> 0x004d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.smaato.sdk.video.vast.parser.RegistryXmlParser parseTags(java.lang.String[] r5, com.smaato.sdk.core.util.p251fi.Consumer<java.lang.String> r6, com.smaato.sdk.core.util.p251fi.Consumer<java.lang.Exception> r7) {
        /*
            r4 = this;
        L_0x0000:
            org.xmlpull.v1.XmlPullParser r0 = r4.xmlPullParser     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            int r0 = r0.next()     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            r1 = 3
            if (r0 == r1) goto L_0x0053
            org.xmlpull.v1.XmlPullParser r0 = r4.xmlPullParser     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            int r0 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            r1 = 1
            if (r0 == r1) goto L_0x0045
            org.xmlpull.v1.XmlPullParser r0 = r4.xmlPullParser     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            int r0 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            r2 = 2
            if (r0 != r2) goto L_0x0000
            org.xmlpull.v1.XmlPullParser r0 = r4.xmlPullParser     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            java.lang.String r0 = r0.getName()     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            boolean r2 = com.smaato.sdk.core.util.TextUtils.isEmpty(r0)     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            if (r2 != 0) goto L_0x003a
            java.util.List r2 = java.util.Arrays.asList(r5)     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            r0.getClass()     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            com.smaato.sdk.video.vast.parser.-$$Lambda$neXtvhJJkFLEkXaGDlqo5yz-EY8 r3 = new com.smaato.sdk.video.vast.parser.-$$Lambda$neXtvhJJkFLEkXaGDlqo5yz-EY8     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            r3.<init>(r0)     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            boolean r2 = com.smaato.sdk.core.util.collections.Lists.any(r2, r3)     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            if (r2 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 == 0) goto L_0x0041
            r6.accept(r0)     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            goto L_0x0000
        L_0x0041:
            r4.skip()     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            goto L_0x0000
        L_0x0045:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            java.lang.String r6 = "XML END tag is missing"
            r5.<init>(r6)     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
            throw r5     // Catch:{ XmlPullParserException -> 0x004f, IOException -> 0x004d }
        L_0x004d:
            r5 = move-exception
            goto L_0x0050
        L_0x004f:
            r5 = move-exception
        L_0x0050:
            r7.accept(r5)
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.parser.RegistryXmlParser.parseTags(java.lang.String[], com.smaato.sdk.core.util.fi.Consumer, com.smaato.sdk.core.util.fi.Consumer):com.smaato.sdk.video.vast.parser.RegistryXmlParser");
    }

    public RegistryXmlParser parseStringAttribute(String str, Consumer<String> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, $$Lambda$RegistryXmlParser$4HYpxCXvQiUD_ePXqNNisF_8_8.INSTANCE, consumer, consumer2);
    }

    public RegistryXmlParser parseIntegerAttribute(String str, Consumer<Integer> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, $$Lambda$w51Zp_69959r4X7gW8sqVJrQeyw.INSTANCE, consumer, consumer2);
    }

    public RegistryXmlParser parseFloatAttribute(String str, Consumer<Float> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, $$Lambda$VA7eYkcpUA3vg8kEUKJ1BhdK_b0.INSTANCE, consumer, consumer2);
    }

    public RegistryXmlParser parseBooleanAttribute(String str, Consumer<Boolean> consumer, Consumer<ParseError> consumer2) {
        return parseTypedAttribute(str, booleanAttributeConvertion, consumer, consumer2);
    }

    public <Result> RegistryXmlParser parseTypedAttribute(String str, CheckedFunction<String, Result> checkedFunction, Consumer<Result> consumer, Consumer<ParseError> consumer2) {
        int attributeCount = this.xmlPullParser.getAttributeCount();
        String str2 = null;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = this.xmlPullParser.getAttributeName(i);
            if (str.equalsIgnoreCase(attributeName)) {
                str2 = this.xmlPullParser.getAttributeValue((String) null, attributeName);
            }
        }
        if (str2 != null) {
            try {
                consumer.accept(checkedFunction.apply(str2));
            } catch (Exception e) {
                Objects.onNotNull(consumer2, new Consumer(str, e) {
                    public final /* synthetic */ String f$0;
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void accept(Object obj) {
                        ((Consumer) obj).accept(ParseError.buildFrom(this.f$0, this.f$1));
                    }
                });
            }
        } else {
            Objects.onNotNull(consumer2, new Consumer(str, "No attribute found for name: ".concat(String.valueOf(str))) {
                public final /* synthetic */ String f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((Consumer) obj).accept(ParseError.buildFrom(this.f$0, new VastElementMissingException(this.f$1)));
                }
            });
        }
        return this;
    }

    public void skip() throws XmlPullParserException, IOException {
        if (this.xmlPullParser.getEventType() == 2) {
            skipToEndTag();
            return;
        }
        throw new IllegalStateException();
    }

    public void skipToEndTag() throws XmlPullParserException, IOException {
        int i = 1;
        while (i != 0) {
            int next = this.xmlPullParser.next();
            if (next != 1) {
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            } else if (i > 0) {
                throw new XmlPullParserException("XML END tag is missing");
            }
        }
    }
}
