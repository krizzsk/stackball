package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;
import java.io.File;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.d */
/* compiled from: CrashFileWriter.kt */
public final class C7950d {
    static {
        new C7951a((byte) 0);
    }

    /* renamed from: com.ogury.core.internal.crash.d$a */
    /* compiled from: CrashFileWriter.kt */
    public static final class C7951a {
        private C7951a() {
        }

        public /* synthetic */ C7951a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private static void m22184b(JSONArray jSONArray, File file) {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(jSONArray);
        printWriter.close();
    }

    /* renamed from: a */
    public final void mo52932a(JSONArray jSONArray, File file) {
        C7921ai.m22144b(jSONArray, "crashes");
        C7921ai.m22144b(file, "crashFile");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONObject.put("number_of_crashes_on_last_upload", jSONObject.getInt("number_of_crashes"));
        }
        m22184b(jSONArray, file);
    }

    /* renamed from: a */
    public final void mo52931a(File file, JSONObject jSONObject, JSONArray jSONArray) {
        C7921ai.m22144b(file, "crashFile");
        C7921ai.m22144b(jSONObject, "newCrash");
        C7921ai.m22144b(jSONArray, "previousCrashes");
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C7921ai.m22143a((Object) jSONArray.getJSONObject(i).getString("stacktrace"), (Object) jSONObject.getString("stacktrace"))) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            int i2 = jSONObject2.getInt("number_of_crashes_on_last_upload");
            jSONObject.put("number_of_crashes", jSONObject2.getInt("number_of_crashes") + 1);
            jSONObject.put("number_of_crashes_on_last_upload", i2);
            jSONArray.put(i, jSONObject);
        } else {
            jSONArray.put(jSONObject);
        }
        m22184b(jSONArray, file);
    }
}
