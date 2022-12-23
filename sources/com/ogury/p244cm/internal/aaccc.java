package com.ogury.p244cm.internal;

import java.util.List;

/* renamed from: com.ogury.cm.internal.aaccc */
public final class aaccc implements Comparable<aaccc> {

    /* renamed from: a */
    public static final aaaaa f20375a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final int f20376b;

    /* renamed from: c */
    private final int f20377c;

    /* renamed from: d */
    private final int f20378d;

    /* renamed from: e */
    private final String f20379e;

    /* renamed from: f */
    private final String f20380f;

    /* renamed from: com.ogury.cm.internal.aaccc$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public aaccc() {
        this(0, 0, 0, (String) null, (String) null, 31, (bbabb) null);
    }

    public aaccc(int i, int i2, int i3, String str, String str2) {
        this.f20376b = i;
        this.f20377c = i2;
        this.f20378d = i3;
        this.f20379e = str;
        this.f20380f = str2;
        boolean z = true;
        if (i >= 0) {
            if (this.f20377c >= 0) {
                if (this.f20378d < 0 ? false : z) {
                    String str3 = this.f20379e;
                    if (str3 != null) {
                        if (!new bbcbb("[\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*").mo52861a(str3)) {
                            throw new IllegalArgumentException("Pre-release version is not valid".toString());
                        }
                    }
                    String str4 = this.f20380f;
                    if (str4 != null) {
                        if (!new bbcbb("[\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*").mo52861a(str4)) {
                            throw new IllegalArgumentException("Build metadata is not valid".toString());
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Patch version must be a positive number".toString());
            }
            throw new IllegalArgumentException("Minor version must be a positive number".toString());
        }
        throw new IllegalArgumentException("Major version must be a positive number".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaccc(int i, int i2, int i3, String str, String str2, int i4, bbabb bbabb) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (String) null, (String) null);
    }

    /* renamed from: a */
    private static boolean m21788a(String str) {
        return new bbcbb("\\d+").mo52861a(str);
    }

    /* renamed from: a */
    public final int mo52658a() {
        return this.f20376b;
    }

    /* renamed from: a */
    public final int compareTo(aaccc aaccc) {
        bbabc.m22051b(aaccc, "other");
        int i = this.f20376b;
        int i2 = aaccc.f20376b;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        int i3 = this.f20377c;
        int i4 = aaccc.f20377c;
        if (i3 > i4) {
            return 1;
        }
        if (i3 < i4) {
            return -1;
        }
        int i5 = this.f20378d;
        int i6 = aaccc.f20378d;
        if (i5 > i6) {
            return 1;
        }
        if (i5 < i6) {
            return -1;
        }
        if (this.f20379e == null && aaccc.f20379e == null) {
            return 0;
        }
        if (this.f20379e != null && aaccc.f20379e == null) {
            return -1;
        }
        if (this.f20379e == null && aaccc.f20379e != null) {
            return 1;
        }
        String str = this.f20379e;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        List a = bbcbc.m22096a((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        String str3 = aaccc.f20379e;
        if (str3 != null) {
            str2 = str3;
        }
        List a2 = bbcbc.m22096a((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null);
        int min = Math.min(a.size(), a2.size()) - 1;
        if (min >= 0) {
            int i7 = 0;
            while (true) {
                String str4 = (String) a.get(i7);
                String str5 = (String) a2.get(i7);
                if (!bbabc.m22050a((Object) str4, (Object) str5)) {
                    boolean a3 = m21788a(str4);
                    boolean a4 = m21788a(str5);
                    if (a3 && !a4) {
                        return -1;
                    }
                    if (!a3 && a4) {
                        return 1;
                    }
                    if (a3 || a4) {
                        try {
                            int parseInt = Integer.parseInt(str4);
                            int parseInt2 = Integer.parseInt(str5);
                            if (parseInt > parseInt2) {
                                return 1;
                            }
                            if (parseInt < parseInt2) {
                                return -1;
                            }
                        } catch (NumberFormatException unused) {
                            return str4.compareTo(str5);
                        }
                    } else if (str4.compareTo(str5) > 0) {
                        return 1;
                    } else {
                        if (str4.compareTo(str5) < 0) {
                            return -1;
                        }
                    }
                }
                if (i7 == min) {
                    break;
                }
                i7++;
            }
        }
        int i8 = min + 1;
        if (a.size() != i8 || a2.size() <= i8) {
            return (a.size() <= i8 || a2.size() != i8) ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo52660b() {
        return this.f20377c;
    }

    /* renamed from: c */
    public final int mo52661c() {
        return this.f20378d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aaccc) {
                aaccc aaccc = (aaccc) obj;
                if (this.f20376b == aaccc.f20376b) {
                    if (this.f20377c == aaccc.f20377c) {
                        if (!(this.f20378d == aaccc.f20378d) || !bbabc.m22050a((Object) this.f20379e, (Object) aaccc.f20379e) || !bbabc.m22050a((Object) this.f20380f, (Object) aaccc.f20380f)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f20376b * 31) + this.f20377c) * 31) + this.f20378d) * 31;
        String str = this.f20379e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20380f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20376b);
        sb2.append('.');
        sb2.append(this.f20377c);
        sb2.append('.');
        sb2.append(this.f20378d);
        sb.append(sb2.toString());
        if (this.f20379e != null) {
            sb.append('-');
            sb.append(this.f20379e);
        }
        if (this.f20380f != null) {
            sb.append('+');
            sb.append(this.f20380f);
        }
        String sb3 = sb.toString();
        bbabc.m22048a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
