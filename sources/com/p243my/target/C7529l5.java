package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.tracker.MyTracker;

/* renamed from: com.my.target.l5 */
public final class C7529l5 extends C7438h5 {

    /* renamed from: com.my.target.l5$a */
    public static final class C7530a {

        /* renamed from: a */
        public static final String f18949a;

        static {
            String str;
            try {
                str = MyTracker.getTrackerConfig().getId();
                if (TextUtils.isEmpty(str)) {
                    C7374e0.m18989a("MyTrackerHelper: myTracker id is empty");
                    str = null;
                }
            } catch (Throwable th) {
                C7374e0.m18989a("MyTrackerHelper: error occurred while working with myTracker, " + th.getMessage());
            }
            f18949a = str;
        }
    }

    public void collectData(Context context) {
        String str = C7530a.f18949a;
        if (str != null) {
            addParam("mtr_id", str);
        }
    }
}
