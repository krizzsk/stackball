package com.moat.analytics.mobile.inm;

import android.os.Build;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moat.analytics.mobile.inm.C7276w;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.l */
class C7251l {

    /* renamed from: a */
    private boolean f18195a = false;

    /* renamed from: b */
    private boolean f18196b = false;

    /* renamed from: c */
    private boolean f18197c = false;

    /* renamed from: d */
    private int f18198d = 200;

    /* renamed from: e */
    private int f18199e = 10;

    C7251l(String str) {
        m18497a(str);
    }

    /* renamed from: a */
    private void m18497a(String str) {
        int i;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("sa");
                boolean equals = string.equals("c334ae83accfebb8da23104450c896463c9cfab7");
                boolean equals2 = string.equals("8f1d08a2d6496191a5ebae8f0590f513e2619489");
                if ((string.equals(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON) || equals || equals2) && !m18498a(jSONObject) && !m18499b(jSONObject)) {
                    this.f18195a = true;
                    this.f18196b = equals;
                    this.f18197c = equals2;
                    if (equals2) {
                        this.f18196b = true;
                    }
                }
                if (jSONObject.has("in") && (i = jSONObject.getInt("in")) >= 100 && i <= 1000) {
                    this.f18198d = i;
                }
                if (jSONObject.has("es")) {
                    this.f18199e = jSONObject.getInt("es");
                }
                if (m18500c(jSONObject)) {
                    ((C7250k) MoatAnalytics.getInstance()).f18189c = true;
                }
            } catch (Exception e) {
                this.f18195a = false;
                this.f18196b = false;
                this.f18198d = 200;
                C7252m.m18508a(e);
            }
        }
    }

    /* renamed from: a */
    private boolean m18498a(JSONObject jSONObject) {
        try {
            if (16 > Build.VERSION.SDK_INT) {
                return true;
            }
            if (jSONObject.has("ob")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ob");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getInt(i) == Build.VERSION.SDK_INT) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: b */
    private boolean m18499b(JSONObject jSONObject) {
        try {
            if (jSONObject.has("ap")) {
                String b = C7264s.m18558d().mo49424b();
                JSONArray jSONArray = jSONObject.getJSONArray("ap");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getString(i).contentEquals(b)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
        return false;
    }

    /* renamed from: c */
    private boolean m18500c(JSONObject jSONObject) {
        try {
            if (jSONObject.has(CampaignEx.JSON_KEY_AD_AL)) {
                String b = C7264s.m18558d().mo49424b();
                JSONArray jSONArray = jSONObject.getJSONArray(CampaignEx.JSON_KEY_AD_AL);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getString(i).contentEquals(b)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo49407a() {
        return this.f18196b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo49408b() {
        return this.f18197c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo49409c() {
        return this.f18198d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo49410d() {
        return this.f18199e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C7276w.C7284d mo49411e() {
        return this.f18195a ? C7276w.C7284d.ON : C7276w.C7284d.OFF;
    }
}
