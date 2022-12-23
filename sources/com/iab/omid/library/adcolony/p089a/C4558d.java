package com.iab.omid.library.adcolony.p089a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.adcolony.a.d */
public final class C4558d extends ContentObserver {

    /* renamed from: a */
    private final Context f10222a;

    /* renamed from: b */
    private final AudioManager f10223b;

    /* renamed from: c */
    private final C4555a f10224c;

    /* renamed from: d */
    private final C4557c f10225d;

    /* renamed from: e */
    private float f10226e;

    public C4558d(Handler handler, Context context, C4555a aVar, C4557c cVar) {
        super(handler);
        this.f10222a = context;
        this.f10223b = (AudioManager) context.getSystemService("audio");
        this.f10224c = aVar;
        this.f10225d = cVar;
    }

    /* renamed from: a */
    private boolean m9493a(float f) {
        return f != this.f10226e;
    }

    /* renamed from: c */
    private float m9494c() {
        return this.f10224c.mo38502a(this.f10223b.getStreamVolume(3), this.f10223b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m9495d() {
        this.f10225d.mo38504a(this.f10226e);
    }

    /* renamed from: a */
    public void mo38505a() {
        this.f10226e = m9494c();
        m9495d();
        this.f10222a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo38506b() {
        this.f10222a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m9494c();
        if (m9493a(c)) {
            this.f10226e = c;
            m9495d();
        }
    }
}
