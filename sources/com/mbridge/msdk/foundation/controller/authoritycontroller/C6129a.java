package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.a */
/* compiled from: SDKAuthorityController */
public class C6129a {

    /* renamed from: b */
    private static volatile C6129a f15153b;

    /* renamed from: a */
    public ArrayList<String> f15154a = new ArrayList<>();

    /* renamed from: c */
    private AuthorityInfoBean f15155c = new AuthorityInfoBean();

    /* renamed from: d */
    private int f15156d = 3;

    private C6129a() {
        try {
            if (C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.f15155c.mo42910b(1);
            }
            if (C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.f15155c.mo42911c(1);
            }
            if (C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.f15155c.mo42912d(1);
            }
            if (C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.f15155c.mo42913e(1);
            }
            this.f15154a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f15154a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f15154a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f15154a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C6129a m15330a() {
        if (f15153b == null) {
            synchronized (C6129a.class) {
                if (f15153b == null) {
                    f15153b = new C6129a();
                }
            }
        }
        return f15153b;
    }

    /* renamed from: a */
    public final void mo42921a(String str, int i) {
        if (this.f15155c == null) {
            return;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            this.f15155c.mo42910b(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            this.f15155c.mo42911c(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
            this.f15155c.mo42909a(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            this.f15155c.mo42912d(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            this.f15155c.mo42913e(i);
        }
    }

    /* renamed from: b */
    public final AuthorityInfoBean mo42923b() {
        AuthorityInfoBean authorityInfoBean = this.f15155c;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        return new AuthorityInfoBean().mo42909a(1);
    }

    /* renamed from: b */
    private int m15331b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String b = C6121a.m15293a().mo42882b(str);
                if (TextUtils.isEmpty(b)) {
                    return 0;
                }
                return Integer.parseInt(b);
            }
        } catch (Exception e) {
            C6361q.m16158d("SDKAuthorityController", e.getMessage());
        }
        return 0;
    }

    /* renamed from: c */
    private int m15332c(String str) {
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b == null) {
            b = C6076b.m15089a().mo42748b();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return b.mo42708g();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return b.mo42710h();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return b.mo42706f();
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo42922a(String str) {
        boolean z;
        boolean z2;
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        boolean z3 = false;
        if (b == null) {
            b = C6076b.m15089a().mo42748b();
            z = true;
        } else {
            z = false;
        }
        int i = b.mo42712i();
        if (i != 0 ? !(i == 1 && m15332c(str) == 1) : !(m15331b(str) == 1 && m15332c(str) == 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z2 = m15331b(str) == 1;
        }
        if (!str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) || m15330a().f15156d != 2) {
            return z2;
        }
        if (!b.mo42679X() && !z && m15331b(str) == 1) {
            z3 = true;
        }
        return z3;
    }

    /* renamed from: c */
    public final String mo42925c() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.f15154a.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f15154a.get(i)));
                jSONObject.put("client_status", m15331b(this.f15154a.get(i)));
                jSONObject.put("server_status", m15332c(this.f15154a.get(i)));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public final void mo42920a(int i) {
        if (this.f15155c != null) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
            }
            this.f15156d = i2;
        }
    }

    /* renamed from: d */
    public final boolean mo42926d() {
        int i = this.f15156d;
        return i == 1 || i == 3;
    }

    /* renamed from: b */
    public final void mo42924b(int i) {
        C6121a.m15293a().mo42879a(MBridgeConstans.AUTHORITY_DNT, i);
    }

    /* renamed from: e */
    public final int mo42927e() {
        return this.f15156d;
    }
}
