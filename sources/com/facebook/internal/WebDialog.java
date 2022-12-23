package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.common.C2100R;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginTargetApp;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

public class WebDialog extends Dialog {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int BACKGROUND_GRAY = -872415232;
    private static final int DEFAULT_THEME = C2100R.style.com_facebook_activity_theme;
    static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    private static final String DISPLAY_TOUCH = "touch";
    private static final String LOG_TAG = "FacebookSDK.WebDialog";
    private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
    private static final int MAX_PADDING_SCREEN_WIDTH = 800;
    private static final double MIN_SCALE_FACTOR = 0.5d;
    private static final int NO_PADDING_SCREEN_HEIGHT = 800;
    private static final int NO_PADDING_SCREEN_WIDTH = 480;
    private static final String PLATFORM_DIALOG_PATH_REGEX = "^/(v\\d+\\.\\d+/)??dialog/.*";
    private static InitCallback initCallback;
    private static volatile int webDialogTheme;
    /* access modifiers changed from: private */
    public FrameLayout contentFrameLayout;
    /* access modifiers changed from: private */
    public ImageView crossImageView;
    /* access modifiers changed from: private */
    public String expectedRedirectUrl;
    /* access modifiers changed from: private */
    public boolean isDetached;
    /* access modifiers changed from: private */
    public boolean isPageFinished;
    private boolean listenerCalled;
    private OnCompleteListener onCompleteListener;
    /* access modifiers changed from: private */
    public ProgressDialog spinner;
    private UploadStagingResourcesTask uploadTask;
    /* access modifiers changed from: private */
    public String url;
    /* access modifiers changed from: private */
    public WebView webView;
    private WindowManager.LayoutParams windowParams;

    public interface InitCallback {
        void onInit(WebView webView);
    }

    public interface OnCompleteListener {
        void onComplete(Bundle bundle, FacebookException facebookException);
    }

