package com.p243my.target;

import android.text.TextUtils;
import android.util.Xml;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p243my.target.C7685u1;
import com.p243my.target.common.models.AudioData;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.VideoClicks;
import com.tapjoy.TJAdUnitConstants;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.my.target.i4 */
public class C7455i4<T extends C7685u1> {

    /* renamed from: a */
    public static final String[] f18737a = {"video/mp4", "application/vnd.apple.mpegurl", "application/x-mpegurl"};

    /* renamed from: b */
    public static final String[] f18738b = {"AdVerifications", "linkTxt"};

    /* renamed from: c */
    public final C7298a f18739c;

    /* renamed from: d */
    public final C7617q1 f18740d;

    /* renamed from: e */
    public final ArrayList<C7328b3> f18741e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<C7303a3> f18742f = new ArrayList<>();

    /* renamed from: g */
    public final ArrayList<C7302a2> f18743g = new ArrayList<>();

    /* renamed from: h */
    public final ArrayList<C7328b3> f18744h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<C7413g2<T>> f18745i = new ArrayList<>();

    /* renamed from: j */
    public boolean f18746j;

    /* renamed from: k */
    public String f18747k;

    /* renamed from: l */
    public C7617q1 f18748l;

    /* renamed from: m */
    public C7581o2 f18749m;

    public C7455i4(C7298a aVar, C7617q1 q1Var) {
        this.f18739c = aVar;
        this.f18740d = q1Var;
        this.f18749m = q1Var.mo51405p();
    }

    /* renamed from: a */
    public static <T extends C7685u1> C7455i4<T> m19333a(C7298a aVar, C7617q1 q1Var) {
        return new C7455i4<>(aVar, q1Var);
    }

    /* renamed from: a */
    public static String m19334a(String str) {
        return str.replaceAll("&amp;", "&").replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
    }

    /* renamed from: a */
    public static String m19335a(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue((String) null, str);
    }

