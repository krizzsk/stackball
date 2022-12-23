package p269io.presage.mraid.browser.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p245ed.internal.C8314hy;
import com.ogury.p245ed.internal.C8467mq;

/* renamed from: io.presage.mraid.browser.listeners.CloseSystemDialogsListener$1 */
public final class CloseSystemDialogsListener$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C8314hy f44203a;

    public CloseSystemDialogsListener$1(C8314hy hyVar) {
        this.f44203a = hyVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(intent, SDKConstants.PARAM_INTENT);
        if (this.f44203a.f21482b.mo53683d()) {
            this.f44203a.m23444c();
        }
    }
}
