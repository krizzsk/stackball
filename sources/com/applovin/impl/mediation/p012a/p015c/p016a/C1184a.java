package com.applovin.impl.mediation.p012a.p015c.p016a;

import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.applovin.impl.adview.C1039a;
import com.applovin.impl.mediation.p012a.p013a.C1176d;
import com.applovin.impl.mediation.p012a.p015c.p016a.C1189b;
import com.applovin.impl.mediation.p012a.p015c.p018b.C1192a;
import com.applovin.impl.sdk.C1326a;
import com.applovin.impl.sdk.utils.C1512a;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.sdk.C1701R;

/* renamed from: com.applovin.impl.mediation.a.c.a.a */
public class C1184a extends Activity {

    /* renamed from: a */
    private C1189b f2249a;

    /* renamed from: b */
    private DataSetObserver f2250b;

    /* renamed from: c */
    private FrameLayout f2251c;

    /* renamed from: d */
    private ListView f2252d;

    /* renamed from: e */
    private C1039a f2253e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1918a() {
        startActivity(new Intent(this, MaxDebuggerDetailActivity.class));
    }

    /* renamed from: b */
    private void m1920b() {
        m1922c();
        C1039a aVar = new C1039a(this, 50, 16842874);
        this.f2253e = aVar;
        aVar.setColor(-3355444);
        this.f2251c.addView(this.f2253e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2251c.bringChildToFront(this.f2253e);
        this.f2253e.mo11807a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1922c() {
        C1039a aVar = this.f2253e;
        if (aVar != null) {
            aVar.mo11808b();
            this.f2251c.removeView(this.f2253e);
            this.f2253e = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C1701R.layout.mediation_debugger_activity);
        this.f2251c = (FrameLayout) findViewById(16908290);
        this.f2252d = (ListView) findViewById(C1701R.C1703id.listView);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2249a.unregisterDataSetObserver(this.f2250b);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2252d.setAdapter(this.f2249a);
        if (!this.f2249a.mo12216a()) {
            m1920b();
        }
    }

    public void setListAdapter(C1189b bVar, final C1326a aVar) {
        DataSetObserver dataSetObserver;
        C1189b bVar2 = this.f2249a;
        if (!(bVar2 == null || (dataSetObserver = this.f2250b) == null)) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f2249a = bVar;
        C11851 r3 = new DataSetObserver() {
            public void onChanged() {
                C1184a.this.m1922c();
            }
        };
        this.f2250b = r3;
        this.f2249a.registerDataSetObserver(r3);
        this.f2249a.mo12214a((C1189b.C1191a) new C1189b.C1191a() {
            /* renamed from: a */
            public void mo12211a(final C1176d dVar) {
                aVar.mo12602a(new C1512a() {
                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof C1192a) {
                            aVar.mo12604b(this);
                        }
                    }

                    public void onActivityStarted(Activity activity) {
                        if (activity instanceof C1192a) {
                            ((C1192a) activity).setNetwork(dVar);
                        }
                    }
                });
                C1184a.this.m1918a();
            }
        });
    }
}
