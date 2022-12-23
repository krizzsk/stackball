package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.ViewGroupKt;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.c00;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public final class h00 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Pair<c00, View> m36745b(String str, View view) {
        Object tag = view.getTag(C12066R.C12068id.div_tooltips_tag);
        List<c00> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (c00 c00 : list) {
                if (Intrinsics.areEqual((Object) c00.f31764e, (Object) str)) {
                    return TuplesKt.m45515to(c00, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            for (View b : ViewGroupKt.getChildren((ViewGroup) view)) {
                Pair<c00, View> b2 = m36745b(str, b);
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36743a(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(popupWindow, "$this_setDismissOnTouchOutside");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        popupWindow.dismiss();
        return true;
    }

    /* renamed from: a */
    public static final Point m36740a(View view, View view2, c00 c00, j50 j50) {
        int i;
        int i2;
        int i3;
        C12992er erVar;
        C12992er erVar2;
        Intrinsics.checkNotNullParameter(view, "popupView");
        Intrinsics.checkNotNullParameter(view2, "anchor");
        Intrinsics.checkNotNullParameter(c00, "divTooltip");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int i4 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        c00.C12691d a = c00.f31766g.mo66924a(j50);
        int i5 = point.x;
        switch (a.ordinal()) {
            case 0:
            case 1:
            case 7:
                i = -view.getWidth();
                break;
            case 2:
            case 6:
                i = (view2.getWidth() / 2) - (view.getWidth() / 2);
                break;
            case 3:
            case 4:
            case 5:
                i = view2.getWidth();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.x = i5 + i;
        int i6 = point.y;
        switch (a.ordinal()) {
            case 0:
            case 4:
                i2 = (view2.getHeight() / 2) - (view.getHeight() / 2);
                break;
            case 1:
            case 2:
            case 3:
                i2 = -view.getHeight();
                break;
            case 5:
            case 6:
            case 7:
                i2 = view2.getHeight();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.y = i6 + i2;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        int i7 = point.x;
        C14138nw nwVar = c00.f31765f;
        if (nwVar == null || (erVar2 = nwVar.f37927a) == null) {
            i3 = 0;
        } else {
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            i3 = C14175ob.m40324a(erVar2, displayMetrics, j50);
        }
        point.x = i7 + i3;
        int i8 = point.y;
        C14138nw nwVar2 = c00.f31765f;
        if (!(nwVar2 == null || (erVar = nwVar2.f37928b) == null)) {
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            i4 = C14175ob.m40324a(erVar, displayMetrics, j50);
        }
        point.y = i8 + i4;
        return point;
    }

    /* renamed from: a */
    public static final boolean m36744a(C13513jm jmVar, View view, Point point) {
        Rect rect = new Rect();
        jmVar.getWindowVisibleDisplayFrame(rect);
        int i = rect.left;
        int i2 = point.x;
        return i <= i2 && rect.top <= point.y && rect.right >= i2 + view.getWidth() && rect.bottom >= point.y + view.getHeight();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m36746b(PopupWindow popupWindow) {
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener(popupWindow) {
            public final /* synthetic */ PopupWindow f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return h00.m36743a(this.f$0, view, motionEvent);
            }
        });
    }
}
