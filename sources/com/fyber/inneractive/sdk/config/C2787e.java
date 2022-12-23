package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.config.e */
public final class C2787e {
    /* renamed from: a */
    static void m6072a(Context context, HashSet<String> hashSet) {
        List<InputMethodInfo> list;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        try {
            list = inputMethodManager.getEnabledInputMethodList();
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null) {
            int i = 0;
            for (InputMethodInfo enabledInputMethodSubtypeList : list) {
                for (InputMethodSubtype next : inputMethodManager.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                    if (next.getMode().equals("keyboard") && i < 10) {
                        String locale = next.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            try {
                                String replace = locale.replace("_", "-");
                                hashSet.add(replace);
                                IAlog.m9034b("Available input language: %s", replace);
                                i++;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static String m6071a() {
        try {
            String language = Locale.getDefault().getLanguage();
            try {
                IAlog.m9034b("Available device language: %s", language);
                return language;
            } catch (Exception unused) {
                return language;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
