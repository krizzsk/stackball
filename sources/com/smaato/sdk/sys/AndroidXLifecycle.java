package com.smaato.sdk.sys;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleTrojan;
import com.smaato.sdk.sys.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class AndroidXLifecycle implements Lifecycle {
    private static final Map<Lifecycle.State, Lifecycle.State> states;
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private final Map<Lifecycle.Observer, Wrapper> observers = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        states = hashMap;
        hashMap.put(Lifecycle.State.INITIALIZED, Lifecycle.State.INITIALIZED);
        states.put(Lifecycle.State.CREATED, Lifecycle.State.CREATED);
        states.put(Lifecycle.State.STARTED, Lifecycle.State.STARTED);
        states.put(Lifecycle.State.RESUMED, Lifecycle.State.RESUMED);
        states.put(Lifecycle.State.DESTROYED, Lifecycle.State.DESTROYED);
    }

    AndroidXLifecycle(LifecycleOwner lifecycleOwner2) {
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner2);
    }

    public final Lifecycle.State currentState() {
        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.lifecycleOwner.get();
        if (lifecycleOwner2 == null) {
            return Lifecycle.State.DESTROYED;
        }
        Lifecycle.State state = states.get(lifecycleOwner2.getLifecycle().getCurrentState());
        if (state != null) {
            return state;
        }
        return Lifecycle.State.DESTROYED;
    }

    public final void addObserver(Lifecycle.Observer observer) {
        if (observer != null) {
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.lifecycleOwner.get();
            if (lifecycleOwner2 != null) {
                Wrapper wrapper = new Wrapper(this, observer);
                if (this.observers.put(observer, wrapper) == null) {
                    lifecycleOwner2.getLifecycle().addObserver(wrapper);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("'observer' specified as non-null is null");
    }

    public final void removeObserver(Lifecycle.Observer observer) {
        Wrapper remove;
        if (observer != null) {
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.lifecycleOwner.get();
            if (lifecycleOwner2 != null && (remove = this.observers.remove(observer)) != null) {
                lifecycleOwner2.getLifecycle().removeObserver(remove);
                return;
            }
            return;
        }
        throw new NullPointerException("'observer' specified as non-null is null");
    }

    static class Wrapper implements LifecycleTrojan {
        private final Lifecycle lifecycleOwner;
        private final Lifecycle.Observer observer;

        Wrapper(Lifecycle lifecycle, Lifecycle.Observer observer2) {
            this.lifecycleOwner = lifecycle;
            this.observer = observer2;
        }

        public final void onCreate(LifecycleOwner lifecycleOwner2) {
            if (lifecycleOwner2 != null) {
                this.observer.onCreate(this.lifecycleOwner);
                return;
            }
            throw new NullPointerException("'owner' specified as non-null is null");
        }

        public final void onStart(LifecycleOwner lifecycleOwner2) {
            if (lifecycleOwner2 != null) {
                this.observer.onStart(this.lifecycleOwner);
                return;
            }
            throw new NullPointerException("'owner' specified as non-null is null");
        }

        public final void onResume(LifecycleOwner lifecycleOwner2) {
            if (lifecycleOwner2 != null) {
                this.observer.onResume(this.lifecycleOwner);
                return;
            }
            throw new NullPointerException("'owner' specified as non-null is null");
        }

        public final void onPause(LifecycleOwner lifecycleOwner2) {
            if (lifecycleOwner2 != null) {
                this.observer.onPause(this.lifecycleOwner);
                return;
            }
            throw new NullPointerException("'owner' specified as non-null is null");
        }

        public final void onStop(LifecycleOwner lifecycleOwner2) {
            if (lifecycleOwner2 != null) {
                this.observer.onStop(this.lifecycleOwner);
                return;
            }
            throw new NullPointerException("'owner' specified as non-null is null");
        }

        public final void onDestroy(LifecycleOwner lifecycleOwner2) {
            if (lifecycleOwner2 != null) {
                this.observer.onDestroy(this.lifecycleOwner);
                return;
            }
            throw new NullPointerException("'owner' specified as non-null is null");
        }
    }
}
