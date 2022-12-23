package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public class NativeAppInstallAdMapper extends NativeAdMapper {
    private String zzdnr;
    private String zzemc;
    private List<NativeAd.Image> zzemd;
    private NativeAd.Image zzeme;
    private String zzemf;
    private double zzemg;
    private String zzemh;
    private String zzemi;

    public final void setHeadline(String str) {
        this.zzemc = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzemd = list;
    }

    public final void setBody(String str) {
        this.zzdnr = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzeme = image;
    }

    public final void setCallToAction(String str) {
        this.zzemf = str;
    }

    public final void setStarRating(double d) {
        this.zzemg = d;
    }

    public final void setStore(String str) {
        this.zzemh = str;
    }

    public final void setPrice(String str) {
        this.zzemi = str;
    }

    public final String getHeadline() {
        return this.zzemc;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzemd;
    }

    public final String getBody() {
        return this.zzdnr;
    }

    public final NativeAd.Image getIcon() {
        return this.zzeme;
    }

    public final String getCallToAction() {
        return this.zzemf;
    }

    public final double getStarRating() {
        return this.zzemg;
    }

    public final String getStore() {
        return this.zzemh;
    }

    public final String getPrice() {
        return this.zzemi;
    }
}
