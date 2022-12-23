package com.p243my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.browser.customtabs.CustomTabsIntent;
import com.p243my.target.C7623q6;
import com.p243my.target.C7784z8;
import com.p243my.target.common.MyTargetActivity;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.my.target.g8 */
public class C7424g8 {

    /* renamed from: a */
    public static final WeakHashMap<C7768z1, Boolean> f18666a = new WeakHashMap<>();

    /* renamed from: com.my.target.g8$b */
    public static abstract class C7426b {

        /* renamed from: a */
        public final C7768z1 f18667a;

        public C7426b(C7768z1 z1Var) {
            this.f18667a = z1Var;
        }

        /* renamed from: a */
        public static C7426b m19202a(C7768z1 z1Var) {
            return new C7427c(z1Var);
        }

        /* renamed from: a */
        public static C7426b m19203a(String str, C7768z1 z1Var) {
            return C7784z8.m21031e(str) ? new C7428d(str, z1Var) : new C7429e(str, z1Var);
        }

        /* renamed from: a */
        public abstract boolean mo50247a(Context context);
    }

    /* renamed from: com.my.target.g8$c */
    public static class C7427c extends C7426b {
        public C7427c(C7768z1 z1Var) {
            super(z1Var);
        }

        /* renamed from: a */
        public boolean mo50247a(Context context) {
            Intent intent;
            if (!"store".equals(this.f18667a.getNavigationType())) {
                return false;
            }
            String str = null;
            if (Build.VERSION.SDK_INT < 30 || this.f18667a.isAppInWhiteList()) {
                str = this.f18667a.getBundleId();
                if (str == null || (intent = context.getPackageManager().getLaunchIntentForPackage(str)) == null) {
                    return false;
                }
            } else {
                intent = null;
            }
            if (mo50249a(str, this.f18667a.getDeeplink(), context)) {
                C7741x8.m20827c((List<C7328b3>) this.f18667a.getStatHolder().mo49800a("deeplinkClick"), context);
                return true;
            } else if (!mo50250b(str, this.f18667a.getUrlscheme(), context) && !mo50248a(intent, context)) {
                return false;
            } else {
                C7741x8.m20827c((List<C7328b3>) this.f18667a.getStatHolder().mo49800a("click"), context);
                String trackingLink = this.f18667a.getTrackingLink();
                if (trackingLink != null && !C7784z8.m21031e(trackingLink)) {
                    C7784z8.m21033g(trackingLink).mo52005b(context);
                }
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo50248a(Intent intent, Context context) {
            if (intent == null) {
                return false;
            }
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo50249a(String str, String str2, Context context) {
            if (str2 == null) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                if (str != null) {
                    intent.setPackage(str);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo50250b(String str, String str2, Context context) {
            if (str2 == null) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                if (str != null) {
                    intent.setPackage(str);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: com.my.target.g8$d */
    public static class C7428d extends C7429e {
        public C7428d(String str, C7768z1 z1Var) {
            super(str, z1Var);
        }

        /* renamed from: a */
        public boolean mo50247a(Context context) {
            if (C7784z8.m21029c(this.f18668b)) {
                if (mo50252e(this.f18668b, context)) {
                    return true;
                }
            } else if (mo50251d(this.f18668b, context)) {
                return true;
            }
            return super.mo50247a(context);
        }

        /* renamed from: d */
        public final boolean mo50251d(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: e */
        public final boolean mo50252e(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: com.my.target.g8$e */
    public static class C7429e extends C7426b {

        /* renamed from: b */
        public final String f18668b;

        public C7429e(String str, C7768z1 z1Var) {
            super(z1Var);
            this.f18668b = str;
        }

        /* renamed from: a */
        public boolean mo50247a(Context context) {
            if (mo50254b(context)) {
                return true;
            }
            if (this.f18667a.isOpenInBrowser()) {
                return mo50255b(this.f18668b, context);
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 18 || !mo50253a(this.f18668b, context)) {
                return ("store".equals(this.f18667a.getNavigationType()) || (i >= 28 && !C7784z8.m21030d(this.f18668b))) ? mo50255b(this.f18668b, context) : mo50256c(this.f18668b, context);
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo50253a(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                Bundle bundle = new Bundle();
                bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setPackage("com.android.chrome");
                intent.putExtras(bundle);
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo50254b(Context context) {
            if (!context.getPackageName().equals("ru.mail.browser")) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f18668b));
                intent.putExtra("com.android.browser.application_id", "ru.mail.browser");
                intent.setPackage("ru.mail.browser");
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                C7374e0.m18989a("Unable to start atom: " + th.getMessage());
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo50255b(String str, Context context) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: c */
        public final boolean mo50256c(String str, Context context) {
            C7430f.m19217a(str).mo50257a(context);
            return true;
        }
    }

    /* renamed from: com.my.target.g8$f */
    public static class C7430f implements MyTargetActivity.ActivityEngine {

        /* renamed from: a */
        public final String f18669a;

        /* renamed from: b */
        public C7623q6 f18670b;

        public C7430f(String str) {
            this.f18669a = str;
        }

        /* renamed from: a */
        public static C7430f m19217a(String str) {
            return new C7430f(str);
        }

        /* renamed from: a */
        public void mo50257a(Context context) {
            MyTargetActivity.activityEngine = this;
            Intent intent = new Intent(context, MyTargetActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }

        public boolean onActivityBackPressed() {
            C7623q6 q6Var = this.f18670b;
            if (q6Var == null || !q6Var.mo51427a()) {
                return true;
            }
            this.f18670b.mo51429c();
            return false;
        }

        public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
            myTargetActivity.setTheme(16973837);
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = myTargetActivity.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(-12232092);
            }
            try {
                C7623q6 q6Var = new C7623q6(myTargetActivity);
                this.f18670b = q6Var;
                frameLayout.addView(q6Var);
                this.f18670b.mo51430d();
                this.f18670b.setUrl(this.f18669a);
                this.f18670b.setListener(new C7623q6.C7627d() {
                    /* renamed from: a */
                    public final void mo49447a() {
                        MyTargetActivity.this.finish();
                    }
                });
            } catch (Throwable th) {
                C7374e0.m18990b(th.getMessage());
                myTargetActivity.finish();
            }
        }

        public void onActivityDestroy() {
            C7623q6 q6Var = this.f18670b;
            if (q6Var != null) {
                q6Var.mo51428b();
                this.f18670b = null;
            }
        }

        public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
            return false;
        }

        public void onActivityPause() {
        }

        public void onActivityResume() {
        }

        public void onActivityStart() {
        }

        public void onActivityStop() {
        }
    }

    /* renamed from: a */
    public static C7424g8 m19196a() {
        return new C7424g8();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19197a(C7768z1 z1Var, Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            mo50245a(str, z1Var, context);
        }
        f18666a.remove(z1Var);
    }

    /* renamed from: a */
    public void mo50243a(C7768z1 z1Var, Context context) {
        mo50244a(z1Var, z1Var.getTrackingLink(), context);
    }

    /* renamed from: a */
    public void mo50244a(C7768z1 z1Var, String str, Context context) {
        if (!f18666a.containsKey(z1Var) && !C7426b.m19202a(z1Var).mo50247a(context)) {
            if (str != null) {
                mo50246b(str, z1Var, context);
            }
            C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("click"), context);
        }
    }

    /* renamed from: a */
    public final void mo50245a(String str, C7768z1 z1Var, Context context) {
        C7426b.m19203a(str, z1Var).mo50247a(context);
    }

    /* renamed from: b */
    public final void mo50246b(String str, C7768z1 z1Var, Context context) {
        if (z1Var.isDirectLink() || C7784z8.m21031e(str)) {
            mo50245a(str, z1Var, context);
            return;
        }
        f18666a.put(z1Var, Boolean.TRUE);
        C7784z8.m21033g(str).mo52004a((C7784z8.C7785a) new C7784z8.C7785a(z1Var, context) {
            public final /* synthetic */ C7768z1 f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            /* renamed from: a */
            public final void mo49468a(String str) {
                C7424g8.this.m19197a(this.f$1, this.f$2, str);
            }
        }).mo52005b(context);
    }
}
