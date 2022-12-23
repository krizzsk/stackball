package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.util.C3643ap;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.q */
public final class C2932q {

    /* renamed from: a */
    public String f7030a;

    /* renamed from: b */
    public String f7031b;

    private C2932q() {
    }

    /* renamed from: a */
    public static C2932q m6559a(Node node) {
        if (node == null) {
            return null;
        }
        C2932q qVar = new C2932q();
        qVar.f7030a = C3643ap.m9066c(node, "event");
        qVar.f7031b = C3643ap.m9063a(node);
        return qVar;
    }

    public final String toString() {
        return "VTracking:  name:" + this.f7030a + " url:" + this.f7031b;
    }
}
