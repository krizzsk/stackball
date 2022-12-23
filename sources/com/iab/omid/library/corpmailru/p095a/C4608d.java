package com.iab.omid.library.corpmailru.p095a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.corpmailru.a.d */
public final class C4608d extends ContentObserver {

    /* renamed from: a */
    private final Context f10373a;

    /* renamed from: b */
    private final AudioManager f10374b;

    /* renamed from: c */
    private final C4605a f10375c;

    /* renamed from: d */
    private final C4607c f10376d;

    /* renamed from: e */
    private float f10377e;

    public C4608d(Handler handler, Context context, C4605a aVar, C4607c cVar) {
        super(handler);
        this.f10373a = context;
        this.f10374b = (AudioManager) context.getSystemService("audio");
        this.f10375c = aVar;
        this.f10376d = cVar;
    }

    /* renamed from: a */
    private boolean m9716a(float f) {
        return f != this.f10377e;
    }

    /* renamed from: c */
    private float m9717c() {
        return this.f10375c.mo38688a(this.f10374b.getStreamVolume(3), this.f10374b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m9718d() {
        this.f10376d.mo38690a(this.f10377e);
    }

    /* renamed from: a */
    public void mo38691a() {
        this.f10377e = m9717c();
        m9718d();
        this.f10373a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo38692b() {
        this.f10373a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m9717c();
        if (m9716a(c)) {
            this.f10377e = c;
            m9718d();
        }
    }
}
