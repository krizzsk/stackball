package com.iab.omid.library.vungle.p125a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.vungle.a.d */
public final class C4855d extends ContentObserver {

    /* renamed from: a */
    private final Context f10922a;

    /* renamed from: b */
    private final AudioManager f10923b;

    /* renamed from: c */
    private final C4852a f10924c;

    /* renamed from: d */
    private final C4854c f10925d;

    /* renamed from: e */
    private float f10926e;

    public C4855d(Handler handler, Context context, C4852a aVar, C4854c cVar) {
        super(handler);
        this.f10922a = context;
        this.f10923b = (AudioManager) context.getSystemService("audio");
        this.f10924c = aVar;
        this.f10925d = cVar;
    }

    /* renamed from: a */
    private boolean m10804a(float f) {
        return f != this.f10926e;
    }

    /* renamed from: c */
    private float m10805c() {
        return this.f10924c.mo39610a(this.f10923b.getStreamVolume(3), this.f10923b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m10806d() {
        this.f10925d.mo39612a(this.f10926e);
    }

    /* renamed from: a */
    public void mo39613a() {
        this.f10926e = m10805c();
        m10806d();
        this.f10922a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo39614b() {
        this.f10922a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m10805c();
        if (m10804a(c)) {
            this.f10926e = c;
            m10806d();
        }
    }
}
