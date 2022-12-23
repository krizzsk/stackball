package com.smaato.sdk.sys;

import com.smaato.sdk.sys.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class LifecycleRegistry implements Lifecycle {
    private Lifecycle.State currentState;
    private final WeakReference<Object> lifecycleOwner;
    private final Map<Lifecycle.Observer, StatefulObserver> observers = new HashMap();

    public LifecycleRegistry(Object obj) {
        this.lifecycleOwner = new WeakReference<>(obj);
        this.currentState = Lifecycle.State.INITIALIZED;
    }

    public Lifecycle.State currentState() {
        return this.currentState;
    }

    public void addObserver(Lifecycle.Observer observer) {
        if (observer == null) {
            throw new NullPointerException("'observer' specified as non-null is null");
        } else if (this.lifecycleOwner.get() != null) {
            StatefulObserver statefulObserver = new StatefulObserver(observer, this.currentState == Lifecycle.State.DESTROYED ? Lifecycle.State.DESTROYED : Lifecycle.State.INITIALIZED);
            if (this.observers.put(observer, statefulObserver) == null) {
                sync(statefulObserver, this.currentState);
            }
        }
    }

    public void removeObserver(Lifecycle.Observer observer) {
        if (observer != null) {
            this.observers.remove(observer);
            return;
        }
        throw new NullPointerException("'observer' specified as non-null is null");
    }

    public void dispatch(Lifecycle.Event event) {
        if (event != null) {
            Lifecycle.State stateAfter = getStateAfter(event);
            if (this.currentState != stateAfter) {
                this.currentState = stateAfter;
                sync();
                return;
            }
            return;
        }
        throw new NullPointerException("'event' specified as non-null is null");
    }

    /* access modifiers changed from: private */
    public static Lifecycle.State getStateAfter(Lifecycle.Event event) {
        switch (C89191.$SwitchMap$com$smaato$sdk$sys$Lifecycle$Event[event.ordinal()]) {
            case 1:
            case 2:
                return Lifecycle.State.CREATED;
            case 3:
            case 4:
                return Lifecycle.State.STARTED;
            case 5:
                return Lifecycle.State.RESUMED;
            case 6:
                return Lifecycle.State.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event ".concat(String.valueOf(event)));
        }
    }

    /* renamed from: com.smaato.sdk.sys.LifecycleRegistry$1 */
    static /* synthetic */ class C89191 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$sys$Lifecycle$Event;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$sys$Lifecycle$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        static {
            /*
                com.smaato.sdk.sys.Lifecycle$State[] r0 = com.smaato.sdk.sys.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$sys$Lifecycle$State = r0
                r1 = 1
                com.smaato.sdk.sys.Lifecycle$State r2 = com.smaato.sdk.sys.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.sys.Lifecycle$State r3 = com.smaato.sdk.sys.Lifecycle.State.DESTROYED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.sys.Lifecycle$State r4 = com.smaato.sdk.sys.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.sys.Lifecycle$State r5 = com.smaato.sdk.sys.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.sys.Lifecycle$State r6 = com.smaato.sdk.sys.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.smaato.sdk.sys.Lifecycle$Event[] r5 = com.smaato.sdk.sys.Lifecycle.Event.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$com$smaato$sdk$sys$Lifecycle$Event = r5
                com.smaato.sdk.sys.Lifecycle$Event r6 = com.smaato.sdk.sys.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.smaato.sdk.sys.Lifecycle$Event r5 = com.smaato.sdk.sys.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.smaato.sdk.sys.Lifecycle$Event r1 = com.smaato.sdk.sys.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x006d }
                com.smaato.sdk.sys.Lifecycle$Event r1 = com.smaato.sdk.sys.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.smaato.sdk.sys.Lifecycle$Event r1 = com.smaato.sdk.sys.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = $SwitchMap$com$smaato$sdk$sys$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.smaato.sdk.sys.Lifecycle$Event r1 = com.smaato.sdk.sys.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.sys.LifecycleRegistry.C89191.<clinit>():void");
        }
    }

    private static Lifecycle.Event upEvent(Lifecycle.State state) {
        int i = C89191.$SwitchMap$com$smaato$sdk$sys$Lifecycle$State[state.ordinal()];
        if (i == 1 || i == 2) {
            return Lifecycle.Event.ON_CREATE;
        }
        if (i == 3) {
            return Lifecycle.Event.ON_START;
        }
        if (i == 4) {
            return Lifecycle.Event.ON_RESUME;
        }
        throw new IllegalArgumentException("Unexpected state ".concat(String.valueOf(state)));
    }

    private static Lifecycle.Event downEvent(Lifecycle.State state) {
        int i = C89191.$SwitchMap$com$smaato$sdk$sys$Lifecycle$State[state.ordinal()];
        if (i == 3) {
            return Lifecycle.Event.ON_DESTROY;
        }
        if (i == 4) {
            return Lifecycle.Event.ON_STOP;
        }
        if (i == 5) {
            return Lifecycle.Event.ON_PAUSE;
        }
        throw new IllegalArgumentException("Unexpected state ".concat(String.valueOf(state)));
    }

    private void sync() {
        Lifecycle.State state = this.currentState;
        for (StatefulObserver sync : this.observers.values()) {
            sync(sync, state);
        }
    }

    static class StatefulObserver {
        private final Lifecycle.Observer observer;
        Lifecycle.State state;

        public StatefulObserver(Lifecycle.Observer observer2, Lifecycle.State state2) {
            this.observer = observer2;
            this.state = state2;
        }

        /* access modifiers changed from: package-private */
        public final void dispatchEvent(Lifecycle lifecycle, Lifecycle.Event event) {
            this.state = LifecycleRegistry.getStateAfter(event);
            switch (C89191.$SwitchMap$com$smaato$sdk$sys$Lifecycle$Event[event.ordinal()]) {
                case 1:
                    this.observer.onCreate(lifecycle);
                    return;
                case 2:
                    this.observer.onStop(lifecycle);
                    return;
                case 3:
                    this.observer.onStart(lifecycle);
                    return;
                case 4:
                    this.observer.onPause(lifecycle);
                    return;
                case 5:
                    this.observer.onResume(lifecycle);
                    return;
                case 6:
                    this.observer.onDestroy(lifecycle);
                    return;
                default:
                    return;
            }
        }
    }

    private void sync(StatefulObserver statefulObserver, Lifecycle.State state) {
        while (statefulObserver.state.compareTo(state) < 0) {
            statefulObserver.dispatchEvent(this, upEvent(statefulObserver.state));
        }
        while (statefulObserver.state.compareTo(state) > 0) {
            statefulObserver.dispatchEvent(this, downEvent(statefulObserver.state));
        }
    }
}
