package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.mobile.ads.impl.C15262yq;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.rq */
public final class C14487rq {

    /* renamed from: a */
    private final C14624so f39533a;

    /* renamed from: b */
    private final C15262yq f39534b;

    /* renamed from: c */
    private final C15202xq f39535c;

    @Inject
    public C14487rq(C14624so soVar, C15262yq yqVar, C15202xq xqVar) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(yqVar, "divCustomViewFactory");
        this.f39533a = soVar;
        this.f39534b = yqVar;
        this.f39535c = xqVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.yandex.mobile.ads.impl.qq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69803a(android.view.View r6, com.yandex.mobile.ads.impl.C14406qq r7, com.yandex.mobile.ads.impl.C13513jm r8) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "div"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "divView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.yandex.mobile.ads.impl.so r0 = r5.f39533a
            r1 = 0
            r0.mo70039a((android.view.View) r6, (com.yandex.mobile.ads.impl.C14697tn) r7, (com.yandex.mobile.ads.impl.C14697tn) r1, (com.yandex.mobile.ads.impl.C13513jm) r8)
            com.yandex.mobile.ads.impl.xq r0 = r5.f39535c
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001c
            goto L_0x0025
        L_0x001c:
            java.lang.String r4 = r7.f39250h
            boolean r0 = r0.mo70218a(r4)
            if (r0 != r2) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x0060
            com.yandex.mobile.ads.impl.xq r0 = r5.f39535c
            boolean r2 = r6 instanceof com.yandex.mobile.ads.impl.C15316zi
            if (r2 != 0) goto L_0x004a
            int r2 = com.yandex.mobile.ads.C12066R.C12068id.div_custom_tag
            java.lang.Object r2 = r6.getTag(r2)
            boolean r4 = r2 instanceof com.yandex.mobile.ads.impl.C14406qq
            if (r4 == 0) goto L_0x003b
            r1 = r2
            com.yandex.mobile.ads.impl.qq r1 = (com.yandex.mobile.ads.impl.C14406qq) r1
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            java.lang.String r1 = r1.f39250h
            java.lang.String r2 = r7.f39250h
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            r1 = r6
            goto L_0x0053
        L_0x004a:
            android.view.View r1 = r0.mo70215a((com.yandex.mobile.ads.impl.C14406qq) r7, (com.yandex.mobile.ads.impl.C13513jm) r8)
            int r2 = com.yandex.mobile.ads.C12066R.C12068id.div_custom_tag
            r1.setTag(r2, r7)
        L_0x0053:
            r0.mo70217a(r1, r7, r8)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0063
            r5.m41663a(r6, r1, r7, r8)
            goto L_0x0063
        L_0x0060:
            r5.m41665a((com.yandex.mobile.ads.impl.C14406qq) r7, (com.yandex.mobile.ads.impl.C13513jm) r8, (android.view.View) r6)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14487rq.mo69803a(android.view.View, com.yandex.mobile.ads.impl.qq, com.yandex.mobile.ads.impl.jm):void");
    }

    @Deprecated(message = "for backward compat only", replaceWith = @ReplaceWith(expression = "DivCustomViewAdapter.newBind", imports = {}))
    /* renamed from: a */
    private final void m41665a(C14406qq qqVar, C13513jm jmVar, View view) {
        this.f39534b.mo65620a(qqVar, jmVar, new C15262yq.C15263a(view, this, qqVar, jmVar) {
            public final /* synthetic */ View f$0;
            public final /* synthetic */ C14487rq f$1;
            public final /* synthetic */ C14406qq f$2;
            public final /* synthetic */ C13513jm f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onCreate(View view) {
                C14487rq.m41664a(this.f$0, this.f$1, this.f$2, this.f$3, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m41664a(View view, C14487rq rqVar, C14406qq qqVar, C13513jm jmVar, View view2) {
        Intrinsics.checkNotNullParameter(view, "$previousView");
        Intrinsics.checkNotNullParameter(rqVar, "this$0");
        Intrinsics.checkNotNullParameter(qqVar, "$div");
        Intrinsics.checkNotNullParameter(jmVar, "$divView");
        Intrinsics.checkNotNullParameter(view2, "newCustomView");
        if (!Intrinsics.areEqual((Object) view2, (Object) view)) {
            rqVar.m41663a(view, view2, qqVar, jmVar);
        }
    }

    /* renamed from: a */
    private final void m41663a(View view, View view2, C14406qq qqVar, C13513jm jmVar) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            i10.m37254a(jmVar.mo68042m(), view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(view2, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(view2, indexOfChild);
            }
            this.f39533a.mo70039a(view2, (C14697tn) qqVar, (C14697tn) null, jmVar);
        }
    }
}
