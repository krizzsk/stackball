package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Qa */
public class C10663Qa {

    /* renamed from: x */
    private static volatile C10663Qa f25448x;

    /* renamed from: a */
    private final Map<String, C11906w8> f25449a = new HashMap();

    /* renamed from: b */
    private final Map<String, C12019z8> f25450b = new HashMap();

    /* renamed from: c */
    private final Map<String, C11976y8> f25451c = new HashMap();

    /* renamed from: d */
    private final C11810u8 f25452d;

    /* renamed from: e */
    private final Context f25453e;

    /* renamed from: f */
    private C11906w8 f25454f;

    /* renamed from: g */
    private C11906w8 f25455g;

    /* renamed from: h */
    private C11976y8 f25456h;

    /* renamed from: i */
    private C11976y8 f25457i;

    /* renamed from: j */
    private C11976y8 f25458j;

    /* renamed from: k */
    private C11976y8 f25459k;

    /* renamed from: l */
    private C12019z8 f25460l;

    /* renamed from: m */
    private C12019z8 f25461m;

    /* renamed from: n */
    private C12019z8 f25462n;

    /* renamed from: o */
    private C12019z8 f25463o;

    /* renamed from: p */
    private C12019z8 f25464p;

    /* renamed from: q */
    private C12019z8 f25465q;

    /* renamed from: r */
    private C10129B8 f25466r;

    /* renamed from: s */
    private C10101A8 f25467s;

    /* renamed from: t */
    private C10157C8 f25468t;

    /* renamed from: u */
    private C12019z8 f25469u;

    /* renamed from: v */
    private C10499M8 f25470v;

    /* renamed from: w */
    private final C10442L0 f25471w;

    public C10663Qa(Context context, C11810u8 u8Var, C10442L0 l0) {
        this.f25453e = context;
        this.f25452d = u8Var;
        this.f25471w = l0;
    }

    /* renamed from: a */
    public static C10663Qa m27298a(Context context) {
        if (f25448x == null) {
            synchronized (C10663Qa.class) {
                if (f25448x == null) {
                    f25448x = new C10663Qa(context.getApplicationContext(), C10591O8.m27117a(), new C10442L0());
                }
            }
        }
        return f25448x;
    }

    /* renamed from: k */
    private C11976y8 m27301k() {
        C11906w8 w8Var;
        if (this.f25458j == null) {
            synchronized (this) {
                if (this.f25455g == null) {
                    this.f25455g = mo61954a("metrica_aip.db", this.f25452d.mo63772a());
                }
                w8Var = this.f25455g;
            }
            this.f25458j = new C10600Oa(new C10543N8(w8Var), "binary_data");
        }
        return this.f25458j;
    }

    /* renamed from: l */
    private C12019z8 m27302l() {
        C10499M8 m8;
        if (this.f25464p == null) {
            synchronized (this) {
                if (this.f25470v == null) {
                    String a = m27299a("metrica_client_data.db");
                    Context context = this.f25453e;
                    this.f25470v = new C10499M8(context, a, new C11093bn(context, "metrica_client_data.db"), this.f25452d.mo63773b());
                }
                m8 = this.f25470v;
            }
            this.f25464p = new C10699Ra("preferences", (C10452L8) m8);
        }
        return this.f25464p;
    }

    /* renamed from: m */
    private C11976y8 m27303m() {
        if (this.f25456h == null) {
            this.f25456h = new C10600Oa(new C10543N8(mo61972r()), "binary_data");
        }
        return this.f25456h;
    }

    /* renamed from: b */
    public synchronized C12019z8 mo61958b(C11101c4 c4Var) {
        C12019z8 z8Var;
        String c4Var2 = c4Var.toString();
        z8Var = this.f25450b.get(c4Var2);
        if (z8Var == null) {
            z8Var = new C10699Ra(mo61959c(c4Var), "preferences");
            this.f25450b.put(c4Var2, z8Var);
        }
        return z8Var;
    }

    /* renamed from: c */
    public synchronized C12019z8 mo61960c() {
        if (this.f25465q == null) {
            this.f25465q = new C10746Sa(this.f25453e, C10183D8.CLIENT, m27302l());
        }
        return this.f25465q;
    }

    /* renamed from: d */
    public synchronized C12019z8 mo61961d() {
        return m27302l();
    }

    /* renamed from: e */
    public synchronized C10101A8 mo61962e() {
        if (this.f25467s == null) {
            this.f25467s = new C10101A8(mo61972r());
        }
        return this.f25467s;
    }

    /* renamed from: f */
    public synchronized C10129B8 mo61963f() {
        if (this.f25466r == null) {
            this.f25466r = new C10129B8(mo61972r());
        }
        return this.f25466r;
    }

