package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: com.flurry.sdk.eo */
public abstract class C2621eo implements Runnable {

    /* renamed from: a */
    private static final String f6149a = C2621eo.class.getSimpleName();

    /* renamed from: b */
    private PrintStream f6150b;

    /* renamed from: c */
    private PrintWriter f6151c;

    /* renamed from: a */
    public abstract void mo17573a() throws Exception;

    public final void run() {
        try {
            mo17573a();
        } catch (Throwable th) {
            PrintStream printStream = this.f6150b;
            if (printStream != null) {
                th.printStackTrace(printStream);
            } else {
                PrintWriter printWriter = this.f6151c;
                if (printWriter != null) {
                    th.printStackTrace(printWriter);
                } else {
                    th.printStackTrace();
                }
            }
            C2530db.m5475a(6, f6149a, "", th);
        }
    }
}
