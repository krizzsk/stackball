package com.smaato.sdk.richmedia.p255ad;

import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdResponse */
final class RichMediaAdResponse {
    final List<String> clickTrackingUrls;
    final String content;
    final Object extensions;
    final int height;
    final List<String> impressionTrackingUrls;
    final int width;

    /* synthetic */ RichMediaAdResponse(String str, int i, int i2, List list, List list2, Object obj, byte b) {
        this(str, i, i2, list, list2, obj);
    }

    private RichMediaAdResponse(String str, int i, int i2, List<String> list, List<String> list2, Object obj) {
        this.content = (String) Objects.requireNonNull(str);
        this.width = i;
        this.height = i2;
        this.impressionTrackingUrls = (List) Objects.requireNonNull(list);
        this.clickTrackingUrls = (List) Objects.requireNonNull(list2);
        this.extensions = obj;
    }

    public final String toString() {
        return "RichMediaAdResponse{content='" + this.content + '\'' + ", width=" + this.width + ", height=" + this.height + ", impressionTrackingUrls=" + this.impressionTrackingUrls + ", clickTrackingUrls=" + this.clickTrackingUrls + ", extensions=" + this.extensions + '}';
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdResponse$Builder */
    public static final class Builder {
        private List<String> clickTrackingUrls;
        private String content;
        private Object extensions;
        private int height;
        private List<String> impressionTrackingUrls;
        private int width;

        public final Builder setContent(String str) {
            this.content = str;
            return this;
        }

        public final Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        public final Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public final Builder setImpressionTrackingUrls(List<String> list) {
            this.impressionTrackingUrls = list;
            return this;
        }

        public final Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public final Builder setExtensions(Object obj) {
            this.extensions = obj;
            return this;
        }

        public final RichMediaAdResponse build() {
            ArrayList arrayList = new ArrayList();
            if (this.content == null) {
                arrayList.add("content");
            }
            if (this.impressionTrackingUrls == null) {
                arrayList.add("impressionTrackingUrls");
            }
            if (this.clickTrackingUrls == null) {
                arrayList.add("clickTrackingUrls");
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
            } else if (this.impressionTrackingUrls.isEmpty()) {
                throw new IllegalStateException("impressionTrackingUrls cannot be empty");
            } else if (!this.clickTrackingUrls.isEmpty()) {
                return new RichMediaAdResponse(this.content, this.width, this.height, this.impressionTrackingUrls, this.clickTrackingUrls, this.extensions, (byte) 0);
            } else {
                throw new IllegalStateException("clickTrackingUrls cannot be empty");
            }
        }
    }
}
