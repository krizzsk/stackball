package com.mbridge.msdk.foundation.same.net.p175d;

import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p177f.C6272c;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.d */
/* compiled from: JsonObjectRequest */
public class C6260d extends C6261e<JSONObject> {

    /* renamed from: c */
    private static final String f15532c = C6260d.class.getSimpleName();

    public C6260d(int i, String str, String str2, C6263e<JSONObject> eVar) {
        super(i, str, str2, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C6293k<JSONObject> mo43837a(C6272c cVar) {
        try {
            return C6293k.m15930a(new JSONObject(new String(cVar.f15553b, C6275b.m15857a(cVar.f15555d))), cVar);
        } catch (UnsupportedEncodingException e) {
            C6361q.m16158d(f15532c, e.getMessage());
            return C6293k.m15929a(new C6240a(8, cVar));
        } catch (JSONException e2) {
            C6361q.m16158d(f15532c, e2.getMessage());
            return C6293k.m15929a(new C6240a(8, cVar));
        }
    }
}
