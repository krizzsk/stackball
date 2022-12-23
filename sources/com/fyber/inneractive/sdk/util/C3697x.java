package com.fyber.inneractive.sdk.util;

import androidx.exifinterface.media.ExifInterface;
import com.adcolony.adcolonysdk.BuildConfig;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.UserDataStore;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.util.x */
public final class C3697x {

    /* renamed from: a */
    static final String[][] f9999a = {new String[]{"nbsp", "160"}, new String[]{"iexcl", "161"}, new String[]{"cent", "162"}, new String[]{"pound", "163"}, new String[]{"curren", "164"}, new String[]{"yen", "165"}, new String[]{"brvbar", "166"}, new String[]{"sect", "167"}, new String[]{"uml", "168"}, new String[]{"copy", "169"}, new String[]{"ordf", "170"}, new String[]{"laquo", "171"}, new String[]{"not", "172"}, new String[]{"shy", "173"}, new String[]{"reg", "174"}, new String[]{"macr", "175"}, new String[]{"deg", "176"}, new String[]{"plusmn", "177"}, new String[]{"sup2", "178"}, new String[]{"sup3", "179"}, new String[]{"acute", "180"}, new String[]{"micro", "181"}, new String[]{"para", "182"}, new String[]{"middot", "183"}, new String[]{"cedil", "184"}, new String[]{"sup1", "185"}, new String[]{"ordm", "186"}, new String[]{"raquo", "187"}, new String[]{"frac14", "188"}, new String[]{"frac12", "189"}, new String[]{"frac34", "190"}, new String[]{"iquest", "191"}, new String[]{"Agrave", "192"}, new String[]{"Aacute", "193"}, new String[]{"Acirc", "194"}, new String[]{"Atilde", "195"}, new String[]{"Auml", "196"}, new String[]{"Aring", "197"}, new String[]{"AElig", "198"}, new String[]{"Ccedil", "199"}, new String[]{"Egrave", "200"}, new String[]{"Eacute", "201"}, new String[]{"Ecirc", "202"}, new String[]{"Euml", "203"}, new String[]{"Igrave", "204"}, new String[]{"Iacute", "205"}, new String[]{"Icirc", "206"}, new String[]{"Iuml", "207"}, new String[]{"ETH", "208"}, new String[]{"Ntilde", "209"}, new String[]{"Ograve", "210"}, new String[]{"Oacute", "211"}, new String[]{"Ocirc", "212"}, new String[]{"Otilde", "213"}, new String[]{"Ouml", "214"}, new String[]{"times", "215"}, new String[]{"Oslash", "216"}, new String[]{"Ugrave", "217"}, new String[]{"Uacute", "218"}, new String[]{"Ucirc", "219"}, new String[]{"Uuml", "220"}, new String[]{"Yacute", "221"}, new String[]{"THORN", "222"}, new String[]{"szlig", "223"}, new String[]{"agrave", "224"}, new String[]{"aacute", "225"}, new String[]{"acirc", "226"}, new String[]{"atilde", "227"}, new String[]{"auml", "228"}, new String[]{"aring", "229"}, new String[]{"aelig", "230"}, new String[]{"ccedil", "231"}, new String[]{"egrave", "232"}, new String[]{"eacute", "233"}, new String[]{"ecirc", "234"}, new String[]{"euml", "235"}, new String[]{"igrave", "236"}, new String[]{"iacute", "237"}, new String[]{"icirc", "238"}, new String[]{"iuml", "239"}, new String[]{"eth", "240"}, new String[]{"ntilde", "241"}, new String[]{"ograve", "242"}, new String[]{"oacute", "243"}, new String[]{"ocirc", "244"}, new String[]{"otilde", "245"}, new String[]{"ouml", "246"}, new String[]{"divide", "247"}, new String[]{"oslash", "248"}, new String[]{"ugrave", "249"}, new String[]{"uacute", "250"}, new String[]{"ucirc", "251"}, new String[]{"uuml", "252"}, new String[]{"yacute", "253"}, new String[]{"thorn", "254"}, new String[]{"yuml", "255"}};

