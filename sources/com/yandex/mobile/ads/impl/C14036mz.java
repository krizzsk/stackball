package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.yandex.alicekit.core.spannable.C10016a;
import com.yandex.alicekit.core.spannable.NoStrikethroughSpan;
import com.yandex.alicekit.core.spannable.NoUnderlineSpan;
import com.yandex.mobile.ads.impl.C13915lz;
import com.yandex.mobile.ads.impl.C14356q5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.mobile.ads.impl.mz */
public final class C14036mz {

    /* renamed from: a */
    private final C14624so f37569a;

    /* renamed from: b */
    private final eg1 f37570b;

    /* renamed from: c */
    private final eg1 f37571c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C14213ot f37572d;

    /* renamed from: e */
    private final boolean f37573e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public eg1 f37574f;

    /* renamed from: com.yandex.mobile.ads.impl.mz$a */
    private final class C14037a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C13513jm f37575a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final TextView f37576b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final j50 f37577c;

        /* renamed from: d */
        private final String f37578d;

        /* renamed from: e */
        private final int f37579e;

        /* renamed from: f */
        private final List<C13915lz.C13937p> f37580f;

        /* renamed from: g */
        private final Context f37581g;

        /* renamed from: h */
        private final DisplayMetrics f37582h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final SpannableStringBuilder f37583i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final List<C13915lz.C13934o> f37584j;

        /* renamed from: k */
        private Function1<? super CharSequence, Unit> f37585k;

        /* renamed from: l */
        final /* synthetic */ C14036mz f37586l;

        /* renamed from: com.yandex.mobile.ads.impl.mz$a$a */
        private final class C14038a extends ClickableSpan {

            /* renamed from: b */
            private final List<C14687tm> f37587b;

            /* renamed from: c */
            final /* synthetic */ C14037a f37588c;

            public C14038a(C14037a aVar, List<? extends C14687tm> list) {
                Intrinsics.checkNotNullParameter(aVar, "this$0");
                Intrinsics.checkNotNullParameter(list, "actions");
                this.f37588c = aVar;
                this.f37587b = list;
            }

            public void onClick(View view) {
                Intrinsics.checkNotNullParameter(view, "p0");
                C15056wm i = this.f37588c.f37575a.mo68038h().mo65811i();
                Intrinsics.checkNotNullExpressionValue(i, "divView.div2Component.actionBinder");
                i.mo70714a(this.f37588c.f37575a, view, (List<? extends C14687tm>) this.f37587b);
            }

            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "ds");
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.mz$a$b */
        private final class C14039b extends C14130nt {

            /* renamed from: a */
            private final int f37589a;

            /* renamed from: b */
            final /* synthetic */ C14037a f37590b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14039b(C14037a aVar, int i) {
                super(aVar.f37575a);
                Intrinsics.checkNotNullParameter(aVar, "this$0");
                this.f37590b = aVar;
                this.f37589a = i;
            }

            /* renamed from: a */
            public void mo67624a(C15163xd xdVar) {
                Intrinsics.checkNotNullParameter(xdVar, "cachedBitmap");
                C13915lz.C13934o oVar = (C13915lz.C13934o) this.f37590b.f37584j.get(this.f37589a);
                C14037a aVar = this.f37590b;
                SpannableStringBuilder d = aVar.f37583i;
                Bitmap a = xdVar.mo70883a();
                Intrinsics.checkNotNullExpressionValue(a, "cachedBitmap.bitmap");
                C10016a a2 = C14037a.m39784a(aVar, d, oVar, a);
                int intValue = oVar.f37100b.mo66924a(this.f37590b.f37577c).intValue() + this.f37589a;
                this.f37590b.f37583i.setSpan(a2, intValue, intValue + 1, 18);
                this.f37590b.f37576b.setText(this.f37590b.f37583i, TextView.BufferType.NORMAL);
                this.f37590b.f37576b.requestLayout();
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.mz$a$c */
        public static final class C14040c<T> implements Comparator {

            /* renamed from: b */
            final /* synthetic */ C14037a f37591b;

            public C14040c(C14037a aVar) {
                this.f37591b = aVar;
            }

            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((C13915lz.C13934o) t).f37100b.mo66924a(this.f37591b.f37577c), ((C13915lz.C13934o) t2).f37100b.mo66924a(this.f37591b.f37577c));
            }
        }

        public C14037a(C14036mz mzVar, C13513jm jmVar, TextView textView, j50 j50, String str, int i, List<? extends C13915lz.C13937p> list, List<? extends C13915lz.C13934o> list2) {
            List<C13915lz.C13934o> list3;
            Intrinsics.checkNotNullParameter(mzVar, "this$0");
            Intrinsics.checkNotNullParameter(jmVar, "divView");
            Intrinsics.checkNotNullParameter(textView, "textView");
            Intrinsics.checkNotNullParameter(j50, "resolver");
            Intrinsics.checkNotNullParameter(str, "text");
            this.f37586l = mzVar;
            this.f37575a = jmVar;
            this.f37576b = textView;
            this.f37577c = j50;
            this.f37578d = str;
            this.f37579e = i;
            this.f37580f = list;
            this.f37581g = jmVar.getContext();
            this.f37582h = jmVar.getResources().getDisplayMetrics();
            this.f37583i = new SpannableStringBuilder(str);
            if (list2 == null) {
                list3 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (T next : list2) {
                    if (((C13915lz.C13934o) next).f37100b.mo66924a(this.f37577c).intValue() <= this.f37578d.length()) {
                        arrayList.add(next);
                    }
                }
                list3 = CollectionsKt.sortedWith(arrayList, new C14040c(this));
            }
            this.f37584j = list3 == null ? CollectionsKt.emptyList() : list3;
        }

