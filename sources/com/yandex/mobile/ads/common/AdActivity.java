package com.yandex.mobile.ads.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.C12095e;
import com.yandex.mobile.ads.impl.C12348a0;
import com.yandex.mobile.ads.impl.C12947e0;
import com.yandex.mobile.ads.impl.C14049n0;

public final class AdActivity extends Activity {

    /* renamed from: d */
    public static final /* synthetic */ int f29418d = 0;

    /* renamed from: a */
    private RelativeLayout f29419a;

    /* renamed from: b */
    private C12348a0 f29420b;

    /* renamed from: c */
    private C12947e0 f29421c;

    public void onBackPressed() {
        C12348a0 a0Var = this.f29420b;
        if (a0Var == null || a0Var.mo64513f()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C12947e0 e0Var = this.f29421c;
        if (e0Var != null) {
            e0Var.mo66721a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ResultReceiver resultReceiver;
        super.onCreate(bundle);
        this.f29419a = new RelativeLayout(this);
        C12947e0 e0Var = new C12947e0(this);
        this.f29421c = e0Var;
        RelativeLayout relativeLayout = this.f29419a;
        Intent intent = getIntent();
        C12348a0 a0Var = null;
        if (intent != null) {
            Window window = getWindow();
            try {
                resultReceiver = (ResultReceiver) intent.getParcelableExtra("extra_receiver");
            } catch (Exception unused) {
                resultReceiver = null;
            }
            a0Var = C12095e.m31385a().mo64516a(this, relativeLayout, resultReceiver, new C14049n0(this, resultReceiver), e0Var, intent, window);
        }
        this.f29420b = a0Var;
        if (a0Var != null) {
            a0Var.mo64511d();
            this.f29420b.mo64512e();
            setContentView(this.f29419a);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C12348a0 a0Var = this.f29420b;
        if (a0Var != null) {
            a0Var.onAdClosed();
            this.f29420b.mo64510c();
        }
        RelativeLayout relativeLayout = this.f29419a;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C12348a0 a0Var = this.f29420b;
        if (a0Var != null) {
            a0Var.mo64508b();
        }
        C12947e0 e0Var = this.f29421c;
        if (e0Var != null) {
            e0Var.mo66720a();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12348a0 a0Var = this.f29420b;
        if (a0Var != null) {
            a0Var.mo64505a();
        }
        C12947e0 e0Var = this.f29421c;
        if (e0Var != null) {
            e0Var.mo66723b();
        }
    }
}
