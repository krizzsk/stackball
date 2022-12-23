package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.inmobi.media.hj */
/* compiled from: PublisherProvidedUserInfoDao */
public final class C5348hj {

    /* renamed from: a */
    private static int f12248a = Integer.MIN_VALUE;

    /* renamed from: b */
    private static String f12249b = null;

    /* renamed from: c */
    private static String f12250c = null;

    /* renamed from: d */
    private static String f12251d = null;

    /* renamed from: e */
    private static String f12252e = null;

    /* renamed from: f */
    private static String f12253f = null;

    /* renamed from: g */
    private static String f12254g = null;

    /* renamed from: h */
    private static int f12255h = Integer.MIN_VALUE;

    /* renamed from: i */
    private static String f12256i;

    /* renamed from: j */
    private static String f12257j;

    /* renamed from: k */
    private static String f12258k;

    /* renamed from: l */
    private static String f12259l;

    /* renamed from: m */
    private static Location f12260m;

    /* renamed from: a */
    public static void m12353a() {
        m12354a(f12248a);
        m12356a(f12249b);
        m12360b(f12250c);
        m12362c(f12251d);
        m12363d(f12252e);
        m12364e(f12253f);
        m12365f(f12254g);
        m12359b(f12255h);
        m12366g(f12256i);
        m12367h(f12257j);
        m12368i(f12258k);
        m12369j(f12259l);
        m12355a(f12260m);
    }

    /* renamed from: a */
    public static void m12354a(int i) {
        Context c = C5314go.m12203c();
        if (c == null || i == Integer.MIN_VALUE) {
            f12248a = i;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40643a("user_age", i);
        }
    }

