package com.yandex.mobile.ads.video.parser.vmap.configurator;

import com.yandex.mobile.ads.impl.r50;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.video.parser.vmap.configurator.a */
public class C15575a {
    /* renamed from: a */
    public AdBreakParameters mo72016a(List<r50> list) {
        AdBreakParameters.C15574b bVar = new AdBreakParameters.C15574b();
        for (r50 next : list) {
            String a = next.mo69693a();
            String b = next.mo69694b();
            a.getClass();
            char c = 65535;
            int hashCode = a.hashCode();
            if (hashCode != -1911885814) {
                if (hashCode != -1683202543) {
                    if (hashCode == -1004971335 && a.equals("CategoryID")) {
                        c = 2;
                    }
                } else if (a.equals("SessionID")) {
                    c = 1;
                }
            } else if (a.equals("PageID")) {
                c = 0;
            }
            if (c == 0) {
                bVar.mo72014b(b);
            } else if (c == 1) {
                bVar.mo72015c(b);
            } else if (c == 2) {
                bVar.mo72013a(b);
            }
        }
        return new AdBreakParameters(bVar, (AdBreakParameters.C15573a) null);
    }
}
