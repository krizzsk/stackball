package com.mbridge.msdk.mbsignalcommon.windvane;

import com.google.android.exoplayer2.util.MimeTypes;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.e */
/* compiled from: MimeTypeEnum */
public enum C6561e {
    JS("js", "application/x-javascript"),
    CSS("css", WebRequest.CONTENT_TYPE_CSS),
    JPG("jpg", MimeTypes.IMAGE_JPEG),
    JPEG("jpep", MimeTypes.IMAGE_JPEG),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", WebRequest.CONTENT_TYPE_HTML),
    HTML(TJAdUnitConstants.String.HTML, WebRequest.CONTENT_TYPE_HTML);
    

    /* renamed from: j */
    private String f16362j;

    /* renamed from: k */
    private String f16363k;

    private C6561e(String str, String str2) {
        this.f16362j = str;
        this.f16363k = str2;
    }

    /* renamed from: a */
    public final String mo44515a() {
        return this.f16362j;
    }

    /* renamed from: b */
    public final String mo44516b() {
        return this.f16363k;
    }
}
