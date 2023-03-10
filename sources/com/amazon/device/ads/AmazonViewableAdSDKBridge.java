package com.amazon.device.ads;

import com.amazon.device.ads.JavascriptInteractor;
import org.json.JSONObject;

class AmazonViewableAdSDKBridge implements AdSDKBridge {
    private static final String BRIDGE_NAME = "viewableAdSDKBridge";
    private static final String INSTRUMENTATION_JAVASCRIPT_API;
    private static final String JAVASCRIPT_API = ("(function (window, console) {\n    var is_array = function (obj) {\n        return Object.prototype.toString.call(obj) === '[object Array]';\n    },\n    addViewTreeObservers = function(){\n       viewableAdSDKBridge." + JavascriptInteractor.getExecutorMethodName() + "(\"AddObserversToViewTree\", null);\n    },\n    removeViewTreeObservers = function(){\n       viewableAdSDKBridge." + JavascriptInteractor.getExecutorMethodName() + "(\"RemoveObserversFromViewTree\", null);\n    },\n    forEach = function (array, fn) {\n        var i;\n        for (i = 0; i < array.length; i++) {\n            if (i in array) {\n                fn.call(null, array[i], i);\n            }\n        }\n    },\n    listeners = [],\n    version = 1.1,\n    invokeListeners = function(event, args) {\n        var eventListeners = listeners[event] || [];\n        // fire all the listeners\n        forEach(eventListeners, function(listener){\n            try {\n                listener.apply(null, args);\n            }catch(e){\n                debug(\"Error executing \" + event + \" listener\");\n                debug(e);\n            }\n        });\n    }\n    debug = function(msg) {\n        console.log(\"SDK JS API log: \" + msg);\n    },\n    viewabilityChangeEvent = function(viewable) {\n        debug(\"viewableChange: \" + viewable);\n        var jsonObject = JSON.parse(viewable);\n        var args = [jsonObject];\n        invokeListeners(\"Viewability\", args);\n    }, \n    window.viewableBridge = {\n       viewabilityChange : viewabilityChangeEvent\n    },\n    /* we can add new event properties in future */  \n    window.Event = {\n            Viewability: 'Viewability'\n    },\n    // Define the amazonmobileadsviewablebridge object\n    window.amazonmobileadsviewablebridge = {\n            // Command Flow\n            addEventListener : function(event, listener){\n                var eventListeners = listeners[event] || [],\n                alreadyRegistered = false;\n                \n                //verify the event is one that will actually occur/ verfiy it's supported by SDK\n                if (!Event.hasOwnProperty(event)){\n                    return;\n                }\n                \n                //register first set of listeners for this event\n                if (!is_array(listeners[event])) {\n                    listeners[event] = eventListeners;\n                }\n                \n                forEach(eventListeners, function(l){ \n                    // Listener already registered, so no need to add it.\n                        if (listener === l){\n                            alreadyRegistered = true;\n                        }\n                    }\n                );\n                if (!alreadyRegistered){\n                    listeners[event].push(listener);\n                    if (event = Event.Viewability){ \n                       addViewTreeObservers();  \n                   } \n                }\n            },\n            removeEventListener : function(event, listener){\n                if (listeners.hasOwnProperty(event)) {\n                    var eventListeners = listeners[event];\n                    if (eventListeners) {\n                        var idx = eventListeners.indexOf(listener);\n                        if (idx !== -1) {\n                            eventListeners.splice(idx, 1);\n                            if (event = Event.Viewability){ \n                               removeViewTreeObservers();  \n                             } \n                        }\n                    }\n                }\n            },\n            getSDKVersion: function(){\n               var json = JSON.parse(viewableAdSDKBridge." + JavascriptInteractor.getExecutorMethodName() + "(\"GetSDKVersion\", null));\n               return json.sdkVersion;\n            },\n            getVersion: function(){\n                return version;\n            },\n    };\n})(window, console);\n");
    private static final String LOGTAG = AmazonViewableAdSDKBridge.class.getSimpleName();
    private final AdControlAccessor adControlAccessor;
    private final JavascriptInteractor javascriptInteractor;
    private final MobileAdsLogger logger;
    private SDKEventListener sdkEventListener;
    private final Settings settings;

    public String getName() {
        return BRIDGE_NAME;
    }

    public boolean hasNativeExecution() {
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("function(){\n                var json = JSON.parse(viewableAdSDKBridge.");
        sb.append(JavascriptInteractor.getExecutorMethodName());
        sb.append("(\"GetInstrumentationURL\", null));\n                return json.instrumentationPixelUrl;\n            }");
        INSTRUMENTATION_JAVASCRIPT_API = sb.toString();
    }

