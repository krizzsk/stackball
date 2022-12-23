package com.google.android.exoplayer2.source;

import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {
    private final InputReaderAdapterV30 inputReaderAdapter = new InputReaderAdapterV30();
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter = new OutputConsumerAdapterV30();
    private String parserName;

    public MediaParserExtractorAdapter() {
        MediaParser create = MediaParser.create(this.outputConsumerAdapter, new String[0]);
        this.mediaParser = create;
        create.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, true);
        this.mediaParser.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, true);
        this.mediaParser.setParameter(MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, true);
        this.parserName = "android.media.mediaparser.UNKNOWN";
    }

    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws IOException {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j2);
        this.inputReaderAdapter.setCurrentPosition(j);
        String parserName2 = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName2)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            String parserName3 = this.mediaParser.getParserName();
            this.parserName = parserName3;
            this.outputConsumerAdapter.setSelectedParserName(parserName3);
        } else if (!parserName2.equals(this.parserName)) {
            String parserName4 = this.mediaParser.getParserName();
            this.parserName = parserName4;
            this.outputConsumerAdapter.setSelectedParserName(parserName4);
        }
    }

    public void release() {
        this.mediaParser.release();
    }

    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    public void seek(long j, long j2) {
        this.inputReaderAdapter.setCurrentPosition(j);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.outputConsumerAdapter.getSeekPoints(j2);
        this.mediaParser.seek((MediaParser.SeekPoint) (((MediaParser.SeekPoint) seekPoints.second).position == j ? seekPoints.second : seekPoints.first));
    }

    public int read(PositionHolder positionHolder) throws IOException {
        boolean advance = this.mediaParser.advance(this.inputReaderAdapter);
        positionHolder.position = this.inputReaderAdapter.getAndResetSeekPosition();
        if (!advance) {
            return -1;
        }
        return positionHolder.position != -1 ? 1 : 0;
    }
}