package com.google.android.gms.internal.ads;

import android.location.Location;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzamq implements NativeMediationAdRequest {
    private final String zzacs;
    private final int zzceh;
    private final boolean zzces;
    private final int zzdgl;
    private final int zzdgm;
    private final zzaci zzdhc;
    private final List<String> zzdhd = new ArrayList();
    private final Map<String, Boolean> zzdhe = new HashMap();
    private final Date zzml;
    private final Set<String> zzmn;
    private final boolean zzmo;
    private final Location zzmp;

    public zzamq(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzaci zzaci, List<String> list, boolean z2, int i3, String str) {
        this.zzml = date;
        this.zzceh = i;
        this.zzmn = set;
        this.zzmp = location;
        this.zzmo = z;
        this.zzdgl = i2;
        this.zzdhc = zzaci;
        this.zzces = z2;
        this.zzdgm = i3;
        this.zzacs = str;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(CertificateUtil.DELIMITER, 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.zzdhe.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.zzdhe.put(split[1], false);
                        }
                    }
                } else {
                    this.zzdhd.add(next);
                }
            }
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzml;
    }

    @Deprecated
    public final int getGender() {
        return this.zzceh;
    }

    public final Set<String> getKeywords() {
        return this.zzmn;
    }

    public final Location getLocation() {
        return this.zzmp;
    }

    public final boolean isTesting() {
        return this.zzmo;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzdgl;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.zzdhc == null) {
            return null;
        }
        NativeAdOptions.Builder requestMultipleImages = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(this.zzdhc.zzcyt).setImageOrientation(this.zzdhc.zzbkx).setRequestMultipleImages(this.zzdhc.zzbkz);
        if (this.zzdhc.versionCode >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.zzdhc.zzbla);
        }
        if (this.zzdhc.versionCode >= 3 && this.zzdhc.zzcyu != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.zzdhc.zzcyu));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return zzxw.zzqq().zzqc();
    }

    public final float getAdVolume() {
        return zzxw.zzqq().zzqb();
    }

    public final boolean isAppInstallAdRequested() {
        List<String> list = this.zzdhd;
        if (list != null) {
            return list.contains("2") || this.zzdhd.contains("6");
        }
        return false;
    }

    public final boolean isUnifiedNativeAdRequested() {
        List<String> list = this.zzdhd;
        return list != null && list.contains("6");
    }

    public final boolean isContentAdRequested() {
        List<String> list = this.zzdhd;
        if (list != null) {
            return list.contains("1") || this.zzdhd.contains("6");
        }
        return false;
    }

    public final boolean zztw() {
        List<String> list = this.zzdhd;
        return list != null && list.contains(ExifInterface.GPS_MEASUREMENT_3D);
    }

    public final Map<String, Boolean> zztx() {
        return this.zzdhe;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzces;
    }
}
