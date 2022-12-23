package com.applovin.impl.sdk.p023a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1369c;

/* renamed from: com.applovin.impl.sdk.a.b */
public class C1333b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f2646a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Activity f2647b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AlertDialog f2648c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1341a f2649d;

    /* renamed from: com.applovin.impl.sdk.a.b$a */
    public interface C1341a {
        /* renamed from: a */
        void mo11858a();

        /* renamed from: b */
        void mo11859b();
    }

    public C1333b(Activity activity, C1469j jVar) {
        this.f2646a = jVar;
        this.f2647b = activity;
    }

    /* renamed from: a */
    public void mo12627a() {
        this.f2647b.runOnUiThread(new Runnable() {
            public void run() {
                if (C1333b.this.f2648c != null) {
                    C1333b.this.f2648c.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo12628a(C1341a aVar) {
        this.f2649d = aVar;
    }

    /* renamed from: b */
    public void mo12629b() {
        this.f2647b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog unused = C1333b.this.f2648c = new AlertDialog.Builder(C1333b.this.f2647b).setTitle((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2924bN)).setMessage((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2925bO)).setCancelable(false).setPositiveButton((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2927bQ), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1333b.this.f2649d.mo11858a();
                    }
                }).setNegativeButton((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2926bP), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1333b.this.f2649d.mo11859b();
                    }
                }).show();
            }
        });
    }

    /* renamed from: c */
    public void mo12630c() {
        this.f2647b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(C1333b.this.f2647b);
                builder.setTitle((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2929bS));
                builder.setMessage((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2930bT));
                builder.setCancelable(false);
                builder.setPositiveButton((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2932bV), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1333b.this.f2649d.mo11858a();
                    }
                });
                builder.setNegativeButton((CharSequence) C1333b.this.f2646a.mo13088a(C1369c.f2931bU), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1333b.this.f2649d.mo11859b();
                    }
                });
                AlertDialog unused = C1333b.this.f2648c = builder.show();
            }
        });
    }

    /* renamed from: d */
    public boolean mo12631d() {
        AlertDialog alertDialog = this.f2648c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
