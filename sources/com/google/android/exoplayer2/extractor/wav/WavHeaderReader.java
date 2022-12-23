package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    public static WavHeader peek(ExtractorInput extractorInput) throws IOException {
        byte[] bArr;
        Assertions.checkNotNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (ChunkHeader.peek(extractorInput, parsableByteArray).f10046id != 1380533830) {
            return null;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt != 1463899717) {
            Log.m9243e(TAG, "Unsupported RIFF format: " + readInt);
            return null;
        }
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.f10046id != 1718449184) {
            extractorInput.advancePeekPosition((int) peek.size);
            peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        Assertions.checkState(peek.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i = ((int) peek.size) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            extractorInput.peekFully(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        return new WavHeader(readLittleEndianUnsignedShort, readLittleEndianUnsignedShort2, readLittleEndianUnsignedIntToInt, readLittleEndianUnsignedIntToInt2, readLittleEndianUnsignedShort3, readLittleEndianUnsignedShort4, bArr);
    }

    public static Pair<Long, Long> skipToData(ExtractorInput extractorInput) throws IOException {
        Assertions.checkNotNull(extractorInput);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.f10046id != 1684108385) {
            if (!(peek.f10046id == 1380533830 || peek.f10046id == 1718449184)) {
                Log.m9247w(TAG, "Ignoring unknown WAV chunk: " + peek.f10046id);
            }
            long j = peek.size + 8;
            if (peek.f10046id == 1380533830) {
                j = 12;
            }
            if (j <= 2147483647L) {
                extractorInput.skipFully((int) j);
                peek = ChunkHeader.peek(extractorInput, parsableByteArray);
            } else {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + peek.f10046id);
            }
        }
        extractorInput.skipFully(8);
        long position = extractorInput.getPosition();
        long j2 = peek.size + position;
        long length = extractorInput.getLength();
        if (length != -1 && j2 > length) {
            Log.m9247w(TAG, "Data exceeds input length: " + j2 + ", " + length);
            j2 = length;
        }
        return Pair.create(Long.valueOf(position), Long.valueOf(j2));
    }

    private WavHeaderReader() {
    }

    private static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* renamed from: id */
        public final int f10046id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.f10046id = i;
            this.size = j;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }
}
