package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.dm0;
import com.yandex.mobile.ads.impl.fl0;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.kj1;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.d */
class C15446d {

    /* renamed from: a */
    private final C15443a f43648a;

    C15446d(C15443a aVar) {
        this.f43648a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public dm0 mo71457a(Map<String, Bitmap> map, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdMedia mediatedNativeAdMedia) {
        ArrayList arrayList;
        hd0 a = this.f43648a.mo71455a(map, mediatedNativeAdImage);
        fl0 fl0 = mediatedNativeAdMedia != null ? new fl0((String) null, mediatedNativeAdMedia.getAspectRatio()) : null;
        if (a != null) {
            arrayList = new ArrayList();
            arrayList.add(a);
        } else {
            arrayList = null;
        }
        if (a == null && fl0 == null) {
            return null;
        }
        return new dm0(fl0, (kj1) null, arrayList);
    }
}
