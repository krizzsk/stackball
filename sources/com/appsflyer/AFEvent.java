package com.appsflyer;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

public abstract class AFEvent {
    public final Map<String, Object> params;

    /* renamed from: ı */
    String f3939;

    /* renamed from: Ɩ */
    private AppsFlyerRequestListener f3940;

    /* renamed from: ǃ */
    String f3941;

    /* renamed from: ȷ */
    private String f3942;

    /* renamed from: ɨ */
    private byte[] f3943;

    /* renamed from: ɩ */
    String f3944;

    /* renamed from: ɹ */
    String f3945;

    /* renamed from: ɾ */
    private Application f3946;

    /* renamed from: Ι */
    Map<String, Object> f3947;

    /* renamed from: ι */
    String f3948;

    /* renamed from: І */
    boolean f3949;

    /* renamed from: і */
    private final boolean f3950;

    /* renamed from: Ӏ */
    public int f3951;

    public AFEvent() {
        this((String) null, (Boolean) null, (Context) null);
    }

    public AFEvent(String str, Boolean bool, Context context) {
        this.params = new HashMap();
        this.f3939 = str;
        this.f3950 = bool != null ? bool.booleanValue() : true;
        context(context);
    }

    /* access modifiers changed from: protected */
    public AFEvent context(Context context) {
        if (context != null) {
            this.f3946 = (Application) context.getApplicationContext();
        }
        return this;
    }

    public Application context() {
        return this.f3946;
    }

    public AFEvent urlString(String str) {
        this.f3945 = str;
        return this;
    }

    /* access modifiers changed from: protected */
    public String urlString() {
        return this.f3945;
    }

    public AFEvent requestListener(AppsFlyerRequestListener appsFlyerRequestListener) {
        this.f3940 = appsFlyerRequestListener;
        return this;
    }

    public AppsFlyerRequestListener getRequestListener() {
        return this.f3940;
    }

    /* access modifiers changed from: protected */
    public AFEvent key(String str) {
        this.f3942 = str;
        return this;
    }

    public String key() {
        return this.f3942;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ */
    public final boolean mo13838() {
        return this.f3949;
    }

    /* access modifiers changed from: protected */
    public AFEvent addParams(Map<String, ?> map) {
        this.params.putAll(map);
        return this;
    }

    public Map<String, Object> params() {
        return this.params;
    }

    public AFEvent post(byte[] bArr) {
        this.f3943 = bArr;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final byte[] mo13839() {
        return this.f3943;
    }

    public boolean isEncrypt() {
        return this.f3950;
    }

    /* access modifiers changed from: protected */
    public String addChannel(String str) {
        String configuredChannel = AppsFlyerLibCore.getInstance().getConfiguredChannel(context());
        return configuredChannel != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", configuredChannel).build().toString() : str;
    }
}
