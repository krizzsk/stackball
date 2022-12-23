package com.mbridge.msdk.mbbanner.common.p197b;

import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.same.p168c.C6219c;
import com.mbridge.msdk.mbbanner.common.p198c.C6485b;

/* renamed from: com.mbridge.msdk.mbbanner.common.b.f */
/* compiled from: DownloadImageListener */
public class C6473f implements C6219c {

    /* renamed from: a */
    private static final String f16126a = C6473f.class.getSimpleName();

    /* renamed from: b */
    private C6485b f16127b;

    /* renamed from: c */
    private String f16128c;

    public C6473f(C6485b bVar, String str) {
        if (bVar != null) {
            this.f16127b = bVar;
        }
        this.f16128c = str;
    }

    public void onSuccessLoad(Bitmap bitmap, String str) {
        this.f16127b.mo44323a(this.f16128c, 1, str, true);
    }

    public void onFailedLoad(String str, String str2) {
        this.f16127b.mo44323a(this.f16128c, 1, str2, false);
    }
}
