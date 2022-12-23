package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6366u;

public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        m16253a();
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16253a();
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    /* renamed from: a */
    private void m16253a() {
        setOrientation(0);
        int b = C6366u.m16203b(getContext(), 10.0f);
        setPadding(0, b, 0, b);
        ImageView imageView = (ImageView) m16254b();
        imageView.setTag("backward");
        imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_backward", "drawable", C6122a.m15302b().mo42884a())));
        addView(imageView);
        ImageView imageView2 = (ImageView) m16254b();
        imageView2.setTag("forward");
        imageView2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_forward", "drawable", C6122a.m15302b().mo42884a())));
        addView(imageView2);
        ImageView imageView3 = (ImageView) m16254b();
        imageView3.setTag("refresh");
        imageView3.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_refresh", "drawable", C6122a.m15302b().mo42884a())));
        addView(imageView3);
        ImageView imageView4 = (ImageView) m16254b();
        imageView4.setTag("exits");
        imageView4.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_exits", "drawable", C6122a.m15302b().mo42884a())));
        addView(imageView4);
    }

    /* renamed from: b */
    private View m16254b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }
}
