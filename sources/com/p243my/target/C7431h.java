package com.p243my.target;

import android.content.Context;
import com.p243my.target.common.models.VideoData;
import java.util.Iterator;

/* renamed from: com.my.target.h */
public class C7431h extends C7355d<C7632r2> {
    /* renamed from: a */
    public static C7431h m19219a() {
        return new C7431h();
    }

    /* renamed from: a */
    public C7632r2 mo49976a(C7632r2 r2Var, C7298a aVar, Context context) {
        Iterator<C7686u2<VideoData>> it = r2Var.mo51446c().iterator();
        while (it.hasNext()) {
            it.next().mo51657c();
        }
        return r2Var;
    }
}
