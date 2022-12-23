package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d */
/* compiled from: MraidVolumeChangeReceiver */
public final class C6553d {

    /* renamed from: a */
    public static double f16326a = -1.0d;

    /* renamed from: b */
    private Context f16327b;

    /* renamed from: c */
    private AudioManager f16328c;

    /* renamed from: d */
    private boolean f16329d = false;

    /* renamed from: e */
    private C6555b f16330e;

    /* renamed from: f */
    private C6554a f16331f;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$b */
    /* compiled from: MraidVolumeChangeReceiver */
    public interface C6555b {
        /* renamed from: a */
        void mo44211a(double d);
    }

    public C6553d(Context context) {
        this.f16327b = context;
        this.f16328c = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public final double mo44481a() {
        AudioManager audioManager = this.f16328c;
        int i = -1;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f16328c;
        if (audioManager2 != null) {
            i = audioManager2.getStreamVolume(3);
        }
        double d = (((double) i) * 100.0d) / ((double) streamMaxVolume);
        f16326a = d;
        return d;
    }

    /* renamed from: b */
    public final C6555b mo44483b() {
        return this.f16330e;
    }

    /* renamed from: a */
    public final void mo44482a(C6555b bVar) {
        this.f16330e = bVar;
    }

    /* renamed from: c */
    public final void mo44484c() {
        if (this.f16327b != null) {
            this.f16331f = new C6554a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f16327b.registerReceiver(this.f16331f, intentFilter);
            this.f16329d = true;
        }
    }

    /* renamed from: d */
    public final void mo44485d() {
        Context context;
        if (this.f16329d && (context = this.f16327b) != null) {
            try {
                context.unregisterReceiver(this.f16331f);
                this.f16330e = null;
                this.f16329d = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$a */
    /* compiled from: MraidVolumeChangeReceiver */
    private static class C6554a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C6553d> f16332a;

        public C6554a(C6553d dVar) {
            this.f16332a = new WeakReference<>(dVar);
        }

        public final void onReceive(Context context, Intent intent) {
            C6553d dVar;
            C6555b b;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = (C6553d) this.f16332a.get()) != null && (b = dVar.mo44483b()) != null) {
                double a = dVar.mo44481a();
                if (a >= 0.0d) {
                    b.mo44211a(a);
                }
            }
        }
    }
}
