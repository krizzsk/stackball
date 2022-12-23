package com.smaato.sdk.core.log;

import com.smaato.sdk.core.util.Objects;

class ConsoleLogWriter extends LogWriter {
    ConsoleLogWriter(LogLevel logLevel) {
        super(logLevel);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r1 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void log(com.smaato.sdk.core.log.LogLevel r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            com.smaato.sdk.core.util.Objects.requireNonNull(r9)
            com.smaato.sdk.core.util.Objects.requireNonNull(r10)
            com.smaato.sdk.core.util.Objects.requireNonNull(r11)
            com.smaato.sdk.core.util.Objects.requireNonNull(r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 24
            if (r0 >= r2) goto L_0x0020
            int r0 = r10.length()
            r2 = 23
            if (r0 > r2) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            java.lang.String r10 = r10.substring(r1, r2)
        L_0x0020:
            int r0 = r11.length()
        L_0x0024:
            if (r1 >= r0) goto L_0x006e
            r2 = 10
            int r2 = r11.indexOf(r2, r1)
            r3 = -1
            if (r2 == r3) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r0
        L_0x0031:
            int r3 = r1 + 4000
            int r3 = java.lang.Math.min(r2, r3)
            java.lang.String r1 = r11.substring(r1, r3)
            int[] r4 = com.smaato.sdk.core.log.ConsoleLogWriter.C86821.$SwitchMap$com$smaato$sdk$core$log$LogLevel
            int r5 = r9.ordinal()
            r4 = r4[r5]
            r5 = 4
            r6 = 3
            r7 = 1
            if (r4 == r7) goto L_0x0063
            r7 = 2
            if (r4 == r7) goto L_0x0064
            if (r4 == r6) goto L_0x0061
            if (r4 != r5) goto L_0x0051
            r5 = 6
            goto L_0x0064
        L_0x0051:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = "Unknown level: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
        L_0x0061:
            r5 = 5
            goto L_0x0064
        L_0x0063:
            r5 = 3
        L_0x0064:
            android.util.Log.println(r5, r10, r1)
            if (r3 < r2) goto L_0x006c
            int r1 = r3 + 1
            goto L_0x0024
        L_0x006c:
            r1 = r3
            goto L_0x0031
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.log.ConsoleLogWriter.log(com.smaato.sdk.core.log.LogLevel, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public boolean isLoggable(LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        return logLevel.ordinal() >= getLogLevel().ordinal();
    }

    /* renamed from: com.smaato.sdk.core.log.ConsoleLogWriter$1 */
    static /* synthetic */ class C86821 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$log$LogLevel;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.smaato.sdk.core.log.LogLevel[] r0 = com.smaato.sdk.core.log.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$log$LogLevel = r0
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$log$LogLevel     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$log$LogLevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$log$LogLevel     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.log.ConsoleLogWriter.C86821.<clinit>():void");
        }
    }
}
