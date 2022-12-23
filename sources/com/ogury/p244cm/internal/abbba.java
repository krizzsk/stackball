package com.ogury.p244cm.internal;

import com.ogury.core.OguryError;
import com.ogury.p244cm.internal.bacab;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.abbba */
public final class abbba {

    /* renamed from: a */
    public static final abbba f20411a = new abbba();

    /* renamed from: b */
    private static int f20412b = 2;

    /* renamed from: c */
    private static int f20413c = 1;

    /* renamed from: d */
    private static abbcb f20414d = new abbcb((abcab) null, (abcaa) null, 3, (bbabb) null);

    /* renamed from: e */
    private static acacc f20415e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);

    /* renamed from: f */
    private static accba f20416f = new accba((accca) null, (accbc) null, 3, (bbabb) null);

    /* renamed from: g */
    private static acbbb f20417g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);

    /* renamed from: h */
    private static abbcc f20418h = new abbcc();

    /* renamed from: i */
    private static Date f20419i = new Date();

    /* renamed from: j */
    private static acbcc f20420j = new acbcc(true, (OguryError) null, 2, (bbabb) null);

    /* renamed from: k */
    private static String f20421k = "";

    /* renamed from: l */
    private static String f20422l = "";

    /* renamed from: m */
    private static String f20423m = "";

    /* renamed from: n */
    private static String[] f20424n = new String[0];

    /* renamed from: o */
    private static String f20425o = "";

    /* renamed from: p */
    private static String f20426p = "";

    private abbba() {
    }

    /* renamed from: a */
    public static int m21818a() {
        return f20412b;
    }

    /* renamed from: a */
    public static void m21819a(int i) {
        f20413c = 1;
    }

    /* renamed from: a */
    public static void m21820a(long j) {
        f20419i.setTime(j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m21821a(abbba abbba, int i, int i2, Object obj) {
        f20412b = 2;
        f20414d = new abbcb((abcab) null, (abcaa) null, 3, (bbabb) null);
        f20415e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);
        f20416f = new accba((accca) null, (accbc) null, 3, (bbabb) null);
        f20417g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);
    }

    /* renamed from: a */
    public static void m21823a(acbcc acbcc) {
        bbabc.m22051b(acbcc, "<set-?>");
        f20420j = acbcc;
    }

    /* renamed from: a */
    public static void m21824a(String str) {
        bbabc.m22051b(str, "<set-?>");
        f20421k = str;
    }

    /* renamed from: a */
    public static void m21825a(Date date) {
        bbabc.m22051b(date, "<set-?>");
        f20419i = date;
    }

    /* renamed from: a */
    public static void m21826a(String[] strArr) {
        bbabc.m22051b(strArr, "value");
        bbabc.m22051b(strArr, "frameworksInResponse");
        String[] strArr2 = f20424n;
        int length = strArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!bacab.aaaaa.m22028a(strArr, strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m21828b(m21849r());
        }
        f20424n = strArr;
    }

    /* renamed from: b */
    public static int m21827b() {
        return f20413c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m21828b(abbcb abbcb) {
        bbabc.m22051b(abbcb, "consentResult");
        m21847p();
        f20418h = new abbcc();
        f20419i = new Date();
        f20421k = "";
        f20422l = "";
        f20423m = "";
        f20414d = abbcb;
    }

    /* renamed from: b */
    public static void m21829b(String str) {
        bbabc.m22051b(str, "<set-?>");
        f20422l = str;
    }

    /* renamed from: c */
    public static abbcb m21830c() {
        return f20414d;
    }

    /* renamed from: c */
    public static void m21831c(String str) {
        bbabc.m22051b(str, "<set-?>");
        f20423m = str;
    }

    /* renamed from: d */
    public static acacc m21832d() {
        return f20415e;
    }

    /* renamed from: d */
    public static void m21833d(String str) {
        bbabc.m22051b(str, "<set-?>");
        f20425o = str;
    }

    /* renamed from: e */
    public static accba m21834e() {
        return f20416f;
    }

    /* renamed from: e */
    public static void m21835e(String str) {
        bbabc.m22051b(str, "<set-?>");
        f20426p = str;
    }

    /* renamed from: f */
    public static acbbb m21836f() {
        return f20417g;
    }

    /* renamed from: f */
    public static boolean m21837f(String str) {
        bbabc.m22051b(str, "frameworkToCheck");
        return bacab.aaaaa.m22028a(f20424n, str);
    }

    /* renamed from: g */
    public static abbcc m21838g() {
        return f20418h;
    }

    /* renamed from: h */
    public static Date m21839h() {
        return f20419i;
    }

    /* renamed from: i */
    public static acbcc m21840i() {
        return f20420j;
    }

    /* renamed from: j */
    public static String m21841j() {
        return f20421k;
    }

    /* renamed from: k */
    public static String m21842k() {
        return f20422l;
    }

    /* renamed from: l */
    public static String m21843l() {
        return f20423m;
    }

    /* renamed from: m */
    public static String[] m21844m() {
        return f20424n;
    }

    /* renamed from: n */
    public static String m21845n() {
        return f20425o;
    }

    /* renamed from: o */
    public static String m21846o() {
        return f20426p;
    }

    /* renamed from: p */
    public static void m21847p() {
        f20420j = new acbcc(true, (OguryError) null, 2, (bbabb) null);
    }

    /* renamed from: q */
    public static boolean m21848q() {
        return f20420j.mo52749a();
    }

    /* renamed from: r */
    private static abbcb m21849r() {
        return new abbcb(f20412b != 2 ? new abcac() : new abcac(), new abcaa());
    }

    /* renamed from: a */
    public final void mo52674a(abbcb abbcb) {
        bbabc.m22051b(abbcb, "consentResult");
        m21828b(abbcb);
        m21826a(new String[0]);
        f20425o = "";
        f20426p = "";
        f20417g = new acbbb((accab) null, (accaa) null, 3, (bbabb) null);
        f20416f = new accba((accca) null, (accbc) null, 3, (bbabb) null);
        f20415e = new acacc((acbac) null, (acbab) null, 3, (bbabb) null);
    }
}
