package com.smaato.sdk.core.network;

import android.net.ConnectivityManager;
import android.net.Network;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.util.Objects;

final class PieConnectionStatusWatcher implements ConnectionStatusWatcher {
    private final ConnectivityManager connectivityManager;
    private SomaNetworkCallback networkCallback;

    PieConnectionStatusWatcher(ConnectivityManager connectivityManager2) {
        this.connectivityManager = (ConnectivityManager) Objects.requireNonNull(connectivityManager2);
    }

    public final void registerCallback(ConnectionStatusWatcher.Callback callback) {
        if (this.networkCallback != null) {
            unregisterCallback();
        }
        SomaNetworkCallback somaNetworkCallback = new SomaNetworkCallback(callback, (byte) 0);
        this.networkCallback = somaNetworkCallback;
        this.connectivityManager.registerDefaultNetworkCallback(somaNetworkCallback);
    }

    public final boolean isCallbackRegistered() {
        return this.networkCallback != null;
    }

    public final void unregisterCallback() {
        SomaNetworkCallback somaNetworkCallback = this.networkCallback;
        if (somaNetworkCallback != null) {
            this.connectivityManager.unregisterNetworkCallback(somaNetworkCallback);
            this.networkCallback = null;
        }
    }

    static final class SomaNetworkCallback extends ConnectivityManager.NetworkCallback {
        private final ConnectionStatusWatcher.Callback callback;

        /* synthetic */ SomaNetworkCallback(ConnectionStatusWatcher.Callback callback2, byte b) {
            this(callback2);
        }

        private SomaNetworkCallback(ConnectionStatusWatcher.Callback callback2) {
            this.callback = callback2;
        }

        public final void onAvailable(Network network) {
            this.callback.onConnectionStateChanged();
        }

        public final void onLost(Network network) {
            this.callback.onConnectionStateChanged();
        }
    }
}
