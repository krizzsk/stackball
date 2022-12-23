package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.my.tracker.obfuscated.o */
public final class C7855o {

    /* renamed from: a */
    boolean f20122a = false;

    /* renamed from: b */
    String f20123b;

    /* renamed from: com.my.tracker.obfuscated.o$a */
    class C7856a implements C7859c {

        /* renamed from: a */
        final /* synthetic */ C7823k0 f20124a;

        C7856a(C7823k0 k0Var) {
            this.f20124a = k0Var;
        }

        /* renamed from: a */
        public void mo52471a() {
            C7877u0.m21547a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        /* renamed from: a */
        public void mo52472a(String str) {
            C7855o.this.f20123b = str;
            this.f20124a.mo52326j(str);
            C7877u0.m21547a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + C7855o.this.f20123b);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.o$b */
    public static final class C7857b {

        /* renamed from: a */
        public static final boolean f20126a = true;

        /* renamed from: com.my.tracker.obfuscated.o$b$a */
        class C7858a implements OnCompleteListener<String> {

            /* renamed from: a */
            final /* synthetic */ C7859c f20127a;

            C7858a(C7859c cVar) {
                this.f20127a = cVar;
            }

            public void onComplete(Task<String> task) {
                if (!task.isComplete() || !task.isSuccessful()) {
                    this.f20127a.mo52471a();
                } else {
                    this.f20127a.mo52472a(task.getResult());
                }
            }
        }

        /* renamed from: a */
        static void m21461a(Context context, C7859c cVar) {
            try {
                C7877u0.m21547a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).getAppInstanceId().addOnCompleteListener(C7806d.f19852b, new C7858a(cVar));
            } catch (Throwable th) {
                C7877u0.m21548a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.mo52471a();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.o$c */
    public interface C7859c {
        /* renamed from: a */
        void mo52471a();

        /* renamed from: a */
        void mo52472a(String str);
    }

    C7855o() {
    }

    /* renamed from: a */
    public void mo52468a(Context context) {
        if (!this.f20122a) {
            C7823k0 a = C7823k0.m21211a(context);
            String g = a.mo52319g();
            this.f20123b = g;
            if (!TextUtils.isEmpty(g)) {
                C7877u0.m21547a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + this.f20123b);
            }
            if (!C7857b.f20126a) {
                C7877u0.m21547a("FirebaseAppInstanceIdProvider: firebase analytics is not available");
                return;
            }
            C7857b.m21461a(context, new C7856a(a));
            this.f20122a = true;
        }
    }

    /* renamed from: a */
    public void mo52469a(C7831m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f20123b)) {
            m0Var.mo52436i(this.f20123b);
        }
    }

    /* renamed from: b */
    public void mo52470b(Context context) {
    }
}
