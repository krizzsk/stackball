package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.z */
public class C7764z {

    /* renamed from: a */
    public final ArrayList<C7717w1> f19725a;

    /* renamed from: b */
    public final ArrayList<C7303a3> f19726b;

    /* renamed from: c */
    public int f19727c = -1;

    public C7764z(C7343c3 c3Var) {
        ArrayList<C7717w1> arrayList = new ArrayList<>();
        Iterator<C7328b3> it = c3Var.mo49800a("playheadTimerValue").iterator();
        while (it.hasNext()) {
            C7328b3 next = it.next();
            if (next instanceof C7717w1) {
                arrayList.add((C7717w1) next);
            }
        }
        this.f19725a = arrayList;
        ArrayList<C7303a3> arrayList2 = new ArrayList<>();
        this.f19726b = arrayList2;
        c3Var.mo49806b(arrayList2);
    }

    /* renamed from: a */
    public static C7764z m20958a(C7343c3 c3Var) {
        return new C7764z(c3Var);
    }

    /* renamed from: a */
    public void mo51905a(int i, int i2, Context context) {
        if (i2 >= 0 && i >= 0 && i != this.f19727c) {
            this.f19727c = i;
            if (!this.f19725a.isEmpty() && i != 0) {
                Iterator<C7717w1> it = this.f19725a.iterator();
                while (it.hasNext()) {
                    mo51906a(i, it.next(), context);
                }
            }
            ArrayList arrayList = new ArrayList();
            while (!this.f19726b.isEmpty()) {
                ArrayList<C7303a3> arrayList2 = this.f19726b;
                if (arrayList2.get(arrayList2.size() - 1).mo49575e() > ((float) i)) {
                    break;
                }
                ArrayList<C7303a3> arrayList3 = this.f19726b;
                arrayList.add(arrayList3.remove(arrayList3.size() - 1));
            }
            if (!arrayList.isEmpty()) {
                C7741x8.m20827c((List<C7328b3>) arrayList, context);
            }
        }
    }

    /* renamed from: a */
    public final void mo51906a(int i, C7717w1 w1Var, Context context) {
        int f = w1Var.mo51769f();
        int d = w1Var.mo51767d();
        if ((f <= i && (d == 0 || d >= i)) && (i - f) % w1Var.mo51768e() == 0) {
            String replace = w1Var.mo49729b().replace("[CONTENTPLAYHEAD]", String.valueOf(i));
            if (!TextUtils.isEmpty(replace)) {
                C7741x8.m20826c(replace, context);
            }
        }
    }
}
