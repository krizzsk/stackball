package com.amazon.device.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.amazon.device.ads.AdEvent;
import com.amazon.device.ads.InAppBrowser;
import com.amazon.device.ads.JavascriptInteractor;
import com.amazon.device.ads.LayoutFactory;
import com.amazon.device.ads.ThreadUtils;
import com.amazon.device.ads.WebRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

class MRAIDAdSDKBridge implements AdSDKBridge {
    private static final int CLOSE_BUTTON_SIZE = 50;
    private static final String CONTENT_DESCRIPTION_RESIZED_VIEW = "resizedView";
    private static final String ERROR_EVENT_FORMAT = "mraidBridge.error('%s', '%s');";
    private static final String JAVASCRIPT = ("(function (window, console) {\n    var is_array = function (obj) {\n        return Object.prototype.toString.call(obj) === '[object Array]';\n    },\n    registerViewabilityInterest = function(){\n       mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"RegisterViewabilityInterest\", null);\n    },\n    deregisterViewabilityInterest = function(){\n       mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"DeregisterViewabilityInterest\", null);\n    },\n    forEach = function (array, fn) {\n        var i;\n        for (i = 0; i < array.length; i++) {\n            if (i in array) {\n                fn.call(null, array[i], i);\n            }\n        }\n    },\n    events = {\n            error: 'error',\n            ready: 'ready',\n            sizeChange: 'sizeChange',\n            stateChange: 'stateChange',\n            viewableChange: 'viewableChange'\n    },\n    states = [\"loading\",\"default\",\"expanded\",\"resized\",\"hidden\"],\n    placementTypes = [\"inline\", \"interstitial\"],\n    listeners = [],\n    version = '2.0',\n    currentState = \"loading\",\n    currentlyViewable = false,\n    supportedFeatures = null,\n    orientationProperties = {\"allowOrientationChange\":true,\"forceOrientation\":\"none\"},\n    // Error Event fires listeners\n    invokeListeners = function(event, args) {\n        var eventListeners = listeners[event] || [];\n        // fire all the listeners\n        forEach(eventListeners, function(listener){\n            try {\n                listener.apply(null, args);\n            }catch(e){\n                debug(\"Error executing \" + event + \" listener\");\n                debug(e);\n            }\n        });\n    },\n    debug = function(msg) {\n        console.log(\"MRAID log: \" + msg);\n    },\n    readyEvent = function() {\n        debug(\"MRAID ready\");\n        invokeListeners(\"ready\");\n    },\n    errorEvent = function(message, action) {\n        debug(\"error: \" + message + \" action: \" + action);\n        var args = [message, action];\n        invokeListeners(\"error\", args);\n    },\n    stateChangeEvent = function(state) {\n        debug(\"stateChange: \" + state);\n        var args = [state];\n        currentState = state;\n        invokeListeners(\"stateChange\", args);\n    },\n    viewableChangeEvent = function(viewable) {\n        if (viewable != currentlyViewable) {            debug(\"viewableChange: \" + viewable);\n            var args = [viewable];\n            invokeListeners(\"viewableChange\", args);\n            currentlyViewable = viewable;\n        }\n    }, \n    sizeChangeEvent = function(width, height) {\n        debug(\"sizeChange: \" + width + \"x\" + height);\n        var args = [width, height];\n        invokeListeners(\"sizeChange\", args);\n    };\n    window.mraidBridge = {\n            error : errorEvent,\n            ready : readyEvent,\n            stateChange : stateChangeEvent,\n            sizeChange : sizeChangeEvent,\n            viewableChange : viewableChangeEvent\n    };\n    // Define the mraid object\n    window.mraid = {\n            // Command Flow\n            addEventListener : function(event, listener){\n                var eventListeners = listeners[event] || [],\n                alreadyRegistered = false;\n                \n                //verify the event is one that will actually occur\n                if (!events.hasOwnProperty(event)){\n                    return;\n                }\n                \n                //register first set of listeners for this event\n                if (!is_array(listeners[event])) {\n                    listeners[event] = eventListeners;\n                }\n                \n                forEach(eventListeners, function(l){ \n                    // Listener already registered, so no need to add it.\n                        if (listener === l){\n                            alreadyRegistered = true;\n                        }\n                    }\n                );\n                if (!alreadyRegistered){\n                    debug('Registering Listener for ' + event + ': ' + listener)\n                    listeners[event].push(listener);\n                    if (event = 'viewableChange'){ \n                       registerViewabilityInterest();  \n                    } \n                }\n            },\n            removeEventListener : function(event, listener){\n                if (listeners.hasOwnProperty(event)) {\n                    var eventListeners = listeners[event];\n                    if (eventListeners) {\n                        var idx = eventListeners.indexOf(listener);\n                        if (idx !== -1) {\n                           eventListeners.splice(idx, 1);\n                           if (event = 'viewableChange'){ \n                               deregisterViewabilityInterest();  \n                           } \n                        }\n                    }\n                }\n            },\n            useCustomClose: function(bool){\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"UseCustomClose\", JSON.stringify({useCustomClose: bool}));\n            },\n            // Support\n            supports: function(feature){\n                if (!supportedFeatures)\n                {\n                    supportedFeatures = JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"Supports\", null));\n                }\n                return supportedFeatures[feature];\n            },\n            // Properties\n            getVersion: function(){\n                return version;\n            },\n            getState: function(){\n                return currentState;\n            },\n            getPlacementType: function(){\n                var json = JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"GetPlacementType\", null));\n                return json.placementType;\n            },\n            isViewable: function(){\n                var json = JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"IsViewable\", null));\n                return json.isViewable;\n            },\n            getExpandProperties: function(){\n                return JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"GetExpandProperties\", null));\n            },\n            setExpandProperties: function(properties){\n                //Backwards compatibility with MRAID 1.0 creatives\n                if (!!properties.lockOrientation){\n                    mraid.setOrientationProperties({\"allowOrientationChange\":false});\n                }\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"SetExpandProperties\", JSON.stringify(properties));\n            },\n            getOrientationProperties: function(){\n                return orientationProperties;\n            },\n            setOrientationProperties: function(properties){\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"SetOrientationProperties\", JSON.stringify(properties));\n            },\n            getResizeProperties: function(){\n                return JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"GetResizeProperties\", null));\n            },\n            setResizeProperties: function(properties){\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"SetResizeProperties\", JSON.stringify(properties));\n            },\n            getCurrentPosition: function(){\n                return JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"GetCurrentPosition\", null));\n            },\n            getMaxSize: function(){\n                return JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"GetMaxSize\", null));\n            },\n            getDefaultPosition: function(){\n                return JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"GetDefaultPosition\", null));\n            },\n            getScreenSize: function(){\n                return JSON.parse(mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"GetScreenSize\", null));\n            },\n            // Operations\n            open: function(url) {\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"Open\", JSON.stringify({url: url}));\n            },\n            close: function() {\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"Close\", null);\n            },\n            expand: function(url) {\n                if (url !== undefined) {\n                    mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"Expand\", JSON.stringify({url: url}));\n                } else {\n                    mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"Expand\", JSON.stringify({url: \"\"}));\n                }\n            },\n            resize: function() {\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"Resize\", null);\n            },\n            createCalendarEvent: function(eventObject) {\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"CreateCalendarEvent\", JSON.stringify(eventObject));\n            },\n            playVideo: function(url){\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"PlayVideo\", JSON.stringify({url: url}));\n            },\n            storePicture: function(url){\n                mraidObject." + JavascriptInteractor.getExecutorMethodName() + "(\"StorePicture\", JSON.stringify({url: url}));\n            }\n    };\n})(window, console);\n");
    private static final String LOGTAG = MRAIDAdSDKBridge.class.getSimpleName();
    private static final String MRAID_BRIDGE_NAME = "mraidObject";
    private static final String PLACEMENT_TYPE_INLINE = "inline";
    private static final String PLACEMENT_TYPE_INTERSTITIAL = "interstitial";
    /* access modifiers changed from: private */
    public final AdControlAccessor adControlAccessor;
    private final AdUtils2 adUtils;
    private final AlertDialogFactory alertDialogFactory;
    private final AndroidBuildInfo buildInfo;
    private final Position defaultPosition;
    private final ExpandProperties expandProperties;
    private boolean expandedWithUrl;
    /* access modifiers changed from: private */
    public final GraphicsUtils graphicsUtils;
    private final IntentBuilderFactory intentBuilderFactory;
    private final JavascriptInteractor javascriptInteractor;
    private final LayoutFactory layoutFactory;
    private final MobileAdsLogger logger;
    private final OrientationProperties orientationProperties;
    private final PermissionChecker permissionChecker;
    private final ResizeProperties resizeProperties;
    /* access modifiers changed from: private */
    public ViewGroup resizedView;
    private FrameLayout rootView;
    private SDKEventListener sdkEventListener;
    private final ThreadUtils.ThreadRunner threadRunner;
    /* access modifiers changed from: private */
    public final ViewUtils viewUtils;
    private final WebRequest.WebRequestFactory webRequestFactory;
    private final WebUtils2 webUtils;

