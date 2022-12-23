package com.iab.omid.library.inmobi.p101a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.inmobi.a.d */
public final class C4658d extends ContentObserver {

    /* renamed from: a */
    private final Context f10486a;

    /* renamed from: b */
    private final AudioManager f10487b;

    /* renamed from: c */
    private final C4655a f10488c;

    /* renamed from: d */
    private final C4657c f10489d;

    /* renamed from: e */
    private float f10490e;

    public C4658d(Handler handler, Context context, C4655a aVar, C4657c cVar) {
        super(handler);
        this.f10486a = context;
        this.f10487b = (AudioManager) context.getSystemService("audio");
        this.f10488c = aVar;
        this.f10489d = cVar;
    }

    /* renamed from: a */
    private boolean m9946a(float f) {
        return f != this.f10490e;
    }

    /* renamed from: c */
    private float m9947c() {
        return this.f10488c.mo38887a(this.f10487b.getStreamVolume(3), this.f10487b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m9948d() {
        this.f10489d.mo38889a(this.f10490e);
    }

    /* renamed from: a */
    public final void mo38890a() {
        this.f10490e = m9947c();
        m9948d();
        this.f10486a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo38891b() {
        this.f10486a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m9947c();
        if (m9946a(c)) {
            this.f10490e = c;
            m9948d();
        }
    }
}
