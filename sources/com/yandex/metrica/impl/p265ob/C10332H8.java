package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H8 */
public final class C10332H8 extends C10396J8 {

    /* renamed from: e */
    private final Set<String> f24821e = SetsKt.setOf("device_id", "device_id_hash", FirebaseAnalytics.Param.LOCATION_ID, "lbs_id", "referrer", "referrer_checked", "location_request_id", "last_migration_api_level");

    public C10332H8(Context context, C10442L0 l0) {
        super(context, "appmetrica_vital.dat", l0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<String> mo61428a() {
        return this.f24821e;
    }

    /* renamed from: b */
    public final synchronized void mo61435b(String str) {
        JSONObject put = mo61604b().put("device_id_hash", str);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_DEVICE_ID_HASH, value)");
        mo61603a(put);
    }

    /* renamed from: c */
    public final synchronized String mo61436c() {
        return C11993ym.m30992e(mo61604b(), "device_id");
    }

    /* renamed from: d */
    public final synchronized String mo61437d() {
        return C11993ym.m30992e(mo61604b(), "device_id_hash");
    }

    /* renamed from: e */
    public final synchronized int mo61438e() {
        return mo61604b().optInt("last_migration_api_level", -1);
    }

    /* renamed from: f */
    public final synchronized long mo61439f() {
        return mo61604b().optLong("location_request_id", -1);
    }

    /* renamed from: g */
    public final synchronized C10255Fg mo61440g() {
        C10255Fg fg;
        String e = C11993ym.m30992e(mo61604b(), "referrer");
        if (e != null) {
            try {
                byte[] bytes = e.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                fg = C10255Fg.m26312a(Base64.decode(bytes, 0));
            } catch (Throwable unused) {
            }
        }
        fg = null;
        return fg;
    }

    /* renamed from: h */
    public final synchronized boolean mo61441h() {
        return mo61604b().optBoolean("referrer_checked", false);
    }

    /* renamed from: a */
    public final synchronized void mo61432a(String str) {
        JSONObject put = mo61604b().put("device_id", str);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_DEVICE_ID, value)");
        mo61603a(put);
    }

    /* renamed from: a */
    public final synchronized void mo61431a(C10255Fg fg) {
        String str;
        JSONObject b = mo61604b();
        if (fg != null) {
            byte[] encode = Base64.encode(fg.mo61326a(), 0);
            Intrinsics.checkNotNullExpressionValue(encode, "Base64.encode(toProto(), 0)");
            str = new String(encode, Charsets.UTF_8);
        } else {
            str = null;
        }
        JSONObject put = b.put("referrer", str);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_…value?.toEncodedString())");
        mo61603a(put);
    }

    /* renamed from: a */
    public final synchronized void mo61434a(boolean z) {
        JSONObject put = mo61604b().put("referrer_checked", z);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_REFERRER_CHECKED, value)");
        mo61603a(put);
    }

    /* renamed from: a */
    public final synchronized void mo61430a(long j) {
        JSONObject put = mo61604b().put("location_request_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_…CATION_REQUEST_ID, value)");
        mo61603a(put);
    }

    /* renamed from: a */
    public final synchronized void mo61429a(int i) {
        JSONObject put = mo61604b().put("last_migration_api_level", i);
        Intrinsics.checkNotNullExpressionValue(put, "getOrLoadData().put(KEY_…GRATION_API_LEVEL, value)");
        mo61603a(put);
    }

    /* renamed from: a */
    public final synchronized void mo61433a(String str, String str2, String str3, Boolean bool, Long l, Long l2, Long l3, Integer num) {
        JSONObject put = new JSONObject().put("device_id", str).put("device_id_hash", str2).put("referrer", str3).put("referrer_checked", bool).put(FirebaseAnalytics.Param.LOCATION_ID, l).put("lbs_id", l2).put("location_request_id", l3).put("last_migration_api_level", num);
        Intrinsics.checkNotNullExpressionValue(put, "json");
        mo61603a(put);
    }
}
