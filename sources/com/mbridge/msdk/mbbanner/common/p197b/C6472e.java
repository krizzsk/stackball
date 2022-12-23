package com.mbridge.msdk.mbbanner.common.p197b;

import com.mbridge.msdk.mbbanner.common.p198c.C6485b;
import com.mbridge.msdk.videocommon.download.C7191g;

/* renamed from: com.mbridge.msdk.mbbanner.common.b.e */
/* compiled from: DownloadBannerUrlListener */
public class C6472e implements C7191g.C7197b {

    /* renamed from: a */
    private static final String f16123a = C6472e.class.getSimpleName();

    /* renamed from: b */
    private String f16124b;

    /* renamed from: c */
    private C6485b f16125c;

    public C6472e(C6485b bVar, String str) {
        this.f16125c = bVar;
        this.f16124b = str;
    }

    /* renamed from: a */
    public final void mo44018a(String str) {
        C6485b bVar = this.f16125c;
        if (bVar != null) {
            bVar.mo44323a(this.f16124b, 3, str, true);
        }
    }

    /* renamed from: a */
    public final void mo44019a(String str, String str2) {
        C6485b bVar = this.f16125c;
        if (bVar != null) {
            bVar.mo44323a(this.f16124b, 3, str, false);
        }
    }
}
