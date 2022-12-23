package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import com.vungle.warren.model.AdvertisementDBAdapter;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.L1 */
public class C10443L1 {

    /* renamed from: a */
    private final C10442L0 f25086a;

    /* renamed from: b */
    private boolean f25087b;

    public C10443L1(C10197Dm dm) {
        this(dm, new C10442L0());
    }

    /* renamed from: a */
    public void mo61702a(Context context) {
        long j;
        synchronized (this) {
        }
        if (!this.f25087b) {
            synchronized (this) {
                try {
                    String a = C10823V0.m27962a(this.f25086a.mo61697a(context, "metrica_service_settings.dat"));
                    if (!TextUtils.isEmpty(a)) {
                        j = new JSONObject(a).optLong(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY);
                    }
                } catch (Throwable unused) {
                }
                j = 0;
            }
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (Throwable unused2) {
                }
            }
            this.f25087b = true;
        }
    }

    C10443L1(C10197Dm dm, C10442L0 l0) {
        this.f25087b = false;
        this.f25086a = l0;
    }
}
