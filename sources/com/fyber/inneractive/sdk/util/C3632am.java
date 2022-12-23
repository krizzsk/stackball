package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.am */
public final class C3632am implements Comparable<C3632am> {

    /* renamed from: a */
    Uri f9898a;

    /* renamed from: b */
    List<String> f9899b;

    /* renamed from: c */
    private C3633a f9900c;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9900c.f9904c.compareTo(((C3632am) obj).f9900c.f9904c);
    }

    public C3632am(C3633a aVar, Uri uri, List<String> list) {
        this.f9900c = aVar;
        this.f9898a = uri;
        this.f9899b = list;
    }

    /* renamed from: com.fyber.inneractive.sdk.util.am$a */
    public enum C3633a {
        Primary(1),
        FallBack(2);
        

        /* renamed from: c */
        Integer f9904c;

        private C3633a(Integer num) {
            this.f9904c = num;
        }
    }
}
