package com.fyber.inneractive.sdk.p047g.p048a;

import com.fyber.inneractive.sdk.util.C3643ap;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.g.a.e */
public final class C2920e {

    /* renamed from: a */
    private static String f6966a = "version";

    /* renamed from: b */
    private String f6967b;

    /* renamed from: c */
    private String f6968c;

    private C2920e() {
    }

    /* renamed from: a */
    public static C2920e m6551a(Node node) {
        if (node == null) {
            return null;
        }
        C2920e eVar = new C2920e();
        eVar.f6967b = C3643ap.m9066c(node, f6966a);
        eVar.f6968c = C3643ap.m9063a(node);
        return eVar;
    }
}
