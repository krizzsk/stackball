package com.smaato.sdk.sys;

public interface Lifecycle {

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY
    }

    public interface Observer {

        /* renamed from: com.smaato.sdk.sys.Lifecycle$Observer$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onCreate(Observer observer, Lifecycle lifecycle) {
            }

            public static void $default$onDestroy(Observer observer, Lifecycle lifecycle) {
            }

            public static void $default$onPause(Observer observer, Lifecycle lifecycle) {
            }

            public static void $default$onResume(Observer observer, Lifecycle lifecycle) {
            }

            public static void $default$onStart(Observer observer, Lifecycle lifecycle) {
            }

            public static void $default$onStop(Observer observer, Lifecycle lifecycle) {
            }
        }

        void onCreate(Lifecycle lifecycle);

        void onDestroy(Lifecycle lifecycle);

        void onPause(Lifecycle lifecycle);

        void onResume(Lifecycle lifecycle);

        void onStart(Lifecycle lifecycle);

        void onStop(Lifecycle lifecycle);
    }

    void addObserver(Observer observer);

    State currentState();

    void removeObserver(Observer observer);

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(State state) {
            if (state != null) {
                return compareTo(state) >= 0;
            }
            throw new NullPointerException("'state' specified as non-null is null");
        }
    }
}
