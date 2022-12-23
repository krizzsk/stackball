package com.inmobi.media;

import com.facebook.share.internal.ShareConstants;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bm */
/* compiled from: NativeImageAsset */
public final class C5021bm extends C5010bf {
    public C5021bm(String str, String str2, C5011bg bgVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, bgVar, str3, new LinkedList(), b, jSONObject);
    }

    public C5021bm(String str, String str2, C5011bg bgVar, String str3, List<C5030br> list, byte b, JSONObject jSONObject) {
        super(str, str2, ShareConstants.IMAGE_URL, bgVar, list);
        this.f11363e = str3;
        if (jSONObject != null) {
            this.f11367i = b;
            this.f11364f = jSONObject;
        }
    }
}
