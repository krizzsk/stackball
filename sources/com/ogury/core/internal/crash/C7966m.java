package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C7914ab;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7935au;
import java.io.File;
import java.io.PrintWriter;
import org.json.JSONArray;

/* renamed from: com.ogury.core.internal.crash.m */
/* compiled from: FileStore.kt */
public final class C7966m {

    /* renamed from: a */
    private final File f20754a;

    static {
        new C7967a((byte) 0);
    }

    public C7966m(Context context) {
        C7921ai.m22144b(context, "context");
        File file = new File(context.getFilesDir(), "oguryCrashDir");
        this.f20754a = file;
        file.mkdirs();
    }

    /* renamed from: com.ogury.core.internal.crash.m$a */
    /* compiled from: FileStore.kt */
    public static final class C7967a {
        private C7967a() {
        }

        public /* synthetic */ C7967a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo52950a(String str) {
        C7921ai.m22144b(str, "sdkKey");
        new File(this.f20754a, m22214d(str)).createNewFile();
        new File(this.f20754a, m22215e(str)).createNewFile();
    }

    /* renamed from: d */
    private static String m22214d(String str) {
        return "crash_" + str;
    }

    /* renamed from: e */
    private static String m22215e(String str) {
        return "crash_level_two_crashes_" + str;
    }

    /* renamed from: a */
    public static void m22212a(File file) {
        C7921ai.m22144b(file, "file");
        try {
            new PrintWriter(file).print("");
        } catch (Exception e) {
            C7958i iVar = C7958i.f20738a;
            C7958i.m22206a(e);
        }
    }

    /* renamed from: b */
    public final File mo52951b(String str) {
        C7921ai.m22144b(str, "sdkKey");
        return new File(this.f20754a, m22215e(str));
    }

    /* renamed from: c */
    public final File mo52952c(String str) {
        C7921ai.m22144b(str, "sdkKey");
        return new File(this.f20754a, m22214d(str));
    }

    /* renamed from: a */
    public final File mo52949a(String str, int i) {
        C7921ai.m22144b(str, "sdkKey");
        if (i == 1) {
            return mo52952c(str);
        }
        if (i == 2) {
            return mo52951b(str);
        }
        return null;
    }

    /* renamed from: b */
    public static JSONArray m22213b(File file) throws Exception {
        C7921ai.m22144b(file, "file");
        try {
            return new JSONArray(C7914ab.m22133a(file, C7935au.f20699a));
        } catch (Exception e) {
            C7958i iVar = C7958i.f20738a;
            C7958i.m22206a(e);
            return new JSONArray();
        }
    }
}
