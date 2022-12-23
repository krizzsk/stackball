package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1554p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.h */
class C1457h implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static AlertDialog f3433b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicBoolean f3434c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1463i f3435a;

    /* renamed from: d */
    private C1554p f3436d;

    /* renamed from: com.applovin.impl.sdk.h$a */
    public interface C1462a {
        /* renamed from: a */
        void mo13053a();

        /* renamed from: b */
        void mo13054b();
    }

    C1457h(C1463i iVar, C1469j jVar) {
        this.f3435a = iVar;
        jVar.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        jVar.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    /* renamed from: a */
    public void mo13048a(long j, final C1469j jVar, final C1462a aVar) {
        if (j > 0) {
            AlertDialog alertDialog = f3433b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                if (f3434c.getAndSet(true)) {
                    if (j < this.f3436d.mo13344a()) {
                        C1505q v = jVar.mo13139v();
                        v.mo13277b("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.f3436d.mo13344a() + "ms)");
                        this.f3436d.mo13347d();
                    } else {
                        C1505q v2 = jVar.mo13139v();
                        v2.mo13280d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f3436d.mo13344a() + " milliseconds");
                        return;
                    }
                }
                C1505q v3 = jVar.mo13139v();
                v3.mo13277b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
                this.f3436d = C1554p.m3559a(j, jVar, new Runnable() {
                    public void run() {
                        String str;
                        C1505q qVar;
                        if (C1457h.this.f3435a.mo13057c()) {
                            jVar.mo13139v().mo13281e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                            return;
                        }
                        Activity a = jVar.mo13086Z().mo12601a();
                        if (a == null || !C1520h.m3445a(jVar.mo13065D())) {
                            if (a == null) {
                                qVar = jVar.mo13139v();
                                str = "No parent Activity found - rescheduling consent alert...";
                            } else {
                                qVar = jVar.mo13139v();
                                str = "No internet available - rescheduling consent alert...";
                            }
                            qVar.mo13281e("ConsentAlertManager", str);
                            C1457h.f3434c.set(false);
                            C1457h.this.mo13048a(((Long) jVar.mo13088a(C1369c.f2908ay)).longValue(), jVar, aVar);
                            return;
                        }
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                AlertDialog unused = C1457h.f3433b = new AlertDialog.Builder(jVar.mo13086Z().mo12601a()).setTitle((CharSequence) jVar.mo13088a(C1369c.f2909az)).setMessage((CharSequence) jVar.mo13088a(C1369c.f2858aA)).setCancelable(false).setPositiveButton((CharSequence) jVar.mo13088a(C1369c.f2859aB), new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        aVar.mo13053a();
                                        dialogInterface.dismiss();
                                        C1457h.f3434c.set(false);
                                    }
                                }).setNegativeButton((CharSequence) jVar.mo13088a(C1369c.f2860aC), new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        aVar.mo13054b();
                                        dialogInterface.dismiss();
                                        C1457h.f3434c.set(false);
                                        C1457h.this.mo13048a(((Long) jVar.mo13088a(C1369c.f2907ax)).longValue(), jVar, aVar);
                                    }
                                }).create();
                                C1457h.f3433b.show();
                            }
                        });
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.f3436d != null) {
            String action = intent.getAction();
            if ("com.applovin.application_paused".equals(action)) {
                this.f3436d.mo13345b();
            } else if ("com.applovin.application_resumed".equals(action)) {
                this.f3436d.mo13346c();
            }
        }
    }
}
