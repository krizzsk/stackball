package com.inmobi.media;

import com.inmobi.media.C5022bn;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bi */
/* compiled from: NativeCtaAsset */
public final class C5014bi extends C5022bn {

    /* renamed from: com.inmobi.media.bi$a */
    /* compiled from: NativeCtaAsset */
    public static class C5015a extends C5022bn.C5023a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5015a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, String str5, String[] strArr, C5024bo boVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, boVar);
            String[] strArr2 = strArr;
            this.f11436l = i9;
            this.f11438n = Integer.MAX_VALUE;
            this.f11437m = str5.length() == 0 ? "#ff000000" : str5;
            int min = Math.min(strArr2.length, 1);
            this.f11439o = new String[min];
            System.arraycopy(strArr2, 0, this.f11439o, 0, min);
        }
    }

    C5014bi(String str, String str2, C5011bg bgVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, bgVar, str3, new LinkedList(), b, jSONObject);
    }

    C5014bi(String str, String str2, C5011bg bgVar, String str3, List<C5030br> list, byte b, JSONObject jSONObject) {
        super(str, str2, "CTA", bgVar, str3);
        mo40164a(list);
        if (jSONObject != null) {
            this.f11367i = b;
            this.f11364f = jSONObject;
        }
    }
}
