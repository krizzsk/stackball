package com.yandex.mobile.ads.nativeads;

import android.graphics.Bitmap;

public final class NativeAdImage {

    /* renamed from: a */
    private Bitmap f43716a;

    /* renamed from: b */
    private String f43717b;

    /* renamed from: c */
    private int f43718c;

    /* renamed from: d */
    private int f43719d;

    NativeAdImage() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71534a(Bitmap bitmap) {
        this.f43716a = bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71536b(int i) {
        this.f43719d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NativeAdImage.class != obj.getClass()) {
            return false;
        }
        NativeAdImage nativeAdImage = (NativeAdImage) obj;
        if (this.f43718c != nativeAdImage.f43718c || this.f43719d != nativeAdImage.f43719d) {
            return false;
        }
        Bitmap bitmap = this.f43716a;
        if (bitmap == null ? nativeAdImage.f43716a != null : !bitmap.equals(nativeAdImage.f43716a)) {
            return false;
        }
        String str = this.f43717b;
        String str2 = nativeAdImage.f43717b;
        return str == null ? str2 == null : str.equals(str2);
    }

    public Bitmap getBitmap() {
        return this.f43716a;
    }

    public int getHeight() {
        return this.f43718c;
    }

    public int getWidth() {
        return this.f43719d;
    }

    public int hashCode() {
        Bitmap bitmap = this.f43716a;
        int i = 0;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.f43717b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f43718c) * 31) + this.f43719d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71533a(int i) {
        this.f43718c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71535a(String str) {
        this.f43717b = str;
    }

    /* renamed from: a */
    public String mo71532a() {
        return this.f43717b;
    }
}
