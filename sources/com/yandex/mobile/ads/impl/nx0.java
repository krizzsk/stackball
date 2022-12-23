package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.PopupMenu;
import com.yandex.mobile.ads.C12066R;

public class nx0 {

    /* renamed from: a */
    private C14152a f38013a;

    /* renamed from: com.yandex.mobile.ads.impl.nx0$a */
    public interface C14152a {

        /* renamed from: com.yandex.mobile.ads.impl.nx0$a$a */
        public static class C14153a implements C14152a {
            /* renamed from: a */
            public void mo69087a() {
            }
        }

        /* renamed from: a */
        void mo69087a();

        /* renamed from: a */
        void mo69088a(PopupMenu popupMenu);
    }

    public nx0(Context context, View view, ViewGroup viewGroup) {
        this(context, view, viewGroup, C12066R.dimen.overflow_menu_margin_horizontal, C12066R.dimen.overflow_menu_margin_vertical);
    }

    /* renamed from: a */
    public nx0 mo69086a(C14152a aVar) {
        this.f38013a = aVar;
        return this;
    }

    public nx0(Context context, View view, ViewGroup viewGroup, int i, int i2) {
    }

    /* renamed from: a */
    public View.OnClickListener mo69085a() {
        return new View.OnClickListener() {
            public final void onClick(View view) {
                nx0.this.m40250a(view);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40250a(View view) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, 83);
        C14152a aVar = this.f38013a;
        if (aVar != null) {
            aVar.mo69088a(popupMenu);
        }
        popupMenu.show();
        C14152a aVar2 = this.f38013a;
        if (aVar2 != null) {
            aVar2.mo69087a();
        }
    }
}
