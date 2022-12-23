package com.mbridge.msdk.mbbanner.common.bridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6202l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.p164db.C6157o;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6331b;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.mbbanner.common.p197b.C6468a;
import com.mbridge.msdk.mbbanner.common.p199d.C6501a;
import com.mbridge.msdk.mbsignalcommon.communication.C6545a;
import com.mbridge.msdk.mbsignalcommon.communication.C6546b;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.p243my.tracker.ads.AdFormat;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.bridge.a */
/* compiled from: BannerSignalCommunicationImpl */
public final class C6480a extends C6545a {

    /* renamed from: b */
    private WeakReference<Context> f16147b;

    /* renamed from: c */
    private List<CampaignEx> f16148c;

    /* renamed from: d */
    private String f16149d;

    /* renamed from: e */
    private String f16150e;

    /* renamed from: f */
    private int f16151f;

    /* renamed from: g */
    private C6468a f16152g;

    /* renamed from: h */
    private BannerExpandDialog f16153h;

    /* renamed from: i */
    private boolean f16154i = false;

    public C6480a(Context context, String str, String str2) {
        this.f16149d = str;
        this.f16150e = str2;
        this.f16147b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo44307a(C6468a aVar) {
        if (aVar != null) {
            this.f16152g = aVar;
        }
    }

    /* renamed from: a */
    public final void mo44309a(List<CampaignEx> list) {
        this.f16148c = list;
    }

    /* renamed from: a */
    public final void mo44306a(int i) {
        this.f16151f = i;
    }

    /* renamed from: a */
    public final void mo44305a() {
        if (this.f16152g != null) {
            this.f16152g = null;
        }
        if (this.f16153h != null) {
            this.f16153h = null;
        }
    }

    /* renamed from: c */
    public final void mo44311c(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                C6563g.m16891a().mo44523a(obj, C6546b.m16829a(0));
                if (this.f16152g != null) {
                    this.f16152g.mo44298b(optInt);
                }
            } catch (Throwable th) {
                C6361q.m16155a("BannerSignalCommunicationImpl", "readyStatus", th);
            }
        }
    }

    /* renamed from: a */
    public final void mo44308a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C6331b bVar = new C6331b(C6122a.m15302b().mo42895d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f16151f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.mo43936a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f16148c));
            C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), this.f16150e);
            if (e == null) {
                e = C6086d.m15134d(this.f16150e);
            }
            if (!TextUtils.isEmpty(this.f16149d)) {
                e.mo42782h(this.f16149d);
            }
            jSONObject.put("unitSetting", e.mo42795u());
            String c = C6076b.m15089a().mo42752c(C6122a.m15302b().mo42896e());
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("appSetting", new JSONObject(c));
            }
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "init", th);
        }
    }

    /* renamed from: b */
    public final void mo44310b(Object obj, String str) {
        C6361q.m16158d("BannerSignalCommunicationImpl", "click");
        try {
            if (this.f16148c != null && !TextUtils.isEmpty(str)) {
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(new JSONObject(str).getJSONObject("pt"));
                if (this.f16152g != null) {
                    this.f16152g.mo44294a(parseCampaignWithBackData);
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "click", th);
        }
    }

    /* renamed from: d */
    public final void mo44312d(Object obj, String str) {
        C6361q.m16158d("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                if (this.f16152g != null) {
                    this.f16152g.mo44293a(optInt);
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "toggleCloseBtn", th);
        }
    }

    /* renamed from: e */
    public final void mo44313e(Object obj, String str) {
        C6361q.m16158d("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                if (this.f16152g != null) {
                    this.f16152g.mo44295a(optString);
                }
                C6563g.m16891a().mo44523a(obj, C6546b.m16829a(0));
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "triggerCloseBtn", th);
            C6563g.m16891a().mo44523a(obj, C6546b.m16829a(-1));
        }
    }

    /* renamed from: i */
    public final void mo44314i(Object obj, String str) {
        C6361q.m16154a("BannerSignalCommunicationImpl", "sendImpressions:" + str);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    for (CampaignEx next : this.f16148c) {
                        if (next.getId().equals(string)) {
                            C6208d.m15706b(this.f16150e, next, AdFormat.BANNER);
                            arrayList.add(string);
                        }
                    }
                }
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C6152j a = C6152j.m15441a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a.mo43016b((String) it.next());
                            }
                        } catch (Exception e) {
                            C6361q.m16158d("BannerSignalCommunicationImpl", e.getMessage());
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "sendImpressions", th);
        }
    }

    public final void open(String str) {
        C6361q.m16158d("BannerSignalCommunicationImpl", "open");
        try {
            C6361q.m16158d("BannerSignalCommunicationImpl", str);
            if (this.f16148c.size() > 1) {
                C6122a.m15302b().mo42895d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            if (this.f16152g != null) {
                this.f16152g.mo44297a(true, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "open", th);
        }
    }

    public final void close() {
        C6361q.m16158d("BannerSignalCommunicationImpl", "close");
        try {
            if (this.f16152g != null) {
                this.f16152g.mo44292a();
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "close", th);
        }
    }

    public final void unload() {
        close();
    }

    /* renamed from: b */
    private CampaignEx m16636b() {
        List<CampaignEx> list = this.f16148c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f16148c.get(0);
    }

    public final void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            if (this.f16152g != null) {
                this.f16152g.mo44293a(i);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", "useCustomClose", th);
        }
    }

    public final void expand(String str, boolean z) {
        Context context;
        String str2 = "";
        try {
            if (m16636b() != null) {
                if (TextUtils.isEmpty(m16636b().getBannerHtml())) {
                    str2 = m16636b().getBannerUrl();
                } else {
                    str2 = "file:////" + m16636b().getBannerHtml();
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            bundle.putString("url", str2);
            bundle.putBoolean("shouldUseCustomClose", z);
            if (!(this.f16147b == null || (context = (Context) this.f16147b.get()) == null)) {
                if (this.f16153h == null || !this.f16153h.isShowing()) {
                    BannerExpandDialog bannerExpandDialog = new BannerExpandDialog(context, bundle, this.f16152g);
                    this.f16153h = bannerExpandDialog;
                    bannerExpandDialog.setCampaignList(this.f16150e, this.f16148c);
                    this.f16153h.show();
                } else {
                    return;
                }
            }
            if (this.f16152g != null) {
                this.f16152g.mo44296a(true);
            }
            C6501a.m16725a(this.f16150e, m16636b(), str);
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalCommunicationImpl", MraidJsMethods.EXPAND, th);
        }
    }

    /* renamed from: j */
    public final void mo44315j(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C6546b.m16830a(obj, "params is empty");
            return;
        }
        try {
            m16635a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16154a("BannerSignalCommunicationImpl", th.getMessage());
        }
    }

    /* renamed from: a */
    private static void m16635a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        Object obj2 = obj;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        String str8 = "message";
        String str9 = "code";
        int i2 = 1;
        if (jSONObject2 == null) {
            try {
                jSONObject3.put(str9, 1);
                jSONObject3.put(str8, "params is null");
                C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (JSONException e) {
                C6361q.m16154a("BannerSignalCommunicationImpl", e.getMessage());
            }
        } else {
            try {
                jSONObject3.put(str9, 0);
                jSONObject3.put(str8, "");
                JSONArray jSONArray = jSONObject2.getJSONArray("resource");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    str3 = str8;
                    str2 = str9;
                    try {
                        jSONObject3.put(str2, 1);
                        str = str3;
                        try {
                            jSONObject3.put(str, "resource is null");
                            C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        str = str3;
                        try {
                            C6361q.m16154a("BannerSignalCommunicationImpl", e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = str3;
                        try {
                            jSONObject3.put(str2, 1);
                            jSONObject3.put(str, th.getLocalizedMessage());
                            C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e4) {
                            C6361q.m16154a("BannerSignalCommunicationImpl", e4.getMessage());
                        }
                    }
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    int length = jSONArray.length();
                    int i3 = 0;
                    while (i3 < length) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        String optString = jSONObject4.optString("ref", "");
                        int i4 = jSONObject4.getInt("type");
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray3 = jSONArray;
                        if (i4 == i2) {
                            if (!TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                C6202l a = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo43033a(optString);
                                if (a != null) {
                                    i = length;
                                    C6361q.m16154a("BannerSignalCommunicationImpl", "VideoBean not null");
                                    jSONObject6.put("type", 1);
                                    str3 = str8;
                                    try {
                                        jSONObject6.put("videoDataLength", a.mo43714c());
                                        String e5 = a.mo43716e();
                                        str4 = str9;
                                        if (TextUtils.isEmpty(e5)) {
                                            C6361q.m16154a("BannerSignalCommunicationImpl", "VideoPath null");
                                            jSONObject6.put("path", "");
                                            jSONObject6.put("path4Web", "");
                                        } else {
                                            C6361q.m16154a("BannerSignalCommunicationImpl", "VideoPath not null");
                                            jSONObject6.put("path", e5);
                                            jSONObject6.put("path4Web", e5);
                                        }
                                        if (a.mo43715d() == 5) {
                                            jSONObject6.put("downloaded", 1);
                                        } else {
                                            jSONObject6.put("downloaded", 0);
                                        }
                                        jSONObject5.put(optString, jSONObject6);
                                        jSONArray2.put(jSONObject5);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = str3;
                                        str2 = str4;
                                        jSONObject3.put(str2, 1);
                                        jSONObject3.put(str, th.getLocalizedMessage());
                                        C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                                    }
                                } else {
                                    str3 = str8;
                                    str4 = str9;
                                    i = length;
                                    C6361q.m16154a("BannerSignalCommunicationImpl", "VideoBean null");
                                }
                                i3++;
                                jSONArray = jSONArray3;
                                length = i;
                                str8 = str3;
                                str9 = str4;
                                i2 = 1;
                            }
                        }
                        str3 = str8;
                        str4 = str9;
                        i = length;
                        if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 2);
                            if (C7191g.m18286a().mo49218a(optString) == null) {
                                str7 = "";
                            } else {
                                str7 = C7191g.m18286a().mo49220b(optString);
                            }
                            jSONObject7.put("path", str7);
                            jSONObject5.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else if (i4 != 3 || TextUtils.isEmpty(optString)) {
                            if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                if (C6364t.m16173a(optString) == null) {
                                    str5 = "";
                                } else {
                                    str5 = C6364t.m16173a(optString);
                                }
                                jSONObject8.put("path", str5);
                                jSONObject5.put(optString, jSONObject8);
                                jSONArray2.put(jSONObject5);
                            }
                            i3++;
                            jSONArray = jSONArray3;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else {
                            try {
                                File file = new File(optString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    C6361q.m16154a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + optString);
                                    str6 = "file:////" + optString;
                                    JSONObject jSONObject9 = new JSONObject();
                                    jSONObject9.put("type", 3);
                                    jSONObject9.put("path", str6);
                                    jSONObject5.put(optString, jSONObject9);
                                    jSONArray2.put(jSONObject5);
                                    i3++;
                                    jSONArray = jSONArray3;
                                    length = i;
                                    str8 = str3;
                                    str9 = str4;
                                    i2 = 1;
                                }
                            } catch (Throwable th4) {
                                if (MBridgeConstans.DEBUG) {
                                    th4.printStackTrace();
                                }
                            }
                            str6 = "";
                            JSONObject jSONObject92 = new JSONObject();
                            jSONObject92.put("type", 3);
                            jSONObject92.put("path", str6);
                            jSONObject5.put(optString, jSONObject92);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        }
                    }
                    String str10 = str8;
                    String str11 = str9;
                    jSONObject3.put("resource", jSONArray2);
                    C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                }
            } catch (Throwable th5) {
                th = th5;
                str = str8;
                str2 = str9;
                jSONObject3.put(str2, 1);
                jSONObject3.put(str, th.getLocalizedMessage());
                C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            }
        }
    }
}
