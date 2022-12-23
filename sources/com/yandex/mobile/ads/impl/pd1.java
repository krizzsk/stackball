package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

public class pd1 extends un1<TextView, String> {
    public pd1(TextView textView) {
        super(textView);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        super.mo65866a(textView);
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        ((TextView) view).setText((String) obj);
    }

    /* renamed from: a */
    public boolean mo65825a(View view, Object obj) {
        return ((TextView) view).getText().toString().equalsIgnoreCase((String) obj);
    }
}
