package com.inmobi.media;

import java.util.Locale;

/* renamed from: com.inmobi.media.bn */
/* compiled from: NativeTextAsset */
public class C5022bn extends C5010bf {

    /* renamed from: com.inmobi.media.bn$a */
    /* compiled from: NativeTextAsset */
    public static class C5023a extends C5011bg {

        /* renamed from: l */
        protected int f11436l;

        /* renamed from: m */
        protected String f11437m;

        /* renamed from: n */
        protected int f11438n;

        /* renamed from: o */
        protected String[] f11439o;

        /* renamed from: p */
        public byte f11440p;

        public C5023a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, C5024bo boVar) {
            this(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, 12, (byte) 0, Integer.MAX_VALUE, "#ff000000", new String[]{"none"}, boVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5023a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, byte b, int i10, String str5, String[] strArr, C5024bo boVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, boVar);
            String[] strArr2 = strArr;
            this.f11436l = i9;
            this.f11437m = str5.length() == 0 ? "#ff000000" : str5;
            this.f11438n = i10;
            int min = Math.min(strArr2.length, 4);
            String[] strArr3 = new String[min];
            this.f11439o = strArr3;
            this.f11440p = b;
            System.arraycopy(strArr2, 0, strArr3, 0, min);
        }

        /* renamed from: h */
        public final int mo40188h() {
            return this.f11436l;
        }

        /* renamed from: i */
        public final String mo40189i() {
            return this.f11437m.toLowerCase(Locale.US);
        }

        /* renamed from: j */
        public final String[] mo40190j() {
            return this.f11439o;
        }

        /* renamed from: e */
        public final String mo40170e() {
            return this.f11393j.toLowerCase(Locale.US);
        }
    }

    public C5022bn(String str, String str2, C5011bg bgVar, String str3) {
        super(str, str2, "TEXT", bgVar);
        this.f11363e = str3;
    }

    public C5022bn(String str, String str2, String str3, C5011bg bgVar, String str4) {
        super(str, str2, str3, bgVar);
        this.f11363e = str4;
    }
}
