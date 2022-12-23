package com.yandex.metrica.impl.p265ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.e3 */
public final class C11173e3 extends Location {

    /* renamed from: a */
    private final String f26763a;

    private C11173e3(Location location, String str) {
        super(location);
        this.f26763a = str;
    }

    /* renamed from: b */
    public static C11173e3 m28813b(Location location) {
        return new C11173e3(new Location(location), "");
    }

    /* renamed from: a */
    public String mo62805a() {
        return this.f26763a;
    }

    /* renamed from: a */
    public static C11173e3 m28812a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C11173e3(location2, provider);
    }
}
