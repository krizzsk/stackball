package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;

/* renamed from: com.inmobi.media.ho */
/* compiled from: ListRule */
public final class C5354ho<E> extends C5356hq<List<E>> {

    /* renamed from: a */
    private Class<E> f12270a;

    public C5354ho(Constructor<List<E>> constructor, Class<E> cls) {
        super(constructor);
        this.f12270a = cls;
    }

    /* renamed from: a */
    public final List<E> mo40712a() {
        return (List) this.f12272b.construct();
    }

    /* renamed from: b */
    public final Class<E> mo40713b() {
        return this.f12270a;
    }
}
