package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.appsflyer.internal.referrer.Payload;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.C12130v;
import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.C12366aa;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C13309hc;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C13838l9;
import com.yandex.mobile.ads.impl.C14241p1;
import com.yandex.mobile.ads.impl.C14351q2;
import com.yandex.mobile.ads.impl.C14352q3;
import com.yandex.mobile.ads.impl.C14535ru;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14646t2;
import com.yandex.mobile.ads.impl.C14660t9;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.d81;
import com.yandex.mobile.ads.impl.de0;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ht0;
import com.yandex.mobile.ads.impl.is0;
import com.yandex.mobile.ads.impl.it0;
import com.yandex.mobile.ads.impl.k81;
import com.yandex.mobile.ads.impl.kt0;
import com.yandex.mobile.ads.impl.nt0;
import com.yandex.mobile.ads.impl.o70;
import com.yandex.mobile.ads.impl.oe1;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.rq0;
import com.yandex.mobile.ads.impl.s31;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.impl.t31;
import com.yandex.mobile.ads.impl.td0;
import com.yandex.mobile.ads.impl.tr0;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.tv0;
import com.yandex.mobile.ads.impl.ud0;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.uv0;
import com.yandex.mobile.ads.impl.ve1;
import com.yandex.mobile.ads.impl.vq0;
import com.yandex.mobile.ads.impl.wd0;
import com.yandex.mobile.ads.impl.wu0;
import com.yandex.mobile.ads.impl.x40;
import com.yandex.mobile.ads.impl.xd0;
import com.yandex.mobile.ads.impl.y40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.nativeads.k0 */
public abstract class C15504k0 {

    /* renamed from: A */
    private C15550v f43864A;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f43865a;

    /* renamed from: b */
    private final uu0 f43866b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final nt0 f43867c;

    /* renamed from: d */
    private final wu0 f43868d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final tv0 f43869e;

    /* renamed from: f */
    private final ve1 f43870f;

    /* renamed from: g */
    private final C15501j f43871g;

    /* renamed from: h */
    private final or0 f43872h;

    /* renamed from: i */
    private final C15474b f43873i;

    /* renamed from: j */
    private final C14241p1 f43874j;

    /* renamed from: k */
    private final C14645t1 f43875k;

    /* renamed from: l */
    private final AdResponse f43876l;

    /* renamed from: m */
    private final C15523r0 f43877m;

    /* renamed from: n */
    private final y40 f43878n;

    /* renamed from: o */
    private final C13309hc f43879o;

    /* renamed from: p */
    private final x40 f43880p;

    /* renamed from: q */
    private final rq0 f43881q;

    /* renamed from: r */
    private final sd0 f43882r;

    /* renamed from: s */
    private final wd0 f43883s;

    /* renamed from: t */
    private final C14660t9 f43884t;

    /* renamed from: u */
    private final t31 f43885u;

    /* renamed from: v */
    private final ht0 f43886v;

    /* renamed from: w */
    private final List<C14535ru> f43887w;

    /* renamed from: x */
    private final d81 f43888x;

    /* renamed from: y */
    private final C12130v.C12132b f43889y = new C15505a();

    /* renamed from: z */
    private final C12366aa f43890z;

    /* renamed from: com.yandex.mobile.ads.nativeads.k0$a */
    class C15505a implements C12130v.C12132b {
        C15505a() {
        }

