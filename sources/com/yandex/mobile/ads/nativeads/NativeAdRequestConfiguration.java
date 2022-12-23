package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import java.util.List;
import java.util.Map;

public final class NativeAdRequestConfiguration {

    /* renamed from: a */
    private final String f43723a;

    /* renamed from: b */
    private final String f43724b;

    /* renamed from: c */
    private final String f43725c;

    /* renamed from: d */
    private final String f43726d;

    /* renamed from: e */
    private final List<String> f43727e;

    /* renamed from: f */
    private final Location f43728f;

    /* renamed from: g */
    private final Map<String, String> f43729g;

    /* renamed from: h */
    private final String f43730h;

    /* renamed from: i */
    private final boolean f43731i;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f43732a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f43733b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f43734c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Location f43735d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f43736e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public List<String> f43737f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Map<String, String> f43738g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f43739h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f43740i = true;

        public Builder(String str) {
            this.f43732a = str;
        }

        public NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this);
        }

        public Builder setAge(String str) {
            this.f43733b = str;
            return this;
        }

        public Builder setBiddingData(String str) {
            this.f43739h = str;
            return this;
        }

        public Builder setContextQuery(String str) {
            this.f43736e = str;
            return this;
        }

        public Builder setContextTags(List<String> list) {
            this.f43737f = list;
            return this;
        }

        public Builder setGender(String str) {
            this.f43734c = str;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f43735d = location;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f43738g = map;
            return this;
        }

        public Builder setShouldLoadImagesAutomatically(boolean z) {
            this.f43740i = z;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo71551a() {
        return this.f43723a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo71552b() {
        return this.f43724b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo71553c() {
        return this.f43730h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo71554d() {
        return this.f43726d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<String> mo71555e() {
        return this.f43727e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo71556f() {
        return this.f43725c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Location mo71557g() {
        return this.f43728f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<String, String> mo71558h() {
        return this.f43729g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo71559i() {
        return this.f43731i;
    }

    private NativeAdRequestConfiguration(Builder builder) {
        this.f43723a = builder.f43732a;
        this.f43724b = builder.f43733b;
        this.f43725c = builder.f43734c;
        this.f43726d = builder.f43736e;
        this.f43727e = builder.f43737f;
        this.f43728f = builder.f43735d;
        this.f43729g = builder.f43738g;
        this.f43730h = builder.f43739h;
        this.f43731i = builder.f43740i;
    }
}