    /* renamed from: b */
    static final String[][] f10000b = {new String[]{"fnof", "402"}, new String[]{"Alpha", "913"}, new String[]{"Beta", "914"}, new String[]{ExifInterface.TAG_GAMMA, "915"}, new String[]{"Delta", "916"}, new String[]{"Epsilon", "917"}, new String[]{"Zeta", "918"}, new String[]{"Eta", "919"}, new String[]{"Theta", "920"}, new String[]{"Iota", "921"}, new String[]{"Kappa", "922"}, new String[]{"Lambda", "923"}, new String[]{"Mu", "924"}, new String[]{"Nu", "925"}, new String[]{"Xi", "926"}, new String[]{"Omicron", "927"}, new String[]{"Pi", "928"}, new String[]{"Rho", "929"}, new String[]{"Sigma", "931"}, new String[]{"Tau", "932"}, new String[]{"Upsilon", "933"}, new String[]{"Phi", "934"}, new String[]{"Chi", "935"}, new String[]{"Psi", "936"}, new String[]{"Omega", "937"}, new String[]{"alpha", "945"}, new String[]{"beta", "946"}, new String[]{"gamma", "947"}, new String[]{"delta", "948"}, new String[]{"epsilon", "949"}, new String[]{"zeta", "950"}, new String[]{"eta", "951"}, new String[]{"theta", "952"}, new String[]{"iota", "953"}, new String[]{"kappa", "954"}, new String[]{"lambda", "955"}, new String[]{"mu", "956"}, new String[]{"nu", "957"}, new String[]{"xi", "958"}, new String[]{"omicron", "959"}, new String[]{"pi", "960"}, new String[]{"rho", "961"}, new String[]{"sigmaf", "962"}, new String[]{"sigma", "963"}, new String[]{"tau", "964"}, new String[]{"upsilon", "965"}, new String[]{"phi", "966"}, new String[]{"chi", "967"}, new String[]{"psi", "968"}, new String[]{"omega", "969"}, new String[]{"thetasym", "977"}, new String[]{"upsih", "978"}, new String[]{"piv", "982"}, new String[]{"bull", "8226"}, new String[]{"hellip", "8230"}, new String[]{"prime", "8242"}, new String[]{"Prime", "8243"}, new String[]{"oline", "8254"}, new String[]{"frasl", "8260"}, new String[]{"weierp", "8472"}, new String[]{"image", "8465"}, new String[]{"real", "8476"}, new String[]{"trade", "8482"}, new String[]{"alefsym", "8501"}, new String[]{"larr", "8592"}, new String[]{"uarr", "8593"}, new String[]{"rarr", "8594"}, new String[]{"darr", "8595"}, new String[]{"harr", "8596"}, new String[]{"crarr", "8629"}, new String[]{"lArr", "8656"}, new String[]{"uArr", "8657"}, new String[]{"rArr", "8658"}, new String[]{"dArr", "8659"}, new String[]{"hArr", "8660"}, new String[]{"forall", "8704"}, new String[]{"part", "8706"}, new String[]{"exist", "8707"}, new String[]{"empty", "8709"}, new String[]{"nabla", "8711"}, new String[]{"isin", "8712"}, new String[]{"notin", "8713"}, new String[]{"ni", "8715"}, new String[]{BuildConfig.FLAVOR, "8719"}, new String[]{"sum", "8721"}, new String[]{"minus", "8722"}, new String[]{"lowast", "8727"}, new String[]{"radic", "8730"}, new String[]{"prop", "8733"}, new String[]{"infin", "8734"}, new String[]{"ang", "8736"}, new String[]{"and", "8743"}, new String[]{"or", "8744"}, new String[]{"cap", "8745"}, new String[]{"cup", "8746"}, new String[]{"int", "8747"}, new String[]{"there4", "8756"}, new String[]{"sim", "8764"}, new String[]{"cong", "8773"}, new String[]{"asymp", "8776"}, new String[]{"ne", "8800"}, new String[]{"equiv", "8801"}, new String[]{"le", "8804"}, new String[]{UserDataStore.GENDER, "8805"}, new String[]{"sub", "8834"}, new String[]{"sup", "8835"}, new String[]{"sube", "8838"}, new String[]{"supe", "8839"}, new String[]{"oplus", "8853"}, new String[]{"otimes", "8855"}, new String[]{"perp", "8869"}, new String[]{"sdot", "8901"}, new String[]{"lceil", "8968"}, new String[]{"rceil", "8969"}, new String[]{"lfloor", "8970"}, new String[]{"rfloor", "8971"}, new String[]{ServerParameters.LANG, "9001"}, new String[]{"rang", "9002"}, new String[]{"loz", "9674"}, new String[]{"spades", "9824"}, new String[]{"clubs", "9827"}, new String[]{"hearts", "9829"}, new String[]{"diams", "9830"}, new String[]{"OElig", "338"}, new String[]{"oelig", "339"}, new String[]{"Scaron", "352"}, new String[]{"scaron", "353"}, new String[]{"Yuml", "376"}, new String[]{"circ", "710"}, new String[]{"tilde", "732"}, new String[]{"ensp", "8194"}, new String[]{"emsp", "8195"}, new String[]{"thinsp", "8201"}, new String[]{"zwnj", "8204"}, new String[]{"zwj", "8205"}, new String[]{"lrm", "8206"}, new String[]{"rlm", "8207"}, new String[]{"ndash", "8211"}, new String[]{"mdash", "8212"}, new String[]{"lsquo", "8216"}, new String[]{"rsquo", "8217"}, new String[]{"sbquo", "8218"}, new String[]{"ldquo", "8220"}, new String[]{"rdquo", "8221"}, new String[]{"bdquo", "8222"}, new String[]{"dagger", "8224"}, new String[]{"Dagger", "8225"}, new String[]{"permil", "8240"}, new String[]{"lsaquo", "8249"}, new String[]{"rsaquo", "8250"}, new String[]{"euro", "8364"}};

    /* renamed from: c */
    public static final C3697x f10001c;

    /* renamed from: d */
    public static final C3697x f10002d;

