package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import java.io.Serializable;

/* renamed from: com.yandex.mobile.ads.banner.f */
public abstract class C12079f implements Serializable {
    private static final long serialVersionUID = -7571518881522543353L;

    /* renamed from: b */
    private final SizeInfo f29058b;

    protected C12079f(int i, int i2, SizeInfo.C12090b bVar) {
        this.f29058b = new SizeInfo(i, i2, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SizeInfo mo64390a() {
        return this.f29058b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f29058b.equals(((C12079f) obj).f29058b);
    }

    public int getHeight() {
        return this.f29058b.mo64490c();
    }

    public int getHeightInPixels(Context context) {
        return this.f29058b.mo64489b(context);
    }

    public int getWidth() {
        return this.f29058b.mo64495e();
    }

    public int getWidthInPixels(Context context) {
        return this.f29058b.mo64492d(context);
    }

    public int hashCode() {
        return this.f29058b.hashCode();
    }

    public String toString() {
        return this.f29058b.toString();
    }

    public int getHeight(Context context) {
        return this.f29058b.mo64488a(context);
    }

    public int getWidth(Context context) {
        return this.f29058b.mo64491c(context);
    }
}
