package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.util.concurrent.ConcurrentHashMap;

public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, C7179c> rewardUnitSettings;

    /* renamed from: com.mbridge.msdk.reward.adapter.RewardUnitCacheManager$a */
    private static final class C6756a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final RewardUnitCacheManager f16523a = new RewardUnitCacheManager();
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }

    public static RewardUnitCacheManager getInstance() {
        return C6756a.f16523a;
    }

    public final void add(String str, String str2, C7179c cVar) {
        try {
            String str3 = str + "_" + str2;
            if (cVar != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, cVar);
        } catch (Exception e) {
            C6361q.m16158d(TAG, e.getMessage());
        }
    }

    public final C7179c get(String str, String str2) {
        try {
            return this.rewardUnitSettings.remove(str + "_" + str2);
        } catch (Exception e) {
            C6361q.m16158d(TAG, e.getMessage());
        } catch (Throwable unused) {
        }
        return null;
    }
}
