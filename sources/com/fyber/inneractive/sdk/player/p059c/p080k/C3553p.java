package com.fyber.inneractive.sdk.player.p059c.p080k;

import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.p */
public final class C3553p {

    /* renamed from: a */
    public static final Comparator<C3556a> f9636a = new Comparator<C3556a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C3556a) obj).f9645a - ((C3556a) obj2).f9645a;
        }
    };

    /* renamed from: b */
    public static final Comparator<C3556a> f9637b = new Comparator<C3556a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C3556a aVar = (C3556a) obj;
            C3556a aVar2 = (C3556a) obj2;
            if (aVar.f9647c < aVar2.f9647c) {
                return -1;
            }
            return aVar2.f9647c < aVar.f9647c ? 1 : 0;
        }
    };

    /* renamed from: c */
    public final int f9638c = 2000;

    /* renamed from: d */
    public final ArrayList<C3556a> f9639d = new ArrayList<>();

    /* renamed from: e */
    public final C3556a[] f9640e = new C3556a[5];

    /* renamed from: f */
    public int f9641f = -1;

    /* renamed from: g */
    public int f9642g;

    /* renamed from: h */
    public int f9643h;

    /* renamed from: i */
    public int f9644i;

    /* renamed from: com.fyber.inneractive.sdk.player.c.k.p$a */
    private static class C3556a {

        /* renamed from: a */
        public int f9645a;

        /* renamed from: b */
        public int f9646b;

        /* renamed from: c */
        public float f9647c;

        private C3556a() {
        }

        public /* synthetic */ C3556a(byte b) {
            this();
        }
    }
}