    private int getScaledSize(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = MIN_SCALE_FACTOR;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = MIN_SCALE_FACTOR + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * MIN_SCALE_FACTOR);
        }
        return (int) (((double) i) * d);
    }

    protected static void initDefaultTheme(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null && webDialogTheme == 0) {
                    setWebDialogTheme(applicationInfo.metaData.getInt(FacebookSdk.WEB_DIALOG_THEME));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    public static WebDialog newInstance(Context context, String str, Bundle bundle, int i, OnCompleteListener onCompleteListener2) {
        initDefaultTheme(context);
        return new WebDialog(context, str, bundle, i, LoginTargetApp.FACEBOOK, onCompleteListener2);
    }

    public static WebDialog newInstance(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener2) {
        initDefaultTheme(context);
        return new WebDialog(context, str, bundle, i, loginTargetApp, onCompleteListener2);
    }

    public static int getWebDialogTheme() {
        Validate.sdkInitialized();
        return webDialogTheme;
    }

    public static void setWebDialogTheme(int i) {
        if (i == 0) {
            i = DEFAULT_THEME;
        }
        webDialogTheme = i;
    }

    protected WebDialog(Context context, String str) {
        this(context, str, getWebDialogTheme());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WebDialog(Context context, String str, int i) {
        super(context, i == 0 ? getWebDialogTheme() : i);
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        this.listenerCalled = false;
        this.isDetached = false;
        this.isPageFinished = false;
        this.url = str;
    }

    private WebDialog(Context context, String str, Bundle bundle, int i, OnCompleteListener onCompleteListener2) {
        this(context, str, bundle, i, LoginTargetApp.FACEBOOK, onCompleteListener2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener2) {
        super(context, i == 0 ? getWebDialogTheme() : i);
        Uri uri;
        String str2 = ServerProtocol.DIALOG_REDIRECT_URI;
        this.expectedRedirectUrl = str2;
        this.listenerCalled = false;
        this.isDetached = false;
        this.isPageFinished = false;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = Utility.isChromeOS(context) ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : str2;
        this.expectedRedirectUrl = str2;
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{FacebookSdk.getSdkVersion()}));
        this.onCompleteListener = onCompleteListener2;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            if (C21525.$SwitchMap$com$facebook$login$LoginTargetApp[loginTargetApp.ordinal()] != 1) {
                String dialogAuthority = ServerProtocol.getDialogAuthority();
                uri = Utility.buildUri(dialogAuthority, FacebookSdk.getGraphApiVersion() + "/" + ServerProtocol.DIALOG_PATH + str, bundle);
            } else {
                uri = Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
            }
            this.url = uri.toString();
            return;
        }
        this.uploadTask = new UploadStagingResourcesTask(str, bundle);
    }

    /* renamed from: com.facebook.internal.WebDialog$5 */
    static /* synthetic */ class C21525 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$login$LoginTargetApp;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            $SwitchMap$com$facebook$login$LoginTargetApp = iArr;
            try {
                iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public void setOnCompleteListener(OnCompleteListener onCompleteListener2) {
        this.onCompleteListener = onCompleteListener2;
    }

    public OnCompleteListener getOnCompleteListener() {
        return this.onCompleteListener;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WebView webView2 = this.webView;
            if (webView2 == null || !webView2.canGoBack()) {
                cancel();
            } else {
                this.webView.goBack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            this.spinner.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask == null || uploadStagingResourcesTask.getStatus() != AsyncTask.Status.PENDING) {
            resize();
            return;
        }
        this.uploadTask.execute(new Void[0]);
        this.spinner.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask != null) {
            uploadStagingResourcesTask.cancel(true);
            this.spinner.dismiss();
        }
        super.onStop();
    }

    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.isDetached = false;
        if (Utility.mustFixWindowParamsForAutofill(getContext()) && (layoutParams = this.windowParams) != null && layoutParams.token == null) {
            this.windowParams.token = getOwnerActivity().getWindow().getAttributes().token;
            Utility.logd(LOG_TAG, "Set token on onAttachedToWindow(): " + this.windowParams.token);
        }
        super.onAttachedToWindow();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.windowParams = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.spinner.setMessage(getContext().getString(C2100R.string.com_facebook_loading));
        this.spinner.setCanceledOnTouchOutside(false);
        this.spinner.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                WebDialog.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        resize();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        createCrossImage();
        if (this.url != null) {
            setUpWebView((this.crossImageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.contentFrameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.contentFrameLayout);
    }

    /* access modifiers changed from: protected */
    public void setExpectedRedirectUrl(String str) {
        this.expectedRedirectUrl = str;
    }

    /* access modifiers changed from: protected */
    public Bundle parseResponseUri(String str) {
        Uri parse = Uri.parse(str);
        Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
        return parseUrlQueryString;
    }

    /* access modifiers changed from: protected */
    public boolean isListenerCalled() {
        return this.listenerCalled;
    }

    /* access modifiers changed from: protected */
    public boolean isPageFinished() {
        return this.isPageFinished;
    }

    /* access modifiers changed from: protected */
    public WebView getWebView() {
        return this.webView;
    }

    public void resize() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(getScaledSize(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, NO_PADDING_SCREEN_WIDTH, 800), displayMetrics.widthPixels), Math.min(getScaledSize(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, MAX_PADDING_SCREEN_HEIGHT), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    public void sendSuccessToListener(Bundle bundle) {
        OnCompleteListener onCompleteListener2 = this.onCompleteListener;
        if (onCompleteListener2 != null && !this.listenerCalled) {
            this.listenerCalled = true;
            onCompleteListener2.onComplete(bundle, (FacebookException) null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void sendErrorToListener(Throwable th) {
        FacebookException facebookException;
        if (this.onCompleteListener != null && !this.listenerCalled) {
            this.listenerCalled = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.onCompleteListener.onComplete((Bundle) null, facebookException);
            dismiss();
        }
    }

    public void cancel() {
        if (this.onCompleteListener != null && !this.listenerCalled) {
            sendErrorToListener(new FacebookOperationCanceledException());
        }
    }

    private void createCrossImage() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!CrashShieldHandler.isObjectCrashing(this)) {
                    try {
                        WebDialog.this.cancel();
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            }
        });
        this.crossImageView.setImageDrawable(getContext().getResources().getDrawable(C2100R.C2101drawable.com_facebook_close));
        this.crossImageView.setVisibility(4);
    }

    /* access modifiers changed from: private */
    public void setUpWebView(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        C21503 r1 = new WebView(getContext()) {
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.webView = r1;
        InitCallback initCallback2 = initCallback;
        if (initCallback2 != null) {
            initCallback2.onInit(r1);
        }
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.setWebViewClient(new DialogWebViewClient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.loadUrl(this.url);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.webView.setVisibility(4);
        this.webView.getSettings().setSavePassword(false);
        this.webView.getSettings().setSaveFormData(false);
        this.webView.setFocusable(true);
        this.webView.setFocusableInTouchMode(true);
        this.webView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(BACKGROUND_GRAY);
        this.contentFrameLayout.addView(linearLayout);
    }

    public static void setInitCallback(InitCallback initCallback2) {
        initCallback = initCallback2;
    }

    private class DialogWebViewClient extends WebViewClient {
        private DialogWebViewClient() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                com.facebook.internal.Utility.logd((java.lang.String) r0, (java.lang.String) r6)
                android.net.Uri r6 = android.net.Uri.parse(r7)
                java.lang.String r0 = r6.getPath()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0030
                java.lang.String r6 = r6.getPath()
                java.lang.String r0 = "^/(v\\d+\\.\\d+/)??dialog/.*"
                boolean r6 = java.util.regex.Pattern.matches(r0, r6)
                if (r6 == 0) goto L_0x0030
                r6 = 1
                goto L_0x0031
            L_0x0030:
                r6 = 0
            L_0x0031:
                com.facebook.internal.WebDialog r0 = com.facebook.internal.WebDialog.this
                java.lang.String r0 = r0.expectedRedirectUrl
                boolean r0 = r7.startsWith(r0)
                if (r0 == 0) goto L_0x00c0
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                android.os.Bundle r6 = r6.parseResponseUri(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0051
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0051:
                java.lang.String r0 = "error_msg"
                java.lang.String r0 = r6.getString(r0)
                if (r0 != 0) goto L_0x005f
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r6.getString(r0)
            L_0x005f:
                if (r0 != 0) goto L_0x0067
                java.lang.String r0 = "error_description"
                java.lang.String r0 = r6.getString(r0)
            L_0x0067:
                java.lang.String r1 = "error_code"
                java.lang.String r1 = r6.getString(r1)
                boolean r3 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r1)
                r4 = -1
                if (r3 != 0) goto L_0x0079
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0079 }
                goto L_0x007a
            L_0x0079:
                r1 = -1
            L_0x007a:
                boolean r3 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r7)
                if (r3 == 0) goto L_0x008e
                boolean r3 = com.facebook.internal.Utility.isNullOrEmpty((java.lang.String) r0)
                if (r3 == 0) goto L_0x008e
                if (r1 != r4) goto L_0x008e
                com.facebook.internal.WebDialog r7 = com.facebook.internal.WebDialog.this
                r7.sendSuccessToListener(r6)
                goto L_0x00bf
            L_0x008e:
                if (r7 == 0) goto L_0x00a6
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x00a0
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x00a6
            L_0x00a0:
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                r6.cancel()
                goto L_0x00bf
            L_0x00a6:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r1 != r6) goto L_0x00b0
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                r6.cancel()
                goto L_0x00bf
            L_0x00b0:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r1, r7, r0)
                com.facebook.internal.WebDialog r7 = com.facebook.internal.WebDialog.this
                com.facebook.FacebookServiceException r1 = new com.facebook.FacebookServiceException
                r1.<init>(r6, r0)
                r7.sendErrorToListener(r1)
            L_0x00bf:
                return r2
            L_0x00c0:
                java.lang.String r0 = "fbconnect://cancel"
                boolean r0 = r7.startsWith(r0)
                if (r0 == 0) goto L_0x00ce
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                r6.cancel()
                return r2
            L_0x00ce:
                if (r6 != 0) goto L_0x00ee
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                if (r6 == 0) goto L_0x00d9
                goto L_0x00ee
            L_0x00d9:
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this     // Catch:{ ActivityNotFoundException -> 0x00ee }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00ee }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00ee }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00ee }
                r0.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00ee }
                r6.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00ee }
                return r2
            L_0x00ee:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.DialogWebViewClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WebDialog.this.sendErrorToListener(new FacebookDialogException(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            WebDialog.this.sendErrorToListener(new FacebookDialogException((String) null, -11, (String) null));
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Utility.logd(WebDialog.LOG_TAG, "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!WebDialog.this.isDetached) {
                WebDialog.this.spinner.show();
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!WebDialog.this.isDetached) {
                WebDialog.this.spinner.dismiss();
            }
            WebDialog.this.contentFrameLayout.setBackgroundColor(0);
            WebDialog.this.webView.setVisibility(0);
            WebDialog.this.crossImageView.setVisibility(0);
            boolean unused = WebDialog.this.isPageFinished = true;
        }
    }

    public static class Builder {
        private AccessToken accessToken;
        private String action;
        private String applicationId;
        private Context context;
        private OnCompleteListener listener;
        private Bundle parameters;
        private int theme;

        public Builder(Context context2, String str, Bundle bundle) {
            this.accessToken = AccessToken.getCurrentAccessToken();
            if (!AccessToken.isCurrentAccessTokenActive()) {
                String metadataApplicationId = Utility.getMetadataApplicationId(context2);
                if (metadataApplicationId != null) {
                    this.applicationId = metadataApplicationId;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            finishInit(context2, str, bundle);
        }

        public Builder(Context context2, String str, String str2, Bundle bundle) {
            str = str == null ? Utility.getMetadataApplicationId(context2) : str;
            Validate.notNullOrEmpty(str, "applicationId");
            this.applicationId = str;
            finishInit(context2, str2, bundle);
        }

        public Builder setTheme(int i) {
            this.theme = i;
            return this;
        }

        public Builder setOnCompleteListener(OnCompleteListener onCompleteListener) {
            this.listener = onCompleteListener;
            return this;
        }

        public WebDialog build() {
            AccessToken accessToken2 = this.accessToken;
            if (accessToken2 != null) {
                this.parameters.putString("app_id", accessToken2.getApplicationId());
                this.parameters.putString("access_token", this.accessToken.getToken());
            } else {
                this.parameters.putString("app_id", this.applicationId);
            }
            return WebDialog.newInstance(this.context, this.action, this.parameters, this.theme, this.listener);
        }

        public String getApplicationId() {
            return this.applicationId;
        }

        public Context getContext() {
            return this.context;
        }

        public int getTheme() {
            return this.theme;
        }

        public Bundle getParameters() {
            return this.parameters;
        }

        public OnCompleteListener getListener() {
            return this.listener;
        }

        private void finishInit(Context context2, String str, Bundle bundle) {
            this.context = context2;
            this.action = str;
            if (bundle != null) {
                this.parameters = bundle;
            } else {
                this.parameters = new Bundle();
            }
        }
    }

    private class UploadStagingResourcesTask extends AsyncTask<Void, Void, String[]> {
        private String action;
        /* access modifiers changed from: private */
        public Exception[] exceptions;
        private Bundle parameters;

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return doInBackground((Void[]) objArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    onPostExecute((String[]) obj);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        UploadStagingResourcesTask(String str, Bundle bundle) {
            this.action = str;
            this.parameters = bundle;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(2:28|26)|38|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r10 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
            if (r10.hasNext() != false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
            ((android.os.AsyncTask) r10.next()).cancel(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] doInBackground(java.lang.Void... r10) {
            /*
                r9 = this;
                boolean r10 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r9)
                r0 = 0
                if (r10 == 0) goto L_0x0008
                return r0
            L_0x0008:
                android.os.Bundle r10 = r9.parameters     // Catch:{ all -> 0x0089 }
                java.lang.String r1 = "media"
                java.lang.String[] r10 = r10.getStringArray(r1)     // Catch:{ all -> 0x0089 }
                int r1 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0089 }
                int r2 = r10.length     // Catch:{ all -> 0x0089 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x0089 }
                r9.exceptions = r2     // Catch:{ all -> 0x0089 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0089 }
                int r3 = r10.length     // Catch:{ all -> 0x0089 }
                r2.<init>(r3)     // Catch:{ all -> 0x0089 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0089 }
                r3.<init>()     // Catch:{ all -> 0x0089 }
                com.facebook.AccessToken r4 = com.facebook.AccessToken.getCurrentAccessToken()     // Catch:{ all -> 0x0089 }
                r5 = 0
            L_0x0028:
                r6 = 1
                int r7 = r10.length     // Catch:{ Exception -> 0x0074 }
                if (r5 >= r7) goto L_0x0070
                boolean r7 = r9.isCancelled()     // Catch:{ Exception -> 0x0074 }
                if (r7 == 0) goto L_0x0047
                java.util.Iterator r10 = r3.iterator()     // Catch:{ Exception -> 0x0074 }
            L_0x0036:
                boolean r1 = r10.hasNext()     // Catch:{ Exception -> 0x0074 }
                if (r1 == 0) goto L_0x0046
                java.lang.Object r1 = r10.next()     // Catch:{ Exception -> 0x0074 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ Exception -> 0x0074 }
                r1.cancel(r6)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0036
            L_0x0046:
                return r0
            L_0x0047:
                r7 = r10[r5]     // Catch:{ Exception -> 0x0074 }
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0074 }
                boolean r8 = com.facebook.internal.Utility.isWebUri(r7)     // Catch:{ Exception -> 0x0074 }
                if (r8 == 0) goto L_0x005d
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0074 }
                r1[r5] = r7     // Catch:{ Exception -> 0x0074 }
                r2.countDown()     // Catch:{ Exception -> 0x0074 }
                goto L_0x006d
            L_0x005d:
                com.facebook.internal.WebDialog$UploadStagingResourcesTask$1 r8 = new com.facebook.internal.WebDialog$UploadStagingResourcesTask$1     // Catch:{ Exception -> 0x0074 }
                r8.<init>(r1, r5, r2)     // Catch:{ Exception -> 0x0074 }
                com.facebook.GraphRequest r7 = com.facebook.share.internal.ShareInternalUtility.newUploadStagingResourceWithImageRequest((com.facebook.AccessToken) r4, (android.net.Uri) r7, (com.facebook.GraphRequest.Callback) r8)     // Catch:{ Exception -> 0x0074 }
                com.facebook.GraphRequestAsyncTask r7 = r7.executeAsync()     // Catch:{ Exception -> 0x0074 }
                r3.add(r7)     // Catch:{ Exception -> 0x0074 }
            L_0x006d:
                int r5 = r5 + 1
                goto L_0x0028
            L_0x0070:
                r2.await()     // Catch:{ Exception -> 0x0074 }
                return r1
            L_0x0074:
                java.util.Iterator r10 = r3.iterator()     // Catch:{ all -> 0x0089 }
            L_0x0078:
                boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0089 }
                if (r1 == 0) goto L_0x0088
                java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0089 }
                android.os.AsyncTask r1 = (android.os.AsyncTask) r1     // Catch:{ all -> 0x0089 }
                r1.cancel(r6)     // Catch:{ all -> 0x0089 }
                goto L_0x0078
            L_0x0088:
                return r0
            L_0x0089:
                r10 = move-exception
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r10, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.UploadStagingResourcesTask.doInBackground(java.lang.Void[]):java.lang.String[]");
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(String[] strArr) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    WebDialog.this.spinner.dismiss();
                    for (Exception exc : this.exceptions) {
                        if (exc != null) {
                            WebDialog.this.sendErrorToListener(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        WebDialog.this.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List asList = Arrays.asList(strArr);
                    if (asList.contains((Object) null)) {
                        WebDialog.this.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    Utility.putJSONValueInBundle(this.parameters, "media", new JSONArray(asList));
                    String unused = WebDialog.this.url = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/" + ServerProtocol.DIALOG_PATH + this.action, this.parameters).toString();
                    WebDialog.this.setUpWebView((WebDialog.this.crossImageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }
}
