package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.impl.p265ob.C11924x;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.z2 */
public class C12013z2 implements C11924x.C11926b {

    /* renamed from: g */
    private static volatile C12013z2 f28860g;

    /* renamed from: a */
    private final Context f28861a;

    /* renamed from: b */
    private C11900w2 f28862b;

    /* renamed from: c */
    private WeakReference<Activity> f28863c = new WeakReference<>((Object) null);

    /* renamed from: d */
    private final C10248F9 f28864d;

    /* renamed from: e */
    private final C11932x2 f28865e;

    /* renamed from: f */
    private boolean f28866f;

    C12013z2(Context context, C10248F9 f9, C11932x2 x2Var) {
        this.f28861a = context;
        this.f28864d = f9;
        this.f28865e = x2Var;
        this.f28862b = f9.mo61315r();
        this.f28866f = f9.mo61321w();
        C10941Y.m28234g().mo62497a().mo64050a((C11924x.C11926b) this);
    }

    /* renamed from: a */
    public static C12013z2 m31034a(Context context) {
        if (f28860g == null) {
            synchronized (C12013z2.class) {
                if (f28860g == null) {
                    f28860g = new C12013z2(context, new C10248F9(C10663Qa.m27298a(context).mo61960c()), new C11932x2());
                }
            }
        }
        return f28860g;
    }

    /* renamed from: b */
    private void m31035b(Context context) {
        C11900w2 a;
        if (context != null && (a = this.f28865e.mo64065a(context)) != null && !a.equals(this.f28862b)) {
            this.f28862b = a;
            this.f28864d.mo61268a(a);
        }
    }

    /* renamed from: a */
    public synchronized C11900w2 mo64181a() {
        m31035b((Context) this.f28863c.get());
        if (this.f28862b == null) {
            if (!C10796U2.m27890a(30)) {
                m31035b(this.f28861a);
            } else if (!this.f28866f) {
                m31035b(this.f28861a);
                this.f28866f = true;
                this.f28864d.mo61323y();
            }
        }
        return this.f28862b;
    }

    /* renamed from: a */
    public synchronized void mo64052a(Activity activity) {
        this.f28863c = new WeakReference<>(activity);
        if (this.f28862b == null) {
            m31035b(activity);
        }
    }
}
