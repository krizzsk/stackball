package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import javax.annotation.Nullable;

public final class qe1 {

    /* renamed from: a */
    private final String f39094a;

    /* renamed from: b */
    private final String f39095b;
    @Nullable

    /* renamed from: c */
    private final VastTimeOffset f39096c;

    public qe1(String str, String str2, @Nullable VastTimeOffset vastTimeOffset) {
        this.f39094a = str;
        this.f39095b = str2;
        this.f39096c = vastTimeOffset;
    }

    /* renamed from: a */
    public String mo69585a() {
        return this.f39094a;
    }

    @Nullable
    /* renamed from: b */
    public VastTimeOffset mo69586b() {
        return this.f39096c;
    }

    /* renamed from: c */
    public String mo69587c() {
        return this.f39095b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qe1.class != obj.getClass()) {
            return false;
        }
        qe1 qe1 = (qe1) obj;
        if (!this.f39094a.equals(qe1.f39094a) || !this.f39095b.equals(qe1.f39095b)) {
            return false;
        }
        VastTimeOffset vastTimeOffset = this.f39096c;
        VastTimeOffset vastTimeOffset2 = qe1.f39096c;
        return vastTimeOffset == null ? vastTimeOffset2 == null : vastTimeOffset.equals(vastTimeOffset2);
    }

    public int hashCode() {
        int hashCode = ((this.f39094a.hashCode() * 31) + this.f39095b.hashCode()) * 31;
        VastTimeOffset vastTimeOffset = this.f39096c;
        return hashCode + (vastTimeOffset != null ? vastTimeOffset.hashCode() : 0);
    }
}
