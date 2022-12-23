package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;

public class AuthorityInfoBean {
    public int getAuthGenDataStatus() {
        if (!C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
            return Integer.parseInt(C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_GENERAL_DATA));
        }
        return 1;
    }

    public int getAuthDeviceIdStatus() {
        if (!C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
            return Integer.parseInt(C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_DEVICE_ID));
        }
        return 1;
    }

    public int getAuthSerialIdStatus() {
        if (!C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
            return Integer.parseInt(C6121a.m15293a().mo42882b(MBridgeConstans.AUTHORITY_SERIAL_ID));
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AuthorityInfoBean mo42909a(int i) {
        C6121a.m15293a().mo42880a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
        C6121a.m15293a().mo42880a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
        C6121a.m15293a().mo42880a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AuthorityInfoBean mo42910b(int i) {
        C6121a.m15293a().mo42880a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AuthorityInfoBean mo42911c(int i) {
        C6121a.m15293a().mo42880a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AuthorityInfoBean mo42912d(int i) {
        C6121a.m15293a().mo42880a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AuthorityInfoBean mo42913e(int i) {
        C6121a.m15293a().mo42880a(MBridgeConstans.AUTHORITY_OTHER, String.valueOf(i));
        return this;
    }
}
