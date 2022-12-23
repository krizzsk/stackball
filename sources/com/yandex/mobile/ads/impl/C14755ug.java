package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* renamed from: com.yandex.mobile.ads.impl.ug */
public class C14755ug {

    /* renamed from: a */
    private final NativeAdAssets f40640a;

    /* renamed from: b */
    private final qq0 f40641b = new qq0();

    /* renamed from: c */
    private final int f40642c;

    /* renamed from: com.yandex.mobile.ads.impl.ug$a */
    private enum C14756a {
        FAVICON,
        ICON,
        THUMB
    }

    public C14755ug(NativeAdAssets nativeAdAssets, int i) {
        this.f40640a = nativeAdAssets;
        this.f40642c = i;
    }

    /* renamed from: a */
    public ImageView mo70347a(View view) {
        return m42680a(view, C14756a.FAVICON, this.f40640a.getFavicon());
    }

    /* renamed from: b */
    public ImageView mo70348b(View view) {
        return m42680a(view, C14756a.ICON, this.f40640a.getIcon());
    }

    /* renamed from: a */
    private ImageView m42680a(View view, C14756a aVar, NativeAdImage nativeAdImage) {
        C14756a aVar2;
        NativeAdImage icon = this.f40640a.getIcon();
        NativeAdImage favicon = this.f40640a.getFavicon();
        if (icon != null) {
            aVar2 = C14756a.ICON;
        } else if (favicon != null) {
            aVar2 = C14756a.FAVICON;
        } else {
            aVar2 = C14756a.THUMB;
        }
        if (nativeAdImage == null || aVar2 != aVar) {
            return null;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        int i = this.f40642c;
        if (i > width || i > height) {
            this.f40641b.getClass();
            return (ImageView) view.findViewById(C12066R.C12068id.icon_small);
        }
        this.f40641b.getClass();
        return (ImageView) view.findViewById(C12066R.C12068id.icon_large);
    }
}
