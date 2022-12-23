package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.yandex.metrica.impl.p265ob.C11156dh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gh */
public class C11286gh extends C11156dh {

    /* renamed from: m */
    private String f26997m;

    /* renamed from: n */
    private String f26998n;

    /* renamed from: com.yandex.metrica.impl.ob.gh$a */
    protected static abstract class C11287a<T extends C11286gh, A extends C11156dh.C11157a> extends C11156dh.C11158b<T, A> {

        /* renamed from: c */
        private final C10898Wn f26999c;

        protected C11287a(Context context, String str) {
            this(context, str, new C10898Wn());
        }

        /* renamed from: a */
        public T mo62973a(C11156dh.C11159c<A> cVar) {
            T a = mo62478a();
            a.mo62764a(C11096c0.m28615a());
            C11900w2 a2 = C10619P0.m27164i().mo61888p().mo64117a();
            a.mo62767a(a2);
            a.mo62763a(cVar.f26746a);
            String str = ((C11156dh.C11157a) cVar.f26747b).f26741a;
            String str2 = null;
            if (str == null) {
                str = a2.mo63999a() != null ? a2.mo63999a().mo60963a() : null;
            }
            a.mo62772c(str);
            String str3 = this.f26745b;
            String str4 = ((C11156dh.C11157a) cVar.f26747b).f26742b;
            Context context = this.f26744a;
            if (TextUtils.isEmpty(str4)) {
                str4 = C10796U2.m27877a(context, str3);
            }
            a.mo62770b(str4);
            String str5 = this.f26745b;
            String str6 = ((C11156dh.C11157a) cVar.f26747b).f26743c;
            Context context2 = this.f26744a;
            if (TextUtils.isEmpty(str6)) {
                str6 = String.valueOf(C10796U2.m27895b(context2, str5));
            }
            a.mo62768a(str6);
            a.mo62776e(this.f26745b);
            a.mo62765a(C10619P0.m27164i().mo61892t().mo62815a(this.f26744a));
            a.mo62766a(C10619P0.m27164i().mo61875b().mo63037a());
            List<String> a3 = C11616p1.m29998a(this.f26744a).mo63447a();
            if (!a3.isEmpty()) {
                str2 = a3.get(0);
            }
            a.mo62774d(str2);
            T t = (C11286gh) a;
            String packageName = this.f26744a.getPackageName();
            ApplicationInfo a4 = this.f26999c.mo62460a(this.f26744a, this.f26745b, 0);
            String str7 = "1";
            if (a4 != null) {
                t.mo62971f((a4.flags & 2) != 0 ? str7 : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                if ((a4.flags & 1) == 0) {
                    str7 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                t.mo62972g(str7);
            } else if (TextUtils.equals(packageName, this.f26745b)) {
                t.mo62971f((this.f26744a.getApplicationInfo().flags & 2) != 0 ? str7 : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                if ((this.f26744a.getApplicationInfo().flags & 1) == 0) {
                    str7 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                t.mo62972g(str7);
            } else {
                t.mo62971f(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                t.mo62972g(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            return t;
        }

        protected C11287a(Context context, String str, C10898Wn wn) {
            super(context, str);
            this.f26999c = wn;
        }
    }

    /* renamed from: A */
    public String mo62969A() {
        return this.f26997m;
    }

    /* renamed from: B */
    public String mo62970B() {
        return this.f26998n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo62971f(String str) {
        this.f26997m = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo62972g(String str) {
        this.f26998n = str;
    }

    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f26997m + '\'' + ", mAppSystem='" + this.f26998n + '\'' + "} " + super.toString();
    }
}
