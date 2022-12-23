package com.chartboost.sdk.InPlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.chartboost.sdk.C1882c;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Libraries.C1827f;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1836a;
import com.chartboost.sdk.Model.C1837b;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Networking.C1857i;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1913g;
import com.chartboost.sdk.impl.C1926i;
import com.chartboost.sdk.impl.C1965p0;
import com.chartboost.sdk.impl.C1995w0;
import com.chartboost.sdk.impl.C2014x;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.io.File;
import java.util.concurrent.Executor;

public final class CBInPlay {

    /* renamed from: a */
    private final C1913g f4368a;
    public final String appName;

    /* renamed from: b */
    private final C1855g f4369b;

    /* renamed from: c */
    private final C1842g f4370c;

    /* renamed from: d */
    private final C1857i f4371d;

    /* renamed from: e */
    private final C1836a f4372e;

    /* renamed from: f */
    private Bitmap f4373f;

    /* renamed from: g */
    private Context f4374g;
    public final File largeAppIconFile;
    public final String largeAppIconUrl;
    public final String location;

    private CBInPlay(Context context, C1913g gVar, C1855g gVar2, C1842g gVar3, C1857i iVar, C1836a aVar, String str, File file, String str2, C1995w0 w0Var) {
        this.f4374g = context;
        this.f4368a = gVar;
        this.f4369b = gVar2;
        this.f4370c = gVar3;
        this.f4371d = iVar;
        this.f4372e = aVar;
        this.appName = aVar.f4438r;
        this.largeAppIconUrl = str;
        this.largeAppIconFile = file;
        this.location = str2;
    }

