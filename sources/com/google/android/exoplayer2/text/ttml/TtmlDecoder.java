package com.google.android.exoplayer2.text.ttml;

import com.facebook.appevents.UserDataStore;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* access modifiers changed from: protected */
    public Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion(""));
            TtsExtent ttsExtent = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRate2 = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            TtmlSubtitle ttmlSubtitle = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRate2 = parseFrameAndTickRates(newPullParser);
                            cellResolution = parseCellResolution(newPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(newPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate3 = frameAndTickRate2;
                        CellResolution cellResolution2 = cellResolution;
                        if (!isSupportedTag(name)) {
                            Log.m9245i(TAG, "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            frameAndTickRate2 = frameAndTickRate3;
                        } else {
                            if ("head".equals(name)) {
                                frameAndTickRate = frameAndTickRate3;
                                parseHeader(newPullParser, hashMap, cellResolution2, ttsExtent2, hashMap2, hashMap3);
                            } else {
                                frameAndTickRate = frameAndTickRate3;
                                try {
                                    TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                    arrayDeque.push(parseNode);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(parseNode);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.m9248w(TAG, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            frameAndTickRate2 = frameAndTickRate;
                        }
                        ttsExtent = ttsExtent2;
                        cellResolution = cellResolution2;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = Util.split(attributeValue2, " ");
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = DEFAULT_FRAME_AND_TICK_RATE.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = DEFAULT_FRAME_AND_TICK_RATE.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(((float) parseInt) * f, i, i2);
    }

    private static CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.m9247w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new CellResolution(parseInt, parseInt2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            Log.m9247w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
    }

    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.m9247w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.m9247w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, CellResolution cellResolution, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                String id = parseStyleAttributes.getId();
                if (id != null) {
                    map.put(id, parseStyleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion parseRegionAttributes = parseRegionAttributes(xmlPullParser, cellResolution, ttsExtent);
                if (parseRegionAttributes != null) {
                    map2.put(parseRegionAttributes.f10067id, parseRegionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "head"));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c8, code lost:
        if (r2 != 2) goto L_0x01cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser r17, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution r18, com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent r19) {
        /*
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x0232
            java.util.regex.Pattern r6 = PERCENTAGE_COORDINATES
            java.util.regex.Matcher r6 = r6.matcher(r3)
            java.util.regex.Pattern r7 = PIXEL_COORDINATES
            java.util.regex.Matcher r7 = r7.matcher(r3)
            boolean r8 = r6.matches()
            java.lang.String r9 = "Ignoring region with malformed origin: "
            java.lang.String r10 = "Ignoring region with missing tts:extent: "
            r11 = 1120403456(0x42c80000, float:100.0)
            r12 = 2
            r13 = 1
            if (r8 == 0) goto L_0x0069
            java.lang.String r7 = r6.group(r13)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = r7 / r11
            java.lang.String r6 = r6.group(r12)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0056 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x0056 }
            float r6 = r6 / r11
            r16 = r7
            r7 = r6
            r6 = r16
            goto L_0x00aa
        L_0x0056:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x0069:
            boolean r6 = r7.matches()
            if (r6 == 0) goto L_0x021d
            if (r1 != 0) goto L_0x0084
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x0084:
            java.lang.String r6 = r7.group(r13)     // Catch:{ NumberFormatException -> 0x020a }
            java.lang.Object r6 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r6)     // Catch:{ NumberFormatException -> 0x020a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x020a }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x020a }
            java.lang.String r7 = r7.group(r12)     // Catch:{ NumberFormatException -> 0x020a }
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)     // Catch:{ NumberFormatException -> 0x020a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x020a }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x020a }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x020a }
            int r8 = r1.width     // Catch:{ NumberFormatException -> 0x020a }
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x020a }
            float r6 = r6 / r8
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x020a }
            int r8 = r1.height     // Catch:{ NumberFormatException -> 0x020a }
            float r8 = (float) r8
            float r7 = r7 / r8
        L_0x00aa:
            java.lang.String r8 = "extent"
            java.lang.String r8 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r8)
            if (r8 == 0) goto L_0x0204
            java.util.regex.Pattern r9 = PERCENTAGE_COORDINATES
            java.util.regex.Matcher r9 = r9.matcher(r8)
            java.util.regex.Pattern r14 = PIXEL_COORDINATES
            java.util.regex.Matcher r8 = r14.matcher(r8)
            boolean r14 = r9.matches()
            java.lang.String r15 = "Ignoring region with malformed extent: "
            if (r14 == 0) goto L_0x00fa
            java.lang.String r1 = r9.group(r13)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00e7 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00e7 }
            float r1 = r1 / r11
            java.lang.String r8 = r9.group(r12)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x00e7 }
            float r2 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x00e7 }
            float r2 = r2 / r11
            r9 = r1
            r10 = r2
            goto L_0x013c
        L_0x00e7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x00fa:
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x01ef
            if (r1 != 0) goto L_0x0115
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x0115:
            java.lang.String r9 = r8.group(r13)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01dc }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.String r8 = r8.group(r12)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.Object r8 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01dc }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01dc }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01dc }
            int r10 = r1.width     // Catch:{ NumberFormatException -> 0x01dc }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01dc }
            float r9 = r9 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01dc }
            int r1 = r1.height     // Catch:{ NumberFormatException -> 0x01dc }
            float r1 = (float) r1
            float r8 = r8 / r1
            r10 = r8
        L_0x013c:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r1)
            r2 = -1
            r3 = 0
            if (r1 == 0) goto L_0x017d
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r1)
            int r5 = r1.hashCode()
            r8 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r5 == r8) goto L_0x0163
            r8 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r5 == r8) goto L_0x0159
            goto L_0x016d
        L_0x0159:
            java.lang.String r5 = "after"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x016d
            r1 = 1
            goto L_0x016e
        L_0x0163:
            java.lang.String r5 = "center"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x016d
            r1 = 0
            goto L_0x016e
        L_0x016d:
            r1 = -1
        L_0x016e:
            if (r1 == 0) goto L_0x0176
            if (r1 == r13) goto L_0x0173
            goto L_0x017d
        L_0x0173:
            float r7 = r7 + r10
            r8 = 2
            goto L_0x017e
        L_0x0176:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r10 / r1
            float r7 = r7 + r1
            r8 = 1
            goto L_0x017e
        L_0x017d:
            r8 = 0
        L_0x017e:
            r1 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r5 = r5.rows
            float r5 = (float) r5
            float r1 = r1 / r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r11 = "writingMode"
            java.lang.String r0 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(r0, r11)
            if (r0 == 0) goto L_0x01cd
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r0)
            int r11 = r0.hashCode()
            r14 = 3694(0xe6e, float:5.176E-42)
            if (r11 == r14) goto L_0x01bb
            r3 = 3553396(0x363874, float:4.979368E-39)
            if (r11 == r3) goto L_0x01b1
            r3 = 3553576(0x363928, float:4.97962E-39)
            if (r11 == r3) goto L_0x01a7
            goto L_0x01c4
        L_0x01a7:
            java.lang.String r3 = "tbrl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01c4
            r2 = 2
            goto L_0x01c4
        L_0x01b1:
            java.lang.String r3 = "tblr"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01c4
            r2 = 1
            goto L_0x01c4
        L_0x01bb:
            java.lang.String r11 = "tb"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01c4
            r2 = 0
        L_0x01c4:
            if (r2 == 0) goto L_0x01cb
            if (r2 == r13) goto L_0x01cb
            if (r2 == r12) goto L_0x01cf
            goto L_0x01cd
        L_0x01cb:
            r13 = 2
            goto L_0x01cf
        L_0x01cd:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x01cf:
            com.google.android.exoplayer2.text.ttml.TtmlRegion r0 = new com.google.android.exoplayer2.text.ttml.TtmlRegion
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r6
            r6 = r7
            r7 = r2
            r12 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x01dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x01ef:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x0204:
            java.lang.String r0 = "Ignoring region without an extent"
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x020a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x021d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        L_0x0232:
            java.lang.String r0 = "Ignoring region without an origin"
            com.google.android.exoplayer2.util.Log.m9247w(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseRegionAttributes(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution, com.google.android.exoplayer2.text.ttml.TtmlDecoder$TtsExtent):com.google.android.exoplayer2.text.ttml.TtmlRegion");
    }

    private static String[] parseStyleIds(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Util.split(trim, "\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.text.ttml.TtmlStyle r13) {
        /*
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x034d
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto L_0x00ab;
                case -1224696685: goto L_0x00a1;
                case -1065511464: goto L_0x0097;
                case -879295043: goto L_0x008c;
                case -734428249: goto L_0x0082;
                case 3355: goto L_0x0078;
                case 3511770: goto L_0x006d;
                case 94842723: goto L_0x0063;
                case 109403361: goto L_0x0058;
                case 110138194: goto L_0x004d;
                case 365601008: goto L_0x0042;
                case 921125321: goto L_0x0036;
                case 1115953443: goto L_0x002a;
                case 1287124693: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00b5
        L_0x001f:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 1
            goto L_0x00b6
        L_0x002a:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 10
            goto L_0x00b6
        L_0x0036:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 12
            goto L_0x00b6
        L_0x0042:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 4
            goto L_0x00b6
        L_0x004d:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 8
            goto L_0x00b6
        L_0x0058:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 13
            goto L_0x00b6
        L_0x0063:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 2
            goto L_0x00b6
        L_0x006d:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 9
            goto L_0x00b6
        L_0x0078:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 0
            goto L_0x00b6
        L_0x0082:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 5
            goto L_0x00b6
        L_0x008c:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 11
            goto L_0x00b6
        L_0x0097:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 7
            goto L_0x00b6
        L_0x00a1:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 3
            goto L_0x00b6
        L_0x00ab:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b5
            r4 = 6
            goto L_0x00b6
        L_0x00b5:
            r4 = -1
        L_0x00b6:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x0335;
                case 1: goto L_0x0314;
                case 2: goto L_0x02f3;
                case 3: goto L_0x02ea;
                case 4: goto L_0x02cc;
                case 5: goto L_0x02bc;
                case 6: goto L_0x02ac;
                case 7: goto L_0x023f;
                case 8: goto L_0x01ff;
                case 9: goto L_0x0182;
                case 10: goto L_0x0142;
                case 11: goto L_0x00dd;
                case 12: goto L_0x00cb;
                case 13: goto L_0x00bd;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            goto L_0x0349
        L_0x00bd:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            float r3 = parseShear(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setShearPercentage(r3)
            goto L_0x0349
        L_0x00cb:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r3)
            com.google.android.exoplayer2.text.ttml.TextEmphasis r3 = com.google.android.exoplayer2.text.ttml.TextEmphasis.parse(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextEmphasis(r3)
            goto L_0x0349
        L_0x00dd:
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x0107;
                case -1026963764: goto L_0x00fd;
                case 913457136: goto L_0x00f3;
                case 1679736913: goto L_0x00e9;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            goto L_0x0110
        L_0x00e9:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0110
            r8 = 0
            goto L_0x0110
        L_0x00f3:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0110
            r8 = 1
            goto L_0x0110
        L_0x00fd:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0110
            r8 = 2
            goto L_0x0110
        L_0x0107:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0110
            r8 = 3
        L_0x0110:
            if (r8 == 0) goto L_0x0138
            if (r8 == r11) goto L_0x012e
            if (r8 == r10) goto L_0x0124
            if (r8 == r9) goto L_0x011a
            goto L_0x0349
        L_0x011a:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setUnderline(r1)
            goto L_0x0349
        L_0x0124:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setUnderline(r11)
            goto L_0x0349
        L_0x012e:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setLinethrough(r1)
            goto L_0x0349
        L_0x0138:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setLinethrough(r11)
            goto L_0x0349
        L_0x0142:
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r3)
            int r4 = r3.hashCode()
            r5 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r4 == r5) goto L_0x015f
            r5 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r4 == r5) goto L_0x0155
            goto L_0x0168
        L_0x0155:
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0168
            r8 = 1
            goto L_0x0168
        L_0x015f:
            java.lang.String r4 = "before"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0168
            r8 = 0
        L_0x0168:
            if (r8 == 0) goto L_0x0178
            if (r8 == r11) goto L_0x016e
            goto L_0x0349
        L_0x016e:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyPosition(r10)
            goto L_0x0349
        L_0x0178:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyPosition(r11)
            goto L_0x0349
        L_0x0182:
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x01c0;
                case -410956671: goto L_0x01b6;
                case -250518009: goto L_0x01ac;
                case -136074796: goto L_0x01a2;
                case 3016401: goto L_0x0198;
                case 3556653: goto L_0x018e;
                default: goto L_0x018d;
            }
        L_0x018d:
            goto L_0x01c9
        L_0x018e:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01c9
            r8 = 3
            goto L_0x01c9
        L_0x0198:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01c9
            r8 = 1
            goto L_0x01c9
        L_0x01a2:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01c9
            r8 = 4
            goto L_0x01c9
        L_0x01ac:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01c9
            r8 = 5
            goto L_0x01c9
        L_0x01b6:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01c9
            r8 = 0
            goto L_0x01c9
        L_0x01c0:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01c9
            r8 = 2
        L_0x01c9:
            if (r8 == 0) goto L_0x01f5
            if (r8 == r11) goto L_0x01eb
            if (r8 == r10) goto L_0x01eb
            if (r8 == r9) goto L_0x01e1
            if (r8 == r7) goto L_0x01e1
            if (r8 == r6) goto L_0x01d7
            goto L_0x0349
        L_0x01d7:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r7)
            goto L_0x0349
        L_0x01e1:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r9)
            goto L_0x0349
        L_0x01eb:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r10)
            goto L_0x0349
        L_0x01f5:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setRubyType(r11)
            goto L_0x0349
        L_0x01ff:
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r3)
            int r4 = r3.hashCode()
            r5 = 96673(0x179a1, float:1.35468E-40)
            if (r4 == r5) goto L_0x021c
            r5 = 3387192(0x33af38, float:4.746467E-39)
            if (r4 == r5) goto L_0x0212
            goto L_0x0225
        L_0x0212:
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0225
            r8 = 0
            goto L_0x0225
        L_0x021c:
            java.lang.String r4 = "all"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0225
            r8 = 1
        L_0x0225:
            if (r8 == 0) goto L_0x0235
            if (r8 == r11) goto L_0x022b
            goto L_0x0349
        L_0x022b:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextCombine(r11)
            goto L_0x0349
        L_0x0235:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextCombine(r1)
            goto L_0x0349
        L_0x023f:
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0273;
                case 100571: goto L_0x0269;
                case 3317767: goto L_0x025f;
                case 108511772: goto L_0x0255;
                case 109757538: goto L_0x024b;
                default: goto L_0x024a;
            }
        L_0x024a:
            goto L_0x027c
        L_0x024b:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x027c
            r8 = 1
            goto L_0x027c
        L_0x0255:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x027c
            r8 = 2
            goto L_0x027c
        L_0x025f:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x027c
            r8 = 0
            goto L_0x027c
        L_0x0269:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x027c
            r8 = 3
            goto L_0x027c
        L_0x0273:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x027c
            r8 = 4
        L_0x027c:
            if (r8 == 0) goto L_0x02a0
            if (r8 == r11) goto L_0x02a0
            if (r8 == r10) goto L_0x0294
            if (r8 == r9) goto L_0x0294
            if (r8 == r7) goto L_0x0288
            goto L_0x0349
        L_0x0288:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextAlign(r3)
            goto L_0x0349
        L_0x0294:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextAlign(r3)
            goto L_0x0349
        L_0x02a0:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setTextAlign(r3)
            goto L_0x0349
        L_0x02ac:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setItalic(r3)
            goto L_0x0349
        L_0x02bc:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setBold(r3)
            goto L_0x0349
        L_0x02cc:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)     // Catch:{ SubtitleDecoderException -> 0x02d5 }
            parseFontSize(r3, r13)     // Catch:{ SubtitleDecoderException -> 0x02d5 }
            goto L_0x0349
        L_0x02d5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r3)
            goto L_0x0349
        L_0x02ea:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setFontFamily(r3)
            goto L_0x0349
        L_0x02f3:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(r3)     // Catch:{ IllegalArgumentException -> 0x02ff }
            r13.setFontColor(r4)     // Catch:{ IllegalArgumentException -> 0x02ff }
            goto L_0x0349
        L_0x02ff:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r3)
            goto L_0x0349
        L_0x0314:
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            int r4 = com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(r3)     // Catch:{ IllegalArgumentException -> 0x0320 }
            r13.setBackgroundColor(r4)     // Catch:{ IllegalArgumentException -> 0x0320 }
            goto L_0x0349
        L_0x0320:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.exoplayer2.util.Log.m9247w(r5, r3)
            goto L_0x0349
        L_0x0335:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0349
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = createIfNull(r13)
            com.google.android.exoplayer2.text.ttml.TtmlStyle r13 = r13.setId(r3)
        L_0x0349:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x034d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseStyleAttributes(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlStyle):com.google.android.exoplayer2.text.ttml.TtmlStyle");
    }

    private static TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.text.ttml.TtmlNode parseNode(org.xmlpull.v1.XmlPullParser r19, com.google.android.exoplayer2.text.ttml.TtmlNode r20, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r21, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r22) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            com.google.android.exoplayer2.text.ttml.TtmlStyle r5 = parseStyleAttributes(r0, r3)
            java.lang.String r8 = ""
            r11 = r3
            r10 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r11
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00c2
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            int r18 = r4.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0068;
                case 99841: goto L_0x005e;
                case 100571: goto L_0x0054;
                case 93616297: goto L_0x004a;
                case 109780401: goto L_0x0040;
                case 1292595405: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0072
        L_0x0036:
            java.lang.String r7 = "backgroundImage"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 5
            goto L_0x0073
        L_0x0040:
            java.lang.String r7 = "style"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 3
            goto L_0x0073
        L_0x004a:
            java.lang.String r7 = "begin"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 0
            goto L_0x0073
        L_0x0054:
            java.lang.String r7 = "end"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 1
            goto L_0x0073
        L_0x005e:
            java.lang.String r7 = "dur"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 2
            goto L_0x0073
        L_0x0068:
            java.lang.String r7 = "region"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0072
            r7 = 4
            goto L_0x0073
        L_0x0072:
            r7 = -1
        L_0x0073:
            if (r7 == 0) goto L_0x00b8
            r4 = 1
            if (r7 == r4) goto L_0x00b1
            r4 = 2
            if (r7 == r4) goto L_0x00aa
            r4 = 3
            if (r7 == r4) goto L_0x009f
            r4 = 4
            if (r7 == r4) goto L_0x0095
            r4 = 5
            if (r7 == r4) goto L_0x0085
            goto L_0x0092
        L_0x0085:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x0092
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
        L_0x0092:
            r4 = r21
            goto L_0x00be
        L_0x0095:
            r4 = r21
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x00be
            r10 = r6
            goto L_0x00be
        L_0x009f:
            r4 = r21
            java.lang.String[] r6 = parseStyleIds(r6)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x00be
            r8 = r6
            goto L_0x00be
        L_0x00aa:
            r4 = r21
            long r16 = parseTimeExpression(r6, r1)
            goto L_0x00be
        L_0x00b1:
            r4 = r21
            long r14 = parseTimeExpression(r6, r1)
            goto L_0x00be
        L_0x00b8:
            r4 = r21
            long r12 = parseTimeExpression(r6, r1)
        L_0x00be:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00c2:
            if (r9 == 0) goto L_0x00de
            long r1 = r9.startTimeUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00e3
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00d6
            long r1 = r9.startTimeUs
            long r12 = r12 + r1
        L_0x00d6:
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00e3
            long r1 = r9.startTimeUs
            long r14 = r14 + r1
            goto L_0x00e3
        L_0x00de:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e3:
            r1 = r12
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00fc
            int r6 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00f1
            long r16 = r1 + r16
            r3 = r16
            goto L_0x00fd
        L_0x00f1:
            if (r9 == 0) goto L_0x00fc
            long r6 = r9.endTimeUs
            int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00fc
            long r3 = r9.endTimeUs
            goto L_0x00fd
        L_0x00fc:
            r3 = r14
        L_0x00fd:
            java.lang.String r0 = r19.getName()
            r6 = r8
            r7 = r10
            r8 = r11
            r9 = r20
            com.google.android.exoplayer2.text.ttml.TtmlNode r0 = com.google.android.exoplayer2.text.ttml.TtmlNode.buildNode(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseNode(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlNode, java.util.Map, com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate):com.google.android.exoplayer2.text.ttml.TtmlNode");
    }

    private static boolean isSupportedTag(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] split = Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (split.length == 2) {
            matcher = FONT_SIZE.matcher(split[1]);
            Log.m9247w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(3));
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && str2.equals("px")) {
                        c = 0;
                    }
                } else if (str2.equals(UserDataStore.EMAIL)) {
                    c = 1;
                }
            } else if (str2.equals("%")) {
                c = 2;
            }
            if (c == 0) {
                ttmlStyle.setFontSizeUnit(1);
            } else if (c == 1) {
                ttmlStyle.setFontSizeUnit(2);
            } else if (c == 2) {
                ttmlStyle.setFontSizeUnit(3);
            } else {
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
            }
            ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
            return;
        }
        throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.m9247w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            Log.m9248w(TAG, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (r14.equals("s") != false) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long parseTimeExpression(java.lang.String r14, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate r15) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            java.util.regex.Pattern r0 = CLOCK_TIME
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0088
            java.lang.String r14 = r0.group(r8)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x005a
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x005b
        L_0x005a:
            r10 = r5
        L_0x005b:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x006c
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.effectiveFrameRate
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x006d
        L_0x006c:
            r10 = r5
        L_0x006d:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0083
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.subFrameRate
            double r4 = (double) r14
            double r0 = r0 / r4
            float r14 = r15.effectiveFrameRate
            double r14 = (double) r14
            double r5 = r0 / r14
        L_0x0083:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0088:
            java.util.regex.Pattern r0 = OFFSET_TIME
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x012e
            java.lang.String r14 = r0.group(r8)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            java.lang.Object r14 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r14)
            java.lang.String r14 = (java.lang.String) r14
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00fb
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00f1
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00e7
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00dd
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00d4
            r7 = 116(0x74, float:1.63E-43)
            if (r1 == r7) goto L_0x00ca
            goto L_0x0105
        L_0x00ca:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 5
            goto L_0x0106
        L_0x00d4:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            goto L_0x0106
        L_0x00dd:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 3
            goto L_0x0106
        L_0x00e7:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 1
            goto L_0x0106
        L_0x00f1:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 0
            goto L_0x0106
        L_0x00fb:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0105
            r7 = 4
            goto L_0x0106
        L_0x0105:
            r7 = -1
        L_0x0106:
            if (r7 == 0) goto L_0x0123
            if (r7 == r8) goto L_0x0120
            if (r7 == r6) goto L_0x0119
            if (r7 == r5) goto L_0x0115
            if (r7 == r4) goto L_0x0111
            goto L_0x012a
        L_0x0111:
            int r14 = r15.tickRate
            double r14 = (double) r14
            goto L_0x011e
        L_0x0115:
            float r14 = r15.effectiveFrameRate
            double r14 = (double) r14
            goto L_0x011e
        L_0x0119:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x011e:
            double r9 = r9 / r14
            goto L_0x012a
        L_0x0120:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0128
        L_0x0123:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0128:
            double r9 = r9 * r14
        L_0x012a:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x012e:
            com.google.android.exoplayer2.text.SubtitleDecoderException r15 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>((java.lang.String) r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.parseTimeExpression(java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlDecoder$FrameAndTickRate):long");
    }

    private static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    private static final class CellResolution {
        final int columns;
        final int rows;

        CellResolution(int i, int i2) {
            this.columns = i;
            this.rows = i2;
        }
    }

    private static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
