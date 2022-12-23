package com.facebook.appevents.p028ml;

import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.ml.ModelManager$enable$1 */
/* compiled from: ModelManager.kt */
final class ModelManager$enable$1 implements Runnable {
    public static final ModelManager$enable$1 INSTANCE = new ModelManager$enable$1();

    ModelManager$enable$1() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[Catch:{ Exception -> 0x0080, all -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            boolean r2 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r7)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            android.content.Context r2 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
            r4 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            r3 = 0
            java.lang.String r3 = r2.getString(r1, r3)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            if (r3 == 0) goto L_0x0030
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            if (r5 != 0) goto L_0x0027
            r4 = 1
        L_0x0027:
            if (r4 == 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            goto L_0x0035
        L_0x0030:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            r4.<init>()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
        L_0x0035:
            r5 = 0
            long r5 = r2.getLong(r0, r5)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            com.facebook.internal.FeatureManager$Feature r3 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            boolean r3 = com.facebook.internal.FeatureManager.isEnabled(r3)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            if (r3 == 0) goto L_0x0051
            int r3 = r4.length()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            if (r3 == 0) goto L_0x0051
            com.facebook.appevents.ml.ModelManager r3 = com.facebook.appevents.p028ml.ModelManager.INSTANCE     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            boolean r3 = com.facebook.appevents.p028ml.ModelManager.access$isValidTimestamp(r3, r5)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            if (r3 != 0) goto L_0x0070
        L_0x0051:
            com.facebook.appevents.ml.ModelManager r3 = com.facebook.appevents.p028ml.ModelManager.INSTANCE     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            org.json.JSONObject r4 = com.facebook.appevents.p028ml.ModelManager.access$fetchModels(r3)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            if (r4 == 0) goto L_0x007b
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            r0.apply()     // Catch:{ Exception -> 0x0080, all -> 0x007c }
        L_0x0070:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.p028ml.ModelManager.INSTANCE     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            com.facebook.appevents.p028ml.ModelManager.access$addModels(r0, r4)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.p028ml.ModelManager.INSTANCE     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            com.facebook.appevents.p028ml.ModelManager.access$enableMTML(r0)     // Catch:{ Exception -> 0x0080, all -> 0x007c }
            goto L_0x0080
        L_0x007b:
            return
        L_0x007c:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r7)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p028ml.ModelManager$enable$1.run():void");
    }
}
