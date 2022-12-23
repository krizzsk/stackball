package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;
    private ByteBuffer[] inputByteBuffers;
    private ByteBuffer[] outputByteBuffers;

    public static final class Factory implements MediaCodecAdapter.Factory {
        public MediaCodecAdapter createAdapter(MediaCodec mediaCodec) {
            return new SynchronousMediaCodecAdapter(mediaCodec);
        }
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec) {
        this.codec = mediaCodec;
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.codec.configure(mediaFormat, surface, mediaCrypto, i);
    }

    public void start() {
        this.codec.start();
        if (Util.SDK_INT < 21) {
            this.inputByteBuffers = this.codec.getInputBuffers();
            this.outputByteBuffers = this.codec.getOutputBuffers();
        }
    }

    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0);
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && Util.SDK_INT < 21) {
                this.outputByteBuffers = this.codec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    public ByteBuffer getInputBuffer(int i) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getInputBuffer(i);
        }
        return ((ByteBuffer[]) Util.castNonNull(this.inputByteBuffers))[i];
    }

    public ByteBuffer getOutputBuffer(int i) {
        if (Util.SDK_INT >= 21) {
            return this.codec.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) Util.castNonNull(this.outputByteBuffers))[i];
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.codec.queueInputBuffer(i, i2, i3, j, i4);
    }

    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.codec.queueSecureInputBuffer(i, i2, cryptoInfo.getFrameworkCryptoInfo(), j, i3);
    }

    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }

    public void flush() {
        this.codec.flush();
    }

    public void release() {
        this.inputByteBuffers = null;
        this.outputByteBuffers = null;
        this.codec.release();
    }

    public void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(onFrameRenderedListener) {
            public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                SynchronousMediaCodecAdapter.this.lambda$setOnFrameRenderedListener$0$SynchronousMediaCodecAdapter(this.f$1, mediaCodec, j, j2);
            }
        }, handler);
    }

    public /* synthetic */ void lambda$setOnFrameRenderedListener$0$SynchronousMediaCodecAdapter(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }
}
