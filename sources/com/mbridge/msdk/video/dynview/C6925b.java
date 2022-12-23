package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.b */
/* compiled from: ViewOption */
public final class C6925b {

    /* renamed from: a */
    private Context f17067a;

    /* renamed from: b */
    private String f17068b;

    /* renamed from: c */
    private int f17069c;

    /* renamed from: d */
    private float f17070d;

    /* renamed from: e */
    private float f17071e;

    /* renamed from: f */
    private int f17072f;

    /* renamed from: g */
    private int f17073g;

    /* renamed from: h */
    private View f17074h;

    /* renamed from: i */
    private List<CampaignEx> f17075i;

    /* renamed from: com.mbridge.msdk.video.dynview.b$b */
    /* compiled from: ViewOption */
    public interface C6928b {
        /* renamed from: a */
        C6928b mo48428a(float f);

        /* renamed from: a */
        C6928b mo48429a(int i);

        /* renamed from: a */
        C6928b mo48430a(Context context);

        /* renamed from: a */
        C6928b mo48431a(View view);

        /* renamed from: a */
        C6928b mo48432a(String str);

        /* renamed from: a */
        C6928b mo48433a(List<CampaignEx> list);

        /* renamed from: a */
        C6925b mo48434a();

        /* renamed from: b */
        C6928b mo48435b(float f);

        /* renamed from: b */
        C6928b mo48436b(int i);

        /* renamed from: c */
        C6928b mo48437c(int i);
    }

    /* renamed from: a */
    public final Context mo48420a() {
        return this.f17067a;
    }

    /* renamed from: b */
    public final String mo48421b() {
        return this.f17068b;
    }

    /* renamed from: c */
    public final float mo48422c() {
        return this.f17070d;
    }

    /* renamed from: d */
    public final float mo48423d() {
        return this.f17071e;
    }

    /* renamed from: e */
    public final int mo48424e() {
        return this.f17072f;
    }

    /* renamed from: f */
    public final View mo48425f() {
        return this.f17074h;
    }

    /* renamed from: g */
    public final List<CampaignEx> mo48426g() {
        return this.f17075i;
    }

    /* renamed from: h */
    public final int mo48427h() {
        return this.f17069c;
    }

    private C6925b(C6927a aVar) {
        this.f17071e = aVar.f17080e;
        this.f17070d = aVar.f17079d;
        this.f17072f = aVar.f17081f;
        this.f17073g = aVar.f17082g;
        this.f17067a = aVar.f17076a;
        this.f17068b = aVar.f17077b;
        this.f17069c = aVar.f17078c;
        this.f17074h = aVar.f17083h;
        this.f17075i = aVar.f17084i;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.b$a */
    /* compiled from: ViewOption */
    public static class C6927a implements C6928b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f17076a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f17077b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f17078c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f17079d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public float f17080e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f17081f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f17082g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public View f17083h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public List<CampaignEx> f17084i;

        /* renamed from: a */
        public final C6928b mo48430a(Context context) {
            this.f17076a = context.getApplicationContext();
            return this;
        }

        /* renamed from: a */
        public final C6928b mo48432a(String str) {
            this.f17077b = str;
            return this;
        }

        /* renamed from: a */
        public final C6928b mo48429a(int i) {
            this.f17078c = i;
            return this;
        }

        /* renamed from: a */
        public final C6928b mo48428a(float f) {
            this.f17079d = f;
            return this;
        }

        /* renamed from: b */
        public final C6928b mo48435b(float f) {
            this.f17080e = f;
            return this;
        }

        /* renamed from: b */
        public final C6928b mo48436b(int i) {
            this.f17081f = i;
            return this;
        }

        /* renamed from: c */
        public final C6928b mo48437c(int i) {
            this.f17082g = i;
            return this;
        }

        /* renamed from: a */
        public final C6928b mo48431a(View view) {
            this.f17083h = view;
            return this;
        }

        /* renamed from: a */
        public final C6928b mo48433a(List<CampaignEx> list) {
            this.f17084i = list;
            return this;
        }

        /* renamed from: a */
        public final C6925b mo48434a() {
            return new C6925b(this);
        }
    }
}
