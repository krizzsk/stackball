package com.mbridge.msdk.interactiveads.p184a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6150h;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.interactiveads.a.c */
/* compiled from: PrepareParamManager */
public class C6397c {

    /* renamed from: b */
    private static volatile C6397c f15904b;

    /* renamed from: a */
    public JSONArray f15905a;

    /* renamed from: c */
    private WeakReference<Context> f15906c;

    /* renamed from: d */
    private boolean f15907d;

    private C6397c(Context context) {
        this.f15906c = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C6397c m16305a(Context context) {
        if (f15904b == null) {
            synchronized (C6397c.class) {
                if (f15904b == null) {
                    f15904b = new C6397c(context);
                }
            }
        }
        return f15904b;
    }

    /* renamed from: a */
    public final C6086d mo44027a() {
        return C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), C6121a.m15293a().mo42882b("interactive_unitid"));
    }

    /* renamed from: a */
    public final List<CampaignEx> mo44028a(String str, int i) {
        List<CampaignEx> g;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (g = C6143d.m15367a((C6146e) C6148f.m15420a((Context) this.f15906c.get())).mo42992g(str)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : g) {
                    if (next != null) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: b */
    public final String mo44030b() {
        String str = "";
        try {
            JSONArray a = C6366u.m16194a(C6122a.m15302b().mo42895d(), C6121a.m15293a().mo42882b("interactive_unitid"));
            if (a.length() > 0) {
                str = C6366u.m16192a(a);
            }
            List<String> a2 = m16306a(this.f15905a);
            if (a2 == null) {
                return str;
            }
            String[] strArr = null;
            if (str != null && str.length() > 0) {
                int length = str.length();
                int indexOf = str.indexOf("[") + 1;
                int indexOf2 = str.indexOf("]");
                if (indexOf <= length && indexOf2 <= length && indexOf <= indexOf2) {
                    str = str.subSequence(indexOf, indexOf2).toString();
                }
                strArr = str.split(",");
            }
            if (strArr != null && strArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    a2.add(i, strArr[i]);
                }
            }
            return a2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: b */
    public final String mo44031b(String str, int i) {
        ArrayList arrayList = new ArrayList();
        List<CampaignEx> a = mo44028a(str, i);
        if (a != null) {
            for (CampaignEx id : a) {
                arrayList.add(id.getId());
            }
        }
        return arrayList.toString();
    }

    /* renamed from: c */
    public final String mo44032c() {
        try {
            return C6150h.m15433a((C6146e) C6148f.m15420a((Context) this.f15906c.get())).mo43008a();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public final boolean mo44033d() {
        return this.f15907d;
    }

    /* renamed from: a */
    public final void mo44029a(boolean z) {
        this.f15907d = z;
    }

    /* renamed from: a */
    private List<String> m16306a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add((String) jSONArray.get(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
