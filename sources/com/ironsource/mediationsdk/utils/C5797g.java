package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.C5505a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;

/* renamed from: com.ironsource.mediationsdk.utils.g */
public final class C5797g {

    /* renamed from: d */
    private static final C5797g f13950d = new C5797g();

    /* renamed from: a */
    private String f13951a = "";

    /* renamed from: b */
    private String f13952b = "";

    /* renamed from: c */
    private String f13953c = "";

    /* renamed from: a */
    public static C5797g m14321a() {
        return f13950d;
    }

    /* renamed from: b */
    public final String mo42123b() {
        if (TextUtils.isEmpty(this.f13951a)) {
            this.f13951a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f13951a;
    }

    /* renamed from: c */
    public final synchronized String mo42124c() {
        if (TextUtils.isEmpty(this.f13952b)) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 32; i++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f13952b = sb.toString();
        }
        return this.f13952b;
    }

    /* renamed from: d */
    public final String mo42125d() {
        if (TextUtils.isEmpty(this.f13953c)) {
            try {
                this.f13953c = C5505a.C55061.m13071a(mo42124c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while encrypting session key: " + e.getMessage());
                return "";
            }
        }
        return this.f13953c;
    }
}
