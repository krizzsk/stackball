package com.p243my.target;

import com.p243my.target.C7486j7;
import com.p243my.target.C7667t4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.j4 */
public class C7481j4 {

    /* renamed from: a */
    public final C7308a7 f18825a;

    /* renamed from: b */
    public final ArrayList<C7342c2> f18826b = new ArrayList<>();

    /* renamed from: c */
    public C7667t4.C7670c f18827c;

    /* renamed from: com.my.target.j4$b */
    public class C7483b implements C7486j7.C7488b {
        public C7483b() {
        }

        /* renamed from: a */
        public void mo50594a(C7342c2 c2Var) {
            if (C7481j4.this.f18827c != null) {
                C7481j4.this.f18827c.mo51335a(c2Var, (String) null, C7481j4.this.f18825a.getView().getContext());
            }
        }

        /* renamed from: a */
        public void mo50595a(List<C7342c2> list) {
            for (C7342c2 next : list) {
                if (!C7481j4.this.f18826b.contains(next)) {
                    C7481j4.this.f18826b.add(next);
                    C7741x8.m20827c((List<C7328b3>) next.getStatHolder().mo49800a("playbackStarted"), C7481j4.this.f18825a.getView().getContext());
                    C7741x8.m20827c((List<C7328b3>) next.getStatHolder().mo49800a("show"), C7481j4.this.f18825a.getView().getContext());
                }
            }
        }
    }

    public C7481j4(List<C7342c2> list, C7486j7 j7Var) {
        this.f18825a = j7Var;
        j7Var.setCarouselListener(new C7483b());
        for (int i : j7Var.getNumbersOfCurrentShowingCards()) {
            if (i < list.size() && i >= 0) {
                C7342c2 c2Var = list.get(i);
                this.f18826b.add(c2Var);
                C7741x8.m20827c((List<C7328b3>) c2Var.getStatHolder().mo49800a("playbackStarted"), j7Var.getView().getContext());
            }
        }
    }

    /* renamed from: a */
    public static C7481j4 m19505a(List<C7342c2> list, C7486j7 j7Var) {
        return new C7481j4(list, j7Var);
    }

    /* renamed from: a */
    public void mo50593a(C7667t4.C7670c cVar) {
        this.f18827c = cVar;
    }
}
