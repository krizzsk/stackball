package com.ironsource.sdk.p151h;

import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.c */
public final class C6020c extends File {
    public C6020c(String str) {
        super(str);
    }

    public C6020c(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public final JSONObject mo42568a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    public final String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }
}
