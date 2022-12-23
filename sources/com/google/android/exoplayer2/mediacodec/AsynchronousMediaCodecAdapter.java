package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.common.base.Supplier;
import java.nio.ByteBuffer;
import java.util.Objects;

final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int STATE_CONFIGURED = 1;
    private static final int STATE_CREATED = 0;
    private static final int STATE_SHUT_DOWN = 3;
    private static final int STATE_STARTED = 2;
    private final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final AsynchronousMediaCodecBufferEnqueuer bufferEnqueuer;
    private final MediaCodec codec;
    private boolean codecReleased;
    private int state;
    private final boolean synchronizeCodecInteractionsWithQueueing;

    public static final class Factory implements MediaCodecAdapter.Factory {
        private final Supplier<HandlerThread> callbackThreadSupplier;
        private final boolean forceQueueingSynchronizationWorkaround;
        private final Supplier<HandlerThread> queueingThreadSupplier;
        private final boolean synchronizeCodecInteractionsWithQueueing;

        public Factory(int i) {
            this(i, false, false);
        }

        public Factory(int i, boolean z, boolean z2) {
            this(new Supplier(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.lambda$new$0(this.f$0);
                }
            }, new Supplier(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.lambda$new$1(this.f$0);
                }
            }, z, z2);
        }

        static /* synthetic */ HandlerThread lambda$new$0(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i));
        }

        static /* synthetic */ HandlerThread lambda$new$1(int i) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i));
        }

        Factory(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z, boolean z2) {
            this.callbackThreadSupplier = supplier;
            this.queueingThreadSupplier = supplier2;
            this.forceQueueingSynchronizationWorkaround = z;
            this.synchronizeCodecInteractionsWithQueueing = z2;
        }

        public AsynchronousMediaCodecAdapter createAdapter(MediaCodec mediaCodec) {
            return new AsynchronousMediaCodecAdapter(mediaCodec, this.callbackThreadSupplier.get(), this.queueingThreadSupplier.get(), this.forceQueueingSynchronizationWorkaround, this.synchronizeCodecInteractionsWithQueueing);
        }
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, handlerThread2, z);
        this.synchronizeCodecInteractionsWithQueueing = z2;
        this.state = 0;
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        this.codec.configure(mediaFormat, surface, mediaCrypto, i);
        this.state = 1;
    }

    public void start() {
        this.bufferEnqueuer.start();
        this.codec.start();
        this.state = 2;
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.bufferEnqueuer.queueInputBuffer(i, i2, i3, j, i4);
    }

    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.bufferEnqueuer.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
    }

    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }

    public int dequeueInputBufferIndex() {
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    public MediaFormat getOutputFormat() {
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    public ByteBuffer getInputBuffer(int i) {
        return this.codec.getInputBuffer(i);
    }

    public ByteBuffer getOutputBuffer(int i) {
        return this.codec.getOutputBuffer(i);
    }

    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback2 = this.asynchronousMediaCodecCallback;
        MediaCodec mediaCodec = this.codec;
        Objects.requireNonNull(mediaCodec);
        asynchronousMediaCodecCallback2.flushAsync(new Runnable(mediaCodec) {
            public final /* synthetic */ MediaCodec f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.start();
            }
        });
    }

    public void release() {
        try {
            if (this.state == 2) {
                this.bufferEnqueuer.shutdown();
            }
            if (this.state == 1 || this.state == 2) {
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 3;
        } finally {
            if (!this.codecReleased) {
                this.codec.release();
                this.codecReleased = true;
            }
        }
    }

    public void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        maybeBlockOnQueueing();
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(onFrameRenderedListener) {
            public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                AsynchronousMediaCodecAdapter.this.mo21261x6c32d66f(this.f$1, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* renamed from: lambda$setOnFrameRenderedListener$0$AsynchronousMediaCodecAdapter */
    public /* synthetic */ void mo21261x6c32d66f(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    public void setOutputSurface(Surface surface) {
        maybeBlockOnQueueing();
        this.codec.setOutputSurface(surface);
    }

    public void setParameters(Bundle bundle) {
        maybeBlockOnQueueing();
        this.codec.setParameters(bundle);
    }

    public void setVideoScalingMode(int i) {
        maybeBlockOnQueueing();
        this.codec.setVideoScalingMode(i);
    }

    /* access modifiers changed from: package-private */
    public void onError(MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    /* access modifiers changed from: package-private */
    public void onOutputFormatChanged(MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    private void maybeBlockOnQueueing() {
        if (this.synchronizeCodecInteractionsWithQueueing) {
            try {
                this.bufferEnqueuer.waitUntilQueueingComplete();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    public static String createCallbackThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    public static String createQueueingThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String createThreadLabel(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }
}
