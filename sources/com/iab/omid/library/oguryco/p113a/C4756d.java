package com.iab.omid.library.oguryco.p113a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.oguryco.a.d */
public final class C4756d extends ContentObserver {

    /* renamed from: a */
    private final Context f10702a;

    /* renamed from: b */
    private final AudioManager f10703b;

    /* renamed from: c */
    private final C4753a f10704c;

    /* renamed from: d */
    private final C4755c f10705d;

    /* renamed from: e */
    private float f10706e;

    public C4756d(Handler handler, Context context, C4753a aVar, C4755c cVar) {
        super(handler);
        this.f10702a = context;
        this.f10703b = (AudioManager) context.getSystemService("audio");
        this.f10704c = aVar;
        this.f10705d = cVar;
    }

    /* renamed from: a */
    private boolean m10371a(float f) {
        return f != this.f10706e;
    }

    /* renamed from: c */
    private float m10372c() {
        return this.f10704c.mo39234a(this.f10703b.getStreamVolume(3), this.f10703b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m10373d() {
        this.f10705d.mo39236a(this.f10706e);
    }

    /* renamed from: a */
    public final void mo39237a() {
        this.f10706e = m10372c();
        m10373d();
        this.f10702a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo39238b() {
        this.f10702a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m10372c();
        if (m10371a(c)) {
            this.f10706e = c;
            m10373d();
        }
    }
}
