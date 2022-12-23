package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.p1 */
public final class C11616p1 {

    /* renamed from: c */
    private static volatile C11616p1 f27871c;

    /* renamed from: d */
    private static final Object f27872d = new Object();

    /* renamed from: a */
    private List<String> f27873a;

    /* renamed from: b */
    private final List<C11617a> f27874b = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.p1$a */
    public interface C11617a {
        /* renamed from: a */
        void mo62903a();
    }

    C11616p1(Context context) {
        synchronized (this) {
            this.f27873a = m29999a(context.getResources().getConfiguration());
        }
    }

    /* renamed from: a */
    public static C11616p1 m29998a(Context context) {
        if (f27871c == null) {
            synchronized (f27872d) {
                if (f27871c == null) {
                    f27871c = new C11616p1(context.getApplicationContext());
                }
            }
        }
        return f27871c;
    }

    /* renamed from: b */
    public void mo63449b(Configuration configuration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f27873a = m29999a(configuration);
            arrayList = new ArrayList(this.f27874b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C11617a) it.next()).mo62903a();
        }
    }

    /* renamed from: a */
    public List<String> mo63447a() {
        return this.f27873a;
    }

    /* renamed from: a */
    public synchronized void mo63448a(C11617a aVar) {
        this.f27874b.add(aVar);
    }

    /* renamed from: a */
    private List<String> m29999a(Configuration configuration) {
        if (!C10796U2.m27890a(24)) {
            return Collections.singletonList(C11060b2.m28559a(configuration.locale));
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales != null) {
            Intrinsics.checkNotNullExpressionValue(locales, "configuration.locales ?: return result");
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                Locale locale = locales.get(i);
                if (locale != null) {
                    String a = C11060b2.m28559a(locale);
                    Intrinsics.checkNotNullExpressionValue(a, "PhoneUtils.normalizedLocale(it)");
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }
}
