package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.c51;
import com.yandex.mobile.ads.impl.l41;

public class fd0 extends l41<Bitmap> {

    /* renamed from: w */
    private static final Object f33327w = new Object();

    /* renamed from: q */
    private final Object f33328q = new Object();

    /* renamed from: r */
    private c51.C12700b<Bitmap> f33329r;

    /* renamed from: s */
    private final Bitmap.Config f33330s;

    /* renamed from: t */
    private final int f33331t;

    /* renamed from: u */
    private final int f33332u;

    /* renamed from: v */
    private final ImageView.ScaleType f33333v;

    public fd0(String str, c51.C12700b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, c51.C12699a aVar) {
        super(0, str, aVar);
        mo68330a(new C14602sk(1000, 2, 2.0f));
        this.f33329r = bVar;
        this.f33330s = config;
        this.f33331t = i;
        this.f33332u = i2;
        this.f33333v = scaleType;
    }

    /* renamed from: b */
    private c51<Bitmap> m35995b(fv0 fv0) {
        Bitmap bitmap;
        byte[] bArr = fv0.f33756b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f33331t == 0 && this.f33332u == 0) {
            options.inPreferredConfig = this.f33330s;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int a = m35994a(this.f33331t, this.f33332u, i, i2, this.f33333v);
            int a2 = m35994a(this.f33332u, this.f33331t, i2, i, this.f33333v);
            options.inJustDecodeBounds = false;
            float f = 1.0f;
            while (true) {
                float f2 = 2.0f * f;
                if (((double) f2) > Math.min(((double) i) / ((double) a), ((double) i2) / ((double) a2))) {
                    break;
                }
                f = f2;
            }
            options.inSampleSize = (int) f;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmap != null && (bitmap.getWidth() > a || bitmap.getHeight() > a2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a, a2, true);
                bitmap.recycle();
                bitmap = createScaledBitmap;
            }
        }
        if (bitmap == null) {
            return c51.m34588a(new iy0(fv0));
        }
        return c51.m34589a(bitmap, xb0.m43996a(fv0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo66996a(Object obj) {
        c51.C12700b<Bitmap> bVar;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.f33328q) {
            bVar = this.f33329r;
        }
        if (bVar != null) {
            bVar.mo64360a(bitmap);
        }
    }

    /* renamed from: g */
    public l41.C13833c mo66997g() {
        return l41.C13833c.LOW;
    }

    /* renamed from: a */
    private static int m35994a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = (double) i2;
                return ((double) i) * d < d2 ? (int) (d2 / d) : i;
            }
            double d3 = (double) i2;
            return ((double) i) * d > d3 ? (int) (d3 / d) : i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c51<Bitmap> mo66994a(fv0 fv0) {
        c51<Bitmap> b;
        synchronized (f33327w) {
            try {
                b = m35995b(fv0);
            } catch (OutOfMemoryError e) {
                pp1.m40900c("Caught OOM for %d byte image, url=%s", Integer.valueOf(fv0.f33756b.length), mo67768l());
                return c51.m34588a(new iy0((Throwable) e));
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    /* renamed from: a */
    public void mo66995a() {
        super.mo66995a();
        synchronized (this.f33328q) {
            this.f33329r = null;
        }
    }
}