    /* renamed from: e */
    public static final C3697x f10003e;

    /* renamed from: g */
    private static final String[][] f10004g = {new String[]{"quot", "34"}, new String[]{"amp", "38"}, new String[]{"lt", "60"}, new String[]{"gt", "62"}};

    /* renamed from: h */
    private static final String[][] f10005h = {new String[]{"apos", "39"}};

    /* renamed from: f */
    C3698a f10006f = new C3699b();

    /* renamed from: com.fyber.inneractive.sdk.util.x$a */
    interface C3698a {
        /* renamed from: a */
        int mo19602a(String str);

        /* renamed from: a */
        void mo19603a(String str, int i);
    }

    static {
        C3697x xVar = new C3697x();
        f10001c = xVar;
        xVar.m9203a(f10004g);
        f10001c.m9203a(f10005h);
        C3697x xVar2 = new C3697x();
        f10002d = xVar2;
        xVar2.m9203a(f10004g);
        f10002d.m9203a(f9999a);
        C3697x xVar3 = new C3697x();
        f10003e = xVar3;
        xVar3.m9203a(f10004g);
        xVar3.m9203a(f9999a);
        xVar3.m9203a(f10000b);
        xVar3.m9203a(f10005h);
    }

    /* renamed from: com.fyber.inneractive.sdk.util.x$c */
    static class C3700c implements C3698a {

        /* renamed from: a */
        private Map f10008a = new HashMap();

        /* renamed from: b */
        private C3701y f10009b = new C3701y();

        C3700c() {
        }

        /* renamed from: a */
        public final void mo19603a(String str, int i) {
            this.f10008a.put(str, Integer.valueOf(i));
            this.f10009b.mo19604a(i, str);
        }

        /* renamed from: a */
        public final int mo19602a(String str) {
            Object obj = this.f10008a.get(str);
            if (obj == null) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.x$b */
    static class C3699b extends C3700c {

        /* renamed from: a */
        private int f10007a = 256;

        C3699b() {
        }
    }

    /* renamed from: a */
    private void m9203a(String[][] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            this.f10006f.mo19603a(strArr[i][0], Integer.parseInt(strArr[i][1]));
        }
    }

    /* renamed from: a */
    public final String mo19601a(String str) {
        int indexOf = str.indexOf(38);
        if (indexOf < 0) {
            return str;
        }
        StringWriter stringWriter = new StringWriter((int) (((double) str.length()) + (((double) str.length()) * 0.1d)));
        try {
            m9202a(stringWriter, str, indexOf);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r2 > 65535) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9202a(java.io.Writer r11, java.lang.String r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            r11.write(r12, r0, r13)
            int r1 = r12.length()
        L_0x0008:
            if (r13 >= r1) goto L_0x0088
            char r2 = r12.charAt(r13)
            r3 = 38
            r4 = 1
            if (r2 != r3) goto L_0x0083
            int r5 = r13 + 1
            r6 = 59
            int r7 = r12.indexOf(r6, r5)
            r8 = -1
            if (r7 != r8) goto L_0x0022
            r11.write(r2)
            goto L_0x0086
        L_0x0022:
            int r9 = r12.indexOf(r3, r5)
            if (r9 == r8) goto L_0x002e
            if (r9 >= r7) goto L_0x002e
            r11.write(r2)
            goto L_0x0086
        L_0x002e:
            java.lang.String r13 = r12.substring(r5, r7)
            int r2 = r13.length()
            if (r2 <= 0) goto L_0x0071
            char r5 = r13.charAt(r0)
            r9 = 35
            if (r5 != r9) goto L_0x006a
            if (r2 <= r4) goto L_0x0071
            char r2 = r13.charAt(r4)
            r5 = 88
            if (r2 == r5) goto L_0x0059
            r5 = 120(0x78, float:1.68E-43)
            if (r2 == r5) goto L_0x0059
            java.lang.String r2 = r13.substring(r4)     // Catch:{ NumberFormatException -> 0x0071 }
            r5 = 10
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ NumberFormatException -> 0x0071 }
            goto L_0x0064
        L_0x0059:
            r2 = 2
            java.lang.String r2 = r13.substring(r2)     // Catch:{ NumberFormatException -> 0x0071 }
            r5 = 16
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ NumberFormatException -> 0x0071 }
        L_0x0064:
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r2 <= r5) goto L_0x0072
            goto L_0x0071
        L_0x006a:
            com.fyber.inneractive.sdk.util.x$a r2 = r10.f10006f
            int r2 = r2.mo19602a(r13)
            goto L_0x0072
        L_0x0071:
            r2 = -1
        L_0x0072:
            if (r2 != r8) goto L_0x007e
            r11.write(r3)
            r11.write(r13)
            r11.write(r6)
            goto L_0x0081
        L_0x007e:
            r11.write(r2)
        L_0x0081:
            r13 = r7
            goto L_0x0086
        L_0x0083:
            r11.write(r2)
        L_0x0086:
            int r13 = r13 + r4
            goto L_0x0008
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3697x.m9202a(java.io.Writer, java.lang.String, int):void");
    }
}
