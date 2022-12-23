package com.yandex.metrica.impl.p265ob;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.J0 */
public final class C10385J0 {

    /* renamed from: a */
    private static final Set<Integer> f24945a;

    /* renamed from: b */
    private static final EnumSet<C11413k1> f24946b;

    /* renamed from: c */
    private static final EnumSet<C11413k1> f24947c;

    /* renamed from: d */
    private static final EnumSet<C11413k1> f24948d;

    /* renamed from: e */
    private static final EnumSet<C11413k1> f24949e;

    /* renamed from: f */
    private static final EnumSet<C11413k1> f24950f = EnumSet.of(C11413k1.EVENT_TYPE_DIAGNOSTIC, C11413k1.EVENT_TYPE_DIAGNOSTIC_STATBOX, C11413k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, C11413k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);

    /* renamed from: g */
    private static final EnumSet<C11413k1> f24951g;

    /* renamed from: h */
    private static final EnumSet<C11413k1> f24952h;

    /* renamed from: i */
    public static final List<Integer> f24953i;

    /* renamed from: j */
    public static final List<Integer> f24954j = Arrays.asList(new Integer[]{Integer.valueOf(C11413k1.EVENT_TYPE_CLEANUP.mo63170b())});

    static {
        Integer[] numArr = {Integer.valueOf(C11413k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.mo63170b()), Integer.valueOf(C11413k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.mo63170b()), Integer.valueOf(C11413k1.EVENT_TYPE_EXCEPTION_USER.mo63170b()), Integer.valueOf(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo63170b()), Integer.valueOf(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.mo63170b()), Integer.valueOf(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo63170b()), Integer.valueOf(C11413k1.EVENT_TYPE_ANR.mo63170b())};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 7; i++) {
            hashSet.add(numArr[i]);
        }
        f24945a = Collections.unmodifiableSet(hashSet);
        C11413k1 k1Var = C11413k1.EVENT_TYPE_UNDEFINED;
        C11413k1 k1Var2 = C11413k1.EVENT_TYPE_SEND_REFERRER;
        C11413k1 k1Var3 = C11413k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C11413k1 k1Var4 = C11413k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C11413k1 k1Var5 = C11413k1.EVENT_TYPE_ACTIVATION;
        C11413k1 k1Var6 = C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C11413k1 k1Var7 = C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        C11413k1 k1Var8 = C11413k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        f24946b = EnumSet.of(k1Var, new C11413k1[]{C11413k1.EVENT_TYPE_PURGE_BUFFER, k1Var2, k1Var3, k1Var4, k1Var5, k1Var6, k1Var7, k1Var8});
        C11413k1 k1Var9 = C11413k1.EVENT_TYPE_SET_USER_INFO;
        C11413k1 k1Var10 = C11413k1.EVENT_TYPE_REPORT_USER_INFO;
        C11413k1 k1Var11 = C11413k1.EVENT_TYPE_INIT;
        C11413k1 k1Var12 = C11413k1.EVENT_TYPE_APP_UPDATE;
        f24947c = EnumSet.of(k1Var9, new C11413k1[]{k1Var10, C11413k1.EVENT_TYPE_IDENTITY, k1Var, k1Var11, k1Var12, k1Var2, C11413k1.EVENT_TYPE_ALIVE, C11413k1.EVENT_TYPE_STARTUP, k1Var3, k1Var4, k1Var5, k1Var6, k1Var7, k1Var8, C11413k1.EVENT_TYPE_WEBVIEW_SYNC});
        C11413k1 k1Var13 = C11413k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        C11413k1 k1Var14 = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f24948d = EnumSet.of(k1Var13, k1Var9, k1Var10, k1Var14);
        C11413k1 k1Var15 = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        C11413k1 k1Var16 = C11413k1.EVENT_TYPE_REGULAR;
        f24949e = EnumSet.of(k1Var15, new C11413k1[]{k1Var14, C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, C11413k1.EVENT_TYPE_EXCEPTION_USER, C11413k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, C11413k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, k1Var6, k1Var7, C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, C11413k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, k1Var8, k1Var16});
        f24951g = EnumSet.of(k1Var16);
        f24952h = EnumSet.of(k1Var6, k1Var7, k1Var8);
        f24953i = Arrays.asList(new Integer[]{Integer.valueOf(k1Var11.mo63170b()), Integer.valueOf(C11413k1.EVENT_TYPE_FIRST_ACTIVATION.mo63170b()), Integer.valueOf(k1Var2.mo63170b()), Integer.valueOf(k1Var12.mo63170b())});
    }

    /* renamed from: a */
    public static boolean m26640a(C11413k1 k1Var) {
        return !f24946b.contains(k1Var);
    }

    /* renamed from: b */
    public static boolean m26643b(C11413k1 k1Var) {
        return !f24947c.contains(k1Var);
    }

    /* renamed from: c */
    public static boolean m26645c(int i) {
        return f24949e.contains(C11413k1.m29450a(i));
    }

    /* renamed from: d */
    public static boolean m26646d(int i) {
        return !f24952h.contains(C11413k1.m29450a(i));
    }

    /* renamed from: e */
    public static boolean m26647e(int i) {
        return f24951g.contains(C11413k1.m29450a(i));
    }

    /* renamed from: f */
    public static boolean m26648f(int i) {
        return f24945a.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static boolean m26639a(int i) {
        return f24950f.contains(C11413k1.m29450a(i));
    }

    /* renamed from: b */
    public static boolean m26642b(int i) {
        return f24948d.contains(C11413k1.m29450a(i));
    }

    /* renamed from: c */
    static C11411k0 m26644c(String str, C10380Im im) {
        return m26636a(str, C11413k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, im);
    }

    /* renamed from: a */
    public static C11411k0 m26635a(String str, C10380Im im) {
        return m26636a(str, C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, im);
    }

    /* renamed from: b */
    public static C11411k0 m26641b(String str, C10380Im im) {
        return m26636a(str, C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, im);
    }

    /* renamed from: a */
    private static C11411k0 m26636a(String str, C11413k1 k1Var, C10380Im im) {
        C10734S s = new C10734S("", "", k1Var.mo63170b(), 0, im);
        if (str != null) {
            s.mo62217i(str);
        }
        return s;
    }

    /* renamed from: a */
    public static C11411k0 m26634a() {
        C11411k0 k0Var = new C11411k0();
        k0Var.f27302e = C11413k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.mo63170b();
        try {
            k0Var.f27299b = new JSONObject().put("stat_sending", new JSONObject().put("disabled", true)).toString();
        } catch (Throwable unused) {
        }
        return k0Var;
    }

    /* renamed from: a */
    static C11411k0 m26638a(String str, byte[] bArr, C10380Im im) {
        return new C10734S(bArr, str, C11413k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.mo63170b(), im);
    }

    /* renamed from: a */
    static C11411k0 m26637a(String str, String str2, boolean z, C10380Im im) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("link", str2);
        hashMap.put(TtmlNode.TEXT_EMPHASIS_AUTO, Boolean.valueOf(z));
        return new C10734S(C11993ym.m30997g(hashMap), "", C11413k1.EVENT_TYPE_APP_OPEN.mo63170b(), 0, im);
    }
}
