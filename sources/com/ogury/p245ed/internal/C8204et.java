package com.ogury.p245ed.internal;

import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.Serializable;

/* renamed from: com.ogury.ed.internal.et */
public final class C8204et implements Serializable {

    /* renamed from: a */
    private boolean f21246a;

    /* renamed from: b */
    private int f21247b = 200;

    /* renamed from: c */
    private int f21248c = ErrorCode.GENERAL_WRAPPER_ERROR;

    /* renamed from: a */
    public final void mo53433a(boolean z) {
        this.f21246a = z;
    }

    /* renamed from: a */
    public final boolean mo53434a() {
        return this.f21246a;
    }

    /* renamed from: a */
    public final void mo53432a(int i) {
        this.f21247b = i;
    }

    /* renamed from: b */
    public final int mo53435b() {
        return this.f21247b;
    }

    /* renamed from: b */
    public final void mo53436b(int i) {
        this.f21248c = i;
    }

    /* renamed from: c */
    public final int mo53437c() {
        return this.f21248c;
    }
}
