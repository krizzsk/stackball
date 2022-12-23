package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.C12046p;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sg */
public class C11750sg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11791tg f28152a;

    /* renamed from: b */
    private final C11769sn f28153b;

    /* renamed from: c */
    private final C11530mg f28154c;

    /* renamed from: d */
    private final C11829uo<Context> f28155d;

    /* renamed from: e */
    private final C11829uo<String> f28156e;

    /* renamed from: f */
    private final C10649Pm f28157f;

    /* renamed from: com.yandex.metrica.impl.ob.sg$a */
    class C11751a extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Context f28158a;

        /* renamed from: b */
        final /* synthetic */ IIdentifierCallback f28159b;

        /* renamed from: c */
        final /* synthetic */ List f28160c;

        C11751a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.f28158a = context;
            this.f28159b = iIdentifierCallback;
            this.f28160c = list;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C11791tg a = C11750sg.this.f28152a;
            Context context = this.f28158a;
            a.getClass();
            C11479l3.m29684a(context).mo63259a(this.f28159b, (List<String>) this.f28160c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$b */
    class C11752b extends C10411Jm<String> {
        C11752b() {
        }

        /* renamed from: a */
        public Object mo61634a() throws Exception {
            C11750sg.this.f28152a.getClass();
            C11479l3 k = C11479l3.m29698k();
            if (k == null) {
                return null;
            }
            return k.mo63267e().mo62817a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$c */
    class C11753c extends C10411Jm<Boolean> {
        C11753c() {
        }

        /* renamed from: a */
        public Object mo61634a() throws Exception {
            C11750sg.this.f28152a.getClass();
            C11479l3 k = C11479l3.m29698k();
            if (k == null) {
                return null;
            }
            return k.mo63267e().mo62820b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$d */
    class C11754d extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ int f28164a;

        /* renamed from: b */
        final /* synthetic */ String f28165b;

        /* renamed from: c */
        final /* synthetic */ String f28166c;

        /* renamed from: d */
        final /* synthetic */ Map f28167d;

        C11754d(int i, String str, String str2, Map map) {
            this.f28164a = i;
            this.f28165b = str;
            this.f28166c = str2;
            this.f28167d = map;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C11750sg.m30290b(C11750sg.this).mo61570a(this.f28164a, this.f28165b, this.f28166c, this.f28167d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$e */
    class C11755e extends C10439Km {
        C11755e() {
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C11750sg.m30290b(C11750sg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$f */
    class C11756f extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ boolean f28170a;

        C11756f(boolean z) {
            this.f28170a = z;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C11791tg a = C11750sg.this.f28152a;
            boolean z = this.f28170a;
            a.getClass();
            C11479l3.m29690b(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$g */
    class C11757g extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ C12046p.Ucc f28172a;

        /* renamed from: b */
        final /* synthetic */ boolean f28173b;

        /* renamed from: com.yandex.metrica.impl.ob.sg$g$a */
        class C11758a implements C10615Ol {
            C11758a() {
            }

            public void onError(String str) {
                C11757g.this.f28172a.onError(str);
            }

            public void onResult(JSONObject jSONObject) {
                C11757g.this.f28172a.onResult(jSONObject);
            }
        }

        C11757g(C12046p.Ucc ucc, boolean z) {
            this.f28172a = ucc;
            this.f28173b = z;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C11750sg.m30290b(C11750sg.this).mo61672a((C10615Ol) new C11758a(), this.f28173b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$h */
    class C11759h extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Context f28176a;

        /* renamed from: b */
        final /* synthetic */ Map f28177b;

        C11759h(Context context, Map map) {
            this.f28176a = context;
            this.f28177b = map;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C11791tg a = C11750sg.this.f28152a;
            Context context = this.f28176a;
            a.getClass();
            C11479l3.m29684a(context).mo63260a((Map<String, Object>) this.f28177b);
        }
    }

    public C11750sg(C11769sn snVar, C11791tg tgVar) {
        this(snVar, tgVar, new C11530mg(tgVar), new C11726ro(new C11697qo("Context")), new C11726ro(new C11697qo("Event name")), new C10649Pm());
    }

    /* renamed from: b */
    public Future<String> mo63647b() {
        return ((C11725rn) this.f28153b).mo63611a(new C11752b());
    }

    /* renamed from: c */
    public Future<Boolean> mo63649c() {
        return ((C11725rn) this.f28153b).mo63611a(new C11753c());
    }

    /* renamed from: d */
    public String mo63650d(Context context) {
        this.f28155d.mo61590a(context);
        this.f28152a.getClass();
        return C11479l3.m29684a(context).mo63256a();
    }

    public C11750sg(C11769sn snVar, C11791tg tgVar, C11530mg mgVar, C11829uo<Context> uoVar, C11829uo<String> uoVar2, C10649Pm pm) {
        this.f28152a = tgVar;
        this.f28153b = snVar;
        this.f28154c = mgVar;
        this.f28155d = uoVar;
        this.f28156e = uoVar2;
        this.f28157f = pm;
    }

    /* renamed from: a */
    public void mo63641a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f28155d.mo61590a(context);
        ((C11725rn) this.f28153b).execute(new C11751a(context, iIdentifierCallback, list));
    }

    /* renamed from: b */
    public String mo63646b(Context context) {
        this.f28155d.mo61590a(context);
        this.f28152a.getClass();
        return C11479l3.m29684a(context).mo63264c();
    }

    /* renamed from: c */
    public String mo63648c(Context context) {
        this.f28155d.mo61590a(context);
        return context.getPackageName();
    }

    /* renamed from: a */
    public boolean mo63645a() {
        this.f28152a.getClass();
        return C11479l3.m29695h();
    }

    /* renamed from: d */
    public void mo63651d() {
        this.f28154c.mo61590a(null);
        ((C11725rn) this.f28153b).execute(new C11755e());
    }

    /* renamed from: b */
    static C10794U0 m30290b(C11750sg sgVar) {
        sgVar.f28152a.getClass();
        return C11479l3.m29698k().mo63266d().mo63697b();
    }

    /* renamed from: a */
    public String mo63639a(Context context) {
        this.f28155d.mo61590a(context);
        return this.f28157f.mo61939a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    /* renamed from: a */
    public void mo63640a(int i, String str, String str2, Map<String, String> map) {
        this.f28154c.mo61590a(null);
        this.f28156e.mo61590a(str);
        ((C11725rn) this.f28153b).execute(new C11754d(i, str, str2, map));
    }

    /* renamed from: a */
    public void mo63643a(Context context, boolean z) {
        this.f28155d.mo61590a(context);
        ((C11725rn) this.f28153b).execute(new C11756f(z));
    }

    /* renamed from: a */
    public void mo63644a(C12046p.Ucc ucc, boolean z) {
        this.f28152a.getClass();
        if (!C11479l3.m29696i()) {
            ucc.onError("Main API key is not activated");
            return;
        }
        ((C11725rn) this.f28153b).execute(new C11757g(ucc, z));
    }

    /* renamed from: a */
    public void mo63642a(Context context, Map<String, Object> map) {
        this.f28155d.mo61590a(context);
        ((C11725rn) this.f28153b).execute(new C11759h(context, map));
    }
}
