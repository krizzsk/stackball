package com.tapjoy.internal;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompatExtras;
import java.util.ArrayList;

/* renamed from: com.tapjoy.internal.ji */
public final class C9452ji {

    /* renamed from: com.tapjoy.internal.ji$a */
    public static class C9453a {

        /* renamed from: a */
        final Bundle f23483a;

        /* renamed from: b */
        final C9459jl[] f23484b;

        /* renamed from: c */
        final C9459jl[] f23485c;

        /* renamed from: d */
        boolean f23486d;

        /* renamed from: e */
        public int f23487e;

        /* renamed from: f */
        public CharSequence f23488f;

        /* renamed from: g */
        public PendingIntent f23489g;
    }

    /* renamed from: com.tapjoy.internal.ji$c */
    public static class C9455c {

        /* renamed from: A */
        Bundle f23491A;

        /* renamed from: B */
        int f23492B = 0;

        /* renamed from: C */
        int f23493C = 0;

        /* renamed from: D */
        Notification f23494D;

        /* renamed from: E */
        RemoteViews f23495E;

        /* renamed from: F */
        RemoteViews f23496F;

        /* renamed from: G */
        RemoteViews f23497G;

        /* renamed from: H */
        String f23498H;

        /* renamed from: I */
        int f23499I = 0;

        /* renamed from: J */
        String f23500J;

        /* renamed from: K */
        long f23501K;

        /* renamed from: L */
        int f23502L = 0;

        /* renamed from: M */
        Notification f23503M;
        @Deprecated

        /* renamed from: N */
        public ArrayList f23504N;

        /* renamed from: a */
        public Context f23505a;

        /* renamed from: b */
        public ArrayList f23506b = new ArrayList();

        /* renamed from: c */
        CharSequence f23507c;

        /* renamed from: d */
        CharSequence f23508d;

        /* renamed from: e */
        PendingIntent f23509e;

        /* renamed from: f */
        PendingIntent f23510f;

        /* renamed from: g */
        RemoteViews f23511g;

        /* renamed from: h */
        Bitmap f23512h;

        /* renamed from: i */
        CharSequence f23513i;

        /* renamed from: j */
        int f23514j;

        /* renamed from: k */
        int f23515k;

        /* renamed from: l */
        boolean f23516l = true;

        /* renamed from: m */
        boolean f23517m;

        /* renamed from: n */
        C9456d f23518n;

        /* renamed from: o */
        CharSequence f23519o;

        /* renamed from: p */
        CharSequence[] f23520p;

        /* renamed from: q */
        int f23521q;

        /* renamed from: r */
        int f23522r;

        /* renamed from: s */
        boolean f23523s;

        /* renamed from: t */
        String f23524t;

        /* renamed from: u */
        boolean f23525u;

        /* renamed from: v */
        String f23526v;

        /* renamed from: w */
        boolean f23527w = false;

        /* renamed from: x */
        boolean f23528x;

        /* renamed from: y */
        boolean f23529y;

        /* renamed from: z */
        String f23530z;

        public C9455c(Context context, String str) {
            Notification notification = new Notification();
            this.f23503M = notification;
            this.f23505a = context;
            this.f23498H = str;
            notification.when = System.currentTimeMillis();
            this.f23503M.audioStreamType = -1;
            this.f23515k = 0;
            this.f23504N = new ArrayList();
        }

        /* renamed from: a */
        public final C9455c mo58433a(int i) {
            this.f23503M.icon = i;
            return this;
        }

