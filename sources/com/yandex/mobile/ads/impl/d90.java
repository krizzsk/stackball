package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public class d90 {

    /* renamed from: b */
    public static final C12863a f32493b = new C12863a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static volatile d90 f32494c;

    /* renamed from: d */
    private static final Object f32495d = new Object();

    /* renamed from: a */
    private final SharedPreferences f32496a;

    /* renamed from: com.yandex.mobile.ads.impl.d90$a */
    public static final class C12863a {
        private C12863a() {
        }

        public /* synthetic */ C12863a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d90(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32496a = context.getApplicationContext().getSharedPreferences("YadPreferenceFile", 0);
    }

    @JvmStatic
    /* renamed from: a */
    public static final d90 m35155a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f32494c == null) {
            synchronized (f32495d) {
                if (f32494c == null) {
                    f32494c = new d90(context);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        d90 d90 = f32494c;
        if (d90 != null) {
            return d90;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: b */
    public void mo66534b(C14743u6 u6Var) {
        String str = null;
        String string = this.f32496a.getString("google_advertising_id_key", (String) null);
        if (u6Var != null) {
            str = u6Var.mo70292a();
        }
        if (string == null && str != null) {
            this.f32496a.edit().putString("google_advertising_id_key", str).apply();
        }
    }

    /* renamed from: a */
    public boolean mo66533a(C14743u6 u6Var) {
        String a = u6Var == null ? null : u6Var.mo70292a();
        boolean z = false;
        if (a == null) {
            return false;
        }
        synchronized (f32495d) {
            String string = this.f32496a.getString("google_advertising_id_key", (String) null);
            if (string != null && !Intrinsics.areEqual((Object) a, (Object) string)) {
                z = true;
            }
        }
        return z;
    }
}
