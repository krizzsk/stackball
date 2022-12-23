package com.chartboost.sdk.Libraries;

import com.tapjoy.TJAdUnitConstants;
import java.io.File;

/* renamed from: com.chartboost.sdk.Libraries.h */
public class C1829h {

    /* renamed from: a */
    public final File f4393a;

    /* renamed from: b */
    public final File f4394b;

    /* renamed from: c */
    public final File f4395c;

    /* renamed from: d */
    public final File f4396d;

    C1829h(File file) {
        File file2 = new File(file, ".chartboost");
        this.f4393a = file2;
        if (!file2.exists()) {
            this.f4393a.mkdirs();
        }
        m4049a(this.f4393a, "css");
        m4049a(this.f4393a, TJAdUnitConstants.String.HTML);
        this.f4394b = m4049a(this.f4393a, "images");
        m4049a(this.f4393a, "js");
        this.f4395c = m4049a(this.f4393a, "templates");
        this.f4396d = m4049a(this.f4393a, "videos");
    }

    /* renamed from: a */
    private static File m4049a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
