package com.smaato.sdk.sys;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Subject;
import javax.inject.Singleton;

@Singleton
public class NetWatcherL extends ConnectivityManager.NetworkCallback implements NetWatcher {
    private final Subject<NetState> networkState = Subject.replay(1);

    public NetWatcherL(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.networkState.onNext(NetState.UNAVAILABLE);
        } else {
            this.networkState.onNext(NetState.AVAILABLE);
        }
    }

    public Flow<NetState> networkState() {
        return this.networkState.distinctUntilChanged();
    }

    public void onAvailable(Network network) {
        this.networkState.onNext(NetState.AVAILABLE);
    }

    public void onLost(Network network) {
        this.networkState.onNext(NetState.UNAVAILABLE);
    }
}
