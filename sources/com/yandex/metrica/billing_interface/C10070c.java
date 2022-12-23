package com.yandex.metrica.billing_interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.billing_interface.c */
public class C10070c {

    /* renamed from: c */
    private static final Pattern f24208c = Pattern.compile("P(\\d+)(\\S+)");

    /* renamed from: a */
    public final int f24209a;

    /* renamed from: b */
    public final C10071a f24210b;

    /* renamed from: com.yandex.metrica.billing_interface.c$a */
    public enum C10071a {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public C10070c(int i, C10071a aVar) {
        this.f24209a = i;
        this.f24210b = aVar;
    }

    /* renamed from: a */
    public static C10070c m25940a(String str) {
        C10071a aVar;
        Matcher matcher = f24208c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        if (group == null || group2 == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(group);
            char charAt = group2.charAt(0);
            if (charAt == 'D') {
                aVar = C10071a.DAY;
            } else if (charAt == 'M') {
                aVar = C10071a.MONTH;
            } else if (charAt == 'W') {
                aVar = C10071a.WEEK;
            } else if (charAt != 'Y') {
                aVar = C10071a.TIME_UNIT_UNKNOWN;
            } else {
                aVar = C10071a.YEAR;
            }
            return new C10070c(parseInt, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10070c.class != obj.getClass()) {
            return false;
        }
        C10070c cVar = (C10070c) obj;
        return this.f24209a == cVar.f24209a && this.f24210b == cVar.f24210b;
    }

    public int hashCode() {
        return ((this.f24209a + 0) * 31) + this.f24210b.hashCode();
    }

    public String toString() {
        return "Period{number=" + this.f24209a + "timeUnit=" + this.f24210b + "}";
    }
}
