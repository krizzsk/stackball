package com.yandex.metrica.impl.p265ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.C3 */
public class C10152C3 implements C10864Vm<Thread, C11520m7> {
    /* renamed from: a */
    public C11520m7 mo61128a(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C11520m7(name, priority, id, threadGroup != null ? threadGroup.getName() : "", (Integer) null, (List<StackTraceElement>) null);
    }
}
