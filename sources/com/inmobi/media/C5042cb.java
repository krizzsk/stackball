package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.CBLocation;
import com.facebook.appevents.AppEventsConstants;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5056cd;
import com.inmobi.media.C5063cg;
import com.inmobi.media.C5239ey;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cb */
/* compiled from: JavaScriptBridge */
public class C5042cb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11519a = C5042cb.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5415m f11520b;

    /* renamed from: c */
    private int f11521c;

    /* renamed from: d */
    private C5072ci f11522d;

    @JavascriptInterface
    public void cancelSaveContent(String str, String str2) {
    }

    @JavascriptInterface
    public void fireSkip(String str) {
    }

    @JavascriptInterface
    public void log(String str, String str2) {
    }

    @JavascriptInterface
    public void onOrientationChange(String str) {
    }

    @JavascriptInterface
    public void showAlert(String str, String str2) {
    }

    @JavascriptInterface
    public void storePicture(String str, String str2) {
    }

    public C5042cb(C5415m mVar, int i) {
        this.f11520b = mVar;
        this.f11521c = i;
    }

    @JavascriptInterface
    public void open(final String str, final String str2) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            if (!mVar.mo40888j()) {
                this.f11520b.mo40859d("open");
            } else {
                new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            C5042cb.this.f11520b.mo40858c("open", str, str2);
                        } catch (Exception unused) {
                            C5042cb.this.f11520b.mo40855b(str, "Unexpected error", "open");
                            C5327gw.m12263a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
                            String unused2 = C5042cb.f11519a;
                        }
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void openEmbedded(final String str, final String str2) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            if (!mVar.mo40888j()) {
                this.f11520b.mo40859d("openEmbedded");
            } else {
                new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            C5042cb.this.f11520b.mo40858c("openEmbedded", str, str2);
                        } catch (Exception unused) {
                            C5042cb.this.f11520b.mo40855b(str, "Unexpected error", "openEmbedded");
                            C5327gw.m12263a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
                            String unused2 = C5042cb.f11519a;
                        }
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void ping(String str, String str2, boolean z) {
        if (this.f11520b != null) {
            if (str2 == null || str2.trim().length() == 0 || !URLUtil.isValidUrl(str2)) {
                this.f11520b.mo40855b(str, "Invalid URL:".concat(String.valueOf(str2)), "ping");
                return;
            }
            try {
                C4983ax.m11340a().mo40134a(str2, z);
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "ping");
                C5327gw.m12263a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            }
        }
    }

    @JavascriptInterface
    public void pingInWebView(String str, String str2, boolean z) {
        if (this.f11520b != null) {
            if (str2 == null || str2.trim().length() == 0 || !URLUtil.isValidUrl(str2)) {
                this.f11520b.mo40855b(str, "Invalid URL:".concat(String.valueOf(str2)), "pingInWebView");
                return;
            }
            try {
                C4983ax.m11340a().mo40136b(str2, z);
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "pingInWebView");
                C5327gw.m12263a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            }
        }
    }

    @JavascriptInterface
    public String getPlatformVersion(String str) {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    @JavascriptInterface
    public String getPlatform(String str) {
        C5315gp.m12229d();
        return C5315gp.m12229d();
    }

    @JavascriptInterface
    public void fireAdReady(String str) {
        try {
            this.f11520b.getListener().mo40809a();
        } catch (Exception unused) {
            this.f11520b.mo40855b(str, "Unexpected error", "fireAdReady");
        }
    }

    @JavascriptInterface
    public void fireAdFailed(String str) {
        try {
            this.f11520b.getListener().mo40813b();
        } catch (Exception unused) {
            this.f11520b.mo40855b(str, "Unexpected error", "fireAdFailed");
        }
    }

    @JavascriptInterface
    public String getDefaultPosition(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return new JSONObject().toString();
        }
        synchronized (mVar.getDefaultPositionMonitor()) {
            this.f11520b.f12465j = true;
            new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5042cb.this.f11520b.mo40862g();
                    } catch (Exception unused) {
                        String unused2 = C5042cb.f11519a;
                    }
                }
            });
            while (this.f11520b.f12465j) {
                try {
                    this.f11520b.getDefaultPositionMonitor().wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f11520b.getDefaultPosition();
    }

    @JavascriptInterface
    public String getCurrentPosition(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return "";
        }
        synchronized (mVar.getCurrentPositionMonitor()) {
            this.f11520b.f12466k = true;
            new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5042cb.this.f11520b.mo40886h();
                    } catch (Exception unused) {
                        String unused2 = C5042cb.f11519a;
                    }
                }
            });
            while (this.f11520b.f12466k) {
                try {
                    this.f11520b.getCurrentPositionMonitor().wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f11520b.getCurrentPosition();
    }

    @JavascriptInterface
    public void setExpandProperties(String str, String str2) {
        C5415m mVar = this.f11520b;
        if (mVar != null && !"Expanded".equals(mVar.getState())) {
            try {
                this.f11520b.setExpandProperties(C5055cc.m11476a(str2));
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "setExpandProperties");
            }
        }
    }

    @JavascriptInterface
    public String getExpandProperties(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return "";
        }
        return mVar.getExpandProperties().f11557c;
    }

    @JavascriptInterface
    public void expand(final String str, final String str2) {
        C5415m mVar;
        if (this.f11521c != 1 && (mVar = this.f11520b) != null) {
            if (!mVar.mo40888j()) {
                this.f11520b.mo40859d(MraidJsMethods.EXPAND);
            } else if (!this.f11520b.f12469n) {
                this.f11520b.mo40855b(str, "Creative is not visible. Ignoring request.", MraidJsMethods.EXPAND);
            } else if (str2 == null || str2.length() == 0 || str2.startsWith("http")) {
                new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        int i;
                        try {
                            C5415m a = C5042cb.this.f11520b;
                            String str = str2;
                            if (CBLocation.LOCATION_DEFAULT.equals(a.f12459d) || "Resized".equals(a.f12459d)) {
                                a.f12474s = true;
                                C5060ce ceVar = a.f12461f;
                                if (ceVar.f11577c == null) {
                                    ceVar.f11577c = (ViewGroup) ceVar.f11575a.getParent();
                                    ceVar.f11578d = ceVar.f11577c.indexOfChild(ceVar.f11575a);
                                }
                                C5055cc expandProperties = ceVar.f11575a.getExpandProperties();
                                ceVar.f11576b = URLUtil.isValidUrl(str);
                                C5415m mVar = ceVar.f11575a;
                                if (ceVar.f11576b) {
                                    try {
                                        C5415m mVar2 = new C5415m(ceVar.f11575a.getContainerContext(), (byte) 0, (Set<C5096cx>) null, ceVar.f11575a.getImpressionId());
                                        mVar2.mo40849a(ceVar.f11575a.getListener(), ceVar.f11575a.getAdConfig(), false, false);
                                        mVar2.setBundleId(ceVar.f11575a.getBundleId());
                                        mVar2.setOriginalRenderView(ceVar.f11575a);
                                        mVar2.loadUrl(str);
                                        mVar2.setPlacementId(ceVar.f11575a.getPlacementId());
                                        mVar2.setAllowAutoRedirection(ceVar.f11575a.getAllowAutoRedirection());
                                        mVar2.setCreativeId(ceVar.f11575a.getCreativeId());
                                        i = InMobiAdActivity.m11053a((C5331h) mVar2);
                                        if (expandProperties != null) {
                                            mVar2.setUseCustomClose(ceVar.f11575a.f12467l);
                                        }
                                    } catch (Exception e) {
                                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                                        ceVar.f11575a.getListener().mo40821e(ceVar.f11575a);
                                    }
                                } else {
                                    mVar.setShouldFireRenderBeacon(false);
                                    ViewGroup viewGroup = ceVar.f11577c;
                                    FrameLayout frameLayout = new FrameLayout(ceVar.f11575a.getContainerContext());
                                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ceVar.f11575a.getWidth(), ceVar.f11575a.getHeight());
                                    frameLayout.setId(65535);
                                    viewGroup.addView(frameLayout, ceVar.f11578d, layoutParams);
                                    viewGroup.removeView(ceVar.f11575a);
                                    i = InMobiAdActivity.m11053a((C5331h) ceVar.f11575a);
                                }
                                ceVar.f11575a.getListener().mo40820e();
                                Intent intent = new Intent(ceVar.f11575a.getContainerContext(), InMobiAdActivity.class);
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", i);
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 200);
                                C5314go.m12192a(ceVar.f11575a.getContainerContext(), intent);
                                a.requestLayout();
                                a.invalidate();
                                a.f12468m = true;
                                a.setFocusable(true);
                                a.setFocusableInTouchMode(true);
                                a.requestFocus();
                            }
                        } catch (Exception unused) {
                            C5042cb.this.f11520b.mo40855b(str, "Unexpected error", MraidJsMethods.EXPAND);
                            C5327gw.m12263a((byte) 1, "InMobi", "Failed to expand ad; SDK encountered an unexpected error");
                            String unused2 = C5042cb.f11519a;
                        }
                    }
                });
            } else {
                this.f11520b.mo40855b(str, "Invalid URL", MraidJsMethods.EXPAND);
            }
        }
    }

    @JavascriptInterface
    public String getVersion(String str) {
        C5315gp.m12228c();
        return C5315gp.m12228c();
    }

    @JavascriptInterface
    public void setResizeProperties(String str, String str2) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            C5073cj a = C5073cj.m11513a(str2, mVar.getResizeProperties());
            if (a == null) {
                this.f11520b.mo40855b(str, "setResizeProperties", "All mandatory fields are not present");
            }
            this.f11520b.setResizeProperties(a);
        }
    }

    @JavascriptInterface
    public String getResizeProperties(String str) {
        C5073cj resizeProperties;
        JSONObject a;
        C5415m mVar = this.f11520b;
        if (mVar == null || (resizeProperties = mVar.getResizeProperties()) == null || (a = new C5352hm().mo40711a(resizeProperties)) == null) {
            return "";
        }
        return a.toString();
    }

    @JavascriptInterface
    public void resize(final String str) {
        if (this.f11521c != 1 && this.f11520b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5415m a = C5042cb.this.f11520b;
                        if (!CBLocation.LOCATION_DEFAULT.equals(a.f12459d)) {
                            if (!"Resized".equals(a.f12459d)) {
                                return;
                            }
                        }
                        if (a.getResizeProperties() != null) {
                            a.f12474s = true;
                            a.f12462g.mo40327a();
                            a.requestLayout();
                            a.invalidate();
                            a.f12468m = true;
                            a.setFocusable(true);
                            a.setFocusableInTouchMode(true);
                            a.requestFocus();
                            a.setAndUpdateViewState("Resized");
                            a.getListener().mo40817c(a);
                            a.f12474s = false;
                        }
                    } catch (Exception unused) {
                        C5042cb.this.f11520b.mo40855b(str, "Unexpected error", MraidJsMethods.RESIZE);
                        C5327gw.m12263a((byte) 1, C5042cb.f11519a, "Could not resize ad; SDK encountered an unexpected error");
                        String unused2 = C5042cb.f11519a;
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void setOrientationProperties(String str, String str2) {
        C5072ci a = C5072ci.m11512a(str2, this.f11520b.getOrientationProperties());
        this.f11522d = a;
        this.f11520b.setOrientationProperties(a);
    }

    @JavascriptInterface
    public String getOrientationProperties(String str) {
        return this.f11522d.f11611d;
    }

    @JavascriptInterface
    public boolean isViewable(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return false;
        }
        return mVar.f12469n;
    }

    @JavascriptInterface
    public void useCustomClose(final String str, final boolean z) {
        new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    C5042cb.this.f11520b.mo40856b(z);
                } catch (Exception unused) {
                    C5042cb.this.f11520b.mo40855b(str, "Unexpected error", "useCustomClose");
                    String unused2 = C5042cb.f11519a;
                }
            }
        });
    }

    @JavascriptInterface
    public void playVideo(final String str, final String str2) {
        if (this.f11520b != null) {
            if (str2 == null || str2.trim().length() == 0 || !str2.startsWith("http") || (!str2.endsWith("mp4") && !str2.endsWith("avi") && !str2.endsWith("m4v"))) {
                this.f11520b.mo40855b(str, "Null or empty or invalid media playback URL supplied", MraidJsMethods.PLAY_VIDEO);
            } else {
                new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
                    public final void run() {
                        try {
                            C5415m a = C5042cb.this.f11520b;
                            String str = str;
                            String trim = str2.trim();
                            if (1 == a.f12460e || "Expanded".equals(a.getViewState())) {
                                if (a.f12457b != null) {
                                    if (a.f12457b.get() != null) {
                                        a.setAdActiveFlag(true);
                                        C5063cg cgVar = a.f12463h;
                                        Activity activity = (Activity) a.f12457b.get();
                                        cgVar.f11588b = new C5056cd(activity);
                                        C5056cd cdVar = cgVar.f11588b;
                                        cdVar.f11567h = C5056cd.m11479a(trim);
                                        cdVar.f11566g = "anonymous";
                                        if (cdVar.f11561b == null) {
                                            cdVar.f11561b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
                                            cdVar.f11561b = C5056cd.m11480b(cdVar.f11567h);
                                        }
                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                        layoutParams.addRule(13);
                                        cgVar.f11588b.setLayoutParams(layoutParams);
                                        RelativeLayout relativeLayout = new RelativeLayout(activity);
                                        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
                                            public final boolean onTouch(
/*
Method generation error in method: com.inmobi.media.cg.1.onTouch(android.view.View, android.view.MotionEvent):boolean, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.cg.1.onTouch(android.view.View, android.view.MotionEvent):boolean, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/
                                        });
                                        relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                        relativeLayout.addView(cgVar.f11588b);
                                        ((ViewGroup) activity.findViewById(16908290)).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                                        cgVar.f11588b.f11562c = relativeLayout;
                                        cgVar.f11588b.requestFocus();
                                        cgVar.f11588b.setOnKeyListener(new View.OnKeyListener() {
                                            public final boolean onKey(
/*
Method generation error in method: com.inmobi.media.cg.2.onKey(android.view.View, int, android.view.KeyEvent):boolean, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.cg.2.onKey(android.view.View, int, android.view.KeyEvent):boolean, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/
                                        });
                                        cgVar.f11588b.f11563d = new C5056cd.C5059b() {
                                            /* renamed from: a */
                                            public final void mo40317a(
/*
Method generation error in method: com.inmobi.media.cg.3.a(com.inmobi.media.cd):void, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.cg.3.a(com.inmobi.media.cd):void, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/

                                            /* renamed from: a */
                                            public final void mo40316a(
/*
Method generation error in method: com.inmobi.media.cg.3.a():void, dex: classes3.dex
                                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.cg.3.a():void, class status: UNLOADED
                                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                            
*/
                                        };
                                        C5056cd cdVar2 = cgVar.f11588b;
                                        cdVar2.setVideoPath(cdVar2.f11567h);
                                        cdVar2.setOnCompletionListener(cdVar2);
                                        cdVar2.setOnPreparedListener(cdVar2);
                                        cdVar2.setOnErrorListener(cdVar2);
                                        if (cdVar2.f11560a == null && Build.VERSION.SDK_INT >= 19) {
                                            cdVar2.f11560a = new C5056cd.C5058a(cdVar2.getContext());
                                            cdVar2.f11560a.setAnchorView(cdVar2);
                                            cdVar2.setMediaController(cdVar2.f11560a);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                a.mo40855b(str, "Media playback is  not allowed before it is visible! Ignoring request ...", MraidJsMethods.PLAY_VIDEO);
                            }
                        } catch (Exception unused) {
                            C5042cb.this.f11520b.mo40855b(str, "Unexpected error", MraidJsMethods.PLAY_VIDEO);
                            C5327gw.m12263a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
                            String unused2 = C5042cb.f11519a;
                        }
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public String getState(String str) {
        return this.f11520b.getState().toLowerCase(Locale.ENGLISH);
    }

    @JavascriptInterface
    public String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", C5343hf.m12333a().f12240a);
            jSONObject.put("height", C5343hf.m12333a().f12241b);
        } catch (JSONException unused) {
        } catch (Exception unused2) {
            this.f11520b.mo40855b(str, "Unexpected error", "getScreenSize");
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMaxSize(java.lang.String r7) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.inmobi.media.m r1 = r6.f11520b     // Catch:{ Exception -> 0x007e }
            android.app.Activity r1 = r1.getFullScreenActivity()     // Catch:{ Exception -> 0x007e }
            if (r1 != 0) goto L_0x0024
            com.inmobi.media.m r1 = r6.f11520b     // Catch:{ Exception -> 0x007e }
            android.content.Context r1 = r1.getContainerContext()     // Catch:{ Exception -> 0x007e }
            boolean r1 = r1 instanceof android.app.Activity     // Catch:{ Exception -> 0x007e }
            if (r1 != 0) goto L_0x001c
            java.lang.String r7 = r6.getScreenSize(r7)     // Catch:{ Exception -> 0x007e }
            return r7
        L_0x001c:
            com.inmobi.media.m r1 = r6.f11520b     // Catch:{ Exception -> 0x007e }
            android.content.Context r1 = r1.getContainerContext()     // Catch:{ Exception -> 0x007e }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ Exception -> 0x007e }
        L_0x0024:
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x007e }
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch:{ Exception -> 0x007e }
            int r2 = r1.getWidth()     // Catch:{ Exception -> 0x007e }
            int r2 = com.inmobi.media.C5343hf.m12337b(r2)     // Catch:{ Exception -> 0x007e }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x007e }
            int r3 = com.inmobi.media.C5343hf.m12337b(r3)     // Catch:{ Exception -> 0x007e }
            com.inmobi.media.m r4 = r6.f11520b     // Catch:{ Exception -> 0x007e }
            android.app.Activity r4 = r4.getFullScreenActivity()     // Catch:{ Exception -> 0x007e }
            if (r4 == 0) goto L_0x0073
            if (r2 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0073
        L_0x0049:
            com.inmobi.media.cb$a r2 = new com.inmobi.media.cb$a     // Catch:{ Exception -> 0x007e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x007e }
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()     // Catch:{ Exception -> 0x007e }
            r1.addOnGlobalLayoutListener(r2)     // Catch:{ Exception -> 0x007e }
            java.lang.Boolean r1 = r2.f11553d     // Catch:{ Exception -> 0x007e }
            monitor-enter(r1)     // Catch:{ Exception -> 0x007e }
            java.lang.Boolean r3 = r2.f11553d     // Catch:{ InterruptedException -> 0x0064 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0064 }
            goto L_0x0064
        L_0x0062:
            r2 = move-exception
            goto L_0x0071
        L_0x0064:
            int r3 = r2.f11550a     // Catch:{ all -> 0x0062 }
            int r2 = r2.f11551b     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            r5 = r3
            r3 = r2
            r2 = r5
            goto L_0x0073
        L_0x0071:
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r2     // Catch:{ Exception -> 0x007e }
        L_0x0073:
            java.lang.String r1 = "width"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r1 = "height"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0087 }
            goto L_0x0087
        L_0x007e:
            com.inmobi.media.m r1 = r6.f11520b
            java.lang.String r2 = "Unexpected error"
            java.lang.String r3 = "getMaxSize"
            r1.mo40855b(r7, r2, r3)
        L_0x0087:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5042cb.getMaxSize(java.lang.String):java.lang.String");
    }

    /* renamed from: com.inmobi.media.cb$a */
    /* compiled from: JavaScriptBridge */
    static class C5054a implements ViewTreeObserver.OnGlobalLayoutListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f11550a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f11551b;

        /* renamed from: c */
        private View f11552c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Boolean f11553d = Boolean.FALSE;

        C5054a(View view) {
            this.f11552c = view;
        }

        public final void onGlobalLayout() {
            try {
                this.f11550a = C5343hf.m12337b(this.f11552c.getWidth());
                this.f11551b = C5343hf.m12337b(this.f11552c.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    this.f11552c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.f11552c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                synchronized (this.f11553d) {
                    this.f11553d.notify();
                }
            } catch (Exception unused) {
                String unused2 = C5042cb.f11519a;
            }
        }
    }

    @JavascriptInterface
    public void close(final String str) {
        new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    C5042cb.this.f11520b.getReferenceContainer().mo40686b();
                } catch (Exception unused) {
                    C5042cb.this.f11520b.mo40855b(str, "Unexpected error", "close");
                    C5327gw.m12263a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
                    String unused2 = C5042cb.f11519a;
                }
            }
        });
    }

    @JavascriptInterface
    public String getPlacementType(String str) {
        return 1 == this.f11521c ? "interstitial" : TJAdUnitConstants.String.INLINE;
    }

    @JavascriptInterface
    public String getSdkVersion(String str) {
        C5315gp.m12226b();
        return C5315gp.m12226b();
    }

    @JavascriptInterface
    public String supports(String str, String str2) {
        return String.valueOf(this.f11520b.mo40861f(str2));
    }

    @JavascriptInterface
    public void openExternal(String str, String str2, String str3) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            if (!mVar.mo40888j()) {
                this.f11520b.mo40859d("openExternal");
                return;
            }
            C5415m mVar2 = this.f11520b;
            if (str2 != null) {
                mVar2.mo40851a("openExternal", str, str2, str3);
            } else if (str3 != null) {
                mVar2.mo40851a("openExternal", str, str3, (String) null);
            } else {
                mVar2.mo40855b(str, "Empty url and fallback url", "openExternal");
            }
        }
    }

    @JavascriptInterface
    public void asyncPing(String str, String str2) {
        if (!URLUtil.isValidUrl(str2)) {
            this.f11520b.mo40855b(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            final C5299gc gcVar = new C5299gc("GET", str2);
            gcVar.f12142u = false;
            gcVar.f12136o = false;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C5300gd a = new C5297ga(C5291fy.this.f12107b).mo40612a();
                        if (a.mo40624a()) {
                            C5291fy.this.f12108c.mo40284a();
                        } else {
                            C5291fy.this.f12108c.mo40285a(a);
                        }
                    } catch (Exception unused) {
                        String unused2 = C5291fy.f12106a;
                        new C5300gd().f12145a = new C5298gb(-1, "Network request failed with unknown error");
                        C5291fy.this.f12108c.mo40284a();
                    }
                }
            }).start();
        } catch (Exception unused) {
            this.f11520b.mo40855b(str, "Unexpected error", "asyncPing");
        }
    }

    @JavascriptInterface
    public void disableCloseRegion(final String str, final boolean z) {
        if (this.f11520b != null) {
            new Handler(this.f11520b.getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        C5042cb.this.f11520b.mo40853a(z);
                    } catch (Exception unused) {
                        C5042cb.this.f11520b.mo40855b(str, "Unexpected error", "disableCloseRegion");
                        String unused2 = C5042cb.f11519a;
                    }
                }
            });
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.f11520b.mo40855b(r7, "Unexpected error", "onUserInteraction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.f11520b.getListener().mo40815b((java.util.HashMap<java.lang.Object, java.lang.Object>) new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r6.f11520b.mo40855b(r7, "Unexpected error", "onUserInteraction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserInteraction(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.inmobi.media.m r0 = r6.f11520b
            java.lang.String r1 = "onUserInteraction"
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo40888j()
            if (r0 != 0) goto L_0x0012
            com.inmobi.media.m r7 = r6.f11520b
            r7.mo40859d((java.lang.String) r1)
            return
        L_0x0012:
            java.lang.String r0 = "Unexpected error"
            if (r8 != 0) goto L_0x002b
            com.inmobi.media.m r8 = r6.f11520b     // Catch:{ Exception -> 0x0025 }
            com.inmobi.media.m$a r8 = r8.getListener()     // Catch:{ Exception -> 0x0025 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0025 }
            r2.<init>()     // Catch:{ Exception -> 0x0025 }
            r8.mo40815b((java.util.HashMap<java.lang.Object, java.lang.Object>) r2)     // Catch:{ Exception -> 0x0025 }
            return
        L_0x0025:
            com.inmobi.media.m r8 = r6.f11520b
            r8.mo40855b(r7, r0, r1)
            return
        L_0x002b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005d }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x005d }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x005d }
            r8.<init>()     // Catch:{ JSONException -> 0x005d }
            java.util.Iterator r3 = r2.keys()     // Catch:{ JSONException -> 0x005d }
        L_0x0039:
            boolean r4 = r3.hasNext()     // Catch:{ JSONException -> 0x005d }
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()     // Catch:{ JSONException -> 0x005d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x005d }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ JSONException -> 0x005d }
            r8.put(r4, r5)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0039
        L_0x004d:
            com.inmobi.media.m r2 = r6.f11520b     // Catch:{ Exception -> 0x0057 }
            com.inmobi.media.m$a r2 = r2.getListener()     // Catch:{ Exception -> 0x0057 }
            r2.mo40815b((java.util.HashMap<java.lang.Object, java.lang.Object>) r8)     // Catch:{ Exception -> 0x0057 }
            return
        L_0x0057:
            com.inmobi.media.m r8 = r6.f11520b     // Catch:{ JSONException -> 0x005d }
            r8.mo40855b(r7, r0, r1)     // Catch:{ JSONException -> 0x005d }
            return
        L_0x005d:
            com.inmobi.media.m r8 = r6.f11520b     // Catch:{ Exception -> 0x006c }
            com.inmobi.media.m$a r8 = r8.getListener()     // Catch:{ Exception -> 0x006c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x006c }
            r2.<init>()     // Catch:{ Exception -> 0x006c }
            r8.mo40815b((java.util.HashMap<java.lang.Object, java.lang.Object>) r2)     // Catch:{ Exception -> 0x006c }
            return
        L_0x006c:
            com.inmobi.media.m r8 = r6.f11520b
            r8.mo40855b(r7, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5042cb.onUserInteraction(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.f11520b.mo40855b(r7, "Unexpected error", "incentCompleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.f11520b.getListener().mo40812a((java.util.HashMap<java.lang.Object, java.lang.Object>) new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f11520b.mo40855b(r7, "Unexpected error", "incentCompleted");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void incentCompleted(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "incentCompleted"
            java.lang.String r1 = "Unexpected error"
            if (r8 != 0) goto L_0x001b
            com.inmobi.media.m r8 = r6.f11520b     // Catch:{ Exception -> 0x0015 }
            com.inmobi.media.m$a r8 = r8.getListener()     // Catch:{ Exception -> 0x0015 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0015 }
            r2.<init>()     // Catch:{ Exception -> 0x0015 }
            r8.mo40812a((java.util.HashMap<java.lang.Object, java.lang.Object>) r2)     // Catch:{ Exception -> 0x0015 }
            return
        L_0x0015:
            com.inmobi.media.m r8 = r6.f11520b
            r8.mo40855b(r7, r1, r0)
            return
        L_0x001b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004d }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x004d }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x004d }
            r8.<init>()     // Catch:{ JSONException -> 0x004d }
            java.util.Iterator r3 = r2.keys()     // Catch:{ JSONException -> 0x004d }
        L_0x0029:
            boolean r4 = r3.hasNext()     // Catch:{ JSONException -> 0x004d }
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r3.next()     // Catch:{ JSONException -> 0x004d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x004d }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ JSONException -> 0x004d }
            r8.put(r4, r5)     // Catch:{ JSONException -> 0x004d }
            goto L_0x0029
        L_0x003d:
            com.inmobi.media.m r2 = r6.f11520b     // Catch:{ Exception -> 0x0047 }
            com.inmobi.media.m$a r2 = r2.getListener()     // Catch:{ Exception -> 0x0047 }
            r2.mo40812a((java.util.HashMap<java.lang.Object, java.lang.Object>) r8)     // Catch:{ Exception -> 0x0047 }
            return
        L_0x0047:
            com.inmobi.media.m r8 = r6.f11520b     // Catch:{ JSONException -> 0x004d }
            r8.mo40855b(r7, r1, r0)     // Catch:{ JSONException -> 0x004d }
            return
        L_0x004d:
            com.inmobi.media.m r8 = r6.f11520b     // Catch:{ Exception -> 0x005c }
            com.inmobi.media.m$a r8 = r8.getListener()     // Catch:{ Exception -> 0x005c }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x005c }
            r2.<init>()     // Catch:{ Exception -> 0x005c }
            r8.mo40812a((java.util.HashMap<java.lang.Object, java.lang.Object>) r2)     // Catch:{ Exception -> 0x005c }
            return
        L_0x005c:
            com.inmobi.media.m r8 = r6.f11520b
            r8.mo40855b(r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5042cb.incentCompleted(java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public String getOrientation(String str) {
        byte b = C5343hf.m12336b();
        if (b == 1) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (b == 3) {
            return "90";
        }
        if (b == 2) {
            return "180";
        }
        return b == 4 ? "270" : "-1";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveContent(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "saveContent"
            java.lang.String r1 = ""
            java.lang.String r2 = "\");"
            java.lang.String r3 = "\", 'failed', \""
            java.lang.String r4 = "reason"
            java.lang.String r5 = "sendSaveContentResult(\"saveContent_"
            java.lang.String r6 = "\\\""
            java.lang.String r7 = "\""
            java.lang.String r8 = "url"
            if (r12 == 0) goto L_0x008e
            int r9 = r12.length()
            if (r9 == 0) goto L_0x008e
            if (r13 == 0) goto L_0x008e
            int r9 = r13.length()
            if (r9 != 0) goto L_0x0023
            goto L_0x008e
        L_0x0023:
            com.inmobi.media.m r1 = r10.f11520b     // Catch:{ Exception -> 0x0086 }
            boolean r9 = r1.mo40861f((java.lang.String) r0)     // Catch:{ Exception -> 0x0086 }
            if (r9 != 0) goto L_0x0058
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0086 }
            r9.<init>()     // Catch:{ Exception -> 0x0086 }
            r9.put(r8, r13)     // Catch:{ JSONException -> 0x0037 }
            r13 = 5
            r9.put(r4, r13)     // Catch:{ JSONException -> 0x0037 }
        L_0x0037:
            java.lang.String r13 = r9.toString()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r13 = r13.replace(r7, r6)     // Catch:{ Exception -> 0x0086 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0086 }
            r4.append(r12)     // Catch:{ Exception -> 0x0086 }
            r4.append(r3)     // Catch:{ Exception -> 0x0086 }
            r4.append(r13)     // Catch:{ Exception -> 0x0086 }
            r4.append(r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x0086 }
            r1.mo40850a((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x0058:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x0086 }
            r2.<init>()     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.ba r3 = new com.inmobi.media.ba     // Catch:{ Exception -> 0x0086 }
            r4 = -1
            r3.<init>(r4, r13)     // Catch:{ Exception -> 0x0086 }
            r2.add(r3)     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.aj r13 = new com.inmobi.media.aj     // Catch:{ Exception -> 0x0086 }
            java.util.UUID r3 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.au r1 = r1.f12480y     // Catch:{ Exception -> 0x0086 }
            r13.<init>((java.lang.String) r3, (java.util.Set<com.inmobi.media.C5005ba>) r2, (com.inmobi.media.C4980au) r1, (java.lang.String) r12)     // Catch:{ Exception -> 0x0086 }
            r13.f11214f = r11     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.at r12 = com.inmobi.media.C4970at.m11277a()     // Catch:{ Exception -> 0x0086 }
            java.util.concurrent.ExecutorService r1 = r12.f11261a     // Catch:{ Exception -> 0x0086 }
            com.inmobi.media.at$3 r2 = new com.inmobi.media.at$3     // Catch:{ Exception -> 0x0086 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x0086 }
            r1.execute(r2)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x0086:
            com.inmobi.media.m r12 = r10.f11520b
            java.lang.String r13 = "Unexpected error"
            r12.mo40855b(r11, r13, r0)
            return
        L_0x008e:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r13 != 0) goto L_0x0096
            r13 = r1
        L_0x0096:
            r0.put(r8, r13)     // Catch:{ JSONException -> 0x009e }
            r13 = 1
            r0.put(r4, r13)     // Catch:{ JSONException -> 0x009e }
            goto L_0x009f
        L_0x009e:
        L_0x009f:
            java.lang.String r13 = r0.toString()
            java.lang.String r13 = r13.replace(r7, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            if (r12 != 0) goto L_0x00af
            r12 = r1
        L_0x00af:
            r0.append(r12)
            r0.append(r3)
            r0.append(r13)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            com.inmobi.media.m r13 = r10.f11520b
            r13.mo40850a((java.lang.String) r11, (java.lang.String) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5042cb.saveContent(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @JavascriptInterface
    public String isDeviceMuted(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return "false";
        }
        boolean z = false;
        try {
            mVar.getMediaProcessor();
            z = C5063cg.m11494a();
        } catch (Exception unused) {
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public String isHeadphonePlugged(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return "false";
        }
        boolean z = false;
        try {
            mVar.getMediaProcessor();
            z = C5063cg.m11497d();
        } catch (Exception unused) {
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public void registerDeviceMuteEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                C5063cg mediaProcessor = mVar.getMediaProcessor();
                Context c = C5314go.m12203c();
                if (c != null && mediaProcessor.f11589c == null) {
                    mediaProcessor.f11589c = new C5063cg.C5068b(str);
                    c.registerReceiver(mediaProcessor.f11589c, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                }
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "registerDeviceMuteEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterDeviceMuteEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                mVar.getMediaProcessor().mo40319b();
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            }
        }
    }

    @JavascriptInterface
    public void registerDeviceVolumeChangeEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                C5063cg mediaProcessor = mVar.getMediaProcessor();
                Context c = C5314go.m12203c();
                if (c != null && mediaProcessor.f11590d == null) {
                    mediaProcessor.f11590d = new C5063cg.C5069c(str, c, new Handler());
                    c.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, mediaProcessor.f11590d);
                }
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterDeviceVolumeChangeEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                mVar.getMediaProcessor().mo40320c();
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            }
        }
    }

    @JavascriptInterface
    public int getDeviceVolume(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return -1;
        }
        try {
            C5063cg mediaProcessor = mVar.getMediaProcessor();
            Context c = C5314go.m12203c();
            if (c == null) {
                return -1;
            }
            if (mediaProcessor.f11587a.getRenderingConfig().enablePubMuteControl && C5314go.m12210e()) {
                return 0;
            }
            AudioManager audioManager = (AudioManager) c.getSystemService("audio");
            if (audioManager == null) {
                return -1;
            }
            return audioManager.getStreamVolume(3);
        } catch (Exception unused) {
            this.f11520b.mo40855b(str, "Unexpected error", "getDeviceVolume");
            return -1;
        }
    }

    @JavascriptInterface
    public void registerHeadphonePluggedEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                C5063cg mediaProcessor = mVar.getMediaProcessor();
                Context c = C5314go.m12203c();
                if (c != null && mediaProcessor.f11591e == null) {
                    mediaProcessor.f11591e = new C5063cg.C5067a(str);
                    c.registerReceiver(mediaProcessor.f11591e, new IntentFilter("android.intent.action.HEADSET_PLUG"));
                }
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "registerHeadphonePluggedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterHeadphonePluggedEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                mVar.getMediaProcessor().mo40321e();
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void disableBackButton(String str, boolean z) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            mVar.setDisableBackButton(z);
        }
    }

    @JavascriptInterface
    public boolean isBackButtonDisabled(String str) {
        C5415m mVar = this.f11520b;
        if (mVar == null) {
            return false;
        }
        return mVar.f12471p;
    }

    @JavascriptInterface
    public void registerBackButtonPressedEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                mVar.f12472q = str;
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "registerBackButtonPressedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void unregisterBackButtonPressedEventListener(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                mVar.f12472q = null;
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            }
        }
    }

    @JavascriptInterface
    public void setCloseEndCardTracker(String str, String str2) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            try {
                mVar.setCloseEndCardTracker(str2);
            } catch (Exception unused) {
                this.f11520b.mo40855b(str, "Unexpected error", "getDownloadStatus");
            }
        }
    }

    @JavascriptInterface
    public void fireComplete(String str) {
        if (this.f11520b == null) {
        }
    }

    @JavascriptInterface
    public void showEndCard(String str) {
        C5415m mVar = this.f11520b;
        if (mVar != null) {
            C5331h referenceContainer = mVar.getReferenceContainer();
            if (referenceContainer instanceof C5397j) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C5397j.this.f12388q = true;
                        C5397j.this.mo40779c((C5010bf) null);
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void saveBlob(String str, String str2) {
        C5415m mVar = this.f11520b;
        if (mVar != null && mVar.f12477v != null) {
            mVar.f12477v.mo40981a(str2, mVar.f12476u);
        }
    }

    @JavascriptInterface
    public void getBlob(String str, String str2) {
        C5415m mVar = this.f11520b;
        if (mVar != null && mVar.f12477v != null) {
            mVar.f12477v.mo40982a(str, str2, mVar, mVar.f12476u);
        }
    }

    @JavascriptInterface
    public long getInstallTime(String str, String str2) {
        Context containerContext = this.f11520b.getContainerContext();
        C5236ew ewVar = (C5236ew) C5239ey.m11987a("appOwnership", C5314go.m12211f(), (C5239ey.C5242c) null);
        if (this.f11520b == null || !ewVar.isEnabled) {
            return -2;
        }
        if (str2 == null && this.f11520b.getBundleId() == null) {
            return -2;
        }
        if (str2 == null) {
            str2 = this.f11520b.getBundleId();
        }
        return C5318gr.m12235a(containerContext, str2);
    }
}
