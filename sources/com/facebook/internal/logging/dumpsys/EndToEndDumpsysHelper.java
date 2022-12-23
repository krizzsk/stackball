package com.facebook.internal.logging.dumpsys;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.logging.dumpsys.AndroidRootResolver;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002JB\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo72093d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "", "()V", "lithoViewToStringMethod", "Ljava/lang/reflect/Method;", "rootResolver", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "webViewDumpHelper", "Lcom/facebook/internal/logging/dumpsys/WebViewDumpHelper;", "dumpViewHierarchy", "", "prefix", "", "writer", "Ljava/io/PrintWriter;", "view", "Landroid/view/View;", "leftOffset", "", "topOffset", "withWebView", "", "withProps", "args", "", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "writeLithoViewSubHierarchy", "Api21Utils", "Api24Utils", "Companion", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: EndToEndDumpsysHelper.kt */
public final class EndToEndDumpsysHelper {
    private static final String ALL_ROOTS_ARGUMENT = "all-roots";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String E2E_ARGUMENT = "e2e";
    private static final String LITHO_VIEW_CLASS = "com.facebook.litho.LithoView";
    private static final String LITHO_VIEW_TEST_HELPER_CLASS = "com.facebook.litho.LithoViewTestHelper";
    private static final String LITHO_VIEW_TO_STRING_METHOD = "viewToStringForE2E";
    private static final String RC_TEXT_VIEW_SIMPLE_CLASS_NAME = "RCTextView";
    private static final String TOP_ROOT_ARGUMENT = "top-root";
    private static final String WITH_PROPS_ARGUMENT = "props";
    private static final String WITH_WEBVIEW_ARGUMENT = "webview";
    /* access modifiers changed from: private */
    public static EndToEndDumpsysHelper instance;
    /* access modifiers changed from: private */
    public static Method rcTextViewGetTextMethod;
    private Method lithoViewToStringMethod;
    private final AndroidRootResolver rootResolver = new AndroidRootResolver();
    private final WebViewDumpHelper webViewDumpHelper = new WebViewDumpHelper();

    @JvmStatic
    public static final boolean maybeDump(String str, PrintWriter printWriter, String[] strArr) {
        return Companion.maybeDump(str, printWriter, strArr);
    }

