package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TapjoyCache {
    public static final String CACHE_DIRECTORY_NAME = "Tapjoy/Cache/";
    public static final int CACHE_LIMIT = -1;

    /* renamed from: a */
    private static TapjoyCache f22139a = null;
    public static boolean unit_test_mode = false;

    /* renamed from: b */
    private Context f22140b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TapjoyCacheMap f22141c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Vector f22142d;

    /* renamed from: e */
    private ExecutorService f22143e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public File f22144f;

    public TapjoyCache(Context context) {
        if (f22139a == null || unit_test_mode) {
            f22139a = this;
            this.f22140b = context;
            this.f22141c = new TapjoyCacheMap(context, -1);
            this.f22142d = new Vector();
            this.f22143e = Executors.newFixedThreadPool(5);
            if (Environment.getExternalStorageDirectory() != null) {
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tapjoy"));
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tjcache/tmp/"));
            }
            File file = new File(this.f22140b.getFilesDir() + "/Tapjoy/Cache/");
            this.f22144f = file;
            if (!file.exists()) {
                if (this.f22144f.mkdirs()) {
                    TapjoyLog.m24273d("TapjoyCache", "Created directory at: " + this.f22144f.getPath());
                } else {
                    TapjoyLog.m24275e("TapjoyCache", "Error initalizing cache");
                    f22139a = null;
                }
            }
            m24235a();
        }
    }

    /* renamed from: a */
    private void m24235a() {
        SharedPreferences sharedPreferences = this.f22140b.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            File file = new File((String) next.getKey());
            if (!file.exists() || !file.isFile()) {
                TapjoyLog.m24273d("TapjoyCache", "Removing reference to missing asset: " + ((String) next.getKey()));
                edit.remove((String) next.getKey()).apply();
            } else {
                TapjoyCachedAssetData fromRawJSONString = TapjoyCachedAssetData.fromRawJSONString(next.getValue().toString());
                if (fromRawJSONString != null) {
                    TapjoyLog.m24273d("TapjoyCache", "Loaded Asset: " + fromRawJSONString.getAssetURL());
                    String b = m24237b(fromRawJSONString.getAssetURL());
                    if (b == null || "".equals(b) || b.length() <= 0) {
                        TapjoyLog.m24275e("TapjoyCache", "Removing asset because deserialization failed.");
                        edit.remove((String) next.getKey()).apply();
                    } else if (fromRawJSONString.getTimeOfDeathInSeconds() < System.currentTimeMillis() / 1000) {
                        TapjoyLog.m24273d("TapjoyCache", "Asset expired, removing from cache: " + fromRawJSONString.getAssetURL());
                        if (fromRawJSONString.getLocalFilePath() != null && fromRawJSONString.getLocalFilePath().length() > 0) {
                            TapjoyUtil.deleteFileOrDirectory(new File(fromRawJSONString.getLocalFilePath()));
                        }
                    } else {
                        this.f22141c.put(b, fromRawJSONString);
                    }
                } else {
                    TapjoyLog.m24275e("TapjoyCache", "Removing asset because deserialization failed.");
                    edit.remove((String) next.getKey()).apply();
                }
            }
        }
    }

    public void cacheAssetGroup(final JSONArray jSONArray, final TJCacheListener tJCacheListener) {
        if (jSONArray != null && jSONArray.length() > 0) {
            new Thread() {
                public final void run() {
                    TapjoyLog.m24273d("TapjoyCache", "Starting to cache asset group size of " + jSONArray.length());
                    ArrayList<Future> arrayList = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            Future cacheAssetFromJSONObject = TapjoyCache.this.cacheAssetFromJSONObject(jSONArray.getJSONObject(i));
                            if (cacheAssetFromJSONObject != null) {
                                arrayList.add(cacheAssetFromJSONObject);
                            }
                        } catch (JSONException unused) {
                            TapjoyLog.m24275e("TapjoyCache", "Failed to load JSON object from JSONArray");
                        }
                    }
                    int i2 = 1;
                    for (Future future : arrayList) {
                        try {
                            if (((Boolean) future.get()).booleanValue()) {
                            }
                        } catch (InterruptedException e) {
                            TapjoyLog.m24275e("TapjoyCache", "Caching thread failed: " + e.toString());
                        } catch (ExecutionException e2) {
                            TapjoyLog.m24275e("TapjoyCache", "Caching thread failed: " + e2.toString());
                        }
                        i2 = 2;
                    }
                    TapjoyLog.m24273d("TapjoyCache", "Finished caching group");
                    TJCacheListener tJCacheListener = tJCacheListener;
                    if (tJCacheListener != null) {
                        tJCacheListener.onCachingComplete(i2);
                    }
                }
            }.start();
        } else if (tJCacheListener != null) {
            tJCacheListener.onCachingComplete(1);
        }
    }

    public Future cacheAssetFromJSONObject(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("url");
            Long.valueOf(86400);
            return cacheAssetFromURL(string, jSONObject.optString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID), Long.valueOf(jSONObject.optLong(TapjoyConstants.TJC_TIME_TO_LIVE)).longValue());
        } catch (JSONException unused) {
            TapjoyLog.m24275e("TapjoyCache", "Required parameters to cache an asset from JSON is not present");
            return null;
        }
    }

    public Future cacheAssetFromURL(String str, String str2, long j) {
        try {
            URL url = new URL(str);
            if (!this.f22142d.contains(m24237b(str))) {
                return startCachingThread(url, str2, j);
            }
            TapjoyLog.m24273d("TapjoyCache", "URL is already in the process of being cached: " + str);
            return null;
        } catch (MalformedURLException unused) {
            TapjoyLog.m24273d("TapjoyCache", "Invalid cache assetURL");
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m24237b(String str) {
        if (str.startsWith("//")) {
            str = "http:" + str;
        }
        try {
            return new URL(str).getFile();
        } catch (MalformedURLException unused) {
            TapjoyLog.m24275e("TapjoyCache", "Invalid URL " + str);
            return "";
        }
    }

    public Future startCachingThread(URL url, String str, long j) {
        if (url != null) {
            return this.f22143e.submit(new CacheAssetThread(url, str, j));
        }
        return null;
    }

    public void clearTapjoyCache() {
        TapjoyLog.m24273d("TapjoyCache", "Cleaning Tapjoy cache!");
        TapjoyUtil.deleteFileOrDirectory(this.f22144f);
        if (this.f22144f.mkdirs()) {
            TapjoyLog.m24273d("TapjoyCache", "Created new cache directory at: " + this.f22144f.getPath());
        }
        this.f22141c = new TapjoyCacheMap(this.f22140b, -1);
    }

    public boolean removeAssetFromCache(String str) {
        String b = m24237b(str);
        return (b == "" || this.f22141c.remove((Object) b) == null) ? false : true;
    }

    public boolean isURLDownloading(String str) {
        String b;
        if (this.f22142d == null || (b = m24237b(str)) == "" || !this.f22142d.contains(b)) {
            return false;
        }
        return true;
    }

    public boolean isURLCached(String str) {
        return this.f22141c.get(m24237b(str)) != null;
    }

    public TapjoyCachedAssetData getCachedDataForURL(String str) {
        String b = m24237b(str);
        if (b != "") {
            return (TapjoyCachedAssetData) this.f22141c.get(b);
        }
        return null;
    }

    public TapjoyCacheMap getCachedData() {
        return this.f22141c;
    }

    public String getPathOfCachedURL(String str) {
        String b = m24237b(str);
        if (b == "" || !this.f22141c.containsKey(b)) {
            return str;
        }
        TapjoyCachedAssetData tapjoyCachedAssetData = (TapjoyCachedAssetData) this.f22141c.get(b);
        if (new File(tapjoyCachedAssetData.getLocalFilePath()).exists()) {
            return tapjoyCachedAssetData.getLocalURL();
        }
        getInstance().removeAssetFromCache(str);
        return str;
    }

    public String cachedAssetsToJSON() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.f22141c.entrySet()) {
            try {
                jSONObject.put(((String) entry.getKey()).toString(), ((TapjoyCachedAssetData) entry.getValue()).toRawJSONString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public String getCachedOfferIDs() {
        ArrayList arrayList = new ArrayList();
        TapjoyCacheMap tapjoyCacheMap = this.f22141c;
        if (tapjoyCacheMap == null) {
            return "";
        }
        for (Map.Entry value : tapjoyCacheMap.entrySet()) {
            String offerId = ((TapjoyCachedAssetData) value.getValue()).getOfferId();
            if (!(offerId == null || offerId.length() == 0 || arrayList.contains(offerId))) {
                arrayList.add(offerId);
            }
        }
        return TextUtils.join(",", arrayList);
    }

    public void printCacheInformation() {
        TapjoyLog.m24273d("TapjoyCache", "------------- Cache Data -------------");
        TapjoyLog.m24273d("TapjoyCache", "Number of files in cache: " + this.f22141c.size());
        TapjoyLog.m24273d("TapjoyCache", "Cache Size: " + TapjoyUtil.fileOrDirectorySize(this.f22144f));
        TapjoyLog.m24273d("TapjoyCache", "--------------------------------------");
    }

    public static TapjoyCache getInstance() {
        return f22139a;
    }

    public static void setInstance(TapjoyCache tapjoyCache) {
        f22139a = tapjoyCache;
    }

    public class CacheAssetThread implements Callable {

        /* renamed from: b */
        private URL f22149b;

        /* renamed from: c */
        private String f22150c;

        /* renamed from: d */
        private long f22151d;

        public CacheAssetThread(URL url, String str, long j) {
            this.f22149b = url;
            this.f22150c = str;
            this.f22151d = j;
            if (j <= 0) {
                this.f22151d = 86400;
            }
            TapjoyCache.this.f22142d.add(TapjoyCache.m24237b(this.f22149b.toString()));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(10:26|27|28|29|30|31|33|(1:35)|36|37) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x011f */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01a3 A[SYNTHETIC, Splitter:B:57:0x01a3] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01aa A[SYNTHETIC, Splitter:B:61:0x01aa] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01de A[SYNTHETIC, Splitter:B:70:0x01de] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01e5 A[SYNTHETIC, Splitter:B:74:0x01e5] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01ec A[SYNTHETIC, Splitter:B:80:0x01ec] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01f3 A[SYNTHETIC, Splitter:B:84:0x01f3] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x01b0=Splitter:B:67:0x01b0, B:54:0x017c=Splitter:B:54:0x017c} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean call() {
            /*
                r11 = this;
                java.net.URL r0 = r11.f22149b
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = com.tapjoy.TapjoyCache.m24237b((java.lang.String) r0)
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f22141c
                boolean r1 = r1.containsKey(r0)
                r2 = 1
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                java.lang.String r3 = "TapjoyCache"
                if (r1 == 0) goto L_0x008c
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f22141c
                java.lang.Object r1 = r1.get(r0)
                com.tapjoy.TapjoyCachedAssetData r1 = (com.tapjoy.TapjoyCachedAssetData) r1
                java.io.File r4 = new java.io.File
                java.lang.String r1 = r1.getLocalFilePath()
                r4.<init>(r1)
                boolean r1 = r4.exists()
                if (r1 == 0) goto L_0x0085
                long r4 = r11.f22151d
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 == 0) goto L_0x0052
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f22141c
                java.lang.Object r1 = r1.get(r0)
                com.tapjoy.TapjoyCachedAssetData r1 = (com.tapjoy.TapjoyCachedAssetData) r1
                long r4 = r11.f22151d
                r1.resetTimeToLive(r4)
                goto L_0x0064
            L_0x0052:
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r1 = r1.f22141c
                java.lang.Object r1 = r1.get(r0)
                com.tapjoy.TapjoyCachedAssetData r1 = (com.tapjoy.TapjoyCachedAssetData) r1
                r4 = 86400(0x15180, double:4.26873E-319)
                r1.resetTimeToLive(r4)
            L_0x0064:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "Reseting time to live for "
                r1.<init>(r4)
                java.net.URL r4 = r11.f22149b
                java.lang.String r4 = r4.toString()
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tapjoy.TapjoyLog.m24273d(r3, r1)
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.this
                java.util.Vector r1 = r1.f22142d
                r1.remove(r0)
                return r2
            L_0x0085:
                com.tapjoy.TapjoyCache r1 = com.tapjoy.TapjoyCache.getInstance()
                r1.removeAssetFromCache(r0)
            L_0x008c:
                java.lang.System.currentTimeMillis()
                r1 = 0
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01f7 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
                r5.<init>()     // Catch:{ Exception -> 0x01f7 }
                com.tapjoy.TapjoyCache r6 = com.tapjoy.TapjoyCache.this     // Catch:{ Exception -> 0x01f7 }
                java.io.File r6 = r6.f22144f     // Catch:{ Exception -> 0x01f7 }
                r5.append(r6)     // Catch:{ Exception -> 0x01f7 }
                java.lang.String r6 = "/"
                r5.append(r6)     // Catch:{ Exception -> 0x01f7 }
                java.lang.String r6 = com.tapjoy.TapjoyUtil.SHA256(r0)     // Catch:{ Exception -> 0x01f7 }
                r5.append(r6)     // Catch:{ Exception -> 0x01f7 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01f7 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x01f7 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Downloading and caching asset from: "
                r5.<init>(r6)
                java.net.URL r6 = r11.f22149b
                r5.append(r6)
                java.lang.String r6 = " to "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                com.tapjoy.TapjoyLog.m24273d(r3, r5)
                r5 = 0
                java.net.URL r6 = r11.f22149b     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                java.net.URLConnection r6 = com.tapjoy.internal.C9272fj.m24875a(r6)     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                r7 = 15000(0x3a98, float:2.102E-41)
                r6.setConnectTimeout(r7)     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                r7 = 30000(0x7530, float:4.2039E-41)
                r6.setReadTimeout(r7)     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                r6.connect()     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                boolean r7 = r6 instanceof java.net.HttpURLConnection     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                if (r7 == 0) goto L_0x0106
                r7 = r6
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                int r7 = r7.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                r8 = 200(0xc8, float:2.8E-43)
                if (r7 != r8) goto L_0x00f2
                goto L_0x0106
            L_0x00f2:
                java.io.IOException r2 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                java.lang.String r8 = "Unexpected response code: "
                r6.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                r6.append(r7)     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                java.lang.String r6 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                r2.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                throw r2     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
            L_0x0106:
                java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                r7.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x01ae, Exception -> 0x017a, all -> 0x0177 }
                java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016f, all -> 0x016a }
                java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016f, all -> 0x016a }
                r8.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016f, all -> 0x016a }
                r6.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x0173, Exception -> 0x016f, all -> 0x016a }
                com.tapjoy.TapjoyUtil.writeFileToDevice(r7, r6)     // Catch:{ SocketTimeoutException -> 0x0168, Exception -> 0x0166, all -> 0x0164 }
                r7.close()     // Catch:{ IOException -> 0x011f }
            L_0x011f:
                r6.close()     // Catch:{ IOException -> 0x0123 }
                goto L_0x0124
            L_0x0123:
            L_0x0124:
                com.tapjoy.TapjoyCachedAssetData r1 = new com.tapjoy.TapjoyCachedAssetData
                java.net.URL r5 = r11.f22149b
                java.lang.String r5 = r5.toString()
                java.lang.String r4 = r4.getAbsolutePath()
                long r6 = r11.f22151d
                r1.<init>(r5, r4, r6)
                java.lang.String r4 = r11.f22150c
                if (r4 == 0) goto L_0x013c
                r1.setOfferID(r4)
            L_0x013c:
                com.tapjoy.TapjoyCache r4 = com.tapjoy.TapjoyCache.this
                com.tapjoy.TapjoyCacheMap r4 = r4.f22141c
                r4.put((java.lang.String) r0, (com.tapjoy.TapjoyCachedAssetData) r1)
                com.tapjoy.TapjoyCache r4 = com.tapjoy.TapjoyCache.this
                java.util.Vector r4 = r4.f22142d
                r4.remove(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r4 = "----- Download complete -----"
                r0.<init>(r4)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tapjoy.TapjoyLog.m24273d(r3, r0)
                return r2
            L_0x0164:
                r0 = move-exception
                goto L_0x016c
            L_0x0166:
                r2 = move-exception
                goto L_0x0171
            L_0x0168:
                r2 = move-exception
                goto L_0x0175
            L_0x016a:
                r0 = move-exception
                r6 = r5
            L_0x016c:
                r5 = r7
                goto L_0x01ea
            L_0x016f:
                r2 = move-exception
                r6 = r5
            L_0x0171:
                r5 = r7
                goto L_0x017c
            L_0x0173:
                r2 = move-exception
                r6 = r5
            L_0x0175:
                r5 = r7
                goto L_0x01b0
            L_0x0177:
                r0 = move-exception
                r6 = r5
                goto L_0x01ea
            L_0x017a:
                r2 = move-exception
                r6 = r5
            L_0x017c:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e9 }
                java.lang.String r8 = "Error caching asset: "
                r7.<init>(r8)     // Catch:{ all -> 0x01e9 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e9 }
                r7.append(r2)     // Catch:{ all -> 0x01e9 }
                java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x01e9 }
                com.tapjoy.TapjoyLog.m24275e((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x01e9 }
                com.tapjoy.TapjoyCache r2 = com.tapjoy.TapjoyCache.this     // Catch:{ all -> 0x01e9 }
                java.util.Vector r2 = r2.f22142d     // Catch:{ all -> 0x01e9 }
                r2.remove(r0)     // Catch:{ all -> 0x01e9 }
                com.tapjoy.TapjoyUtil.deleteFileOrDirectory(r4)     // Catch:{ all -> 0x01e9 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x01e9 }
                if (r5 == 0) goto L_0x01a8
                r5.close()     // Catch:{ IOException -> 0x01a7 }
                goto L_0x01a8
            L_0x01a7:
            L_0x01a8:
                if (r6 == 0) goto L_0x01ad
                r6.close()     // Catch:{ IOException -> 0x01ad }
            L_0x01ad:
                return r0
            L_0x01ae:
                r2 = move-exception
                r6 = r5
            L_0x01b0:
                com.tapjoy.TapjoyErrorMessage r7 = new com.tapjoy.TapjoyErrorMessage     // Catch:{ all -> 0x01e9 }
                com.tapjoy.TapjoyErrorMessage$ErrorType r8 = com.tapjoy.TapjoyErrorMessage.ErrorType.NETWORK_ERROR     // Catch:{ all -> 0x01e9 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e9 }
                java.lang.String r10 = "Network timeout during caching: "
                r9.<init>(r10)     // Catch:{ all -> 0x01e9 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e9 }
                r9.append(r2)     // Catch:{ all -> 0x01e9 }
                java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x01e9 }
                r7.<init>(r8, r2)     // Catch:{ all -> 0x01e9 }
                com.tapjoy.TapjoyLog.m24274e((java.lang.String) r3, (com.tapjoy.TapjoyErrorMessage) r7)     // Catch:{ all -> 0x01e9 }
                com.tapjoy.TapjoyCache r2 = com.tapjoy.TapjoyCache.this     // Catch:{ all -> 0x01e9 }
                java.util.Vector r2 = r2.f22142d     // Catch:{ all -> 0x01e9 }
                r2.remove(r0)     // Catch:{ all -> 0x01e9 }
                com.tapjoy.TapjoyUtil.deleteFileOrDirectory(r4)     // Catch:{ all -> 0x01e9 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x01e9 }
                if (r5 == 0) goto L_0x01e3
                r5.close()     // Catch:{ IOException -> 0x01e2 }
                goto L_0x01e3
            L_0x01e2:
            L_0x01e3:
                if (r6 == 0) goto L_0x01e8
                r6.close()     // Catch:{ IOException -> 0x01e8 }
            L_0x01e8:
                return r0
            L_0x01e9:
                r0 = move-exception
            L_0x01ea:
                if (r5 == 0) goto L_0x01f1
                r5.close()     // Catch:{ IOException -> 0x01f0 }
                goto L_0x01f1
            L_0x01f0:
            L_0x01f1:
                if (r6 == 0) goto L_0x01f6
                r6.close()     // Catch:{ IOException -> 0x01f6 }
            L_0x01f6:
                throw r0
            L_0x01f7:
                com.tapjoy.TapjoyCache r2 = com.tapjoy.TapjoyCache.this
                java.util.Vector r2 = r2.f22142d
                r2.remove(r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyCache.CacheAssetThread.call():java.lang.Boolean");
        }
    }
}
