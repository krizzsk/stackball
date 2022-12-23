package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

public final class ll1 {

    /* renamed from: c */
    static final /* synthetic */ KProperty<Object>[] f36742c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ll1.class), "status", "getStatus()Lcom/yandex/mobile/ads/instream/status/VideoAdStatus;"))};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Set<kl1> f36743a;

    /* renamed from: b */
    private final ReadWriteProperty f36744b;

    /* renamed from: com.yandex.mobile.ads.impl.ll1$a */
    public static final class C13863a extends ObservableProperty<kl1> {

        /* renamed from: a */
        final /* synthetic */ ll1 f36745a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13863a(Object obj, Object obj2, ll1 ll1) {
            super(obj2);
            this.f36745a = ll1;
        }

        /* access modifiers changed from: protected */
        public void afterChange(KProperty<?> kProperty, kl1 kl1, kl1 kl12) {
            Intrinsics.checkNotNullParameter(kProperty, "property");
            kl1 kl13 = kl1;
            this.f36745a.f36743a.add(kl12);
        }
    }

    public ll1() {
        kl1 kl1 = kl1.INITIAL;
        this.f36743a = SetsKt.mutableSetOf(kl1);
        Delegates delegates = Delegates.INSTANCE;
        this.f36744b = new C13863a(kl1, kl1, this);
    }

    /* renamed from: b */
    public final void mo68489b(kl1 kl1) {
        Intrinsics.checkNotNullParameter(kl1, "<set-?>");
        this.f36744b.setValue(this, f36742c[0], kl1);
    }

    /* renamed from: a */
    public final kl1 mo68486a() {
        return (kl1) this.f36744b.getValue(this, f36742c[0]);
    }

    /* renamed from: b */
    public final void mo68488b() {
        this.f36743a.clear();
        mo68489b(kl1.INITIAL);
    }

    /* renamed from: a */
    public final boolean mo68487a(kl1 kl1) {
        Intrinsics.checkNotNullParameter(kl1, "videoAdStatus");
        return this.f36743a.contains(kl1);
    }
}
