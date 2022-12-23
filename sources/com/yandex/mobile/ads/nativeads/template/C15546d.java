package com.yandex.mobile.ads.nativeads.template;

import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.nativeads.C15511m0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* renamed from: com.yandex.mobile.ads.nativeads.template.d */
public class C15546d {

    /* renamed from: a */
    private final NativeAdImage f44067a;

    /* renamed from: b */
    private final NativeAdImage f44068b;

    /* renamed from: c */
    private final NativeAdImage f44069c;

    /* renamed from: d */
    private final NativeAdMedia f44070d;

    /* renamed from: e */
    private final C15511m0 f44071e;

    public C15546d(NativeAdAssets nativeAdAssets, NativeAdType nativeAdType) {
        this.f44067a = nativeAdAssets.getFavicon();
        this.f44068b = nativeAdAssets.getIcon();
        this.f44069c = nativeAdAssets.getImage();
        this.f44070d = nativeAdAssets.getMedia();
        this.f44071e = new mt0().mo68857a(nativeAdType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo71902a(NativeAdImage nativeAdImage) {
        return "fill".equals(nativeAdImage.mo71532a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo71904b(NativeAdImage nativeAdImage) {
        return "large".equals(nativeAdImage.mo71532a()) || "wide".equals(nativeAdImage.mo71532a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo71905c() {
        if (this.f44068b != null) {
            if ((C15511m0.APP_INSTALL == this.f44071e) || !mo71908f()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f44069c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71906d() {
        /*
            r1 = this;
            boolean r0 = r1.mo71907e()
            if (r0 != 0) goto L_0x0012
            com.yandex.mobile.ads.nativeads.NativeAdImage r0 = r1.f44069c
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.mo71904b(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.template.C15546d.mo71906d():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo71907e() {
        return this.f44070d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo71908f() {
        NativeAdImage nativeAdImage;
        if (!mo71907e() && (nativeAdImage = this.f44069c) != null && !mo71904b(nativeAdImage)) {
            if (!(C15511m0.APP_INSTALL == this.f44071e)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f44069c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71901a() {
        /*
            r1 = this;
            boolean r0 = r1.mo71907e()
            if (r0 != 0) goto L_0x0012
            com.yandex.mobile.ads.nativeads.NativeAdImage r0 = r1.f44069c
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.mo71902a(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.template.C15546d.mo71901a():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.f44069c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71903b() {
        /*
            r4 = this;
            boolean r0 = r4.mo71907e()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0015
            com.yandex.mobile.ads.nativeads.NativeAdImage r0 = r4.f44069c
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.mo71904b(r0)
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            boolean r3 = r4.mo71905c()
            if (r3 != 0) goto L_0x0023
            com.yandex.mobile.ads.nativeads.NativeAdImage r3 = r4.f44067a
            if (r3 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.nativeads.template.C15546d.mo71903b():boolean");
    }
}
