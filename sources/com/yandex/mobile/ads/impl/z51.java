package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.C12066R;
import java.util.Locale;

public class z51 implements C12382ag {

    /* renamed from: a */
    private final C14384qh f43021a;

    /* renamed from: b */
    private final a51 f43022b = new a51();

    /* renamed from: c */
    private final Locale f43023c;

    /* renamed from: d */
    private Dialog f43024d;

    public z51(C14384qh qhVar, Locale locale) {
        this.f43023c = locale;
        this.f43021a = qhVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m44477b(Dialog dialog, View view) {
        this.f43021a.mo67136g();
        dialog.dismiss();
    }

    /* renamed from: a */
    public void mo65752a(Context context) {
        Dialog dialog = new Dialog(context, C12066R.style.YandexAdsInternal_FullscreenDialog);
        View inflate = View.inflate(context, C12066R.layout.yandex_ads_internal_rewarded_close_verification, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C12066R.C12068id.verification_close);
        TextView textView2 = (TextView) inflate.findViewById(C12066R.C12068id.verification_dismiss);
        m44476a((TextView) inflate.findViewById(C12066R.C12068id.verification_title), C12066R.string.yandex_ads_internal_rewarded_close_verification_title);
        m44476a((TextView) inflate.findViewById(C12066R.C12068id.verification_text), C12066R.string.yandex_ads_internal_rewarded_close_verification_text);
        m44476a(textView, C12066R.string.yandex_ads_internal_rewarded_close_verification_button_close);
        m44476a(textView2, C12066R.string.yandex_ads_internal_rewarded_close_verification_button_dismiss);
        inflate.setOnClickListener(new View.OnClickListener(dialog) {
            public final /* synthetic */ Dialog f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(View view) {
                this.f$0.dismiss();
            }
        });
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener(dialog) {
                public final /* synthetic */ Dialog f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    z51.this.m44477b(this.f$1, view);
                }
            });
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener(dialog) {
                public final /* synthetic */ Dialog f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(View view) {
                    this.f$0.dismiss();
                }
            });
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                z51.this.m44475a(dialogInterface);
            }
        });
        dialog.setContentView(inflate);
        this.f43024d = dialog;
        dialog.show();
    }

    /* renamed from: a */
    public void mo65751a() {
        Dialog dialog = this.f43024d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m44475a(DialogInterface dialogInterface) {
        this.f43024d = null;
    }

    /* renamed from: a */
    private void m44476a(TextView textView, int i) {
        if (textView != null) {
            textView.setText(this.f43022b.mo65682a(textView.getContext(), this.f43023c, i));
        }
    }
}
