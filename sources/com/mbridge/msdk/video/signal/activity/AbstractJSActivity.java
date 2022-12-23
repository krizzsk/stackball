package com.mbridge.msdk.video.signal.activity;

import android.content.res.Configuration;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.video.signal.C7050a;
import com.mbridge.msdk.video.signal.C7067b;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.video.signal.C7155e;
import com.mbridge.msdk.video.signal.C7156f;
import com.mbridge.msdk.video.signal.C7160h;
import com.mbridge.msdk.video.signal.C7161i;
import com.mbridge.msdk.video.signal.factory.C7157a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

public abstract class AbstractJSActivity extends MBBaseActivity implements IJSFactory {
    protected static final String TAG = "AbstractJSActivity";
    protected IJSFactory jsFactory = new C7157a();

    public boolean canBackPress() {
        return false;
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.jsFactory = iJSFactory;
    }

    public void onResume() {
        super.onResume();
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48793b();
        }
        getActivityProxy().mo48791a(0);
    }

    public void onPause() {
        super.onPause();
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48790a();
        }
        getActivityProxy().mo48791a(1);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().mo48811b()) {
            getActivityProxy().mo48792a(configuration);
        }
    }

    public void onBackPressed() {
        if (getJSCommon().mo48811b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().mo48798g();
            }
        } else if (canBackPress()) {
            super.onBackPressed();
        } else {
            C6361q.m16154a(TAG, "onBackPressed can't excute");
        }
    }

    public C7050a getActivityProxy() {
        return this.jsFactory.getActivityProxy();
    }

    public C7068c getJSCommon() {
        return this.jsFactory.getJSCommon();
    }

    public C7161i getJSVideoModule() {
        return this.jsFactory.getJSVideoModule();
    }

    public C7156f getJSNotifyProxy() {
        return this.jsFactory.getJSNotifyProxy();
    }

    public C7155e getJSContainerModule() {
        return this.jsFactory.getJSContainerModule();
    }

    public C7160h getIJSRewardVideoV1() {
        return this.jsFactory.getIJSRewardVideoV1();
    }

    public C7067b getJSBTModule() {
        return this.jsFactory.getJSBTModule();
    }
}
