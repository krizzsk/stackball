package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

public class InneractiveUserConfig {

    /* renamed from: a */
    private int f6906a = -1;

    /* renamed from: b */
    private Gender f6907b = null;

    /* renamed from: c */
    private String f6908c = null;

    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i) {
        return i > 0 && i <= 120;
    }

    public InneractiveUserConfig setAge(int i) {
        if (ageIsValid(i)) {
            this.f6906a = i;
        } else {
            IAlog.m9036d("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        }
        return this;
    }

    public int getAge() {
        return this.f6906a;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f6907b = gender;
        } else {
            IAlog.m9036d("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        }
        return this;
    }

    public Gender getGender() {
        return this.f6907b;
    }

    public String getZipCode() {
        return this.f6908c;
    }

    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.m9035c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
        } else {
            this.f6908c = str;
        }
        return this;
    }
}
