package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;

public class xj0 {

    /* renamed from: a */
    private final tj0 f42573a = new tj0();

    /* renamed from: a */
    public Location mo70907a(List<Location> list) {
        Location location = null;
        for (Location next : list) {
            if (this.f42573a.mo70189b(next, location)) {
                location = next;
            }
        }
        return location;
    }
}
