package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.provider.Settings;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeObserver;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class AudioVolumeObserver {
    private final AudioVolumeContentObserver audioVolumeContentObserver;
    private final ChangeNotifier.Listener<Integer> listener = new ChangeNotifier.Listener() {
        public final void onNextValue(Object obj) {
            AudioVolumeObserver.this.notifyListeners(((Integer) obj).intValue());
        }
    };
    private final Set<Listener> listeners = Collections.newSetFromMap(new WeakHashMap());
    private final int maxVolume;

    public interface Listener {
        void onVolumeChange(int i, int i2);
    }

    public AudioVolumeObserver(AudioVolumeContentObserver audioVolumeContentObserver2, int i) {
        this.audioVolumeContentObserver = (AudioVolumeContentObserver) Objects.requireNonNull(audioVolumeContentObserver2);
        audioVolumeContentObserver2.getChangeSender().addListener(this.listener);
        this.maxVolume = i;
    }

    public synchronized void register(Listener listener2) {
        Objects.requireNonNull(listener2);
        this.listeners.add(listener2);
        if (!this.listeners.isEmpty() && !this.audioVolumeContentObserver.isRegistered.get()) {
            AudioVolumeContentObserver audioVolumeContentObserver2 = this.audioVolumeContentObserver;
            if (audioVolumeContentObserver2.isRegistered.compareAndSet(false, true)) {
                audioVolumeContentObserver2.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, audioVolumeContentObserver2);
            }
        }
    }

    public synchronized void unregister(Listener listener2) {
        this.listeners.remove(listener2);
        if (this.listeners.isEmpty() && this.audioVolumeContentObserver.isRegistered.get()) {
            AudioVolumeContentObserver audioVolumeContentObserver2 = this.audioVolumeContentObserver;
            if (audioVolumeContentObserver2.isRegistered.compareAndSet(true, false)) {
                audioVolumeContentObserver2.context.getContentResolver().unregisterContentObserver(audioVolumeContentObserver2);
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void notifyListeners(int i) {
        Iterables.forEach(new HashSet(this.listeners), new Consumer(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AudioVolumeObserver.this.lambda$notifyListeners$0$AudioVolumeObserver(this.f$1, (AudioVolumeObserver.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$notifyListeners$0$AudioVolumeObserver(int i, Listener listener2) {
        listener2.onVolumeChange(i, this.maxVolume);
    }
}
