package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;

/* renamed from: com.inmobi.media.c */
/* compiled from: BannerRefreshHandler */
public final class C5040c extends Handler {

    /* renamed from: a */
    private static final String f11506a = C5040c.class.getSimpleName();

    /* renamed from: b */
    private InMobiBanner f11507b;

    public C5040c(InMobiBanner inMobiBanner) {
        this.f11507b = inMobiBanner;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            return;
        }
        InMobiBanner inMobiBanner = this.f11507b;
        inMobiBanner.mo39811a((PublisherCallbacks) inMobiBanner.f11044e, true);
    }
}
