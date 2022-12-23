package com.mbridge.msdk.mbbanner.common.bridge;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbbanner.common.p197b.C6468a;
import com.mbridge.msdk.mbsignalcommon.mraid.C6549a;
import com.mbridge.msdk.mbsignalcommon.mraid.C6551b;
import com.mbridge.msdk.mbsignalcommon.p206b.C6532b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p158b.p160b.C6077a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class BannerExpandDialog extends Dialog {

    /* renamed from: a */
    private final String f16132a = "BannerExpandDialog";

    /* renamed from: b */
    private String f16133b;

    /* renamed from: c */
    private boolean f16134c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FrameLayout f16135d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WindVaneWebView f16136e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f16137f;

    /* renamed from: g */
    private String f16138g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<CampaignEx> f16139h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6468a f16140i;

    /* renamed from: j */
    private C6551b f16141j = new C6551b() {
        public final void expand(String str, boolean z) {
        }

        public final void open(String str) {
            try {
                C6361q.m16158d("BannerExpandDialog", str);
                if (BannerExpandDialog.this.f16139h.size() > 1) {
                    C6122a.m15302b().mo42895d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    str = null;
                }
                if (BannerExpandDialog.this.f16140i != null) {
                    BannerExpandDialog.this.f16140i.mo44297a(true, str);
                }
            } catch (Throwable th) {
                C6361q.m16155a("BannerExpandDialog", "open", th);
            }
        }

        public final void close() {
            BannerExpandDialog.this.dismiss();
        }

        public final void unload() {
            close();
        }

        public final void useCustomClose(boolean z) {
            try {
                BannerExpandDialog.this.f16137f.setVisibility(z ? 4 : 0);
            } catch (Throwable th) {
                C6361q.m16155a("BannerExpandDialog", "useCustomClose", th);
            }
        }
    };

    public BannerExpandDialog(Context context, Bundle bundle, C6468a aVar) {
        super(context);
        if (bundle != null) {
            this.f16133b = bundle.getString("url");
            this.f16134c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f16140i = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f16135d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f16136e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f16135d.addView(this.f16136e);
        TextView textView = new TextView(getContext());
        this.f16137f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f16137f.setLayoutParams(layoutParams);
        this.f16137f.setVisibility(this.f16134c ? 4 : 0);
        this.f16137f.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                BannerExpandDialog.this.dismiss();
            }
        });
        this.f16135d.addView(this.f16137f);
        setContentView(this.f16135d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            if (Build.VERSION.SDK_INT >= 16) {
                int i = 519;
                if (Build.VERSION.SDK_INT >= 19) {
                    i = 4615;
                }
                getWindow().getDecorView().setSystemUiVisibility(i);
            }
        }
        this.f16136e.setWebViewListener(new C6532b() {
            /* renamed from: a */
            public final void mo44023a(WebView webView, String str) {
                super.mo44023a(webView, str);
                StringBuilder sb = new StringBuilder("javascript:");
                sb.append(C6077a.m15106a().mo42759b());
                if (Build.VERSION.SDK_INT <= 19) {
                    webView.loadUrl(sb.toString());
                } else {
                    webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                        public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                            String str = (String) obj;
                        }
                    });
                }
                BannerExpandDialog.m16628a(BannerExpandDialog.this);
            }
        });
        this.f16136e.setObject(this.f16141j);
        this.f16136e.loadUrl(this.f16133b);
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                if (BannerExpandDialog.this.f16140i != null) {
                    BannerExpandDialog.this.f16140i.mo44296a(false);
                }
                BannerExpandDialog.this.f16136e.loadDataWithBaseURL((String) null, "", WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
                BannerExpandDialog.this.f16135d.removeView(BannerExpandDialog.this.f16136e);
                BannerExpandDialog.this.f16136e.release();
                WindVaneWebView unused = BannerExpandDialog.this.f16136e = null;
                C6468a unused2 = BannerExpandDialog.this.f16140i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f16138g = str;
        this.f16139h = list;
    }

    /* renamed from: a */
    static /* synthetic */ void m16628a(BannerExpandDialog bannerExpandDialog) {
        BannerExpandDialog bannerExpandDialog2 = bannerExpandDialog;
        try {
            int i = C6122a.m15302b().mo42895d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            HashMap j = C6349m.m16115j(C6122a.m15302b().mo42895d());
            int intValue = ((Integer) j.get("width")).intValue();
            int intValue2 = ((Integer) j.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            bannerExpandDialog2.f16136e.getLocationInWindow(iArr);
            C6549a.m16848a().mo44473a(bannerExpandDialog2.f16136e, (float) iArr[0], (float) iArr[1], (float) bannerExpandDialog2.f16136e.getWidth(), (float) bannerExpandDialog2.f16136e.getHeight());
            C6549a.m16848a().mo44478b(bannerExpandDialog2.f16136e, (float) iArr[0], (float) iArr[1], (float) bannerExpandDialog2.f16136e.getWidth(), (float) bannerExpandDialog2.f16136e.getHeight());
            C6549a.m16848a().mo44477b(bannerExpandDialog2.f16136e, (float) C6349m.m16111h(C6122a.m15302b().mo42895d()), (float) C6349m.m16112i(C6122a.m15302b().mo42895d()));
            C6549a.m16848a().mo44480c(bannerExpandDialog2.f16136e, (float) intValue, (float) intValue2);
            C6549a.m16848a().mo44476a((WebView) bannerExpandDialog2.f16136e, (Map<String, Object>) hashMap);
            C6549a.m16848a().mo44470a(bannerExpandDialog2.f16136e);
        } catch (Throwable th) {
            C6361q.m16155a("BannerExpandDialog", "notifyMraid", th);
        }
    }
}
