package com.inmobi.media;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.CBLocation;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.common.net.HttpHeaders;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5120dk;
import com.inmobi.media.C5139dx;
import com.inmobi.media.C5220ev;
import com.inmobi.media.C5331h;
import com.inmobi.media.C5388ij;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p243my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.C8937Ad;
import com.tapjoy.TJAdUnitConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.m */
/* compiled from: RenderView */
public final class C5415m extends WebView implements C5331h, C5373i, C5388ij.C5393a {

    /* renamed from: a */
    public static final C5432a f12420a = new C5432a() {
        /* renamed from: a */
        public final void mo40809a() {
        }

        /* renamed from: a */
        public final void mo40810a(C5415m mVar) {
        }

        /* renamed from: a */
        public final void mo40811a(String str, Map<String, Object> map) {
        }

        /* renamed from: a */
        public final void mo40812a(HashMap<Object, Object> hashMap) {
        }

        /* renamed from: b */
        public final void mo40813b() {
        }

        /* renamed from: b */
        public final void mo40814b(C5415m mVar) {
        }

        /* renamed from: b */
        public final void mo40815b(HashMap<Object, Object> hashMap) {
        }

        /* renamed from: c */
        public final void mo40816c() {
        }

        /* renamed from: c */
        public final void mo40817c(C5415m mVar) {
        }

        /* renamed from: d */
        public final void mo40818d() {
        }

        /* renamed from: d */
        public final void mo40819d(C5415m mVar) {
        }

        /* renamed from: e */
        public final void mo40820e() {
        }

        /* renamed from: e */
        public final void mo40821e(C5415m mVar) {
        }

        /* renamed from: f */
        public final void mo40822f() {
        }

        /* renamed from: g */
        public final void mo40823g() {
        }

        /* renamed from: h */
        public final C5394ik mo40824h() {
            return C5394ik.m12488a();
        }
    };

