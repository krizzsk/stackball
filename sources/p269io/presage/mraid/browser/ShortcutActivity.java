package p269io.presage.mraid.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.ogury.p245ed.internal.C8112cp;
import com.ogury.p245ed.internal.C8133dd;
import com.ogury.p245ed.internal.C8303hr;
import com.ogury.p245ed.internal.C8305hs;
import com.ogury.p245ed.internal.C8307ht;
import com.ogury.p245ed.internal.C8308hu;
import com.ogury.p245ed.internal.C8345iv;
import com.ogury.p245ed.internal.C8348ix;
import com.ogury.p245ed.internal.C8386ke;
import com.ogury.p245ed.internal.C8431lj;
import com.ogury.p245ed.internal.C8467mq;
import com.ogury.p245ed.internal.C8468mr;

/* renamed from: io.presage.mraid.browser.ShortcutActivity */
public class ShortcutActivity extends Activity implements C8133dd {

    /* renamed from: a */
    public static final C15582a f44196a = new C15582a((byte) 0);

    /* renamed from: b */
    private C8303hr.C8304a f44197b = C8303hr.f21445a;

    /* renamed from: c */
    private C8303hr f44198c;

    /* renamed from: io.presage.mraid.browser.ShortcutActivity$a */
    public static final class C15582a {
        public /* synthetic */ C15582a(byte b) {
            this();
        }

        private C15582a() {
        }

        /* renamed from: io.presage.mraid.browser.ShortcutActivity$a$a */
        static final class C15583a extends C8468mr implements C8431lj<C8386ke> {

            /* renamed from: a */
            final /* synthetic */ Context f44199a;

            /* renamed from: b */
            final /* synthetic */ C8348ix f44200b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15583a(Context context, C8348ix ixVar) {
                super(0);
                this.f44199a = context;
                this.f44200b = ixVar;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo53190a() {
                m45501b();
                return C8386ke.f21633a;
            }

            /* renamed from: b */
            private void m45501b() {
                new C8305hs(this.f44199a, this.f44200b).mo53688a();
            }
        }

        /* renamed from: a */
        public static void m45500a(Context context, C8348ix ixVar) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(ixVar, "shortcutIcon");
            C8112cp.C8113a aVar = C8112cp.f21042a;
            C8112cp.C8113a.m22614a(new C15583a(context, ixVar)).mo53280a((C8431lj<C8386ke>) C15584b.f44201a);
        }

        /* renamed from: io.presage.mraid.browser.ShortcutActivity$a$b */
        static final class C15584b extends C8468mr implements C8431lj<C8386ke> {

            /* renamed from: a */
            public static final C15584b f44201a = new C15584b();

            C15584b() {
                super(0);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo53190a() {
                return C8386ke.f21633a;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        String string;
        Bundle extras2;
        super.onCreate(bundle);
        Context context = this;
        FrameLayout frameLayout = new FrameLayout(context);
        Intent intent = getIntent();
        String str2 = "";
        if (intent == null || (extras2 = intent.getExtras()) == null || (str = extras2.getString("args", str2)) == null) {
            str = str2;
        }
        Intent intent2 = getIntent();
        if (!(intent2 == null || (extras = intent2.getExtras()) == null || (string = extras.getString("identifier", str2)) == null)) {
            str2 = string;
        }
        Context applicationContext = getApplicationContext();
        C8467mq.m23878a((Object) applicationContext, "this.applicationContext");
        C8303hr a = C8303hr.C8304a.m23388a(new C8308hu(context), this, new C8345iv(applicationContext, new C8307ht(this), new C15585b(this)));
        this.f44198c = a;
        if (!a.mo53687a(str, str2, frameLayout)) {
            Toast.makeText(context, "Invalid shortcut", 0).show();
            finish();
            return;
        }
        setContentView(frameLayout);
    }

    /* renamed from: io.presage.mraid.browser.ShortcutActivity$b */
    static final class C15585b extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ ShortcutActivity f44202a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15585b(ShortcutActivity shortcutActivity) {
            super(0);
            this.f44202a = shortcutActivity;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m45504b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m45504b() {
            this.f44202a.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C8303hr hrVar = this.f44198c;
        if (hrVar != null) {
            hrVar.mo53686a();
        }
    }
}
