package com.p243my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.p243my.target.C7440h7;
import com.p243my.target.C7486j7;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.views.StarsRatingView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.i7 */
public class C7461i7 extends RecyclerView {

    /* renamed from: a */
    public final View.OnClickListener f18770a;

    /* renamed from: b */
    public final C7440h7 f18771b;

    /* renamed from: c */
    public final View.OnClickListener f18772c;

    /* renamed from: d */
    public final LinearSnapHelper f18773d;

    /* renamed from: e */
    public List<C7342c2> f18774e;

    /* renamed from: f */
    public C7486j7.C7488b f18775f;

    /* renamed from: g */
    public boolean f18776g;

    /* renamed from: h */
    public boolean f18777h;

    /* renamed from: com.my.target.i7$a */
    public class C7462a implements View.OnClickListener {
        public C7462a() {
        }

        public void onClick(View view) {
            View findContainingItemView;
            if (C7461i7.this.f18776g || (findContainingItemView = C7461i7.this.getCardLayoutManager().findContainingItemView(view)) == null) {
                return;
            }
            if (!C7461i7.this.getCardLayoutManager().mo50312a(findContainingItemView) && !C7461i7.this.f18777h) {
                C7461i7.this.mo50415a(findContainingItemView);
            } else if (view.isClickable() && C7461i7.this.f18775f != null && C7461i7.this.f18774e != null) {
                C7461i7.this.f18775f.mo50594a((C7342c2) C7461i7.this.f18774e.get(C7461i7.this.getCardLayoutManager().getPosition(findContainingItemView)));
            }
        }
    }

    /* renamed from: com.my.target.i7$b */
    public class C7463b implements View.OnClickListener {
        public C7463b() {
        }

