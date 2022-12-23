package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.hz0;
import com.yandex.mobile.ads.impl.i20;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.h */
class C15453h {

    /* renamed from: a */
    private final i20 f43658a = new i20();

    /* renamed from: b */
    private final C15445c f43659b = new C15445c();

    /* renamed from: c */
    private final Point f43660c;

    C15453h(Context context) {
        this.f43660c = hz0.m37246a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Set<hd0> mo71465a(List<MediatedNativeAdImage> list) {
        HashSet hashSet = new HashSet();
        for (MediatedNativeAdImage next : list) {
            String url = next.getUrl();
            int width = next.getWidth();
            int height = next.getHeight();
            if (!TextUtils.isEmpty(url)) {
                this.f43659b.getClass();
                if (!(width > 0 && height > 0)) {
                    hd0 hd0 = new hd0();
                    hd0.mo67522b(url);
                    hd0.mo67521b(this.f43660c.x);
                    hd0.mo67517a(this.f43660c.y);
                    hashSet.add(hd0);
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<String, Bitmap> mo71466b(List<MediatedNativeAdImage> list) {
        Bitmap bitmap;
        HashMap hashMap = new HashMap();
        for (MediatedNativeAdImage next : list) {
            Drawable drawable = next.getDrawable();
            String url = next.getUrl();
            if (drawable != null && !TextUtils.isEmpty(url)) {
                this.f43658a.getClass();
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int i = 128;
                    if (intrinsicWidth <= 0) {
                        intrinsicWidth = 128;
                    }
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicHeight > 0) {
                        i = intrinsicHeight;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = createBitmap;
                }
                if (bitmap != null) {
                    hashMap.put(url, bitmap);
                }
            }
        }
        return hashMap;
    }
}