        /* renamed from: a */
        public final C9455c mo58437a(CharSequence charSequence) {
            this.f23507c = m25422d(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C9455c mo58439b(CharSequence charSequence) {
            this.f23508d = m25422d(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C9455c mo58434a(PendingIntent pendingIntent) {
            this.f23509e = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public final C9455c mo58441c(CharSequence charSequence) {
            this.f23503M.tickerText = m25422d(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C9455c mo58435a(Bitmap bitmap) {
            this.f23512h = bitmap;
            return this;
        }

        /* renamed from: b */
        public final C9455c mo58438b() {
            this.f23503M.defaults = 1;
            return this;
        }

        /* renamed from: c */
        public final C9455c mo58440c() {
            this.f23515k = 0;
            return this;
        }

        /* renamed from: a */
        public final C9455c mo58436a(C9456d dVar) {
            if (this.f23518n != dVar) {
                this.f23518n = dVar;
                if (dVar != null) {
                    dVar.mo58443a(this);
                }
            }
            return this;
        }

        /* renamed from: d */
        public final Notification mo58442d() {
            Notification notification;
            C9457jj jjVar = new C9457jj(this);
            C9456d dVar = jjVar.f23536b.f23518n;
            if (dVar != null) {
                dVar.mo58430a((C9451jh) jjVar);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                notification = jjVar.f23535a.build();
            } else if (Build.VERSION.SDK_INT >= 24) {
                notification = jjVar.f23535a.build();
                if (jjVar.f23541g != 0) {
                    if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || jjVar.f23541g != 2)) {
                        C9457jj.m25436a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && jjVar.f23541g == 1) {
                        C9457jj.m25436a(notification);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                jjVar.f23535a.setExtras(jjVar.f23540f);
                notification = jjVar.f23535a.build();
                if (jjVar.f23537c != null) {
                    notification.contentView = jjVar.f23537c;
                }
                if (jjVar.f23538d != null) {
                    notification.bigContentView = jjVar.f23538d;
                }
                if (jjVar.f23542h != null) {
                    notification.headsUpContentView = jjVar.f23542h;
                }
                if (jjVar.f23541g != 0) {
                    if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || jjVar.f23541g != 2)) {
                        C9457jj.m25436a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && jjVar.f23541g == 1) {
                        C9457jj.m25436a(notification);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 20) {
                jjVar.f23535a.setExtras(jjVar.f23540f);
                notification = jjVar.f23535a.build();
                if (jjVar.f23537c != null) {
                    notification.contentView = jjVar.f23537c;
                }
                if (jjVar.f23538d != null) {
                    notification.bigContentView = jjVar.f23538d;
                }
                if (jjVar.f23541g != 0) {
                    if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || jjVar.f23541g != 2)) {
                        C9457jj.m25436a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && jjVar.f23541g == 1) {
                        C9457jj.m25436a(notification);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                SparseArray a = C9458jk.m25441a(jjVar.f23539e);
                if (a != null) {
                    jjVar.f23540f.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a);
                }
                jjVar.f23535a.setExtras(jjVar.f23540f);
                notification = jjVar.f23535a.build();
                if (jjVar.f23537c != null) {
                    notification.contentView = jjVar.f23537c;
                }
                if (jjVar.f23538d != null) {
                    notification.bigContentView = jjVar.f23538d;
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                notification = jjVar.f23535a.build();
                Bundle a2 = C9452ji.m25418a(notification);
                Bundle bundle = new Bundle(jjVar.f23540f);
                for (String str : jjVar.f23540f.keySet()) {
                    if (a2.containsKey(str)) {
                        bundle.remove(str);
                    }
                }
                a2.putAll(bundle);
                SparseArray a3 = C9458jk.m25441a(jjVar.f23539e);
                if (a3 != null) {
                    C9452ji.m25418a(notification).putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a3);
                }
                if (jjVar.f23537c != null) {
                    notification.contentView = jjVar.f23537c;
                }
                if (jjVar.f23538d != null) {
                    notification.bigContentView = jjVar.f23538d;
                }
            } else {
                notification = jjVar.f23535a.getNotification();
            }
            if (jjVar.f23536b.f23495E != null) {
                notification.contentView = jjVar.f23536b.f23495E;
            }
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT >= 16 && dVar != null) {
                C9452ji.m25418a(notification);
            }
            return notification;
        }

        /* renamed from: d */
        protected static CharSequence m25422d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public final C9455c mo58432a() {
            this.f23503M.flags |= 16;
            return this;
        }
    }

    /* renamed from: com.tapjoy.internal.ji$d */
    public static abstract class C9456d {

        /* renamed from: a */
        protected C9455c f23531a;

        /* renamed from: b */
        CharSequence f23532b;

        /* renamed from: c */
        CharSequence f23533c;

        /* renamed from: d */
        boolean f23534d = false;

        /* renamed from: a */
        public void mo58430a(C9451jh jhVar) {
        }

        /* renamed from: a */
        public final void mo58443a(C9455c cVar) {
            if (this.f23531a != cVar) {
                this.f23531a = cVar;
                if (cVar != null) {
                    cVar.mo58436a(this);
                }
            }
        }
    }

    /* renamed from: com.tapjoy.internal.ji$b */
    public static class C9454b extends C9456d {

        /* renamed from: e */
        private CharSequence f23490e;

        /* renamed from: a */
        public final C9454b mo58429a(CharSequence charSequence) {
            this.f23532b = C9455c.m25422d(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C9454b mo58431b(CharSequence charSequence) {
            this.f23490e = C9455c.m25422d(charSequence);
            return this;
        }

        /* renamed from: a */
        public final void mo58430a(C9451jh jhVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(jhVar.mo58428a()).setBigContentTitle(this.f23532b).bigText(this.f23490e);
                if (this.f23534d) {
                    bigText.setSummaryText(this.f23533c);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m25418a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return C9458jk.m25440a(notification);
        }
        return null;
    }
}
