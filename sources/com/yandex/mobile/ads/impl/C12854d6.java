package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.yandex.mobile.ads.C12066R;

/* renamed from: com.yandex.mobile.ads.impl.d6 */
class C12854d6 {

    /* renamed from: a */
    private final C13381i6 f32389a = new C13381i6();

    /* renamed from: b */
    private final ki0 f32390b = new ki0();

    /* renamed from: com.yandex.mobile.ads.impl.d6$a */
    private static class C12855a implements View.OnClickListener {

        /* renamed from: a */
        private final Dialog f32391a;

        /* renamed from: b */
        private final ki0 f32392b;

        public C12855a(Dialog dialog, ki0 ki0) {
            this.f32391a = dialog;
            this.f32392b = ki0;
        }

        public void onClick(View view) {
            this.f32392b.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            this.f32391a.dismiss();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.d6$b */
    private static class C12856b implements View.OnTouchListener {

        /* renamed from: a */
        private float f32393a;

        /* renamed from: b */
        private final View f32394b;

        /* renamed from: c */
        private final Dialog f32395c;

        /* renamed from: d */
        private final ki0 f32396d;

        public C12856b(View view, Dialog dialog, ki0 ki0) {
            this.f32394b = view;
            this.f32395c = dialog;
            this.f32396d = ki0;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f32393a = rawY;
                return true;
            } else if (action == 1) {
                if (rawY > this.f32393a) {
                    this.f32396d.getClass();
                    InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    }
                    this.f32395c.dismiss();
                }
                return true;
            } else if (action != 2) {
                return false;
            } else {
                float f = this.f32393a;
                if (rawY > f) {
                    this.f32394b.setTranslationY(rawY - f);
                } else {
                    this.f32394b.setTranslationY(0.0f);
                }
                return true;
            }
        }
    }

    C12854d6() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66429a(View view, Dialog dialog) {
        this.f32389a.getClass();
        View findViewById = view.findViewById(C12066R.C12068id.adtune_drag_view_container);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new C12856b(view, dialog, this.f32390b));
        }
        this.f32389a.getClass();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C12066R.C12068id.adtune_background_view);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new C12855a(dialog, this.f32390b));
        }
    }
}
