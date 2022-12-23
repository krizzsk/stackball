package com.p243my.tracker.miniapps;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder */
public abstract class MiniAppEventBuilder {

    /* renamed from: a */
    final int f19783a;

    /* renamed from: b */
    final String f19784b;

    /* renamed from: c */
    final String f19785c;

    /* renamed from: d */
    String f19786d;

    /* renamed from: e */
    String f19787e;

    /* renamed from: f */
    String f19788f;

    /* renamed from: g */
    Map<String, String> f19789g;

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$CloseEventBuilder */
    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$CustomEventBuilder */
    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f19788f = str3;
        }

        public CustomEventBuilder withCustomUserId(String str) {
            this.f19787e = str;
            return this;
        }

        public CustomEventBuilder withEventParams(Map<String, String> map) {
            this.f19789g = map;
            return this;
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$EventBuilder */
    public static final class EventBuilder {

        /* renamed from: a */
        final String f19790a;

        /* renamed from: b */
        final String f19791b;

        EventBuilder(String str, String str2) {
            this.f19790a = str;
            this.f19791b = str2;
        }

        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f19790a, this.f19791b);
        }

        public CustomEventBuilder customEvent(String str) {
            return new CustomEventBuilder(this.f19790a, this.f19791b, str);
        }

        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f19790a, this.f19791b);
        }

        public OpenEventBuilder openEvent(String str) {
            return new OpenEventBuilder(this.f19790a, this.f19791b, str);
        }

        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f19790a, this.f19791b);
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$OpenEventBuilder */
    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.f19786d = str3;
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$UserEventBuilder */
    public static final class UserEventBuilder extends MiniAppEventBuilder {
        UserEventBuilder(int i, String str, String str2) {
            super(i, str, str2);
        }

        public UserEventBuilder withCustomUserId(String str) {
            this.f19787e = str;
            return this;
        }
    }

    MiniAppEventBuilder(int i, String str, String str2) {
        this.f19783a = i;
        this.f19784b = str;
        this.f19785c = str2;
    }

    public static EventBuilder newEventBuilder(String str, String str2) {
        return new EventBuilder(str, str2);
    }

    public final MiniAppEvent build() {
        return new MiniAppEvent(this.f19783a, this.f19784b, this.f19785c, this.f19786d, this.f19787e, this.f19788f, this.f19789g == null ? null : new TreeMap(this.f19789g));
    }
}
