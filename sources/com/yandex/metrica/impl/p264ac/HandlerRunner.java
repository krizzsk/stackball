package com.yandex.metrica.impl.p264ac;

import com.yandex.metrica.impl.p265ob.C10796U2;
import dalvik.system.PathClassLoader;

/* renamed from: com.yandex.metrica.impl.ac.HandlerRunner */
public class HandlerRunner {
    /* renamed from: a */
    private static void m25956a(String str) {
        try {
            String findLibrary = new PathClassLoader(System.getProperty("java.class.path"), System.getProperty("java.library.path"), ClassLoader.getSystemClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                System.load(findLibrary);
            }
        } catch (Throwable unused) {
        }
    }

    public static void main(String[] strArr) {
        if (C10796U2.m27890a(24)) {
            try {
                System.loadLibrary("appmetrica-native-runner");
            } catch (Throwable unused) {
                m25956a("appmetrica-native-runner");
            }
        } else {
            m25956a("appmetrica-native-runner");
        }
        runHandler(strArr);
    }

    private static native void runHandler(String[] strArr);
}
