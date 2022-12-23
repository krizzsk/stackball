package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ke */
class C11426ke implements C11314he {

    /* renamed from: a */
    private final Context f27392a;

    /* renamed from: b */
    private final C10898Wn f27393b;

    public C11426ke(Context context, C10898Wn wn) {
        this.f27392a = context;
        this.f27393b = wn;
    }

    /* renamed from: a */
    public List<C11347ie> mo63012a() {
        ArrayList arrayList = new ArrayList();
        C10898Wn wn = this.f27393b;
        Context context = this.f27392a;
        PackageInfo b = wn.mo62462b(context, context.getPackageName(), 4096);
        if (b == null) {
            return arrayList;
        }
        String[] strArr = b.requestedPermissions;
        int[] iArr = b.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr == null || iArr.length <= i || (iArr[i] & 2) == 0) {
                arrayList.add(new C11347ie(str, false));
            } else {
                arrayList.add(new C11347ie(str, true));
            }
        }
        return arrayList;
    }
}
