package com.iab.omid.library.ironsrc.p108b;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.p111e.C4731a;

/* renamed from: com.iab.omid.library.ironsrc.b.c */
public class C4713c {

    /* renamed from: a */
    private final C4731a f10617a;

    /* renamed from: b */
    private final String f10618b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f10619c;

    /* renamed from: d */
    private final String f10620d;

    public C4713c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f10617a = new C4731a(view);
        this.f10618b = view.getClass().getCanonicalName();
        this.f10619c = friendlyObstructionPurpose;
        this.f10620d = str;
    }

    /* renamed from: a */
    public C4731a mo39134a() {
        return this.f10617a;
    }

    /* renamed from: b */
    public String mo39135b() {
        return this.f10618b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo39136c() {
        return this.f10619c;
    }

    /* renamed from: d */
    public String mo39137d() {
        return this.f10620d;
    }
}
