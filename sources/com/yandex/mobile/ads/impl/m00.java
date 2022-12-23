package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.yandex.mobile.ads.impl.C14111nn;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public class m00 {

    /* renamed from: a */
    private final Context f37141a;

    /* renamed from: b */
    private final e10 f37142b;

    @Inject
    public m00(@Named("context") Context context, e10 e10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(e10, "viewIdProvider");
        this.f37141a = context;
        this.f37142b = e10;
    }

    /* renamed from: a */
    public TransitionSet mo68550a(Sequence<? extends C15177xl> sequence, Sequence<? extends C15177xl> sequence2, j50 j50) {
        Intrinsics.checkNotNullParameter(j50, "resolver");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        if (sequence != null) {
            ArrayList arrayList = new ArrayList();
            for (C15177xl xlVar : sequence) {
                String c = xlVar.mo70911b().mo66144c();
                C14111nn s = xlVar.mo70911b().mo66161s();
                if (!(c == null || s == null)) {
                    Transition a = m39213a(s, 2, j50);
                    a.addTarget(this.f37142b.mo66739a(c));
                    arrayList.add(a);
                }
            }
            ef1.m35649a(transitionSet, arrayList);
        }
        if (!(sequence == null || sequence2 == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (C15177xl xlVar2 : sequence) {
                String c2 = xlVar2.mo70911b().mo66144c();
                C13086fp u = xlVar2.mo70911b().mo66163u();
                if (!(c2 == null || u == null)) {
                    Transition a2 = m39212a(u, j50);
                    a2.addTarget(this.f37142b.mo66739a(c2));
                    arrayList2.add(a2);
                }
            }
            ef1.m35649a(transitionSet, arrayList2);
        }
        if (sequence2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (C15177xl xlVar3 : sequence2) {
                String c3 = xlVar3.mo70911b().mo66144c();
                C14111nn d = xlVar3.mo70911b().mo66145d();
                if (!(c3 == null || d == null)) {
                    Transition a3 = m39213a(d, 1, j50);
                    a3.addTarget(this.f37142b.mo66739a(c3));
                    arrayList3.add(a3);
                }
            }
            ef1.m35649a(transitionSet, arrayList3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    private Transition m39213a(C14111nn nnVar, int i, j50 j50) {
        int i2;
        if (nnVar instanceof C14111nn.C14112a) {
            TransitionSet transitionSet = new TransitionSet();
            for (C14111nn a : ((C14111nn.C14112a) nnVar).mo69066b().f36759a) {
                transitionSet.addTransition(m39213a(a, i, j50));
            }
            return transitionSet;
        } else if (nnVar instanceof C14111nn.C14115d) {
            C14111nn.C14115d dVar = (C14111nn.C14115d) nnVar;
            c60 c60 = new c60((float) dVar.mo69067b().f40858a.mo66924a(j50).doubleValue());
            c60.setMode(i);
            c60.setDuration((long) dVar.mo69067b().mo70392j().mo66924a(j50).intValue());
            c60.setStartDelay((long) dVar.mo69067b().mo70394l().mo66924a(j50).intValue());
            c60.setInterpolator(t00.m42195a(dVar.mo69067b().mo70393k().mo66924a(j50)));
            return c60;
        } else if (nnVar instanceof C14111nn.C14116e) {
            C14111nn.C14116e eVar = (C14111nn.C14116e) nnVar;
            t61 t61 = new t61((float) eVar.mo69068b().f40155e.mo66924a(j50).doubleValue(), (float) eVar.mo69068b().f40153c.mo66924a(j50).doubleValue(), (float) eVar.mo69068b().f40154d.mo66924a(j50).doubleValue());
            t61.setMode(i);
            t61.setDuration((long) eVar.mo69068b().mo70062m().mo66924a(j50).intValue());
            t61.setStartDelay((long) eVar.mo69068b().mo70064o().mo66924a(j50).intValue());
            t61.setInterpolator(t00.m42195a(eVar.mo69068b().mo70063n().mo66924a(j50)));
            return t61;
        } else if (nnVar instanceof C14111nn.C14117f) {
            C14111nn.C14117f fVar = (C14111nn.C14117f) nnVar;
            C12992er erVar = fVar.mo69069b().f36946a;
            if (erVar == null) {
                i2 = -1;
            } else {
                DisplayMetrics displayMetrics = this.f37141a.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "context.resources.displayMetrics");
                i2 = C14175ob.m40324a(erVar, displayMetrics, j50);
            }
            int ordinal = fVar.mo69069b().f36948c.mo66924a(j50).ordinal();
            int i3 = 3;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i3 = 48;
                } else if (ordinal == 2) {
                    i3 = 5;
                } else if (ordinal == 3) {
                    i3 = 80;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i91 i91 = new i91(i2, i3);
            i91.setMode(i);
            i91.setDuration((long) fVar.mo69069b().mo68522i().mo66924a(j50).intValue());
            i91.setStartDelay((long) fVar.mo69069b().mo68524k().mo66924a(j50).intValue());
            i91.setInterpolator(t00.m42195a(fVar.mo69069b().mo68523j().mo66924a(j50)));
            return i91;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.transition.ChangeBounds} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: androidx.transition.TransitionSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.transition.ChangeBounds} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.transition.ChangeBounds} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.transition.Transition m39212a(com.yandex.mobile.ads.impl.C13086fp r4, com.yandex.mobile.ads.impl.j50 r5) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.yandex.mobile.ads.impl.C13086fp.C13090d
            if (r0 == 0) goto L_0x0029
            androidx.transition.TransitionSet r0 = new androidx.transition.TransitionSet
            r0.<init>()
            com.yandex.mobile.ads.impl.fp$d r4 = (com.yandex.mobile.ads.impl.C13086fp.C13090d) r4
            com.yandex.mobile.ads.impl.dp r4 = r4.mo67062b()
            java.util.List<com.yandex.mobile.ads.impl.fp> r4 = r4.f32735a
            java.util.Iterator r4 = r4.iterator()
        L_0x0015:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x009b
            java.lang.Object r1 = r4.next()
            com.yandex.mobile.ads.impl.fp r1 = (com.yandex.mobile.ads.impl.C13086fp) r1
            androidx.transition.Transition r1 = r3.m39212a(r1, r5)
            r0.addTransition(r1)
            goto L_0x0015
        L_0x0029:
            boolean r0 = r4 instanceof com.yandex.mobile.ads.impl.C13086fp.C13087a
            if (r0 == 0) goto L_0x009c
            androidx.transition.ChangeBounds r0 = new androidx.transition.ChangeBounds
            r0.<init>()
            com.yandex.mobile.ads.impl.fp$a r4 = (com.yandex.mobile.ads.impl.C13086fp.C13087a) r4
            com.yandex.mobile.ads.impl.bp r1 = r4.mo67061b()
            com.yandex.mobile.ads.impl.f50 r1 = r1.mo66103h()
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r5)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            r0.setDuration(r1)
            com.yandex.mobile.ads.impl.bp r1 = r4.mo67061b()
            com.yandex.mobile.ads.impl.f50 r1 = r1.mo66105j()
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r5)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            r0.setStartDelay(r1)
            com.yandex.mobile.ads.impl.bp r1 = r4.mo67061b()
            com.yandex.mobile.ads.impl.f50 r1 = r1.mo66104i()
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r5)
            com.yandex.mobile.ads.impl.jn r1 = (com.yandex.mobile.ads.impl.C13525jn) r1
            android.view.animation.Interpolator r1 = com.yandex.mobile.ads.impl.t00.m42195a((com.yandex.mobile.ads.impl.C13525jn) r1)
            r0.setInterpolator(r1)
            com.yandex.mobile.ads.impl.bp r4 = r4.mo67061b()
            com.yandex.mobile.ads.impl.f50<java.lang.String> r4 = r4.f31392c
            r1 = 0
            if (r4 != 0) goto L_0x007f
            goto L_0x0098
        L_0x007f:
            java.lang.Object r4 = r4.mo66924a((com.yandex.mobile.ads.impl.j50) r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0088
            goto L_0x0098
        L_0x0088:
            android.graphics.Path r4 = androidx.core.graphics.PathParser.createPathFromPathData(r4)     // Catch:{ RuntimeException -> 0x008d }
            goto L_0x0090
        L_0x008d:
            com.yandex.mobile.ads.impl.ii0 r4 = com.yandex.mobile.ads.impl.ii0.f34887a
            r4 = r1
        L_0x0090:
            if (r4 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            androidx.transition.PatternPathMotion r1 = new androidx.transition.PatternPathMotion
            r1.<init>(r4)
        L_0x0098:
            r0.setPathMotion(r1)
        L_0x009b:
            return r0
        L_0x009c:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m00.m39212a(com.yandex.mobile.ads.impl.fp, com.yandex.mobile.ads.impl.j50):androidx.transition.Transition");
    }
}
