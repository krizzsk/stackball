package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJError;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.TapjoyLog;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.tapjoy.internal.fz */
abstract class C9297fz {

    /* renamed from: b */
    volatile C9298a f22985b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract TJPlacement mo58143a(Context context, TJPlacementListener tJPlacementListener, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo58144a(Object obj);

    C9297fz() {
    }

    /* renamed from: c */
    public final boolean mo58161c(Object obj) {
        if (!mo58145a()) {
            return false;
        }
        C9298a aVar = null;
        synchronized (this) {
            if (this.f22985b == null) {
                aVar = mo58158b(obj);
                this.f22985b = aVar;
            }
        }
        if (aVar == null) {
            return false;
        }
        aVar.mo58162a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9298a mo58158b(Object obj) {
        return new C9298a(this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo58145a() {
        return !TapjoyConnectCore.isFullScreenViewOpen();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo58157a(Observer observer) {
        if (TapjoyConnectCore.isFullScreenViewOpen()) {
            C9288fs.f22969e.addObserver(observer);
            if (TapjoyConnectCore.isFullScreenViewOpen()) {
                return false;
            }
            C9288fs.f22969e.deleteObserver(observer);
        }
        if (C9344gz.m25060a().mo58252d()) {
            return true;
        }
        C9288fs.f22967c.addObserver(observer);
        if (!C9344gz.m25060a().mo58252d()) {
            return false;
        }
        C9288fs.f22967c.deleteObserver(observer);
        return true;
    }

    /* renamed from: com.tapjoy.internal.fz$a */
    class C9298a implements TJPlacementListener, Observer {

        /* renamed from: b */
        private final Object f22987b;

        /* renamed from: c */
        private final C9271fi f22988c;

        /* renamed from: d */
        private volatile boolean f22989d;

        /* renamed from: e */
        private TJPlacement f22990e;

        public final void onClick(TJPlacement tJPlacement) {
        }

        public final void onContentDismiss(TJPlacement tJPlacement) {
        }

        public final void onContentShow(TJPlacement tJPlacement) {
        }

        public final void onPurchaseRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str) {
        }

        public final void onRequestSuccess(TJPlacement tJPlacement) {
        }

        public final void onRewardRequest(TJPlacement tJPlacement, TJActionRequest tJActionRequest, String str, int i) {
        }

        C9298a(C9297fz fzVar, Object obj) {
            this(obj, new C9271fi(TapjoyConstants.TIMER_INCREMENT));
        }

        C9298a(Object obj, C9271fi fiVar) {
            this.f22987b = obj;
            this.f22988c = fiVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo58162a() {
            synchronized (this) {
                if (!this.f22989d) {
                    if (this.f22988c.mo58125a()) {
                        m24923a("Timed out");
                        return;
                    }
                    if (!TapjoyConnectCore.isConnected()) {
                        C9288fs.f22965a.addObserver(this);
                        if (TapjoyConnectCore.isConnected()) {
                            C9288fs.f22965a.deleteObserver(this);
                        } else {
                            return;
                        }
                    }
                    if (this.f22990e == null) {
                        if (!C9297fz.this.mo58145a()) {
                            m24923a("Cannot request");
                            return;
                        }
                        TJPlacement a = C9297fz.this.mo58143a(TapjoyConnectCore.getContext(), this, this.f22987b);
                        this.f22990e = a;
                        a.requestContent();
                    } else if (this.f22990e.isContentReady()) {
                        if (C9297fz.this.mo58157a((Observer) this)) {
                            this.f22990e.showContent();
                            m24923a((String) null);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private void m24923a(String str) {
            synchronized (this) {
                String a = C9297fz.this.mo58144a(this.f22987b);
                if (str == null) {
                    TapjoyLog.m24276i("SystemPlacement", "Placement " + a + " is presented now");
                } else {
                    TapjoyLog.m24276i("SystemPlacement", "Cannot show placement " + a + " now (" + str + ")");
                }
                this.f22989d = true;
                this.f22990e = null;
                C9288fs.f22965a.deleteObserver(this);
                C9288fs.f22969e.deleteObserver(this);
                C9288fs.f22967c.deleteObserver(this);
            }
            C9297fz fzVar = C9297fz.this;
            synchronized (fzVar) {
                if (fzVar.f22985b == this) {
                    fzVar.f22985b = null;
                }
            }
        }

        public final void update(Observable observable, Object obj) {
            mo58162a();
        }

        public final void onRequestFailure(TJPlacement tJPlacement, TJError tJError) {
            m24923a(tJError.message);
        }

        public final void onContentReady(TJPlacement tJPlacement) {
            mo58162a();
        }
    }
}
