package com.yandex.mobile.ads.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.sdk.InMobiSdk;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.YandexMetrica;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.C12878dg;
import com.yandex.mobile.ads.impl.C13037f9;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C13715kl;
import com.yandex.mobile.ads.impl.C13856lg;
import com.yandex.mobile.ads.impl.C14564s6;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14654t6;
import com.yandex.mobile.ads.impl.C14743u6;
import com.yandex.mobile.ads.impl.C14863v3;
import com.yandex.mobile.ads.impl.C15143x3;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.l30;
import com.yandex.mobile.ads.impl.l71;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.n71;
import com.yandex.mobile.ads.impl.uj0;
import com.yandex.mobile.ads.impl.y71;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.yandex.mobile.ads.base.s */
public final class C12124s {

    /* renamed from: A */
    private final String f29244A;

    /* renamed from: B */
    private final Integer f29245B;

    /* renamed from: C */
    private final String f29246C;

    /* renamed from: D */
    private final String f29247D;

    /* renamed from: E */
    private final String f29248E;

    /* renamed from: F */
    private final String f29249F;

    /* renamed from: G */
    private final String f29250G;

    /* renamed from: H */
    private final String f29251H;

    /* renamed from: I */
    private final Map<String, String> f29252I;

    /* renamed from: J */
    private final Long f29253J;

    /* renamed from: K */
    private final String f29254K;

    /* renamed from: L */
    private final String f29255L;

    /* renamed from: M */
    private final String f29256M;

    /* renamed from: N */
    private final String f29257N;

    /* renamed from: O */
    private final String f29258O;

    /* renamed from: P */
    private final String f29259P;

    /* renamed from: Q */
    private final String f29260Q;

    /* renamed from: R */
    private final String f29261R;

    /* renamed from: S */
    private final String f29262S;

    /* renamed from: T */
    private final String f29263T;

    /* renamed from: U */
    private final String f29264U;

    /* renamed from: V */
    private final String f29265V;

    /* renamed from: W */
    private final String f29266W;

    /* renamed from: X */
    private final String f29267X;

    /* renamed from: Y */
    private final String f29268Y;

    /* renamed from: Z */
    private final String f29269Z;

    /* renamed from: a */
    private final C14863v3 f29270a;

    /* renamed from: a0 */
    private final Integer f29271a0;

    /* renamed from: b */
    private final String f29272b;

    /* renamed from: b0 */
    private final String f29273b0;

    /* renamed from: c */
    private final Integer f29274c;

    /* renamed from: c0 */
    private final String f29275c0;

    /* renamed from: d */
    private final String f29276d;

    /* renamed from: d0 */
    private final Boolean f29277d0;

    /* renamed from: e */
    private final String f29278e;

    /* renamed from: e0 */
    private final String f29279e0;

    /* renamed from: f */
    private final String f29280f;

    /* renamed from: f0 */
    private final String f29281f0;

    /* renamed from: g */
    private final Integer f29282g;

    /* renamed from: g0 */
    private final boolean f29283g0;

    /* renamed from: h */
    private final Integer f29284h;

    /* renamed from: h0 */
    private final String f29285h0;

    /* renamed from: i */
    private final String f29286i;

    /* renamed from: i0 */
    private final String f29287i0;

    /* renamed from: j */
    private final String f29288j;

    /* renamed from: j0 */
    private final String f29289j0;

    /* renamed from: k */
    private final Integer f29290k;

    /* renamed from: k0 */
    private final String f29291k0;

    /* renamed from: l */
    private final Integer f29292l;

    /* renamed from: l0 */
    private final String f29293l0;

    /* renamed from: m */
    private final Float f29294m;

    /* renamed from: m0 */
    private StringBuilder f29295m0;

    /* renamed from: n */
    private final Location f29296n;

    /* renamed from: o */
    private final Integer f29297o;

    /* renamed from: p */
    private final Integer f29298p;

    /* renamed from: q */
    private final String f29299q;

    /* renamed from: r */
    private final String f29300r;

    /* renamed from: s */
    private final AdRequest f29301s;

    /* renamed from: t */
    private final Integer f29302t;

