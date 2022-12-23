package com.applovin.impl.mediation.p012a.p013a;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.applovin.impl.mediation.a.a.b */
public class C1173b {

    /* renamed from: a */
    public TextView f2199a;

    /* renamed from: b */
    public TextView f2200b;

    /* renamed from: c */
    public ImageView f2201c;

    /* renamed from: d */
    public ImageView f2202d;

    /* renamed from: e */
    private C1174c f2203e;

    /* renamed from: a */
    public C1174c mo12155a() {
        return this.f2203e;
    }

    /* renamed from: a */
    public void mo12156a(C1174c cVar) {
        this.f2203e = cVar;
        this.f2199a.setText(cVar.mo12158c());
        if (this.f2200b != null) {
            if (!TextUtils.isEmpty(cVar.mo12159d())) {
                this.f2200b.setVisibility(0);
                this.f2200b.setText(cVar.mo12159d());
            } else {
                this.f2200b.setVisibility(8);
            }
        }
        if (this.f2201c != null) {
            if (cVar.mo12162g() > 0) {
                this.f2201c.setImageResource(cVar.mo12162g());
                this.f2201c.setColorFilter(cVar.mo12163h());
                this.f2201c.setVisibility(0);
            } else {
                this.f2201c.setVisibility(8);
            }
        }
        if (this.f2202d == null) {
            return;
        }
        if (cVar.mo12164i() > 0) {
            this.f2202d.setImageResource(cVar.mo12164i());
            this.f2202d.setColorFilter(cVar.mo12165j());
            this.f2202d.setVisibility(0);
            return;
        }
        this.f2202d.setVisibility(8);
    }
}