    public String getName() {
        return MRAID_BRIDGE_NAME;
    }

    public boolean hasNativeExecution() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    MRAIDAdSDKBridge(com.amazon.device.ads.AdControlAccessor r21, com.amazon.device.ads.JavascriptInteractor r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            com.amazon.device.ads.PermissionChecker r4 = new com.amazon.device.ads.PermissionChecker
            r3 = r4
            r4.<init>()
            com.amazon.device.ads.MobileAdsLoggerFactory r5 = new com.amazon.device.ads.MobileAdsLoggerFactory
            r4 = r5
            r5.<init>()
            com.amazon.device.ads.WebRequest$WebRequestFactory r6 = new com.amazon.device.ads.WebRequest$WebRequestFactory
            r5 = r6
            r6.<init>()
            com.amazon.device.ads.ThreadUtils$ThreadRunner r6 = com.amazon.device.ads.ThreadUtils.getThreadRunner()
            com.amazon.device.ads.GraphicsUtils r8 = new com.amazon.device.ads.GraphicsUtils
            r7 = r8
            r8.<init>()
            com.amazon.device.ads.MRAIDAdSDKBridge$AlertDialogFactory r9 = new com.amazon.device.ads.MRAIDAdSDKBridge$AlertDialogFactory
            r8 = r9
            r9.<init>()
            com.amazon.device.ads.WebUtils2 r10 = new com.amazon.device.ads.WebUtils2
            r9 = r10
            r10.<init>()
            com.amazon.device.ads.AdUtils2 r11 = new com.amazon.device.ads.AdUtils2
            r10 = r11
            r11.<init>()
            com.amazon.device.ads.IntentBuilderFactory r12 = new com.amazon.device.ads.IntentBuilderFactory
            r11 = r12
            r12.<init>()
            com.amazon.device.ads.ExpandProperties r13 = new com.amazon.device.ads.ExpandProperties
            r12 = r13
            r13.<init>()
            com.amazon.device.ads.OrientationProperties r14 = new com.amazon.device.ads.OrientationProperties
            r13 = r14
            r14.<init>()
            com.amazon.device.ads.Position r15 = new com.amazon.device.ads.Position
            r14 = r15
            r15.<init>()
            com.amazon.device.ads.ResizeProperties r16 = new com.amazon.device.ads.ResizeProperties
            r15 = r16
            r16.<init>()
            com.amazon.device.ads.AndroidBuildInfo r17 = new com.amazon.device.ads.AndroidBuildInfo
            r16 = r17
            r17.<init>()
            com.amazon.device.ads.LayoutFactory r18 = new com.amazon.device.ads.LayoutFactory
            r17 = r18
            r18.<init>()
            com.amazon.device.ads.ViewUtils r19 = new com.amazon.device.ads.ViewUtils
            r18 = r19
            r19.<init>()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.MRAIDAdSDKBridge.<init>(com.amazon.device.ads.AdControlAccessor, com.amazon.device.ads.JavascriptInteractor):void");
    }

