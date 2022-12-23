package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;

/* renamed from: com.yandex.metrica.impl.ob.q7 */
public final class C11675q7 {
    @JvmStatic
    /* renamed from: a */
    public static final C11624p7 m30082a(Throwable th, C11189e7 e7Var, List<StackTraceElement> list, String str, Boolean bool) {
        C11555n7 n7Var;
        ArrayList arrayList = null;
        if (th != null) {
            n7Var = C11592o7.m29967a(th);
        } else {
            n7Var = null;
        }
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (StackTraceElement l7Var : list) {
                arrayList.add(new C11484l7(l7Var));
            }
        }
        return new C11624p7(n7Var, e7Var, arrayList, (String) null, (String) null, (Map<String, String>) null, str, bool);
    }

    @JvmStatic
    /* renamed from: a */
    public static final C11624p7 m30081a(String str, String str2, List<? extends StackTraceItem> list, String str3, String str4, Map<String, String> map, String str5, Boolean bool) {
        ArrayList arrayList;
        List<? extends StackTraceItem> list2 = list;
        if (list2 != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new C11484l7(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), (Boolean) null));
            }
        } else {
            arrayList = null;
        }
        return new C11624p7(new C11555n7(str, str2, arrayList, (C11555n7) null, (List<C11555n7>) null), (C11189e7) null, (List<C11484l7>) null, str3, str4, map, str5, bool);
    }
}
