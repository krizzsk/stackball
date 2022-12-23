package com.iab.omid.library.adcolony.p090b;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.adcolony.p093e.C4583a;

/* renamed from: com.iab.omid.library.adcolony.b.c */
public class C4565c {

    /* renamed from: a */
    private final C4583a f10288a;

    /* renamed from: b */
    private final String f10289b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f10290c;

    /* renamed from: d */
    private final String f10291d;

    public C4565c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f10288a = new C4583a(view);
        this.f10289b = view.getClass().getCanonicalName();
        this.f10290c = friendlyObstructionPurpose;
        this.f10291d = str;
    }

    /* renamed from: a */
    public C4583a mo38588a() {
        return this.f10288a;
    }

    /* renamed from: b */
    public String mo38589b() {
        return this.f10289b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo38590c() {
        return this.f10290c;
    }

    /* renamed from: d */
    public String mo38591d() {
        return this.f10291d;
    }
}
