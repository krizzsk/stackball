package com.amazon.device.ads;

import android.graphics.Bitmap;

class ImageResponseReader extends ResponseReader {
    final GraphicsUtils graphicsUtils;

    ImageResponseReader(ResponseReader responseReader, GraphicsUtils graphicsUtils2) {
        super(responseReader.getInputStream());
        this.graphicsUtils = graphicsUtils2;
    }

    public Bitmap readAsBitmap() {
        return this.graphicsUtils.createBitmapImage(getInputStream());
    }
}
