package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.flurry.sdk.p */
public class C2660p extends C2662r {

    /* renamed from: i */
    private static final String f6257i = C2660p.class.getSimpleName();

    /* renamed from: j */
    private final Context f6258j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17865b() {
    }

    C2660p(Context context, String str) {
        this.f6258j = context;
        this.f6262a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final InputStream mo17863a() throws IOException {
        if (this.f6258j != null && !TextUtils.isEmpty(this.f6262a)) {
            try {
                return this.f6258j.getAssets().open(this.f6262a);
            } catch (FileNotFoundException unused) {
                String str = f6257i;
                C2530db.m5482b(str, "File Not Found when opening " + this.f6262a);
            } catch (IOException unused2) {
                String str2 = f6257i;
                C2530db.m5482b(str2, "IO Exception when opening " + this.f6262a);
            }
        }
        return null;
    }
}
