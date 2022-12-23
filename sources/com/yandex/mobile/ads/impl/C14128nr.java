package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.nr */
public class C14128nr {

    /* renamed from: a */
    private final List<C14307pr> f37899a;

    @Inject
    public C14128nr(List<? extends C14307pr> list) {
        Intrinsics.checkNotNullParameter(list, "extensionHandlers");
        this.f37899a = list;
    }

    /* renamed from: a */
    public void mo69072a(C13513jm jmVar, C14697tn tnVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(tnVar, "div");
        if (m40150a(tnVar)) {
            for (C14307pr prVar : this.f37899a) {
                if (prVar.mo67621a(tnVar)) {
                    prVar.mo67620a(jmVar, tnVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo69073b(C13513jm jmVar, View view, C14697tn tnVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tnVar, "div");
        if (m40150a(tnVar)) {
            for (C14307pr prVar : this.f37899a) {
                if (prVar.mo67621a(tnVar)) {
                    prVar.mo67622b(jmVar, view, tnVar);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo69074c(C13513jm jmVar, View view, C14697tn tnVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tnVar, "div");
        if (m40150a(tnVar)) {
            for (C14307pr prVar : this.f37899a) {
                if (prVar.mo67621a(tnVar)) {
                    prVar.mo67619a(jmVar, view, tnVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo69071a(C13513jm jmVar, View view, C14697tn tnVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tnVar, "div");
        if (m40150a(tnVar)) {
            for (C14307pr prVar : this.f37899a) {
                if (prVar.mo67621a(tnVar)) {
                    prVar.mo67623c(jmVar, view, tnVar);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m40150a(C14697tn tnVar) {
        List<C14008mr> l = tnVar.mo66154l();
        return !(l == null || l.isEmpty()) && (this.f37899a.isEmpty() ^ true);
    }
}
