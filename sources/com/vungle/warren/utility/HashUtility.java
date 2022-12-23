package com.vungle.warren.utility;

import com.facebook.appevents.AppEventsConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtility {
    public static String sha256(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder(digest.length);
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getHashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
