package com.applovin.impl.mediation.p012a.p015c.p018b;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.p012a.p013a.C1172a;
import com.applovin.impl.mediation.p012a.p013a.C1174c;
import com.applovin.impl.mediation.p012a.p013a.C1176d;
import com.applovin.impl.mediation.p012a.p013a.C1178e;
import com.applovin.impl.mediation.p012a.p013a.C1179f;
import com.applovin.impl.mediation.p012a.p013a.C1180g;
import com.applovin.impl.mediation.p012a.p015c.C1183a;
import com.applovin.impl.mediation.p012a.p015c.p018b.p019a.C1194a;
import com.applovin.impl.sdk.utils.C1518f;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.C1701R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.a.c.b.b */
public class C1197b extends C1183a {

    /* renamed from: c */
    private final C1174c f2281c = new C1180g("INTEGRATIONS");

    /* renamed from: d */
    private final C1174c f2282d = new C1180g("PERMISSIONS");

    /* renamed from: e */
    private final C1174c f2283e = new C1180g("CONFIGURATION");

    /* renamed from: f */
    private final C1174c f2284f = new C1180g("DEPENDENCIES");

    /* renamed from: g */
    private final C1174c f2285g = new C1180g("");

    /* renamed from: h */
    private SpannedString f2286h;

    /* renamed from: i */
    private C1198a f2287i;

    /* renamed from: com.applovin.impl.mediation.a.c.b.b$a */
    public interface C1198a {
        /* renamed from: a */
        void mo12221a(String str);
    }

    C1197b(C1176d dVar, Context context) {
        super(context);
        if (dVar.mo12169a() == C1176d.C1177a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f2286h = new SpannedString(spannableString);
        } else {
            this.f2286h = new SpannedString("");
        }
        this.f2247b.add(this.f2281c);
        this.f2247b.add(mo12233a(dVar));
        this.f2247b.add(mo12237b(dVar));
        this.f2247b.add(mo12239c(dVar));
        this.f2247b.addAll(mo12235a(dVar.mo12180k()));
        this.f2247b.addAll(mo12234a(dVar.mo12182m()));
        this.f2247b.addAll(mo12238b(dVar.mo12181l()));
        this.f2247b.add(this.f2285g);
    }

    /* renamed from: a */
    private int m1958a(boolean z) {
        return z ? C1701R.C1702drawable.applovin_ic_check_mark : C1701R.C1702drawable.applovin_ic_x_mark;
    }

    /* renamed from: b */
    private int m1959b(boolean z) {
        return C1518f.m3427a(z ? C1701R.color.applovin_sdk_checkmarkColor : C1701R.color.applovin_sdk_xmarkColor, this.f2246a);
    }

    /* renamed from: b */
    private boolean m1960b(int i) {
        return (i == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || i == MaxAdapter.InitializationStatus.INITIALIZING.getCode()) ? false : true;
    }

    /* renamed from: a */
    public C1174c mo12233a(C1176d dVar) {
        C1194a.C1196a a = C1194a.m1944l().mo12227a("SDK").mo12231b(dVar.mo12176g()).mo12226a(TextUtils.isEmpty(dVar.mo12176g()) ? C1174c.C1175a.DETAIL : C1174c.C1175a.RIGHT_DETAIL);
        if (TextUtils.isEmpty(dVar.mo12176g())) {
            a.mo12224a(m1958a(dVar.mo12171c())).mo12230b(m1959b(dVar.mo12171c()));
        }
        return a.mo12229a();
    }

    /* renamed from: a */
    public List<C1174c> mo12234a(C1178e eVar) {
        ArrayList arrayList = new ArrayList(2);
        if (eVar.mo12185a()) {
            boolean b = eVar.mo12186b();
            arrayList.add(this.f2283e);
            arrayList.add(C1194a.m1944l().mo12227a("Cleartext Traffic").mo12225a(b ? null : this.f2286h).mo12232c(eVar.mo12187c()).mo12224a(m1958a(b)).mo12230b(m1959b(b)).mo12228a(!b).mo12229a());
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C1174c> mo12235a(List<C1179f> list) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        if (list.size() > 0) {
            arrayList.add(this.f2282d);
            for (C1179f next : list) {
                boolean c = next.mo12190c();
                arrayList.add(C1194a.m1944l().mo12227a(next.mo12188a()).mo12225a(c ? null : this.f2286h).mo12232c(next.mo12189b()).mo12224a(m1958a(c)).mo12230b(m1959b(c)).mo12228a(!c).mo12229a());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12196a(C1174c cVar) {
        if (this.f2287i != null && (cVar instanceof C1194a)) {
            String k = ((C1194a) cVar).mo12222k();
            if (!TextUtils.isEmpty(k)) {
                this.f2287i.mo12221a(k);
            }
        }
    }

    /* renamed from: a */
    public void mo12236a(C1198a aVar) {
        this.f2287i = aVar;
    }

    /* renamed from: b */
    public C1174c mo12237b(C1176d dVar) {
        C1194a.C1196a a = C1194a.m1944l().mo12227a("Adapter").mo12231b(dVar.mo12177h()).mo12226a(TextUtils.isEmpty(dVar.mo12177h()) ? C1174c.C1175a.DETAIL : C1174c.C1175a.RIGHT_DETAIL);
        if (TextUtils.isEmpty(dVar.mo12177h())) {
            a.mo12224a(m1958a(dVar.mo12173d())).mo12230b(m1959b(dVar.mo12173d()));
        }
        return a.mo12229a();
    }

    /* renamed from: b */
    public List<C1174c> mo12238b(List<C1172a> list) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        if (list.size() > 0) {
            arrayList.add(this.f2284f);
            for (C1172a next : list) {
                boolean c = next.mo12154c();
                arrayList.add(C1194a.m1944l().mo12227a(next.mo12152a()).mo12225a(c ? null : this.f2286h).mo12232c(next.mo12153b()).mo12224a(m1958a(c)).mo12230b(m1959b(c)).mo12228a(!c).mo12229a());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public C1174c mo12239c(C1176d dVar) {
        boolean b = m1960b(dVar.mo12170b());
        return C1194a.m1944l().mo12227a("Adapter Initialized").mo12224a(m1958a(b)).mo12230b(m1959b(b)).mo12229a();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{listItems=" + this.f2247b + "}";
    }
}
