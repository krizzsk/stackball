package com.smaato.sdk.net;

final class AutoValue_MimeType extends MimeType {
    private final String charset;
    private final String string;
    private final String subtype;
    private final String type;

    AutoValue_MimeType(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.string = str;
            if (str2 != null) {
                this.type = str2;
                if (str3 != null) {
                    this.subtype = str3;
                    this.charset = str4;
                    return;
                }
                throw new NullPointerException("Null subtype");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null string");
    }

    public final String string() {
        return this.string;
    }

    public final String type() {
        return this.type;
    }

    public final String subtype() {
        return this.subtype;
    }

    public final String charset() {
        return this.charset;
    }

    public final String toString() {
        return "MimeType{string=" + this.string + ", type=" + this.type + ", subtype=" + this.subtype + ", charset=" + this.charset + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.charset;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.net.MimeType
            r2 = 0
            if (r1 == 0) goto L_0x0045
            com.smaato.sdk.net.MimeType r5 = (com.smaato.sdk.net.MimeType) r5
            java.lang.String r1 = r4.string
            java.lang.String r3 = r5.string()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.type()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r4.subtype
            java.lang.String r3 = r5.subtype()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = r4.charset
            if (r1 != 0) goto L_0x003a
            java.lang.String r5 = r5.charset()
            if (r5 != 0) goto L_0x0045
            goto L_0x0044
        L_0x003a:
            java.lang.String r5 = r5.charset()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0045
        L_0x0044:
            return r0
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.net.AutoValue_MimeType.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((this.string.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.subtype.hashCode()) * 1000003;
        String str = this.charset;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
