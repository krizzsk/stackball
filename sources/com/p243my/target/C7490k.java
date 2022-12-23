package com.p243my.target;

import android.content.Context;
import com.p243my.target.common.models.AudioData;
import java.util.Iterator;

/* renamed from: com.my.target.k */
public class C7490k extends C7355d<C7647s2> {
    /* renamed from: a */
    public static C7490k m19523a() {
        return new C7490k();
    }

    /* renamed from: a */
    public C7647s2 mo49976a(C7647s2 s2Var, C7298a aVar, Context context) {
        Iterator<C7686u2<AudioData>> it = s2Var.mo51480c().iterator();
        while (it.hasNext()) {
            it.next().mo51657c();
        }
        return s2Var;
    }
}
