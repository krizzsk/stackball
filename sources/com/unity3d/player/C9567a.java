package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.unity3d.player.a */
final class C9567a {

    /* renamed from: a */
    private final Context f23810a;

    /* renamed from: b */
    private final AudioManager f23811b;

    /* renamed from: c */
    private C9568a f23812c;

    /* renamed from: com.unity3d.player.a$a */
    private class C9568a extends ContentObserver {

        /* renamed from: b */
        private final C9569b f23814b;

        /* renamed from: c */
        private final AudioManager f23815c;

        /* renamed from: d */
        private final int f23816d = 3;

        /* renamed from: e */
        private int f23817e;

        public C9568a(Handler handler, AudioManager audioManager, int i, C9569b bVar) {
            super(handler);
            this.f23815c = audioManager;
            this.f23814b = bVar;
            this.f23817e = audioManager.getStreamVolume(3);
        }

        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        public final void onChange(boolean z, Uri uri) {
            int streamVolume;
            AudioManager audioManager = this.f23815c;
            if (audioManager != null && this.f23814b != null && (streamVolume = audioManager.getStreamVolume(this.f23816d)) != this.f23817e) {
                this.f23817e = streamVolume;
                this.f23814b.onAudioVolumeChanged(streamVolume);
            }
        }
    }

    /* renamed from: com.unity3d.player.a$b */
    public interface C9569b {
        void onAudioVolumeChanged(int i);
    }

    public C9567a(Context context) {
        this.f23810a = context;
        this.f23811b = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    public final void mo58729a() {
        if (this.f23812c != null) {
            this.f23810a.getContentResolver().unregisterContentObserver(this.f23812c);
            this.f23812c = null;
        }
    }

    /* renamed from: a */
    public final void mo58730a(C9569b bVar) {
        this.f23812c = new C9568a(new Handler(), this.f23811b, 3, bVar);
        this.f23810a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f23812c);
    }
}
