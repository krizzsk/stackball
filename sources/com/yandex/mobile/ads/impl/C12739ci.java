package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.ci */
public final class C12739ci {

    /* renamed from: j */
    public static final C12740a f31927j = new C12740a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Pattern f31928k = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Pattern f31929l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Pattern f31930m = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final Pattern f31931n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f31932a;

    /* renamed from: b */
    private final String f31933b;

    /* renamed from: c */
    private final long f31934c;

    /* renamed from: d */
    private final String f31935d;

    /* renamed from: e */
    private final String f31936e;

    /* renamed from: f */
    private final boolean f31937f;

    /* renamed from: g */
    private final boolean f31938g;

    /* renamed from: h */
    private final boolean f31939h;

    /* renamed from: i */
    private final boolean f31940i;

    private C12739ci(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31932a = str;
        this.f31933b = str2;
        this.f31934c = j;
        this.f31935d = str3;
        this.f31936e = str4;
        this.f31937f = z;
        this.f31938g = z2;
        this.f31939h = z3;
        this.f31940i = z4;
    }

    public /* synthetic */ C12739ci(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    /* renamed from: e */
    public final String mo66302e() {
        return this.f31932a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12739ci) {
            C12739ci ciVar = (C12739ci) obj;
            return Intrinsics.areEqual((Object) ciVar.f31932a, (Object) this.f31932a) && Intrinsics.areEqual((Object) ciVar.f31933b, (Object) this.f31933b) && ciVar.f31934c == this.f31934c && Intrinsics.areEqual((Object) ciVar.f31935d, (Object) this.f31935d) && Intrinsics.areEqual((Object) ciVar.f31936e, (Object) this.f31936e) && ciVar.f31937f == this.f31937f && ciVar.f31938g == this.f31938g && ciVar.f31939h == this.f31939h && ciVar.f31940i == this.f31940i;
        }
    }

    /* renamed from: f */
    public final String mo66304f() {
        return this.f31933b;
    }

