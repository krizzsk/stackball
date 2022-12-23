package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.util.C3643ap;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.p */
public final class C2931p {

    /* renamed from: a */
    public List<C2918c> f7028a;

    /* renamed from: b */
    private String f7029b;

    private C2931p() {
    }

    /* renamed from: a */
    public static C2931p m6558a(Node node) {
        if (node == null) {
            return null;
        }
        C2931p pVar = new C2931p();
        pVar.f7029b = C3643ap.m9066c(node, "version");
        List<Node> b = C3643ap.m9065b(node, "Ad");
        if (!b.isEmpty()) {
            pVar.f7028a = new ArrayList();
            for (Node a : b) {
                pVar.f7028a.add(C2918c.m6549a(a));
            }
        }
        return pVar;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.f7029b + "\nAds: ").toString();
    }
}
