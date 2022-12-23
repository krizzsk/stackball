package com.ogury.p244cm.internal;

import com.facebook.appevents.AppEventsConstants;

/* renamed from: com.ogury.cm.internal.aacbb */
public final class aacbb {

    /* renamed from: a */
    public static final aacbb f20369a = new aacbb();

    private aacbb() {
    }

    /* renamed from: a */
    public static String m21781a(int i) {
        String binaryString = Integer.toBinaryString(i);
        bbabc.m22048a((Object) binaryString, "binaryString");
        bbabc.m22051b(binaryString, "receiver$0");
        int length = 32 - binaryString.length();
        if (length > 0) {
            int i2 = 1;
            while (true) {
                binaryString = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(binaryString));
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return binaryString;
    }
}
