package com.yandex.mobile.ads.impl;

import java.util.Locale;

public final class eq1 {

    /* renamed from: a */
    public static final String f33044a;

    /* renamed from: b */
    static final String f33045b;

    static {
        m35715a("onCollapse", "config", "AdPerformActionsJSI");
        m35715a("onExpand", "config", "AdPerformActionsJSI");
        Locale locale = Locale.US;
        f33045b = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", new Object[]{"getBannerInfo", "AdPerformActionsJSI"});
        f33044a = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"});
    }

    /* renamed from: a */
    private static String m35715a(String str, String str2, String str3) {
        return String.format(Locale.US, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%2$s) { \n      %3$s.%1$s(JSON.stringify(%2$s)); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", new Object[]{str, str2, str3}).replace("JSON.stringify()", "");
    }
}
