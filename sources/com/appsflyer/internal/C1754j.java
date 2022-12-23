package com.appsflyer.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.j */
public final class C1754j {

    /* renamed from: com.appsflyer.internal.j$c */
    enum C1755c {
        NONE,
        FIRST,
        ALL
    }

    /* renamed from: com.appsflyer.internal.j$e */
    enum C1757e {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE
    }

    C1754j() {
    }

    /* renamed from: Ι */
    private static List<BigDecimal> m3881(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(0)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(1)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(2)).toString())));
        return arrayList2;
    }

    /* renamed from: ι */
    public static Map m3882(List<Map<String, Object>> list) {
        C1755c cVar;
        C1755c cVar2;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map next : list) {
            HashMap hashMap2 = new HashMap();
            boolean z = next.get("sVS") != null;
            boolean z2 = next.get("sVE") != null;
            if (z && z2) {
                cVar = C1755c.ALL;
            } else if (z) {
                cVar = C1755c.FIRST;
            } else {
                cVar = C1755c.NONE;
            }
            if (cVar != C1755c.NONE) {
                Integer num = (Integer) next.get("sT");
                String str = (String) next.get("sN");
                if (str != null) {
                    hashMap2.put("n", str);
                } else {
                    hashMap2.put("n", "uk");
                }
                C1757e eVar = C1757e.values()[num.intValue()];
                ArrayList arrayList2 = new ArrayList(m3881(next.get("sVS")));
                if (cVar == C1755c.ALL) {
                    arrayList2.addAll(m3881(next.get("sVE")));
                }
                if (eVar == C1757e.MAGNETOMETER) {
                    ArrayList arrayList3 = new ArrayList();
                    cVar2 = cVar;
                    BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                    DecimalFormat decimalFormat = new DecimalFormat("##.#");
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat.format(valueOf))));
                    DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                    decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat2.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                        DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                        decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat3.format(subtract))));
                        BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                        decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat4.format(subtract2))));
                    }
                    arrayList = new ArrayList();
                    arrayList.add(arrayList3);
                    arrayList.add(arrayList4);
                } else {
                    cVar2 = cVar;
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                        DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                        decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat5.format(subtract3))));
                        BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                        DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                        decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat6.format(subtract4))));
                        BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                        decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat7.format(subtract5))));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                    decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat8.format((BigDecimal) arrayList2.get(0)))));
                    DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                    decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat9.format((BigDecimal) arrayList2.get(1)))));
                    DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                    decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat10.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(arrayList6);
                    arrayList7.add(arrayList5);
                    arrayList = arrayList7;
                }
                hashMap2.put("v", arrayList);
                hashMap.put(C1756d.values()[num.intValue()].f4200, hashMap2);
                if (cVar2 == C1755c.FIRST) {
                    hashMap.put("er", "no_svs");
                }
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("er", "na");
                return hashMap3;
            }
        }
        return hashMap;
    }

    /* renamed from: com.appsflyer.internal.j$d */
    enum C1756d {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        

        /* renamed from: ɩ */
        String f4200;

        private C1756d(String str) {
            this.f4200 = str;
        }
    }
}
