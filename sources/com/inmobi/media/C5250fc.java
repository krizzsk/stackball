package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.C5253fe;
import java.util.Map;

/* renamed from: com.inmobi.media.fc */
/* compiled from: ConfigNetworkClient */
class C5250fc implements Runnable {

    /* renamed from: a */
    private static final String f12021a = C5250fc.class.getSimpleName();

    /* renamed from: b */
    private C5252fd f12022b;

    /* renamed from: c */
    private C5251a f12023c;

    /* renamed from: d */
    private final C5252fd f12024d;

    /* renamed from: com.inmobi.media.fc$a */
    /* compiled from: ConfigNetworkClient */
    public interface C5251a {
        /* renamed from: a */
        void mo40566a(C5253fe.C5254a aVar);

        /* renamed from: a */
        void mo40567a(String str);
    }

    C5250fc(C5251a aVar, C5252fd fdVar, C5252fd fdVar2) {
        this.f12023c = aVar;
        this.f12022b = fdVar;
        this.f12024d = fdVar2;
    }

    /* renamed from: a */
    private void m12018a(C5252fd fdVar, Map<String, C5253fe.C5254a> map) {
        for (Map.Entry next : map.entrySet()) {
            C5253fe.C5254a aVar = (C5253fe.C5254a) next.getValue();
            String str = (String) next.getKey();
            if (!aVar.mo40577a()) {
                this.f12023c.mo40566a(aVar);
                fdVar.f12030c.remove(str);
            }
        }
    }

    /* renamed from: a */
    private static C5253fe m12017a(C5252fd fdVar) {
        return new C5253fe(fdVar, new C5301ge(fdVar).mo40629a(), SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    private boolean m12019a(C5252fd fdVar, int i, Map<String, C5253fe.C5254a> map) throws InterruptedException {
        if (i > fdVar.f12028a) {
            for (Map.Entry<String, C5238ex> key : fdVar.f12030c.entrySet()) {
                String str = (String) key.getKey();
                if (map.containsKey(str)) {
                    this.f12023c.mo40566a(map.get(str));
                }
            }
            return true;
        }
        Thread.sleep((long) (fdVar.f12029b * 1000));
        return false;
    }

    public void run() {
        Map<String, C5253fe.C5254a> map;
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (i2 > this.f12022b.f12028a) {
                    break;
                }
                C5253fe a = m12017a(this.f12022b);
                map = a.f12032a;
                if (!(a.mo40576a() && this.f12024d != null)) {
                    m12018a(this.f12022b, map);
                    if (this.f12022b.f12030c.isEmpty()) {
                        break;
                    }
                    i2++;
                } else {
                    while (i <= this.f12024d.f12028a) {
                        C5253fe a2 = m12017a(this.f12024d);
                        Map<String, C5253fe.C5254a> map2 = a2.f12032a;
                        if (a2.mo40576a()) {
                            break;
                        }
                        m12018a(this.f12024d, map2);
                        if (this.f12024d.f12030c.isEmpty()) {
                            break;
                        }
                        i++;
                        if (m12019a(this.f12024d, i, map2)) {
                            break;
                        }
                    }
                    this.f12023c.mo40567a(this.f12024d.mo40575b());
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            }
        } while (!m12019a(this.f12022b, i2, map));
        this.f12023c.mo40567a(this.f12022b.mo40575b());
    }
}
