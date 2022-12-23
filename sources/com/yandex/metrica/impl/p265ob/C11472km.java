package com.yandex.metrica.impl.p265ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: com.yandex.metrica.impl.ob.km */
public class C11472km {

    /* renamed from: a */
    private final C11165dm f27618a;

    public C11472km(C11165dm dmVar) {
        this.f27618a = dmVar;
    }

    /* renamed from: a */
    public int mo63248a(TextView textView) {
        int i = 0;
        try {
            if (TextUtils.isEmpty(textView.getText()) || textView.getVisibility() != 0) {
                return 0;
            }
            String charSequence = textView.getText().toString();
            Layout layout = textView.getLayout();
            int length = charSequence.length();
            if (layout != null) {
                try {
                    int lineCount = textView.getLineCount() - 1;
                    TextUtils.TruncateAt ellipsize = textView.getEllipsize();
                    if (ellipsize != null && lineCount >= 0 && (lineCount == 0 || ellipsize == TextUtils.TruncateAt.END)) {
                        i = 1;
                    }
                    if (i != 0) {
                        return length - layout.getEllipsisCount(lineCount);
                    }
                } catch (Throwable th) {
                    th = th;
                    i = length;
                    this.f27618a.mo62798a("ui_parsing_visibility", th);
                    return i;
                }
            }
            return length;
        } catch (Throwable th2) {
            th = th2;
            this.f27618a.mo62798a("ui_parsing_visibility", th);
            return i;
        }
    }
}
