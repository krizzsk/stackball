package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1428p;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a */
    private final C1469j f2614a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicBoolean f2615b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f2616c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AppLovinVariableService.OnVariablesUpdateListener f2617d;

    /* renamed from: e */
    private Bundle f2618e;

    /* renamed from: f */
    private final Object f2619f = new Object();

    VariableServiceImpl(C1469j jVar) {
        this.f2614a = jVar;
        String str = (String) jVar.mo13089a(C1371e.f3157i);
        if (C1553o.m3554b(str)) {
            updateVariables(C1521i.m3471a(str, jVar));
        }
    }

    /* renamed from: a */
    private Object m2359a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            C1505q.m3345i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.f2614a.mo13120d()) {
            C1505q.m3344h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f2619f) {
            if (this.f2618e == null) {
                C1505q.m3345i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\", none retrieved from server yet. Please set a listener to be notified when values are retrieved from the server.");
                return obj;
            } else if (cls.equals(String.class)) {
                String string = this.f2618e.getString(str, (String) obj);
                return string;
            } else if (cls.equals(Boolean.class)) {
                Boolean valueOf = Boolean.valueOf(this.f2618e.getBoolean(str, ((Boolean) obj).booleanValue()));
                return valueOf;
            } else {
                throw new IllegalStateException("Unable to retrieve variable value for " + str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2361a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2619f
            monitor-enter(r0)
            com.applovin.sdk.AppLovinVariableService$OnVariablesUpdateListener r1 = r4.f2617d     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001f
            android.os.Bundle r1 = r4.f2618e     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            android.os.Bundle r1 = r4.f2618e     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r1.clone()     // Catch:{ all -> 0x0021 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ all -> 0x0021 }
            r2 = 1
            com.applovin.impl.sdk.VariableServiceImpl$2 r3 = new com.applovin.impl.sdk.VariableServiceImpl$2     // Catch:{ all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ all -> 0x0021 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r2, r3)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.VariableServiceImpl.m2361a():void");
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) m2359a(str, Boolean.valueOf(z), Boolean.class)).booleanValue();
    }

    public String getString(String str) {
        return getString(str, (String) null);
    }

    public String getString(String str, String str2) {
        return (String) m2359a(str, str2, String.class);
    }

    public void loadVariables() {
        String str;
        if (!this.f2614a.mo13120d()) {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        } else if (this.f2615b.compareAndSet(false, true)) {
            this.f2614a.mo13071K().mo13014a((C1392a) new C1428p(this.f2614a, new C1428p.C1430a() {
                /* renamed from: a */
                public void mo12599a() {
                    VariableServiceImpl.this.f2615b.set(false);
                }
            }), C1435s.C1437a.BACKGROUND);
            return;
        } else {
            str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
        }
        C1505q.m3345i("AppLovinVariableService", str);
    }

    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f2617d = onVariablesUpdateListener;
        synchronized (this.f2619f) {
            if (onVariablesUpdateListener != null) {
                if (this.f2618e != null && this.f2616c.compareAndSet(false, true)) {
                    this.f2614a.mo13139v().mo13277b("AppLovinVariableService", "Setting initial listener");
                    m2361a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.f2618e + ", listener=" + this.f2617d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        C1505q v = this.f2614a.mo13139v();
        v.mo13277b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        synchronized (this.f2619f) {
            this.f2618e = C1521i.m3494c(jSONObject);
            m2361a();
            this.f2614a.mo13095a(C1371e.f3157i, jSONObject.toString());
        }
    }
}
