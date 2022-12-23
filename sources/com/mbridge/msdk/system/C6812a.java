package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.controller.C6130b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.same.net.C6299n;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.report.C6301a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.tools.C6338i;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.mbridge.msdk.system.a */
/* compiled from: MBridgeSDKImpl */
public final class C6812a implements MBridgeSDK {

    /* renamed from: a */
    public static Map<String, String> f16823a;

    /* renamed from: b */
    private static final Lock f16824b = new ReentrantReadWriteLock().writeLock();

    /* renamed from: c */
    private volatile MBridgeSDK.PLUGIN_LOAD_STATUS f16825c = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;

    /* renamed from: d */
    private Context f16826d;

    /* renamed from: e */
    private SDKInitStatusListener f16827e;

    /* renamed from: f */
    private boolean f16828f = false;

    /* renamed from: g */
    private final Application.ActivityLifecycleCallbacks f16829g = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C6338i.m16066a().mo43942c();
        }

        public final void onActivityStarted(Activity activity) {
            int c = C6122a.m15302b().mo42892c();
            if (c == 0) {
                C6323d.m16040a("1");
            }
            C6122a.m15302b().mo42890b(c + 1);
        }

        public final void onActivityStopped(Activity activity) {
            int c = C6122a.m15302b().mo42892c();
            if (c <= 1) {
                C6323d.m16040a("2");
            }
            C6122a.m15302b().mo42890b(c - 1);
        }

        public final void onActivityDestroyed(Activity activity) {
            C6338i.m16066a().mo43943d();
        }
    };

    public final void setThirdPartyFeatures(Map<String, Object> map) {
    }

    public final void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }

    public final void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
    }

    /* renamed from: a */
    private void m17200a() {
        f16824b.lock();
        this.f16828f = false;
        try {
            if (this.f16826d instanceof Application) {
                ((Application) this.f16826d).registerActivityLifecycleCallbacks(this.f16829g);
            }
            C6299n.m15941a(this.f16826d);
            C6130b.m15341a().mo42929a((Map) f16823a, this.f16826d);
            this.f16825c = MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
            C6280d.m15868c().mo43861d();
            HandlerThread handlerThread = new HandlerThread("mb_db_thread");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
            builder.setDatabaseHandler(handler);
            builder.setDatabaseOpenHelper(new IDatabaseOpenHelper() {
                public final SQLiteDatabase getReadableDatabase() {
                    return C6148f.m15420a(C6122a.m15302b().mo42895d()).mo42996a();
                }

                public final SQLiteDatabase getWritableDatabase() {
                    return C6148f.m15420a(C6122a.m15302b().mo42895d()).mo42999b();
                }
            });
            builder.setLogger(new ILogger() {
                public final void log(String str, String str2) {
                    C6361q.m16154a(str, str2);
                }

                public final void log(String str, Exception exc) {
                    C6361q.m16154a(str, exc.getMessage());
                }
            });
            MBDownloadManager.getInstance().initialize(C6122a.m15302b().mo42895d(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100).setMaxStorageTime(259200000).build());
            C6301a.m15945a().mo43912b();
            if (this.f16827e != null && !this.f16828f) {
                this.f16828f = true;
                this.f16827e.onInitSuccess();
            }
            try {
                C6338i.m16066a().mo43937a(this.f16826d.getApplicationContext());
            } catch (Exception e) {
                C6361q.m16155a("com.mbridge.msdk", "INIT", e);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C6361q.m16155a("com.mbridge.msdk", "INIT FAIL", e2);
                e2.printStackTrace();
            }
            SDKInitStatusListener sDKInitStatusListener = this.f16827e;
            if (sDKInitStatusListener != null && !this.f16828f) {
                this.f16828f = true;
                sDKInitStatusListener.onInitFail(e2.getMessage());
            }
        }
        f16824b.unlock();
    }

    public final MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.f16825c;
    }

    public final void preload(Map<String, Object> map) {
        if (this.f16825c == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C6130b.m15341a().mo42928a(map, 0);
        }
    }

    public final void setUserPrivateInfoType(Context context, String str, int i) {
        m17201a(context);
        C6129a.m15330a().mo42921a(str, i);
    }

    public final void setDoNotTrackStatus(boolean z) {
        C6129a.m15330a().mo42924b(z ? 1 : 0);
    }

    public final void setDoNotTrackStatus(Context context, boolean z) {
        m17201a(context);
        C6129a.m15330a().mo42924b(z ? 1 : 0);
    }

    public final AuthorityInfoBean userPrivateInfo(Context context) {
        m17201a(context);
        return C6129a.m15330a().mo42923b();
    }

    public final void setConsentStatus(Context context, int i) {
        m17201a(context);
        C6129a.m15330a().mo42920a(i);
    }

    public final boolean getConsentStatus(Context context) {
        m17201a(context);
        return C6129a.m15330a().mo42926d();
    }

    public final void preloadFrame(Map<String, Object> map) {
        C6130b.m15341a().mo42928a(map, 1);
    }

    public final Map<String, String> getMBConfigurationMap(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        return hashMap;
    }

    public final void release() {
        if (this.f16825c == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C6130b.m15341a().mo42930b();
        }
        Context context = this.f16826d;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this.f16829g);
        }
    }

    public final void init(Map<String, String> map, Application application) {
        this.f16826d = application.getApplicationContext();
        f16823a = map;
        m17200a();
    }

    public final void initAsync(Map<String, String> map, Application application) {
        this.f16826d = application.getApplicationContext();
        f16823a = map;
        m17200a();
    }

    public final void init(Map<String, String> map, Context context) {
        this.f16826d = context.getApplicationContext();
        f16823a = map;
        m17200a();
    }

    public final void initAsync(Map<String, String> map, Context context) {
        this.f16826d = context.getApplicationContext();
        f16823a = map;
        m17200a();
    }

    public final void init(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.f16826d = application;
        this.f16827e = sDKInitStatusListener;
        f16823a = map;
        m17200a();
    }

    public final void initAsync(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.f16826d = application;
        this.f16827e = sDKInitStatusListener;
        f16823a = map;
        m17200a();
    }

    public final void init(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.f16826d = context.getApplicationContext();
        this.f16827e = sDKInitStatusListener;
        f16823a = map;
        m17200a();
    }

    public final void initAsync(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.f16826d = context.getApplicationContext();
        this.f16827e = sDKInitStatusListener;
        f16823a = map;
        m17200a();
    }

    /* renamed from: a */
    private void m17201a(Context context) {
        if (C6122a.m15302b().mo42895d() == null && context != null) {
            C6122a.m15302b().mo42886a(context);
        }
    }
}
