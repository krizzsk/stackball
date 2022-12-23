package com.mbridge.msdk.interactiveads.view;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.interactiveads.p187d.C6412c;

public class MBLoadingDialog extends AlertDialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6412c f15993a;

    public MBLoadingDialog(Context context) {
        super(context);
    }

    public MBLoadingDialog(Context context, C6412c cVar) {
        super(context);
        this.f15993a = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        setContentView(C6347k.m16084a(getContext(), "mbridge_loading_dialog", "layout"));
        getWindow().setBackgroundDrawable(new ColorDrawable(-1));
        getWindow().setLayout(-1, -1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        ImageView imageView = (ImageView) findViewById(C6347k.m16084a(getContext(), "mbridge_close", "id"));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBLoadingDialog.this.f15993a != null) {
                        MBLoadingDialog.this.f15993a.mo44066a();
                    }
                    MBLoadingDialog.this.dismiss();
                }
            });
        }
    }
}
