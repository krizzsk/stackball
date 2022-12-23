package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: com.inmobi.media.ek */
/* compiled from: NativeScrollableContainer */
public abstract class C5177ek extends FrameLayout {

    /* renamed from: a */
    private final byte f11896a;

    /* renamed from: com.inmobi.media.ek$a */
    /* compiled from: NativeScrollableContainer */
    interface C5178a {
        /* renamed from: a */
        int mo40455a(int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo40473a(C5012bh bhVar, C5179el elVar, int i, int i2, C5178a aVar);

    public C5177ek(Context context, byte b) {
        super(context);
        this.f11896a = b;
    }

    public final byte getType() {
        return this.f11896a;
    }
}
