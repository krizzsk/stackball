package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MAX_PENDING_METADATA_COUNT = 5;
    private static final int MSG_INVOKE_RENDERER = 0;
    private static final String TAG = "MetadataRenderer";
    private final MetadataInputBuffer buffer;
    private MetadataDecoder decoder;
    private final MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final MetadataOutput output;
    private final Handler outputHandler;
    private boolean outputStreamEnded;
    private final Metadata[] pendingMetadata;
    private int pendingMetadataCount;
    private int pendingMetadataIndex;
    private final long[] pendingMetadataTimestamps;
    private long subsampleOffsetUs;

    public String getName() {
        return TAG;
    }

    public boolean isReady() {
        return true;
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.DEFAULT);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        super(5);
        Handler handler;
        this.output = (MetadataOutput) Assertions.checkNotNull(metadataOutput);
        if (looper == null) {
            handler = null;
        } else {
            handler = Util.createHandler(looper, this);
        }
        this.outputHandler = handler;
        this.decoderFactory = (MetadataDecoderFactory) Assertions.checkNotNull(metadataDecoderFactory);
        this.buffer = new MetadataInputBuffer();
        this.pendingMetadata = new Metadata[5];
        this.pendingMetadataTimestamps = new long[5];
    }

    public int supportsFormat(Format format) {
        if (!this.decoderFactory.supportsFormat(format)) {
            return RendererCapabilities.CC.create(0);
        }
        return RendererCapabilities.CC.create(format.exoMediaCryptoType == null ? 4 : 2);
    }

    /* access modifiers changed from: protected */
    public void onStreamChanged(Format[] formatArr, long j, long j2) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
    }

    /* access modifiers changed from: protected */
    public void onPositionReset(long j, boolean z) {
        flushPendingMetadata();
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    public void render(long j, long j2) {
        if (!this.inputStreamEnded && this.pendingMetadataCount < 5) {
            this.buffer.clear();
            FormatHolder formatHolder = getFormatHolder();
            int readSource = readSource(formatHolder, this.buffer, false);
            if (readSource == -4) {
                if (this.buffer.isEndOfStream()) {
                    this.inputStreamEnded = true;
                } else {
                    this.buffer.subsampleOffsetUs = this.subsampleOffsetUs;
                    this.buffer.flip();
                    Metadata decode = ((MetadataDecoder) Util.castNonNull(this.decoder)).decode(this.buffer);
                    if (decode != null) {
                        ArrayList arrayList = new ArrayList(decode.length());
                        decodeWrappedMetadata(decode, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata((List<? extends Metadata.Entry>) arrayList);
                            int i = (this.pendingMetadataIndex + this.pendingMetadataCount) % 5;
                            this.pendingMetadata[i] = metadata;
                            this.pendingMetadataTimestamps[i] = this.buffer.timeUs;
                            this.pendingMetadataCount++;
                        }
                    }
                }
            } else if (readSource == -5) {
                this.subsampleOffsetUs = ((Format) Assertions.checkNotNull(formatHolder.format)).subsampleOffsetUs;
            }
        }
        if (this.pendingMetadataCount > 0) {
            long[] jArr = this.pendingMetadataTimestamps;
            int i2 = this.pendingMetadataIndex;
            if (jArr[i2] <= j) {
                invokeRenderer((Metadata) Util.castNonNull(this.pendingMetadata[i2]));
                Metadata[] metadataArr = this.pendingMetadata;
                int i3 = this.pendingMetadataIndex;
                metadataArr[i3] = null;
                this.pendingMetadataIndex = (i3 + 1) % 5;
                this.pendingMetadataCount--;
            }
        }
        if (this.inputStreamEnded && this.pendingMetadataCount == 0) {
            this.outputStreamEnded = true;
        }
    }

    private void decodeWrappedMetadata(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.length(); i++) {
            Format wrappedMetadataFormat = metadata.get(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                list.add(metadata.get(i));
            } else {
                MetadataDecoder createDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) Assertions.checkNotNull(metadata.get(i).getWrappedMetadataBytes());
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(bArr.length);
                ((ByteBuffer) Util.castNonNull(this.buffer.data)).put(bArr);
                this.buffer.flip();
                Metadata decode = createDecoder.decode(this.buffer);
                if (decode != null) {
                    decodeWrappedMetadata(decode, list);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDisabled() {
        flushPendingMetadata();
        this.decoder = null;
    }

    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    private void invokeRenderer(Metadata metadata) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void flushPendingMetadata() {
        Arrays.fill(this.pendingMetadata, (Object) null);
        this.pendingMetadataIndex = 0;
        this.pendingMetadataCount = 0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            invokeRendererInternal((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void invokeRendererInternal(Metadata metadata) {
        this.output.onMetadata(metadata);
    }
}