        public void onClick(View view) {
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof C7423g7)) {
                parent = parent.getParent();
            }
            if (C7461i7.this.f18775f != null && C7461i7.this.f18774e != null && parent != null) {
                C7461i7.this.f18775f.mo50594a((C7342c2) C7461i7.this.f18774e.get(C7461i7.this.getCardLayoutManager().getPosition((View) parent)));
            }
        }
    }

    /* renamed from: com.my.target.i7$c */
    public static class C7464c extends RecyclerView.Adapter<C7465d> {

        /* renamed from: a */
        public final Context f18780a;

        /* renamed from: b */
        public final List<C7342c2> f18781b;

        /* renamed from: c */
        public final List<C7342c2> f18782c = new ArrayList();

        /* renamed from: d */
        public final boolean f18783d;

        /* renamed from: e */
        public View.OnClickListener f18784e;

        /* renamed from: f */
        public View.OnClickListener f18785f;

        public C7464c(List<C7342c2> list, Context context) {
            this.f18781b = list;
            this.f18780a = context;
            this.f18783d = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        }

        /* renamed from: a */
        public C7465d onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C7465d(new C7423g7(this.f18783d, this.f18780a));
        }

        /* renamed from: a */
        public List<C7342c2> mo50425a() {
            return this.f18781b;
        }

        /* renamed from: a */
        public void mo50426a(View.OnClickListener onClickListener) {
            this.f18785f = onClickListener;
        }

        /* renamed from: a */
        public final void mo50427a(C7342c2 c2Var, C7423g7 g7Var) {
            ImageData image = c2Var.getImage();
            if (image != null) {
                C7506k6 smartImageView = g7Var.getSmartImageView();
                smartImageView.setPlaceholderDimensions(image.getWidth(), image.getHeight());
                C7509k8.m19623b(image, smartImageView);
            }
            g7Var.getTitleTextView().setText(c2Var.getTitle());
            g7Var.getDescriptionTextView().setText(c2Var.getDescription());
            g7Var.getCtaButtonView().setText(c2Var.getCtaText());
            TextView domainTextView = g7Var.getDomainTextView();
            String domain = c2Var.getDomain();
            StarsRatingView ratingView = g7Var.getRatingView();
            if ("web".equals(c2Var.getNavigationType())) {
                ratingView.setVisibility(8);
                domainTextView.setVisibility(0);
                domainTextView.setText(domain);
                return;
            }
            domainTextView.setVisibility(8);
            float rating = c2Var.getRating();
            if (rating > 0.0f) {
                ratingView.setVisibility(0);
                ratingView.setRating(rating);
                return;
            }
            ratingView.setVisibility(8);
        }

        /* renamed from: a */
        public void onViewRecycled(C7465d dVar) {
            C7423g7 a = dVar.mo50431a();
            a.mo50233a((View.OnClickListener) null, (C7631r1) null);
            a.getCtaButtonView().setOnClickListener((View.OnClickListener) null);
        }

        /* renamed from: a */
        public void onBindViewHolder(C7465d dVar, int i) {
            C7423g7 a = dVar.mo50431a();
            C7342c2 c2Var = mo50425a().get(i);
            if (!this.f18782c.contains(c2Var)) {
                this.f18782c.add(c2Var);
                C7741x8.m20827c((List<C7328b3>) c2Var.getStatHolder().mo49800a("render"), dVar.itemView.getContext());
            }
            mo50427a(c2Var, a);
            a.mo50233a(this.f18784e, c2Var.getClickArea());
            a.getCtaButtonView().setOnClickListener(this.f18785f);
        }

        /* renamed from: b */
        public void mo50430b(View.OnClickListener onClickListener) {
            this.f18784e = onClickListener;
        }

        public int getItemCount() {
            return mo50425a().size();
        }

        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == getItemCount() - 1 ? 2 : 0;
        }
    }

    /* renamed from: com.my.target.i7$d */
    public static class C7465d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final C7423g7 f18786a;

        public C7465d(C7423g7 g7Var) {
            super(g7Var);
            this.f18786a = g7Var;
        }

        /* renamed from: a */
        public C7423g7 mo50431a() {
            return this.f18786a;
        }
    }

    public C7461i7(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7461i7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7461i7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18770a = new C7462a();
        this.f18772c = new C7463b();
        setOverScrollMode(2);
        this.f18771b = new C7440h7(context);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        this.f18773d = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(this);
    }

    private List<C7342c2> getVisibleCards() {
        int findFirstCompletelyVisibleItemPosition;
        int findLastCompletelyVisibleItemPosition;
        ArrayList arrayList = new ArrayList();
        if (this.f18774e != null && (findFirstCompletelyVisibleItemPosition = getCardLayoutManager().findFirstCompletelyVisibleItemPosition()) <= (findLastCompletelyVisibleItemPosition = getCardLayoutManager().findLastCompletelyVisibleItemPosition()) && findFirstCompletelyVisibleItemPosition >= 0 && findLastCompletelyVisibleItemPosition < this.f18774e.size()) {
            while (findFirstCompletelyVisibleItemPosition <= findLastCompletelyVisibleItemPosition) {
                arrayList.add(this.f18774e.get(findFirstCompletelyVisibleItemPosition));
                findFirstCompletelyVisibleItemPosition++;
            }
        }
        return arrayList;
    }

    private void setCardLayoutManager(C7440h7 h7Var) {
        h7Var.mo50311a((C7440h7.C7441a) new C7440h7.C7441a() {
            /* renamed from: a */
            public final void mo49453a() {
                C7461i7.this.mo50414a();
            }
        });
        super.setLayoutManager(h7Var);
    }

    /* renamed from: a */
    public final void mo50414a() {
        C7486j7.C7488b bVar = this.f18775f;
        if (bVar != null) {
            bVar.mo50595a(getVisibleCards());
        }
    }

    /* renamed from: a */
    public void mo50415a(View view) {
        int[] calculateDistanceToFinalSnap = this.f18773d.calculateDistanceToFinalSnap(getCardLayoutManager(), view);
        if (calculateDistanceToFinalSnap != null) {
            smoothScrollBy(calculateDistanceToFinalSnap[0], 0);
        }
    }

    /* renamed from: a */
    public void mo50416a(List<C7342c2> list) {
        C7464c cVar = new C7464c(list, getContext());
        this.f18774e = list;
        cVar.mo50430b(this.f18770a);
        cVar.mo50426a(this.f18772c);
        setCardLayoutManager(this.f18771b);
        setAdapter(cVar);
    }

    /* renamed from: a */
    public void mo50417a(boolean z) {
        if (z) {
            this.f18773d.attachToRecyclerView(this);
        } else {
            this.f18773d.attachToRecyclerView((RecyclerView) null);
        }
    }

    public C7440h7 getCardLayoutManager() {
        return this.f18771b;
    }

    public LinearSnapHelper getSnapHelper() {
        return this.f18773d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 > i4) {
            this.f18777h = true;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.f18776g = z;
        if (!z) {
            mo50414a();
        }
    }

    public void setCarouselListener(C7486j7.C7488b bVar) {
        this.f18775f = bVar;
    }

    public void setSideSlidesMargins(int i) {
        getCardLayoutManager().mo50310a(i);
    }
}
