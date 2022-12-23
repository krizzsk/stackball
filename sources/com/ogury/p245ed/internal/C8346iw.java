package com.ogury.p245ed.internal;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.Map;
import p269io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.iw */
public final class C8346iw extends C8341it {

    /* renamed from: b */
    public static final C8347a f21556b = new C8347a((byte) 0);

    /* renamed from: c */
    private final Context f21557c;

    /* renamed from: d */
    private final C8282hb f21558d;

    /* renamed from: e */
    private final C8349iy f21559e;

    /* renamed from: f */
    private final C8279gz f21560f;

    /* renamed from: g */
    private final C8288hg f21561g;

    /* renamed from: h */
    private final C8216fa f21562h;

    /* renamed from: i */
    private final C8212ez f21563i;

    /* renamed from: j */
    private C8431lj<C8386ke> f21564j;

    /* renamed from: k */
    private ShortcutActivity.C15582a f21565k = ShortcutActivity.f44196a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8346iw(Context context, C8282hb hbVar, C8349iy iyVar, C8279gz gzVar, C8288hg hgVar, C8216fa faVar, C8212ez ezVar) {
        super(hbVar);
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(hbVar, "mraidCommandExecutor");
        C8467mq.m23881b(iyVar, "mraidViewCommands");
        C8467mq.m23881b(gzVar, "intentHandler");
        C8467mq.m23881b(hgVar, "mraidEventBus");
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(ezVar, "androidDevice");
        this.f21557c = context;
        this.f21558d = hbVar;
        this.f21559e = iyVar;
        this.f21560f = gzVar;
        this.f21561g = hgVar;
        this.f21562h = faVar;
        this.f21563i = ezVar;
    }

    /* renamed from: a */
    public final void mo53773a(C8431lj<C8386ke> ljVar) {
        this.f21564j = ljVar;
    }

    /* renamed from: com.ogury.ed.internal.iw$a */
    public static final class C8347a {
        public /* synthetic */ C8347a(byte b) {
            this();
        }

        private C8347a() {
        }
    }

    /* renamed from: b */
    public final void mo53759b(boolean z) {
        if (z) {
            this.f21559e.mo53164q();
        } else {
            this.f21559e.mo53165r();
        }
    }

    /* renamed from: a */
    public final void mo53758a(boolean z) {
        this.f21559e.mo53147b(z);
    }

    /* renamed from: a */
    public final void mo53763a(String str, String str2) {
        C8467mq.m23881b(str2, Creative.AD_ID);
        C8279gz.m23253a(this.f21557c, str);
    }

    /* renamed from: b */
    public final void mo53768b(String str, String str2) {
        C8467mq.m23881b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        boolean c = C8279gz.m23256c(this.f21557c, str);
        boolean z = C8212ez.m22969b() >= 30 && this.f21562h.mo53479h() >= 30;
        C8472mv mvVar = C8472mv.f21701a;
        String format = String.format("{isResolved: %s, hasLimitedPackageVisibility: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(c), Boolean.valueOf(z)}, 2));
        C8467mq.m23878a((Object) format, "java.lang.String.format(format, *args)");
        this.f21558d.mo53648b(str2, format);
    }

    /* renamed from: a */
    public final void mo53764a(String str, String str2, String str3) {
        C8467mq.m23881b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        C8467mq.m23881b(str3, Creative.AD_ID);
        if (C8279gz.m23255b(this.f21557c, str)) {
            this.f21558d.mo53648b(str2, "{isStarted: true}");
            C8431lj<C8386ke> ljVar = this.f21564j;
            if (ljVar != null) {
                ljVar.mo53190a();
                return;
            }
            return;
        }
        this.f21558d.mo53648b(str2, "{isStarted: false}");
    }

    /* renamed from: a */
    public final void mo53765a(Map<String, String> map, String str) {
        C8467mq.m23881b(map, NativeProtocol.WEB_DIALOG_PARAMS);
        C8467mq.m23881b(str, "args");
        boolean z = true;
        if (str.length() > 0) {
            CharSequence charSequence = map.get("name");
            if (!(charSequence == null || charSequence.length() == 0)) {
                CharSequence charSequence2 = map.get(RewardPlus.ICON);
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    ShortcutActivity.C15582a.m45500a(this.f21557c, new C8348ix(String.valueOf(map.get("id")), String.valueOf(map.get("name")), String.valueOf(map.get(RewardPlus.ICON)), str));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53760a(C8195ek ekVar) {
        C8467mq.m23881b(ekVar, IronSourceConstants.EVENTS_AD_UNIT);
        C8288hg.m23311a((C8287hf) new C8290hi(ekVar.mo53410b(), ekVar.mo53416e()));
    }

    /* renamed from: a */
    public final void mo53762a(String str) {
        C8467mq.m23881b(str, Creative.AD_ID);
        this.f21559e.mo53143a(str);
    }

    /* renamed from: a */
    public final void mo53761a(C8350iz izVar) {
        this.f21559e.mo53142a(izVar);
    }

    /* renamed from: b */
    public final void mo53766b() {
        this.f21559e.mo53169v();
    }

    /* renamed from: c */
    public final void mo53769c() {
        this.f21559e.mo53167t();
    }

    /* renamed from: c */
    public final void mo53771c(boolean z) {
        this.f21559e.mo53149c(z);
    }

    /* renamed from: a */
    public final void mo53757a() {
        this.f21559e.mo53149c(false);
    }

    /* renamed from: b */
    public final void mo53767b(String str) {
        C8467mq.m23881b(str, Creative.AD_ID);
        C8288hg.m23311a((C8287hf) new C8281ha(str));
    }

    /* renamed from: c */
    public final void mo53770c(String str) {
        C8467mq.m23881b(str, Creative.AD_ID);
        C8288hg.m23311a(new C8287hf(str, "adImpression"));
    }
}
