package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.p108b.C4710a;
import com.iab.omid.library.ironsrc.p108b.C4713c;
import com.iab.omid.library.ironsrc.p108b.C4717f;
import com.iab.omid.library.ironsrc.p110d.C4729e;
import com.iab.omid.library.ironsrc.p111e.C4731a;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C4734a;
import com.iab.omid.library.ironsrc.publisher.C4735b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.adsession.a */
public class C4708a extends AdSession {

    /* renamed from: a */
    private static final Pattern f10593a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f10594b;

    /* renamed from: c */
    private final AdSessionConfiguration f10595c;

    /* renamed from: d */
    private final List<C4713c> f10596d = new ArrayList();

    /* renamed from: e */
    private C4731a f10597e;

    /* renamed from: f */
    private AdSessionStatePublisher f10598f;

    /* renamed from: g */
    private boolean f10599g = false;

    /* renamed from: h */
    private boolean f10600h = false;

    /* renamed from: i */
    private String f10601i;

    /* renamed from: j */
    private boolean f10602j;

    /* renamed from: k */
    private boolean f10603k;

    C4708a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10595c = adSessionConfiguration;
        this.f10594b = adSessionContext;
        this.f10601i = UUID.randomUUID().toString();
        m10159c((View) null);
        this.f10598f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4734a(adSessionContext.getWebView()) : new C4735b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10598f.mo39167a();
        C4710a.m10179a().mo39123a(this);
        this.f10598f.mo39171a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4713c m10156a(View view) {
        for (C4713c next : this.f10596d) {
            if (next.mo39134a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m10157a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f10593a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m10158b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m10159c(View view) {
        this.f10597e = new C4731a(view);
    }

    /* renamed from: d */
    private void m10160d(View view) {
        Collection<C4708a> b = C4710a.m10179a().mo39124b();
        if (b != null && b.size() > 0) {
            for (C4708a next : b) {
                if (next != this && next.mo39092d() == view) {
                    next.f10597e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m10161j() {
        if (this.f10602j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m10162k() {
        if (this.f10603k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4713c> mo39088a() {
        return this.f10596d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39089a(JSONObject jSONObject) {
        m10162k();
        getAdSessionStatePublisher().mo39179a(jSONObject);
        this.f10603k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10600h) {
            m10158b(view);
            m10157a(str);
            if (m10156a(view) == null) {
                this.f10596d.add(new C4713c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39090b() {
        m10161j();
        getAdSessionStatePublisher().mo39187g();
        this.f10602j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39091c() {
        m10162k();
        getAdSessionStatePublisher().mo39189h();
        this.f10603k = true;
    }

    /* renamed from: d */
    public View mo39092d() {
        return (View) this.f10597e.get();
    }

    /* renamed from: e */
    public boolean mo39093e() {
        return this.f10599g && !this.f10600h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10600h) {
            C4729e.m10268a((Object) errorType, "Error type is null");
            C4729e.m10270a(str, "Message is null");
            getAdSessionStatePublisher().mo39172a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo39094f() {
        return this.f10599g;
    }

    public void finish() {
        if (!this.f10600h) {
            this.f10597e.clear();
            removeAllFriendlyObstructions();
            this.f10600h = true;
            getAdSessionStatePublisher().mo39186f();
            C4710a.m10179a().mo39127c(this);
            getAdSessionStatePublisher().mo39181b();
            this.f10598f = null;
        }
    }

    /* renamed from: g */
    public boolean mo39095g() {
        return this.f10600h;
    }

    public String getAdSessionId() {
        return this.f10601i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10598f;
    }

    /* renamed from: h */
    public boolean mo39096h() {
        return this.f10595c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo39097i() {
        return this.f10595c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10600h) {
            C4729e.m10268a((Object) view, "AdView is null");
            if (mo39092d() != view) {
                m10159c(view);
                getAdSessionStatePublisher().mo39190i();
                m10160d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10600h) {
            this.f10596d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10600h) {
            m10158b(view);
            C4713c a = m10156a(view);
            if (a != null) {
                this.f10596d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10599g) {
            this.f10599g = true;
            C4710a.m10179a().mo39125b(this);
            this.f10598f.mo39168a(C4717f.m10217a().mo39160d());
            this.f10598f.mo39173a(this, this.f10594b);
        }
    }
}
