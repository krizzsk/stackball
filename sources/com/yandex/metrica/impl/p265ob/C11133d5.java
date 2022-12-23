package com.yandex.metrica.impl.p265ob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.d5 */
public class C11133d5 extends C11231f5<C11737s5> {

    /* renamed from: a */
    private final C10947Y5 f26685a;

    /* renamed from: b */
    private final Map<C11413k1, C10694R5<C11737s5>> f26686b = m28700a();

    /* renamed from: c */
    private C10538N5<C11737s5> f26687c;

    public C11133d5(C11229f4 f4Var) {
        C10947Y5 y5 = new C10947Y5(f4Var);
        this.f26685a = y5;
        this.f26687c = new C10538N5(y5);
    }

    /* renamed from: a */
    private HashMap<C11413k1, C10694R5<C11737s5>> m28700a() {
        HashMap<C11413k1, C10694R5<C11737s5>> hashMap = new HashMap<>();
        hashMap.put(C11413k1.EVENT_TYPE_ACTIVATION, new C10495M5(this.f26685a));
        hashMap.put(C11413k1.EVENT_TYPE_START, new C11068b6(this.f26685a));
        hashMap.put(C11413k1.EVENT_TYPE_REGULAR, new C10828V5(this.f26685a));
        C10774T5 t5 = new C10774T5(this.f26685a);
        hashMap.put(C11413k1.EVENT_TYPE_EXCEPTION_USER, t5);
        hashMap.put(C11413k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, t5);
        hashMap.put(C11413k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, t5);
        hashMap.put(C11413k1.EVENT_TYPE_SEND_REFERRER, t5);
        hashMap.put(C11413k1.EVENT_TYPE_STATBOX, t5);
        hashMap.put(C11413k1.EVENT_TYPE_CUSTOM_EVENT, t5);
        hashMap.put(C11413k1.EVENT_TYPE_APP_OPEN, new C10915X5(this.f26685a));
        hashMap.put(C11413k1.EVENT_TYPE_PURGE_BUFFER, new C10800U5(this.f26685a));
        C11413k1 k1Var = C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C10947Y5 y5 = this.f26685a;
        hashMap.put(k1Var, new C11026a6(y5, y5.mo62518l()));
        C11413k1 k1Var2 = C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        C10947Y5 y52 = this.f26685a;
        hashMap.put(k1Var2, new C11026a6(y52, y52.mo62518l()));
        hashMap.put(C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new C10658Q5(this.f26685a));
        hashMap.put(C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C10658Q5(this.f26685a));
        hashMap.put(C11413k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new C10625P5(this.f26685a));
        C11413k1 k1Var3 = C11413k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        C10947Y5 y53 = this.f26685a;
        hashMap.put(k1Var3, new C11026a6(y53, y53.mo62518l()));
        hashMap.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C11134d6(this.f26685a));
        C11103c6 c6Var = new C11103c6(this.f26685a);
        hashMap.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED, c6Var);
        hashMap.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, c6Var);
        hashMap.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, c6Var);
        hashMap.put(C11413k1.EVENT_TYPE_ANR, t5);
        hashMap.put(C11413k1.EVENT_TYPE_IDENTITY, new C10741S5(this.f26685a));
        hashMap.put(C11413k1.EVENT_TYPE_SET_USER_INFO, new C10982Z5(this.f26685a));
        C11413k1 k1Var4 = C11413k1.EVENT_TYPE_REPORT_USER_INFO;
        C10947Y5 y54 = this.f26685a;
        hashMap.put(k1Var4, new C11026a6(y54, y54.mo62521o()));
        C11413k1 k1Var5 = C11413k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C10947Y5 y55 = this.f26685a;
        hashMap.put(k1Var5, new C11026a6(y55, y55.mo62510d()));
        C11413k1 k1Var6 = C11413k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C10947Y5 y56 = this.f26685a;
        hashMap.put(k1Var6, new C11026a6(y56, y56.mo62509c()));
        hashMap.put(C11413k1.EVENT_TYPE_SEND_USER_PROFILE, t5);
        C11413k1 k1Var7 = C11413k1.EVENT_TYPE_SET_USER_PROFILE_ID;
        C10947Y5 y57 = this.f26685a;
        hashMap.put(k1Var7, new C11026a6(y57, y57.mo62529w()));
        hashMap.put(C11413k1.EVENT_TYPE_SEND_REVENUE_EVENT, t5);
        hashMap.put(C11413k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, t5);
        hashMap.put(C11413k1.EVENT_TYPE_IDENTITY_LIGHT, t5);
        hashMap.put(C11413k1.EVENT_TYPE_CLEANUP, t5);
        hashMap.put(C11413k1.EVENT_TYPE_VIEW_TREE, t5);
        hashMap.put(C11413k1.EVENT_TYPE_RAW_VIEW_TREE, t5);
        hashMap.put(C11413k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, t5);
        hashMap.put(C11413k1.EVENT_TYPE_STATBOX_EXP, t5);
        hashMap.put(C11413k1.EVENT_TYPE_WEBVIEW_SYNC, t5);
        return hashMap;
    }

    /* renamed from: b */
    public C10947Y5 mo62745b() {
        return this.f26685a;
    }

    /* renamed from: a */
    public void mo62744a(C11413k1 k1Var, C10694R5<C11737s5> r5) {
        this.f26686b.put(k1Var, r5);
    }

    /* renamed from: a */
    public C11102c5<C11737s5> mo62686a(int i) {
        LinkedList linkedList = new LinkedList();
        C11413k1 a = C11413k1.m29450a(i);
        C10538N5<C11737s5> n5 = this.f26687c;
        if (n5 != null) {
            n5.mo61809a(a, linkedList);
        }
        C10694R5 r5 = this.f26686b.get(a);
        if (r5 != null) {
            r5.mo61778a(linkedList);
        }
        return new C11102c5<>(linkedList);
    }
}
