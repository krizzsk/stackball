package com.iab.omid.library.ironsrc.p107a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.ironsrc.a.d */
public final class C4706d extends ContentObserver {

    /* renamed from: a */
    private final Context f10588a;

    /* renamed from: b */
    private final AudioManager f10589b;

    /* renamed from: c */
    private final C4703a f10590c;

    /* renamed from: d */
    private final C4705c f10591d;

    /* renamed from: e */
    private float f10592e;

    public C4706d(Handler handler, Context context, C4703a aVar, C4705c cVar) {
        super(handler);
        this.f10588a = context;
        this.f10589b = (AudioManager) context.getSystemService("audio");
        this.f10590c = aVar;
        this.f10591d = cVar;
    }

    /* renamed from: a */
    private boolean m10150a(float f) {
        return f != this.f10592e;
    }

    /* renamed from: c */
    private float m10151c() {
        return this.f10590c.mo39048a(this.f10589b.getStreamVolume(3), this.f10589b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m10152d() {
        this.f10591d.mo39050a(this.f10592e);
    }

    /* renamed from: a */
    public final void mo39051a() {
        this.f10592e = m10151c();
        m10152d();
        this.f10588a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo39052b() {
        this.f10588a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m10151c();
        if (m10150a(c)) {
            this.f10592e = c;
            m10152d();
        }
    }
}
