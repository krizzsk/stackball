package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.inmobi.media.cg */
/* compiled from: MraidMediaProcessor */
public final class C5063cg {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f11586f = C5063cg.class.getSimpleName();

    /* renamed from: a */
    public C5415m f11587a;

    /* renamed from: b */
    public C5056cd f11588b;

    /* renamed from: c */
    public C5068b f11589c;

    /* renamed from: d */
    public C5069c f11590d;

    /* renamed from: e */
    public C5067a f11591e;

    /* renamed from: com.inmobi.media.cg$b */
    /* compiled from: MraidMediaProcessor */
    public final class C5068b extends BroadcastReceiver {

        /* renamed from: b */
        private String f11598b;

        public C5068b(String str) {
            this.f11598b = str;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
                String unused = C5063cg.f11586f;
                C5063cg.m11493a(C5063cg.this, this.f11598b, 2 != intExtra);
            }
        }
    }

    /* renamed from: com.inmobi.media.cg$a */
    /* compiled from: MraidMediaProcessor */
    public final class C5067a extends BroadcastReceiver {

        /* renamed from: b */
        private String f11596b;

        public C5067a(String str) {
            this.f11596b = str;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                boolean z = false;
                int intExtra = intent.getIntExtra("state", 0);
                String unused = C5063cg.f11586f;
                C5063cg cgVar = C5063cg.this;
                String str = this.f11596b;
                if (1 == intExtra) {
                    z = true;
                }
                C5063cg.m11496b(cgVar, str, z);
            }
        }
    }

    /* renamed from: com.inmobi.media.cg$c */
    /* compiled from: MraidMediaProcessor */
    public final class C5069c extends ContentObserver {

        /* renamed from: b */
        private Context f11600b;

        /* renamed from: c */
        private int f11601c = -1;

        /* renamed from: d */
        private String f11602d;

        public C5069c(String str, Context context, Handler handler) {
            super(handler);
            this.f11602d = str;
            this.f11600b = context;
        }

        public final void onChange(boolean z) {
            AudioManager audioManager;
            super.onChange(z);
            Context context = this.f11600b;
            if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume != this.f11601c) {
                        this.f11601c = streamVolume;
                        C5063cg.m11492a(C5063cg.this, this.f11602d, streamVolume);
                    }
                } catch (Exception unused) {
                    String unused2 = C5063cg.f11586f;
                }
            }
        }
    }

    public C5063cg(C5415m mVar) {
        this.f11587a = mVar;
    }

    /* renamed from: a */
    public static boolean m11494a() {
        AudioManager audioManager;
        Context c = C5314go.m12203c();
        if (c == null || (audioManager = (AudioManager) c.getSystemService("audio")) == null || 2 == audioManager.getRingerMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo40319b() {
        C5068b bVar;
        Context c = C5314go.m12203c();
        if (c != null && (bVar = this.f11589c) != null) {
            c.unregisterReceiver(bVar);
            this.f11589c = null;
        }
    }

    /* renamed from: c */
    public final void mo40320c() {
        Context c = C5314go.m12203c();
        if (c != null && this.f11590d != null) {
            c.getContentResolver().unregisterContentObserver(this.f11590d);
            this.f11590d = null;
        }
    }

    /* renamed from: d */
    public static boolean m11497d() {
        AudioManager audioManager;
        Context c = C5314go.m12203c();
        if (c == null || (audioManager = (AudioManager) c.getSystemService("audio")) == null || !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo40321e() {
        C5067a aVar;
        Context c = C5314go.m12203c();
        if (c != null && (aVar = this.f11591e) != null) {
            c.unregisterReceiver(aVar);
            this.f11591e = null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11493a(C5063cg cgVar, String str, boolean z) {
        C5415m mVar = cgVar.f11587a;
        if (mVar != null) {
            mVar.mo40850a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m11496b(C5063cg cgVar, String str, boolean z) {
        C5415m mVar = cgVar.f11587a;
        if (mVar != null) {
            mVar.mo40850a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11492a(C5063cg cgVar, String str, int i) {
        C5415m mVar = cgVar.f11587a;
        if (mVar != null) {
            mVar.mo40850a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
