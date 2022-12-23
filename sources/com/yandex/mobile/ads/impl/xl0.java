package com.yandex.mobile.ads.impl;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

public final class xl0 {
    /* renamed from: a */
    public static void m44072a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }

    /* renamed from: a */
    public static void m44071a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
