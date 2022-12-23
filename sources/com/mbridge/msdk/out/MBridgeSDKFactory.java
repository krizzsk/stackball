package com.mbridge.msdk.out;

import com.mbridge.msdk.system.C6812a;

public class MBridgeSDKFactory {
    private static C6812a instance;

    private MBridgeSDKFactory() {
    }

    public static C6812a getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                if (instance == null) {
                    instance = new C6812a();
                }
            }
        }
        return instance;
    }
}
