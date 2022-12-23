package com.fyber.inneractive.sdk.player.p057a;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.a.a */
public final class C3103a {

    /* renamed from: a */
    File f7624a;

    /* renamed from: b */
    String f7625b;

    /* renamed from: c */
    boolean f7626c;

    /* renamed from: d */
    String f7627d;

    /* renamed from: e */
    public Object f7628e = new Object();

    /* renamed from: f */
    Map<String, String> f7629f = new HashMap();

    /* renamed from: g */
    final String f7630g;

    /* renamed from: h */
    volatile boolean f7631h = false;

    private C3103a(String str, String str2, File file, boolean z, String str3) {
        this.f7624a = file;
        this.f7625b = str2;
        this.f7626c = z;
        this.f7627d = str3;
        this.f7630g = str;
    }

    /* renamed from: a */
    public static C3103a m7325a(String str, String str2, File file, boolean z, String str3) {
        return new C3103a(str, str2, file, z, str3);
    }

    /* renamed from: a */
    public final File mo18672a() {
        File file;
        synchronized (this.f7628e) {
            file = this.f7624a;
        }
        return file;
    }

    /* renamed from: b */
    public final boolean mo18675b() {
        File file = this.f7624a;
        return file != null && file.exists();
    }

    /* renamed from: a */
    public final void mo18674a(Map<String, String> map) {
        this.f7629f.putAll(map);
    }

    /* renamed from: a */
    public final String mo18673a(String str) {
        return this.f7629f.get(str);
    }
}
