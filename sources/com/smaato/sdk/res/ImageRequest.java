package com.smaato.sdk.res;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.io.IOException;

public interface ImageRequest {
    Bitmap blockingGet() throws IOException;

    void into(ImageView imageView);

    void into(ImageTarget imageTarget);
}
