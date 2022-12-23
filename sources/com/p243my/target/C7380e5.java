package com.p243my.target;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: com.my.target.e5 */
public class C7380e5 extends C7438h5 {
    /* renamed from: a */
    public static boolean m19014a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 3;
    }

    public void collectData(Context context) {
        addParam("isc", m19014a(context) ? "1" : null);
    }
}
