package com.p243my.target;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;

/* renamed from: com.my.target.s5 */
public class C7651s5 extends Dialog {

    /* renamed from: a */
    public final C7652a f19328a;

    /* renamed from: com.my.target.s5$a */
    public interface C7652a {
        /* renamed from: a */
        void mo50263a(C7651s5 s5Var, FrameLayout frameLayout);

        /* renamed from: b */
        void mo50265b(boolean z);

        /* renamed from: q */
        void mo50267q();
    }

    public C7651s5(C7652a aVar, Context context) {
        super(context);
        this.f19328a = aVar;
    }

    /* renamed from: a */
    public static C7651s5 m20348a(C7652a aVar, Context context) {
        return new C7651s5(aVar, context);
    }

    public void dismiss() {
        super.dismiss();
        this.f19328a.mo50267q();
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
        }
        this.f19328a.mo50263a(this, frameLayout);
        super.onCreate(bundle);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f19328a.mo50265b(z);
        super.onWindowFocusChanged(z);
    }
}
