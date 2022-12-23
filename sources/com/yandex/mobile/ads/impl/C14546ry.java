package com.yandex.mobile.ads.impl;

import androidx.collection.ArrayMap;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ry */
public final class C14546ry {

    /* renamed from: a */
    private final C14237oy f39754a;

    /* renamed from: b */
    private final hd1 f39755b;

    /* renamed from: c */
    private final ArrayMap<C12758cr, g10> f39756c = new ArrayMap<>();

    @Inject
    public C14546ry(C14237oy oyVar, hd1 hd1) {
        Intrinsics.checkNotNullParameter(oyVar, "cache");
        Intrinsics.checkNotNullParameter(hd1, "temporaryCache");
        this.f39754a = oyVar;
        this.f39755b = hd1;
    }

    /* renamed from: a */
    public final g10 mo69833a(C12758cr crVar) {
        Intrinsics.checkNotNullParameter(crVar, ViewHierarchyConstants.TAG_KEY);
        g10 g10 = this.f39756c.get(crVar);
        if (g10 == null) {
            String a = this.f39754a.mo65737a(crVar.mo66346a());
            if (a == null) {
                g10 = null;
            } else {
                g10 = new g10(Integer.parseInt(a), new ArrayMap());
            }
            this.f39756c.put(crVar, g10);
        }
        return g10;
    }

    /* renamed from: a */
    public final void mo69834a(C12758cr crVar, int i, boolean z) {
        g10 g10;
        Intrinsics.checkNotNullParameter(crVar, ViewHierarchyConstants.TAG_KEY);
        if (!Intrinsics.areEqual((Object) C12758cr.f32024b, (Object) crVar)) {
            g10 a = mo69833a(crVar);
            ArrayMap<C12758cr, g10> arrayMap = this.f39756c;
            if (a == null) {
                g10 = new g10(i, new ArrayMap());
            } else {
                g10 = new g10(i, a.mo67145a());
            }
            arrayMap.put(crVar, g10);
            hd1 hd1 = this.f39755b;
            String a2 = crVar.mo66346a();
            Intrinsics.checkNotNullExpressionValue(a2, "tag.id");
            String valueOf = String.valueOf(i);
            hd1.getClass();
            Intrinsics.checkNotNullParameter(a2, "cardId");
            Intrinsics.checkNotNullParameter(valueOf, "stateId");
            hd1.mo67529a(a2, "/", valueOf);
            if (!z) {
                this.f39754a.mo65738a(crVar.mo66346a(), String.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo69835a(String str, C14729ty tyVar, boolean z) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(tyVar, "divStatePath");
        String b = tyVar.mo70246b();
        String a = tyVar.mo70245a();
        if (b != null && a != null) {
            this.f39755b.mo67529a(str, b, a);
            if (!z) {
                this.f39754a.mo65739a(str, b, a);
            }
        }
    }
}
