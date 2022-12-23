package com.fyber.inneractive.sdk.p046f;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.f.a */
public class C2909a {

    /* renamed from: c */
    protected final String f6917c;

    public C2909a(String str) {
        this.f6917c = str;
    }

    /* renamed from: a */
    public boolean mo18092a() {
        return IAConfigManager.m5929c().f6586a.mo18049a(this.f6917c, false);
    }

    /* renamed from: a */
    public static boolean m6501a(int i, int i2, JSONArray jSONArray, List<Long> list) {
        if (i > 0 && i2 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis((long) i);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i3 >= jSONArray.length()) {
                    break;
                }
                long optLong = jSONArray.optLong(i3, 0);
                if (optLong <= currentTimeMillis) {
                    z = false;
                }
                if (z) {
                    i4++;
                    list.add(Long.valueOf(optLong));
                }
                i3++;
            }
            if (i4 >= i2) {
                return true;
            }
        }
        return false;
    }
}
