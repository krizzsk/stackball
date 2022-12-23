package com.p243my.target;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.s8 */
public class C7659s8 {

    /* renamed from: a */
    public final C7718w2 f19336a;

    /* renamed from: b */
    public final C7298a f19337b;

    public C7659s8(C7718w2 w2Var, C7298a aVar) {
        this.f19336a = w2Var;
        this.f19337b = aVar;
    }

    /* renamed from: a */
    public static C7659s8 m20379a(C7718w2 w2Var, C7298a aVar) {
        return new C7659s8(w2Var, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20380a(C7497k2 k2Var, Context context) {
        String a = mo51539a(k2Var);
        if (a != null) {
            C7442h8 a2 = C7442h8.m19263a(context);
            if (a2 == null) {
                C7374e0.m18989a("unable to open disk cache and save text data for slotId: " + this.f19337b.getSlotId());
                return;
            }
            a2.mo50315a(this.f19337b.getSlotId(), a, true);
        }
    }

    /* renamed from: a */
    public final String mo51539a(C7497k2 k2Var) {
        String id = k2Var.getId();
        try {
            JSONObject j = this.f19336a.mo51787j();
            if (j == null) {
                C7374e0.m18989a("unable to change cached notification for banner " + id + ": no raw data in section");
                return null;
            }
            JSONObject jSONObject = j.getJSONObject(this.f19336a.mo51786i());
            if (jSONObject == null) {
                C7374e0.m18989a("unable to change cached notification for banner " + id + ": no section object in raw data");
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("banners");
            if (jSONArray == null) {
                C7374e0.m18989a("unable to change cached notification for banner " + id + ": no banners array in section object");
                return null;
            }
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                String string = jSONObject2.getString("bannerID");
                if (string == null || !string.equals(id)) {
                    i++;
                } else {
                    jSONObject2.put("hasNotification", k2Var.isHasNotification());
                    C7374e0.m18989a("notification changed in raw data for banner " + id);
                    return j.toString();
                }
            }
            return null;
        } catch (Throwable th) {
            C7374e0.m18989a("error updating cached notification for section " + this.f19336a.mo51786i() + " and banner " + id + ": " + th);
        }
    }

    /* renamed from: a */
    public void mo51540a(C7497k2 k2Var, boolean z, Context context) {
        if (k2Var.isHasNotification() != z) {
            k2Var.setHasNotification(z);
            C7395f0.m19086a(new Runnable(k2Var, context.getApplicationContext()) {
                public final /* synthetic */ C7497k2 f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C7659s8.this.m20380a(this.f$1, this.f$2);
                }
            });
        }
    }
}
