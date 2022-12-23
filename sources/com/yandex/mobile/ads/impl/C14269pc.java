package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* renamed from: com.yandex.mobile.ads.impl.pc */
public class C14269pc {
    /* renamed from: b */
    private Bitmap m40736b(Bitmap bitmap) {
        int[] iArr;
        int i = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * 0.1f), Math.round(((float) bitmap.getHeight()) * 0.1f), false);
        int i2 = 1;
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int[] iArr7 = new int[1024];
        for (int i6 = 0; i6 < 1024; i6++) {
            iArr7[i6] = i6 / 4;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, new int[]{3, 3});
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < height) {
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i10 <= i2) {
                int i20 = iArr2[i8 + Math.min(i4, Math.max(i10, i))];
                int i21 = i10 + 1;
                int[] iArr9 = iArr8[i21];
                iArr9[i] = (i20 & 16711680) >> 16;
                iArr9[1] = (i20 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i20 & 255;
                int abs = 2 - StrictMath.abs(i10);
                i13 += iArr9[i] * abs;
                i12 += iArr9[1] * abs;
                i11 += iArr9[2] * abs;
                if (i10 > 0) {
                    i19 += iArr9[i];
                    i18 += iArr9[1];
                    i17 += iArr9[2];
                } else {
                    i16 += iArr9[i];
                    i15 += iArr9[1];
                    i14 += iArr9[2];
                }
                i10 = i21;
                i2 = 1;
            }
            int i22 = 1;
            int i23 = 0;
            while (i23 < width) {
                iArr3[i8] = iArr7[i13];
                iArr4[i8] = iArr7[i12];
                iArr5[i8] = iArr7[i11];
                int i24 = i13 - i16;
                int i25 = i12 - i15;
                int i26 = i11 - i14;
                int[] iArr10 = iArr8[((i22 - 1) + 3) % 3];
                int i27 = i16 - iArr10[i];
                int i28 = i15 - iArr10[1];
                int i29 = i14 - iArr10[2];
                if (i7 == 0) {
                    iArr6[i23] = Math.min(i23 + 1 + 1, i4);
                }
                int i30 = iArr2[i9 + iArr6[i23]];
                iArr10[0] = (i30 & 16711680) >> 16;
                iArr10[1] = (i30 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i30 & 255;
                int i31 = i19 + iArr10[0];
                int i32 = i18 + iArr10[1];
                int i33 = i17 + iArr10[2];
                i13 = i24 + i31;
                i12 = i25 + i32;
                i11 = i26 + i33;
                i22 = (i22 + 1) % 3;
                int[] iArr11 = iArr8[i22 % 3];
                i16 = i27 + iArr11[0];
                i15 = i28 + iArr11[1];
                i14 = i29 + iArr11[2];
                i19 = i31 - iArr11[0];
                i18 = i32 - iArr11[1];
                i17 = i33 - iArr11[2];
                i8++;
                i23++;
                i = 0;
            }
            i9 += width;
            i7++;
            i = 0;
            i2 = 1;
        }
        int i34 = 0;
        while (i34 < width) {
            int i35 = width * -1;
            Bitmap bitmap2 = copy;
            int[] iArr12 = iArr6;
            int i36 = -1;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            for (int i46 = 1; i36 <= i46; i46 = 1) {
                int max = Math.max(0, i35) + i34;
                int i47 = i36 + 1;
                int[] iArr13 = iArr8[i47];
                iArr13[0] = iArr3[max];
                iArr13[1] = iArr4[max];
                iArr13[2] = iArr5[max];
                int abs2 = 2 - StrictMath.abs(i36);
                i39 += iArr3[max] * abs2;
                i38 += iArr4[max] * abs2;
                i37 += iArr5[max] * abs2;
                if (i36 > 0) {
                    i43 += iArr13[0];
                    i44 += iArr13[1];
                    i45 += iArr13[2];
                } else {
                    i42 += iArr13[0];
                    i41 += iArr13[1];
                    i40 += iArr13[2];
                }
                if (i36 < i5) {
                    i35 += width;
                }
                i36 = i47;
            }
            int i48 = i34;
            int i49 = 0;
            int i50 = 1;
            while (i49 < height) {
                iArr2[i48] = (iArr2[i48] & ViewCompat.MEASURED_STATE_MASK) | (iArr7[i39] << 16) | (iArr7[i38] << 8) | iArr7[i37];
                int i51 = i39 - i42;
                int i52 = i38 - i41;
                int i53 = i37 - i40;
                int[] iArr14 = iArr8[((i50 - 1) + 3) % 3];
                int i54 = i42 - iArr14[0];
                int i55 = i41 - iArr14[1];
                int i56 = i40 - iArr14[2];
                if (i34 == 0) {
                    iArr = iArr7;
                    iArr12[i49] = Math.min(i49 + 2, i5) * width;
                } else {
                    iArr = iArr7;
                }
                int i57 = iArr12[i49] + i34;
                iArr14[0] = iArr3[i57];
                iArr14[1] = iArr4[i57];
                iArr14[2] = iArr5[i57];
                int i58 = i43 + iArr14[0];
                int i59 = i44 + iArr14[1];
                int i60 = i45 + iArr14[2];
                i39 = i51 + i58;
                i38 = i52 + i59;
                i37 = i53 + i60;
                i50 = (i50 + 1) % 3;
                int[] iArr15 = iArr8[i50];
                i42 = i54 + iArr15[0];
                i41 = i55 + iArr15[1];
                i40 = i56 + iArr15[2];
                i43 = i58 - iArr15[0];
                i44 = i59 - iArr15[1];
                i45 = i60 - iArr15[2];
                i48 += width;
                i49++;
                iArr7 = iArr;
            }
            i34++;
            copy = bitmap2;
            iArr6 = iArr12;
            iArr7 = iArr7;
        }
        Bitmap bitmap3 = copy;
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmap3;
    }

    /* renamed from: a */
    public Bitmap mo69348a(Bitmap bitmap) {
        try {
            return m40736b(bitmap);
        } catch (Throwable unused) {
            return bitmap;
        }
    }
}
