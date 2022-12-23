package com.iab.omid.library.inmobi;

import com.iab.omid.library.inmobi.p104d.C4680e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.inmobi.b */
class C4661b {

    /* renamed from: a */
    private static final Pattern f10500a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    private static final Pattern f10501b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    private static final Pattern f10502c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    private static final Pattern f10503d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    private static final Pattern f10504e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    private static final Pattern f10505f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    private static final Pattern f10506g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    static String m9965a(String str, String str2) {
        return m9969b(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* renamed from: a */
    private static boolean m9966a(int i, int[][] iArr) {
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
    private static boolean m9967a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m9966a(start, iArr)) {
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
    private static int[][] m9968a(String str) {
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
    static String m9969b(String str, String str2) {
        C4680e.m10056a(str, "HTML is null or empty");
        int[][] a = m9968a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (m9970b(str, sb, f10501b, str2, a)) {
            return sb.toString();
        }
        if (m9967a(str, sb, f10500a, str2, a)) {
            return sb.toString();
        }
        if (m9970b(str, sb, f10503d, str2, a)) {
            return sb.toString();
        }
        if (m9967a(str, sb, f10502c, str2, a)) {
            return sb.toString();
        }
        if (m9970b(str, sb, f10505f, str2, a)) {
            return sb.toString();
        }
        if (m9967a(str, sb, f10504e, str2, a)) {
            return sb.toString();
        }
        if (m9967a(str, sb, f10506g, str2, a)) {
            return sb.toString();
        }
        return str2 + str;
    }

    /* renamed from: b */
    private static boolean m9970b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m9966a(start, iArr)) {
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
