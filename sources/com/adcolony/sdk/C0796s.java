package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.ADCFunction;
import com.adcolony.sdk.C0580a0;
import com.adcolony.sdk.C0727i0;
import com.adcolony.sdk.C0746l;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.s */
class C0796s {

    /* renamed from: f */
    private static C0796s f1340f = null;

    /* renamed from: g */
    private static final String f1341g = "adc_events_db";

    /* renamed from: a */
    private final Executor f1342a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private SQLiteDatabase f1343b;

    /* renamed from: c */
    private boolean f1344c = false;

    /* renamed from: d */
    private C0799c f1345d;

    /* renamed from: e */
    private Set<String> f1346e = new HashSet();

    /* renamed from: com.adcolony.sdk.s$a */
    class C0797a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0897z0 f1347a;

        /* renamed from: b */
        final /* synthetic */ ADCFunction.Consumer f1348b;

        /* renamed from: c */
        final /* synthetic */ Context f1349c;

        C0797a(C0897z0 z0Var, ADCFunction.Consumer consumer, Context context) {
            this.f1347a = z0Var;
            this.f1348b = consumer;
            this.f1349c = context;
        }

        public void run() {
            C0727i0 a = C0727i0.m507a(this.f1347a);
            if (a != null) {
                C0796s.this.m780a(a, (ADCFunction.Consumer<C0727i0>) this.f1348b, this.f1349c);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.s$b */
    class C0798b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1351a;

        /* renamed from: b */
        final /* synthetic */ ContentValues f1352b;

        C0798b(String str, ContentValues contentValues) {
            this.f1351a = str;
            this.f1352b = contentValues;
        }

        public void run() {
            C0796s.this.m785b(this.f1351a, this.f1352b);
        }
    }

    /* renamed from: com.adcolony.sdk.s$c */
    interface C0799c {
        /* renamed from: a */
        void mo9628a();
    }

    C0796s() {
    }

    /* renamed from: b */
    public static C0796s m784b() {
        if (f1340f == null) {
            synchronized (C0796s.class) {
                if (f1340f == null) {
                    f1340f = new C0796s();
                }
            }
        }
        return f1340f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9861c() {
        this.f1346e.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9858a(C0799c cVar) {
        this.f1345d = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9859a(C0897z0 z0Var, ADCFunction.Consumer<C0727i0> consumer) {
        Context applicationContext = C0578a.m144d() ? C0578a.m141b().getApplicationContext() : null;
        if (applicationContext != null && z0Var != null) {
            try {
                this.f1342a.execute(new C0797a(z0Var, consumer, applicationContext));
            } catch (RejectedExecutionException e) {
                C0580a0.C0581a aVar = new C0580a0.C0581a();
                aVar.mo9419a("ADCEventsRepository.open failed with: " + e.toString()).mo9421a(C0580a0.f192j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m785b(String str, ContentValues contentValues) {
        C0754m.m622a(str, contentValues, this.f1343b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m780a(C0727i0 i0Var, ADCFunction.Consumer<C0727i0> consumer, Context context) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f1343b;
            boolean z = false;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.f1343b = context.openOrCreateDatabase(f1341g, 0, (SQLiteDatabase.CursorFactory) null);
            }
            if (this.f1343b.needUpgrade(i0Var.mo9645b())) {
                if (m783a(i0Var) && this.f1345d != null) {
                    z = true;
                }
                this.f1344c = z;
                if (z) {
                    this.f1345d.mo9628a();
                }
            } else {
                this.f1344c = true;
            }
            if (this.f1344c) {
                consumer.accept(i0Var);
            }
        } catch (SQLiteException e) {
            new C0580a0.C0581a().mo9419a("Database cannot be opened").mo9419a(e.toString()).mo9421a(C0580a0.f190h);
        }
        return;
    }

    /* renamed from: a */
    private boolean m783a(C0727i0 i0Var) {
        return new C0739k(this.f1343b, i0Var).mo9678b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9857a(C0727i0.C0728a aVar, ContentValues contentValues) {
        String str;
        if (aVar != null && !this.f1346e.contains(aVar.mo9654h())) {
            this.f1346e.add(aVar.mo9654h());
            int d = aVar.mo9650d();
            long j = -1;
            C0727i0.C0732d i = aVar.mo9655i();
            if (i != null) {
                j = contentValues.getAsLong(i.mo9661a()).longValue() - i.mo9662b();
                str = i.mo9661a();
            } else {
                str = null;
            }
            C0754m.m621a(d, j, str, aVar.mo9654h(), this.f1343b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9860a(String str, ContentValues contentValues) {
        if (this.f1344c) {
            try {
                this.f1342a.execute(new C0798b(str, contentValues));
            } catch (RejectedExecutionException e) {
                C0580a0.C0581a aVar = new C0580a0.C0581a();
                aVar.mo9419a("ADCEventsRepository.saveEvent failed with: " + e.toString()).mo9421a(C0580a0.f192j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0746l.C0748b mo9855a(C0727i0 i0Var, long j) {
        if (this.f1344c) {
            return C0746l.m593a(i0Var, this.f1343b, this.f1342a, j);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9856a() {
        this.f1344c = false;
        this.f1343b.close();
    }
}
