package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10622P3;
import com.yandex.metrica.impl.p265ob.C11156dh;
import com.yandex.metrica.impl.p265ob.C11286gh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.kh */
public class C11464kh extends C11286gh {

    /* renamed from: o */
    private List<String> f27598o;

    /* renamed from: p */
    private List<String> f27599p;

    /* renamed from: q */
    private String f27600q;

    /* renamed from: r */
    private String f27601r;

    /* renamed from: s */
    private Map<String, String> f27602s;

    /* renamed from: t */
    private C10622P3.C10623a f27603t;

    /* renamed from: u */
    private List<String> f27604u;

    /* renamed from: v */
    private boolean f27605v;

    /* renamed from: w */
    private boolean f27606w;

    /* renamed from: x */
    private String f27607x;

    /* renamed from: y */
    private long f27608y;

    /* renamed from: z */
    private final C10813Ug f27609z;

    /* renamed from: com.yandex.metrica.impl.ob.kh$b */
    public static class C11466b extends C11156dh.C11157a<C11466b, C11466b> implements C11115ch<C11466b, C11466b> {

        /* renamed from: d */
        public final String f27610d;

        /* renamed from: e */
        public final String f27611e;

        /* renamed from: f */
        public final Map<String, String> f27612f;

        /* renamed from: g */
        public final boolean f27613g;

        /* renamed from: h */
        public final List<String> f27614h;

        public C11466b(C10770T3 t3) {
            this(t3.mo62272b().mo60803d(), t3.mo62272b().mo60801c(), t3.mo62272b().mo60798b(), t3.mo62271a().mo62337d(), t3.mo62271a().mo62339e(), t3.mo62271a().mo62329a(), t3.mo62271a().mo62344j(), t3.mo62271a().mo62333b());
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo62468b(Object obj) {
            C11466b bVar = (C11466b) obj;
            return false;
        }

        /* renamed from: a */
        public C11466b mo62467a(C11466b bVar) {
            String str = this.f26741a;
            String str2 = bVar.f26741a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.f26742b;
            String str4 = bVar.f26742b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.f26743c;
            String str6 = bVar.f26743c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.f27610d;
            String str8 = bVar.f27610d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.f27611e;
            String str10 = bVar.f27611e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f27612f;
            Map<String, String> map2 = bVar.f27612f;
            if (map != null) {
                map2 = map;
            }
            return new C11466b(str2, str4, str6, str8, str10, map2, this.f27613g || bVar.f27613g, bVar.f27613g ? bVar.f27614h : this.f27614h);
        }

        public C11466b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, boolean z, List<String> list) {
            super(str, str2, str3);
            this.f27610d = str4;
            this.f27611e = str5;
            this.f27612f = map;
            this.f27613g = z;
            this.f27614h = list;
        }

        public C11466b() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kh$c */
    public static class C11467c extends C11286gh.C11287a<C11464kh, C11466b> {

        /* renamed from: d */
        private final C10651Q f27615d;

        public C11467c(Context context, String str) {
            this(context, str, new C10898Wn(), C10619P0.m27164i().mo61878e());
        }

        /* renamed from: a */
        public C11156dh mo61924a(Object obj) {
            C11156dh.C11159c cVar = (C11156dh.C11159c) obj;
            C11464kh khVar = (C11464kh) mo62973a(cVar);
            C10675Qi qi = cVar.f26746a;
            khVar.mo63243c(qi.mo62028t());
            khVar.mo63241b(qi.mo62027s());
            String str = ((C11466b) cVar.f26747b).f27610d;
            if (str != null) {
                C11464kh.m29633a(khVar, str);
                C11464kh.m29634b(khVar, ((C11466b) cVar.f26747b).f27611e);
            }
            Map<String, String> map = ((C11466b) cVar.f26747b).f27612f;
            khVar.mo63238a(map);
            khVar.mo63236a((C10622P3.C10623a) this.f27615d.mo61075a(new C10622P3.C10623a(map, C10202E0.APP)));
            khVar.mo63239a(((C11466b) cVar.f26747b).f27613g);
            khVar.mo63237a(((C11466b) cVar.f26747b).f27614h);
            khVar.mo63242b(cVar.f26746a.mo62026r());
            khVar.mo63244h(cVar.f26746a.mo62015g());
            khVar.mo63240b(cVar.f26746a.mo62024p());
            return khVar;
        }

