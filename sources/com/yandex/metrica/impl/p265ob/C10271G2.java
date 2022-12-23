package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.p265ob.C10089A;
import com.yandex.metrica.impl.p265ob.C10135Be;
import com.yandex.metrica.impl.p265ob.C10501Ma;
import com.yandex.metrica.impl.p265ob.C10622P3;
import com.yandex.metrica.impl.p265ob.C10653Q1;
import com.yandex.metrica.impl.p265ob.C10675Qi;
import com.yandex.metrica.impl.p265ob.C10726Ri;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.G2 */
public class C10271G2 extends C10653Q1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10364I9 f24712a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f24713b;

    /* renamed from: c */
    private final C10332H8 f24714c;

    /* renamed from: com.yandex.metrica.impl.ob.G2$a */
    class C10272a extends SparseArray<C10653Q1.C10654a> {
        C10272a() {
            put(29, new C10281j(C10271G2.this.f24713b));
            put(39, new C10282k());
            put(47, new C10283l(C10271G2.this.f24712a));
            put(60, new C10284m(C10271G2.this.f24712a));
            put(62, new C10285n());
            put(66, new C10286o());
            put(67, new C10278g(C10501Ma.C10503b.m26925a(C10726Ri.class).mo61786b(C10271G2.this.f24713b), new C10398J9(C10663Qa.m27298a(C10271G2.this.f24713b).mo61971q(), C10271G2.this.f24713b.getPackageName())));
            put(68, new C10296u());
            put(72, new C10277f(C10501Ma.C10503b.m26926b(C11347ie.class).mo61786b(C10271G2.this.f24713b), C10501Ma.C10503b.m26925a(C10726Ri.class).mo61786b(C10271G2.this.f24713b)));
            put(82, new C10279h(C10501Ma.C10503b.m26926b(C11347ie.class).mo61786b(C10271G2.this.f24713b), C10501Ma.C10503b.m26925a(C11040ae.class).mo61786b(C10271G2.this.f24713b)));
            put(87, new C10280i(C10501Ma.C10503b.m26925a(C10726Ri.class).mo61786b(C10271G2.this.f24713b)));
            put(92, new C10274c(C10501Ma.C10503b.m26925a(C10726Ri.class).mo61786b(C10271G2.this.f24713b)));
            put(93, new C10276e(C10271G2.this.f24713b, C10501Ma.C10503b.m26925a(C10459Le.class).mo61786b(C10271G2.this.f24713b), C10501Ma.C10503b.m26925a(C10135Be.class).mo61786b(C10271G2.this.f24713b)));
            put(94, new C10291p(C10271G2.this.f24713b, C10501Ma.C10503b.m26925a(C10726Ri.class).mo61786b(C10271G2.this.f24713b)));
            put(98, new C10295t(C10271G2.this.f24712a));
            put(100, new C10273b(new C10398J9(C10663Qa.m27298a(C10271G2.this.f24713b).mo61971q(), C10271G2.this.f24713b.getPackageName())));
            put(101, new C10292q(C10271G2.this.f24712a, C10501Ma.C10503b.m26925a(C10726Ri.class).mo61786b(C10271G2.this.f24713b)));
            put(102, new C10293r(C10501Ma.C10503b.m26925a(C10135Be.class).mo61786b(C10271G2.this.f24713b)));
            put(103, new C10275d(C10501Ma.C10503b.m26925a(C11774t2.class).mo61786b(C10271G2.this.f24713b), C10501Ma.C10503b.m26925a(C10622P3.class).mo61786b(C10271G2.this.f24713b), C10271G2.this.f24712a));
            put(104, new C10294s(C10663Qa.m27298a(C10271G2.this.f24713b).mo61969o()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$b */
    static class C10273b implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10398J9 f24716a;

        public C10273b(C10398J9 j9) {
            this.f24716a = j9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f24716a.mo61609e();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$c */
    static class C10274c implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10662Q9<C10726Ri> f24717a;

        C10274c(C10662Q9<C10726Ri> q9) {
            this.f24717a = q9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C10726Ri ri = (C10726Ri) this.f24717a.mo61953b();
            this.f24717a.mo61952a(ri.mo62150a(ri.f25696s).mo62193h(ri.f25694q).mo62174a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$d */
    static class C10275d implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10662Q9<C11774t2> f24718a;

        /* renamed from: b */
        private final C10662Q9<C10622P3> f24719b;

        /* renamed from: c */
        private final C10364I9 f24720c;

        public C10275d(C10662Q9<C11774t2> q9, C10662Q9<C10622P3> q92, C10364I9 i9) {
            this.f24718a = q9;
            this.f24719b = q92;
            this.f24720c = i9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C11774t2 t2Var = (C11774t2) this.f24718a.mo61953b();
            this.f24718a.mo61951a();
            if (t2Var.f28264b) {
                if (!C10796U2.m27897b((Map) t2Var.f28263a)) {
                    C10622P3.C10623a aVar = new C10622P3.C10623a(t2Var.f28263a, C10202E0.SATELLITE);
                    this.f24719b.mo61952a(new C10622P3(aVar, Collections.singletonList(aVar)));
                }
                this.f24720c.mo61522g();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$e */
    static class C10276e implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10338He f24721a;

        /* renamed from: b */
        private final C10662Q9<C10459Le> f24722b;

        /* renamed from: c */
        private final C10662Q9<C10135Be> f24723c;

        C10276e(Context context, C10662Q9<C10459Le> q9, C10662Q9<C10135Be> q92) {
            this(q9, q92, new C10338He(context));
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C10459Le a;
            C10459Le le = (C10459Le) this.f24722b.mo61953b();
            ArrayList arrayList = new ArrayList();
            C10202E0 e0 = le.f25113e;
            if (e0 != C10202E0.UNDEFINED) {
                arrayList.add(new C10135Be.C10136a(le.f25109a, le.f25110b, e0));
            }
            if (le.f25113e == C10202E0.RETAIL && (a = this.f24721a.invoke()) != null) {
                arrayList.add(new C10135Be.C10136a(a.f25109a, a.f25110b, a.f25113e));
            }
            this.f24723c.mo61952a(new C10135Be(le, arrayList));
            this.f24722b.mo61951a();
        }

        C10276e(C10662Q9<C10459Le> q9, C10662Q9<C10135Be> q92, C10338He he) {
            this.f24722b = q9;
            this.f24723c = q92;
            this.f24721a = he;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$f */
    static class C10277f implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10662Q9<Collection<C11347ie>> f24724a;

        /* renamed from: b */
        private final C10662Q9<C10726Ri> f24725b;

        /* renamed from: c */
        private final C10442L0 f24726c;

        public C10277f(C10662Q9<Collection<C11347ie>> q9, C10662Q9<C10726Ri> q92) {
            this(q9, q92, new C10442L0());
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            JSONObject jSONObject;
            String str;
            C10157C8 h = C10663Qa.m27298a(context).mo61965h();
            List<C11347ie> b = h.mo61140b();
            if (b != null) {
                this.f24724a.mo61952a(b);
                h.mo61139a();
            }
            C10726Ri ri = (C10726Ri) this.f24725b.mo61953b();
            C10726Ri.C10728b a = ri.mo62150a(ri.f25696s);
            String str2 = null;
            try {
                jSONObject = new JSONObject(C10823V0.m27962a(this.f24726c.mo61700b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null && C10796U2.m27890a(21)) {
                try {
                    jSONObject = new JSONObject(C10823V0.m27962a(this.f24726c.mo61700b(context.getNoBackupFilesDir(), "credentials.dat")));
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject != null) {
                str2 = jSONObject.optString("device_id", (String) null);
                str = jSONObject.optString("device_id_hash", (String) null);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo62182c(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                a.mo62187e(str);
            }
            a.mo62179b(true);
            this.f24725b.mo61952a(a.mo62174a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        C10277f(C10662Q9<Collection<C11347ie>> q9, C10662Q9<C10726Ri> q92, C10442L0 l0) {
            this.f24724a = q9;
            this.f24725b = q92;
            this.f24726c = l0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$g */
    static class C10278g implements C10653Q1.C10654a {

        /* renamed from: a */
        private C10662Q9 f24727a;

        /* renamed from: b */
        private C10398J9 f24728b;

        public C10278g(C10662Q9 q9, C10398J9 j9) {
            this.f24727a = q9;
            this.f24728b = j9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f24727a.mo61952a(this.f24728b.mo61610f());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$h */
    static class C10279h implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10662Q9<Collection<C11347ie>> f24729a;

        /* renamed from: b */
        private final C10662Q9<C11040ae> f24730b;

        C10279h(C10662Q9<Collection<C11347ie>> q9, C10662Q9<C11040ae> q92) {
            this.f24729a = q9;
            this.f24730b = q92;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f24730b.mo61952a(new C11040ae(new ArrayList((Collection) this.f24729a.mo61953b()), (C10322H) null, new ArrayList()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$i */
    static class C10280i implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10662Q9<C10726Ri> f24731a;

        C10280i(C10662Q9<C10726Ri> q9) {
            this.f24731a = q9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C10662Q9<C10726Ri> q9 = this.f24731a;
            C10726Ri ri = (C10726Ri) q9.mo61953b();
            q9.mo61952a(ri.mo62150a(ri.f25696s).mo62179b(true).mo62174a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$j */
    static class C10281j implements C10653Q1.C10654a {

        /* renamed from: a */
        private C11912we f24732a;

        /* renamed from: b */
        private C10398J9 f24733b;

        C10281j(Context context) {
            this.f24732a = new C11912we(context);
            this.f24733b = new C10398J9(C10663Qa.m27298a(context).mo61970p(), context.getPackageName());
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            String b = this.f24732a.mo64032b((String) null);
            if (!TextUtils.isEmpty(b)) {
                this.f24733b.mo61613h(b).mo61454c();
                C11912we.m30775b(context);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$k */
    static class C10282k implements C10653Q1.C10654a {
        C10282k() {
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C11789te teVar = new C11789te(context, context.getPackageName());
            SharedPreferences a = C11327i.m29165a(context, "_boundentrypreferences");
            C11984ye yeVar = C11789te.f28300H;
            String string = a.getString(yeVar.mo64147b(), (String) null);
            C11984ye yeVar2 = C11789te.f28301I;
            long j = a.getLong(yeVar2.mo64147b(), -1);
            if (string != null && j != -1) {
                teVar.mo63726a(new C10089A.C10090a(string, j)).mo63599b();
                a.edit().remove(yeVar.mo64147b()).remove(yeVar2.mo64147b()).apply();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$l */
    static class C10283l implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10364I9 f24734a;

        C10283l(C10364I9 i9) {
            this.f24734a = i9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C10364I9 i9 = this.f24734a;
            C11947xe xeVar = new C11947xe(context, (String) null);
            if (xeVar.mo64076f()) {
                i9.mo61517d(true);
                xeVar.mo64077g();
            }
            C10364I9 i92 = this.f24734a;
            C11849ve veVar = new C11849ve(context, context.getPackageName());
            long a = veVar.mo63841a(0);
            if (a != 0) {
                i92.mo61532l(a);
            }
            veVar.mo63842f();
            new C11789te(context, new C11672q4(context.getPackageName(), (String) null).mo62716b()).mo63740i().mo63599b();
            this.f24734a.mo61454c();
            C11599oe oeVar = new C11599oe(context);
            oeVar.mo63432a();
            oeVar.mo63433b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$m */
    static class C10284m implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10364I9 f24735a;

        C10284m(C10364I9 i9) {
            this.f24735a = i9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            long j = new C10398J9(C10663Qa.m27298a(context).mo61971q(), context.getPackageName()).mo61610f().f25700w;
            boolean z = true;
            boolean z2 = j > 0;
            if (this.f24735a.mo61508b(-1) <= 0) {
                z = false;
            }
            if (z2 || z) {
                this.f24735a.mo61515c(false).mo61454c();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$n */
    static class C10285n implements C10653Q1.C10654a {
        C10285n() {
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C10398J9 j9 = new C10398J9(C10663Qa.m27298a(context).mo61971q(), context.getPackageName());
            String g = j9.mo61612g((String) null);
            if (g != null) {
                j9.mo61608b((List<String>) Collections.singletonList(g));
            }
            String f = j9.mo61611f((String) null);
            if (f != null) {
                j9.mo61605a((List<String>) Collections.singletonList(f));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$o */
    static class C10286o implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10442L0 f24736a;

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$a */
        static class C10287a implements FilenameFilter {

            /* renamed from: a */
            final Iterable<FilenameFilter> f24737a;

            C10287a(Iterable<FilenameFilter> iterable) {
                this.f24737a = iterable;
            }

            public boolean accept(File file, String str) {
                for (FilenameFilter accept : this.f24737a) {
                    if (accept.accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$b */
        static class C10288b implements FilenameFilter {

            /* renamed from: a */
            private final FilenameFilter f24738a;

            C10288b(FilenameFilter filenameFilter) {
                this.f24738a = filenameFilter;
            }

            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.f24738a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$c */
        static class C10289c implements FilenameFilter {
            C10289c() {
            }

            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$d */
        static class C10290d implements FilenameFilter {

            /* renamed from: a */
            private final String f24739a;

            C10290d(String str) {
                this.f24739a = str;
            }

            public boolean accept(File file, String str) {
                return !str.contains(this.f24739a);
            }
        }

        C10286o() {
            this(new C10442L0());
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            File[] fileArr;
            if (mo61346b(context) == null) {
                fileArr = new File[0];
            } else {
                fileArr = mo61346b(context).listFiles(new C10287a(Arrays.asList(new FilenameFilter[]{new C10288b(new C10290d(context.getPackageName())), new C10288b(new C10289c())})));
            }
            for (File file : fileArr) {
                try {
                    if (!file.delete()) {
                        ((C10552Nh) C10611Oh.m27142a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    ((C10552Nh) C10611Oh.m27142a()).reportError("Can not delete file", th);
                }
            }
            new C10398J9(C10663Qa.m27298a(context).mo61971q(), context.getPackageName()).mo61457e(new C11984ye("LAST_STARTUP_CLIDS_SAVE_TIME", (String) null).mo64145a()).mo61454c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public File mo61346b(Context context) {
            if (C10796U2.m27890a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.f24736a.mo61700b(filesDir.getParentFile(), "databases");
            }
            return null;
        }

        C10286o(C10442L0 l0) {
            this.f24736a = l0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$r */
    static class C10293r implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10662Q9<C10135Be> f24750a;

        public C10293r(C10662Q9<C10135Be> q9) {
            this.f24750a = q9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C10135Be be = (C10135Be) this.f24750a.mo61953b();
            ArrayList arrayList = new ArrayList();
            C10135Be.C10136a aVar = null;
            for (C10135Be.C10136a next : be.f24402b) {
                if (next.f24405c != C10202E0.APP) {
                    arrayList.add(next);
                } else if (aVar == null) {
                    arrayList.add(next);
                    aVar = next;
                }
            }
            this.f24750a.mo61952a(new C10135Be(be.f24401a, arrayList));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$s */
    static class C10294s implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C11976y8 f24751a;

        public C10294s(C11976y8 y8Var) {
            this.f24751a = y8Var;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f24751a.mo61857b("notification_cache_state");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$t */
    static class C10295t implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10364I9 f24752a;

        public C10295t(C10364I9 i9) {
            this.f24752a = i9;
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            this.f24752a.mo61457e(new C11984ye("REFERRER", (String) null).mo64145a()).mo61457e(new C11984ye("REFERRER_HOLDER_STATE", (String) null).mo64145a()).mo61454c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$u */
    static class C10296u implements C10653Q1.C10654a {
        C10296u() {
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            C10662Q9<C10726Ri> b = C10501Ma.C10503b.m26925a(C10726Ri.class).mo61786b(context);
            C10726Ri ri = (C10726Ri) b.mo61953b();
            b.mo61952a(ri.mo62150a(ri.f25696s).mo62173a(ri.f25700w > 0).mo62179b(true).mo62174a());
        }
    }

    C10271G2(Context context, C10364I9 i9, C10332H8 h8) {
        this.f24713b = context;
        this.f24712a = i9;
        this.f24714c = h8;
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$q */
    static class C10292q implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10364I9 f24742a;

        /* renamed from: b */
        private final C10662Q9<C10726Ri> f24743b;

        /* renamed from: c */
        private final C10332H8 f24744c;

        /* renamed from: d */
        private final String f24745d;

        /* renamed from: e */
        private final String f24746e;

        /* renamed from: f */
        private final String f24747f;

        /* renamed from: g */
        private final String f24748g;

        /* renamed from: h */
        private final String f24749h;

        public C10292q(C10364I9 i9, C10662Q9<C10726Ri> q9) {
            this(i9, q9, C10619P0.m27164i().mo61897y().mo61658a());
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            Integer num;
            C10726Ri ri = (C10726Ri) this.f24743b.mo61953b();
            C11816ue ueVar = new C11816ue(context);
            int f = ueVar.mo63789f();
            if (f == -1) {
                f = this.f24742a.mo61500a(-1);
            }
            C10332H8 h8 = this.f24744c;
            String str = ri.f25679b;
            String str2 = ri.f25681d;
            String a = this.f24742a.mo61444a(this.f24745d, (String) null);
            Boolean valueOf = this.f24742a.mo61452b(this.f24746e) ? Boolean.valueOf(this.f24742a.mo61446a(this.f24746e, false)) : null;
            Long valueOf2 = this.f24742a.mo61452b(this.f24747f) ? Long.valueOf(this.f24742a.mo61443a(this.f24747f, -1)) : null;
            Long valueOf3 = this.f24742a.mo61452b(this.f24748g) ? Long.valueOf(this.f24742a.mo61443a(this.f24748g, -1)) : null;
            Long valueOf4 = this.f24742a.mo61452b(this.f24749h) ? Long.valueOf(this.f24742a.mo61443a(this.f24749h, -1)) : null;
            if (f == -1) {
                num = null;
            } else {
                num = Integer.valueOf(f);
            }
            h8.mo61433a(str, str2, a, valueOf, valueOf2, valueOf3, valueOf4, num);
            this.f24742a.mo61526i().mo61457e(this.f24745d).mo61457e(this.f24746e).mo61457e(this.f24747f).mo61457e(this.f24748g).mo61457e(this.f24749h).mo61454c();
            ueVar.mo63791h().mo63599b();
        }

        C10292q(C10364I9 i9, C10662Q9<C10726Ri> q9, C10332H8 h8) {
            this.f24745d = new C11984ye("REFERRER_FROM_PLAY_SERVICES").mo64145a();
            this.f24746e = new C11984ye("REFERRER_CHECKED").mo64145a();
            this.f24747f = new C11984ye("L_ID").mo64145a();
            this.f24748g = new C11984ye("LBS_ID").mo64145a();
            this.f24749h = new C11984ye("L_REQ_NUM").mo64145a();
            this.f24742a = i9;
            this.f24743b = q9;
            this.f24744c = h8;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SparseArray<C10653Q1.C10654a> mo61343a() {
        return new C10272a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$p */
    static class C10291p implements C10653Q1.C10654a {

        /* renamed from: a */
        private final C10662Q9<C10726Ri> f24740a;

        /* renamed from: b */
        private final C10227Ej f24741b;

        public C10291p(Context context, C10662Q9<C10726Ri> q9) {
            this(q9, C10261Fj.m26320a(context).mo61333b(context, new C10408Jj(new C10675Qi.C10677b(context))));
        }

        /* renamed from: a */
        public void mo61345a(Context context) {
            String str = this.f24741b.mo61244a().f26933a;
            if (!TextUtils.isEmpty(str)) {
                C10726Ri ri = (C10726Ri) this.f24740a.mo61953b();
                if (!str.equals(ri.f25678a)) {
                    this.f24740a.mo61952a(ri.mo62150a(ri.f25696s).mo62200l(str).mo62174a());
                }
            }
        }

        public C10291p(C10662Q9<C10726Ri> q9, C10227Ej ej) {
            this.f24740a = q9;
            this.f24741b = ej;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo61342a(C11816ue ueVar) {
        int f = ueVar.mo63789f();
        if (f == -1) {
            f = this.f24712a.mo61500a(-1);
        }
        return f == -1 ? this.f24714c.mo61438e() : f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61344a(C11816ue ueVar, int i) {
        this.f24714c.mo61429a(i);
    }
}
