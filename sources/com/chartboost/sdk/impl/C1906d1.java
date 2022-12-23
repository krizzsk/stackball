package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Privacy.model.DataUseConsent;

/* renamed from: com.chartboost.sdk.impl.d1 */
public class C1906d1 {

    /* renamed from: a */
    private C2015x0 f4778a;

    /* renamed from: b */
    private SharedPreferences f4779b;

    public C1906d1(C2015x0 x0Var, SharedPreferences sharedPreferences) {
        this.f4778a = x0Var;
        this.f4779b = sharedPreferences;
    }

    /* renamed from: d */
    private int m4491d() {
        DataUseConsent a = this.f4778a.mo14886a();
        if (a != null) {
            return m4490a(a);
        }
        return m4492e();
    }

    /* renamed from: e */
    private int m4492e() {
        Chartboost.CBPIDataUseConsent cBPIDataUseConsent;
        if (m4497j()) {
            cBPIDataUseConsent = m4496i();
        } else {
            cBPIDataUseConsent = m4495h();
        }
        return cBPIDataUseConsent.getValue();
    }

    /* renamed from: f */
    private boolean m4493f() {
        SharedPreferences sharedPreferences = this.f4779b;
        if (sharedPreferences != null) {
            return !sharedPreferences.contains("cbGDPR");
        }
        return true;
    }

    /* renamed from: g */
    private boolean m4494g() {
        SharedPreferences sharedPreferences = this.f4779b;
        if (sharedPreferences != null) {
            return sharedPreferences.contains("cbLimitTrack");
        }
        return false;
    }

    @Deprecated
    /* renamed from: h */
    private Chartboost.CBPIDataUseConsent m4495h() {
        Chartboost.CBPIDataUseConsent cBPIDataUseConsent = C1988v0.f5103a;
        SharedPreferences sharedPreferences = this.f4779b;
        return sharedPreferences != null ? Chartboost.CBPIDataUseConsent.valueOf(sharedPreferences.getInt("cbGDPR", cBPIDataUseConsent.getValue())) : cBPIDataUseConsent;
    }

    @Deprecated
    /* renamed from: i */
    private Chartboost.CBPIDataUseConsent m4496i() {
        Chartboost.CBPIDataUseConsent cBPIDataUseConsent = Chartboost.CBPIDataUseConsent.UNKNOWN;
        SharedPreferences sharedPreferences = this.f4779b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("cbLimitTrack", false) ? Chartboost.CBPIDataUseConsent.NO_BEHAVIORAL : Chartboost.CBPIDataUseConsent.UNKNOWN;
        }
        return cBPIDataUseConsent;
    }

    /* renamed from: j */
    private boolean m4497j() {
        return m4494g() && m4493f();
    }

    /* renamed from: a */
    public void mo14578a() {
        C1988v0.m4826a(m4491d());
    }

    /* renamed from: b */
    public int mo14579b() {
        return C1988v0.m4825a();
    }

    /* renamed from: c */
    public int mo14580c() {
        return C1988v0.m4829b();
    }

    /* renamed from: a */
    private int m4490a(DataUseConsent dataUseConsent) {
        try {
            return Integer.parseInt(dataUseConsent.getConsent());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
