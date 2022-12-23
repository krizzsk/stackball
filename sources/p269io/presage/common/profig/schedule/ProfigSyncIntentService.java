package p269io.presage.common.profig.schedule;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.ogury.p245ed.internal.C8219fc;
import com.ogury.p245ed.internal.C8467mq;

/* renamed from: io.presage.common.profig.schedule.ProfigSyncIntentService */
public final class ProfigSyncIntentService extends IntentService {

    /* renamed from: a */
    public static final C15579a f44184a = new C15579a((byte) 0);

    public ProfigSyncIntentService() {
        super("ProfigService");
    }

    /* renamed from: io.presage.common.profig.schedule.ProfigSyncIntentService$a */
    public static final class C15579a {
        public /* synthetic */ C15579a(byte b) {
            this();
        }

        private C15579a() {
        }

        /* renamed from: a */
        public static void m45485a(Context context) {
            C8467mq.m23881b(context, "context");
            try {
                C8219fc.C8220a aVar = C8219fc.f21271a;
                Context applicationContext = context.getApplicationContext();
                C8467mq.m23878a((Object) applicationContext, "context.applicationContext");
                aVar.mo53483a(applicationContext).mo53482b();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        C8467mq.m23878a((Object) applicationContext, "applicationContext");
        C15579a.m45485a(applicationContext);
    }
}
