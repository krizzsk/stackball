package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.MediaView;

/* renamed from: com.yandex.mobile.ads.impl.m9 */
class C13961m9 {

    /* renamed from: a */
    private final ed0 f37262a;

    /* renamed from: b */
    private final hm0 f37263b;

    /* renamed from: c */
    private final ht0 f37264c;

    C13961m9(ed0 ed0, hm0 hm0, ht0 ht0) {
        this.f37262a = ed0;
        this.f37263b = hm0;
        this.f37264c = ht0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13838l9<String> mo68621a(TextView textView) {
        pd1 pd1 = textView != null ? new pd1(textView) : null;
        if (pd1 != null) {
            return new C15254yj(pd1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C13838l9<hd0> mo68622b(ImageView imageView) {
        od0 od0 = imageView != null ? new od0(imageView, this.f37262a) : null;
        if (od0 != null) {
            return new tc0(od0);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13838l9<dm0> mo68620a(ImageView imageView, MediaView mediaView) {
        od0 od0 = imageView != null ? new od0(imageView, this.f37262a) : null;
        gm0 a = mediaView != null ? this.f37263b.mo67567a(mediaView, this.f37262a, this.f37264c) : null;
        if (od0 == null && a == null) {
            return null;
        }
        return new il0(od0, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13838l9<r60> mo68619a(ImageView imageView) {
        t60 t60 = imageView != null ? new t60(imageView, this.f37262a) : null;
        if (t60 != null) {
            return new tc0(t60);
        }
        return null;
    }
}