    /* renamed from: a */
    public static void m12356a(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12249b = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_age_group", str);
        }
    }

    /* renamed from: b */
    public static void m12360b(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12250c = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_area_code", str);
        }
    }

    /* renamed from: c */
    public static void m12362c(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12251d = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_post_code", str);
        }
    }

    /* renamed from: d */
    public static void m12363d(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12252e = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_city_code", str);
        }
    }

    /* renamed from: e */
    public static void m12364e(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12253f = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_state_code", str);
        }
    }

    /* renamed from: f */
    public static void m12365f(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12254g = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_country_code", str);
        }
    }

    /* renamed from: b */
    public static void m12359b(int i) {
        Context c = C5314go.m12203c();
        if (c == null || i == Integer.MIN_VALUE) {
            f12255h = i;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40643a("user_yob", i);
        }
    }

    /* renamed from: g */
    public static void m12366g(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12256i = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_gender", str);
        }
    }

    /* renamed from: h */
    public static void m12367h(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12257j = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_education", str);
        }
    }

    /* renamed from: i */
    public static void m12368i(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12258k = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_language", str);
        }
    }

    /* renamed from: j */
    public static void m12369j(String str) {
        Context c = C5314go.m12203c();
        if (c == null || str == null) {
            f12259l = str;
        } else {
            C5307gj.m12157a(c, "user_info_store").mo40645a("user_interest", str);
        }
    }

    /* renamed from: b */
    public static Location m12357b() {
        String b;
        Location location = f12260m;
        if (location != null) {
            return location;
        }
        Context c = C5314go.m12203c();
        if (c == null || (b = C5307gj.m12157a(c, "user_info_store").mo40648b("user_location")) == null) {
            return null;
        }
        Location location2 = new Location("");
        try {
            String[] split = b.split(",");
            location2.setLatitude(Double.parseDouble(split[0]));
            location2.setLongitude(Double.parseDouble(split[1]));
            location2.setAccuracy(Float.parseFloat(split[2]));
            location2.setTime(Long.parseLong(split[3]));
            return location2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m12355a(Location location) {
        Context c = C5314go.m12203c();
        if (c == null || location == null) {
            f12260m = location;
            return;
        }
        C5307gj.m12157a(c, "user_info_store").mo40645a("user_location", m12358b(location));
    }

    /* renamed from: c */
    public static HashMap<String, String> m12361c() {
        HashMap<String, String> hashMap = new HashMap<>();
        int i = f12248a;
        int i2 = Integer.MIN_VALUE;
        if (i == Integer.MIN_VALUE) {
            Context c = C5314go.m12203c();
            if (c == null) {
                i = Integer.MIN_VALUE;
            } else {
                i = C5307gj.m12157a(c, "user_info_store").mo40650c("user_age");
            }
        }
        if (i > 0) {
            hashMap.put("u-age", String.valueOf(i));
        }
        int i3 = f12255h;
        if (i3 != Integer.MIN_VALUE) {
            i2 = i3;
        } else {
            Context c2 = C5314go.m12203c();
            if (c2 != null) {
                i2 = C5307gj.m12157a(c2, "user_info_store").mo40650c("user_yob");
            }
        }
        if (i2 > 0) {
            hashMap.put("u-yearofbirth", String.valueOf(i2));
        }
        String str = f12252e;
        String str2 = null;
        if (str == null) {
            Context c3 = C5314go.m12203c();
            if (c3 == null) {
                str = null;
            } else {
                str = C5307gj.m12157a(c3, "user_info_store").mo40648b("user_city_code");
            }
        }
        String str3 = f12253f;
        if (str3 == null) {
            Context c4 = C5314go.m12203c();
            if (c4 == null) {
                str3 = null;
            } else {
                str3 = C5307gj.m12157a(c4, "user_info_store").mo40648b("user_state_code");
            }
        }
        String str4 = f12254g;
        if (str4 == null) {
            Context c5 = C5314go.m12203c();
            if (c5 == null) {
                str4 = null;
            } else {
                str4 = C5307gj.m12157a(c5, "user_info_store").mo40648b("user_country_code");
            }
        }
        String trim = (str == null || str.trim().length() == 0) ? "" : str.trim();
        if (!(str3 == null || str3.trim().length() == 0)) {
            trim = trim + "-" + str3.trim();
        }
        if (!(str4 == null || str4.trim().length() == 0)) {
            trim = trim + "-" + str4.trim();
        }
        if (!(trim == null || trim.trim().length() == 0)) {
            hashMap.put("u-location", trim);
        }
        String str5 = f12249b;
        if (str5 == null) {
            Context c6 = C5314go.m12203c();
            if (c6 == null) {
                str5 = null;
            } else {
                str5 = C5307gj.m12157a(c6, "user_info_store").mo40648b("user_age_group");
            }
        }
        if (str5 != null) {
            hashMap.put("u-agegroup", str5.toLowerCase(Locale.ENGLISH));
        }
        String str6 = f12250c;
        if (str6 == null) {
            Context c7 = C5314go.m12203c();
            if (c7 == null) {
                str6 = null;
            } else {
                str6 = C5307gj.m12157a(c7, "user_info_store").mo40648b("user_area_code");
            }
        }
        if (str6 != null) {
            hashMap.put("u-areacode", str6);
        }
        String str7 = f12251d;
        if (str7 == null) {
            Context c8 = C5314go.m12203c();
            if (c8 == null) {
                str7 = null;
            } else {
                str7 = C5307gj.m12157a(c8, "user_info_store").mo40648b("user_post_code");
            }
        }
        if (str7 != null) {
            hashMap.put("u-postalcode", str7);
        }
        String str8 = f12256i;
        if (str8 == null) {
            Context c9 = C5314go.m12203c();
            if (c9 == null) {
                str8 = null;
            } else {
                str8 = C5307gj.m12157a(c9, "user_info_store").mo40648b("user_gender");
            }
        }
        if (str8 != null) {
            hashMap.put("u-gender", str8);
        }
        String str9 = f12257j;
        if (str9 == null) {
            Context c10 = C5314go.m12203c();
            if (c10 == null) {
                str9 = null;
            } else {
                str9 = C5307gj.m12157a(c10, "user_info_store").mo40648b("user_education");
            }
        }
        if (str9 != null) {
            hashMap.put("u-education", str9);
        }
        String str10 = f12258k;
        if (str10 == null) {
            Context c11 = C5314go.m12203c();
            if (c11 == null) {
                str10 = null;
            } else {
                str10 = C5307gj.m12157a(c11, "user_info_store").mo40648b("user_language");
            }
        }
        if (str10 != null) {
            hashMap.put("u-language", str10);
        }
        String str11 = f12259l;
        if (str11 != null) {
            str2 = str11;
        } else {
            Context c12 = C5314go.m12203c();
            if (c12 != null) {
                str2 = C5307gj.m12157a(c12, "user_info_store").mo40648b("user_interest");
            }
        }
        if (str2 != null) {
            hashMap.put("u-interests", str2);
        }
        return hashMap;
    }

    /* renamed from: b */
    private static String m12358b(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }
}
