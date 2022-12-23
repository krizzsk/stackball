package com.mbridge.msdk.click;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.p171f.C6233b;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.click.b */
/* compiled from: CommonClickUtil */
public final class C6103b {

    /* renamed from: a */
    static Handler f15059a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            String str;
            String str2;
            String str3;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string = data.getString("rid");
                        String string2 = data.getString("cid_n");
                        str = data.getString(BidResponsedEx.KEY_CID);
                        str3 = string;
                        str2 = string2;
                    } else {
                        str3 = "";
                        str2 = str3;
                        str = str2;
                    }
                    new C6308c(C6122a.m15302b().mo42895d()).mo43925a(i, i2, str3, str2, str);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    };

    /* renamed from: a */
    public static void m15226a(Context context, String str) {
        if (str != null && context != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null) {
                    intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                }
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m15227b(Context context, String str) {
        if (context != null && str != null) {
            try {
                Class.forName("com.mbridge.msdk.activity.MBCommonActivity");
                Intent intent = new Intent(context, Class.forName("com.mbridge.msdk.activity.MBCommonActivity"));
                intent.putExtra("url", str);
                if (!(context instanceof ContextThemeWrapper)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (ClassNotFoundException e) {
                C6361q.m16158d("CommonClickUtil", e.getMessage());
            } catch (Throwable th) {
                C6361q.m16158d("CommonClickUtil", th.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static boolean m15228c(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m15229d(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setData(parse);
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            C6361q.m16155a("CommonClickUtil", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: e */
    public static void m15230e(Context context, String str) {
        Intent launchIntentForPackage;
        ResolveInfo next;
        try {
            if (!TextUtils.isEmpty(str) && m15228c(context, str) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0);
                if (queryIntentActivities.size() > 0 && (next = queryIntentActivities.iterator().next()) != null) {
                    ComponentName componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static String m15224a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    str = str.replaceAll(next, str2);
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m15223a(String str, String str2, String str3) {
        Map<String, C6072a.C6073a> L;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b == null || (L = b.mo42667L()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            for (Map.Entry<String, C6072a.C6073a> key : L.entrySet()) {
                String str4 = (String) key.getKey();
                if (!TextUtils.isEmpty(str4) && host.contains(str4)) {
                    C6072a.C6073a aVar = L.get(str4);
                    if (aVar != null) {
                        return m15224a(m15224a(m15224a(m15224a(str, aVar.mo42742d(), String.valueOf((float) C6349m.m16112i(C6122a.m15302b().mo42895d()))), aVar.mo42741c(), String.valueOf((float) C6349m.m16111h(C6122a.m15302b().mo42895d()))), aVar.mo42738a(), str2), aVar.mo42740b(), str3);
                    }
                    return str;
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public static void m15225a(final Context context, int i, final String str) {
        if (i != 0) {
            try {
                C6233b.m15776a().execute(new Runnable() {
                    public final void run() {
                        try {
                            Method method = Class.forName("com.mbridge.msdk.foundation.tools.j").getMethod("mia", new Class[]{Context.class, String.class});
                            if (context == null) {
                                method.invoke((Object) null, new Object[]{C6122a.m15302b().mo42895d(), str});
                                return;
                            }
                            method.invoke((Object) null, new Object[]{context, str});
                        } catch (Throwable th) {
                            C6361q.m16158d("CommonClickUtil", th.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                C6361q.m16158d("CommonClickUtil", th.getMessage());
            }
        }
    }
}
