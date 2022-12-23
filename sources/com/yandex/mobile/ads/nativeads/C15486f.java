package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C13838l9;
import com.yandex.mobile.ads.impl.ms0;
import com.yandex.mobile.ads.nativeads.C15493g0;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.f */
class C15486f implements C15493g0 {

    /* renamed from: a */
    private final List<C13690k9> f43839a;

    /* renamed from: b */
    final ms0 f43840b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f43841c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C15550v f43842d;

    /* renamed from: com.yandex.mobile.ads.nativeads.f$a */
    class C15487a implements C15493g0.C15495b {
        C15487a() {
        }

        /* renamed from: a */
        public boolean mo71666a(List<C13690k9> list) {
            C13838l9 a;
            for (C13690k9 next : list) {
                if (next.mo68172f() && (a = C15486f.this.f43842d.mo71921a(next)) != null && a.mo67819a(100)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.f$b */
    class C15488b implements C15493g0.C15495b {
        C15488b() {
        }

        /* renamed from: a */
        public boolean mo71666a(List<C13690k9> list) {
            C13838l9 a;
            for (C13690k9 next : list) {
                if (next.mo68172f() && ((a = C15486f.this.f43842d.mo71921a(next)) == null || !a.mo67824d())) {
                    String unused = C15486f.this.f43841c = next.mo68167b();
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.f$c */
    class C15489c implements C15493g0.C15495b {
        C15489c() {
        }

        /* renamed from: a */
        public boolean mo71666a(List<C13690k9> list) {
            for (C13690k9 next : list) {
                if (next.mo68172f()) {
                    C13838l9 a = C15486f.this.f43842d.mo71921a(next);
                    Object d = next.mo68169d();
                    if (a == null || !a.mo67820a(d)) {
                        String unused = C15486f.this.f43841c = next.mo68167b();
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.f$d */
    class C15490d implements C15493g0.C15495b {
        C15490d() {
        }

        /* renamed from: a */
        public boolean mo71666a(List<C13690k9> list) {
            C13838l9 a;
            for (C13690k9 next : list) {
                if (next.mo68172f() && ((a = C15486f.this.f43842d.mo71921a(next)) == null || !a.mo67821b())) {
                    String unused = C15486f.this.f43841c = next.mo68167b();
                    return false;
                }
            }
            return true;
        }
    }

    C15486f(List<C13690k9> list, ms0 ms0) {
        this.f43839a = list;
        this.f43840b = ms0;
    }

    /* renamed from: b */
    public boolean mo71663b() {
        return !m45131a((C15493g0.C15495b) new C15487a());
    }

    /* renamed from: c */
    public boolean mo71664c() {
        return !m45131a((C15493g0.C15495b) new C15489c());
    }

    /* renamed from: d */
    public boolean mo71665d() {
        return !m45131a((C15493g0.C15495b) new C15488b());
    }

    /* renamed from: a */
    public void mo71661a(C15550v vVar) {
        this.f43842d = vVar;
    }

    /* renamed from: a */
    private boolean m45131a(C15493g0.C15495b bVar) {
        return this.f43842d != null && mo71662a(bVar, this.f43839a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo71662a(C15493g0.C15495b bVar, List<C13690k9> list) {
        this.f43840b.getClass();
        return list != null && bVar.mo71666a(list);
    }

    /* renamed from: a */
    public C15509l0 mo71660a() {
        return new C15509l0(m45131a((C15493g0.C15495b) new C15490d()), this.f43841c);
    }

    /* renamed from: a */
    public C15493g0.C15494a mo71659a(boolean z) {
        int i;
        C12135y.C12136a aVar;
        List<C13690k9> list = this.f43839a;
        boolean z2 = false;
        if (list != null) {
            i = 0;
            for (C13690k9 f : list) {
                if (f.mo68172f()) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if ((i >= 2) && mo71663b()) {
            z2 = true;
        }
        if (z2 && !z) {
            aVar = C12135y.C12136a.NO_VISIBLE_REQUIRED_ASSETS;
        } else if (mo71665d()) {
            aVar = C12135y.C12136a.REQUIRED_ASSET_CAN_NOT_BE_VISIBLE;
        } else if (mo71664c()) {
            aVar = C12135y.C12136a.INCONSISTENT_ASSET_VALUE;
        } else {
            aVar = C12135y.C12136a.SUCCESS;
        }
        return new C15491f0(aVar, this.f43841c);
    }
}
