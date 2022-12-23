package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.C0580a0;

/* renamed from: com.adcolony.sdk.o */
class C0763o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0645d0 f1229a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AlertDialog f1230b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f1231c;

    /* renamed from: com.adcolony.sdk.o$a */
    class C0764a implements C0685f0 {
        C0764a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (!C0578a.m144d() || !(C0578a.m141b() instanceof Activity)) {
                new C0580a0.C0581a().mo9419a("Missing Activity reference, can't build AlertDialog.").mo9421a(C0580a0.f192j);
            } else if (C0894y.m1155b(d0Var.mo9532b(), "on_resume")) {
                C0645d0 unused = C0763o.this.f1229a = d0Var;
            } else {
                C0763o.this.m686a(d0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$b */
    class C0765b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0645d0 f1233a;

        C0765b(C0645d0 d0Var) {
            this.f1233a = d0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0763o.this.f1230b = null;
            dialogInterface.dismiss();
            C0897z0 b = C0894y.m1151b();
            C0894y.m1158b(b, "positive", true);
            boolean unused2 = C0763o.this.f1231c = false;
            this.f1233a.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.o$c */
    class C0766c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0645d0 f1235a;

        C0766c(C0645d0 d0Var) {
            this.f1235a = d0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = C0763o.this.f1230b = null;
            dialogInterface.dismiss();
            C0897z0 b = C0894y.m1151b();
            C0894y.m1158b(b, "positive", false);
            boolean unused2 = C0763o.this.f1231c = false;
            this.f1235a.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.o$d */
    class C0767d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C0645d0 f1237a;

        C0767d(C0645d0 d0Var) {
            this.f1237a = d0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AlertDialog unused = C0763o.this.f1230b = null;
            boolean unused2 = C0763o.this.f1231c = false;
            C0897z0 b = C0894y.m1151b();
            C0894y.m1158b(b, "positive", false);
            this.f1237a.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: com.adcolony.sdk.o$e */
    class C0768e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AlertDialog.Builder f1239a;

        C0768e(AlertDialog.Builder builder) {
            this.f1239a = builder;
        }

        public void run() {
            boolean unused = C0763o.this.f1231c = true;
            AlertDialog unused2 = C0763o.this.f1230b = this.f1239a.show();
        }
    }

    C0763o() {
        C0578a.m139a("Alert.show", (C0685f0) new C0764a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9785c() {
        C0645d0 d0Var = this.f1229a;
        if (d0Var != null) {
            m686a(d0Var);
            this.f1229a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9784b() {
        return this.f1231c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m686a(C0645d0 d0Var) {
        AlertDialog.Builder builder;
        Context b = C0578a.m141b();
        if (b != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                builder = new AlertDialog.Builder(b, 16974374);
            } else {
                builder = new AlertDialog.Builder(b, 16974126);
            }
            C0897z0 b2 = d0Var.mo9532b();
            String h = C0894y.m1169h(b2, "message");
            String h2 = C0894y.m1169h(b2, "title");
            String h3 = C0894y.m1169h(b2, "positive");
            String h4 = C0894y.m1169h(b2, "negative");
            builder.setMessage(h);
            builder.setTitle(h2);
            builder.setPositiveButton(h3, new C0765b(d0Var));
            if (!h4.equals("")) {
                builder.setNegativeButton(h4, new C0766c(d0Var));
            }
            builder.setOnCancelListener(new C0767d(d0Var));
            C0849u0.m931b((Runnable) new C0768e(builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AlertDialog mo9782a() {
        return this.f1230b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9783a(AlertDialog alertDialog) {
        this.f1230b = alertDialog;
    }
}
