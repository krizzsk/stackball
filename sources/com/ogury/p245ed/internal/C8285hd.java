package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.hd */
public final class C8285hd {

    /* renamed from: a */
    public static final C8285hd f21403a = new C8285hd();

    /* renamed from: a */
    private static String m23305a() {
        return "window.MRAID_ENV =  { version: '3.0', sdk: 'Presage', sdkVersion: '4.2.0'};";
    }

    private C8285hd() {
    }

    /* renamed from: b */
    private static String m23307b(C8195ek ekVar) {
        return "window.MRAID_ENV =  { version: '3.0', sdk: 'Presage', sdkVersion: '4.2.0', adUnit: { type: '" + ekVar.mo53412c() + "', reward : { name: '" + ekVar.mo53416e().getName() + "', value: '" + ekVar.mo53416e().getValue() + "', launch: '" + ekVar.mo53414d() + "'}}};";
    }

    /* renamed from: a */
    public static String m23306a(C8195ek ekVar) {
        if (ekVar == null || !C8467mq.m23880a((Object) ekVar.mo53412c(), (Object) "optin_video")) {
            return m23305a();
        }
        return m23307b(ekVar);
    }
}
