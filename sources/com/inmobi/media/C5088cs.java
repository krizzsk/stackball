package com.inmobi.media;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.inmobi.media.C5220ev;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.inmobi.media.cs */
/* compiled from: VastParser */
public class C5088cs {

    /* renamed from: a */
    private static final String f11658a = C5088cs.class.getSimpleName();

    /* renamed from: f */
    private static final Map<String, String> f11659f;

    /* renamed from: b */
    private C5094cv f11660b;

    /* renamed from: c */
    private C5220ev.C5232i f11661c;

    /* renamed from: d */
    private boolean f11662d;

    /* renamed from: e */
    private int f11663e;

    /* renamed from: b */
    private static boolean m11550b(int i) {
        return i == 3;
    }

    static {
        HashMap hashMap = new HashMap();
        f11659f = hashMap;
        hashMap.put("Error", "error");
        f11659f.put("Impression", "Impression");
        f11659f.put(VideoClicks.CLICK_TRACKING, "click");
        f11659f.put("creativeView", "creativeView");
        f11659f.put("start", "start");
        f11659f.put(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE, TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
        f11659f.put("midpoint", "midpoint");
        f11659f.put(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE, TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
        f11659f.put("complete", "complete");
        f11659f.put("mute", "mute");
        f11659f.put("unmute", "unmute");
        f11659f.put(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        f11659f.put(CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        f11659f.put("fullscreen", "fullscreen");
        f11659f.put("exitFullscreen", "exitFullscreen");
        f11659f.put("closeEndCard", "closeEndCard");
    }

    public C5088cs(C5220ev.C5232i iVar) {
        this.f11661c = iVar;
        this.f11660b = new C5094cv(iVar);
    }

    /* renamed from: a */
    public final C5094cv mo40353a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                m11541a((int) ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR);
                return this.f11660b;
            }
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            String[] strArr = {"Wrapper", "InLine"};
            m11543a(newPullParser, VastTree.VAST);
            if (m11547a(VastTree.VAST, newPullParser)) {
                m11543a(newPullParser, "Ad");
                if (m11547a("Ad", newPullParser)) {
                    m11545a(newPullParser, strArr);
                    if (m11547a("InLine", newPullParser)) {
                        m11548b(newPullParser);
                    } else if (m11547a("Wrapper", newPullParser)) {
                        m11542a(newPullParser);
                    } else {
                        m11541a(101);
                    }
                } else {
                    m11541a((int) ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR);
                }
            } else {
                m11541a(101);
            }
            return this.f11660b;
        } catch (XmlPullParserException e) {
            m11541a(100);
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        } catch (Exception e2) {
            m11541a((int) ErrorCode.UNDEFINED_ERROR);
            C5275fn.m12068a().mo40590a(new C5308gk(e2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x013e, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11542a(org.xmlpull.v1.XmlPullParser r11) {
        /*
            r10 = this;
            int r0 = r10.f11663e
            r1 = 1
            int r0 = r0 + r1
            r10.f11663e = r0
            com.inmobi.media.ev$i r2 = r10.f11661c
            int r2 = r2.maxWrapperLimit
            if (r0 <= r2) goto L_0x0012
            r11 = 302(0x12e, float:4.23E-43)
            r10.m11541a((int) r11)
            return
        L_0x0012:
            int r0 = m11558i(r11)
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0019:
            java.lang.String r5 = r11.getName()
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == 0) goto L_0x003c
            java.lang.String r5 = r11.getName()
            java.lang.String r7 = "Wrapper"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x003c
            boolean r5 = m11550b((int) r0)
            if (r5 != 0) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            if (r3 == 0) goto L_0x0038
            if (r4 != 0) goto L_0x003b
        L_0x0038:
            r10.m11541a((int) r6)
        L_0x003b:
            return
        L_0x003c:
            java.lang.String r5 = r11.getName()
            if (r5 == 0) goto L_0x013e
            boolean r0 = m11550b((int) r0)
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = r11.getName()
            r5 = -1
            int r7 = r0.hashCode()
            java.lang.String r8 = "Impression"
            r9 = 4
            switch(r7) {
                case -2077435339: goto L_0x0092;
                case -2049897434: goto L_0x0088;
                case -587420703: goto L_0x007e;
                case 67232232: goto L_0x0074;
                case 184043572: goto L_0x006a;
                case 611554000: goto L_0x0060;
                case 2114088489: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x009b
        L_0x0058:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x009b
            r5 = 0
            goto L_0x009b
        L_0x0060:
            java.lang.String r7 = "TrackingEvents"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x009b
            r5 = 3
            goto L_0x009b
        L_0x006a:
            java.lang.String r7 = "Extensions"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x009b
            r5 = 6
            goto L_0x009b
        L_0x0074:
            java.lang.String r7 = "Error"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x009b
            r5 = 1
            goto L_0x009b
        L_0x007e:
            java.lang.String r7 = "VASTAdTagURI"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x009b
            r5 = 2
            goto L_0x009b
        L_0x0088:
            java.lang.String r7 = "VideoClicks"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x009b
            r5 = 4
            goto L_0x009b
        L_0x0092:
            java.lang.String r7 = "AdVerifications"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x009b
            r5 = 5
        L_0x009b:
            switch(r5) {
                case 0: goto L_0x0127;
                case 1: goto L_0x0117;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00af;
                case 4: goto L_0x00aa;
                case 5: goto L_0x00a5;
                case 6: goto L_0x00a0;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x013e
        L_0x00a0:
            r10.m11554e(r11)
            goto L_0x013e
        L_0x00a5:
            r10.m11556g(r11)
            goto L_0x013e
        L_0x00aa:
            r10.m11544a((org.xmlpull.v1.XmlPullParser) r11, (boolean) r2)
            goto L_0x013e
        L_0x00af:
            r10.m11553d(r11)
            goto L_0x013e
        L_0x00b4:
            int r0 = m11558i(r11)
            if (r0 != r9) goto L_0x0113
            java.lang.String r0 = r11.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x00c6
            r0 = 0
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r0 = r0.trim()
        L_0x00ca:
            r3 = 300(0x12c, float:4.2E-43)
            if (r0 != 0) goto L_0x00d2
            r10.m11541a((int) r3)
            return
        L_0x00d2:
            boolean r5 = android.webkit.URLUtil.isValidUrl(r0)
            if (r5 == 0) goto L_0x0102
            com.inmobi.media.gc r3 = new com.inmobi.media.gc
            java.lang.String r5 = "GET"
            r3.<init>(r5, r0)
            r3.f12136o = r2
            r3.f12142u = r2
            r3.f12134m = r1
            com.inmobi.media.ge r0 = new com.inmobi.media.ge
            r0.<init>(r3)
            com.inmobi.media.gd r0 = r0.mo40629a()
            boolean r3 = r0.mo40624a()
            if (r3 == 0) goto L_0x00fa
            r0 = 301(0x12d, float:4.22E-43)
            r10.m11541a((int) r0)
            goto L_0x0105
        L_0x00fa:
            java.lang.String r0 = r0.mo40625b()
            r10.mo40353a((java.lang.String) r0)
            goto L_0x0105
        L_0x0102:
            r10.m11541a((int) r3)
        L_0x0105:
            com.inmobi.media.cv r0 = r10.f11660b
            int r0 = r0.f11681f
            if (r0 == 0) goto L_0x010d
            r0 = 1
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0111
            return
        L_0x0111:
            r3 = 1
            goto L_0x013e
        L_0x0113:
            r10.m11541a((int) r6)
            return
        L_0x0117:
            int r0 = m11558i(r11)
            if (r0 != r9) goto L_0x013e
            java.lang.String r0 = r11.getText()
            java.lang.String r5 = "error"
            r10.m11546a((java.lang.String) r5, (java.lang.String) r0)
            goto L_0x013e
        L_0x0127:
            int r0 = m11558i(r11)
            if (r0 != r9) goto L_0x013a
            java.lang.String r0 = r11.getText()
            boolean r0 = r10.m11546a((java.lang.String) r8, (java.lang.String) r0)
            if (r0 != 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r4 = 1
            goto L_0x013e
        L_0x013a:
            r10.m11541a((int) r6)
            return
        L_0x013e:
            int r0 = m11558i(r11)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5088cs.m11542a(org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11548b(org.xmlpull.v1.XmlPullParser r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = m11558i(r21)
            r4 = 0
            r5 = 0
        L_0x000a:
            java.lang.String r6 = r21.getName()
            r7 = 101(0x65, float:1.42E-43)
            if (r6 == 0) goto L_0x002d
            java.lang.String r6 = r21.getName()
            java.lang.String r8 = "InLine"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x002d
            boolean r6 = m11550b((int) r2)
            if (r6 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            if (r4 == 0) goto L_0x0029
            if (r5 != 0) goto L_0x002c
        L_0x0029:
            r0.m11541a((int) r7)
        L_0x002c:
            return
        L_0x002d:
            java.lang.String r6 = r21.getName()
            r8 = 1
            if (r6 == 0) goto L_0x00c6
            boolean r2 = m11550b((int) r2)
            if (r2 != 0) goto L_0x00c6
            java.lang.String r2 = r21.getName()
            int r6 = r2.hashCode()
            java.lang.String r9 = "Impression"
            java.lang.String r10 = "Creatives"
            r12 = 3
            r13 = 2
            r14 = 4
            switch(r6) {
                case -2077435339: goto L_0x0071;
                case -1692490108: goto L_0x0069;
                case 67232232: goto L_0x005f;
                case 184043572: goto L_0x0055;
                case 2114088489: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x007b
        L_0x004d:
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x0055:
            java.lang.String r6 = "Extensions"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 4
            goto L_0x007c
        L_0x005f:
            java.lang.String r6 = "Error"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x0069:
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = 2
            goto L_0x007c
        L_0x0071:
            java.lang.String r6 = "AdVerifications"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 3
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x04d5
            if (r2 == r8) goto L_0x04c7
            if (r2 == r13) goto L_0x008f
            if (r2 == r12) goto L_0x008b
            if (r2 == r14) goto L_0x0087
            goto L_0x00c6
        L_0x0087:
            r20.m11554e(r21)
            goto L_0x00c6
        L_0x008b:
            r20.m11556g(r21)
            goto L_0x00c6
        L_0x008f:
            int r2 = m11558i(r21)
            r4 = 0
            r6 = 0
            r9 = 0
        L_0x0096:
            java.lang.String r15 = r21.getName()
            if (r15 == 0) goto L_0x00c9
            java.lang.String r15 = r21.getName()
            boolean r15 = r15.equals(r10)
            if (r15 == 0) goto L_0x00c9
            boolean r15 = m11550b((int) r2)
            if (r15 != 0) goto L_0x00ad
            goto L_0x00c9
        L_0x00ad:
            if (r4 != 0) goto L_0x00b2
            r0.m11541a((int) r7)
        L_0x00b2:
            if (r6 != 0) goto L_0x00b9
            r2 = 201(0xc9, float:2.82E-43)
            r0.m11541a((int) r2)
        L_0x00b9:
            if (r4 == 0) goto L_0x00c1
            if (r6 == 0) goto L_0x00c1
            if (r9 == 0) goto L_0x00c1
            r2 = 1
            goto L_0x00c2
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 != 0) goto L_0x00c5
            return
        L_0x00c5:
            r4 = 1
        L_0x00c6:
            r13 = 0
            goto L_0x04f0
        L_0x00c9:
            java.lang.String r15 = r21.getName()
            if (r15 == 0) goto L_0x04b5
            boolean r2 = m11550b((int) r2)
            if (r2 != 0) goto L_0x04b5
            java.lang.String r2 = r21.getName()
            int r15 = r2.hashCode()
            r11 = -2018804923(0xffffffff87ab7b45, float:-2.5801672E-34)
            java.lang.String r7 = "CompanionAds"
            java.lang.String r3 = "Linear"
            if (r15 == r11) goto L_0x0103
            r11 = 1150879268(0x44990624, float:1224.1919)
            if (r15 == r11) goto L_0x00fb
            r11 = 1885066191(0x705bd3cf, float:2.7213311E29)
            if (r15 == r11) goto L_0x00f1
            goto L_0x010b
        L_0x00f1:
            java.lang.String r11 = "Creative"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x010b
            r2 = 0
            goto L_0x010c
        L_0x00fb:
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x010b
            r2 = 2
            goto L_0x010c
        L_0x0103:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x010b
            r2 = 1
            goto L_0x010c
        L_0x010b:
            r2 = -1
        L_0x010c:
            if (r2 == 0) goto L_0x04b0
            java.lang.String r11 = "TrackingEvents"
            if (r2 == r8) goto L_0x03e2
            if (r2 == r13) goto L_0x0116
            goto L_0x04b5
        L_0x0116:
            int r2 = m11558i(r21)
            r3 = 0
        L_0x011b:
            java.lang.String r15 = r21.getName()
            if (r15 == 0) goto L_0x0152
            java.lang.String r15 = r21.getName()
            boolean r15 = r15.equals(r7)
            if (r15 == 0) goto L_0x0152
            boolean r15 = m11550b((int) r2)
            if (r15 != 0) goto L_0x0132
            goto L_0x0152
        L_0x0132:
            com.inmobi.media.cv r2 = r0.f11660b
            java.util.List<com.inmobi.media.cp> r2 = r2.f11680e
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0147
            boolean r7 = r0.f11662d
            if (r7 == 0) goto L_0x0147
            r2 = 604(0x25c, float:8.46E-43)
            r0.m11551c((int) r2)
            goto L_0x04b5
        L_0x0147:
            if (r3 <= 0) goto L_0x04b5
            if (r2 != 0) goto L_0x04b5
            r2 = 600(0x258, float:8.41E-43)
            r0.m11551c((int) r2)
            goto L_0x04b5
        L_0x0152:
            java.lang.String r15 = r21.getName()
            if (r15 == 0) goto L_0x01c2
            java.lang.String r15 = r21.getName()
            java.lang.String r14 = "Companion"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x01c2
            boolean r15 = m11550b((int) r2)
            if (r15 != 0) goto L_0x01c2
            int r3 = r3 + 1
            r15 = 0
            java.lang.String r12 = "width"
            java.lang.String r12 = r1.getAttributeValue(r15, r12)     // Catch:{ Exception -> 0x0182 }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r13 = "height"
            java.lang.String r13 = r1.getAttributeValue(r15, r13)     // Catch:{ Exception -> 0x0183 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ Exception -> 0x0183 }
            goto L_0x0184
        L_0x0182:
            r12 = 0
        L_0x0183:
            r13 = 0
        L_0x0184:
            if (r12 <= 0) goto L_0x03ca
            if (r13 > 0) goto L_0x018a
            goto L_0x03ca
        L_0x018a:
            java.lang.String r8 = "ID"
            java.lang.String r8 = r1.getAttributeValue(r15, r8)
            com.inmobi.media.cp r15 = new com.inmobi.media.cp
            r15.<init>(r12, r13, r8)
            int r8 = m11558i(r21)
            r12 = 0
        L_0x019a:
            java.lang.String r13 = r21.getName()
            if (r13 == 0) goto L_0x01c7
            java.lang.String r13 = r21.getName()
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x01c7
            boolean r13 = m11550b((int) r8)
            if (r13 != 0) goto L_0x01b1
            goto L_0x01c7
        L_0x01b1:
            java.util.List<com.inmobi.media.cp$a> r8 = r15.f11633c
            if (r8 == 0) goto L_0x03dc
            int r8 = r8.size()
            if (r8 == 0) goto L_0x03dc
            com.inmobi.media.cv r2 = r0.f11660b
            java.util.List<com.inmobi.media.cp> r2 = r2.f11680e
            r2.add(r15)
        L_0x01c2:
            r19 = r4
            r13 = 0
            goto L_0x03d6
        L_0x01c7:
            java.lang.String r13 = r21.getName()
            if (r13 == 0) goto L_0x03b6
            boolean r8 = m11550b((int) r8)
            if (r8 != 0) goto L_0x03b6
            java.lang.String r8 = r21.getName()
            int r13 = r8.hashCode()
            r16 = r2
            r2 = 5
            switch(r13) {
                case -375340334: goto L_0x0212;
                case -348198615: goto L_0x0208;
                case 611554000: goto L_0x0200;
                case 676623548: goto L_0x01f6;
                case 1877773523: goto L_0x01ec;
                case 1928285401: goto L_0x01e2;
                default: goto L_0x01e1;
            }
        L_0x01e1:
            goto L_0x021c
        L_0x01e2:
            java.lang.String r13 = "HTMLResource"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x021c
            r8 = 1
            goto L_0x021d
        L_0x01ec:
            java.lang.String r13 = "CompanionClickTracking"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x021c
            r8 = 3
            goto L_0x021d
        L_0x01f6:
            java.lang.String r13 = "StaticResource"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x021c
            r8 = 0
            goto L_0x021d
        L_0x0200:
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x021c
            r8 = 5
            goto L_0x021d
        L_0x0208:
            java.lang.String r13 = "CompanionClickThrough"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x021c
            r8 = 4
            goto L_0x021d
        L_0x0212:
            java.lang.String r13 = "IFrameResource"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x021c
            r8 = 2
            goto L_0x021d
        L_0x021c:
            r8 = -1
        L_0x021d:
            if (r8 == 0) goto L_0x0358
            r13 = 1
            if (r8 == r13) goto L_0x0337
            r13 = 2
            if (r8 == r13) goto L_0x0316
            r13 = 3
            if (r8 == r13) goto L_0x02e3
            r13 = 4
            if (r8 == r13) goto L_0x02bf
            if (r8 == r2) goto L_0x022f
            goto L_0x03b8
        L_0x022f:
            int r2 = m11558i(r21)
        L_0x0233:
            java.lang.String r8 = r21.getName()
            if (r8 == 0) goto L_0x0249
            java.lang.String r8 = r21.getName()
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0249
            boolean r8 = m11550b((int) r2)
            if (r8 != 0) goto L_0x03b8
        L_0x0249:
            java.lang.String r8 = r21.getName()
            java.lang.String r13 = "Tracking"
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto L_0x02b1
            boolean r2 = m11550b((int) r2)
            if (r2 != 0) goto L_0x02b1
            int r2 = r21.getAttributeCount()
            r8 = 0
        L_0x0260:
            if (r8 >= r2) goto L_0x02b1
            java.lang.String r13 = r1.getAttributeName(r8)
            r17 = r2
            java.lang.String r2 = "event"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x02a8
            java.lang.String r2 = r1.getAttributeValue(r8)
            int r8 = m11558i(r21)
            r13 = 4
            if (r8 != r13) goto L_0x02b1
            java.lang.String r8 = r21.getText()
            if (r8 != 0) goto L_0x0283
            r8 = 0
            goto L_0x0287
        L_0x0283:
            java.lang.String r8 = r8.trim()
        L_0x0287:
            boolean r8 = android.webkit.URLUtil.isValidUrl(r8)
            if (r8 == 0) goto L_0x02b1
            com.inmobi.media.br r8 = new com.inmobi.media.br
            java.lang.String r13 = r21.getText()
            r18 = r3
            java.util.Map<java.lang.String, java.lang.String> r3 = f11659f
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r19 = r4
            r3 = 0
            r4 = 0
            r8.<init>(r13, r4, r2, r3)
            r15.mo40345a((com.inmobi.media.C5030br) r8)
            goto L_0x02b5
        L_0x02a8:
            r18 = r3
            r19 = r4
            int r8 = r8 + 1
            r2 = r17
            goto L_0x0260
        L_0x02b1:
            r18 = r3
            r19 = r4
        L_0x02b5:
            int r2 = m11558i(r21)
            r3 = r18
            r4 = r19
            goto L_0x0233
        L_0x02bf:
            r18 = r3
            r19 = r4
            int r2 = m11558i(r21)
            r3 = 4
            if (r2 != r3) goto L_0x0313
            java.lang.String r2 = r21.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x02d6
            r2 = 0
            goto L_0x02da
        L_0x02d6:
            java.lang.String r2 = r2.trim()
        L_0x02da:
            boolean r3 = android.webkit.URLUtil.isValidUrl(r2)
            if (r3 == 0) goto L_0x0313
            r15.f11635e = r2
            goto L_0x0313
        L_0x02e3:
            r18 = r3
            r19 = r4
            int r2 = m11558i(r21)
            r3 = 4
            if (r2 != r3) goto L_0x0313
            java.lang.String r2 = r21.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x02fa
            r12 = 0
            goto L_0x02ff
        L_0x02fa:
            java.lang.String r2 = r2.trim()
            r12 = r2
        L_0x02ff:
            boolean r2 = android.webkit.URLUtil.isValidUrl(r12)
            if (r2 == 0) goto L_0x0313
            com.inmobi.media.br r2 = new com.inmobi.media.br
            java.lang.String r3 = "click"
            r4 = 0
            r13 = 0
            r2.<init>(r12, r13, r3, r4)
            r15.mo40345a((com.inmobi.media.C5030br) r2)
            goto L_0x03be
        L_0x0313:
            r13 = 0
            goto L_0x03be
        L_0x0316:
            r18 = r3
            r19 = r4
            r13 = 0
            int r2 = m11558i(r21)
            r3 = 4
            if (r2 != r3) goto L_0x03be
            java.lang.String r2 = r21.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x03be
            com.inmobi.media.cp$a r4 = new com.inmobi.media.cp$a
            r8 = 3
            r4.<init>(r8, r2)
            r15.mo40346a((com.inmobi.media.C5082cp.C5083a) r4)
            goto L_0x03be
        L_0x0337:
            r18 = r3
            r19 = r4
            r3 = 4
            r13 = 0
            int r2 = m11558i(r21)
            if (r2 != r3) goto L_0x03be
            java.lang.String r2 = r21.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x03be
            com.inmobi.media.cp$a r3 = new com.inmobi.media.cp$a
            r4 = 2
            r3.<init>(r4, r2)
            r15.mo40346a((com.inmobi.media.C5082cp.C5083a) r3)
            goto L_0x03be
        L_0x0358:
            r18 = r3
            r19 = r4
            r13 = 0
            java.lang.String r2 = "creativeType"
            r3 = 0
            java.lang.String r2 = r1.getAttributeValue(r3, r2)
            int r4 = m11558i(r21)
            r8 = 4
            if (r4 != r8) goto L_0x037c
            java.lang.String r4 = r21.getText()
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto L_0x0377
            r12 = r3
            goto L_0x037c
        L_0x0377:
            java.lang.String r4 = r4.trim()
            r12 = r4
        L_0x037c:
            if (r2 == 0) goto L_0x03be
            java.lang.String r4 = r2.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x03be
            java.util.ArrayList<java.lang.String> r4 = com.inmobi.media.C5082cp.f11629f
            int r4 = r4.size()
            r8 = 0
        L_0x038f:
            if (r8 >= r4) goto L_0x03a5
            java.util.ArrayList<java.lang.String> r3 = com.inmobi.media.C5082cp.f11629f
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x03a1
            r2 = 1
            goto L_0x03a6
        L_0x03a1:
            int r8 = r8 + 1
            r3 = 0
            goto L_0x038f
        L_0x03a5:
            r2 = 0
        L_0x03a6:
            if (r2 == 0) goto L_0x03b2
            com.inmobi.media.cp$a r2 = new com.inmobi.media.cp$a
            r3 = 1
            r2.<init>(r3, r12)
            r15.mo40346a((com.inmobi.media.C5082cp.C5083a) r2)
            goto L_0x03be
        L_0x03b2:
            r3 = 1
            r0.f11662d = r3
            goto L_0x03be
        L_0x03b6:
            r16 = r2
        L_0x03b8:
            r18 = r3
            r19 = r4
            goto L_0x0313
        L_0x03be:
            int r8 = m11558i(r21)
            r2 = r16
            r3 = r18
            r4 = r19
            goto L_0x019a
        L_0x03ca:
            r18 = r3
            r19 = r4
            r13 = 0
            int r2 = m11558i(r21)
            r3 = r18
            goto L_0x03da
        L_0x03d6:
            int r2 = m11558i(r21)
        L_0x03da:
            r4 = r19
        L_0x03dc:
            r8 = 1
            r12 = 3
            r13 = 2
            r14 = 4
            goto L_0x011b
        L_0x03e2:
            r19 = r4
            r13 = 0
            int r2 = m11558i(r21)
            r4 = 0
            r6 = 0
            r7 = 0
        L_0x03ec:
            java.lang.String r8 = r21.getName()
            if (r8 == 0) goto L_0x041d
            java.lang.String r8 = r21.getName()
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x041d
            boolean r8 = m11550b((int) r2)
            if (r8 != 0) goto L_0x0403
            goto L_0x041d
        L_0x0403:
            if (r6 == 0) goto L_0x0407
            if (r7 != 0) goto L_0x040c
        L_0x0407:
            r2 = 101(0x65, float:1.42E-43)
            r0.m11541a((int) r2)
        L_0x040c:
            if (r6 == 0) goto L_0x0418
            if (r7 == 0) goto L_0x0418
            if (r4 == 0) goto L_0x0418
            r8 = 1
            r9 = 1
            r12 = 2
            r14 = 3
            goto L_0x04a3
        L_0x0418:
            r8 = 1
            r12 = 2
            r14 = 3
            goto L_0x04a2
        L_0x041d:
            java.lang.String r8 = r21.getName()
            if (r8 == 0) goto L_0x04a7
            boolean r2 = m11550b((int) r2)
            if (r2 != 0) goto L_0x04a7
            java.lang.String r2 = r21.getName()
            int r8 = r2.hashCode()
            switch(r8) {
                case -2049897434: goto L_0x0451;
                case -1927368268: goto L_0x0447;
                case -385055469: goto L_0x043d;
                case 611554000: goto L_0x0435;
                default: goto L_0x0434;
            }
        L_0x0434:
            goto L_0x045b
        L_0x0435:
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x045b
            r2 = 1
            goto L_0x045c
        L_0x043d:
            java.lang.String r8 = "MediaFiles"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x045b
            r2 = 3
            goto L_0x045c
        L_0x0447:
            java.lang.String r8 = "Duration"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x045b
            r2 = 0
            goto L_0x045c
        L_0x0451:
            java.lang.String r8 = "VideoClicks"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x045b
            r2 = 2
            goto L_0x045c
        L_0x045b:
            r2 = -1
        L_0x045c:
            if (r2 == 0) goto L_0x047a
            r8 = 1
            if (r2 == r8) goto L_0x0474
            r12 = 2
            if (r2 == r12) goto L_0x046f
            r14 = 3
            if (r2 == r14) goto L_0x0468
            goto L_0x04aa
        L_0x0468:
            boolean r2 = r20.m11552c((org.xmlpull.v1.XmlPullParser) r21)
            r4 = r2
            r7 = 1
            goto L_0x04aa
        L_0x046f:
            r14 = 3
            r0.m11544a((org.xmlpull.v1.XmlPullParser) r1, (boolean) r8)
            goto L_0x04aa
        L_0x0474:
            r12 = 2
            r14 = 3
            r20.m11553d(r21)
            goto L_0x04aa
        L_0x047a:
            r8 = 1
            r12 = 2
            r14 = 3
            int r2 = m11558i(r21)
            r9 = 4
            if (r2 != r9) goto L_0x04aa
            java.lang.String r2 = r21.getText()
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x049d
            java.lang.String r6 = "\\d*:[0-5][0-9]:[0-5][0-9](:[0-9][0-9][0-9])?"
            boolean r6 = r2.matches(r6)
            if (r6 != 0) goto L_0x0497
            goto L_0x049d
        L_0x0497:
            com.inmobi.media.cv r6 = r0.f11660b
            r6.f11677b = r2
            r6 = 1
            goto L_0x04aa
        L_0x049d:
            r2 = 101(0x65, float:1.42E-43)
            r0.m11541a((int) r2)
        L_0x04a2:
            r9 = 0
        L_0x04a3:
            r4 = r19
            r6 = 1
            goto L_0x04bc
        L_0x04a7:
            r8 = 1
            r12 = 2
            r14 = 3
        L_0x04aa:
            int r2 = m11558i(r21)
            goto L_0x03ec
        L_0x04b0:
            r12 = 2
            r13 = 0
            r14 = 3
            r4 = 1
            goto L_0x04bc
        L_0x04b5:
            r19 = r4
            r12 = 2
            r13 = 0
            r14 = 3
            r4 = r19
        L_0x04bc:
            int r2 = m11558i(r21)
            r7 = 101(0x65, float:1.42E-43)
            r12 = 3
            r13 = 2
            r14 = 4
            goto L_0x0096
        L_0x04c7:
            r13 = 0
            m11558i(r21)
            java.lang.String r2 = r21.getText()
            java.lang.String r3 = "error"
            r0.m11546a((java.lang.String) r3, (java.lang.String) r2)
            goto L_0x04f0
        L_0x04d5:
            r13 = 0
            int r2 = m11558i(r21)
            r3 = 4
            if (r2 != r3) goto L_0x04ea
            java.lang.String r2 = r21.getText()
            boolean r2 = r0.m11546a((java.lang.String) r9, (java.lang.String) r2)
            if (r2 != 0) goto L_0x04e8
            goto L_0x04ea
        L_0x04e8:
            r5 = 1
            goto L_0x04f0
        L_0x04ea:
            r1 = 101(0x65, float:1.42E-43)
            r0.m11541a((int) r1)
            return
        L_0x04f0:
            int r2 = m11558i(r21)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5088cs.m11548b(org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    private static void m11543a(XmlPullParser xmlPullParser, String str) {
        int i = 0;
        while (true) {
            try {
                i = xmlPullParser.next();
            } catch (IOException | XmlPullParserException unused) {
            }
            if (i == 1) {
                return;
            }
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals(str)) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m11545a(XmlPullParser xmlPullParser, String[] strArr) {
        int i = 0;
        boolean z = false;
        do {
            try {
                i = xmlPullParser.next();
            } catch (IOException | XmlPullParserException unused) {
            }
            if (i == 1) {
                return;
            }
            if (xmlPullParser.getName() != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        continue;
                        break;
                    }
                    if (xmlPullParser.getName().equals(strArr[i2])) {
                        z = true;
                        continue;
                        break;
                    }
                    i2++;
                }
            }
        } while (!z);
    }

    /* renamed from: c */
    private boolean m11552c(XmlPullParser xmlPullParser) {
        int i = m11558i(xmlPullParser);
        boolean z = false;
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals(Linear.MEDIA_FILES) && m11550b(i)) {
                break;
            }
            if (xmlPullParser.getName() != null && MediaFile.NAME.equals(xmlPullParser.getName()) && !m11550b(i)) {
                C5220ev.C5225b bVar = this.f11661c.bitRate;
                int attributeCount = xmlPullParser.getAttributeCount();
                String str = null;
                String str2 = null;
                String str3 = null;
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    String attributeName = xmlPullParser.getAttributeName(i3);
                    char c = 65535;
                    int hashCode = attributeName.hashCode();
                    if (hashCode != -102270099) {
                        if (hashCode != 3575610) {
                            if (hashCode == 823466996 && attributeName.equals(MediaFile.DELIVERY)) {
                                c = 0;
                            }
                        } else if (attributeName.equals("type")) {
                            c = 1;
                        }
                    } else if (attributeName.equals(MediaFile.BITRATE)) {
                        c = 2;
                    }
                    if (c == 0) {
                        str2 = xmlPullParser.getAttributeValue(i3);
                    } else if (c == 1) {
                        str3 = xmlPullParser.getAttributeValue(i3);
                    } else if (c == 2) {
                        try {
                            i2 = Integer.valueOf(xmlPullParser.getAttributeValue(i3)).intValue();
                        } catch (Exception unused) {
                        }
                    }
                }
                int i4 = m11558i(xmlPullParser);
                if (i4 == 4) {
                    String text = xmlPullParser.getText();
                    if (!TextUtils.isEmpty(text)) {
                        str = text.trim();
                    }
                    if (!URLUtil.isValidUrl(str) || ((bVar.bitrate_mandatory && i2 <= 0) || str2 == null || !str2.trim().equalsIgnoreCase("Progressive"))) {
                        i = i4;
                        z = true;
                    } else {
                        List<String> list = this.f11661c.allowedContentType;
                        if (str3 != null) {
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                if (str3.equalsIgnoreCase(list.get(i5))) {
                                    this.f11660b.f11676a.add(new C5084cq(str, str2, str3, i2));
                                }
                            }
                        }
                    }
                }
                z = true;
            }
            i = m11558i(xmlPullParser);
        }
        if (!z) {
            m11541a((int) ErrorCode.COULD_NOT_FIND_LINEAR_OR_MEDIAFILE_ERROR);
            return false;
        } else if (!this.f11660b.f11676a.isEmpty()) {
            return true;
        } else {
            m11541a((int) ErrorCode.COULD_NOT_FIND_SUPPORTED_MEDIA_FILE_ERROR);
            return false;
        }
    }

    /* renamed from: a */
    private void m11544a(XmlPullParser xmlPullParser, boolean z) {
        int i = m11558i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() == null || !xmlPullParser.getName().equals("VideoClicks") || !m11550b(i)) {
                if (xmlPullParser.getName() != null && !m11550b(i)) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    int hashCode = name.hashCode();
                    if (hashCode != -617879491) {
                        if (hashCode == 2107600959 && name.equals(VideoClicks.CLICK_TRACKING)) {
                            c = 1;
                        }
                    } else if (name.equals(VideoClicks.CLICK_THROUGH)) {
                        c = 0;
                    }
                    if (c != 0) {
                        if (c == 1 && m11558i(xmlPullParser) == 4) {
                            m11546a("click", xmlPullParser.getText());
                        }
                    } else if (z && m11558i(xmlPullParser) == 4) {
                        String text = xmlPullParser.getText();
                        this.f11660b.f11678c = TextUtils.isEmpty(text) ? null : text.trim();
                    }
                }
                i = m11558i(xmlPullParser);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private void m11553d(XmlPullParser xmlPullParser) {
        int i = m11558i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() == null || !xmlPullParser.getName().equals("TrackingEvents") || !m11550b(i)) {
                if (xmlPullParser.getName() != null && C8938Tracking.NAME.equals(xmlPullParser.getName()) && !m11550b(i)) {
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= attributeCount) {
                            break;
                        } else if (xmlPullParser.getAttributeName(i2).equals("event")) {
                            String attributeValue = xmlPullParser.getAttributeValue(i2);
                            if (m11558i(xmlPullParser) == 4 && f11659f.containsKey(attributeValue)) {
                                m11546a(f11659f.get(attributeValue), xmlPullParser.getText());
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                i = m11558i(xmlPullParser);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private void m11554e(XmlPullParser xmlPullParser) {
        String attributeValue;
        int i = m11558i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() == null || !xmlPullParser.getName().equals("Extensions") || !m11550b(i)) {
                if (xmlPullParser.getName() != null && !m11550b(i)) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    int hashCode = name.hashCode();
                    if (hashCode != -1788091386) {
                        if (hashCode == 1391410207 && name.equals(Extension.NAME)) {
                            c = 1;
                        }
                    } else if (name.equals("CompanionAdTracking")) {
                        c = 0;
                    }
                    if (c == 0) {
                        m11555f(xmlPullParser);
                    } else if (c == 1 && (attributeValue = xmlPullParser.getAttributeValue((String) null, "type")) != null && attributeValue.equals("AdVerifications")) {
                        m11556g(xmlPullParser);
                    }
                }
                i = m11558i(xmlPullParser);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private void m11555f(XmlPullParser xmlPullParser) {
        int i = m11558i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() == null || !xmlPullParser.getName().equals("CompanionAdTracking") || !m11550b(i)) {
                if (xmlPullParser.getName() != null && !m11550b(i) && "TrackingEvents".equals(xmlPullParser.getName())) {
                    m11553d(xmlPullParser);
                }
                i = m11558i(xmlPullParser);
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    private void m11556g(XmlPullParser xmlPullParser) {
        String attributeValue;
        int i = m11558i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() == null || !xmlPullParser.getName().equals("AdVerifications") || !m11550b(i)) {
                if (xmlPullParser.getName() != null && !m11550b(i)) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    if (name.hashCode() == -1320080837 && name.equals(Verification.NAME)) {
                        c = 0;
                    }
                    if (c == 0 && (attributeValue = xmlPullParser.getAttributeValue((String) null, Verification.VENDOR)) != null) {
                        if (attributeValue.equals("Moat")) {
                            m11557h(xmlPullParser);
                        } else {
                            m11549b(xmlPullParser, attributeValue);
                        }
                    }
                }
                i = m11558i(xmlPullParser);
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m11557h(XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int i = m11558i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals(Verification.NAME) && m11550b(i)) {
                break;
            }
            if (xmlPullParser.getName() != null && !m11550b(i)) {
                String name = xmlPullParser.getName();
                char c = 65535;
                if (name.hashCode() == 1083804936 && name.equals("ViewableImpression")) {
                    c = 0;
                }
                if (c == 0) {
                    String name2 = xmlPullParser.getName();
                    String name3 = xmlPullParser.getName();
                    int attributeCount = xmlPullParser.getAttributeCount();
                    for (int i2 = 0; i2 < attributeCount; i2++) {
                        sb2.append(' ');
                        sb2.append(xmlPullParser.getAttributeName(i2));
                        sb2.append("=\"");
                        sb2.append(xmlPullParser.getAttributeValue(i2));
                        sb2.append("\"");
                    }
                    do {
                        try {
                            i = xmlPullParser.nextToken();
                        } catch (IOException | XmlPullParserException unused) {
                        }
                        if (i == 4) {
                            sb3.append(xmlPullParser.getText());
                        } else if (i == 5) {
                            sb3.append("<![CDATA[");
                            sb3.append(xmlPullParser.getText());
                            sb3.append("]]>");
                        }
                    } while (!m11550b(i));
                    sb.append("<");
                    sb.append(name2);
                    sb.append(sb2);
                    sb.append(">");
                    sb.append(sb3);
                    sb.append("<");
                    sb.append("/");
                    sb.append(name3);
                    sb.append(">");
                }
            }
            i = m11558i(xmlPullParser);
        }
        if (sb.length() != 0) {
            this.f11660b.mo40357a(new C5030br(sb.toString(), 0, "zMoatVASTIDs", (Map<String, String>) null));
        }
    }

    /* renamed from: b */
    private void m11549b(XmlPullParser xmlPullParser, String str) {
        int i = m11558i(xmlPullParser);
        String str2 = null;
        String str3 = null;
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals(Verification.NAME) && m11550b(i)) {
                break;
            }
            if (xmlPullParser.getName() != null && !m11550b(i)) {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != 1561251035) {
                    if (hashCode == 1749252741 && name.equals(Verification.VERIFICATION_PARAMETERS)) {
                        c = 1;
                    }
                } else if (name.equals("JavaScriptResource")) {
                    c = 0;
                }
                if (c == 0) {
                    String attributeValue = xmlPullParser.getAttributeValue((String) null, "apiFramework");
                    if (attributeValue != null && attributeValue.startsWith(CampaignEx.KEY_OMID) && m11558i(xmlPullParser) == 4) {
                        String text = xmlPullParser.getText();
                        str3 = TextUtils.isEmpty(text) ? null : text.trim();
                    }
                } else if (c == 1 && m11558i(xmlPullParser) == 5) {
                    str2 = TextUtils.isEmpty(xmlPullParser.getText()) ? null : xmlPullParser.getText();
                }
            }
            i = m11558i(xmlPullParser);
        }
        if (URLUtil.isValidUrl(str3)) {
            this.f11660b.mo40357a((C5030br) new C5133ds(str, str2, str3, "OMID_VIEWABILITY", (Map<String, String>) null));
        }
    }

    /* renamed from: i */
    private static int m11558i(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static boolean m11547a(String str, XmlPullParser xmlPullParser) {
        return str.equals(xmlPullParser.getName());
    }

    /* renamed from: a */
    private void m11541a(int i) {
        this.f11660b.f11681f = i;
        m11551c(i);
    }

    /* renamed from: c */
    private void m11551c(int i) {
        C4983ax a = C4983ax.m11340a();
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", String.valueOf(i));
        for (C5030br next : this.f11660b.f11679d) {
            if ("error".equals(next.f11469d)) {
                a.mo40133a(C5328gx.m12268a(next.f11467b, (Map<String, String>) hashMap), next.f11470e, true);
            }
        }
    }

    /* renamed from: a */
    private boolean m11546a(String str, String str2) {
        String trim = TextUtils.isEmpty(str2) ? null : str2.trim();
        if (!URLUtil.isValidUrl(trim)) {
            return !str.equals("Impression");
        }
        this.f11660b.mo40357a(new C5030br(trim, 0, str, (Map<String, String>) null));
        return true;
    }
}
