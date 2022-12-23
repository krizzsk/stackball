package com.flurry.sdk;

import android.content.Context;
import java.util.Map;

/* renamed from: com.flurry.sdk.bq */
public class C2449bq implements C2534df {
    /* renamed from: a */
    public static synchronized C2449bq m5261a() {
        C2449bq bqVar;
        Class<C2449bq> cls = C2449bq.class;
        synchronized (cls) {
            bqVar = (C2449bq) C2494ck.m5371a().mo17682a((Class<? extends C2534df>) cls);
        }
        return bqVar;
    }

    public void init(Context context) {
        C2595eb.m5632a((Class<?>) C2486ch.class);
        C2511cw.m5419a();
        C2611eg.m5674a();
        C2496cm.m5384a();
        C2468by.m5319a();
        C2451bs.m5276a();
        C2472bz.m5328a();
        C2464bw.m5304a();
        C2476cb.m5335a();
        C2463bv.m5299a();
        C2485cg.m5355a();
    }

    public void destroy() {
        C2485cg.m5356b();
        C2463bv.f5741a = null;
        C2476cb.m5338b();
        C2451bs.m5280b();
        C2464bw.m5306b();
        C2472bz.m5329b();
        C2468by.m5322b();
        C2496cm.m5385b();
        C2611eg.m5675b();
        C2511cw.m5421b();
        C2595eb.m5633b(C2486ch.class);
    }

    /* renamed from: b */
    public static String m5264b() {
        C2486ch c = m5265c();
        if (c != null) {
            return Long.toString(c.f5815b);
        }
        return null;
    }

    /* renamed from: c */
    public static C2486ch m5265c() {
        return m5262a(C2599ed.m5642a().mo17813f());
    }

    /* renamed from: a */
    private static C2486ch m5262a(C2595eb ebVar) {
        if (ebVar == null) {
            return null;
        }
        return (C2486ch) ebVar.mo17802c(C2486ch.class);
    }

    /* renamed from: d */
    public static long m5266d() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.f5815b;
        }
        return 0;
    }

    /* renamed from: e */
    public static long m5267e() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.f5816c;
        }
        return 0;
    }

    /* renamed from: f */
    public static long m5268f() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.f5817d;
        }
        return -1;
    }

    /* renamed from: g */
    public static long m5269g() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.mo17675b();
        }
        return 0;
    }

    /* renamed from: h */
    public static long m5270h() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.f5818e;
        }
        return 0;
    }

    /* renamed from: i */
    public static String m5271i() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.mo17677c();
        }
        return null;
    }

    /* renamed from: a */
    public static void m5263a(String str) {
        C2486ch c = m5265c();
        if (c != null) {
            c.mo17673a(str);
        }
    }

    /* renamed from: j */
    public static String m5272j() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.mo17678d();
        }
        return null;
    }

    /* renamed from: k */
    public static Map<String, String> m5273k() {
        C2486ch c = m5265c();
        if (c != null) {
            return c.mo17679e();
        }
        return null;
    }

    /* renamed from: l */
    public static int m5274l() {
        return C2468by.m5319a().mo17662c();
    }
}
