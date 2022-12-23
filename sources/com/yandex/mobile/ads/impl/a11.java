package com.yandex.mobile.ads.impl;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;

class a11 {
    a11() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Intent mo65650a(z01 z01) {
        String c = z01.mo71142c();
        String b = z01.mo71141b();
        Map<String, Object> a = z01.mo71140a();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(c));
        intent.addFlags(1342177280);
        intent.setPackage(b);
        if (a != null) {
            for (Map.Entry next : a.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(str, (Boolean) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(str, (Integer) value);
                } else if (value instanceof String) {
                    intent.putExtra(str, (String) value);
                }
            }
        }
        return intent;
    }
}
