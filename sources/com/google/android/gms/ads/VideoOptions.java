package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class VideoOptions {
    private final boolean zzacy;
    private final boolean zzacz;
    private final boolean zzada;

    public VideoOptions(zzze zzze) {
        this.zzacy = zzze.zzacy;
        this.zzacz = zzze.zzacz;
        this.zzada = zzze.zzada;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public boolean zzacy = true;
        /* access modifiers changed from: private */
        public boolean zzacz = false;
        /* access modifiers changed from: private */
        public boolean zzada = false;

        public final Builder setStartMuted(boolean z) {
            this.zzacy = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzacz = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzada = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzacy = builder.zzacy;
        this.zzacz = builder.zzacz;
        this.zzada = builder.zzada;
    }

    public final boolean getStartMuted() {
        return this.zzacy;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzacz;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzada;
    }
}
