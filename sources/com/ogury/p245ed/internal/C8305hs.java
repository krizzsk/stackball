package com.ogury.p245ed.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.Collection;
import java.util.List;
import p269io.presage.mraid.browser.Android8AndLaterShortcutActivity;
import p269io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.hs */
public final class C8305hs {

    /* renamed from: a */
    public static final C8306a f21452a = new C8306a((byte) 0);

    /* renamed from: b */
    private Context f21453b;

    /* renamed from: c */
    private final C8348ix f21454c;

    /* renamed from: d */
    private final C8241fv f21455d;

    /* renamed from: e */
    private C8318ib f21456e;

    /* renamed from: f */
    private C8308hu f21457f;

    /* renamed from: g */
    private ShortcutInfo f21458g;

    private C8305hs(Context context, C8348ix ixVar, C8241fv fvVar, C8318ib ibVar, C8308hu huVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(ixVar, "mraidShortcutIcon");
        C8467mq.m23881b(fvVar, "bitmapDownloader");
        C8467mq.m23881b(ibVar, "shortcutManagerFactory");
        C8467mq.m23881b(huVar, "prefs");
        this.f21453b = context;
        this.f21454c = ixVar;
        this.f21455d = fvVar;
        this.f21456e = ibVar;
        this.f21457f = huVar;
    }

    public /* synthetic */ C8305hs(Context context, C8348ix ixVar) {
        this(context, ixVar, new C8241fv(), new C8318ib(), new C8308hu(context));
    }

    /* renamed from: com.ogury.ed.internal.hs$a */
    public static final class C8306a {
        public /* synthetic */ C8306a(byte b) {
            this();
        }

        private C8306a() {
        }
    }

    /* renamed from: a */
    public final void mo53688a() {
        Bitmap b;
        if (!this.f21454c.mo53778e() && (b = m23394b()) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f21458g = m23390a(b);
                ShortcutManager a = C8318ib.m23467a(this.f21453b);
                ShortcutInfo shortcutInfo = this.f21458g;
                ShortcutInfo shortcutInfo2 = null;
                if (shortcutInfo == null) {
                    C8467mq.m23879a("shortcutInfo");
                    shortcutInfo = null;
                }
                String id = shortcutInfo.getId();
                C8467mq.m23878a((Object) id, "shortcutInfo.id");
                if (m23393a(a, id)) {
                    ShortcutInfo shortcutInfo3 = this.f21458g;
                    if (shortcutInfo3 == null) {
                        C8467mq.m23879a("shortcutInfo");
                    } else {
                        shortcutInfo2 = shortcutInfo3;
                    }
                    m23396b(shortcutInfo2, a);
                } else {
                    ShortcutInfo shortcutInfo4 = this.f21458g;
                    if (shortcutInfo4 == null) {
                        C8467mq.m23879a("shortcutInfo");
                    } else {
                        shortcutInfo2 = shortcutInfo4;
                    }
                    m23391a(shortcutInfo2, a);
                }
            } else {
                if (this.f21457f.mo53690a(this.f21454c.mo53774a()) || this.f21457f.mo53692c(this.f21454c.mo53774a())) {
                    m23392a(this.f21454c.mo53775b());
                }
                m23395b(b);
            }
            this.f21457f.mo53689a(this.f21454c.mo53774a(), this.f21454c.mo53777d());
        }
    }

    /* renamed from: b */
    private final Bitmap m23394b() {
        return C8241fv.m23153a(this.f21454c.mo53776c());
    }

    /* renamed from: a */
    private static boolean m23393a(ShortcutManager shortcutManager, String str) {
        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
        C8467mq.m23878a((Object) pinnedShortcuts, "shortcutManager.pinnedShortcuts");
        Iterable<ShortcutInfo> iterable = pinnedShortcuts;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ShortcutInfo id : iterable) {
            if (C8467mq.m23880a((Object) str, (Object) id.getId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final ShortcutInfo m23390a(Bitmap bitmap) {
        ShortcutInfo build = new ShortcutInfo.Builder(this.f21453b, this.f21454c.mo53774a()).setShortLabel(this.f21454c.mo53775b()).setIcon(Icon.createWithBitmap(bitmap)).setIntent(m23389a((Class<?>) Android8AndLaterShortcutActivity.class)).build();
        C8467mq.m23878a((Object) build, "Builder(context, mraidSh…va))\n            .build()");
        return build;
    }

    /* renamed from: a */
    private static void m23391a(ShortcutInfo shortcutInfo, ShortcutManager shortcutManager) {
        if (shortcutManager.isRequestPinShortcutSupported()) {
            shortcutManager.requestPinShortcut(shortcutInfo, (IntentSender) null);
        }
    }

    /* renamed from: b */
    private static boolean m23396b(ShortcutInfo shortcutInfo, ShortcutManager shortcutManager) {
        return shortcutManager.updateShortcuts(C8394km.m23752a(shortcutInfo));
    }

    /* renamed from: b */
    private final void m23395b(Bitmap bitmap) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.INTENT", m23389a((Class<?>) ShortcutActivity.class));
        intent.putExtra("android.intent.extra.shortcut.NAME", this.f21454c.mo53775b());
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        try {
            this.f21453b.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final Intent m23389a(Class<?> cls) {
        Intent intent = new Intent(this.f21453b.getApplicationContext(), cls);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.putExtra("identifier", this.f21454c.mo53774a());
        intent.addFlags(8388608);
        intent.addFlags(67108864);
        intent.setAction("android.intent.action.MAIN");
        return intent;
    }

    /* renamed from: a */
    private final void m23392a(String str) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        try {
            this.f21453b.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }
}
