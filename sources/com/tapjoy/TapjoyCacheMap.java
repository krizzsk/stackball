package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TapjoyCacheMap extends ConcurrentHashMap {

    /* renamed from: a */
    private Context f22152a;

    /* renamed from: b */
    private int f22153b = -1;

    public TapjoyCacheMap(Context context, int i) {
        this.f22152a = context;
        this.f22153b = i;
    }

    /* renamed from: a */
    private String m24239a() {
        long j = -1;
        String str = "";
        for (Map.Entry entry : entrySet()) {
            long timestampInSeconds = ((TapjoyCachedAssetData) entry.getValue()).getTimestampInSeconds();
            if (j == 0 || timestampInSeconds < j) {
                str = (String) entry.getKey();
                j = timestampInSeconds;
            }
        }
        return str;
    }

    public TapjoyCachedAssetData put(String str, TapjoyCachedAssetData tapjoyCachedAssetData) {
        TapjoyLog.m24273d("TapjoyCacheMap", "TapjoyCacheMap::put() -- key: " + str + " assetURL: " + tapjoyCachedAssetData.getAssetURL());
        if (tapjoyCachedAssetData == null || tapjoyCachedAssetData.getTimeOfDeathInSeconds() <= System.currentTimeMillis() / 1000) {
            return null;
        }
        if (size() == this.f22153b) {
            remove((Object) m24239a());
        }
        SharedPreferences.Editor edit = this.f22152a.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0).edit();
        edit.putString(tapjoyCachedAssetData.getLocalFilePath(), tapjoyCachedAssetData.toRawJSONString());
        edit.apply();
        return (TapjoyCachedAssetData) super.put(str, tapjoyCachedAssetData);
    }

    public TapjoyCachedAssetData remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        SharedPreferences.Editor edit = this.f22152a.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0).edit();
        edit.remove(((TapjoyCachedAssetData) get(obj)).getLocalFilePath());
        edit.apply();
        String localFilePath = ((TapjoyCachedAssetData) get(obj)).getLocalFilePath();
        if (localFilePath != null && localFilePath.length() > 0) {
            TapjoyUtil.deleteFileOrDirectory(new File(localFilePath));
        }
        TapjoyLog.m24273d("TapjoyCacheMap", "TapjoyCacheMap::remove() -- key: " + obj);
        return (TapjoyCachedAssetData) super.remove(obj);
    }

    public boolean replace(String str, TapjoyCachedAssetData tapjoyCachedAssetData, TapjoyCachedAssetData tapjoyCachedAssetData2) {
        throw new UnsupportedOperationException();
    }

    public TapjoyCachedAssetData replace(String str, TapjoyCachedAssetData tapjoyCachedAssetData) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }
}
