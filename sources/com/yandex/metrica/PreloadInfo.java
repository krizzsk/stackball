package com.yandex.metrica;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PreloadInfo {

    /* renamed from: a */
    private String f24028a;

    /* renamed from: b */
    private Map<String, String> f24029b;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f24030a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Map<String, String> f24031b;

        public PreloadInfo build() {
            return new PreloadInfo(this);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (!(str == null || str2 == null)) {
                this.f24031b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f24030a = str;
            this.f24031b = new HashMap();
        }
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f24029b;
    }

    public String getTrackingId() {
        return this.f24028a;
    }

    private PreloadInfo(Builder builder) {
        this.f24028a = builder.f24030a;
        this.f24029b = Collections.unmodifiableMap(builder.f24031b);
    }
}
