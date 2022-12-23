package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.p243my.target.C7308a7;
import com.p243my.target.common.models.ImageData;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.my.target.j7 */
public class C7486j7 extends ViewGroup implements View.OnTouchListener, C7308a7 {

    /* renamed from: a */
    public final TextView f18832a;

    /* renamed from: b */
    public final TextView f18833b;

    /* renamed from: c */
    public final TextView f18834c;

    /* renamed from: d */
    public final C7422g6 f18835d;

    /* renamed from: e */
    public final C7761y8 f18836e;

    /* renamed from: f */
    public final C7506k6 f18837f;

    /* renamed from: g */
    public final C7461i7 f18838g;

    /* renamed from: h */
    public final HashMap<View, Boolean> f18839h;

    /* renamed from: i */
    public final C7722w5 f18840i;

    /* renamed from: j */
    public final Button f18841j;

    /* renamed from: k */
    public final int f18842k;

    /* renamed from: l */
    public final int f18843l;

    /* renamed from: m */
    public final int f18844m;

    /* renamed from: n */
    public final boolean f18845n;

    /* renamed from: o */
    public final double f18846o;

    /* renamed from: p */
    public C7308a7.C7309a f18847p;

    /* renamed from: com.my.target.j7$a */
    public class C7487a implements View.OnClickListener {
        public C7487a() {
        }

        public void onClick(View view) {
            if (C7486j7.this.f18847p != null) {
                C7486j7.this.f18847p.mo49609d();
            }
        }
    }

    /* renamed from: com.my.target.j7$b */
    public interface C7488b {
        /* renamed from: a */
        void mo50594a(C7342c2 c2Var);

