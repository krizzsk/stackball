package com.inmobi.media;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.inmobi.media.gs */
/* compiled from: AppDataPrefManager */
public class C5319gs {

    /* renamed from: a */
    private static final String f12199a = C5319gs.class.getName();

    /* renamed from: b */
    private static final Object f12200b = new Object();

    /* renamed from: c */
    private static long m12246c(Context context) {
        long j = 0;
        try {
            synchronized (f12200b) {
                j = new C5330gz(context, "app_bundle_store").mo40671a();
            }
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static void m12243a(Context context) {
        try {
            synchronized (f12200b) {
                new C5330gz(context, "app_bundle_store").mo40673a(System.currentTimeMillis());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static Set<String> m12241a(List<String> list) {
        Set<String> set;
        try {
            Context c = C5314go.m12203c();
            if (c == null) {
                return null;
            }
            synchronized (f12200b) {
                C5330gz gzVar = new C5330gz(c, "app_bundle_store");
                if (m12245b(c)) {
                    set = new HashSet<>(list);
                    gzVar.mo40675a("app_bundle_ids", set);
                } else {
                    set = gzVar.mo40672a("app_bundle_ids");
                }
            }
            return set;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m12244a(Set<String> set) {
        try {
            Context c = C5314go.m12203c();
            if (c != null && set != null && !set.isEmpty()) {
                synchronized (f12200b) {
                    C5330gz gzVar = new C5330gz(c, "app_bundle_store");
                    Set<String> a = gzVar.mo40672a("app_bundle_ids");
                    if (a != null) {
                        HashSet hashSet = new HashSet(a);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            if (set.contains((String) it.next())) {
                                it.remove();
                            }
                        }
                        gzVar.mo40675a("app_bundle_ids", (Set<String>) hashSet);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m12242a() {
        Context c = C5314go.m12203c();
        if (c != null) {
            try {
                synchronized (f12200b) {
                    new C5330gz(c, "app_bundle_store").mo40678b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m12245b(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        return !simpleDateFormat.format(new Date()).equals(simpleDateFormat.format(new Date(m12246c(context))));
    }
}
