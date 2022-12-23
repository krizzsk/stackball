package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tapjoy.internal.t */
public final class C9499t implements C9088bd {

    /* renamed from: a */
    public static final C9499t f23603a = new C9499t();

    /* renamed from: a */
    public final /* synthetic */ void mo57833a(OutputStream outputStream, Object obj) {
        if (!((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
            throw new RuntimeException();
        }
    }

    private C9499t() {
    }

    /* renamed from: a */
    public final Bitmap mo57832b(final InputStream inputStream) {
        try {
            return (Bitmap) C9508y.m25551a(new C9086bb() {
                public final /* synthetic */ Object call() {
                    InputStream inputStream = inputStream;
                    if (inputStream instanceof C9087bc) {
                        return BitmapFactory.decodeStream(inputStream);
                    }
                    return BitmapFactory.decodeStream(new C9087bc(inputStream));
                }
            });
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
