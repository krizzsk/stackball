package com.facebook.appevents.iap;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class InAppPurchaseSkuDetailsWrapper {
    private static final String CLASSNAME_SKU_DETAILS_PARAMS = "com.android.billingclient.api.SkuDetailsParams";
    private static final String CLASSNAME_SKU_DETAILS_PARAMS_BUILDER = "com.android.billingclient.api.SkuDetailsParams$Builder";
    private static final String METHOD_BUILD = "build";
    private static final String METHOD_NEW_BUILDER = "newBuilder";
    private static final String METHOD_SET_SKU_LIST = "setSkusList";
    private static final String METHOD_SET_TYPE = "setType";
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static InAppPurchaseSkuDetailsWrapper mInstance;
    private final Method buildMethod;
    private final Class<?> builderClazz;
    private final Method newBuilderMethod;
    private final Method setSkusListMethod;
    private final Method setTypeMethod;
    private final Class<?> skuDetailsParamsClazz;

    public InAppPurchaseSkuDetailsWrapper(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.skuDetailsParamsClazz = cls;
        this.builderClazz = cls2;
        this.newBuilderMethod = method;
        this.setTypeMethod = method2;
        this.setSkusListMethod = method3;
        this.buildMethod = method4;
    }

    public static InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
        Class<InAppPurchaseSkuDetailsWrapper> cls = InAppPurchaseSkuDetailsWrapper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (initialized.get()) {
                return mInstance;
            }
            createInstance();
            initialized.set(true);
            return mInstance;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static void createInstance() {
        Class<InAppPurchaseSkuDetailsWrapper> cls = InAppPurchaseSkuDetailsWrapper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Class<?> cls2 = InAppPurchaseUtils.getClass(CLASSNAME_SKU_DETAILS_PARAMS);
                Class<?> cls3 = InAppPurchaseUtils.getClass(CLASSNAME_SKU_DETAILS_PARAMS_BUILDER);
                if (cls2 == null) {
                    return;
                }
                if (cls3 != null) {
                    Method method = InAppPurchaseUtils.getMethod(cls2, METHOD_NEW_BUILDER, new Class[0]);
                    Method method2 = InAppPurchaseUtils.getMethod(cls3, METHOD_SET_TYPE, String.class);
                    Method method3 = InAppPurchaseUtils.getMethod(cls3, METHOD_SET_SKU_LIST, List.class);
                    Method method4 = InAppPurchaseUtils.getMethod(cls3, METHOD_BUILD, new Class[0]);
                    if (method != null && method2 != null && method3 != null) {
                        if (method4 != null) {
                            mInstance = new InAppPurchaseSkuDetailsWrapper(cls2, cls3, method, method2, method3, method4);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public Class<?> getSkuDetailsParamsClazz() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public Object getSkuDetailsParams(String str, List<String> list) {
        Object invokeMethod;
        Object invokeMethod2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(this.skuDetailsParamsClazz, this.newBuilderMethod, (Object) null, new Object[0]);
            if (invokeMethod3 == null || (invokeMethod = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setTypeMethod, invokeMethod3, str)) == null || (invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.builderClazz, this.setSkusListMethod, invokeMethod, list)) == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(this.builderClazz, this.buildMethod, invokeMethod2, new Object[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
