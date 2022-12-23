package com.mbridge.msdk.foundation.entity;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.entity.c */
/* compiled from: ClickTime */
public final class C6193c {

    /* renamed from: a */
    private String f15278a;

    /* renamed from: b */
    private String f15279b;

    /* renamed from: c */
    private String f15280c;

    /* renamed from: d */
    private String f15281d;

    /* renamed from: e */
    private String f15282e;

    /* renamed from: f */
    private int f15283f;

    /* renamed from: g */
    private String f15284g;

    /* renamed from: h */
    private String f15285h;

    /* renamed from: i */
    private String f15286i;

    /* renamed from: j */
    private int f15287j;

    /* renamed from: k */
    private int f15288k;

    /* renamed from: l */
    private String f15289l;

    /* renamed from: m */
    private int f15290m;

    /* renamed from: n */
    private int f15291n;

    /* renamed from: o */
    private String f15292o;

    /* renamed from: p */
    private int f15293p;

    /* renamed from: q */
    private String f15294q;

    /* renamed from: r */
    private int f15295r;

    public C6193c() {
    }

    public C6193c(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2, int i3, String str9, int i4, int i5, String str10, int i6, int i7, String str11) {
        this.f15278a = str;
        this.f15279b = str2;
        this.f15280c = str3;
        this.f15281d = str4;
        this.f15282e = str5;
        this.f15283f = i;
        this.f15284g = str6;
        this.f15285h = str7;
        this.f15286i = str8;
        this.f15287j = i2;
        this.f15288k = i3;
        this.f15289l = str9;
        this.f15290m = i4;
        this.f15291n = i5;
        this.f15292o = str10;
        this.f15293p = i6;
        this.f15294q = str11;
        this.f15295r = i7;
    }

    /* renamed from: a */
    public final void mo43602a(int i) {
        this.f15293p = i;
    }

    /* renamed from: a */
    public final void mo43603a(String str) {
        this.f15294q = str;
    }

    /* renamed from: b */
    public final void mo43605b(String str) {
        this.f15289l = str;
    }

    /* renamed from: b */
    public final void mo43604b(int i) {
        this.f15290m = i;
    }

    /* renamed from: c */
    public final void mo43606c(int i) {
        this.f15291n = i;
    }

    /* renamed from: c */
    public final void mo43607c(String str) {
        this.f15292o = str;
    }

    /* renamed from: d */
    public final void mo43608d(int i) {
        this.f15288k = i;
    }

    /* renamed from: d */
    public final void mo43609d(String str) {
        this.f15284g = str;
    }

    /* renamed from: e */
    public final void mo43610e(int i) {
        this.f15283f = i;
    }

    /* renamed from: e */
    public final void mo43611e(String str) {
        this.f15285h = str;
    }

    /* renamed from: f */
    public final void mo43613f(String str) {
        this.f15286i = str;
    }

    /* renamed from: f */
    public final void mo43612f(int i) {
        this.f15287j = i;
    }

    /* renamed from: g */
    public final void mo43614g(String str) {
        this.f15282e = str;
    }

    /* renamed from: h */
    public final void mo43615h(String str) {
        this.f15280c = str;
    }

    /* renamed from: i */
    public final void mo43616i(String str) {
        this.f15281d = str;
    }

    /* renamed from: j */
    public final void mo43617j(String str) {
        this.f15278a = str;
    }

    /* renamed from: k */
    public final void mo43618k(String str) {
        this.f15279b = str;
    }

    /* renamed from: a */
    public static String m15509a(List<C6193c> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<C6193c> it = list.iterator();
        while (it.hasNext()) {
            C6193c next = it.next();
            Iterator<C6193c> it2 = it;
            String str = "\n";
            String str2 = "&click_time=";
            String str3 = "&link_type=";
            String str4 = "&landing_type=";
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.f15278a);
                sb.append("&rid_n=" + next.f15279b);
                sb.append("&network_type=" + next.f15293p);
                sb.append("&network_str=" + next.f15294q);
                sb.append("&cid=" + next.f15280c);
                sb.append("&click_type=" + next.f15288k);
                sb.append("&type=" + next.f15287j);
                sb.append("&click_duration=" + next.f15281d);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f15289l);
                sb.append("&last_url=" + next.f15282e);
                sb.append("&content=" + next.f15286i);
                sb.append("&code=" + next.f15283f);
                sb.append("&exception=" + next.f15284g);
                sb.append("&header=" + next.f15285h);
                sb.append(str4 + next.f15290m);
                sb.append(str3 + next.f15291n);
                sb.append(str2 + next.f15292o + str);
            } else {
                sb.append("rid=" + next.f15278a);
                sb.append("&rid_n=" + next.f15279b);
                sb.append("&cid=" + next.f15280c);
                sb.append("&click_type=" + next.f15288k);
                sb.append("&type=" + next.f15287j);
                sb.append("&click_duration=" + next.f15281d);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f15289l);
                sb.append("&last_url=" + next.f15282e);
                sb.append("&content=" + next.f15286i);
                sb.append("&code=" + next.f15283f);
                sb.append("&exception=" + next.f15284g);
                sb.append("&header=" + next.f15285h);
                sb.append(str4 + next.f15290m);
                sb.append(str3 + next.f15291n);
                sb.append(str2 + next.f15292o + str);
            }
            it = it2;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m15508a(C6193c cVar) {
        C6193c cVar2 = cVar;
        if (cVar2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = cVar2.f15282e;
        String str2 = "\n";
        String str3 = "&click_time=";
        String str4 = "&link_type=";
        if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + cVar2.f15278a);
            sb.append("&rid_n=" + cVar2.f15279b);
            sb.append("&network_type=" + cVar2.f15293p);
            sb.append("&network_str=" + cVar2.f15294q);
            sb.append("&click_type=" + cVar2.f15288k);
            sb.append("&type=" + cVar2.f15287j);
            sb.append("&cid=" + cVar2.f15280c);
            sb.append("&click_duration=" + cVar2.f15281d);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + cVar2.f15289l);
            sb.append("&last_url=" + str);
            sb.append("&code=" + cVar2.f15283f);
            sb.append("&exception=" + cVar2.f15284g);
            sb.append("&landing_type=" + cVar2.f15290m);
            sb.append(str4 + cVar2.f15291n);
            sb.append(str3 + cVar2.f15292o + str2);
        } else {
            sb.append("rid=" + cVar2.f15278a);
            sb.append("&rid_n=" + cVar2.f15279b);
            sb.append("&click_type=" + cVar2.f15288k);
            sb.append("&type=" + cVar2.f15287j);
            sb.append("&cid=" + cVar2.f15280c);
            sb.append("&click_duration=" + cVar2.f15281d);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + cVar2.f15289l);
            sb.append("&last_url=" + str);
            sb.append("&code=" + cVar2.f15283f);
            sb.append("&exception=" + cVar2.f15284g);
            sb.append("&landing_type=" + cVar2.f15290m);
            sb.append(str4 + cVar2.f15291n);
            sb.append(str3 + cVar2.f15292o + str2);
        }
        return sb.toString();
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f15280c + ", click_duration=" + this.f15281d + ", lastUrl=" + this.f15282e + ", code=" + this.f15283f + ", excepiton=" + this.f15284g + ", header=" + this.f15285h + ", content=" + this.f15286i + ", type=" + this.f15287j + ", click_type=" + this.f15288k + "]";
    }
}
