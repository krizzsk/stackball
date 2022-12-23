package com.inmobi.media;

import android.util.Base64;
import com.inmobi.media.C5239ey;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gc */
/* compiled from: NetworkRequest */
public class C5299gc {

    /* renamed from: a */
    private static final String f12122a = C5299gc.class.getSimpleName();

    /* renamed from: b */
    private String f12123b;

    /* renamed from: c */
    private C5361hu f12124c;

    /* renamed from: d */
    private byte[] f12125d;

    /* renamed from: e */
    private byte[] f12126e;

    /* renamed from: f */
    private boolean f12127f;

    /* renamed from: g */
    protected Map<String, String> f12128g;

    /* renamed from: h */
    protected Map<String, String> f12129h;

    /* renamed from: i */
    protected Map<String, String> f12130i;

    /* renamed from: j */
    String f12131j;

    /* renamed from: k */
    public int f12132k;

    /* renamed from: l */
    public int f12133l;

    /* renamed from: m */
    public boolean f12134m;

    /* renamed from: n */
    boolean f12135n;

    /* renamed from: o */
    public boolean f12136o;

    /* renamed from: p */
    long f12137p;

    /* renamed from: q */
    boolean f12138q;

    /* renamed from: r */
    public byte f12139r;

    /* renamed from: s */
    public boolean f12140s;

    /* renamed from: t */
    protected String f12141t;

    /* renamed from: u */
    public boolean f12142u;

    /* renamed from: v */
    private C5260fj f12143v;

    public C5299gc(String str, String str2, C5361hu huVar) {
        this(str, str2, false, huVar, false, (byte) 0);
    }

    public C5299gc(String str, String str2) {
        this(str, str2, false, (C5361hu) null, false, (byte) 0);
        this.f12127f = false;
    }

    public C5299gc(String str, String str2, C5361hu huVar, byte b) {
        this(str, str2, true, huVar, false, b);
    }

    public C5299gc(String str, String str2, boolean z, C5361hu huVar, boolean z2, byte b) {
        this.f12128g = new HashMap();
        this.f12132k = 60000;
        this.f12133l = 60000;
        this.f12134m = true;
        this.f12136o = true;
        this.f12137p = -1;
        this.f12139r = 0;
        this.f12127f = true;
        this.f12140s = false;
        this.f12141t = C5314go.m12211f();
        this.f12142u = true;
        this.f12131j = str;
        this.f12123b = str2;
        this.f12135n = z;
        this.f12124c = huVar;
        this.f12128g.put("User-Agent", C5314go.m12216i());
        this.f12138q = z2;
        this.f12139r = b;
        if ("GET".equals(str)) {
            this.f12129h = new HashMap();
        } else if ("POST".equals(str)) {
            this.f12130i = new HashMap();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C5260fj mo40617c() {
        if (this.f12143v == null) {
            this.f12143v = (C5260fj) C5239ey.m11987a("pk", this.f12141t, (C5239ey.C5242c) null);
        }
        return this.f12143v;
    }

    /* renamed from: d */
    public final boolean mo40619d() {
        return this.f12137p != -1;
    }

    /* renamed from: a */
    public final void mo40614a(Map<String, String> map) {
        if (map != null) {
            this.f12128g.putAll(map);
        }
    }

    /* renamed from: b */
    public final void mo40616b(Map<String, String> map) {
        if (map != null) {
            this.f12129h.putAll(map);
        }
    }

    /* renamed from: c */
    public final void mo40618c(Map<String, String> map) {
        this.f12130i.putAll(map);
    }

    /* renamed from: e */
    public final Map<String, String> mo40620e() {
        C5328gx.m12273a(this.f12128g);
        return this.f12128g;
    }

    /* renamed from: f */
    public final String mo40621f() {
        String b;
        String str = this.f12123b;
        if (this.f12129h == null || (b = mo40575b()) == null || b.trim().length() == 0) {
            return str;
        }
        if (!str.contains("?")) {
            str = str + "?";
        }
        if (!str.endsWith("&") && !str.endsWith("?")) {
            str = str + "&";
        }
        return str + b;
    }

    /* renamed from: a */
    public void mo40207a() {
        JSONObject b;
        C5346hh.m12350g();
        boolean z = true;
        if (this.f12139r != 1) {
            z = false;
        }
        this.f12139r = C5346hh.m12341a(z);
        if (this.f12136o) {
            if ("GET".equals(this.f12131j)) {
                m12125d(this.f12129h);
            } else if ("POST".equals(this.f12131j)) {
                m12125d(this.f12130i);
            }
        }
        if (this.f12127f && (b = C5346hh.m12344b()) != null) {
            if ("GET".equals(this.f12131j)) {
                this.f12129h.put("consentObject", b.toString());
            } else if ("POST".equals(this.f12131j)) {
                this.f12130i.put("consentObject", b.toString());
            }
        }
        if (!this.f12142u) {
            return;
        }
        if ("GET".equals(this.f12131j)) {
            this.f12129h.put("u-appsecure", Byte.toString(C5340hd.m12324a().f12232d));
        } else if ("POST".equals(this.f12131j)) {
            this.f12130i.put("u-appsecure", Byte.toString(C5340hd.m12324a().f12232d));
        }
    }

    /* renamed from: b */
    private String mo40575b() {
        C5328gx.m12273a(this.f12129h);
        return C5328gx.m12269a(this.f12129h, "&");
    }

    /* renamed from: g */
    public final String mo40622g() {
        C5328gx.m12273a(this.f12130i);
        String a = C5328gx.m12269a(this.f12130i, "&");
        if (!this.f12135n) {
            return a;
        }
        this.f12125d = C5339hc.m12316a(16);
        byte[] a2 = C5339hc.m12315a();
        this.f12126e = a2;
        byte[] bArr = this.f12125d;
        C5260fj c = mo40617c();
        byte[] a3 = C5339hc.m12316a(8);
        HashMap hashMap = new HashMap();
        hashMap.put("sm", C5339hc.m12314a(a, a2, bArr, a3, c.f12042m, c.f12041e));
        hashMap.put("sn", c.ver);
        return C5328gx.m12269a((Map<String, String>) hashMap, "&");
    }

    /* renamed from: d */
    private void m12125d(Map<String, String> map) {
        map.putAll(C5340hd.m12324a().f12231c);
        map.putAll(C5342he.m12328a(this.f12140s));
        map.putAll(C5347hi.m12352a());
        C5361hu huVar = this.f12124c;
        if (huVar != null) {
            map.putAll(huVar.mo40722a());
        }
    }

    /* renamed from: a */
    public final byte[] mo40615a(byte[] bArr) {
        try {
            return C5339hc.m12320a(Base64.decode(bArr, 0), this.f12126e, this.f12125d);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final long mo40623h() {
        try {
            if ("GET".equals(this.f12131j)) {
                return 0 + ((long) mo40575b().length());
            }
            if ("POST".equals(this.f12131j)) {
                return ((long) mo40622g().length()) + 0;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
