package com.yandex.metrica.plugins;

public class StackTraceItem {

    /* renamed from: a */
    private final String f28983a;

    /* renamed from: b */
    private final String f28984b;

    /* renamed from: c */
    private final Integer f28985c;

    /* renamed from: d */
    private final Integer f28986d;

    /* renamed from: e */
    private final String f28987e;

    public static class Builder {

        /* renamed from: a */
        private String f28988a;

        /* renamed from: b */
        private String f28989b;

        /* renamed from: c */
        private Integer f28990c;

        /* renamed from: d */
        private Integer f28991d;

        /* renamed from: e */
        private String f28992e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f28988a, this.f28989b, this.f28990c, this.f28991d, this.f28992e);
        }

        public Builder withClassName(String str) {
            this.f28988a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f28991d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f28989b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f28990c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f28992e = str;
            return this;
        }
    }

    public String getClassName() {
        return this.f28983a;
    }

    public Integer getColumn() {
        return this.f28986d;
    }

    public String getFileName() {
        return this.f28984b;
    }

    public Integer getLine() {
        return this.f28985c;
    }

    public String getMethodName() {
        return this.f28987e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f28983a = str;
        this.f28984b = str2;
        this.f28985c = num;
        this.f28986d = num2;
        this.f28987e = str3;
    }
}
