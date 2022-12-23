package com.ogury.p245ed.internal;

import android.graphics.Rect;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.hc */
public final class C8284hc {

    /* renamed from: a */
    public static final C8284hc f21402a = new C8284hc();

    /* renamed from: a */
    public static String m23285a() {
        return "ogySdkMraidGateway.updateSupportFlags({sms: false, tel: false, calendar: false, storePicture: false, inlineVideo: false, vpaid: false, location: false})";
    }

    /* renamed from: b */
    public static String m23296b() {
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnCloseSystem\", {})";
    }

    /* renamed from: c */
    public static String m23301c() {
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnTouchEnd\", {})";
    }

    private C8284hc() {
    }

    /* renamed from: a */
    public static String m23291a(String str, String str2) {
        C8467mq.m23881b(str, "command");
        C8467mq.m23881b(str2, "message");
        return "ogySdkMraidGateway.callErrorListeners(\"" + str2 + "\", \"" + str + "\")";
    }

    /* renamed from: a */
    public static String m23286a(int i) {
        return "ogySdkMraidGateway.updateAudioVolume(" + i + ')';
    }

    /* renamed from: a */
    public static String m23292a(String str, boolean z) {
        C8467mq.m23881b(str, "orientation");
        return "ogySdkMraidGateway.updateCurrentAppOrientation({orientation: \"" + str + "\", locked: " + z + "})";
    }

    /* renamed from: a */
    public static String m23295a(boolean z, String str) {
        C8467mq.m23881b(str, "forceOrientation");
        return "ogySdkMraidGateway.updateOrientationProperties({allowOrientationChange: " + z + ", forceOrientation: \"" + str + "\"})";
    }

    /* renamed from: a */
    public static String m23287a(int i, int i2) {
        return "ogySdkMraidGateway.updateScreenSize({width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: a */
    public static String m23290a(String str) {
        C8467mq.m23881b(str, "placementType");
        return "ogySdkMraidGateway.updatePlacementType(\"" + str + "\")";
    }

    /* renamed from: a */
    public static String m23294a(boolean z) {
        return "ogySdkMraidGateway.updateViewability(" + z + ')';
    }

    /* renamed from: b */
    public static String m23297b(int i, int i2) {
        return "ogySdkMraidGateway.updateMaxSize({width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: a */
    public static String m23288a(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateDefaultPosition({x: " + i3 + ", y: " + i4 + ", width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: b */
    public static String m23298b(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateCurrentPosition({x: " + i3 + ", y: " + i4 + ", width: " + i + ", height: " + i2 + "})";
    }

    /* renamed from: c */
    public static String m23303c(int i, int i2, int i3, int i4) {
        return "ogySdkMraidGateway.updateResizeProperties({width: " + i + ", height: " + i2 + ", offsetX: " + i3 + ", offsetY: " + i4 + ", customClosePosition: \"right\", allowOffscreen: false})";
    }

    /* renamed from: c */
    public static String m23302c(int i, int i2) {
        return "ogySdkMraidGateway.updateExpandProperties({width: " + i + ", height: " + i2 + ", useCustomClose: false, isModal: true})";
    }

    /* renamed from: b */
    public static String m23299b(String str) {
        C8467mq.m23881b(str, "state");
        return "ogySdkMraidGateway.updateState(\"" + str + "\")";
    }

    /* renamed from: b */
    public static String m23300b(String str, String str2) {
        C8467mq.m23881b(str, TJAdUnitConstants.String.CALLBACK_ID);
        C8467mq.m23881b(str2, IronSourceConstants.EVENTS_RESULT);
        return "ogySdkMraidGateway.callPendingMethodCallback(\"" + str + "\", null, " + str2 + ')';
    }

    /* renamed from: a */
    public static String m23289a(C8278gy gyVar) {
        String str;
        C8467mq.m23881b(gyVar, "adExposure");
        StringBuilder sb = new StringBuilder();
        for (Rect next : gyVar.mo53632b()) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("{x: " + C8258gi.m23194a(next.left) + ", y: " + C8258gi.m23194a(next.top) + ", width: " + C8258gi.m23194a(next.width()) + ", height: " + C8258gi.m23194a(next.height()) + '}');
        }
        Rect a = gyVar.mo53628a();
        if (a != null) {
            str = "visibleRectangle: {x: " + C8258gi.m23194a(a.left) + ", y: " + C8258gi.m23194a(a.top) + ", width: " + C8258gi.m23194a(a.width()) + ", height: " + C8258gi.m23194a(a.height()) + '}';
        } else {
            str = "visibleRectangle: null";
        }
        return "ogySdkMraidGateway.updateExposure({exposedPercentage: " + gyVar.mo53633c() + ", " + str + ", occlusionRectangles: [" + sb + "]})";
    }

    /* renamed from: a */
    public static String m23293a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        C8467mq.m23881b(str, "event");
        C8467mq.m23881b(str2, "webViewId");
        C8467mq.m23881b(str3, "url");
        C8467mq.m23881b(str4, "pageTitle");
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnNavigation\", {event: \"" + str + "\", canGoBack: " + z2 + ", canGoForward: " + z + ", webviewId: \"" + str2 + "\", url: \"" + str3 + "\", \"pageTitle\": \"" + str4 + "\"})";
    }

    /* renamed from: c */
    public static String m23304c(String str) {
        C8467mq.m23881b(str, "url");
        return "ogySdkMraidGateway.callEventListeners(\"ogyOnOpenedUrl\", {url: \"" + str + "\"})";
    }
}
