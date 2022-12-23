package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener;
import com.fyber.inneractive.sdk.util.C3670q;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.d.k */
public abstract class C2846k<EventsListenerT extends InneractiveContentController.EventsListener> implements InneractiveContentController<EventsListenerT> {
    protected WeakReference<InneractiveAdSpot> mAdSpot;
    protected EventsListenerT mEventsListener;

    public abstract boolean canControl(InneractiveAdSpot inneractiveAdSpot);

    public EventsListenerT getEventsListener() {
        return this.mEventsListener;
    }

    public void setEventsListener(EventsListenerT eventslistenert) {
        this.mEventsListener = eventslistenert;
    }

    public void destroy() {
        this.mEventsListener = null;
        this.mAdSpot = null;
    }

    public InneractiveAdSpot getAdSpot() {
        return (InneractiveAdSpot) C3670q.m9152a(this.mAdSpot);
    }

    public void setAdSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.mAdSpot = new WeakReference<>(inneractiveAdSpot);
    }
}
