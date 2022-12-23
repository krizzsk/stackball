package com.yandex.mobile.ads.impl;

import com.google.common.base.Ascii;
import com.yandex.mobile.ads.impl.C13184ga;
import java.nio.ByteBuffer;

final class l70 extends C13695kb {

    /* renamed from: i */
    private static final int f36548i = Float.floatToIntBits(Float.NaN);

    l70() {
    }

    /* renamed from: a */
    public void mo67214a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f36079b.f33916c;
        if (i2 == 536870912) {
            byteBuffer2 = mo68191a((i / 3) * 4);
            while (position < limit) {
                m38628a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo68191a(i);
            while (position < limit) {
                m38628a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: b */
    public C13184ga.C13185a mo68192b(C13184ga.C13185a aVar) throws C13184ga.C13186b {
        int i = aVar.f33916c;
        if (!ih1.m37394c(i)) {
            throw new C13184ga.C13186b(aVar);
        } else if (i != 4) {
            return new C13184ga.C13185a(aVar.f33914a, aVar.f33915b, 4);
        } else {
            return C13184ga.C13185a.f33913e;
        }
    }

    /* renamed from: a */
    private static void m38628a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f36548i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
