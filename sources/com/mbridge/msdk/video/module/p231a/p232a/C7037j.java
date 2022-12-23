package com.mbridge.msdk.video.module.p231a.p232a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C6360p;

/* renamed from: com.mbridge.msdk.video.module.a.a.j */
/* compiled from: RoundedImageLoaderListener */
public final class C7037j extends C7032e {

    /* renamed from: a */
    private int f17508a;

    public C7037j(ImageView imageView, int i) {
        super(imageView);
        this.f17508a = i;
    }

    public final void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap a;
        if (bitmap != null) {
            try {
                if (this.f17504b != null && !bitmap.isRecycled() && (a = C6360p.m16152a(bitmap, 1, this.f17508a)) != null) {
                    this.f17504b.setImageBitmap(a);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }
}
