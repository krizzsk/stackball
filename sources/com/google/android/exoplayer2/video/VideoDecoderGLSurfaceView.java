package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class VideoDecoderGLSurfaceView extends GLSurfaceView {
    private final VideoDecoderGLFrameRenderer renderer;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.renderer = new VideoDecoderGLFrameRenderer(this);
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(this.renderer);
        setRenderMode(0);
    }

    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this.renderer;
    }
}
