package com.facebook.internal;

import android.graphics.Bitmap;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo72093d2 = {"Lcom/facebook/internal/ImageResponse;", "", "request", "Lcom/facebook/internal/ImageRequest;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isCachedRedirect", "", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/facebook/internal/ImageRequest;Ljava/lang/Exception;ZLandroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getError", "()Ljava/lang/Exception;", "()Z", "getRequest", "()Lcom/facebook/internal/ImageRequest;", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: ImageResponse.kt */
public final class ImageResponse {
    private final Bitmap bitmap;
    private final Exception error;
    private final boolean isCachedRedirect;
    private final ImageRequest request;

    public ImageResponse(ImageRequest imageRequest, Exception exc, boolean z, Bitmap bitmap2) {
        Intrinsics.checkNotNullParameter(imageRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        this.request = imageRequest;
        this.error = exc;
        this.isCachedRedirect = z;
        this.bitmap = bitmap2;
    }

    public final ImageRequest getRequest() {
        return this.request;
    }

    public final Exception getError() {
        return this.error;
    }

    public final boolean isCachedRedirect() {
        return this.isCachedRedirect;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }
}
