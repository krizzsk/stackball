package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.Thread;
import java.lang.reflect.Method;

/* renamed from: com.inmobi.media.fq */
/* compiled from: InMobiCrashHandler */
public class C5280fq implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    private static final String f12064b = C5280fq.class.getSimpleName();

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f12065a;

    public C5280fq(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f12065a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private static boolean m12088a(Class<?> cls, StackTraceElement stackTraceElement) {
        if (stackTraceElement.getClassName().equals(cls.getName())) {
            for (Method name : PublisherCallbacks.class.getDeclaredMethods()) {
                if (stackTraceElement.getMethodName().equals(name.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        boolean z = true;
        if (th != null) {
            try {
                if (!(th instanceof SdkNotInitializedException)) {
                    if (!(th instanceof InvalidPlacementIdException)) {
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        int length = stackTrace.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            StackTraceElement stackTraceElement = stackTrace[i];
                            if (m12088a(InMobiInterstitial.C4907a.class.getSuperclass(), stackTraceElement) || m12088a(InMobiInterstitial.C4907a.class, stackTraceElement) || m12088a(InMobiNative.NativeCallbacks.class, stackTraceElement) || m12088a(InMobiBanner.C4905a.class, stackTraceElement) || m12088a(InMobiBanner.C4905a.class.getSuperclass(), stackTraceElement)) {
                                break;
                            }
                            if (stackTraceElement.getClassName().equals(InMobiSdk.class.getName())) {
                                if (stackTraceElement.getMethodName().equals(InMobiSdk.class.getDeclaredMethod("fireListener", new Class[]{SdkInitializationListener.class, String.class}).getName())) {
                                    break;
                                }
                            }
                            if (stackTraceElement.getClassName().contains(C5280fq.class.getName())) {
                                break;
                            } else if (stackTraceElement.getClassName().contains("com.inmobi.")) {
                                break;
                            } else if (stackTraceElement.getClassName().contains("com.aerserv.")) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                try {
                    C5275fn.m12068a().mo40589a(new C5279fp(thread, (Throwable) e));
                    C5275fn.m12068a().mo40589a(new C5279fp(thread, th));
                } catch (Exception unused) {
                }
            }
        }
        z = false;
        if (z) {
            C5275fn.m12068a().mo40589a(new C5279fp(thread, th));
        }
        this.f12065a.uncaughtException(thread, th);
    }
}
