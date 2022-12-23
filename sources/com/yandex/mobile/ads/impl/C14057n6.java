package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.n6 */
public class C14057n6 implements C13279h6 {

    /* renamed from: a */
    private final String f37646a;

    /* renamed from: b */
    private final Runnable f37647b;

    public C14057n6(String str, Runnable runnable) {
        this.f37646a = str;
        this.f37647b = runnable;
    }

    /* renamed from: a */
    public boolean mo67419a(String str, String str2) {
        return "mobileads".equals(str) && this.f37646a.equals(str2);
    }

    /* renamed from: a */
    public void mo67418a() {
        this.f37647b.run();
    }
}
