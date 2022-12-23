package com.smaato.sdk.image.p252ad;

import android.graphics.Bitmap;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.p248ad.AdObject;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.smaato.sdk.image.ad.ImageAdObject */
public final class ImageAdObject implements AdObject {
    private final Bitmap bitmap;
    private final List<String> clickTrackingUrls;
    private final String clickUrl;
    private final Object extensions;
    private final int height;
    private final String imageUrl;
    private final List<String> impressionTrackingUrls;
    private final SomaApiContext somaApiContext;
    private final int width;

    /* synthetic */ ImageAdObject(SomaApiContext somaApiContext2, String str, Bitmap bitmap2, int i, int i2, String str2, List list, List list2, Object obj, byte b) {
        this(somaApiContext2, str, bitmap2, i, i2, str2, list, list2, obj);
    }

    private ImageAdObject(SomaApiContext somaApiContext2, String str, Bitmap bitmap2, int i, int i2, String str2, List<String> list, List<String> list2, Object obj) {
        this.somaApiContext = (SomaApiContext) Objects.requireNonNull(somaApiContext2);
        this.imageUrl = (String) Objects.requireNonNull(str);
        this.bitmap = (Bitmap) Objects.requireNonNull(bitmap2);
        this.width = i;
        this.height = i2;
        this.clickUrl = (String) Objects.requireNonNull(str2);
        this.impressionTrackingUrls = (List) Objects.requireNonNull(list);
        this.clickTrackingUrls = (List) Objects.requireNonNull(list2);
        this.extensions = obj;
    }

    public final SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getClickUrl() {
        return this.clickUrl;
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

    public final String toString() {
        return "ImageAdObject{somaApiContext=" + this.somaApiContext + ", imageUrl='" + this.imageUrl + '\'' + ", bitmap=" + this.bitmap + ", width=" + this.width + ", height=" + this.height + ", clickUrl='" + this.clickUrl + '\'' + ", impressionTrackingUrls=" + this.impressionTrackingUrls + ", clickTrackingUrls=" + this.clickTrackingUrls + ", extensions=" + this.extensions + '}';
    }

    /* renamed from: com.smaato.sdk.image.ad.ImageAdObject$Builder */
    public static final class Builder {
        private Bitmap bitmap;
        private List<String> clickTrackingUrls;
        private String clickUrl;
        private Object extensions;
        private int height;
        private String imageUrl;
        private List<String> impressionTrackingUrls;
        private SomaApiContext somaApiContext;
        private int width;

        public final Builder setImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public final Builder setSomaApiContext(SomaApiContext somaApiContext2) {
            this.somaApiContext = somaApiContext2;
            return this;
        }

        public final Builder setBitmap(Bitmap bitmap2) {
            this.bitmap = bitmap2;
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

        public final Builder setClickUrl(String str) {
            this.clickUrl = str;
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

        public final ImageAdObject build() {
            ArrayList arrayList = new ArrayList();
            if (this.somaApiContext == null) {
                arrayList.add("somaApiContext");
            }
            if (this.imageUrl == null) {
                arrayList.add("imageUrl");
            }
            if (this.bitmap == null) {
                arrayList.add("bitmap");
            }
            if (this.clickUrl == null) {
                arrayList.add("clickUrl");
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
                return new ImageAdObject(this.somaApiContext, this.imageUrl, this.bitmap, this.width, this.height, this.clickUrl, this.impressionTrackingUrls, this.clickTrackingUrls, this.extensions, (byte) 0);
            } else {
                throw new IllegalStateException("clickTrackingUrls cannot be empty");
            }
        }
    }
}
