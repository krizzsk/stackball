package com.smaato.sdk.sys;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Subject;
import javax.inject.Singleton;

@Singleton
public class NetWatcherBase extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks, NetWatcher {
    private final Subject<NetState> networkState = Subject.replay(1);

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public NetWatcherBase(Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        obtainAndEmitNetworkState(context);
    }

    public Flow<NetState> networkState() {
        return this.networkState.distinctUntilChanged();
    }

    private void obtainAndEmitNetworkState(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.networkState.onNext(NetState.UNAVAILABLE);
        } else {
            this.networkState.onNext(NetState.AVAILABLE);
        }
    }

    public void onReceive(Context context, Intent intent) {
        obtainAndEmitNetworkState(context);
    }

    public void onActivityStarted(Activity activity) {
        activity.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void onActivityStopped(Activity activity) {
        try {
            activity.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
    }
}
