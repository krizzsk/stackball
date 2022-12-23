package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C11576o2;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/* renamed from: com.yandex.metrica.impl.ob.V6 */
public class C10829V6 {

    /* renamed from: a */
    private final C10442L0 f25988a;

    /* renamed from: b */
    private final C10801U6 f25989b;

    /* renamed from: c */
    private final Context f25990c;

    /* renamed from: d */
    private final C11122cn f25991d;

    public C10829V6(Context context) {
        this(context, new C10442L0(), new C10801U6(), C11122cn.m28662a(context));
    }

    /* renamed from: a */
    public void mo62374a(C11576o2.C11582f fVar) {
        File a = this.f25988a.mo61697a(this.f25990c, "appmetrica_crashes");
        if (this.f25989b.mo62349a(a)) {
            C10797U3 a2 = fVar.mo63410a().mo62271a();
            String str = a2.mo62341g() + "-" + a2.mo62342h();
            C11054an a3 = this.f25991d.mo62737a(str);
            PrintWriter printWriter = null;
            try {
                a3.mo62656a();
                this.f25988a.getClass();
                PrintWriter printWriter2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(a, str))));
                try {
                    printWriter2.write(new C10331H7(fVar.mo63414b(), fVar.mo63410a(), fVar.mo63415c()).mo61427k());
                    C10796U2.m27888a((Closeable) printWriter2);
                    a3.mo62658c();
                } catch (IOException unused) {
                    printWriter = printWriter2;
                    C10796U2.m27888a((Closeable) printWriter);
                    a3.mo62658c();
                }
            } catch (IOException unused2) {
                C10796U2.m27888a((Closeable) printWriter);
                a3.mo62658c();
            }
        }
    }

    C10829V6(Context context, C10442L0 l0, C10801U6 u6, C11122cn cnVar) {
        this.f25990c = context;
        this.f25988a = l0;
        this.f25989b = u6;
        this.f25991d = cnVar;
    }
}
