package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.p167b.C6211c;
import com.mbridge.msdk.foundation.same.p167b.C6213e;
import com.mbridge.msdk.foundation.same.p170e.C6225a;
import com.mbridge.msdk.foundation.tools.C6355o;
import com.mbridge.msdk.foundation.tools.C6370y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.videocommon.download.C7188f;
import java.io.File;

/* renamed from: com.mbridge.msdk.videocommon.download.h */
/* compiled from: HTMLResourceManager */
public final class C7200h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f18024a;

    /* renamed from: com.mbridge.msdk.videocommon.download.h$a */
    /* compiled from: HTMLResourceManager */
    private static class C7202a {

        /* renamed from: a */
        public static C7200h f18026a = new C7200h();
    }

    private C7200h() {
        this.f18024a = C6213e.m15725b(C6211c.MBRIDGE_700_HTML);
    }

    /* renamed from: a */
    public static C7200h m18303a() {
        return C7202a.f18026a;
    }

    /* renamed from: b */
    public final void mo49225b() {
        try {
            if (!TextUtils.isEmpty(this.f18024a)) {
                C7188f.C7190a.f18007a.mo49217a(new C6225a() {
                    /* renamed from: b */
                    public final void mo42877b() {
                    }

                    /* renamed from: a */
                    public final void mo42876a() {
                        C6355o.m16148c(C7200h.this.f18024a);
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo49223a(String str, byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            if (bArr.length <= 0) {
                return false;
            }
            if (C6355o.m16143a(bArr, new File(this.f18024a + "/" + SameMD5.getMD5(C6370y.m16237a(str)) + ".html"))) {
                return true;
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final String mo49222a(String str) {
        try {
            String str2 = this.f18024a + "/" + SameMD5.getMD5(C6370y.m16237a(str)) + ".html";
            if (!new File(str2).exists()) {
                return null;
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final String mo49224b(String str) {
        try {
            String md5 = SameMD5.getMD5(C6370y.m16237a(str));
            File file = new File(this.f18024a + "/" + md5 + ".html");
            if (file.exists()) {
                return C6355o.m16137a(file);
            }
            return null;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
