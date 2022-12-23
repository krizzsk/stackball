package com.inmobi.media;

import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ib */
/* compiled from: CellTowerInfo */
public class C5375ib {

    /* renamed from: d */
    private static final String f12310d = C5375ib.class.getSimpleName();

    /* renamed from: a */
    String f12311a;

    /* renamed from: b */
    int f12312b;

    /* renamed from: c */
    int f12313c;

    public C5375ib() {
    }

    public C5375ib(CellInfo cellInfo, String str, String str2, int i) {
        if (cellInfo instanceof CellInfoGsm) {
            this.f12313c = i;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f12312b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            this.f12311a = m12439a(str, str2, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.f12313c = i;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f12312b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            this.f12311a = m12438a(str, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
        } else if (Build.VERSION.SDK_INT >= 18) {
            if (cellInfo instanceof CellInfoWcdma) {
                this.f12313c = i;
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                this.f12312b = cellInfoWcdma.getCellSignalStrength().getDbm();
                CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                this.f12311a = m12439a(str, str2, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
            }
        } else if (cellInfo instanceof CellInfoLte) {
            this.f12313c = i;
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            this.f12312b = cellInfoLte.getCellSignalStrength().getDbm();
            CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
            this.f12311a = m12439a(str, str2, cellIdentity4.getTac(), cellIdentity4.getCi(), -1, cellIdentity4.getPci());
        }
    }

    /* renamed from: a */
    public static String m12438a(String str, int i, int i2, int i3) {
        return str + "#" + i + "#" + i2 + "#" + i3;
    }

    /* renamed from: a */
    public static String m12439a(String str, String str2, int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        sb.append("#");
        sb.append(i);
        sb.append("#");
        sb.append(i2);
        sb.append("#");
        Object obj = "";
        sb.append(i3 == -1 ? obj : Integer.valueOf(i3));
        sb.append("#");
        if (i4 != Integer.MAX_VALUE) {
            obj = Integer.valueOf(i4);
        }
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: a */
    public final JSONObject mo40738a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f12311a);
            if (this.f12312b != Integer.MAX_VALUE) {
                jSONObject.put("ss", this.f12312b);
            }
            jSONObject.put("nt", this.f12313c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
