package com.iab.omid.library.oguryco;

import com.iab.omid.library.oguryco.p116d.C4780e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.oguryco.c */
class C4769c {

    /* renamed from: a */
    private static final Pattern f10754a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    private static final Pattern f10755b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    private static final Pattern f10756c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    private static final Pattern f10757d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    private static final Pattern f10758e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    private static final Pattern f10759f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    private static final Pattern f10760g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    static String m10453a(String str, String str2) {
        return m10457b(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* renamed from: a */
    private static boolean m10454a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m10455a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m10454a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: a */
    private static int[][] m10456a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
    }

    /* renamed from: b */
    static String m10457b(String str, String str2) {
        C4780e.m10499a(str, "HTML is null or empty");
        int[][] a = m10456a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (m10458b(str, sb, f10755b, str2, a)) {
            return sb.toString();
        }
        if (m10455a(str, sb, f10754a, str2, a)) {
            return sb.toString();
        }
        if (m10458b(str, sb, f10757d, str2, a)) {
            return sb.toString();
        }
        if (m10455a(str, sb, f10756c, str2, a)) {
            return sb.toString();
        }
        if (m10458b(str, sb, f10759f, str2, a)) {
            return sb.toString();
        }
        if (m10455a(str, sb, f10758e, str2, a)) {
            return sb.toString();
        }
        if (m10455a(str, sb, f10760g, str2, a)) {
            return sb.toString();
        }
        return str2 + str;
    }

    /* renamed from: b */
    private static boolean m10458b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m10454a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
