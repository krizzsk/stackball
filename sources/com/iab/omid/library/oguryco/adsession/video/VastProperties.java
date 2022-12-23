package com.iab.omid.library.oguryco.adsession.video;

import com.iab.omid.library.oguryco.adsession.media.Position;
import com.iab.omid.library.oguryco.p116d.C4780e;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10722a;

    /* renamed from: b */
    private final Float f10723b;

    /* renamed from: c */
    private final boolean f10724c;

    /* renamed from: d */
    private final Position f10725d;

    /* renamed from: e */
    private com.iab.omid.library.oguryco.adsession.media.VastProperties f10726e;

    private VastProperties(boolean z, Float f, boolean z2, Position position, com.iab.omid.library.oguryco.adsession.media.VastProperties vastProperties) {
        this.f10722a = z;
        this.f10723b = f;
        this.f10724c = z2;
        this.f10725d = position;
        this.f10726e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z, Position position) {
        C4780e.m10497a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position, com.iab.omid.library.oguryco.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z, Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f, boolean z, Position position) {
        C4780e.m10497a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position, com.iab.omid.library.oguryco.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, z, Position.valueOf(position.toString().toUpperCase())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final com.iab.omid.library.oguryco.adsession.media.VastProperties mo39311a() {
        return this.f10726e;
    }

    public final Position getPosition() {
        return this.f10725d;
    }

    public final Float getSkipOffset() {
        return this.f10723b;
    }

    public final boolean isAutoPlay() {
        return this.f10724c;
    }

    public final boolean isSkippable() {
        return this.f10722a;
    }
}
