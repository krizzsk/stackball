package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.hd0;

public abstract class NativeAdAssets {

    /* renamed from: a */
    private NativeAdMedia f43701a;

    /* renamed from: b */
    private String f43702b;

    /* renamed from: c */
    private String f43703c;

    /* renamed from: d */
    private String f43704d;

    /* renamed from: e */
    private String f43705e;

    /* renamed from: f */
    private NativeAdImage f43706f;

    /* renamed from: g */
    private NativeAdImage f43707g;

    /* renamed from: h */
    private NativeAdImage f43708h;

    /* renamed from: i */
    private String f43709i;

    /* renamed from: j */
    private Float f43710j;

    /* renamed from: k */
    private String f43711k;

    /* renamed from: l */
    private String f43712l;

    /* renamed from: m */
    private String f43713m;

    /* renamed from: n */
    private String f43714n;

    /* renamed from: o */
    private boolean f43715o;

    NativeAdAssets() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71501a(String str) {
        this.f43702b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71504b(String str) {
        this.f43703c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo71506c(String str) {
        this.f43704d = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo71508d(String str) {
        this.f43705e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo71509e(String str) {
        this.f43709i = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NativeAdAssets nativeAdAssets = (NativeAdAssets) obj;
        NativeAdMedia nativeAdMedia = this.f43701a;
        if (nativeAdMedia == null ? nativeAdAssets.f43701a != null : !nativeAdMedia.equals(nativeAdAssets.f43701a)) {
            return false;
        }
        String str = this.f43702b;
        if (str == null ? nativeAdAssets.f43702b != null : !str.equals(nativeAdAssets.f43702b)) {
            return false;
        }
        String str2 = this.f43703c;
        if (str2 == null ? nativeAdAssets.f43703c != null : !str2.equals(nativeAdAssets.f43703c)) {
            return false;
        }
        String str3 = this.f43704d;
        if (str3 == null ? nativeAdAssets.f43704d != null : !str3.equals(nativeAdAssets.f43704d)) {
            return false;
        }
        String str4 = this.f43705e;
        if (str4 == null ? nativeAdAssets.f43705e != null : !str4.equals(nativeAdAssets.f43705e)) {
            return false;
        }
        NativeAdImage nativeAdImage = this.f43706f;
        if (nativeAdImage == null ? nativeAdAssets.f43706f != null : !nativeAdImage.equals(nativeAdAssets.f43706f)) {
            return false;
        }
        NativeAdImage nativeAdImage2 = this.f43707g;
        if (nativeAdImage2 == null ? nativeAdAssets.f43707g != null : !nativeAdImage2.equals(nativeAdAssets.f43707g)) {
            return false;
        }
        NativeAdImage nativeAdImage3 = this.f43708h;
        if (nativeAdImage3 == null ? nativeAdAssets.f43708h != null : !nativeAdImage3.equals(nativeAdAssets.f43708h)) {
            return false;
        }
        String str5 = this.f43709i;
        if (str5 == null ? nativeAdAssets.f43709i != null : !str5.equals(nativeAdAssets.f43709i)) {
            return false;
        }
        Float f = this.f43710j;
        if (f == null ? nativeAdAssets.f43710j != null : !f.equals(nativeAdAssets.f43710j)) {
            return false;
        }
        String str6 = this.f43711k;
        if (str6 == null ? nativeAdAssets.f43711k != null : !str6.equals(nativeAdAssets.f43711k)) {
            return false;
        }
        String str7 = this.f43712l;
        if (str7 == null ? nativeAdAssets.f43712l != null : !str7.equals(nativeAdAssets.f43712l)) {
            return false;
        }
        String str8 = this.f43713m;
        if (str8 == null ? nativeAdAssets.f43713m != null : !str8.equals(nativeAdAssets.f43713m)) {
            return false;
        }
        String str9 = this.f43714n;
        String str10 = nativeAdAssets.f43714n;
        if (str9 != null) {
            return str9.equals(str10);
        }
        if (str10 == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo71511f(String str) {
        if (str != null) {
            try {
                this.f43710j = Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
                String.format("Could not parse rating value. Rating value is %s", new Object[]{str});
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo71512g(String str) {
        this.f43711k = str;
    }

    public String getAge() {
        return this.f43702b;
    }

    public String getBody() {
        return this.f43703c;
    }

    public String getCallToAction() {
        return this.f43704d;
    }

    public String getDomain() {
        return this.f43705e;
    }

    public NativeAdImage getFavicon() {
        return this.f43706f;
    }

    public NativeAdImage getIcon() {
        return this.f43707g;
    }

    public NativeAdImage getImage() {
        return this.f43708h;
    }

    public NativeAdMedia getMedia() {
        return this.f43701a;
    }

    public String getPrice() {
        return this.f43709i;
    }

    public Float getRating() {
        return this.f43710j;
    }

    public String getReviewCount() {
        return this.f43711k;
    }

    public String getSponsored() {
        return this.f43712l;
    }

    public String getTitle() {
        return this.f43713m;
    }

    public String getWarning() {
        return this.f43714n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo71527h(String str) {
        this.f43712l = str;
    }

    public int hashCode() {
        NativeAdMedia nativeAdMedia = this.f43701a;
        int i = 0;
        int hashCode = (nativeAdMedia != null ? nativeAdMedia.hashCode() : 0) * 31;
        String str = this.f43702b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f43703c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43704d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f43705e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage = this.f43706f;
        int hashCode6 = (hashCode5 + (nativeAdImage != null ? nativeAdImage.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage2 = this.f43707g;
        int hashCode7 = (hashCode6 + (nativeAdImage2 != null ? nativeAdImage2.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage3 = this.f43708h;
        int hashCode8 = (hashCode7 + (nativeAdImage3 != null ? nativeAdImage3.hashCode() : 0)) * 31;
        String str5 = this.f43709i;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Float f = this.f43710j;
        int hashCode10 = (hashCode9 + (f != null ? f.hashCode() : 0)) * 31;
        String str6 = this.f43711k;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f43712l;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f43713m;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f43714n;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode13 + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo71529i(String str) {
        this.f43713m = str;
    }

    public boolean isFeedbackAvailable() {
        return this.f43715o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo71531j(String str) {
        this.f43714n = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71502a(boolean z) {
        this.f43715o = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71503b(hd0 hd0, ed0 ed0) {
        this.f43706f = m45000a(hd0, ed0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo71505c(hd0 hd0, ed0 ed0) {
        this.f43707g = m45000a(hd0, ed0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo71507d(hd0 hd0, ed0 ed0) {
        this.f43708h = m45000a(hd0, ed0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71500a(NativeAdMedia nativeAdMedia) {
        this.f43701a = nativeAdMedia;
    }

    /* renamed from: a */
    static NativeAdImage m45000a(hd0 hd0, ed0 ed0) {
        if (hd0 == null) {
            return null;
        }
        NativeAdImage nativeAdImage = new NativeAdImage();
        nativeAdImage.mo71533a(hd0.mo67516a());
        nativeAdImage.mo71536b(hd0.mo67525e());
        nativeAdImage.mo71535a(hd0.mo67520b());
        nativeAdImage.mo71534a(ed0.mo66167a(hd0));
        return nativeAdImage;
    }
}