    /* renamed from: j */
    public static int m19336j(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType();
        } catch (Throwable th) {
            C7374e0.m18989a(th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: k */
    public static int m19337k(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (Throwable th) {
            C7374e0.m18989a(th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: l */
    public static int m19338l(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (Throwable th) {
            C7374e0.m18989a(th.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: m */
    public static String m19339m(XmlPullParser xmlPullParser) {
        String str;
        if (m19337k(xmlPullParser) == 4) {
            str = xmlPullParser.getText();
            m19338l(xmlPullParser);
        } else {
            C7374e0.m18989a("No text: " + xmlPullParser.getName());
            str = "";
        }
        return str.trim();
    }

    /* renamed from: n */
    public static void m19340n(XmlPullParser xmlPullParser) {
        if (m19336j(xmlPullParser) == 2) {
            int i = 1;
            while (i != 0) {
                int k = m19337k(xmlPullParser);
                if (k == 2) {
                    i++;
                } else if (k == 3) {
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50362a() {
        ArrayList<C7328b3> n = this.f18740d.mo51403n();
        if (n != null) {
            this.f18741e.addAll(n);
        }
        ArrayList<C7302a2> i = this.f18740d.mo51398i();
        if (i != null) {
            this.f18743g.addAll(i);
        }
    }

    /* renamed from: a */
    public final void mo50363a(float f, String str, C7768z1 z1Var) {
        C7303a3 a = C7303a3.m18693a(str);
        if (z1Var == null || z1Var.getDuration() <= 0.0f) {
            a.mo49572a(f);
            this.f18742f.add(a);
            return;
        }
        a.mo49573b(z1Var.getDuration() * (f / 100.0f));
        z1Var.getStatHolder().mo49801a((C7328b3) a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50364a(com.p243my.target.C7413g2 r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x0064
            java.lang.String r0 = "%"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r5.length()
            int r0 = r0 + -1
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Linear skipoffset is "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " [%]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.p243my.target.C7374e0.m18989a(r5)
            float r5 = r4.getDuration()
            r1 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r1
            float r0 = (float) r0
            float r5 = r5 * r0
            goto L_0x0066
        L_0x003d:
            java.lang.String r0 = ":"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0064
            float r5 = r3.mo50374b((java.lang.String) r5)     // Catch:{ all -> 0x004a }
            goto L_0x0066
        L_0x004a:
            java.lang.String r0 = r4.getId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to convert ISO time skipoffset string "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "Bad value"
            r3.mo50366a((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r5)
        L_0x0064:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0066:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            r4.setAllowCloseDelay(r5)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7455i4.mo50364a(com.my.target.g2, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo50365a(String str, String str2, C7768z1 z1Var) {
        float f;
        try {
            f = mo50374b(str);
        } catch (Throwable unused) {
            f = -1.0f;
        }
        if (f >= 0.0f) {
            C7303a3 a = C7303a3.m18693a(str2);
            a.mo49573b(f);
            if (z1Var != null) {
                z1Var.getStatHolder().mo49801a((C7328b3) a);
            } else {
                this.f18744h.add(a);
            }
        } else {
            C7374e0.m18989a("Unable to parse progress stat with value " + str);
        }
    }

    /* renamed from: a */
    public final void mo50366a(String str, String str2, String str3) {
        C7374e0.m18989a("Vast parser error " + str2 + " with banner Id " + str + ": " + str3);
    }

    /* renamed from: a */
    public final void mo50367a(XmlPullParser xmlPullParser) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Wrapper".equals(name)) {
                    this.f18746j = true;
                    C7374e0.m18989a("VAST file contains wrapped ad information.");
                    int v = this.f18740d.mo51411v();
                    if (v < 5) {
                        mo50368a(xmlPullParser, v);
                    } else {
                        C7374e0.m18989a("got VAST wrapper, but max redirects limit exceeded");
                    }
                } else if ("InLine".equals(name)) {
                    this.f18746j = false;
                    C7374e0.m18989a("VAST file contains inline ad information.");
                    mo50391g(xmlPullParser);
                }
                m19340n(xmlPullParser);
            }
        }
    }

    /* renamed from: a */
    public final void mo50368a(XmlPullParser xmlPullParser, int i) {
        String str = null;
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    mo50390f(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    mo50383c(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    mo50388e(xmlPullParser);
                } else if ("VASTAdTagURI".equals(name)) {
                    str = m19339m(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    mo50377b(xmlPullParser);
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
        if (str != null) {
            String j = this.f18740d.mo51399j();
            C7617q1 b = C7617q1.m20130b(str);
            this.f18748l = b;
            b.mo51387d(i + 1);
            this.f18748l.mo51384c(this.f18741e);
            this.f18748l.mo51367a(this.f18749m);
            C7617q1 q1Var = this.f18748l;
            if (TextUtils.isEmpty(j)) {
                j = this.f18747k;
            }
            q1Var.mo51383c(j);
            this.f18748l.mo51377b(this.f18743g);
            this.f18748l.mo51369a(this.f18740d.mo51362a());
            this.f18748l.mo51376b(this.f18740d.mo51379c());
            this.f18748l.mo51388d(this.f18740d.mo51390e());
            this.f18748l.mo51391e(this.f18740d.mo51392f());
            this.f18748l.mo51393f(this.f18740d.mo51394g());
            this.f18748l.mo51395g(this.f18740d.mo51400k());
            this.f18748l.mo51397h(this.f18740d.mo51407r());
            this.f18748l.mo51364a(this.f18740d.mo51372b());
            this.f18748l.mo51382c(this.f18740d.mo51386d());
            C7343c3 h = this.f18748l.mo51396h();
            h.mo49804a((List<C7328b3>) this.f18744h);
            h.mo49803a(this.f18742f);
            h.mo49802a(this.f18740d.mo51396h(), -1.0f);
            this.f18740d.mo51368a(this.f18748l);
            return;
        }
        C7374e0.m18989a("got VAST wrapper, but no vastAdTagUri");
    }

    /* renamed from: a */
    public final void mo50369a(XmlPullParser xmlPullParser, C7413g2 g2Var, String str) {
        while (m19338l(xmlPullParser) == 2) {
            String name = xmlPullParser.getName();
            if (m19336j(xmlPullParser) == 2) {
                if (Linear.DURATION.equals(name)) {
                    if (g2Var == null) {
                        continue;
                    } else if (mo50373a(xmlPullParser, g2Var)) {
                        mo50364a(g2Var, str);
                    } else {
                        return;
                    }
                } else if ("TrackingEvents".equals(name)) {
                    mo50370a(xmlPullParser, (C7768z1) g2Var);
                } else if (Linear.MEDIA_FILES.equals(name)) {
                    if (g2Var == null) {
                        continue;
                    } else {
                        mo50378b(xmlPullParser, g2Var);
                        if (g2Var.getMediaData() == null) {
                            C7374e0.m18989a("Unable to find valid mediafile!");
                            return;
                        }
                    }
                } else if ("VideoClicks".equals(name)) {
                    mo50384c(xmlPullParser, g2Var);
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50370a(XmlPullParser xmlPullParser, C7768z1 z1Var) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                if (C8938Tracking.NAME.equals(xmlPullParser.getName())) {
                    String a = m19335a("event", xmlPullParser);
                    String a2 = m19335a("offset", xmlPullParser);
                    if (a != null) {
                        if (!NotificationCompat.CATEGORY_PROGRESS.equals(a) || TextUtils.isEmpty(a2)) {
                            mo50382c(a, m19339m(xmlPullParser), z1Var);
                        } else if (a2.endsWith("%")) {
                            try {
                                mo50363a((float) Integer.parseInt(a2.replace("%", "")), m19339m(xmlPullParser), z1Var);
                            } catch (Throwable unused) {
                                C7374e0.m18989a("Unable to parse progress stat with value " + a2);
                            }
                        } else {
                            mo50365a(a2, m19339m(xmlPullParser), z1Var);
                        }
                    }
                    C7374e0.m18989a("Added VAST tracking \"" + a + "\"");
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.my.target.g2} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50371a(org.xmlpull.v1.XmlPullParser r5, java.lang.String r6) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = m19338l(r5)
            r1 = 2
            if (r0 != r1) goto L_0x00ab
            int r0 = m19336j(r5)
            if (r0 == r1) goto L_0x000e
            goto L_0x0000
        L_0x000e:
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "Linear"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L_0x005f
            boolean r0 = r4.f18746j
            if (r0 != 0) goto L_0x002c
            com.my.target.g2 r2 = com.p243my.target.C7413g2.newBanner()
            if (r6 == 0) goto L_0x0027
            r0 = r6
            goto L_0x0029
        L_0x0027:
            java.lang.String r0 = ""
        L_0x0029:
            r2.setId(r0)
        L_0x002c:
            java.lang.String r0 = "skipoffset"
            java.lang.String r0 = m19335a((java.lang.String) r0, (org.xmlpull.v1.XmlPullParser) r5)
            r4.mo50369a((org.xmlpull.v1.XmlPullParser) r5, (com.p243my.target.C7413g2) r2, (java.lang.String) r0)
            if (r2 == 0) goto L_0x0000
            float r0 = r2.getDuration()
            r1 = 0
            java.lang.String r3 = "Required field"
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            com.my.target.u1 r0 = r2.getMediaData()
            if (r0 == 0) goto L_0x004e
            java.util.ArrayList<com.my.target.g2<T>> r0 = r4.f18745i
            r0.add(r2)
            goto L_0x0000
        L_0x004e:
            java.lang.String r0 = r2.getId()
            java.lang.String r1 = "VAST has no valid mediaData"
            goto L_0x005b
        L_0x0055:
            java.lang.String r0 = r2.getId()
            java.lang.String r1 = "VAST has no valid Duration"
        L_0x005b:
            r4.mo50366a((java.lang.String) r0, (java.lang.String) r3, (java.lang.String) r1)
            goto L_0x0000
        L_0x005f:
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "CompanionAds"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "required"
            java.lang.String r0 = m19335a((java.lang.String) r0, (org.xmlpull.v1.XmlPullParser) r5)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = "all"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = "any"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = "none"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Wrong companion required attribute:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Bad value"
            r4.mo50366a((java.lang.String) r6, (java.lang.String) r1, (java.lang.String) r0)
            goto L_0x00a1
        L_0x00a0:
            r2 = r0
        L_0x00a1:
            r4.mo50379b((org.xmlpull.v1.XmlPullParser) r5, (java.lang.String) r6, (java.lang.String) r2)
            goto L_0x0000
        L_0x00a6:
            m19340n(r5)
            goto L_0x0000
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7455i4.mo50371a(org.xmlpull.v1.XmlPullParser, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo50372a(XmlPullParser xmlPullParser, String str, String str2) {
        if (m19336j(xmlPullParser) == 2) {
            String name = xmlPullParser.getName();
            if (name == null || !name.equals("Companion")) {
                m19340n(xmlPullParser);
                return;
            }
            String a = m19335a("width", xmlPullParser);
            String a2 = m19335a("height", xmlPullParser);
            String a3 = m19335a("id", xmlPullParser);
            C7302a2 newBanner = C7302a2.newBanner();
            if (a3 == null) {
                a3 = "";
            }
            newBanner.setId(a3);
            try {
                newBanner.setWidth(Integer.parseInt(a));
                newBanner.setHeight(Integer.parseInt(a2));
            } catch (Throwable unused) {
                mo50366a(str, "Bad value", "Unable  to convert required companion attributes, width = " + a + " height = " + a2);
            }
            newBanner.setRequired(str2);
            String a4 = m19335a(Companion.ASSET_WIDTH, xmlPullParser);
            String a5 = m19335a(Companion.ASSET_HEIGHT, xmlPullParser);
            try {
                if (!TextUtils.isEmpty(a4)) {
                    newBanner.setAssetWidth(Integer.parseInt(a4));
                }
                if (!TextUtils.isEmpty(a5)) {
                    newBanner.setAssetHeight(Integer.parseInt(a5));
                }
            } catch (Throwable th) {
                C7374e0.m18989a("wrong VAST asset dimensions: " + th.getMessage());
            }
            String a6 = m19335a(Companion.EXPANDED_WIDTH, xmlPullParser);
            String a7 = m19335a(Companion.EXPANDED_HEIGHT, xmlPullParser);
            try {
                if (!TextUtils.isEmpty(a6)) {
                    newBanner.setExpandedWidth(Integer.parseInt(a6));
                }
                if (!TextUtils.isEmpty(a7)) {
                    newBanner.setExpandedHeight(Integer.parseInt(a7));
                }
            } catch (Throwable th2) {
                C7374e0.m18989a("wrong VAST expanded dimensions " + th2.getMessage());
            }
            newBanner.setAdSlotID(m19335a(Companion.AD_SLOT_ID, xmlPullParser));
            newBanner.setApiFramework(m19335a("apiFramework", xmlPullParser));
            this.f18743g.add(newBanner);
            while (m19338l(xmlPullParser) == 2) {
                String name2 = xmlPullParser.getName();
                if ("StaticResource".equals(name2)) {
                    newBanner.setStaticResource(C7784z8.m21026a(m19339m(xmlPullParser)));
                } else if ("HTMLResource".equals(name2)) {
                    newBanner.setHtmlResource(C7784z8.m21026a(m19339m(xmlPullParser)));
                } else if ("IFrameResource".equals(name2)) {
                    newBanner.setIframeResource(C7784z8.m21026a(m19339m(xmlPullParser)));
                } else if (Companion.COMPANION_CLICK_THROUGH.equals(name2)) {
                    String m = m19339m(xmlPullParser);
                    if (!TextUtils.isEmpty(m)) {
                        newBanner.setTrackingLink(m19334a(m));
                    }
                } else if (Companion.COMPANION_CLICK_TRACKING.equals(name2)) {
                    String m2 = m19339m(xmlPullParser);
                    if (!TextUtils.isEmpty(m2)) {
                        newBanner.getStatHolder().mo49801a(C7328b3.m18775a("click", m2));
                    }
                } else if ("TrackingEvents".equals(name2)) {
                    mo50370a(xmlPullParser, (C7768z1) newBanner);
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo50373a(XmlPullParser xmlPullParser, C7413g2 g2Var) {
        float f;
        try {
            f = mo50374b(m19339m(xmlPullParser));
        } catch (Throwable unused) {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            return false;
        }
        g2Var.setDuration(f);
        return true;
    }

    /* renamed from: b */
    public float mo50374b(String str) {
        long j;
        String str2 = str;
        try {
            if (str2.contains(".")) {
                int indexOf = str2.indexOf(".");
                j = Long.parseLong(str2.substring(indexOf + 1));
                if (j > 1000) {
                    return -1.0f;
                }
                str2 = str2.substring(0, indexOf);
            } else {
                j = 0;
            }
            String[] split = str2.split(CertificateUtil.DELIMITER, 3);
            long parseInt = (long) Integer.parseInt(split[0]);
            long parseInt2 = (long) Integer.parseInt(split[1]);
            long parseInt3 = (long) Integer.parseInt(split[2]);
            if (parseInt >= 24 || parseInt2 >= 60 || parseInt3 >= 60) {
                return -1.0f;
            }
            Long.signum(parseInt3);
            return ((float) (((j + (parseInt3 * 1000)) + (parseInt2 * 60000)) + (parseInt * 3600000))) / 1000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    /* renamed from: b */
    public final void mo50375b() {
        for (int i = 0; i < this.f18745i.size(); i++) {
            C7413g2 g2Var = this.f18745i.get(i);
            C7343c3 statHolder = g2Var.getStatHolder();
            statHolder.mo49802a(this.f18740d.mo51396h(), g2Var.getDuration());
            String j = this.f18740d.mo51399j();
            if (TextUtils.isEmpty(j)) {
                j = this.f18747k;
            }
            g2Var.setCtaText(j);
            Iterator<C7303a3> it = this.f18742f.iterator();
            while (it.hasNext()) {
                C7303a3 next = it.next();
                mo50363a(next.mo49574d(), next.mo49729b(), (C7768z1) g2Var);
            }
            statHolder.mo49804a((List<C7328b3>) this.f18744h);
            Iterator<C7302a2> it2 = this.f18743g.iterator();
            while (it2.hasNext()) {
                g2Var.addCompanion(it2.next());
            }
            if (i == 0) {
                statHolder.mo49804a((List<C7328b3>) this.f18741e);
            }
            g2Var.setOmData(this.f18749m);
        }
    }

    /* renamed from: b */
    public final void mo50376b(String str, String str2, C7768z1 z1Var) {
        if (z1Var != null) {
            z1Var.getStatHolder().mo49801a(C7328b3.m18775a(str, str2));
            return;
        }
        this.f18744h.add(C7328b3.m18775a(str, str2));
    }

    /* renamed from: b */
    public final void mo50377b(XmlPullParser xmlPullParser) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                if (Verification.NAME.equals(xmlPullParser.getName())) {
                    mo50393i(xmlPullParser);
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo50378b(XmlPullParser xmlPullParser, C7413g2 g2Var) {
        if ("instreamads".equals(this.f18739c.getFormat()) || "fullscreen".equals(this.f18739c.getFormat()) || "rewarded".equals(this.f18739c.getFormat())) {
            mo50389e(xmlPullParser, g2Var);
        } else if ("instreamaudioads".equals(this.f18739c.getFormat())) {
            mo50387d(xmlPullParser, g2Var);
        }
    }

    /* renamed from: b */
    public final void mo50379b(XmlPullParser xmlPullParser, String str, String str2) {
        while (m19338l(xmlPullParser) == 2) {
            mo50372a(xmlPullParser, str, str2);
        }
    }

    /* renamed from: c */
    public ArrayList<C7413g2<T>> mo50380c() {
        return this.f18745i;
    }

    /* renamed from: c */
    public void mo50381c(String str) {
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(new StringReader(str));
            mo50362a();
            int j = m19336j(newPullParser);
            while (j != 1 && j != Integer.MIN_VALUE) {
                if (j == 2 && VastTree.VAST.equalsIgnoreCase(newPullParser.getName())) {
                    mo50392h(newPullParser);
                }
                j = m19337k(newPullParser);
            }
        } catch (Throwable th) {
            C7374e0.m18989a("Unable to parse VAST: " + th.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo50382c(String str, String str2, C7768z1 z1Var) {
        float f;
        String str3 = "error";
        if (!"start".equalsIgnoreCase(str)) {
            if (TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE.equalsIgnoreCase(str)) {
                f = 25.0f;
            } else if ("midpoint".equalsIgnoreCase(str)) {
                f = 50.0f;
            } else if (TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE.equalsIgnoreCase(str)) {
                f = 75.0f;
            } else if ("complete".equalsIgnoreCase(str)) {
                f = 100.0f;
            } else if (!"creativeView".equalsIgnoreCase(str)) {
                if ("mute".equalsIgnoreCase(str)) {
                    str3 = "volumeOff";
                } else if ("unmute".equalsIgnoreCase(str)) {
                    str3 = "volumeOn";
                } else if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equalsIgnoreCase(str)) {
                    str3 = "playbackPaused";
                } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equalsIgnoreCase(str)) {
                    str3 = "playbackResumed";
                } else if ("fullscreen".equalsIgnoreCase(str)) {
                    str3 = "fullscreenOn";
                } else if ("exitFullscreen".equalsIgnoreCase(str)) {
                    str3 = "fullscreenOff";
                } else {
                    if (!"skip".equalsIgnoreCase(str)) {
                        if (!str3.equalsIgnoreCase(str)) {
                            if (VideoClicks.CLICK_TRACKING.equalsIgnoreCase(str)) {
                                str3 = "click";
                            } else if (!"close".equalsIgnoreCase(str) && !"closeLinear".equalsIgnoreCase(str)) {
                                return;
                            }
                        }
                    }
                    str3 = "closedByUser";
                }
                mo50376b(str3, str2, z1Var);
            }
            mo50363a(f, str2, z1Var);
            return;
        }
        str3 = "playbackStarted";
        mo50376b(str3, str2, z1Var);
    }

    /* renamed from: c */
    public final void mo50383c(XmlPullParser xmlPullParser) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                if (Creative.NAME.equals(xmlPullParser.getName())) {
                    mo50371a(xmlPullParser, m19335a("id", xmlPullParser));
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo50384c(XmlPullParser xmlPullParser, C7413g2 g2Var) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if (VideoClicks.CLICK_THROUGH.equals(name)) {
                    if (g2Var != null) {
                        String m = m19339m(xmlPullParser);
                        if (!TextUtils.isEmpty(m)) {
                            g2Var.setTrackingLink(m19334a(m));
                        }
                    }
                } else if (VideoClicks.CLICK_TRACKING.equals(name)) {
                    String m2 = m19339m(xmlPullParser);
                    if (!TextUtils.isEmpty(m2)) {
                        this.f18744h.add(C7328b3.m18775a("click", m2));
                    }
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: d */
    public C7617q1 mo50385d() {
        return this.f18748l;
    }

    /* renamed from: d */
    public final void mo50386d(XmlPullParser xmlPullParser) {
        String a = m19335a("type", xmlPullParser);
        if (a == null || Arrays.binarySearch(f18738b, a) < 0) {
            m19340n(xmlPullParser);
        } else if ("linkTxt".equals(a)) {
            String m = m19339m(xmlPullParser);
            this.f18747k = C7784z8.m21026a(m);
            C7374e0.m18989a("VAST linkTxt raw text: " + m);
            m19340n(xmlPullParser);
        } else {
            while (m19338l(xmlPullParser) == 2) {
                if (m19336j(xmlPullParser) == 2) {
                    if ("AdVerifications".equals(xmlPullParser.getName())) {
                        mo50377b(xmlPullParser);
                    } else {
                        m19340n(xmlPullParser);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo50387d(XmlPullParser xmlPullParser, C7413g2<AudioData> g2Var) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                if (MediaFile.NAME.equals(xmlPullParser.getName())) {
                    String a = m19335a("type", xmlPullParser);
                    String a2 = m19335a(MediaFile.BITRATE, xmlPullParser);
                    String a3 = m19334a(m19339m(xmlPullParser));
                    AudioData audioData = null;
                    if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(a3) && a.toLowerCase(Locale.ROOT).trim().startsWith("audio")) {
                        int i = 0;
                        if (a2 != null) {
                            try {
                                i = Integer.parseInt(a2);
                            } catch (Throwable unused) {
                            }
                        }
                        AudioData newAudioData = AudioData.newAudioData(a3);
                        newAudioData.setBitrate(i);
                        audioData = newAudioData;
                    }
                    if (audioData == null) {
                        C7374e0.m18989a("Skipping unsupported VAST file (mimetype=" + a + ",url=" + a3);
                    } else {
                        g2Var.setMediaData(audioData);
                    }
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo50388e(XmlPullParser xmlPullParser) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                if (Extension.NAME.equals(xmlPullParser.getName())) {
                    mo50386d(xmlPullParser);
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50389e(org.xmlpull.v1.XmlPullParser r13, com.p243my.target.C7413g2<com.p243my.target.common.models.VideoData> r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            int r1 = m19338l(r13)
            r2 = 2
            if (r1 != r2) goto L_0x00bf
            int r1 = m19336j(r13)
            if (r1 == r2) goto L_0x0013
            goto L_0x0005
        L_0x0013:
            java.lang.String r1 = r13.getName()
            java.lang.String r2 = "MediaFile"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00ba
            java.lang.String r1 = "type"
            java.lang.String r1 = m19335a((java.lang.String) r1, (org.xmlpull.v1.XmlPullParser) r13)
            java.lang.String r2 = "bitrate"
            java.lang.String r2 = m19335a((java.lang.String) r2, (org.xmlpull.v1.XmlPullParser) r13)
            java.lang.String r3 = "width"
            java.lang.String r3 = m19335a((java.lang.String) r3, (org.xmlpull.v1.XmlPullParser) r13)
            java.lang.String r4 = "height"
            java.lang.String r4 = m19335a((java.lang.String) r4, (org.xmlpull.v1.XmlPullParser) r13)
            java.lang.String r5 = m19339m(r13)
            java.lang.String r5 = m19334a((java.lang.String) r5)
            r6 = 0
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 != 0) goto L_0x0085
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x0085
            java.lang.String[] r7 = f18737a
            int r8 = r7.length
            r9 = 0
            r10 = 0
        L_0x0051:
            if (r10 >= r8) goto L_0x0085
            r11 = r7[r10]
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x0082
            if (r3 == 0) goto L_0x0065
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r7 = 0
        L_0x0063:
            r8 = 0
            goto L_0x0076
        L_0x0065:
            r7 = 0
        L_0x0066:
            if (r4 == 0) goto L_0x006d
            int r8 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0063 }
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r2 == 0) goto L_0x0076
            int r9 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0075 }
            goto L_0x0076
        L_0x0075:
        L_0x0076:
            if (r7 <= 0) goto L_0x0085
            if (r8 <= 0) goto L_0x0085
            com.my.target.common.models.VideoData r6 = com.p243my.target.common.models.VideoData.newVideoData(r5, r7, r8)
            r6.setBitrate(r9)
            goto L_0x0085
        L_0x0082:
            int r10 = r10 + 1
            goto L_0x0051
        L_0x0085:
            if (r6 != 0) goto L_0x00b5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skipping unsupported VAST file (mimeType="
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = ",width="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ",height="
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = ",url="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            com.p243my.target.C7374e0.m18989a(r1)
            goto L_0x0005
        L_0x00b5:
            r0.add(r6)
            goto L_0x0005
        L_0x00ba:
            m19340n(r13)
            goto L_0x0005
        L_0x00bf:
            com.my.target.a r13 = r12.f18739c
            int r13 = r13.getVideoQuality()
            com.my.target.common.models.VideoData r13 = com.p243my.target.common.models.VideoData.chooseBest(r0, r13)
            r14.setMediaData(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7455i4.mo50389e(org.xmlpull.v1.XmlPullParser, com.my.target.g2):void");
    }

    /* renamed from: f */
    public final void mo50390f(XmlPullParser xmlPullParser) {
        String m = m19339m(xmlPullParser);
        if (!TextUtils.isEmpty(m)) {
            this.f18741e.add(C7328b3.m18775a("playbackStarted", m));
            C7374e0.m18989a("Impression tracker url for wrapper: " + m);
        }
    }

    /* renamed from: g */
    public final void mo50391g(XmlPullParser xmlPullParser) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("Impression".equals(name)) {
                    mo50390f(xmlPullParser);
                } else if ("Creatives".equals(name)) {
                    mo50383c(xmlPullParser);
                } else if ("Extensions".equals(name)) {
                    mo50388e(xmlPullParser);
                } else if ("AdVerifications".equals(name)) {
                    mo50377b(xmlPullParser);
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
        mo50375b();
    }

    /* renamed from: h */
    public final void mo50392h(XmlPullParser xmlPullParser) {
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2 && "Ad".equals(xmlPullParser.getName())) {
                mo50367a(xmlPullParser);
            }
        }
    }

    /* renamed from: i */
    public final void mo50393i(XmlPullParser xmlPullParser) {
        String a = m19335a(Verification.VENDOR, xmlPullParser);
        String str = null;
        String str2 = null;
        while (m19338l(xmlPullParser) == 2) {
            if (m19336j(xmlPullParser) == 2) {
                String name = xmlPullParser.getName();
                if ("JavaScriptResource".equals(name)) {
                    str = m19339m(xmlPullParser);
                } else if (Verification.VERIFICATION_PARAMETERS.equals(name)) {
                    str2 = m19339m(xmlPullParser);
                } else {
                    m19340n(xmlPullParser);
                }
            }
        }
        if (str != null) {
            if (this.f18749m == null) {
                this.f18749m = C7581o2.m19997a((String) null, (String) null);
            }
            this.f18749m.f19125c.add((TextUtils.isEmpty(a) || TextUtils.isEmpty(str2)) ? C7598p2.m20062a(str) : C7598p2.m20063a(str, a, str2));
        }
    }
}
