package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p264ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i8 */
public class C11338i8 implements C10743S7 {

    /* renamed from: a */
    private final Context f27098a;

    /* renamed from: b */
    private final C10797U3 f27099b;

    /* renamed from: c */
    private C11271g8 f27100c;

    /* renamed from: d */
    private final C10820Um<Bundle> f27101d;

    /* renamed from: e */
    private final C11521m8 f27102e;

    /* renamed from: f */
    private final C11676q8 f27103f;

    /* renamed from: g */
    private final C10864Vm<Void, String> f27104g;

    /* renamed from: com.yandex.metrica.impl.ob.i8$a */
    class C11339a implements C10820Um<Bundle> {
        C11339a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler((Bundle) obj);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.i8$b */
    class C11340b implements C10864Vm<Void, String> {
        C11340b() {
        }

        /* renamed from: a */
        public Object mo61128a(Object obj) {
            Void voidR = (Void) obj;
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public C11338i8(Context context, C10797U3 u3) {
        this(context, u3, new C10442L0(), new C11339a());
    }

    /* renamed from: a */
    public String mo62220a() {
        return "appmetrica_native_crashes";
    }

    /* renamed from: a */
    public void mo62222a(String str, String str2, String str3) {
        C11420k8 b = this.f27100c.mo62954b();
        if (b == null) {
            return;
        }
        if (!TextUtils.isEmpty(b.f27383a) || b.f27386d != null) {
            this.f27103f.mo63529a(str3);
            String str4 = null;
            this.f27103f.mo63530b(this.f27104g.mo61128a(null));
            C10820Um<Bundle> um = this.f27101d;
            String a = this.f27103f.mo63528a();
            Bundle bundle = new Bundle();
            C11521m8 m8Var = this.f27102e;
            C10797U3 u3 = this.f27099b;
            m8Var.getClass();
            try {
                str4 = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", u3.mo62340f()).put("arg_pd", u3.mo62341g()).put("arg_ps", u3.mo62342h()).put("arg_rt", CounterConfiguration.C10019b.MAIN.mo60823a())).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", str4);
            bundle.putString("arg_rc", a);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", b.f27383a);
            bundle.putBoolean("arg_i64", b.f27384b);
            bundle.putBoolean("arg_ul", b.f27385c);
            Context context = this.f27098a;
            bundle.putString("arg_sn", context.getPackageName() + "-crashpad_new_crash_socket");
            if (b.f27386d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(b.f27386d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", b.f27386d.f26248a);
                bundle.putString("arg_lp", b.f27386d.f26249b);
                bundle.putString("arg_dp", b.f27386d.f26250c);
            }
            um.mo61092b(bundle);
        }
    }

    /* renamed from: b */
    public void mo62224b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    /* renamed from: c */
    public String mo62225c() {
        return "appmetrica-native";
    }

    private C11338i8(Context context, C10797U3 u3, C10442L0 l0, C10820Um<Bundle> um) {
        this(context, u3, new C11271g8(context, l0, C10941Y.m28234g().mo62500d().mo63561b()), um, new C11521m8(), new C11676q8(), new C11340b());
    }

    C11338i8(Context context, C10797U3 u3, C11271g8 g8Var, C10820Um<Bundle> um, C11521m8 m8Var, C11676q8 q8Var, C10864Vm<Void, String> vm) {
        this.f27098a = context;
        this.f27099b = u3;
        this.f27100c = g8Var;
        this.f27101d = um;
        this.f27102e = m8Var;
        this.f27103f = q8Var;
        this.f27104g = vm;
    }

    /* renamed from: a */
    public void mo62223a(boolean z) {
        CrashpadHelper.logsEnabled(z);
    }

    /* renamed from: a */
    public void mo62221a(String str) {
        this.f27103f.mo63529a(str);
        CrashpadHelper.updateRuntimeConfig(this.f27103f.mo63528a());
    }
}
