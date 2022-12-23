package com.fyber.inneractive.sdk.player.p059c;

import com.fyber.inneractive.sdk.player.p059c.p061b.C3225d;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3456e;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3542g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.a */
public abstract class C3188a implements C3297n, C3298o {

    /* renamed from: a */
    protected C3299p f7920a;

    /* renamed from: b */
    protected int f7921b;

    /* renamed from: c */
    protected int f7922c;

    /* renamed from: d */
    protected C3456e f7923d;

    /* renamed from: e */
    protected long f7924e;

    /* renamed from: f */
    protected boolean f7925f = true;

    /* renamed from: g */
    protected boolean f7926g;

    /* renamed from: h */
    private final int f7927h;

    /* renamed from: a */
    public void mo18875a(int i, Object obj) throws C3236d {
    }

    /* renamed from: a */
    public void mo18877a(long j, boolean z) throws C3236d {
    }

    /* renamed from: a */
    public void mo18879a(boolean z) throws C3236d {
    }

    /* renamed from: a */
    public void mo18880a(C3290h[] hVarArr) throws C3236d {
    }

    /* renamed from: b */
    public final C3298o mo18882b() {
        return this;
    }

    /* renamed from: c */
    public C3542g mo18883c() {
        return null;
    }

    /* renamed from: m */
    public int mo18893m() throws C3236d {
        return 0;
    }

    /* renamed from: n */
    public void mo18894n() throws C3236d {
    }

    /* renamed from: o */
    public void mo18895o() throws C3236d {
    }

    /* renamed from: p */
    public void mo18896p() {
    }

    public C3188a(int i) {
        this.f7927h = i;
    }

    /* renamed from: a */
    public final int mo18872a() {
        return this.f7927h;
    }

    /* renamed from: a */
    public final void mo18874a(int i) {
        this.f7921b = i;
    }

    /* renamed from: d */
    public final int mo18884d() {
        return this.f7922c;
    }

    /* renamed from: a */
    public final void mo18878a(C3299p pVar, C3290h[] hVarArr, C3456e eVar, long j, boolean z, long j2) throws C3236d {
        C3535a.m8784b(this.f7922c == 0);
        this.f7920a = pVar;
        this.f7922c = 1;
        mo18879a(z);
        mo18881a(hVarArr, eVar, j2);
        mo18877a(j, z);
    }

    /* renamed from: e */
    public final void mo18885e() throws C3236d {
        boolean z = true;
        if (this.f7922c != 1) {
            z = false;
        }
        C3535a.m8784b(z);
        this.f7922c = 2;
        mo18894n();
    }

    /* renamed from: a */
    public final void mo18881a(C3290h[] hVarArr, C3456e eVar, long j) throws C3236d {
        C3535a.m8784b(!this.f7926g);
        this.f7923d = eVar;
        this.f7925f = false;
        this.f7924e = j;
        mo18880a(hVarArr);
    }

    /* renamed from: f */
    public final C3456e mo18886f() {
        return this.f7923d;
    }

    /* renamed from: g */
    public final boolean mo18887g() {
        return this.f7925f;
    }

    /* renamed from: h */
    public final void mo18888h() {
        this.f7926g = true;
    }

    /* renamed from: i */
    public final boolean mo18889i() {
        return this.f7926g;
    }

    /* renamed from: j */
    public final void mo18890j() throws IOException {
        this.f7923d.mo19278b();
    }

    /* renamed from: a */
    public final void mo18876a(long j) throws C3236d {
        this.f7926g = false;
        this.f7925f = false;
        mo18877a(j, false);
    }

    /* renamed from: k */
    public final void mo18891k() throws C3236d {
        C3535a.m8784b(this.f7922c == 2);
        this.f7922c = 1;
        mo18895o();
    }

    /* renamed from: l */
    public final void mo18892l() {
        boolean z = true;
        if (this.f7922c != 1) {
            z = false;
        }
        C3535a.m8784b(z);
        this.f7922c = 0;
        this.f7923d = null;
        this.f7926g = false;
        mo18896p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo18873a(C3292i iVar, C3225d dVar, boolean z) {
        int a = this.f7923d.mo19275a(iVar, dVar, z);
        if (a == -4) {
            if (dVar.mo18963c()) {
                this.f7925f = true;
                if (this.f7926g) {
                    return -4;
                }
                return -3;
            }
            dVar.f8131d += this.f7924e;
        } else if (a == -5) {
            C3290h hVar = iVar.f8514a;
            if (hVar.f8510w != Long.MAX_VALUE) {
                iVar.f8514a = hVar.mo19088a(hVar.f8510w + this.f7924e);
            }
        }
        return a;
    }
}
