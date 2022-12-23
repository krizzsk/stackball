package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13184ga;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.ve */
final class C14883ve extends C13695kb {

    /* renamed from: i */
    private int[] f41262i;

    /* renamed from: j */
    private int[] f41263j;

    C14883ve() {
    }

    /* renamed from: a */
    public void mo70477a(int[] iArr) {
        this.f41262i = iArr;
    }

    /* renamed from: b */
    public C13184ga.C13185a mo68192b(C13184ga.C13185a aVar) throws C13184ga.C13186b {
        int[] iArr = this.f41262i;
        if (iArr == null) {
            return C13184ga.C13185a.f33913e;
        }
        if (aVar.f33916c == 2) {
            boolean z = aVar.f33915b != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f33915b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new C13184ga.C13186b(aVar);
                }
            }
            if (z) {
                return new C13184ga.C13185a(aVar.f33914a, iArr.length, 2);
            }
            return C13184ga.C13185a.f33913e;
        }
        throw new C13184ga.C13186b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo68194f() {
        this.f41263j = this.f41262i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo68196i() {
        this.f41263j = null;
        this.f41262i = null;
    }

    /* renamed from: a */
    public void mo67214a(ByteBuffer byteBuffer) {
        int[] iArr = this.f41263j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = mo68191a(((limit - position) / this.f36079b.f33917d) * this.f36080c.f33917d);
        while (position < limit) {
            for (int i : iArr) {
                a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f36079b.f33917d;
        }
        byteBuffer.position(limit);
        a.flip();
    }
}
