package com.smaato.sdk.richmedia.framework;

import android.content.IntentFilter;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class OrientationChangeWatcher {
    private final Set<Listener> listeners = Collections.newSetFromMap(new WeakHashMap());
    private final OrientationBroadcastReceiver orientationBroadcastReceiver;
    private final ChangeNotifier.Listener<Whatever> screenOrientationListener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            OrientationChangeWatcher.this.lambda$new$0$OrientationChangeWatcher((Whatever) obj);
        }
    };

    public interface Listener {
        void onOrientationChange();
    }

    public /* synthetic */ void lambda$new$0$OrientationChangeWatcher(Whatever whatever) {
        notifyListeners();
    }

    OrientationChangeWatcher(OrientationBroadcastReceiver orientationBroadcastReceiver2) {
        this.orientationBroadcastReceiver = (OrientationBroadcastReceiver) Objects.requireNonNull(orientationBroadcastReceiver2);
        orientationBroadcastReceiver2.orientationChangeSender.addListener(this.screenOrientationListener);
    }

    public final synchronized void addListener(Listener listener) {
        Objects.requireNonNull(listener);
        this.listeners.add(listener);
        if (!this.listeners.isEmpty() && !this.orientationBroadcastReceiver.isRegistered.get()) {
            OrientationBroadcastReceiver orientationBroadcastReceiver2 = this.orientationBroadcastReceiver;
            if (orientationBroadcastReceiver2.isRegistered.compareAndSet(false, true)) {
                orientationBroadcastReceiver2.context.registerReceiver(orientationBroadcastReceiver2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            }
        }
    }

    public final synchronized void removeListener(Listener listener) {
        this.listeners.remove(listener);
        if (this.listeners.isEmpty() && this.orientationBroadcastReceiver.isRegistered.get()) {
            OrientationBroadcastReceiver orientationBroadcastReceiver2 = this.orientationBroadcastReceiver;
            if (orientationBroadcastReceiver2.isRegistered.compareAndSet(true, false)) {
                orientationBroadcastReceiver2.context.unregisterReceiver(orientationBroadcastReceiver2);
            }
        }
    }

    private synchronized void notifyListeners() {
        Iterables.forEach(new HashSet(this.listeners), $$Lambda$cM8mMQ3iS_zaOq6W1YhFElCWJR4.INSTANCE);
    }
}
