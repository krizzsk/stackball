package com.ogury.p245ed.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.ogury.ed.internal.gz */
public final class C8279gz {

    /* renamed from: a */
    public static final C8279gz f21399a = new C8279gz();

    private C8279gz() {
    }

    /* renamed from: a */
    public static void m23253a(Context context, String str) {
        C8467mq.m23881b(context, "context");
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            try {
                Uri parse = Uri.parse(str);
                C8467mq.m23878a((Object) parse, "uri");
                m23252a(context, parse);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m23255b(Context context, String str) {
        C8467mq.m23881b(context, "context");
        try {
            Intent a = m23250a(str);
            if (a == null) {
                return false;
            }
            m23251a(context, a);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m23256c(Context context, String str) {
        C8467mq.m23881b(context, "context");
        try {
            Intent a = m23250a(str);
            if (a == null) {
                return false;
            }
            return m23254b(context, a);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Intent m23250a(String str) {
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return Intent.parseUri(str, 0);
    }

    /* renamed from: a */
    private static void m23252a(Context context, Uri uri) {
        m23251a(context, new Intent("android.intent.action.VIEW", uri));
    }

    /* renamed from: a */
    private static void m23251a(Context context, Intent intent) {
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static boolean m23254b(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
