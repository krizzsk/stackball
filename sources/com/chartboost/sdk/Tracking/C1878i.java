package com.chartboost.sdk.Tracking;

/* renamed from: com.chartboost.sdk.Tracking.i */
public abstract class C1878i {

    /* renamed from: a */
    private String f4676a;

    /* renamed from: b */
    private String f4677b;

    /* renamed from: c */
    private long f4678c;

    /* renamed from: d */
    private float f4679d;

    /* renamed from: e */
    private C1879a f4680e;

    /* renamed from: f */
    private C1877h f4681f;

    /* renamed from: g */
    private String f4682g;

    /* renamed from: h */
    private String f4683h;

    /* renamed from: i */
    private boolean f4684i;

    /* renamed from: com.chartboost.sdk.Tracking.i$a */
    public enum C1879a {
        INFO,
        CRITICAL,
        ERROR
    }

    public C1878i(String str, String str2, String str3, String str4) {
        m4329a(str, str2, str3, str4);
    }

    /* renamed from: a */
    private void m4329a(String str, String str2, String str3, String str4) {
        mo14468d(str);
        mo14466c(str2);
        mo14458a(0.0f);
        mo14461a(str3);
        mo14463b(str4);
        this.f4678c = System.currentTimeMillis();
        this.f4684i = false;
        mo14459a(new C1877h("", "", "", "", ""));
    }

    /* renamed from: b */
    public void mo14463b(String str) {
        this.f4683h = str;
    }

    /* renamed from: c */
    public void mo14466c(String str) {
        this.f4677b = str;
    }

    /* renamed from: d */
    public void mo14468d(String str) {
        this.f4676a = str;
    }

    /* renamed from: e */
    public String mo14469e() {
        return this.f4677b;
    }

    /* renamed from: f */
    public String mo14470f() {
        return this.f4676a;
    }

    /* renamed from: g */
    public long mo14471g() {
        return this.f4678c;
    }

    /* renamed from: h */
    public long mo14472h() {
        return this.f4678c / 1000;
    }

    /* renamed from: i */
    public C1877h mo14473i() {
        return this.f4681f;
    }

    /* renamed from: j */
    public C1879a mo14474j() {
        return this.f4680e;
    }

    public String toString() {
        return "TrackingEvent{mName='" + this.f4676a + '\'' + ", mMessage='" + this.f4677b + '\'' + ", mTimestamp=" + this.f4678c + ", mLatency=" + this.f4679d + ", mType=" + this.f4680e + ", trackAd=" + this.f4681f + ", impressionAdType=" + this.f4682g + ", location=" + this.f4683h + '}';
    }

    /* renamed from: b */
    public boolean mo14464b() {
        return this.f4684i;
    }

    /* renamed from: c */
    public float mo14465c() {
        return this.f4679d;
    }

    /* renamed from: d */
    public String mo14467d() {
        return this.f4683h;
    }

    /* renamed from: a */
    public void mo14458a(float f) {
        this.f4679d = f;
    }

    /* renamed from: a */
    public void mo14460a(C1879a aVar) {
        this.f4680e = aVar;
    }

    /* renamed from: a */
    public void mo14459a(C1877h hVar) {
        this.f4681f = hVar;
    }

    /* renamed from: a */
    public String mo14457a() {
        return this.f4682g;
    }

    /* renamed from: a */
    public void mo14461a(String str) {
        this.f4682g = str;
    }

    /* renamed from: a */
    public void mo14462a(boolean z) {
        this.f4684i = z;
    }
}
