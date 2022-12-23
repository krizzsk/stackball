package com.smaato.sdk.core.p250ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.smaato.sdk.core.C8590R;

/* renamed from: com.smaato.sdk.core.ui.ProgressView */
public final class ProgressView extends FrameLayout {
    static /* synthetic */ void lambda$init$0(View view) {
    }

    public ProgressView(Context context) {
        super(context);
        init();
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public final void init() {
        setId(C8590R.C8592id.smaato_sdk_core_progress_view_id);
        setBackgroundResource(C8590R.color.smaato_sdk_core_ui_semitransparent);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener($$Lambda$ProgressView$vlIjQCXO6g4ByFnfJtX_FgNcJdE.INSTANCE);
        ProgressBar progressBar = new ProgressBar(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        progressBar.setIndeterminateDrawable(getResources().getDrawable(C8590R.C8591drawable.smaato_sdk_core_progress_bar));
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }
}
