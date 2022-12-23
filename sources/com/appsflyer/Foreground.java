package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Foreground {
    public static long CHECK_DELAY = 500;
    public static Listener listener;

    public interface Listener {
        void onBecameBackground(Context context);

        void onBecameForeground(Activity activity);
    }

    /* renamed from: ǃ */
    static void m3812(Context context, final Listener listener2) {
        listener = listener2;
        C17262 r0 = new Application.ActivityLifecycleCallbacks() {

            /* renamed from: ı */
            private Executor f4082 = Executors.newSingleThreadExecutor();

            /* renamed from: Ι */
            boolean f4084 = true;

            /* renamed from: ι */
            boolean f4085;

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivityResumed(final Activity activity) {
                this.f4082.execute(new Runnable() {
                    public final void run() {
                        if (!C17262.this.f4085) {
                            try {
                                listener2.onBecameForeground(activity);
                            } catch (Exception e) {
                                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
                            }
                        }
                        C17262.this.f4084 = false;
                        C17262.this.f4085 = true;
                    }
                });
            }

            public final void onActivityPaused(final Activity activity) {
                this.f4082.execute(new Runnable() {
                    public final void run() {
                        C17262.this.f4084 = true;
                        final Context applicationContext = activity.getApplicationContext();
                        try {
                            new Timer().schedule(new TimerTask() {
                                public final void run() {
                                    if (C17262.this.f4085 && C17262.this.f4084) {
                                        C17262.this.f4085 = false;
                                        try {
                                            listener2.onBecameBackground(applicationContext);
                                        } catch (Exception e) {
                                            AFLogger.afErrorLog("Listener threw exception! ", e);
                                        }
                                    }
                                }
                            }, Foreground.CHECK_DELAY);
                        } catch (Throwable th) {
                            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
                        }
                    }
                });
            }

            public final void onActivityCreated(final Activity activity, Bundle bundle) {
                this.f4082.execute(new Runnable() {
                    public final void run() {
                        AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
                    }
                });
            }
        };
        if (context instanceof Activity) {
            r0.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r0);
    }
}
