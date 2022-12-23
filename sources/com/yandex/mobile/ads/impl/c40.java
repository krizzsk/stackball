package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class c40 implements nn0 {
    /* renamed from: a */
    public Metadata mo65103a(pn0 pn0) {
        ByteBuffer byteBuffer = pn0.f39147d;
        byteBuffer.getClass();
        fy0 fy0 = new fy0(byteBuffer.array(), byteBuffer.limit());
        String o = fy0.mo67123o();
        o.getClass();
        String o2 = fy0.mo67123o();
        o2.getClass();
        return new Metadata(new EventMessage(o, o2, fy0.mo67128t(), fy0.mo67128t(), Arrays.copyOfRange(fy0.f33778a, fy0.mo67105b(), fy0.mo67107c())));
    }
}
