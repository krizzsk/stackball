package com.p243my.tracker.campaign;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p243my.tracker.obfuscated.C7806d;
import com.p243my.tracker.obfuscated.C7864q;
import com.p243my.tracker.obfuscated.C7877u0;

/* renamed from: com.my.tracker.campaign.CampaignService */
public final class CampaignService extends Service {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21038a(String str, Runnable runnable) {
        C7864q.m21498a(str, (Context) this, runnable);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C7877u0.m21547a("CampaignService: onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        C7877u0.m21547a("CampaignService: onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        $$Lambda$4_DtPAJa8CckUOPIUKD3E8lEU6s r0 = new Runnable() {
            public final void run() {
                CampaignService.this.stopSelf();
            }
        };
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                C7806d.m21130a(new Runnable(stringExtra, r0) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ Runnable f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        CampaignService.this.m21038a(this.f$1, this.f$2);
                    }
                });
                return super.onStartCommand((Intent) null, i, i2);
            }
        }
        C7806d.m21130a(r0);
        return 2;
    }
}