    /* renamed from: u */
    private final Integer f29303u;

    /* renamed from: v */
    private final String f29304v;

    /* renamed from: w */
    private final Boolean f29305w;

    /* renamed from: x */
    private final Boolean f29306x;

    /* renamed from: y */
    private final String f29307y;

    /* renamed from: z */
    private final Boolean f29308z;

    /* renamed from: com.yandex.mobile.ads.base.s$b */
    public static final class C12126b<T> {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public Integer f29309A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public String f29310B;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public String f29311C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public AdRequest f29312D;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public Integer f29313E;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public Integer f29314F;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public String f29315G;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public Boolean f29316H;
        /* access modifiers changed from: private */

        /* renamed from: I */
        public Boolean f29317I;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public String f29318J;
        /* access modifiers changed from: private */

        /* renamed from: K */
        public Boolean f29319K;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public String f29320L;
        /* access modifiers changed from: private */

        /* renamed from: M */
        public Integer f29321M;
        /* access modifiers changed from: private */

        /* renamed from: N */
        public String f29322N;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public String f29323O;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public String f29324P;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public String f29325Q;
        /* access modifiers changed from: private */

        /* renamed from: R */
        public String f29326R;
        /* access modifiers changed from: private */

        /* renamed from: S */
        public String f29327S;
        /* access modifiers changed from: private */

        /* renamed from: T */
        public Long f29328T;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public String f29329U;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public String f29330V;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public String f29331W;
        /* access modifiers changed from: private */

        /* renamed from: X */
        public String f29332X;
        /* access modifiers changed from: private */

        /* renamed from: Y */
        public String f29333Y;
        /* access modifiers changed from: private */

        /* renamed from: Z */
        public String f29334Z;

        /* renamed from: a */
        private final C13715kl f29335a;
        /* access modifiers changed from: private */

        /* renamed from: a0 */
        public String f29336a0;

        /* renamed from: b */
        private final C13037f9 f29337b;
        /* access modifiers changed from: private */

        /* renamed from: b0 */
        public String f29338b0;

        /* renamed from: c */
        private final n71 f29339c;
        /* access modifiers changed from: private */

        /* renamed from: c0 */
        public String f29340c0;

        /* renamed from: d */
        private final C14654t6 f29341d;
        /* access modifiers changed from: private */

        /* renamed from: d0 */
        public String f29342d0;

        /* renamed from: e */
        private final boolean f29343e;
        /* access modifiers changed from: private */

        /* renamed from: e0 */
        public String f29344e0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Map<String, String> f29345f;
        /* access modifiers changed from: private */

        /* renamed from: f0 */
        public String f29346f0;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Boolean f29347g;
        /* access modifiers changed from: private */

        /* renamed from: g0 */
        public String f29348g0;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f29349h;
        /* access modifiers changed from: private */

        /* renamed from: h0 */
        public String f29350h0;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Integer f29351i;
        /* access modifiers changed from: private */

        /* renamed from: i0 */
        public String f29352i0;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f29353j;
        /* access modifiers changed from: private */

        /* renamed from: j0 */
        public String f29354j0;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f29355k;
        /* access modifiers changed from: private */

        /* renamed from: k0 */
        public int f29356k0;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public String f29357l;
        /* access modifiers changed from: private */

        /* renamed from: l0 */
        public String f29358l0;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public String f29359m;
        /* access modifiers changed from: private */

        /* renamed from: m0 */
        public String f29360m0;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f29361n;
        /* access modifiers changed from: private */

        /* renamed from: n0 */
        public String f29362n0;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public String f29363o;
        /* access modifiers changed from: private */

        /* renamed from: o0 */
        public String f29364o0;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public String f29365p;
        /* access modifiers changed from: private */

