package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.core.internal.d */
/* compiled from: SdkType.kt */
public final class C7974d {

    /* renamed from: a */
    public static final C7975a f20766a = new C7975a((byte) 0);

    /* renamed from: b */
    private final SharedPreferences f20767b;

    public C7974d(Context context) {
        C7921ai.m22144b(context, "context");
        this.f20767b = context.getSharedPreferences("ogury_core_sdk_type_file", 0);
    }

    /* renamed from: com.ogury.core.internal.d$a */
    /* compiled from: SdkType.kt */
    public static final class C7975a {
        private C7975a() {
        }

        public /* synthetic */ C7975a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C7974d m22231a(Context context) {
            C7921ai.m22144b(context, "context");
            return new C7974d(context);
        }
    }

    /* renamed from: a */
    public final void mo52962a(int i) {
        this.f20767b.edit().putInt(TapjoyConstants.TJC_SDK_TYPE, i).apply();
    }

    /* renamed from: a */
    public final int mo52961a() {
        return this.f20767b.getInt(TapjoyConstants.TJC_SDK_TYPE, 0);
    }
}
