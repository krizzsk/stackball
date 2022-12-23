package com.tapjoy.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.tapjoy.internal.cp */
public final class C9135cp extends ContentObserver {

    /* renamed from: a */
    public final Context f22449a;

    /* renamed from: b */
    public float f22450b;

    /* renamed from: c */
    private final AudioManager f22451c;

    /* renamed from: d */
    private final C9132cm f22452d;

    /* renamed from: e */
    private final C9134co f22453e;

    public C9135cp(Handler handler, Context context, C9132cm cmVar, C9134co coVar) {
        super(handler);
        this.f22449a = context;
        this.f22451c = (AudioManager) context.getSystemService("audio");
        this.f22452d = cmVar;
        this.f22453e = coVar;
    }

    /* renamed from: a */
    public final float mo57921a() {
        int streamVolume = this.f22451c.getStreamVolume(3);
        int streamMaxVolume = this.f22451c.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: b */
    public final void mo57922b() {
        this.f22453e.mo57920a(this.f22450b);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float a = mo57921a();
        if (a != this.f22450b) {
            this.f22450b = a;
            mo57922b();
        }
    }
}