        /* renamed from: p0 */
        public String f29366p0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public String f29367q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Integer f29368r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public Integer f29369s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public String f29370t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public String f29371u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public Location f29372v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public Integer f29373w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public Integer f29374x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public Float f29375y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public Integer f29376z;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64624a(Context context) {
            String str;
            this.f29348g0 = context.getPackageName();
            String str2 = null;
            try {
                str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (Exception unused) {
                str = null;
            }
            this.f29350h0 = str;
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused2) {
            }
            this.f29352i0 = str2;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0034 A[Catch:{ Exception -> 0x0039 }] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.yandex.mobile.ads.base.C12124s.C12126b<T> mo64650e(android.content.Context r6) {
            /*
                r5 = this;
                java.lang.String r0 = "phone"
                r1 = 65535(0xffff, float:9.1834E-41)
                r2 = -1
                r3 = 0
                java.lang.Object r4 = r6.getSystemService(r0)     // Catch:{ Exception -> 0x001f }
                android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Exception -> 0x001f }
                android.telephony.CellLocation r4 = r4.getCellLocation()     // Catch:{ Exception -> 0x001f }
                android.telephony.gsm.GsmCellLocation r4 = (android.telephony.gsm.GsmCellLocation) r4     // Catch:{ Exception -> 0x001f }
                int r4 = r4.getCid()     // Catch:{ Exception -> 0x001f }
                if (r2 == r4) goto L_0x001f
                r4 = r4 & r1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r4 = r3
            L_0x0020:
                r5.f29313E = r4
                java.lang.Object r0 = r6.getSystemService(r0)     // Catch:{ Exception -> 0x0039 }
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0039 }
                android.telephony.CellLocation r0 = r0.getCellLocation()     // Catch:{ Exception -> 0x0039 }
                android.telephony.gsm.GsmCellLocation r0 = (android.telephony.gsm.GsmCellLocation) r0     // Catch:{ Exception -> 0x0039 }
                int r0 = r0.getLac()     // Catch:{ Exception -> 0x0039 }
                if (r2 == r0) goto L_0x0039
                r0 = r0 & r1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0039 }
            L_0x0039:
                r5.f29314F = r3
                java.lang.String r6 = com.yandex.mobile.ads.impl.hz0.m37247b(r6)
                r5.f29315G = r6
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12124s.C12126b.mo64650e(android.content.Context):com.yandex.mobile.ads.base.s$b");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[Catch:{ Exception -> 0x0042 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[Catch:{ Exception -> 0x0065 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[Catch:{ Exception -> 0x0065 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.yandex.mobile.ads.base.C12124s.C12126b<T> mo64654g(android.content.Context r6) {
            /*
                r5 = this;
                java.lang.String r0 = "phone"
                r1 = 3
                r2 = 0
                java.lang.Object r3 = r6.getSystemService(r0)     // Catch:{ Exception -> 0x0022 }
                android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x0022 }
                java.lang.String r3 = r3.getNetworkOperator()     // Catch:{ Exception -> 0x0022 }
                r4 = 0
                java.lang.String r3 = r3.substring(r4, r1)     // Catch:{ Exception -> 0x0022 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0022 }
                if (r4 != 0) goto L_0x0022
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0022 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0022 }
                goto L_0x0023
            L_0x0022:
                r3 = r2
            L_0x0023:
                r5.f29376z = r3
                java.lang.Object r3 = r6.getSystemService(r0)     // Catch:{ Exception -> 0x0042 }
                android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x0042 }
                java.lang.String r3 = r3.getNetworkOperator()     // Catch:{ Exception -> 0x0042 }
                java.lang.String r1 = r3.substring(r1)     // Catch:{ Exception -> 0x0042 }
                boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0042 }
                if (r3 != 0) goto L_0x0042
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0042 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0042 }
                goto L_0x0043
            L_0x0042:
                r1 = r2
            L_0x0043:
                r5.f29309A = r1
                android.content.Context r1 = r6.getApplicationContext()     // Catch:{ Exception -> 0x0065 }
                java.lang.String r3 = "connectivity"
                java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0065 }
                android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x0065 }
                android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0065 }
                int r3 = r1.getType()     // Catch:{ Exception -> 0x0065 }
                if (r3 == 0) goto L_0x0060
                java.lang.String r1 = r1.getTypeName()     // Catch:{ Exception -> 0x0065 }
                goto L_0x0066
            L_0x0060:
                java.lang.String r1 = r1.getSubtypeName()     // Catch:{ Exception -> 0x0065 }
                goto L_0x0066
            L_0x0065:
                r1 = r2
            L_0x0066:
                r5.f29310B = r1
                java.lang.Object r6 = r6.getSystemService(r0)     // Catch:{ Exception -> 0x0079 }
                android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ Exception -> 0x0079 }
                java.lang.String r6 = r6.getNetworkOperatorName()     // Catch:{ Exception -> 0x0079 }
                boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0079 }
                if (r0 != 0) goto L_0x0079
                r2 = r6
            L_0x0079:
                r5.f29311C = r2
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.base.C12124s.C12126b.mo64654g(android.content.Context):com.yandex.mobile.ads.base.s$b");
        }

        private C12126b(boolean z) {
            this.f29345f = new HashMap();
            this.f29343e = z;
            this.f29335a = new C13715kl();
            this.f29337b = new C13037f9();
            this.f29339c = new n71();
            this.f29341d = new C14654t6();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12126b<T> mo64640b(Integer num) {
            this.f29321M = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C12126b<T> mo64646c(String[] strArr) {
            this.f29325Q = mo64637a(strArr);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C12126b<T> mo64649d(String str) {
            this.f29330V = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C12126b<T> mo64653f(String str) {
            this.f29349h = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C12126b<T> mo64657h(String str) {
            this.f29363o = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C12126b<T> mo64658i(Context context) {
            this.f29373w = Integer.valueOf(lo1.m38873d(context));
            this.f29374x = Integer.valueOf(lo1.m38869b(context));
            this.f29375y = Float.valueOf(context.getResources().getDisplayMetrics().density);
            this.f29356k0 = context.getResources().getDisplayMetrics().densityDpi;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C12126b<T> mo64659j(Context context) {
            this.f29361n = C12878dg.f32563g.mo66579a(context).mo66577l();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12126b<T> mo64642b(String[] strArr) {
            this.f29324P = mo64637a(strArr);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C12126b<T> mo64643c() {
            this.f29362n0 = this.f29339c.mo68931a();
            this.f29364o0 = this.f29339c.mo68932b();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C12126b<T> mo64647d() {
            this.f29347g = l71.m38631c().mo68372g();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C12126b<T> mo64652f(Context context) {
            this.f29372v = this.f29343e ? null : uj0.m42700a(context).mo70352a();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C12126b<T> mo64656h(Context context) {
            this.f29359m = C12878dg.f32563g.mo66579a(context).mo66576k();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12126b<T> mo64638b() {
            String str;
            this.f29337b.getClass();
            try {
                str = YandexMetrica.getLibraryVersion();
            } catch (Exception unused) {
                str = null;
            }
            this.f29366p0 = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C12126b<T> mo64648d(Context context) {
            this.f29357l = C12878dg.f32563g.mo66579a(context).mo66574i();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C12126b<T> mo64644c(Context context) {
            this.f29355k = C12878dg.f32563g.mo66579a(context).mo66575j();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12126b<T> mo64641b(String str) {
            this.f29333Y = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C12126b<T> mo64645c(String str) {
            this.f29329U = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12126b<T> mo64639b(Context context) {
            this.f29353j = C12878dg.f32563g.mo66579a(context).mo66573h();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64634a(String str) {
            this.f29365p = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C12126b<T> mo64651e(String str) {
            this.f29334Z = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64627a(C12115n nVar) {
            if (nVar != null) {
                this.f29367q = nVar.mo64574a();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64625a(Context context, SizeInfo sizeInfo) {
            if (sizeInfo != null) {
                this.f29370t = sizeInfo.mo64493d().mo64502a();
                this.f29368r = Integer.valueOf(sizeInfo.mo64491c(context));
                this.f29369s = Integer.valueOf(sizeInfo.mo64488a(context));
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64622a(int i) {
            if (1 == i) {
                this.f29371u = "portrait";
            } else {
                this.f29371u = "landscape";
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64630a(AdRequest adRequest) {
            String str;
            if (adRequest != null) {
                String str2 = null;
                this.f29312D = this.f29343e ? null : adRequest;
                C15143x3 x3Var = new C15143x3();
                String contextQuery = adRequest.getContextQuery();
                if (!TextUtils.isEmpty(contextQuery)) {
                    String encode = Uri.encode(contextQuery);
                    if (encode != null && encode.length() > 1024) {
                        c21.m34570c("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                        String encode2 = Uri.encode(" ");
                        String substring = encode.substring(0, 1024);
                        encode = encode.startsWith(encode2, 1024) ? substring : substring.substring(0, substring.lastIndexOf(encode2));
                    }
                    str = Uri.decode(encode);
                } else {
                    str = null;
                }
                this.f29322N = str;
                List<String> contextTags = adRequest.getContextTags();
                StringBuilder sb = new StringBuilder();
                if (contextTags != null) {
                    String str3 = "";
                    for (String next : contextTags) {
                        if (!TextUtils.isEmpty(next)) {
                            sb.append(str3);
                            sb.append(next);
                            sb.append("\n");
                            str3 = ExifInterface.GPS_MEASUREMENT_3D;
                        }
                    }
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    String encode3 = Uri.encode(sb2);
                    if (encode3 != null && encode3.length() > 2048) {
                        c21.m34570c("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                        String encode4 = Uri.encode("\n");
                        encode3 = encode3.substring(0, 2048);
                        if (!encode3.endsWith(encode4)) {
                            encode3 = encode3.substring(0, encode3.lastIndexOf(encode4));
                        }
                    }
                    str2 = Uri.decode(encode3);
                }
                this.f29323O = str2;
                this.f29358l0 = x3Var.mo70811a(adRequest.getAge());
                this.f29360m0 = x3Var.mo70811a(adRequest.getGender());
                this.f29332X = adRequest.getBiddingData();
                Map<String, String> a = x3Var.mo70812a(adRequest.getParameters());
                if (a != null) {
                    this.f29345f.putAll(a);
                }
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C12126b<T> mo64655g(String str) {
            this.f29331W = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo64637a(String[] strArr) {
            if (strArr == null || strArr.length <= 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            String str = "";
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str);
                    sb.append(str2);
                    str = ",";
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64628a(C12127t tVar) {
            if (tVar != null) {
                this.f29326R = tVar.mo64660a();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64629a(C12129u uVar) {
            if (uVar != null && C12129u.PROMO == uVar) {
                this.f29327S = uVar.mo64669a();
            }
            return this;
        }

        /* renamed from: a */
        public C12126b<T> mo64635a(Map<String, String> map) {
            if (map != null) {
                this.f29345f.putAll(map);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64626a(Context context, String str) {
            this.f29336a0 = this.f29335a.mo68248a(context);
            this.f29335a.getClass();
            this.f29338b0 = "android";
            this.f29335a.getClass();
            this.f29340c0 = Build.VERSION.RELEASE;
            this.f29335a.getClass();
            this.f29342d0 = Build.MANUFACTURER;
            this.f29335a.getClass();
            this.f29344e0 = Build.MODEL;
            this.f29346f0 = this.f29335a.mo68249b(context);
            if (this.f29343e) {
                str = null;
            }
            this.f29354j0 = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64632a(C14743u6 u6Var, boolean z) {
            if (u6Var != null) {
                this.f29316H = Boolean.valueOf(u6Var.mo70293b());
                this.f29317I = Boolean.valueOf(z);
                String a = u6Var.mo70292a();
                boolean a2 = this.f29341d.mo70130a(a);
                if (!this.f29343e && !this.f29316H.booleanValue() && a2) {
                    this.f29318J = a;
                }
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64631a(C14743u6 u6Var) {
            if (u6Var != null) {
                this.f29319K = Boolean.valueOf(u6Var.mo70293b());
                String a = u6Var.mo70292a();
                boolean a2 = this.f29341d.mo70130a(a);
                if (!this.f29343e && !this.f29319K.booleanValue() && a2) {
                    this.f29320L = a;
                }
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64623a(long j) {
            this.f29328T = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12126b<T> mo64633a(Integer num) {
            this.f29351i = num;
            return this;
        }

        /* renamed from: a */
        public String mo64636a() {
            return new C12124s(this).toString();
        }
    }

    /* renamed from: a */
    private void m31483a(String str, Boolean bool) {
        if (bool != null) {
            m31484a(str, (Object) Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    public String toString() {
        if (!TextUtils.isEmpty(this.f29295m0)) {
            return this.f29295m0.toString();
        }
        this.f29295m0 = new StringBuilder();
        m31484a("ad_unit_id", (Object) this.f29278e);
        m31484a("uuid", (Object) this.f29276d);
        m31484a("mauid", (Object) this.f29272b);
        m31484a("width", (Object) this.f29282g);
        m31484a("height", (Object) this.f29284h);
        m31484a("ad_size_type", (Object) this.f29286i);
        m31484a("orientation", (Object) this.f29288j);
        m31484a("ads_count", (Object) this.f29274c);
        m31484a("screen_width", (Object) this.f29290k);
        m31484a("screen_height", (Object) this.f29292l);
        m31484a("scalefactor", (Object) this.f29294m);
        m31484a("mcc", (Object) this.f29297o);
        m31484a("mnc", (Object) this.f29298p);
        m31484a("ad_type", (Object) this.f29280f);
        m31484a("network_type", (Object) this.f29299q);
        m31484a(ServerParameters.CARRIER, (Object) this.f29300r);
        m31484a("cellid", (Object) this.f29302t);
        m31484a("lac", (Object) this.f29303u);
        m31484a(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI, (Object) this.f29304v);
        m31483a("dnt", this.f29305w);
        m31483a("gaid_reset", this.f29306x);
        m31484a("google_aid", (Object) this.f29307y);
        m31483a("huawei_dnt", this.f29308z);
        m31484a("huawei_oaid", (Object) this.f29244A);
        m31484a("battery_charge", (Object) this.f29245B);
        m31484a("context_query", (Object) this.f29246C);
        m31484a("context_taglist", (Object) this.f29247D);
        m31484a("image_sizes", (Object) this.f29248E);
        m31484a("app_supported_features", (Object) this.f29249F);
        m31484a("response_ad_format", (Object) this.f29250G);
        m31484a("ad_source", (Object) this.f29251H);
        m31484a("debug_yandexuid", (Object) this.f29255L);
        m31484a("user_id", (Object) this.f29256M);
        m31484a("open_bidding_data", (Object) this.f29257N);
        m31484a("session_random", (Object) this.f29253J);
        m31484a("charset", (Object) this.f29254K);
        this.f29270a.getClass();
        byte[] decode = Base64.decode("ZGV2aWNlX3R5cGU=", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(\"ZGV2aWNlX3R5cGU=\",\n      Base64.DEFAULT)");
        m31484a(new String(decode, Charsets.UTF_8), (Object) this.f29260Q);
        this.f29270a.getClass();
        byte[] decode2 = Base64.decode("b3NfbmFtZQ==", 0);
        Intrinsics.checkNotNullExpressionValue(decode2, "decode(\"b3NfbmFtZQ==\", Base64.DEFAULT)");
        m31484a(new String(decode2, Charsets.UTF_8), (Object) this.f29261R);
        this.f29270a.getClass();
        byte[] decode3 = Base64.decode("b3NfdmVyc2lvbg==", 0);
        Intrinsics.checkNotNullExpressionValue(decode3, "decode(\"b3NfdmVyc2lvbg==\",\n      Base64.DEFAULT)");
        m31484a(new String(decode3, Charsets.UTF_8), (Object) this.f29262S);
        this.f29270a.getClass();
        byte[] decode4 = Base64.decode("bWFudWZhY3R1cmVy", 0);
        Intrinsics.checkNotNullExpressionValue(decode4, "decode(\"bWFudWZhY3R1cmVy\",\n      Base64.DEFAULT)");
        m31484a(new String(decode4, Charsets.UTF_8), (Object) this.f29263T);
        this.f29270a.getClass();
        byte[] decode5 = Base64.decode("bW9kZWw=", 0);
        Intrinsics.checkNotNullExpressionValue(decode5, "decode(\"bW9kZWw=\", Base64.DEFAULT)");
        m31484a(new String(decode5, Charsets.UTF_8), (Object) this.f29264U);
        m31484a("locale", (Object) this.f29265V);
        m31484a("app_id", (Object) this.f29266W);
        m31484a(ServerParameters.APP_VERSION_CODE, (Object) this.f29267X);
        m31484a(ServerParameters.APP_VERSION_NAME, (Object) this.f29268Y);
        m31484a("appmetrica_version", (Object) this.f29293l0);
        this.f29270a.getClass();
        byte[] decode6 = Base64.decode("ZGV2aWNlLWlk", 0);
        Intrinsics.checkNotNullExpressionValue(decode6, "decode(\"ZGV2aWNlLWlk\", Base64.DEFAULT)");
        m31484a(new String(decode6, Charsets.UTF_8), (Object) this.f29269Z);
        m31484a("screen_dpi", (Object) this.f29271a0);
        m31484a("age", (Object) this.f29273b0);
        m31484a(InneractiveMediationDefs.KEY_GENDER, (Object) this.f29275c0);
        m31483a("user_consent", this.f29277d0);
        m31484a("gdpr", (Object) this.f29285h0);
        m31484a(InMobiSdk.IM_GDPR_CONSENT_IAB, (Object) this.f29287i0);
        m31483a("cmp_present", Boolean.valueOf(this.f29283g0));
        m31484a("parsed_purpose_consents", (Object) this.f29289j0);
        m31484a("parsed_vendor_consents", (Object) this.f29291k0);
        m31484a("autograb", (Object) this.f29258O);
        m31484a("bidding_data", (Object) this.f29259P);
        m31484a(ServerParameters.SDK_DATA_SDK_VERSION, (Object) this.f29279e0);
        m31484a("sdk_version_name", (Object) this.f29281f0);
        Map<String, String> map = this.f29252I;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                m31484a((String) next.getKey(), next.getValue());
            }
        }
        AdRequest adRequest = this.f29301s;
        if (adRequest != null) {
            m31482a(adRequest.getLocation());
        }
        AdRequest adRequest2 = this.f29301s;
        if (adRequest2 == null || adRequest2.getLocation() == null) {
            m31482a(this.f29296n);
        }
        return this.f29295m0.toString();
    }

    private C12124s(C12126b<?> bVar) {
        this.f29274c = bVar.f29351i;
        this.f29278e = bVar.f29365p;
        this.f29276d = bVar.f29363o;
        this.f29272b = bVar.f29349h;
        this.f29280f = bVar.f29367q;
        this.f29282g = bVar.f29368r;
        this.f29284h = bVar.f29369s;
        this.f29286i = bVar.f29370t;
        this.f29288j = bVar.f29371u;
        this.f29290k = bVar.f29373w;
        this.f29292l = bVar.f29374x;
        this.f29294m = bVar.f29375y;
        this.f29296n = bVar.f29372v;
        this.f29297o = bVar.f29376z;
        this.f29298p = bVar.f29309A;
        this.f29299q = bVar.f29310B;
        this.f29300r = bVar.f29311C;
        this.f29301s = bVar.f29312D;
        this.f29302t = bVar.f29313E;
        this.f29303u = bVar.f29314F;
        this.f29304v = bVar.f29315G;
        this.f29305w = bVar.f29316H;
        this.f29306x = bVar.f29317I;
        this.f29307y = bVar.f29318J;
        this.f29308z = bVar.f29319K;
        this.f29244A = bVar.f29320L;
        this.f29245B = bVar.f29321M;
        this.f29246C = bVar.f29322N;
        this.f29247D = bVar.f29323O;
        this.f29248E = bVar.f29324P;
        this.f29249F = bVar.f29325Q;
        this.f29250G = bVar.f29326R;
        this.f29251H = bVar.f29327S;
        this.f29252I = bVar.f29345f;
        this.f29253J = bVar.f29328T;
        this.f29254K = bVar.f29329U;
        this.f29255L = bVar.f29330V;
        this.f29256M = bVar.f29331W;
        this.f29258O = bVar.f29333Y;
        this.f29257N = bVar.f29332X;
        this.f29259P = bVar.f29334Z;
        this.f29260Q = bVar.f29336a0;
        this.f29261R = bVar.f29338b0;
        this.f29262S = bVar.f29340c0;
        this.f29263T = bVar.f29342d0;
        this.f29264U = bVar.f29344e0;
        this.f29265V = bVar.f29346f0;
        this.f29266W = bVar.f29348g0;
        this.f29267X = bVar.f29350h0;
        this.f29268Y = bVar.f29352i0;
        this.f29269Z = bVar.f29354j0;
        this.f29271a0 = Integer.valueOf(bVar.f29356k0);
        this.f29273b0 = bVar.f29358l0;
        this.f29275c0 = bVar.f29360m0;
        this.f29277d0 = bVar.f29347g;
        this.f29285h0 = bVar.f29355k;
        this.f29287i0 = bVar.f29357l;
        this.f29283g0 = bVar.f29353j;
        this.f29289j0 = bVar.f29359m;
        this.f29291k0 = bVar.f29361n;
        this.f29293l0 = bVar.f29366p0;
        this.f29279e0 = bVar.f29362n0;
        this.f29281f0 = bVar.f29364o0;
        this.f29270a = new C14863v3();
    }

    /* renamed from: a */
    private void m31482a(Location location) {
        if (location != null && l71.m38631c().mo68371f()) {
            m31484a(ServerParameters.LAT_KEY, (Object) String.valueOf(location.getLatitude()));
            m31484a(ServerParameters.LON_KEY, (Object) String.valueOf(location.getLongitude()));
            m31484a("location_timestamp", (Object) String.valueOf(location.getTime()));
            m31484a("precision", (Object) String.valueOf((int) location.getAccuracy()));
        }
    }

    /* renamed from: a */
    private void m31484a(String str, Object obj) {
        if (obj != null) {
            StringBuilder sb = this.f29295m0;
            sb.append(TextUtils.isEmpty(sb) ? "" : "&");
            StringBuilder sb2 = this.f29295m0;
            sb2.append(Uri.encode(str));
            sb2.append("=");
            sb2.append(Uri.encode(obj.toString()));
        }
    }

    /* renamed from: a */
    public static String m31481a(C14645t1 t1Var) {
        String a = t1Var.mo70104j().mo68311a();
        if (!TextUtils.isEmpty(a)) {
            return Uri.parse(a).buildUpon().path("v4/ad").build().toString();
        }
        return null;
    }

    /* renamed from: a */
    public static C12126b m31480a(Context context, y71 y71, C13856lg lgVar) {
        l30 b = lgVar.mo68423b();
        C14564s6 a = lgVar.mo68419a();
        Integer num = null;
        C12126b a2 = new C12126b(y71.mo71005a(context)).mo64624a(context).mo64638b().mo64632a(a.mo69889a(), a.mo69894c()).mo64631a(a.mo69892b());
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > -1 && intExtra2 > 0) {
                    num = Integer.valueOf(Math.round((((float) intExtra) / ((float) intExtra2)) * 100.0f));
                }
            }
        } catch (Exception unused) {
        }
        return a2.mo64640b(num).mo64645c("UTF-8").mo64650e(context).mo64652f(context).mo64654g(context).mo64658i(context).mo64643c().mo64623a(C13278h5.f34273a).mo64649d(b.mo68316b()).mo64626a(context, b.mo68318c()).mo64657h(b.mo68326h()).mo64653f(b.mo68322e()).mo64646c(lgVar.mo68425d()).mo64642b(lgVar.mo68424c());
    }

    /* renamed from: a */
    public static C12126b m31479a(Context context, C14645t1 t1Var, y71 y71) {
        return m31480a(context, y71, t1Var.mo70102h()).mo64630a(t1Var.mo70080a()).mo64627a(t1Var.mo70092b()).mo64633a(t1Var.mo70098d()).mo64634a(t1Var.mo70096c()).mo64628a(t1Var.mo70107m()).mo64625a(context, t1Var.mo70108n()).mo64629a(t1Var.mo70109o()).mo64655g((String) null).mo64641b(t1Var.mo70100f()).mo64651e(t1Var.mo70101g()).mo64622a(t1Var.mo70106l()).mo64647d().mo64644c(context).mo64648d(context).mo64639b(context).mo64656h(context).mo64659j(context);
    }
}
