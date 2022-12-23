package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJSetUserIDListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.TJVideoListener;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.er */
public abstract class C9223er {

    /* renamed from: c */
    private static final C9223er f22644c;

    /* renamed from: d */
    private static C9223er f22645d;

    /* renamed from: a */
    protected volatile boolean f22646a = false;

    /* renamed from: b */
    protected volatile boolean f22647b = false;

    /* renamed from: a */
    public abstract TJPlacement mo58027a(String str, TJPlacementListener tJPlacementListener);

    /* renamed from: a */
    public abstract void mo58028a(float f);

    /* renamed from: a */
    public abstract void mo58029a(int i);

    /* renamed from: a */
    public abstract void mo58030a(int i, TJAwardCurrencyListener tJAwardCurrencyListener);

    /* renamed from: a */
    public abstract void mo58031a(int i, TJSpendCurrencyListener tJSpendCurrencyListener);

    /* renamed from: a */
    public abstract void mo58032a(int i, String str);

    /* renamed from: a */
    public abstract void mo58033a(Activity activity);

    /* renamed from: a */
    public abstract void mo58034a(Context context, Map map);

    /* renamed from: a */
    public abstract void mo58035a(GLSurfaceView gLSurfaceView);

    /* renamed from: a */
    public abstract void mo58036a(TJEarnedCurrencyListener tJEarnedCurrencyListener);

    /* renamed from: a */
    public abstract void mo58037a(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener);

    /* renamed from: a */
    public abstract void mo58038a(TJVideoListener tJVideoListener);

    /* renamed from: a */
    public abstract void mo58039a(String str);

    /* renamed from: a */
    public abstract void mo58040a(String str, long j);

    /* renamed from: a */
    public abstract void mo58041a(String str, TJSetUserIDListener tJSetUserIDListener);

    /* renamed from: a */
    public abstract void mo58042a(String str, String str2);

    /* renamed from: a */
    public abstract void mo58043a(String str, String str2, double d, String str3);

    /* renamed from: a */
    public abstract void mo58044a(String str, String str2, long j);

    /* renamed from: a */
    public abstract void mo58045a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    public abstract void mo58046a(String str, String str2, String str3, String str4, long j);

    /* renamed from: a */
    public abstract void mo58047a(String str, String str2, String str3, String str4, String str5, long j);

    /* renamed from: a */
    public abstract void mo58048a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2);

    /* renamed from: a */
    public abstract void mo58049a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3);

    /* renamed from: a */
    public abstract void mo58050a(String str, String str2, String str3, String str4, Map map);

    /* renamed from: a */
    public abstract void mo58051a(Set set);

    /* renamed from: a */
    public abstract void mo58052a(boolean z);

    /* renamed from: a */
    public abstract boolean mo58053a(Context context, String str);

    /* renamed from: a */
    public abstract boolean mo58054a(Context context, String str, TJConnectListener tJConnectListener);

    /* renamed from: a */
    public abstract boolean mo58055a(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener);

    /* renamed from: b */
    public abstract TJPlacement mo58056b(String str, TJPlacementListener tJPlacementListener);

    /* renamed from: b */
    public abstract String mo58057b();

    /* renamed from: b */
    public abstract void mo58058b(int i);

    /* renamed from: b */
    public abstract void mo58059b(Activity activity);

    /* renamed from: b */
    public abstract void mo58060b(String str);

    /* renamed from: b */
    public abstract void mo58061b(String str, String str2, String str3, String str4);

    /* renamed from: b */
    public abstract void mo58062b(boolean z);

    /* renamed from: c */
    public abstract float mo58063c();

    /* renamed from: c */
    public abstract void mo58064c(Activity activity);

    /* renamed from: c */
    public abstract void mo58065c(String str);

    /* renamed from: c */
    public abstract void mo58066c(boolean z);

    /* renamed from: d */
    public abstract void mo58067d();

    /* renamed from: d */
    public abstract void mo58068d(String str);

    /* renamed from: d */
    public abstract void mo58069d(boolean z);

    /* renamed from: e */
    public abstract void mo58070e();

    /* renamed from: e */
    public abstract void mo58071e(String str);

    /* renamed from: f */
    public abstract Set mo58072f();

    /* renamed from: f */
    public abstract void mo58073f(String str);

    /* renamed from: g */
    public abstract String mo58074g(String str);

    /* renamed from: g */
    public abstract void mo58075g();

    /* renamed from: h */
    public abstract void mo58076h(String str);

    /* renamed from: h */
    public abstract boolean mo58077h();

    /* renamed from: i */
    public abstract void mo58078i(String str);

    /* renamed from: i */
    public abstract boolean mo58079i();

    /* renamed from: j */
    public abstract void mo58080j(String str);

    /* renamed from: j */
    public abstract boolean mo58081j();

    /* renamed from: k */
    public abstract String mo58082k();

    /* renamed from: l */
    public abstract String mo58083l();

    C9223er() {
    }

    static {
        C9294fx.m24907a();
        C9283fp.m24892a();
        C9227et etVar = new C9227et();
        f22644c = etVar;
        f22645d = etVar;
    }

    /* renamed from: a */
    public static C9223er m24693a() {
        return f22645d;
    }
}
