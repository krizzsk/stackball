package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppPurchaseBillingClientWrapper {
    private static final String CLASSNAME_BILLING_CLIENT = "com.android.billingclient.api.BillingClient";
    private static final String CLASSNAME_BILLING_CLIENT_BUILDER = "com.android.billingclient.api.BillingClient$Builder";
    private static final String CLASSNAME_BILLING_CLIENT_STATE_LISTENER = "com.android.billingclient.api.BillingClientStateListener";
    private static final String CLASSNAME_PURCHASE = "com.android.billingclient.api.Purchase";
    private static final String CLASSNAME_PURCHASES_RESULT = "com.android.billingclient.api.Purchase$PurchasesResult";
    private static final String CLASSNAME_PURCHASE_HISTORY_RECORD = "com.android.billingclient.api.PurchaseHistoryRecord";
    private static final String CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER = "com.android.billingclient.api.PurchaseHistoryResponseListener";
    private static final String CLASSNAME_PURCHASE_UPDATED_LISTENER = "com.android.billingclient.api.PurchasesUpdatedListener";
    private static final String CLASSNAME_SKU_DETAILS = "com.android.billingclient.api.SkuDetails";
    private static final String CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER = "com.android.billingclient.api.SkuDetailsResponseListener";
    private static final String IN_APP = "inapp";
    private static final String METHOD_BUILD = "build";
    private static final String METHOD_ENABLE_PENDING_PURCHASES = "enablePendingPurchases";
    private static final String METHOD_GET_ORIGINAL_JSON = "getOriginalJson";
    private static final String METHOD_GET_PURCHASE_LIST = "getPurchasesList";
    private static final String METHOD_NEW_BUILDER = "newBuilder";
    private static final String METHOD_ON_BILLING_SERVICE_DISCONNECTED = "onBillingServiceDisconnected";
    private static final String METHOD_ON_BILLING_SETUP_FINISHED = "onBillingSetupFinished";
    private static final String METHOD_ON_PURCHASE_HISTORY_RESPONSE = "onPurchaseHistoryResponse";
    private static final String METHOD_ON_SKU_DETAILS_RESPONSE = "onSkuDetailsResponse";
    private static final String METHOD_QUERY_PURCHASES = "queryPurchases";
    private static final String METHOD_QUERY_PURCHASE_HISTORY_ASYNC = "queryPurchaseHistoryAsync";
    private static final String METHOD_QUERY_SKU_DETAILS_ASYNC = "querySkuDetailsAsync";
    private static final String METHOD_SET_LISTENER = "setListener";
    private static final String METHOD_START_CONNECTION = "startConnection";
    private static final String PACKAGE_NAME = "packageName";
    private static final String PRODUCT_ID = "productId";
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    public static final AtomicBoolean isServiceConnected = new AtomicBoolean(false);
    private static InAppPurchaseBillingClientWrapper mInstance = null;
    public static final Map<String, JSONObject> purchaseDetailsMap = new ConcurrentHashMap();
    public static final Map<String, JSONObject> skuDetailsMap = new ConcurrentHashMap();
    private final Class<?> PurchaseHistoryRecordClazz;
    private final Object billingClient;
    private final Class<?> billingClientClazz;
    private final Context context;
    private final Method getOriginalJsonMethod;
    private final Method getOriginalJsonPurchaseHistoryMethod;
    private final Method getOriginalJsonSkuMethod;
    private final Method getPurchaseListMethod;
    private final Set<String> historyPurchaseSet = new CopyOnWriteArraySet();
    private final InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper;
    private final Class<?> purchaseClazz;
    private final Class<?> purchaseHistoryResponseListenerClazz;
    private final Class<?> purchaseResultClazz;
    private final Method queryPurchaseHistoryAsyncMethod;
    private final Method queryPurchasesMethod;
    private final Method querySkuDetailsAsyncMethod;
    private final Class<?> skuDetailsClazz;
    private final Class<?> skuDetailsResponseListenerClazz;

    static class PurchasesUpdatedListenerWrapper implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    static /* synthetic */ Set access$000(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.historyPurchaseSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    static /* synthetic */ void access$100(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper, String str, List list, Runnable runnable) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                inAppPurchaseBillingClientWrapper.querySkuDetailsAsync(str, list, runnable);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    static /* synthetic */ Class access$200(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.PurchaseHistoryRecordClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    static /* synthetic */ Method access$300(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    static /* synthetic */ Context access$400(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.context;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    static /* synthetic */ Class access$500(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.skuDetailsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    static /* synthetic */ Method access$600(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapper.getOriginalJsonSkuMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private InAppPurchaseBillingClientWrapper(Context context2, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper2) {
        this.context = context2;
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.PurchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = inAppPurchaseSkuDetailsWrapper2;
    }

    public static synchronized InAppPurchaseBillingClientWrapper getOrCreateInstance(Context context2) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        synchronized (cls) {
            if (CrashShieldHandler.isObjectCrashing(cls)) {
                return null;
            }
            try {
                if (initialized.get()) {
                    InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper = mInstance;
                    return inAppPurchaseBillingClientWrapper;
                }
                createInstance(context2);
                initialized.set(true);
                InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper2 = mInstance;
                return inAppPurchaseBillingClientWrapper2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
                return null;
            }
        }
    }

    private static void createInstance(Context context2) {
        Class<InAppPurchaseBillingClientWrapper> cls = InAppPurchaseBillingClientWrapper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                InAppPurchaseSkuDetailsWrapper orCreateInstance = InAppPurchaseSkuDetailsWrapper.getOrCreateInstance();
                if (orCreateInstance != null) {
                    Class<?> cls2 = InAppPurchaseUtils.getClass(CLASSNAME_BILLING_CLIENT);
                    Class<?> cls3 = InAppPurchaseUtils.getClass(CLASSNAME_PURCHASE);
                    Class<?> cls4 = InAppPurchaseUtils.getClass(CLASSNAME_PURCHASES_RESULT);
                    Class<?> cls5 = InAppPurchaseUtils.getClass(CLASSNAME_SKU_DETAILS);
                    Class<?> cls6 = InAppPurchaseUtils.getClass(CLASSNAME_PURCHASE_HISTORY_RECORD);
                    Class<?> cls7 = InAppPurchaseUtils.getClass(CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER);
                    Class<?> cls8 = InAppPurchaseUtils.getClass(CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER);
                    if (cls2 != null && cls4 != null && cls3 != null && cls5 != null && cls7 != null && cls6 != null) {
                        if (cls8 != null) {
                            Method method = InAppPurchaseUtils.getMethod(cls2, METHOD_QUERY_PURCHASES, String.class);
                            Method method2 = InAppPurchaseUtils.getMethod(cls4, METHOD_GET_PURCHASE_LIST, new Class[0]);
                            Method method3 = InAppPurchaseUtils.getMethod(cls3, METHOD_GET_ORIGINAL_JSON, new Class[0]);
                            Method method4 = InAppPurchaseUtils.getMethod(cls5, METHOD_GET_ORIGINAL_JSON, new Class[0]);
                            Method method5 = InAppPurchaseUtils.getMethod(cls6, METHOD_GET_ORIGINAL_JSON, new Class[0]);
                            Method method6 = InAppPurchaseUtils.getMethod(cls2, METHOD_QUERY_SKU_DETAILS_ASYNC, orCreateInstance.getSkuDetailsParamsClazz(), cls7);
                            Method method7 = InAppPurchaseUtils.getMethod(cls2, METHOD_QUERY_PURCHASE_HISTORY_ASYNC, String.class, cls8);
                            if (method != null && method2 != null && method3 != null && method4 != null && method5 != null && method6 != null) {
                                if (method7 != null) {
                                    Object createBillingClient = createBillingClient(context2, cls2);
                                    if (createBillingClient != null) {
                                        InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper = new InAppPurchaseBillingClientWrapper(context2, createBillingClient, cls2, cls4, cls3, cls5, cls6, cls7, cls8, method, method2, method3, method4, method5, method6, method7, orCreateInstance);
                                        mInstance = inAppPurchaseBillingClientWrapper;
                                        inAppPurchaseBillingClientWrapper.startConnection();
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    static Object createBillingClient(Context context2, Class<?> cls) {
        Object invokeMethod;
        Object invokeMethod2;
        Class<InAppPurchaseBillingClientWrapper> cls2 = InAppPurchaseBillingClientWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls2)) {
            return null;
        }
        try {
            Class<?> cls3 = InAppPurchaseUtils.getClass(CLASSNAME_BILLING_CLIENT_BUILDER);
            Class<?> cls4 = InAppPurchaseUtils.getClass(CLASSNAME_PURCHASE_UPDATED_LISTENER);
            if (cls3 != null) {
                if (cls4 != null) {
                    Method method = InAppPurchaseUtils.getMethod(cls, METHOD_NEW_BUILDER, Context.class);
                    Method method2 = InAppPurchaseUtils.getMethod(cls3, METHOD_ENABLE_PENDING_PURCHASES, new Class[0]);
                    Method method3 = InAppPurchaseUtils.getMethod(cls3, METHOD_SET_LISTENER, cls4);
                    Method method4 = InAppPurchaseUtils.getMethod(cls3, METHOD_BUILD, new Class[0]);
                    if (!(method == null || method2 == null || method3 == null)) {
                        if (method4 != null) {
                            Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(cls, method, (Object) null, context2);
                            if (invokeMethod3 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(cls3, method3, invokeMethod3, Proxy.newProxyInstance(cls4.getClassLoader(), new Class[]{cls4}, new PurchasesUpdatedListenerWrapper()))) == null || (invokeMethod2 = InAppPurchaseUtils.invokeMethod(cls3, method2, invokeMethod, new Object[0])) == null) {
                                return null;
                            }
                            return InAppPurchaseUtils.invokeMethod(cls3, method4, invokeMethod2, new Object[0]);
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls2);
            return null;
        }
    }

    public void queryPurchaseHistory(String str, final Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                queryPurchaseHistoryAsync(str, new Runnable() {
                    public void run() {
                        if (!CrashShieldHandler.isObjectCrashing(this)) {
                            try {
                                InAppPurchaseBillingClientWrapper.access$100(InAppPurchaseBillingClientWrapper.this, "inapp", new ArrayList(InAppPurchaseBillingClientWrapper.access$000(InAppPurchaseBillingClientWrapper.this)), runnable);
                            } catch (Throwable th) {
                                CrashShieldHandler.handleThrowable(th, this);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public void queryPurchase(String str, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.purchaseResultClazz, this.getPurchaseListMethod, InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchasesMethod, this.billingClient, "inapp"), new Object[0]);
                if (invokeMethod instanceof List) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object invokeMethod2 : (List) invokeMethod) {
                            Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.purchaseClazz, this.getOriginalJsonMethod, invokeMethod2, new Object[0]);
                            if (invokeMethod3 instanceof String) {
                                JSONObject jSONObject = new JSONObject((String) invokeMethod3);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    arrayList.add(string);
                                    purchaseDetailsMap.put(string, jSONObject);
                                }
                            }
                        }
                        querySkuDetailsAsync(str, arrayList, runnable);
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private void querySkuDetailsAsync(String str, List<String> list, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{this.skuDetailsResponseListenerClazz}, new SkuDetailsResponseListenerWrapper(runnable));
                Object skuDetailsParams = this.inAppPurchaseSkuDetailsWrapper.getSkuDetailsParams(str, list);
                InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.querySkuDetailsAsyncMethod, this.billingClient, skuDetailsParams, newProxyInstance);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private void queryPurchaseHistoryAsync(String str, Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{this.purchaseHistoryResponseListenerClazz}, new PurchaseHistoryResponseListenerWrapper(runnable));
                InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchaseHistoryAsyncMethod, this.billingClient, str, newProxyInstance);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private void startConnection() {
        Method method;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Class<?> cls = InAppPurchaseUtils.getClass(CLASSNAME_BILLING_CLIENT_STATE_LISTENER);
                if (cls != null && (method = InAppPurchaseUtils.getMethod(this.billingClientClazz, METHOD_START_CONNECTION, cls)) != null) {
                    Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new BillingClientStateListenerWrapper());
                    InAppPurchaseUtils.invokeMethod(this.billingClientClazz, method, this.billingClient, newProxyInstance);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    static class BillingClientStateListenerWrapper implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals(InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SETUP_FINISHED)) {
                InAppPurchaseBillingClientWrapper.isServiceConnected.set(true);
                return null;
            } else if (!method.getName().endsWith(InAppPurchaseBillingClientWrapper.METHOD_ON_BILLING_SERVICE_DISCONNECTED)) {
                return null;
            } else {
                InAppPurchaseBillingClientWrapper.isServiceConnected.set(false);
                return null;
            }
        }
    }

    class PurchaseHistoryResponseListenerWrapper implements InvocationHandler {
        Runnable runnable;

        public PurchaseHistoryResponseListenerWrapper(Runnable runnable2) {
            this.runnable = runnable2;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals(InAppPurchaseBillingClientWrapper.METHOD_ON_PURCHASE_HISTORY_RESPONSE)) {
                return null;
            }
            List list = objArr[1];
            if (!(list instanceof List)) {
                return null;
            }
            getPurchaseHistoryRecord(list);
            return null;
        }

        private void getPurchaseHistoryRecord(List<?> list) {
            for (Object invokeMethod : list) {
                try {
                    Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapper.access$200(InAppPurchaseBillingClientWrapper.this), InAppPurchaseBillingClientWrapper.access$300(InAppPurchaseBillingClientWrapper.this), invokeMethod, new Object[0]);
                    if (invokeMethod2 instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) invokeMethod2);
                        jSONObject.put(InAppPurchaseBillingClientWrapper.PACKAGE_NAME, InAppPurchaseBillingClientWrapper.access$400(InAppPurchaseBillingClientWrapper.this).getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            InAppPurchaseBillingClientWrapper.access$000(InAppPurchaseBillingClientWrapper.this).add(string);
                            InAppPurchaseBillingClientWrapper.purchaseDetailsMap.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.runnable.run();
        }
    }

    class SkuDetailsResponseListenerWrapper implements InvocationHandler {
        Runnable runnable;

        public SkuDetailsResponseListenerWrapper(Runnable runnable2) {
            this.runnable = runnable2;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals(InAppPurchaseBillingClientWrapper.METHOD_ON_SKU_DETAILS_RESPONSE)) {
                return null;
            }
            List list = objArr[1];
            if (!(list instanceof List)) {
                return null;
            }
            parseSkuDetails(list);
            return null;
        }

        /* access modifiers changed from: package-private */
        public void parseSkuDetails(List<?> list) {
            for (Object invokeMethod : list) {
                try {
                    Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(InAppPurchaseBillingClientWrapper.access$500(InAppPurchaseBillingClientWrapper.this), InAppPurchaseBillingClientWrapper.access$600(InAppPurchaseBillingClientWrapper.this), invokeMethod, new Object[0]);
                    if (invokeMethod2 instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) invokeMethod2);
                        if (jSONObject.has("productId")) {
                            InAppPurchaseBillingClientWrapper.skuDetailsMap.put(jSONObject.getString("productId"), jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.runnable.run();
        }
    }
}
