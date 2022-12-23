package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.p102b.C4662a;
import com.iab.omid.library.inmobi.p102b.C4669e;
import com.iab.omid.library.inmobi.p104d.C4680e;
import com.iab.omid.library.inmobi.p105e.C4682a;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.C4685a;
import com.iab.omid.library.inmobi.publisher.C4686b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.iab.omid.library.inmobi.adsession.a */
public class C4660a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f10491a;

    /* renamed from: b */
    private final AdSessionConfiguration f10492b;

    /* renamed from: c */
    private final List<C4682a> f10493c = new ArrayList();

    /* renamed from: d */
    private C4682a f10494d;

    /* renamed from: e */
    private AdSessionStatePublisher f10495e;

    /* renamed from: f */
    private boolean f10496f = false;

    /* renamed from: g */
    private boolean f10497g = false;

    /* renamed from: h */
    private String f10498h;

    /* renamed from: i */
    private boolean f10499i;

    C4660a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10492b = adSessionConfiguration;
        this.f10491a = adSessionContext;
        this.f10498h = UUID.randomUUID().toString();
        m9954c((View) null);
        this.f10495e = adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML ? new C4685a(adSessionContext.getWebView()) : new C4686b(adSessionContext.getVerificationScriptResources(), adSessionContext.getOmidJsScriptContent());
        this.f10495e.mo38987a();
        C4662a.m9971a().mo38947a(this);
        this.f10495e.mo38991a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4682a m9952a(View view) {
        for (C4682a next : this.f10493c) {
            if (next.get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m9953b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m9954c(View view) {
        this.f10494d = new C4682a(view);
    }

    /* renamed from: d */
    private void m9955d(View view) {
        Collection<C4660a> b = C4662a.m9971a().mo38948b();
        if (b != null && b.size() > 0) {
            for (C4660a next : b) {
                if (next != this && next.mo38923c() == view) {
                    next.f10494d.clear();
                }
            }
        }
    }

    /* renamed from: i */
    private void m9956i() {
        if (this.f10499i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4682a> mo38921a() {
        return this.f10493c;
    }

    public void addFriendlyObstruction(View view) {
        if (!this.f10497g) {
            m9953b(view);
            if (m9952a(view) == null) {
                this.f10493c.add(new C4682a(view));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo38922b() {
        m9956i();
        getAdSessionStatePublisher().mo39005g();
        this.f10499i = true;
    }

    /* renamed from: c */
    public View mo38923c() {
        return (View) this.f10494d.get();
    }

    /* renamed from: d */
    public boolean mo38924d() {
        return this.f10496f && !this.f10497g;
    }

    /* renamed from: e */
    public boolean mo38925e() {
        return this.f10496f;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10497g) {
            C4680e.m10054a((Object) errorType, "Error type is null");
            C4680e.m10056a(str, "Message is null");
            getAdSessionStatePublisher().mo38992a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo38926f() {
        return this.f10497g;
    }

    public void finish() {
        if (!this.f10497g) {
            this.f10494d.clear();
            removeAllFriendlyObstructions();
            this.f10497g = true;
            getAdSessionStatePublisher().mo39004f();
            C4662a.m9971a().mo38951c(this);
            getAdSessionStatePublisher().mo38999b();
            this.f10495e = null;
        }
    }

    /* renamed from: g */
    public boolean mo38927g() {
        return this.f10492b.isNativeImpressionOwner();
    }

    public String getAdSessionId() {
        return this.f10498h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10495e;
    }

    /* renamed from: h */
    public boolean mo38928h() {
        return this.f10492b.isNativeVideoEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10497g) {
            C4680e.m10054a((Object) view, "AdView is null");
            if (mo38923c() != view) {
                m9954c(view);
                getAdSessionStatePublisher().mo39007h();
                m9955d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10497g) {
            this.f10493c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10497g) {
            m9953b(view);
            C4682a a = m9952a(view);
            if (a != null) {
                this.f10493c.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10496f) {
            this.f10496f = true;
            C4662a.m9971a().mo38949b(this);
            this.f10495e.mo38988a(C4669e.m10008a().mo38980d());
            this.f10495e.mo38993a(this, this.f10491a);
        }
    }
}
