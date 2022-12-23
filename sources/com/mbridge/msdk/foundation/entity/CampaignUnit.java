package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6348l;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class CampaignUnit implements NoProGuard, Serializable {
    public static final String JSON_KEY_ADS = "ads";
    public static final String JSON_KEY_AD_HTML = "cam_html";
    public static final String JSON_KEY_AD_TYPE = "ad_type";
    public static final String JSON_KEY_AD_ZIP = "cam_tpl_url";
    public static final String JSON_KEY_BANNER_HTML = "cam_html";
    public static final String JSON_KEY_BANNER_URL = "cam_tpl_url";
    public static final String JSON_KEY_CSP = "csp";
    public static final String JSON_KEY_DO = "do";
    public static final String JSON_KEY_END_SCREEN_URL = "end_screen_url";
    public static final String JSON_KEY_FRAME_ADS = "frames";
    public static final String JSON_KEY_HTML_URL = "html_url";
    public static final String JSON_KEY_IA_EXT1 = "ia_all_ext1";
    public static final String JSON_KEY_IA_EXT2 = "ia_all_ext2";
    public static final String JSON_KEY_IA_ICON = "ia_icon";
    public static final String JSON_KEY_IA_ORI = "ia_ori";
    public static final String JSON_KEY_IA_RST = "ia_rst";
    public static final String JSON_KEY_IA_URL = "ia_url";
    public static final String JSON_KEY_JM_DO = "jm_do";
    public static final String JSON_KEY_MOF_TEMPLATE_URL = "mof_template_url";
    public static final String JSON_KEY_MOF_TPLID = "mof_tplid";
    public static final String JSON_KEY_NSCPT = "nscpt";
    public static final String JSON_KEY_ONLY_IMPRESSION_URL = "only_impression_url";
    public static final String JSON_KEY_PARENT_SESSION_ID = "parent_session_id";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_REPLACE_TMP = "replace_tmp";
    public static final String JSON_KEY_REQ_EXT_DATA = "req_ext_data";
    public static final String JSON_KEY_RKS = "rks";
    public static final String JSON_KEY_SESSION_ID = "a";
    public static final String JSON_KEY_SH = "sh";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_UNIT_SIZE = "unit_size";
    public static final String JSON_KEY_VCN = "vcn";
    private static final String TAG = CampaignUnit.class.getSimpleName();
    private static final long serialVersionUID = 1;
    private String adHtml;
    private int adType;
    private String adZip;
    public ArrayList<CampaignEx> ads;
    private String bannerHtml;
    private String bannerUrl;
    private StringBuffer cParams = new StringBuffer();
    private String csp;
    private String domain;
    private String htmlUrl;
    private String ia_all_ext1;
    private String ia_all_ext2;
    private String ia_icon;
    private int ia_ori;
    private int ia_rst;
    private String ia_url;
    private int jmDo;
    private List<Frame> listFrames;
    private String msg = "";
    private String onlyImpressionUrl;
    private String parentSessionId;
    private String requestId;
    private HashMap<String, String> rks;
    private String sessionId;

    /* renamed from: sh */
    private String f15268sh;
    private int template;
    private String unitSize;
    private int vcn;

    private Object nullToEmpty(Object obj) {
        return obj == null ? "" : obj;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public void setAdZip(String str) {
        this.adZip = str;
    }

    public String getAdHtml() {
        return this.adHtml;
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public String getIa_icon() {
        return this.ia_icon;
    }

    public void setIa_icon(String str) {
        this.ia_icon = str;
    }

    public int getIa_rst() {
        return this.ia_rst;
    }

    public void setIa_rst(int i) {
        this.ia_rst = i;
    }

    public String getIa_url() {
        return this.ia_url;
    }

    public void setIa_url(String str) {
        this.ia_url = str;
    }

    public int getIa_ori() {
        return this.ia_ori;
    }

    public void setIa_ori(int i) {
        this.ia_ori = i;
    }

    public String getIa_all_ext1() {
        return this.ia_all_ext1;
    }

    public void setIa_all_ext1(String str) {
        this.ia_all_ext1 = str;
    }

    public String getIa_all_ext2() {
        return this.ia_all_ext2;
    }

    public void setIa_all_ext2(String str) {
        this.ia_all_ext2 = str;
    }

    public HashMap<String, String> getRks() {
        return this.rks;
    }

    public void setRks(HashMap<String, String> hashMap) {
        this.rks = hashMap;
    }

    public String getCsp() {
        return this.csp;
    }

    public void setCsp(String str) {
        this.csp = str;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public int getVcn() {
        int i = this.vcn;
        if (i > 1) {
            return i;
        }
        return 1;
    }

    public void setVcn(int i) {
        this.vcn = i;
    }

    public String getSh() {
        return this.f15268sh;
    }

    public void setSh(String str) {
        this.f15268sh = str;
    }

    public int getJmDo() {
        return this.jmDo;
    }

    public void setJmDo(int i) {
        this.jmDo = i;
    }

    public List<Frame> getListFrames() {
        return this.listFrames;
    }

    public void setListFrames(List<Frame> list) {
        this.listFrames = list;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public int getAdType() {
        return this.adType;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public String getUnitSize() {
        return this.unitSize;
    }

    public void setUnitSize(String str) {
        this.unitSize = str;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public String getOnlyImpressionUrl() {
        return this.onlyImpressionUrl;
    }

    public void setOnlyImpressionUrl(String str) {
        this.onlyImpressionUrl = str;
    }

    public ArrayList<CampaignEx> getAds() {
        return this.ads;
    }

    public void setAds(ArrayList<CampaignEx> arrayList) {
        this.ads = arrayList;
    }

    public int getTemplate() {
        return this.template;
    }

    public void setTemplate(int i) {
        this.template = i;
    }

    public String assembCParams() {
        String str;
        String str2;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String i = C6349m.m16113i();
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                str2 = String.valueOf(C6349m.m16123n(C6122a.m15302b().mo42895d()));
                str = C6349m.m16111h(C6122a.m15302b().mo42895d()) + "x" + C6349m.m16112i(C6122a.m15302b().mo42895d());
            } else {
                str2 = "";
                str = str2;
            }
            StringBuffer stringBuffer2 = this.cParams;
            stringBuffer2.append(getAdType());
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty("1"));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Build.VERSION.RELEASE));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(MBConfiguration.SDK_VERSION));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C6349m.m16091a()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(str));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Integer.valueOf(C6349m.m16102d(C6122a.m15302b().mo42895d()))));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C6349m.m16100c(C6122a.m15302b().mo42895d())));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(str2));
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(i));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C6349m.m16099c()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append("");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(C6204a.f15401k + "," + C6204a.f15402l));
            stringBuffer2.append("|");
            this.cParams = stringBuffer2;
        } catch (Throwable th) {
            C6361q.m16155a(TAG, th.getMessage(), th);
        }
        return this.cParams.toString();
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject) {
        return parseV5CampaignUnit(jSONObject, "");
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject, String str) {
        return parseCampaignUnit(jSONObject, str);
    }

    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject) {
        return parseCampaignUnit(jSONObject, "");
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (TextUtils.isEmpty(this.onlyImpressionUrl)) {
                return "";
            }
            Uri parse = Uri.parse(this.onlyImpressionUrl);
            if (parse != null) {
                this.requestId = parse.getQueryParameter(CampaignEx.JSON_KEY_AD_K);
            }
            return this.requestId;
        } catch (Exception unused) {
            return "";
        }
    }

    private static void getSysIDAndBKUPID(JSONObject jSONObject) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            if (jSONObject != null && d != null) {
                String optString = jSONObject.optString("b");
                if (!TextUtils.isEmpty(optString)) {
                    if (!TextUtils.equals(C6204a.f15401k, optString)) {
                        C6204a.f15401k = optString;
                        C6121a.m15293a().mo42880a("b", C6204a.f15401k);
                        SharedPreferences sharedPreferences = d.getSharedPreferences(C6348l.m16089b("H+tU+FeXHM=="), 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(C6348l.m16089b("H+tU+bfPhM=="), C6204a.f15401k);
                            edit.apply();
                        }
                    }
                }
                String optString2 = jSONObject.optString(Constants.URL_CAMPAIGN);
                if (!TextUtils.isEmpty(optString2) && !TextUtils.equals(C6204a.f15402l, optString2)) {
                    C6204a.f15402l = optString2;
                    C6121a.m15293a().mo42880a(Constants.URL_CAMPAIGN, C6204a.f15402l);
                    SharedPreferences sharedPreferences2 = d.getSharedPreferences(C6348l.m16089b("H+tU+FeXHM=="), 0);
                    if (sharedPreferences2 != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.putString(C6348l.m16089b("H+tU+Fz8"), C6204a.f15402l);
                        edit2.apply();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0140 A[SYNTHETIC, Splitter:B:40:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x028b A[SYNTHETIC, Splitter:B:73:0x028b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.foundation.entity.CampaignUnit parseCampaignUnit(org.json.JSONObject r35, java.lang.String r36) {
        /*
            r0 = r35
            java.lang.String r1 = "ads"
            java.lang.String r2 = "template"
            java.lang.String r3 = "ad_type"
            java.lang.String r4 = "parent_session_id"
            java.lang.String r5 = "a"
            java.lang.String r6 = ""
            java.lang.String r7 = "only_impression_url"
            java.lang.String r8 = "html_url"
            if (r0 == 0) goto L_0x030a
            com.mbridge.msdk.foundation.entity.CampaignUnit r15 = new com.mbridge.msdk.foundation.entity.CampaignUnit     // Catch:{ Exception -> 0x030a }
            r15.<init>()     // Catch:{ Exception -> 0x030a }
            java.lang.String r10 = "rks"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0307 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0307 }
            if (r11 != 0) goto L_0x0050
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x004d }
            r11.<init>(r10)     // Catch:{ Exception -> 0x004d }
            java.util.Iterator r10 = r11.keys()     // Catch:{ Exception -> 0x004d }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ Exception -> 0x004d }
            r12.<init>()     // Catch:{ Exception -> 0x004d }
        L_0x0033:
            if (r10 == 0) goto L_0x0049
            boolean r13 = r10.hasNext()     // Catch:{ Exception -> 0x004d }
            if (r13 == 0) goto L_0x0049
            java.lang.Object r13 = r10.next()     // Catch:{ Exception -> 0x004d }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x004d }
            java.lang.String r14 = r11.optString(r13)     // Catch:{ Exception -> 0x004d }
            r12.put(r13, r14)     // Catch:{ Exception -> 0x004d }
            goto L_0x0033
        L_0x0049:
            r15.setRks(r12)     // Catch:{ Exception -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r9 = r15
            goto L_0x030b
        L_0x0050:
            java.lang.String r10 = "req_ext_data"
            org.json.JSONObject r10 = r0.optJSONObject(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = "nscpt"
            r12 = 1
            int r14 = r0.optInt(r11, r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = "mof_template_url"
            java.lang.String r13 = r0.optString(r11, r6)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = "mof_tplid"
            r9 = 0
            int r11 = r0.optInt(r11, r9)     // Catch:{ Exception -> 0x0307 }
            if (r10 == 0) goto L_0x0070
            java.lang.String r6 = r10.toString()     // Catch:{ Exception -> 0x004d }
        L_0x0070:
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x0307 }
            r10.<init>()     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "pv_urls"
            org.json.JSONArray r10 = r0.optJSONArray(r10)     // Catch:{ Exception -> 0x0307 }
            if (r10 == 0) goto L_0x009f
            int r17 = r10.length()     // Catch:{ Exception -> 0x004d }
            if (r17 <= 0) goto L_0x009f
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x004d }
            int r12 = r10.length()     // Catch:{ Exception -> 0x004d }
            r9.<init>(r12)     // Catch:{ Exception -> 0x004d }
            r19 = r11
            r12 = 0
        L_0x008f:
            int r11 = r10.length()     // Catch:{ Exception -> 0x004d }
            if (r12 >= r11) goto L_0x00a2
            java.lang.String r11 = r10.getString(r12)     // Catch:{ Exception -> 0x004d }
            r9.add(r11)     // Catch:{ Exception -> 0x004d }
            int r12 = r12 + 1
            goto L_0x008f
        L_0x009f:
            r19 = r11
            r9 = 0
        L_0x00a2:
            java.lang.String r10 = "replace_tmp"
            org.json.JSONObject r10 = r0.optJSONObject(r10)     // Catch:{ Exception -> 0x0307 }
            com.mbridge.msdk.foundation.db.a.a r11 = com.mbridge.msdk.foundation.p164db.p165a.C6138a.m15352a()     // Catch:{ Exception -> 0x0307 }
            r12 = 1
            r11.mo42944a(r10, r12)     // Catch:{ Exception -> 0x0307 }
            getSysIDAndBKUPID(r35)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = r0.optString(r5)     // Catch:{ Exception -> 0x0307 }
            r15.setSessionId(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = r0.optString(r4)     // Catch:{ Exception -> 0x0307 }
            r15.setParentSessionId(r10)     // Catch:{ Exception -> 0x0307 }
            int r10 = r0.optInt(r3)     // Catch:{ Exception -> 0x0307 }
            r15.setAdType(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "unit_size"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setUnitSize(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = r0.optString(r8)     // Catch:{ Exception -> 0x0307 }
            r15.setHtmlUrl(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = r0.optString(r7)     // Catch:{ Exception -> 0x0307 }
            r15.setOnlyImpressionUrl(r10)     // Catch:{ Exception -> 0x0307 }
            int r10 = r0.optInt(r2)     // Catch:{ Exception -> 0x0307 }
            r15.setTemplate(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "jm_do"
            int r10 = r0.optInt(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setJmDo(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "ia_icon"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setIa_icon(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "ia_rst"
            int r10 = r0.optInt(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setIa_rst(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "ia_url"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setIa_url(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "ia_ori"
            int r10 = r0.optInt(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setIa_ori(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "ia_all_ext1"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setIa_all_ext1(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "ia_all_ext2"
            java.lang.String r10 = r0.optString(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setIa_all_ext2(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "vcn"
            int r10 = r0.optInt(r10)     // Catch:{ Exception -> 0x0307 }
            r15.setVcn(r10)     // Catch:{ Exception -> 0x0307 }
            org.json.JSONArray r12 = r0.optJSONArray(r1)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "frames"
            org.json.JSONArray r11 = r0.optJSONArray(r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r10 = "web env is not support"
            r18 = r14
            java.lang.String r14 = "end_screen_url"
            if (r11 == 0) goto L_0x027e
            int r16 = r11.length()     // Catch:{ Exception -> 0x027a }
            if (r16 <= 0) goto L_0x027e
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x027a }
            r12.<init>()     // Catch:{ Exception -> 0x027a }
            r20 = r2
            r16 = r10
            r2 = 0
        L_0x0150:
            int r10 = r11.length()     // Catch:{ Exception -> 0x027a }
            if (r2 >= r10) goto L_0x0273
            org.json.JSONObject r10 = r11.optJSONObject(r2)     // Catch:{ Exception -> 0x027a }
            r21 = r2
            org.json.JSONArray r2 = r10.getJSONArray(r1)     // Catch:{ Exception -> 0x027a }
            r22 = r1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x027a }
            r1.<init>()     // Catch:{ Exception -> 0x027a }
            r23 = r5
            r24 = r10
            r5 = 0
        L_0x016c:
            int r10 = r2.length()     // Catch:{ Exception -> 0x027a }
            if (r5 >= r10) goto L_0x0220
            org.json.JSONObject r10 = r2.optJSONObject(r5)     // Catch:{ Exception -> 0x027a }
            java.lang.String r25 = r0.optString(r7)     // Catch:{ Exception -> 0x027a }
            java.lang.String r26 = r0.optString(r8)     // Catch:{ Exception -> 0x027a }
            java.lang.String r27 = r0.optString(r14)     // Catch:{ Exception -> 0x027a }
            r28 = 0
            r30 = r16
            r29 = r24
            r31 = r19
            r19 = r11
            r11 = r25
            r32 = r12
            r12 = r26
            r24 = r2
            r2 = r13
            r13 = r27
            r25 = r8
            r33 = r14
            r8 = r18
            r14 = r28
            r18 = r15
            r16 = r36
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaign(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x021c }
            if (r10 == 0) goto L_0x01fb
            java.lang.String r11 = r18.getIa_url()     // Catch:{ Exception -> 0x01f7 }
            r10.setKeyIaUrl(r11)     // Catch:{ Exception -> 0x01f7 }
            int r11 = r18.getIa_ori()     // Catch:{ Exception -> 0x01f7 }
            r10.setKeyIaOri(r11)     // Catch:{ Exception -> 0x01f7 }
            int r11 = r18.getIa_rst()     // Catch:{ Exception -> 0x01f7 }
            r10.setKeyIaRst(r11)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r11 = r18.getIa_icon()     // Catch:{ Exception -> 0x01f7 }
            r10.setKeyIaIcon(r11)     // Catch:{ Exception -> 0x01f7 }
            int r11 = r0.optInt(r3)     // Catch:{ Exception -> 0x01f7 }
            r10.setAdType(r11)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r11 = "ia_ext1"
            java.lang.String r11 = r0.optString(r11)     // Catch:{ Exception -> 0x01f7 }
            r10.setIa_ext1(r11)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r11 = "ia_ext2"
            java.lang.String r11 = r0.optString(r11)     // Catch:{ Exception -> 0x01f7 }
            r10.setIa_ext2(r11)     // Catch:{ Exception -> 0x01f7 }
            r15 = r31
            r10.setMof_tplid(r15)     // Catch:{ Exception -> 0x01f7 }
            r10.setMof_template_url(r2)     // Catch:{ Exception -> 0x01f7 }
            r10.setNscpt(r8)     // Catch:{ Exception -> 0x01f7 }
            r10.setPv_urls(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.setReq_ext_data(r6)     // Catch:{ Exception -> 0x01f7 }
            r1.add(r10)     // Catch:{ Exception -> 0x01f7 }
            r14 = r18
            r13 = r30
            goto L_0x0204
        L_0x01f7:
            r9 = r18
            goto L_0x030b
        L_0x01fb:
            r15 = r31
            r14 = r18
            r13 = r30
            r14.setMsg(r13)     // Catch:{ Exception -> 0x027b }
        L_0x0204:
            int r5 = r5 + 1
            r18 = r8
            r16 = r13
            r11 = r19
            r8 = r25
            r12 = r32
            r13 = r2
            r19 = r15
            r2 = r24
            r24 = r29
            r15 = r14
            r14 = r33
            goto L_0x016c
        L_0x021c:
            r14 = r18
            goto L_0x027b
        L_0x0220:
            r25 = r8
            r32 = r12
            r2 = r13
            r33 = r14
            r14 = r15
            r13 = r16
            r8 = r18
            r15 = r19
            r29 = r24
            r19 = r11
            com.mbridge.msdk.out.Frame r5 = new com.mbridge.msdk.out.Frame     // Catch:{ Exception -> 0x027b }
            r5.<init>()     // Catch:{ Exception -> 0x027b }
            java.lang.String r10 = r0.optString(r4)     // Catch:{ Exception -> 0x027b }
            r5.setParentSessionId(r10)     // Catch:{ Exception -> 0x027b }
            r10 = r23
            java.lang.String r11 = r0.optString(r10)     // Catch:{ Exception -> 0x027b }
            r5.setSessionId(r11)     // Catch:{ Exception -> 0x027b }
            r5.setCampaigns(r1)     // Catch:{ Exception -> 0x027b }
            r11 = r20
            r1 = r29
            int r1 = r1.optInt(r11)     // Catch:{ Exception -> 0x027b }
            r5.setTemplate(r1)     // Catch:{ Exception -> 0x027b }
            r1 = r32
            r1.add(r5)     // Catch:{ Exception -> 0x027b }
            int r5 = r21 + 1
            r12 = r1
            r18 = r8
            r20 = r11
            r16 = r13
            r11 = r19
            r1 = r22
            r8 = r25
            r13 = r2
            r2 = r5
            r5 = r10
            r19 = r15
            r15 = r14
            r14 = r33
            goto L_0x0150
        L_0x0273:
            r1 = r12
            r14 = r15
            r14.setListFrames(r1)     // Catch:{ Exception -> 0x027b }
            goto L_0x0305
        L_0x027a:
            r14 = r15
        L_0x027b:
            r9 = r14
            goto L_0x030b
        L_0x027e:
            r25 = r8
            r2 = r13
            r33 = r14
            r14 = r15
            r8 = r18
            r15 = r19
            r13 = r10
            if (r12 == 0) goto L_0x0305
            int r1 = r12.length()     // Catch:{ Exception -> 0x0305 }
            if (r1 <= 0) goto L_0x0305
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0305 }
            r1.<init>()     // Catch:{ Exception -> 0x0305 }
            r3 = 0
        L_0x0297:
            int r4 = r12.length()     // Catch:{ Exception -> 0x0305 }
            if (r3 >= r4) goto L_0x0300
            org.json.JSONObject r10 = r12.optJSONObject(r3)     // Catch:{ Exception -> 0x0305 }
            java.lang.String r11 = r0.optString(r7)     // Catch:{ Exception -> 0x0305 }
            r4 = r25
            java.lang.String r5 = r0.optString(r4)     // Catch:{ Exception -> 0x0305 }
            r18 = r14
            r14 = r33
            java.lang.String r16 = r0.optString(r14)     // Catch:{ Exception -> 0x02fd }
            r17 = 0
            r19 = r12
            r12 = r5
            r5 = r13
            r13 = r16
            r20 = r18
            r18 = r14
            r14 = r17
            r34 = r15
            r15 = r20
            r16 = r36
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaign(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x02fa }
            if (r10 == 0) goto L_0x02e7
            r11 = r34
            r10.setMof_tplid(r11)     // Catch:{ Exception -> 0x02e4 }
            r10.setMof_template_url(r2)     // Catch:{ Exception -> 0x02e4 }
            r10.setNscpt(r8)     // Catch:{ Exception -> 0x02e4 }
            r10.setPv_urls(r9)     // Catch:{ Exception -> 0x02e4 }
            r10.setReq_ext_data(r6)     // Catch:{ Exception -> 0x02e4 }
            r1.add(r10)     // Catch:{ Exception -> 0x02e4 }
            r10 = r20
            goto L_0x02ee
        L_0x02e4:
            r9 = r20
            goto L_0x030b
        L_0x02e7:
            r11 = r34
            r10 = r20
            r10.setMsg(r5)     // Catch:{ Exception -> 0x0308 }
        L_0x02ee:
            int r3 = r3 + 1
            r25 = r4
            r13 = r5
            r14 = r10
            r15 = r11
            r33 = r18
            r12 = r19
            goto L_0x0297
        L_0x02fa:
            r10 = r20
            goto L_0x0308
        L_0x02fd:
            r10 = r18
            goto L_0x0308
        L_0x0300:
            r10 = r14
            r10.setAds(r1)     // Catch:{ Exception -> 0x0308 }
            goto L_0x0308
        L_0x0305:
            r10 = r14
            goto L_0x0308
        L_0x0307:
            r10 = r15
        L_0x0308:
            r9 = r10
            goto L_0x030b
        L_0x030a:
            r9 = 0
        L_0x030b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.entity.CampaignUnit.parseCampaignUnit(org.json.JSONObject, java.lang.String):com.mbridge.msdk.foundation.entity.CampaignUnit");
    }
}
