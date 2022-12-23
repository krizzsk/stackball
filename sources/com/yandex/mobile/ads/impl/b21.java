package com.yandex.mobile.ads.impl;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class b21 implements eo1 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, ao1<? extends View>> f31203a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public <T extends View> void mo65947a(String str, ao1<T> ao1, int i) {
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(ao1, "factory");
        this.f31203a.put(str, ao1);
    }

    /* renamed from: a */
    public <T extends View> T mo65946a(String str) {
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TAG_KEY);
        ConcurrentHashMap<String, ao1<? extends View>> concurrentHashMap = this.f31203a;
        Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
        ao1<? extends View> ao1 = concurrentHashMap.get(str);
        if (ao1 != null) {
            return ao1.mo65489a();
        }
        throw new NoSuchElementException((String) null);
    }
}
