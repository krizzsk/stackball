package com.adcolony.sdk;

import android.location.Location;

@Deprecated
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";

    /* renamed from: d */
    static final int f161d = 128;

    /* renamed from: a */
    C0895y0 f162a = C0894y.m1134a();

    /* renamed from: b */
    C0897z0 f163b = C0894y.m1151b();

    /* renamed from: c */
    Location f164c;

    public AdColonyUserMetadata addUserInterest(String str) {
        if (C0849u0.m942e(str)) {
            C0894y.m1154b(this.f162a, str);
            C0894y.m1146a(this.f163b, "adc_interests", this.f162a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        C0895y0 a = C0894y.m1134a();
        this.f162a = a;
        C0894y.m1146a(this.f163b, "adc_interests", a);
        return this;
    }

    public Object getMetadata(String str) {
        return C0894y.m1168g(this.f163b, str);
    }

    public int getUserAge() {
        return C0894y.m1163d(this.f163b, "adc_age");
    }

    public int getUserAnnualHouseholdIncome() {
        return C0894y.m1163d(this.f163b, "adc_household_income");
    }

    public String getUserEducation() {
        return C0894y.m1169h(this.f163b, "adc_education");
    }

    public String getUserGender() {
        return C0894y.m1169h(this.f163b, "adc_gender");
    }

    public String[] getUserInterests() {
        return this.f162a.mo10037e();
    }

    public Location getUserLocation() {
        return this.f164c;
    }

    public String getUserMaritalStatus() {
        return C0894y.m1169h(this.f163b, "adc_marital_status");
    }

    public String getUserZipCode() {
        return C0894y.m1169h(this.f163b, "adc_zip");
    }

    public AdColonyUserMetadata setMetadata(String str, boolean z) {
        if (C0849u0.m942e(str)) {
            C0894y.m1158b(this.f163b, str, z);
        }
        return this;
    }

    public AdColonyUserMetadata setUserAge(int i) {
        setMetadata("adc_age", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(int i) {
        setMetadata("adc_household_income", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserEducation(String str) {
        if (C0849u0.m942e(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserGender(String str) {
        if (C0849u0.m942e(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserLocation(Location location) {
        this.f164c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", (double) location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", (double) location.getTime());
        setMetadata("adc_accuracy", (double) location.getAccuracy());
        return this;
    }

    public AdColonyUserMetadata setUserMaritalStatus(String str) {
        if (C0849u0.m942e(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserZipCode(String str) {
        if (C0849u0.m942e(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, double d) {
        if (C0849u0.m942e(str)) {
            C0894y.m1145a(this.f163b, str, d);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, String str2) {
        if (C0849u0.m942e(str2) && C0849u0.m942e(str)) {
            C0894y.m1148a(this.f163b, str, str2);
        }
        return this;
    }
}
