package com.tapjoy.internal;

import com.tapjoy.internal.C9418ij;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.hh */
public final class C9366hh implements C9125cf {

    /* renamed from: a */
    public final C9344gz f23187a;

    /* renamed from: b */
    Set f23188b = null;

    /* renamed from: c */
    private final Map f23189c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private final Map f23190d = C9471ju.m25454a();

    public C9366hh(C9344gz gzVar) {
        this.f23187a = gzVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo57912a(C9120ca caVar, C9418ij.C9419a aVar) {
        if (caVar instanceof C9418ij) {
            if (aVar.f23401b != null) {
                List list = aVar.f23401b;
                synchronized (this) {
                    this.f23188b = list instanceof Collection ? new HashSet(C9467js.m25452a(list)) : C9472jv.m25456a(list.iterator());
                }
            }
            C9418ij ijVar = (C9418ij) caVar;
            String str = ijVar.f23393c;
            boolean z = ijVar.f23394d;
            this.f23190d.remove(str);
            if (!z) {
                this.f23189c.put(str, aVar.f23400a);
            }
            C9365hg hgVar = aVar.f23400a;
            C9347ha haVar = this.f23187a.f23126p;
            if (hgVar instanceof C9364hf) {
                C9340gw.m25045a("No content for \"{}\"", str);
                haVar.mo57310a(str);
                return;
            }
            C9340gw.m25045a("New content for \"{}\" is ready", str);
            if (z) {
                hgVar.mo58223a(haVar, new C9293fw());
            } else {
                haVar.mo57313b(str);
            }
        } else {
            throw new IllegalStateException(caVar.getClass().getName());
        }
    }

    /* renamed from: a */
    public final void mo57911a(C9120ca caVar) {
        mo57912a(caVar, new C9418ij.C9419a(new C9364hf(), (List) null));
    }
}
