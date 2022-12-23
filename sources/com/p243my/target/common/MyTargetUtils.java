package com.p243my.target.common;

import android.content.Context;
import com.p243my.target.C7456i5;
import com.p243my.target.C7741x8;
import java.util.Map;

/* renamed from: com.my.target.common.MyTargetUtils */
public class MyTargetUtils {
    public static Map<String, String> collectInfo(Context context) {
        C7456i5.m19373c().collectData(context);
        return C7456i5.m19373c().getData();
    }

    public static void sendStat(String str, Context context) {
        C7741x8.m20826c(str, context);
    }
}
