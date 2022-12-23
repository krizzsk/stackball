package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.Q1 */
public abstract class C10653Q1 {

    /* renamed from: com.yandex.metrica.impl.ob.Q1$a */
    interface C10654a {
        /* renamed from: a */
        void mo61345a(Context context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo61342a(C11816ue ueVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract SparseArray<C10654a> mo61343a();

    /* renamed from: a */
    public synchronized void mo61945a(Context context) {
        C11816ue ueVar = new C11816ue(context);
        int a = mo61342a(ueVar);
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        if (a != libraryApiLevel) {
            if (a > 0 && a < libraryApiLevel) {
                SparseArray<C10654a> a2 = mo61343a();
                while (true) {
                    a++;
                    if (a > libraryApiLevel) {
                        break;
                    }
                    C10654a aVar = a2.get(a);
                    if (aVar != null) {
                        aVar.mo61345a(context);
                    }
                }
            }
            mo61344a(ueVar, libraryApiLevel);
            ueVar.mo63599b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61344a(C11816ue ueVar, int i);
}
