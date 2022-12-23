package com.smaato.sdk.richmedia.p255ad;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.p248ad.AdObject;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdObject */
public final class RichMediaAdObject implements AdObject {
    private final List<String> clickTrackingUrls;
    private final String content;
    private final Object extensions;
    private final int height;
    private final List<String> impressionTrackingUrls;
    private final SomaApiContext somaApiContext;
    private final String webViewKey;
    private final int width;

    /* synthetic */ RichMediaAdObject(SomaApiContext somaApiContext2, String str, int i, int i2, List list, List list2, String str2, Object obj, byte b) {
        this(somaApiContext2, str, i, i2, list, list2, str2, obj);
    }

    private RichMediaAdObject(SomaApiContext somaApiContext2, String str, int i, int i2, List<String> list, List<String> list2, String str2, Object obj) {
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.content = (String) Objects.requireNonNull(str);
        this.width = i;
        this.height = i2;
        this.impressionTrackingUrls = (List) Objects.requireNonNull(list);
        this.clickTrackingUrls = (List) Objects.requireNonNull(list2);
        this.webViewKey = (String) Objects.requireNonNull(str2);
        this.extensions = obj;
    }

    public final SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List<String> getImpressionTrackingUrls() {
        return this.impressionTrackingUrls;
    }

    public final List<String> getClickTrackingUrls() {
        return this.clickTrackingUrls;
    }

    public final Object getExtensions() {
        return this.extensions;
    }

    public final String getWebViewKey() {
        return this.webViewKey;
    }

    public final String toString() {
        return "RichMediaAdObject{somaApiContext=" + this.somaApiContext + ", content='" + this.content + '\'' + ", width=" + this.width + ", height=" + this.height + ", impressionTrackingUrls=" + this.impressionTrackingUrls + ", clickTrackingUrls=" + this.clickTrackingUrls + ", extensions=" + this.extensions + ", webViewKey='" + this.webViewKey + '\'' + '}';
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdObject$Builder */
    public static final class Builder {
        private List<String> clickTrackingUrls;
        private String content;
        private Object extensions;
        private int height;
        private List<String> impressionTrackingUrls;
        private SomaApiContext somaApiContext;
        private String webViewKey;
        private int width;

        public final Builder setSomaApiContext(SomaApiContext somaApiContext2) {
            this.somaApiContext = somaApiContext2;
            return this;
        }

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

        public final Builder setWebViewKey(String str) {
            this.webViewKey = str;
            return this;
        }

        public final RichMediaAdObject build() {
            ArrayList arrayList = new ArrayList();
            if (this.somaApiContext == null) {
                arrayList.add("somaApiContext");
            }
            if (this.content == null) {
                arrayList.add("content");
            }
            if (this.impressionTrackingUrls == null) {
                arrayList.add("impressionTrackingUrls");
            }
            if (this.clickTrackingUrls == null) {
                arrayList.add("clickTrackingUrls");
            }
            if (this.webViewKey == null) {
                arrayList.add("webViewKey");
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalStateException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
            } else if (this.impressionTrackingUrls.isEmpty()) {
                throw new IllegalStateException("impressionTrackingUrls cannot be empty");
            } else if (!this.clickTrackingUrls.isEmpty()) {
                return new RichMediaAdObject(this.somaApiContext, this.content, this.width, this.height, this.impressionTrackingUrls, this.clickTrackingUrls, this.webViewKey, this.extensions, (byte) 0);
            } else {
                throw new IllegalStateException("clickTrackingUrls cannot be empty");
            }
        }
    }
}
