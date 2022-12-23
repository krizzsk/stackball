package com.smaato.sdk.richmedia.mraid.bridge;

import android.graphics.Rect;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import com.smaato.sdk.richmedia.mraid.bridge.PropertiesUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidAppOrientation;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExpandProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidLocationProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidOrientationProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidResizeProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType;
import com.smaato.sdk.richmedia.mraid.exception.MraidException;
import com.smaato.sdk.richmedia.util.DeviceUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import java.util.Map;

public final class MraidJsProperties {
    private ErrorListener errorCallback;
    private MraidExpandProperties expandProperties;
    private final MraidJsBridge jsBridge;
    private final Logger logger;
    private final ChangeSender<MraidOrientationProperties> orientationProperties = ChangeSenderUtils.createUniqueValueChangeSender(MraidOrientationProperties.createDefault());
    private MraidResizeProperties resizeProperties;

    public MraidJsProperties(Logger logger2, MraidJsBridge mraidJsBridge) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.jsBridge = (MraidJsBridge) Objects.requireNonNull(mraidJsBridge);
        this.jsBridge.addCommandHandler("setOrientationProperties", new MraidCommandHandler() {
            public final void handle(Map map, boolean z) {
                MraidJsProperties.this.lambda$subscribeOnEvents$0$MraidJsProperties(map, z);
            }
        });
        this.jsBridge.addCommandHandler("setResizeProperties", new MraidCommandHandler() {
            public final void handle(Map map, boolean z) {
                MraidJsProperties.this.lambda$subscribeOnEvents$1$MraidJsProperties(map, z);
            }
        });
        this.jsBridge.addCommandHandler("setExpandProperties", new MraidCommandHandler() {
            public final void handle(Map map, boolean z) {
                MraidJsProperties.this.lambda$subscribeOnEvents$2$MraidJsProperties(map, z);
            }
        });
    }

    public final void setErrorListener(ErrorListener errorListener) {
        this.errorCallback = errorListener;
    }

    public final ChangeSender<MraidOrientationProperties> getOrientationPropertiesChangeSender() {
        return this.orientationProperties;
    }

    public final MraidResizeProperties getResizeProperties() {
        return this.resizeProperties;
    }

    public final MraidExpandProperties getExpandProperties() {
        return this.expandProperties;
    }

    public final void setCurrentAppOrientation(MraidAppOrientation mraidAppOrientation) {
        Object[] objArr = new Object[2];
        int i = PropertiesUtils.C89071.f21802xecb9dd8b[mraidAppOrientation.orientation.ordinal()];
        objArr[0] = i != 1 ? i != 2 ? "none" : "landscape" : "portrait";
        objArr[1] = Boolean.valueOf(mraidAppOrientation.isLocked);
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setCurrentAppOrientation('%s', %b);", objArr));
    }

    public final void setCurrentPosition(Rect rect) {
        if (!rect.isEmpty()) {
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setCurrentPosition(%d, %d, %d, %d);", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
        }
    }

    public final void setDefaultPosition(Rect rect) {
        if (!rect.isEmpty()) {
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setDefaultPosition(%d, %d, %d, %d);", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
        }
    }

    public final void setMaxSize(Size size) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setMaxSize(%d, %d);", Integer.valueOf(size.width), Integer.valueOf(size.height)));
    }

    public final void setScreenSize(Size size) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setScreenSize(%d, %d);", Integer.valueOf(size.width), Integer.valueOf(size.height)));
    }

    public final void setLocation(MraidLocationProperties mraidLocationProperties) {
        if (mraidLocationProperties.latLng != null) {
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setCurrentLocation(%f, %f, %d, %f, %d);", Double.valueOf(mraidLocationProperties.latLng.getLatitude()), Double.valueOf(mraidLocationProperties.latLng.getLongitude()), mraidLocationProperties.locationServiceType, Float.valueOf(mraidLocationProperties.latLng.getLocationAccuracy()), Long.valueOf(mraidLocationProperties.latLng.getLocationTimestamp() / 1000)));
        }
    }

    public final void setSupportedFeatures(List<String> list, String[] strArr) {
        for (String str : strArr) {
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setSupports('%s', %b);", str, Boolean.valueOf(list.contains(str))));
        }
    }

    public final void setPlacementType(PlacementType placementType) {
        String str;
        try {
            Object[] objArr = new Object[1];
            int i = PropertiesUtils.C89071.f21801x3c837bb5[placementType.ordinal()];
            if (i == 1) {
                str = "interstitial";
            } else if (i == 2) {
                str = TJAdUnitConstants.String.INLINE;
            } else {
                throw new IllegalArgumentException("Unknown placement type: ".concat(String.valueOf(placementType)));
            }
            objArr[0] = str;
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.setPlacementType('%s');", objArr));
        } catch (IllegalArgumentException e) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.MRAID;
            logger2.error(logDomain, "Failed to call MRAID's setPlacementType method, reason: " + e.getMessage(), new Object[0]);
        }
    }

    public /* synthetic */ void lambda$subscribeOnEvents$2$MraidJsProperties(Map map, boolean z) {
        try {
            this.expandProperties = new MraidExpandProperties.Builder(map).build();
        } catch (MraidException e) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.MRAID;
            logger2.error(logDomain, "Failed to handle a command: setExpandProperties, reason: " + e.getMessage(), new Object[0]);
            Objects.onNotNull(this.errorCallback, new Consumer() {
                public final void accept(Object obj) {
                    ((ErrorListener) obj).onError("setExpandProperties", MraidException.this.getMessage());
                }
            });
        }
    }

    public /* synthetic */ void lambda$subscribeOnEvents$1$MraidJsProperties(Map map, boolean z) {
        try {
            this.resizeProperties = new MraidResizeProperties.Builder(map).build();
        } catch (MraidException e) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.MRAID;
            logger2.error(logDomain, "Failed to handle a command: setResizeProperties, reason: " + e.getMessage(), new Object[0]);
            Objects.onNotNull(this.errorCallback, new Consumer() {
                public final void accept(Object obj) {
                    ((ErrorListener) obj).onError("setResizeProperties", MraidException.this.getMessage());
                }
            });
        }
    }

    public /* synthetic */ void lambda$subscribeOnEvents$0$MraidJsProperties(Map map, boolean z) {
        DeviceUtils.ScreenOrientation screenOrientation;
        String str = (String) map.get("allowOrientationChange");
        boolean booleanValue = !TextUtils.isEmpty(str) ? Boolean.valueOf(str).booleanValue() : true;
        String str2 = (String) map.get("forceOrientation");
        if (!TextUtils.isEmpty(str2)) {
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 729267099) {
                if (hashCode == 1430647483 && str2.equals("landscape")) {
                    c = 1;
                }
            } else if (str2.equals("portrait")) {
                c = 0;
            }
            if (c == 0) {
                screenOrientation = DeviceUtils.ScreenOrientation.PORTRAIT;
            } else if (c == 1) {
                screenOrientation = DeviceUtils.ScreenOrientation.LANDSCAPE;
            }
            this.orientationProperties.newValue(new MraidOrientationProperties(booleanValue, screenOrientation));
        }
        screenOrientation = DeviceUtils.ScreenOrientation.UNKNOWN;
        this.orientationProperties.newValue(new MraidOrientationProperties(booleanValue, screenOrientation));
    }
}
