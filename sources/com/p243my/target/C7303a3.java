package com.p243my.target;

/* renamed from: com.my.target.a3 */
public class C7303a3 extends C7328b3 {

    /* renamed from: d */
    public float f18307d = -1.0f;

    /* renamed from: e */
    public float f18308e = -1.0f;

    public C7303a3(String str) {
        super("playheadReachedValue", str);
    }

    /* renamed from: a */
    public static C7303a3 m18693a(String str) {
        return new C7303a3(str);
    }

    /* renamed from: a */
    public void mo49572a(float f) {
        this.f18308e = f;
    }

    /* renamed from: b */
    public void mo49573b(float f) {
        this.f18307d = f;
    }

    /* renamed from: d */
    public float mo49574d() {
        return this.f18308e;
    }

    /* renamed from: e */
    public float mo49575e() {
        return this.f18307d;
    }

    public String toString() {
        return "ProgressStat{" + "value=" + this.f18307d + ", pvalue=" + this.f18308e + '}';
    }
}
