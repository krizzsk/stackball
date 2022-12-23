package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.metrica.C10086i;
import com.yandex.metrica.C12043l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.l2 */
public class C11478l2 implements C10906X0 {

    /* renamed from: a */
    private Context f27625a;

    /* renamed from: b */
    private C10797U3 f27626b;

    /* renamed from: c */
    private C11544n2 f27627c;

    /* renamed from: d */
    private Handler f27628d;

    /* renamed from: e */
    private C10373Ii f27629e;

    /* renamed from: f */
    private Map<String, C10868W0> f27630f;

    /* renamed from: g */
    private final C11829uo<String> f27631g;

    /* renamed from: h */
    private final List<String> f27632h = Arrays.asList(new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});

    public C11478l2(Context context, C10797U3 u3, C11544n2 n2Var, Handler handler, C10373Ii ii) {
        HashMap hashMap = new HashMap();
        this.f27630f = hashMap;
        this.f27631g = new C11726ro(new C11923wo(hashMap));
        this.f27625a = context;
        this.f27626b = u3;
        this.f27627c = n2Var;
        this.f27628d = handler;
        this.f27629e = ii;
    }

    /* renamed from: a */
    public C11729s1 mo63253a(C12043l lVar, boolean z, C10248F9 f9) {
        C12043l lVar2 = lVar;
        this.f27631g.mo61590a(lVar2.apiKey);
        Context context = this.f27625a;
        C10797U3 u3 = this.f27626b;
        C12043l lVar3 = lVar;
        C11729s1 s1Var = new C11729s1(context, u3, lVar3, this.f27627c, new C10696R7(context, u3), this.f27629e, new C10738S2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C10738S2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), f9, new C10165Cg(), C10941Y.m28234g(), new C10415K0(context));
        m29677a((C10382J) s1Var);
        if (z) {
            s1Var.f24939i.mo63359c(s1Var.f24932b);
        }
        Map<String, String> map = lVar2.f28952h;
        if (!C10796U2.m27897b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (!TextUtils.isEmpty(str)) {
                    s1Var.f24939i.mo63348a(str, str2, s1Var.f24932b);
                } else if (s1Var.f24933c.mo64227c()) {
                    s1Var.f24933c.mo64226c("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
                }
            }
        }
        s1Var.mo61576a(lVar2.errorEnvironment);
        s1Var.mo61586f();
        this.f27627c.mo63344a(s1Var);
        this.f27630f.put(lVar2.apiKey, s1Var);
        return s1Var;
    }

    /* renamed from: b */
    public synchronized C10868W0 mo61835b(C10086i iVar) {
        C11802u1 u1Var;
        C10868W0 w0 = this.f27630f.get(iVar.apiKey);
        u1Var = w0;
        if (w0 == null) {
            if (!this.f27632h.contains(iVar.apiKey)) {
                this.f27629e.mo61557g();
            }
            C11802u1 u1Var2 = new C11802u1(this.f27625a, this.f27626b, iVar, this.f27627c);
            m29677a((C10382J) u1Var2);
            u1Var2.mo61586f();
            this.f27630f.put(iVar.apiKey, u1Var2);
            u1Var = u1Var2;
        }
        return u1Var;
    }

    /* renamed from: b */
    public C10906X0 mo61836b() {
        return this;
    }

    /* renamed from: c */
    public synchronized void mo63254c(C10086i iVar) {
        if (this.f27630f.containsKey(iVar.apiKey)) {
            C10380Im b = C12038zm.m31087b(iVar.apiKey);
            if (b.mo64227c()) {
                b.mo64226c("Reporter with apiKey=%s already exists.", iVar.apiKey);
            }
        } else {
            mo61835b(iVar);
            Log.i("AppMetrica", "Activate reporter with APIKey " + C10796U2.m27878a(iVar.apiKey));
        }
    }

    /* renamed from: a */
    public synchronized C11059b1 mo61834a(C12043l lVar) {
        C11476l0 l0Var;
        C10868W0 w0 = this.f27630f.get(lVar.apiKey);
        l0Var = w0;
        if (w0 == null) {
            C11476l0 l0Var2 = new C11476l0(this.f27625a, this.f27626b, lVar, this.f27627c);
            m29677a((C10382J) l0Var2);
            l0Var2.mo61576a(lVar.errorEnvironment);
            l0Var2.mo61586f();
            l0Var = l0Var2;
        }
        return l0Var;
    }

    /* renamed from: a */
    private void m29677a(C10382J j) {
        j.mo61572a(new C11477l1(this.f27628d, j));
        j.f24932b.mo63171a((C10434Ki) this.f27629e);
    }
}