    /* renamed from: aj */
    private static final C5120dk.C5121a f12421aj = new C5120dk.C5121a() {
        /* renamed from: a */
        public final boolean mo40396a(View view, View view2, int i, Object obj) {
            if (view2 == null || view2.getVisibility() != 0 || view == null || view.getParent() == null || !view2.isShown()) {
                return false;
            }
            C5415m mVar = null;
            if (view2 instanceof C5415m) {
                mVar = (C5415m) view2;
            }
            if (mVar == null) {
                return false;
            }
            return mVar.m12641a(i);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final String f12422z = C5415m.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C5415m f12423A = null;

    /* renamed from: B */
    private WeakReference<ViewGroup> f12424B;

    /* renamed from: C */
    private C5432a f12425C;

    /* renamed from: D */
    private C5220ev f12426D;

    /* renamed from: E */
    private boolean f12427E;

    /* renamed from: F */
    private C5055cc f12428F;

    /* renamed from: G */
    private C5073cj f12429G;

    /* renamed from: H */
    private C5072ci f12430H;

    /* renamed from: I */
    private JSONObject f12431I;

    /* renamed from: J */
    private JSONObject f12432J;

    /* renamed from: K */
    private boolean f12433K = true;

    /* renamed from: L */
    private final Object f12434L = new Object();

    /* renamed from: M */
    private final Object f12435M = new Object();

    /* renamed from: N */
    private boolean f12436N = true;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public View f12437O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public WebChromeClient.CustomViewCallback f12438P;

    /* renamed from: Q */
    private int f12439Q = -1;

    /* renamed from: R */
    private boolean f12440R = false;

    /* renamed from: S */
    private long f12441S = Long.MIN_VALUE;

    /* renamed from: T */
    private String f12442T;

    /* renamed from: U */
    private C5331h f12443U;

    /* renamed from: V */
    private boolean f12444V = false;

    /* renamed from: W */
    private long f12445W = -1;

    /* renamed from: aa */
    private C5120dk f12446aa;

    /* renamed from: ab */
    private Set<C5096cx> f12447ab;

    /* renamed from: ac */
    private C5098cz f12448ac;

    /* renamed from: ad */
    private boolean f12449ad;

    /* renamed from: ae */
    private boolean f12450ae = true;

    /* renamed from: af */
    private int f12451af;

    /* renamed from: ag */
    private int f12452ag;

    /* renamed from: ah */
    private String f12453ah = null;

    /* renamed from: ai */
    private final C5433n f12454ai = new C5433n();

    /* renamed from: ak */
    private final C5331h.C5332a f12455ak = new C5331h.C5332a() {
        /* renamed from: a */
        public final void mo40700a() {
            String unused = C5415m.f12422z;
            C5415m.this.getListener().mo40816c();
        }

        /* renamed from: a */
        public final void mo40701a(Object obj) {
            String unused = C5415m.f12422z;
            if (C5415m.this.f12460e == 0) {
                if (C5415m.this.f12423A != null) {
                    C5415m.this.f12423A.setAndUpdateViewState("Expanded");
                } else {
                    C5415m.this.setAndUpdateViewState("Expanded");
                }
                boolean unused2 = C5415m.this.f12474s = false;
            }
            C5415m.this.getListener().mo40817c(C5415m.this);
        }

        /* renamed from: b */
        public final void mo40702b(Object obj) {
            String unused = C5415m.f12422z;
            if (C5415m.this.f12460e == 0) {
                C5415m.this.setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
                if (C5415m.this.f12423A != null) {
                    C5415m.this.f12423A.setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
                }
            } else if (CBLocation.LOCATION_DEFAULT.equals(C5415m.this.f12459d)) {
                C5415m.this.setAndUpdateViewState("Hidden");
            }
            C5415m.this.getListener().mo40819d(C5415m.this);
        }
    };

    /* renamed from: al */
    private final WebChromeClient f12456al = new WebChromeClient() {
        public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            String unused = C5415m.f12422z;
            if (!C5415m.m12643a(C5415m.this, jsResult)) {
                return true;
            }
            Activity fullScreenActivity = C5415m.this.getFullScreenActivity();
            if (fullScreenActivity != null) {
                new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setTitle(str).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setCancelable(false).create().show();
                return true;
            }
            jsResult.cancel();
            return true;
        }

        public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            String unused = C5415m.f12422z;
            if (!C5415m.m12643a(C5415m.this, jsResult)) {
                return true;
            }
            Activity fullScreenActivity = C5415m.this.getFullScreenActivity();
            if (fullScreenActivity != null) {
                new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.cancel();
                    }
                }).create().show();
                return true;
            }
            jsResult.cancel();
            return true;
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            String unused = C5415m.f12422z;
            if (!C5415m.m12643a(C5415m.this, (JsResult) jsPromptResult)) {
                return true;
            }
            if (C5415m.this.getFullScreenActivity() != null) {
                return false;
            }
            jsPromptResult.cancel();
            return true;
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (C5415m.this.f12457b != null && C5415m.this.f12457b.get() != null) {
                View unused = C5415m.this.f12437O = view;
                WebChromeClient.CustomViewCallback unused2 = C5415m.this.f12438P = customViewCallback;
                C5415m.this.f12437O.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return true;
                    }
                });
                C5415m.this.f12437O.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                ((FrameLayout) ((Activity) C5415m.this.f12457b.get()).findViewById(16908290)).addView(C5415m.this.f12437O, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
                C5415m.this.f12437O.requestFocus();
                View g = C5415m.this.f12437O;
                g.setOnKeyListener(new View.OnKeyListener() {
                    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
                            return false;
                        }
                        String unused = C5415m.f12422z;
                        C54216.this.m12708a();
                        return true;
                    }
                });
                g.setFocusable(true);
                g.setFocusableInTouchMode(true);
                g.requestFocus();
            }
        }

        public final void onHideCustomView() {
            m12708a();
            super.onHideCustomView();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m12708a() {
            if (C5415m.this.f12437O != null) {
                if (C5415m.this.f12438P != null) {
                    C5415m.this.f12438P.onCustomViewHidden();
                    WebChromeClient.CustomViewCallback unused = C5415m.this.f12438P = null;
                }
                if (C5415m.this.f12437O != null && C5415m.this.f12437O.getParent() != null) {
                    ((ViewGroup) C5415m.this.f12437O.getParent()).removeView(C5415m.this.f12437O);
                    View unused2 = C5415m.this.f12437O = null;
                }
            }
        }

        public final void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
            if (!(C5415m.this.f12457b == null || C5415m.this.f12457b.get() == null)) {
                new AlertDialog.Builder((Context) C5415m.this.f12457b.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        callback.invoke(str, true, false);
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        callback.invoke(str, false, false);
                    }
                }).create().show();
            }
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            consoleMessage.lineNumber();
            consoleMessage.sourceId();
            String unused = C5415m.f12422z;
            return true;
        }
    };

    /* renamed from: b */
    public WeakReference<Activity> f12457b;

    /* renamed from: c */
    boolean f12458c = false;

    /* renamed from: d */
    public String f12459d = CBLocation.LOCATION_DEFAULT;

    /* renamed from: e */
    public byte f12460e;

    /* renamed from: f */
    public C5060ce f12461f;

    /* renamed from: g */
    public C5070ch f12462g;

    /* renamed from: h */
    public C5063cg f12463h;

    /* renamed from: i */
    public boolean f12464i;

    /* renamed from: j */
    public boolean f12465j = true;

    /* renamed from: k */
    public boolean f12466k = true;

    /* renamed from: l */
    public boolean f12467l = false;

    /* renamed from: m */
    public boolean f12468m = false;

    /* renamed from: n */
    public boolean f12469n = false;

    /* renamed from: o */
    public boolean f12470o = false;

    /* renamed from: p */
    public boolean f12471p = false;

    /* renamed from: q */
    public String f12472q = null;

    /* renamed from: r */
    public AtomicBoolean f12473r = new AtomicBoolean(false);

    /* renamed from: s */
    public boolean f12474s;

    /* renamed from: t */
    String f12475t;

    /* renamed from: u */
    public String f12476u;

    /* renamed from: v */
    public C5467u f12477v;

    /* renamed from: w */
    public boolean f12478w;

    /* renamed from: x */
    public boolean f12479x;

    /* renamed from: y */
    public final C4980au f12480y = new C4980au() {
        /* renamed from: a */
        public final void mo40113a(C4951aj ajVar) {
            if (ajVar.f11214f != null && ajVar.f11209a.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", ajVar.f11209a.get(0).f11192d);
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, ajVar.f11209a.get(0).f11200l);
                } catch (JSONException unused) {
                }
                String unused2 = C5415m.f12422z;
                C5415m.this.mo40850a(ajVar.f11214f, "sendSaveContentResult(\"saveContent_" + ajVar.f11215g + "\", 'failed', \"" + jSONObject.toString().replace("\"", "\\\"") + "\");");
            }
        }

        /* renamed from: b */
        public final void mo40114b(C4951aj ajVar) {
            if (ajVar.f11214f != null && ajVar.f11209a.size() > 0) {
                String unused = C5415m.f12422z;
                C5415m.this.mo40850a(ajVar.f11214f, "sendSaveContentResult(\"saveContent_" + ajVar.f11215g + "\", 'success', \"" + ajVar.f11209a.get(0).f11199k + "\");");
            }
        }
    };

    /* renamed from: com.inmobi.media.m$a */
    /* compiled from: RenderView */
    public interface C5432a {
        /* renamed from: a */
        void mo40809a();

        /* renamed from: a */
        void mo40810a(C5415m mVar);

        /* renamed from: a */
        void mo40811a(String str, Map<String, Object> map);

        /* renamed from: a */
        void mo40812a(HashMap<Object, Object> hashMap);

        /* renamed from: b */
        void mo40813b();

        /* renamed from: b */
        void mo40814b(C5415m mVar);

        /* renamed from: b */
        void mo40815b(HashMap<Object, Object> hashMap);

        /* renamed from: c */
        void mo40816c();

        /* renamed from: c */
        void mo40817c(C5415m mVar);

        /* renamed from: d */
        void mo40818d();

        /* renamed from: d */
        void mo40819d(C5415m mVar);

        /* renamed from: e */
        void mo40820e();

        /* renamed from: e */
        void mo40821e(C5415m mVar);

        /* renamed from: f */
        void mo40822f();

        /* renamed from: g */
        void mo40823g();

        /* renamed from: h */
        C5394ik mo40824h();
    }

    public final Object getDataModel() {
        return null;
    }

    public final String getMarkupType() {
        return TJAdUnitConstants.String.HTML;
    }

    public final View getVideoContainerView() {
        return null;
    }

    public C5415m(Context context, byte b, Set<C5096cx> set, String str) {
        super(context.getApplicationContext());
        this.f12460e = b;
        this.f12474s = false;
        this.f12447ab = set;
        this.f12476u = str;
        setReferenceContainer(this);
        this.f12443U = this;
        this.f12479x = true;
    }

    public final void setAdSize(String str) {
        this.f12442T = str;
        this.f12452ag = C5343hf.m12332a(Integer.parseInt(str.split("x")[0]));
        this.f12451af = C5343hf.m12332a(Integer.parseInt(str.split("x")[1]));
    }

    public final String getBundleId() {
        return this.f12453ah;
    }

    public final void setBundleId(String str) {
        this.f12453ah = str;
    }

    public final void setIsPreload(boolean z) {
        this.f12478w = z;
    }

    public final void setPlacementId(long j) {
        this.f12441S = j;
    }

    public final void setImpressionId(String str) {
        this.f12476u = str;
    }

    public final void setCreativeId(String str) {
        this.f12475t = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.f12444V = z;
    }

    public final void setBlobProvider(C5467u uVar) {
        this.f12477v = uVar;
    }

    public final String getImpressionId() {
        return this.f12476u;
    }

    public final String getCreativeId() {
        return this.f12475t;
    }

    public final long getPlacementId() {
        return this.f12441S;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f12444V;
    }

    public final void setOriginalRenderView(C5415m mVar) {
        this.f12423A = mVar;
    }

    public final C5415m getOriginalRenderView() {
        return this.f12423A;
    }

    public final C5331h.C5332a getFullScreenEventsListener() {
        return this.f12455ak;
    }

    public final byte getPlacementType() {
        return this.f12460e;
    }

    public final String getState() {
        return this.f12459d;
    }

    public final Object getDefaultPositionMonitor() {
        return this.f12434L;
    }

    public final Object getCurrentPositionMonitor() {
        return this.f12435M;
    }

    public final void setShouldFireRenderBeacon(boolean z) {
        this.f12450ae = z;
    }

    public final Context getContainerContext() {
        WeakReference<Activity> weakReference = this.f12457b;
        if (weakReference == null || weakReference.get() == null) {
            return getContext();
        }
        return (Context) this.f12457b.get();
    }

    /* renamed from: g */
    public final void mo40862g() {
        int[] iArr = new int[2];
        this.f12431I = new JSONObject();
        if (this.f12424B == null) {
            this.f12424B = new WeakReference<>((ViewGroup) getParent());
        }
        if (this.f12424B.get() != null) {
            ((ViewGroup) this.f12424B.get()).getLocationOnScreen(iArr);
            try {
                this.f12431I.put("x", C5343hf.m12337b(iArr[0]));
                this.f12431I.put("y", C5343hf.m12337b(iArr[1]));
                int b = C5343hf.m12337b(((ViewGroup) this.f12424B.get()).getWidth());
                int b2 = C5343hf.m12337b(((ViewGroup) this.f12424B.get()).getHeight());
                this.f12431I.put("width", b);
                this.f12431I.put("height", b2);
            } catch (JSONException unused) {
            }
        } else {
            this.f12431I.put("x", 0);
            this.f12431I.put("y", 0);
            this.f12431I.put("width", 0);
            this.f12431I.put("height", 0);
        }
        synchronized (this.f12434L) {
            this.f12465j = false;
            this.f12434L.notifyAll();
        }
    }

    public final String getDefaultPosition() {
        JSONObject jSONObject = this.f12431I;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    /* renamed from: h */
    public final void mo40886h() {
        this.f12432J = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            this.f12432J.put("x", C5343hf.m12337b(iArr[0]));
            this.f12432J.put("y", C5343hf.m12337b(iArr[1]));
            int b = C5343hf.m12337b(getWidth());
            int b2 = C5343hf.m12337b(getHeight());
            this.f12432J.put("width", b);
            this.f12432J.put("height", b2);
        } catch (JSONException unused) {
        }
        synchronized (this.f12435M) {
            this.f12466k = false;
            this.f12435M.notifyAll();
        }
    }

    public final String getCurrentPosition() {
        JSONObject jSONObject = this.f12432J;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final void setFullScreenActivityContext(Activity activity) {
        this.f12457b = new WeakReference<>(activity);
        C5072ci ciVar = this.f12430H;
        if (ciVar != null) {
            setOrientationProperties(ciVar);
        }
    }

    public final Activity getFullScreenActivity() {
        WeakReference<Activity> weakReference = this.f12457b;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final C5220ev.C5230g getRenderingConfig() {
        return this.f12426D.rendering;
    }

    public final C5220ev.C5228e getMraidConfig() {
        return this.f12426D.mraid;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            int b = C5343hf.m12337b(i);
            int b2 = C5343hf.m12337b(i2);
            mo40860e("window.mraidview.broadcastEvent('sizeChange'," + b + "," + b2 + ");");
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = true;
        boolean z2 = i == 0;
        if (z2 && this.f12446aa != null) {
            if (!isShown() || !m12641a(getAdConfig().viewability.web.impressionMinPercentageViewed)) {
                z = false;
            }
            z2 = z;
        }
        m12648d(z2);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f12440R = !z;
        C5120dk dkVar = this.f12446aa;
        if (dkVar != null) {
            if (z) {
                dkVar.mo40399a(this, this, (Object) null, getAdConfig().viewability.web.impressionMinPercentageViewed);
                z = isShown() && m12641a(getAdConfig().viewability.web.impressionMinPercentageViewed);
            } else {
                dkVar.mo40398a((View) this);
            }
        }
        m12647c(z);
    }

    public final void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (i == 0) {
            m12647c(false);
        } else if (!this.f12440R) {
            m12647c(true);
        }
    }

    /* renamed from: c */
    private void m12647c(boolean z) {
        if (this.f12469n != z) {
            if (Build.VERSION.SDK_INT <= 23 || getFullScreenActivity() == null || !getFullScreenActivity().isInMultiWindowMode()) {
                m12648d(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m12648d(boolean z) {
        if (this.f12469n != z && !this.f12474s) {
            this.f12469n = z;
            if (z) {
                getListener().mo40814b(this);
            }
            m12651e(this.f12469n);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12427E = isHardwareAccelerated();
        C5120dk dkVar = this.f12446aa;
        if (dkVar != null) {
            dkVar.mo40399a(this, this, (Object) null, getAdConfig().viewability.web.impressionMinPercentageViewed);
            this.f12446aa.mo40380d();
        }
        if (this.f12424B == null) {
            this.f12424B = new WeakReference<>((ViewGroup) getParent());
        }
        if (this.f12450ae && this.f12449ad) {
            C5388ij ijVar = new C5388ij(this, this);
            long b = (long) getListener().mo40824h().mo40757b();
            C5388ij.C53891 r3 = new TimerTask() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.ij.1.run():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.ij.1.run():void, class status: UNLOADED
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
            View view = (View) ijVar.f12342a.get();
            if (view != null) {
                view.post(new Runnable(r3, b) {

                    /* renamed from: a */
                    final /* synthetic */ TimerTask f12347a;

                    /* renamed from: b */
                    final /* synthetic */ long f12348b;

                    public final void run(
/*
Method generation error in method: com.inmobi.media.ij.2.run():void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.ij.2.run():void, class status: UNLOADED
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
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        this.f12445W = SystemClock.elapsedRealtime();
        if (mo40888j()) {
            mo40860e("window.mraidview.onUserInteraction();");
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onDetachedFromWindow() {
        this.f12454ai.mo40939a();
        getMediaProcessor().mo40319b();
        getMediaProcessor().mo40320c();
        getMediaProcessor().mo40321e();
        C5120dk dkVar = this.f12446aa;
        if (dkVar != null) {
            dkVar.mo40402f();
        }
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final void mo40849a(C5432a aVar, C5220ev evVar, boolean z, boolean z2) {
        int i;
        this.f12426D = evVar;
        if (this.f12460e == 0 && this.f12442T != null) {
            this.f12446aa = new C5104dd(f12421aj, evVar.viewability);
            this.f12446aa.f11742c = new C5120dk.C5123c() {
                /* renamed from: a */
                public final void mo40388a(List<View> list, List<View> list2) {
                    C5415m mVar = C5415m.this;
                    mVar.m12648d(list.contains(mVar));
                }
            };
        }
        this.f12425C = aVar;
        this.f12449ad = z;
        this.f12424B = new WeakReference<>((ViewGroup) getParent());
        this.f12450ae = z2;
        if (getRenderingConfig() != null) {
            setBackgroundColor(getRenderingConfig().mo40560a());
        }
        if (getMraidConfig() != null) {
            C5061cf cfVar = new C5061cf(getMraidConfig().url, getMraidConfig().maxRetries, getMraidConfig().retryInterval, getMraidConfig().expiry);
            if (cfVar.f11580a != null) {
                cfVar.f11581b = new C5299gc("GET", cfVar.f11580a);
                cfVar.f11581b.f12136o = false;
                cfVar.f11581b.f12142u = false;
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
                cfVar.f11581b.mo40614a((Map<String, String>) hashMap);
                new Thread(new Runnable() {
                    public final void run(
/*
Method generation error in method: com.inmobi.media.cf.1.run():void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.cf.1.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
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
                }).start();
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            setImportantForAccessibility(2);
        }
        setScrollable(false);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setGeolocationEnabled(true);
        C5433n nVar = this.f12454ai;
        if (this.f12460e == 0) {
            i = this.f12426D.rendering.bannerNetworkLoadsLimit;
        } else {
            i = this.f12426D.rendering.otherNetworkLoadsLimit;
        }
        nVar.f12504a = (short) i;
        setWebViewClient(this.f12454ai);
        setWebChromeClient(this.f12456al);
        addJavascriptInterface(new C5042cb(this, this.f12460e), "sdkController");
        this.f12461f = new C5060ce(this);
        this.f12462g = new C5070ch(this);
        this.f12463h = new C5063cg(this);
        this.f12428F = new C5055cc();
        this.f12429G = new C5073cj(C5073cj.DEFAULT_POSITION, Boolean.TRUE);
        this.f12430H = new C5072ci();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C5120dk dkVar = this.f12446aa;
        boolean z = false;
        if (dkVar == null) {
            if (i == 0) {
                z = true;
            }
            m12648d(z);
        } else if (i == 0) {
            dkVar.mo40399a(view, this, (Object) null, getAdConfig().viewability.web.impressionMinPercentageViewed);
        } else {
            dkVar.mo40398a((View) this);
            m12648d(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12641a(int i) {
        if (this.f12451af > 0 && this.f12452ag > 0) {
            Rect rect = new Rect();
            if (!getGlobalVisibleRect(rect)) {
                return false;
            }
            long j = (long) (this.f12451af * this.f12452ag);
            long height = ((long) rect.height()) * ((long) rect.width());
            if (j <= 0 || height * 100 < ((long) i) * j) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void setScrollable(boolean z) {
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public final void setIsInAppBrowser(boolean z) {
        this.f12458c = z;
    }

    /* renamed from: c */
    public final boolean mo40687c() {
        return this.f12473r.get();
    }

    /* renamed from: i */
    public final void mo40887i() {
        super.destroy();
    }

    public final void destroy() {
        if (!this.f12473r.get()) {
            if (!this.f12433K) {
                this.f12433K = true;
                return;
            }
            this.f12473r.set(true);
            this.f12474s = true;
            this.f12439Q = -1;
            removeJavascriptInterface("sdkController");
            WeakReference<Activity> weakReference = this.f12457b;
            if (weakReference != null) {
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    activity.finish();
                }
                this.f12457b.clear();
            }
            WeakReference<ViewGroup> weakReference2 = this.f12424B;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            C5098cz czVar = this.f12448ac;
            if (czVar != null) {
                czVar.mo40373d();
                this.f12448ac.mo40374e();
            }
            this.f12425C = null;
            this.f12443U = null;
            ViewParent parent = getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
                removeAllViews();
            }
            C5220ev.C5229f fVar = this.f12426D.viewability.omidConfig;
            if (!this.f12479x || !fVar.omidEnabled || !C5139dx.C5140a.f11804a.mo40417a()) {
                super.destroy();
                return;
            }
            C5215er erVar = new C5215er(this, fVar.webViewRetainTime);
            new Handler().postDelayed(new Runnable() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.eu.1.run():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.eu.1.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            }, erVar.f11995b);
        }
    }

    /* renamed from: a */
    public final void mo40684a(byte b, Map<String, String> map) {
        if (b == 2) {
            mo40860e("inmobi.recordEvent(120,null);");
        }
    }

    /* renamed from: d */
    public final void mo40688d() {
        C5072ci ciVar;
        if (getFullScreenActivity() != null && (ciVar = this.f12430H) != null) {
            setOrientationProperties(ciVar);
        }
    }

    public final void setReferenceContainer(C5331h hVar) {
        this.f12443U = hVar;
    }

    public final C5331h getReferenceContainer() {
        return this.f12443U;
    }

    public final C5220ev getAdConfig() {
        return this.f12426D;
    }

    public final C5098cz getViewableAd() {
        if (this.f12448ac == null) {
            this.f12448ac = new C5101da(this);
            Set<C5096cx> set = this.f12447ab;
            if (set != null) {
                for (C5096cx next : set) {
                    try {
                        byte b = next.f11686a;
                        boolean z = true;
                        if (b == 1) {
                            this.f12448ac = new C5126dm(this, getContext(), this.f12448ac, next.f11687b);
                        } else if (b == 3) {
                            C5131dq dqVar = (C5131dq) next.f11687b.get("omidAdSession");
                            if (!next.f11687b.containsKey("deferred") || !((Boolean) next.f11687b.get("deferred")).booleanValue()) {
                                z = false;
                            }
                            String str = (String) next.f11687b.get("customReferenceData");
                            if (z) {
                                dqVar.mo40412a(C5136du.m11739a(this, str));
                            }
                            if (dqVar != null) {
                                this.f12448ac = new C5136du(this, this.f12448ac, dqVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return this.f12448ac;
    }

    /* renamed from: b */
    public final void mo40854b(String str) {
        this.f12474s = false;
        if (!this.f12473r.get()) {
            loadDataWithBaseURL("", str, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
        }
    }

    /* renamed from: c */
    public final void mo40857c(String str) {
        this.f12474s = false;
        if (!this.f12473r.get()) {
            loadUrl(str);
        }
    }

    public final void stopLoading() {
        if (!this.f12473r.get()) {
            super.stopLoading();
        }
    }

    /* renamed from: e */
    private void m12651e(boolean z) {
        mo40860e("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    /* renamed from: b */
    public final void mo40855b(String str, String str2, String str3) {
        mo40850a(str, "broadcastEvent('error',\"" + str2 + "\", \"" + str3 + "\")");
    }

    /* renamed from: a */
    public final void mo40850a(String str, String str2) {
        mo40860e(str + "." + str2);
    }

    /* renamed from: a */
    public final void mo40852a(String str, Map<String, Object> map) {
        getListener().mo40811a(str, map);
    }

    /* renamed from: e */
    public final void mo40860e(final String str) {
        if (getContainerContext() != null) {
            new Handler(getContainerContext().getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        if (!C5415m.this.f12473r.get()) {
                            String str = "javascript:try{" + str + "}catch(e){}";
                            String unused = C5415m.f12422z;
                            if (Build.VERSION.SDK_INT < 19) {
                                C5415m.this.loadUrl(str);
                            } else {
                                C5415m.this.evaluateJavascript(str, (ValueCallback) null);
                            }
                        }
                    } catch (Exception unused2) {
                        String unused3 = C5415m.f12422z;
                    }
                }
            });
        }
    }

    public final void setUseCustomClose(boolean z) {
        this.f12467l = z;
    }

    public final void setCloseRegionDisabled(boolean z) {
        this.f12470o = z;
    }

    public final void setDisableBackButton(boolean z) {
        this.f12471p = z;
    }

    /* renamed from: a */
    public final void mo40853a(boolean z) {
        C5041ca caVar;
        setCloseRegionDisabled(z);
        View rootView = getRootView();
        if (rootView != null && (caVar = (C5041ca) rootView.findViewById(65531)) != null) {
            caVar.setVisibility(this.f12470o ? 8 : 0);
        }
    }

    /* renamed from: b */
    public final void mo40856b(boolean z) {
        C5041ca caVar;
        setUseCustomClose(z);
        View rootView = getRootView();
        if (rootView != null && (caVar = (C5041ca) rootView.findViewById(65532)) != null) {
            caVar.setVisibility(this.f12467l ? 8 : 0);
        }
    }

    /* renamed from: b */
    public final void mo40686b() {
        View view;
        View view2;
        View view3;
        View view4;
        ViewGroup viewGroup;
        View rootView;
        C5063cg cgVar = this.f12463h;
        ViewGroup viewGroup2 = null;
        if (cgVar.f11588b != null) {
            cgVar.f11588b.mo40294a();
            cgVar.f11588b = null;
        }
        if ("Expanded".equals(this.f12459d)) {
            if (!CBLocation.LOCATION_DEFAULT.equals(this.f12459d)) {
                this.f12474s = true;
                C5060ce ceVar = this.f12461f;
                if (!(ceVar.f11575a.getOriginalRenderView() != null || ceVar.f11577c == null || (rootView = ceVar.f11577c.getRootView()) == null)) {
                    View findViewById = rootView.findViewById(65535);
                    ((ViewGroup) ceVar.f11575a.getParent()).removeView(ceVar.f11575a);
                    if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
                        viewGroup2 = (ViewGroup) findViewById.getParent();
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(findViewById);
                    }
                    ceVar.f11577c.addView(ceVar.f11575a, ceVar.f11578d, new RelativeLayout.LayoutParams(ceVar.f11577c.getWidth(), ceVar.f11577c.getHeight()));
                    ceVar.f11575a.m12658o();
                }
                m12657n();
                this.f12474s = false;
            }
            this.f12433K = false;
        } else if ("Resized".equals(this.f12459d)) {
            if (!CBLocation.LOCATION_DEFAULT.equals(this.f12459d)) {
                this.f12474s = true;
                C5070ch chVar = this.f12462g;
                ViewGroup viewGroup3 = chVar.f11603a.getParent() instanceof ViewGroup ? (ViewGroup) chVar.f11603a.getParent() : null;
                if (viewGroup3 == null) {
                    view = null;
                } else {
                    view = viewGroup3.getRootView();
                }
                if (view == null) {
                    view2 = null;
                } else {
                    view2 = view.findViewById(WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                }
                if (chVar.f11604b == null) {
                    view3 = null;
                } else {
                    view3 = chVar.f11604b.getRootView();
                }
                if (view3 == null) {
                    view4 = null;
                } else {
                    view4 = view3.findViewById(65535);
                }
                if (view4 == null) {
                    viewGroup = null;
                } else {
                    viewGroup = (ViewGroup) view4.getParent();
                }
                if (view2 != null) {
                    viewGroup2 = (ViewGroup) view2.getParent();
                }
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view2);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(view4);
                }
                if (viewGroup3 != null) {
                    viewGroup3.removeView(chVar.f11603a);
                }
                if (chVar.f11604b != null) {
                    chVar.f11604b.addView(chVar.f11603a, chVar.f11605c, new RelativeLayout.LayoutParams(chVar.f11604b.getWidth(), chVar.f11604b.getHeight()));
                }
                chVar.f11603a.m12658o();
                setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
                getListener().mo40819d(this);
                this.f12474s = false;
            }
        } else if (CBLocation.LOCATION_DEFAULT.equals(this.f12459d)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            if (1 == this.f12460e) {
                m12657n();
            } else if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        this.f12454ai.mo40939a();
        this.f12468m = false;
    }

    /* renamed from: n */
    private void m12657n() {
        InMobiAdActivity.m11058a((Object) this);
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            ((InMobiAdActivity) fullScreenActivity).f11092a = true;
            fullScreenActivity.finish();
            int i = this.f12439Q;
            if (i != -1) {
                fullScreenActivity.overridePendingTransition(0, i);
                return;
            }
            return;
        }
        if (this.f12460e == 0) {
            setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
            C5415m mVar = this.f12423A;
            if (mVar != null) {
                mVar.setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
            }
        } else if (CBLocation.LOCATION_DEFAULT.equals(this.f12459d)) {
            setAndUpdateViewState("Hidden");
        }
        getListener().mo40819d(this);
    }

    public final void setExitAnimation(int i) {
        this.f12439Q = i;
    }

    /* renamed from: g */
    private static String m12654g(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: a */
    public final void mo40851a(String str, String str2, String str3, String str4) {
        while (true) {
            try {
                C5325gu.m12261b(getContainerContext(), str3);
                getListener().mo40818d();
                mo40850a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
                return;
            } catch (URISyntaxException unused) {
                mo40855b(str2, "Cannot resolve URI (" + m12654g(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (ActivityNotFoundException unused2) {
                mo40855b(str2, "Cannot resolve URI (" + m12654g(str3) + ")", str);
                if (str4 == null) {
                    return;
                }
            } catch (Exception unused3) {
                mo40855b(str2, "Unexpected error", "openExternal");
                C5327gw.m12263a((byte) 1, f12422z, "Could not open URL; SDK encountered an unexpected error");
                return;
            }
            str3 = str4;
            str4 = null;
        }
    }

    /* renamed from: a */
    public final void mo40685a(String str) {
        if (C5325gu.m12259a(str)) {
            InMobiAdActivity.m11057a(this);
            Intent intent = new Intent(getContainerContext(), InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
            C5314go.m12192a(getContainerContext(), intent);
        }
    }

    /* renamed from: e */
    public final void mo40690e() {
        getListener().mo40817c(this);
    }

    /* renamed from: f */
    public final void mo40691f() {
        getListener().mo40819d(this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.inmobi.media.C5325gu.m12261b(getContainerContext(), r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40858c(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            if (r5 == 0) goto L_0x005b
            java.lang.String r0 = "http"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L_0x0011
            boolean r0 = android.webkit.URLUtil.isValidUrl(r5)
            if (r0 != 0) goto L_0x0011
            goto L_0x005b
        L_0x0011:
            android.content.Context r0 = r2.getContainerContext()
            java.lang.String r0 = com.inmobi.media.C5296g.m12117a(r0)
            com.inmobi.media.ev r1 = r2.getAdConfig()     // Catch:{ Exception -> 0x0035 }
            boolean r1 = r1.cctEnabled     // Catch:{ Exception -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            if (r1 != 0) goto L_0x0024
            goto L_0x0031
        L_0x0024:
            com.inmobi.media.bz r0 = new com.inmobi.media.bz     // Catch:{ Exception -> 0x0035 }
            android.content.Context r1 = r2.getContainerContext()     // Catch:{ Exception -> 0x0035 }
            r0.<init>(r5, r1, r2)     // Catch:{ Exception -> 0x0035 }
            r0.mo40210b()     // Catch:{ Exception -> 0x0035 }
            goto L_0x003c
        L_0x0031:
            r2.mo40685a((java.lang.String) r5)     // Catch:{ Exception -> 0x0035 }
            goto L_0x003c
        L_0x0035:
            android.content.Context r0 = r2.getContainerContext()     // Catch:{ URISyntaxException -> 0x003c }
            com.inmobi.media.C5325gu.m12261b(r0, r5)     // Catch:{ URISyntaxException -> 0x003c }
        L_0x003c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "broadcastEvent('"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "Successful','"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "');"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.mo40850a((java.lang.String) r4, (java.lang.String) r3)
            return
        L_0x005b:
            java.lang.String r5 = "Invalid URL"
            r2.mo40855b(r4, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5415m.mo40858c(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void setRenderViewEventListener(C5432a aVar) {
        this.f12425C = aVar;
    }

    public final C5432a getListener() {
        C5432a aVar = this.f12425C;
        if (aVar != null) {
            return aVar;
        }
        C5432a aVar2 = f12420a;
        this.f12425C = aVar2;
        return aVar2;
    }

    public final String getViewState() {
        return this.f12459d;
    }

    public final C5063cg getMediaProcessor() {
        return this.f12463h;
    }

    public final C5055cc getExpandProperties() {
        return this.f12428F;
    }

    public final C5073cj getResizeProperties() {
        return this.f12429G;
    }

    public final void setResizeProperties(C5073cj cjVar) {
        this.f12429G = cjVar;
    }

    public final void setAndUpdateViewState(String str) {
        this.f12459d = str;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        mo40860e("window.mraidview.broadcastEvent('stateChange','" + lowerCase + "');");
    }

    /* renamed from: o */
    private void m12658o() {
        setVisibility(0);
        requestLayout();
    }

    public final void setAdActiveFlag(boolean z) {
        this.f12468m = z;
    }

    public final C5072ci getOrientationProperties() {
        return this.f12430H;
    }

    public final void setOrientationProperties(C5072ci ciVar) {
        this.f12430H = ciVar;
        WeakReference<Activity> weakReference = this.f12457b;
        if (weakReference != null && weakReference.get() != null && !ciVar.f11608a) {
            String str = ciVar.f11609b;
            char c = 65535;
            int hashCode = str.hashCode();
            boolean z = true;
            if (hashCode != 729267099) {
                if (hashCode == 1430647483 && str.equals("landscape")) {
                    c = 0;
                }
            } else if (str.equals("portrait")) {
                c = 1;
            }
            if (c == 0) {
                if (!(C5343hf.m12336b() == 3 || C5343hf.m12336b() == 4)) {
                    z = false;
                }
                if (z) {
                    if (3 == C5343hf.m12336b()) {
                        ((Activity) this.f12457b.get()).setRequestedOrientation(0);
                    } else {
                        ((Activity) this.f12457b.get()).setRequestedOrientation(8);
                    }
                } else if (ciVar.f11610c.equals("left")) {
                    ((Activity) this.f12457b.get()).setRequestedOrientation(8);
                } else if (ciVar.f11610c.equals("right")) {
                    ((Activity) this.f12457b.get()).setRequestedOrientation(0);
                }
            } else if (c != 1) {
                if (C5343hf.m12336b() == 2) {
                    ((Activity) this.f12457b.get()).setRequestedOrientation(9);
                } else if (C5343hf.m12336b() == 4) {
                    ((Activity) this.f12457b.get()).setRequestedOrientation(8);
                } else if (C5343hf.m12336b() == 3) {
                    ((Activity) this.f12457b.get()).setRequestedOrientation(0);
                } else {
                    ((Activity) this.f12457b.get()).setRequestedOrientation(1);
                }
            } else if (C5343hf.m12336b() == 2) {
                ((Activity) this.f12457b.get()).setRequestedOrientation(9);
            } else {
                ((Activity) this.f12457b.get()).setRequestedOrientation(1);
            }
        }
    }

    public final String getMraidJsString() {
        String b = new C5330gz(getContext(), "mraid_js_store").mo40677b("mraid_js_string");
        return b == null ? "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b=[];this.add=function(a){b.push(a);++this.count};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,e=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){b.forEach(function(e){try{e.apply({},a)}catch(d){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});\nreturn c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&\nwindow.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&\nwindow.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};\nthis.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(e){}}};this.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);\nwindow.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;window.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(e){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(e);return!1};a.popupBlocked=function(e){a.firePopupBlockedBeacon(e)};a.zeroPad=function(a){var d=\"\";10>a&&(d+=\"0\");return d+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(d){imraidview.showAlert(\"use CustomClose: \"+d)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(d){imraidview.showAlert(\"executeNativeExpand: \"+\nd+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var d={};d.allowOrientationChange=!b.lockOrientation;d.forceOrientation=b.orientation;a.setOrientationProperties(d)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(c){imraidview.showAlert(\"executeNativesetExpandProperties: \"+c+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(d){imraidview.showAlert(\"setOrientationProperties: \"+\nd+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;a.setResizeProperties=function(b){var d,c;try{d=parseInt(b.width);c=parseInt(b.height);if(isNaN(d)||isNaN(c)||1>d||1>c)throw\"Invalid\";b.width=d;b.height=c;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(g){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\n\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+sdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(d){imraidview.showAlert(\"open: \"+d)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=\nfunction(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+\na)}};a.isViewable=function(){try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+a)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var d=\"\";null!=a&&(d=a);try{sdkController.playVideo(\"window.mraidview\",\nd)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(b){if(\"undefined\"===typeof JSON){var d=\"\",c;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(c=0;c<b.length;c++)0<c&&(d+=\",\"),d+=a.stringifyArg(b[c]);return d+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(a){var b,c,g;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(g in a)null!==a[g]&&(c||(b+=\",\"),b=b+'\"'+g+'\":',c=\ntypeof a[g],b=\"number\"===c||\"boolean\"===c?b+a[g]:\"function\"===typeof a[g]?b+'\"\"':a[g]instanceof Object?b+this.stringify(args[i][g]):b+'\"'+a[g]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\n\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),\n!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};a.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var d={};d.trigger=a;d.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,d)}};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};\nb.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=b.getExpandProperties;a.setExpandProperties=function(c){\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose);b.setExpandProperties(c)};a.getResizeProperties=\nb.getResizeProperties;a.setResizeProperties=b.setResizeProperties;a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=b.expand;a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\n\"open\"):b.open(c))};a.resize=b.resize;a.getVersion=function(){return\"2.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)}})();\n(function(){var a=window.imraidview={},b,c=!0;a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=b.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+\nc+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.getWindowOrientation=function(){var a=window.orientation;0>a&&(a+=360);window.innerWidth!==this.previousWidth&&0==a&&window.innerWidth>window.innerHeight&&(a=90);return a};var e=function(){window.setTimeout(function(){if(c||a.getWindowOrientation()!==b)c=!1,b=a.getWindowOrientation(),sdkController.onOrientationChange(\"window.imraidview\"),imraid.broadcastEvent(\"orientationChange\",b)},200)};a.registerOrientationListener=\nfunction(){b=a.getWindowOrientation();window.addEventListener(\"resize\",e,!1);window.addEventListener(\"orientationchange\",e,!1)};a.unRegisterOrientationListener=function(){window.removeEventListener(\"resize\",e,!1);window.removeEventListener(\"orientationchange\",e,!1)};window.imraidview.registerOrientationListener();a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var f=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=\nb&&\"\"!=b)&&(f=f+\"_\"+b);window.imraid.broadcastEvent(f,c)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var f=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(f=f+\"_\"+a);window.imraid.broadcastEvent(f,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var f={name:\"timeupdate\",target:{}};f.target.currentTime=b;f.target.duration=c;b=\"inmobi_media_\"+f.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.saveContent=function(a,\nb,c){window.imraid.addEventListener(\"saveContent_\"+a,c);sdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var f=new Image;f.src=\"data:image/jpeg;base64,\"+a;f.width=b;f.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",f)};a.fireCameraPictureCatpturedEvent=function(a,\nb,c){var f=new Image;f.src=\"data:image/jpeg;base64,\"+a;f.width=b;f.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",f)};a.fireMediaCloseEvent=function(a,b,c){var f={name:\"close\"};f.viaUserInteraction=b;f.target={};f.target.currentTime=c;b=\"inmobi_media_\"+f.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.fireMediaVolumeChangeEvent=function(a,b,c){var f={name:\"volumechange\",target:{}};f.target.volume=b;f.target.muted=c;b=\"inmobi_media_\"+f.name;\n\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,f)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",\nb,c):sdkController.openExternal(\"window.imraidview\",b)}catch(e){a.showAlert(\"openExternal: \"+e)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,e=\"\",f=0;f<c;f++)e+=b[f];return parseInt(e)};a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,e,f){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\n\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=function(b){try{sdkController.acceptAction(\"window.imraidview\",\nmraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.getDeviceVolume=function(){return 603>=\ngetSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",\na)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,b,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",\na,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):\n-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=function(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",\na)};a.getInstallTime=function(a){try{if(909<=getSdkVersionInt())return sdkController.getInstallTime(\"window.imraidview\",void 0==a?null:a)}catch(b){}return-2}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,d){var k=arguments.length,g,f=null;if(3>k){if(\"function\"===typeof arguments[k-1])g=arguments[k-1];else return;f={reason:1}}else a.saveContentIDMap[c]&&(g=arguments[2],f={reason:11,url:arguments[1]});\"function\"!==!g&&(f?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,g),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(f))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,d)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,e){mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,e)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):b.updateToPassbook(c))};a.getInstallTime=b.getInstallTime;a.postToSocial=\nfunction(a,e,d,k){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,e,d,k)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?\n!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;a.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=\nb.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(k){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,f=null,h=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(e))try{m=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(k)?imIsObjValid(d)?(l=k.url,q=k.fallbackUrl,p=k.urlType,g=d.url,f=d.pingWV,h=d.fr):(l=k.url,p=k.urlType):(l=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof f&&\"number\"!=typeof f||null==f)f=!0;if(0>f||1<f)f=!0;if(\"number\"!=typeof p||null==p)p=0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==f?b.pingInWebView(g,h):b.ping(g,h):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(g)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==d?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,f=null,h=null,m=null,n=null;if(imIsObjValid(e))try{m=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(d)&&(g=d.url,f=d.pingWV,h=d.fr);try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof f&&\"number\"!=typeof f||null==f)f=\n!0;if(0>f||1<f)f=!0;g=b.appendTapParams(g,m,n);imIsObjValid(g)?!0==f?b.pingInWebView(g,h):b.ping(g,h):b.log(\"clickurl provided is null.\");b.onUserInteraction(k)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){mraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};\nb.openExternal=function(b,e){mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=function(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;\nb.fireAdFailed=a.fireAdFailed})();\n" : b;
    }

    /* renamed from: a */
    public final void mo40683a() {
        this.f12436N = false;
        try {
            getClass().getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40861f(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case -1886160473: goto L_0x0035;
                case -1647691422: goto L_0x002b;
                case 1509574865: goto L_0x0021;
                case 1642189884: goto L_0x0017;
                case 1772979069: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "redirectFraudDetection"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 0
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "saveContent"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 2
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "html5video"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 4
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "inlineVideo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 3
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "playVideo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = -1
        L_0x0040:
            if (r7 == r5) goto L_0x0053
            if (r7 == r3) goto L_0x0053
            if (r7 == r2) goto L_0x0049
            if (r7 == r1) goto L_0x0049
            return r4
        L_0x0049:
            boolean r7 = r6.f12427E
            if (r7 == 0) goto L_0x0052
            boolean r7 = r6.f12436N
            if (r7 == 0) goto L_0x0052
            return r5
        L_0x0052:
            return r4
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5415m.mo40861f(java.lang.String):boolean");
    }

    /* renamed from: j */
    public final boolean mo40888j() {
        C5220ev.C5230g renderingConfig = getRenderingConfig();
        if (renderingConfig == null) {
            return false;
        }
        boolean z = this.f12445W != -1 && SystemClock.elapsedRealtime() - this.f12445W < renderingConfig.mo40561b();
        if (!renderingConfig.autoRedirectionEnforcement || this.f12444V || z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo40737a(String str, String str2, String str3) {
        mo40850a(str, str2 + "(" + str3 + ");");
    }

    public final void setCloseEndCardTracker(String str) {
        C5197ep epVar;
        C5031bs bsVar;
        C5331h referenceContainer = getReferenceContainer();
        if ((referenceContainer instanceof C5410k) && (epVar = (C5197ep) ((C5410k) referenceContainer).getVideoContainerView()) != null && (bsVar = (C5031bs) epVar.getVideoView().getTag()) != null && bsVar.mo40205b() != null && bsVar.mo40205b().mo40363f() != null) {
            bsVar.mo40205b().mo40363f().mo40345a(new C5030br(str, 0, "closeEndCard", (Map<String, String>) null));
        }
    }

    /* renamed from: k */
    public final void mo40754k() {
        if (!this.f12473r.get()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5415m.this.getListener().mo40822f();
                }
            });
        }
    }

    /* renamed from: l */
    public final void mo40755l() {
        if (!this.f12473r.get()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5415m.this.getListener().mo40823g();
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo40859d(String str) {
        mo40860e("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
        String str2 = this.f12442T != null ? AdFormat.BANNER : "int";
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.f12475t);
        hashMap.put("trigger", str);
        hashMap.put("impressionId", getImpressionId());
        hashMap.put(C8937Ad.AD_TYPE, str2);
        mo40852a("BlockAutoRedirection", (Map<String, Object>) hashMap);
    }

    public final void setExpandProperties(C5055cc ccVar) {
        if (ccVar.f11556b) {
            setUseCustomClose(ccVar.f11555a);
        }
        this.f12428F = ccVar;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m12643a(C5415m mVar, JsResult jsResult) {
        C5220ev.C5230g renderingConfig = mVar.getRenderingConfig();
        if (renderingConfig != null && renderingConfig.shouldRenderPopup) {
            return true;
        }
        jsResult.cancel();
        mVar.mo40860e("window.mraidview.popupBlocked('popupBlocked')");
        return false;
    }
}
