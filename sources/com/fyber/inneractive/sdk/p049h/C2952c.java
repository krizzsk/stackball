package com.fyber.inneractive.sdk.p049h;

import android.os.Handler;
import android.os.HandlerThread;
import com.fyber.inneractive.sdk.util.C3627ah;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.h.c */
public final class C2952c implements C3627ah {

    /* renamed from: a */
    final BlockingQueue<JSONObject> f7102a = new LinkedBlockingQueue();

    /* renamed from: b */
    public final HandlerThread f7103b = new HandlerThread("EventCollectorHandlerThread", 0);

    /* renamed from: c */
    public Handler f7104c;

    /* renamed from: d */
    public int f7105d;

    /* renamed from: e */
    public boolean f7106e = false;

    /* renamed from: f */
    public boolean f7107f = false;

    /* renamed from: g */
    private JSONArray f7108g = new JSONArray();

    /* JADX WARNING: type inference failed for: r11v16, types: [org.json.JSONObject] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18413a(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 12312329(0xbbdf09, float:1.7253248E-38)
            if (r0 == r1) goto L_0x000e
            int r11 = r11.what
            r0 = 20150330(0x133783a, float:3.2963366E-38)
            if (r11 != r0) goto L_0x007c
        L_0x000e:
            boolean r11 = r10.f7106e
            if (r11 == 0) goto L_0x006b
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f7102a
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x006b
        L_0x001a:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f7102a
            int r11 = r11.size()
            r0 = 0
            if (r11 <= 0) goto L_0x0036
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f7102a     // Catch:{ all -> 0x002d }
            java.lang.Object r11 = r11.poll()     // Catch:{ all -> 0x002d }
            org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ all -> 0x002d }
            r0 = r11
            goto L_0x002e
        L_0x002d:
        L_0x002e:
            if (r0 == 0) goto L_0x001a
            org.json.JSONArray r11 = r10.f7108g
            r11.put(r0)
            goto L_0x001a
        L_0x0036:
            org.json.JSONArray r11 = r10.f7108g
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x006b
            org.json.JSONArray r5 = r10.f7108g
            java.lang.String r11 = com.fyber.inneractive.sdk.config.C2739a.m5957a()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x004d }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            if (r0 == 0) goto L_0x0064
            com.fyber.inneractive.sdk.h.ad r8 = new com.fyber.inneractive.sdk.h.ad
            com.fyber.inneractive.sdk.h.c$2 r9 = new com.fyber.inneractive.sdk.h.c$2
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r4, r5, r6)
            r8.<init>(r9, r11, r0)
            com.fyber.inneractive.sdk.h.s r11 = com.fyber.inneractive.sdk.config.IAConfigManager.m5937h()
            r11.mo18441a(r8)
        L_0x0064:
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            r10.f7108g = r11
        L_0x006b:
            android.os.Handler r11 = r10.f7104c
            if (r11 == 0) goto L_0x007c
            r11.removeMessages(r1)
            android.os.Handler r11 = r10.f7104c
            int r0 = r10.f7105d
            int r0 = r0 * 1000
            long r2 = (long) r0
            r11.sendEmptyMessageDelayed(r1, r2)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2952c.mo18413a(android.os.Message):void");
    }

    /* renamed from: a */
    public final void mo18412a() {
        Handler handler = this.f7104c;
        if (handler != null && handler.hasMessages(12312329)) {
            this.f7104c.removeMessages(12312329);
        }
    }

    /* renamed from: a */
    static JSONObject m6615a(C2959h hVar) {
        JSONObject jSONObject = new JSONObject();
        if (hVar != null) {
            Map<String, Object> map = hVar.f7120a;
            for (String next : map.keySet()) {
                Object obj = map.get(next);
                if (obj != null) {
                    try {
                        jSONObject.put(next, obj);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        String c = hVar != null ? hVar.mo18427c() : null;
        if (c != null) {
            int length = c.length();
            if (length > 51200) {
                int indexOf = c.indexOf("iawrapper");
                if (indexOf == -1) {
                    indexOf = 0;
                }
                c = c.substring(indexOf, 51199);
                IAlog.m9034b("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", c);
            } catch (JSONException e) {
                IAlog.m9032a("Failed inserting ad body to json", (Throwable) e, new Object[0]);
            }
        }
        if (IAlog.f9870a == IAlog.f9871b) {
            try {
                IAlog.m9030a(IAlog.f9871b, "%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
