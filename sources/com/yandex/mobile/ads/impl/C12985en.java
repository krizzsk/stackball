package com.yandex.mobile.ads.impl;

import android.net.Uri;

/* renamed from: com.yandex.mobile.ads.impl.en */
public class C12985en {
    /* renamed from: a */
    public boolean mo66849a(C14687tm tmVar, d10 d10) {
        f50<Uri> f50 = tmVar.f40364h;
        Uri a = f50 != null ? f50.mo66924a(d10.mo66388b()) : null;
        if (C13230gr.m36676a(a, d10)) {
            return C13230gr.m36679a(tmVar, (C13513jm) d10);
        }
        return mo66847a(a, d10);
    }

    /* renamed from: a */
    public boolean mo66848a(m10 m10, d10 d10) {
        f50<Uri> f50 = m10.f37157f;
        Uri a = f50 != null ? f50.mo66924a(((C13513jm) d10).mo66388b()) : null;
        if (C13230gr.m36676a(a, d10)) {
            return C13230gr.m36678a(m10, (C13513jm) d10);
        }
        return mo66847a(a, d10);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo66847a(android.net.Uri r6, com.yandex.mobile.ads.impl.d10 r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r6.getScheme()
            java.lang.String r2 = "div-action"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r6.getAuthority()
            java.lang.String r2 = "set_state"
            boolean r2 = r2.equals(r1)
            r3 = 1
            if (r2 == 0) goto L_0x0035
            java.lang.String r1 = "state_id"
            java.lang.String r1 = r6.getQueryParameter(r1)
            if (r1 != 0) goto L_0x0027
            goto L_0x00c8
        L_0x0027:
            java.lang.String r2 = "temporary"
            boolean r6 = r6.getBooleanQueryParameter(r2, r3)
            com.yandex.mobile.ads.impl.ty r1 = com.yandex.mobile.ads.impl.C14729ty.m42538a((java.lang.String) r1)     // Catch:{ vy0 -> 0x00c8 }
            r7.mo66386a((com.yandex.mobile.ads.impl.C14729ty) r1, (boolean) r6)     // Catch:{ vy0 -> 0x00c8 }
            goto L_0x004a
        L_0x0035:
            java.lang.String r2 = "show_tooltip"
            boolean r2 = r2.equals(r1)
            java.lang.String r4 = "id"
            if (r2 == 0) goto L_0x004d
            java.lang.String r6 = r6.getQueryParameter(r4)
            if (r6 != 0) goto L_0x0047
            goto L_0x00c8
        L_0x0047:
            r7.mo66387a(r6)
        L_0x004a:
            r0 = 1
            goto L_0x00c8
        L_0x004d:
            java.lang.String r2 = "hide_tooltip"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0061
            java.lang.String r6 = r6.getQueryParameter(r4)
            if (r6 != 0) goto L_0x005d
            goto L_0x00c8
        L_0x005d:
            r7.mo66389b(r6)
            goto L_0x004a
        L_0x0061:
            java.lang.String r2 = "set_variable"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x008e
            java.lang.String r1 = "name"
            java.lang.String r1 = r6.getQueryParameter(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x00c8
        L_0x0072:
            java.lang.String r2 = "value"
            java.lang.String r6 = r6.getQueryParameter(r2)
            if (r6 != 0) goto L_0x007b
            goto L_0x00c8
        L_0x007b:
            boolean r2 = r7 instanceof com.yandex.mobile.ads.impl.C13513jm
            if (r2 == 0) goto L_0x0083
            r2 = r7
            com.yandex.mobile.ads.impl.jm r2 = (com.yandex.mobile.ads.impl.C13513jm) r2
            goto L_0x0084
        L_0x0083:
            r2 = 0
        L_0x0084:
            if (r2 != 0) goto L_0x008a
            r7.getClass()
            goto L_0x00c8
        L_0x008a:
            r2.setVariable(r1, r6)     // Catch:{  }
            goto L_0x004a
        L_0x008e:
            java.lang.String r2 = "authority"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = r1.hashCode()
            r4 = -1789088446(0xffffffff955cad42, float:-4.4565322E-26)
            if (r2 == r4) goto L_0x00b9
            r4 = -1280379330(0xffffffffb3aef63e, float:-8.1472976E-8)
            if (r2 == r4) goto L_0x00b0
            r4 = -88123690(0xfffffffffabf56d6, float:-4.9674497E35)
            if (r2 == r4) goto L_0x00a7
            goto L_0x00c1
        L_0x00a7:
            java.lang.String r2 = "set_current_item"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00c2
            goto L_0x00c1
        L_0x00b0:
            java.lang.String r2 = "set_previous_item"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00c2
            goto L_0x00c1
        L_0x00b9:
            java.lang.String r2 = "set_next_item"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            if (r3 == 0) goto L_0x00c8
            boolean r0 = com.yandex.mobile.ads.impl.C12922du.m35452a(r6, r7)
        L_0x00c8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12985en.mo66847a(android.net.Uri, com.yandex.mobile.ads.impl.d10):boolean");
    }
}