    MRAIDAdSDKBridge(AdControlAccessor adControlAccessor2, JavascriptInteractor javascriptInteractor2, PermissionChecker permissionChecker2, MobileAdsLoggerFactory mobileAdsLoggerFactory, WebRequest.WebRequestFactory webRequestFactory2, ThreadUtils.ThreadRunner threadRunner2, GraphicsUtils graphicsUtils2, AlertDialogFactory alertDialogFactory2, WebUtils2 webUtils2, AdUtils2 adUtils2, IntentBuilderFactory intentBuilderFactory2, ExpandProperties expandProperties2, OrientationProperties orientationProperties2, Position position, ResizeProperties resizeProperties2, AndroidBuildInfo androidBuildInfo, LayoutFactory layoutFactory2, ViewUtils viewUtils2) {
        this.expandedWithUrl = true;
        this.adControlAccessor = adControlAccessor2;
        this.javascriptInteractor = javascriptInteractor2;
        MobileAdsLoggerFactory mobileAdsLoggerFactory2 = mobileAdsLoggerFactory;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.permissionChecker = permissionChecker2;
        this.webRequestFactory = webRequestFactory2;
        this.threadRunner = threadRunner2;
        this.graphicsUtils = graphicsUtils2;
        this.alertDialogFactory = alertDialogFactory2;
        this.webUtils = webUtils2;
        this.adUtils = adUtils2;
        this.intentBuilderFactory = intentBuilderFactory2;
        this.expandProperties = expandProperties2;
        this.orientationProperties = orientationProperties2;
        this.defaultPosition = position;
        this.resizeProperties = resizeProperties2;
        this.buildInfo = androidBuildInfo;
        this.layoutFactory = layoutFactory2;
        this.viewUtils = viewUtils2;
        populateJavascriptExecutorsInInteractor();
    }

    private void populateJavascriptExecutorsInInteractor() {
        this.javascriptInteractor.addMethodExecutor(new CloseJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new CreateCalendarEventJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new ExpandJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new GetCurrentPositionJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new GetDefaultPositionJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new GetExpandPropertiesJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new GetMaxSizeJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new GetPlacementTypeJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new GetResizePropertiesJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new GetScreenSizeJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new OpenJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new PlayVideoJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new ResizeJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new SetExpandPropertiesJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new SetOrientationPropertiesJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new SetResizePropertiesJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new StorePictureJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new SupportsJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new UseCustomCloseJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new IsViewableJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new RegisterViewabilityInterestJSIF(this));
        this.javascriptInteractor.addMethodExecutor(new DeregisterViewabilityInterestJSIF(this));
    }

    public JavascriptInteractor.Executor getJavascriptInteractorExecutor() {
        return this.javascriptInteractor.getExecutor();
    }

    public String getJavascript() {
        return JAVASCRIPT;
    }

    public SDKEventListener getSDKEventListener() {
        if (this.sdkEventListener == null) {
            this.sdkEventListener = new MRAIDAdSDKEventListener(this);
        }
        return this.sdkEventListener;
    }

    /* access modifiers changed from: private */
    public Context getContext() {
        return this.adControlAccessor.getContext();
    }

    /* access modifiers changed from: package-private */
    public void updateDefaultPosition(int i, int i2, int i3, int i4) {
        this.defaultPosition.setSize(new Size(i, i2));
        this.defaultPosition.setX(i3);
        this.defaultPosition.setY(i4);
    }

    public JSONObject getCurrentPosition() {
        if (this.adControlAccessor.getCurrentPosition() != null) {
            return this.adControlAccessor.getCurrentPosition().toJSONObject();
        }
        fireErrorEvent("Current position is unavailable because the ad has not yet been displayed.", "getCurrentPosition");
        return new Position(new Size(0, 0), 0, 0).toJSONObject();
    }

    public JSONObject getDefaultPosition() {
        return this.defaultPosition.toJSONObject();
    }

    public JSONObject getMaxSize() {
        Size maxSize = this.adControlAccessor.getMaxSize();
        if (maxSize == null) {
            return new Size(0, 0).toJSONObject();
        }
        return maxSize.toJSONObject();
    }

    public JSONObject getScreenSize() {
        Size screenSize = this.adControlAccessor.getScreenSize();
        if (screenSize == null) {
            return new Size(0, 0).toJSONObject();
        }
        return screenSize.toJSONObject();
    }

    public String getPlacementType() {
        return this.adControlAccessor.isInterstitial() ? "interstitial" : "inline";
    }

    public String getOrientationProperties() {
        return this.orientationProperties.toString();
    }

    public void setOrientationProperties(JSONObject jSONObject) {
        if (this.adControlAccessor.isInterstitial() && !this.adControlAccessor.isModal()) {
            this.adControlAccessor.orientationChangeAttemptedWhenNotAllowed();
        }
        this.orientationProperties.fromJSONObject(jSONObject);
        orientationPropertyChange();
    }

    public JSONObject getExpandPropertiesForCreative() {
        Size size;
        ExpandProperties clone = this.expandProperties.toClone();
        if (clone.getWidth() == -1) {
            size = this.adControlAccessor.getScreenSize();
            clone.setWidth(size.getWidth());
        } else {
            size = null;
        }
        if (clone.getHeight() == -1) {
            if (size == null) {
                size = this.adControlAccessor.getScreenSize();
            }
            clone.setHeight(size.getHeight());
        }
        return clone.toJSONObject();
    }

    public void setExpandProperties(JSONObject jSONObject) {
        this.expandProperties.fromJSONObject(jSONObject);
        showNativeCloseButtonIfNeeded();
    }

    public JSONObject getResizeProperties() {
        return this.resizeProperties.toJSONObject();
    }

    public void setResizeProperties(JSONObject jSONObject) {
        if (!this.resizeProperties.fromJSONObject(jSONObject)) {
            fireErrorEvent("Invalid resize properties", "setResizeProperties");
        } else if (this.resizeProperties.getWidth() < 50 || this.resizeProperties.getHeight() < 50) {
            fireErrorEvent("Resize properties width and height must be greater than 50dp in order to fit the close button.", "setResizeProperties");
            this.resizeProperties.reset();
        } else {
            Size maxSize = this.adControlAccessor.getMaxSize();
            if (this.resizeProperties.getWidth() > maxSize.getWidth() || this.resizeProperties.getHeight() > maxSize.getHeight()) {
                fireErrorEvent("Resize properties width and height cannot be larger than the maximum size.", "setResizeProperties");
                this.resizeProperties.reset();
            } else if (this.resizeProperties.getAllowOffscreen()) {
                Size computeResizeSizeInPixels = computeResizeSizeInPixels(this.resizeProperties);
                int deviceIndependentPixelToPixel = this.adUtils.deviceIndependentPixelToPixel(this.defaultPosition.getX() + this.resizeProperties.getOffsetX());
                if (!isValidClosePosition(RelativePosition.fromString(this.resizeProperties.getCustomClosePosition()), this.adUtils.deviceIndependentPixelToPixel(this.defaultPosition.getY() + this.resizeProperties.getOffsetY()), deviceIndependentPixelToPixel, computeResizeSizeInPixels, this.adUtils.deviceIndependentPixelToPixel(maxSize.getWidth()), this.adUtils.deviceIndependentPixelToPixel(maxSize.getHeight()))) {
                    fireErrorEvent("Invalid resize properties. Close event area must be entirely on screen.", "setResizeProperties");
                    this.resizeProperties.reset();
                }
            }
        }
    }

