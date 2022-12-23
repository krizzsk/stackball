package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.p243my.target.common.models.ImageData;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.g0 */
public class C7409g0 {

    /* renamed from: a */
    public final C7596p1 f18602a;

    /* renamed from: b */
    public final C7432h0 f18603b;

    /* renamed from: c */
    public final C7410a f18604c;

    /* renamed from: d */
    public WeakReference<C7722w5> f18605d;

    /* renamed from: com.my.target.g0$a */
    public class C7410a implements View.OnClickListener {

        /* renamed from: a */
        public final String f18606a;

        public C7410a(String str) {
            this.f18606a = str;
        }

        public void onClick(View view) {
            Context context = view.getContext();
            C7432h0 h0Var = C7409g0.this.f18603b;
            if (h0Var == null) {
                C7534l8.m19712a(this.f18606a, context);
            } else if (!h0Var.mo50266c()) {
                C7409g0.this.f18603b.mo50260a(context);
            }
        }
    }

    /* renamed from: com.my.target.g0$b */
    public interface C7411b {
        /* renamed from: a */
        void mo49488a(Context context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.my.target.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.my.target.g0$a} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7409g0(com.p243my.target.C7596p1 r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.f18602a = r4
            r0 = 0
            if (r4 != 0) goto L_0x000d
            r3.f18603b = r0
        L_0x000a:
            r3.f18604c = r0
            return
        L_0x000d:
            java.util.List r1 = r4.mo51315a()
            if (r1 == 0) goto L_0x001d
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x001d
            com.my.target.h0 r0 = com.p243my.target.C7432h0.m19222a((java.util.List<com.p243my.target.C7596p1.C7597a>) r1)
        L_0x001d:
            r3.f18603b = r0
            com.my.target.g0$a r0 = new com.my.target.g0$a
            java.lang.String r4 = r4.mo51317b()
            r0.<init>(r4)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7409g0.<init>(com.my.target.p1):void");
    }

    /* renamed from: a */
    public static C7409g0 m19159a(C7596p1 p1Var) {
        return new C7409g0(p1Var);
    }

    /* renamed from: a */
    public void mo50160a() {
        C7432h0 h0Var = this.f18603b;
        if (h0Var != null) {
            h0Var.mo50261a((C7411b) null);
        }
        WeakReference<C7722w5> weakReference = this.f18605d;
        C7722w5 w5Var = weakReference != null ? (C7722w5) weakReference.get() : null;
        if (w5Var != null) {
            C7596p1 p1Var = this.f18602a;
            if (p1Var != null) {
                C7509k8.m19619a(p1Var.mo51318c(), (ImageView) w5Var);
            }
            mo50161a(w5Var);
            this.f18605d.clear();
            this.f18605d = null;
        }
    }

    /* renamed from: a */
    public void mo50161a(C7722w5 w5Var) {
        w5Var.setImageBitmap((Bitmap) null);
        w5Var.setVisibility(8);
        w5Var.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: a */
    public void mo50162a(C7722w5 w5Var, C7411b bVar) {
        if (this.f18602a == null) {
            mo50161a(w5Var);
            return;
        }
        C7432h0 h0Var = this.f18603b;
        if (h0Var != null) {
            h0Var.mo50261a(bVar);
        }
        this.f18605d = new WeakReference<>(w5Var);
        w5Var.setVisibility(0);
        w5Var.setOnClickListener(this.f18604c);
        ImageData c = this.f18602a.mo51318c();
        Bitmap bitmap = c.getBitmap();
        if (c.getBitmap() != null) {
            w5Var.setImageBitmap(bitmap);
        } else {
            C7509k8.m19623b(c, w5Var);
        }
    }
}
