package com.applovin.impl.sdk.p027d;

import android.net.Uri;
import com.applovin.impl.mediation.C1306k;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1501o;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.impl.sdk.p026c.C1383e;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.model.Advertisement;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Typography;

/* renamed from: com.applovin.impl.sdk.d.c */
abstract class C1405c extends C1392a implements C1306k.C1307a {

    /* renamed from: a */
    protected final C1355g f3294a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAdLoadListener f3295c;

    /* renamed from: d */
    private final C1501o f3296d;

    /* renamed from: e */
    private final Collection<Character> f3297e;

    /* renamed from: f */
    private final C1383e f3298f;

    /* renamed from: g */
    private boolean f3299g;

    C1405c(String str, C1355g gVar, C1469j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, jVar);
        if (gVar != null) {
            this.f3294a = gVar;
            this.f3295c = appLovinAdLoadListener;
            this.f3296d = jVar.mo13081U();
            this.f3297e = m2841j();
            this.f3298f = new C1383e();
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    /* renamed from: a */
    private Uri m2836a(Uri uri, String str) {
        String str2;
        StringBuilder sb;
        if (uri != null) {
            String uri2 = uri.toString();
            if (C1553o.m3554b(uri2)) {
                mo12944a("Caching " + str + " image...");
                return m2840g(uri2);
            }
            sb = new StringBuilder();
            sb.append("Failed to cache ");
            sb.append(str);
            str2 = " image";
        } else {
            sb = new StringBuilder();
            sb.append("No ");
            sb.append(str);
            str2 = " image to cache";
        }
        sb.append(str2);
        mo12944a(sb.toString());
        return null;
    }

    /* renamed from: a */
    private Uri m2837a(String str, String str2) {
        StringBuilder sb;
        String replace = str2.replace("/", "_");
        String L = this.f3294a.mo12752L();
        if (C1553o.m3554b(L)) {
            replace = L + replace;
        }
        File a = this.f3296d.mo13258a(replace, this.f3279b.mo13065D());
        if (a == null) {
            return null;
        }
        if (a.exists()) {
            this.f3298f.mo12911b(a.length());
            sb = new StringBuilder();
        } else {
            if (!this.f3296d.mo13263a(a, str + str2, Arrays.asList(new String[]{str}), this.f3298f)) {
                return null;
            }
            sb = new StringBuilder();
        }
        sb.append(Advertisement.FILE_SCHEME);
        sb.append(a.getAbsolutePath());
        return Uri.parse(sb.toString());
    }

    /* renamed from: g */
    private Uri m2840g(String str) {
        return mo12971b(str, this.f3294a.mo12751K(), true);
    }

    /* renamed from: j */
    private Collection<Character> m2841j() {
        HashSet hashSet = new HashSet();
        for (char valueOf : ((String) this.f3279b.mo13088a(C1369c.f2915bE)).toCharArray()) {
            hashSet.add(Character.valueOf(valueOf));
        }
        hashSet.add(Character.valueOf(Typography.quote));
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Uri mo12966a(String str, List<String> list, boolean z) {
        String str2;
        if (!C1553o.m3554b(str)) {
            return null;
        }
        mo12944a("Caching video " + str + "...");
        String a = this.f3296d.mo13259a(mo12951f(), str, this.f3294a.mo12752L(), list, z, this.f3298f);
        if (C1553o.m3554b(a)) {
            File a2 = this.f3296d.mo13258a(a, mo12951f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    mo12944a("Finish caching video for ad #" + this.f3294a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a);
                    return fromFile;
                }
                str2 = "Unable to create URI from cached video file = " + a2;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
        } else if (((Boolean) this.f3279b.mo13088a(C1369c.f2918bH)).booleanValue()) {
            mo12949d("Failed to cache video");
            mo12976h();
            return null;
        } else {
            str2 = "Failed to cache video, but not failing ad load";
        }
        mo12949d(str2);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo12967a(String str, List<String> list) {
        if (C1553o.m3554b(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                mo12944a("Nothing to cache, skipping...");
                return null;
            }
            String lastPathSegment = parse.getLastPathSegment();
            if (C1553o.m3554b(this.f3294a.mo12752L())) {
                lastPathSegment = this.f3294a.mo12752L() + lastPathSegment;
            }
            File a = this.f3296d.mo13258a(lastPathSegment, mo12951f());
            ByteArrayOutputStream a2 = (a == null || !a.exists()) ? null : this.f3296d.mo13256a(a);
            if (a2 == null) {
                a2 = this.f3296d.mo13257a(str, list, true);
                if (a2 != null) {
                    this.f3296d.mo13262a(a2, a);
                    this.f3298f.mo12910a((long) a2.size());
                }
            } else {
                this.f3298f.mo12911b((long) a2.size());
            }
            try {
                return a2.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                mo12945a("UTF-8 encoding not supported.", e);
            } catch (Throwable th) {
                mo12945a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo12968a(String str, List<String> list, C1355g gVar) {
        if (!C1553o.m3554b(str)) {
            return str;
        }
        if (!((Boolean) this.f3279b.mo13088a(C1369c.f2917bG)).booleanValue()) {
            mo12944a("Resource caching is disabled, skipping cache...");
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        boolean shouldCancelHtmlCachingIfShown = gVar.shouldCancelHtmlCachingIfShown();
        for (String next : list) {
            int i = 0;
            int i2 = 0;
            while (i < sb.length()) {
                if (mo12972b()) {
                    return str;
                }
                i = sb.indexOf(next, i2);
                if (i == -1) {
                    continue;
                    break;
                }
                int length = sb.length();
                int i3 = i;
                while (!this.f3297e.contains(Character.valueOf(sb.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= i || i3 == length) {
                    mo12949d("Unable to cache resource; ad HTML is invalid.");
                    return str;
                }
                String substring = sb.substring(next.length() + i, i3);
                if (!C1553o.m3554b(substring)) {
                    mo12944a("Skip caching of non-resource " + substring);
                } else if (!shouldCancelHtmlCachingIfShown || !gVar.hasShown()) {
                    Uri a = m2837a(next, substring);
                    if (a != null) {
                        sb.replace(i, i3, a.toString());
                        gVar.mo12813b(a);
                        this.f3298f.mo12915e();
                    } else {
                        this.f3298f.mo12916f();
                    }
                } else {
                    mo12944a("Cancelling HTML caching due to ad being shown already");
                    this.f3298f.mo12909a();
                    return str;
                }
                i2 = i3;
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12969a() {
        this.f3279b.mo13062A().mo12496b(this);
    }

    /* renamed from: a */
    public void mo12497a(C1223a aVar) {
        if (aVar.mo12285b().equalsIgnoreCase(this.f3294a.mo12756P())) {
            mo12949d("Updating flag for timeout...");
            this.f3299g = true;
        }
        this.f3279b.mo13062A().mo12496b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12970a(AppLovinAdBase appLovinAdBase) {
        C1382d.m2723a(this.f3298f, appLovinAdBase, this.f3279b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Uri mo12971b(String str, List<String> list, boolean z) {
        String str2;
        try {
            String a = this.f3296d.mo13259a(mo12951f(), str, this.f3294a.mo12752L(), list, z, this.f3298f);
            if (!C1553o.m3554b(a)) {
                return null;
            }
            File a2 = this.f3296d.mo13258a(a, mo12951f());
            if (a2 != null) {
                Uri fromFile = Uri.fromFile(a2);
                if (fromFile != null) {
                    return fromFile;
                }
                str2 = "Unable to extract Uri from image file";
            } else {
                str2 = "Unable to retrieve File from cached image filename = " + a;
            }
            mo12949d(str2);
            return null;
        } catch (Throwable th) {
            mo12945a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12972b() {
        return this.f3299g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12973c() {
        mo12944a("Caching mute images...");
        Uri a = m2836a(this.f3294a.mo12781aK(), "mute");
        if (a != null) {
            this.f3294a.mo12815c(a);
        }
        Uri a2 = m2836a(this.f3294a.mo12782aL(), "unmute");
        if (a2 != null) {
            this.f3294a.mo12816d(a2);
        }
        mo12944a("Ad updated with muteImageFilename = " + this.f3294a.mo12781aK() + ", unmuteImageFilename = " + this.f3294a.mo12782aL());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Uri mo12974e(String str) {
        return mo12966a(str, this.f3294a.mo12751K(), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo12975f(final String str) {
        if (!C1553o.m3554b(str)) {
            return null;
        }
        C1488b a = C1488b.m3193a(this.f3279b).mo13200a(str).mo13206b("GET").mo13199a("").mo13198a(0).mo13204a();
        final AtomicReference atomicReference = new AtomicReference((Object) null);
        this.f3279b.mo13070J().mo13170a(a, new C1484a.C1485a(), new C1484a.C1487c<String>() {
            /* renamed from: a */
            public void mo12144a(int i) {
                C1405c cVar = C1405c.this;
                cVar.mo12949d("Failed to load resource from '" + str + "'");
            }

            /* renamed from: a */
            public void mo12145a(String str, int i) {
                atomicReference.set(str);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 != null) {
            this.f3298f.mo12910a((long) str2.length());
        }
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12976h() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1405c.this.f3295c != null) {
                    C1557r.m3600a(C1405c.this.f3295c, C1405c.this.f3294a.getAdZone(), (int) AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES, C1405c.this.f3279b);
                    AppLovinAdLoadListener unused = C1405c.this.f3295c = null;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo12977i() {
        mo12944a("Rendered new ad:" + this.f3294a);
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1405c.this.f3295c != null) {
                    C1405c.this.f3295c.adReceived(C1405c.this.f3294a);
                    AppLovinAdLoadListener unused = C1405c.this.f3295c = null;
                }
            }
        });
    }

    public void run() {
        if (this.f3294a.mo12755O()) {
            mo12944a("Subscribing to timeout events...");
            this.f3279b.mo13062A().mo12495a((C1306k.C1307a) this);
        }
    }
}
