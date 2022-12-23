package com.ogury.p244cm.internal;

import com.appsflyer.internal.referrer.Payload;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acbca */
public final class acbca {

    /* renamed from: a */
    public static final aaaaa f20546a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public static acbcb m21953a(String str) {
        bbabc.m22051b(str, Payload.RESPONSE);
        try {
            Object obj = new JSONObject(str).get("status");
            return bbabc.m22050a(obj, (Object) "NOOP") ? acbcb.NOOP : bbabc.m22050a(obj, (Object) "CREATED") ? acbcb.CREATED : bbabc.m22050a(obj, (Object) "UPDATED") ? acbcb.UPDATED : acbcb.UNKNOWN;
        } catch (JSONException unused) {
            return acbcb.UNKNOWN;
        }
    }
}
