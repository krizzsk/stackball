package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.cn */
public class C11122cn {

    /* renamed from: c */
    private static volatile C11122cn f26669c;

    /* renamed from: a */
    private final Context f26670a;

    /* renamed from: b */
    private final Map<String, C11054an> f26671b = new HashMap();

    C11122cn(Context context) {
        this.f26670a = context;
    }

    /* renamed from: a */
    public static C11122cn m28662a(Context context) {
        if (f26669c == null) {
            synchronized (C11122cn.class) {
                if (f26669c == null) {
                    f26669c = new C11122cn(context);
                }
            }
        }
        return f26669c;
    }

    /* renamed from: a */
    public C11054an mo62737a(String str) {
        if (!this.f26671b.containsKey(str)) {
            synchronized (this) {
                if (!this.f26671b.containsKey(str)) {
                    this.f26671b.put(str, new C11054an(new ReentrantLock(), new C11093bn(this.f26670a, str)));
                }
            }
        }
        return this.f26671b.get(str);
    }
}
