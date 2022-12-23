package com.facebook.appevents.p028ml;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u000289B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001cH\u0002J9\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u0010\"\u001a\u00020#2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020(0.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0007¢\u0006\u0002\u00101J%\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002¢\u0006\u0002\u00106J%\u00107\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002¢\u0006\u0002\u00106R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, mo72093d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "()V", "ASSET_URI_KEY", "", "CACHE_KEY_MODELS", "CACHE_KEY_REQUEST_TIMESTAMP", "MODEL_ASSERT_STORE", "MODEL_REQUEST_INTERVAL_MILLISECONDS", "", "MTML_INTEGRITY_DETECT_PREDICTION", "", "MTML_SUGGESTED_EVENTS_PREDICTION", "MTML_USE_CASE", "RULES_URI_KEY", "SDK_MODEL_ASSET", "THRESHOLD_KEY", "USE_CASE_KEY", "VERSION_ID_KEY", "isLocaleEnglish", "", "()Z", "taskHandlers", "", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "addModels", "", "models", "Lorg/json/JSONObject;", "enable", "enableMTML", "fetchModels", "getRuleFile", "Ljava/io/File;", "task", "Lcom/facebook/appevents/ml/ModelManager$Task;", "isValidTimestamp", "timestamp", "", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "parseRawJsonObject", "jsonObject", "predict", "", "denses", "texts", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "processIntegrityDetectionResult", "res", "Lcom/facebook/appevents/ml/MTensor;", "thresholds", "(Lcom/facebook/appevents/ml/MTensor;[F)[Ljava/lang/String;", "processSuggestedEventResult", "Task", "TaskHandler", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.ml.ModelManager */
/* compiled from: ModelManager.kt */
public final class ModelManager {
    private static final String ASSET_URI_KEY = "asset_uri";
    private static final String CACHE_KEY_MODELS = "models";
    private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";
    public static final ModelManager INSTANCE = new ModelManager();
    private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
    private static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;
    private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = CollectionsKt.listOf("none", IntegrityManager.INTEGRITY_TYPE_ADDRESS, IntegrityManager.INTEGRITY_TYPE_HEALTH);
    private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = CollectionsKt.listOf("other", AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, AppEventsConstants.EVENT_NAME_ADDED_TO_CART, AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT);
    private static final String MTML_USE_CASE = "MTML";
    private static final String RULES_URI_KEY = "rules_uri";
    private static final String SDK_MODEL_ASSET = "%s/model_asset";
    private static final String THRESHOLD_KEY = "thresholds";
    private static final String USE_CASE_KEY = "use_case";
    private static final String VERSION_ID_KEY = "version_id";
    private static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();

    @Metadata(mo72094k = 3, mo72095mv = {1, 5, 1})
    /* renamed from: com.facebook.appevents.ml.ModelManager$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            $EnumSwitchMapping$0[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ void access$addModels(ModelManager modelManager, JSONObject jSONObject) {
        Class<ModelManager> cls = ModelManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                modelManager.addModels(jSONObject);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ void access$enableMTML(ModelManager modelManager) {
        Class<ModelManager> cls = ModelManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                modelManager.enableMTML();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final /* synthetic */ JSONObject access$fetchModels(ModelManager modelManager) {
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return modelManager.fetchModels();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ boolean access$isValidTimestamp(ModelManager modelManager, long j) {
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            return modelManager.isValidTimestamp(j);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final /* synthetic */ float[] access$parseJsonArray(ModelManager modelManager, JSONArray jSONArray) {
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return modelManager.parseJsonArray(jSONArray);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @Metadata(mo72092d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo72093d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* renamed from: com.facebook.appevents.ml.ModelManager$Task */
    /* compiled from: ModelManager.kt */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        @Metadata(mo72094k = 3, mo72095mv = {1, 5, 1})
        /* renamed from: com.facebook.appevents.ml.ModelManager$Task$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

            static {
                int[] iArr = new int[Task.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                $EnumSwitchMapping$0[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                int[] iArr2 = new int[Task.values().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                $EnumSwitchMapping$1[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
            }
        }

        public final String toKey() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String toUseCase() {
            int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @JvmStatic
    public static final void enable() {
        Class<ModelManager> cls = ModelManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Utility.runOnNonUiThread(ModelManager$enable$1.INSTANCE);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private final boolean isValidTimestamp(long j) {
        if (CrashShieldHandler.isObjectCrashing(this) || j == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j < ((long) MODEL_REQUEST_INTERVAL_MILLISECONDS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void addModels(JSONObject jSONObject) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        TaskHandler build = TaskHandler.Companion.build(jSONObject.getJSONObject(keys.next()));
                        if (build != null) {
                            taskHandlers.put(build.getUseCase(), build);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject parseRawJsonObject(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            boolean r5 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r12)
            r6 = 0
            if (r5 == 0) goto L_0x0012
            return r6
        L_0x0012:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = "data"
            org.json.JSONArray r13 = r13.getJSONArray(r7)     // Catch:{ JSONException -> 0x0060 }
            r7 = 0
            int r8 = r13.length()     // Catch:{ JSONException -> 0x0060 }
        L_0x0022:
            if (r7 >= r8) goto L_0x0065
            org.json.JSONObject r9 = r13.getJSONObject(r7)     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
            r10.<init>()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r2)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r4)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONArray r11 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r0)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0060 }
            boolean r11 = r9.has(r3)     // Catch:{ JSONException -> 0x0060 }
            if (r11 == 0) goto L_0x0056
            java.lang.String r11 = r9.getString(r3)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0060 }
        L_0x0056:
            java.lang.String r9 = r9.getString(r4)     // Catch:{ JSONException -> 0x0060 }
            r5.put(r9, r10)     // Catch:{ JSONException -> 0x0060 }
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0060:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
        L_0x0065:
            return r5
        L_0x0066:
            r13 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r13, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p028ml.ModelManager.parseRawJsonObject(org.json.JSONObject):org.json.JSONObject");
    }

    private final JSONObject fetchModels() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", strArr));
            GraphRequest.Companion companion = GraphRequest.Companion;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(SDK_MODEL_ASSET, Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            GraphRequest newGraphPathRequest = companion.newGraphPathRequest((AccessToken) null, format, (GraphRequest.Callback) null);
            newGraphPathRequest.setSkipClientToken(true);
            newGraphPathRequest.setParameters(bundle);
            JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
            if (jSONObject != null) {
                return parseRawJsonObject(jSONObject);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void enableMTML() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                List arrayList = new ArrayList();
                String str = null;
                int i = 0;
                for (Map.Entry next : taskHandlers.entrySet()) {
                    String str2 = (String) next.getKey();
                    TaskHandler taskHandler = (TaskHandler) next.getValue();
                    if (Intrinsics.areEqual((Object) str2, (Object) Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                        str = taskHandler.getAssetUri();
                        i = Math.max(i, taskHandler.getVersionId());
                        if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents) && isLocaleEnglish()) {
                            arrayList.add(taskHandler.setOnPostExecute(ModelManager$enableMTML$1.INSTANCE));
                        }
                    }
                    if (Intrinsics.areEqual((Object) str2, (Object) Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                        String assetUri = taskHandler.getAssetUri();
                        int max = Math.max(i, taskHandler.getVersionId());
                        if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity)) {
                            arrayList.add(taskHandler.setOnPostExecute(ModelManager$enableMTML$2.INSTANCE));
                        }
                        str = assetUri;
                        i = max;
                    }
                }
                if (str != null && i > 0 && !arrayList.isEmpty()) {
                    TaskHandler.Companion.execute(new TaskHandler(MTML_USE_CASE, str, (String) null, i, (float[]) null), arrayList);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final boolean isLocaleEnglish() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Locale resourceLocale = Utility.getResourceLocale();
            if (resourceLocale != null) {
                String language = resourceLocale.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                if (StringsKt.contains$default((CharSequence) language, (CharSequence) "en", false, 2, (Object) null)) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] parseJsonArray(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JvmStatic
    public static final File getRuleFile(Task task) {
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler != null) {
                return taskHandler.getRuleFile();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    @JvmStatic
    public static final String[] predict(Task task, float[][] fArr, String[] strArr) {
        C2085Model model;
        float[][] fArr2 = fArr;
        String[] strArr2 = strArr;
        Class<ModelManager> cls = ModelManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(fArr2, "denses");
            Intrinsics.checkNotNullParameter(strArr2, "texts");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null || (model = taskHandler.getModel()) == null) {
                return null;
            }
            float[] thresholds = taskHandler.getThresholds();
            int length = strArr2.length;
            boolean z = false;
            int length2 = fArr2[0].length;
            MTensor mTensor = new MTensor(new int[]{length, length2});
            for (int i = 0; i < length; i++) {
                System.arraycopy(fArr2[i], 0, mTensor.getData(), i * length2, length2);
            }
            MTensor predictOnMTML = model.predictOnMTML(mTensor, strArr2, task.toKey());
            if (!(predictOnMTML == null || thresholds == null)) {
                if (!(predictOnMTML.getData().length == 0)) {
                    if (thresholds.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
                        if (i2 == 1) {
                            return INSTANCE.processSuggestedEventResult(predictOnMTML, thresholds);
                        }
                        if (i2 == 2) {
                            return INSTANCE.processIntegrityDetectionResult(predictOnMTML, thresholds);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final String[] processSuggestedEventResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            Iterable until = RangesKt.until(0, shape);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= fArr[i]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = ((List) arrayList).toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final String[] processIntegrityDetectionResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            Iterable until = RangesKt.until(0, shape);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= fArr[i]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = ((List) arrayList).toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Metadata(mo72092d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, mo72093d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "", "useCase", "", "assetUri", "ruleUri", "versionId", "", "thresholds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "getAssetUri", "()Ljava/lang/String;", "setAssetUri", "(Ljava/lang/String;)V", "model", "Lcom/facebook/appevents/ml/Model;", "getModel", "()Lcom/facebook/appevents/ml/Model;", "setModel", "(Lcom/facebook/appevents/ml/Model;)V", "onPostExecute", "Ljava/lang/Runnable;", "ruleFile", "Ljava/io/File;", "getRuleFile", "()Ljava/io/File;", "setRuleFile", "(Ljava/io/File;)V", "getRuleUri", "setRuleUri", "getThresholds", "()[F", "setThresholds", "([F)V", "getUseCase", "setUseCase", "getVersionId", "()I", "setVersionId", "(I)V", "setOnPostExecute", "Companion", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* renamed from: com.facebook.appevents.ml.ModelManager$TaskHandler */
    /* compiled from: ModelManager.kt */
    private static final class TaskHandler {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private String assetUri;
        private C2085Model model;
        /* access modifiers changed from: private */
        public Runnable onPostExecute;
        private File ruleFile;
        private String ruleUri;
        private float[] thresholds;
        private String useCase;
        private int versionId;

        public TaskHandler(String str, String str2, String str3, int i, float[] fArr) {
            Intrinsics.checkNotNullParameter(str, "useCase");
            Intrinsics.checkNotNullParameter(str2, "assetUri");
            this.useCase = str;
            this.assetUri = str2;
            this.ruleUri = str3;
            this.versionId = i;
            this.thresholds = fArr;
        }

        public final String getUseCase() {
            return this.useCase;
        }

        public final void setUseCase(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.useCase = str;
        }

        public final String getAssetUri() {
            return this.assetUri;
        }

        public final void setAssetUri(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.assetUri = str;
        }

        public final String getRuleUri() {
            return this.ruleUri;
        }

        public final void setRuleUri(String str) {
            this.ruleUri = str;
        }

        public final int getVersionId() {
            return this.versionId;
        }

        public final void setVersionId(int i) {
            this.versionId = i;
        }

        public final float[] getThresholds() {
            return this.thresholds;
        }

        public final void setThresholds(float[] fArr) {
            this.thresholds = fArr;
        }

        public final File getRuleFile() {
            return this.ruleFile;
        }

        public final void setRuleFile(File file) {
            this.ruleFile = file;
        }

        public final C2085Model getModel() {
            return this.model;
        }

        public final void setModel(C2085Model model2) {
            this.model = model2;
        }

        public final TaskHandler setOnPostExecute(Runnable runnable) {
            this.onPostExecute = runnable;
            return this;
        }

        @Metadata(mo72092d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004J\u001c\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016¨\u0006\u0017"}, mo72093d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler$Companion;", "", "()V", "build", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "json", "Lorg/json/JSONObject;", "deleteOldFiles", "", "useCase", "", "versionId", "", "download", "uri", "name", "onComplete", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "execute", "handler", "master", "slaves", "", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
        /* renamed from: com.facebook.appevents.ml.ModelManager$TaskHandler$Companion */
        /* compiled from: ModelManager.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TaskHandler build(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString(ModelManager.USE_CASE_KEY);
                    String string2 = jSONObject.getString(ModelManager.ASSET_URI_KEY);
                    String optString = jSONObject.optString(ModelManager.RULES_URI_KEY, (String) null);
                    int i = jSONObject.getInt(ModelManager.VERSION_ID_KEY);
                    float[] access$parseJsonArray = ModelManager.access$parseJsonArray(ModelManager.INSTANCE, jSONObject.getJSONArray(ModelManager.THRESHOLD_KEY));
                    Intrinsics.checkNotNullExpressionValue(string, "useCase");
                    Intrinsics.checkNotNullExpressionValue(string2, "assetUri");
                    return new TaskHandler(string, string2, optString, i, access$parseJsonArray);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void execute(TaskHandler taskHandler) {
                Intrinsics.checkNotNullParameter(taskHandler, "handler");
                execute(taskHandler, CollectionsKt.listOf(taskHandler));
            }

            public final void execute(TaskHandler taskHandler, List<TaskHandler> list) {
                Intrinsics.checkNotNullParameter(taskHandler, "master");
                Intrinsics.checkNotNullParameter(list, "slaves");
                Companion companion = this;
                companion.deleteOldFiles(taskHandler.getUseCase(), taskHandler.getVersionId());
                companion.download(taskHandler.getAssetUri(), taskHandler.getUseCase() + "_" + taskHandler.getVersionId(), new ModelManager$TaskHandler$Companion$execute$1(list));
            }

            private final void deleteOldFiles(String str, int i) {
                File[] listFiles;
                File mlDir = Utils.getMlDir();
                if (mlDir != null && (listFiles = mlDir.listFiles()) != null) {
                    if (!(listFiles.length == 0)) {
                        String str2 = str + "_" + i;
                        for (File file : listFiles) {
                            Intrinsics.checkNotNullExpressionValue(file, InneractiveMediationDefs.GENDER_FEMALE);
                            String name = file.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "name");
                            if (StringsKt.startsWith$default(name, str, false, 2, (Object) null) && !StringsKt.startsWith$default(name, str2, false, 2, (Object) null)) {
                                file.delete();
                            }
                        }
                    }
                }
            }

            /* access modifiers changed from: private */
            public final void download(String str, String str2, FileDownloadTask.Callback callback) {
                File file = new File(Utils.getMlDir(), str2);
                if (str == null || file.exists()) {
                    callback.onComplete(file);
                } else {
                    new FileDownloadTask(str, file, callback).execute(new String[0]);
                }
            }
        }
    }
}
