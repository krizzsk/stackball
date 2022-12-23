package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.jl */
final class C13510jl extends LinearLayout {

    /* renamed from: a */
    private final Function0<Unit> f35351a;

    /* renamed from: b */
    private final Function0<Unit> f35352b;

    /* renamed from: c */
    private final AppCompatTextView f35353c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13510jl(Context context, Function0<Unit> function0, Function0<Unit> function02) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(function0, "onCloseAction");
        Intrinsics.checkNotNullParameter(function02, "onCopyAction");
        this.f35351a = function0;
        this.f35352b = function02;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        this.f35353c = appCompatTextView;
        int b = a91.m33644b(8);
        setPadding(b, b, b, b);
        setOrientation(0);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, 0, b, 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(17301560);
        imageView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C13510jl.m37865a(C13510jl.this, view);
            }
        });
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(17301582);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C13510jl.m37866b(C13510jl.this, view);
            }
        });
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(a91.m33644b(32), -2));
        addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m37865a(C13510jl jlVar, View view) {
        Intrinsics.checkNotNullParameter(jlVar, "this$0");
        jlVar.f35351a.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m37866b(C13510jl jlVar, View view) {
        Intrinsics.checkNotNullParameter(jlVar, "this$0");
        jlVar.f35352b.invoke();
    }

    /* renamed from: a */
    public final void mo68022a(String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f35353c.setText(str);
    }
}
