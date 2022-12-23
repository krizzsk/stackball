package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.hd0;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.a */
class C15443a {

    /* renamed from: a */
    private final C15445c f43645a;

    /* renamed from: b */
    private final C15444b f43646b;

    C15443a(Context context, C15445c cVar) {
        this.f43645a = cVar;
        this.f43646b = new C15444b(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public hd0 mo71455a(Map<String, Bitmap> map, MediatedNativeAdImage mediatedNativeAdImage) {
        if (mediatedNativeAdImage == null) {
            return null;
        }
        String url = mediatedNativeAdImage.getUrl();
        int width = mediatedNativeAdImage.getWidth();
        int height = mediatedNativeAdImage.getHeight();
        this.f43645a.getClass();
        if (width > 0 && height > 0) {
            String a = this.f43646b.mo71456a(width, height);
            hd0 hd0 = new hd0();
            hd0.mo67522b(url);
            hd0.mo67521b(width);
            hd0.mo67517a(height);
            hd0.mo67519a(a);
            return hd0;
        }
        Bitmap bitmap = map.get(url);
        if (bitmap == null) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        String a2 = this.f43646b.mo71456a(width2, height2);
        hd0 hd02 = new hd0();
        hd02.mo67522b(url);
        hd02.mo67521b(width2);
        hd02.mo67517a(height2);
        hd02.mo67519a(a2);
        return hd02;
    }
}
