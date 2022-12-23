package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.p029a.C2698b;
import com.fyber.inneractive.sdk.p049h.C2939ac;
import com.fyber.inneractive.sdk.p049h.C2977r;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.config.j */
public final class C2792j {

    /* renamed from: a */
    public C2791i f6586a = new C2791i();

    /* renamed from: b */
    List<C2794a> f6587b = new CopyOnWriteArrayList();

    /* renamed from: c */
    boolean f6588c = false;

    /* renamed from: d */
    final C2698b f6589d = new C2698b();

    /* renamed from: e */
    private final Context f6590e;

    /* renamed from: com.fyber.inneractive.sdk.config.j$a */
    public interface C2794a {
        void onGlobalConfigChanged(C2792j jVar, C2791i iVar);
    }

    public C2792j(Context context) {
        this.f6590e = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18053a() {
        IAConfigManager.m5937h().mo18441a(new C2939ac(new C2977r<C2791i>() {
            /* renamed from: a */
            public final /* synthetic */ void mo17908a(Object obj, Exception exc, boolean z) {
                C2791i iVar = (C2791i) obj;
                if (iVar != null) {
                    C2792j jVar = C2792j.this;
                    if (iVar != null && !iVar.equals(jVar.f6586a)) {
                        jVar.f6588c = true;
                        jVar.f6586a = iVar;
                        for (C2794a onGlobalConfigChanged : jVar.f6587b) {
                            onGlobalConfigChanged.onGlobalConfigChanged(jVar, jVar.f6586a);
                        }
                    }
                }
            }
        }, this.f6590e, this.f6589d));
    }

    /* renamed from: a */
    public final void mo18054a(C2794a aVar) {
        this.f6587b.add(aVar);
    }

    /* renamed from: b */
    public final void mo18055b(C2794a aVar) {
        this.f6587b.remove(aVar);
    }
}