    /* renamed from: g */
    public synchronized C12019z8 mo61964g() {
        if (this.f25469u == null) {
            String a = m27299a("metrica_multiprocess_data.db");
            Context context = this.f25453e;
            this.f25469u = new C10699Ra("preferences", (C10452L8) new C10499M8(context, a, new C11093bn(context, "metrica_multiprocess_data.db"), this.f25452d.mo63775d()));
        }
        return this.f25469u;
    }

    /* renamed from: h */
    public synchronized C10157C8 mo61965h() {
        if (this.f25468t == null) {
            this.f25468t = new C10157C8(mo61972r(), "permissions");
        }
        return this.f25468t;
    }

    /* renamed from: i */
    public synchronized C12019z8 mo61966i() {
        if (this.f25461m == null) {
            Context context = this.f25453e;
            C10183D8 d8 = C10183D8.SERVICE;
            if (this.f25460l == null) {
                this.f25460l = new C10699Ra(mo61972r(), "preferences");
            }
            this.f25461m = new C10746Sa(context, d8, this.f25460l);
        }
        return this.f25461m;
    }

    /* renamed from: j */
    public synchronized C12019z8 mo61967j() {
        if (this.f25460l == null) {
            this.f25460l = new C10699Ra(mo61972r(), "preferences");
        }
        return this.f25460l;
    }

    /* renamed from: n */
    public synchronized C11976y8 mo61968n() {
        if (this.f25457i == null) {
            this.f25457i = new C10630Pa(this.f25453e, C10183D8.SERVICE, m27303m());
        }
        return this.f25457i;
    }

    /* renamed from: o */
    public synchronized C11976y8 mo61969o() {
        return m27303m();
    }

    /* renamed from: p */
    public synchronized C12019z8 mo61970p() {
        if (this.f25463o == null) {
            Context context = this.f25453e;
            C10183D8 d8 = C10183D8.SERVICE;
            if (this.f25462n == null) {
                this.f25462n = new C10699Ra(mo61972r(), "startup");
            }
            this.f25463o = new C10746Sa(context, d8, this.f25462n);
        }
        return this.f25463o;
    }

    /* renamed from: q */
    public synchronized C12019z8 mo61971q() {
        if (this.f25462n == null) {
            this.f25462n = new C10699Ra(mo61972r(), "startup");
        }
        return this.f25462n;
    }

    /* renamed from: r */
    public synchronized C11906w8 mo61972r() {
        if (this.f25454f == null) {
            this.f25454f = mo61954a("metrica_data.db", this.f25452d.mo63776e());
        }
        return this.f25454f;
    }

    /* renamed from: b */
    public synchronized C11976y8 mo61957b() {
        return m27301k();
    }

    /* renamed from: c */
    public synchronized C11906w8 mo61959c(C11101c4 c4Var) {
        C11906w8 w8Var;
        String str = "db_metrica_" + c4Var;
        w8Var = this.f25449a.get(str);
        if (w8Var == null) {
            w8Var = mo61954a(str, this.f25452d.mo63774c());
            this.f25449a.put(str, w8Var);
        }
        return w8Var;
    }

    /* renamed from: a */
    public synchronized C11976y8 mo61956a(C11101c4 c4Var) {
        C11976y8 y8Var;
        String c4Var2 = c4Var.toString();
        y8Var = this.f25451c.get(c4Var2);
        if (y8Var == null) {
            y8Var = new C10600Oa(new C10543N8(mo61959c(c4Var)), "binary_data");
            this.f25451c.put(c4Var2, y8Var);
        }
        return y8Var;
    }

    /* renamed from: a */
    public synchronized C11976y8 mo61955a() {
        if (this.f25459k == null) {
            this.f25459k = new C10630Pa(this.f25453e, C10183D8.AUTO_INAPP, m27301k());
        }
        return this.f25459k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11906w8 mo61954a(String str, C10214E8 e8) {
        return new C11906w8(this.f25453e, m27299a(str), e8);
    }

    /* renamed from: a */
    private String m27299a(String str) {
        if (!C10796U2.m27890a(21)) {
            return str;
        }
        try {
            File noBackupFilesDir = this.f25453e.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                return str;
            }
            this.f25471w.getClass();
            File file = new File(noBackupFilesDir, str);
            if (!file.exists()) {
                if (m27300a(noBackupFilesDir, str)) {
                    m27300a(noBackupFilesDir, str + "-journal");
                    m27300a(noBackupFilesDir, str + "-shm");
                    m27300a(noBackupFilesDir, str + "-wal");
                }
            }
            return file.getAbsolutePath();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private boolean m27300a(File file, String str) {
        File databasePath = this.f25453e.getDatabasePath(str);
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        this.f25471w.getClass();
        return databasePath.renameTo(new File(file, str));
    }
}
