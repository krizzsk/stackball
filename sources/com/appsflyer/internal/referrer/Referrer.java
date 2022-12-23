package com.appsflyer.internal.referrer;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public abstract class Referrer extends Observable {
    public final Map<String, Object> map = new HashMap();

    /* renamed from: ǃ */
    private long f4239;

    /* renamed from: ɩ */
    private State f4240 = State.NOT_STARTED;
    /* access modifiers changed from: private */

    /* renamed from: Ι */
    public final Runnable f4241;

    /* renamed from: ι */
    private final String f4242;

    public enum State {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void start(Context context);

    public Referrer(String str, Runnable runnable) {
        this.f4241 = runnable;
        this.f4242 = str;
    }

    public void start() {
        this.f4239 = System.currentTimeMillis();
        this.f4240 = State.STARTED;
        addObserver(new Observer() {
            public final void update(Observable observable, Object obj) {
                Referrer.this.f4241.run();
            }
        });
    }

    public void finish() {
        this.map.put("source", this.f4242);
        this.map.putAll(new MandatoryFields());
        this.map.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - this.f4239));
        this.f4240 = State.FINISHED;
        setChanged();
        notifyObservers();
    }

    public State getState() {
        return this.f4240;
    }

    public String getSource() {
        return this.f4242;
    }
}
