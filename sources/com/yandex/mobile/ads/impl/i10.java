package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import kotlin.jvm.internal.Intrinsics;

public final class i10 {
    /* renamed from: a */
    public static final void m37254a(h10 h10, View view) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof C12996es) {
            h10.mo67382a((C12996es) view);
            for (View a : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a);
            }
        } else if (view instanceof C12417at) {
            h10.mo67378a((C12417at) view);
            for (View a2 : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a2);
            }
        } else if (view instanceof C13140fv) {
            h10.mo67384a((C13140fv) view);
            for (View a3 : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a3);
            }
        } else if (view instanceof C15118wv) {
            h10.mo67390a((C15118wv) view);
            for (View a4 : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a4);
            }
        } else if (view instanceof C14325pw) {
            h10.mo67385a((C14325pw) view);
            for (View a5 : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a5);
            }
        } else if (view instanceof C13016ey) {
            h10.mo67383a((C13016ey) view);
            for (View a6 : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a6);
            }
        } else if (view instanceof C14429qy) {
            h10.mo67386a((C14429qy) view);
            for (View a7 : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a7);
            }
        } else if (view instanceof uc1) {
            h10.getClass();
            Intrinsics.checkNotNullParameter((uc1) view, "view");
            for (View a8 : ViewGroupKt.getChildren((ViewGroup) view)) {
                m37254a(h10, a8);
            }
        } else if (view instanceof C12458ax) {
            h10.mo67379a((C12458ax) view);
        } else if (view instanceof C14628ss) {
            h10.mo67387a((C14628ss) view);
        } else if (view instanceof C14933vt) {
            h10.mo67389a((C14933vt) view);
        } else if (view instanceof C12925dv) {
            h10.mo67380a((C12925dv) view);
        } else if (view instanceof C14633sv) {
            h10.mo67388a((C14633sv) view);
        } else if (view instanceof C12931dy) {
            h10.mo67381a((C12931dy) view);
        } else {
            h10.mo67377a(view);
            if (view instanceof ViewGroup) {
                for (View a9 : ViewGroupKt.getChildren((ViewGroup) view)) {
                    m37254a(h10, a9);
                }
            }
        }
    }
}
