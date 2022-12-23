package com.p243my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.p243my.target.C7589o7;
import com.p243my.target.C7620q4;
import com.p243my.target.C7649s4;
import com.p243my.target.C7657s7;
import com.p243my.target.C7720w4;
import com.p243my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.n7 */
public class C7565n7 {

    /* renamed from: a */
    public final C7698v1 f19097a;

    /* renamed from: b */
    public final C7599p3 f19098b;

    /* renamed from: c */
    public final Context f19099c;

    /* renamed from: d */
    public final C7740x7 f19100d;

    /* renamed from: e */
    public boolean f19101e = C7566n8.m19950a();

    public C7565n7(C7698v1 v1Var, C7599p3 p3Var, Context context) {
        this.f19097a = v1Var;
        this.f19098b = p3Var;
        this.f19099c = context;
        this.f19100d = C7740x7.m20818a(context);
    }

    /* renamed from: a */
    public static C7565n7 m19937a(C7698v1 v1Var, C7599p3 p3Var, Context context) {
        return new C7565n7(v1Var, p3Var, context);
    }

    /* renamed from: a */
    public C7562n4 mo51004a(C7413g2<VideoData> g2Var, C7757y5 y5Var, C7649s4.C7650a aVar) {
        return C7649s4.m20318a(g2Var, y5Var, aVar, this, this.f19101e ? C7389e9.m19051a(y5Var.getContext()) : C7370d9.m18958p());
    }

    /* renamed from: a */
    public C7589o7 mo51005a(C7589o7.C7590a aVar) {
        return new C7611p7(this.f19100d, this.f19099c, aVar);
    }

    /* renamed from: a */
    public C7620q4 mo51006a(C7342c2 c2Var, C7620q4.C7621a aVar) {
        return C7634r4.m20242a(c2Var, aVar);
    }

    /* renamed from: a */
    public C7657s7 mo51007a(C7399f2 f2Var, View view, View view2, View view3, C7657s7.C7658a aVar) {
        if (!f2Var.getInterstitialAdCards().isEmpty()) {
            return new C7694u7(f2Var.getInterstitialAdCards().get(0).isImageOnly(), view, view2, aVar, view3, this.f19100d, this.f19099c);
        } else if (f2Var.getVideoBanner() != null) {
            return new C7724w7(view, view2, aVar, view3, this.f19100d, this.f19099c);
        } else {
            return new C7709v7(view, view2, aVar, view3, this.f19100d, this.f19099c);
        }
    }

    /* renamed from: a */
    public C7679t8 mo51008a(C7413g2<VideoData> g2Var) {
        return C7679t8.m20486a(g2Var, this.f19098b, this.f19099c);
    }

    /* renamed from: a */
    public C7720w4 mo51009a(C7388e8 e8Var, List<C7342c2> list, C7720w4.C7721a aVar) {
        C7720w4 a = C7701v4.m20669a((C7368d8) e8Var, list, aVar);
        ArrayList arrayList = new ArrayList();
        for (C7342c2 a2 : list) {
            arrayList.add(mo51006a(a2, a));
        }
        e8Var.setAdapter(new C7760y7(arrayList, this));
        return a;
    }

    /* renamed from: a */
    public C7782z7 mo51010a() {
        return new C7310a8(this.f19099c, this.f19097a, this.f19100d);
    }

    /* renamed from: a */
    public void mo51011a(boolean z) {
        this.f19101e = z && C7566n8.m19950a();
    }

    /* renamed from: b */
    public C7757y5 mo51012b() {
        return new C7757y5(this.f19099c);
    }

    /* renamed from: c */
    public C7388e8 mo51013c() {
        return new C7388e8(this.f19099c);
    }

    /* renamed from: d */
    public Handler mo51014d() {
        return new Handler(Looper.getMainLooper());
    }

    /* renamed from: e */
    public C7628q7 mo51015e() {
        return new C7638r7(this.f19099c);
    }
}
