package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.fyber.inneractive.sdk.util.C3632am;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: com.fyber.inneractive.sdk.util.i */
public final class C3653i {

    /* renamed from: a */
    Queue<C3632am> f9934a = new PriorityQueue();

    /* renamed from: a */
    private static Uri m9079a(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo19572a(C3632am.C3633a aVar, String str, List<String> list) {
        Uri a = m9079a(str);
        if (a != null) {
            this.f9934a.offer(new C3632am(aVar, a, list));
        }
    }
}
