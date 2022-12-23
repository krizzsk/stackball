package com.p243my.target;

import android.content.Context;
import android.content.SharedPreferences;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.my.target.n3 */
public class C7561n3 implements CookieStore {

    /* renamed from: a */
    public final SharedPreferences f19083a;

    /* renamed from: b */
    public final Map<URI, Set<HttpCookie>> f19084b = new HashMap();

    public C7561n3(Context context) {
        this.f19083a = context.getSharedPreferences("mytarget_httpcookie_prefs", 0);
        mo50975a();
    }

    /* renamed from: a */
    public static URI m19921a(URI uri, HttpCookie httpCookie) {
        if (httpCookie.getDomain() == null) {
            return uri;
        }
        String domain = httpCookie.getDomain();
        if (domain.charAt(0) == '.') {
            domain = domain.substring(1);
        }
        try {
            return new URI(uri.getScheme() == null ? "http" : uri.getScheme(), domain, httpCookie.getPath() == null ? "/" : httpCookie.getPath(), (String) null);
        } catch (Throwable th) {
            C7374e0.m18989a(th.getMessage());
            return uri;
        }
    }

    /* renamed from: a */
    public final List<HttpCookie> mo50974a(URI uri) {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : this.f19084b.entrySet()) {
            URI uri2 = (URI) next.getKey();
            if (mo50977a(uri2.getHost(), uri.getHost()) && mo50981b(uri2.getPath(), uri.getPath())) {
                hashSet.addAll((Collection) next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            mo50976a(uri, (List<HttpCookie>) arrayList);
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: a */
    public final void mo50975a() {
        for (Map.Entry next : this.f19083a.getAll().entrySet()) {
            try {
                URI uri = new URI(((String) next.getKey()).split("\\|", 2)[0]);
                HttpCookie a = new C7582o3().mo51280a((String) next.getValue());
                Set set = this.f19084b.get(uri);
                if (set == null) {
                    set = new HashSet();
                    this.f19084b.put(uri, set);
                }
                set.add(a);
            } catch (Throwable th) {
                C7374e0.m18989a(th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo50976a(URI uri, List<HttpCookie> list) {
        SharedPreferences.Editor edit = this.f19083a.edit();
        for (HttpCookie name : list) {
            edit.remove(uri.toString() + "|" + name.getName());
        }
        edit.apply();
    }

    /* renamed from: a */
    public final boolean mo50977a(String str, String str2) {
        if (!str2.equals(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            return str2.endsWith(sb.toString());
        }
    }

    public synchronized void add(URI uri, HttpCookie httpCookie) {
        URI a = m19921a(uri, httpCookie);
        Set set = this.f19084b.get(a);
        if (set == null) {
            set = new HashSet();
            this.f19084b.put(a, set);
        }
        set.remove(httpCookie);
        set.add(httpCookie);
        mo50982c(a, httpCookie);
    }

    /* renamed from: b */
    public final void mo50979b() {
        this.f19083a.edit().clear().apply();
    }

    /* renamed from: b */
    public final void mo50980b(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f19083a.edit();
        edit.remove(uri.toString() + "|" + httpCookie.getName());
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo50981b(String str, String str2) {
        return str2.equals(str) || (str2.startsWith(str) && str.charAt(str.length() - 1) == '/') || (str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/');
    }

    /* renamed from: c */
    public final void mo50982c(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f19083a.edit();
        edit.putString(uri.toString() + "|" + httpCookie.getName(), new C7582o3().mo51279a(httpCookie));
        edit.apply();
    }

    public synchronized List<HttpCookie> get(URI uri) {
        return mo50974a(uri);
    }

    public synchronized List<HttpCookie> getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (URI a : this.f19084b.keySet()) {
            arrayList.addAll(mo50974a(a));
        }
        return arrayList;
    }

    public synchronized List<URI> getURIs() {
        return new ArrayList(this.f19084b.keySet());
    }

    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        boolean z;
        Set set = this.f19084b.get(uri);
        z = set != null && set.remove(httpCookie);
        if (z) {
            mo50980b(uri, httpCookie);
        }
        return z;
    }

    public synchronized boolean removeAll() {
        this.f19084b.clear();
        mo50979b();
        return true;
    }
}
