package com.smaato.sdk.core.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.core.util.p251fi.Consumer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class NetworkStateMonitor {
    private final Set<Callback> callbacks = Collections.newSetFromMap(new WeakHashMap());
    private final ChangeSender<Boolean> changeSender;
    private final ChangeNotifier.Listener<Boolean> changeSenderListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            NetworkStateMonitor.this.notifyCallbacks(((Boolean) obj).booleanValue());
        }
    };
    private final ConnectionStatusWatcher connectionStatusWatcher;
    private final ConnectionStatusWatcher.Callback connectionStatusWatcherCallback;
    private final ConnectivityManager connectivityManager;

    public interface Callback {
        void onNetworkStateChanged(boolean z);
    }

    public NetworkStateMonitor(ConnectivityManager connectivityManager2, ConnectionStatusWatcher connectionStatusWatcher2) {
        this.connectivityManager = (ConnectivityManager) Objects.requireNonNull(connectivityManager2, "Parameter connectivityManager cannot be null for NetworkStateMonitor::new");
        this.connectionStatusWatcher = (ConnectionStatusWatcher) Objects.requireNonNull(connectionStatusWatcher2, "Parameter connectionStatusWatcher cannot be null for NetworkStateMonitor::new");
        ChangeSender<Boolean> createDebounceChangeSender = ChangeSenderUtils.createDebounceChangeSender(Boolean.valueOf(isOnline()), 500);
        this.changeSender = createDebounceChangeSender;
        createDebounceChangeSender.addListener(this.changeSenderListener);
        this.connectionStatusWatcherCallback = new ConnectionStatusWatcher.Callback() {
            public final void onConnectionStateChanged() {
                NetworkStateMonitor.this.lambda$new$0$NetworkStateMonitor();
            }
        };
    }

    public /* synthetic */ void lambda$new$0$NetworkStateMonitor() {
        this.changeSender.newValue(Boolean.valueOf(isOnline()));
    }

    public final synchronized void addCallback(Callback callback) {
        Objects.requireNonNull(callback);
        this.callbacks.add(callback);
        if (!this.callbacks.isEmpty() && !this.connectionStatusWatcher.isCallbackRegistered()) {
            this.connectionStatusWatcher.registerCallback(this.connectionStatusWatcherCallback);
        }
    }

    public final synchronized void removeCallback(Callback callback) {
        this.callbacks.remove(callback);
        if (this.callbacks.isEmpty() && this.connectionStatusWatcher.isCallbackRegistered()) {
            this.connectionStatusWatcher.unregisterCallback();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void notifyCallbacks(boolean z) {
        Iterables.forEach(new HashSet(this.callbacks), new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((NetworkStateMonitor.Callback) obj).onNetworkStateChanged(this.f$0);
            }
        });
    }

    public final boolean isOnline() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final NetworkConnectionType getNetworkConnectionType() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkConnectionType.WIFI;
        }
        if (activeNetworkInfo.getType() == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkConnectionType.CARRIER_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return NetworkConnectionType.CARRIER_3G;
                case 13:
                case 18:
                case 19:
                    return NetworkConnectionType.CARRIER_4G;
                default:
                    return NetworkConnectionType.CARRIER_UNKNOWN;
            }
        } else if (activeNetworkInfo.getType() == 9) {
            return NetworkConnectionType.ETHERNET;
        } else {
            return NetworkConnectionType.OTHER;
        }
    }
}
