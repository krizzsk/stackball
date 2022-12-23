package com.yandex.metrica.impl.p265ob;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.B8 */
public class C10129B8 extends C11709r8 {
    public C10129B8(C11906w8 w8Var) {
        this(w8Var, C10619P0.m27164i().mo61897y().mo61658a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo61051a() {
        long optLong;
        C10332H8 f = mo63592f();
        synchronized (f) {
            optLong = f.mo61604b().optLong(FirebaseAnalytics.Param.LOCATION_ID, -1);
        }
        return optLong;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61052b(long j) {
        C10332H8 f = mo63592f();
        synchronized (f) {
            JSONObject put = f.mo61604b().put(FirebaseAnalytics.Param.LOCATION_ID, j);
            Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_LOCATION_ID, value)");
            f.mo61603a(put);
        }
    }

    /* renamed from: e */
    public String mo61053e() {
        return "l_dat";
    }

    C10129B8(C11906w8 w8Var, C10332H8 h8) {
        super(w8Var, h8);
    }
}
