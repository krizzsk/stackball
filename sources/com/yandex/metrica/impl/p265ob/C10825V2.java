package com.yandex.metrica.impl.p265ob;

import android.app.WallpaperManager;

/* renamed from: com.yandex.metrica.impl.ob.V2 */
final class C10825V2<T, R> implements C10897Wm<WallpaperManager, Integer> {

    /* renamed from: a */
    final /* synthetic */ int f25977a;

    C10825V2(int i) {
        this.f25977a = i;
    }

    /* renamed from: a */
    public Object mo61337a(Object obj) {
        return Integer.valueOf(((WallpaperManager) obj).getWallpaperId(this.f25977a));
    }
}
