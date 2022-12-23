package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinEventParameters;
import com.google.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okio.Buffer;

public final class fc0 {

    /* renamed from: j */
    public static final C13044b f33296j = new C13044b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final char[] f33297k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f33298a;

    /* renamed from: b */
    private final String f33299b;

    /* renamed from: c */
    private final String f33300c;

    /* renamed from: d */
    private final String f33301d;

    /* renamed from: e */
    private final int f33302e;

    /* renamed from: f */
    private final List<String> f33303f;

    /* renamed from: g */
    private final String f33304g;

    /* renamed from: h */
    private final String f33305h;

    /* renamed from: i */
    private final boolean f33306i;

    /* renamed from: com.yandex.mobile.ads.impl.fc0$a */
    public static final class C13043a {

        /* renamed from: a */
        private String f33307a;

        /* renamed from: b */
        private String f33308b = "";

        /* renamed from: c */
        private String f33309c = "";

        /* renamed from: d */
        private String f33310d;

        /* renamed from: e */
        private int f33311e = -1;

        /* renamed from: f */
        private final List<String> f33312f;

        /* renamed from: g */
        private List<String> f33313g;

        /* renamed from: h */
        private String f33314h;

        public C13043a() {
            ArrayList arrayList = new ArrayList();
            this.f33312f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final C13043a mo66968a(int i) {
            boolean z = true;
            if (1 > i || i > 65535) {
                z = false;
            }
            if (z) {
                this.f33311e = i;
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i)).toString());
        }

        /* renamed from: b */
        public final void mo66973b(int i) {
            this.f33311e = i;
        }

        /* renamed from: c */
        public final List<String> mo66975c() {
            return this.f33312f;
        }

