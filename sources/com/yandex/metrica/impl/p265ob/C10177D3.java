package com.yandex.metrica.impl.p265ob;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.D3 */
public class C10177D3 implements C10791Tm<Thread, StackTraceElement[], C11520m7> {
    /* renamed from: a */
    public Object mo61165a(Object obj, Object obj2) {
        List list;
        Thread thread = (Thread) obj;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj2;
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        String name2 = threadGroup != null ? threadGroup.getName() : "";
        Integer valueOf = Integer.valueOf(thread.getState().ordinal());
        if (stackTraceElementArr == null) {
            list = null;
        } else {
            list = Arrays.asList(stackTraceElementArr);
        }
        return new C11520m7(name, priority, id, name2, valueOf, list);
    }
}
