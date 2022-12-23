package com.inmobi.media;

import android.os.Build;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bk */
/* compiled from: NativeGifAsset */
public class C5019bk extends C5010bf {

    /* renamed from: A */
    private static final String f11434A = C5019bk.class.getSimpleName();

    /* renamed from: z */
    public C5149eb f11435z;

    C5019bk(String str, String str2, C5011bg bgVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, bgVar, str3, new LinkedList(), b, jSONObject);
    }

    C5019bk(String str, String str2, C5011bg bgVar, String str3, List<C5030br> list, byte b, JSONObject jSONObject) {
        super(str, str2, "GIF", bgVar, list);
        C4967ar.m11264a();
        C4949ai b2 = C4967ar.m11267b(str3);
        this.f11363e = b2 == null ? null : b2.f11193e;
        if (b2 != null) {
            try {
                String str4 = b2.f11193e;
                this.f11435z = Build.VERSION.SDK_INT < 28 ? new C5151ec(str4) : new C5142dz(str4);
            } catch (Exception e) {
                this.f11435z = null;
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        }
        if (jSONObject != null) {
            this.f11367i = b;
            this.f11364f = jSONObject;
        }
    }
}
