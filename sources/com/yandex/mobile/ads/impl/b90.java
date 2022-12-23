package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class b90 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, sh1> f31267a;

    /* renamed from: b */
    private final Map<String, List<Function1<sh1, Unit>>> f31268b = new LinkedHashMap();

    /* renamed from: c */
    private final uh1 f31269c = new uh1() {
        /* renamed from: a */
        public final C15055wl mo65496a(String str, Function1 function1) {
            return b90.m34189a(b90.this, str, function1);
        }
    };

    /* renamed from: d */
    private final th1 f31270d;

    @Inject
    public b90() {
        new Handler(Looper.getMainLooper());
        ConcurrentHashMap<String, sh1> concurrentHashMap = new ConcurrentHashMap<>();
        this.f31267a = concurrentHashMap;
        this.f31270d = new th1(concurrentHashMap);
    }

    /* renamed from: a */
    public final uh1 mo66020a() {
        return this.f31269c;
    }

    /* renamed from: b */
    public final th1 mo66021b() {
        return this.f31270d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final C15055wl m34189a(b90 b90, String str, Function1 function1) {
        Intrinsics.checkNotNullParameter(b90, "this$0");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(function1, "action");
        return b90.m34190a(str, (Function1<? super sh1, Unit>) function1);
    }

    /* renamed from: a */
    private final C15055wl m34190a(String str, Function1<? super sh1, Unit> function1) {
        sh1 sh1 = this.f31267a.get(str);
        if (sh1 == null) {
            Map<String, List<Function1<sh1, Unit>>> map = this.f31268b;
            List<Function1<sh1, Unit>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            List list2 = list;
            list2.add(function1);
            return new C15055wl(list2, function1) {
                public final /* synthetic */ List f$0;
                public final /* synthetic */ Function1 f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void close() {
                    b90.m34191a(this.f$0, this.f$1);
                }
            };
        }
        function1.invoke(sh1);
        C15055wl wlVar = C15055wl.f42027a;
        Intrinsics.checkNotNullExpressionValue(wlVar, "NULL");
        return wlVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m34191a(List list, Function1 function1) {
        Intrinsics.checkNotNullParameter(list, "$variableObservers");
        Intrinsics.checkNotNullParameter(function1, "$action");
        list.remove(function1);
    }
}
