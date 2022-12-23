package com.tapjoy.internal;

import com.p243my.target.ads.Reward;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.C9321gj;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.fy */
public final class C9296fy extends C9321gj {

    /* renamed from: a */
    static final Map f22979a = Collections.unmodifiableMap(new HashMap());

    /* renamed from: c */
    private final C9321gj.C9322a f22980c = mo58208a("BuildConfig");

    /* renamed from: d */
    private final C9321gj.C9322a f22981d = mo58208a("ServerFinal");

    /* renamed from: e */
    private final C9321gj.C9322a f22982e;

    /* renamed from: f */
    private final C9321gj.C9322a f22983f;

    /* renamed from: g */
    private final C9321gj.C9322a f22984g;

    C9296fy() {
        C9321gj.C9322a a = mo58208a("AppRuntime");
        this.f22982e = a;
        a.f23066b = new ConcurrentHashMap();
        this.f22983f = mo58208a("ConnectFlags");
        this.f22984g = mo58208a("ServerDefault");
        C9321gj.C9322a a2 = mo58208a("SDKDefault");
        HashMap hashMap = new HashMap();
        hashMap.put("placement_request_content_retry_timeout", -1);
        hashMap.put("placement_request_content_retry_backoff", Arrays.asList(new Number[]{0L, 500L, Long.valueOf(TapjoyConstants.TIMER_INCREMENT), Double.valueOf(2.0d)}));
        a2.f23066b = hashMap;
    }

    /* renamed from: a */
    public final void mo58160a(@Nullable Map map) {
        Map map2;
        Map map3 = null;
        if (map != null) {
            map3 = (Map) map.get("final");
            map2 = (Map) map.get(Reward.DEFAULT);
        } else {
            map2 = null;
        }
        this.f22981d.f23066b = map3;
        this.f22984g.f23066b = map2;
        setChanged();
    }

    /* renamed from: a */
    public final void mo58159a(Hashtable hashtable) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : hashtable.entrySet()) {
            String str = (String) f22979a.get(entry.getKey());
            if (str == null) {
                str = (String) entry.getKey();
            }
            this.f22982e.f23066b.remove(str);
            hashMap.put(str, entry.getValue());
        }
        this.f22983f.f23066b = hashMap;
        setChanged();
    }
}
