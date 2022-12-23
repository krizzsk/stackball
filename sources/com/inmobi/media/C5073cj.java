package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cj */
/* compiled from: ResizeProperties */
public class C5073cj {
    public static final String DEFAULT_POSITION = "top-right";
    private static final String TAG = C5073cj.class.getSimpleName();
    Boolean allowOffscreen;
    String customClosePosition;
    int height;
    int offsetX = 0;
    int offsetY = 0;
    int width;

    public C5073cj(String str, Boolean bool) {
        this.customClosePosition = str;
        this.allowOffscreen = bool;
    }

    /* renamed from: a */
    public static C5073cj m11513a(String str, C5073cj cjVar) {
        boolean z;
        String str2;
        try {
            C5073cj cjVar2 = (C5073cj) new C5352hm().mo40710a(new JSONObject(str), C5073cj.class);
            if (cjVar2 == null) {
                return null;
            }
            if (cjVar2.customClosePosition == null) {
                if (cjVar == null) {
                    str2 = DEFAULT_POSITION;
                } else {
                    str2 = cjVar.customClosePosition;
                }
                cjVar2.customClosePosition = str2;
            }
            if (cjVar2.allowOffscreen == null) {
                if (cjVar == null) {
                    z = true;
                } else {
                    z = cjVar.allowOffscreen.booleanValue();
                }
                cjVar2.allowOffscreen = Boolean.valueOf(z);
            }
            return cjVar2;
        } catch (JSONException unused) {
            return null;
        }
    }
}
