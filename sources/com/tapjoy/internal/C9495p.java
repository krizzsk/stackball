package com.tapjoy.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.tapjoy.TapjoyConstants;
import java.sql.Timestamp;

/* renamed from: com.tapjoy.internal.p */
public abstract class C9495p extends C9496q {

    /* renamed from: a */
    public final Context f23599a;

    /* renamed from: b */
    public final C9497r f23600b;

    /* renamed from: c */
    private boolean f23601c = false;

    public C9495p(Context context, C9497r rVar) {
        this.f23599a = context.getApplicationContext();
        this.f23600b = rVar;
    }

    /* renamed from: b */
    private boolean m25505b() {
        boolean e = this.f23600b.mo58281e(this.f23599a);
        if (!e) {
            return e;
        }
        long f = this.f23600b.mo58282f(this.f23599a);
        if (f == 0 || System.currentTimeMillis() <= f) {
            return e;
        }
        new Timestamp(f);
        return false;
    }

    /* renamed from: a */
    public final boolean mo58490a() {
        String a = this.f23600b.mo58270a(this.f23599a);
        if (C9465jq.m25449c(a)) {
            return false;
        }
        mo58489a(a);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58489a(String str) {
        String b = this.f23600b.mo58275b(this.f23599a);
        if (b.length() == 0) {
            mo58269e(str);
        } else if (!str.equals(this.f23600b.mo58270a(this.f23599a))) {
            mo58269e(str);
        } else {
            int d = this.f23600b.mo58280d(this.f23599a);
            int a = C9509z.m25552a(this.f23599a);
            if (d != Integer.MIN_VALUE && d != a) {
                Integer.valueOf(d);
                Integer.valueOf(a);
                mo58269e(str);
            } else if (this.f23600b.mo58279c(this.f23599a)) {
                mo58269e(str);
            } else if (!m25505b()) {
                mo58264a(this.f23599a, b);
            }
        }
    }

    /* renamed from: e */
    private void mo58269e(String str) {
        this.f23600b.mo58273a(this.f23599a, str);
        this.f23600b.mo58274a(this.f23599a, true);
        if ((this.f23601c || !m25506b(this.f23599a, str)) && m25507c(this.f23599a, str)) {
        }
    }

    /* renamed from: b */
    private static boolean m25506b(Context context, String str) {
        try {
            int b = C9509z.m25554b(context.getPackageManager(), "com.google.android.gms");
            if (b >= 3159130) {
                Integer.valueOf(b);
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                m25504b(context, intent);
                intent.putExtra("sender", str);
                if (context.startService(intent) != null) {
                    return true;
                }
                return false;
            }
            Integer.valueOf(b);
            return false;
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: c */
    private static boolean m25507c(Context context, String str) {
        try {
            Integer.valueOf(C9509z.m25554b(context.getPackageManager(), "com.google.android.gsf"));
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gsf");
            m25504b(context, intent);
            intent.putExtra("sender", str);
            if (context.startService(intent) != null) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: b */
    private static void m25504b(Context context, Intent intent) {
        intent.putExtra(TapjoyConstants.TJC_APP_PLACEMENT, PendingIntent.getBroadcast(context, 0, new Intent(), 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58488a(Context context) {
        this.f23600b.mo58276b(context, (int) PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    /* renamed from: a */
    public final boolean mo58491a(Intent intent) {
        String str;
        String stringExtra;
        boolean z;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra2 = intent.getStringExtra("registration_id");
            String stringExtra3 = intent.getStringExtra("unregistered");
            String stringExtra4 = intent.getStringExtra("error");
            if (stringExtra2 != null) {
                if (stringExtra2.length() > 0) {
                    if (stringExtra2.startsWith("|")) {
                        return false;
                    }
                    m25509f(stringExtra2);
                    return false;
                } else if (stringExtra3 == null && stringExtra4 == null && !this.f23601c) {
                    this.f23601c = true;
                    mo58490a();
                    return true;
                }
            }
            if (stringExtra3 != null) {
                String b = this.f23600b.mo58275b(this.f23599a);
                mo58488a(this.f23599a);
                this.f23600b.mo58278b(this.f23599a, false);
                this.f23600b.mo58277b(this.f23599a, "");
                this.f23600b.mo58274a(this.f23599a, true);
                mo58266b(b);
                return false;
            } else if (stringExtra4 == null) {
                return false;
            } else {
                if ("SERVICE_NOT_AVAILABLE".equals(stringExtra4)) {
                    z = mo58267c(stringExtra4);
                } else if (!this.f23601c) {
                    mo58267c(stringExtra4);
                    this.f23601c = true;
                    mo58490a();
                    return true;
                } else {
                    z = mo58268d(stringExtra4);
                }
                if (z) {
                    int g = this.f23600b.mo58283g(this.f23599a);
                    Integer.valueOf(g);
                    Intent intent2 = new Intent("com.google.android.gcm.intent.RETRY");
                    intent2.setPackage(this.f23599a.getPackageName());
                    ((AlarmManager) this.f23599a.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(3, SystemClock.elapsedRealtime() + ((long) g), PendingIntent.getBroadcast(this.f23599a, 0, intent2, 0));
                    if (g < 3600000) {
                        this.f23600b.mo58276b(this.f23599a, g * 2);
                    }
                }
                return true;
            }
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
            String stringExtra5 = intent.getStringExtra("message_type");
            if (stringExtra5 == null) {
                return mo58265a(this.f23599a, intent);
            }
            if ("deleted_messages".equals(stringExtra5) && (stringExtra = intent.getStringExtra("total_deleted")) != null) {
                try {
                    int parseInt = Integer.parseInt(stringExtra);
                    Integer.valueOf(parseInt);
                    mo58263a(parseInt);
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        } else if (!"com.google.android.gcm.intent.RETRY".equals(action) || (str = intent.getPackage()) == null || !str.equals(this.f23599a.getPackageName())) {
            return false;
        } else {
            mo58490a();
            return true;
        }
    }

    /* renamed from: f */
    private synchronized void m25509f(String str) {
        mo58488a(this.f23599a);
        this.f23600b.mo58274a(this.f23599a, false);
        this.f23600b.mo58271a(this.f23599a, C9509z.m25552a(this.f23599a));
        if (!str.equals(this.f23600b.mo58275b(this.f23599a))) {
            this.f23600b.mo58278b(this.f23599a, false);
            this.f23600b.mo58277b(this.f23599a, str);
            mo58264a(this.f23599a, str);
        } else if (!m25505b()) {
            mo58264a(this.f23599a, str);
        }
    }
}
