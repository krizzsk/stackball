package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.V7 */
public class C10830V7 implements C10498M7<File> {

    /* renamed from: a */
    private final Context f25992a;

    /* renamed from: b */
    private final File f25993b;

    /* renamed from: c */
    private final C10306G9 f25994c;

    /* renamed from: d */
    private final C10442L0 f25995d;

    /* renamed from: e */
    private final C10660Q7 f25996e;

    /* renamed from: f */
    private final C10542N7<String> f25997f;

    /* renamed from: g */
    private final C11769sn f25998g;

    /* renamed from: com.yandex.metrica.impl.ob.V7$a */
    static class C10831a implements C10820Um<File> {
        C10831a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            ((File) obj).delete();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.V7$b */
    static class C10832b implements C10820Um<String> {

        /* renamed from: a */
        private final C10542N7<String> f25999a;

        C10832b(C10542N7<String> n7) {
            this.f25999a = n7;
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f25999a.mo61813b(str);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.V7$c */
    static class C10833c implements C10820Um<String> {

        /* renamed from: a */
        private final C10542N7<String> f26000a;

        C10833c(C10542N7<String> n7) {
            this.f26000a = n7;
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f26000a.mo61812a(str);
            }
        }
    }

    public C10830V7(Context context, C10442L0 l0, C10660Q7 q7, C10542N7<String> n7, C11769sn snVar, C10306G9 g9) {
        this.f25992a = context;
        this.f25995d = l0;
        this.f25993b = l0.mo61699b(context);
        this.f25996e = q7;
        this.f25997f = n7;
        this.f25998g = snVar;
        this.f25994c = g9;
    }

    /* renamed from: a */
    public void mo61784a(Object obj) {
        C10832b bVar = new C10832b(this.f25997f);
        ((C11725rn) this.f25998g).execute(new C11069b7((File) obj, this.f25996e, new C10831a(), bVar));
    }

    /* renamed from: a */
    private void m27983a(File file) {
        File[] fileArr;
        if (file == null || !file.exists()) {
            fileArr = new File[0];
        } else {
            fileArr = file.listFiles(new C10802U7(this));
            if (fileArr == null) {
                fileArr = new File[0];
            }
        }
        for (File b7Var : fileArr) {
            ((C11725rn) this.f25998g).execute(new C11069b7(b7Var, this.f25996e, new C10831a(), new C10833c(this.f25997f)));
        }
    }

    /* renamed from: a */
    public synchronized void mo61783a() {
        File b;
        if (C10796U2.m27890a(21) && (b = this.f25995d.mo61700b(this.f25992a.getFilesDir(), "YandexMetricaNativeCrashes")) != null) {
            if (!this.f25994c.mo61377n()) {
                m27983a(b);
                this.f25994c.mo61378o();
            } else if (b.exists()) {
                try {
                    b.delete();
                } catch (Throwable unused) {
                }
            }
        }
        m27983a(this.f25993b);
    }
}
