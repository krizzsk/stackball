package com.flurry.sdk;

import com.flurry.sdk.C2612eh;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.eb */
public class C2595eb implements C2612eh.C2613a {

    /* renamed from: c */
    private static final List<Class<?>> f6073c = new ArrayList();

    /* renamed from: a */
    long f6074a;

    /* renamed from: b */
    final Object f6075b = new Object();

    /* renamed from: d */
    private final String f6076d = C2595eb.class.getSimpleName();

    /* renamed from: e */
    private final Map<Class<?>, Object> f6077e = new LinkedHashMap();

    /* renamed from: f */
    private volatile int f6078f = C2596a.f6079a;

    /* renamed from: a */
    public boolean mo17798a() {
        return false;
    }

    public C2595eb() {
        ArrayList<Class> arrayList;
        synchronized (f6073c) {
            arrayList = new ArrayList<>(f6073c);
        }
        for (Class cls : arrayList) {
            try {
                Object newInstance = cls.newInstance();
                synchronized (this.f6077e) {
                    this.f6077e.put(cls, newInstance);
                }
            } catch (Exception e) {
                String str = this.f6076d;
                C2530db.m5475a(5, str, "Module data " + cls + " is not available:", e);
            }
        }
        C2611eg a = C2611eg.m5674a();
        this.f6074a = ((Long) a.mo17819a("ContinueSessionMillis")).longValue();
        a.mo17820a("ContinueSessionMillis", (C2612eh.C2613a) this);
        String str2 = this.f6076d;
        C2530db.m5474a(4, str2, "initSettings, ContinueSessionMillis = " + this.f6074a);
    }

    /* renamed from: a */
    public static void m5632a(Class<?> cls) {
        synchronized (f6073c) {
            f6073c.add(cls);
        }
    }

    /* renamed from: b */
    public static void m5633b(Class<?> cls) {
        synchronized (f6073c) {
            f6073c.remove(cls);
        }
    }

    /* renamed from: c */
    public final Object mo17802c(Class<?> cls) {
        Object obj;
        synchronized (this.f6077e) {
            obj = this.f6077e.get(cls);
        }
        return obj;
    }

    /* renamed from: b */
    public long mo17799b() {
        return this.f6074a;
    }

    /* renamed from: a */
    public final void mo17800a(int i) {
        synchronized (this.f6075b) {
            this.f6078f = i;
        }
    }

    /* renamed from: c */
    public final int mo17801c() {
        int i;
        synchronized (this.f6075b) {
            i = this.f6078f;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo17569a(String str, Object obj) {
        if (str.equals("ContinueSessionMillis")) {
            this.f6074a = ((Long) obj).longValue();
            String str2 = this.f6076d;
            C2530db.m5474a(4, str2, "onSettingUpdate, ContinueSessionMillis = " + this.f6074a);
            return;
        }
        C2530db.m5474a(6, this.f6076d, "onSettingUpdate internal error!");
    }

    /* renamed from: com.flurry.sdk.eb$a */
    public enum C2596a {
        ;
        

        /* renamed from: a */
        public static final int f6079a = 1;

        /* renamed from: b */
        public static final int f6080b = 2;

        /* renamed from: c */
        public static final int f6081c = 3;

        static {
            f6082d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m5640a() {
            return (int[]) f6082d.clone();
        }
    }
}
