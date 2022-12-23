package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.base.C12129u;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.ug1;

/* renamed from: com.yandex.mobile.ads.impl.t1 */
public class C14645t1 {

    /* renamed from: a */
    private SizeInfo f40196a;

    /* renamed from: b */
    private final C12115n f40197b;

    /* renamed from: c */
    private final C13856lg f40198c;

    /* renamed from: d */
    private AdRequest f40199d;

    /* renamed from: e */
    private C12129u f40200e;

    /* renamed from: f */
    private C12127t f40201f;

    /* renamed from: g */
    private String f40202g;

    /* renamed from: h */
    private ug1.C14757a f40203h;

    /* renamed from: i */
    private String f40204i;

    /* renamed from: j */
    private String f40205j;

    /* renamed from: k */
    private Integer f40206k;

    /* renamed from: l */
    private boolean f40207l;

    /* renamed from: m */
    private boolean f40208m;

    /* renamed from: n */
    private int f40209n;

    /* renamed from: o */
    private int f40210o = ac0.f30504a;

    public C14645t1(C12115n nVar) {
        this.f40197b = nVar;
        this.f40198c = new C13856lg();
        this.f40208m = true;
    }

    /* renamed from: b */
    public C12115n mo70092b() {
        return this.f40197b;
    }

    /* renamed from: c */
    public String mo70096c() {
        return this.f40202g;
    }

    /* renamed from: d */
    public Integer mo70098d() {
        return this.f40206k;
    }

    /* renamed from: e */
    public C14564s6 mo70099e() {
        return this.f40198c.mo68419a();
    }

    /* renamed from: f */
    public String mo70100f() {
        return this.f40204i;
    }

    /* renamed from: g */
    public String mo70101g() {
        return this.f40205j;
    }

    /* renamed from: h */
    public C13856lg mo70102h() {
        return this.f40198c;
    }

    /* renamed from: i */
    public int mo70103i() {
        return this.f40210o;
    }

    /* renamed from: j */
    public l30 mo70104j() {
        return this.f40198c.mo68423b();
    }

    /* renamed from: k */
    public String[] mo70105k() {
        return this.f40198c.mo68424c();
    }

    /* renamed from: l */
    public int mo70106l() {
        return this.f40209n;
    }

    /* renamed from: m */
    public C12127t mo70107m() {
        return this.f40201f;
    }

    /* renamed from: n */
    public SizeInfo mo70108n() {
        return this.f40196a;
    }

    /* renamed from: o */
    public C12129u mo70109o() {
        return this.f40200e;
    }

    /* renamed from: p */
    public ug1.C14757a mo70110p() {
        return this.f40203h;
    }

    /* renamed from: q */
    public boolean mo70111q() {
        return this.f40208m;
    }

    /* renamed from: r */
    public boolean mo70112r() {
        return !TextUtils.isEmpty(this.f40202g);
    }

    /* renamed from: s */
    public boolean mo70113s() {
        return this.f40207l;
    }

    /* renamed from: a */
    public void mo70082a(SizeInfo sizeInfo) {
        if (sizeInfo == null) {
            throw new IllegalArgumentException("Ad size can't be null or empty.");
        } else if (this.f40196a == null) {
            this.f40196a = sizeInfo;
        } else {
            throw new IllegalArgumentException("Ad size can't be set twice.");
        }
    }

    /* renamed from: b */
    public void mo70095b(boolean z) {
        this.f40207l = z;
    }

    /* renamed from: c */
    public void mo70097c(String str) {
        this.f40205j = str;
    }

    /* renamed from: b */
    public void mo70094b(String str) {
        this.f40204i = str;
    }

    /* renamed from: b */
    public void mo70093b(int i) {
        this.f40209n = i;
    }

    /* renamed from: a */
    public AdRequest mo70080a() {
        return this.f40199d;
    }

    /* renamed from: a */
    public void mo70085a(AdRequest adRequest) {
        this.f40199d = adRequest;
    }

    /* renamed from: a */
    public void mo70081a(int i) {
        this.f40206k = Integer.valueOf(i);
    }

    /* renamed from: a */
    public void mo70089a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Ad Unit Id can't be null or empty.");
        } else if (TextUtils.isEmpty(this.f40202g)) {
            this.f40202g = str;
        } else {
            throw new IllegalArgumentException("Ad Unit Id can't be set twice.");
        }
    }

    /* renamed from: a */
    public void mo70087a(C14564s6 s6Var) {
        this.f40198c.mo68421a(s6Var);
    }

    /* renamed from: a */
    public void mo70086a(l30 l30) {
        this.f40198c.mo68420a(l30);
    }

    /* renamed from: a */
    public void mo70083a(C12127t tVar) {
        this.f40201f = tVar;
    }

    /* renamed from: a */
    public void mo70084a(C12129u uVar) {
        this.f40200e = uVar;
    }

    /* renamed from: a */
    public void mo70088a(ug1.C14757a aVar) {
        this.f40203h = aVar;
    }

    /* renamed from: a */
    public void mo70091a(String[] strArr) {
        this.f40198c.mo68422a(strArr);
    }

    /* renamed from: a */
    public void mo70090a(boolean z) {
        this.f40208m = z;
    }
}
