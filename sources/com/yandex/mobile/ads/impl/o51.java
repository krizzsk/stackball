package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class o51 {

    /* renamed from: a */
    private final DecimalFormat f38094a;

    public o51() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f38094a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    /* renamed from: a */
    public String mo69119a(String str) throws xr0 {
        try {
            return this.f38094a.format(Long.valueOf(!TextUtils.isEmpty(str) ? str.replaceAll(" ", "") : str));
        } catch (NumberFormatException unused) {
            String.format("Could not parse review count value. Review Count value is %s", new Object[]{str});
            throw new xr0("Native Ad json has not required attributes");
        }
    }
}
