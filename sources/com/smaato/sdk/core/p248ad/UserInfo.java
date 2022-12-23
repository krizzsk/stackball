package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.Gender;
import com.smaato.sdk.core.LatLng;

/* renamed from: com.smaato.sdk.core.ad.UserInfo */
public final class UserInfo {
    private final Integer age;
    private final boolean coppa;
    private final Gender gender;
    private final String keywords;
    private final String language;
    private final LatLng latLng;
    private final String region;
    private final String searchQuery;
    private final String zip;

    /* synthetic */ UserInfo(String str, String str2, Gender gender2, Integer num, LatLng latLng2, String str3, String str4, String str5, boolean z, byte b) {
        this(str, str2, gender2, num, latLng2, str3, str4, str5, z);
    }

    private UserInfo(String str, String str2, Gender gender2, Integer num, LatLng latLng2, String str3, String str4, String str5, boolean z) {
        this.keywords = str;
        this.searchQuery = str2;
        this.gender = gender2;
        this.age = num;
        this.latLng = latLng2;
        this.region = str3;
        this.zip = str4;
        this.language = str5;
        this.coppa = z;
    }

    public final String getKeywords() {
        return this.keywords;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final Integer getAge() {
        return this.age;
    }

    public final LatLng getLatLng() {
        return this.latLng;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getZip() {
        return this.zip;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final boolean getCoppa() {
        return this.coppa;
    }

    public final String toString() {
        return "UserInfo{keywords='" + this.keywords + '\'' + ", searchQuery='" + this.searchQuery + '\'' + ", gender=" + this.gender + ", age=" + this.age + ", latLng=" + this.latLng + ", region='" + this.region + '\'' + ", zip='" + this.zip + '\'' + ", language='" + this.language + '\'' + ", coppa='" + this.coppa + '\'' + '}';
    }

    /* renamed from: com.smaato.sdk.core.ad.UserInfo$Builder */
    public static final class Builder {
        private Integer age;
        private boolean coppa;
        private Gender gender;
        private String keywords;
        private String language;
        private LatLng latLng;
        private String region;
        private String searchQuery;
        private String zip;

        public final Builder setKeywords(String str) {
            this.keywords = str;
            return this;
        }

        public final Builder setSearchQuery(String str) {
            this.searchQuery = str;
            return this;
        }

        public final Builder setGender(Gender gender2) {
            this.gender = gender2;
            return this;
        }

        public final Builder setAge(Integer num) {
            this.age = num;
            return this;
        }

        public final Builder setLatLng(LatLng latLng2) {
            this.latLng = latLng2;
            return this;
        }

        public final Builder setRegion(String str) {
            this.region = str;
            return this;
        }

        public final Builder setZip(String str) {
            this.zip = str;
            return this;
        }

        public final Builder setLanguage(String str) {
            this.language = str;
            return this;
        }

        public final Builder setCoppa(boolean z) {
            this.coppa = z;
            return this;
        }

        public final UserInfo build() {
            return new UserInfo(this.keywords, this.searchQuery, this.gender, this.age, this.latLng, this.region, this.zip, this.language, this.coppa, (byte) 0);
        }
    }
}