        protected C11467c(Context context, String str, C10898Wn wn, C10651Q q) {
            super(context, str, wn);
            this.f27615d = q;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11156dh mo62478a() {
            return new C11464kh();
        }
    }

    /* renamed from: C */
    public C10622P3.C10623a mo63224C() {
        return this.f27603t;
    }

    /* renamed from: D */
    public Map<String, String> mo63225D() {
        return this.f27602s;
    }

    /* renamed from: E */
    public String mo63226E() {
        return this.f27607x;
    }

    /* renamed from: F */
    public String mo63227F() {
        return this.f27600q;
    }

    /* renamed from: G */
    public String mo63228G() {
        return this.f27601r;
    }

    /* renamed from: H */
    public List<String> mo63229H() {
        return this.f27604u;
    }

    /* renamed from: I */
    public C10813Ug mo63230I() {
        return this.f27609z;
    }

    /* renamed from: J */
    public List<String> mo63231J() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!C10796U2.m27896b((Collection) this.f27598o)) {
            linkedHashSet.addAll(this.f27598o);
        }
        if (!C10796U2.m27896b((Collection) this.f27599p)) {
            linkedHashSet.addAll(this.f27599p);
        }
        linkedHashSet.add("https://startup.mobile.yandex.net/");
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: K */
    public List<String> mo63232K() {
        return this.f27599p;
    }

    /* renamed from: L */
    public boolean mo63233L() {
        return this.f27605v;
    }

    /* renamed from: M */
    public boolean mo63234M() {
        return this.f27606w;
    }

    /* renamed from: a */
    public long mo63235a(long j) {
        if (this.f27608y == 0) {
            this.f27608y = j;
        }
        return this.f27608y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63242b(boolean z) {
        this.f27606w = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo63243c(List<String> list) {
        this.f27598o = list;
    }

    /* renamed from: h */
    public void mo63244h(String str) {
        this.f27607x = str;
    }

    public String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f27598o + ", mStartupHostsFromClient=" + this.f27599p + ", mDistributionReferrer='" + this.f27600q + '\'' + ", mInstallReferrerSource='" + this.f27601r + '\'' + ", mClidsFromClient=" + this.f27602s + ", mNewCustomHosts=" + this.f27604u + ", mHasNewCustomHosts=" + this.f27605v + ", mSuccessfulStartup=" + this.f27606w + ", mCountryInit='" + this.f27607x + '\'' + ", mFirstStartupTime=" + this.f27608y + ", mReferrerHolder=" + this.f27609z + "} " + super.toString();
    }

    private C11464kh() {
        this(C10619P0.m27164i().mo61887o());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63240b(long j) {
        if (this.f27608y == 0) {
            this.f27608y = j;
        }
    }

    C11464kh(C10813Ug ug) {
        this.f27603t = new C10622P3.C10623a((Map<String, String>) null, C10202E0.APP);
        this.f27608y = 0;
        this.f27609z = ug;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63238a(Map<String, String> map) {
        this.f27602s = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63241b(List<String> list) {
        this.f27599p = list;
    }

    /* renamed from: b */
    static void m29634b(C11464kh khVar, String str) {
        khVar.f27601r = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63236a(C10622P3.C10623a aVar) {
        this.f27603t = aVar;
    }

    /* renamed from: a */
    static void m29633a(C11464kh khVar, String str) {
        khVar.f27600q = str;
    }

    /* renamed from: a */
    public void mo63237a(List<String> list) {
        this.f27604u = list;
    }

    /* renamed from: a */
    public void mo63239a(boolean z) {
        this.f27605v = z;
    }
}
