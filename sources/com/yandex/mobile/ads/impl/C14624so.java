package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.C13452ix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.so */
public final class C14624so {

    /* renamed from: a */
    private final C14213ot f40080a;

    /* renamed from: b */
    private final g00 f40081b;

    /* renamed from: c */
    private final C14128nr f40082c;

    /* renamed from: d */
    private final C15056wm f40083d;

    /* renamed from: e */
    private final C14395qm f40084e;

    @Inject
    public C14624so(C14213ot otVar, g00 g00, C14128nr nrVar, C15056wm wmVar, C14395qm qmVar) {
        Intrinsics.checkNotNullParameter(otVar, "imageLoader");
        Intrinsics.checkNotNullParameter(g00, "tooltipController");
        Intrinsics.checkNotNullParameter(nrVar, "extensionController");
        Intrinsics.checkNotNullParameter(wmVar, "divActionBinder");
        Intrinsics.checkNotNullParameter(qmVar, "divAccessibilityBinder");
        this.f40080a = otVar;
        this.f40081b = g00;
        this.f40082c = nrVar;
        this.f40083d = wmVar;
        this.f40084e = qmVar;
    }

    /* renamed from: a */
    public static final Drawable m42094a(C14624so soVar, List list, View view, C13513jm jmVar, j50 j50) {
        Drawable drawable;
        x61 x61;
        soVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            drawable = null;
            if (!it.hasNext()) {
                break;
            }
            Object b = ((C14479rn) it.next()).mo69792b();
            if (b instanceof C13133ft) {
                C13133ft ftVar = (C13133ft) b;
                x61 x612 = new x61();
                String uri = ftVar.f33726d.mo66924a(j50).toString();
                Intrinsics.checkNotNullExpressionValue(uri, "background.imageUrl.evaluate(resolver).toString()");
                ij0 a = soVar.f40080a.mo69264a(uri, new C14772un(jmVar, x612, ftVar, j50));
                Intrinsics.checkNotNullExpressionValue(a, "background: DivImageBack…\n            }\n        })");
                jmVar.mo68028a(a, view);
                x61 = x612;
            } else if (b instanceof C14706ts) {
                C14706ts tsVar = (C14706ts) b;
                x61 = new dj0((float) tsVar.f40439a.mo66924a(j50).intValue(), CollectionsKt.toIntArray(tsVar.f40440b.mo67589a(j50)));
            } else {
                x61 = b instanceof C13148fy ? new ColorDrawable(((C13148fy) b).f33776a.mo66924a(j50).intValue()) : null;
            }
            if (x61 != null) {
                drawable = x61.mutate();
            }
            if (drawable != null) {
                arrayList.add(drawable);
            }
        }
        if (!arrayList.isEmpty()) {
            Object[] array = arrayList.toArray(new Drawable[0]);
            if (array != null) {
                drawable = new LayerDrawable((Drawable[]) array);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return drawable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.graphics.Paint} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v101, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v102, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v108, resolved type: com.yandex.mobile.ads.impl.wl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.graphics.Paint} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: android.graphics.Paint} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: type inference failed for: r11v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r0v111, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r0v112 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0405, code lost:
        if (r1 == null) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x044b, code lost:
        if (r1 == null) goto L_0x0451;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x046b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70039a(android.view.View r24, com.yandex.mobile.ads.impl.C14697tn r25, com.yandex.mobile.ads.impl.C14697tn r26, com.yandex.mobile.ads.impl.C13513jm r27) {
        /*
            r23 = this;
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r27
            java.lang.String r13 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r13)
            java.lang.String r0 = "div"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "divView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.yandex.mobile.ads.impl.j50 r14 = r27.mo66388b()
            com.yandex.mobile.ads.impl.l50 r15 = com.yandex.mobile.ads.impl.j31.m37658a(r24)
            java.lang.String r0 = r25.mo66144c()
            r8 = 0
            if (r26 != 0) goto L_0x0028
            r1 = r8
            goto L_0x002c
        L_0x0028:
            java.lang.String r1 = r26.mo66144c()
        L_0x002c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0051
            com.yandex.mobile.ads.impl.mm r0 = r27.mo68043o()
            com.yandex.mobile.ads.impl.e10 r0 = r0.mo66598a()
            java.lang.String r1 = r25.mo66144c()
            int r0 = r0.mo66739a(r1)
            java.lang.String r1 = r25.mo66144c()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            r10.setTag(r1)
            r10.setId(r0)
        L_0x0051:
            r9.mo70037a((android.view.View) r10, (com.yandex.mobile.ads.impl.C14697tn) r11, (com.yandex.mobile.ads.impl.j50) r14)
            com.yandex.mobile.ads.impl.kr r0 = r25.mo66158p()
            boolean r1 = r10 instanceof com.yandex.mobile.ads.impl.C15118wv
            if (r1 == 0) goto L_0x006f
            com.yandex.mobile.ads.impl.kr r0 = new com.yandex.mobile.ads.impl.kr
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 31
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x006f:
            com.yandex.mobile.ads.impl.C14175ob.m40346b((android.view.View) r10, (com.yandex.mobile.ads.impl.C13776kr) r0, (com.yandex.mobile.ads.impl.j50) r14)
            com.yandex.mobile.ads.impl.no r1 = new com.yandex.mobile.ads.impl.no
            r1.<init>(r10, r0, r14)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r2 = r0.f36398b
            com.yandex.mobile.ads.impl.wl r2 = r2.mo66923a(r14, r1)
            r15.mo65870a(r2)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r2 = r0.f36400d
            com.yandex.mobile.ads.impl.wl r2 = r2.mo66923a(r14, r1)
            r15.mo65870a(r2)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r2 = r0.f36399c
            com.yandex.mobile.ads.impl.wl r2 = r2.mo66923a(r14, r1)
            r15.mo65870a(r2)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r0.f36397a
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r1)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.pm r0 = r25.mo66164v()
            if (r0 != 0) goto L_0x00af
            com.yandex.mobile.ads.impl.C14175ob.m40347b((android.view.View) r10, (java.lang.String) r8)
            com.yandex.mobile.ads.impl.C14175ob.m40340a((android.view.View) r10, (java.lang.String) r8)
            com.yandex.mobile.ads.impl.qm r0 = r9.f40084e
            com.yandex.mobile.ads.impl.pm$f r1 = com.yandex.mobile.ads.impl.C14287pm.C14295f.NONE
            r0.mo69622a(r10, r1)
            goto L_0x010e
        L_0x00af:
            com.yandex.mobile.ads.impl.f50<java.lang.String> r1 = r0.f38717a
            if (r1 != 0) goto L_0x00b5
            r1 = r8
            goto L_0x00bb
        L_0x00b5:
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r14)
            java.lang.String r1 = (java.lang.String) r1
        L_0x00bb:
            com.yandex.mobile.ads.impl.C14175ob.m40347b((android.view.View) r10, (java.lang.String) r1)
            com.yandex.mobile.ads.impl.f50<java.lang.String> r1 = r0.f38717a
            if (r1 != 0) goto L_0x00c4
            r1 = r8
            goto L_0x00cd
        L_0x00c4:
            com.yandex.mobile.ads.impl.vn r2 = new com.yandex.mobile.ads.impl.vn
            r2.<init>(r10)
            com.yandex.mobile.ads.impl.wl r1 = r1.mo66923a(r14, r2)
        L_0x00cd:
            if (r1 != 0) goto L_0x00d1
            com.yandex.mobile.ads.impl.wl r1 = com.yandex.mobile.ads.impl.C15055wl.f42027a
        L_0x00d1:
            java.lang.String r2 = "View.observeAccessibilit…     } ?: Disposable.NULL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r15.mo65870a(r1)
            com.yandex.mobile.ads.impl.f50<java.lang.String> r1 = r0.f38718b
            if (r1 != 0) goto L_0x00df
            r1 = r8
            goto L_0x00e5
        L_0x00df:
            java.lang.Object r1 = r1.mo66924a((com.yandex.mobile.ads.impl.j50) r14)
            java.lang.String r1 = (java.lang.String) r1
        L_0x00e5:
            com.yandex.mobile.ads.impl.C14175ob.m40340a((android.view.View) r10, (java.lang.String) r1)
            com.yandex.mobile.ads.impl.f50<java.lang.String> r1 = r0.f38718b
            if (r1 != 0) goto L_0x00ee
            r1 = r8
            goto L_0x00f7
        L_0x00ee:
            com.yandex.mobile.ads.impl.wn r3 = new com.yandex.mobile.ads.impl.wn
            r3.<init>(r10)
            com.yandex.mobile.ads.impl.wl r1 = r1.mo66923a(r14, r3)
        L_0x00f7:
            if (r1 != 0) goto L_0x00fb
            com.yandex.mobile.ads.impl.wl r1 = com.yandex.mobile.ads.impl.C15055wl.f42027a
        L_0x00fb:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r15.mo65870a(r1)
            com.yandex.mobile.ads.impl.qm r1 = r9.f40084e
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.pm$f> r0 = r0.f38719c
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r14)
            com.yandex.mobile.ads.impl.pm$f r0 = (com.yandex.mobile.ads.impl.C14287pm.C14295f) r0
            r1.mo69622a(r10, r0)
        L_0x010e:
            com.yandex.mobile.ads.impl.f50 r0 = r25.mo66150h()
            com.yandex.mobile.ads.impl.yn r1 = new com.yandex.mobile.ads.impl.yn
            r1.<init>(r10)
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66925b(r14, r1)
            r15.mo65870a(r0)
            java.util.List r7 = r25.mo66155m()
            com.yandex.mobile.ads.impl.bs r0 = r25.mo66159q()
            if (r0 != 0) goto L_0x012a
            r6 = r8
            goto L_0x012d
        L_0x012a:
            java.util.List<com.yandex.mobile.ads.impl.rn> r0 = r0.f31407a
            r6 = r0
        L_0x012d:
            com.yandex.mobile.ads.impl.wo r0 = r25.mo66153k()
            com.yandex.mobile.ads.impl.bx r5 = r0.f42075d
            kotlin.jvm.internal.Ref$ObjectRef r16 = new kotlin.jvm.internal.Ref$ObjectRef
            r16.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            com.yandex.mobile.ads.impl.eo r3 = new com.yandex.mobile.ads.impl.eo
            r0 = r3
            r1 = r25
            r2 = r14
            r17 = r3
            r3 = r5
            r18 = r4
            r4 = r24
            r19 = r5
            r5 = r18
            r11 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r11 != 0) goto L_0x0175
            com.yandex.mobile.ads.impl.co r11 = new com.yandex.mobile.ads.impl.co
            r0 = r11
            r1 = r16
            r2 = r7
            r3 = r23
            r4 = r24
            r5 = r27
            r6 = r14
            r12 = r7
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r11.invoke(r0)
            r9.m42097a((java.util.List<? extends com.yandex.mobile.ads.impl.C14479rn>) r12, (com.yandex.mobile.ads.impl.j50) r14, (com.yandex.mobile.ads.impl.l50) r15, (kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>) r11)
            r10 = r8
            r20 = r13
            goto L_0x0198
        L_0x0175:
            r12 = r7
            com.yandex.mobile.ads.impl.do r7 = new com.yandex.mobile.ads.impl.do
            r0 = r7
            r1 = r23
            r2 = r11
            r3 = r24
            r4 = r27
            r5 = r14
            r6 = r12
            r20 = r13
            r13 = r7
            r7 = r16
            r10 = r8
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r13.invoke(r0)
            r9.m42097a((java.util.List<? extends com.yandex.mobile.ads.impl.C14479rn>) r11, (com.yandex.mobile.ads.impl.j50) r14, (com.yandex.mobile.ads.impl.l50) r15, (kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>) r13)
            r9.m42097a((java.util.List<? extends com.yandex.mobile.ads.impl.C14479rn>) r12, (com.yandex.mobile.ads.impl.j50) r14, (com.yandex.mobile.ads.impl.l50) r15, (kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>) r13)
        L_0x0198:
            com.yandex.mobile.ads.impl.wo r0 = r25.mo66153k()
            com.yandex.mobile.ads.impl.f50<java.lang.Boolean> r0 = r0.f42074c
            com.yandex.mobile.ads.impl.ao r1 = new com.yandex.mobile.ads.impl.ao
            r2 = r17
            r1.<init>(r2)
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66925b(r14, r1)
            r15.mo65870a(r0)
            r7 = 1
            r8 = 0
            if (r19 != 0) goto L_0x01b5
            r11 = r10
            r10 = r24
            goto L_0x02c0
        L_0x01b5:
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r24)
            if (r0 == 0) goto L_0x01d4
            android.view.ViewParent r0 = r24.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01c6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x01c7
        L_0x01c6:
            r0 = r10
        L_0x01c7:
            if (r0 != 0) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            r0.setLayerType(r7, r10)
            r0.setClipChildren(r8)
        L_0x01d0:
            r11 = r10
            r10 = r24
            goto L_0x01df
        L_0x01d4:
            com.yandex.mobile.ads.impl.zn r0 = new com.yandex.mobile.ads.impl.zn
            r11 = r10
            r10 = r24
            r0.<init>(r10)
            r10.addOnAttachStateChangeListener(r0)
        L_0x01df:
            com.yandex.mobile.ads.impl.wo r12 = r25.mo66153k()
            com.yandex.mobile.ads.impl.bo r6 = new com.yandex.mobile.ads.impl.bo
            r0 = r18
            r6.<init>(r0, r2)
            com.yandex.mobile.ads.impl.bx r13 = r12.f42075d
            if (r13 != 0) goto L_0x01f0
            goto L_0x02c0
        L_0x01f0:
            android.graphics.drawable.ShapeDrawable r5 = new android.graphics.drawable.ShapeDrawable
            r5.<init>()
            android.graphics.Paint r0 = r5.getPaint()
            r0.setColor(r8)
            com.yandex.mobile.ads.impl.oo r4 = new com.yandex.mobile.ads.impl.oo
            r0 = r4
            r1 = r12
            r2 = r14
            r3 = r24
            r7 = r4
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r7.invoke(r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r12.f42072a
            if (r0 != 0) goto L_0x0213
            r0 = r11
            goto L_0x0217
        L_0x0213:
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
        L_0x0217:
            if (r0 != 0) goto L_0x021b
            com.yandex.mobile.ads.impl.wl r0 = com.yandex.mobile.ads.impl.C15055wl.f42027a
        L_0x021b:
            java.lang.String r1 = "border.cornerRadius?.obs…Shape) ?: Disposable.NULL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.lq r0 = r12.f42073b
            if (r0 != 0) goto L_0x0228
            goto L_0x022c
        L_0x0228:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r0.f36788c
            if (r0 != 0) goto L_0x022e
        L_0x022c:
            r0 = r11
            goto L_0x0232
        L_0x022e:
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
        L_0x0232:
            if (r0 != 0) goto L_0x0236
            com.yandex.mobile.ads.impl.wl r0 = com.yandex.mobile.ads.impl.C15055wl.f42027a
        L_0x0236:
            java.lang.String r1 = "border.cornersRadius?.to…Shape) ?: Disposable.NULL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.lq r0 = r12.f42073b
            if (r0 != 0) goto L_0x0243
            goto L_0x0247
        L_0x0243:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r0.f36789d
            if (r0 != 0) goto L_0x0249
        L_0x0247:
            r0 = r11
            goto L_0x024d
        L_0x0249:
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
        L_0x024d:
            if (r0 != 0) goto L_0x0251
            com.yandex.mobile.ads.impl.wl r0 = com.yandex.mobile.ads.impl.C15055wl.f42027a
        L_0x0251:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.lq r0 = r12.f42073b
            if (r0 != 0) goto L_0x025c
            goto L_0x0260
        L_0x025c:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r0.f36787b
            if (r0 != 0) goto L_0x0262
        L_0x0260:
            r0 = r11
            goto L_0x0266
        L_0x0262:
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
        L_0x0266:
            if (r0 != 0) goto L_0x026a
            com.yandex.mobile.ads.impl.wl r0 = com.yandex.mobile.ads.impl.C15055wl.f42027a
        L_0x026a:
            java.lang.String r1 = "border.cornersRadius?.bo…Shape) ?: Disposable.NULL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.lq r0 = r12.f42073b
            if (r0 != 0) goto L_0x0277
            goto L_0x027b
        L_0x0277:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r0.f36786a
            if (r0 != 0) goto L_0x027d
        L_0x027b:
            r0 = r11
            goto L_0x0281
        L_0x027d:
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
        L_0x0281:
            if (r0 != 0) goto L_0x0285
            com.yandex.mobile.ads.impl.wl r0 = com.yandex.mobile.ads.impl.C15055wl.f42027a
        L_0x0285:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r13.f31619b
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r0 = r13.f31618a
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r13.f31620c
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.nw r0 = r13.f31621d
            com.yandex.mobile.ads.impl.er r0 = r0.f37927a
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r0 = r0.f33051b
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
            r15.mo65870a(r0)
            com.yandex.mobile.ads.impl.nw r0 = r13.f31621d
            com.yandex.mobile.ads.impl.er r0 = r0.f37928b
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r0 = r0.f33051b
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66923a(r14, r7)
            r15.mo65870a(r0)
        L_0x02c0:
            com.yandex.mobile.ads.impl.wo r0 = r25.mo66153k()
            if (r26 != 0) goto L_0x02c8
            r1 = r11
            goto L_0x02cc
        L_0x02c8:
            com.yandex.mobile.ads.impl.wo r1 = r26.mo66153k()
        L_0x02cc:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x02eb
            com.yandex.mobile.ads.impl.wo r0 = r25.mo66153k()
            boolean r1 = r10 instanceof com.yandex.mobile.ads.impl.C15334zo
            if (r1 == 0) goto L_0x02e0
            r1 = r10
            com.yandex.mobile.ads.impl.zo r1 = (com.yandex.mobile.ads.impl.C15334zo) r1
            r1.setBorder(r0, r14)
        L_0x02e0:
            if (r0 != 0) goto L_0x02eb
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x02eb
            r10.setForeground(r11)
        L_0x02eb:
            com.yandex.mobile.ads.impl.bs r0 = r25.mo66159q()
            if (r0 != 0) goto L_0x02f3
            r0 = r11
            goto L_0x02f5
        L_0x02f3:
            com.yandex.mobile.ads.impl.bs$c r0 = r0.f31408b
        L_0x02f5:
            if (r26 != 0) goto L_0x02f8
            goto L_0x02fe
        L_0x02f8:
            com.yandex.mobile.ads.impl.bs r1 = r26.mo66159q()
            if (r1 != 0) goto L_0x0300
        L_0x02fe:
            r1 = r11
            goto L_0x0302
        L_0x0300:
            com.yandex.mobile.ads.impl.bs$c r1 = r1.f31408b
        L_0x0302:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0391
            com.yandex.mobile.ads.impl.bs r0 = r25.mo66159q()
            if (r0 != 0) goto L_0x0310
            r0 = r11
            goto L_0x0312
        L_0x0310:
            com.yandex.mobile.ads.impl.bs$c r0 = r0.f31408b
        L_0x0312:
            com.yandex.mobile.ads.impl.mm r1 = r27.mo68043o()
            com.yandex.mobile.ads.impl.e10 r1 = r1.mo66598a()
            r2 = -1
            if (r0 == 0) goto L_0x0382
            com.yandex.mobile.ads.impl.f50<java.lang.String> r3 = r0.f31420b
            if (r3 == 0) goto L_0x032e
            com.yandex.mobile.ads.impl.io r4 = new com.yandex.mobile.ads.impl.io
            r4.<init>(r10, r1)
            com.yandex.mobile.ads.impl.wl r3 = r3.mo66925b(r14, r4)
            r15.mo65870a(r3)
            goto L_0x0331
        L_0x032e:
            r10.setNextFocusForwardId(r2)
        L_0x0331:
            com.yandex.mobile.ads.impl.f50<java.lang.String> r3 = r0.f31423e
            if (r3 == 0) goto L_0x0342
            com.yandex.mobile.ads.impl.jo r4 = new com.yandex.mobile.ads.impl.jo
            r4.<init>(r10, r1)
            com.yandex.mobile.ads.impl.wl r3 = r3.mo66925b(r14, r4)
            r15.mo65870a(r3)
            goto L_0x0345
        L_0x0342:
            r10.setNextFocusUpId(r2)
        L_0x0345:
            com.yandex.mobile.ads.impl.f50<java.lang.String> r3 = r0.f31422d
            if (r3 == 0) goto L_0x0356
            com.yandex.mobile.ads.impl.ko r4 = new com.yandex.mobile.ads.impl.ko
            r4.<init>(r10, r1)
            com.yandex.mobile.ads.impl.wl r3 = r3.mo66925b(r14, r4)
            r15.mo65870a(r3)
            goto L_0x0359
        L_0x0356:
            r10.setNextFocusRightId(r2)
        L_0x0359:
            com.yandex.mobile.ads.impl.f50<java.lang.String> r3 = r0.f31419a
            if (r3 == 0) goto L_0x036a
            com.yandex.mobile.ads.impl.lo r4 = new com.yandex.mobile.ads.impl.lo
            r4.<init>(r10, r1)
            com.yandex.mobile.ads.impl.wl r3 = r3.mo66925b(r14, r4)
            r15.mo65870a(r3)
            goto L_0x036d
        L_0x036a:
            r10.setNextFocusDownId(r2)
        L_0x036d:
            com.yandex.mobile.ads.impl.f50<java.lang.String> r0 = r0.f31421c
            if (r0 == 0) goto L_0x037e
            com.yandex.mobile.ads.impl.mo r2 = new com.yandex.mobile.ads.impl.mo
            r2.<init>(r10, r1)
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66925b(r14, r2)
            r15.mo65870a(r0)
            goto L_0x0391
        L_0x037e:
            r10.setNextFocusLeftId(r2)
            goto L_0x0391
        L_0x0382:
            r10.setNextFocusForwardId(r2)
            r10.setNextFocusUpId(r2)
            r10.setNextFocusRightId(r2)
            r10.setNextFocusDownId(r2)
            r10.setNextFocusLeftId(r2)
        L_0x0391:
            java.util.List r0 = r25.mo66156n()
            if (r0 != 0) goto L_0x0398
            goto L_0x03a7
        L_0x0398:
            com.yandex.mobile.ads.impl.g00 r1 = r9.f40081b
            r1.getClass()
            r1 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            int r1 = com.yandex.mobile.ads.C12066R.C12068id.div_tooltips_tag
            r10.setTag(r1, r0)
        L_0x03a7:
            r0 = 2
            java.util.List[] r1 = new java.util.List[r0]
            com.yandex.mobile.ads.impl.bs r2 = r25.mo66159q()
            if (r2 != 0) goto L_0x03b2
            r2 = r11
            goto L_0x03b4
        L_0x03b2:
            java.util.List<com.yandex.mobile.ads.impl.tm> r2 = r2.f31410d
        L_0x03b4:
            r1[r8] = r2
            com.yandex.mobile.ads.impl.bs r2 = r25.mo66159q()
            if (r2 != 0) goto L_0x03be
            r2 = r11
            goto L_0x03c0
        L_0x03be:
            java.util.List<com.yandex.mobile.ads.impl.tm> r2 = r2.f31409c
        L_0x03c0:
            r3 = 1
            r1[r3] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.List[] r0 = new java.util.List[r0]
            if (r26 != 0) goto L_0x03cc
            goto L_0x03d2
        L_0x03cc:
            com.yandex.mobile.ads.impl.bs r2 = r26.mo66159q()
            if (r2 != 0) goto L_0x03d4
        L_0x03d2:
            r2 = r11
            goto L_0x03d6
        L_0x03d4:
            java.util.List<com.yandex.mobile.ads.impl.tm> r2 = r2.f31410d
        L_0x03d6:
            r0[r8] = r2
            if (r26 != 0) goto L_0x03db
            goto L_0x03e1
        L_0x03db:
            com.yandex.mobile.ads.impl.bs r2 = r26.mo66159q()
            if (r2 != 0) goto L_0x03e4
        L_0x03e1:
            r2 = r11
        L_0x03e2:
            r3 = 1
            goto L_0x03e7
        L_0x03e4:
            java.util.List<com.yandex.mobile.ads.impl.tm> r2 = r2.f31409c
            goto L_0x03e2
        L_0x03e7:
            r0[r3] = r2
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            int r2 = r1.size()
            int r4 = r0.size()
            if (r2 == r4) goto L_0x0408
            com.yandex.mobile.ads.impl.bs r0 = r25.mo66159q()
            if (r0 != 0) goto L_0x03ff
            r0 = r11
            goto L_0x0401
        L_0x03ff:
            java.util.List<com.yandex.mobile.ads.impl.tm> r0 = r0.f31410d
        L_0x0401:
            com.yandex.mobile.ads.impl.bs r1 = r25.mo66159q()
            if (r1 != 0) goto L_0x044e
            goto L_0x0451
        L_0x0408:
            java.util.Iterator r2 = r1.iterator()
            java.util.Iterator r4 = r0.iterator()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r6)
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r6)
            int r0 = java.lang.Math.min(r1, r0)
            r5.<init>(r0)
        L_0x0423:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0461
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0461
            java.lang.Object r0 = r2.next()
            java.lang.Object r1 = r4.next()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0459
            com.yandex.mobile.ads.impl.bs r0 = r25.mo66159q()
            if (r0 != 0) goto L_0x0445
            r0 = r11
            goto L_0x0447
        L_0x0445:
            java.util.List<com.yandex.mobile.ads.impl.tm> r0 = r0.f31410d
        L_0x0447:
            com.yandex.mobile.ads.impl.bs r1 = r25.mo66159q()
            if (r1 != 0) goto L_0x044e
            goto L_0x0451
        L_0x044e:
            java.util.List<com.yandex.mobile.ads.impl.tm> r1 = r1.f31409c
            r11 = r1
        L_0x0451:
            com.yandex.mobile.ads.impl.wm r1 = r9.f40083d
            r6 = r27
            r1.mo70716a((com.yandex.mobile.ads.impl.C13513jm) r6, (android.view.View) r10, (java.util.List<? extends com.yandex.mobile.ads.impl.C14687tm>) r0, (java.util.List<? extends com.yandex.mobile.ads.impl.C14687tm>) r11)
            goto L_0x0463
        L_0x0459:
            r6 = r27
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r5.add(r0)
            goto L_0x0423
        L_0x0461:
            r6 = r27
        L_0x0463:
            com.yandex.mobile.ads.impl.bs r0 = r25.mo66159q()
            if (r0 == 0) goto L_0x046b
            r7 = 1
            goto L_0x046c
        L_0x046b:
            r7 = 0
        L_0x046c:
            r10.setFocusable(r7)
            com.yandex.mobile.ads.impl.f50 r0 = r25.getVisibility()
            java.lang.Object r1 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r14)
            com.yandex.mobile.ads.impl.l10 r1 = (com.yandex.mobile.ads.impl.l10) r1
            r9.m42095a((android.view.View) r10, (com.yandex.mobile.ads.impl.l10) r1, (com.yandex.mobile.ads.impl.C13513jm) r6)
            com.yandex.mobile.ads.impl.po r1 = new com.yandex.mobile.ads.impl.po
            r1.<init>(r9, r10, r6)
            com.yandex.mobile.ads.impl.wl r0 = r0.mo66925b(r14, r1)
            r15.mo65870a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14624so.mo70039a(android.view.View, com.yandex.mobile.ads.impl.tn, com.yandex.mobile.ads.impl.tn, com.yandex.mobile.ads.impl.jm):void");
    }

    /* renamed from: a */
    public final void mo70037a(View view, C14697tn tnVar, j50 j50) {
        C13215gn gnVar;
        C15055wl wlVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tnVar, "div");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        l50 a = j31.m37658a(view);
        C13452ix f = tnVar.mo66147f();
        C14175ob.m40345b(view, f, j50);
        if (f instanceof C13452ix.C13455c) {
            C13452ix.C13455c cVar = (C13452ix.C13455c) f;
            a.mo65870a(cVar.mo67900c().f42920b.mo66923a(j50, new C14401qo(view, f, j50)));
            a.mo65870a(cVar.mo67900c().f42919a.mo66923a(j50, new C14485ro(view, f, j50)));
        } else {
            boolean z = f instanceof C13452ix.C13456d;
        }
        C13452ix g = tnVar.mo66148g();
        C14175ob.m40336a(view, g, j50);
        if (g instanceof C13452ix.C13455c) {
            C13452ix.C13455c cVar2 = (C13452ix.C13455c) g;
            a.mo65870a(cVar2.mo67900c().f42920b.mo66923a(j50, new C13082fo(view, g, j50)));
            a.mo65870a(cVar2.mo67900c().f42919a.mo66923a(j50, new C13218go(view, g, j50)));
        } else {
            boolean z2 = g instanceof C13452ix.C13456d;
        }
        f50<C13215gn> i = tnVar.mo66151i();
        f50<C13332hn> b = tnVar.mo66143b();
        C15055wl wlVar2 = null;
        if (i == null) {
            gnVar = null;
        } else {
            gnVar = i.mo66924a(j50);
        }
        C14175ob.m40335a(view, gnVar, b == null ? null : b.mo66924a(j50));
        C15194xn xnVar = new C15194xn(view, i, j50, b);
        if (i == null) {
            wlVar = null;
        } else {
            wlVar = i.mo66923a(j50, xnVar);
        }
        if (wlVar == null) {
            wlVar = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(wlVar, "horizontalAlignment?.obs…lback) ?: Disposable.NULL");
        a.mo65870a(wlVar);
        if (b != null) {
            wlVar2 = b.mo66923a(j50, xnVar);
        }
        if (wlVar2 == null) {
            wlVar2 = C15055wl.f42027a;
        }
        Intrinsics.checkNotNullExpressionValue(wlVar2, "verticalAlignment?.obser…lback) ?: Disposable.NULL");
        a.mo65870a(wlVar2);
        C13776kr j = tnVar.mo66152j();
        C14175ob.m40338a(view, j, j50);
        if (j != null) {
            C13337ho hoVar = new C13337ho(view, j, j50);
            a.mo65870a(j.f36398b.mo66923a(j50, hoVar));
            a.mo65870a(j.f36400d.mo66923a(j50, hoVar));
            a.mo65870a(j.f36399c.mo66923a(j50, hoVar));
            a.mo65870a(j.f36397a.mo66923a(j50, hoVar));
        }
    }

    /* renamed from: a */
    public final void mo70038a(View view, C14697tn tnVar, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tnVar, "oldDiv");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        this.f40082c.mo69074c(jmVar, view, tnVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m42095a(View view, l10 l10, C13513jm jmVar) {
        int i;
        int ordinal = l10.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal == 1) {
            i = 4;
        } else if (ordinal == 2) {
            i = 8;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        view.setVisibility(i);
        jmVar.mo68047p();
    }

    /* renamed from: a */
    private final void m42097a(List<? extends C14479rn> list, j50 j50, l50 l50, Function1<Object, Unit> function1) {
        if (list != null) {
            for (C14479rn b : list) {
                Object b2 = b.mo69792b();
                if (b2 instanceof C13148fy) {
                    l50.mo65870a(((C13148fy) b2).f33776a.mo66923a(j50, function1));
                } else if (b2 instanceof C14706ts) {
                    C14706ts tsVar = (C14706ts) b2;
                    l50.mo65870a(tsVar.f40439a.mo66923a(j50, function1));
                    l50.mo65870a(tsVar.f40440b.mo67588a(j50, function1));
                } else if (b2 instanceof C13133ft) {
                    C13133ft ftVar = (C13133ft) b2;
                    l50.mo65870a(ftVar.f33723a.mo66923a(j50, function1));
                    l50.mo65870a(ftVar.f33726d.mo66923a(j50, function1));
                    l50.mo65870a(ftVar.f33724b.mo66923a(j50, function1));
                    l50.mo65870a(ftVar.f33725c.mo66923a(j50, function1));
                    l50.mo65870a(ftVar.f33727e.mo66923a(j50, function1));
                    l50.mo65870a(ftVar.f33728f.mo66923a(j50, function1));
                }
            }
        }
    }
}
