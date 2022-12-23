package com.iab.omid.library.corpmailru.adsession;

import android.view.View;
import com.iab.omid.library.corpmailru.p096b.C4612a;
import com.iab.omid.library.corpmailru.p096b.C4615c;
import com.iab.omid.library.corpmailru.p096b.C4619f;
import com.iab.omid.library.corpmailru.p098d.C4631e;
import com.iab.omid.library.corpmailru.p099e.C4633a;
import com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher;
import com.iab.omid.library.corpmailru.publisher.C4636a;
import com.iab.omid.library.corpmailru.publisher.C4637b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.adsession.a */
public class C4610a extends AdSession {

    /* renamed from: a */
    private static final Pattern f10378a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f10379b;

    /* renamed from: c */
    private final AdSessionConfiguration f10380c;

    /* renamed from: d */
    private final List<C4615c> f10381d = new ArrayList();

    /* renamed from: e */
    private C4633a f10382e;

    /* renamed from: f */
    private AdSessionStatePublisher f10383f;

    /* renamed from: g */
    private boolean f10384g = false;

    /* renamed from: h */
    private boolean f10385h = false;

    /* renamed from: i */
    private final String f10386i;

    /* renamed from: j */
    private boolean f10387j;

    /* renamed from: k */
    private boolean f10388k;

    public C4610a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10380c = adSessionConfiguration;
        this.f10379b = adSessionContext;
        this.f10386i = UUID.randomUUID().toString();
        m9725c((View) null);
        this.f10383f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4636a(adSessionContext.getWebView()) : new C4637b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10383f.mo38815a();
        C4612a.m9745a().mo38763a(this);
        this.f10383f.mo38819a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4615c m9722a(View view) {
        for (C4615c next : this.f10381d) {
            if (next.mo38782a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m9723a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f10378a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private static void m9724b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m9725c(View view) {
        this.f10382e = new C4633a(view);
    }

    /* renamed from: d */
    private void m9726d(View view) {
        Collection<C4610a> b = C4612a.m9745a().mo38764b();
        if (b != null && !b.isEmpty()) {
            for (C4610a next : b) {
                if (next != this && next.mo38732d() == view) {
                    next.f10382e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m9727j() {
        if (this.f10387j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m9728k() {
        if (this.f10388k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4615c> mo38728a() {
        return this.f10381d;
    }

    /* renamed from: a */
    public void mo38729a(JSONObject jSONObject) {
        m9728k();
        getAdSessionStatePublisher().mo38827a(jSONObject);
        this.f10388k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10385h) {
            m9724b(view);
            m9723a(str);
            if (m9722a(view) == null) {
                this.f10381d.add(new C4615c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public void mo38730b() {
        m9727j();
        getAdSessionStatePublisher().mo38835g();
        this.f10387j = true;
    }

    /* renamed from: c */
    public void mo38731c() {
        m9728k();
        getAdSessionStatePublisher().mo38837h();
        this.f10388k = true;
    }

    /* renamed from: d */
    public View mo38732d() {
        return (View) this.f10382e.get();
    }

    /* renamed from: e */
    public boolean mo38733e() {
        return this.f10384g && !this.f10385h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10385h) {
            C4631e.m9837a((Object) errorType, "Error type is null");
            C4631e.m9839a(str, "Message is null");
            getAdSessionStatePublisher().mo38820a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo38734f() {
        return this.f10384g;
    }

    public void finish() {
        if (!this.f10385h) {
            this.f10382e.clear();
            removeAllFriendlyObstructions();
            this.f10385h = true;
            getAdSessionStatePublisher().mo38834f();
            C4612a.m9745a().mo38767c(this);
            getAdSessionStatePublisher().mo38829b();
            this.f10383f = null;
        }
    }

    /* renamed from: g */
    public boolean mo38735g() {
        return this.f10385h;
    }

    public String getAdSessionId() {
        return this.f10386i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10383f;
    }

    /* renamed from: h */
    public boolean mo38736h() {
        return this.f10380c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo38737i() {
        return this.f10380c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10385h) {
            C4631e.m9837a((Object) view, "AdView is null");
            if (mo38732d() != view) {
                m9725c(view);
                getAdSessionStatePublisher().mo38838i();
                m9726d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10385h) {
            this.f10381d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10385h) {
            m9724b(view);
            C4615c a = m9722a(view);
            if (a != null) {
                this.f10381d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10384g) {
            this.f10384g = true;
            C4612a.m9745a().mo38765b(this);
            this.f10383f.mo38816a(C4619f.m9785a().mo38808d());
            this.f10383f.mo38821a(this, this.f10379b);
        }
    }
}
