package com.tapjoy.internal;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;

/* renamed from: com.tapjoy.internal.hb */
public final class C9355hb extends C9495p {

    /* renamed from: c */
    private static C9355hb f23152c;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo58267c(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo58268d(String str) {
        return false;
    }

    /* renamed from: b */
    public static synchronized C9355hb m25106b(Context context) {
        C9355hb hbVar;
        synchronized (C9355hb.class) {
            if (f23152c == null) {
                f23152c = new C9355hb(context);
            }
            hbVar = f23152c;
        }
        return hbVar;
    }

    private C9355hb(Context context) {
        super(context, new C9497r() {
            /* renamed from: a */
            public final String mo58270a(Context context) {
                return C9368hj.m25178a(context).f23199b.getString("gcm.senderIds", "");
            }

            /* renamed from: a */
            public final void mo58273a(Context context, String str) {
                C9493n.m25499a(C9368hj.m25178a(context).f23199b, "gcm.senderIds", str);
            }

            /* renamed from: b */
            public final String mo58275b(Context context) {
                return C9368hj.m25178a(context).f23199b.getString("gcm.regId", "");
            }

            /* renamed from: b */
            public final void mo58277b(Context context, String str) {
                C9493n.m25499a(C9368hj.m25178a(context).f23199b, "gcm.regId", str);
            }

            /* renamed from: c */
            public final boolean mo58279c(Context context) {
                return C9368hj.m25178a(context).f23199b.getBoolean("gcm.stale", true);
            }

            /* renamed from: a */
            public final void mo58274a(Context context, boolean z) {
                C9493n.m25500a(C9368hj.m25178a(context).f23199b, "gcm.stale", z);
            }

            /* renamed from: d */
            public final int mo58280d(Context context) {
                return C9368hj.m25178a(context).f23199b.getInt("gcm.appVersion", Integer.MIN_VALUE);
            }

            /* renamed from: a */
            public final void mo58271a(Context context, int i) {
                C9493n.m25498a(C9368hj.m25178a(context).f23199b, "gcm.appVersion", i);
            }

            /* renamed from: e */
            public final boolean mo58281e(Context context) {
                return C9368hj.m25178a(context).f23199b.getBoolean("gcm.onServer", false);
            }

            /* renamed from: b */
            public final void mo58278b(Context context, boolean z) {
                C9368hj.m25178a(context).mo58307a(z);
            }

            /* renamed from: f */
            public final long mo58282f(Context context) {
                return C9368hj.m25178a(context).f23199b.getLong("gcm.onServerExpirationTime", 0);
            }

            /* renamed from: a */
            public final void mo58272a(Context context, long j) {
                SharedPreferences.Editor edit = C9368hj.m25178a(context).f23199b.edit();
                edit.putLong("gcm.onServerExpirationTime", j);
                edit.apply();
            }

            /* renamed from: g */
            public final int mo58283g(Context context) {
                return C9368hj.m25178a(context).f23199b.getInt("gcm.backoff", 0);
            }

            /* renamed from: b */
            public final void mo58276b(Context context, int i) {
                C9493n.m25498a(C9368hj.m25178a(context).f23199b, "gcm.backoff", i);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo58269e(String str) {
        if (str != null && str.length() > 0) {
            super.mo58488a(this.f23599a);
            super.mo58489a(new String[]{str}[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58264a(Context context, String str) {
        C9344gz.m25061a(context).mo58241a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58266b(String str) {
        mo58490a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58265a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        intent.getExtras();
        String stringExtra = intent2.getStringExtra("fiverocks");
        if (stringExtra == null) {
            return false;
        }
        if (C9357hc.m25129a(context).mo58297f()) {
            C9344gz.m25061a(context).mo58249b(stringExtra);
            return true;
        }
        String stringExtra2 = intent2.getStringExtra("title");
        String stringExtra3 = intent2.getStringExtra("message");
        if (stringExtra3 != null) {
            Bundle extras = intent.getExtras();
            Object obj = extras.get("rich");
            Object obj2 = extras.get("sound");
            String string = extras.getString("payload");
            Object obj3 = extras.get("always");
            boolean z = "true".equals(obj3) || Boolean.TRUE.equals(obj3);
            Object obj4 = extras.get("repeatable");
            boolean z2 = "true".equals(obj4) || Boolean.TRUE.equals(obj4);
            String string2 = extras.getString("placement");
            int b = m25105b(extras.get("nid"));
            String string3 = extras.getString("channel_id");
            if (z || !C9344gz.m25061a(context).mo58252d()) {
                Notification a = m25102a(context, stringExtra, C9465jq.m25447a(stringExtra2), stringExtra3, m25104a(obj), m25104a(obj2), string, string2, b, string3);
                if (C9344gz.m25061a(context).mo58246a(context2, stringExtra, z2)) {
                    m25103a(context2, b, a);
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m25104a(Object obj) {
        return Boolean.TRUE.equals(obj) || "true".equals(obj);
    }

    /* renamed from: b */
    public static int m25105b(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58263a(int i) {
        Integer.valueOf(i);
    }

    /* renamed from: a */
    public static void m25103a(Context context, int i, Notification notification) {
        ((NotificationManager) context.getSystemService("notification")).notify(i, notification);
    }

    /* renamed from: a */
    private static int m25101a(Bundle bundle, String str, Context context) {
        if (bundle != null) {
            Object obj = bundle.get(str);
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                try {
                    if ("drawable".equals(context.getResources().getResourceTypeName(intValue))) {
                        return intValue;
                    }
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (obj != null) {
                Object[] objArr = {str};
                if (C9340gw.f23095a) {
                    C9507x.m25549a(4, "Tapjoy", "meta-data of {} invalid", objArr);
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.text.Spanned] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r7 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r5 = android.text.Html.fromHtml(r5);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification m25102a(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12) {
        /*
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.getApplicationContext()
            java.lang.Class<com.tapjoy.TapjoyReceiver> r2 = com.tapjoy.TapjoyReceiver.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "com.tapjoy.PUSH_CLICK"
            r0.setAction(r1)
            java.lang.String r1 = "com.tapjoy.PUSH_ID"
            r0.putExtra(r1, r4)
            if (r9 == 0) goto L_0x001c
            java.lang.String r4 = "com.tapjoy.PUSH_PAYLOAD"
            r0.putExtra(r4, r9)
        L_0x001c:
            if (r10 == 0) goto L_0x0023
            java.lang.String r4 = "com.tapjoy.PUSH_PLACEMENT"
            r0.putExtra(r4, r10)
        L_0x0023:
            r4 = 134217728(0x8000000, float:3.85186E-34)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 19
            if (r9 != r10) goto L_0x002d
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x002d:
            android.content.Context r9 = r3.getApplicationContext()
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r9, r11, r0, r4)
            r9 = 0
            if (r4 != 0) goto L_0x0039
            return r9
        L_0x0039:
            android.content.pm.PackageManager r10 = r3.getPackageManager()
            java.lang.String r11 = r3.getPackageName()
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r11 = r10.getApplicationInfo(r11, r0)     // Catch:{ NameNotFoundException -> 0x00fc }
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0052
            java.lang.CharSequence r5 = r10.getApplicationLabel(r11)
            goto L_0x0058
        L_0x0052:
            if (r7 == 0) goto L_0x0058
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
        L_0x0058:
            if (r7 == 0) goto L_0x005e
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)
        L_0x005e:
            android.os.Bundle r7 = r11.metaData
            java.lang.String r10 = "com.tapjoy.notification.icon"
            int r7 = m25101a((android.os.Bundle) r7, (java.lang.String) r10, (android.content.Context) r3)
            if (r7 != 0) goto L_0x0072
            int r7 = r11.icon
            if (r7 == 0) goto L_0x006f
            int r7 = r11.icon
            goto L_0x0072
        L_0x006f:
            r7 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0072:
            android.os.Bundle r10 = r11.metaData
            java.lang.String r0 = "com.tapjoy.notification.icon.large"
            int r10 = m25101a((android.os.Bundle) r10, (java.lang.String) r0, (android.content.Context) r3)
            if (r10 == 0) goto L_0x0085
            android.content.res.Resources r0 = r3.getResources()
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeResource(r0, r10)
            goto L_0x0086
        L_0x0085:
            r10 = r9
        L_0x0086:
            java.lang.String r0 = "tapjoy"
            if (r12 != 0) goto L_0x0096
            android.os.Bundle r1 = r11.metaData
            if (r1 == 0) goto L_0x0096
            android.os.Bundle r11 = r11.metaData
            java.lang.String r12 = "com.tapjoy.notification.default_channel_id"
            java.lang.String r12 = r11.getString(r12, r0)
        L_0x0096:
            int r11 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r11 < r1) goto L_0x00bb
            java.lang.String r9 = "notification"
            java.lang.Object r9 = r3.getSystemService(r9)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            if (r12 == 0) goto L_0x00af
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r12)
            if (r11 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r9 = r12
            goto L_0x00bb
        L_0x00af:
            android.app.NotificationChannel r11 = new android.app.NotificationChannel
            r12 = 3
            java.lang.String r1 = "Tapjoy"
            r11.<init>(r0, r1, r12)
            r9.createNotificationChannel(r11)
            r9 = r0
        L_0x00bb:
            com.tapjoy.internal.ji$c r11 = new com.tapjoy.internal.ji$c
            r11.<init>(r3, r9)
            com.tapjoy.internal.ji$c r3 = r11.mo58433a((int) r7)
            com.tapjoy.internal.ji$c r3 = r3.mo58441c(r5)
            com.tapjoy.internal.ji$c r3 = r3.mo58437a((java.lang.CharSequence) r5)
            com.tapjoy.internal.ji$c r3 = r3.mo58439b(r6)
            com.tapjoy.internal.ji$c r3 = r3.mo58434a((android.app.PendingIntent) r4)
            com.tapjoy.internal.ji$c r3 = r3.mo58432a()
            com.tapjoy.internal.ji$c r3 = r3.mo58440c()
            com.tapjoy.internal.ji$b r4 = new com.tapjoy.internal.ji$b
            r4.<init>()
            com.tapjoy.internal.ji$b r4 = r4.mo58429a((java.lang.CharSequence) r5)
            com.tapjoy.internal.ji$b r4 = r4.mo58431b(r6)
            com.tapjoy.internal.ji$c r3 = r3.mo58436a((com.tapjoy.internal.C9452ji.C9456d) r4)
            if (r8 == 0) goto L_0x00f2
            r3.mo58438b()
        L_0x00f2:
            if (r10 == 0) goto L_0x00f7
            r3.mo58435a((android.graphics.Bitmap) r10)
        L_0x00f7:
            android.app.Notification r3 = r3.mo58442d()
            return r3
        L_0x00fc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9355hb.m25102a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, java.lang.String):android.app.Notification");
    }
}
