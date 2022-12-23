package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7372e;
import java.util.Map;

/* renamed from: com.my.target.n */
public class C7554n extends C7372e.C7373a {

    /* renamed from: b */
    public final int f19051b;

    public C7554n(int i) {
        this.f19051b = i;
    }

    /* renamed from: a */
    public static C7372e m19859a(int i) {
        return new C7554n(i);
    }

    /* renamed from: c */
    public Map<String, String> mo50043c(C7298a aVar, Context context) {
        Map<String, String> c = super.mo50043c(aVar, context);
        c.put("duration", Integer.toString(this.f19051b));
        return c;
    }
}
