package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.util.C3643ap;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.s */
public final class C2934s extends C2919d {

    /* renamed from: e */
    public String f7057e;

    private C2934s() {
    }

    /* renamed from: b */
    static C2934s m6561b(Node node) {
        if (node == null) {
            return null;
        }
        C2934s sVar = new C2934s();
        sVar.mo18382a(node);
        return sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18382a(Node node) {
        super.mo18382a(node);
        this.f7057e = C3643ap.m9063a(C3643ap.m9064a(node, "VASTAdTagURI"));
    }
}
