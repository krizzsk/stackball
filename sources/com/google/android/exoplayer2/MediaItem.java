package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class MediaItem {
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    public final PlaybackProperties playbackProperties;

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }

    public static final class Builder {
        private Uri adTagUri;
        private Object adsId;
        private long clipEndPositionMs;
        private boolean clipRelativeToDefaultPosition;
        private boolean clipRelativeToLiveWindow;
        private long clipStartPositionMs;
        private boolean clipStartsAtKeyFrame;
        private String customCacheKey;
        private boolean drmForceDefaultLicenseUri;
        private byte[] drmKeySetId;
        private Map<String, String> drmLicenseRequestHeaders;
        private Uri drmLicenseUri;
        private boolean drmMultiSession;
        private boolean drmPlayClearContentWithoutKey;
        private List<Integer> drmSessionForClearTypes;
        private UUID drmUuid;
        private long liveMaxOffsetMs;
        private float liveMaxPlaybackSpeed;
        private long liveMinOffsetMs;
        private float liveMinPlaybackSpeed;
        private long liveTargetOffsetMs;
        private String mediaId;
        private MediaMetadata mediaMetadata;
        private String mimeType;
        private List<StreamKey> streamKeys;
        private List<Subtitle> subtitles;
        private Object tag;
        private Uri uri;

        public Builder() {
            this.clipEndPositionMs = Long.MIN_VALUE;
            this.drmSessionForClearTypes = Collections.emptyList();
            this.drmLicenseRequestHeaders = Collections.emptyMap();
            this.streamKeys = Collections.emptyList();
            this.subtitles = Collections.emptyList();
            this.liveTargetOffsetMs = -9223372036854775807L;
            this.liveMinOffsetMs = -9223372036854775807L;
            this.liveMaxOffsetMs = -9223372036854775807L;
            this.liveMinPlaybackSpeed = -3.4028235E38f;
            this.liveMaxPlaybackSpeed = -3.4028235E38f;
        }

        private Builder(MediaItem mediaItem) {
            this();
            this.clipEndPositionMs = mediaItem.clippingProperties.endPositionMs;
            this.clipRelativeToLiveWindow = mediaItem.clippingProperties.relativeToLiveWindow;
            this.clipRelativeToDefaultPosition = mediaItem.clippingProperties.relativeToDefaultPosition;
            this.clipStartPositionMs = mediaItem.clippingProperties.startPositionMs;
            this.clipStartsAtKeyFrame = mediaItem.clippingProperties.startsAtKeyFrame;
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveTargetOffsetMs = mediaItem.liveConfiguration.targetOffsetMs;
            this.liveMinOffsetMs = mediaItem.liveConfiguration.minOffsetMs;
            this.liveMaxOffsetMs = mediaItem.liveConfiguration.maxOffsetMs;
            this.liveMinPlaybackSpeed = mediaItem.liveConfiguration.minPlaybackSpeed;
            this.liveMaxPlaybackSpeed = mediaItem.liveConfiguration.maxPlaybackSpeed;
            PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            if (playbackProperties != null) {
                this.customCacheKey = playbackProperties.customCacheKey;
                this.mimeType = playbackProperties.mimeType;
                this.uri = playbackProperties.uri;
                this.streamKeys = playbackProperties.streamKeys;
                this.subtitles = playbackProperties.subtitles;
                this.tag = playbackProperties.tag;
                DrmConfiguration drmConfiguration = playbackProperties.drmConfiguration;
                if (drmConfiguration != null) {
                    this.drmLicenseUri = drmConfiguration.licenseUri;
                    this.drmLicenseRequestHeaders = drmConfiguration.requestHeaders;
                    this.drmMultiSession = drmConfiguration.multiSession;
                    this.drmForceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                    this.drmPlayClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                    this.drmSessionForClearTypes = drmConfiguration.sessionForClearTypes;
                    this.drmUuid = drmConfiguration.uuid;
                    this.drmKeySetId = drmConfiguration.getKeySetId();
                }
                AdsConfiguration adsConfiguration = playbackProperties.adsConfiguration;
                if (adsConfiguration != null) {
                    this.adTagUri = adsConfiguration.adTagUri;
                    this.adsId = adsConfiguration.adsId;
                }
            }
        }

        public Builder setMediaId(String str) {
            this.mediaId = str;
            return this;
        }

        public Builder setUri(String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public Builder setUri(Uri uri2) {
            this.uri = uri2;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder setClipStartPositionMs(long j) {
            Assertions.checkArgument(j >= 0);
            this.clipStartPositionMs = j;
            return this;
        }

        public Builder setClipEndPositionMs(long j) {
            Assertions.checkArgument(j == Long.MIN_VALUE || j >= 0);
            this.clipEndPositionMs = j;
            return this;
        }

        public Builder setClipRelativeToLiveWindow(boolean z) {
            this.clipRelativeToLiveWindow = z;
            return this;
        }

        public Builder setClipRelativeToDefaultPosition(boolean z) {
            this.clipRelativeToDefaultPosition = z;
            return this;
        }

        public Builder setClipStartsAtKeyFrame(boolean z) {
            this.clipStartsAtKeyFrame = z;
            return this;
        }

        public Builder setDrmLicenseUri(Uri uri2) {
            this.drmLicenseUri = uri2;
            return this;
        }

        public Builder setDrmLicenseUri(String str) {
            this.drmLicenseUri = str == null ? null : Uri.parse(str);
            return this;
        }

        public Builder setDrmLicenseRequestHeaders(Map<String, String> map) {
            Map<String, String> map2;
            if (map == null || map.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(new HashMap(map));
            }
            this.drmLicenseRequestHeaders = map2;
            return this;
        }

        public Builder setDrmUuid(UUID uuid) {
            this.drmUuid = uuid;
            return this;
        }

        public Builder setDrmMultiSession(boolean z) {
            this.drmMultiSession = z;
            return this;
        }

        public Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.drmForceDefaultLicenseUri = z;
            return this;
        }

        public Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.drmPlayClearContentWithoutKey = z;
            return this;
        }

        public Builder setDrmSessionForClearPeriods(boolean z) {
            List list;
            if (z) {
                list = Arrays.asList(new Integer[]{2, 1});
            } else {
                list = Collections.emptyList();
            }
            setDrmSessionForClearTypes(list);
            return this;
        }

        public Builder setDrmSessionForClearTypes(List<Integer> list) {
            List<Integer> list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.drmSessionForClearTypes = list2;
            return this;
        }

        public Builder setDrmKeySetId(byte[] bArr) {
            this.drmKeySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            return this;
        }

        public Builder setStreamKeys(List<StreamKey> list) {
            List<StreamKey> list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.streamKeys = list2;
            return this;
        }

        public Builder setCustomCacheKey(String str) {
            this.customCacheKey = str;
            return this;
        }

        public Builder setSubtitles(List<Subtitle> list) {
            List<Subtitle> list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.subtitles = list2;
            return this;
        }

        public Builder setAdTagUri(String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        public Builder setAdTagUri(Uri uri2) {
            return setAdTagUri(uri2, (Object) null);
        }

        public Builder setAdTagUri(Uri uri2, Object obj) {
            this.adTagUri = uri2;
            this.adsId = obj;
            return this;
        }

        public Builder setLiveTargetOffsetMs(long j) {
            this.liveTargetOffsetMs = j;
            return this;
        }

        public Builder setLiveMinOffsetMs(long j) {
            this.liveMinOffsetMs = j;
            return this;
        }

        public Builder setLiveMaxOffsetMs(long j) {
            this.liveMaxOffsetMs = j;
            return this;
        }

        public Builder setLiveMinPlaybackSpeed(float f) {
            this.liveMinPlaybackSpeed = f;
            return this;
        }

        public Builder setLiveMaxPlaybackSpeed(float f) {
            this.liveMaxPlaybackSpeed = f;
            return this;
        }

        public Builder setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder setMediaMetadata(MediaMetadata mediaMetadata2) {
            this.mediaMetadata = mediaMetadata2;
            return this;
        }

        public MediaItem build() {
            PlaybackProperties playbackProperties;
            Assertions.checkState(this.drmLicenseUri == null || this.drmUuid != null);
            Uri uri2 = this.uri;
            if (uri2 != null) {
                String str = this.mimeType;
                UUID uuid = this.drmUuid;
                DrmConfiguration drmConfiguration = uuid != null ? new DrmConfiguration(uuid, this.drmLicenseUri, this.drmLicenseRequestHeaders, this.drmMultiSession, this.drmForceDefaultLicenseUri, this.drmPlayClearContentWithoutKey, this.drmSessionForClearTypes, this.drmKeySetId) : null;
                Uri uri3 = this.adTagUri;
                PlaybackProperties playbackProperties2 = new PlaybackProperties(uri2, str, drmConfiguration, uri3 != null ? new AdsConfiguration(uri3, this.adsId) : null, this.streamKeys, this.customCacheKey, this.subtitles, this.tag);
                String str2 = this.mediaId;
                if (str2 == null) {
                    str2 = uri2.toString();
                }
                this.mediaId = str2;
                playbackProperties = playbackProperties2;
            } else {
                playbackProperties = null;
            }
            String str3 = (String) Assertions.checkNotNull(this.mediaId);
            ClippingProperties clippingProperties = new ClippingProperties(this.clipStartPositionMs, this.clipEndPositionMs, this.clipRelativeToLiveWindow, this.clipRelativeToDefaultPosition, this.clipStartsAtKeyFrame);
            LiveConfiguration liveConfiguration = new LiveConfiguration(this.liveTargetOffsetMs, this.liveMinOffsetMs, this.liveMaxOffsetMs, this.liveMinPlaybackSpeed, this.liveMaxPlaybackSpeed);
            MediaMetadata mediaMetadata2 = this.mediaMetadata;
            if (mediaMetadata2 == null) {
                mediaMetadata2 = new MediaMetadata.Builder().build();
            }
            return new MediaItem(str3, clippingProperties, playbackProperties, liveConfiguration, mediaMetadata2);
        }
    }

    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        private final byte[] keySetId;
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        public final Map<String, String> requestHeaders;
        public final List<Integer> sessionForClearTypes;
        public final UUID uuid;

        private DrmConfiguration(UUID uuid2, Uri uri, Map<String, String> map, boolean z, boolean z2, boolean z3, List<Integer> list, byte[] bArr) {
            Assertions.checkArgument(!z2 || uri != null);
            this.uuid = uuid2;
            this.licenseUri = uri;
            this.requestHeaders = map;
            this.multiSession = z;
            this.forceDefaultLicenseUri = z2;
            this.playClearContentWithoutKey = z3;
            this.sessionForClearTypes = list;
            this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
            if (!this.uuid.equals(drmConfiguration.uuid) || !Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) || !Util.areEqual(this.requestHeaders, drmConfiguration.requestHeaders) || this.multiSession != drmConfiguration.multiSession || this.forceDefaultLicenseUri != drmConfiguration.forceDefaultLicenseUri || this.playClearContentWithoutKey != drmConfiguration.playClearContentWithoutKey || !this.sessionForClearTypes.equals(drmConfiguration.sessionForClearTypes) || !Arrays.equals(this.keySetId, drmConfiguration.keySetId)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.uuid.hashCode() * 31;
            Uri uri = this.licenseUri;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.requestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.sessionForClearTypes.hashCode()) * 31) + Arrays.hashCode(this.keySetId);
        }
    }

    public static final class AdsConfiguration {
        public final Uri adTagUri;
        public final Object adsId;

        private AdsConfiguration(Uri uri, Object obj) {
            this.adTagUri = uri;
            this.adsId = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsConfiguration)) {
                return false;
            }
            AdsConfiguration adsConfiguration = (AdsConfiguration) obj;
            if (!this.adTagUri.equals(adsConfiguration.adTagUri) || !Util.areEqual(this.adsId, adsConfiguration.adsId)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.adTagUri.hashCode() * 31;
            Object obj = this.adsId;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class PlaybackProperties {
        public final AdsConfiguration adsConfiguration;
        public final String customCacheKey;
        public final DrmConfiguration drmConfiguration;
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final List<Subtitle> subtitles;
        public final Object tag;
        public final Uri uri;

        private PlaybackProperties(Uri uri2, String str, DrmConfiguration drmConfiguration2, AdsConfiguration adsConfiguration2, List<StreamKey> list, String str2, List<Subtitle> list2, Object obj) {
            this.uri = uri2;
            this.mimeType = str;
            this.drmConfiguration = drmConfiguration2;
            this.adsConfiguration = adsConfiguration2;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitles = list2;
            this.tag = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaybackProperties)) {
                return false;
            }
            PlaybackProperties playbackProperties = (PlaybackProperties) obj;
            if (!this.uri.equals(playbackProperties.uri) || !Util.areEqual(this.mimeType, playbackProperties.mimeType) || !Util.areEqual(this.drmConfiguration, playbackProperties.drmConfiguration) || !Util.areEqual(this.adsConfiguration, playbackProperties.adsConfiguration) || !this.streamKeys.equals(playbackProperties.streamKeys) || !Util.areEqual(this.customCacheKey, playbackProperties.customCacheKey) || !this.subtitles.equals(playbackProperties.subtitles) || !Util.areEqual(this.tag, playbackProperties.tag)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmConfiguration drmConfiguration2 = this.drmConfiguration;
            int hashCode3 = (hashCode2 + (drmConfiguration2 == null ? 0 : drmConfiguration2.hashCode())) * 31;
            AdsConfiguration adsConfiguration2 = this.adsConfiguration;
            int hashCode4 = (((hashCode3 + (adsConfiguration2 == null ? 0 : adsConfiguration2.hashCode())) * 31) + this.streamKeys.hashCode()) * 31;
            String str2 = this.customCacheKey;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.subtitles.hashCode()) * 31;
            Object obj = this.tag;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode5 + i;
        }
    }

    public static final class LiveConfiguration {
        public static final LiveConfiguration UNSET = new LiveConfiguration(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;

        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            if (this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            long j3 = this.maxOffsetMs;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.minPlaybackSpeed;
            int i2 = 0;
            int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.maxPlaybackSpeed;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            }
            return floatToIntBits + i2;
        }
    }

    public static final class Subtitle {
        public final String label;
        public final String language;
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        public Subtitle(Uri uri2, String str, String str2) {
            this(uri2, str, str2, 0);
        }

        public Subtitle(Uri uri2, String str, String str2, int i) {
            this(uri2, str, str2, i, 0, (String) null);
        }

        public Subtitle(Uri uri2, String str, String str2, int i, int i2, String str3) {
            this.uri = uri2;
            this.mimeType = str;
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj;
            if (!this.uri.equals(subtitle.uri) || !this.mimeType.equals(subtitle.mimeType) || !Util.areEqual(this.language, subtitle.language) || this.selectionFlags != subtitle.selectionFlags || this.roleFlags != subtitle.roleFlags || !Util.areEqual(this.label, subtitle.label)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = ((this.uri.hashCode() * 31) + this.mimeType.hashCode()) * 31;
            String str = this.language;
            int i = 0;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            String str2 = this.label;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }
    }

    public static final class ClippingProperties {
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;

        private ClippingProperties(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.startPositionMs = j;
            this.endPositionMs = j2;
            this.relativeToLiveWindow = z;
            this.relativeToDefaultPosition = z2;
            this.startsAtKeyFrame = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingProperties)) {
                return false;
            }
            ClippingProperties clippingProperties = (ClippingProperties) obj;
            if (this.startPositionMs == clippingProperties.startPositionMs && this.endPositionMs == clippingProperties.endPositionMs && this.relativeToLiveWindow == clippingProperties.relativeToLiveWindow && this.relativeToDefaultPosition == clippingProperties.relativeToDefaultPosition && this.startsAtKeyFrame == clippingProperties.startsAtKeyFrame) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.startPositionMs;
            long j2 = this.endPositionMs;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }
    }

    private MediaItem(String str, ClippingProperties clippingProperties2, PlaybackProperties playbackProperties2, LiveConfiguration liveConfiguration2, MediaMetadata mediaMetadata2) {
        this.mediaId = str;
        this.playbackProperties = playbackProperties2;
        this.liveConfiguration = liveConfiguration2;
        this.mediaMetadata = mediaMetadata2;
        this.clippingProperties = clippingProperties2;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        if (!Util.areEqual(this.mediaId, mediaItem.mediaId) || !this.clippingProperties.equals(mediaItem.clippingProperties) || !Util.areEqual(this.playbackProperties, mediaItem.playbackProperties) || !Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) || !Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.mediaId.hashCode() * 31;
        PlaybackProperties playbackProperties2 = this.playbackProperties;
        return ((((((hashCode + (playbackProperties2 != null ? playbackProperties2.hashCode() : 0)) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingProperties.hashCode()) * 31) + this.mediaMetadata.hashCode();
    }
}
