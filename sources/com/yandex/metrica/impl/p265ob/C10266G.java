package com.yandex.metrica.impl.p265ob;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10322H;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo72093d2 = {"Lcom/yandex/metrica/impl/ob/G;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/D;", "converter", "Lcom/yandex/metrica/impl/ob/H;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/D;)Lcom/yandex/metrica/impl/ob/H;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.G */
public final class C10266G {

    /* renamed from: a */
    public static final C10266G f24707a = new C10266G();

    /* renamed from: com.yandex.metrica.impl.ob.G$a */
    static final class C10267a<T, R> implements C10897Wm<UsageStatsManager, C10322H.C10323a> {

        /* renamed from: a */
        final /* synthetic */ C10173D f24708a;

        C10267a(C10173D d) {
            this.f24708a = d;
        }

        /* renamed from: a */
        public Object mo61337a(Object obj) {
            C10173D d = this.f24708a;
            int appStandbyBucket = ((UsageStatsManager) obj).getAppStandbyBucket();
            d.getClass();
            if (C10796U2.m27890a(28)) {
                if (C10796U2.m27890a(30) && appStandbyBucket == 45) {
                    return C10322H.C10323a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return C10322H.C10323a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return C10322H.C10323a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return C10322H.C10323a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return C10322H.C10323a.RARE;
                }
            }
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G$b */
    static final class C10268b<T, R> implements C10897Wm<ActivityManager, Boolean> {

        /* renamed from: a */
        public static final C10268b f24709a = new C10268b();

        C10268b() {
        }

        /* renamed from: a */
        public Object mo61337a(Object obj) {
            return Boolean.valueOf(((ActivityManager) obj).isBackgroundRestricted());
        }
    }

    private C10266G() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final C10322H m26328a(Context context, C10173D d) {
        return new C10322H((C10322H.C10323a) C10796U2.m27875a(new C10267a(d), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) C10796U2.m27875a(C10268b.f24709a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
