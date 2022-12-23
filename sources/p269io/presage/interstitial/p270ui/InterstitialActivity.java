package p269io.presage.interstitial.p270ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8020aj;
import com.ogury.p245ed.internal.C8039ap;
import com.ogury.p245ed.internal.C8129da;
import com.ogury.p245ed.internal.C8133dd;
import com.ogury.p245ed.internal.C8185eb;
import com.ogury.p245ed.internal.C8196el;
import com.ogury.p245ed.internal.C8248g;
import com.ogury.p245ed.internal.C8273gv;
import com.ogury.p245ed.internal.C8286he;
import com.ogury.p245ed.internal.C8287hf;
import com.ogury.p245ed.internal.C8288hg;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8473mw;
import com.ogury.p245ed.internal.C8533s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.presage.interstitial.ui.InterstitialActivity */
public class InterstitialActivity extends Activity implements C8133dd {

    /* renamed from: a */
    public static final C15581a f44191a = new C15581a((byte) 0);

    /* renamed from: b */
    private C8020aj f44192b;

    /* renamed from: c */
    private C8129da f44193c = C8129da.f21066a;

    /* renamed from: d */
    private boolean f44194d;

    /* renamed from: e */
    private boolean f44195e = true;

    /* renamed from: a */
    private static boolean m45489a(Bundle bundle) {
        return bundle != null;
    }

    /* renamed from: io.presage.interstitial.ui.InterstitialActivity$a */
    public static final class C15581a implements C8039ap {
        public /* synthetic */ C15581a(byte b) {
            this();
        }

        private C15581a() {
        }

        /* renamed from: a */
        public final void mo53197a(Context context, String str, C8185eb ebVar, List<C8185eb> list) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(str, "expandCacheItemId");
            C8467mq.m23881b(ebVar, "ad");
            C8467mq.m23881b(list, "notDisplayedAds");
            Intent a = m45494a(ebVar, list, context);
            a.putExtra("mode", 1);
            a.putExtra("expand_cache_item_id", str);
            context.startActivity(a);
        }

        /* renamed from: a */
        public final void mo53196a(Context context, C8185eb ebVar, List<C8185eb> list) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(ebVar, "ad");
            C8467mq.m23881b(list, "notDisplayedAds");
            OguryIntegrationLogger.m22104d("[Ads][Activity] Prepare and start Activity");
            context.startActivity(m45494a(ebVar, list, context));
        }

        /* renamed from: a */
        private static Intent m45494a(C8185eb ebVar, List<C8185eb> list, Context context) {
            Intent intent = new Intent(context, m45495a(ebVar));
            intent.putExtra("ad", ebVar);
            intent.putExtra("not_displayed_ads", new ArrayList(list));
            intent.addFlags(268435456);
            return intent;
        }

        /* renamed from: a */
        private static Class<?> m45495a(C8185eb ebVar) {
            if (m45496a()) {
                return InterstitialActivity.class;
            }
            return ebVar.mo53368n() ? InterstitialAndroid8TransparentActivity.class : InterstitialAndroid8RotableActivity.class;
        }

        /* renamed from: a */
        private static boolean m45496a() {
            return Build.VERSION.SDK_INT != 26;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m45489a(bundle)) {
            finish();
            return;
        }
        m45491c();
        try {
            List<C8185eb> b = m45490b();
            C8185eb a = m45488a();
            if (a != null) {
                this.f44194d = C8196el.m22923a(a);
                Intent intent = getIntent();
                C8467mq.m23878a((Object) intent, SDKConstants.PARAM_INTENT);
                C8273gv gvVar = new C8273gv(this, intent, a, b);
                C8248g a2 = gvVar.mo53626a();
                a2.setDisplayedInFullScreen(true);
                this.f44192b = gvVar.mo53627b();
                setContentView(a2);
                return;
            }
            throw new IllegalStateException("Ad not sent to interstitial activity");
        } catch (Throwable th) {
            OguryIntegrationLogger.m22105e(C8467mq.m23873a("[Ads][Activity] onCreate() failed (", (Object) th.getMessage()));
            this.f44195e = false;
            C8129da.m22652a(th);
            finish();
        }
    }

    /* renamed from: a */
    private final C8185eb m45488a() {
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (serializableExtra instanceof C8185eb) {
            return (C8185eb) serializableExtra;
        }
        return null;
    }

    /* renamed from: b */
    private final List<C8185eb> m45490b() {
        Serializable serializableExtra = getIntent().getSerializableExtra("not_displayed_ads");
        if (serializableExtra != null) {
            return C8473mw.m23900b(serializableExtra);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<io.presage.common.network.models.Ad>");
    }

    /* renamed from: c */
    private final void m45491c() {
        getWindow().setFlags(16777216, 16777216);
    }

    /* renamed from: a */
    public void mo72052a(C8185eb ebVar) {
        String str = null;
        if (C8467mq.m23880a((Object) ebVar == null ? null : ebVar.mo53344d(), (Object) "landscape")) {
            setRequestedOrientation(0);
            return;
        }
        if (ebVar != null) {
            str = ebVar.mo53344d();
        }
        if (C8467mq.m23880a((Object) str, (Object) "portrait")) {
            setRequestedOrientation(1);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f44194d) {
            C8533s sVar = C8533s.f21743a;
            C8533s.m23985b(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f44194d) {
            C8533s sVar = C8533s.f21743a;
            C8533s.m23985b(false);
        }
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C8020aj ajVar = this.f44192b;
        if (ajVar != null) {
            ajVar.mo53144a(isFinishing());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f44195e) {
            C8020aj ajVar = this.f44192b;
            if (ajVar != null) {
                ajVar.mo53160m();
            }
        } else {
            m45492d();
        }
        this.f44192b = null;
    }

    public void onBackPressed() {
        C8020aj ajVar = this.f44192b;
        if (ajVar == null ? true : ajVar.mo53161n()) {
            super.onBackPressed();
        }
    }

    /* renamed from: d */
    private final void m45492d() {
        C8185eb a = m45488a();
        if (a != null) {
            C8288hg hgVar = C8288hg.f21407a;
            C8288hg.m23311a((C8287hf) new C8286he(a.mo53338b()));
            C8288hg hgVar2 = C8288hg.f21407a;
            C8288hg.m23312a(a.mo53338b());
        }
    }
}
