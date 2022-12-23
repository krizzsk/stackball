package com.fyber.inneractive.sdk.external;

public class InneractiveVideoError extends InneractiveError {

    /* renamed from: a */
    private final Error f6910a;

    /* renamed from: b */
    private Throwable f6911b;

    public InneractiveVideoError(Error error) {
        this.f6910a = error;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f6911b = th;
    }

    public Error getPlayerError() {
        return this.f6910a;
    }

    public Throwable getCause() {
        return this.f6911b;
    }

    public String description() {
        if (this.f6911b == null) {
            return this.f6910a.getErrorString();
        }
        return this.f6910a.getErrorString() + ": " + this.f6911b;
    }

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);
        

        /* renamed from: a */
        private String f6913a;

        /* renamed from: b */
        private boolean f6914b;

        private Error(String str, boolean z) {
            this.f6913a = str;
            this.f6914b = z;
        }

        public final String getErrorString() {
            return this.f6913a;
        }

        public final boolean isFatal() {
            return this.f6914b;
        }
    }
}
