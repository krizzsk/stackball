package com.p243my.target;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p243my.target.C7735x5;
import com.p243my.target.common.MyTargetActivity;
import com.p243my.target.nativeads.NativeAppwallAd;
import com.p243my.target.nativeads.factories.NativeAppwallViewsFactory;
import com.p243my.target.nativeads.views.AppwallAdView;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.g1 */
public class C7412g1 implements MyTargetActivity.ActivityEngine {

    /* renamed from: a */
    public final NativeAppwallAd f18608a;

    /* renamed from: b */
    public WeakReference<MyTargetActivity> f18609b;

    /* renamed from: c */
    public boolean f18610c;

    public C7412g1(NativeAppwallAd nativeAppwallAd) {
        this.f18608a = nativeAppwallAd;
    }

    /* renamed from: a */
    public static C7412g1 m19164a(NativeAppwallAd nativeAppwallAd) {
        return new C7412g1(nativeAppwallAd);
    }

    /* renamed from: a */
    public void mo50164a() {
        mo50169b();
    }

    /* renamed from: a */
    public final void mo50165a(ActionBar actionBar, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(actionBar.getTitle());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, actionBar.getTitle().length(), 18);
        actionBar.setTitle(spannableStringBuilder);
    }

    /* renamed from: a */
    public void mo50166a(Context context) {
        if (this.f18610c) {
            C7374e0.m18989a("Unable to open Appwall Ad twice, please dismiss currently showing ad first");
            return;
        }
        this.f18610c = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo50167a(ViewGroup viewGroup) {
        C7735x5 x5Var = new C7735x5(viewGroup.getContext());
        x5Var.setTitle(this.f18608a.getTitle());
        x5Var.setStripeColor(this.f18608a.getTitleSupplementaryColor());
        x5Var.setMainColor(this.f18608a.getTitleBackgroundColor());
        x5Var.setTitleColor(this.f18608a.getTitleTextColor());
        x5Var.setLayoutParams(new ViewGroup.LayoutParams(-1, C7761y8.m20950c(viewGroup.getContext()).mo51902b(52)));
        viewGroup.addView(x5Var);
        x5Var.setOnCloseClickListener(new C7735x5.C7736a() {
            /* renamed from: a */
            public final void mo49448a() {
                C7412g1.this.mo50169b();
            }
        });
    }

    /* renamed from: a */
    public final void mo50168a(MyTargetActivity myTargetActivity) {
        Window window = myTargetActivity.getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            myTargetActivity.setTheme(16974392);
            ActionBar actionBar = myTargetActivity.getActionBar();
            if (actionBar != null) {
                actionBar.setTitle(this.f18608a.getTitle());
                actionBar.setIcon(17170445);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setBackgroundDrawable(new ColorDrawable(this.f18608a.getTitleBackgroundColor()));
                mo50165a(actionBar, this.f18608a.getTitleTextColor());
                actionBar.setElevation((float) C7761y8.m20950c((Context) myTargetActivity).mo51902b(4));
            }
            window.setStatusBarColor(this.f18608a.getTitleSupplementaryColor());
        } else if (i >= 14) {
            myTargetActivity.setTheme(16974105);
            ActionBar actionBar2 = myTargetActivity.getActionBar();
            if (actionBar2 != null) {
                actionBar2.setTitle(this.f18608a.getTitle());
                actionBar2.setBackgroundDrawable(new ColorDrawable(this.f18608a.getTitleBackgroundColor()));
                mo50165a(actionBar2, this.f18608a.getTitleTextColor());
                actionBar2.setIcon(17170445);
                actionBar2.setDisplayShowTitleEnabled(true);
                actionBar2.setDisplayHomeAsUpEnabled(true);
            }
        }
    }

    /* renamed from: b */
    public void mo50169b() {
        this.f18610c = false;
        WeakReference<MyTargetActivity> weakReference = this.f18609b;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    /* renamed from: b */
    public final void mo50170b(ViewGroup viewGroup) {
        AppwallAdView appwallView = NativeAppwallViewsFactory.getAppwallView(this.f18608a, viewGroup.getContext());
        this.f18608a.registerAppwallAdView(appwallView);
        appwallView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(appwallView);
    }

    public boolean onActivityBackPressed() {
        return true;
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        this.f18609b = new WeakReference<>(myTargetActivity);
        mo50168a(myTargetActivity);
        if (myTargetActivity.getActionBar() == null) {
            LinearLayout linearLayout = new LinearLayout(myTargetActivity);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(linearLayout);
            mo50167a((ViewGroup) linearLayout);
            mo50170b(linearLayout);
        } else {
            mo50170b(frameLayout);
        }
        NativeAppwallAd.AppwallAdListener listener = this.f18608a.getListener();
        if (listener != null) {
            listener.onDisplay(this.f18608a);
        }
    }

    public void onActivityDestroy() {
        this.f18610c = false;
        this.f18609b = null;
        NativeAppwallAd.AppwallAdListener listener = this.f18608a.getListener();
        if (listener != null) {
            listener.onDismiss(this.f18608a);
        }
    }

    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        WeakReference<MyTargetActivity> weakReference;
        MyTargetActivity myTargetActivity;
        if (menuItem.getItemId() != 16908332 || (weakReference = this.f18609b) == null || (myTargetActivity = (MyTargetActivity) weakReference.get()) == null) {
            return false;
        }
        myTargetActivity.finish();
        return true;
    }

    public void onActivityPause() {
    }

    public void onActivityResume() {
    }

    public void onActivityStart() {
    }

    public void onActivityStop() {
    }
}
