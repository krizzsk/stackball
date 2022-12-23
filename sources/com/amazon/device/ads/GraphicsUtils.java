package com.amazon.device.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

class GraphicsUtils {
    private static final String LOGTAG = GraphicsUtils.class.getSimpleName();
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    GraphicsUtils() {
    }

    public Bitmap createBitmapImage(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 32768);
        bufferedInputStream.mark(32768);
        Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream);
        try {
            bufferedInputStream.close();
        } catch (IOException unused) {
            this.logger.mo10939e("IOException while trying to close the input stream.");
        }
        return decodeStream;
    }

    public String insertImageInMediaStore(Context context, Bitmap bitmap, String str, String str2) {
        return MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, str, str2);
    }
}
