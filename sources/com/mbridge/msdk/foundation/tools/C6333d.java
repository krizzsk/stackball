package com.mbridge.msdk.foundation.tools;

import android.content.Context;

/* renamed from: com.mbridge.msdk.foundation.tools.d */
/* compiled from: DomainSameDiTool */
public class C6333d {
    /* renamed from: a */
    public static void m16060a(Context context) {
        if (context != null) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry");
                Object newInstance = cls.newInstance();
                cls.getMethod("check", new Class[]{Context.class}).invoke(newInstance, new Object[]{context});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
