package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bf */
/* compiled from: NativeAsset */
public class C5010bf {

    /* renamed from: z */
    private static final String f11358z = C5010bf.class.getSimpleName();

    /* renamed from: a */
    String f11359a;

    /* renamed from: b */
    public String f11360b;

    /* renamed from: c */
    public C5011bg f11361c;

    /* renamed from: d */
    public String f11362d;

    /* renamed from: e */
    public Object f11363e;

    /* renamed from: f */
    JSONObject f11364f;

    /* renamed from: g */
    String f11365g;

    /* renamed from: h */
    public boolean f11366h;

    /* renamed from: i */
    public byte f11367i;

    /* renamed from: j */
    public String f11368j;

    /* renamed from: k */
    public byte f11369k;

    /* renamed from: l */
    public byte f11370l;

    /* renamed from: m */
    public byte f11371m;

    /* renamed from: n */
    byte f11372n;

    /* renamed from: o */
    public int f11373o;

    /* renamed from: p */
    public int f11374p;

    /* renamed from: q */
    String f11375q;

    /* renamed from: r */
    public String f11376r;

    /* renamed from: s */
    public String f11377s;

    /* renamed from: t */
    public C5010bf f11378t;

    /* renamed from: u */
    public List<C5030br> f11379u;

    /* renamed from: v */
    public Map<String, Object> f11380v;

    /* renamed from: w */
    public Object f11381w;

    /* renamed from: x */
    public int f11382x;

    /* renamed from: y */
    public C5010bf f11383y;

    public C5010bf() {
        this("", "root", "CONTAINER", new C5011bg());
    }

    public C5010bf(String str, String str2, String str3, C5011bg bgVar) {
        this(str, str2, str3, bgVar, new LinkedList());
    }

    public C5010bf(String str, String str2, String str3, C5011bg bgVar, List<C5030br> list) {
        this.f11359a = str;
        this.f11362d = str2;
        this.f11360b = str3;
        this.f11361c = bgVar;
        this.f11363e = null;
        this.f11365g = "";
        this.f11366h = false;
        this.f11367i = 0;
        this.f11368j = "";
        this.f11370l = 0;
        this.f11369k = 0;
        this.f11371m = 0;
        this.f11372n = 2;
        this.f11382x = 0;
        this.f11373o = -1;
        this.f11375q = "";
        this.f11376r = "";
        this.f11364f = new JSONObject();
        LinkedList linkedList = new LinkedList();
        this.f11379u = linkedList;
        linkedList.addAll(list);
        this.f11380v = new HashMap();
    }

    /* renamed from: a */
    public final void mo40163a(String str, Map<String, String> map) {
        if (this.f11379u.size() != 0) {
            for (C5030br next : this.f11379u) {
                if (str.equals(next.f11469d)) {
                    m11373a(next, map);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40164a(List<C5030br> list) {
        this.f11379u.addAll(list);
    }

    /* renamed from: a */
    public final void mo40162a(String str) {
        this.f11376r = str.trim();
    }

    /* renamed from: b */
    public final void mo40165b(String str) {
        this.f11377s = str.trim();
    }

    /* renamed from: a */
    public static void m11373a(C5030br brVar, Map<String, String> map) {
        C4983ax.m11340a().mo40133a(C5328gx.m12268a(brVar.f11467b, map), brVar.f11470e, true);
    }
}
