package com.yandex.mobile.ads.exo.metadata.scte35;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.de1;
import com.yandex.mobile.ads.impl.ey0;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.nn0;
import com.yandex.mobile.ads.impl.pn0;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.a */
public final class C12259a implements nn0 {

    /* renamed from: a */
    private final fy0 f29979a = new fy0();

    /* renamed from: b */
    private final ey0 f29980b = new ey0();

    /* renamed from: c */
    private de1 f29981c;

    /* renamed from: a */
    public Metadata mo65103a(pn0 pn0) {
        ByteBuffer byteBuffer = pn0.f39147d;
        byteBuffer.getClass();
        de1 de1 = this.f29981c;
        if (de1 == null || pn0.f38750i != de1.mo66567c()) {
            de1 de12 = new de1(pn0.f39149f);
            this.f29981c = de12;
            de12.mo66564a(pn0.f39149f - pn0.f38750i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f29979a.mo67103a(array, limit);
        this.f29980b.mo66889a(array, limit);
        this.f29980b.mo66897d(39);
        long a = (((long) this.f29980b.mo66886a(1)) << 32) | ((long) this.f29980b.mo66886a(32));
        this.f29980b.mo66897d(20);
        int a2 = this.f29980b.mo66886a(12);
        int a3 = this.f29980b.mo66886a(8);
        Metadata.Entry entry = null;
        this.f29979a.mo67114f(14);
        if (a3 == 0) {
            entry = new SpliceNullCommand();
        } else if (a3 == 255) {
            entry = PrivateCommand.m32089a(this.f29979a, a2, a);
        } else if (a3 == 4) {
            entry = SpliceScheduleCommand.m32094a(this.f29979a);
        } else if (a3 == 5) {
            entry = SpliceInsertCommand.m32092a(this.f29979a, a, this.f29981c);
        } else if (a3 == 6) {
            entry = TimeSignalCommand.m32099a(this.f29979a, a, this.f29981c);
        }
        if (entry == null) {
            return new Metadata(new Metadata.Entry[0]);
        }
        return new Metadata(entry);
    }
}
