package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: com.my.target.z8 */
public class C7784z8 {

    /* renamed from: a */
    public static final String[] f19762a = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "market://", "samsungapps://"};

    /* renamed from: b */
    public final String f19763b;

    /* renamed from: c */
    public C7785a f19764c;

    /* renamed from: com.my.target.z8$a */
    public interface C7785a {
        /* renamed from: a */
        void mo49468a(String str);
    }

    public C7784z8(String str) {
        this.f19763b = str;
    }

    /* renamed from: a */
    public static String m21026a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
            C7374e0.m18989a("Unable to decode url " + th.getMessage());
            return str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21027a(Context context) {
        String str = (String) C7454i3.m19328d().mo50288b(this.f19763b, (String) null, context);
        if (this.f19764c != null) {
            C7395f0.m19090c(new Runnable(str) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7784z8.this.m21032f(this.f$1);
                }
            });
        }
    }

    /* renamed from: b */
    public static String m21028b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            C7374e0.m18989a("Unable to encode url " + th.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m21029c(String str) {
        return str.startsWith("samsungapps://");
    }

    /* renamed from: d */
    public static boolean m21030d(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("https");
    }

    /* renamed from: e */
    public static boolean m21031e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String startsWith : f19762a) {
                if (str.startsWith(startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m21032f(String str) {
        C7785a aVar = this.f19764c;
        if (aVar != null) {
            aVar.mo49468a(str);
            this.f19764c = null;
        }
    }

    /* renamed from: g */
    public static C7784z8 m21033g(String str) {
        return new C7784z8(str);
    }

    /* renamed from: a */
    public C7784z8 mo52004a(C7785a aVar) {
        this.f19764c = aVar;
        return this;
    }

    /* renamed from: b */
    public void mo52005b(Context context) {
        C7395f0.m19088b(new Runnable(context.getApplicationContext()) {
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7784z8.this.m21027a(this.f$1);
            }
        });
    }
}
