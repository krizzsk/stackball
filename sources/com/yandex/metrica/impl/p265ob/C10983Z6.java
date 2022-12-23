package com.yandex.metrica.impl.p265ob;

import android.util.SparseArray;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.yandex.metrica.impl.ob.Z6 */
public class C10983Z6 {

    /* renamed from: c */
    private static SparseArray<C10983Z6> f26406c;

    /* renamed from: a */
    public final String f26407a;

    /* renamed from: b */
    public final String f26408b;

    static {
        SparseArray<C10983Z6> sparseArray = new SparseArray<>();
        f26406c = sparseArray;
        sparseArray.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED.mo63170b(), new C10983Z6("jvm", "binder"));
        f26406c.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo63170b(), new C10983Z6("jvm", "binder"));
        f26406c.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo63170b(), new C10983Z6("jvm", SDKConstants.PARAM_INTENT));
        f26406c.put(C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.mo63170b(), new C10983Z6("jvm", "file"));
        f26406c.put(C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.mo63170b(), new C10983Z6("jni_native", "file"));
        f26406c.put(C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.mo63170b(), new C10983Z6("jni_native", "file"));
        f26406c.put(C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.mo63170b(), new C10983Z6("jni_native", "file"));
        f26406c.put(C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.mo63170b(), new C10983Z6("jni_native", "file"));
        f26406c.put(C11413k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.mo63170b(), new C10983Z6("jni_native", "file"));
        f26406c.put(C11413k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.mo63170b(), new C10983Z6("jni_native", "binder"));
    }

    private C10983Z6(String str, String str2) {
        this.f26407a = str;
        this.f26408b = str2;
    }

    /* renamed from: a */
    public static C10983Z6 m28354a(int i) {
        return f26406c.get(i);
    }
}
