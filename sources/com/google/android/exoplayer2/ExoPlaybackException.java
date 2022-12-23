package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ExoPlaybackException extends Exception {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    private final Throwable cause;
    final boolean isRecoverable;
    public final MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final long timestampMs;
    public final int type;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, (Throwable) iOException);
    }

    public static ExoPlaybackException createForRenderer(Exception exc) {
        return new ExoPlaybackException(1, exc, (String) null, (String) null, -1, (Format) null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format, int i2) {
        return createForRenderer(th, str, i, format, i2, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format, int i2, boolean z) {
        return new ExoPlaybackException(1, th, (String) null, str, i, format, format == null ? 4 : i2, z);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, (Throwable) runtimeException);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, str);
    }

    private ExoPlaybackException(int i, Throwable th) {
        this(i, th, (String) null, (String) null, -1, (Format) null, 4, false);
    }

    private ExoPlaybackException(int i, String str) {
        this(i, (Throwable) null, str, (String) null, -1, (Format) null, 4, false);
    }

    private ExoPlaybackException(int i, Throwable th, String str, String str2, int i2, Format format, int i3, boolean z) {
        this(deriveMessage(i, str, str2, i2, format, i3), th, i, str2, i2, format, i3, (MediaPeriodId) null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(String str, Throwable th, int i, String str2, int i2, Format format, int i3, MediaPeriodId mediaPeriodId2, long j, boolean z) {
        super(str, th);
        this.type = i;
        this.cause = th;
        this.rendererName = str2;
        this.rendererIndex = i2;
        this.rendererFormat = format;
        this.rendererFormatSupport = i3;
        this.mediaPeriodId = mediaPeriodId2;
        this.timestampMs = j;
        this.isRecoverable = z;
    }

    public IOException getSourceException() {
        Assertions.checkState(this.type == 0);
        return (IOException) Assertions.checkNotNull(this.cause);
    }

    public Exception getRendererException() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        Assertions.checkState(z);
        return (Exception) Assertions.checkNotNull(this.cause);
    }

    public RuntimeException getUnexpectedException() {
        Assertions.checkState(this.type == 2);
        return (RuntimeException) Assertions.checkNotNull(this.cause);
    }

    /* access modifiers changed from: package-private */
    public ExoPlaybackException copyWithMediaPeriodId(MediaPeriodId mediaPeriodId2) {
        return new ExoPlaybackException(getMessage(), this.cause, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId2, this.timestampMs, this.isRecoverable);
    }

    private static String deriveMessage(int i, String str, String str2, int i2, Format format, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + format + ", format_supported=" + C3716C.getFormatSupportString(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }
}
