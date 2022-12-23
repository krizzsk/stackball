package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;

public final class AdRequest {

    /* renamed from: a */
    private final String f29423a;

    /* renamed from: b */
    private final String f29424b;

    /* renamed from: c */
    private final String f29425c;

    /* renamed from: d */
    private final List<String> f29426d;

    /* renamed from: e */
    private final Location f29427e;

    /* renamed from: f */
    private final Map<String, String> f29428f;

    /* renamed from: g */
    private final String f29429g;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f29430a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f29431b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Location f29432c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f29433d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public List<String> f29434e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Map<String, String> f29435f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f29436g;

        public AdRequest build() {
            return new AdRequest(this);
        }

        public Builder setAge(String str) {
            this.f29430a = str;
            return this;
        }

        public Builder setBiddingData(String str) {
            this.f29436g = str;
            return this;
        }

        public Builder setContextQuery(String str) {
            this.f29433d = str;
            return this;
        }

        public Builder setContextTags(List<String> list) {
            this.f29434e = list;
            return this;
        }

        public Builder setGender(String str) {
            this.f29431b = str;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f29432c = location;
            return this;
        }

        public Builder setParameters(Map<String, String> map) {
            this.f29435f = map;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequest.class != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        String str = this.f29423a;
        if (str == null ? adRequest.f29423a != null : !str.equals(adRequest.f29423a)) {
            return false;
        }
        String str2 = this.f29424b;
        if (str2 == null ? adRequest.f29424b != null : !str2.equals(adRequest.f29424b)) {
            return false;
        }
        String str3 = this.f29425c;
        if (str3 == null ? adRequest.f29425c != null : !str3.equals(adRequest.f29425c)) {
            return false;
        }
        List<String> list = this.f29426d;
        if (list == null ? adRequest.f29426d != null : !list.equals(adRequest.f29426d)) {
            return false;
        }
        String str4 = this.f29429g;
        if (str4 == null ? adRequest.f29429g != null : !str4.equals(adRequest.f29429g)) {
            return false;
        }
        Map<String, String> map = this.f29428f;
        Map<String, String> map2 = adRequest.f29428f;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public String getAge() {
        return this.f29423a;
    }

    public String getBiddingData() {
        return this.f29429g;
    }

    public String getContextQuery() {
        return this.f29425c;
    }

    public List<String> getContextTags() {
        return this.f29426d;
    }

    public String getGender() {
        return this.f29424b;
    }

    public Location getLocation() {
        return this.f29427e;
    }

    public Map<String, String> getParameters() {
        return this.f29428f;
    }

    public int hashCode() {
        String str = this.f29423a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f29424b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29425c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f29426d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f29427e;
        int hashCode5 = (hashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f29428f;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f29429g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    private AdRequest(Builder builder) {
        this.f29423a = builder.f29430a;
        this.f29424b = builder.f29431b;
        this.f29425c = builder.f29433d;
        this.f29426d = builder.f29434e;
        this.f29427e = builder.f29432c;
        this.f29428f = builder.f29435f;
        this.f29429g = builder.f29436g;
    }
}
