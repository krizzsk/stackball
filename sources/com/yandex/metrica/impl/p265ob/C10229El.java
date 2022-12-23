package com.yandex.metrica.impl.p265ob;

import com.appsflyer.share.Constants;
import com.yandex.metrica.impl.p265ob.C10893Wl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.El */
public class C10229El extends C10893Wl {

    /* renamed from: h */
    public String f24607h;

    /* renamed from: i */
    public final int f24608i;

    /* renamed from: j */
    public Integer f24609j;

    /* renamed from: k */
    public final boolean f24610k;

    /* renamed from: l */
    public final C10231b f24611l;

    /* renamed from: m */
    public final Float f24612m;

    /* renamed from: n */
    public final Float f24613n;

    /* renamed from: o */
    public final Float f24614o;

    /* renamed from: p */
    public final String f24615p;

    /* renamed from: q */
    public final Boolean f24616q;

    /* renamed from: r */
    public final Boolean f24617r;

    /* renamed from: s */
    public Integer f24618s;

    /* renamed from: com.yandex.metrica.impl.ob.El$a */
    static /* synthetic */ class C10230a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24619a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.text.TextUtils$TruncateAt[] r0 = android.text.TextUtils.TruncateAt.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24619a = r0
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24619a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24619a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24619a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MARQUEE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10229El.C10230a.<clinit>():void");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.El$b */
    enum C10231b {
        START("START"),
        END("END"),
        MIDDLE("MIDDLE"),
        MARQUEE("MARQUEE"),
        NONE("NONE"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: a */
        final String f24627a;

        private C10231b(String str) {
            this.f24627a = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10229El(String str, String str2, C10893Wl.C10895b bVar, int i, boolean z, C10893Wl.C10894a aVar, String str3, Float f, Float f2, Float f3, String str4, Boolean bool, Boolean bool2, boolean z2, int i2, C10231b bVar2) {
        super(str, str2, (C10893Wl.C10895b) null, i, z, C10893Wl.C10896c.VIEW, aVar);
        this.f24607h = str3;
        this.f24608i = i2;
        this.f24611l = bVar2;
        this.f24610k = z2;
        this.f24612m = f;
        this.f24613n = f2;
        this.f24614o = f3;
        this.f24615p = str4;
        this.f24616q = bool;
        this.f24617r = bool2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10893Wl.C10895b mo61245a(C11090bl blVar) {
        C10893Wl.C10895b bVar = this.f26180c;
        return bVar == null ? blVar.mo62704a(this.f24607h) : bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo61247a() {
        return true;
    }

    public String toString() {
        return "TextViewElement{mText='" + this.f24607h + '\'' + ", mVisibleTextLength=" + this.f24608i + ", mOriginalTextLength=" + this.f24609j + ", mIsVisible=" + this.f24610k + ", mTextShorteningType=" + this.f24611l + ", mSizePx=" + this.f24612m + ", mSizeDp=" + this.f24613n + ", mSizeSp=" + this.f24614o + ", mColor='" + this.f24615p + '\'' + ", mIsBold=" + this.f24616q + ", mIsItalic=" + this.f24617r + ", mRelativeTextSize=" + this.f24618s + ", mClassName='" + this.f26178a + '\'' + ", mId='" + this.f26179b + '\'' + ", mParseFilterReason=" + this.f26180c + ", mDepth=" + this.f26181d + ", mListItem=" + this.f26182e + ", mViewType=" + this.f26183f + ", mClassType=" + this.f26184g + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo61246a(C10437Kl kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f24607h;
            if (str.length() > kl.f25074l) {
                this.f24609j = Integer.valueOf(this.f24607h.length());
                str = this.f24607h.substring(0, kl.f25074l);
            }
            jSONObject.put("t", "TEXT");
            jSONObject.put("vl", str);
            jSONObject.put("i", m26213a(kl, str));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m26213a(C10437Kl kl, String str) {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            if (kl.f25063a) {
                jSONObject.putOpt("sp", this.f24612m).putOpt("sd", this.f24613n).putOpt("ss", this.f24614o);
            }
            if (kl.f25064b) {
                jSONObject.put("rts", this.f24618s);
            }
            if (kl.f25066d) {
                jSONObject.putOpt(Constants.URL_CAMPAIGN, this.f24615p).putOpt("ib", this.f24616q).putOpt("ii", this.f24617r);
            }
            if (kl.f25065c) {
                jSONObject.put("vtl", this.f24608i).put("iv", this.f24610k).put("tst", this.f24611l.f24627a);
            }
            Integer num = this.f24609j;
            if (num != null) {
                i = num.intValue();
            } else {
                i = this.f24607h.length();
            }
            if (kl.f25069g) {
                jSONObject.put("tl", str.length()).put("otl", i);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
