package com.fyber.inneractive.sdk.p056m;

import android.util.LruCache;

/* renamed from: com.fyber.inneractive.sdk.m.h */
final class C3061h<K> extends LruCache<K, C3064j> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str;
        C3064j jVar = (C3064j) obj2;
        int i = 0;
        for (String next : jVar.f7562b.keySet()) {
            if (!(next == null || (str = jVar.f7562b.get(next)) == null)) {
                i += next.length() + str.length();
            }
        }
        return i + jVar.f7561a.length;
    }

    public C3061h() {
        super(1048576);
    }
}
