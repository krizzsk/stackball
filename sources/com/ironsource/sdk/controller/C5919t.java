package com.ironsource.sdk.controller;

import com.facebook.appevents.AppEventsConstants;
import com.ironsource.sdk.utils.C6060c;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* renamed from: com.ironsource.sdk.controller.t */
final class C5919t {

    /* renamed from: a */
    String f14463a;

    C5919t(String str) {
        this.f14463a = str;
    }

    /* renamed from: a */
    private String m14596a(String str) {
        try {
            return C6060c.m14976a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return m14597b(str);
        }
    }

    /* renamed from: b */
    private String m14597b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo42332a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m14596a(str + str2 + this.f14463a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
