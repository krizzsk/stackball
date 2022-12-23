package p269io.presage.mraid.browser.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p245ed.internal.C8317ia;
import com.ogury.p245ed.internal.C8467mq;

/* renamed from: io.presage.mraid.browser.listeners.OrientationListener$1 */
public final class OrientationListener$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C8317ia f44204a;

    public OrientationListener$1(C8317ia iaVar) {
        this.f44204a = iaVar;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(intent, SDKConstants.PARAM_INTENT);
        if (C8467mq.m23880a((Object) "android.intent.action.CONFIGURATION_CHANGED", (Object) intent.getAction()) && this.f44204a.f21495c != (i = context.getResources().getConfiguration().orientation)) {
            this.f44204a.f21495c = i;
            this.f44204a.m23465c();
        }
    }
}