    public int hashCode() {
        return ((((((((((((((((this.f31932a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f31933b.hashCode()) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f31934c)) * 31) + this.f31935d.hashCode()) * 31) + this.f31936e.hashCode()) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.f31937f)) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.f31938g)) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.f31939h)) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.f31940i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31932a);
        sb.append('=');
        sb.append(this.f31933b);
        if (this.f31939h) {
            if (this.f31934c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C13980mj.m39463a(new Date(this.f31934c)));
            }
        }
        if (!this.f31940i) {
            sb.append("; domain=");
            sb.append(this.f31935d);
        }
        sb.append("; path=");
        sb.append(this.f31936e);
        if (this.f31937f) {
            sb.append("; secure");
        }
        if (this.f31938g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString()");
        return sb2;
    }

    /* renamed from: com.yandex.mobile.ads.impl.ci$a */
    public static final class C12740a {
        private C12740a() {
        }

        public /* synthetic */ C12740a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final long m34725a(String str, int i, int i2) {
            String str2 = str;
            int i3 = i2;
            int a = m34724a(str2, i, i3, false);
            Matcher matcher = C12739ci.f31931n.matcher(str2);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            while (a < i3) {
                int a2 = m34724a(str2, a + 1, i3, true);
                matcher.region(a, a2);
                if (i5 == -1 && matcher.usePattern(C12739ci.f31931n).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                    i8 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                    i9 = Integer.parseInt(group3);
                } else if (i6 == -1 && matcher.usePattern(C12739ci.f31930m).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                    i6 = Integer.parseInt(group4);
                } else if (i7 == -1 && matcher.usePattern(C12739ci.f31929l).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = C12739ci.f31929l.pattern();
                    Intrinsics.checkNotNullExpressionValue(pattern, "MONTH_PATTERN.pattern()");
                    i7 = StringsKt.indexOf$default((CharSequence) pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i4 == -1 && matcher.usePattern(C12739ci.f31928k).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
                a = m34724a(str2, a2 + 1, i3, false);
            }
            if (70 <= i4 && i4 <= 99) {
                i4 += 1900;
            }
            if (i4 >= 0 && i4 <= 69) {
                i4 += 2000;
            }
            if (i4 >= 1601) {
                if (i7 != -1) {
                    if (1 <= i6 && i6 <= 31) {
                        if (i5 >= 0 && i5 <= 23) {
                            if (i8 >= 0 && i8 <= 59) {
                                if (i9 >= 0 && i9 <= 59) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(jh1.f35308d);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i7 - 1);
                                    gregorianCalendar.set(5, i6);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i8);
                                    gregorianCalendar.set(13, i9);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
            if (r1 != ':') goto L_0x0042;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final int m34724a(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
                if (r7 >= r8) goto L_0x004c
            L_0x0002:
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 0
                r4 = 1
                if (r1 >= r2) goto L_0x0012
                r2 = 9
                if (r1 != r2) goto L_0x0041
            L_0x0012:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L_0x0041
                r2 = 57
                if (r1 > r2) goto L_0x0020
                r2 = 48
                if (r2 > r1) goto L_0x0020
                r2 = 1
                goto L_0x0021
            L_0x0020:
                r2 = 0
            L_0x0021:
                if (r2 != 0) goto L_0x0041
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L_0x002d
                r2 = 97
                if (r2 > r1) goto L_0x002d
                r2 = 1
                goto L_0x002e
            L_0x002d:
                r2 = 0
            L_0x002e:
                if (r2 != 0) goto L_0x0041
                r2 = 90
                if (r1 > r2) goto L_0x003a
                r2 = 65
                if (r2 > r1) goto L_0x003a
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 != 0) goto L_0x0041
                r2 = 58
                if (r1 != r2) goto L_0x0042
            L_0x0041:
                r3 = 1
            L_0x0042:
                r1 = r9 ^ 1
                if (r3 != r1) goto L_0x0047
                return r7
            L_0x0047:
                if (r0 < r8) goto L_0x004a
                goto L_0x004c
            L_0x004a:
                r7 = r0
                goto L_0x0002
            L_0x004c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12739ci.C12740a.m34724a(java.lang.String, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:121:0x021d, code lost:
            if (com.yandex.mobile.ads.impl.jh1.m37829a(r0) == false) goto L_0x021f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0223, code lost:
            if (r3 != false) goto L_0x0226;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x023a, code lost:
            if (com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.f29512h.mo64761a(r1) == null) goto L_0x0092;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0291  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x029f A[LOOP:1: B:17:0x005e->B:152:0x029f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x029d A[SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.yandex.mobile.ads.impl.C12739ci> mo66307a(com.yandex.mobile.ads.impl.fc0 r39, com.yandex.mobile.ads.impl.q90 r40) {
            /*
                r38 = this;
                r1 = r39
                r0 = r40
                java.lang.String r2 = "."
                java.lang.String r3 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                java.lang.String r4 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
                r40.getClass()
                java.lang.String r4 = "Set-Cookie"
                java.lang.String r5 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
                int r5 = r40.size()
                r6 = 2
                r8 = 0
                r9 = 1
                if (r5 <= 0) goto L_0x0044
                r10 = 0
                r11 = 0
            L_0x0025:
                int r12 = r10 + 1
                java.lang.String r13 = r0.mo69509a((int) r10)
                boolean r13 = kotlin.text.StringsKt.equals(r4, r13, r9)
                if (r13 == 0) goto L_0x003f
                if (r11 != 0) goto L_0x0038
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r6)
            L_0x0038:
                java.lang.String r10 = r0.mo69511b(r10)
                r11.add(r10)
            L_0x003f:
                if (r12 < r5) goto L_0x0042
                goto L_0x0045
            L_0x0042:
                r10 = r12
                goto L_0x0025
            L_0x0044:
                r11 = 0
            L_0x0045:
                if (r11 == 0) goto L_0x0051
                java.util.List r0 = java.util.Collections.unmodifiableList(r11)
                java.lang.String r4 = "{\n      Collections.unmodifiableList(result)\n    }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
                goto L_0x0055
            L_0x0051:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0055:
                r4 = r0
                int r5 = r4.size()
                if (r5 <= 0) goto L_0x02a9
                r0 = 0
                r10 = 0
            L_0x005e:
                int r11 = r0 + 1
                java.lang.Object r0 = r4.get(r0)
                r12 = r0
                java.lang.String r12 = (java.lang.String) r12
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                java.lang.String r0 = "setCookie"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                long r13 = java.lang.System.currentTimeMillis()
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                byte[] r0 = com.yandex.mobile.ads.impl.jh1.f35305a
                int r0 = r12.length()
                r15 = 59
                int r0 = com.yandex.mobile.ads.impl.jh1.m37808a((java.lang.String) r12, (char) r15, (int) r8, (int) r0)
                r6 = 61
                int r7 = com.yandex.mobile.ads.impl.jh1.m37808a((java.lang.String) r12, (char) r6, (int) r8, (int) r0)
                if (r7 != r0) goto L_0x0097
            L_0x008d:
                r6 = r38
                r37 = r3
                r7 = 1
            L_0x0092:
                r8 = 2
                r12 = 0
                r15 = 0
                goto L_0x028d
            L_0x0097:
                java.lang.String r17 = com.yandex.mobile.ads.impl.jh1.m37838c(r12, r8, r7)
                int r16 = r17.length()
                if (r16 != 0) goto L_0x00a4
                r16 = 1
                goto L_0x00a6
            L_0x00a4:
                r16 = 0
            L_0x00a6:
                if (r16 != 0) goto L_0x008d
                int r8 = com.yandex.mobile.ads.impl.jh1.m37833b((java.lang.String) r17)
                r9 = -1
                if (r8 == r9) goto L_0x00b0
                goto L_0x008d
            L_0x00b0:
                int r7 = r7 + 1
                java.lang.String r18 = com.yandex.mobile.ads.impl.jh1.m37838c(r12, r7, r0)
                int r7 = com.yandex.mobile.ads.impl.jh1.m37833b((java.lang.String) r18)
                if (r7 == r9) goto L_0x00bd
                goto L_0x008d
            L_0x00bd:
                int r0 = r0 + 1
                int r7 = r12.length()
                r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                r31 = r19
                r21 = -1
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 1
                r29 = 0
                r30 = 0
            L_0x00d8:
                r33 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r35 = -9223372036854775808
                if (r0 >= r7) goto L_0x01bb
                int r8 = com.yandex.mobile.ads.impl.jh1.m37808a((java.lang.String) r12, (char) r15, (int) r0, (int) r7)
                int r9 = com.yandex.mobile.ads.impl.jh1.m37808a((java.lang.String) r12, (char) r6, (int) r0, (int) r8)
                java.lang.String r0 = com.yandex.mobile.ads.impl.jh1.m37838c(r12, r0, r9)
                if (r9 >= r8) goto L_0x00f6
                int r9 = r9 + 1
                java.lang.String r9 = com.yandex.mobile.ads.impl.jh1.m37838c(r12, r9, r8)
                goto L_0x00f8
            L_0x00f6:
                java.lang.String r9 = ""
            L_0x00f8:
                java.lang.String r6 = "expires"
                r15 = 1
                boolean r6 = kotlin.text.StringsKt.equals(r0, r6, r15)
                if (r6 == 0) goto L_0x0110
                int r0 = r9.length()     // Catch:{ IllegalArgumentException -> 0x010d }
                r6 = r38
                r15 = 0
                long r31 = r6.m34725a(r9, r15, r0)     // Catch:{ IllegalArgumentException -> 0x0154 }
                goto L_0x012a
            L_0x010d:
                r6 = r38
                goto L_0x0154
            L_0x0110:
                r6 = r38
                java.lang.String r15 = "max-age"
                r1 = 1
                boolean r15 = kotlin.text.StringsKt.equals(r0, r15, r1)
                if (r15 == 0) goto L_0x0157
                long r0 = java.lang.Long.parseLong(r9)     // Catch:{ NumberFormatException -> 0x012d }
                r21 = 0
                int r9 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
                if (r9 > 0) goto L_0x0128
                r37 = r3
                goto L_0x0149
            L_0x0128:
                r21 = r0
            L_0x012a:
                r37 = r3
                goto L_0x014e
            L_0x012d:
                r0 = move-exception
                r1 = r0
                kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch:{  }
                java.lang.String r15 = "-?\\d+"
                r0.<init>((java.lang.String) r15)     // Catch:{  }
                boolean r0 = r0.matches(r9)     // Catch:{  }
                if (r0 == 0) goto L_0x0151
                java.lang.String r0 = "-"
                r37 = r3
                r1 = 2
                r3 = 0
                r15 = 0
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r9, r0, r3, r1, r15)     // Catch:{ NumberFormatException -> 0x01af }
                if (r0 == 0) goto L_0x014c
            L_0x0149:
                r21 = r35
                goto L_0x014e
            L_0x014c:
                r21 = r33
            L_0x014e:
                r25 = 1
                goto L_0x01af
            L_0x0151:
                r37 = r3
                throw r1     // Catch:{ NumberFormatException -> 0x01af }
            L_0x0154:
                r37 = r3
                goto L_0x01af
            L_0x0157:
                r37 = r3
                java.lang.String r1 = "domain"
                r3 = 1
                boolean r1 = kotlin.text.StringsKt.equals(r0, r1, r3)
                if (r1 == 0) goto L_0x018e
                r1 = 2
                r3 = 0
                r15 = 0
                boolean r0 = kotlin.text.StringsKt.endsWith$default(r9, r2, r3, r1, r15)     // Catch:{  }
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x0182
                java.lang.String r0 = kotlin.text.StringsKt.removePrefix((java.lang.String) r9, (java.lang.CharSequence) r2)     // Catch:{  }
                java.lang.String r0 = com.yandex.mobile.ads.impl.ra0.m41511a(r0)     // Catch:{  }
                if (r0 == 0) goto L_0x017c
                r29 = r0
                r26 = 0
                goto L_0x01af
            L_0x017c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
                r0.<init>()     // Catch:{  }
                throw r0     // Catch:{  }
            L_0x0182:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
                java.lang.String r1 = "Failed requirement."
                java.lang.String r1 = r1.toString()     // Catch:{  }
                r0.<init>(r1)     // Catch:{  }
                throw r0     // Catch:{  }
            L_0x018e:
                java.lang.String r1 = "path"
                r3 = 1
                boolean r1 = kotlin.text.StringsKt.equals(r0, r1, r3)
                if (r1 == 0) goto L_0x019a
                r30 = r9
                goto L_0x01af
            L_0x019a:
                java.lang.String r1 = "secure"
                boolean r1 = kotlin.text.StringsKt.equals(r0, r1, r3)
                if (r1 == 0) goto L_0x01a5
                r23 = 1
                goto L_0x01af
            L_0x01a5:
                java.lang.String r1 = "httponly"
                boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r3)
                if (r0 == 0) goto L_0x01af
                r24 = 1
            L_0x01af:
                int r0 = r8 + 1
                r1 = r39
                r3 = r37
                r6 = 61
                r15 = 59
                goto L_0x00d8
            L_0x01bb:
                r6 = r38
                r37 = r3
                int r0 = (r21 > r35 ? 1 : (r21 == r35 ? 0 : -1))
                if (r0 != 0) goto L_0x01c6
                r19 = r35
                goto L_0x01ea
            L_0x01c6:
                r7 = -1
                int r0 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
                if (r0 == 0) goto L_0x01e8
                r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r3 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
                if (r3 > 0) goto L_0x01da
                r0 = 1000(0x3e8, float:1.401E-42)
                long r0 = (long) r0
                long r33 = r21 * r0
            L_0x01da:
                long r33 = r13 + r33
                int r0 = (r33 > r13 ? 1 : (r33 == r13 ? 0 : -1))
                if (r0 < 0) goto L_0x01ea
                int r0 = (r33 > r19 ? 1 : (r33 == r19 ? 0 : -1))
                if (r0 <= 0) goto L_0x01e5
                goto L_0x01ea
            L_0x01e5:
                r19 = r33
                goto L_0x01ea
            L_0x01e8:
                r19 = r31
            L_0x01ea:
                java.lang.String r0 = r39.mo66958g()
                r1 = r29
                if (r1 != 0) goto L_0x01f5
                r1 = r0
                r7 = 1
                goto L_0x0226
            L_0x01f5:
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                if (r3 == 0) goto L_0x01fd
                r7 = 1
                goto L_0x021f
            L_0x01fd:
                r3 = 2
                r7 = 0
                r8 = 0
                boolean r9 = kotlin.text.StringsKt.endsWith$default(r0, r1, r8, r3, r7)
                if (r9 == 0) goto L_0x0221
                int r3 = r0.length()
                int r7 = r1.length()
                int r3 = r3 - r7
                r7 = 1
                int r3 = r3 - r7
                char r3 = r0.charAt(r3)
                r8 = 46
                if (r3 != r8) goto L_0x0222
                boolean r3 = com.yandex.mobile.ads.impl.jh1.m37829a((java.lang.String) r0)
                if (r3 != 0) goto L_0x0222
            L_0x021f:
                r3 = 1
                goto L_0x0223
            L_0x0221:
                r7 = 1
            L_0x0222:
                r3 = 0
            L_0x0223:
                if (r3 != 0) goto L_0x0226
                goto L_0x023c
            L_0x0226:
                int r0 = r0.length()
                int r3 = r1.length()
                if (r0 == r3) goto L_0x023e
                com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r0 = com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.f29509e
                com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.f29512h
                java.lang.String r0 = r0.mo64761a(r1)
                if (r0 != 0) goto L_0x023e
            L_0x023c:
                goto L_0x0092
            L_0x023e:
                java.lang.String r0 = "/"
                r3 = r30
                r8 = 2
                if (r3 == 0) goto L_0x0252
                r9 = 0
                r15 = 0
                boolean r12 = kotlin.text.StringsKt.startsWith$default(r3, r0, r9, r8, r15)
                if (r12 != 0) goto L_0x024e
                goto L_0x0253
            L_0x024e:
                r22 = r3
                r12 = 0
                goto L_0x0281
            L_0x0252:
                r15 = 0
            L_0x0253:
                java.lang.String r3 = r39.mo66953c()
                r29 = 47
                r30 = 0
                r31 = 0
                r32 = 6
                r33 = 0
                r28 = r3
                int r9 = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) r28, (char) r29, (int) r30, (boolean) r31, (int) r32, (java.lang.Object) r33)
                if (r9 == 0) goto L_0x027e
                if (r3 == 0) goto L_0x0276
                r12 = 0
                java.lang.String r0 = r3.substring(r12, r9)
                java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                goto L_0x027f
            L_0x0276:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x027e:
                r12 = 0
            L_0x027f:
                r22 = r0
            L_0x0281:
                com.yandex.mobile.ads.impl.ci r0 = new com.yandex.mobile.ads.impl.ci
                r27 = 0
                r16 = r0
                r21 = r1
                r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
                goto L_0x028e
            L_0x028d:
                r0 = r15
            L_0x028e:
                if (r0 != 0) goto L_0x0291
                goto L_0x029b
            L_0x0291:
                if (r10 != 0) goto L_0x0298
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
            L_0x0298:
                r10.add(r0)
            L_0x029b:
                if (r11 < r5) goto L_0x029f
                r7 = r10
                goto L_0x02ad
            L_0x029f:
                r1 = r39
                r0 = r11
                r3 = r37
                r6 = 2
                r8 = 0
                r9 = 1
                goto L_0x005e
            L_0x02a9:
                r6 = r38
                r15 = 0
                r7 = r15
            L_0x02ad:
                if (r7 == 0) goto L_0x02b9
                java.util.List r0 = java.util.Collections.unmodifiableList(r7)
                java.lang.String r1 = "{\n        Collections.unmodifiableList(cookies)\n      }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                goto L_0x02bd
            L_0x02b9:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            L_0x02bd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12739ci.C12740a.mo66307a(com.yandex.mobile.ads.impl.fc0, com.yandex.mobile.ads.impl.q90):java.util.List");
        }
    }
}
