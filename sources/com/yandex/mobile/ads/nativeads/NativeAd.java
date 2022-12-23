package com.yandex.mobile.ads.nativeads;

public interface NativeAd {
    void addImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    NativeAdAssets getAdAssets();

    NativeAdType getAdType();

    String getInfo();

    void loadImages();

    void removeImageLoadingListener(NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener);
}
