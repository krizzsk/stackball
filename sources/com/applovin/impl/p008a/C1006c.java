package com.applovin.impl.p008a;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.impl.sdk.utils.C1560t;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.c */
public class C1006c {

    /* renamed from: c */
    private static final List<String> f1669c = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp", MimeTypes.VIDEO_MATROSKA});

    /* renamed from: a */
    protected List<C1560t> f1670a = new ArrayList();

    /* renamed from: b */
    private final C1469j f1671b;

    /* renamed from: d */
    private final JSONObject f1672d;

    /* renamed from: e */
    private final JSONObject f1673e;

    /* renamed from: f */
    private final C1346b f1674f;

    /* renamed from: g */
    private final long f1675g = System.currentTimeMillis();

    public C1006c(JSONObject jSONObject, JSONObject jSONObject2, C1346b bVar, C1469j jVar) {
        this.f1671b = jVar;
        this.f1672d = jSONObject;
        this.f1673e = jSONObject2;
        this.f1674f = bVar;
    }

    /* renamed from: a */
    public int mo11701a() {
        return this.f1670a.size();
    }

    /* renamed from: b */
    public List<C1560t> mo11702b() {
        return this.f1670a;
    }

    /* renamed from: c */
    public JSONObject mo11703c() {
        return this.f1672d;
    }

    /* renamed from: d */
    public JSONObject mo11704d() {
        return this.f1673e;
    }

    /* renamed from: e */
    public C1346b mo11705e() {
        return this.f1674f;
    }

    /* renamed from: f */
    public long mo11706f() {
        return this.f1675g;
    }

    /* renamed from: g */
    public C1349d mo11707g() {
        String b = C1521i.m3487b(this.f1673e, "zone_id", (String) null, this.f1671b);
        return C1349d.m2453a(AppLovinAdSize.fromString(C1521i.m3487b(this.f1673e, "ad_size", (String) null, this.f1671b)), AppLovinAdType.fromString(C1521i.m3487b(this.f1673e, "ad_type", (String) null, this.f1671b)), b, this.f1671b);
    }

    /* renamed from: h */
    public List<String> mo11708h() {
        List<String> a = C1517e.m3423a(C1521i.m3487b(this.f1672d, "vast_preferred_video_types", (String) null, (C1469j) null));
        return !a.isEmpty() ? a : f1669c;
    }

    /* renamed from: i */
    public int mo11709i() {
        return C1557r.m3577a(this.f1672d);
    }
}
