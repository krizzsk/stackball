package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.inmobi.media.gt */
/* compiled from: ApplicationFocusChangeObserver */
public class C5320gt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12201a = C5320gt.class.getSimpleName();

    /* renamed from: b */
    private static HashSet<C5324c> f12202b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f12203c = false;

    /* renamed from: com.inmobi.media.gt$b */
    /* compiled from: ApplicationFocusChangeObserver */
    static class C5323b {

        /* renamed from: a */
        static final C5320gt f12208a = new C5320gt((byte) 0);
    }

    /* renamed from: com.inmobi.media.gt$c */
    /* compiled from: ApplicationFocusChangeObserver */
    public interface C5324c {
        /* renamed from: a */
        void mo40669a(boolean z);
    }

    /* synthetic */ C5320gt(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5320gt m12247a() {
        return C5323b.f12208a;
    }

    private C5320gt() {
    }

    /* renamed from: a */
    public void mo40660a(Context context, C5324c cVar) {
        if (f12202b == null) {
            f12202b = new LinkedHashSet();
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

                        /* renamed from: b */
                        private final Handler f12205b = new C5322a(Looper.getMainLooper());

                        /* renamed from: c */
                        private WeakReference<Activity> f12206c;

                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        /* renamed from: a */
                        private void m12254a(Activity activity) {
                            WeakReference<Activity> weakReference = this.f12206c;
                            if (weakReference == null || weakReference.get() != activity) {
                                this.f12206c = new WeakReference<>(activity);
                            }
                            this.f12205b.removeMessages(1001);
                            this.f12205b.sendEmptyMessage(1002);
                        }

                        public final void onActivityStarted(Activity activity) {
                            m12254a(activity);
                        }

                        public final void onActivityResumed(Activity activity) {
                            m12254a(activity);
                        }

                        public final void onActivityStopped(Activity activity) {
                            WeakReference<Activity> weakReference = this.f12206c;
                            if (weakReference == null || weakReference.get() == activity) {
                                this.f12205b.sendEmptyMessageDelayed(1001, 3000);
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
        f12202b.add(cVar);
    }

    /* renamed from: b */
    public static void m12249b() {
        f12203c = true;
    }

    /* renamed from: c */
    public static void m12250c() {
        f12203c = false;
    }

    /* renamed from: com.inmobi.media.gt$a */
    /* compiled from: ApplicationFocusChangeObserver */
    static class C5322a extends Handler {

        /* renamed from: a */
        boolean f12207a = true;

        C5322a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (!C5320gt.f12203c) {
                if (message.what == 1001 && this.f12207a) {
                    this.f12207a = false;
                    C5320gt.m12248a(false);
                    String unused = C5320gt.f12201a;
                } else if (message.what == 1002 && !this.f12207a) {
                    this.f12207a = true;
                    C5320gt.m12248a(true);
                    String unused2 = C5320gt.f12201a;
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12248a(boolean z) {
        if (C5314go.m12203c() != null) {
            Iterator<C5324c> it = f12202b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo40669a(z);
                } catch (Exception unused) {
                }
            }
        }
    }
}
