package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.p */
public class C1964p {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ea */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d A[SYNTHETIC, Splitter:B:64:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124 A[SYNTHETIC, Splitter:B:68:0x0124] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4755a(java.io.File r15, java.util.Map<java.lang.String, java.lang.String> r16, java.lang.String r17, java.lang.String r18) throws java.lang.Exception {
        /*
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ OutOfMemoryError -> 0x0113, all -> 0x0110 }
            r0 = r15
            r2.<init>(r15)     // Catch:{ OutOfMemoryError -> 0x0113, all -> 0x0110 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ OutOfMemoryError -> 0x010e }
            r3.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x010e }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.util.Set r4 = r16.entrySet()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
        L_0x0019:
            boolean r5 = r4.hasNext()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.String r6 = "{%"
            java.lang.String r7 = "{{"
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r4.next()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.Object r8 = r5.getKey()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            boolean r7 = r8.startsWith(r7)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            if (r7 != 0) goto L_0x003d
            boolean r6 = r8.startsWith(r6)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            if (r6 == 0) goto L_0x0019
        L_0x003d:
            java.lang.Object r5 = r5.getValue()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            r1.put(r8, r5)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            goto L_0x0019
        L_0x0045:
            java.util.Set r1 = r1.entrySet()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            r5 = 0
            r8 = 0
        L_0x004f:
            boolean r9 = r4.hasNext()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            if (r9 == 0) goto L_0x0069
            java.lang.Object r9 = r4.next()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r9 = r9.length()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r9 = r9 * 3
            int r8 = r8 + r9
            goto L_0x004f
        L_0x0069:
            long r9 = r15.length()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r0 = (int) r9     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r0 = r0 + r8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            r4.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            r8 = 2048(0x800, float:2.87E-42)
            r0.<init>(r8)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
        L_0x007b:
            java.lang.String r8 = r3.readLine()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            if (r8 == 0) goto L_0x00dd
            int r9 = r8.indexOf(r7)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r10 = r8.indexOf(r6)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            r11 = -1
            if (r9 == r11) goto L_0x0093
            if (r10 == r11) goto L_0x0093
            int r9 = java.lang.Math.min(r9, r10)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            goto L_0x0097
        L_0x0093:
            int r9 = java.lang.Math.max(r9, r10)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
        L_0x0097:
            if (r9 != r11) goto L_0x009d
            r4.append(r8)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            goto L_0x00d7
        L_0x009d:
            r0.setLength(r5)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            r0.append(r8)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
        L_0x00a7:
            boolean r10 = r8.hasNext()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            if (r10 == 0) goto L_0x00d4
            java.lang.Object r10 = r8.next()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.Object r12 = r10.getKey()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r13 = r12.length()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
        L_0x00c3:
            int r9 = r0.indexOf(r12, r9)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            if (r11 == r9) goto L_0x00a7
            int r14 = r9 + r13
            r0.replace(r9, r14, r10)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r14 = r10.length()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            int r9 = r9 + r14
            goto L_0x00c3
        L_0x00d4:
            r4.append(r0)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
        L_0x00d7:
            java.lang.String r8 = "\n"
            r4.append(r8)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            goto L_0x007b
        L_0x00dd:
            java.lang.String r0 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            boolean r1 = r0.contains(r7)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            if (r1 != 0) goto L_0x00ee
            r3.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            r2.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            return r0
        L_0x00ee:
            com.chartboost.sdk.Tracking.a r0 = new com.chartboost.sdk.Tracking.a     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.String r1 = "show_html_missing_mustache_error"
            java.lang.String r4 = ""
            r5 = r17
            r6 = r18
            r0.<init>(r1, r4, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            com.chartboost.sdk.Tracking.C1874e.m4311e(r0)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            java.lang.String r1 = "Missing required template parameter"
            r0.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0109, all -> 0x0106 }
        L_0x0106:
            r0 = move-exception
            r1 = r3
            goto L_0x011b
        L_0x0109:
            r0 = move-exception
            r1 = r3
            goto L_0x0115
        L_0x010c:
            r0 = move-exception
            goto L_0x011b
        L_0x010e:
            r0 = move-exception
            goto L_0x0115
        L_0x0110:
            r0 = move-exception
            r2 = r1
            goto L_0x011b
        L_0x0113:
            r0 = move-exception
            r2 = r1
        L_0x0115:
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x010c }
            r3.<init>(r0)     // Catch:{ all -> 0x010c }
            throw r3     // Catch:{ all -> 0x010c }
        L_0x011b:
            if (r1 == 0) goto L_0x0122
            r1.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x0122
        L_0x0121:
        L_0x0122:
            if (r2 == 0) goto L_0x0127
            r2.close()     // Catch:{ IOException -> 0x0127 }
        L_0x0127:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1964p.m4755a(java.io.File, java.util.Map, java.lang.String, java.lang.String):java.lang.String");
    }
}
