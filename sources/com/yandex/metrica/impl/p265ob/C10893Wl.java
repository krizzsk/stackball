package com.yandex.metrica.impl.p265ob;

import com.facebook.appevents.UserDataStore;
import com.facebook.share.internal.ShareConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Wl */
public class C10893Wl {

    /* renamed from: a */
    public final String f26178a;

    /* renamed from: b */
    public final String f26179b;

    /* renamed from: c */
    public final C10895b f26180c;

    /* renamed from: d */
    public final int f26181d;

    /* renamed from: e */
    public final boolean f26182e;

    /* renamed from: f */
    public final C10896c f26183f;

    /* renamed from: g */
    public final C10894a f26184g;

    /* renamed from: com.yandex.metrica.impl.ob.Wl$a */
    enum C10894a {
        LIST("LIST"),
        LABEL("LABEL"),
        BUTTON("BUTTON"),
        CONTAINER("CONTAINER"),
        TOOLBAR("TOOLBAR"),
        INPUT("INPUT"),
        f26191h(ShareConstants.IMAGE_URL),
        WEBVIEW("WEBVIEW"),
        OTHER("OTHER");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f26195a;

        private C10894a(String str) {
            this.f26195a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Wl$b */
    enum C10895b {
        TEXT_TOO_LONG("TEXT_TOO_LONG"),
        REGEXP_NOT_MATCHED("REGEXP_NOT_MATCHED"),
        IRRELEVANT_CLASS("IRRELEVANT_CLASS"),
        BAD_REGEXP_MATCHED("BAD_REGEXP_MATCHED"),
        EQUALS("EQUALS"),
        CONTAINS("CONTAINS");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f26203a;

        private C10895b(String str) {
            this.f26203a = str;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Wl$c */
    enum C10896c {
        VIEW_CONTAINER("VIEW_CONTAINER"),
        VIEW("VIEW");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f26207a;

        private C10896c(String str) {
            this.f26207a = str;
        }
    }

    C10893Wl(String str, String str2, C10895b bVar, int i, boolean z, C10896c cVar, C10894a aVar) {
        this.f26178a = str;
        this.f26179b = str2;
        this.f26180c = bVar;
        this.f26181d = i;
        this.f26182e = z;
        this.f26183f = cVar;
        this.f26184g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10895b mo61245a(C11090bl blVar) {
        return this.f26180c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo61246a(C10437Kl kl) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo61247a() {
        return false;
    }

    public String toString() {
        return "UiElement{mClassName='" + this.f26178a + '\'' + ", mId='" + this.f26179b + '\'' + ", mParseFilterReason=" + this.f26180c + ", mDepth=" + this.f26181d + ", mListItem=" + this.f26182e + ", mViewType=" + this.f26183f + ", mClassType=" + this.f26184g + '}';
    }

    /* renamed from: a */
    public JSONObject mo62459a(C10437Kl kl, C10895b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f26183f.f26207a);
            if (bVar == null) {
                jSONObject.put("cnt", mo61246a(kl));
            }
            if (kl.f25067e) {
                JSONObject put = new JSONObject().put(UserDataStore.CITY, this.f26184g.f26195a).put("cn", this.f26178a).put("rid", this.f26179b).put("d", this.f26181d).put("lc", this.f26182e).put("if", bVar != null);
                if (bVar != null) {
                    put.put("fr", bVar.f26203a);
                }
                jSONObject.put("i", put);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
