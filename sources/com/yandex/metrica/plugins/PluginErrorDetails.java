package com.yandex.metrica.plugins;

import com.yandex.metrica.impl.p265ob.C10796U2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PluginErrorDetails {

    /* renamed from: a */
    private final String f28971a;

    /* renamed from: b */
    private final String f28972b;

    /* renamed from: c */
    private final List<StackTraceItem> f28973c;

    /* renamed from: d */
    private final String f28974d;

    /* renamed from: e */
    private final String f28975e;

    /* renamed from: f */
    private final Map<String, String> f28976f;

    public static class Builder {

        /* renamed from: a */
        private String f28977a;

        /* renamed from: b */
        private String f28978b;

        /* renamed from: c */
        private List<StackTraceItem> f28979c;

        /* renamed from: d */
        private String f28980d;

        /* renamed from: e */
        private String f28981e;

        /* renamed from: f */
        private Map<String, String> f28982f;

        public PluginErrorDetails build() {
            String str = this.f28977a;
            String str2 = this.f28978b;
            List<StackTraceItem> list = this.f28979c;
            List<StackTraceItem> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList = list;
            }
            String str3 = this.f28980d;
            String str4 = this.f28981e;
            Map<String, String> map = this.f28982f;
            Map<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap = map;
            }
            return new PluginErrorDetails(str, str2, arrayList, str3, str4, hashMap);
        }

        public Builder withExceptionClass(String str) {
            this.f28977a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f28978b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f28980d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f28982f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f28979c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f28981e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public String getExceptionClass() {
        return this.f28971a;
    }

    public String getMessage() {
        return this.f28972b;
    }

    public String getPlatform() {
        return this.f28974d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f28976f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f28973c;
    }

    public String getVirtualMachineVersion() {
        return this.f28975e;
    }

    private PluginErrorDetails(String str, String str2, List<StackTraceItem> list, String str3, String str4, Map<String, String> map) {
        this.f28971a = str;
        this.f28972b = str2;
        this.f28973c = new ArrayList(list);
        this.f28974d = str3;
        this.f28975e = str4;
        this.f28976f = C10796U2.m27884a(C10796U2.m27882a(map));
    }
}
