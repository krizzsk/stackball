package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import com.yandex.mobile.ads.C12066R;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

public class k31 extends h10 {

    /* renamed from: a */
    private final C13513jm f35949a;

    /* renamed from: b */
    private final C15202xq f35950b;

    /* renamed from: c */
    private final C14128nr f35951c;

    @Inject
    public k31(C13513jm jmVar, C15202xq xqVar, C14128nr nrVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(nrVar, "divExtensionController");
        this.f35949a = jmVar;
        this.f35950b = xqVar;
        this.f35951c = nrVar;
    }

    /* renamed from: a */
    public void mo67382a(C12996es esVar) {
        Intrinsics.checkNotNullParameter(esVar, "view");
        m38160a(esVar, esVar.mo66864d());
    }

    /* renamed from: b */
    public void mo68123b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof i31) {
            ((i31) view).release();
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C12066R.C12068id.div_releasable_list);
        wa1 wa1 = null;
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat != null) {
            Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
            wa1 = new wa1(sparseArrayCompat);
        }
        if (wa1 != null) {
            Iterator it = wa1.iterator();
            while (it.hasNext()) {
                ((i31) it.next()).release();
            }
        }
    }

    /* renamed from: a */
    public void mo67387a(C14628ss ssVar) {
        Intrinsics.checkNotNullParameter(ssVar, "view");
        m38160a(ssVar, ssVar.mo70050h());
    }

    /* renamed from: a */
    public void mo67378a(C12417at atVar) {
        Intrinsics.checkNotNullParameter(atVar, "view");
        m38160a(atVar, atVar.mo65875g());
    }

    /* renamed from: a */
    public void mo67389a(C14933vt vtVar) {
        Intrinsics.checkNotNullParameter(vtVar, "view");
        m38160a(vtVar, vtVar.mo70573h());
    }

    /* renamed from: a */
    public void mo67384a(C13140fv fvVar) {
        Intrinsics.checkNotNullParameter(fvVar, "view");
        m38160a(fvVar, fvVar.mo67087d());
    }

    /* renamed from: a */
    public void mo67380a(C12925dv dvVar) {
        Intrinsics.checkNotNullParameter(dvVar, "view");
        m38160a(dvVar, dvVar.mo66700h());
    }

    /* renamed from: a */
    public void mo67388a(C14633sv svVar) {
        Intrinsics.checkNotNullParameter(svVar, "view");
        m38160a(svVar, svVar.mo70057d());
    }

    /* renamed from: a */
    public void mo67390a(C15118wv wvVar) {
        Intrinsics.checkNotNullParameter(wvVar, "view");
        m38160a(wvVar, wvVar.mo70763e());
    }

    /* renamed from: a */
    public void mo67385a(C14325pw pwVar) {
        Intrinsics.checkNotNullParameter(pwVar, "view");
        m38160a(pwVar, pwVar.mo69447d());
    }

    /* renamed from: a */
    public void mo67379a(C12458ax axVar) {
        Intrinsics.checkNotNullParameter(axVar, "view");
        m38160a(axVar, axVar.mo65915d());
    }

    /* renamed from: a */
    public void mo67383a(C13016ey eyVar) {
        Intrinsics.checkNotNullParameter(eyVar, "view");
        m38160a(eyVar, eyVar.mo66883d());
    }

    /* renamed from: a */
    public void mo67386a(C14429qy qyVar) {
        Intrinsics.checkNotNullParameter(qyVar, "view");
        m38160a(qyVar, qyVar.mo69659d());
    }

    /* renamed from: a */
    public void mo67381a(C12931dy dyVar) {
        Intrinsics.checkNotNullParameter(dyVar, "view");
        m38160a(dyVar, dyVar.mo66714k());
    }

    /* renamed from: a */
    public void mo67377a(View view) {
        C15202xq xqVar;
        Intrinsics.checkNotNullParameter(view, "view");
        mo68123b(view);
        Object tag = view.getTag(C12066R.C12068id.div_custom_tag);
        C14406qq qqVar = tag instanceof C14406qq ? (C14406qq) tag : null;
        if (qqVar != null && (xqVar = this.f35950b) != null) {
            xqVar.mo70216a(view, qqVar);
        }
    }

    /* renamed from: a */
    private void m38160a(View view, C14697tn tnVar) {
        if (tnVar != null) {
            this.f35951c.mo69074c(this.f35949a, view, tnVar);
        }
        mo68123b(view);
    }
}
