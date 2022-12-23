package com.ogury.core.internal.aaid;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7935au;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ogury.core.internal.aaid.e */
/* compiled from: OguryAdvertisingIdGenerator.kt */
public final class C7912e {

    /* renamed from: a */
    public static final C7912e f20686a = new C7912e();

    /* renamed from: com.ogury.core.internal.aaid.e$a */
    /* compiled from: OguryAdvertisingIdGenerator.kt */
    static final class C7913a<T> implements Comparator<ApplicationInfo> {

        /* renamed from: a */
        public static final C7913a f20687a = new C7913a();

        C7913a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = ((ApplicationInfo) obj).packageName;
            String str2 = ((ApplicationInfo) obj2).packageName;
            C7921ai.m22142a((Object) str2, "rhs.packageName");
            return str.compareTo(str2);
        }
    }

    private C7912e() {
    }

    /* renamed from: a */
    public final OguryAaid mo52892a(Context context) {
        String str;
        String a;
        C7921ai.m22144b(context, "context");
        try {
            C7908a a2 = C7910c.f20683a.mo52888a(context);
            if (a2 == null || (a = a2.mo52880a()) == null) {
                throw new IllegalStateException("Advertising Id is null");
            }
            return new OguryAaid(a, !a2.mo52881b(), false);
        } catch (Exception unused) {
            ApplicationInfo b = m22131b(context);
            if (b == null) {
                str = "00000000-0000-0000-0000-000000000000";
            } else {
                str = m22130a(context, b);
            }
            return new OguryAaid(str, true, true);
        }
    }

    /* renamed from: a */
    private static String m22130a(Context context, ApplicationInfo applicationInfo) {
        try {
            long j = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 128).firstInstallTime;
            String str = String.valueOf(j);
            Charset charset = C7935au.f20699a;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                C7921ai.m22142a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                String uuid = UUID.nameUUIDFromBytes(bytes).toString();
                C7921ai.m22142a((Object) uuid, "UUID.nameUUIDFromBytes((…toByteArray()).toString()");
                return uuid;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return "00000000-0000-0000-0000-000000000000";
        }
    }

    /* renamed from: b */
    private final ApplicationInfo m22131b(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                    ArrayList arrayList = new ArrayList();
                    if (installedApplications.size() == 0) {
                        return null;
                    }
                    C7921ai.m22142a((Object) installedApplications, "apps");
                    for (int i = 0; i < installedApplications.size(); i++) {
                        ApplicationInfo applicationInfo = installedApplications.get(i);
                        if (!((1 & applicationInfo.flags) == 0 || applicationInfo.packageName == null)) {
                            arrayList.add(applicationInfo);
                        }
                    }
                    List list = arrayList;
                    Comparator comparator = C7913a.f20687a;
                    C7921ai.m22144b(list, "$this$sortWith");
                    C7921ai.m22144b(comparator, "comparator");
                    if (list.size() > 1) {
                        Collections.sort(list, comparator);
                    }
                    return (ApplicationInfo) arrayList.get(0);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
