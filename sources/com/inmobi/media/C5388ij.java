package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.inmobi.media.ij */
/* compiled from: BitmapDetector */
public class C5388ij {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f12341b = C5388ij.class.getSimpleName();

    /* renamed from: a */
    public final WeakReference<View> f12342a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final WeakReference<C5393a> f12343c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12344d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f12345e = false;

    /* renamed from: com.inmobi.media.ij$a */
    /* compiled from: BitmapDetector */
    public interface C5393a {
        /* renamed from: k */
        void mo40754k();

        /* renamed from: l */
        void mo40755l();
    }

    public C5388ij(View view, C5393a aVar) {
        this.f12343c = new WeakReference<>(aVar);
        this.f12342a = new WeakReference<>(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Bitmap m12480b(final View view) throws IllegalStateException {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            throw new IllegalStateException();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(createBitmap);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        view.post(new Runnable() {
            public final void run() {
                view.draw(canvas);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return createBitmap;
    }
}
