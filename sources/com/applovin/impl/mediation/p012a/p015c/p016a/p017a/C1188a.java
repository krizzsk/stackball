package com.applovin.impl.mediation.p012a.p015c.p016a.p017a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.p012a.p013a.C1174c;
import com.applovin.impl.mediation.p012a.p013a.C1176d;
import com.applovin.impl.sdk.utils.C1518f;
import com.applovin.sdk.C1701R;

/* renamed from: com.applovin.impl.mediation.a.c.a.a.a */
public class C1188a extends C1174c {

    /* renamed from: d */
    private final C1176d f2259d;

    /* renamed from: e */
    private final Context f2260e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1188a(C1176d dVar, Context context) {
        super(dVar.mo12169a() == C1176d.C1177a.MISSING ? C1174c.C1175a.SIMPLE : C1174c.C1175a.DETAIL);
        this.f2259d = dVar;
        this.f2260e = context;
    }

    /* renamed from: a */
    private SpannedString m1924a(String str, int i) {
        return m1925a(str, i, 16);
    }

    /* renamed from: a */
    private SpannedString m1925a(String str, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    /* renamed from: l */
    private SpannedString m1926l() {
        int i;
        String str;
        if (this.f2259d.mo12171c()) {
            if (!TextUtils.isEmpty(this.f2259d.mo12176g())) {
                str = "SDK " + this.f2259d.mo12176g();
            } else {
                str = this.f2259d.mo12173d() ? "Retrieving SDK Version..." : "SDK Found";
            }
            i = -7829368;
        } else {
            i = SupportMenu.CATEGORY_MASK;
            str = "SDK Missing";
        }
        return m1924a(str, i);
    }

    /* renamed from: m */
    private SpannedString m1927m() {
        int i;
        String str;
        if (this.f2259d.mo12173d()) {
            if (!TextUtils.isEmpty(this.f2259d.mo12177h())) {
                str = "Adapter " + this.f2259d.mo12177h();
            } else {
                str = "Adapter Found";
            }
            i = -7829368;
        } else {
            i = SupportMenu.CATEGORY_MASK;
            str = "Adapter Missing";
        }
        return m1924a(str, i);
    }

    /* renamed from: n */
    private SpannedString m1928n() {
        return m1924a("Invalid Integration", SupportMenu.CATEGORY_MASK);
    }

    /* renamed from: o */
    private SpannedString m1929o() {
        return m1924a("Latest Version: Adapter " + this.f2259d.mo12178i(), Color.rgb(255, 127, 0));
    }

    /* renamed from: b */
    public boolean mo12157b() {
        return this.f2259d.mo12169a() != C1176d.C1177a.MISSING;
    }

    /* renamed from: c */
    public SpannedString mo12158c() {
        if (this.f2205b != null) {
            return this.f2205b;
        }
        this.f2205b = m1925a(this.f2259d.mo12175f(), this.f2259d.mo12169a() == C1176d.C1177a.MISSING ? -7829368 : ViewCompat.MEASURED_STATE_MASK, 18);
        return this.f2205b;
    }

    /* renamed from: d */
    public SpannedString mo12159d() {
        if (this.f2206c != null) {
            return this.f2206c;
        }
        if (this.f2259d.mo12169a() != C1176d.C1177a.MISSING) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(m1926l());
            spannableStringBuilder.append(m1924a(", ", -7829368));
            spannableStringBuilder.append(m1927m());
            if (this.f2259d.mo12174e()) {
                spannableStringBuilder.append(new SpannableString("\n"));
                spannableStringBuilder.append(m1929o());
            }
            if (this.f2259d.mo12169a() == C1176d.C1177a.INVALID_INTEGRATION) {
                spannableStringBuilder.append(new SpannableString("\n"));
                spannableStringBuilder.append(m1928n());
            }
            this.f2206c = new SpannedString(spannableStringBuilder);
        } else {
            this.f2206c = new SpannedString("");
        }
        return this.f2206c;
    }

    /* renamed from: g */
    public int mo12162g() {
        int j = this.f2259d.mo12179j();
        return j > 0 ? j : C1701R.C1702drawable.applovin_ic_mediation_placeholder_network;
    }

    /* renamed from: i */
    public int mo12164i() {
        return mo12157b() ? C1701R.C1702drawable.applovin_ic_disclosure_arrow : super.mo12162g();
    }

    /* renamed from: j */
    public int mo12165j() {
        return C1518f.m3427a(C1701R.color.applovin_sdk_disclosureButtonColor, this.f2260e);
    }

    /* renamed from: k */
    public C1176d mo12212k() {
        return this.f2259d;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + this.f2205b + ", detailText=" + this.f2206c + ", network=" + this.f2259d + "}";
    }
}