    public void setUseCustomClose(boolean z) {
        this.expandProperties.setUseCustomClose(Boolean.valueOf(z));
        showNativeCloseButtonIfNeeded();
    }

    private void showNativeCloseButtonIfNeeded() {
        if (this.adControlAccessor.isModal()) {
            this.adControlAccessor.showNativeCloseButtonImage(!this.expandProperties.getUseCustomClose().booleanValue());
        }
    }

    public void close() {
        if (!this.adControlAccessor.closeAd()) {
            fireErrorEvent("Unable to close ad in its current state.", "close");
        }
    }

    /* access modifiers changed from: private */
    public AdControlAccessor getAdControlAccessor() {
        return this.adControlAccessor;
    }

    public void expand(String str) {
        if (this.adControlAccessor.isInterstitial()) {
            fireErrorEvent("Unable to expand an interstitial ad placement", MraidJsMethods.EXPAND);
        } else if (this.adControlAccessor.isModal()) {
            fireErrorEvent("Unable to expand while expanded.", MraidJsMethods.EXPAND);
        } else if (!this.adControlAccessor.isVisible()) {
            fireErrorEvent("Unable to expand ad while it is not visible.", MraidJsMethods.EXPAND);
        } else if ((this.expandProperties.getWidth() < 50 && this.expandProperties.getWidth() != -1) || (this.expandProperties.getHeight() < 50 && this.expandProperties.getHeight() != -1)) {
            fireErrorEvent("Expand size is too small, must leave room for close.", MraidJsMethods.EXPAND);
        } else if (StringUtils.isNullOrWhiteSpace(str)) {
            AdControllerFactory.cacheAdControlAccessor(this.adControlAccessor);
            launchExpandActivity((String) null, this.expandProperties);
        } else if (this.webUtils.isUrlValid(str)) {
            final ExpandProperties clone = this.expandProperties.toClone();
            this.adControlAccessor.preloadUrl(str, new PreloadCallback() {
                public void onPreloadComplete(String str) {
                    MRAIDAdSDKBridge.this.getAdControlAccessor().injectJavascriptPreload("mraidBridge.stateChange('expanded');");
                    MRAIDAdSDKBridge.this.getAdControlAccessor().injectJavascriptPreload("mraidBridge.ready();");
                    AdControllerFactory.cacheAdControlAccessor(MRAIDAdSDKBridge.this.getAdControlAccessor());
                    MRAIDAdSDKBridge.this.launchExpandActivity(str, clone);
                }
            });
        } else {
            fireErrorEvent("Unable to expand with invalid URL.", MraidJsMethods.EXPAND);
        }
    }

    /* access modifiers changed from: private */
    public void launchExpandActivity(String str, ExpandProperties expandProperties2) {
        if (this.intentBuilderFactory.createIntentBuilder().withClass(AdActivity.class).withContext(this.adControlAccessor.getContext().getApplicationContext()).withExtra("adapter", ModalAdActivityAdapter.class.getName()).withExtra("url", str).withExtra("expandProperties", expandProperties2.toString()).withExtra("orientationProperties", this.orientationProperties.toString()).fireIntent()) {
            this.logger.mo10938d("Successfully expanded ad");
        }
    }

    public void resize() {
        if (this.adControlAccessor.isInterstitial()) {
            fireErrorEvent("Unable to resize an interstitial ad placement.", MraidJsMethods.RESIZE);
        } else if (this.adControlAccessor.isModal()) {
            fireErrorEvent("Unable to resize while expanded.", MraidJsMethods.RESIZE);
        } else if (!this.adControlAccessor.isVisible()) {
            fireErrorEvent("Unable to resize ad while it is not visible.", MraidJsMethods.RESIZE);
        } else {
            ResizeProperties resizeProperties2 = this.resizeProperties;
            if (resizeProperties2 == null || !resizeProperties2.areResizePropertiesSet()) {
                fireErrorEvent("Resize properties must be set before calling resize.", MraidJsMethods.RESIZE);
            } else {
                resizeAd(this.resizeProperties);
            }
        }
    }

