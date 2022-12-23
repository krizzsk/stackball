package com.mbridge.msdk.foundation.same.net.p175d;

import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p177f.C6272c;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.c */
/* compiled from: JsonArrayRequest */
public class C6259c extends C6261e<JSONArray> {

    /* renamed from: c */
    private static final String f15531c = C6259c.class.getSimpleName();

    public C6259c(int i, String str, String str2, C6263e<JSONArray> eVar) {
        super(i, str, str2, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C6293k<JSONArray> mo43837a(C6272c cVar) {
        try {
            return C6293k.m15930a(new JSONArray(new String(cVar.f15553b, C6275b.m15857a(cVar.f15555d))), cVar);
        } catch (UnsupportedEncodingException e) {
            C6361q.m16158d(f15531c, e.getMessage());
            return C6293k.m15929a(new C6240a(8, cVar));
        } catch (JSONException e2) {
            C6361q.m16158d(f15531c, e2.getMessage());
            return C6293k.m15929a(new C6240a(8, cVar));
        }
    }
}
