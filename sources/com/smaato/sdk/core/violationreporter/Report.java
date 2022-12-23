package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONObject;

final class Report {
    public final String adSpace;
    public final String apiKey;
    public final String apiVersion;
    public final String asnId;
    public final String bundleId;
    public final String creativeId;
    public final String error;
    public final String originalUrl;
    public final String platform;
    public final String publisher;
    public final String sci;
    public final String sdkVersion;
    public final String sessionId;
    public final String timestamp;
    public final String type;
    public final String violatedUrl;

    /* synthetic */ Report(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, byte b) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    private Report(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.type = (String) Objects.requireNonNull(str);
        this.sci = (String) Objects.requireNonNull(str2);
        this.timestamp = (String) Objects.requireNonNull(str3);
        this.error = (String) Objects.requireNonNull(str4);
        this.sdkVersion = (String) Objects.requireNonNull(str5);
        this.bundleId = (String) Objects.requireNonNull(str6);
        this.violatedUrl = (String) Objects.requireNonNull(str7);
        this.publisher = (String) Objects.requireNonNull(str8);
        this.platform = (String) Objects.requireNonNull(str9);
        this.adSpace = (String) Objects.requireNonNull(str10);
        this.sessionId = (String) Objects.requireNonNull(str11);
        this.apiKey = (String) Objects.requireNonNull(str12);
        this.apiVersion = (String) Objects.requireNonNull(str13);
        this.originalUrl = (String) Objects.requireNonNull(str14);
        this.creativeId = (String) Objects.requireNonNull(str15);
        this.asnId = (String) Objects.requireNonNull(str16);
    }

    public final JSONObject toJson() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sci", this.sci);
        linkedHashMap.put("timestamp", this.timestamp);
        linkedHashMap.put("error", this.error);
        linkedHashMap.put("sdkversion", this.sdkVersion);
        linkedHashMap.put("bundleid", this.bundleId);
        linkedHashMap.put("type", this.type);
        linkedHashMap.put("violatedurl", this.violatedUrl);
        linkedHashMap.put("publisher", this.publisher);
        linkedHashMap.put("platform", this.platform);
        linkedHashMap.put("adspace", this.adSpace);
        linkedHashMap.put("sessionid", this.sessionId);
        linkedHashMap.put("apikey", this.apiKey);
        linkedHashMap.put("apiversion", this.apiVersion);
        linkedHashMap.put("originalurl", this.originalUrl);
        linkedHashMap.put("creativeid", this.creativeId);
        linkedHashMap.put("asnid", this.asnId);
        return new JSONObject(linkedHashMap);
    }

    public static class Builder {
        private String adSpace;
        private String apiKey;
        private String apiVersion;
        private String asnId;
        private String bundleId;
        private String creativeId;
        private String error;
        private String originalUrl;
        private String platform;
        private String publisher;
        private String sci;
        private String sdkVersion;
        private String sessionId;
        private String timestamp;
        private String type;
        private String violatedUrl;

        public Builder setType(String str) {
            this.type = str;
            return this;
        }

        public Builder setSci(String str) {
            this.sci = str;
            return this;
        }

        public Builder setTimestamp(String str) {
            this.timestamp = str;
            return this;
        }

        public Builder setError(String str) {
            this.error = str;
            return this;
        }

        public Builder setSdkVersion(String str) {
            this.sdkVersion = str;
            return this;
        }

        public Builder setBundleId(String str) {
            this.bundleId = str;
            return this;
        }

        public Builder setViolatedUrl(String str) {
            this.violatedUrl = str;
            return this;
        }

        public Builder setPublisher(String str) {
            this.publisher = str;
            return this;
        }

        public Builder setPlatform(String str) {
            this.platform = str;
            return this;
        }

        public Builder setAdSpace(String str) {
            this.adSpace = str;
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder setApiKey(String str) {
            this.apiKey = str;
            return this;
        }

        public Builder setApiVersion(String str) {
            this.apiVersion = str;
            return this;
        }

        public Builder setOriginalUrl(String str) {
            this.originalUrl = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.creativeId = str;
            return this;
        }

        public Builder setAsnId(String str) {
            this.asnId = str;
            return this;
        }

        public Report build() {
            ArrayList arrayList = new ArrayList();
            if (this.type == null) {
                arrayList.add("type");
            }
            if (this.sci == null) {
                arrayList.add("sci");
            }
            if (this.timestamp == null) {
                arrayList.add("timestamp");
            }
            if (this.error == null) {
                arrayList.add("error");
            }
            if (this.sdkVersion == null) {
                arrayList.add("sdkVersion");
            }
            if (this.bundleId == null) {
                arrayList.add("bundleId");
            }
            if (this.violatedUrl == null) {
                arrayList.add("violatedUrl");
            }
            if (this.publisher == null) {
                arrayList.add("publisher");
            }
            if (this.platform == null) {
                arrayList.add("platform");
            }
            if (this.adSpace == null) {
                arrayList.add("adSpace");
            }
            if (this.sessionId == null) {
                arrayList.add("sessionId");
            }
            if (this.apiKey == null) {
                arrayList.add("apiKey");
            }
            if (this.apiVersion == null) {
                arrayList.add("apiVersion");
            }
            if (this.originalUrl == null) {
                arrayList.add("originalUrl");
            }
            if (this.creativeId == null) {
                arrayList.add("creativeId");
            }
            if (this.asnId == null) {
                arrayList.add("asnId");
            }
            if (arrayList.isEmpty()) {
                return new Report(this.type, this.sci, this.timestamp, this.error, this.sdkVersion, this.bundleId, this.violatedUrl, this.publisher, this.platform, this.adSpace, this.sessionId, this.apiKey, this.apiVersion, this.originalUrl, this.creativeId, this.asnId, (byte) 0);
            }
            throw new IllegalArgumentException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
        }
    }
}
