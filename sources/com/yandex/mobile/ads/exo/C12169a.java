package com.yandex.mobile.ads.exo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: com.yandex.mobile.ads.exo.a */
final class C12169a {

    /* renamed from: a */
    private final Context f29547a;

    /* renamed from: b */
    private final C12170a f29548b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f29549c;

    /* renamed from: com.yandex.mobile.ads.exo.a$a */
    private final class C12170a extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        private final C12171b f29550b;

        /* renamed from: c */
        private final Handler f29551c;

        public C12170a(Handler handler, C12171b bVar) {
            this.f29551c = handler;
            this.f29550b = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f29551c.post(this);
            }
        }

        public void run() {
            if (C12169a.this.f29549c) {
                C12266p.this.mo65154a(false);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.a$b */
    public interface C12171b {
    }

    public C12169a(Context context, Handler handler, C12171b bVar) {
        this.f29547a = context.getApplicationContext();
        this.f29548b = new C12170a(handler, bVar);
    }

    /* renamed from: a */
    public void mo64782a(boolean z) {
        if (z && !this.f29549c) {
            this.f29547a.registerReceiver(this.f29548b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f29549c = true;
        } else if (!z && this.f29549c) {
            this.f29547a.unregisterReceiver(this.f29548b);
            this.f29549c = false;
        }
    }
}