    public void playVideo(String str) {
        if (!this.adControlAccessor.isVisible()) {
            fireErrorEvent("Unable to play a video while the ad is not visible", MraidJsMethods.PLAY_VIDEO);
        } else if (StringUtils.isNullOrEmpty(str)) {
            fireErrorEvent("Unable to play a video without a URL", MraidJsMethods.PLAY_VIDEO);
        } else {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("url", str);
                Intent intent = new Intent(getContext(), AdActivity.class);
                intent.putExtra("adapter", VideoActionHandler.class.getName());
                intent.putExtras(bundle);
                getContext().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                this.logger.mo10938d("Failed to open VideoAction activity");
                fireErrorEvent("Internal SDK Failure. Unable to launch VideoActionHandler", MraidJsMethods.PLAY_VIDEO);
            }
        }
    }

    public void open(String str) {
        if (!this.adControlAccessor.isVisible()) {
            fireErrorEvent("Unable to open a URL while the ad is not visible", "open");
            return;
        }
        this.logger.mo10938d("Opening URL " + str);
        if (this.webUtils.isUrlValid(str)) {
            String scheme = WebUtils.getScheme(str);
            if ("http".equals(scheme) || "https".equals(scheme)) {
                new InAppBrowser.InAppBrowserBuilder().withContext(getContext()).withExternalBrowserButton().withUrl(str).show();
            } else {
                this.adControlAccessor.loadUrl(str);
            }
        } else {
            String str2 = "URL " + str + " is not a valid URL";
            this.logger.mo10938d(str2);
            fireErrorEvent(str2, "open");
        }
    }

    public JSONObject getSupportedFeatures() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AdWebViewClient.SMS, getContext().getPackageManager().hasSystemFeature("android.hardware.telephony"));
            jSONObject.put(AdWebViewClient.TELEPHONE, getContext().getPackageManager().hasSystemFeature("android.hardware.telephony"));
            jSONObject.put("calendar", AndroidTargetUtils.isAtLeastAndroidAPI(14));
            jSONObject.put("storePicture", this.permissionChecker.hasWriteExternalStoragePermission(getContext()));
            jSONObject.put("inlineVideo", AndroidTargetUtils.isAtLeastAndroidAPI(11));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void createCalendarEvent(String str, String str2, String str3, String str4, String str5) {
        if (!AndroidTargetUtils.isAtLeastAndroidAPI(14)) {
            this.logger.mo10938d("API version does not support calendar operations.");
            fireErrorEvent("API version does not support calendar operations.", "createCalendarEvent");
            return;
        }
        try {
            createCalendarIntent(new CalendarEventParameters(str, str2, str3, str4, str5));
        } catch (IllegalArgumentException e) {
            this.logger.mo10938d(e.getMessage());
            fireErrorEvent(e.getMessage(), "createCalendarEvent");
        }
    }

    private void createCalendarIntent(CalendarEventParameters calendarEventParameters) {
        Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
        type.putExtra("title", calendarEventParameters.getDescription());
        if (!StringUtils.isNullOrEmpty(calendarEventParameters.getLocation())) {
            type.putExtra("eventLocation", calendarEventParameters.getLocation());
        }
        if (!StringUtils.isNullOrEmpty(calendarEventParameters.getSummary())) {
            type.putExtra("description", calendarEventParameters.getSummary());
        }
        type.putExtra("beginTime", calendarEventParameters.getStart().getTime());
        if (calendarEventParameters.getEnd() != null) {
            type.putExtra(SDKConstants.PARAM_END_TIME, calendarEventParameters.getEnd().getTime());
        }
        getContext().startActivity(type);
    }

    public void storePicture(final String str) {
        if (!this.permissionChecker.hasWriteExternalStoragePermission(getContext())) {
            fireErrorEvent("Picture could not be stored because permission was denied.", "storePicture");
        } else {
            this.threadRunner.execute(new Runnable() {
                public void run() {
                    MRAIDAdSDKBridge.this.fetchPicture(str);
                }
            }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.BACKGROUND_THREAD);
        }
    }

    /* access modifiers changed from: private */
    public void fetchPicture(String str) {
        WebRequest createWebRequest = this.webRequestFactory.createWebRequest();
        createWebRequest.enableLog(true);
        createWebRequest.setUrlString(str);
        try {
            WebRequest.WebResponse makeCall = createWebRequest.makeCall();
            if (makeCall == null) {
                fireErrorEvent("Server could not be contacted to download picture.", "storePicture");
                return;
            }
            final Bitmap readAsBitmap = new ImageResponseReader(makeCall.getResponseReader(), this.graphicsUtils).readAsBitmap();
            if (readAsBitmap == null) {
                fireErrorEvent("Picture could not be retrieved from server.", "storePicture");
            } else {
                this.threadRunner.execute(new Runnable() {
                    public void run() {
                        MRAIDAdSDKBridge.this.savePicture(readAsBitmap);
                    }
                }, ThreadUtils.ExecutionStyle.SCHEDULE, ThreadUtils.ExecutionThread.MAIN_THREAD);
            }
        } catch (WebRequest.WebRequestException unused) {
            fireErrorEvent("Server could not be contacted to download picture.", "storePicture");
        }
    }

    /* access modifiers changed from: private */
    public void savePicture(final Bitmap bitmap) {
        AlertDialog.Builder createBuilder = this.alertDialogFactory.createBuilder(getContext());
        createBuilder.setTitle("Would you like to save the image to your gallery?");
        createBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String insertImageInMediaStore = MRAIDAdSDKBridge.this.graphicsUtils.insertImageInMediaStore(MRAIDAdSDKBridge.this.getContext(), bitmap, "AdImage", "Image created by rich media ad.");
                if (StringUtils.isNullOrEmpty(insertImageInMediaStore)) {
                    MRAIDAdSDKBridge.this.fireErrorEvent("Picture could not be stored to device.", "storePicture");
                    return;
                }
                MediaScannerConnection.scanFile(MRAIDAdSDKBridge.this.getContext(), new String[]{insertImageInMediaStore}, (String[]) null, (MediaScannerConnection.OnScanCompletedListener) null);
            }
        });
        createBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MRAIDAdSDKBridge.this.fireErrorEvent("User chose not to store image.", "storePicture");
            }
        });
        createBuilder.show();
    }

    /* access modifiers changed from: package-private */
    public void collapseExpandedAd(final AdControlAccessor adControlAccessor2) {
        MobileAdsLogger mobileAdsLogger = this.logger;
        mobileAdsLogger.mo10938d("Collapsing expanded ad " + this);
        this.threadRunner.execute(new Runnable() {
            public void run() {
                MRAIDAdSDKBridge.this.collapseExpandedAdOnThread(adControlAccessor2);
            }
        }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.MAIN_THREAD);
    }

    /* access modifiers changed from: private */
    public void collapseExpandedAdOnThread(final AdControlAccessor adControlAccessor2) {
        adControlAccessor2.setAdActivity((Activity) null);
        if (this.expandedWithUrl) {
            this.logger.mo10938d("Expanded With URL");
            adControlAccessor2.popView();
        } else {
            this.logger.mo10938d("Not Expanded with URL");
        }
        adControlAccessor2.moveViewBackToParent(new FrameLayout.LayoutParams(-1, -1, 17));
        adControlAccessor2.removeCloseButton();
        adControlAccessor2.fireAdEvent(new AdEvent(AdEvent.AdEventType.CLOSED));
        adControlAccessor2.injectJavascript("mraidBridge.stateChange('default');");
        adControlAccessor2.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                adControlAccessor2.removeOnGlobalLayoutListener(this);
                MRAIDAdSDKBridge.this.reportSizeChangeEvent();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void resizeAd(final ResizeProperties resizeProperties2) {
        final Size computeResizeSizeInPixels = computeResizeSizeInPixels(resizeProperties2);
        this.threadRunner.execute(new Runnable() {
            public void run() {
                MRAIDAdSDKBridge.this.resizeAdOnThread(resizeProperties2, computeResizeSizeInPixels);
            }
        }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.MAIN_THREAD);
    }

    /* access modifiers changed from: private */
    public void resizeAdOnThread(final ResizeProperties resizeProperties2, final Size size) {
        Size maxSize = this.adControlAccessor.getMaxSize();
        if (maxSize == null) {
            this.adControlAccessor.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    MRAIDAdSDKBridge.this.adControlAccessor.removeOnGlobalLayoutListener(this);
                    MRAIDAdSDKBridge.this.resizeAdHelper(resizeProperties2, size, MRAIDAdSDKBridge.this.adControlAccessor.getMaxSize());
                }
            });
        } else {
            resizeAdHelper(resizeProperties2, size, maxSize);
        }
    }

    /* access modifiers changed from: private */
    public void resizeAdHelper(ResizeProperties resizeProperties2, Size size, Size size2) {
        if (size2 == null) {
            this.logger.mo10938d("Size is null");
            return;
        }
        createResizedView();
        int deviceIndependentPixelToPixel = this.adUtils.deviceIndependentPixelToPixel(this.defaultPosition.getX() + resizeProperties2.getOffsetX());
        int deviceIndependentPixelToPixel2 = this.adUtils.deviceIndependentPixelToPixel(this.defaultPosition.getY() + resizeProperties2.getOffsetY());
        RelativePosition fromString = RelativePosition.fromString(resizeProperties2.getCustomClosePosition());
        int deviceIndependentPixelToPixel3 = this.adUtils.deviceIndependentPixelToPixel(size2.getWidth());
        int deviceIndependentPixelToPixel4 = this.adUtils.deviceIndependentPixelToPixel(size2.getHeight());
        if (!resizeProperties2.getAllowOffscreen()) {
            if (size.getWidth() > deviceIndependentPixelToPixel3) {
                size.setWidth(deviceIndependentPixelToPixel3);
            }
            if (size.getHeight() > deviceIndependentPixelToPixel4) {
                size.setHeight(deviceIndependentPixelToPixel4);
            }
            if (deviceIndependentPixelToPixel < 0) {
                deviceIndependentPixelToPixel = 0;
            } else if (size.getWidth() + deviceIndependentPixelToPixel > deviceIndependentPixelToPixel3) {
                deviceIndependentPixelToPixel = deviceIndependentPixelToPixel3 - size.getWidth();
            }
            if (deviceIndependentPixelToPixel2 < 0) {
                deviceIndependentPixelToPixel2 = 0;
            } else if (size.getHeight() + deviceIndependentPixelToPixel2 > deviceIndependentPixelToPixel4) {
                deviceIndependentPixelToPixel2 = deviceIndependentPixelToPixel4 - size.getHeight();
            }
        } else if (!isValidClosePosition(fromString, deviceIndependentPixelToPixel2, deviceIndependentPixelToPixel, size, deviceIndependentPixelToPixel3, deviceIndependentPixelToPixel4)) {
            fireErrorEvent("Resize failed because close event area must be entirely on screen.", MraidJsMethods.RESIZE);
            return;
        }
        this.adControlAccessor.moveViewToViewGroup(this.resizedView, new RelativeLayout.LayoutParams(size.getWidth(), size.getHeight()), false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.getWidth(), size.getHeight());
        layoutParams.gravity = 48;
        layoutParams.leftMargin = deviceIndependentPixelToPixel;
        layoutParams.topMargin = deviceIndependentPixelToPixel2;
        if (this.rootView.equals(this.resizedView.getParent())) {
            this.resizedView.setLayoutParams(layoutParams);
        } else {
            this.rootView.addView(this.resizedView, layoutParams);
        }
        this.adControlAccessor.enableCloseButton(false, fromString);
        final ViewTreeObserver viewTreeObserver = this.resizedView.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MRAIDAdSDKBridge.this.viewUtils.removeOnGlobalLayoutListener(viewTreeObserver, this);
                int[] iArr = new int[2];
                MRAIDAdSDKBridge.this.resizedView.getLocationOnScreen(iArr);
                Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + MRAIDAdSDKBridge.this.resizedView.getWidth(), iArr[1] + MRAIDAdSDKBridge.this.resizedView.getHeight());
                AdEvent adEvent = new AdEvent(AdEvent.AdEventType.RESIZED);
                adEvent.setParameter(AdEvent.POSITION_ON_SCREEN, rect);
                MRAIDAdSDKBridge.this.adControlAccessor.fireAdEvent(adEvent);
                MRAIDAdSDKBridge.this.adControlAccessor.injectJavascript("mraidBridge.stateChange('resized');");
                MRAIDAdSDKBridge.this.reportSizeChangeEvent();
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean isViewable() {
        return this.adControlAccessor.isViewable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0078, code lost:
        r4 = r5 + r0;
        r0 = r0 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007b, code lost:
        if (r5 < 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007d, code lost:
        if (r6 < 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r4 > r9) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        if (r0 <= r8) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0058, code lost:
        r4 = r5 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        r0 = r0 + r6;
        r2 = r5;
        r5 = r4;
        r4 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isValidClosePosition(com.amazon.device.ads.RelativePosition r4, int r5, int r6, com.amazon.device.ads.Size r7, int r8, int r9) {
        /*
            r3 = this;
            com.amazon.device.ads.AdUtils2 r0 = r3.adUtils
            r1 = 50
            int r0 = r0.deviceIndependentPixelToPixel(r1)
            int[] r1 = com.amazon.device.ads.MRAIDAdSDKBridge.C095712.$SwitchMap$com$amazon$device$ads$RelativePosition
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 0
            switch(r4) {
                case 1: goto L_0x0078;
                case 2: goto L_0x006b;
                case 3: goto L_0x005f;
                case 4: goto L_0x0053;
                case 5: goto L_0x0041;
                case 6: goto L_0x0030;
                case 7: goto L_0x001a;
                default: goto L_0x0014;
            }
        L_0x0014:
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = 0
            goto L_0x007b
        L_0x001a:
            int r4 = r7.getHeight()
            int r4 = r4 / 2
            int r4 = r4 + r5
            int r5 = r0 / 2
            int r4 = r4 - r5
            int r7 = r7.getWidth()
            int r7 = r7 / 2
            int r7 = r7 + r6
            int r6 = r7 - r5
            int r5 = r4 + r0
            goto L_0x005a
        L_0x0030:
            int r4 = r7.getHeight()
            int r5 = r5 + r4
            int r4 = r7.getWidth()
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r6 = r0 / 2
            int r6 = r4 - r6
            goto L_0x0058
        L_0x0041:
            int r4 = r7.getHeight()
            int r5 = r5 + r4
            int r4 = r7.getWidth()
            int r4 = r4 + r6
            int r6 = r5 - r0
            int r7 = r4 - r0
            r0 = r4
            r4 = r5
            r5 = r6
            goto L_0x0076
        L_0x0053:
            int r4 = r7.getHeight()
            int r5 = r5 + r4
        L_0x0058:
            int r4 = r5 - r0
        L_0x005a:
            int r0 = r0 + r6
            r2 = r5
            r5 = r4
            r4 = r2
            goto L_0x007b
        L_0x005f:
            int r4 = r7.getWidth()
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r6 = r0 / 2
            int r6 = r4 - r6
            goto L_0x0078
        L_0x006b:
            int r4 = r7.getWidth()
            int r4 = r4 + r6
            int r6 = r5 + r0
            int r7 = r4 - r0
            r0 = r4
            r4 = r6
        L_0x0076:
            r6 = r7
            goto L_0x007b
        L_0x0078:
            int r4 = r5 + r0
            int r0 = r0 + r6
        L_0x007b:
            if (r5 < 0) goto L_0x0086
            if (r6 < 0) goto L_0x0086
            if (r4 > r9) goto L_0x0086
            if (r0 <= r8) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r4 = 1
            return r4
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.MRAIDAdSDKBridge.isValidClosePosition(com.amazon.device.ads.RelativePosition, int, int, com.amazon.device.ads.Size, int, int):boolean");
    }

    private Size computeResizeSizeInPixels(ResizeProperties resizeProperties2) {
        return new Size(this.adUtils.deviceIndependentPixelToPixel(resizeProperties2.getWidth()), this.adUtils.deviceIndependentPixelToPixel(resizeProperties2.getHeight()));
    }

    private void createResizedView() {
        if (this.resizedView == null) {
            if (this.rootView == null) {
                this.rootView = (FrameLayout) this.adControlAccessor.getRootView();
            }
            this.resizedView = this.layoutFactory.createLayout(getContext(), LayoutFactory.LayoutType.RELATIVE_LAYOUT, CONTENT_DESCRIPTION_RESIZED_VIEW);
        }
    }

    /* access modifiers changed from: package-private */
    public void reportSizeChangeEvent() {
        Position currentPosition = this.adControlAccessor.getCurrentPosition();
        if (currentPosition != null) {
            AdControlAccessor adControlAccessor2 = this.adControlAccessor;
            adControlAccessor2.injectJavascript("mraidBridge.sizeChange(" + currentPosition.getSize().getWidth() + "," + currentPosition.getSize().getHeight() + ");");
        }
    }

    /* access modifiers changed from: package-private */
    public void orientationPropertyChange() {
        if (this.adControlAccessor.isVisible() && this.adControlAccessor.isModal()) {
            Activity adActivity = this.adControlAccessor.getAdActivity();
            if (adActivity == null) {
                this.logger.mo10939e("unable to handle orientation property change on a non-expanded ad");
                return;
            }
            int requestedOrientation = adActivity.getRequestedOrientation();
            Position currentPosition = this.adControlAccessor.getCurrentPosition();
            MobileAdsLogger mobileAdsLogger = this.logger;
            mobileAdsLogger.mo10938d("Current Orientation: " + requestedOrientation);
            int i = C095712.$SwitchMap$com$amazon$device$ads$ForceOrientation[this.orientationProperties.getForceOrientation().ordinal()];
            if (i == 1) {
                adActivity.setRequestedOrientation(7);
            } else if (i == 2) {
                adActivity.setRequestedOrientation(6);
            }
            if (ForceOrientation.NONE.equals(this.orientationProperties.getForceOrientation())) {
                if (this.orientationProperties.isAllowOrientationChange().booleanValue()) {
                    if (adActivity.getRequestedOrientation() != -1) {
                        adActivity.setRequestedOrientation(-1);
                    }
                } else if (this.adControlAccessor.isModal()) {
                    adActivity.setRequestedOrientation(DisplayUtils.determineCanonicalScreenOrientation(adActivity, this.buildInfo));
                }
            }
            int requestedOrientation2 = adActivity.getRequestedOrientation();
            MobileAdsLogger mobileAdsLogger2 = this.logger;
            mobileAdsLogger2.mo10938d("New Orientation: " + requestedOrientation2);
            if (requestedOrientation2 != requestedOrientation && currentPosition != null) {
                if (currentPosition.getSize().getWidth() != this.adControlAccessor.getCurrentPosition().getSize().getWidth()) {
                    this.adControlAccessor.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                        public void onGlobalLayout() {
                            MRAIDAdSDKBridge.this.adControlAccessor.removeOnGlobalLayoutListener(this);
                            MRAIDAdSDKBridge.this.reportSizeChangeEvent();
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.amazon.device.ads.MRAIDAdSDKBridge$12 */
    static /* synthetic */ class C095712 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$ForceOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$RelativePosition;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        static {
            /*
                com.amazon.device.ads.ForceOrientation[] r0 = com.amazon.device.ads.ForceOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$ForceOrientation = r0
                r1 = 1
                com.amazon.device.ads.ForceOrientation r2 = com.amazon.device.ads.ForceOrientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$amazon$device$ads$ForceOrientation     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.ForceOrientation r3 = com.amazon.device.ads.ForceOrientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$amazon$device$ads$ForceOrientation     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.ForceOrientation r4 = com.amazon.device.ads.ForceOrientation.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.amazon.device.ads.RelativePosition[] r3 = com.amazon.device.ads.RelativePosition.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$amazon$device$ads$RelativePosition = r3
                com.amazon.device.ads.RelativePosition r4 = com.amazon.device.ads.RelativePosition.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.amazon.device.ads.RelativePosition r3 = com.amazon.device.ads.RelativePosition.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x004d }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.TOP_CENTER     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x006e }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.BOTTOM_CENTER     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$amazon$device$ads$RelativePosition     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.amazon.device.ads.RelativePosition r1 = com.amazon.device.ads.RelativePosition.CENTER     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.MRAIDAdSDKBridge.C095712.<clinit>():void");
        }
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
    public void fireErrorEvent(String str, String str2) {
        this.adControlAccessor.injectJavascript(String.format(Locale.US, ERROR_EVENT_FORMAT, new Object[]{str, str2}));
    }

    private static class GetCurrentPositionJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetCurrentPosition";
        private final MRAIDAdSDKBridge bridge;

        public GetCurrentPositionJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            return this.bridge.getCurrentPosition();
        }
    }

    private static class GetDefaultPositionJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetDefaultPosition";
        private final MRAIDAdSDKBridge bridge;

        public GetDefaultPositionJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            return this.bridge.getDefaultPosition();
        }
    }

    private static class GetMaxSizeJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetMaxSize";
        private final MRAIDAdSDKBridge bridge;

        public GetMaxSizeJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            return this.bridge.getMaxSize();
        }
    }

    private static class GetScreenSizeJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetScreenSize";
        private final MRAIDAdSDKBridge bridge;

        public GetScreenSizeJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            return this.bridge.getScreenSize();
        }
    }

    private static class GetPlacementTypeJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetPlacementType";
        private final MRAIDAdSDKBridge bridge;

        public GetPlacementTypeJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            JSONUtils.put(jSONObject2, "placementType", this.bridge.getPlacementType());
            return jSONObject2;
        }
    }

    private static class SetOrientationPropertiesJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "SetOrientationProperties";
        private final MRAIDAdSDKBridge bridge;

        public SetOrientationPropertiesJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.setOrientationProperties(jSONObject);
            return null;
        }
    }

    private static class GetExpandPropertiesJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetExpandProperties";
        private final MRAIDAdSDKBridge bridge;

        public GetExpandPropertiesJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            return this.bridge.getExpandPropertiesForCreative();
        }
    }

    private static class SetExpandPropertiesJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "SetExpandProperties";
        private final MRAIDAdSDKBridge bridge;

        public SetExpandPropertiesJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.setExpandProperties(jSONObject);
            return null;
        }
    }

    private static class GetResizePropertiesJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "GetResizeProperties";
        private final MRAIDAdSDKBridge bridge;

        public GetResizePropertiesJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            return this.bridge.getResizeProperties();
        }
    }

    private static class SetResizePropertiesJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "SetResizeProperties";
        private final MRAIDAdSDKBridge bridge;

        public SetResizePropertiesJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.setResizeProperties(jSONObject);
            return null;
        }
    }

    private static class UseCustomCloseJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "UseCustomClose";
        private final MRAIDAdSDKBridge bridge;

        public UseCustomCloseJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.setUseCustomClose(JSONUtils.getBooleanFromJSON(jSONObject, "useCustomClose", false));
            return null;
        }
    }

    private static class IsViewableJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "IsViewable";
        private final MRAIDAdSDKBridge bridge;

        public IsViewableJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            JSONUtils.put(jSONObject2, "isViewable", this.bridge.isViewable());
            return jSONObject2;
        }
    }

    private static class CloseJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "Close";
        private final MRAIDAdSDKBridge bridge;

        public CloseJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.close();
            return null;
        }
    }

    private static class ExpandJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "Expand";
        private final MRAIDAdSDKBridge bridge;

        public ExpandJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.expand(JSONUtils.getStringFromJSON(jSONObject, "url", (String) null));
            return null;
        }
    }

    private static class ResizeJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "Resize";
        private final MRAIDAdSDKBridge bridge;

        public ResizeJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.resize();
            return null;
        }
    }

    private static class PlayVideoJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "PlayVideo";
        private final MRAIDAdSDKBridge bridge;

        public PlayVideoJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.playVideo(JSONUtils.getStringFromJSON(jSONObject, "url", (String) null));
            return null;
        }
    }

    private static class OpenJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "Open";
        private final MRAIDAdSDKBridge bridge;

        public OpenJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.open(JSONUtils.getStringFromJSON(jSONObject, "url", (String) null));
            return null;
        }
    }

    private static class SupportsJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "Supports";
        private final MRAIDAdSDKBridge bridge;

        public SupportsJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            return this.bridge.getSupportedFeatures();
        }
    }

    private static class CreateCalendarEventJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "CreateCalendarEvent";
        private final MRAIDAdSDKBridge bridge;

        public CreateCalendarEventJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.createCalendarEvent(JSONUtils.getStringFromJSON(jSONObject, "description", (String) null), JSONUtils.getStringFromJSON(jSONObject, FirebaseAnalytics.Param.LOCATION, (String) null), JSONUtils.getStringFromJSON(jSONObject, "summary", (String) null), JSONUtils.getStringFromJSON(jSONObject, "start", (String) null), JSONUtils.getStringFromJSON(jSONObject, "end", (String) null));
            return null;
        }
    }

    private static class StorePictureJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "StorePicture";
        private final MRAIDAdSDKBridge bridge;

        public StorePictureJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.storePicture(JSONUtils.getStringFromJSON(jSONObject, "url", (String) null));
            return null;
        }
    }

    private static class RegisterViewabilityInterestJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "RegisterViewabilityInterest";
        private final MRAIDAdSDKBridge bridge;

        public RegisterViewabilityInterestJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        /* access modifiers changed from: protected */
        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.registerViewabilityInterest();
            return null;
        }
    }

    private static class DeregisterViewabilityInterestJSIF extends JavascriptInteractor.JavascriptMethodExecutor {
        private static final String name = "DeregisterViewabilityInterest";
        private final MRAIDAdSDKBridge bridge;

        public DeregisterViewabilityInterestJSIF(MRAIDAdSDKBridge mRAIDAdSDKBridge) {
            super(name);
            this.bridge = mRAIDAdSDKBridge;
        }

        /* access modifiers changed from: protected */
        public JSONObject execute(JSONObject jSONObject) {
            this.bridge.deregisterViewabilityInterest();
            return null;
        }
    }

    static class AlertDialogFactory {
        AlertDialogFactory() {
        }

        public AlertDialog.Builder createBuilder(Context context) {
            return new AlertDialog.Builder(context);
        }
    }
}
