package com.yandex.mobile.ads.instream;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.util.Map;

public final class InstreamAdRequestConfiguration {

    /* renamed from: a */
    private final String f43531a;

    /* renamed from: b */
    private final String f43532b;

    /* renamed from: c */
    private final Map<String, String> f43533c;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f43534a = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f43535b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Map<String, String> f43536c;

        public Builder(String str) {
            this.f43535b = str;
        }

        public InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this);
        }

        public Builder setCategoryId(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f43534a = str;
                return this;
            }
            throw new IllegalArgumentException("Passed categoryId is empty");
        }

        public Builder setParameters(Map<String, String> map) {
            this.f43536c = map;
            return this;
        }
    }

    public String getCategoryId() {
        return this.f43531a;
    }

    public String getPageId() {
        return this.f43532b;
    }

    public Map<String, String> getParameters() {
        return this.f43533c;
    }

    private InstreamAdRequestConfiguration(Builder builder) {
        this.f43531a = builder.f43534a;
        this.f43532b = builder.f43535b;
        this.f43533c = builder.f43536c;
    }
}