        /* renamed from: a */
        void mo50595a(List<C7342c2> list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7486j7(Context context) {
        super(context);
        Context context2 = context;
        C7761y8.m20936a((View) this, -1, -3806472);
        boolean z = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        this.f18845n = z;
        this.f18846o = z ? 0.5d : 0.7d;
        C7422g6 g6Var = new C7422g6(context2);
        this.f18835d = g6Var;
        C7761y8 c = C7761y8.m20950c(context);
        this.f18836e = c;
        TextView textView = new TextView(context2);
        this.f18832a = textView;
        TextView textView2 = new TextView(context2);
        this.f18833b = textView2;
        TextView textView3 = new TextView(context2);
        this.f18834c = textView3;
        C7506k6 k6Var = new C7506k6(context2);
        this.f18837f = k6Var;
        Button button = new Button(context2);
        this.f18841j = button;
        C7461i7 i7Var = new C7461i7(context2);
        this.f18838g = i7Var;
        g6Var.setContentDescription("close");
        g6Var.setVisibility(4);
        k6Var.setContentDescription(RewardPlus.ICON);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        button.setPadding(c.mo51902b(15), c.mo51902b(10), c.mo51902b(15), c.mo51902b(10));
        button.setMinimumWidth(c.mo51902b(100));
        button.setMaxEms(12);
        button.setTransformationMethod((TransformationMethod) null);
        button.setSingleLine();
        button.setTextSize(18.0f);
        button.setEllipsize(TextUtils.TruncateAt.END);
        if (Build.VERSION.SDK_INT >= 21) {
            button.setElevation((float) c.mo51902b(2));
        }
        C7761y8.m20946b(button, -16733198, -16746839, c.mo51902b(2));
        button.setTextColor(-1);
        i7Var.setPadding(0, 0, 0, c.mo51902b(8));
        i7Var.setSideSlidesMargins(c.mo51902b(10));
        if (z) {
            int b = c.mo51902b(18);
            this.f18843l = b;
            this.f18842k = b;
            textView.setTextSize((float) c.mo51903d(24));
            textView3.setTextSize((float) c.mo51903d(20));
            textView2.setTextSize((float) c.mo51903d(20));
            this.f18844m = c.mo51902b(96);
            textView.setTypeface((Typeface) null, 1);
        } else {
            this.f18842k = c.mo51902b(12);
            this.f18843l = c.mo51902b(10);
            textView.setTextSize(22.0f);
            textView3.setTextSize(18.0f);
            textView2.setTextSize(18.0f);
            this.f18844m = c.mo51902b(64);
        }
        C7722w5 w5Var = new C7722w5(context2);
        this.f18840i = w5Var;
        C7761y8.m20947b(this, "ad_view");
        C7761y8.m20947b(textView, "title_text");
        C7761y8.m20947b(textView3, "description_text");
        C7761y8.m20947b(k6Var, ViewHierarchyConstants.ICON_BITMAP);
        C7761y8.m20947b(g6Var, "close_button");
        C7761y8.m20947b(textView2, "category_text");
        addView(i7Var);
        addView(k6Var);
        addView(textView);
        addView(textView2);
        addView(w5Var);
        addView(textView3);
        addView(g6Var);
        addView(button);
        this.f18839h = new HashMap<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19517a(View view) {
        C7308a7.C7309a aVar = this.f18847p;
        if (aVar != null) {
            aVar.mo49610e();
        }
    }

    /* renamed from: a */
    public final void mo50601a(C7596p1 p1Var) {
        this.f18840i.setImageBitmap(p1Var.mo51318c().getBitmap());
        this.f18840i.setOnClickListener(new C7487a());
    }

    /* renamed from: d */
    public void mo49603d() {
        this.f18835d.setVisibility(0);
    }

    public View getCloseButton() {
        return this.f18835d;
    }

    public int[] getNumbersOfCurrentShowingCards() {
        int findFirstVisibleItemPosition = this.f18838g.getCardLayoutManager().findFirstVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = this.f18838g.getCardLayoutManager().findLastCompletelyVisibleItemPosition();
        int i = 0;
        if (findFirstVisibleItemPosition == -1 || findLastCompletelyVisibleItemPosition == -1) {
            return new int[0];
        }
        int i2 = (findLastCompletelyVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i2];
        while (i < i2) {
            iArr[i] = findFirstVisibleItemPosition;
            i++;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    public View getView() {
        return this;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        C7422g6 g6Var = this.f18835d;
        g6Var.layout(i3 - g6Var.getMeasuredWidth(), i2, i3, this.f18835d.getMeasuredHeight() + i2);
        C7761y8.m20938a((View) this.f18840i, this.f18835d.getLeft() - this.f18840i.getMeasuredWidth(), this.f18835d.getTop(), this.f18835d.getLeft(), this.f18835d.getBottom());
        if (i7 > i6 || this.f18845n) {
            int bottom = this.f18835d.getBottom();
            int measuredHeight = this.f18838g.getMeasuredHeight() + Math.max(this.f18832a.getMeasuredHeight() + this.f18833b.getMeasuredHeight(), this.f18837f.getMeasuredHeight()) + this.f18834c.getMeasuredHeight();
            int i8 = this.f18843l;
            int i9 = measuredHeight + (i8 * 2);
            if (i9 < i7 && (i5 = (i7 - i9) / 2) > bottom) {
                bottom = i5;
            }
            C7506k6 k6Var = this.f18837f;
            k6Var.layout(i8 + i, bottom, k6Var.getMeasuredWidth() + i + this.f18843l, i2 + this.f18837f.getMeasuredHeight() + bottom);
            this.f18832a.layout(this.f18837f.getRight(), bottom, this.f18837f.getRight() + this.f18832a.getMeasuredWidth(), this.f18832a.getMeasuredHeight() + bottom);
            this.f18833b.layout(this.f18837f.getRight(), this.f18832a.getBottom(), this.f18837f.getRight() + this.f18833b.getMeasuredWidth(), this.f18832a.getBottom() + this.f18833b.getMeasuredHeight());
            int max = Math.max(Math.max(this.f18837f.getBottom(), this.f18833b.getBottom()), this.f18832a.getBottom());
            TextView textView = this.f18834c;
            int i10 = this.f18843l + i;
            textView.layout(i10, max, textView.getMeasuredWidth() + i10, this.f18834c.getMeasuredHeight() + max);
            int max2 = Math.max(max, this.f18834c.getBottom());
            int i11 = this.f18843l;
            int i12 = max2 + i11;
            C7461i7 i7Var = this.f18838g;
            i7Var.layout(i + i11, i12, i3, i7Var.getMeasuredHeight() + i12);
            this.f18838g.mo50417a(!this.f18845n);
            return;
        }
        this.f18838g.mo50417a(false);
        C7506k6 k6Var2 = this.f18837f;
        int i13 = this.f18843l;
        k6Var2.layout(i13, (i4 - i13) - k6Var2.getMeasuredHeight(), this.f18843l + this.f18837f.getMeasuredWidth(), i4 - this.f18843l);
        int max3 = ((Math.max(this.f18837f.getMeasuredHeight(), this.f18841j.getMeasuredHeight()) - this.f18832a.getMeasuredHeight()) - this.f18833b.getMeasuredHeight()) / 2;
        if (max3 < 0) {
            max3 = 0;
        }
        this.f18833b.layout(this.f18837f.getRight(), ((i4 - this.f18843l) - max3) - this.f18833b.getMeasuredHeight(), this.f18837f.getRight() + this.f18833b.getMeasuredWidth(), (i4 - this.f18843l) - max3);
        this.f18832a.layout(this.f18837f.getRight(), this.f18833b.getTop() - this.f18832a.getMeasuredHeight(), this.f18837f.getRight() + this.f18832a.getMeasuredWidth(), this.f18833b.getTop());
        int max4 = (Math.max(this.f18837f.getMeasuredHeight(), this.f18832a.getMeasuredHeight() + this.f18833b.getMeasuredHeight()) - this.f18841j.getMeasuredHeight()) / 2;
        if (max4 < 0) {
            max4 = 0;
        }
        Button button = this.f18841j;
        int measuredWidth = (i3 - this.f18843l) - button.getMeasuredWidth();
        int measuredHeight2 = ((i4 - this.f18843l) - max4) - this.f18841j.getMeasuredHeight();
        int i14 = this.f18843l;
        button.layout(measuredWidth, measuredHeight2, i3 - i14, (i4 - i14) - max4);
        C7461i7 i7Var2 = this.f18838g;
        int i15 = this.f18843l;
        i7Var2.layout(i15, i15, i3, i7Var2.getMeasuredHeight() + i15);
        this.f18834c.layout(0, 0, 0, 0);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C7461i7 i7Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f18835d.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f18837f.measure(View.MeasureSpec.makeMeasureSpec(this.f18844m, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f18844m, Integer.MIN_VALUE));
        this.f18840i.measure(i, i2);
        if (size2 > size || this.f18845n) {
            this.f18841j.setVisibility(8);
            int measuredHeight = this.f18835d.getMeasuredHeight();
            if (this.f18845n) {
                measuredHeight = this.f18843l;
            }
            this.f18832a.measure(View.MeasureSpec.makeMeasureSpec((size - (this.f18843l * 2)) - this.f18837f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f18833b.measure(View.MeasureSpec.makeMeasureSpec((size - (this.f18843l * 2)) - this.f18837f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f18834c.measure(View.MeasureSpec.makeMeasureSpec(size - (this.f18843l * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int max = ((size2 - measuredHeight) - Math.max(this.f18832a.getMeasuredHeight() + this.f18833b.getMeasuredHeight(), this.f18837f.getMeasuredHeight() - (this.f18843l * 2))) - this.f18834c.getMeasuredHeight();
            int i5 = size - this.f18843l;
            if (size2 > size) {
                double d = this.f18846o;
                if (((double) (((float) max) / ((float) size2))) > d) {
                    max = (int) (((double) size2) * d);
                }
            }
            if (this.f18845n) {
                i7Var = this.f18838g;
                i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                i4 = View.MeasureSpec.makeMeasureSpec(max - (this.f18843l * 2), Integer.MIN_VALUE);
            } else {
                i7Var = this.f18838g;
                i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                i4 = View.MeasureSpec.makeMeasureSpec(max - (this.f18843l * 2), 1073741824);
            }
            i7Var.measure(i3, i4);
        } else {
            this.f18841j.setVisibility(0);
            this.f18841j.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int measuredWidth = this.f18841j.getMeasuredWidth();
            int i6 = (size / 2) - (this.f18843l * 2);
            if (measuredWidth > i6) {
                this.f18841j.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
            this.f18832a.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f18837f.getMeasuredWidth()) - measuredWidth) - this.f18842k) - this.f18843l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f18833b.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f18837f.getMeasuredWidth()) - measuredWidth) - this.f18842k) - this.f18843l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f18838g.measure(View.MeasureSpec.makeMeasureSpec(size - this.f18843l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((((size2 - Math.max(this.f18837f.getMeasuredHeight(), Math.max(this.f18841j.getMeasuredHeight(), this.f18832a.getMeasuredHeight() + this.f18833b.getMeasuredHeight()))) - (this.f18843l * 2)) - this.f18838g.getPaddingBottom()) - this.f18838g.getPaddingTop(), Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, size2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f18839h.containsKey(view)) {
            return false;
        }
        if (!this.f18839h.get(view).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(-3806472);
        } else if (action == 1) {
            setBackgroundColor(-1);
            C7308a7.C7309a aVar = this.f18847p;
            if (aVar != null) {
                aVar.mo49610e();
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    public void setBanner(C7399f2 f2Var) {
        ImageData closeIcon = f2Var.getCloseIcon();
        if (closeIcon == null || closeIcon.getData() == null) {
            Bitmap a = C7607p5.m20092a(this.f18836e.mo51902b(28));
            if (a != null) {
                this.f18835d.mo50226a(a, false);
            }
        } else {
            this.f18835d.mo50226a(closeIcon.getData(), true);
        }
        this.f18841j.setText(f2Var.getCtaText());
        ImageData icon = f2Var.getIcon();
        if (icon != null) {
            this.f18837f.setPlaceholderDimensions(icon.getWidth(), icon.getHeight());
            C7509k8.m19623b(icon, this.f18837f);
        }
        this.f18832a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f18832a.setText(f2Var.getTitle());
        String category = f2Var.getCategory();
        String subCategory = f2Var.getSubCategory();
        String str = "";
        if (!TextUtils.isEmpty(category)) {
            str = str + category;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(subCategory)) {
            str = str + ", ";
        }
        if (!TextUtils.isEmpty(subCategory)) {
            str = str + subCategory;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f18833b.setText(str);
            this.f18833b.setVisibility(0);
        } else {
            this.f18833b.setVisibility(8);
        }
        this.f18834c.setText(f2Var.getDescription());
        this.f18838g.mo50416a(f2Var.getInterstitialAdCards());
        C7596p1 adChoices = f2Var.getAdChoices();
        if (adChoices != null) {
            mo50601a(adChoices);
        } else {
            this.f18840i.setVisibility(8);
        }
    }

    public void setCarouselListener(C7488b bVar) {
        this.f18838g.setCarouselListener(bVar);
    }

    public void setClickArea(C7631r1 r1Var) {
        boolean z = true;
        if (r1Var.f19290o) {
            setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C7486j7.this.m19517a(view);
                }
            });
            C7761y8.m20936a((View) this, -1, -3806472);
            setClickable(true);
            return;
        }
        this.f18832a.setOnTouchListener(this);
        this.f18833b.setOnTouchListener(this);
        this.f18837f.setOnTouchListener(this);
        this.f18834c.setOnTouchListener(this);
        this.f18841j.setOnTouchListener(this);
        setOnTouchListener(this);
        this.f18839h.put(this.f18832a, Boolean.valueOf(r1Var.f19278c));
        this.f18839h.put(this.f18833b, Boolean.valueOf(r1Var.f19288m));
        this.f18839h.put(this.f18837f, Boolean.valueOf(r1Var.f19280e));
        this.f18839h.put(this.f18834c, Boolean.valueOf(r1Var.f19279d));
        HashMap<View, Boolean> hashMap = this.f18839h;
        Button button = this.f18841j;
        if (!r1Var.f19289n && !r1Var.f19284i) {
            z = false;
        }
        hashMap.put(button, Boolean.valueOf(z));
        this.f18839h.put(this, Boolean.valueOf(r1Var.f19289n));
    }

    public void setInterstitialPromoViewListener(C7308a7.C7309a aVar) {
        this.f18847p = aVar;
    }
}