    /* access modifiers changed from: private */
    public final void dumpViewHierarchy(String str, PrintWriter printWriter, String[] strArr) {
        View view;
        String str2 = str;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        printWriter2.print(str2);
        printWriter2.println("Top Level Window View Hierarchy:");
        boolean access$hasArgument = Companion.hasArgument(strArr2, ALL_ROOTS_ARGUMENT);
        boolean access$hasArgument2 = Companion.hasArgument(strArr2, TOP_ROOT_ARGUMENT);
        boolean access$hasArgument3 = Companion.hasArgument(strArr2, WITH_WEBVIEW_ARGUMENT);
        boolean access$hasArgument4 = Companion.hasArgument(strArr2, WITH_PROPS_ARGUMENT);
        try {
            List<AndroidRootResolver.Root> listActiveRoots = this.rootResolver.listActiveRoots();
            if (listActiveRoots == null) {
                return;
            }
            if (!listActiveRoots.isEmpty()) {
                Collections.reverse(listActiveRoots);
                WindowManager.LayoutParams layoutParams = null;
                Iterator<AndroidRootResolver.Root> it = listActiveRoots.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AndroidRootResolver.Root next = it.next();
                        if (!(next == null || (view = next.getView()) == null)) {
                            if (view.getVisibility() == 0) {
                                if (!access$hasArgument && layoutParams != null && Math.abs(next.getParam().type - layoutParams.type) != 1) {
                                    break;
                                }
                                dumpViewHierarchy(str2 + "  ", printWriter, next.getView(), 0, 0, access$hasArgument3, access$hasArgument4);
                                WindowManager.LayoutParams param = next.getParam();
                                if (access$hasArgument2) {
                                    break;
                                }
                                layoutParams = param;
                            }
                        }
                    } else {
                        break;
                    }
                }
                this.webViewDumpHelper.dump(printWriter2);
            }
        } catch (Exception e) {
            printWriter2.println("Failure in view hierarchy dump: " + e.getMessage());
        }
    }

    private final void dumpViewHierarchy(String str, PrintWriter printWriter, View view, int i, int i2, boolean z, boolean z2) {
        ViewGroup viewGroup;
        int childCount;
        String str2 = str;
        PrintWriter printWriter2 = printWriter;
        View view2 = view;
        boolean z3 = z2;
        printWriter2.print(str2);
        if (view2 == null) {
            printWriter2.println("null");
            return;
        }
        printWriter2.print(view.getClass().getName());
        printWriter2.print("{");
        printWriter2.print(Integer.toHexString(view.hashCode()));
        Companion.writeViewFlags(printWriter2, view2);
        Companion.writeViewBounds(printWriter2, view2, i, i2);
        Companion.writeViewTestId(printWriter2, view2);
        Companion.writeViewText(printWriter2, view2);
        if (z3 && Build.VERSION.SDK_INT >= 21) {
            Api21Utils.INSTANCE.writeExtraProps(printWriter2, view2);
        }
        printWriter2.println("}");
        if (Companion.isExtendsLithoView(view2)) {
            writeLithoViewSubHierarchy(printWriter2, view2, str2, z3);
        }
        if (z && (view2 instanceof WebView)) {
            this.webViewDumpHelper.handle((WebView) view2);
        }
        if ((view2 instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
            String str3 = str2 + "  ";
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            for (int i3 = 0; i3 < childCount; i3++) {
                dumpViewHierarchy(str3, printWriter, (viewGroup = (ViewGroup) view2).getChildAt(i3), iArr[0], iArr[1], z, z2);
            }
        }
    }

    private final void writeLithoViewSubHierarchy(PrintWriter printWriter, View view, String str, boolean z) {
        try {
            if (this.lithoViewToStringMethod == null) {
                Class<?> cls = Class.forName(LITHO_VIEW_TEST_HELPER_CLASS);
                Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(LITHO_VIEW_TEST_HELPER_CLASS)");
                this.lithoViewToStringMethod = cls.getDeclaredMethod(LITHO_VIEW_TO_STRING_METHOD, new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            }
            Method method = this.lithoViewToStringMethod;
            Object obj = null;
            if (method != null) {
                obj = method.invoke((Object) null, new Object[]{view, Integer.valueOf((str.length() / 2) + 1), Boolean.valueOf(z)});
            }
            if (obj != null) {
                Intrinsics.checkNotNullExpressionValue(printWriter.append((String) obj), "writer.append(lithoViewDump)");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            printWriter.append(str).append("Failed litho view sub hierarch dump: ").append(Companion.fixString(e.getMessage(), 100)).println();
        }
    }

    @Metadata(mo72092d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo72093d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Api21Utils;", "", "()V", "keyedTagsField", "Ljava/lang/reflect/Field;", "getTags", "Lorg/json/JSONObject;", "view", "Landroid/view/View;", "writeExtraProps", "", "writer", "Ljava/io/PrintWriter;", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: EndToEndDumpsysHelper.kt */
    private static final class Api21Utils {
        public static final Api21Utils INSTANCE = new Api21Utils();
        private static Field keyedTagsField;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                keyedTagsField = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (NoSuchFieldException unused) {
            }
        }

        private Api21Utils() {
        }

        public final void writeExtraProps(PrintWriter printWriter, View view) {
            AccessibilityNodeInfo access$createNodeInfoFromView;
            Intrinsics.checkNotNullParameter(printWriter, "writer");
            Intrinsics.checkNotNullParameter(view, "view");
            if (Build.VERSION.SDK_INT >= 21 && (access$createNodeInfoFromView = EndToEndDumpsysHelper.Companion.createNodeInfoFromView(view)) != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (view instanceof TextView) {
                        ColorStateList textColors = ((TextView) view).getTextColors();
                        Intrinsics.checkNotNullExpressionValue(textColors, "view.textColors");
                        jSONObject.put("textColor", textColors.getDefaultColor());
                        jSONObject.put("textSize", (double) ((TextView) view).getTextSize());
                        jSONObject.put(ViewHierarchyConstants.HINT_KEY, EndToEndDumpsysHelper.Companion.fixString(((TextView) view).getHint(), 100));
                    }
                    JSONObject tags = getTags(view);
                    if (tags != null) {
                        jSONObject.put("keyedTags", tags);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (AccessibilityNodeInfo.AccessibilityAction next : access$createNodeInfoFromView.getActionList()) {
                        Intrinsics.checkNotNullExpressionValue(next, "action");
                        CharSequence label = next.getLabel();
                        if (label != null) {
                            String str = (String) label;
                            if (str != null) {
                                jSONArray.put(EndToEndDumpsysHelper.Companion.fixString(str, 50));
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("actions", jSONArray);
                    }
                    String access$fixString = EndToEndDumpsysHelper.Companion.fixString(access$createNodeInfoFromView.getContentDescription(), 50);
                    if (access$fixString != null) {
                        if (access$fixString.length() > 0) {
                            jSONObject.put("content-description", access$fixString);
                        }
                    }
                    jSONObject.put("accessibility-focused", access$createNodeInfoFromView.isAccessibilityFocused()).put("checkable", access$createNodeInfoFromView.isCheckable()).put("checked", access$createNodeInfoFromView.isChecked()).put("class-name", EndToEndDumpsysHelper.Companion.fixString(access$createNodeInfoFromView.getClassName(), 50)).put(TJAdUnitConstants.String.CLICKABLE, access$createNodeInfoFromView.isClickable()).put("content-invalid", access$createNodeInfoFromView.isContentInvalid()).put("dismissable", access$createNodeInfoFromView.isDismissable()).put("editable", access$createNodeInfoFromView.isEditable()).put(TJAdUnitConstants.String.ENABLED, access$createNodeInfoFromView.isEnabled()).put("focusable", access$createNodeInfoFromView.isFocusable()).put("focused", access$createNodeInfoFromView.isFocused()).put("long-clickable", access$createNodeInfoFromView.isLongClickable()).put("multiline", access$createNodeInfoFromView.isMultiLine()).put("password", access$createNodeInfoFromView.isPassword()).put("scrollable", access$createNodeInfoFromView.isScrollable()).put("selected", access$createNodeInfoFromView.isSelected()).put("visible-to-user", access$createNodeInfoFromView.isVisibleToUser());
                    if (Build.VERSION.SDK_INT >= 24) {
                        Api24Utils.INSTANCE.addExtraProps(jSONObject, access$createNodeInfoFromView);
                    }
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", EndToEndDumpsysHelper.Companion.fixString(e.getMessage(), 50));
                    } catch (JSONException unused) {
                    }
                }
                printWriter.append(" props=\"").append(jSONObject.toString()).append("\"");
            }
        }

        private final JSONObject getTags(View view) {
            Object obj = null;
            JSONObject jSONObject = null;
            try {
                if (keyedTagsField == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    keyedTagsField = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
                Field field = keyedTagsField;
                if (field != null) {
                    obj = field.get(view);
                }
                if (obj != null) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray == null || sparseArray.size() <= 0) {
                        return jSONObject;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                jSONObject2.put(ResourcesUtil.getIdStringQuietly(view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                            } catch (JSONException unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    return jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
            } catch (Exception unused3) {
                return jSONObject;
            }
        }
    }

    @Metadata(mo72092d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo72093d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Api24Utils;", "", "()V", "addExtraProps", "", "props", "Lorg/json/JSONObject;", "nodeInfo", "Landroid/view/accessibility/AccessibilityNodeInfo;", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: EndToEndDumpsysHelper.kt */
    private static final class Api24Utils {
        public static final Api24Utils INSTANCE = new Api24Utils();

        private Api24Utils() {
        }

        public final void addExtraProps(JSONObject jSONObject, AccessibilityNodeInfo accessibilityNodeInfo) throws JSONException {
            Intrinsics.checkNotNullParameter(jSONObject, EndToEndDumpsysHelper.WITH_PROPS_ARGUMENT);
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "nodeInfo");
            if (Build.VERSION.SDK_INT >= 24) {
                jSONObject.put("context-clickable", accessibilityNodeInfo.isContextClickable()).put("drawing-order", accessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", accessibilityNodeInfo.isImportantForAccessibility());
            }
        }
    }

    @Metadata(mo72092d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J%\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J-\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002J\u0018\u0010,\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010-\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010.\u001a\u00020(2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, mo72093d2 = {"Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper$Companion;", "", "()V", "ALL_ROOTS_ARGUMENT", "", "E2E_ARGUMENT", "LITHO_VIEW_CLASS", "LITHO_VIEW_TEST_HELPER_CLASS", "LITHO_VIEW_TO_STRING_METHOD", "RC_TEXT_VIEW_SIMPLE_CLASS_NAME", "TOP_ROOT_ARGUMENT", "WITH_PROPS_ARGUMENT", "WITH_WEBVIEW_ARGUMENT", "instance", "Lcom/facebook/internal/logging/dumpsys/EndToEndDumpsysHelper;", "rcTextViewGetTextMethod", "Ljava/lang/reflect/Method;", "createNodeInfoFromView", "Landroid/view/accessibility/AccessibilityNodeInfo;", "view", "Landroid/view/View;", "fixString", "str", "", "maxLength", "", "getTextFromRcTextView", "hasArgument", "", "args", "", "argument", "([Ljava/lang/String;Ljava/lang/String;)Z", "isExtendsLithoView", "maybeDump", "prefix", "writer", "Ljava/io/PrintWriter;", "(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)Z", "maybeWriteViewTestIdFromTag", "", "writeViewBounds", "leftOffset", "topOffset", "writeViewFlags", "writeViewTestId", "writeViewText", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: EndToEndDumpsysHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean maybeDump(String str, PrintWriter printWriter, String[] strArr) {
            Intrinsics.checkNotNullParameter(str, "prefix");
            Intrinsics.checkNotNullParameter(printWriter, "writer");
            if (strArr != null) {
                if ((!(strArr.length == 0)) && Intrinsics.areEqual((Object) "e2e", (Object) strArr[0])) {
                    if (EndToEndDumpsysHelper.instance == null) {
                        EndToEndDumpsysHelper.instance = new EndToEndDumpsysHelper();
                    }
                    EndToEndDumpsysHelper access$getInstance$cp = EndToEndDumpsysHelper.instance;
                    if (access$getInstance$cp != null) {
                        access$getInstance$cp.dumpViewHierarchy(str, printWriter, strArr);
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean isExtendsLithoView(View view) {
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (Intrinsics.areEqual((Object) cls.getName(), (Object) EndToEndDumpsysHelper.LITHO_VIEW_CLASS)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final void writeViewFlags(PrintWriter printWriter, View view) {
            printWriter.print(" ");
            int visibility = view.getVisibility();
            String str = ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            String str2 = ".";
            if (visibility == 0) {
                printWriter.print(str);
            } else if (visibility == 4) {
                printWriter.print("I");
            } else if (visibility != 8) {
                printWriter.print(str2);
            } else {
                printWriter.print("G");
            }
            String str3 = "F";
            printWriter.print(view.isFocusable() ? str3 : str2);
            printWriter.print(view.isEnabled() ? ExifInterface.LONGITUDE_EAST : str2);
            printWriter.print(str2);
            String str4 = "H";
            printWriter.print(view.isHorizontalScrollBarEnabled() ? str4 : str2);
            if (!view.isVerticalScrollBarEnabled()) {
                str = str2;
            }
            printWriter.print(str);
            printWriter.print(view.isClickable() ? "C" : str2);
            printWriter.print(view.isLongClickable() ? "L" : str2);
            printWriter.print(" ");
            if (!view.isFocused()) {
                str3 = str2;
            }
            printWriter.print(str3);
            printWriter.print(view.isSelected() ? ExifInterface.LATITUDE_SOUTH : str2);
            if (!view.isHovered()) {
                str4 = str2;
            }
            printWriter.print(str4);
            printWriter.print(view.isActivated() ? ExifInterface.GPS_MEASUREMENT_IN_PROGRESS : str2);
            if (view.isDirty()) {
                str2 = "D";
            }
            printWriter.print(str2);
        }

        /* access modifiers changed from: private */
        public final void writeViewBounds(PrintWriter printWriter, View view, int i, int i2) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            printWriter.print(" ");
            printWriter.print(iArr[0] - i);
            printWriter.print(",");
            printWriter.print(iArr[1] - i2);
            printWriter.print("-");
            printWriter.print((iArr[0] + view.getWidth()) - i);
            printWriter.print(",");
            printWriter.print((iArr[1] + view.getHeight()) - i2);
        }

        /* access modifiers changed from: private */
        public final void writeViewTestId(PrintWriter printWriter, View view) {
            String str;
            try {
                int id = view.getId();
                if (id == -1) {
                    maybeWriteViewTestIdFromTag(printWriter, view);
                    return;
                }
                printWriter.append(" #");
                printWriter.append(Integer.toHexString(id));
                Resources resources = view.getResources();
                if (id > 0) {
                    if (resources != null) {
                        int i = -16777216 & id;
                        if (i == 16777216) {
                            str = "android";
                        } else if (i != 2130706432) {
                            str = resources.getResourcePackageName(id);
                            Intrinsics.checkNotNullExpressionValue(str, "resources.getResourcePackageName(id)");
                        } else {
                            str = TapjoyConstants.TJC_APP_PLACEMENT;
                        }
                        printWriter.print(" ");
                        printWriter.print(str);
                        printWriter.print(CertificateUtil.DELIMITER);
                        printWriter.print(resources.getResourceTypeName(id));
                        printWriter.print("/");
                        printWriter.print(resources.getResourceEntryName(id));
                        return;
                    }
                }
                maybeWriteViewTestIdFromTag(printWriter, view);
            } catch (Exception unused) {
                maybeWriteViewTestIdFromTag(printWriter, view);
            }
        }

        private final void maybeWriteViewTestIdFromTag(PrintWriter printWriter, View view) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                tag = null;
            }
            String str = (String) tag;
            if (str != null) {
                CharSequence charSequence = str;
                if (!(charSequence.length() == 0)) {
                    printWriter.print(" app:tag/");
                    printWriter.print(fixString(charSequence, 60));
                }
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            if ((r0.length() == 0) != false) goto L_0x0048;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeViewText(java.io.PrintWriter r8, android.view.View r9) {
            /*
                r7 = this;
                r0 = 0
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00b3 }
                boolean r1 = r9 instanceof android.widget.TextView     // Catch:{ Exception -> 0x00b3 }
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0015
                android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ Exception -> 0x00b3 }
                java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x00b3 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b3 }
                goto L_0x008b
            L_0x0015:
                java.lang.Class r1 = r9.getClass()     // Catch:{ Exception -> 0x00b3 }
                java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x00b3 }
                java.lang.String r4 = "RCTextView"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ Exception -> 0x00b3 }
                if (r1 == 0) goto L_0x002e
                r0 = r7
                com.facebook.internal.logging.dumpsys.EndToEndDumpsysHelper$Companion r0 = (com.facebook.internal.logging.dumpsys.EndToEndDumpsysHelper.Companion) r0     // Catch:{ Exception -> 0x00b3 }
                java.lang.String r9 = r0.getTextFromRcTextView(r9)     // Catch:{ Exception -> 0x00b3 }
                goto L_0x008b
            L_0x002e:
                java.lang.CharSequence r1 = r9.getContentDescription()     // Catch:{ Exception -> 0x00b3 }
                if (r1 == 0) goto L_0x0038
                java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00b3 }
            L_0x0038:
                if (r0 == 0) goto L_0x0048
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x00b3 }
                int r1 = r1.length()     // Catch:{ Exception -> 0x00b3 }
                if (r1 != 0) goto L_0x0045
                r1 = 1
                goto L_0x0046
            L_0x0045:
                r1 = 0
            L_0x0046:
                if (r1 == 0) goto L_0x008a
            L_0x0048:
                java.lang.Object r9 = r9.getTag()     // Catch:{ Exception -> 0x00b3 }
                if (r9 == 0) goto L_0x008a
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b3 }
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x00b3 }
                int r0 = r9.length()     // Catch:{ Exception -> 0x00b3 }
                int r0 = r0 - r3
                r1 = 0
                r4 = 0
            L_0x005b:
                if (r1 > r0) goto L_0x0080
                if (r4 != 0) goto L_0x0061
                r5 = r1
                goto L_0x0062
            L_0x0061:
                r5 = r0
            L_0x0062:
                char r5 = r9.charAt(r5)     // Catch:{ Exception -> 0x00b3 }
                r6 = 32
                int r5 = kotlin.jvm.internal.Intrinsics.compare((int) r5, (int) r6)     // Catch:{ Exception -> 0x00b3 }
                if (r5 > 0) goto L_0x0070
                r5 = 1
                goto L_0x0071
            L_0x0070:
                r5 = 0
            L_0x0071:
                if (r4 != 0) goto L_0x007a
                if (r5 != 0) goto L_0x0077
                r4 = 1
                goto L_0x005b
            L_0x0077:
                int r1 = r1 + 1
                goto L_0x005b
            L_0x007a:
                if (r5 != 0) goto L_0x007d
                goto L_0x0080
            L_0x007d:
                int r0 = r0 + -1
                goto L_0x005b
            L_0x0080:
                int r0 = r0 + r3
                java.lang.CharSequence r9 = r9.subSequence(r1, r0)     // Catch:{ Exception -> 0x00b3 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b3 }
                goto L_0x008b
            L_0x008a:
                r9 = r0
            L_0x008b:
                if (r9 == 0) goto L_0x00b3
                r0 = r9
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x00b3 }
                int r0 = r0.length()     // Catch:{ Exception -> 0x00b3 }
                if (r0 != 0) goto L_0x0097
                r2 = 1
            L_0x0097:
                if (r2 == 0) goto L_0x009a
                goto L_0x00b3
            L_0x009a:
                java.lang.String r0 = " text=\""
                r8.print(r0)     // Catch:{ Exception -> 0x00b3 }
                r0 = r7
                com.facebook.internal.logging.dumpsys.EndToEndDumpsysHelper$Companion r0 = (com.facebook.internal.logging.dumpsys.EndToEndDumpsysHelper.Companion) r0     // Catch:{ Exception -> 0x00b3 }
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x00b3 }
                r1 = 600(0x258, float:8.41E-43)
                java.lang.String r9 = r0.fixString(r9, r1)     // Catch:{ Exception -> 0x00b3 }
                r8.print(r9)     // Catch:{ Exception -> 0x00b3 }
                java.lang.String r9 = "\""
                r8.print(r9)     // Catch:{ Exception -> 0x00b3 }
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.logging.dumpsys.EndToEndDumpsysHelper.Companion.writeViewText(java.io.PrintWriter, android.view.View):void");
        }

        private final String getTextFromRcTextView(View view) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
            if (EndToEndDumpsysHelper.rcTextViewGetTextMethod == null) {
                EndToEndDumpsysHelper.rcTextViewGetTextMethod = view.getClass().getDeclaredMethod("getText", new Class[0]);
            }
            Method access$getRcTextViewGetTextMethod$cp = EndToEndDumpsysHelper.rcTextViewGetTextMethod;
            Object invoke = access$getRcTextViewGetTextMethod$cp != null ? access$getRcTextViewGetTextMethod$cp.invoke(view, new Object[0]) : null;
            if (invoke != null) {
                return invoke.toString();
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final String fixString(CharSequence charSequence, int i) {
            int i2 = i;
            if (charSequence == null) {
                return "";
            }
            if (charSequence.length() == 0) {
                return "";
            }
            String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(charSequence.toString(), " \n", " ", false, 4, (Object) null), "\n", " ", false, 4, (Object) null), "\"", "", false, 4, (Object) null);
            if (charSequence.length() <= i2) {
                return replace$default;
            }
            StringBuilder sb = new StringBuilder();
            if (replace$default != null) {
                String substring = replace$default.substring(0, i2);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append("...");
                return sb.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* access modifiers changed from: private */
        public final boolean hasArgument(String[] strArr, String str) {
            if (strArr == null) {
                return false;
            }
            for (String equals : strArr) {
                if (StringsKt.equals(str, equals, true)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final AccessibilityNodeInfo createNodeInfoFromView(View view) {
            if (view == null) {
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            try {
                view.onInitializeAccessibilityNodeInfo(obtain);
                return obtain;
            } catch (NullPointerException unused) {
                if (obtain != null) {
                    obtain.recycle();
                }
                return null;
            }
        }
    }
}
