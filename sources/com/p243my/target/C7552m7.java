package com.p243my.target;

import android.content.Context;
import com.p243my.target.common.models.VideoData;

/* renamed from: com.my.target.m7 */
public class C7552m7 {

    /* renamed from: a */
    public final C7599p3 f19043a;

    /* renamed from: b */
    public final Context f19044b;

    /* renamed from: c */
    public boolean f19045c = C7566n8.m19950a();

    public C7552m7(C7599p3 p3Var, Context context) {
        this.f19043a = p3Var;
        this.f19044b = context;
    }

    /* renamed from: a */
    public static C7552m7 m19850a(C7599p3 p3Var, Context context) {
        return new C7552m7(p3Var, context);
    }

    /* renamed from: a */
    public C7364d7 mo50890a(C7761y8 y8Var, boolean z) {
        return new C7364d7(this.f19044b, y8Var, z, this.f19045c);
    }

    /* renamed from: a */
    public C7486j7 mo50891a() {
        return new C7486j7(this.f19044b);
    }

    /* renamed from: a */
    public C7679t8 mo50892a(C7413g2<VideoData> g2Var) {
        return C7679t8.m20486a(g2Var, this.f19043a, this.f19044b);
    }

    /* renamed from: a */
    public void mo50893a(boolean z) {
        this.f19045c = z && C7566n8.m19950a();
    }

    /* renamed from: b */
    public C7405f7 mo50894b(C7761y8 y8Var, boolean z) {
        return new C7405f7(this.f19044b, y8Var, z);
    }

    /* renamed from: b */
    public C7781z6 mo50895b() {
        return new C7348c7(this.f19044b, this);
    }

    /* renamed from: c */
    public C7781z6 mo50896c() {
        return new C7382e7(this.f19044b, this.f19045c);
    }
}
