package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Handler;
import com.yandex.metrica.C10079f;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.impl.p265ob.C11269g7;
import com.yandex.metrica.impl.p265ob.C11363j1;
import com.yandex.metrica.rtm.wrapper.C12054e;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j3 */
public class C11368j3 implements C11098c1 {

    /* renamed from: a */
    private final Context f27165a;

    /* renamed from: b */
    private final Handler f27166b;

    /* renamed from: c */
    private final C10974Z f27167c;

    /* renamed from: d */
    private final C11196ec f27168d;

    /* renamed from: e */
    private final C11769sn f27169e;

    /* renamed from: f */
    private final C10147C f27170f;

    /* renamed from: g */
    private volatile C10620P1 f27171g;

    /* renamed from: h */
    private C11269g7 f27172h;

    /* renamed from: i */
    private final C12054e f27173i;

    /* renamed from: j */
    private final C11669q1 f27174j;

    /* renamed from: k */
    private boolean f27175k;

    C11368j3(Context context, C11696qn qnVar) {
        this(context.getApplicationContext(), qnVar.mo63561b(), qnVar.mo63560a());
    }

    /* renamed from: e */
    private void m29270e() {
        if (C11363j1.m29252a("com.yandex.metrica.CounterConfiguration")) {
            ((C11725rn) this.f27169e).execute(new C10232Em(this.f27165a));
            return;
        }
        throw new C11363j1.C11364a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
    }

    /* renamed from: a */
    public synchronized void mo61864a(C12043l lVar, C10942Y0 y0) {
        if (!this.f27175k) {
            Boolean bool = lVar.crashReporting;
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue() && this.f27171g == null) {
                C11883vh vhVar = new C11883vh(this.f27173i);
                C11419k7 k7Var = new C11419k7(this.f27165a, new C10738S2(y0, "20799a27-fa80-4b36-b2db-0f8141f24180"), (C11269g7.C11270a) new C11261g3(this), (C10079f) null);
                C11419k7 k7Var2 = new C11419k7(this.f27165a, new C10738S2(y0, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), (C11269g7.C11270a) new C11303h3(this), (C10079f) null);
                if (this.f27172h == null) {
                    this.f27172h = new C11419k7(this.f27165a, (C10738S2) new C11700r1(y0, lVar), (C11269g7.C11270a) new C11332i3(this), lVar.f28956l);
                }
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                this.f27171g = new C10620P1(defaultUncaughtExceptionHandler, Arrays.asList(new C11337i7[]{vhVar, k7Var, k7Var2, this.f27172h}), C10941Y.m28234g().mo62505j(), new C10152C3(), new C10206E3());
                Thread.setDefaultUncaughtExceptionHandler(this.f27171g);
            }
            Boolean bool3 = lVar.appOpenTrackingEnabled;
            if (bool3 != null) {
                bool2 = bool3;
            }
            if (bool2.booleanValue()) {
                this.f27170f.mo61121a();
            }
            this.f27175k = true;
        }
    }

    /* renamed from: b */
    public C11769sn mo61866b() {
        return this.f27169e;
    }

    /* renamed from: c */
    public Handler mo61867c() {
        return this.f27166b;
    }

    /* renamed from: d */
    public C11489lc mo61868d() {
        return this.f27168d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C11368j3(android.content.Context r9, com.yandex.metrica.impl.p265ob.C11725rn r10, com.yandex.metrica.impl.p265ob.C11769sn r11) {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.ec r6 = new com.yandex.metrica.impl.ob.ec
            com.yandex.metrica.impl.ob.ec$c r1 = new com.yandex.metrica.impl.ob.ec$c
            r1.<init>()
            com.yandex.metrica.impl.ob.ec$e r2 = new com.yandex.metrica.impl.ob.ec$e
            r2.<init>()
            com.yandex.metrica.impl.ob.ec$e r3 = new com.yandex.metrica.impl.ob.ec$e
            r3.<init>()
            java.lang.String r5 = "Client"
            r0 = r6
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.Z r4 = new com.yandex.metrica.impl.ob.Z
            r4.<init>()
            com.yandex.metrica.impl.ob.C r5 = new com.yandex.metrica.impl.ob.C
            r5.<init>(r11)
            com.yandex.metrica.impl.ob.xh r11 = new com.yandex.metrica.impl.ob.xh
            r11.<init>()
            com.yandex.metrica.impl.ob.q1 r7 = new com.yandex.metrica.impl.ob.q1
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11368j3.<init>(android.content.Context, com.yandex.metrica.impl.ob.rn, com.yandex.metrica.impl.ob.sn):void");
    }

    C11368j3(Context context, C11196ec ecVar, C11725rn rnVar, C10974Z z, C10147C c, C11950xh xhVar, C11669q1 q1Var) {
        this.f27175k = false;
        this.f27165a = context;
        this.f27169e = rnVar;
        this.f27170f = c;
        this.f27174j = q1Var;
        C10116Am.m25999a(context);
        C10122B2.m26039b();
        this.f27168d = ecVar;
        ecVar.mo62822c(context);
        this.f27166b = rnVar.mo63610a();
        this.f27167c = z;
        z.mo62558a();
        this.f27173i = xhVar.mo64081a(context);
        m29270e();
    }

    /* renamed from: a */
    public void mo61865a(Map<String, Object> map) {
        this.f27174j.mo63526a(map);
    }

    /* renamed from: a */
    public C10147C mo61863a() {
        return this.f27170f;
    }
}
