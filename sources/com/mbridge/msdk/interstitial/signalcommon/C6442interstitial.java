package com.mbridge.msdk.interstitial.signalcommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.interstitial.p191b.C6433a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.C6564h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interstitial.signalcommon.interstitial */
public class C6442interstitial extends C6564h {

    /* renamed from: d */
    private static final String f16042d = C6442interstitial.class.getName();

    /* renamed from: e */
    private Object f16043e;

    public void getInfo(Object obj, String str) {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            this.f16043e = obj;
            if (this.f16369a == null) {
                m16496a();
                return;
            }
            int a = m16492a(this.f16369a);
            if (TextUtils.isEmpty(m16497b())) {
                m16496a();
            } else if (a == 1) {
                try {
                    if (this.f16369a != null) {
                        if (m16492a(this.f16369a) == 1) {
                            try {
                                MBInterstitialActivity mBInterstitialActivity2 = (MBInterstitialActivity) this.f16369a;
                                if (mBInterstitialActivity2 != null) {
                                    mBInterstitialActivity2.hideLoading();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e2) {
                    try {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        m16496a();
                        return;
                    }
                }
                try {
                    if (this.f16369a != null) {
                        if (m16492a(this.f16369a) == 1 && (mBInterstitialActivity = (MBInterstitialActivity) this.f16369a) != null) {
                            mBInterstitialActivity.showWebView();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (this.f16369a == null) {
                    m16496a();
                } else if (m16492a(this.f16369a) != 1) {
                    m16496a();
                } else {
                    if (this.f16369a instanceof MBInterstitialActivity) {
                        ((MBInterstitialActivity) this.f16369a).mIsMBPage = true;
                    }
                    final String b = m16497b();
                    if (TextUtils.isEmpty(b)) {
                        m16496a();
                        return;
                    }
                    final List<CampaignEx> a2 = m16495a(b);
                    if (a2 != null) {
                        String a3 = m16494a(a2);
                        if (TextUtils.isEmpty(a3)) {
                            m16496a();
                            return;
                        }
                        C6563g.m16891a().mo44523a(obj, a3);
                        try {
                            if (!TextUtils.isEmpty(b)) {
                                if (a2 != null) {
                                    if (a2.size() != 0) {
                                        for (int i = 0; i < a2.size(); i++) {
                                            CampaignEx campaignEx = a2.get(i);
                                            if (campaignEx != null) {
                                                C6208d.m15706b(b, campaignEx, "interstitial");
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        try {
                            if (!TextUtils.isEmpty(b)) {
                                if (a2 != null) {
                                    if (a2.size() != 0) {
                                        new Thread(new Runnable() {
                                            public final void run() {
                                                for (int i = 0; i < a2.size(); i++) {
                                                    CampaignEx campaignEx = (CampaignEx) a2.get(i);
                                                    if (campaignEx != null) {
                                                        C6152j.m15441a((C6146e) C6148f.m15420a(C6442interstitial.this.f16369a)).mo43016b(campaignEx.getId());
                                                    }
                                                }
                                            }
                                        }).start();
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        try {
                            new Thread(new Runnable() {
                                public final void run() {
                                    C6433a a = C6433a.m16445a();
                                    if (a != null) {
                                        a.mo44152a((List<CampaignEx>) a2, b);
                                    }
                                }
                            }).start();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    } else {
                        m16496a();
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            m16496a();
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f16369a != null && (this.f16369a instanceof MBInterstitialActivity)) {
                ((MBInterstitialActivity) this.f16369a).clickTracking();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openURL(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    C6103b.m15226a(this.f16369a, optString);
                } else if (optInt == 2) {
                    C6103b.m15227b(this.f16369a, optString);
                }
            } catch (JSONException e) {
                C6361q.m16158d(f16042d, e.getMessage());
            } catch (Throwable th) {
                C6361q.m16158d(f16042d, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m16496a() {
        try {
            C6563g.m16891a().mo44523a(this.f16043e, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m16495a(String str) {
        try {
            if (TextUtils.isEmpty(str) || C6433a.m16445a() == null) {
                return null;
            }
            return C6433a.m16445a().mo44149a(str, 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private String m16494a(List<CampaignEx> list) {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", parseCamplistToJson);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public List<String> getExcludeIdList(String str) {
        ArrayList arrayList;
        Exception e;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String optString = new JSONObject(str).optString(C6287d.f15600c);
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(optString);
            if (jSONArray.length() <= 0) {
                return null;
            }
            arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    private int m16492a(Context context) {
        return (context == null || !(context instanceof MBInterstitialActivity)) ? -1 : 1;
    }

    /* renamed from: b */
    private String m16497b() {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            if (this.f16369a != null && m16492a(this.f16369a) == 1) {
                try {
                    if (!(this.f16369a == null || !(this.f16369a instanceof MBInterstitialActivity) || (mBInterstitialActivity = (MBInterstitialActivity) this.f16369a) == null)) {
                        return mBInterstitialActivity.mUnitid;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
