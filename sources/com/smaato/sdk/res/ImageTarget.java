package com.smaato.sdk.res;

import android.graphics.Bitmap;
import android.net.Uri;

public interface ImageTarget {
    void onFailure(Uri uri, Throwable th);

    void onSuccess(Uri uri, Bitmap bitmap);
}
