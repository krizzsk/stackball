package com.facebook.unity;

import android.os.Bundle;
import com.facebook.CallbackManager;

public class FBUnityLoginActivity extends BaseActivity {
    public static final String LOGIN_PARAMS = "login_params";
    public static final String LOGIN_TYPE = "login_type";

    public enum LoginType {
        READ,
        PUBLISH,
        TV_READ,
        TV_PUBLISH
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(LOGIN_PARAMS);
        int i = C23211.$SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[((LoginType) getIntent().getSerializableExtra(LOGIN_TYPE)).ordinal()];
        if (i == 1) {
            FBLogin.loginWithReadPermissions(stringExtra, this);
        } else if (i == 2) {
            FBLogin.loginWithPublishPermissions(stringExtra, this);
        } else if (i == 3) {
            FBLogin.loginForTVWithReadPermissions(stringExtra, this);
        } else if (i == 4) {
            FBLogin.loginForTVWithPublishPermissions(stringExtra, this);
        }
    }

    /* renamed from: com.facebook.unity.FBUnityLoginActivity$1 */
    static /* synthetic */ class C23211 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.unity.FBUnityLoginActivity$LoginType[] r0 = com.facebook.unity.FBUnityLoginActivity.LoginType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType = r0
                com.facebook.unity.FBUnityLoginActivity$LoginType r1 = com.facebook.unity.FBUnityLoginActivity.LoginType.READ     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.unity.FBUnityLoginActivity$LoginType r1 = com.facebook.unity.FBUnityLoginActivity.LoginType.PUBLISH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.unity.FBUnityLoginActivity$LoginType r1 = com.facebook.unity.FBUnityLoginActivity.LoginType.TV_READ     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.unity.FBUnityLoginActivity$LoginType r1 = com.facebook.unity.FBUnityLoginActivity.LoginType.TV_PUBLISH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.unity.FBUnityLoginActivity.C23211.<clinit>():void");
        }
    }

    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }
}
