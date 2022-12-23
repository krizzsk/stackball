package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import com.inmobi.media.C5220ev;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.dt */
/* compiled from: OmidServiceJsFetcher */
public class C5134dt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11787a = C5134dt.class.getSimpleName();

    /* renamed from: a */
    public static void m11737a(final C5220ev.C5229f fVar) {
        String str = fVar.url;
        final int i = fVar.maxRetries;
        final int i2 = fVar.retryInterval;
        if (str != null) {
            final C5299gc gcVar = new C5299gc("GET", str);
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            gcVar.f12142u = false;
            gcVar.f12136o = false;
            gcVar.mo40614a((Map<String, String>) hashMap);
            new Thread(new Runnable() {
                public final void run() {
                    if (C5134dt.m11738b(fVar)) {
                        int i = 0;
                        while (i <= i) {
                            String unused = C5134dt.f11787a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            C5300gd a = new C5301ge(gcVar).mo40629a();
                            try {
                                C5369hy.m12420a().mo40732a(gcVar.mo40623h());
                                C5369hy.m12420a().mo40733b(a.mo40628d());
                                C5369hy.m12420a().mo40734c(SystemClock.elapsedRealtime() - elapsedRealtime);
                            } catch (Exception unused2) {
                                String unused3 = C5134dt.f11787a;
                            }
                            Context c = C5314go.m12203c();
                            if (a.mo40624a()) {
                                String unused4 = C5134dt.f11787a;
                                i++;
                                if (i <= i) {
                                    try {
                                        Thread.sleep((long) (i2 * 1000));
                                    } catch (InterruptedException unused5) {
                                        String unused6 = C5134dt.f11787a;
                                    }
                                } else {
                                    return;
                                }
                            } else if (c != null) {
                                C5330gz gzVar = new C5330gz(c, "omid_js_store");
                                List list = a.f12147c.get(HttpHeaders.CONTENT_ENCODING);
                                if (list == null || !((String) list.get(0)).equals("gzip")) {
                                    gzVar.mo40679b("omid_js_string", a.mo40625b());
                                    String unused7 = C5134dt.f11787a;
                                    return;
                                }
                                String unused8 = C5134dt.f11787a;
                                byte[] a2 = C5328gx.m12276a(a.mo40627c());
                                if (a2 != null) {
                                    try {
                                        gzVar.mo40679b("omid_js_string", new String(a2, "UTF-8"));
                                        String unused9 = C5134dt.f11787a;
                                        return;
                                    } catch (UnsupportedEncodingException unused10) {
                                        String unused11 = C5134dt.f11787a;
                                        String unused12 = C5134dt.f11787a;
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }).start();
        }
    }

    /* renamed from: b */
    static /* synthetic */ boolean m11738b(C5220ev.C5229f fVar) {
        Context c = C5314go.m12203c();
        if (c == null) {
            return false;
        }
        return (System.currentTimeMillis() / 1000) - new C5330gz(c, "omid_js_store").mo40671a() > fVar.expiry;
    }
}