        /* renamed from: a */
        public static final C10016a m39784a(C14037a aVar, SpannableStringBuilder spannableStringBuilder, C13915lz.C13934o oVar, Bitmap bitmap) {
            float f;
            float f2;
            C14037a aVar2 = aVar;
            C13915lz.C13934o oVar2 = oVar;
            aVar.getClass();
            C15266yr yrVar = oVar2.f37099a;
            DisplayMetrics displayMetrics = aVar2.f37582h;
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
            int a = C14175ob.m40328a(yrVar, displayMetrics, aVar2.f37577c);
            if (!(spannableStringBuilder.length() == 0)) {
                int intValue = oVar2.f37100b.mo66924a(aVar2.f37577c).intValue() == 0 ? 0 : oVar2.f37100b.mo66924a(aVar2.f37577c).intValue() - 1;
                AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue + 1, AbsoluteSizeSpan.class);
                TextPaint paint = aVar2.f37576b.getPaint();
                if (absoluteSizeSpanArr != null) {
                    if (true ^ (absoluteSizeSpanArr.length == 0)) {
                        f2 = ((float) absoluteSizeSpanArr[0].getSize()) / aVar2.f37576b.getTextSize();
                        float f3 = (float) 2;
                        f = (((paint.ascent() + paint.descent()) / f3) * f2) - ((-((float) a)) / f3);
                    }
                }
                f2 = 1.0f;
                float f32 = (float) 2;
                f = (((paint.ascent() + paint.descent()) / f32) * f2) - ((-((float) a)) / f32);
            } else {
                f = 0.0f;
            }
            Context context = aVar2.f37581g;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C15266yr yrVar2 = oVar2.f37103e;
            DisplayMetrics displayMetrics2 = aVar2.f37582h;
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "metrics");
            int a2 = C14175ob.m40328a(yrVar2, displayMetrics2, aVar2.f37577c);
            f50<Integer> f50 = oVar2.f37101c;
            return new C10016a(context, bitmap, f, a2, a, f50 == null ? null : f50.mo66924a(aVar2.f37577c), false, C10016a.C10017a.BASELINE);
        }

        /* renamed from: a */
        public final void mo68868a(Function1<? super CharSequence, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "action");
            this.f37585k = function1;
        }

        /* renamed from: a */
        public final void mo68867a() {
            Double a;
            Integer a2;
            Integer a3;
            List<C13915lz.C13937p> list = this.f37580f;
            int i = 0;
            if (list == null || list.isEmpty()) {
                List<C13915lz.C13934o> list2 = this.f37584j;
                if (list2 == null || list2.isEmpty()) {
                    Function1<? super CharSequence, Unit> function1 = this.f37585k;
                    if (function1 != null) {
                        function1.invoke(this.f37578d);
                        return;
                    }
                    return;
                }
            }
            List<C13915lz.C13937p> list3 = this.f37580f;
            if (list3 != null) {
                for (C13915lz.C13937p pVar : list3) {
                    SpannableStringBuilder spannableStringBuilder = this.f37583i;
                    int coerceAtMost = RangesKt.coerceAtMost(pVar.f37125h.mo66924a(this.f37577c).intValue(), this.f37578d.length());
                    int coerceAtMost2 = RangesKt.coerceAtMost(pVar.f37119b.mo66924a(this.f37577c).intValue(), this.f37578d.length());
                    if (coerceAtMost <= coerceAtMost2) {
                        f50<Integer> f50 = pVar.f37120c;
                        if (!(f50 == null || (a3 = f50.mo66924a(this.f37577c)) == null)) {
                            Integer valueOf = Integer.valueOf(a3.intValue());
                            DisplayMetrics displayMetrics = this.f37582h;
                            Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C14175ob.m40331a(valueOf, displayMetrics, pVar.f37121d.mo66924a(this.f37577c))), coerceAtMost, coerceAtMost2, 18);
                        }
                        f50<Integer> f502 = pVar.f37127j;
                        if (!(f502 == null || (a2 = f502.mo66924a(this.f37577c)) == null)) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(a2.intValue()), coerceAtMost, coerceAtMost2, 18);
                        }
                        f50<Double> f503 = pVar.f37123f;
                        Integer num = null;
                        if (!(f503 == null || (a = f503.mo66924a(this.f37577c)) == null)) {
                            double doubleValue = a.doubleValue();
                            f50<Integer> f504 = pVar.f37120c;
                            Integer a4 = f504 == null ? null : f504.mo66924a(this.f37577c);
                            spannableStringBuilder.setSpan(new aj0(((float) doubleValue) / ((float) (a4 == null ? this.f37579e : a4.intValue()))), coerceAtMost, coerceAtMost2, 18);
                        }
                        f50<C13009ev> f505 = pVar.f37126i;
                        if (f505 != null) {
                            int ordinal = f505.mo66924a(this.f37577c).ordinal();
                            if (ordinal == 0) {
                                spannableStringBuilder.setSpan(new NoStrikethroughSpan(), coerceAtMost, coerceAtMost2, 18);
                            } else if (ordinal == 1) {
                                spannableStringBuilder.setSpan(new StrikethroughSpan(), coerceAtMost, coerceAtMost2, 18);
                            }
                        }
                        f50<C13009ev> f506 = pVar.f37129l;
                        if (f506 != null) {
                            int ordinal2 = f506.mo66924a(this.f37577c).ordinal();
                            if (ordinal2 == 0) {
                                spannableStringBuilder.setSpan(new NoUnderlineSpan(), coerceAtMost, coerceAtMost2, 18);
                            } else if (ordinal2 == 1) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), coerceAtMost, coerceAtMost2, 18);
                            }
                        }
                        f50<C12915ds> f507 = pVar.f37122e;
                        if (f507 != null) {
                            C14036mz mzVar = this.f37586l;
                            C12915ds a5 = f507.mo66924a(this.f37577c);
                            eg1 b = mzVar.f37574f;
                            if (b == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("typefaceProvider");
                                b = null;
                            }
                            spannableStringBuilder.setSpan(new fg1(C14175ob.m40332a(a5, b)), coerceAtMost, coerceAtMost2, 18);
                        }
                        List<C14687tm> list4 = pVar.f37118a;
                        if (list4 != null) {
                            this.f37576b.setMovementMethod(LinkMovementMethod.getInstance());
                            spannableStringBuilder.setSpan(new C14038a(this, list4), coerceAtMost, coerceAtMost2, 18);
                        }
                        if (pVar.f37124g != null || pVar.f37128k != null) {
                            f50<Integer> f508 = pVar.f37128k;
                            Integer a6 = f508 == null ? null : f508.mo66924a(this.f37577c);
                            DisplayMetrics displayMetrics2 = this.f37582h;
                            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "metrics");
                            int a7 = C14175ob.m40331a(a6, displayMetrics2, pVar.f37121d.mo66924a(this.f37577c));
                            f50<Integer> f509 = pVar.f37124g;
                            if (f509 != null) {
                                num = f509.mo66924a(this.f37577c);
                            }
                            DisplayMetrics displayMetrics3 = this.f37582h;
                            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "metrics");
                            spannableStringBuilder.setSpan(new bj0(a7, C14175ob.m40331a(num, displayMetrics3, pVar.f37121d.mo66924a(this.f37577c))), coerceAtMost, coerceAtMost2, 18);
                        }
                    }
                }
            }
            for (T t : CollectionsKt.reversed(this.f37584j)) {
                this.f37583i.insert(t.f37100b.mo66924a(this.f37577c).intValue(), " ");
            }
            Function1<? super CharSequence, Unit> function12 = this.f37585k;
            if (function12 != null) {
                function12.invoke(this.f37583i);
            }
            List<C13915lz.C13934o> list5 = this.f37584j;
            C14036mz mzVar2 = this.f37586l;
            for (T next : list5) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ij0 a8 = mzVar2.f37572d.mo69264a(((C13915lz.C13934o) next).f37102d.mo66924a(this.f37577c).toString(), new C14039b(this, i));
                Intrinsics.checkNotNullExpressionValue(a8, "imageLoader.loadImage(im…(), ImageCallback(index))");
                this.f37575a.mo68028a(a8, (View) this.f37576b);
                i = i2;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz$b */
    public /* synthetic */ class C14041b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37592a;

        static {
            int[] iArr = new int[C13215gn.values().length];
            C13215gn gnVar = C13215gn.LEFT;
            iArr[0] = 1;
            C13215gn gnVar2 = C13215gn.CENTER;
            iArr[1] = 2;
            C13215gn gnVar3 = C13215gn.RIGHT;
            iArr[2] = 3;
            int[] iArr2 = new int[C13915lz.C13931n.values().length];
            C13915lz.C13931n nVar = C13915lz.C13931n.DISPLAY;
            iArr2[1] = 1;
            f37592a = iArr2;
            int[] iArr3 = new int[C13009ev.values().length];
            C13009ev evVar = C13009ev.SINGLE;
            iArr3[1] = 1;
            C13009ev evVar2 = C13009ev.NONE;
            iArr3[0] = 2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz$c */
    static final class C14042c extends Lambda implements Function1<CharSequence, Unit> {

        /* renamed from: b */
        final /* synthetic */ b30 f37593b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14042c(b30 b30) {
            super(1);
            this.f37593b = b30;
        }

        public Object invoke(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Intrinsics.checkNotNullParameter(charSequence, "text");
            this.f37593b.setEllipsis(charSequence);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz$d */
    static final class C14043d extends Lambda implements Function1<CharSequence, Unit> {

        /* renamed from: b */
        final /* synthetic */ TextView f37594b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14043d(TextView textView) {
            super(1);
            this.f37594b = textView;
        }

        public Object invoke(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Intrinsics.checkNotNullParameter(charSequence, "text");
            this.f37594b.setText(charSequence, TextView.BufferType.NORMAL);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz$e */
    public static final class C14044e implements View.OnLayoutChangeListener {

        /* renamed from: b */
        final /* synthetic */ C14706ts f37595b;

        /* renamed from: c */
        final /* synthetic */ TextView f37596c;

        /* renamed from: d */
        final /* synthetic */ j50 f37597d;

        public C14044e(C14706ts tsVar, TextView textView, j50 j50) {
            this.f37595b = tsVar;
            this.f37596c = textView;
            this.f37597d = j50;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            if (this.f37595b == null) {
                this.f37596c.getPaint().setShader((Shader) null);
            } else {
                this.f37596c.getPaint().setShader(dj0.f32679e.mo66610a((float) this.f37595b.f40439a.mo66924a(this.f37597d).intValue(), CollectionsKt.toIntArray(this.f37595b.f40440b.mo67589a(this.f37597d)), this.f37596c.getWidth(), this.f37596c.getHeight()));
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz$f */
    static final class C14045f extends Lambda implements Function1<C12915ds, Unit> {

        /* renamed from: b */
        final /* synthetic */ C12925dv f37598b;

        /* renamed from: c */
        final /* synthetic */ C14036mz f37599c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14045f(C12925dv dvVar, C14036mz mzVar) {
            super(1);
            this.f37598b = dvVar;
            this.f37599c = mzVar;
        }

        public Object invoke(Object obj) {
            C12915ds dsVar = (C12915ds) obj;
            Intrinsics.checkNotNullParameter(dsVar, "fontWeight");
            C12925dv dvVar = this.f37598b;
            eg1 b = this.f37599c.f37574f;
            if (b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("typefaceProvider");
                b = null;
            }
            dvVar.setTypeface(C14175ob.m40332a(dsVar, b));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz$g */
    static final class C14046g extends Lambda implements Function1<C13009ev, Unit> {

        /* renamed from: b */
        final /* synthetic */ C14036mz f37600b;

        /* renamed from: c */
        final /* synthetic */ C12925dv f37601c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14046g(C14036mz mzVar, C12925dv dvVar) {
            super(1);
            this.f37600b = mzVar;
            this.f37601c = dvVar;
        }

        public Object invoke(Object obj) {
            C13009ev evVar = (C13009ev) obj;
            Intrinsics.checkNotNullParameter(evVar, "underline");
            C14036mz mzVar = this.f37600b;
            C12925dv dvVar = this.f37601c;
            mzVar.getClass();
            int ordinal = evVar.ordinal();
            if (ordinal == 0) {
                dvVar.setPaintFlags(dvVar.getPaintFlags() & -9);
            } else if (ordinal == 1) {
                dvVar.setPaintFlags(dvVar.getPaintFlags() | 8);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mz$h */
    static final class C14047h extends Lambda implements Function1<C13009ev, Unit> {

        /* renamed from: b */
        final /* synthetic */ C14036mz f37602b;

        /* renamed from: c */
        final /* synthetic */ C12925dv f37603c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14047h(C14036mz mzVar, C12925dv dvVar) {
            super(1);
            this.f37602b = mzVar;
            this.f37603c = dvVar;
        }

        public Object invoke(Object obj) {
            C13009ev evVar = (C13009ev) obj;
            Intrinsics.checkNotNullParameter(evVar, "strike");
            C14036mz mzVar = this.f37602b;
            C12925dv dvVar = this.f37603c;
            mzVar.getClass();
            int ordinal = evVar.ordinal();
            if (ordinal == 0) {
                dvVar.setPaintFlags(dvVar.getPaintFlags() & -17);
            } else if (ordinal == 1) {
                dvVar.setPaintFlags(dvVar.getPaintFlags() | 16);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C14036mz(C14624so soVar, eg1 eg1, @Named("typeface_display") eg1 eg12, C14213ot otVar, @Named("support_hyphenation") boolean z) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(eg1, "regularTypefaceProvider");
        Intrinsics.checkNotNullParameter(eg12, "displayTypefaceProvider");
        Intrinsics.checkNotNullParameter(otVar, "imageLoader");
        this.f37569a = soVar;
        this.f37570b = eg1;
        this.f37571c = eg12;
        this.f37572d = otVar;
        this.f37573e = z;
    }

    /* renamed from: a */
    public void mo68866a(C12925dv dvVar, C13915lz lzVar, C13513jm jmVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C13513jm jmVar2;
        String str7;
        C13915lz lzVar2;
        f50<Integer> f50;
        f50<Integer> f502;
        C14036mz mzVar = this;
        C12925dv dvVar2 = dvVar;
        C13915lz lzVar3 = lzVar;
        C13513jm jmVar3 = jmVar;
        Intrinsics.checkNotNullParameter(dvVar2, "view");
        Intrinsics.checkNotNullParameter(lzVar3, "div");
        Intrinsics.checkNotNullParameter(jmVar3, "divView");
        C13915lz h = dvVar.mo66700h();
        if (!Intrinsics.areEqual((Object) lzVar3, (Object) h)) {
            j50 b = jmVar.mo66388b();
            dvVar.mo65871b();
            dvVar.setDiv$div_release(lzVar);
            if (h != null) {
                mzVar.f37569a.mo70038a((View) dvVar2, (C14697tn) h, jmVar3);
            }
            mzVar.f37569a.mo70039a((View) dvVar2, (C14697tn) lzVar3, (C14697tn) h, jmVar3);
            C14175ob.m40337a(dvVar, jmVar, lzVar3.f37041b, lzVar3.f37043d, lzVar3.f37065z, lzVar3.f37051l, lzVar3.f37042c);
            mzVar.m39770a((TextView) dvVar2, lzVar3.f37056q.mo66924a(b), lzVar3.f37059t.mo66924a(b));
            C15409zz zzVar = new C15409zz(mzVar, dvVar2, lzVar3, b);
            dvVar2.mo65870a(lzVar3.f37056q.mo66923a(b, zzVar));
            dvVar2.mo65870a(lzVar3.f37059t.mo66923a(b, zzVar));
            f50<C13215gn> f503 = lzVar3.f37027J;
            f50<C13332hn> f504 = lzVar3.f37028K;
            mzVar.m39766a((TextView) dvVar2, f503.mo66924a(b), f504.mo66924a(b));
            j50 j50 = b;
            C13513jm jmVar4 = jmVar3;
            C14731tz tzVar = new C14731tz(this, dvVar, f503, b, f504);
            dvVar2.mo65870a(f503.mo66923a(j50, tzVar));
            dvVar2.mo65870a(f504.mo66923a(j50, tzVar));
            dvVar2.mo65870a(lzVar3.f37059t.mo66925b(j50, new C14045f(dvVar2, mzVar)));
            mzVar.m39773a(dvVar2, j50, lzVar3);
            C14238oz ozVar = new C14238oz(mzVar, dvVar2, j50, lzVar3);
            dvVar2.mo65870a(lzVar3.f37057r.mo66923a(j50, ozVar));
            dvVar2.mo65870a(lzVar3.f37063x.mo66923a(j50, ozVar));
            f50<Integer> f505 = lzVar3.f37064y;
            if (f505 == null) {
                C14175ob.m40342a((TextView) dvVar2, (Integer) null, lzVar3.f37058s.mo66924a(j50));
            } else {
                dvVar2.mo65870a(f505.mo66925b(j50, new C14329pz(dvVar2, lzVar3, j50)));
            }
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = lzVar3.f37029L.mo66924a(j50).intValue();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            f50<Integer> f506 = lzVar3.f37055p;
            objectRef.element = f506 == null ? null : (Integer) f506.mo66924a(j50);
            C15125wz wzVar = new C15125wz(dvVar2, objectRef, intRef);
            wzVar.invoke();
            lzVar3.f37029L.mo66923a(j50, new C14856uz(intRef, wzVar));
            f50<Integer> f507 = lzVar3.f37055p;
            if (f507 != null) {
                f507.mo66923a(j50, new C15015vz(objectRef, wzVar));
            }
            dvVar2.mo65870a(lzVar3.f37035R.mo66925b(j50, new C14046g(mzVar, dvVar2)));
            dvVar2.mo65870a(lzVar3.f37025H.mo66925b(j50, new C14047h(mzVar, dvVar2)));
            f50<Integer> f508 = lzVar3.f37019B;
            f50<Integer> f509 = lzVar3.f37020C;
            mzVar.m39772a(dvVar2, j50, f508, f509);
            C14432qz qzVar = new C14432qz(this, dvVar, j50, f508, f509);
            C13915lz h2 = dvVar.mo66700h();
            C15055wl a = (h2 == null || (f502 = h2.f37019B) == null) ? null : f502.mo66923a(j50, qzVar);
            if (a == null) {
                a = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a, "div?.maxLines?.observe(r…lback) ?: Disposable.NULL");
            dvVar2.mo65870a(a);
            C13915lz h3 = dvVar.mo66700h();
            C15055wl a2 = (h3 == null || (f50 = h3.f37020C) == null) ? null : f50.mo66923a(j50, qzVar);
            if (a2 == null) {
                a2 = C15055wl.f42027a;
            }
            Intrinsics.checkNotNullExpressionValue(a2, "div?.minHiddenLines?.obs…lback) ?: Disposable.NULL");
            dvVar2.mo65870a(a2);
            if (lzVar3.f37022E == null && lzVar3.f37062w == null) {
                dvVar2.setText(lzVar3.f37026I.mo66924a(j50));
                mzVar.m39767a((TextView) dvVar2, j50, lzVar3);
                dvVar2.mo65870a(lzVar3.f37026I.mo66923a(j50, new C15286yz(mzVar, dvVar2, j50, lzVar3)));
                str4 = "image.tintColor?.observe…lback) ?: Disposable.NULL";
                str7 = "range.fontSize?.observe(…lback) ?: Disposable.NULL";
                C13513jm jmVar5 = jmVar4;
                str = "range.fontWeight?.observ…lback) ?: Disposable.NULL";
                jmVar2 = jmVar5;
                str3 = "range.letterSpacing?.obs…lback) ?: Disposable.NULL";
                str6 = "range.underline?.observe…lback) ?: Disposable.NULL";
                str2 = "range.lineHeight?.observ…lback) ?: Disposable.NULL";
                str5 = "range.topOffset?.observe…lback) ?: Disposable.NULL";
            } else {
                mzVar.m39769a((TextView) dvVar2, jmVar4, j50, lzVar3);
                mzVar.m39767a((TextView) dvVar2, j50, lzVar3);
                f50<String> f5010 = lzVar3.f37026I;
                C14547rz rzVar = r0;
                String str8 = "range.fontSize?.observe(…lback) ?: Disposable.NULL";
                C12925dv dvVar3 = dvVar;
                String str9 = "image.tintColor?.observe…lback) ?: Disposable.NULL";
                str = "range.fontWeight?.observ…lback) ?: Disposable.NULL";
                C13513jm jmVar6 = jmVar;
                String str10 = "range.underline?.observe…lback) ?: Disposable.NULL";
                str3 = "range.letterSpacing?.obs…lback) ?: Disposable.NULL";
                j50 j502 = j50;
                String str11 = "range.topOffset?.observe…lback) ?: Disposable.NULL";
                str2 = "range.lineHeight?.observ…lback) ?: Disposable.NULL";
                C13915lz lzVar4 = lzVar;
                C14547rz rzVar2 = new C14547rz(this, dvVar3, jmVar6, j502, lzVar4);
                dvVar2.mo65870a(f5010.mo66923a(j50, rzVar2));
                C14642sz szVar = new C14642sz(this, dvVar3, jmVar6, j502, lzVar4);
                List<C13915lz.C13937p> list = lzVar3.f37022E;
                if (list != null) {
                    for (C13915lz.C13937p pVar : list) {
                        dvVar2.mo65870a(pVar.f37125h.mo66923a(j50, szVar));
                        dvVar2.mo65870a(pVar.f37119b.mo66923a(j50, szVar));
                        f50<Integer> f5011 = pVar.f37120c;
                        C15055wl a3 = f5011 == null ? null : f5011.mo66923a(j50, szVar);
                        if (a3 == null) {
                            a3 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a3, str8);
                        dvVar2.mo65870a(a3);
                        dvVar2.mo65870a(pVar.f37121d.mo66923a(j50, szVar));
                        f50<C12915ds> f5012 = pVar.f37122e;
                        C15055wl a4 = f5012 == null ? null : f5012.mo66923a(j50, szVar);
                        if (a4 == null) {
                            a4 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a4, str);
                        dvVar2.mo65870a(a4);
                        f50<Double> f5013 = pVar.f37123f;
                        C15055wl a5 = f5013 == null ? null : f5013.mo66923a(j50, szVar);
                        if (a5 == null) {
                            a5 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a5, str3);
                        dvVar2.mo65870a(a5);
                        f50<Integer> f5014 = pVar.f37124g;
                        C15055wl a6 = f5014 == null ? null : f5014.mo66923a(j50, szVar);
                        if (a6 == null) {
                            a6 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a6, str2);
                        dvVar2.mo65870a(a6);
                        f50<C13009ev> f5015 = pVar.f37126i;
                        C15055wl a7 = f5015 == null ? null : f5015.mo66923a(j50, szVar);
                        if (a7 == null) {
                            a7 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a7, "range.strike?.observe(re…lback) ?: Disposable.NULL");
                        dvVar2.mo65870a(a7);
                        f50<Integer> f5016 = pVar.f37127j;
                        C15055wl a8 = f5016 == null ? null : f5016.mo66923a(j50, szVar);
                        if (a8 == null) {
                            a8 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a8, "range.textColor?.observe…lback) ?: Disposable.NULL");
                        dvVar2.mo65870a(a8);
                        f50<Integer> f5017 = pVar.f37128k;
                        C15055wl a9 = f5017 == null ? null : f5017.mo66923a(j50, szVar);
                        if (a9 == null) {
                            a9 = C15055wl.f42027a;
                        }
                        String str12 = str11;
                        Intrinsics.checkNotNullExpressionValue(a9, str12);
                        dvVar2.mo65870a(a9);
                        f50<C13009ev> f5018 = pVar.f37129l;
                        C15055wl a10 = f5018 == null ? null : f5018.mo66923a(j50, szVar);
                        if (a10 == null) {
                            a10 = C15055wl.f42027a;
                        }
                        String str13 = str10;
                        Intrinsics.checkNotNullExpressionValue(a10, str13);
                        dvVar2.mo65870a(a10);
                        str10 = str13;
                        str11 = str12;
                    }
                }
                str6 = str10;
                str5 = str11;
                List<C13915lz.C13934o> list2 = lzVar3.f37062w;
                if (list2 != null) {
                    for (C13915lz.C13934o oVar : list2) {
                        dvVar2.mo65870a(oVar.f37100b.mo66923a(j50, szVar));
                        dvVar2.mo65870a(oVar.f37102d.mo66923a(j50, szVar));
                        f50<Integer> f5019 = oVar.f37101c;
                        C15055wl a11 = f5019 == null ? null : f5019.mo66923a(j50, szVar);
                        if (a11 == null) {
                            a11 = C15055wl.f42027a;
                        }
                        String str14 = str9;
                        Intrinsics.checkNotNullExpressionValue(a11, str14);
                        dvVar2.mo65870a(a11);
                        dvVar2.mo65870a(oVar.f37103e.f42920b.mo66923a(j50, szVar));
                        dvVar2.mo65870a(oVar.f37103e.f42919a.mo66923a(j50, szVar));
                        str9 = str14;
                    }
                }
                jmVar2 = jmVar;
                str7 = str8;
                str4 = str9;
                mzVar = this;
            }
            mzVar.m39771a((b30) dvVar2, jmVar2, j50, lzVar3);
            C13915lz.C13928m mVar = lzVar3.f37052m;
            if (mVar == null) {
                lzVar2 = lzVar3;
            } else {
                C14155nz nzVar = r0;
                C13915lz.C13928m mVar2 = mVar;
                String str15 = str7;
                String str16 = str4;
                String str17 = str6;
                String str18 = str5;
                C14155nz nzVar2 = new C14155nz(this, dvVar, jmVar, j50, lzVar);
                C14155nz nzVar3 = nzVar;
                dvVar2.mo65870a(mVar2.f37085c.mo66923a(j50, nzVar3));
                List<C13915lz.C13937p> list3 = mVar2.f37084b;
                if (list3 != null) {
                    for (C13915lz.C13937p pVar2 : list3) {
                        dvVar2.mo65870a(pVar2.f37125h.mo66923a(j50, nzVar3));
                        dvVar2.mo65870a(pVar2.f37119b.mo66923a(j50, nzVar3));
                        f50<Integer> f5020 = pVar2.f37120c;
                        C15055wl a12 = f5020 == null ? null : f5020.mo66923a(j50, nzVar3);
                        if (a12 == null) {
                            a12 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a12, str15);
                        dvVar2.mo65870a(a12);
                        dvVar2.mo65870a(pVar2.f37121d.mo66923a(j50, nzVar3));
                        f50<C12915ds> f5021 = pVar2.f37122e;
                        C15055wl a13 = f5021 == null ? null : f5021.mo66923a(j50, nzVar3);
                        if (a13 == null) {
                            a13 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a13, str);
                        dvVar2.mo65870a(a13);
                        f50<Double> f5022 = pVar2.f37123f;
                        C15055wl a14 = f5022 == null ? null : f5022.mo66923a(j50, nzVar3);
                        if (a14 == null) {
                            a14 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a14, str3);
                        dvVar2.mo65870a(a14);
                        f50<Integer> f5023 = pVar2.f37124g;
                        C15055wl a15 = f5023 == null ? null : f5023.mo66923a(j50, nzVar3);
                        if (a15 == null) {
                            a15 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a15, str2);
                        dvVar2.mo65870a(a15);
                        f50<C13009ev> f5024 = pVar2.f37126i;
                        C15055wl a16 = f5024 == null ? null : f5024.mo66923a(j50, nzVar3);
                        if (a16 == null) {
                            a16 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a16, "range.strike?.observe(re…lback) ?: Disposable.NULL");
                        dvVar2.mo65870a(a16);
                        f50<Integer> f5025 = pVar2.f37127j;
                        C15055wl a17 = f5025 == null ? null : f5025.mo66923a(j50, nzVar3);
                        if (a17 == null) {
                            a17 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a17, "range.textColor?.observe…lback) ?: Disposable.NULL");
                        dvVar2.mo65870a(a17);
                        f50<Integer> f5026 = pVar2.f37128k;
                        C15055wl a18 = f5026 == null ? null : f5026.mo66923a(j50, nzVar3);
                        if (a18 == null) {
                            a18 = C15055wl.f42027a;
                        }
                        Intrinsics.checkNotNullExpressionValue(a18, str18);
                        dvVar2.mo65870a(a18);
                        f50<C13009ev> f5027 = pVar2.f37129l;
                        C15055wl a19 = f5027 == null ? null : f5027.mo66923a(j50, nzVar3);
                        if (a19 == null) {
                            a19 = C15055wl.f42027a;
                        }
                        String str19 = str17;
                        Intrinsics.checkNotNullExpressionValue(a19, str19);
                        dvVar2.mo65870a(a19);
                        str17 = str19;
                    }
                }
                List<C13915lz.C13934o> list4 = mVar2.f37083a;
                if (list4 != null) {
                    for (C13915lz.C13934o oVar2 : list4) {
                        dvVar2.mo65870a(oVar2.f37100b.mo66923a(j50, nzVar3));
                        dvVar2.mo65870a(oVar2.f37102d.mo66923a(j50, nzVar3));
                        f50<Integer> f5028 = oVar2.f37101c;
                        C15055wl a20 = f5028 == null ? null : f5028.mo66923a(j50, nzVar3);
                        if (a20 == null) {
                            a20 = C15055wl.f42027a;
                        }
                        String str20 = str16;
                        Intrinsics.checkNotNullExpressionValue(a20, str20);
                        dvVar2.mo65870a(a20);
                        dvVar2.mo65870a(oVar2.f37103e.f42920b.mo66923a(j50, nzVar3));
                        dvVar2.mo65870a(oVar2.f37103e.f42919a.mo66923a(j50, nzVar3));
                        str16 = str20;
                    }
                }
                lzVar2 = lzVar;
            }
            f50<Boolean> f5029 = lzVar2.f37047h;
            boolean z = false;
            if (f5029 == null) {
                dvVar2.setAutoEllipsize(false);
            } else {
                dvVar2.setAutoEllipsize(f5029.mo66924a(j50).booleanValue());
            }
            C14706ts tsVar = lzVar2.f37030M;
            m39768a((TextView) dvVar2, j50, tsVar);
            if (tsVar != null) {
                dvVar2.mo65870a(tsVar.f40439a.mo66923a(j50, new C15220xz(this, dvVar2, j50, tsVar)));
            }
            if (dvVar.isFocusable() || lzVar2.f37055p != null) {
                z = true;
            }
            dvVar2.setFocusable(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39767a(TextView textView, j50 j50, C13915lz lzVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i = 0;
            if (this.f37573e && lzVar.f37052m == null && TextUtils.indexOf(lzVar.f37026I.mo66924a(j50), 173, 0, Math.min(lzVar.f37026I.mo66924a(j50).length(), 10)) > 0) {
                i = 1;
            }
            if (hyphenationFrequency != i) {
                textView.setHyphenationFrequency(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39766a(TextView textView, C13215gn gnVar, C13332hn hnVar) {
        int i;
        textView.setGravity(C14175ob.m40325a(gnVar, hnVar));
        int ordinal = gnVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 4;
            } else if (ordinal == 2) {
                i = 6;
            }
            textView.setTextAlignment(i);
        }
        i = 5;
        textView.setTextAlignment(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39772a(C12925dv dvVar, j50 j50, f50<Integer> f50, f50<Integer> f502) {
        Integer num;
        int i;
        C14356q5 g = dvVar.mo66699g();
        if (g != null) {
            g.mo69489c();
        }
        Integer num2 = null;
        if (f50 == null) {
            num = null;
        } else {
            num = f50.mo66924a(j50);
        }
        if (f502 != null) {
            num2 = f502.mo66924a(j50);
        }
        if (num == null || num2 == null) {
            if (num == null) {
                i = Integer.MAX_VALUE;
            } else {
                i = num.intValue();
            }
            dvVar.setMaxLines(i);
            return;
        }
        C14356q5 q5Var = new C14356q5(dvVar);
        q5Var.mo69488a(new C14356q5.C14357a(num.intValue(), num2.intValue()));
        dvVar.setAdaptiveMaxLines$div_release(q5Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39773a(C12925dv dvVar, j50 j50, C13915lz lzVar) {
        int intValue = lzVar.f37057r.mo66924a(j50).intValue();
        C13794kx a = lzVar.f37058s.mo66924a(j50);
        Intrinsics.checkNotNullParameter(dvVar, "<this>");
        Intrinsics.checkNotNullParameter(a, "unit");
        dvVar.setTextSize(C14175ob.m40327a(a), (float) intValue);
        Intrinsics.checkNotNullParameter(dvVar, "<this>");
        dvVar.setLetterSpacing((float) (lzVar.f37063x.mo66924a(j50).doubleValue() / ((double) intValue)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39770a(TextView textView, C13915lz.C13931n nVar, C12915ds dsVar) {
        eg1 eg1;
        if (C14041b.f37592a[nVar.ordinal()] == 1) {
            eg1 = this.f37571c;
        } else {
            eg1 = this.f37570b;
        }
        this.f37574f = eg1;
        if (eg1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("typefaceProvider");
            eg1 = null;
        }
        textView.setTypeface(C14175ob.m40332a(dsVar, eg1));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39769a(TextView textView, C13513jm jmVar, j50 j50, C13915lz lzVar) {
        C14037a aVar = new C14037a(this, jmVar, textView, j50, lzVar.f37026I.mo66924a(j50), lzVar.f37057r.mo66924a(j50).intValue(), lzVar.f37022E, lzVar.f37062w);
        aVar.mo68868a((Function1<? super CharSequence, Unit>) new C14043d(textView));
        aVar.mo68867a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39771a(b30 b30, C13513jm jmVar, j50 j50, C13915lz lzVar) {
        C13915lz.C13928m mVar = lzVar.f37052m;
        if (mVar != null) {
            C14037a aVar = new C14037a(this, jmVar, b30, j50, mVar.f37085c.mo66924a(j50), lzVar.f37057r.mo66924a(j50).intValue(), mVar.f37084b, mVar.f37083a);
            aVar.mo68868a((Function1<? super CharSequence, Unit>) new C14042c(b30));
            aVar.mo68867a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39768a(TextView textView, j50 j50, C14706ts tsVar) {
        if (!ViewCompat.isLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new C14044e(tsVar, textView, j50));
        } else if (tsVar == null) {
            textView.getPaint().setShader((Shader) null);
        } else {
            textView.getPaint().setShader(dj0.f32679e.mo66610a((float) tsVar.f40439a.mo66924a(j50).intValue(), CollectionsKt.toIntArray(tsVar.f40440b.mo67589a(j50)), textView.getWidth(), textView.getHeight()));
        }
    }
}
