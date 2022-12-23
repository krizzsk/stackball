package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.util.C3643ap;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.c */
public final class C2918c {

    /* renamed from: d */
    private static String f6956d = "Wrapper";

    /* renamed from: e */
    private static String f6957e = "InLine";

    /* renamed from: f */
    private static String f6958f = "id";

    /* renamed from: a */
    public String f6959a;

    /* renamed from: b */
    public C2934s f6960b;

    /* renamed from: c */
    public C2926k f6961c;

    private C2918c() {
    }

    /* renamed from: a */
    public static C2918c m6549a(Node node) {
        if (node == null) {
            return null;
        }
        C2918c cVar = new C2918c();
        cVar.f6959a = C3643ap.m9066c(node, f6958f);
        Node a = C3643ap.m9064a(node, f6956d);
        if (a != null) {
            cVar.f6960b = C2934s.m6561b(a);
        }
        Node a2 = C3643ap.m9064a(node, f6957e);
        if (a2 != null) {
            cVar.f6961c = C2926k.m6555b(a2);
        }
        return cVar;
    }

    public final String toString() {
        return "Ad: id = " + this.f6959a + "\n";
    }
}
