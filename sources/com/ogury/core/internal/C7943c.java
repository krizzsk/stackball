package com.ogury.core.internal;

import com.adcolony.sdk.AdColonyAppOptions;

/* renamed from: com.ogury.core.internal.c */
/* compiled from: OguryFrameworkChecker.kt */
public final class C7943c {

    /* renamed from: a */
    private C7998w f20702a;

    /* renamed from: b */
    private final C7978f f20703b;

    static {
        new C7944a((byte) 0);
    }

    public C7943c() {
        this((C7978f) null, 1);
    }

    private C7943c(C7978f fVar) {
        C7998w wVar;
        C7921ai.m22144b(fVar, "reflectionUtil");
        this.f20703b = fVar;
        if (C7978f.m22233a("com.unity3d.player.UnityPlayer")) {
            wVar = new C7998w(1, AdColonyAppOptions.UNITY);
        } else if (C7978f.m22233a("org.apache.cordova.CordovaWebView")) {
            wVar = new C7998w(2, "Cordova");
        } else if (C7978f.m22233a("mono.android.Runtime")) {
            wVar = new C7998w(3, "Xamarin");
        } else if (C7978f.m22233a("com.adobe.fre.FREFunction")) {
            wVar = new C7998w(4, "Adobe Air");
        } else {
            wVar = new C7998w(0, "Native");
        }
        this.f20702a = wVar;
    }

    public /* synthetic */ C7943c(C7978f fVar, int i) {
        this(new C7978f());
    }

    /* renamed from: com.ogury.core.internal.c$a */
    /* compiled from: OguryFrameworkChecker.kt */
    public static final class C7944a {
        private C7944a() {
        }

        public /* synthetic */ C7944a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo52909a() {
        return this.f20702a.mo53046a();
    }

    /* renamed from: b */
    public final String mo52910b() {
        return this.f20702a.mo53047b();
    }
}
