package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.p167b.C6211c;
import com.mbridge.msdk.foundation.same.p167b.C6213e;
import com.mbridge.msdk.foundation.same.p170e.C6225a;
import com.mbridge.msdk.foundation.tools.C6354n;
import com.mbridge.msdk.foundation.tools.C6355o;
import com.mbridge.msdk.foundation.tools.C6370y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.videocommon.download.C7188f;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.util.List;

/* renamed from: com.mbridge.msdk.videocommon.download.j */
/* compiled from: ResourceManager */
public final class C7206j {

    /* renamed from: a */
    private static String f18033a = "ResourceManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f18034b;

    /* renamed from: com.mbridge.msdk.videocommon.download.j$a */
    /* compiled from: ResourceManager */
    private static class C7208a {

        /* renamed from: a */
        public static C7206j f18036a = new C7206j();
    }

    private C7206j() {
        this.f18034b = C6213e.m15725b(C6211c.MBRIDGE_700_RES);
    }

    /* renamed from: a */
    public static C7206j m18320a() {
        return C7208a.f18036a;
    }

    /* renamed from: b */
    public final void mo49236b() {
        try {
            if (!TextUtils.isEmpty(this.f18034b)) {
                C7188f.C7190a.f18007a.mo49217a(new C6225a() {
                    /* renamed from: b */
                    public final void mo42877b() {
                    }

                    /* renamed from: a */
                    public final void mo42876a() {
                        C6355o.m16148c(C7206j.this.f18034b);
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
    public final synchronized String mo49235a(String str, byte[] bArr) {
        String str2;
        String str3 = "unknow exception ";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str4 = this.f18034b + "/" + SameMD5.getMD5(C6370y.m16237a(str)) + ".zip";
                    File file = new File(str4);
                    if (C6355o.m16143a(bArr, file)) {
                        Uri parse = Uri.parse(str);
                        List<String> queryParameters = parse.getQueryParameters("nc");
                        if (queryParameters != null) {
                            if (queryParameters.size() != 0) {
                                str3 = m18322a(str, str4, file);
                            }
                        }
                        List<String> queryParameters2 = parse.getQueryParameters("md5filename");
                        if (queryParameters2 != null && queryParameters2.size() > 0) {
                            String str5 = queryParameters2.get(0);
                            if (!TextUtils.isEmpty(str5) && str5.equals(C6354n.m16135a(file))) {
                                str3 = m18322a(str, str4, file);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        C6355o.m16144b(file);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                str2 = e.getMessage();
            }
        }
        str2 = str3;
        return str2;
    }

    /* renamed from: a */
    private String m18322a(String str, String str2, File file) {
        String a = C6355o.m16138a(str2, this.f18034b + "/" + SameMD5.getMD5(C6370y.m16237a(str)));
        return TextUtils.isEmpty(a) ? C6355o.m16144b(file) : a;
    }

    /* renamed from: a */
    public final String mo49234a(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.f18034b + "/" + SameMD5.getMD5(C6370y.m16237a(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters("foldername");
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str5 = queryParameters.get(0);
            if (TextUtils.isEmpty(str5)) {
                return null;
            }
            String str6 = str4 + "/" + str5 + "/" + str5 + ".html";
            if (!C6355o.m16142a(str6)) {
                return null;
            }
            try {
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = "?" + str2;
            }
            return Advertisement.FILE_SCHEME + str6 + str3;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
