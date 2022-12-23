package com.p243my.target;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.p243my.target.C7596p1;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;

/* renamed from: com.my.target.v5 */
public class C7702v5 extends FrameLayout {

    /* renamed from: a */
    public final ListView f19517a;

    /* renamed from: b */
    public final ImageButton f19518b;

    /* renamed from: c */
    public final View f19519c;

    /* renamed from: d */
    public final int f19520d;

    /* renamed from: e */
    public final int f19521e;

    /* renamed from: com.my.target.v5$a */
    public interface C7703a {
        /* renamed from: a */
        void mo50259a();

        /* renamed from: a */
        void mo50262a(C7596p1.C7597a aVar, Context context);
    }

    /* renamed from: com.my.target.v5$b */
    public static class C7704b implements View.OnClickListener {

        /* renamed from: a */
        public final C7703a f19522a;

        public C7704b(C7703a aVar) {
            this.f19522a = aVar;
        }

        public void onClick(View view) {
            this.f19522a.mo50259a();
        }
    }

    /* renamed from: com.my.target.v5$c */
    public static class C7705c implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final C7703a f19523a;

        /* renamed from: b */
        public final List<C7596p1.C7597a> f19524b;

        public C7705c(C7703a aVar, List<C7596p1.C7597a> list) {
            this.f19523a = aVar;
            this.f19524b = list;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0 && i < this.f19524b.size()) {
                this.f19523a.mo50262a(this.f19524b.get(i), view.getContext());
            }
        }
    }

    /* renamed from: com.my.target.v5$d */
    public static class C7706d extends BaseAdapter {

        /* renamed from: a */
        public final List<C7596p1.C7597a> f19525a;

        public C7706d(List<C7596p1.C7597a> list) {
            this.f19525a = list;
        }

        public int getCount() {
            return this.f19525a.size();
        }

        public Object getItem(int i) {
            return this.f19525a.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Button button = new Button(viewGroup.getContext());
            boolean z = false;
            button.setFocusable(false);
            button.setFocusableInTouchMode(false);
            button.setClickable(false);
            C7761y8 c = C7761y8.m20950c(viewGroup.getContext());
            int b = c.mo51902b(24);
            button.setPadding(b, button.getPaddingTop(), b, button.getPaddingBottom());
            button.setAllCaps(false);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                button.setStateListAnimator((StateListAnimator) null);
            }
            button.setLines(1);
            button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            button.setEllipsize(TextUtils.TruncateAt.END);
            button.setTypeface((Typeface) null, 0);
            button.setGravity(8388627);
            button.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            if (i == 0) {
                z = true;
            }
            Drawable a = C7702v5.m20674b(c, z);
            if (i2 >= 16) {
                button.setBackground(a);
            } else {
                button.setBackgroundDrawable(a);
            }
            if (i >= 0 && i < this.f19525a.size()) {
                button.setText(this.f19525a.get(i).f19166a);
            }
            return button;
        }
    }

    public C7702v5(Context context) {
        super(context);
        ListView listView = new ListView(context);
        this.f19517a = listView;
        C7761y8 c = C7761y8.m20950c(context);
        this.f19520d = c.mo51902b((int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL);
        this.f19521e = c.mo51901a(0.5f);
        ImageButton imageButton = new ImageButton(context);
        this.f19518b = imageButton;
        imageButton.setImageBitmap(C7607p5.m20094a(context));
        C7761y8.m20936a((View) imageButton, -1, -3158065);
        View view = new View(context);
        this.f19519c = view;
        view.setBackgroundColor(-5131855);
        addView(listView);
        addView(view);
        addView(imageButton);
    }

    /* renamed from: b */
    public static Drawable m20674b(C7761y8 y8Var, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, -1});
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3158065, -3158065});
        if (z) {
            float b = (float) y8Var.mo51902b(8);
            float[] fArr = {b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f};
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable2.setCornerRadii(fArr);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        if (Build.VERSION.SDK_INT < 21) {
            return stateListDrawable;
        }
        return new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.WILD_CARD}, new int[]{C7761y8.m20929a(-3158065), C7761y8.m20929a(-1)}), stateListDrawable, (Drawable) null);
    }

    /* renamed from: a */
    public void mo51731a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 512.0f, 0.0f);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        this.f19517a.startAnimation(translateAnimation);
    }

    /* renamed from: a */
    public void mo51732a(List<C7596p1.C7597a> list, C7703a aVar) {
        if (list != null) {
            this.f19517a.setAdapter(new C7706d(list));
            this.f19517a.setOnItemClickListener(new C7705c(aVar, list));
            C7704b bVar = new C7704b(aVar);
            this.f19518b.setOnClickListener(bVar);
            setOnClickListener(bVar);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max((i3 - this.f19517a.getMeasuredWidth()) / 2, getPaddingLeft());
        this.f19518b.layout(max, (i4 - getPaddingBottom()) - this.f19518b.getMeasuredHeight(), this.f19518b.getMeasuredWidth() + max, i4 - getPaddingBottom());
        this.f19519c.layout(max, this.f19518b.getTop() - this.f19519c.getMeasuredHeight(), this.f19519c.getMeasuredWidth() + max, this.f19518b.getTop());
        this.f19517a.layout(max, this.f19519c.getTop() - this.f19517a.getMeasuredHeight(), this.f19517a.getMeasuredWidth() + max, this.f19519c.getTop());
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = (Math.min(size, this.f19520d) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        this.f19518b.measure(makeMeasureSpec, paddingTop);
        this.f19519c.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.f19521e, 1073741824));
        this.f19517a.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((paddingTop - this.f19521e) - this.f19518b.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, size2);
    }
}
