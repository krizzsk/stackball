package com.yandex.metrica.impl.p265ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.metrica.impl.ob.E3 */
public class C10206E3 {

    /* renamed from: a */
    private final C10209c f24544a;

    /* renamed from: b */
    private final C10791Tm<Thread, StackTraceElement[], C11520m7> f24545b;

    /* renamed from: c */
    private final C10348Hm f24546c;

    /* renamed from: com.yandex.metrica.impl.ob.E3$a */
    class C10207a implements C10209c {
        C10207a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E3$b */
    class C10208b implements Comparator<Thread> {
        C10208b(C10206E3 e3) {
        }

        public int compare(Object obj, Object obj2) {
            Thread thread = (Thread) obj;
            Thread thread2 = (Thread) obj2;
            if (thread != thread2) {
                String name = thread.getName();
                String name2 = thread2.getName();
                int i = C10585O2.f25307a;
                if (name == null) {
                    return name2 == null ? 0 : -1;
                }
                if (name2 == null) {
                    return 1;
                }
                return name.compareTo(name2);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E3$c */
    interface C10209c {
    }

    public C10206E3() {
        this(new C10207a(), new C10177D3(), C10941Y.m28234g().mo62505j());
    }

    /* renamed from: a */
    public C11189e7 mo61216a() {
        StackTraceElement[] stackTraceElementArr;
        ((C10207a) this.f24544a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTraceElementArr = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTraceElementArr = null;
        }
        return new C11189e7(this.f24545b.mo61165a(thread, stackTraceElementArr), m26186a(thread, (Thread) null), ((C10197Dm) this.f24546c).mo61204b());
    }

    C10206E3(C10209c cVar, C10791Tm<Thread, StackTraceElement[], C11520m7> tm, C10348Hm hm) {
        this.f24544a = cVar;
        this.f24545b = tm;
        this.f24546c = hm;
    }

    /* renamed from: a */
    public List<C11520m7> mo61217a(Thread thread) {
        ((C10207a) this.f24544a).getClass();
        Thread thread2 = Looper.getMainLooper().getThread();
        List<C11520m7> a = m26186a(thread2, thread);
        if (thread != thread2) {
            StackTraceElement[] stackTraceElementArr = null;
            try {
                stackTraceElementArr = thread2.getStackTrace();
            } catch (SecurityException unused) {
            }
            ((ArrayList) a).add(0, this.f24545b.mo61165a(thread2, stackTraceElementArr));
        }
        return a;
    }

    /* renamed from: a */
    private List<C11520m7> m26186a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C10208b(this));
        try {
            ((C10207a) this.f24544a).getClass();
            map = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (!(thread3 == thread || thread3 == thread2)) {
                arrayList.add(this.f24545b.mo61165a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
