package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

public final class tt1 extends ContentObserver {

    /* renamed from: a */
    private final Context f40463a;

    /* renamed from: b */
    private final AudioManager f40464b;

    /* renamed from: c */
    private final ss1 f40465c;

    /* renamed from: d */
    private final pt1 f40466d;

    /* renamed from: e */
    private float f40467e;

    public tt1(Handler handler, Context context, ss1 ss1, pt1 pt1) {
        super(handler);
        this.f40463a = context;
        this.f40464b = (AudioManager) context.getSystemService("audio");
        this.f40465c = ss1;
        this.f40466d = pt1;
    }

    /* renamed from: c */
    private float m42497c() {
        int streamVolume = this.f40464b.getStreamVolume(3);
        int streamMaxVolume = this.f40464b.getStreamMaxVolume(3);
        this.f40465c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: a */
    public void mo70234a() {
        float c = m42497c();
        this.f40467e = c;
        ((bu1) this.f40466d).mo66122a(c);
        this.f40463a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo70235b() {
        this.f40463a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m42497c();
        if (c != this.f40467e) {
            this.f40467e = c;
            ((bu1) this.f40466d).mo66122a(c);
        }
    }
}
