package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ne */
public class C11562ne implements C11314he {

    /* renamed from: a */
    private final Context f27784a;

    /* renamed from: b */
    private final String f27785b;

    /* renamed from: c */
    private final C10898Wn f27786c;

    public C11562ne(Context context, String str, C10898Wn wn) {
        this.f27784a = context;
        this.f27785b = str;
        this.f27786c = wn;
    }

    /* renamed from: a */
    public List<C11347ie> mo63012a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo b = this.f27786c.mo62462b(this.f27784a, this.f27785b, 4096);
        if (b != null) {
            for (String ieVar : b.requestedPermissions) {
                arrayList.add(new C11347ie(ieVar, true));
            }
        }
        return arrayList;
    }
}
