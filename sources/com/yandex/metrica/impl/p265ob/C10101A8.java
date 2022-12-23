package com.yandex.metrica.impl.p265ob;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.A8 */
public class C10101A8 extends C11709r8 {
    public C10101A8(C11906w8 w8Var) {
        this(w8Var, C10619P0.m27164i().mo61897y().mo61658a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo61051a() {
        long optLong;
        C10332H8 f = mo63592f();
        synchronized (f) {
            optLong = f.mo61604b().optLong("lbs_id", -1);
        }
        return optLong;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61052b(long j) {
        C10332H8 f = mo63592f();
        synchronized (f) {
            JSONObject put = f.mo61604b().put("lbs_id", j);
            Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_LBS_ID, value)");
            f.mo61603a(put);
        }
    }

    /* renamed from: e */
    public String mo61053e() {
        return "lbs_dat";
    }

    C10101A8(C11906w8 w8Var, C10332H8 h8) {
        super(w8Var, h8);
    }
}
