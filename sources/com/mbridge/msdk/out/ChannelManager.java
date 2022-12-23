package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.C6235Aa;
import java.lang.reflect.Method;

public class ChannelManager {
    public static void setChannel(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C6235Aa aa = new C6235Aa();
                Method declaredMethod = aa.getClass().getDeclaredMethod("b", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(aa, new Object[]{str});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
