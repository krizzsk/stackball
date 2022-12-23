package com.facebook.appevents.iap;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InAppPurchaseUtils {
    public static Class<?> getClass(String str) {
        Class<InAppPurchaseUtils> cls = InAppPurchaseUtils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Class<InAppPurchaseUtils> cls2 = InAppPurchaseUtils.class;
        if (CrashShieldHandler.isObjectCrashing(cls2)) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls2);
            return null;
        }
    }

    public static Object invokeMethod(Class<?> cls, Method method, Object obj, Object... objArr) {
        Class<InAppPurchaseUtils> cls2 = InAppPurchaseUtils.class;
        if (CrashShieldHandler.isObjectCrashing(cls2)) {
            return null;
        }
        if (obj != null) {
            try {
                obj = cls.cast(obj);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls2);
                return null;
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
