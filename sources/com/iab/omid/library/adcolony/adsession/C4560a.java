package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.p090b.C4562a;
import com.iab.omid.library.adcolony.p090b.C4565c;
import com.iab.omid.library.adcolony.p090b.C4569f;
import com.iab.omid.library.adcolony.p092d.C4581e;
import com.iab.omid.library.adcolony.p093e.C4583a;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;
import com.iab.omid.library.adcolony.publisher.C4586a;
import com.iab.omid.library.adcolony.publisher.C4587b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.adsession.a */
public class C4560a extends AdSession {

    /* renamed from: k */
    private static final Pattern f10257k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f10258a;

    /* renamed from: b */
    private final AdSessionConfiguration f10259b;

    /* renamed from: c */
    private final List<C4565c> f10260c = new ArrayList();

    /* renamed from: d */
    private C4583a f10261d;

    /* renamed from: e */
    private AdSessionStatePublisher f10262e;

    /* renamed from: f */
    private boolean f10263f = false;

    /* renamed from: g */
    private boolean f10264g = false;

    /* renamed from: h */
    private String f10265h;

    /* renamed from: i */
    private boolean f10266i;

    /* renamed from: j */
    private boolean f10267j;

    C4560a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f10259b = adSessionConfiguration;
        this.f10258a = adSessionContext;
        this.f10265h = UUID.randomUUID().toString();
        m9502c((View) null);
        this.f10262e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4586a(adSessionContext.getWebView()) : new C4587b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f10262e.mo38621a();
        C4562a.m9524a().mo38577a(this);
        this.f10262e.mo38625a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4565c m9499a(View view) {
        for (C4565c next : this.f10260c) {
            if (next.mo38588a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m9500a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f10257k.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m9501b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m9502c(View view) {
        this.f10261d = new C4583a(view);
    }

    /* renamed from: d */
    private void m9503d(View view) {
        Collection<C4560a> b = C4562a.m9524a().mo38578b();
        if (b != null && b.size() > 0) {
            for (C4560a next : b) {
                if (next != this && next.mo38546d() == view) {
                    next.f10261d.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m9504j() {
        if (this.f10266i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m9505k() {
        if (this.f10267j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4565c> mo38542a() {
        return this.f10260c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38543a(JSONObject jSONObject) {
        m9505k();
        getAdSessionStatePublisher().mo38633a(jSONObject);
        this.f10267j = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f10264g) {
            m9501b(view);
            m9500a(str);
            if (m9499a(view) == null) {
                this.f10260c.add(new C4565c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo38544b() {
        m9504j();
        getAdSessionStatePublisher().mo38641g();
        this.f10266i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo38545c() {
        m9505k();
        getAdSessionStatePublisher().mo38643h();
        this.f10267j = true;
    }

    /* renamed from: d */
    public View mo38546d() {
        return (View) this.f10261d.get();
    }

    /* renamed from: e */
    public boolean mo38547e() {
        return this.f10263f && !this.f10264g;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f10264g) {
            C4581e.m9613a((Object) errorType, "Error type is null");
            C4581e.m9615a(str, "Message is null");
            getAdSessionStatePublisher().mo38626a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo38548f() {
        return this.f10263f;
    }

    public void finish() {
        if (!this.f10264g) {
            this.f10261d.clear();
            removeAllFriendlyObstructions();
            this.f10264g = true;
            getAdSessionStatePublisher().mo38640f();
            C4562a.m9524a().mo38581c(this);
            getAdSessionStatePublisher().mo38635b();
            this.f10262e = null;
        }
    }

    /* renamed from: g */
    public boolean mo38549g() {
        return this.f10264g;
    }

    public String getAdSessionId() {
        return this.f10265h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f10262e;
    }

    /* renamed from: h */
    public boolean mo38550h() {
        return this.f10259b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo38551i() {
        return this.f10259b.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f10264g) {
            C4581e.m9613a((Object) view, "AdView is null");
            if (mo38546d() != view) {
                m9502c(view);
                getAdSessionStatePublisher().mo38644i();
                m9503d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f10264g) {
            this.f10260c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f10264g) {
            m9501b(view);
            C4565c a = m9499a(view);
            if (a != null) {
                this.f10260c.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f10263f) {
            this.f10263f = true;
            C4562a.m9524a().mo38579b(this);
            this.f10262e.mo38622a(C4569f.m9562a().mo38614d());
            this.f10262e.mo38627a(this, this.f10258a);
        }
    }
}
