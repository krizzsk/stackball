package com.mbridge.msdk.foundation.same.report.p181b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.same.p167b.C6211c;
import com.mbridge.msdk.foundation.same.p167b.C6213e;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.b.a */
/* compiled from: CrashHandlerUtil */
public class C6306a implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    private static volatile C6306a f15667c;

    /* renamed from: a */
    Handler f15668a = new Handler() {
        public final void handleMessage(Message message) {
            Context context;
            HashMap hashMap;
            super.handleMessage(message);
            if (message.what == 101 && (context = (Context) C6306a.this.f15669b.get()) != null && (message.obj instanceof HashMap) && (hashMap = (HashMap) message.obj) != null) {
                new C6308c(context).mo43929a((String) hashMap.get("crashinfo"), (File) hashMap.get("file"));
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Context> f15669b;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f15670d;

    /* renamed from: e */
    private Throwable f15671e;

    private C6306a(Context context) {
        this.f15669b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C6306a m15972a(Context context) {
        if (f15667c == null) {
            synchronized (C6306a.class) {
                if (f15667c == null) {
                    f15667c = new C6306a(context);
                }
            }
        }
        return f15667c;
    }

    /* renamed from: a */
    public final void mo43921a() {
        this.f15670d = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    private String m15974a(Throwable th, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            Context context = (Context) this.f15669b.get();
            if (context == null) {
                return "";
            }
            float f = (float) ((((double) Runtime.getRuntime().totalMemory()) * 1.0d) / 1048576.0d);
            float freeMemory = (float) ((((double) Runtime.getRuntime().freeMemory()) * 1.0d) / 1048576.0d);
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            long usableSpace = externalStorageDirectory.getUsableSpace();
            String str3 = "appversionname";
            Object obj = "-1";
            long totalSpace = externalStorageDirectory.getTotalSpace();
            String formatFileSize = Formatter.formatFileSize(context, usableSpace);
            String formatFileSize2 = Formatter.formatFileSize(context, totalSpace);
            jSONObject.put("max_memory", String.valueOf((float) ((((double) Runtime.getRuntime().maxMemory()) * 1.0d) / 1048576.0d)));
            jSONObject.put("memoryby_app", String.valueOf(f));
            jSONObject.put("remaining_memory", (double) freeMemory);
            jSONObject.put("sdcard_remainder", formatFileSize);
            jSONObject.put("totalspacestr", formatFileSize2);
            jSONObject.put("crashtime", str);
            String b = C6121a.m15293a().mo42882b(MBridgeConstans.SDK_APP_ID);
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put(AppsFlyerProperties.APP_ID, b);
            }
            try {
                jSONObject.put("osversion", Build.VERSION.SDK_INT);
                jSONObject.put("appversioncode", m15979b(context));
                str2 = str3;
                try {
                    jSONObject.put(str2, m15981c(context));
                    jSONObject.put("appname", m15982d(context));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str2 = str3;
                jSONObject.put("osversion", 0);
                Object obj2 = obj;
                jSONObject.put("appversioncode", obj2);
                jSONObject.put(str2, obj2);
                jSONObject.put("appname", "");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                jSONObject.put("crashinfo", stringWriter.toString());
                String jSONObject2 = jSONObject.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000052");
                stringBuffer.append("&exception=" + jSONObject2);
                return stringBuffer.toString();
            }
            StringWriter stringWriter2 = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter2));
            jSONObject.put("crashinfo", stringWriter2.toString());
            String jSONObject22 = jSONObject.toString();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("key=2000052");
            stringBuffer2.append("&exception=" + jSONObject22);
            return stringBuffer2.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private int m15979b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: c */
    private static String m15981c(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("", e.getMessage());
            return "";
        }
    }

    /* renamed from: d */
    private String m15982d(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f15671e = th;
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b == null) {
                b = C6076b.m15089a().mo42748b();
            }
            String m = b.mo42720m() == null ? "mbridge" : b.mo42720m();
            List<String> a = m15976a(m, "<mvpackage>(.*?)</mvpackage>");
            if (a.size() > 0) {
                for (int i = 0; i < a.size(); i++) {
                    m15977a(m15973a(th), a.get(i), th, thread);
                }
                return;
            }
            m15977a(m15973a(th), m, th, thread);
        } catch (Exception e) {
            m15978a(thread, th);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m15973a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stackTrace.length; i++) {
            sb.append(stackTrace[i].toString() + "\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m15977a(String str, String str2, Throwable th, Thread thread) {
        if (str.contains(str2)) {
            HashMap<String, Object> b = m15980b();
            if (b != null && b.get("file") != null) {
                Message obtain = Message.obtain();
                HashMap hashMap = new HashMap();
                hashMap.put("crashinfo", m15974a(th, (String) b.get("time")));
                hashMap.put("file", b.get("file"));
                obtain.obj = hashMap;
                obtain.what = 101;
                this.f15668a.sendMessage(obtain);
                m15978a(thread, th);
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f15670d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private List<String> m15976a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m15978a(Thread thread, Throwable th) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }

    /* renamed from: b */
    private HashMap<String, Object> m15980b() {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f15671e == null) {
            return null;
        }
        String b = C6213e.m15725b(C6211c.MBRIDGE_CRASH_INFO);
        File file = new File(b + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(b + "/" + "sdkcrash" + format + ".txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            printWriter.println(m15974a(this.f15671e, format));
            printWriter.println("====");
            this.f15671e.printStackTrace(printWriter);
            printWriter.close();
            hashMap.put("file", file2);
            hashMap.put("time", format);
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
