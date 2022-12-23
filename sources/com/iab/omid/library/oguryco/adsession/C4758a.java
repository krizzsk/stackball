package com.iab.omid.library.oguryco.adsession;

import android.view.View;
import com.iab.omid.library.oguryco.p114b.C4760a;
import com.iab.omid.library.oguryco.p114b.C4764c;
import com.iab.omid.library.oguryco.p114b.C4768f;
import com.iab.omid.library.oguryco.p116d.C4780e;
import com.iab.omid.library.oguryco.p117e.C4782a;
import com.iab.omid.library.oguryco.publisher.AdSessionStatePublisher;
import com.iab.omid.library.oguryco.publisher.C4785a;
import com.iab.omid.library.oguryco.publisher.C4786b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.adsession.a */
public class C4758a extends AdSession {

    /* renamed from: a */
    private static final Pattern f10707a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f10708b;

    /* renamed from: c */
    private final AdSessionConfiguration f10709c;

    /* renamed from: d */
    private final List<C4764c> f10710d = new ArrayList();

    /* renamed from: e */
    private C4782a f10711e;

    /* renamed from: f */
    private AdSessionStatePublisher f10712f;

    /* renamed from: g */
    private boolean f10713g = false;

    /* renamed from: h */
    private boolean f10714h = false;

    /* renamed from: i */
    private String f10715i;

    /* renamed from: j */
    private boolean f10716j;

    /* renamed from: k */
    private boolean f10717k;

    C4758a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10709c = adSessionConfiguration;
        this.f10708b = adSessionContext;
        this.f10715i = UUID.randomUUID().toString();
        m10380c((View) null);
        this.f10712f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4785a(adSessionContext.getWebView()) : new C4786b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10712f.mo39381a();
        C4760a.m10402a().mo39335a(this);
        this.f10712f.mo39385a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4764c m10377a(View view) {
        for (C4764c next : this.f10710d) {
            if (next.mo39348a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m10378a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f10707a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m10379b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m10380c(View view) {
        this.f10711e = new C4782a(view);
    }

    /* renamed from: d */
    private void m10381d(View view) {
        Collection<C4758a> b = C4760a.m10402a().mo39336b();
        if (b != null && b.size() > 0) {
            for (C4758a next : b) {
                if (next != this && next.mo39280d() == view) {
                    next.f10711e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m10382j() {
        if (this.f10716j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m10383k() {
        if (this.f10717k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4764c> mo39276a() {
        return this.f10710d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39277a(JSONObject jSONObject) {
        m10383k();
        getAdSessionStatePublisher().mo39393a(jSONObject);
        this.f10717k = true;
    }

    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, (String) null);
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10714h) {
            m10379b(view);
            m10378a(str);
            if (m10377a(view) == null) {
                this.f10710d.add(new C4764c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39278b() {
        m10382j();
        getAdSessionStatePublisher().mo39401g();
        this.f10716j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39279c() {
        m10383k();
        getAdSessionStatePublisher().mo39403h();
        this.f10717k = true;
    }

    /* renamed from: d */
    public View mo39280d() {
        return (View) this.f10711e.get();
    }

    /* renamed from: e */
    public boolean mo39281e() {
        return this.f10713g && !this.f10714h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10714h) {
            C4780e.m10497a((Object) errorType, "Error type is null");
            C4780e.m10499a(str, "Message is null");
            getAdSessionStatePublisher().mo39386a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo39282f() {
        return this.f10713g;
    }

    public void finish() {
        if (!this.f10714h) {
            this.f10711e.clear();
            removeAllFriendlyObstructions();
            this.f10714h = true;
            getAdSessionStatePublisher().mo39400f();
            C4760a.m10402a().mo39339c(this);
            getAdSessionStatePublisher().mo39395b();
            this.f10712f = null;
        }
    }

    /* renamed from: g */
    public boolean mo39283g() {
        return this.f10714h;
    }

    public String getAdSessionId() {
        return this.f10715i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10712f;
    }

    /* renamed from: h */
    public boolean mo39284h() {
        return this.f10709c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo39285i() {
        return this.f10709c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10714h) {
            C4780e.m10497a((Object) view, "AdView is null");
            if (mo39280d() != view) {
                m10380c(view);
                getAdSessionStatePublisher().mo39404i();
                m10381d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10714h) {
            this.f10710d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10714h) {
            m10379b(view);
            C4764c a = m10377a(view);
            if (a != null) {
                this.f10710d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10713g) {
            this.f10713g = true;
            C4760a.m10402a().mo39337b(this);
            this.f10712f.mo39382a(C4768f.m10445a().mo39374d());
            this.f10712f.mo39387a(this, this.f10708b);
        }
    }
}
