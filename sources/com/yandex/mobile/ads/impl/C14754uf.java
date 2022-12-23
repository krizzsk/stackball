package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.C15497h0;

/* renamed from: com.yandex.mobile.ads.impl.uf */
public class C14754uf extends un1<TextView, C14589sf> {
    public C14754uf(TextView textView) {
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
        TextView textView = (TextView) view;
        C14589sf sfVar = (C14589sf) obj;
        if (C15497h0.C15498a.TEXT == sfVar.mo69963b()) {
            textView.setText(sfVar.mo69962a());
        }
    }

    /* renamed from: a */
    public boolean mo65825a(TextView textView, C14589sf sfVar) {
        if (C15497h0.C15498a.TEXT == sfVar.mo69963b()) {
            return textView.getText().toString().equals(sfVar.mo69962a());
        }
        return true;
    }
}
