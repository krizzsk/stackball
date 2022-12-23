package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ag */
public class C10110Ag implements IReporter {

    /* renamed from: b */
    static final C11829uo<String> f24329b = new C11726ro(new C11666po("Event name"));

    /* renamed from: c */
    static final C11829uo<String> f24330c = new C11726ro(new C11666po("Error message"));

    /* renamed from: d */
    static final C11829uo<String> f24331d = new C11726ro(new C11666po("Error identifier"));

    /* renamed from: e */
    static final C11829uo<Throwable> f24332e = new C11726ro(new C11697qo("Unhandled exception"));

    /* renamed from: f */
    static final C11829uo<UserProfile> f24333f = new C11726ro(new C11697qo("User profile"));

    /* renamed from: g */
    static final C11829uo<Revenue> f24334g = new C11726ro(new C11697qo("Revenue"));

    /* renamed from: h */
    static final C11829uo<ECommerceEvent> f24335h = new C11726ro(new C11697qo("ECommerceEvent"));

    /* renamed from: a */
    private final C12029zg f24336a;

    public C10110Ag() {
        this(new C12029zg());
    }

    /* renamed from: a */
    public C12029zg mo61062a() {
        return this.f24336a;
    }

    public IPluginReporter getPluginExtension() {
        return this.f24336a;
    }

    public void pauseSession() {
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        ((C11726ro) f24335h).mo61590a(eCommerceEvent);
    }

    public void reportError(String str, Throwable th) throws ValidationException {
        ((C11726ro) f24330c).mo61590a(str);
    }

    public void reportEvent(String str) throws ValidationException {
        ((C11726ro) f24329b).mo61590a(str);
    }

    public void reportRevenue(Revenue revenue) throws ValidationException {
        ((C11726ro) f24334g).mo61590a(revenue);
    }

    public void reportUnhandledException(Throwable th) throws ValidationException {
        ((C11726ro) f24332e).mo61590a(th);
    }

    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        ((C11726ro) f24333f).mo61590a(userProfile);
    }

    public void resumeSession() {
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }

    C10110Ag(C12029zg zgVar) {
        this.f24336a = zgVar;
    }

    public void reportError(String str, String str2) {
        ((C11726ro) f24331d).mo61590a(str);
    }

    public void reportEvent(String str, String str2) throws ValidationException {
        ((C11726ro) f24329b).mo61590a(str);
    }

    public void reportError(String str, String str2, Throwable th) {
        ((C11726ro) f24331d).mo61590a(str);
    }

    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        ((C11726ro) f24329b).mo61590a(str);
    }
}
