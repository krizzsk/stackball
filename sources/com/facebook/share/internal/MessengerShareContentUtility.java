package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MessengerShareContentUtility {
    public static final String ATTACHMENT = "attachment";
    public static final String ATTACHMENT_ID = "attachment_id";
    public static final String ATTACHMENT_PAYLOAD = "payload";
    public static final String ATTACHMENT_TEMPLATE_TYPE = "template";
    public static final String ATTACHMENT_TYPE = "type";
    public static final String BUTTONS = "buttons";
    public static final String BUTTON_TYPE = "type";
    public static final String BUTTON_URL_TYPE = "web_url";
    public static final String DEFAULT_ACTION = "default_action";
    public static final String ELEMENTS = "elements";
    public static final Pattern FACEBOOK_DOMAIN = Pattern.compile("^(.+)\\.(facebook\\.com)$");
    public static final String FALLBACK_URL = "fallback_url";
    public static final String IMAGE_ASPECT_RATIO = "image_aspect_ratio";
    public static final String IMAGE_RATIO_HORIZONTAL = "horizontal";
    public static final String IMAGE_RATIO_SQUARE = "square";
    public static final String IMAGE_URL = "image_url";
    public static final String MEDIA_IMAGE = "image";
    public static final String MEDIA_TYPE = "media_type";
    public static final String MEDIA_VIDEO = "video";
    public static final String MESSENGER_EXTENSIONS = "messenger_extensions";
    public static final String PREVIEW_DEFAULT = "DEFAULT";
    public static final String PREVIEW_OPEN_GRAPH = "OPEN_GRAPH";
    public static final String SHARABLE = "sharable";
    public static final String SHARE_BUTTON_HIDE = "hide";
    public static final String SUBTITLE = "subtitle";
    public static final String TEMPLATE_GENERIC_TYPE = "generic";
    public static final String TEMPLATE_MEDIA_TYPE = "media";
    public static final String TEMPLATE_OPEN_GRAPH_TYPE = "open_graph";
    public static final String TEMPLATE_TYPE = "template_type";
    public static final String TITLE = "title";
    public static final String URL = "url";
    public static final String WEBVIEW_RATIO = "webview_height_ratio";
    public static final String WEBVIEW_RATIO_COMPACT = "compact";
    public static final String WEBVIEW_RATIO_FULL = "full";
    public static final String WEBVIEW_RATIO_TALL = "tall";
    public static final String WEBVIEW_SHARE_BUTTON = "webview_share_button";

    public static void addGenericTemplateContent(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                addGenericTemplateElementForPreview(bundle, shareMessengerGenericTemplateContent.getGenericTemplateElement());
                Utility.putJSONValueInBundle(bundle, ShareConstants.MESSENGER_PLATFORM_CONTENT, serializeGenericTemplateContent(shareMessengerGenericTemplateContent));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static void addOpenGraphMusicTemplateContent(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                addOpenGraphMusicTemplateContentForPreview(bundle, shareMessengerOpenGraphMusicTemplateContent);
                Utility.putJSONValueInBundle(bundle, ShareConstants.MESSENGER_PLATFORM_CONTENT, serializeOpenGraphMusicTemplateContent(shareMessengerOpenGraphMusicTemplateContent));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static void addMediaTemplateContent(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                addMediaTemplateContentForPreview(bundle, shareMessengerMediaTemplateContent);
                Utility.putJSONValueInBundle(bundle, ShareConstants.MESSENGER_PLATFORM_CONTENT, serializeMediaTemplateContent(shareMessengerMediaTemplateContent));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private static void addGenericTemplateElementForPreview(Bundle bundle, ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (shareMessengerGenericTemplateElement.getButton() != null) {
                    addActionButton(bundle, shareMessengerGenericTemplateElement.getButton(), false);
                } else if (shareMessengerGenericTemplateElement.getDefaultAction() != null) {
                    addActionButton(bundle, shareMessengerGenericTemplateElement.getDefaultAction(), true);
                }
                Utility.putUri(bundle, ShareConstants.IMAGE_URL, shareMessengerGenericTemplateElement.getImageUrl());
                Utility.putNonEmptyString(bundle, ShareConstants.PREVIEW_TYPE, PREVIEW_DEFAULT);
                Utility.putNonEmptyString(bundle, ShareConstants.TITLE, shareMessengerGenericTemplateElement.getTitle());
                Utility.putNonEmptyString(bundle, ShareConstants.SUBTITLE, shareMessengerGenericTemplateElement.getSubtitle());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private static void addOpenGraphMusicTemplateContentForPreview(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                addActionButton(bundle, shareMessengerOpenGraphMusicTemplateContent.getButton(), false);
                Utility.putNonEmptyString(bundle, ShareConstants.PREVIEW_TYPE, PREVIEW_OPEN_GRAPH);
                Utility.putUri(bundle, ShareConstants.OPEN_GRAPH_URL, shareMessengerOpenGraphMusicTemplateContent.getUrl());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private static void addMediaTemplateContentForPreview(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                addActionButton(bundle, shareMessengerMediaTemplateContent.getButton(), false);
                Utility.putNonEmptyString(bundle, ShareConstants.PREVIEW_TYPE, PREVIEW_DEFAULT);
                Utility.putNonEmptyString(bundle, ShareConstants.ATTACHMENT_ID, shareMessengerMediaTemplateContent.getAttachmentId());
                if (shareMessengerMediaTemplateContent.getMediaUrl() != null) {
                    Utility.putUri(bundle, getMediaUrlKey(shareMessengerMediaTemplateContent.getMediaUrl()), shareMessengerMediaTemplateContent.getMediaUrl());
                }
                Utility.putNonEmptyString(bundle, "type", getMediaType(shareMessengerMediaTemplateContent.getMediaType()));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private static void addActionButton(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls) && shareMessengerActionButton != null) {
            try {
                if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                    addURLActionButton(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private static void addURLActionButton(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String str;
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            if (z) {
                try {
                    str = Utility.getUriString(shareMessengerURLActionButton.getUrl());
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, cls);
                    return;
                }
            } else {
                str = shareMessengerURLActionButton.getTitle() + " - " + Utility.getUriString(shareMessengerURLActionButton.getUrl());
            }
            Utility.putNonEmptyString(bundle, ShareConstants.TARGET_DISPLAY, str);
            Utility.putUri(bundle, ShareConstants.ITEM_URL, shareMessengerURLActionButton.getUrl());
        }
    }

    private static JSONObject serializeGenericTemplateContent(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return new JSONObject().put(ATTACHMENT, new JSONObject().put("type", "template").put("payload", new JSONObject().put(TEMPLATE_TYPE, TEMPLATE_GENERIC_TYPE).put(SHARABLE, shareMessengerGenericTemplateContent.getIsSharable()).put(IMAGE_ASPECT_RATIO, getImageRatioString(shareMessengerGenericTemplateContent.getImageAspectRatio())).put(ELEMENTS, new JSONArray().put(serializeGenericTemplateElement(shareMessengerGenericTemplateContent.getGenericTemplateElement())))));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return new JSONObject().put(ATTACHMENT, new JSONObject().put("type", "template").put("payload", new JSONObject().put(TEMPLATE_TYPE, "open_graph").put(ELEMENTS, new JSONArray().put(serializeOpenGraphMusicTemplateElement(shareMessengerOpenGraphMusicTemplateContent)))));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeMediaTemplateContent(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return new JSONObject().put(ATTACHMENT, new JSONObject().put("type", "template").put("payload", new JSONObject().put(TEMPLATE_TYPE, "media").put(ELEMENTS, new JSONArray().put(serializeMediaTemplateElement(shareMessengerMediaTemplateContent)))));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeGenericTemplateElement(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("title", shareMessengerGenericTemplateElement.getTitle()).put(SUBTITLE, shareMessengerGenericTemplateElement.getSubtitle()).put("image_url", Utility.getUriString(shareMessengerGenericTemplateElement.getImageUrl()));
            if (shareMessengerGenericTemplateElement.getButton() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(serializeActionButton(shareMessengerGenericTemplateElement.getButton()));
                put.put("buttons", jSONArray);
            }
            if (shareMessengerGenericTemplateElement.getDefaultAction() != null) {
                put.put(DEFAULT_ACTION, serializeActionButton(shareMessengerGenericTemplateElement.getDefaultAction(), true));
            }
            return put;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeOpenGraphMusicTemplateElement(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("url", Utility.getUriString(shareMessengerOpenGraphMusicTemplateContent.getUrl()));
            if (shareMessengerOpenGraphMusicTemplateContent.getButton() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(serializeActionButton(shareMessengerOpenGraphMusicTemplateContent.getButton()));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeMediaTemplateElement(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put(ATTACHMENT_ID, shareMessengerMediaTemplateContent.getAttachmentId()).put("url", Utility.getUriString(shareMessengerMediaTemplateContent.getMediaUrl())).put(MEDIA_TYPE, getMediaType(shareMessengerMediaTemplateContent.getMediaType()));
            if (shareMessengerMediaTemplateContent.getButton() != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(serializeActionButton(shareMessengerMediaTemplateContent.getButton()));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeActionButton(ShareMessengerActionButton shareMessengerActionButton) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return serializeActionButton(shareMessengerActionButton, false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeActionButton(ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                return serializeURLActionButton((ShareMessengerURLActionButton) shareMessengerActionButton, z);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static JSONObject serializeURLActionButton(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String str;
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("type", BUTTON_URL_TYPE);
            if (z) {
                str = null;
            } else {
                str = shareMessengerURLActionButton.getTitle();
            }
            return put.put("title", str).put("url", Utility.getUriString(shareMessengerURLActionButton.getUrl())).put(WEBVIEW_RATIO, getWebviewHeightRatioString(shareMessengerURLActionButton.getWebviewHeightRatio())).put(MESSENGER_EXTENSIONS, shareMessengerURLActionButton.getIsMessengerExtensionURL()).put(FALLBACK_URL, Utility.getUriString(shareMessengerURLActionButton.getFallbackUrl())).put(WEBVIEW_SHARE_BUTTON, getShouldHideShareButton(shareMessengerURLActionButton));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static String getMediaUrlKey(Uri uri) {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            String host = uri.getHost();
            return (Utility.isNullOrEmpty(host) || !FACEBOOK_DOMAIN.matcher(host).matches()) ? ShareConstants.IMAGE_URL : "uri";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static String getWebviewHeightRatioString(ShareMessengerURLActionButton.WebviewHeightRatio webviewHeightRatio) {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        if (webviewHeightRatio == null) {
            return WEBVIEW_RATIO_FULL;
        }
        try {
            int i = C22431.f5282x92e77847[webviewHeightRatio.ordinal()];
            if (i != 1) {
                return i != 2 ? WEBVIEW_RATIO_FULL : WEBVIEW_RATIO_TALL;
            }
            return WEBVIEW_RATIO_COMPACT;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static String getImageRatioString(ShareMessengerGenericTemplateContent.ImageAspectRatio imageAspectRatio) {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        if (imageAspectRatio == null) {
            return IMAGE_RATIO_HORIZONTAL;
        }
        try {
            return C22431.f5280xb7309c05[imageAspectRatio.ordinal()] != 1 ? IMAGE_RATIO_HORIZONTAL : IMAGE_RATIO_SQUARE;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* renamed from: com.facebook.share.internal.MessengerShareContentUtility$1 */
    static /* synthetic */ class C22431 {

        /* renamed from: $SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio */
        static final /* synthetic */ int[] f5280xb7309c05;

        /* renamed from: $SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType */
        static final /* synthetic */ int[] f5281x2a75e664;

        /* renamed from: $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio */
        static final /* synthetic */ int[] f5282x92e77847;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|5|6|7|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        static {
            /*
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType[] r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5281x2a75e664 = r0
                r1 = 1
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType r2 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio[] r0 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5280xb7309c05 = r0
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio r2 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.SQUARE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio[] r0 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5282x92e77847 = r0
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r2 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioCompact     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                int[] r0 = f5282x92e77847     // Catch:{ NoSuchFieldError -> 0x003f }
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioTall     // Catch:{ NoSuchFieldError -> 0x003f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.MessengerShareContentUtility.C22431.<clinit>():void");
        }
    }

    private static String getMediaType(ShareMessengerMediaTemplateContent.MediaType mediaType) {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        if (mediaType == null) {
            return "image";
        }
        try {
            return C22431.f5281x2a75e664[mediaType.ordinal()] != 1 ? "image" : "video";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private static String getShouldHideShareButton(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        Class<MessengerShareContentUtility> cls = MessengerShareContentUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            if (shareMessengerURLActionButton.getShouldHideWebviewShareButton()) {
                return SHARE_BUTTON_HIDE;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }
}
