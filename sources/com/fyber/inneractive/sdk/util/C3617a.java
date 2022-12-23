package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* renamed from: com.fyber.inneractive.sdk.util.a */
public final class C3617a {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m9040a(android.content.Context r8, android.graphics.Bitmap r9, com.fyber.inneractive.sdk.util.C3644b r10) {
        /*
            int r0 = r10.f9922a
            int r1 = r10.f9925d
            int r0 = r0 / r1
            int r1 = r10.f9923b
            int r2 = r10.f9925d
            int r1 = r1 / r2
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 0
            r3[r4] = r0
            r5 = 1
            r3[r5] = r1
            r6 = 0
        L_0x0014:
            if (r6 >= r2) goto L_0x001f
            r7 = r3[r6]
            if (r7 != 0) goto L_0x001c
            r4 = 1
            goto L_0x001f
        L_0x001c:
            int r6 = r6 + 1
            goto L_0x0014
        L_0x001f:
            if (r4 == 0) goto L_0x0023
            r8 = 0
            return r8
        L_0x0023:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = r10.f9925d
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            int r4 = r10.f9925d
            float r4 = (float) r4
            float r3 = r3 / r4
            r1.scale(r2, r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r3 = 3
            r2.setFlags(r3)
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            int r4 = r10.f9926e
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.<init>(r4, r6)
            r2.setColorFilter(r3)
            r3 = 0
            r1.drawBitmap(r9, r3, r3, r2)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r9 < r1) goto L_0x0062
            int r9 = r10.f9924c     // Catch:{ RSRuntimeException -> 0x0062 }
            android.graphics.Bitmap r8 = m9039a((android.content.Context) r8, (android.graphics.Bitmap) r0, (int) r9)     // Catch:{ RSRuntimeException -> 0x0062 }
            goto L_0x0068
        L_0x0062:
            int r8 = r10.f9924c
            android.graphics.Bitmap r8 = m9041a(r0, r8)
        L_0x0068:
            int r9 = r10.f9925d
            if (r9 != r5) goto L_0x006d
            return r8
        L_0x006d:
            int r9 = r10.f9922a
            int r10 = r10.f9923b
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r8, r9, r10, r5)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3617a.m9040a(android.content.Context, android.graphics.Bitmap, com.fyber.inneractive.sdk.util.b):android.graphics.Bitmap");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m9039a(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch:{ all -> 0x0054 }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x004e }
            r1.<init>()     // Catch:{ all -> 0x004e }
            r5.setMessageHandler(r1)     // Catch:{ all -> 0x004e }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x004e }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch:{ all -> 0x004e }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x004b }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch:{ all -> 0x004b }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x0046 }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch:{ all -> 0x0046 }
            r0.setInput(r1)     // Catch:{ all -> 0x0046 }
            float r7 = (float) r7     // Catch:{ all -> 0x0046 }
            r0.setRadius(r7)     // Catch:{ all -> 0x0046 }
            r0.forEach(r2)     // Catch:{ all -> 0x0046 }
            r2.copyTo(r6)     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0036
            r5.destroy()
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.destroy()
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.destroy()
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.destroy()
        L_0x0045:
            return r6
        L_0x0046:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0058
        L_0x004b:
            r6 = move-exception
            r2 = r0
            goto L_0x0051
        L_0x004e:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L_0x0051:
            r0 = r5
            r5 = r2
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.destroy()
        L_0x005d:
            if (r1 == 0) goto L_0x0062
            r1.destroy()
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.destroy()
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r5.destroy()
        L_0x006c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3617a.m9039a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static Bitmap m9041a(Bitmap bitmap, int i) {
        int[] iArr;
        int i2 = i;
        if (i2 <= 0) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[] iArr8 = new int[2];
        iArr8[1] = 3;
        iArr8[0] = i6;
        int[][] iArr9 = (int[][]) Array.newInstance(int.class, iArr8);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = i5;
                int i26 = height;
                int i27 = iArr2[i13 + Math.min(i4, Math.max(i15, 0))];
                int[] iArr10 = iArr9[i15 + i2];
                iArr10[0] = (i27 & 16711680) >> 16;
                iArr10[1] = (i27 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i27 & 255;
                int abs = i11 - Math.abs(i15);
                i16 += iArr10[0] * abs;
                i17 += iArr10[1] * abs;
                i18 += iArr10[2] * abs;
                if (i15 > 0) {
                    i22 += iArr10[0];
                    i23 += iArr10[1];
                    i24 += iArr10[2];
                } else {
                    i19 += iArr10[0];
                    i20 += iArr10[1];
                    i21 += iArr10[2];
                }
                i15++;
                height = i26;
                i5 = i25;
            }
            int i28 = i5;
            int i29 = height;
            int i30 = i2;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i13] = iArr7[i16];
                iArr4[i13] = iArr7[i17];
                iArr5[i13] = iArr7[i18];
                int i32 = i16 - i19;
                int i33 = i17 - i20;
                int i34 = i18 - i21;
                int[] iArr11 = iArr9[((i30 - i2) + i6) % i6];
                int i35 = i19 - iArr11[0];
                int i36 = i20 - iArr11[1];
                int i37 = i21 - iArr11[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i38 = iArr2[i14 + iArr6[i31]];
                iArr11[0] = (i38 & 16711680) >> 16;
                iArr11[1] = (i38 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr11[2] = i38 & 255;
                int i39 = i22 + iArr11[0];
                int i40 = i23 + iArr11[1];
                int i41 = i24 + iArr11[2];
                i16 = i32 + i39;
                i17 = i33 + i40;
                i18 = i34 + i41;
                i30 = (i30 + 1) % i6;
                int[] iArr12 = iArr9[i30 % i6];
                i19 = i35 + iArr12[0];
                i20 = i36 + iArr12[1];
                i21 = i37 + iArr12[2];
                i22 = i39 - iArr12[0];
                i23 = i40 - iArr12[1];
                i24 = i41 - iArr12[2];
                i13++;
                i31++;
                iArr7 = iArr;
            }
            int[] iArr13 = iArr7;
            i14 += width;
            i12++;
            height = i29;
            i5 = i28;
        }
        int i42 = i5;
        int i43 = height;
        int[] iArr14 = iArr7;
        int i44 = 0;
        while (i44 < width) {
            int i45 = -i2;
            int i46 = i45 * width;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            while (i45 <= i2) {
                int[] iArr15 = iArr6;
                int max = Math.max(0, i46) + i44;
                int[] iArr16 = iArr9[i45 + i2];
                iArr16[0] = iArr3[max];
                iArr16[1] = iArr4[max];
                iArr16[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i45);
                i47 += iArr3[max] * abs2;
                i48 += iArr4[max] * abs2;
                i49 += iArr5[max] * abs2;
                if (i45 > 0) {
                    i53 += iArr16[0];
                    i54 += iArr16[1];
                    i55 += iArr16[2];
                } else {
                    i50 += iArr16[0];
                    i51 += iArr16[1];
                    i52 += iArr16[2];
                }
                int i56 = i42;
                if (i45 < i56) {
                    i46 += width;
                }
                i45++;
                i42 = i56;
                iArr6 = iArr15;
            }
            int[] iArr17 = iArr6;
            int i57 = i42;
            int i58 = i2;
            int i59 = i44;
            int i60 = i43;
            int i61 = 0;
            while (i61 < i60) {
                iArr2[i59] = (iArr2[i59] & ViewCompat.MEASURED_STATE_MASK) | (iArr14[i47] << 16) | (iArr14[i48] << 8) | iArr14[i49];
                int i62 = i47 - i50;
                int i63 = i48 - i51;
                int i64 = i49 - i52;
                int[] iArr18 = iArr9[((i58 - i2) + i6) % i6];
                int i65 = i50 - iArr18[0];
                int i66 = i51 - iArr18[1];
                int i67 = i52 - iArr18[2];
                if (i44 == 0) {
                    iArr17[i61] = Math.min(i61 + i11, i57) * width;
                }
                int i68 = iArr17[i61] + i44;
                iArr18[0] = iArr3[i68];
                iArr18[1] = iArr4[i68];
                iArr18[2] = iArr5[i68];
                int i69 = i53 + iArr18[0];
                int i70 = i54 + iArr18[1];
                int i71 = i55 + iArr18[2];
                i47 = i62 + i69;
                i48 = i63 + i70;
                i49 = i64 + i71;
                i58 = (i58 + 1) % i6;
                int[] iArr19 = iArr9[i58];
                i50 = i65 + iArr19[0];
                i51 = i66 + iArr19[1];
                i52 = i67 + iArr19[2];
                i53 = i69 - iArr19[0];
                i54 = i70 - iArr19[1];
                i55 = i71 - iArr19[2];
                i59 += width;
                i61++;
                i2 = i;
            }
            i44++;
            i2 = i;
            i43 = i60;
            i42 = i57;
            iArr6 = iArr17;
        }
        bitmap.setPixels(iArr2, 0, width, 0, 0, width, i43);
        return bitmap;
    }
}
