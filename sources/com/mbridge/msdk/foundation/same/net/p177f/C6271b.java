package com.mbridge.msdk.foundation.same.net.p177f;

import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.b */
/* compiled from: HttpResponse */
public final class C6271b {

    /* renamed from: a */
    private final int f15549a;

    /* renamed from: b */
    private final List<C6245b> f15550b;

    /* renamed from: c */
    private final InputStream f15551c;

    public C6271b(int i, List<C6245b> list, InputStream inputStream) {
        this.f15549a = i;
        this.f15550b = list;
        this.f15551c = inputStream;
    }

    /* renamed from: a */
    public final int mo43852a() {
        return this.f15549a;
    }

    /* renamed from: b */
    public final List<C6245b> mo43853b() {
        return Collections.unmodifiableList(this.f15550b);
    }

    /* renamed from: c */
    public final InputStream mo43854c() {
        return this.f15551c;
    }
}
