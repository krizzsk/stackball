package com.applovin.impl.mediation.p012a.p015c.p018b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.mediation.p012a.p013a.C1176d;
import com.applovin.impl.mediation.p012a.p015c.p018b.C1197b;
import com.applovin.sdk.C1701R;

/* renamed from: com.applovin.impl.mediation.a.c.b.a */
public class C1192a extends Activity {

    /* renamed from: a */
    private ListView f2268a;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1701R.layout.mediation_debugger_detail_activity);
        this.f2268a = (ListView) findViewById(C1701R.C1703id.listView);
    }

    public void setNetwork(C1176d dVar) {
        setTitle(dVar.mo12175f());
        C1197b bVar = new C1197b(dVar, this);
        bVar.mo12236a((C1197b.C1198a) new C1197b.C1198a() {
            /* renamed from: a */
            public void mo12221a(String str) {
                new AlertDialog.Builder(C1192a.this, 16974130).setTitle(C1701R.string.applovin_instructions_dialog_title).setMessage(str).setNegativeButton(17039370, (DialogInterface.OnClickListener) null).create().show();
            }
        });
        this.f2268a.setAdapter(bVar);
    }
}