    public static void cacheInPlay(String str) {
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c()) {
            if (C2014x.m4911b().mo14884a((CharSequence) str)) {
                CBLogging.m3993b("CBInPlay", "cacheInPlay location cannot be empty");
                Handler handler = b.f5206B;
                C1894a aVar = b.f5230t;
                aVar.getClass();
                handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INVALID_LOCATION, (ChartboostError) null, false, ""));
                return;
            }
            C1844h hVar = b.f5205A.get();
            if ((!hVar.f4536q || !hVar.f4537r) && (!hVar.f4524e || !hVar.f4525f)) {
                Handler handler2 = b.f5206B;
                C1894a aVar2 = b.f5230t;
                aVar2.getClass();
                handler2.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, (ChartboostError) null, false, ""));
                return;
            }
            C1913g gVar = b.f5229s;
            gVar.getClass();
            b.f5227q.execute(new C1913g.C1915b(3, str, (C1920h) null, (CBError.CBImpressionError) null));
        }
    }

    public static CBInPlay getInPlay(Context context, String str) {
        String str2 = str;
        C2022j b = C2022j.m4955b();
        CBInPlay cBInPlay = null;
        if (b != null && C1882c.m4363c()) {
            if (C2014x.m4911b().mo14884a((CharSequence) str2)) {
                CBLogging.m3993b("CBInPlay", "Inplay location cannot be empty");
                Handler handler = b.f5206B;
                C1894a aVar = b.f5230t;
                aVar.getClass();
                handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INVALID_LOCATION, (ChartboostError) null, false, ""));
                return null;
            }
            C1844h hVar = b.f5205A.get();
            C1995w0 a = C2022j.m4948a(context);
            CBError.CBImpressionError cBImpressionError = CBError.CBImpressionError.NO_AD_FOUND;
            if ((hVar.f4536q && hVar.f4537r) || (hVar.f4524e && hVar.f4525f)) {
                C1836a f = b.f5229s.mo14610f(str2);
                if (f != null) {
                    C1837b bVar = f.f4423c.get("lg");
                    if (bVar != null) {
                        File a2 = bVar.mo14265a(b.f5229s.f4807c.mo14234a().f4393a);
                        if (!a2.exists()) {
                            cBImpressionError = CBError.CBImpressionError.ASSET_MISSING;
                        } else {
                            cBInPlay = new CBInPlay(context, b.f5229s, b.f5233w, b.f5234x, b.f5208D, f, bVar.f4443c, a2, str, a);
                        }
                    }
                    Executor executor = b.f5227q;
                    C1913g gVar = b.f5229s;
                    gVar.getClass();
                    executor.execute(new C1913g.C1915b(8, str, (C1920h) null, (CBError.CBImpressionError) null));
                }
                if (cBInPlay == null) {
                    Executor executor2 = b.f5227q;
                    C1913g gVar2 = b.f5229s;
                    gVar2.getClass();
                    executor2.execute(new C1913g.C1915b(3, str, (C1920h) null, (CBError.CBImpressionError) null));
                }
            }
            CBError.CBImpressionError cBImpressionError2 = cBImpressionError;
            if (cBInPlay == null) {
                Handler handler2 = b.f5206B;
                C1894a aVar2 = b.f5230t;
                aVar2.getClass();
                handler2.post(new C1894a.C1895a(4, str, cBImpressionError2, (ChartboostError) null, false, ""));
            }
        }
        return cBInPlay;
    }

    public static boolean hasInPlay(String str) {
        C2022j b = C2022j.m4955b();
        if (b == null || !C1882c.m4363c()) {
            return false;
        }
        if (C2014x.m4911b().mo14884a((CharSequence) str)) {
            CBLogging.m3993b("CBInPlay", "hasInPlay location cannot be empty");
            Handler handler = b.f5206B;
            C1894a aVar = b.f5230t;
            aVar.getClass();
            handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INVALID_LOCATION, (ChartboostError) null, true, ""));
            return false;
        } else if (b.f5229s.mo14610f(str) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void click() {
        C1836a aVar = this.f4372e;
        String str = aVar.f4431k;
        String str2 = aVar.f4430j;
        String str3 = (str2.isEmpty() || !this.f4371d.mo14343a(this.f4374g, str2)) ? str : str2;
        C1965p0 p0Var = new C1965p0("https://live.chartboost.com", "/api/click", this.f4370c, 2, (C1965p0.C1966a) null);
        p0Var.mo14750a(FirebaseAnalytics.Param.LOCATION, (Object) this.location);
        p0Var.mo14750a("to", (Object) this.f4372e.f4434n);
        p0Var.mo14750a("cgn", (Object) this.f4372e.f4427g);
        p0Var.mo14750a(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, (Object) this.f4372e.f4428h);
        p0Var.mo14750a("ad_id", (Object) this.f4372e.f4426f);
        p0Var.mo14750a("type", (Object) "native");
        if (str3 == null || str3.isEmpty()) {
            this.f4371d.mo14342a((C1838c) null, false, str3, CBError.CBClickError.URI_INVALID, p0Var);
        } else {
            this.f4371d.mo14341a(this.f4374g, (C1838c) null, str3, p0Var);
        }
    }

    public Bitmap getAppIcon() throws Exception {
        if (this.f4373f == null) {
            try {
                byte[] b = C1827f.m4035b(this.largeAppIconFile);
                if (b != null) {
                    this.f4373f = C2014x.m4911b().mo14880a(b);
                }
                if (this.f4373f == null) {
                    CBLogging.m3993b("CBInPlay", "Error decoding inplay bitmap " + this.largeAppIconFile.getAbsolutePath());
                    if (!this.largeAppIconFile.delete()) {
                        CBLogging.m3993b("CBInPlay", "Unable to delete corrupt inplay bitmap " + this.largeAppIconFile.getAbsolutePath());
                    }
                    throw new Exception("decodeByteArrayToBitmap returned null");
                }
            } catch (OutOfMemoryError e) {
                CBLogging.m3993b("CBInPlay", "Out of memory decoding inplay bitmap " + this.largeAppIconFile.getAbsolutePath());
                throw new Exception(e);
            }
        }
        return this.f4373f;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getLocation() {
        return this.location;
    }

    public void show() {
        C1965p0 p0Var = new C1965p0("https://live.chartboost.com", "/inplay/show", this.f4370c, 2, new C1926i(this.f4368a, this.location));
        p0Var.f4568i = 1;
        p0Var.mo14750a("inplay-dictionary", (Object) this.f4372e.f4421a);
        p0Var.mo14750a(FirebaseAnalytics.Param.LOCATION, (Object) this.location);
        this.f4369b.mo14335a(p0Var);
    }
}
