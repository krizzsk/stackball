package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.parser.offset.C15571a;
import com.yandex.mobile.ads.video.parser.offset.C15572b;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ve0 {

    /* renamed from: b */
    private static final Set<C15571a> f41264b = new HashSet(Arrays.asList(new C15571a[]{C15571a.START, C15571a.END, C15571a.PERCENTAGE, C15571a.TIME, C15571a.POSITION}));

    /* renamed from: c */
    private static final Map<VastTimeOffset.C15570b, InstreamAdBreakPosition.Type> f41265c = new C14884a();

    /* renamed from: a */
    private final C15572b f41266a = new C15572b(f41264b);

    /* renamed from: com.yandex.mobile.ads.impl.ve0$a */
    class C14884a extends HashMap<VastTimeOffset.C15570b, InstreamAdBreakPosition.Type> {
        C14884a() {
            put(VastTimeOffset.C15570b.MILLISECONDS, InstreamAdBreakPosition.Type.MILLISECONDS);
            put(VastTimeOffset.C15570b.PERCENTS, InstreamAdBreakPosition.Type.PERCENTS);
            put(VastTimeOffset.C15570b.POSITION, InstreamAdBreakPosition.Type.POSITION);
        }
    }

    /* renamed from: a */
    public InstreamAdBreakPosition mo70478a(td1 td1) {
        VastTimeOffset a = this.f41266a.mo72005a(td1.mo70157a());
        if (a != null) {
            InstreamAdBreakPosition.Type type = (InstreamAdBreakPosition.Type) ((HashMap) f41265c).get(a.mo71999c());
            if (type != null) {
                return new InstreamAdBreakPosition(type, (long) a.mo72000d());
            }
        }
        return null;
    }
}
