package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.util.C3643ap;
import com.smaato.sdk.video.vast.model.InLine;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.k */
public final class C2926k extends C2919d {

    /* renamed from: e */
    private String f7000e;

    /* renamed from: f */
    private String f7001f;

    private C2926k() {
    }

    /* renamed from: b */
    public static C2926k m6555b(Node node) {
        if (node == null) {
            return null;
        }
        C2926k kVar = new C2926k();
        kVar.mo18382a(node);
        return kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18382a(Node node) {
        super.mo18382a(node);
        this.f7000e = C3643ap.m9063a(C3643ap.m9064a(node, InLine.AD_TITLE));
        this.f7001f = C3643ap.m9063a(C3643ap.m9064a(node, InLine.DESCRIPTION));
    }
}