        /* renamed from: d */
        public final C13043a mo66976d() {
            String str;
            int size;
            String str2 = this.f33310d;
            String str3 = null;
            if (str2 == null) {
                str = null;
            } else {
                str = new Regex("[\"<>^`{|}]").replace((CharSequence) str2, "");
            }
            this.f33310d = str;
            int size2 = this.f33312f.size();
            int i = 0;
            if (size2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    List<String> list = this.f33312f;
                    list.set(i2, C13044b.m35981a(fc0.f33296j, list.get(i2), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
                    if (i3 >= size2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            List<String> list2 = this.f33313g;
            if (list2 != null && (size = list2.size()) > 0) {
                while (true) {
                    int i4 = i + 1;
                    String str4 = list2.get(i);
                    list2.set(i, str4 == null ? null : C13044b.m35981a(fc0.f33296j, str4, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195));
                    if (i4 >= size) {
                        break;
                    }
                    i = i4;
                }
            }
            String str5 = this.f33314h;
            if (str5 != null) {
                str3 = C13044b.m35981a(fc0.f33296j, str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
            }
            this.f33314h = str3;
            return this;
        }

        /* renamed from: e */
        public final void mo66978e(String str) {
            this.f33314h = str;
        }

        /* renamed from: f */
        public final void mo66979f(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f33309c = str;
        }

        /* renamed from: g */
        public final void mo66980g(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f33308b = str;
        }

        /* renamed from: h */
        public final void mo66981h(String str) {
            this.f33310d = str;
        }

        /* renamed from: i */
        public final void mo66982i(String str) {
            this.f33307a = str;
        }

        /* renamed from: j */
        public final C13043a mo66983j(String str) {
            Intrinsics.checkNotNullParameter(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
            String a = C13044b.m35981a(fc0.f33296j, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
            Intrinsics.checkNotNullParameter(a, "<set-?>");
            this.f33308b = a;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if ((r10.f33309c.length() > 0) != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
            if (r1 != r5) goto L_0x00a7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r10.f33307a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r10.f33308b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0023
                r1 = 1
                goto L_0x0024
            L_0x0023:
                r1 = 0
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r10.f33309c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = 1
                goto L_0x0033
            L_0x0032:
                r1 = 0
            L_0x0033:
                if (r1 == 0) goto L_0x0053
            L_0x0035:
                java.lang.String r1 = r10.f33308b
                r0.append(r1)
                java.lang.String r1 = r10.f33309c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r2 = 0
            L_0x0044:
                if (r2 == 0) goto L_0x004e
                r0.append(r4)
                java.lang.String r1 = r10.f33309c
                r0.append(r1)
            L_0x004e:
                r1 = 64
                r0.append(r1)
            L_0x0053:
                java.lang.String r1 = r10.f33310d
                r2 = 2
                if (r1 == 0) goto L_0x0077
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r1, (char) r4, (boolean) r3, (int) r2, (java.lang.Object) r5)
                if (r1 == 0) goto L_0x0072
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r10.f33310d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0077
            L_0x0072:
                java.lang.String r1 = r10.f33310d
                r0.append(r1)
            L_0x0077:
                int r1 = r10.f33311e
                r5 = -1
                if (r1 != r5) goto L_0x0080
                java.lang.String r1 = r10.f33307a
                if (r1 == 0) goto L_0x00ad
            L_0x0080:
                int r1 = r10.m35964b()
                java.lang.String r6 = r10.f33307a
                if (r6 == 0) goto L_0x00a7
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                java.lang.String r7 = "scheme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
                java.lang.String r7 = "http"
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
                if (r7 == 0) goto L_0x009b
                r5 = 80
                goto L_0x00a5
            L_0x009b:
                java.lang.String r7 = "https"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
                if (r6 == 0) goto L_0x00a5
                r5 = 443(0x1bb, float:6.21E-43)
            L_0x00a5:
                if (r1 == r5) goto L_0x00ad
            L_0x00a7:
                r0.append(r4)
                r0.append(r1)
            L_0x00ad:
                java.util.List<java.lang.String> r1 = r10.f33312f
                java.lang.String r4 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
                java.lang.String r5 = "out"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
                int r6 = r1.size()
                if (r6 <= 0) goto L_0x00d5
                r7 = 0
            L_0x00c0:
                int r8 = r7 + 1
                r9 = 47
                r0.append(r9)
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                r0.append(r7)
                if (r8 < r6) goto L_0x00d3
                goto L_0x00d5
            L_0x00d3:
                r7 = r8
                goto L_0x00c0
            L_0x00d5:
                java.util.List<java.lang.String> r1 = r10.f33313g
                if (r1 == 0) goto L_0x0132
                r1 = 63
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r10.f33313g
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
                int r4 = r1.size()
                kotlin.ranges.IntRange r3 = kotlin.ranges.RangesKt.until((int) r3, (int) r4)
                kotlin.ranges.IntProgression r2 = kotlin.ranges.RangesKt.step((kotlin.ranges.IntProgression) r3, (int) r2)
                int r3 = r2.getFirst()
                int r4 = r2.getLast()
                int r2 = r2.getStep()
                if (r2 <= 0) goto L_0x0105
                if (r3 <= r4) goto L_0x0109
            L_0x0105:
                if (r2 >= 0) goto L_0x0132
                if (r4 > r3) goto L_0x0132
            L_0x0109:
                int r5 = r3 + r2
                java.lang.Object r6 = r1.get(r3)
                java.lang.String r6 = (java.lang.String) r6
                int r7 = r3 + 1
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r3 <= 0) goto L_0x0120
                r8 = 38
                r0.append(r8)
            L_0x0120:
                r0.append(r6)
                if (r7 == 0) goto L_0x012d
                r6 = 61
                r0.append(r6)
                r0.append(r7)
            L_0x012d:
                if (r3 != r4) goto L_0x0130
                goto L_0x0132
            L_0x0130:
                r3 = r5
                goto L_0x0109
            L_0x0132:
                java.lang.String r1 = r10.f33314h
                if (r1 == 0) goto L_0x0140
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r10.f33314h
                r0.append(r1)
            L_0x0140:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fc0.C13043a.toString():java.lang.String");
        }

        /* renamed from: b */
        public final C13043a mo66972b(String str) {
            Intrinsics.checkNotNullParameter(str, "host");
            String a = ra0.m41511a(C13044b.m35982a(fc0.f33296j, str, 0, 0, false, 7));
            if (a != null) {
                this.f33310d = a;
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", str));
        }

        /* renamed from: c */
        public final C13043a mo66974c(String str) {
            Intrinsics.checkNotNullParameter(str, "password");
            String a = C13044b.m35981a(fc0.f33296j, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
            Intrinsics.checkNotNullParameter(a, "<set-?>");
            this.f33309c = a;
            return this;
        }

        /* renamed from: a */
        public final C13043a mo66970a(String str) {
            List<String> list;
            if (str == null) {
                list = null;
            } else {
                C13044b bVar = fc0.f33296j;
                list = bVar.mo66987b(C13044b.m35981a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211));
            }
            this.f33313g = list;
            return this;
        }

        /* renamed from: b */
        private final int m35964b() {
            int i = this.f33311e;
            if (i != -1) {
                return i;
            }
            String str = this.f33307a;
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNullParameter(str, "scheme");
            if (Intrinsics.areEqual((Object) str, (Object) "http")) {
                return 80;
            }
            return Intrinsics.areEqual((Object) str, (Object) "https") ? 443 : -1;
        }

        /* renamed from: a */
        public final fc0 mo66971a() {
            ArrayList arrayList;
            String str;
            String str2 = this.f33307a;
            if (str2 != null) {
                C13044b bVar = fc0.f33296j;
                String a = C13044b.m35982a(bVar, this.f33308b, 0, 0, false, 7);
                String a2 = C13044b.m35982a(bVar, this.f33309c, 0, 0, false, 7);
                String str3 = this.f33310d;
                if (str3 != null) {
                    int b = m35964b();
                    List<String> list = this.f33312f;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (String a3 : list) {
                        arrayList2.add(C13044b.m35982a(fc0.f33296j, a3, 0, 0, false, 7));
                    }
                    List<String> list2 = this.f33313g;
                    if (list2 == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (String str4 : list2) {
                            if (str4 == null) {
                                str = null;
                            } else {
                                str = C13044b.m35982a(fc0.f33296j, str4, 0, 0, true, 3);
                            }
                            arrayList.add(str);
                        }
                    }
                    String str5 = this.f33314h;
                    return new fc0(str2, a, a2, str3, b, arrayList2, arrayList, str5 == null ? null : C13044b.m35982a(fc0.f33296j, str5, 0, 0, false, 7), toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: d */
        public final C13043a mo66977d(String str) {
            Intrinsics.checkNotNullParameter(str, "scheme");
            if (StringsKt.equals(str, "http", true)) {
                this.f33307a = "http";
            } else if (StringsKt.equals(str, "https", true)) {
                this.f33307a = "https";
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", str));
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: boolean} */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ae, code lost:
            if ((r13 <= r11 && r11 <= 65535) != false) goto L_0x02b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
            if (r9 == ':') goto L_0x00a5;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x0319  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x031b  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x031e  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x0485  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.yandex.mobile.ads.impl.fc0.C13043a mo66969a(com.yandex.mobile.ads.impl.fc0 r30, java.lang.String r31) {
            /*
                r29 = this;
                r0 = r29
                r12 = r31
                java.lang.String r1 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                byte[] r1 = com.yandex.mobile.ads.impl.jh1.f35305a
                int r1 = r31.length()
                r13 = 0
                int r1 = com.yandex.mobile.ads.impl.jh1.m37810a((java.lang.String) r12, (int) r13, (int) r1)
                int r2 = r31.length()
                int r14 = com.yandex.mobile.ads.impl.jh1.m37834b((java.lang.String) r12, (int) r1, (int) r2)
                int r2 = r14 - r1
                r3 = 2
                r15 = 58
                r11 = -1
                r10 = 1
                if (r2 >= r3) goto L_0x0027
                goto L_0x00a4
            L_0x0027:
                char r2 = r12.charAt(r1)
                r4 = 97
                int r5 = kotlin.jvm.internal.Intrinsics.compare((int) r2, (int) r4)
                r6 = 90
                r7 = 122(0x7a, float:1.71E-43)
                r8 = 65
                if (r5 < 0) goto L_0x003f
                int r5 = kotlin.jvm.internal.Intrinsics.compare((int) r2, (int) r7)
                if (r5 <= 0) goto L_0x004d
            L_0x003f:
                int r5 = kotlin.jvm.internal.Intrinsics.compare((int) r2, (int) r8)
                if (r5 < 0) goto L_0x00a4
                int r2 = kotlin.jvm.internal.Intrinsics.compare((int) r2, (int) r6)
                if (r2 <= 0) goto L_0x004d
                goto L_0x00a4
            L_0x004d:
                int r2 = r1 + 1
                if (r2 >= r14) goto L_0x00a4
            L_0x0051:
                int r5 = r2 + 1
                char r9 = r12.charAt(r2)
                if (r4 > r9) goto L_0x005e
                if (r9 > r7) goto L_0x005e
                r16 = 1
                goto L_0x0060
            L_0x005e:
                r16 = 0
            L_0x0060:
                if (r16 == 0) goto L_0x0063
                goto L_0x0067
            L_0x0063:
                if (r8 > r9) goto L_0x006a
                if (r9 > r6) goto L_0x006a
            L_0x0067:
                r16 = 1
                goto L_0x006c
            L_0x006a:
                r16 = 0
            L_0x006c:
                if (r16 == 0) goto L_0x006f
                goto L_0x0077
            L_0x006f:
                r4 = 48
                if (r4 > r9) goto L_0x0079
                r4 = 57
                if (r9 > r4) goto L_0x0079
            L_0x0077:
                r4 = 1
                goto L_0x007a
            L_0x0079:
                r4 = 0
            L_0x007a:
                if (r4 == 0) goto L_0x007d
                goto L_0x0081
            L_0x007d:
                r4 = 43
                if (r9 != r4) goto L_0x0083
            L_0x0081:
                r4 = 1
                goto L_0x0084
            L_0x0083:
                r4 = 0
            L_0x0084:
                if (r4 == 0) goto L_0x0087
                goto L_0x008b
            L_0x0087:
                r4 = 45
                if (r9 != r4) goto L_0x008d
            L_0x008b:
                r4 = 1
                goto L_0x008e
            L_0x008d:
                r4 = 0
            L_0x008e:
                if (r4 == 0) goto L_0x0091
                goto L_0x0095
            L_0x0091:
                r4 = 46
                if (r9 != r4) goto L_0x0097
            L_0x0095:
                r4 = 1
                goto L_0x0098
            L_0x0097:
                r4 = 0
            L_0x0098:
                if (r4 == 0) goto L_0x00a1
                if (r5 < r14) goto L_0x009d
                goto L_0x00a4
            L_0x009d:
                r2 = r5
                r4 = 97
                goto L_0x0051
            L_0x00a1:
                if (r9 != r15) goto L_0x00a4
                goto L_0x00a5
            L_0x00a4:
                r2 = -1
            L_0x00a5:
                java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r2 == r11) goto L_0x00ea
                java.lang.String r4 = "https:"
                boolean r4 = kotlin.text.StringsKt.startsWith(r12, r4, r1, r10)
                if (r4 == 0) goto L_0x00b8
                java.lang.String r2 = "https"
                r0.f33307a = r2
                int r1 = r1 + 6
                goto L_0x00f2
            L_0x00b8:
                java.lang.String r4 = "http:"
                boolean r4 = kotlin.text.StringsKt.startsWith(r12, r4, r1, r10)
                if (r4 == 0) goto L_0x00c7
                java.lang.String r2 = "http"
                r0.f33307a = r2
                int r1 = r1 + 5
                goto L_0x00f2
            L_0x00c7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Expected URL scheme 'http' or 'https' but was '"
                r3.append(r4)
                java.lang.String r2 = r12.substring(r13, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
                r3.append(r2)
                r2 = 39
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x00ea:
                if (r30 == 0) goto L_0x04ac
                java.lang.String r2 = r30.mo66964l()
                r0.f33307a = r2
            L_0x00f2:
                r8 = 47
                r7 = 92
                if (r1 >= r14) goto L_0x010b
                r2 = r1
                r4 = 0
            L_0x00fa:
                int r5 = r2 + 1
                char r2 = r12.charAt(r2)
                if (r2 == r7) goto L_0x0104
                if (r2 != r8) goto L_0x010c
            L_0x0104:
                int r4 = r4 + 1
                if (r5 < r14) goto L_0x0109
                goto L_0x010c
            L_0x0109:
                r2 = r5
                goto L_0x00fa
            L_0x010b:
                r4 = 0
            L_0x010c:
                r6 = 63
                r5 = 35
                if (r4 >= r3) goto L_0x015b
                if (r30 == 0) goto L_0x015b
                java.lang.String r2 = r30.mo66964l()
                java.lang.String r3 = r0.f33307a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
                if (r2 != 0) goto L_0x0121
                goto L_0x015b
            L_0x0121:
                java.lang.String r2 = r30.mo66957f()
                r0.f33308b = r2
                java.lang.String r2 = r30.mo66952b()
                r0.f33309c = r2
                java.lang.String r2 = r30.mo66958g()
                r0.f33310d = r2
                int r2 = r30.mo66961i()
                r0.f33311e = r2
                java.util.List<java.lang.String> r2 = r0.f33312f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f33312f
                java.util.List r3 = r30.mo66954d()
                r2.addAll(r3)
                if (r1 == r14) goto L_0x014f
                char r2 = r12.charAt(r1)
                if (r2 != r5) goto L_0x0156
            L_0x014f:
                java.lang.String r2 = r30.mo66955e()
                r0.mo66970a((java.lang.String) r2)
            L_0x0156:
                r19 = r14
                r13 = 1
                goto L_0x031f
            L_0x015b:
                int r1 = r1 + r4
                r4 = r1
                r16 = 0
                r17 = 0
            L_0x0161:
                java.lang.String r1 = "@/\\?#"
                int r3 = com.yandex.mobile.ads.impl.jh1.m37812a((java.lang.String) r12, (java.lang.String) r1, (int) r4, (int) r14)
                if (r3 == r14) goto L_0x016e
                char r1 = r12.charAt(r3)
                goto L_0x016f
            L_0x016e:
                r1 = -1
            L_0x016f:
                if (r1 == r11) goto L_0x023a
                if (r1 == r5) goto L_0x023a
                if (r1 == r8) goto L_0x023a
                if (r1 == r7) goto L_0x023a
                if (r1 == r6) goto L_0x023a
                r2 = 64
                if (r1 == r2) goto L_0x017e
                goto L_0x0161
            L_0x017e:
                java.lang.String r2 = "%40"
                if (r16 != 0) goto L_0x01f3
                int r1 = com.yandex.mobile.ads.impl.jh1.m37808a((java.lang.String) r12, (char) r15, (int) r4, (int) r3)
                com.yandex.mobile.ads.impl.fc0$b r18 = com.yandex.mobile.ads.impl.fc0.f33296j
                r19 = 1
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 240(0xf0, float:3.36E-43)
                java.lang.String r25 = " \"':;<=>@[]^`{}|/\\?#"
                r30 = r1
                r1 = r18
                r13 = r2
                r2 = r31
                r15 = r3
                r3 = r4
                r4 = r30
                r5 = r25
                r6 = r19
                r7 = r20
                r8 = r21
                r26 = r9
                r9 = r22
                r10 = r23
                r19 = r14
                r14 = -1
                r11 = r24
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35981a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x01ce
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f33308b
                r2.append(r3)
                r2.append(r13)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x01ce:
                r0.f33308b = r1
                r1 = r30
                if (r1 == r15) goto L_0x01ec
                int r3 = r1 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r31
                r4 = r15
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35981a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f33309c = r1
                r10 = 1
                goto L_0x01ee
            L_0x01ec:
                r10 = r16
            L_0x01ee:
                r16 = r10
                r17 = 1
                goto L_0x0225
            L_0x01f3:
                r13 = r2
                r15 = r3
                r26 = r9
                r19 = r14
                r14 = -1
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = r0.f33309c
                r11.append(r1)
                r11.append(r13)
                com.yandex.mobile.ads.impl.fc0$b r1 = com.yandex.mobile.ads.impl.fc0.f33296j
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r13 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r31
                r3 = r4
                r4 = r15
                r14 = r11
                r11 = r13
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35981a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f33309c = r1
            L_0x0225:
                int r4 = r15 + 1
                r14 = r19
                r9 = r26
                r5 = 35
                r6 = 63
                r7 = 92
                r8 = 47
                r10 = 1
                r11 = -1
                r13 = 0
                r15 = 58
                goto L_0x0161
            L_0x023a:
                r15 = r3
                r26 = r9
                r19 = r14
                r3 = r4
            L_0x0240:
                if (r3 >= r15) goto L_0x0262
                char r1 = r12.charAt(r3)
                r2 = 91
                if (r1 != r2) goto L_0x0259
                r13 = 1
            L_0x024b:
                int r3 = r3 + r13
                if (r3 >= r15) goto L_0x0256
                char r1 = r12.charAt(r3)
                r2 = 93
                if (r1 != r2) goto L_0x024b
            L_0x0256:
                r2 = 58
                goto L_0x0260
            L_0x0259:
                r2 = 58
                r13 = 1
                if (r1 != r2) goto L_0x0260
                r14 = r3
                goto L_0x0264
            L_0x0260:
                int r3 = r3 + r13
                goto L_0x0240
            L_0x0262:
                r13 = 1
                r14 = r15
            L_0x0264:
                int r11 = r14 + 1
                r10 = 34
                if (r11 >= r15) goto L_0x02f0
                com.yandex.mobile.ads.impl.fc0$b r7 = com.yandex.mobile.ads.impl.fc0.f33296j
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r31
                r3 = r4
                r9 = r4
                r4 = r14
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35982a(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = com.yandex.mobile.ads.impl.ra0.m41511a(r1)
                r0.f33310d = r1
                java.lang.String r5 = ""
                r6 = 0
                r8 = 0
                r16 = 0
                r17 = 0
                r20 = 0
                r21 = 248(0xf8, float:3.48E-43)
                r1 = r7
                r2 = r31
                r3 = r11
                r4 = r15
                r7 = r8
                r8 = r16
                r30 = r9
                r9 = r17
                r10 = r20
                r27 = r11
                r11 = r21
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35981a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x02b5 }
                int r11 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02b5 }
                if (r13 > r11) goto L_0x02ad
                r1 = 65535(0xffff, float:9.1834E-41)
                if (r11 > r1) goto L_0x02ad
                r10 = 1
                goto L_0x02ae
            L_0x02ad:
                r10 = 0
            L_0x02ae:
                if (r10 == 0) goto L_0x02b5
                goto L_0x02b6
            L_0x02b1:
                r30 = r9
                r27 = r11
            L_0x02b5:
                r11 = -1
            L_0x02b6:
                r0.f33311e = r11
                r1 = -1
                if (r11 == r1) goto L_0x02bd
                r10 = 1
                goto L_0x02be
            L_0x02bd:
                r10 = 0
            L_0x02be:
                if (r10 == 0) goto L_0x02c5
                r7 = r26
                r8 = 34
                goto L_0x0315
            L_0x02c5:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid URL port: \""
                r1.append(r2)
                r14 = r27
                java.lang.String r2 = r12.substring(r14, r15)
                r7 = r26
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
                r1.append(r2)
                r8 = 34
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x02f0:
                r30 = r4
                r7 = r26
                r8 = 34
                com.yandex.mobile.ads.impl.fc0$b r9 = com.yandex.mobile.ads.impl.fc0.f33296j
                r5 = 0
                r6 = 4
                r1 = r9
                r2 = r31
                r3 = r30
                r4 = r14
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35982a(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = com.yandex.mobile.ads.impl.ra0.m41511a(r1)
                r0.f33310d = r1
                java.lang.String r1 = r0.f33307a
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                int r1 = r9.mo66985a(r1)
                r0.f33311e = r1
            L_0x0315:
                java.lang.String r1 = r0.f33310d
                if (r1 == 0) goto L_0x031b
                r10 = 1
                goto L_0x031c
            L_0x031b:
                r10 = 0
            L_0x031c:
                if (r10 == 0) goto L_0x0485
                r1 = r15
            L_0x031f:
                java.lang.String r2 = "?#"
                r14 = r19
                int r15 = com.yandex.mobile.ads.impl.jh1.m37812a((java.lang.String) r12, (java.lang.String) r2, (int) r1, (int) r14)
                if (r1 != r15) goto L_0x032b
                goto L_0x042f
            L_0x032b:
                char r2 = r12.charAt(r1)
                java.lang.String r11 = ""
                r3 = 47
                if (r2 == r3) goto L_0x0345
                r3 = 92
                if (r2 != r3) goto L_0x033a
                goto L_0x0345
            L_0x033a:
                java.util.List<java.lang.String> r2 = r0.f33312f
                int r3 = r2.size()
                int r3 = r3 - r13
                r2.set(r3, r11)
                goto L_0x0351
            L_0x0345:
                java.util.List<java.lang.String> r2 = r0.f33312f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f33312f
                r2.add(r11)
                int r1 = r1 + 1
            L_0x0351:
                r3 = r1
            L_0x0352:
                if (r3 >= r15) goto L_0x042f
                java.lang.String r1 = "/\\"
                int r10 = com.yandex.mobile.ads.impl.jh1.m37812a((java.lang.String) r12, (java.lang.String) r1, (int) r3, (int) r15)
                if (r10 >= r15) goto L_0x035f
                r16 = 1
                goto L_0x0361
            L_0x035f:
                r16 = 0
            L_0x0361:
                com.yandex.mobile.ads.impl.fc0$b r1 = com.yandex.mobile.ads.impl.fc0.f33296j
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r17 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"<>^`{}|/\\?#"
                r2 = r31
                r4 = r10
                r19 = r10
                r10 = r17
                r28 = r11
                r11 = r18
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35981a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r2 = "."
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
                if (r2 != 0) goto L_0x038f
                java.lang.String r2 = "%2e"
                boolean r2 = kotlin.text.StringsKt.equals(r1, r2, r13)
                if (r2 == 0) goto L_0x038d
                goto L_0x038f
            L_0x038d:
                r10 = 0
                goto L_0x0390
            L_0x038f:
                r10 = 1
            L_0x0390:
                if (r10 == 0) goto L_0x0396
                r3 = r28
                goto L_0x0423
            L_0x0396:
                java.lang.String r2 = ".."
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
                if (r2 != 0) goto L_0x03b9
                java.lang.String r2 = "%2e."
                boolean r2 = kotlin.text.StringsKt.equals(r1, r2, r13)
                if (r2 != 0) goto L_0x03b9
                java.lang.String r2 = ".%2e"
                boolean r2 = kotlin.text.StringsKt.equals(r1, r2, r13)
                if (r2 != 0) goto L_0x03b9
                java.lang.String r2 = "%2e%2e"
                boolean r2 = kotlin.text.StringsKt.equals(r1, r2, r13)
                if (r2 == 0) goto L_0x03b7
                goto L_0x03b9
            L_0x03b7:
                r10 = 0
                goto L_0x03ba
            L_0x03b9:
                r10 = 1
            L_0x03ba:
                if (r10 == 0) goto L_0x03f2
                java.util.List<java.lang.String> r1 = r0.f33312f
                int r2 = r1.size()
                int r2 = r2 - r13
                java.lang.Object r1 = r1.remove(r2)
                java.lang.String r1 = (java.lang.String) r1
                int r1 = r1.length()
                if (r1 != 0) goto L_0x03d1
                r10 = 1
                goto L_0x03d2
            L_0x03d1:
                r10 = 0
            L_0x03d2:
                if (r10 == 0) goto L_0x03ea
                java.util.List<java.lang.String> r1 = r0.f33312f
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r13
                if (r1 == 0) goto L_0x03ea
                java.util.List<java.lang.String> r1 = r0.f33312f
                int r2 = r1.size()
                int r2 = r2 - r13
                r3 = r28
                r1.set(r2, r3)
                goto L_0x0423
            L_0x03ea:
                r3 = r28
                java.util.List<java.lang.String> r1 = r0.f33312f
                r1.add(r3)
                goto L_0x0423
            L_0x03f2:
                r3 = r28
                java.util.List<java.lang.String> r2 = r0.f33312f
                int r4 = r2.size()
                int r4 = r4 - r13
                java.lang.Object r2 = r2.get(r4)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0409
                r10 = 1
                goto L_0x040a
            L_0x0409:
                r10 = 0
            L_0x040a:
                if (r10 == 0) goto L_0x0417
                java.util.List<java.lang.String> r2 = r0.f33312f
                int r4 = r2.size()
                int r4 = r4 - r13
                r2.set(r4, r1)
                goto L_0x041c
            L_0x0417:
                java.util.List<java.lang.String> r2 = r0.f33312f
                r2.add(r1)
            L_0x041c:
                if (r16 == 0) goto L_0x0423
                java.util.List<java.lang.String> r1 = r0.f33312f
                r1.add(r3)
            L_0x0423:
                if (r16 == 0) goto L_0x042a
                int r1 = r19 + 1
                r11 = r3
                goto L_0x0351
            L_0x042a:
                r11 = r3
                r3 = r19
                goto L_0x0352
            L_0x042f:
                if (r15 >= r14) goto L_0x0463
                char r1 = r12.charAt(r15)
                r2 = 63
                if (r1 != r2) goto L_0x0463
                r11 = 35
                int r16 = com.yandex.mobile.ads.impl.jh1.m37808a((java.lang.String) r12, (char) r11, (int) r15, (int) r14)
                com.yandex.mobile.ads.impl.fc0$b r10 = com.yandex.mobile.ads.impl.fc0.f33296j
                int r3 = r15 + 1
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r15 = 0
                r17 = 208(0xd0, float:2.91E-43)
                java.lang.String r5 = " \"'<>#"
                r1 = r10
                r2 = r31
                r4 = r16
                r13 = r10
                r10 = r15
                r15 = 35
                r11 = r17
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35981a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r1 = r13.mo66987b(r1)
                r0.f33313g = r1
                r15 = r16
            L_0x0463:
                r1 = 35
                if (r15 >= r14) goto L_0x0484
                char r2 = r12.charAt(r15)
                if (r2 != r1) goto L_0x0484
                com.yandex.mobile.ads.impl.fc0$b r1 = com.yandex.mobile.ads.impl.fc0.f33296j
                r2 = 1
                int r3 = r15 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 176(0xb0, float:2.47E-43)
                java.lang.String r5 = ""
                r2 = r31
                r4 = r14
                java.lang.String r1 = com.yandex.mobile.ads.impl.fc0.C13044b.m35981a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f33314h = r1
            L_0x0484:
                return r0
            L_0x0485:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid URL host: \""
                r1.append(r2)
                r4 = r30
                java.lang.String r2 = r12.substring(r4, r14)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x04ac:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fc0.C13043a.mo66969a(com.yandex.mobile.ads.impl.fc0, java.lang.String):com.yandex.mobile.ads.impl.fc0$a");
        }
    }

    public fc0(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "scheme");
        Intrinsics.checkNotNullParameter(str2, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        Intrinsics.checkNotNullParameter(str3, "password");
        Intrinsics.checkNotNullParameter(str4, "host");
        Intrinsics.checkNotNullParameter(list, "pathSegments");
        Intrinsics.checkNotNullParameter(str6, "url");
        this.f33298a = str;
        this.f33299b = str2;
        this.f33300c = str3;
        this.f33301d = str4;
        this.f33302e = i;
        this.f33303f = list2;
        this.f33304g = str5;
        this.f33305h = str6;
        this.f33306i = Intrinsics.areEqual((Object) str, (Object) "https");
    }

    /* renamed from: b */
    public final String mo66952b() {
        if (this.f33300c.length() == 0) {
            return "";
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f33305h, ':', this.f33298a.length() + 3, false, 4, (Object) null) + 1;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) this.f33305h, '@', 0, false, 6, (Object) null);
        String str = this.f33305h;
        if (str != null) {
            String substring = str.substring(indexOf$default, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public final String mo66953c() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f33305h, '/', this.f33298a.length() + 3, false, 4, (Object) null);
        String str = this.f33305h;
        int a = jh1.m37812a(str, "?#", indexOf$default, str.length());
        String str2 = this.f33305h;
        if (str2 != null) {
            String substring = str2.substring(indexOf$default, a);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public final List<String> mo66954d() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f33305h, '/', this.f33298a.length() + 3, false, 4, (Object) null);
        String str = this.f33305h;
        int a = jh1.m37812a(str, "?#", indexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < a) {
            int i = indexOf$default + 1;
            int a2 = jh1.m37808a(this.f33305h, '/', i, a);
            String str2 = this.f33305h;
            if (str2 != null) {
                String substring = str2.substring(i, a2);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                indexOf$default = a2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String mo66955e() {
        if (this.f33303f == null) {
            return null;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f33305h, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f33305h;
        int a = jh1.m37808a(str, '#', indexOf$default, str.length());
        String str2 = this.f33305h;
        if (str2 != null) {
            String substring = str2.substring(indexOf$default, a);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof fc0) && Intrinsics.areEqual((Object) ((fc0) obj).f33305h, (Object) this.f33305h);
    }

    /* renamed from: f */
    public final String mo66957f() {
        if (this.f33299b.length() == 0) {
            return "";
        }
        int length = this.f33298a.length() + 3;
        String str = this.f33305h;
        int a = jh1.m37812a(str, ":@", length, str.length());
        String str2 = this.f33305h;
        if (str2 != null) {
            String substring = str2.substring(length, a);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: g */
    public final String mo66958g() {
        return this.f33301d;
    }

    /* renamed from: h */
    public final boolean mo66959h() {
        return this.f33306i;
    }

    public int hashCode() {
        return this.f33305h.hashCode();
    }

    /* renamed from: i */
    public final int mo66961i() {
        return this.f33302e;
    }

    /* renamed from: j */
    public final String mo66962j() {
        if (this.f33303f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f33296j.mo66986a(this.f33303f, sb);
        return sb.toString();
    }

    /* renamed from: l */
    public final String mo66964l() {
        return this.f33298a;
    }

    /* renamed from: m */
    public final URI mo66965m() {
        String str;
        C13043a aVar = new C13043a();
        aVar.mo66982i(this.f33298a);
        aVar.mo66980g(mo66957f());
        aVar.mo66979f(mo66952b());
        aVar.mo66981h(this.f33301d);
        aVar.mo66973b(this.f33302e != f33296j.mo66985a(this.f33298a) ? this.f33302e : -1);
        aVar.mo66975c().clear();
        aVar.mo66975c().addAll(mo66954d());
        aVar.mo66970a(mo66955e());
        if (this.f33304g == null) {
            str = null;
        } else {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f33305h, '#', 0, false, 6, (Object) null) + 1;
            String str2 = this.f33305h;
            if (str2 != null) {
                str = str2.substring(indexOf$default);
                Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        aVar.mo66978e(str);
        String aVar2 = aVar.mo66976d().toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace((CharSequence) aVar2, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge case: the URI has a forbidden character in the fragment. Strip it & retry.\n      try {\n        val stripped = uri.replace(Regex(\"[\\\\u0000-\\\\u001F\\\\u007F-\\\\u009F\\\\p{javaWhitespace}]\"), \"\")\n        URI.create(stripped)\n      } catch (e1: Exception) {\n        throw RuntimeException(e) // Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: n */
    public final URL mo66966n() {
        try {
            return new URL(this.f33305h);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f33305h;
    }

    /* renamed from: com.yandex.mobile.ads.impl.fc0$b */
    public static final class C13044b {
        private C13044b() {
        }

        public /* synthetic */ C13044b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final int mo66985a(String str) {
            Intrinsics.checkNotNullParameter(str, "scheme");
            if (Intrinsics.areEqual((Object) str, (Object) "http")) {
                return 80;
            }
            return Intrinsics.areEqual((Object) str, (Object) "https") ? 443 : -1;
        }

        /* renamed from: b */
        public final List<String> mo66987b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, (char) Typography.amp, i, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = str.length();
                }
                int i2 = indexOf$default;
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4, (Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > i2) {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i, indexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(indexOf$default2 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        /* renamed from: a */
        public final void mo66986a(List<String> list, StringBuilder sb) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(sb, "out");
            IntProgression step = RangesKt.step((IntProgression) RangesKt.until(0, list.size()), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                while (true) {
                    int i = first + step2;
                    String str = list.get(first);
                    String str2 = list.get(first + 1);
                    if (first > 0) {
                        sb.append(Typography.amp);
                    }
                    sb.append(str);
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                    if (first != last) {
                        first = i;
                    } else {
                        return;
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            if (r6 >= r9) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
            r8 = r7.codePointAt(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
            if (r8 != 37) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
            r0 = r6 + 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
            if (r0 >= r9) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
            r3 = com.yandex.mobile.ads.impl.jh1.m37807a(r7.charAt(r6 + 1));
            r4 = com.yandex.mobile.ads.impl.jh1.m37807a(r7.charAt(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
            if (r3 == -1) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
            if (r4 == -1) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
            r11.writeByte((r3 << 4) + r4);
            r6 = java.lang.Character.charCount(r8) + r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
            if (r8 != 43) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
            if (r10 == false) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
            r11.writeByte(32);
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
            r11.writeUtf8CodePoint(r8);
            r6 = r6 + java.lang.Character.charCount(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return r11.readUtf8();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m35982a(com.yandex.mobile.ads.impl.fc0.C13044b r6, java.lang.String r7, int r8, int r9, boolean r10, int r11) {
            /*
                r6 = r11 & 1
                r0 = 0
                if (r6 == 0) goto L_0x0006
                r8 = 0
            L_0x0006:
                r6 = r11 & 2
                if (r6 == 0) goto L_0x000e
                int r9 = r7.length()
            L_0x000e:
                r6 = r11 & 4
                if (r6 == 0) goto L_0x0013
                r10 = 0
            L_0x0013:
                java.lang.String r6 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
                if (r8 >= r9) goto L_0x0082
                r6 = r8
            L_0x001b:
                int r11 = r6 + 1
                char r0 = r7.charAt(r6)
                r1 = 43
                r2 = 37
                if (r0 == r2) goto L_0x0031
                if (r0 != r1) goto L_0x002c
                if (r10 == 0) goto L_0x002c
                goto L_0x0031
            L_0x002c:
                if (r11 < r9) goto L_0x002f
                goto L_0x0082
            L_0x002f:
                r6 = r11
                goto L_0x001b
            L_0x0031:
                okio.Buffer r11 = new okio.Buffer
                r11.<init>()
                r11.writeUtf8((java.lang.String) r7, (int) r8, (int) r6)
            L_0x0039:
                if (r6 >= r9) goto L_0x007d
                int r8 = r7.codePointAt(r6)
                if (r8 != r2) goto L_0x0068
                int r0 = r6 + 2
                if (r0 >= r9) goto L_0x0068
                int r3 = r6 + 1
                char r3 = r7.charAt(r3)
                int r3 = com.yandex.mobile.ads.impl.jh1.m37807a((char) r3)
                char r4 = r7.charAt(r0)
                int r4 = com.yandex.mobile.ads.impl.jh1.m37807a((char) r4)
                r5 = -1
                if (r3 == r5) goto L_0x0074
                if (r4 == r5) goto L_0x0074
                int r6 = r3 << 4
                int r6 = r6 + r4
                r11.writeByte((int) r6)
                int r6 = java.lang.Character.charCount(r8)
                int r6 = r6 + r0
                goto L_0x0039
            L_0x0068:
                if (r8 != r1) goto L_0x0074
                if (r10 == 0) goto L_0x0074
                r8 = 32
                r11.writeByte((int) r8)
                int r6 = r6 + 1
                goto L_0x0039
            L_0x0074:
                r11.writeUtf8CodePoint((int) r8)
                int r8 = java.lang.Character.charCount(r8)
                int r6 = r6 + r8
                goto L_0x0039
            L_0x007d:
                java.lang.String r6 = r11.readUtf8()
                goto L_0x008b
            L_0x0082:
                java.lang.String r6 = r7.substring(r8, r9)
                java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            L_0x008b:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fc0.C13044b.m35982a(com.yandex.mobile.ads.impl.fc0$b, java.lang.String, int, int, boolean, int):java.lang.String");
        }

        /* renamed from: a */
        private final boolean m35983a(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 >= i2 || str.charAt(i) != '%' || jh1.m37807a(str.charAt(i + 1)) == -1 || jh1.m37807a(str.charAt(i3)) == -1) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static String m35981a(C13044b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            C13044b bVar2 = bVar;
            String str3 = str;
            String str4 = str2;
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z5 = (i3 & 8) != 0 ? false : z;
            boolean z6 = (i3 & 16) != 0 ? false : z2;
            boolean z7 = (i3 & 32) != 0 ? false : z3;
            boolean z8 = (i3 & 64) != 0 ? false : z4;
            Intrinsics.checkNotNullParameter(str3, "<this>");
            Intrinsics.checkNotNullParameter(str4, "encodeSet");
            int i5 = i4;
            while (i5 < length) {
                int codePointAt = str3.codePointAt(i5);
                int i6 = 32;
                int i7 = 2;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z8) || StringsKt.contains$default((CharSequence) str4, (char) codePointAt, false, 2, (Object) null) || ((codePointAt == 37 && (!z5 || (z6 && !bVar2.m35983a(str3, i5, length)))) || (codePointAt == 43 && z7)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str3, i4, i5);
                    Buffer buffer2 = null;
                    while (i5 < length) {
                        int codePointAt2 = str3.codePointAt(i5);
                        if (!z5 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 != 43 || !z7) {
                                if (codePointAt2 >= i6 && codePointAt2 != 127 && (codePointAt2 < 128 || z8)) {
                                    if (!StringsKt.contains$default((CharSequence) str4, (char) codePointAt2, false, i7, (Object) null) && (codePointAt2 != 37 || (z5 && (!z6 || bVar2.m35983a(str3, i5, length))))) {
                                        buffer.writeUtf8CodePoint(codePointAt2);
                                        i5 += Character.charCount(codePointAt2);
                                        i7 = 2;
                                        i6 = 32;
                                    }
                                }
                                if (buffer2 == null) {
                                    buffer2 = new Buffer();
                                }
                                buffer2.writeUtf8CodePoint(codePointAt2);
                                while (!buffer2.exhausted()) {
                                    byte readByte = buffer2.readByte() & 255;
                                    buffer.writeByte(37);
                                    buffer.writeByte((int) fc0.f33297k[(readByte >> 4) & 15]);
                                    buffer.writeByte((int) fc0.f33297k[readByte & Ascii.f10109SI]);
                                }
                                i5 += Character.charCount(codePointAt2);
                                i7 = 2;
                                i6 = 32;
                            } else {
                                buffer.writeUtf8(z5 ? "+" : "%2B");
                            }
                        }
                        i5 += Character.charCount(codePointAt2);
                        i7 = 2;
                        i6 = 32;
                    }
                    return buffer.readUtf8();
                }
                i5 += Character.charCount(codePointAt);
            }
            String substring = str3.substring(i4, length);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
    }

    /* renamed from: k */
    public final String mo66963k() {
        C13043a aVar;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            aVar = new C13043a().mo66969a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        Intrinsics.checkNotNull(aVar);
        return aVar.mo66983j("").mo66974c("").mo66971a().f33305h;
    }
}
