package com.tapjoy;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C9067al;
import com.tapjoy.internal.C9219eq;
import com.tapjoy.internal.C9465jq;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TJAdUnitJSBridge implements TJWebViewJSInterfaceListener {

    /* renamed from: a */
    public TJAdUnit f21930a;
    public boolean allowRedirect;

    /* renamed from: b */
    public WebView f21931b;

    /* renamed from: c */
    final ConcurrentLinkedQueue f21932c;
    public boolean closeRequested;
    public boolean customClose;

    /* renamed from: d */
    private TJWebViewJSInterface f21933d;
    public boolean didLaunchOtherActivity;

    /* renamed from: e */
    private TJAdUnitJSBridge f21934e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f21935f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TJAdUnitActivity f21936g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TJSplitWebView f21937h;

    /* renamed from: i */
    private ProgressDialog f21938i;

    /* renamed from: j */
    private View f21939j;

    /* renamed from: k */
    private boolean f21940k;

    /* renamed from: l */
    private C9219eq f21941l;
    public String otherActivityCallbackID;
    public String splitWebViewCallbackID;

    public interface AdUnitAsyncTaskListner {
        void onComplete(boolean z);
    }

    public void destroy() {
    }

    public TJAdUnitJSBridge(Context context, TJAdUnit tJAdUnit) {
        this(context, (WebView) tJAdUnit.getWebView());
        this.f21930a = tJAdUnit;
    }

    public TJAdUnitJSBridge(Context context, WebView webView) {
        this.f21939j = null;
        this.didLaunchOtherActivity = false;
        this.allowRedirect = true;
        this.otherActivityCallbackID = null;
        this.customClose = false;
        this.closeRequested = false;
        this.splitWebViewCallbackID = null;
        this.f21941l = new C9219eq(this);
        this.f21932c = new ConcurrentLinkedQueue();
        TapjoyLog.m24276i("TJAdUnitJSBridge", "creating AdUnit/JS Bridge");
        this.f21935f = context;
        this.f21931b = webView;
        this.f21934e = this;
        if (webView == null) {
            TapjoyLog.m24274e("TJAdUnitJSBridge", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Cannot create AdUnitJSBridge -- webview is NULL"));
            return;
        }
        TJWebViewJSInterface tJWebViewJSInterface = new TJWebViewJSInterface(webView, this);
        this.f21933d = tJWebViewJSInterface;
        this.f21931b.addJavascriptInterface(tJWebViewJSInterface, TJAdUnitConstants.JAVASCRIPT_INTERFACE_ID);
        setEnabled(true);
    }

    public void onDispatchMethod(String str, JSONObject jSONObject) {
        if (this.f21940k) {
            String str2 = null;
            try {
                str2 = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, (String) null);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Method method = TJAdUnitJSBridge.class.getMethod(str, new Class[]{JSONObject.class, String.class});
                TapjoyLog.m24273d("TJAdUnitJSBridge", "Dispatching method: " + method + " with data=" + jSONObject2 + "; callbackID=" + str2);
                method.invoke(this.f21934e, new Object[]{jSONObject2, str2});
            } catch (Exception e) {
                e.printStackTrace();
                invokeJSCallback(str2, Boolean.FALSE);
            }
        } else {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "Bridge currently disabled. Adding " + str + " to message queue");
            this.f21932c.add(new Pair(str, jSONObject));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void alert(org.json.JSONObject r10, final java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "alert_method: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TJAdUnitJSBridge"
            com.tapjoy.TapjoyLog.m24273d(r2, r1)
            r1 = 1
            r3 = 0
            java.lang.String r4 = "title"
            java.lang.String r4 = r10.getString(r4)     // Catch:{ Exception -> 0x002f }
            java.lang.String r5 = "message"
            java.lang.String r0 = r10.getString(r5)     // Catch:{ Exception -> 0x002a }
            java.lang.String r5 = "buttons"
            org.json.JSONArray r10 = r10.getJSONArray(r5)     // Catch:{ Exception -> 0x002a }
            goto L_0x0041
        L_0x002a:
            r10 = move-exception
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x0031
        L_0x002f:
            r10 = move-exception
            r4 = r0
        L_0x0031:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5[r3] = r6
            r9.invokeJSCallback((java.lang.String) r11, (java.lang.Object[]) r5)
            r10.printStackTrace()
            r10 = 0
            r8 = r4
            r4 = r0
            r0 = r8
        L_0x0041:
            com.tapjoy.TJAdUnitActivity r5 = r9.f21936g
            if (r5 == 0) goto L_0x00c0
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r2 < r6) goto L_0x0060
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r6 = 16974394(0x103023a, float:2.4062497E-38)
            r2.<init>(r5, r6)
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            android.app.AlertDialog r0 = r0.create()
            goto L_0x0071
        L_0x0060:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r5)
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            android.app.AlertDialog r0 = r0.create()
        L_0x0071:
            if (r10 == 0) goto L_0x00b6
            int r2 = r10.length()
            if (r2 != 0) goto L_0x007a
            goto L_0x00b6
        L_0x007a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        L_0x0080:
            int r5 = r10.length()
            if (r4 >= r5) goto L_0x00ac
            if (r4 == 0) goto L_0x008e
            if (r4 == r1) goto L_0x008c
            r5 = -1
            goto L_0x008f
        L_0x008c:
            r5 = -3
            goto L_0x008f
        L_0x008e:
            r5 = -2
        L_0x008f:
            java.lang.String r6 = r10.getString(r4)     // Catch:{ Exception -> 0x0097 }
            r2.add(r6)     // Catch:{ Exception -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r6 = move-exception
            r6.printStackTrace()
        L_0x009b:
            java.lang.Object r6 = r2.get(r4)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            com.tapjoy.TJAdUnitJSBridge$1 r7 = new com.tapjoy.TJAdUnitJSBridge$1
            r7.<init>(r11)
            r0.setButton(r5, r6, r7)
            int r4 = r4 + 1
            goto L_0x0080
        L_0x00ac:
            r0.setCancelable(r3)
            r0.setCanceledOnTouchOutside(r3)
            r0.show()
            return
        L_0x00b6:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10[r3] = r0
            r9.invokeJSCallback((java.lang.String) r11, (java.lang.Object[]) r10)
            return
        L_0x00c0:
            java.lang.String r10 = "Cannot alert -- TJAdUnitActivity is null"
            com.tapjoy.TapjoyLog.m24273d(r2, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJAdUnitJSBridge.alert(org.json.JSONObject, java.lang.String):void");
    }

    public void closeRequested(Boolean bool) {
        TJSplitWebView tJSplitWebView = this.f21937h;
        if (tJSplitWebView == null) {
            this.closeRequested = true;
            HashMap hashMap = new HashMap();
            hashMap.put(TJAdUnitConstants.String.FORCE_CLOSE, bool);
            invokeJSAdunitMethod(TJAdUnitConstants.String.CLOSE_REQUESTED, (Map) hashMap);
        } else if (!tJSplitWebView.goBack()) {
            this.f21937h.mo57613a();
        }
    }

    public void getVolume(JSONObject jSONObject, String str) {
        HashMap volumeArgs = getVolumeArgs();
        if (volumeArgs != null) {
            invokeJSCallback(str, (Map) volumeArgs);
            return;
        }
        invokeJSCallback(str, false);
    }

    public void onVolumeChanged() {
        invokeJSAdunitMethod(TJAdUnitConstants.String.VOLUME_CHANGED, (Map) getVolumeArgs());
    }

    public HashMap getVolumeArgs() {
        TJAdUnit tJAdUnit = this.f21930a;
        if (tJAdUnit == null) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "No ad unit provided");
            return null;
        }
        String format = String.format("%.2f", new Object[]{Float.valueOf(tJAdUnit.getVolume())});
        boolean isMuted = this.f21930a.isMuted();
        TapjoyLog.m24273d("TJAdUnitJSBridge", "getVolumeArgs: volume=" + format + "; isMuted=" + isMuted);
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.CURRENT_VOLUME, format);
        hashMap.put(TJAdUnitConstants.String.IS_MUTED, Boolean.valueOf(isMuted));
        return hashMap;
    }

    public void dismiss(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.f21936g;
        if (tJAdUnitActivity != null) {
            invokeJSCallback(str, true);
            tJAdUnitActivity.finish();
            return;
        }
        TapjoyLog.m24273d("TJAdUnitJSBridge", "Cannot dismiss -- TJAdUnitActivity is null");
        invokeJSCallback(str, false);
    }

    public void display() {
        invokeJSAdunitMethod("display", new Object[0]);
    }

    public void displayStoreURL(JSONObject jSONObject, String str) {
        displayURL(jSONObject, str);
    }

    public void dismissStoreView(JSONObject jSONObject, String str) {
        dismissSplitView(jSONObject, str);
    }

    public void displayURL(JSONObject jSONObject, String str) {
        final String str2;
        final String str3;
        try {
            String optString = jSONObject.optString("style");
            final String string = jSONObject.getString("url");
            final JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
            final JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
            final String optString2 = jSONObject.optString("userAgent", (String) null);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER);
            if (optJSONObject2 != null) {
                String optString3 = optJSONObject2.optString(TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON, (String) null);
                str2 = optJSONObject2.optString("to", (String) null);
                str3 = optString3;
            } else {
                str3 = null;
                str2 = null;
            }
            if (TJAdUnitConstants.String.STYLE_SPLIT.equals(optString)) {
                final JSONObject jSONObject2 = jSONObject;
                final String str4 = str;
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        if (TJAdUnitJSBridge.this.f21931b != null) {
                            if (TJAdUnitJSBridge.this.f21937h == null) {
                                ViewParent parent = TJAdUnitJSBridge.this.f21931b.getParent();
                                if (parent instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) parent;
                                    TJSplitWebView unused = TJAdUnitJSBridge.this.f21937h = new TJSplitWebView(TJAdUnitJSBridge.this.f21936g, jSONObject2, TJAdUnitJSBridge.this);
                                    viewGroup.addView(TJAdUnitJSBridge.this.f21937h, new RelativeLayout.LayoutParams(-1, -1));
                                    TJAdUnitJSBridge.this.f21937h.animateOpen(viewGroup);
                                }
                            } else {
                                TJAdUnitJSBridge.this.f21937h.setExitHosts(optJSONArray);
                                TJAdUnitJSBridge.this.f21937h.applyLayoutOption(optJSONObject);
                            }
                            if (TJAdUnitJSBridge.this.f21937h != null) {
                                if (optString2 != null) {
                                    TJAdUnitJSBridge.this.f21937h.setUserAgent(optString2);
                                }
                                TJAdUnitJSBridge.this.f21937h.setTrigger(str3, str2);
                                TJAdUnitJSBridge.this.splitWebViewCallbackID = str4;
                                TJAdUnitJSBridge.this.f21937h.loadUrl(string);
                                return;
                            }
                        }
                        TJSplitWebView unused2 = TJAdUnitJSBridge.this.f21937h = null;
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                        TJAdUnitJSBridge.this.invokeJSCallback(str4, Boolean.FALSE);
                    }
                });
                return;
            }
            this.didLaunchOtherActivity = true;
            this.otherActivityCallbackID = str;
            this.f21935f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.TRUE);
            e.printStackTrace();
        }
    }

    public void clearCache(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            TapjoyCache.getInstance().clearTapjoyCache();
            invokeJSCallback(str, Boolean.TRUE);
            return;
        }
        invokeJSCallback(str, Boolean.FALSE);
    }

    public void setPrerenderLimit(JSONObject jSONObject, String str) {
        try {
            TJPlacementManager.setPreRenderedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_PRE_RENDERED_LIMIT));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception unused) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to set Tapjoy placement pre-render limit. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEventPreloadLimit(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            try {
                TJPlacementManager.setCachedPlacementLimit(jSONObject.getInt(TJAdUnitConstants.String.TJC_PLACEMENT_CACHE_LIMIT));
                invokeJSCallback(str, Boolean.TRUE);
            } catch (Exception unused) {
                TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to set Tapjoy cache's event preload limit. Invalid parameters.");
                invokeJSCallback(str, Boolean.FALSE);
            }
        } else {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void removeAssetFromCache(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, Boolean.valueOf(TapjoyCache.getInstance().removeAssetFromCache(string)));
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cacheAsset(JSONObject jSONObject, String str) {
        String str2;
        Long l = 0L;
        try {
            String string = jSONObject.getString("url");
            try {
                str2 = jSONObject.getString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID);
            } catch (Exception unused) {
                str2 = "";
            }
            try {
                l = Long.valueOf(jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE));
            } catch (Exception unused2) {
            }
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().cacheAssetFromURL(string, str2, l.longValue()));
                return;
            }
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception unused3) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to cache video. Invalid parameters.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void cachePathForURL(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TapjoyCache.getInstance() != null) {
                invokeJSCallback(str, TapjoyCache.getInstance().getPathOfCachedURL(string));
                return;
            }
            invokeJSCallback(str, "");
        } catch (Exception unused) {
            invokeJSCallback(str, "");
        }
    }

    public void getCachedAssets(JSONObject jSONObject, String str) {
        if (TapjoyCache.getInstance() != null) {
            invokeJSCallback(str, TapjoyCache.getInstance().cachedAssetsToJSON());
            return;
        }
        invokeJSCallback(str, "");
    }

    public void contentReady(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f21930a;
        if (tJAdUnit != null) {
            tJAdUnit.fireContentReady();
            invokeJSCallback(str, true);
            return;
        }
        invokeJSCallback(str, false);
    }

    public void getOrientation(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f21930a;
        if (tJAdUnit == null) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, JSONObject.NULL);
            return;
        }
        String screenOrientationString = tJAdUnit.getScreenOrientationString();
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", screenOrientationString);
        hashMap.put("width", Integer.valueOf(this.f21930a.getScreenWidth()));
        hashMap.put("height", Integer.valueOf(this.f21930a.getScreenHeight()));
        invokeJSCallback(str, (Map) hashMap);
    }

    public void setOrientation(JSONObject jSONObject, String str) {
        int i;
        if (this.f21930a == null) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, false);
            return;
        }
        try {
            String string = jSONObject.getString("orientation");
            if (!string.equals("landscape")) {
                if (!string.equals(TJAdUnitConstants.String.LANDSCAPE_LEFT)) {
                    i = string.equals(TJAdUnitConstants.String.LANDSCAPE_RIGHT) ? 8 : 1;
                    this.f21930a.setOrientation(i);
                    invokeJSCallback(str, true);
                }
            }
            i = 0;
            this.f21930a.setOrientation(i);
            invokeJSCallback(str, true);
        } catch (Exception unused) {
            invokeJSCallback(str, false);
        }
    }

    public void unsetOrientation(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f21930a;
        if (tJAdUnit == null) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "No ad unit provided");
            invokeJSCallback(str, false);
            return;
        }
        try {
            tJAdUnit.unsetOrientation();
            invokeJSCallback(str, true);
        } catch (Exception unused) {
            invokeJSCallback(str, false);
        }
    }

    public void setBackgroundColor(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString("backgroundColor");
            TJAdUnit tJAdUnit = this.f21930a;
            if (tJAdUnit != null) {
                tJAdUnit.setBackgroundColor(string, new AdUnitAsyncTaskListner() {
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
                return;
            }
            invokeJSCallback(str, false);
        } catch (Exception unused) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to set background color. Invalid parameters.");
            invokeJSCallback(str, false);
        }
    }

    public void setBackgroundWebViewContent(JSONObject jSONObject, final String str) {
        TapjoyLog.m24273d("TJAdUnitJSBridge", "setBackgroundWebViewContent");
        try {
            String string = jSONObject.getString(TJAdUnitConstants.String.BACKGROUND_CONTENT);
            TJAdUnit tJAdUnit = this.f21930a;
            if (tJAdUnit != null) {
                tJAdUnit.setBackgroundContent(string, new AdUnitAsyncTaskListner() {
                    public final void onComplete(boolean z) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                    }
                });
                return;
            }
            invokeJSCallback(str, false);
        } catch (Exception unused) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to set background content. Invalid parameters.");
            invokeJSCallback(str, false);
        }
    }

    public void displayVideo(JSONObject jSONObject, final String str) {
        try {
            String string = jSONObject.getString("url");
            if (string.length() <= 0 || string == "") {
                invokeJSCallback(str, Boolean.FALSE);
                return;
            }
            this.f21930a.loadVideoUrl(string, new AdUnitAsyncTaskListner() {
                public final void onComplete(boolean z) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                }
            });
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void playVideo(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f21930a;
        if (tJAdUnit != null) {
            invokeJSCallback(str, Boolean.valueOf(tJAdUnit.playVideo()));
        }
    }

    public void pauseVideo(JSONObject jSONObject, String str) {
        TJAdUnit tJAdUnit = this.f21930a;
        if (tJAdUnit != null) {
            invokeJSCallback(str, Boolean.valueOf(tJAdUnit.pauseVideo()));
        }
    }

    public void clearVideo(JSONObject jSONObject, final String str) {
        if (this.f21930a != null) {
            this.f21930a.clearVideo(new AdUnitAsyncTaskListner() {
                public final void onComplete(boolean z) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.valueOf(z));
                }
            }, jSONObject.optBoolean(TJAdUnitConstants.String.VISIBLE, false));
        }
    }

    public void setVideoMute(JSONObject jSONObject, String str) {
        try {
            this.f21930a.mo57326a(jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (JSONException unused) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "Failed to parse 'enabled' from json params.");
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setVideoMargins(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        try {
            final float optDouble = (float) jSONObject.optDouble("top", 0.0d);
            final float optDouble2 = (float) jSONObject.optDouble("right", 0.0d);
            final float optDouble3 = (float) jSONObject.optDouble(TJAdUnitConstants.String.BOTTOM, 0.0d);
            final float optDouble4 = (float) jSONObject.optDouble("left", 0.0d);
            final TJAdUnitActivity tJAdUnitActivity = this.f21936g;
            if (tJAdUnitActivity != null) {
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        TJAdUnitActivity tJAdUnitActivity = tJAdUnitActivity;
                        float f = optDouble4;
                        float f2 = optDouble;
                        float f3 = optDouble2;
                        float f4 = optDouble3;
                        DisplayMetrics displayMetrics = tJAdUnitActivity.getResources().getDisplayMetrics();
                        ViewGroup viewGroup = (ViewGroup) tJAdUnitActivity.f21918a.getVideoView().getParent();
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).setMargins((int) TypedValue.applyDimension(1, f, displayMetrics), (int) TypedValue.applyDimension(1, f2, displayMetrics), (int) TypedValue.applyDimension(1, f3, displayMetrics), (int) TypedValue.applyDimension(1, f4, displayMetrics));
                        viewGroup.requestLayout();
                    }
                });
                invokeJSCallback(str2, true);
                return;
            }
            TapjoyLog.m24273d("TJAdUnitJSBridge", "Cannot setVideoMargins -- TJAdUnitActivity is null");
            invokeJSCallback(str2, false);
        } catch (Exception e) {
            invokeJSCallback(str2, false);
            e.printStackTrace();
        }
    }

    public void log(JSONObject jSONObject, String str) {
        try {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "Logging message=" + jSONObject.getString("message"));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void openApp(JSONObject jSONObject, String str) {
        try {
            this.f21935f.startActivity(this.f21935f.getPackageManager().getLaunchIntentForPackage(jSONObject.getString(TJAdUnitConstants.String.BUNDLE)));
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void nativeEval(final JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        TJAdUnitJSBridge.this.f21931b.evaluateJavascript(jSONObject.getString("command"), (ValueCallback) null);
                    } else {
                        WebView webView = TJAdUnitJSBridge.this.f21931b;
                        webView.loadUrl("javascript:" + jSONObject.getString("command"));
                    }
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                } catch (Exception unused) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:4|5)|6|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void present(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0048 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "visible"
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Exception -> 0x0048 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r4 = "transparent"
            java.lang.String r4 = r6.getString(r4)     // Catch:{ Exception -> 0x001d }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r4 = "customClose"
            java.lang.String r6 = r6.getString(r4)     // Catch:{ Exception -> 0x002d }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x002d }
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x002d }
            r5.customClose = r6     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            com.tapjoy.TJAdUnitJSBridge$a r6 = new com.tapjoy.TJAdUnitJSBridge$a     // Catch:{ Exception -> 0x0048 }
            android.webkit.WebView r4 = r5.f21931b     // Catch:{ Exception -> 0x0048 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0048 }
            r4 = 2
            java.lang.Boolean[] r4 = new java.lang.Boolean[r4]     // Catch:{ Exception -> 0x0048 }
            r4[r1] = r3     // Catch:{ Exception -> 0x0048 }
            r4[r0] = r2     // Catch:{ Exception -> 0x0048 }
            r6.execute(r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0048 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0048 }
            r6[r1] = r2     // Catch:{ Exception -> 0x0048 }
            r5.invokeJSCallback((java.lang.String) r7, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x0048 }
            return
        L_0x0048:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0[r1] = r2
            r5.invokeJSCallback((java.lang.String) r7, (java.lang.Object[]) r0)
            r6.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJAdUnitJSBridge.present(org.json.JSONObject, java.lang.String):void");
    }

    public void triggerEvent(JSONObject jSONObject, String str) {
        if (this.f21930a != null) {
            try {
                String string = jSONObject.getString("eventName");
                if (string.equals("start")) {
                    this.f21930a.fireOnVideoStart();
                } else if (string.equals("complete")) {
                    this.f21930a.fireOnVideoComplete();
                } else if (string.equals("error")) {
                    this.f21930a.fireOnVideoError("Error while trying to play video.");
                } else if (string.equals("click")) {
                    this.f21930a.fireOnClick();
                }
            } catch (Exception unused) {
                TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to triggerEvent. No event name.");
            }
        }
    }

    public void invokeJSAdunitMethod(String str, Object... objArr) {
        this.f21933d.callback(new ArrayList(Arrays.asList(objArr)), str, (String) null);
    }

    public void invokeJSAdunitMethod(String str, Map map) {
        this.f21933d.callback(map, str, (String) null);
    }

    public void invokeJSCallback(String str, Object... objArr) {
        if (C9465jq.m25449c(str)) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "invokeJSCallback -- no callbackID provided");
            return;
        }
        this.f21933d.callback(new ArrayList(Arrays.asList(objArr)), "", str);
    }

    public void invokeJSCallback(String str, Map map) {
        this.f21933d.callback(map, "", str);
    }

    public void flushBacklogMessageQueue() {
        while (true) {
            Pair pair = (Pair) this.f21932c.poll();
            if (pair != null) {
                onDispatchMethod((String) pair.first, (JSONObject) pair.second);
            } else {
                return;
            }
        }
    }

    public void flushMessageQueue() {
        this.f21933d.flushMessageQueue();
    }

    public void setAllowRedirect(JSONObject jSONObject, String str) {
        boolean z;
        try {
            z = jSONObject.getBoolean(TJAdUnitConstants.String.ENABLED);
        } catch (Exception unused) {
            z = true;
        }
        this.allowRedirect = z;
        invokeJSCallback(str, Boolean.TRUE);
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.f21936g = tJAdUnitActivity;
    }

    public void setSpinnerVisible(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("message");
            TJAdUnitActivity tJAdUnitActivity = this.f21936g;
            if (tJAdUnitActivity != null) {
                if (z) {
                    this.f21938i = ProgressDialog.show(tJAdUnitActivity, optString, optString2);
                } else if (this.f21938i != null) {
                    this.f21938i.dismiss();
                }
                invokeJSCallback(str, Boolean.TRUE);
                return;
            }
            TapjoyLog.m24273d("TJAdUnitJSBridge", "Cannot setSpinnerVisible -- TJAdUnitActivity is null");
            invokeJSCallback(str, Boolean.FALSE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            e.printStackTrace();
        }
    }

    public void setCloseButtonVisible(JSONObject jSONObject, String str) {
        try {
            final boolean z = jSONObject.getBoolean(TJAdUnitConstants.String.VISIBLE);
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnitActivity b = TJAdUnitJSBridge.this.f21936g;
                    if (b != null) {
                        b.setCloseButtonVisibility(z);
                    } else {
                        TapjoyLog.m24273d("TJAdUnitJSBridge", "Cannot setCloseButtonVisible -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, true);
        } catch (Exception e) {
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void setCloseButtonClickable(JSONObject jSONObject, String str) {
        try {
            final boolean optBoolean = jSONObject.optBoolean(TJAdUnitConstants.String.CLICKABLE);
            TapjoyUtil.runOnMainThread(new Runnable() {
                public final void run() {
                    TJAdUnitActivity b = TJAdUnitJSBridge.this.f21936g;
                    if (b != null) {
                        b.setCloseButtonClickable(optBoolean);
                    } else {
                        TapjoyLog.m24273d("TJAdUnitJSBridge", "Cannot setCloseButtonClickable -- TJAdUnitActivity is null");
                    }
                }
            });
            invokeJSCallback(str, true);
        } catch (Exception e) {
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void shouldClose(JSONObject jSONObject, String str) {
        TJAdUnitActivity tJAdUnitActivity = this.f21936g;
        try {
            Boolean.valueOf(false);
            if (Boolean.valueOf(jSONObject.getString("close")).booleanValue() && tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            invokeJSCallback(str, Boolean.TRUE);
        } catch (Exception e) {
            invokeJSCallback(str, Boolean.FALSE);
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            e.printStackTrace();
        }
        this.closeRequested = false;
    }

    public void setLoggingLevel(JSONObject jSONObject, String str) {
        try {
            TapjoyAppSettings.getInstance().saveLoggingLevel(String.valueOf(jSONObject.getString(TJAdUnitConstants.String.LOGGING_LEVEL)));
        } catch (Exception e) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "setLoggingLevel exception " + e.getLocalizedMessage());
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void clearLoggingLevel(JSONObject jSONObject, String str) {
        TapjoyAppSettings.getInstance().clearLoggingLevel();
    }

    public void attachVolumeListener(JSONObject jSONObject, String str) {
        try {
            boolean z = jSONObject.getBoolean("attach");
            int optInt = jSONObject.optInt(TJAdUnitConstants.String.INTERVAL, TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL);
            if (optInt > 0) {
                this.f21930a.attachVolumeListener(z, optInt);
                invokeJSCallback(str, true);
                return;
            }
            TapjoyLog.m24273d("TJAdUnitJSBridge", "Invalid `interval` value passed to attachVolumeListener(): interval=" + optInt);
            invokeJSCallback(str, false);
        } catch (Exception e) {
            TapjoyLog.m24273d("TJAdUnitJSBridge", "attachVolumeListener exception " + e.toString());
            invokeJSCallback(str, false);
            e.printStackTrace();
        }
    }

    public void initMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, true);
    }

    public void startMoatVideoTracker(JSONObject jSONObject, String str) {
        invokeJSCallback(str, true);
    }

    public void triggerMoatVideoEvent(JSONObject jSONObject, String str) {
        invokeJSCallback(str, true);
    }

    public void initViewabilityTracker(JSONObject jSONObject, String str) {
        C9219eq eqVar = this.f21941l;
        if (!eqVar.mo58023a(jSONObject)) {
            eqVar.f22631a.invokeJSCallback(str, false);
            return;
        }
        C9219eq.m24687b(jSONObject);
        if (C9067al.m24297a(C9219eq.f22630b)) {
            eqVar.f22631a.invokeJSCallback(str, false);
            return;
        }
        TapjoyUtil.runOnMainThread(new Runnable(jSONObject, str) {

            /* renamed from: a */
            final /* synthetic */ JSONObject f22637a;

            /* renamed from: b */
            final /* synthetic */ String f22638b;

            {
                this.f22637a = r2;
                this.f22638b = r3;
            }

            public final void run() {
                try {
                    if (!C9219eq.this.f22632c) {
                        C9219eq eqVar = C9219eq.this;
                        C9130ck.m24466a();
                        boolean unused = eqVar.f22632c = C9130ck.m24467a(C9219eq.this.f22631a.f21931b.getContext());
                    }
                    if (C9219eq.this.f22632c) {
                        TapjoyLog.m24273d("TJOMViewabilityAgent", "initialized");
                        C9140cu a = C9140cu.m24479a(C9219eq.this.f22635f, C9219eq.f22630b, C9219eq.m24686b(this.f22637a.optJSONArray(TJAdUnitConstants.String.VENDORS)), "");
                        C9138cs unused2 = C9219eq.this.f22634e = C9138cs.m24474a(C9139ct.m24478a(C9142cw.f22468a, C9142cw.f22468a), a);
                        C9219eq.this.f22634e.mo57926a(C9219eq.this.f22631a.f21930a.getWebView());
                        C9149dc unused3 = C9219eq.this.f22636g = C9149dc.m24493a(C9219eq.this.f22634e);
                        C9137cr unused4 = C9219eq.this.f22633d = C9137cr.m24472a(C9219eq.this.f22634e);
                        C9219eq.this.f22631a.invokeJSCallback(this.f22638b, true);
                        return;
                    }
                    TapjoyLog.m24273d("TJOMViewabilityAgent", "Failed to initialize");
                    C9219eq.this.f22631a.invokeJSCallback(this.f22638b, false);
                } catch (Exception e) {
                    TapjoyLog.m24273d("TJOMViewabilityAgent", "Failed to init with exception: " + e.getMessage());
                    C9219eq.this.f22631a.invokeJSCallback(this.f22638b, false);
                }
            }
        });
    }

    public void startViewabilityTracker(JSONObject jSONObject, String str) {
        C9219eq eqVar = this.f21941l;
        if (!eqVar.f22632c) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not start -- TJOMViewabilityAgent is not initialized");
            eqVar.f22631a.invokeJSCallback(str, false);
            return;
        }
        eqVar.f22631a.invokeJSCallback(str, true);
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    C9219eq.this.f22634e.mo57925a();
                } catch (Exception e) {
                    TapjoyLog.m24273d("TJOMViewabilityAgent", "Failed to start with exception: " + e.getMessage());
                }
            }
        });
    }

    public void triggerViewabilityEvent(JSONObject jSONObject, String str) {
        C9219eq eqVar = this.f21941l;
        if (!eqVar.f22632c) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not triggerEvent -- TJOMViewabilityAgent is not initialized");
            eqVar.f22631a.invokeJSCallback(str, false);
        } else if (jSONObject == null) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not triggerEvent -- json parameter is null");
            eqVar.f22631a.invokeJSCallback(str, false);
        } else {
            String optString = jSONObject.optString("eventName", (String) null);
            if (optString == null) {
                TapjoyLog.m24273d("TJOMViewabilityAgent", "triggerEvent: params json did not contain 'eventName'");
                eqVar.f22631a.invokeJSCallback(str, false);
                return;
            }
            TapjoyUtil.runOnMainThread(new Runnable(optString, str) {

                /* renamed from: a */
                final /* synthetic */ String f22641a;

                /* renamed from: b */
                final /* synthetic */ String f22642b;

                {
                    this.f22641a = r2;
                    this.f22642b = r3;
                }

                public final void run() {
                    try {
                        if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_RENDERED)) {
                            C9219eq.this.f22636g.mo57938a(C9148db.m24491a(C9147da.f22490d));
                            C9219eq.this.f22633d.mo57924a();
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_BUFFER_START)) {
                            C9219eq.this.f22636g.mo57944g();
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_BUFFER_END)) {
                            C9219eq.this.f22636g.mo57945h();
                        } else if (this.f22641a.equals("start")) {
                            C9219eq.this.f22636g.mo57937a((float) C9219eq.this.f22631a.f21930a.getVideoView().getDuration(), C9219eq.this.f22631a.f21930a.getVolume());
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE)) {
                            C9219eq.this.f22636g.mo57935a();
                        } else if (this.f22641a.equals("midpoint")) {
                            C9219eq.this.f22636g.mo57939b();
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE)) {
                            C9219eq.this.f22636g.mo57940c();
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_PAUSED)) {
                            C9219eq.this.f22636g.mo57942e();
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_PLAYING)) {
                            C9219eq.this.f22636g.mo57943f();
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VIDEO_SKIPPED)) {
                            C9219eq.this.f22636g.mo57946i();
                        } else if (this.f22641a.equals(TJAdUnitConstants.String.VOLUME_CHANGED)) {
                            C9219eq.this.f22636g.mo57936a(C9219eq.this.f22631a.f21930a.getVolume());
                        } else if (this.f22641a.equals("complete")) {
                            C9219eq.this.f22636g.mo57941d();
                            C9219eq.this.f22634e.mo57927b();
                            C9138cs unused = C9219eq.this.f22634e = null;
                        } else {
                            TapjoyLog.m24273d("TJOMViewabilityAgent", "triggerEvent: event name '" + this.f22641a + "' not found");
                            C9219eq.this.f22631a.invokeJSCallback(this.f22642b, false);
                            return;
                        }
                        TapjoyLog.m24273d("TJOMViewabilityAgent", "triggerEvent: event name '" + this.f22641a + "'");
                        C9219eq.this.f22631a.invokeJSCallback(this.f22642b, true);
                    } catch (Exception e) {
                        TapjoyLog.m24273d("TJOMViewabilityAgent", "triggerEvent exception:" + e.getMessage());
                        C9219eq.this.f22631a.invokeJSCallback(this.f22642b, false);
                    }
                }
            });
        }
    }

    public void startUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m24273d("TJAdUnitJSBridge", "Empty name for startUsageTrackingEvent");
                invokeJSCallback(str, false);
                return;
            }
            if (this.f21930a != null) {
                this.f21930a.startAdContentTracking(string, jSONObject);
                invokeJSCallback(str, true);
                return;
            }
            invokeJSCallback(str, false);
        } catch (JSONException e) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to startUsageTrackingEvent. Invalid parameters: " + e);
        }
    }

    public void endUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m24273d("TJAdUnitJSBridge", "Empty name for endUsageTrackingEvent");
                invokeJSCallback(str, false);
                return;
            }
            if (this.f21930a != null) {
                this.f21930a.endAdContentTracking(string, jSONObject);
                invokeJSCallback(str, true);
                return;
            }
            invokeJSCallback(str, false);
        } catch (JSONException e) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to endUsageTrackingEvent. Invalid parameters: " + e);
        }
    }

    public void sendUsageTrackingEvent(JSONObject jSONObject, String str) {
        try {
            String string = jSONObject.getString("name");
            if (string.isEmpty()) {
                TapjoyLog.m24273d("TJAdUnitJSBridge", "Empty name for sendUsageTrackingEvent");
                invokeJSCallback(str, false);
                return;
            }
            if (this.f21930a != null) {
                this.f21930a.sendAdContentTracking(string, jSONObject);
                invokeJSCallback(str, true);
                return;
            }
            invokeJSCallback(str, false);
        } catch (JSONException e) {
            TapjoyLog.m24278w("TJAdUnitJSBridge", "Unable to sendUsageTrackingEvent. Invalid parameters: " + e);
        }
    }

    public void hasSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f21937h != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                    return;
                }
                TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.FALSE);
            }
        });
    }

    public void dismissSplitView(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f21937h != null) {
                    String str = str;
                    if (str != null) {
                        TJAdUnitJSBridge.this.invokeJSCallback(str, Boolean.TRUE);
                    }
                    if (TJAdUnitJSBridge.this.splitWebViewCallbackID != null) {
                        TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
                        tJAdUnitJSBridge.invokeJSCallback(tJAdUnitJSBridge.splitWebViewCallbackID, Boolean.TRUE);
                        TJAdUnitJSBridge.this.splitWebViewCallbackID = null;
                    }
                    ((ViewGroup) TJAdUnitJSBridge.this.f21937h.getParent()).removeView(TJAdUnitJSBridge.this.f21937h);
                    TJSplitWebView unused = TJAdUnitJSBridge.this.f21937h = null;
                    return;
                }
                String str2 = str;
                if (str2 != null) {
                    TJAdUnitJSBridge.this.invokeJSCallback(str2, Boolean.FALSE);
                }
            }
        });
    }

    public void getSplitViewURL(JSONObject jSONObject, final String str) {
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                if (TJAdUnitJSBridge.this.f21937h != null) {
                    TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnitJSBridge.this;
                    tJAdUnitJSBridge.invokeJSCallback(str, tJAdUnitJSBridge.f21937h.getLastUrl());
                    return;
                }
                TJAdUnitJSBridge.this.invokeJSCallback(str, JSONObject.NULL);
            }
        });
    }

    public void isNetworkAvailable(JSONObject jSONObject, String str) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f21935f.getSystemService("connectivity")).getActiveNetworkInfo();
            invokeJSCallback(str, Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()));
        } catch (Exception unused) {
            invokeJSCallback(str, Boolean.FALSE);
        }
    }

    public void setEnabled(boolean z) {
        this.f21940k = z;
        if (z) {
            flushBacklogMessageQueue();
        }
    }

    /* renamed from: com.tapjoy.TJAdUnitJSBridge$a */
    class C9013a extends AsyncTask {

        /* renamed from: a */
        WebView f21980a;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return (Boolean[]) objArr;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Boolean[] boolArr = (Boolean[]) obj;
            final boolean booleanValue = boolArr[0].booleanValue();
            final boolean booleanValue2 = boolArr[1].booleanValue();
            if (TJAdUnitJSBridge.this.f21935f instanceof Activity) {
                TapjoyUtil.runOnMainThread(new Runnable() {
                    public final void run() {
                        if (booleanValue) {
                            C9013a.this.f21980a.setVisibility(0);
                            if (booleanValue2) {
                                if (C9013a.this.f21980a.getParent() instanceof RelativeLayout) {
                                    ((RelativeLayout) C9013a.this.f21980a.getParent()).getBackground().setAlpha(0);
                                    ((RelativeLayout) C9013a.this.f21980a.getParent()).setBackgroundColor(0);
                                }
                                if (Build.VERSION.SDK_INT >= 11) {
                                    C9013a.this.f21980a.setLayerType(1, (Paint) null);
                                    return;
                                }
                                return;
                            }
                            if (C9013a.this.f21980a.getParent() instanceof RelativeLayout) {
                                ((RelativeLayout) C9013a.this.f21980a.getParent()).getBackground().setAlpha(255);
                                ((RelativeLayout) C9013a.this.f21980a.getParent()).setBackgroundColor(-1);
                            }
                            if (Build.VERSION.SDK_INT >= 11) {
                                C9013a.this.f21980a.setLayerType(0, (Paint) null);
                                return;
                            }
                            return;
                        }
                        C9013a.this.f21980a.setVisibility(4);
                        if (C9013a.this.f21980a.getParent() instanceof RelativeLayout) {
                            ((RelativeLayout) C9013a.this.f21980a.getParent()).getBackground().setAlpha(0);
                            ((RelativeLayout) C9013a.this.f21980a.getParent()).setBackgroundColor(0);
                        }
                    }
                });
            } else {
                TapjoyLog.m24275e("TJAdUnitJSBridge", "Unable to present offerwall. No Activity context provided.");
            }
        }

        public C9013a(WebView webView) {
            this.f21980a = webView;
        }
    }

    public void onVideoReady(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_READY_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_DURATION, Integer.valueOf(i));
        hashMap.put(TJAdUnitConstants.String.VIDEO_WIDTH, Integer.valueOf(i2));
        hashMap.put(TJAdUnitConstants.String.VIDEO_HEIGHT, Integer.valueOf(i3));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map) hashMap);
    }

    public void onVideoStarted(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_START_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map) hashMap);
    }

    public void onVideoProgress(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PROGRESS_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map) hashMap);
    }

    public void onVideoPaused(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_PAUSE_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_CURRENT_TIME, Integer.valueOf(i));
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map) hashMap);
    }

    public void onVideoCompletion() {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_COMPLETE_EVENT);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map) hashMap);
    }

    public void onVideoInfo(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_INFO_EVENT);
        hashMap.put(TJAdUnitConstants.String.VIDEO_INFO, str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map) hashMap);
    }

    public void onVideoError(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(TJAdUnitConstants.String.VIDEO_EVENT_NAME, TJAdUnitConstants.String.VIDEO_ERROR_EVENT);
        hashMap.put("error", str);
        invokeJSAdunitMethod(TJAdUnitConstants.String.VIDEO_EVENT, (Map) hashMap);
    }

    public void notifyOrientationChanged(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("orientation", str);
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        invokeJSAdunitMethod(TJAdUnitConstants.String.ORIENTATION_CHANGED_EVENT, (Map) hashMap);
    }
}
