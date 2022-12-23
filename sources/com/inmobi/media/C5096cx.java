package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.cx */
/* compiled from: TrackerAttr */
public final class C5096cx {

    /* renamed from: a */
    public byte f11686a;

    /* renamed from: b */
    public Map<String, Object> f11687b = new HashMap();

    public C5096cx(byte b) {
        this.f11686a = b;
    }

    /* renamed from: a */
    public final <T> T mo40364a(String str, Class<T> cls) {
        Object obj = this.f11687b.get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}
