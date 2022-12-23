package com.iab.omid.library.smaato.p119a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.smaato.a.d */
public final class C4807d extends ContentObserver {

    /* renamed from: a */
    private final Context f10823a;

    /* renamed from: b */
    private final AudioManager f10824b;

    /* renamed from: c */
    private final C4804a f10825c;

    /* renamed from: d */
    private final C4806c f10826d;

    /* renamed from: e */
    private float f10827e;

    public C4807d(Handler handler, Context context, C4804a aVar, C4806c cVar) {
        super(handler);
        this.f10823a = context;
        this.f10824b = (AudioManager) context.getSystemService("audio");
        this.f10825c = aVar;
        this.f10826d = cVar;
    }

    /* renamed from: a */
    private boolean m10606a(float f) {
        return f != this.f10827e;
    }

    /* renamed from: c */
    private float m10607c() {
        return this.f10825c.mo39453a(this.f10824b.getStreamVolume(3), this.f10824b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m10608d() {
        this.f10826d.mo39455a(this.f10827e);
    }

    /* renamed from: a */
    public final void mo39456a() {
        this.f10827e = m10607c();
        m10608d();
        this.f10823a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo39457b() {
        this.f10823a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m10607c();
        if (m10606a(c)) {
            this.f10827e = c;
            m10608d();
        }
    }
}
