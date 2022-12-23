package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.IParamsCallback;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.yandex.metrica.impl.ob.wi */
public final class C11916wi {

    /* renamed from: a */
    private C11954xi f28675a = new C11954xi();

    /* renamed from: a */
    public final synchronized C11954xi mo64043a() {
        return this.f28675a;
    }

    /* renamed from: a */
    public final synchronized void mo64044a(C11954xi xiVar) {
        this.f28675a = xiVar;
    }

    /* renamed from: a */
    public final C11258g1 mo64042a(String str) {
        Boolean b;
        String str2;
        C11954xi xiVar = this.f28675a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (b = xiVar.mo64090b()) == null) {
            return null;
        }
        boolean booleanValue = b.booleanValue();
        C11171e1 c = xiVar.mo64091c();
        String a = xiVar.mo64089a();
        if (booleanValue) {
            str2 = "true";
        } else if (!booleanValue) {
            str2 = "false";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new C11258g1(str2, c, a);
    }

    /* renamed from: a */
    public final synchronized void mo64045a(List<String> list, Map<String, C11258g1> map) {
        Boolean b;
        String str;
        for (String str2 : list) {
            if (str2.hashCode() == 949037879) {
                if (str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (b = this.f28675a.mo64090b()) != null) {
                    boolean booleanValue = b.booleanValue();
                    C11171e1 c = this.f28675a.mo64091c();
                    String a = this.f28675a.mo64089a();
                    if (booleanValue) {
                        str = "true";
                    } else if (!booleanValue) {
                        str = "false";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new C11258g1(str, c, a));
                }
            }
        }
    }
}
