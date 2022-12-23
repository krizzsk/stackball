package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class h31 {
    /* renamed from: a */
    public Object mo67396a(Class<?> cls, String str, Object... objArr) {
        try {
            Method a = m36787a(cls, str, (Class<?>[]) m36789a(objArr));
            if (a == null) {
                return null;
            }
            a.setAccessible(true);
            Object invoke = a.invoke((Object) null, objArr);
            a.setAccessible(false);
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo67397b(Class<?> cls, String str, Object... objArr) {
        try {
            if (m36787a(cls, str, (Class<?>[]) m36789a(objArr)) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Object m36786a(Object obj, String str, Object... objArr) {
        try {
            Method a = m36787a(obj.getClass(), str, (Class<?>[]) m36789a(objArr));
            if (a == null) {
                return null;
            }
            a.setAccessible(true);
            Object invoke = a.invoke(obj, objArr);
            a.setAccessible(false);
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m36785a(Class<T> cls, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            boolean isAccessible = declaredConstructor.isAccessible();
            if (!isAccessible) {
                declaredConstructor.setAccessible(true);
            }
            T newInstance = declaredConstructor.newInstance(objArr);
            if (!isAccessible) {
                declaredConstructor.setAccessible(false);
            }
            return newInstance;
        } catch (Exception unused) {
            Arrays.toString(objArr);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m36787a(Class<?> cls, String str, Class<?>[] clsArr) {
        Class<? super Object> cls2;
        while (cls2 != null) {
            for (Method method : cls2.getDeclaredMethods()) {
                if (str.equals(method.getName()) && m36788a(method, clsArr)) {
                    return method;
                }
            }
            Class<? super Object> superclass = cls2.getSuperclass();
            cls2 = cls;
            cls2 = superclass;
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m36788a(Method method, Class<?>[] clsArr) {
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return false;
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (!parameterTypes[i].isAssignableFrom(clsArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m36789a(Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return clsArr;
    }
}
