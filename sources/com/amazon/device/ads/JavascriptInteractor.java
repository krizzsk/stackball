package com.amazon.device.ads;

import android.webkit.JavascriptInterface;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

class JavascriptInteractor {
    private static final String LOGTAG = JavascriptInteractor.class.getSimpleName();
    private static String executorMethodName;
    private static final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);
    private final Executor executor = new Executor(this);
    private final Map<String, JavascriptMethodExecutor> methodMap = new ConcurrentHashMap();

    public static String getExecutorMethodName() {
        if (executorMethodName == null) {
            Method[] declaredMethods = Executor.class.getDeclaredMethods();
            if (declaredMethods == null || declaredMethods.length != 1) {
                logger.mo10939e("Could not obtain the method name for javascript interfacing.");
            } else {
                executorMethodName = declaredMethods[0].getName();
            }
        }
        return executorMethodName;
    }

    public void addMethodExecutor(JavascriptMethodExecutor javascriptMethodExecutor) {
        if (!this.methodMap.containsKey(javascriptMethodExecutor.getMethodName())) {
            this.methodMap.put(javascriptMethodExecutor.getMethodName(), javascriptMethodExecutor);
            return;
        }
        throw new IllegalArgumentException("There is another executor with that method name already added.");
    }

    public Executor getExecutor() {
        return this.executor;
    }

    /* access modifiers changed from: private */
    public JSONObject execute(String str, String str2) {
        JSONObject jSONObject = null;
        if (str2 != null && str2.length() > 2) {
            JSONObject jSONObjectFromString = JSONUtils.getJSONObjectFromString(str2);
            if (jSONObjectFromString == null) {
                logger.mo11028w("The javascript object \"%s\" could not be parsed for method \"%s\".", str2, str);
                return null;
            }
            jSONObject = jSONObjectFromString;
        }
        return execute(str, jSONObject);
    }

    private JSONObject execute(String str, JSONObject jSONObject) {
        if (this.methodMap.containsKey(str)) {
            return this.methodMap.get(str).execute(jSONObject);
        }
        logger.mo11028w("The method %s was not recongized by this javascript interface.", str);
        return null;
    }

    public static class Executor {
        private final JavascriptInteractor interactor;
        private boolean proguardKeeper = false;

        public Executor(JavascriptInteractor javascriptInteractor) {
            this.interactor = javascriptInteractor;
            if (0 != 0) {
                execute((String) null, (String) null);
            }
        }

        @JavascriptInterface
        public String execute(String str, String str2) {
            JSONObject access$000 = this.interactor.execute(str, str2);
            if (access$000 == null) {
                return null;
            }
            return access$000.toString();
        }
    }

    public static abstract class JavascriptMethodExecutor {
        private final String methodName;

        /* access modifiers changed from: protected */
        public abstract JSONObject execute(JSONObject jSONObject);

        protected JavascriptMethodExecutor(String str) {
            this.methodName = str;
        }

        public String getMethodName() {
            return this.methodName;
        }
    }
}
