package com.yandex.metrica.impl.p265ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.M1 */
public class C10484M1 implements C10584O1 {

    /* renamed from: a */
    private final C11007Zm<String, Integer> f25165a = new C11007Zm<>();

    /* renamed from: b */
    private final Map<C10489e, C10488d> f25166b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<C10489e, C10488d> f25167c = new LinkedHashMap();

    /* renamed from: com.yandex.metrica.impl.ob.M1$a */
    class C10485a implements C10488d {
        C10485a() {
        }

        /* renamed from: a */
        public boolean mo61769a(Intent intent, C10484M1 m1) {
            return C10484M1.m26885a(C10484M1.this, intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$b */
    class C10486b implements C10488d {
        C10486b() {
        }

        /* renamed from: a */
        public boolean mo61769a(Intent intent, C10484M1 m1) {
            return C10484M1.this.m26889e(intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$c */
    class C10487c implements C10488d {
        C10487c() {
        }

        /* renamed from: a */
        public boolean mo61769a(Intent intent, C10484M1 m1) {
            return C10484M1.this.m26889e(intent) && C10484M1.m26884a(C10484M1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$d */
    interface C10488d {
        /* renamed from: a */
        boolean mo61769a(Intent intent, C10484M1 m1);
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$e */
    interface C10489e {
        /* renamed from: a */
        void mo61254a(Intent intent);
    }

    /* renamed from: a */
    public void mo61079a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f25165a.mo62601a(action, Integer.valueOf(m26888d(intent)));
            }
            m26883a(intent, this.f25166b);
        }
    }

    /* renamed from: c */
    public void mo61089c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f25165a.mo62601a(action, Integer.valueOf(m26888d(intent)));
            }
            m26883a(intent, this.f25166b);
        }
    }

    /* renamed from: d */
    public void mo61767d(C10489e eVar) {
        this.f25166b.put(eVar, new C10485a());
    }

    /* renamed from: e */
    public void mo61768e(C10489e eVar) {
        this.f25166b.put(eVar, new C10486b());
    }

    /* renamed from: d */
    private int m26888d(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter(Constants.URL_MEDIA_SOURCE));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m26889e(Intent intent) {
        boolean z = false;
        if (!"com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return false;
        }
        if (m26888d(intent) == Process.myPid()) {
            z = true;
        }
        return !z;
    }

    /* renamed from: b */
    public void mo61087b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f25165a.mo62604b(action, Integer.valueOf(m26888d(intent)));
            }
            m26883a(intent, this.f25167c);
        }
    }

    /* renamed from: a */
    private void m26883a(Intent intent, Map<C10489e, C10488d> map) {
        for (Map.Entry next : map.entrySet()) {
            if (((C10488d) next.getValue()).mo61769a(intent, this)) {
                ((C10489e) next.getKey()).mo61254a(intent);
            }
        }
    }

    /* renamed from: c */
    public void mo61766c(C10489e eVar) {
        this.f25167c.put(eVar, new C10534N1(this));
    }

    /* renamed from: b */
    public void mo61765b(C10489e eVar) {
        this.f25166b.put(eVar, new C10534N1(this));
    }

    /* renamed from: c */
    private int m26887c() {
        Collection<Integer> a = this.f25165a.mo62600a("com.yandex.metrica.IMetricaService");
        if (C10796U2.m27896b((Collection) a)) {
            return 0;
        }
        int i = 0;
        for (Integer intValue : a) {
            if (!(intValue.intValue() == Process.myPid())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo61764a(C10489e eVar) {
        this.f25167c.put(eVar, new C10487c());
    }

    /* renamed from: a */
    static boolean m26885a(C10484M1 m1, Intent intent) {
        if (!m1.m26889e(intent)) {
            return false;
        }
        if (m1.m26887c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m26884a(C10484M1 m1) {
        return m1.m26887c() == 0;
    }
}
