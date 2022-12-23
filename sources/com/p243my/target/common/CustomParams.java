package com.p243my.target.common;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.p243my.target.C7374e0;
import com.p243my.target.C7406f8;
import com.p243my.target.C7438h5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.common.CustomParams */
public final class CustomParams extends C7438h5 {
    private final Map<String, String> customParamsMap = new HashMap();
    private volatile String[] customUserIds;
    private volatile String[] emails;
    private volatile String[] icqIds;
    private volatile String[] okIds;
    private volatile String[] vkIds;

    /* renamed from: com.my.target.common.CustomParams$Gender */
    public interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    private synchronized void addCustomParam(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                this.customParamsMap.remove(str);
            } else {
                this.customParamsMap.put(str, str2);
            }
        }
    }

    public void collectData(Context context) {
    }

    public int getAge() {
        String param = getParam("ea");
        if (param == null) {
            return 0;
        }
        try {
            return Integer.parseInt(param);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public String getCustomParam(String str) {
        return getParam(str);
    }

    public String getCustomUserId() {
        String[] strArr = this.customUserIds;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public String[] getCustomUserIds() {
        String[] strArr = this.customUserIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public String getEmail() {
        String[] strArr = this.emails;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public String[] getEmails() {
        String[] strArr = this.emails;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public int getGender() {
        String param = getParam("eg");
        if (param == null) {
            return -1;
        }
        try {
            return Integer.parseInt(param);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public String getIcqId() {
        String[] strArr = this.icqIds;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public String[] getIcqIds() {
        String[] strArr = this.icqIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public String getLang() {
        return getParam(ServerParameters.LANG);
    }

    public String getMrgsAppId() {
        return getParam("mrgs_app_id");
    }

    public String getMrgsId() {
        return getParam("mrgs_device_id");
    }

    public String getMrgsUserId() {
        return getParam("mrgs_user_id");
    }

    public String getOkId() {
        String[] strArr = this.okIds;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public String[] getOkIds() {
        String[] strArr = this.okIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public String getVKId() {
        String[] strArr = this.vkIds;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public String[] getVKIds() {
        String[] strArr = this.vkIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void putCustomDataToMap(Map<String, String> map) {
        map.putAll(this.customParamsMap);
    }

    public void setAge(int i) {
        if (i >= 0) {
            C7374e0.m18989a("age param set to " + i);
            addParam("ea", String.valueOf(i));
            return;
        }
        C7374e0.m18989a("age param removed");
        removeParam("ea");
    }

    public void setCustomParam(String str, String str2) {
        addParam(str, str2);
        addCustomParam(str, str2);
    }

    public void setCustomUserId(String str) {
        if (str == null) {
            this.customUserIds = null;
        } else {
            this.customUserIds = new String[]{str};
        }
        addParam("custom_user_id", str);
    }

    public void setCustomUserIds(String[] strArr) {
        if (strArr == null) {
            this.customUserIds = null;
            removeParam("custom_user_id");
            return;
        }
        this.customUserIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("custom_user_id", C7406f8.m19146a(strArr));
    }

    public void setEmail(String str) {
        if (str == null) {
            this.emails = null;
        } else {
            this.emails = new String[]{str};
        }
        addParam("email", str);
    }

    public void setEmails(String[] strArr) {
        if (strArr == null) {
            this.emails = null;
            removeParam("email");
            return;
        }
        this.emails = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("email", C7406f8.m19146a(strArr));
    }

    public void setGender(int i) {
        if (i == 0 || i == 1 || i == 2) {
            C7374e0.m18989a("gender param is set to " + i);
            addParam("eg", String.valueOf(i));
            return;
        }
        removeParam("eg");
        C7374e0.m18989a("gender param removed");
    }

    public void setIcqId(String str) {
        if (str == null) {
            this.icqIds = null;
        } else {
            this.icqIds = new String[]{str};
        }
        addParam("icq_id", str);
    }

    public void setIcqIds(String[] strArr) {
        if (strArr == null) {
            this.icqIds = null;
            removeParam("icq_id");
            return;
        }
        this.icqIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("icq_id", C7406f8.m19146a(strArr));
    }

    public void setLang(String str) {
        addParam(ServerParameters.LANG, str);
    }

    public void setMrgsAppId(String str) {
        addParam("mrgs_app_id", str);
    }

    public void setMrgsId(String str) {
        addParam("mrgs_device_id", str);
    }

    public void setMrgsUserId(String str) {
        addParam("mrgs_user_id", str);
    }

    public void setOkId(String str) {
        if (str == null) {
            this.okIds = null;
        } else {
            this.okIds = new String[]{str};
        }
        addParam("ok_id", str);
    }

    public void setOkIds(String[] strArr) {
        if (strArr == null) {
            this.okIds = null;
            removeParam("ok_id");
            return;
        }
        this.okIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("ok_id", C7406f8.m19146a(strArr));
    }

    public void setVKId(String str) {
        if (str == null) {
            this.vkIds = null;
        } else {
            this.vkIds = new String[]{str};
        }
        addParam("vk_id", str);
    }

    public void setVKIds(String[] strArr) {
        if (strArr == null) {
            this.vkIds = null;
            removeParam("vk_id");
            return;
        }
        this.vkIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("vk_id", C7406f8.m19146a(strArr));
    }
}
