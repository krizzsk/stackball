package com.yandex.metrica.impl.p265ob;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.n1 */
public class C11543n1 {

    /* renamed from: a */
    private static final Pattern f27745a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: b */
    private static final Pattern f27746b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    /* renamed from: a */
    public boolean mo63331a(List<StackTraceElement> list) {
        return m29814a(list, f27745a);
    }

    /* renamed from: b */
    public boolean mo63332b(List<StackTraceElement> list) {
        return m29814a(list, f27746b);
    }

    /* renamed from: a */
    private boolean m29814a(List<StackTraceElement> list, Pattern pattern) {
        for (StackTraceElement className : list) {
            if (pattern.matcher(className.getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}
