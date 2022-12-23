package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.p126b.C4859a;
import com.iab.omid.library.vungle.p126b.C4862c;
import com.iab.omid.library.vungle.p126b.C4866f;
import com.iab.omid.library.vungle.p128d.C4878e;
import com.iab.omid.library.vungle.p129e.C4880a;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.C4883a;
import com.iab.omid.library.vungle.publisher.C4884b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.adsession.a */
public class C4857a extends AdSession {

    /* renamed from: a */
    private static final Pattern f10927a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f10928b;

    /* renamed from: c */
    private final AdSessionConfiguration f10929c;

    /* renamed from: d */
    private final List<C4862c> f10930d = new ArrayList();

    /* renamed from: e */
    private C4880a f10931e;

    /* renamed from: f */
    private AdSessionStatePublisher f10932f;

    /* renamed from: g */
    private boolean f10933g = false;

    /* renamed from: h */
    private boolean f10934h = false;

    /* renamed from: i */
    private final String f10935i;

    /* renamed from: j */
    private boolean f10936j;

    /* renamed from: k */
    private boolean f10937k;

    C4857a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10929c = adSessionConfiguration;
        this.f10928b = adSessionContext;
        this.f10935i = UUID.randomUUID().toString();
        m10813c((View) null);
        this.f10932f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4883a(adSessionContext.getWebView()) : new C4884b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10932f.mo39737a();
        C4859a.m10833a().mo39685a(this);
        this.f10932f.mo39741a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4862c m10810a(View view) {
        for (C4862c next : this.f10930d) {
            if (next.mo39704a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m10811a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f10927a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m10812b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m10813c(View view) {
        this.f10931e = new C4880a(view);
    }

    /* renamed from: d */
    private void m10814d(View view) {
        Collection<C4857a> b = C4859a.m10833a().mo39686b();
        if (b != null && !b.isEmpty()) {
            for (C4857a next : b) {
                if (next != this && next.mo39654d() == view) {
                    next.f10931e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m10815j() {
        if (this.f10936j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m10816k() {
        if (this.f10937k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4862c> mo39650a() {
        return this.f10930d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39651a(JSONObject jSONObject) {
        m10816k();
        getAdSessionStatePublisher().mo39749a(jSONObject);
        this.f10937k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10934h) {
            m10812b(view);
            m10811a(str);
            if (m10810a(view) == null) {
                this.f10930d.add(new C4862c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39652b() {
        m10815j();
        getAdSessionStatePublisher().mo39757g();
        this.f10936j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39653c() {
        m10816k();
        getAdSessionStatePublisher().mo39759h();
        this.f10937k = true;
    }

    /* renamed from: d */
    public View mo39654d() {
        return (View) this.f10931e.get();
    }

    /* renamed from: e */
    public boolean mo39655e() {
        return this.f10933g && !this.f10934h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10934h) {
            C4878e.m10925a((Object) errorType, "Error type is null");
            C4878e.m10927a(str, "Message is null");
            getAdSessionStatePublisher().mo39742a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo39656f() {
        return this.f10933g;
    }

    public void finish() {
        if (!this.f10934h) {
            this.f10931e.clear();
            removeAllFriendlyObstructions();
            this.f10934h = true;
            getAdSessionStatePublisher().mo39756f();
            C4859a.m10833a().mo39689c(this);
            getAdSessionStatePublisher().mo39751b();
            this.f10932f = null;
        }
    }

    /* renamed from: g */
    public boolean mo39657g() {
        return this.f10934h;
    }

    public String getAdSessionId() {
        return this.f10935i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10932f;
    }

    /* renamed from: h */
    public boolean mo39658h() {
        return this.f10929c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo39659i() {
        return this.f10929c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10934h) {
            C4878e.m10925a((Object) view, "AdView is null");
            if (mo39654d() != view) {
                m10813c(view);
                getAdSessionStatePublisher().mo39760i();
                m10814d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10934h) {
            this.f10930d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10934h) {
            m10812b(view);
            C4862c a = m10810a(view);
            if (a != null) {
                this.f10930d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10933g) {
            this.f10933g = true;
            C4859a.m10833a().mo39687b(this);
            this.f10932f.mo39738a(C4866f.m10873a().mo39730d());
            this.f10932f.mo39743a(this, this.f10928b);
        }
    }
}
