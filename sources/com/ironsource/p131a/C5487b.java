package com.ironsource.p131a;

import android.net.Uri;
import android.util.Log;
import com.ironsource.p133c.C5500b;
import com.ironsource.p133c.C5503c;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.a.b */
public final class C5487b {

    /* renamed from: a */
    C5485a f12645a;

    /* renamed from: b */
    private C5489c f12646b;

    /* renamed from: c */
    private C5490d f12647c;

    /* renamed from: d */
    private ExecutorService f12648d;

    public C5487b(C5485a aVar, C5489c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        } else if (aVar.f12636d != null) {
            this.f12645a = aVar;
            this.f12646b = cVar;
            this.f12647c = aVar.f12636d;
            this.f12648d = Executors.newSingleThreadExecutor();
        } else {
            throw new InvalidParameterException("Null formatter not supported ");
        }
    }

    /* renamed from: a */
    private static void m13030a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41097a(String str) {
        if (this.f12645a.f12637e) {
            Log.d("EventsTracker", str);
        }
    }

    /* renamed from: a */
    public final void mo41098a(String str, Map<String, Object> map) {
        mo41097a(String.format(Locale.ENGLISH, "%s %s", new Object[]{str, map.toString()}));
        if (this.f12645a.f12634b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            m13030a((Map<String, Object>) hashMap, this.f12646b.mo41100a());
            m13030a((Map<String, Object>) hashMap, map);
            final String a = this.f12647c.mo41101a(hashMap);
            this.f12648d.submit(new Runnable() {
                public final void run() {
                    try {
                        C5503c cVar = new C5503c();
                        ArrayList arrayList = new ArrayList(C5487b.this.f12645a.f12638f);
                        if ("POST".equals(C5487b.this.f12645a.f12635c)) {
                            cVar = C5500b.m13053a(C5487b.this.f12645a.f12633a, a, arrayList);
                        } else if ("GET".equals(C5487b.this.f12645a.f12635c)) {
                            String str = C5487b.this.f12645a.f12633a;
                            String str2 = a;
                            Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                            C5500b.C5501a.C5502a aVar = new C5500b.C5501a.C5502a();
                            aVar.f12669b = build.toString();
                            aVar.f12671d = str2;
                            aVar.f12670c = "GET";
                            aVar.mo41213a(arrayList);
                            cVar = C5500b.m13052a(aVar.mo41214a());
                        }
                        C5487b bVar = C5487b.this;
                        bVar.mo41097a("response status code: " + cVar.f12675a);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
