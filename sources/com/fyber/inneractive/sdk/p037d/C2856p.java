package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.d.p */
public abstract class C2856p<EL extends InneractiveUnitController.EventsListener> implements InneractiveUnitController<EL> {
    /* access modifiers changed from: protected */
    public WeakReference<C2845j> mAdSpot;
    protected Set<InneractiveContentController> mContentControllers = new HashSet();
    protected EL mEventsListener;
    protected InneractiveContentController mSelectedContentController;

    public abstract boolean supports(InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();

    protected C2856p() {
    }

    public void setEventsListener(EL el) {
        this.mEventsListener = el;
    }

    public EL getEventsListener() {
        return this.mEventsListener;
    }

    public InneractiveAdSpot getAdSpot() {
        return (C2845j) C3670q.m9152a(this.mAdSpot);
    }

    public void addContentController(InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public void setAdSpot(C2845j jVar) {
        this.mAdSpot = new WeakReference<>(jVar);
    }

    /* access modifiers changed from: protected */
    public void selectContentController() {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) C3670q.m9152a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            IAlog.m9036d("selectContentController called, but ad spot is null", new Object[0]);
            return;
        }
        for (InneractiveContentController next : this.mContentControllers) {
            C2846k kVar = (C2846k) next;
            if (kVar.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = next;
                kVar.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    public void destroy() {
        for (InneractiveContentController destroy : this.mContentControllers) {
            destroy.destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    /* access modifiers changed from: protected */
    public String logPrefix() {
        return IAlog.m9029a((Object) this);
    }
}
