package com.p243my.target;

import android.content.Context;
import com.p243my.target.common.models.VideoData;

/* renamed from: com.my.target.i1 */
public class C7452i1 {

    /* renamed from: a */
    public final C7599p3 f18733a;

    /* renamed from: b */
    public final Context f18734b;

    /* renamed from: c */
    public boolean f18735c = C7566n8.m19950a();

    public C7452i1(C7599p3 p3Var, Context context) {
        this.f18733a = p3Var;
        this.f18734b = context;
    }

    /* renamed from: a */
    public static C7452i1 m19324a(C7599p3 p3Var, Context context) {
        return new C7452i1(p3Var, context);
    }

    /* renamed from: a */
    public C7353c9 mo50356a() {
        return this.f18735c ? C7389e9.m19051a(this.f18734b) : C7370d9.m18958p();
    }

    /* renamed from: a */
    public C7679t8 mo50357a(C7413g2<VideoData> g2Var) {
        return C7679t8.m20486a(g2Var, this.f18733a, this.f18734b);
    }

    /* renamed from: a */
    public void mo50358a(boolean z) {
        this.f18735c = z && C7566n8.m19950a();
    }
}
