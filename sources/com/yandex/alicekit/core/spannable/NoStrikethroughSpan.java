package com.yandex.alicekit.core.spannable;

import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo72093d2 = {"Lcom/yandex/alicekit/core/spannable/NoStrikethroughSpan;", "Landroid/text/style/StrikethroughSpan;", "<init>", "()V", "core-view_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
public final class NoStrikethroughSpan extends StrikethroughSpan {
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setStrikeThruText(false);
    }
}
