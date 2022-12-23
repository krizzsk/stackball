package com.ogury.p245ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.crash.CrashConfig;
import com.ogury.core.internal.crash.OguryCrashReport;
import com.ogury.core.internal.crash.SdkInfo;
import com.ogury.p245ed.internal.C8229fk;
import p269io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.db */
public final class C8130db {

    /* renamed from: a */
    public static final C8131a f21067a = new C8131a((byte) 0);

    /* renamed from: b */
    private final C8229fk.C8230a f21068b;

    /* renamed from: c */
    private final C8233fn f21069c;

    private C8130db(C8229fk.C8230a aVar, C8233fn fnVar) {
        C8467mq.m23881b(aVar, "profigDaoFactory");
        C8467mq.m23881b(fnVar, "profigGateway");
        this.f21068b = aVar;
        this.f21069c = fnVar;
    }

    public /* synthetic */ C8130db() {
        this(C8229fk.f21305a, C8233fn.f21330a);
    }

    /* renamed from: com.ogury.ed.internal.db$a */
    public static final class C8131a {
        public /* synthetic */ C8131a(byte b) {
            this();
        }

        private C8131a() {
        }
    }

    /* renamed from: a */
    public static void m22653a(Context context, String str) {
        C8467mq.m23881b(context, "appContext");
        C8467mq.m23881b(str, "apiKey");
        C8232fm a = C8233fn.m23113a(context);
        if (a != null) {
            try {
                OguryCrashReport.start(CampaignUnit.JSON_KEY_ADS, context, new SdkInfo(PresageSdk.getAdsSdkVersion(), str, C8229fk.C8230a.m23074a(context).mo53512c()), new CrashConfig(a.mo53554m(), context.getPackageName(), 5, 100));
            } catch (Throwable unused) {
            }
        }
    }
}
