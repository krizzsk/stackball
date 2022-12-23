package com.yandex.mobile.ads.impl;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.yandex.mobile.ads.C12066R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u30 implements C15055wl {

    /* renamed from: b */
    private final FrameLayout f40554b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final t30 f40555c;

    /* renamed from: d */
    private AppCompatTextView f40556d;

    /* renamed from: e */
    private C13510jl f40557e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public x30 f40558f;

    /* renamed from: g */
    private final C15055wl f40559g;

    /* renamed from: com.yandex.mobile.ads.impl.u30$a */
    static final class C14737a extends Lambda implements Function1<x30, Unit> {

        /* renamed from: b */
        final /* synthetic */ u30 f40560b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14737a(u30 u30) {
            super(1);
            this.f40560b = u30;
        }

        public Object invoke(Object obj) {
            x30 x30 = (x30) obj;
            Intrinsics.checkNotNullParameter(x30, InneractiveMediationDefs.GENDER_MALE);
            u30.m42594a(this.f40560b, x30);
            return Unit.INSTANCE;
        }
    }

    public u30(FrameLayout frameLayout, t30 t30) {
        Intrinsics.checkNotNullParameter(frameLayout, "root");
        Intrinsics.checkNotNullParameter(t30, "errorModel");
        this.f40554b = frameLayout;
        this.f40555c = t30;
        this.f40559g = t30.mo70119a((Function1<? super x30, Unit>) new C14737a(this));
    }

    public void close() {
        this.f40559g.close();
    }

    /* renamed from: a */
    public static final void m42594a(u30 u30, x30 x30) {
        x30 x302 = u30.f40558f;
        if (x302 == null || x30 == null || x302.mo70815c() != x30.mo70815c()) {
            AppCompatTextView appCompatTextView = u30.f40556d;
            if (appCompatTextView != null) {
                u30.f40554b.removeView(appCompatTextView);
            }
            u30.f40556d = null;
            C13510jl jlVar = u30.f40557e;
            if (jlVar != null) {
                u30.f40554b.removeView(jlVar);
            }
            u30.f40557e = null;
        }
        if (x30 != null) {
            if (x30.mo70815c()) {
                if (u30.f40557e == null) {
                    Context context = u30.f40554b.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "root.context");
                    C13510jl jlVar2 = new C13510jl(context, new v30(u30), new w30(u30));
                    u30.f40554b.addView(jlVar2, new FrameLayout.LayoutParams(-1, -1));
                    u30.f40557e = jlVar2;
                }
                C13510jl jlVar3 = u30.f40557e;
                if (jlVar3 != null) {
                    jlVar3.mo68022a(x30.mo70814b());
                }
            } else {
                if (x30.mo70813a() > 0) {
                    u30.m42597b();
                } else {
                    AppCompatTextView appCompatTextView2 = u30.f40556d;
                    if (appCompatTextView2 != null) {
                        u30.f40554b.removeView(appCompatTextView2);
                    }
                    u30.f40556d = null;
                }
                AppCompatTextView appCompatTextView3 = u30.f40556d;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setText(String.valueOf(x30.mo70813a()));
                }
            }
        }
        u30.f40558f = x30;
    }

    /* renamed from: b */
    private final void m42597b() {
        if (this.f40556d == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f40554b.getContext());
            appCompatTextView.setBackgroundResource(C12066R.C12067drawable.error_counter_background);
            appCompatTextView.setTextSize(12.0f);
            appCompatTextView.setTextColor(-1);
            appCompatTextView.setGravity(17);
            appCompatTextView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    u30.m42593a(u30.this, view);
                }
            });
            int b = a91.m33644b(24);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b, 51);
            int b2 = a91.m33644b(8);
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b2;
            layoutParams.rightMargin = b2;
            layoutParams.bottomMargin = b2;
            this.f40554b.addView(appCompatTextView, layoutParams);
            this.f40556d = appCompatTextView;
        }
    }

    /* renamed from: a */
    public static final void m42595a(u30 u30, String str) {
        Object systemService = u30.f40554b.getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{WebRequest.CONTENT_TYPE_PLAIN_TEXT}, new ClipData.Item(str)));
            Toast.makeText(u30.f40554b.getContext(), "Error details are at your clipboard!", 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m42593a(u30 u30, View view) {
        Intrinsics.checkNotNullParameter(u30, "this$0");
        u30.f40555c.mo70123c();
    }
}
