package com.mbridge.msdk.foundation.same.net.p175d;

import com.mbridge.msdk.foundation.same.net.C6263e;
import com.mbridge.msdk.foundation.same.net.C6290i;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p177f.C6272c;
import com.mbridge.msdk.foundation.same.net.p178g.C6275b;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.io.UnsupportedEncodingException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.f */
/* compiled from: StringRequest */
public class C6262f extends C6290i<String> {

    /* renamed from: c */
    private static final String f15535c = C6262f.class.getSimpleName();

    /* renamed from: d */
    private String f15536d;

    public C6262f(int i, String str, String str2, C6263e<String> eVar) {
        super(i, str, eVar);
        this.f15536d = str2;
    }

    /* renamed from: e */
    public final byte[] mo43844e() {
        try {
            if (this.f15536d == null) {
                return null;
            }
            return this.f15536d.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C6293k<String> mo43837a(C6272c cVar) {
        try {
            return C6293k.m15930a(new String(cVar.f15553b, C6275b.m15857a(cVar.f15555d)), cVar);
        } catch (UnsupportedEncodingException e) {
            C6361q.m16158d(f15535c, e.getMessage());
            return C6293k.m15929a(new C6240a(8, cVar));
        }
    }
}
