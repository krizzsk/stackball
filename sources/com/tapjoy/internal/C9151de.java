package com.tapjoy.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.Collections;

/* renamed from: com.tapjoy.internal.de */
public final class C9151de {

    /* renamed from: f */
    private static C9151de f22501f = new C9151de();

    /* renamed from: a */
    public Context f22502a;

    /* renamed from: b */
    public BroadcastReceiver f22503b;

    /* renamed from: c */
    public boolean f22504c;

    /* renamed from: d */
    public boolean f22505d;

    /* renamed from: e */
    public C9153a f22506e;

    /* renamed from: com.tapjoy.internal.de$a */
    public interface C9153a {
        /* renamed from: a */
        void mo57951a(boolean z);
    }

    private C9151de() {
    }

    /* renamed from: a */
    public static C9151de m24509a() {
        return f22501f;
    }

    /* renamed from: b */
    public final boolean mo57948b() {
        return !this.f22505d;
    }

    /* renamed from: c */
    public final void mo57949c() {
        boolean z = !this.f22505d;
        for (C9145cz czVar : Collections.unmodifiableCollection(C9150dd.m24507a().f22499a)) {
            C9170ds dsVar = czVar.f22480c;
            if (dsVar.f22529a.get() != null) {
                C9155dg.m24515a().mo57953a(dsVar.mo57966c(), "setState", z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m24510a(C9151de deVar, boolean z) {
        if (deVar.f22505d != z) {
            deVar.f22505d = z;
            if (deVar.f22504c) {
                deVar.mo57949c();
                C9153a aVar = deVar.f22506e;
                if (aVar != null) {
                    aVar.mo57951a(deVar.mo57948b());
                }
            }
        }
    }
}
