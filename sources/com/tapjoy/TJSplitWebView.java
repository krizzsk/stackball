package com.tapjoy;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.C9465jq;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public class TJSplitWebView extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TJWebView f22087a;

    /* renamed from: b */
    private C9038a f22088b;

    /* renamed from: c */
    private C9038a f22089c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f22090d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f22091e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f22092f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Uri f22093g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public HashSet f22094h;

    /* renamed from: i */
    private JSONObject f22095i;

    /* renamed from: j */
    private TJAdUnitJSBridge f22096j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Context f22097k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Boolean f22098l;

    /* renamed from: m */
    private RelativeLayout f22099m;

    /* renamed from: n */
    private FrameLayout f22100n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ProgressBar f22101o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TextView f22102p;

    /* renamed from: q */
    private TJImageButton f22103q;

    /* renamed from: r */
    private TJImageButton f22104r;

    /* renamed from: s */
    private String f22105s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f22106t;

    /* renamed from: u */
    private String f22107u;

    /* renamed from: v */
    private String f22108v;

    /* renamed from: w */
    private String f22109w;

    public TJSplitWebView(Context context, JSONObject jSONObject, TJAdUnitJSBridge tJAdUnitJSBridge) {
        super(context);
        this.f22096j = tJAdUnitJSBridge;
        this.f22097k = context;
        JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_LAYOUT);
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.SPLIT_VIEW_EXIT_HOSTS);
        JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ERROR_DIALOG_STRINGS);
        this.f22105s = jSONObject.optString(TJAdUnitConstants.String.SPLIT_VIEW_URL_FOR_EXTERNAL_OPEN);
        this.f22095i = jSONObject.optJSONObject(TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
        setLayoutOption(optJSONObject);
        setExitHosts(optJSONArray);
        setErrorDialog(optJSONObject2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        TJWebView tJWebView = new TJWebView(this.f22097k);
        this.f22087a = tJWebView;
        tJWebView.setId(TapjoyUtil.generateViewId());
        this.f22087a.setBackgroundColor(-1);
        WebSettings settings = this.f22087a.getSettings();
        if (settings != null) {
            settings.setUseWideViewPort(true);
        }
        this.f22087a.setWebViewClient(new C9039b(this, (byte) 0));
        Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean(TJAdUnitConstants.String.SPLIT_VIEW_SHOW_TOOLBAR));
        this.f22098l = valueOf;
        if (valueOf.booleanValue()) {
            addToolbar();
            addLineBreak();
            addProgressBar();
            this.f22087a.setWebChromeClient(new WebChromeClient() {
                public final void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    TJSplitWebView.this.f22101o.setProgress(i);
                    TJSplitWebView.this.isFirstOrLastPage();
                }
            });
        }
        addView(this.f22087a, layoutParams);
    }

    public void addToolbar() {
        RelativeLayout relativeLayout = new RelativeLayout(this.f22097k);
        this.f22099m = relativeLayout;
        relativeLayout.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale() * 40.0f));
        layoutParams.addRule(6);
        this.f22099m.setBackgroundColor(-1);
        this.f22099m.setVisibility(0);
        setupToolbarUI();
        addView(this.f22099m, layoutParams);
    }

    public void addProgressBar() {
        ProgressBar progressBar = new ProgressBar(this.f22097k, (AttributeSet) null, 16842872);
        this.f22101o = progressBar;
        progressBar.setMax(100);
        this.f22101o.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#5d95ff")));
        this.f22101o.setProgressBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#dddddd")));
        addView(this.f22101o);
    }

    public void addLineBreak() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f22100n = frameLayout;
        frameLayout.setBackgroundColor(Color.parseColor("#dddddd"));
        addView(this.f22100n);
    }

    public void setupToolbarUI() {
        float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        TJImageButton tJImageButton = new TJImageButton(this.f22097k);
        this.f22103q = tJImageButton;
        tJImageButton.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        int i = (int) (10.0f * screenDensityScale);
        layoutParams.setMargins(i, i, i, i);
        int i2 = (int) (5.0f * screenDensityScale);
        this.f22103q.setPadding(i2, i, i, i);
        this.f22103q.setEnabledImageBitmap(TapjoyIcons.getBackEnabledImage(screenDensityScale));
        this.f22103q.setDisableImageBitmap(TapjoyIcons.getBackDisabledImage(screenDensityScale));
        this.f22103q.setBackgroundColor(0);
        this.f22103q.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (TJSplitWebView.this.f22087a.canGoBack()) {
                    TJSplitWebView.this.f22087a.goBack();
                }
            }
        });
        relativeLayout.addView(this.f22103q, layoutParams);
        this.f22104r = new TJImageButton(this.f22097k);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, this.f22103q.getId());
        layoutParams2.setMargins(i, i, i, i);
        this.f22104r.setPadding(i, i, i2, i);
        this.f22104r.setEnabledImageBitmap(TapjoyIcons.getForwardEnabledImage(screenDensityScale));
        this.f22104r.setDisableImageBitmap(TapjoyIcons.getForwardDisabledImage(screenDensityScale));
        this.f22104r.setBackgroundColor(0);
        this.f22104r.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.f22087a.goForward();
            }
        });
        relativeLayout.addView(this.f22104r, layoutParams2);
        ImageButton imageButton = new ImageButton(this.f22097k);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(i, i, i, i);
        imageButton.setPadding(i2, i2, i2, i2);
        imageButton.setImageBitmap(TapjoyIcons.getCloseImage(screenDensityScale));
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.mo57613a();
            }
        });
        relativeLayout.addView(imageButton, layoutParams3);
        TextView textView = new TextView(this.f22097k);
        this.f22102p = textView;
        textView.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(13);
        this.f22102p.setMaxLines(1);
        this.f22102p.setMaxEms(200);
        this.f22102p.setTextAlignment(4);
        this.f22102p.setTextColor(Color.parseColor("#5d95ff"));
        this.f22102p.setBackgroundColor(0);
        this.f22102p.setEnabled(false);
        this.f22102p.setTypeface(Typeface.create("sans-serif-medium", 0));
        relativeLayout.addView(this.f22102p, layoutParams4);
        ImageButton imageButton2 = new ImageButton(this.f22097k);
        imageButton2.setId(TapjoyUtil.generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(1, this.f22102p.getId());
        layoutParams5.addRule(15);
        imageButton2.setPadding(i2, i2, i2, i2);
        imageButton2.setImageBitmap(TapjoyIcons.getOpenBrowserImage(screenDensityScale));
        imageButton2.setBackgroundColor(0);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TJSplitWebView.this.openInExternalBrowser();
            }
        });
        relativeLayout.addView(imageButton2, layoutParams5);
        this.f22099m.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -2));
    }

    public void openInExternalBrowser() {
        Uri uri;
        if (C9465jq.m25449c(this.f22105s)) {
            uri = Uri.parse(this.f22087a.getUrl());
            if (uri == null) {
                uri = Uri.parse(getLastUrl());
            }
        } else {
            uri = Uri.parse(this.f22105s);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        if (this.f22087a.getContext() != null) {
            try {
                this.f22087a.getContext().startActivity(intent);
            } catch (Exception e) {
                TapjoyLog.m24273d("TJSplitWebView", e.getMessage());
            }
        }
    }

    public boolean goBack() {
        if (!this.f22087a.canGoBack()) {
            return false;
        }
        this.f22087a.goBack();
        return true;
    }

    public void isFirstOrLastPage() {
        this.f22103q.setEnabled(this.f22087a.canGoBack());
        this.f22104r.setEnabled(this.f22087a.canGoForward());
    }

    public void showErrorDialog() {
        new AlertDialog.Builder(this.f22097k, 16974394).setMessage(this.f22107u).setPositiveButton(this.f22108v, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setNegativeButton(this.f22109w, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (C9465jq.m25449c(TJSplitWebView.this.getLastUrl())) {
                    TJSplitWebView tJSplitWebView = TJSplitWebView.this;
                    tJSplitWebView.loadUrl(tJSplitWebView.f22090d);
                } else {
                    TJSplitWebView tJSplitWebView2 = TJSplitWebView.this;
                    tJSplitWebView2.loadUrl(tJSplitWebView2.getLastUrl());
                }
                dialogInterface.cancel();
            }
        }).create().show();
    }

    public void applyLayoutOption(JSONObject jSONObject) {
        setLayoutOption(jSONObject);
        m24222a(getWidth(), getHeight());
    }

    public void setExitHosts(JSONArray jSONArray) {
        if (jSONArray == null) {
            this.f22094h = null;
            return;
        }
        this.f22094h = new HashSet();
        for (int i = 0; i <= jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (optString != null) {
                this.f22094h.add(optString);
            }
        }
    }

    public void setErrorDialog(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f22106t = true;
            this.f22107u = jSONObject.optString("description");
            this.f22108v = jSONObject.optString("close");
            this.f22109w = jSONObject.optString("reload");
        }
    }

    public void setUserAgent(String str) {
        this.f22087a.getSettings().setUserAgentString(str);
    }

    public void setTrigger(String str, String str2) {
        this.f22092f = C9465jq.m25448b(str);
        this.f22093g = str2 != null ? Uri.parse(str2) : null;
    }

    public void loadUrl(String str) {
        TJWebView tJWebView = this.f22087a;
        if (tJWebView != null) {
            this.f22090d = str;
            this.f22091e = str;
            tJWebView.loadUrl(str);
        }
    }

    public String getLastUrl() {
        return this.f22091e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57613a() {
        this.f22096j.dismissSplitView((JSONObject) null, (String) null);
    }

    /* access modifiers changed from: protected */
    public void setLayoutOption(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("landscape");
            C9038a aVar = null;
            this.f22089c = optJSONObject != null ? new C9038a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("portrait");
            if (optJSONObject2 != null) {
                aVar = new C9038a(optJSONObject2);
            }
            this.f22088b = aVar;
        }
    }

    /* renamed from: a */
    private void m24222a(int i, int i2) {
        C9038a aVar = i <= i2 ? this.f22088b : this.f22089c;
        if (aVar == null) {
            this.f22087a.setVisibility(4);
            return;
        }
        double d = (double) i;
        int i3 = (int) (aVar.f22119a * d);
        double d2 = (double) i2;
        int i4 = (int) (aVar.f22120b * d2);
        if (i3 == 0 || i4 == 0) {
            this.f22087a.setVisibility(4);
            return;
        }
        int i5 = (int) (d * aVar.f22121c);
        int i6 = (int) (d2 * aVar.f22122d);
        int i7 = (i - i3) - i5;
        int i8 = (i2 - i4) - i6;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22087a.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        Boolean bool = this.f22098l;
        if (bool == null || !bool.booleanValue()) {
            layoutParams.setMargins(i5, i6, i7, i8);
        } else {
            float screenDensityScale = new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale();
            int height = ((int) (40.0f * screenDensityScale)) + this.f22100n.getHeight();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f22099m.getLayoutParams();
            layoutParams2.setMargins(i5, i6, i7, i8);
            this.f22099m.setLayoutParams(layoutParams2);
            layoutParams.setMargins(i5, i6 + height, i7, i8);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i3, (int) screenDensityScale);
            layoutParams3.setMargins(i5, layoutParams.topMargin - this.f22101o.getHeight(), i7, i8);
            this.f22101o.setLayoutParams(layoutParams3);
            this.f22100n.setLayoutParams(layoutParams3);
        }
        this.f22087a.setLayoutParams(layoutParams);
        this.f22087a.setVisibility(0);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (aVar.f22123e > 0.0f) {
            float[] fArr = new float[8];
            final float f = aVar.f22123e * getResources().getDisplayMetrics().density;
            Boolean bool2 = this.f22098l;
            if (bool2 == null || !bool2.booleanValue()) {
                Arrays.fill(fArr, f);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(-1);
                this.f22087a.setBackground(shapeDrawable);
                this.f22087a.setClipToOutline(true);
                return;
            }
            this.f22099m.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    int width = view.getWidth();
                    float f = f;
                    outline.setRoundRect(0, 0, width, (int) (((float) view.getHeight()) + f), f);
                }
            });
            this.f22099m.setClipToOutline(true);
            return;
        }
        this.f22087a.setBackground((Drawable) null);
        this.f22087a.setClipToOutline(false);
        Boolean bool3 = this.f22098l;
        if (bool3 != null && bool3.booleanValue()) {
            this.f22099m.setClipToOutline(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m24222a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    /* renamed from: com.tapjoy.TJSplitWebView$a */
    static class C9038a {

        /* renamed from: a */
        final double f22119a;

        /* renamed from: b */
        final double f22120b;

        /* renamed from: c */
        final double f22121c;

        /* renamed from: d */
        final double f22122d;

        /* renamed from: e */
        final float f22123e;

        C9038a(JSONObject jSONObject) {
            this.f22119a = jSONObject.optDouble("width", 0.0d);
            this.f22120b = jSONObject.optDouble("height", 0.0d);
            this.f22121c = jSONObject.optDouble("left", 0.0d);
            this.f22122d = jSONObject.optDouble("top", 0.0d);
            this.f22123e = (float) jSONObject.optDouble("cornerRadius", 0.0d);
        }
    }

    public void animateOpen(ViewGroup viewGroup) {
        JSONObject jSONObject = this.f22095i;
        if (jSONObject != null && jSONObject.has(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN) && this.f22095i.optString(TJAdUnitConstants.String.ANIMATION_EVENT_ON_OPEN).equalsIgnoreCase(TJAdUnitConstants.String.ANIMATION_TYPE_SLIDE_UP)) {
            setY((float) viewGroup.getHeight());
            animate().translationY(0.0f);
        }
    }

    /* renamed from: com.tapjoy.TJSplitWebView$b */
    class C9039b extends WebViewClient {
        private C9039b() {
        }

        /* synthetic */ C9039b(TJSplitWebView tJSplitWebView, byte b) {
            this();
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TJSplitWebView.this.f22098l.booleanValue()) {
                TJSplitWebView.this.f22102p.setText(TapjoyUrlFormatter.getDomain(str));
                TJSplitWebView.this.f22101o.setVisibility(0);
            }
            TapjoyLog.m24273d("TJSplitWebView", "onPageStarted: " + str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            TapjoyLog.m24273d("TJSplitWebView", "shouldOverrideUrlLoading: " + str);
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String scheme = parse.getScheme();
                if (!(scheme == null || host == null || ((!scheme.equals("http") && !scheme.equals("https")) || (TJSplitWebView.this.f22094h != null && TJSplitWebView.this.f22094h.contains(host))))) {
                    String unused = TJSplitWebView.this.f22091e = str;
                    return false;
                }
            }
            try {
                TJSplitWebView.this.f22097k.startActivity(new Intent("android.intent.action.VIEW", parse));
                if (TJSplitWebView.this.f22098l.booleanValue()) {
                    return true;
                }
                TJSplitWebView.this.mo57613a();
                return true;
            } catch (Exception e) {
                TapjoyLog.m24275e("TJSplitWebView", e.getMessage());
                return true;
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            String h = TJSplitWebView.this.f22092f;
            Uri i = TJSplitWebView.this.f22093g;
            if (!(h == null || i == null || str == null || !str.startsWith(h))) {
                TJSplitWebView.this.f22097k.startActivity(new Intent("android.intent.action.VIEW", i));
                TJSplitWebView.this.mo57613a();
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.m24273d("TJSplitWebView", "onReceivedError: " + str2 + " firstUrl:" + TJSplitWebView.this.f22090d);
            if (TJSplitWebView.this.f22106t) {
                TJSplitWebView.this.showErrorDialog();
            } else if (str2.equals(TJSplitWebView.this.f22090d)) {
                TJSplitWebView.this.mo57613a();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (TJSplitWebView.this.f22098l.booleanValue()) {
                if (TJSplitWebView.this.f22101o != null) {
                    TJSplitWebView.this.f22101o.setProgress(0);
                    TJSplitWebView.this.f22101o.setVisibility(8);
                }
                TJSplitWebView.this.isFirstOrLastPage();
            }
        }
    }
}
