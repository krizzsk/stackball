package com.fyber.inneractive.sdk.config.p034a;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.a.j */
public class C2758j implements C2752d {

    /* renamed from: a */
    public static final String f6499a = C2758j.class.getSimpleName();

    /* renamed from: b */
    private String f6500b;

    /* renamed from: c */
    private boolean f6501c;

    public C2758j(String str, boolean z) {
        this.f6500b = str;
        this.f6501c = z;
    }

    /* renamed from: a */
    public final boolean mo17992a(C2753e eVar) {
        boolean z;
        if (!TextUtils.isEmpty(this.f6500b)) {
            String version = InneractiveAdManager.getVersion();
            IAlog.m9034b("%s: shouldApply - running version: %s", f6499a, version);
            IAlog.m9034b("%s: shouldApply - filter version: %s", f6499a, this.f6500b);
            String[] split = version.split("\\.", 4);
            String[] split2 = this.f6500b.split("\\.", 4);
            String str = split2[split2.length - 1];
            if (str.equals("*")) {
                int i = 0;
                while (i < split2.length - 1) {
                    if (split.length < i) {
                        IAlog.m9034b("%s: shouldApplyByAsterix - running version is shorter than filter. applying", f6499a);
                    } else if (!split[i].equals(split2[i])) {
                        IAlog.m9034b("%s: shouldApplyByAsterix - running version does not comply with filter. applying", f6499a);
                    } else {
                        i++;
                    }
                    z = true;
                }
                IAlog.m9034b("%s: shouldApplyByAsterix - version aligned with filter. do not apply", f6499a);
                z = false;
                IAlog.m9034b("%s: shouldApply - * version match: %b", f6499a, Boolean.valueOf(!z));
                if (z) {
                    return this.f6501c;
                }
                if (!this.f6501c) {
                    return true;
                }
                return false;
            } else if (str.equals("+")) {
                boolean a = m5991a(split, split2);
                IAlog.m9034b("%s: shouldApply - + version match: %b", f6499a, Boolean.valueOf(!a));
                if (a) {
                    return this.f6501c;
                }
                if (!this.f6501c) {
                    return true;
                }
                return false;
            } else {
                boolean z2 = !this.f6500b.equalsIgnoreCase(version);
                IAlog.m9034b("%s: shouldApply - exact version match: %b", f6499a, Boolean.valueOf(!z2));
                if (z2) {
                    return this.f6501c;
                }
                if (!this.f6501c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5991a(String[] strArr, String[] strArr2) {
        int i = 0;
        while (i < strArr2.length - 1) {
            if (strArr.length < i) {
                IAlog.m9034b("%s: shouldApplyByPlus - running version is shorter than filter. applying", f6499a);
                return true;
            }
            try {
                int intValue = Integer.valueOf(strArr2[i]).intValue();
                int intValue2 = Integer.valueOf(strArr[i]).intValue();
                if (intValue2 > intValue) {
                    IAlog.m9034b("%s: shouldApplyByPlus - running version is greater than the filter's version. no filter needed", f6499a);
                    return false;
                } else if (intValue2 < intValue) {
                    IAlog.m9034b("%s: shouldApplyByPlus - running version is lower than the filter's version. applying filter ", f6499a);
                    return true;
                } else {
                    i++;
                }
            } catch (NumberFormatException e) {
                IAlog.m9034b("%s: shouldApplyByPlus - Error in version string! Not a number. %s", f6499a, e.getMessage());
                return true;
            }
        }
        IAlog.m9034b("%s: shouldApplyByAsterix - version aligned with filter. do not apply", f6499a);
        return false;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"sdk", this.f6500b, Boolean.valueOf(this.f6501c)});
    }
}
