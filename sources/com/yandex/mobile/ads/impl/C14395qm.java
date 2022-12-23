package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.yandex.mobile.ads.impl.C14287pm;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.qm */
public class C14395qm {

    /* renamed from: com.yandex.mobile.ads.impl.qm$a */
    public static final class C14396a extends AccessibilityDelegateCompat {

        /* renamed from: a */
        final /* synthetic */ C14395qm f39180a;

        /* renamed from: b */
        final /* synthetic */ C14287pm.C14295f f39181b;

        C14396a(C14395qm qmVar, C14287pm.C14295f fVar) {
            this.f39180a = qmVar;
            this.f39181b = fVar;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (accessibilityNodeInfoCompat != null) {
                C14395qm qmVar = this.f39180a;
                C14287pm.C14295f fVar = this.f39181b;
                qmVar.getClass();
                String str = "android.widget.TextView";
                switch (fVar.ordinal()) {
                    case 1:
                        str = "android.widget.Button";
                        break;
                    case 2:
                        str = "android.widget.ImageView";
                        break;
                    case 3:
                    case 5:
                        break;
                    case 4:
                        str = "android.widget.EditText";
                        break;
                    case 6:
                        str = "android.widget.TabWidget";
                        break;
                    default:
                        str = "";
                        break;
                }
                accessibilityNodeInfoCompat.setClassName(str);
                if (C14287pm.C14295f.HEADER == fVar) {
                    accessibilityNodeInfoCompat.setHeading(true);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo69622a(View view, C14287pm.C14295f fVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(fVar, "type");
        ViewCompat.setAccessibilityDelegate(view, new C14396a(this, fVar));
    }
}
