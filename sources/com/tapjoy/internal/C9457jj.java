package com.tapjoy.internal;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatExtras;
import androidx.core.app.NotificationManagerCompat;
import com.tapjoy.internal.C9452ji;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tapjoy.internal.jj */
final class C9457jj implements C9451jh {

    /* renamed from: a */
    final Notification.Builder f23535a;

    /* renamed from: b */
    final C9452ji.C9455c f23536b;

    /* renamed from: c */
    RemoteViews f23537c;

    /* renamed from: d */
    RemoteViews f23538d;

    /* renamed from: e */
    final List f23539e = new ArrayList();

    /* renamed from: f */
    final Bundle f23540f = new Bundle();

    /* renamed from: g */
    int f23541g;

    /* renamed from: h */
    RemoteViews f23542h;

    C9457jj(C9452ji.C9455c cVar) {
        this.f23536b = cVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23535a = new Notification.Builder(cVar.f23505a, cVar.f23498H);
        } else {
            this.f23535a = new Notification.Builder(cVar.f23505a);
        }
        Notification notification = cVar.f23503M;
        this.f23535a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.f23511g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f23507c).setContentText(cVar.f23508d).setContentInfo(cVar.f23513i).setContentIntent(cVar.f23509e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f23510f, (notification.flags & 128) != 0).setLargeIcon(cVar.f23512h).setNumber(cVar.f23514j).setProgress(cVar.f23521q, cVar.f23522r, cVar.f23523s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f23535a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f23535a.setSubText(cVar.f23519o).setUsesChronometer(cVar.f23517m).setPriority(cVar.f23515k);
            Iterator it = cVar.f23506b.iterator();
            while (it.hasNext()) {
                m25437a((C9452ji.C9453a) it.next());
            }
            if (cVar.f23491A != null) {
                this.f23540f.putAll(cVar.f23491A);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.f23527w) {
                    this.f23540f.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                if (cVar.f23524t != null) {
                    this.f23540f.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, cVar.f23524t);
                    if (cVar.f23525u) {
                        this.f23540f.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.f23540f.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                if (cVar.f23526v != null) {
                    this.f23540f.putString(NotificationCompatExtras.EXTRA_SORT_KEY, cVar.f23526v);
                }
            }
            this.f23537c = cVar.f23495E;
            this.f23538d = cVar.f23496F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f23535a.setShowWhen(cVar.f23516l);
            if (Build.VERSION.SDK_INT < 21 && cVar.f23504N != null && !cVar.f23504N.isEmpty()) {
                this.f23540f.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) cVar.f23504N.toArray(new String[cVar.f23504N.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f23535a.setLocalOnly(cVar.f23527w).setGroup(cVar.f23524t).setGroupSummary(cVar.f23525u).setSortKey(cVar.f23526v);
            this.f23541g = cVar.f23502L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f23535a.setCategory(cVar.f23530z).setColor(cVar.f23492B).setVisibility(cVar.f23493C).setPublicVersion(cVar.f23494D).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = cVar.f23504N.iterator();
            while (it2.hasNext()) {
                this.f23535a.addPerson((String) it2.next());
            }
            this.f23542h = cVar.f23497G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f23535a.setExtras(cVar.f23491A).setRemoteInputHistory(cVar.f23520p);
            if (cVar.f23495E != null) {
                this.f23535a.setCustomContentView(cVar.f23495E);
            }
            if (cVar.f23496F != null) {
                this.f23535a.setCustomBigContentView(cVar.f23496F);
            }
            if (cVar.f23497G != null) {
                this.f23535a.setCustomHeadsUpContentView(cVar.f23497G);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23535a.setBadgeIconType(cVar.f23499I).setShortcutId(cVar.f23500J).setTimeoutAfter(cVar.f23501K).setGroupAlertBehavior(cVar.f23502L);
            if (cVar.f23529y) {
                this.f23535a.setColorized(cVar.f23528x);
            }
            if (!TextUtils.isEmpty(cVar.f23498H)) {
                this.f23535a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    /* renamed from: a */
    public final Notification.Builder mo58428a() {
        return this.f23535a;
    }

    /* renamed from: a */
    private void m25437a(C9452ji.C9453a aVar) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.f23487e, aVar.f23488f, aVar.f23489g);
            if (aVar.f23484b != null) {
                for (RemoteInput addRemoteInput : C9459jl.m25443a(aVar.f23484b)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.f23483a != null) {
                bundle = new Bundle(aVar.f23483a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f23486d);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f23486d);
            }
            builder.addExtras(bundle);
            this.f23535a.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f23539e.add(C9458jk.m25439a(this.f23535a, aVar));
        }
    }

    /* renamed from: a */
    static void m25436a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
