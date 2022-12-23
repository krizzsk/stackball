package androidx.core.view;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72094k = 3, mo72095mv = {1, 5, 1}, mo72097xi = 48)
/* compiled from: View.kt */
/* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final ViewParent invoke(ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(viewParent, "p0");
        return viewParent.getParent();
    }
}
