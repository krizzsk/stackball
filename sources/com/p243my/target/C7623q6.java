package com.p243my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.net.URI;

/* renamed from: com.my.target.q6 */
public class C7623q6 extends LinearLayout {

    /* renamed from: a */
    public static final int f19257a = C7761y8.m20948c();

    /* renamed from: b */
    public static final int f19258b = C7761y8.m20948c();

    /* renamed from: c */
    public final C7761y8 f19259c;

    /* renamed from: d */
    public final ImageButton f19260d;

    /* renamed from: e */
    public final LinearLayout f19261e;

    /* renamed from: f */
    public final TextView f19262f;

    /* renamed from: g */
    public final TextView f19263g;

    /* renamed from: h */
    public final FrameLayout f19264h;

    /* renamed from: i */
    public final View f19265i;

    /* renamed from: j */
    public final FrameLayout f19266j;

    /* renamed from: k */
    public final ImageButton f19267k;

    /* renamed from: l */
    public final RelativeLayout f19268l;

    /* renamed from: m */
    public final C7307a6 f19269m;

    /* renamed from: n */
    public final ProgressBar f19270n;

    /* renamed from: o */
    public C7627d f19271o;

    /* renamed from: com.my.target.q6$a */
    public class C7624a extends WebViewClient {
        public C7624a() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            C7623q6.this.f19262f.setText(C7623q6.this.mo51426a(str));
            return true;
        }
    }

    /* renamed from: com.my.target.q6$b */
    public class C7625b extends WebChromeClient {
        public C7625b() {
        }

        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && C7623q6.this.f19270n.getVisibility() == 8) {
                C7623q6.this.f19270n.setVisibility(0);
                C7623q6.this.f19265i.setVisibility(8);
            }
            C7623q6.this.f19270n.setProgress(i);
            if (i >= 100) {
                C7623q6.this.f19270n.setVisibility(8);
                C7623q6.this.f19265i.setVisibility(0);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            C7623q6.this.f19263g.setText(webView.getTitle());
            C7623q6.this.f19263g.setVisibility(0);
        }
    }

    /* renamed from: com.my.target.q6$c */
    public class C7626c implements View.OnClickListener {
        public C7626c() {
        }

        public /* synthetic */ C7626c(C7623q6 q6Var, C7624a aVar) {
            this();
        }

        public void onClick(View view) {
            if (view == C7623q6.this.f19260d) {
                if (C7623q6.this.f19271o != null) {
                    C7623q6.this.f19271o.mo49447a();
                }
            } else if (view == C7623q6.this.f19267k) {
                C7623q6.this.mo51431e();
            }
        }
    }

    /* renamed from: com.my.target.q6$d */
    public interface C7627d {
        /* renamed from: a */
        void mo49447a();
    }

    public C7623q6(Context context) {
        super(context);
        this.f19268l = new RelativeLayout(context);
        this.f19269m = new C7307a6(context);
        this.f19260d = new ImageButton(context);
        this.f19261e = new LinearLayout(context);
        this.f19262f = new TextView(context);
        this.f19263g = new TextView(context);
        this.f19264h = new FrameLayout(context);
        this.f19266j = new FrameLayout(context);
        this.f19267k = new ImageButton(context);
        this.f19270n = new ProgressBar(context, (AttributeSet) null, 16842872);
        this.f19265i = new View(context);
        this.f19259c = C7761y8.m20950c(context);
    }

    /* renamed from: a */
    public final String mo51426a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public boolean mo51427a() {
        return this.f19269m.mo49587a();
    }

    /* renamed from: b */
    public void mo51428b() {
        this.f19269m.setWebChromeClient((WebChromeClient) null);
        this.f19269m.mo49584a(0);
    }

    /* renamed from: c */
    public void mo51429c() {
        this.f19269m.mo49588b();
    }

    /* renamed from: d */
    public void mo51430d() {
        WebSettings settings = this.f19269m.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            if (Build.VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        }
        this.f19269m.setWebViewClient(new C7624a());
        this.f19269m.setWebChromeClient(new C7625b());
        mo51432f();
    }

    /* renamed from: e */
    public final void mo51431e() {
        String url = this.f19269m.getUrl();
        if (!TextUtils.isEmpty(url)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                if (!(getContext() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                getContext().startActivity(intent);
            } catch (Throwable unused) {
                C7374e0.m18989a("unable to open url " + url);
            }
        }
    }

    /* renamed from: f */
    public final void mo51432f() {
        setOrientation(1);
        setGravity(16);
        C7626c cVar = new C7626c(this, (C7624a) null);
        this.f19269m.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        int b = this.f19259c.mo51902b(50);
        if (getContext().getTheme().resolveAttribute(16843499, typedValue, true)) {
            b = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.f19268l.setLayoutParams(new LinearLayout.LayoutParams(-1, b));
        this.f19264h.setLayoutParams(new LinearLayout.LayoutParams(b, b));
        FrameLayout frameLayout = this.f19264h;
        int i = f19257a;
        frameLayout.setId(i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f19260d.setLayoutParams(layoutParams);
        this.f19260d.setImageBitmap(C7607p5.m20093a(b / 4, this.f19259c.mo51902b(2)));
        this.f19260d.setContentDescription("Close");
        this.f19260d.setOnClickListener(cVar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b, b);
        layoutParams2.addRule(Build.VERSION.SDK_INT >= 18 ? 21 : 11);
        this.f19266j.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.f19266j;
        int i2 = f19258b;
        frameLayout2.setId(i2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f19267k.setLayoutParams(layoutParams3);
        this.f19267k.setImageBitmap(C7607p5.m20095b(getContext()));
        this.f19267k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f19267k.setContentDescription("Open outside");
        this.f19267k.setOnClickListener(cVar);
        C7761y8.m20936a((View) this.f19260d, 0, -3355444);
        C7761y8.m20936a((View) this.f19267k, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(1, i);
        layoutParams4.addRule(0, i2);
        this.f19261e.setLayoutParams(layoutParams4);
        this.f19261e.setOrientation(1);
        this.f19261e.setPadding(this.f19259c.mo51902b(4), this.f19259c.mo51902b(4), this.f19259c.mo51902b(4), this.f19259c.mo51902b(4));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        this.f19263g.setVisibility(8);
        this.f19263g.setLayoutParams(layoutParams5);
        this.f19263g.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f19263g.setTextSize(2, 18.0f);
        this.f19263g.setSingleLine();
        this.f19263g.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.f19262f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f19262f.setSingleLine();
        this.f19262f.setTextSize(2, 12.0f);
        this.f19262f.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        LayerDrawable layerDrawable = (LayerDrawable) this.f19270n.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(16908288, colorDrawable);
        layerDrawable.setDrawableByLayerId(16908301, clipDrawable);
        this.f19270n.setProgressDrawable(layerDrawable);
        this.f19270n.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f19259c.mo51902b(2)));
        this.f19270n.setProgress(0);
        this.f19261e.addView(this.f19263g);
        this.f19261e.addView(this.f19262f);
        this.f19264h.addView(this.f19260d);
        this.f19266j.addView(this.f19267k);
        this.f19268l.addView(this.f19264h);
        this.f19268l.addView(this.f19261e);
        this.f19268l.addView(this.f19266j);
        addView(this.f19268l);
        this.f19265i.setBackgroundColor(-5592406);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, 1);
        this.f19265i.setVisibility(8);
        this.f19265i.setLayoutParams(layoutParams6);
        addView(this.f19270n);
        addView(this.f19265i);
        addView(this.f19269m);
    }

    public void setListener(C7627d dVar) {
        this.f19271o = dVar;
    }

    public void setUrl(String str) {
        this.f19269m.mo49585a(str);
        this.f19262f.setText(mo51426a(str));
    }
}
