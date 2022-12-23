package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.b2 */
public final class C12564b2 {

    /* renamed from: a */
    private final List<C13471j2> f31200a;

    /* renamed from: b */
    private int f31201b;

    public C12564b2(List<C13471j2> list) {
        Intrinsics.checkNotNullParameter(list, "adGroupPlaybackItems");
        this.f31200a = list;
    }

    /* renamed from: b */
    private final C13471j2 m34107b() {
        return (C13471j2) CollectionsKt.getOrNull(this.f31200a, this.f31201b);
    }

    /* renamed from: a */
    public final C13471j2 mo65939a(ck1<VideoAd> ck1) {
        T t;
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Iterator<T> it = this.f31200a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual((Object) ((C13471j2) t).mo67918c(), (Object) ck1)) {
                break;
            }
        }
        return (C13471j2) t;
    }

    /* renamed from: c */
    public final ck1<VideoAd> mo65941c() {
        C13471j2 b = m34107b();
        if (b == null) {
            return null;
        }
        return b.mo67918c();
    }

    /* renamed from: d */
    public final lg0 mo65942d() {
        C13471j2 b = m34107b();
        if (b == null) {
            return null;
        }
        return b.mo67916a();
    }

    /* renamed from: e */
    public final ln1 mo65943e() {
        C13471j2 b = m34107b();
        if (b == null) {
            return null;
        }
        return b.mo67919d();
    }

    /* renamed from: f */
    public final C13471j2 mo65944f() {
        return (C13471j2) CollectionsKt.getOrNull(this.f31200a, this.f31201b + 1);
    }

    /* renamed from: g */
    public final C13471j2 mo65945g() {
        this.f31201b++;
        return m34107b();
    }

    /* renamed from: a */
    public final void mo65940a() {
        this.f31201b = this.f31200a.size();
    }
}