        /* renamed from: a */
        public void mo64403a(Intent intent) {
            intent.getAction();
            C15505a.class.toString();
            C15504k0.this.f43869e.mo69626a(intent, !((C15549u) C15504k0.this.f43867c).mo71917a());
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.k0$b */
    class C15506b implements oe1 {
        C15506b() {
        }

        /* renamed from: a */
        public C12135y mo68678a(int i) {
            return ((C15549u) C15504k0.this.f43867c).mo71919b(C15504k0.this.f43865a, i);
        }

        /* renamed from: b */
        public C12135y mo68679b(int i) {
            return ((C15549u) C15504k0.this.f43867c).mo69078a(C15504k0.this.f43865a, i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.k0$c */
    enum C15507c {
        CUSTOM(Payload.CUSTOM),
        TEMPLATE("template");
        

        /* renamed from: b */
        final String f43896b;

        private C15507c(String str) {
            this.f43896b = str;
        }
    }

    public C15504k0(Context context, C15470a aVar) {
        Context context2 = context;
        C15506b bVar = new C15506b();
        this.f43865a = context2;
        this.f43866b = aVar.mo71618f();
        nt0 e = aVar.mo71617e();
        this.f43867c = e;
        wu0 g = aVar.mo71619g();
        this.f43868d = g;
        vq0 c = aVar.mo71615c();
        C14645t1 a = c.mo70513a();
        this.f43875k = a;
        AdResponse b = c.mo70514b();
        this.f43876l = b;
        C12115n b2 = a.mo70092b();
        String a2 = g.mo70756a();
        or0 d = aVar.mo71616d();
        this.f43872h = d;
        C15501j a3 = d.mo69260b().mo68502a(context2, a);
        this.f43871g = a3;
        C14351q2 q2Var = new C14351q2(new tr0(g.mo70756a()));
        wd0 wd0 = new wd0(context2, a);
        this.f43883s = wd0;
        sd0 sd0 = new sd0();
        this.f43882r = sd0;
        sd0 sd02 = sd0;
        wd0 wd02 = wd0;
        C14351q2 q2Var2 = q2Var;
        C15501j jVar = a3;
        or0 or0 = d;
        td0 a4 = new ud0().mo70335a(context, a3, wd02, q2Var2, sd02);
        List<k81> e2 = g.mo70760e();
        a4.mo70156a(e2, g.mo70758c());
        C15523r0 r0Var = new C15523r0();
        this.f43877m = r0Var;
        Context context3 = context;
        vq0 vq0 = c;
        C14241p1 p1Var = r1;
        C15523r0 r0Var2 = r0Var;
        C15501j jVar2 = jVar;
        C12115n nVar = b2;
        List<k81> list = e2;
        C14241p1 p1Var2 = new C14241p1(context3, b, a, jVar2, r0Var2);
        this.f43874j = p1Var;
        uv0 uv0 = new uv0();
        C15506b bVar2 = bVar;
        ts0 b3 = aVar.mo71614b();
        tv0 a5 = uv0.mo70416a(context3, a, wd02, bVar2, C13278h5.m36800a(this));
        this.f43869e = a5;
        sd0 sd03 = sd02;
        b3.mo65948a(sd03);
        sd03.mo69952a((o70) new sv0(a5));
        this.f43873i = new C15474b(p1Var, sd03);
        C12130v a6 = C12130v.m31590a();
        C14352q3 q3Var = new C14352q3(context2, new C15483d0(e), aVar.mo71613a());
        sd0 sd04 = sd03;
        C14645t1 t1Var = a;
        s31 s31 = r1;
        String str = a2;
        s31 s312 = new s31(context, q3Var, b, t1Var, q2Var2, sd04, g.mo70759d());
        ve1 a7 = or0.mo69263e().mo67049a(a5, s31, new de0(e, list), a6);
        this.f43870f = a7;
        a7.mo66854a((xd0) sd04);
        a7.mo66852a(b, list);
        List<C13690k9> b4 = g.mo70757b();
        C14660t9 t9Var = new C14660t9(b4);
        this.f43884t = t9Var;
        this.f43885u = new t31(b4);
        C14646t2 a8 = or0.mo69259a();
        Context context4 = context;
        String str2 = str;
        C12115n nVar2 = nVar;
        this.f43879o = new C13309hc(context4, a8, nVar2, str2);
        this.f43880p = new x40(context4, a8, nVar2, str2);
        this.f43881q = new rq0(context4, a8, nVar2, str2);
        this.f43878n = new y40(b4);
        this.f43886v = new it0(t9Var).mo67892a();
        as0 c2 = vq0.mo70515c();
        this.f43888x = c2.mo65863f();
        this.f43887w = c2.mo65854b();
        this.f43890z = new C12366aa(b4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public wu0 mo71695d() {
        return this.f43868d;
    }

    public void destroy() {
        C15550v vVar = this.f43864A;
        if (vVar != null) {
            vVar.mo71923b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo71697e() {
        ((C15549u) this.f43867c).mo71917a();
        int i = C13278h5.f34274b;
        toString();
        this.f43870f.mo66851a(this.f43865a, this.f43889y, this.f43864A);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo71698f() {
        int i = C13278h5.f34274b;
        toString();
        this.f43870f.mo66850a(this.f43865a, this.f43889y);
    }

    public void setCustomClickHandler(CustomClickHandler customClickHandler) {
        this.f43877m.mo71742a(customClickHandler);
    }

    public void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.f43871g.mo71682a(nativeAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z) {
        this.f43875k.mo70095b(z);
    }

    /* renamed from: a */
    public ht0 mo71689a() {
        return this.f43886v;
    }

    /* renamed from: b */
    public List<C14535ru> mo71693b() {
        return this.f43887w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public nt0 mo71694c() {
        return this.f43867c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T extends View> void mo71691a(T t, ed0 ed0, is0<T> is0, C15476c cVar) throws NativeAdException {
        T t2 = t;
        C15557z a = C15557z.m45392a();
        C15504k0 a2 = a.mo71938a((View) t);
        if (!equals(a2)) {
            Context context = t.getContext();
            if (a2 != null) {
                a2.mo71690a(context);
            }
            if (a.mo71940a(this)) {
                mo71690a(context);
            }
            a.mo71939a(t, this);
            C15550v vVar = new C15550v(t, is0, this.f43875k, ed0, this.f43882r, cVar, this.f43872h, this.f43884t, this.f43886v, this.f43888x);
            vVar.mo71922a();
            Intrinsics.checkNotNullParameter(vVar, "viewAdapter");
            Map<String, C13838l9> c = vVar.mo71924c();
            Intrinsics.checkNotNullExpressionValue(c, "viewAdapter.assetAdapters");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, C13838l9>> it = c.entrySet().iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                C13838l9 l9Var = (C13838l9) next.getValue();
                if (l9Var != null) {
                    z = l9Var.mo67821b();
                }
                if (z) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry key : linkedHashMap.entrySet()) {
                arrayList.add((String) key.getKey());
            }
            this.f43881q.mo69805a(arrayList, h41.C13276b.BOUND_ASSETS);
            List<String> a3 = this.f43878n.mo70995a(vVar);
            if (!((ArrayList) a3).isEmpty()) {
                this.f43880p.mo70829a(a3);
            }
            this.f43864A = vVar;
            this.f43890z.mo65699a(vVar);
            ((C15549u) this.f43867c).mo71916a(vVar);
            C15509l0 a4 = ((C15549u) this.f43867c).f44082a.mo71660a();
            if (a4.mo71703b()) {
                this.f43866b.mo70409a(vVar);
                this.f43866b.mo70410a(vVar, this.f43873i);
                this.f43881q.mo69805a(this.f43885u.mo70124a(vVar), h41.C13276b.RENDERED_ASSETS);
                int i = C13278h5.f34274b;
                toString();
                mo71697e();
                return;
            }
            String a5 = a4.mo71702a();
            this.f43879o.mo67510a(a5);
            throw new NativeAdException(String.format("Resource for required view %s is not present", new Object[]{a5}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71690a(Context context) {
        mo71698f();
        C15550v vVar = this.f43864A;
        if (vVar != null) {
            this.f43866b.mo70409a(vVar);
            this.f43870f.mo66855a(this.f43864A);
            this.f43890z.mo65699a((C15550v<?>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71692a(h41.C13275a aVar) {
        this.f43874j.mo69293a(aVar);
        this.f43883s.mo70676a(aVar);
        this.f43871g.mo71681a(aVar);
        this.f43870f.mo66853a((h41.C13275a) new kt0(aVar, this.f43876l, this.f43890z));
        this.f43879o.mo67509a(aVar);
        this.f43880p.mo70828a(aVar);
        this.f43881q.mo69804a(aVar);
    }
}
