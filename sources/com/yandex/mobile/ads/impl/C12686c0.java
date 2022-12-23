package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* renamed from: com.yandex.mobile.ads.impl.c0 */
public class C12686c0 {

    /* renamed from: a */
    private final AdResponse<String> f31746a;

    /* renamed from: b */
    private final z70 f31747b;

    /* renamed from: c */
    private final NativeAd f31748c;

    /* renamed from: d */
    private final int f31749d;

    /* renamed from: com.yandex.mobile.ads.impl.c0$a */
    public static class C12687a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final AdResponse<String> f31750a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public z70 f31751b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public NativeAd f31752c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f31753d = 0;

        public C12687a(AdResponse<String> adResponse) {
            this.f31750a = adResponse;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12687a mo66174a(z70 z70) {
            this.f31751b = z70;
            return this;
        }

        /* renamed from: a */
        public C12687a mo66175a(NativeAd nativeAd) {
            this.f31752c = nativeAd;
            return this;
        }

        /* renamed from: a */
        public C12687a mo66173a(int i) {
            this.f31753d = i;
            return this;
        }
    }

    public C12686c0(C12687a aVar) {
        this.f31746a = aVar.f31750a;
        this.f31747b = aVar.f31751b;
        this.f31748c = aVar.f31752c;
        this.f31749d = aVar.f31753d;
    }

    /* renamed from: a */
    public AdResponse<String> mo66169a() {
        return this.f31746a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public z70 mo66170b() {
        return this.f31747b;
    }

    /* renamed from: c */
    public NativeAd mo66171c() {
        return this.f31748c;
    }

    /* renamed from: d */
    public int mo66172d() {
        return this.f31749d;
    }
}
