package com.yandex.metrica.impl.p265ob;

import com.google.common.net.HttpHeaders;
import com.yandex.metrica.impl.p265ob.C11885vj;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.J2 */
public class C10387J2 implements C10737S1<C11885vj> {

    /* renamed from: a */
    private final C11824uj f24956a;

    /* renamed from: b */
    private final C11075ba f24957b;

    public C10387J2() {
        this(new C11824uj(), new C11075ba());
    }

    /* renamed from: a */
    public Object mo61591a(int i, byte[] bArr, Map map) {
        if (200 == i) {
            List list = (List) map.get(HttpHeaders.CONTENT_ENCODING);
            if (!C10796U2.m27896b((Collection) list) && "encrypted".equals(list.get(0))) {
                bArr = this.f24957b.mo62689a(bArr, "hBnBQbZrmjPXEWVJ");
            }
            if (bArr != null) {
                C11885vj a = this.f24956a.mo63807a(bArr);
                if (C11885vj.C11886a.f28604b == a.mo63991z()) {
                    return a;
                }
            }
        }
        return null;
    }

    C10387J2(C11824uj ujVar, C11075ba baVar) {
        this.f24956a = ujVar;
        this.f24957b = baVar;
    }
}
