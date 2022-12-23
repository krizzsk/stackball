package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public class uh0 extends lz0 {

    /* renamed from: d */
    public static final C14759a f40650d = new C14759a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f40651e;

    /* renamed from: com.yandex.mobile.ads.impl.uh0$a */
    public static final class C14759a {
        private C14759a() {
        }

        public /* synthetic */ C14759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002a;
     */
    static {
        /*
            com.yandex.mobile.ads.impl.uh0$a r0 = new com.yandex.mobile.ads.impl.uh0$a
            r1 = 0
            r0.<init>(r1)
            f40650d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r0)
        L_0x0015:
            r0 = 0
            if (r1 == 0) goto L_0x0021
            int r1 = r1.intValue()
            r2 = 9
            if (r1 < r2) goto L_0x002b
            goto L_0x002a
        L_0x0021:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x002b }
            r1.getMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x002b }
        L_0x002a:
            r0 = 1
        L_0x002b:
            f40651e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uh0.<clinit>():void");
    }

    /* renamed from: a */
    public void mo68538a(SSLSocket sSLSocket, String str, List<w11> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Intrinsics.checkNotNullParameter(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((w11) next) != w11.HTTP_1_0) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((w11) it2.next()).toString());
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public String mo68540b(SSLSocket sSLSocket) {
        boolean z;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) applicationProtocol, (Object) "");
            }
            if (z) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
