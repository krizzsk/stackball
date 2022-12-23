package com.yandex.metrica.impl.interact;

import android.content.Context;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10114Ak;
import com.yandex.metrica.impl.p265ob.C10143Bk;
import com.yandex.metrica.impl.p265ob.C10859Vj;
import com.yandex.metrica.impl.p265ob.C10941Y;
import com.yandex.metrica.impl.p265ob.C11991yk;
import java.util.HashMap;
import java.util.Map;

public class CellularNetworkInfo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f24290a = "";

    /* renamed from: com.yandex.metrica.impl.interact.CellularNetworkInfo$a */
    class C10088a implements C10143Bk {
        C10088a() {
        }

        /* renamed from: a */
        public void mo61033a(C10114Ak ak) {
            C10859Vj b = ak.mo61069b();
            if (b != null) {
                String m = b.mo62409m();
                String n = b.mo62410n();
                Integer l = b.mo62408l();
                Integer k = b.mo62407k();
                Integer b2 = b.mo62398b();
                Integer e = b.mo62401e();
                Integer p = b.mo62412p();
                HashMap hashMap = new HashMap();
                hashMap.put("network_type", m);
                hashMap.put("operator_name", n);
                String str = null;
                hashMap.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, k != null ? String.valueOf(k) : null);
                hashMap.put("operator_id", l != null ? String.valueOf(l) : null);
                hashMap.put("cell_id", b2 != null ? String.valueOf(b2) : null);
                hashMap.put("lac", e != null ? String.valueOf(e) : null);
                if (p != null) {
                    str = String.valueOf(p);
                }
                hashMap.put("signal_strength", str);
                StringBuilder sb = new StringBuilder();
                String str2 = "";
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append(str2);
                        sb.append((String) entry.getKey());
                        sb.append("=");
                        sb.append(str3);
                        str2 = "&";
                    }
                }
                String unused = CellularNetworkInfo.this.f24290a = sb.toString();
            }
        }
    }

    public CellularNetworkInfo(Context context) {
        new C11991yk(context, C10941Y.m28234g().mo62500d().mo63561b()).mo62202a((C10143Bk) new C10088a());
    }

    public String getCelluralInfo() {
        return this.f24290a;
    }
}