    public AmazonViewableAdSDKBridge(AdControlAccessor adControlAccessor2, JavascriptInteractor javascriptInteractor2) {
        this(adControlAccessor2, javascriptInteractor2, Settings.getInstance(), new MobileAdsLoggerFactory());
    }

    AmazonViewableAdSDKBridge(AdControlAccessor adControlAccessor2, JavascriptInteractor javascriptInteractor2, Settings settings2, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.adControlAccessor = adControlAccessor2;
        this.javascriptInteractor = javascriptInteractor2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.settings = settings2;
        this.javascriptInteractor.addMethodExecutor(new AddObserversToViewTree(this));
        this.javascriptInteractor.addMethodExecutor(new RemoveObserversFromViewTree(this));
        this.javascriptInteractor.addMethodExecutor(new GetInstrumentationURL(this));
        this.javascriptInteractor.addMethodExecutor(new SDKVersionJSIF(this));
    }

    public JavascriptInteractor.Executor getJavascriptInteractorExecutor() {
        return this.javascriptInteractor.getExecutor();
    }

    public String getJavascript() {
        return appendViewabilityJavascript();
    }

    private String getViewabilityJavascript() {
        String string = this.settings.getString("viewableJSSettingsNameAmazonAdSDK", (String) null);
        if (string == null) {
            this.logger.mo10942w("Viewability Javascript is null");
            return "";
        }
        return String.format(string, new Object[]{INSTRUMENTATION_JAVASCRIPT_API, this.adControlAccessor.getSlotID()});
    }

    private String appendViewabilityJavascript() {
        return JAVASCRIPT_API + getViewabilityJavascript();
    }

    /* access modifiers changed from: private */
    public String getSDKVersion() {
        return Version.getRawSDKVersion();
    }

    public SDKEventListener getSDKEventListener() {
        if (this.sdkEventListener == null) {
            this.sdkEventListener = new AmazonAdSDKViewableEventListener();
        }
        return this.sdkEventListener;
    }

    /* access modifiers changed from: private */
    public void registerViewabilityInterest() {
        this.adControlAccessor.registerViewabilityInterest();
    }

    /* access modifiers changed from: private */
    public void deregisterViewabilityInterest() {
        this.adControlAccessor.deregisterViewabilityInterest();
    }

    /* access modifiers changed from: private */
    public String getInstrumentationURL() {
        return this.adControlAccessor.getInstrumentationPixelUrl();
    }

    private static class AddObserversToViewTree extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "AddObserversToViewTree";
        private final AmazonViewableAdSDKBridge bridge;

        public AddObserversToViewTree(AmazonViewableAdSDKBridge amazonViewableAdSDKBridge) {
            super(name);
            this.bridge = amazonViewableAdSDKBridge;
        }

        /* access modifiers changed from: protected */
        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.registerViewabilityInterest();
            return null;
        }
    }

    private static class RemoveObserversFromViewTree extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "RemoveObserversFromViewTree";
        private final AmazonViewableAdSDKBridge bridge;

        public RemoveObserversFromViewTree(AmazonViewableAdSDKBridge amazonViewableAdSDKBridge) {
            super(name);
            this.bridge = amazonViewableAdSDKBridge;
        }

        /* access modifiers changed from: protected */
        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.deregisterViewabilityInterest();
            return null;
        }
    }

    private static class GetInstrumentationURL extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetInstrumentationURL";
        private final AmazonViewableAdSDKBridge bridge;

        public GetInstrumentationURL(AmazonViewableAdSDKBridge amazonViewableAdSDKBridge) {
            super(name);
            this.bridge = amazonViewableAdSDKBridge;
        }

        /* access modifiers changed from: protected */
        public JSONObject execute(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            JSONUtils.put(jSONObject2, "instrumentationPixelUrl", this.bridge.getInstrumentationURL());
            return jSONObject2;
        }
    }

    private static class SDKVersionJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetSDKVersion";
        private final AmazonViewableAdSDKBridge bridge;

        protected SDKVersionJSIF(AmazonViewableAdSDKBridge amazonViewableAdSDKBridge) {
            super(name);
            this.bridge = amazonViewableAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            JSONUtils.put(jSONObject2, "sdkVersion", this.bridge.getSDKVersion());
            return jSONObject2;
        }
    }
}
