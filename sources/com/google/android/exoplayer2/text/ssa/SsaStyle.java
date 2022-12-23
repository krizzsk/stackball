package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer primaryColor;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    private static boolean isValidAlignment(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private SsaStyle(String str, int i, Integer num, float f, boolean z, boolean z2) {
        this.name = str;
        this.alignment = i;
        this.primaryColor = num;
        this.fontSize = f;
        this.bold = z;
        this.italic = z2;
    }

    public static SsaStyle fromStyleLine(String str, Format format) {
        Assertions.checkArgument(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        if (split.length != format.length) {
            Log.m9247w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(format.length), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            return new SsaStyle(split[format.nameIndex].trim(), format.alignmentIndex != -1 ? parseAlignment(split[format.alignmentIndex].trim()) : -1, format.primaryColorIndex != -1 ? parseColor(split[format.primaryColorIndex].trim()) : null, format.fontSizeIndex != -1 ? parseFontSize(split[format.fontSizeIndex].trim()) : -3.4028235E38f, format.boldIndex != -1 ? parseBoldOrItalic(split[format.boldIndex].trim()) : false, format.italicIndex != -1 ? parseBoldOrItalic(split[format.italicIndex].trim()) : false);
        } catch (RuntimeException e) {
            Log.m9248w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidAlignment(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.m9247w(TAG, "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static Integer parseColor(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            Assertions.checkArgument(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j >> 24) & 255) ^ 255), Ints.checkedCast(j & 255), Ints.checkedCast((j >> 8) & 255), Ints.checkedCast((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            Log.m9248w(TAG, "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            Log.m9248w(TAG, "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean parseBoldOrItalic(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            Log.m9248w(TAG, "Failed to parse bold/italic: '" + str + "'", e);
            return false;
        }
    }

    static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int primaryColorIndex;

        private Format(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.nameIndex = i;
            this.alignmentIndex = i2;
            this.primaryColorIndex = i3;
            this.fontSizeIndex = i4;
            this.boldIndex = i5;
            this.italicIndex = i6;
            this.length = i7;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.exoplayer2.text.ssa.SsaStyle.Format fromFormatLine(java.lang.String r16) {
            /*
                r0 = 7
                r1 = r16
                java.lang.String r0 = r1.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
                r2 = -1
                r3 = 0
                r5 = -1
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
            L_0x0015:
                int r4 = r0.length
                if (r3 >= r4) goto L_0x0087
                r4 = r0[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = com.google.android.exoplayer2.util.Util.toLowerInvariant(r4)
                int r11 = r4.hashCode()
                r12 = 5
                r13 = 4
                r14 = 3
                r15 = 2
                r1 = 1
                switch(r11) {
                    case -1178781136: goto L_0x0061;
                    case -70925746: goto L_0x0057;
                    case 3029637: goto L_0x004d;
                    case 3373707: goto L_0x0043;
                    case 366554320: goto L_0x0039;
                    case 1767875043: goto L_0x002f;
                    default: goto L_0x002e;
                }
            L_0x002e:
                goto L_0x006b
            L_0x002f:
                java.lang.String r11 = "alignment"
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L_0x006b
                r4 = 1
                goto L_0x006c
            L_0x0039:
                java.lang.String r11 = "fontsize"
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L_0x006b
                r4 = 3
                goto L_0x006c
            L_0x0043:
                java.lang.String r11 = "name"
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L_0x006b
                r4 = 0
                goto L_0x006c
            L_0x004d:
                java.lang.String r11 = "bold"
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L_0x006b
                r4 = 4
                goto L_0x006c
            L_0x0057:
                java.lang.String r11 = "primarycolour"
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L_0x006b
                r4 = 2
                goto L_0x006c
            L_0x0061:
                java.lang.String r11 = "italic"
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L_0x006b
                r4 = 5
                goto L_0x006c
            L_0x006b:
                r4 = -1
            L_0x006c:
                if (r4 == 0) goto L_0x0083
                if (r4 == r1) goto L_0x0081
                if (r4 == r15) goto L_0x007f
                if (r4 == r14) goto L_0x007d
                if (r4 == r13) goto L_0x007b
                if (r4 == r12) goto L_0x0079
                goto L_0x0084
            L_0x0079:
                r10 = r3
                goto L_0x0084
            L_0x007b:
                r9 = r3
                goto L_0x0084
            L_0x007d:
                r8 = r3
                goto L_0x0084
            L_0x007f:
                r7 = r3
                goto L_0x0084
            L_0x0081:
                r6 = r3
                goto L_0x0084
            L_0x0083:
                r5 = r3
            L_0x0084:
                int r3 = r3 + 1
                goto L_0x0015
            L_0x0087:
                if (r5 == r2) goto L_0x0091
                com.google.android.exoplayer2.text.ssa.SsaStyle$Format r1 = new com.google.android.exoplayer2.text.ssa.SsaStyle$Format
                int r11 = r0.length
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0092
            L_0x0091:
                r1 = 0
            L_0x0092:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.SsaStyle.Format.fromFormatLine(java.lang.String):com.google.android.exoplayer2.text.ssa.SsaStyle$Format");
        }
    }

    static final class Overrides {
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final PointF position;

        private Overrides(int i, PointF pointF) {
            this.alignment = i;
            this.position = pointF;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides parseFromDialogue(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = BRACES_PATTERN
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = parsePosition(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = parseAlignmentOverride(r3)     // Catch:{ RuntimeException -> 0x0029 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                goto L_0x0009
            L_0x002b:
                com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides r5 = new com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.parseFromDialogue(java.lang.String):com.google.android.exoplayer2.text.ssa.SsaStyle$Overrides");
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }

        private static PointF parsePosition(String str) {
            String str2;
            String str3;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.m9245i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(str2)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(str3)).trim()));
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }
    }
}
