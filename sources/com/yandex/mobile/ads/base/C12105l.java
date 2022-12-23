package com.yandex.mobile.ads.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.lo1;

/* renamed from: com.yandex.mobile.ads.base.l */
final class C12105l {
    /* renamed from: a */
    static TextView m31399a(Context context) {
        TextView textView = new TextView(context, (AttributeSet) null, 16973858);
        int i = lo1.f36769b;
        textView.setTextSize(0, (float) Math.round(TypedValue.applyDimension(1, (float) C12106m.BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE.mo64527a(context), context.getResources().getDisplayMetrics())));
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.SANS_SERIF);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setHorizontallyScrolling(false);
        textView.setHorizontalFadingEdgeEnabled(false);
        textView.setVerticalScrollBarEnabled(false);
        textView.setVerticalFadingEdgeEnabled(false);
        textView.setTextColor(context.getResources().getColor(17170435));
        int round = Math.round(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(round, 0, round, 0);
        return textView;
    }

    /* renamed from: b */
    static ProgressBar m31400b(Context context) {
        ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, 16842872);
        progressBar.setProgressDrawable(C12103j.f29176b);
        progressBar.setProgress(0);
        progressBar.setMax(10000);
        return progressBar;
    }

    /* renamed from: a */
    static ImageView m31398a(Context context, String str, int i) {
        Bitmap bitmap;
        ImageView imageView = new ImageView(context);
        int i2 = C13278h5.f34274b;
        try {
            String substring = str.substring(str.indexOf(",") + 1);
            if (!TextUtils.isEmpty(substring)) {
                byte[] decode = Base64.decode(substring, 0);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                imageView.setImageBitmap(bitmap);
                imageView.setAdjustViewBounds(true);
                imageView.setPadding(i, i, i, i);
                ColorDrawable colorDrawable = C12103j.f29175a;
                ColorDrawable colorDrawable2 = new ColorDrawable(C12102i.f29172a);
                ColorDrawable colorDrawable3 = new ColorDrawable(0);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, colorDrawable2);
                stateListDrawable.addState(new int[0], colorDrawable3);
                imageView.setBackgroundDrawable(stateListDrawable);
                return imageView;
            }
        } catch (Exception unused) {
        }
        bitmap = null;
        imageView.setImageBitmap(bitmap);
        imageView.setAdjustViewBounds(true);
        imageView.setPadding(i, i, i, i);
        ColorDrawable colorDrawable4 = C12103j.f29175a;
        ColorDrawable colorDrawable22 = new ColorDrawable(C12102i.f29172a);
        ColorDrawable colorDrawable32 = new ColorDrawable(0);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{16842919}, colorDrawable22);
        stateListDrawable2.addState(new int[0], colorDrawable32);
        imageView.setBackgroundDrawable(stateListDrawable2);
        return imageView;
    }
}
