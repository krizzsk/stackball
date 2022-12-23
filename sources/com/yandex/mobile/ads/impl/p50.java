package com.yandex.mobile.ads.impl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yandex.mobile.ads.impl.sh1;
import com.yandex.mobile.ads.impl.w00;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class p50 {

    /* renamed from: a */
    private final b90 f38521a;

    /* renamed from: b */
    private final C12985en f38522b;

    /* renamed from: c */
    private final q30 f38523c;

    /* renamed from: d */
    private final Map<Object, o50> f38524d = new LinkedHashMap();

    @Inject
    public p50(b90 b90, C12985en enVar, q30 q30) {
        Intrinsics.checkNotNullParameter(b90, "globalVariableController");
        Intrinsics.checkNotNullParameter(enVar, "divActionHandler");
        Intrinsics.checkNotNullParameter(q30, "errorCollectors");
        this.f38521a = b90;
        this.f38522b = enVar;
        this.f38523c = q30;
    }

    /* renamed from: a */
    public final o50 mo69318a(C12758cr crVar, C15340zq zqVar) {
        sh1 sh1;
        Intrinsics.checkNotNullParameter(crVar, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(zqVar, "data");
        Map<Object, o50> map = this.f38524d;
        String a = crVar.mo66346a();
        Intrinsics.checkNotNullExpressionValue(a, "tag.id");
        o50 o50 = map.get(a);
        if (o50 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<w00> list = zqVar.f43291f;
            if (list != null) {
                for (w00 w00 : list) {
                    Intrinsics.checkNotNullParameter(w00, "<this>");
                    if (w00 instanceof w00.C15018a) {
                        w00.C15018a aVar = (w00.C15018a) w00;
                        sh1 = new sh1.C14594a(aVar.mo70613b().f39431a, aVar.mo70613b().f39432b);
                    } else if (w00 instanceof w00.C15022e) {
                        w00.C15022e eVar = (w00.C15022e) w00;
                        sh1 = new sh1.C14597d(eVar.mo70615b().f32584a, eVar.mo70615b().f32585b);
                    } else if (w00 instanceof w00.C15023f) {
                        w00.C15023f fVar = (w00.C15023f) w00;
                        sh1 = new sh1.C14596c(fVar.mo70616b().f42970a, fVar.mo70616b().f42971b);
                    } else if (w00 instanceof w00.C15024g) {
                        w00.C15024g gVar = (w00.C15024g) w00;
                        sh1 = new sh1.C14598e(gVar.mo70617b().f36088a, gVar.mo70617b().f36089b);
                    } else if (w00 instanceof w00.C15019b) {
                        w00.C15019b bVar = (w00.C15019b) w00;
                        sh1 = new sh1.C14595b(bVar.mo70614b().f34851a, bVar.mo70614b().f34852b);
                    } else if (w00 instanceof w00.C15025h) {
                        w00.C15025h hVar = (w00.C15025h) w00;
                        sh1 = new sh1.C14599f(hVar.mo70618b().f43116a, hVar.mo70618b().f43117b);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    linkedHashMap.put(sh1.mo69974a(), sh1);
                }
            }
            th1 th1 = new th1(linkedHashMap);
            th1.mo70186a(this.f38521a.mo66021b());
            k50 k50 = new k50(th1, this.f38521a.mo66020a(), this.f38523c.mo69474a(crVar));
            o50 = new o50(k50, th1, new jf1(zqVar.f43290e, th1, k50, this.f38522b, this.f38521a.mo66020a()));
            map.put(a, o50);
        }
        o50 o502 = o50;
        th1 b = o502.mo69118b();
        List<w00> list2 = zqVar.f43291f;
        if (list2 != null) {
            for (w00 w002 : list2) {
                if (w002 instanceof w00.C15018a) {
                    boolean z = b.mo70185a(((w00.C15018a) w002).mo70613b().f39431a) instanceof sh1.C14594a;
                } else if (w002 instanceof w00.C15022e) {
                    boolean z2 = b.mo70185a(((w00.C15022e) w002).mo70615b().f32584a) instanceof sh1.C14597d;
                } else if (w002 instanceof w00.C15023f) {
                    boolean z3 = b.mo70185a(((w00.C15023f) w002).mo70616b().f42970a) instanceof sh1.C14596c;
                } else if (w002 instanceof w00.C15024g) {
                    boolean z4 = b.mo70185a(((w00.C15024g) w002).mo70617b().f36088a) instanceof sh1.C14598e;
                } else if (w002 instanceof w00.C15019b) {
                    boolean z5 = b.mo70185a(((w00.C15019b) w002).mo70614b().f34851a) instanceof sh1.C14595b;
                } else if (w002 instanceof w00.C15025h) {
                    boolean z6 = b.mo70185a(((w00.C15025h) w002).mo70618b().f43116a) instanceof sh1.C14599f;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return o502;
    }
}
