package com.iab.omid.library.smaato.adsession;

import android.view.View;
import com.iab.omid.library.smaato.p120b.C4811a;
import com.iab.omid.library.smaato.p120b.C4818e;
import com.iab.omid.library.smaato.p122d.C4829e;
import com.iab.omid.library.smaato.p123e.C4831a;
import com.iab.omid.library.smaato.publisher.AdSessionStatePublisher;
import com.iab.omid.library.smaato.publisher.C4834a;
import com.iab.omid.library.smaato.publisher.C4835b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.iab.omid.library.smaato.adsession.a */
public class C4809a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f10828a;

    /* renamed from: b */
    private final AdSessionConfiguration f10829b;

    /* renamed from: c */
    private final List<C4831a> f10830c = new ArrayList();

    /* renamed from: d */
    private C4831a f10831d;

    /* renamed from: e */
    private AdSessionStatePublisher f10832e;

    /* renamed from: f */
    private boolean f10833f = false;

    /* renamed from: g */
    private boolean f10834g = false;

    /* renamed from: h */
    private String f10835h;

    /* renamed from: i */
    private boolean f10836i;

    C4809a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10829b = adSessionConfiguration;
        this.f10828a = adSessionContext;
        this.f10835h = UUID.randomUUID().toString();
        m10614c((View) null);
        this.f10832e = adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML ? new C4834a(adSessionContext.getWebView()) : new C4835b(adSessionContext.getVerificationScriptResources(), adSessionContext.getOmidJsScriptContent());
        this.f10832e.mo39552a();
        C4811a.m10631a().mo39513a(this);
        this.f10832e.mo39556a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4831a m10612a(View view) {
        for (C4831a next : this.f10830c) {
            if (next.get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m10613b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m10614c(View view) {
        this.f10831d = new C4831a(view);
    }

    /* renamed from: d */
    private void m10615d(View view) {
        Collection<C4809a> b = C4811a.m10631a().mo39514b();
        if (b != null && b.size() > 0) {
            for (C4809a next : b) {
                if (next != this && next.mo39489c() == view) {
                    next.f10831d.clear();
                }
            }
        }
    }

    /* renamed from: i */
    private void m10616i() {
        if (this.f10836i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4831a> mo39487a() {
        return this.f10830c;
    }

    public void addFriendlyObstruction(View view) {
        if (!this.f10834g) {
            m10613b(view);
            if (m10612a(view) == null) {
                this.f10830c.add(new C4831a(view));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39488b() {
        m10616i();
        getAdSessionStatePublisher().mo39570g();
        this.f10836i = true;
    }

    /* renamed from: c */
    public View mo39489c() {
        return (View) this.f10831d.get();
    }

    /* renamed from: d */
    public boolean mo39490d() {
        return this.f10833f && !this.f10834g;
    }

    /* renamed from: e */
    public boolean mo39491e() {
        return this.f10833f;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10834g) {
            C4829e.m10712a((Object) errorType, "Error type is null");
            C4829e.m10714a(str, "Message is null");
            getAdSessionStatePublisher().mo39557a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo39492f() {
        return this.f10834g;
    }

    public void finish() {
        if (!this.f10834g) {
            this.f10831d.clear();
            removeAllFriendlyObstructions();
            this.f10834g = true;
            getAdSessionStatePublisher().mo39569f();
            C4811a.m10631a().mo39517c(this);
            getAdSessionStatePublisher().mo39564b();
            this.f10832e = null;
        }
    }

    /* renamed from: g */
    public boolean mo39493g() {
        return this.f10829b.isNativeImpressionOwner();
    }

    public String getAdSessionId() {
        return this.f10835h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10832e;
    }

    /* renamed from: h */
    public boolean mo39494h() {
        return this.f10829b.isNativeVideoEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10834g) {
            C4829e.m10712a((Object) view, "AdView is null");
            if (mo39489c() != view) {
                m10614c(view);
                getAdSessionStatePublisher().mo39572h();
                m10615d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10834g) {
            this.f10830c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10834g) {
            m10613b(view);
            C4831a a = m10612a(view);
            if (a != null) {
                this.f10830c.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10833f) {
            this.f10833f = true;
            C4811a.m10631a().mo39515b(this);
            this.f10832e.mo39553a(C4818e.m10668a().mo39546d());
            this.f10832e.mo39558a(this, this.f10828a);
        }
    }
}
