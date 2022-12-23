package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzar {
    private final int zzcg;
    private final List<zzk> zzch;
    private final int zzci;
    private final InputStream zzcj;

    public zzar(int i, List<zzk> list) {
        this(i, list, -1, (InputStream) null);
    }

    public zzar(int i, List<zzk> list, int i2, InputStream inputStream) {
        this.zzcg = i;
        this.zzch = list;
        this.zzci = i2;
        this.zzcj = inputStream;
    }

    public final int getStatusCode() {
        return this.zzcg;
    }

    public final List<zzk> zzq() {
        return Collections.unmodifiableList(this.zzch);
    }

    public final int getContentLength() {
        return this.zzci;
    }

    public final InputStream getContent() {
        return this.zzcj;
    }
}
