package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.flurry.android.Consent;
import com.flurry.android.FlurryAgent;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.DigestOutputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.bj */
public class C2409bj {

    /* renamed from: b */
    private static final String f5573b = C2409bj.class.getSimpleName();

    /* renamed from: a */
    public byte[] f5574a = null;

    /* JADX INFO: finally extract failed */
    public C2409bj(String str, String str2, boolean z, boolean z2, long j, long j2, List<C2414bl> list, Map<C2475ca, byte[]> map, Map<String, List<String>> map2, Map<String, List<String>> map3, Map<String, Map<String, String>> map4, long j3, C2611eg egVar, boolean z3) throws IOException {
        byte[] bArr;
        DataOutputStream dataOutputStream;
        String str3;
        Map<String, String> map5;
        int i;
        String str4;
        String str5;
        int identifier;
        C2611eg egVar2 = egVar;
        try {
            C2505cr crVar = new C2505cr();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, crVar);
            dataOutputStream = new DataOutputStream(digestOutputStream);
            try {
                dataOutputStream.writeShort(35);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeLong(0);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeShort(3);
                dataOutputStream.writeShort(C2495cl.m5382b());
                dataOutputStream.writeLong(j3);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeUTF(str2);
                String str6 = (String) egVar2.mo17819a("VersionName");
                if (TextUtils.isEmpty(str6)) {
                    dataOutputStream.writeUTF("");
                } else {
                    dataOutputStream.writeUTF(str6);
                }
                Context context = C2494ck.m5371a().f5832a;
                dataOutputStream.writeUTF(String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                dataOutputStream.writeByte(3);
                if (C2529da.m5470a().f5936b) {
                    dataOutputStream.writeByte(3);
                    C2530db.m5486c(f5573b, "Agent report type: instant app");
                } else {
                    dataOutputStream.writeByte(1);
                    C2530db.m5486c(f5573b, "Agent report type: main device");
                }
                dataOutputStream.writeShort(map.size());
                for (Map.Entry next : map.entrySet()) {
                    dataOutputStream.writeShort(((C2475ca) next.getKey()).f5789d);
                    byte[] bArr2 = (byte[]) next.getValue();
                    dataOutputStream.writeShort(bArr2.length);
                    dataOutputStream.write(bArr2);
                }
                dataOutputStream.writeByte(0);
                dataOutputStream.writeBoolean(z);
                dataOutputStream.writeBoolean(z2);
                dataOutputStream.writeLong(j);
                dataOutputStream.writeLong(j2);
                if (z3) {
                    dataOutputStream.writeByte(2);
                } else {
                    dataOutputStream.writeByte(0);
                }
                dataOutputStream.writeBoolean(((Boolean) egVar2.mo17819a("IncludeBackgroundSessionsInMetrics")).booleanValue());
                String property = System.getProperty("os.arch");
                property = TextUtils.isEmpty(property) ? "" : property;
                dataOutputStream.writeShort(8);
                dataOutputStream.writeUTF("device.model");
                dataOutputStream.writeUTF(Build.MODEL);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.brand");
                dataOutputStream.writeUTF(Build.BRAND);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.id");
                dataOutputStream.writeUTF(Build.ID);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("version.release");
                dataOutputStream.writeUTF(Build.VERSION.RELEASE);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.device");
                dataOutputStream.writeUTF(Build.DEVICE);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("build.product");
                dataOutputStream.writeUTF(Build.PRODUCT);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("proguard.build.uuid");
                C2450br.m5275a();
                Context context2 = C2494ck.m5371a().f5832a;
                if (context2 == null || (identifier = context2.getResources().getIdentifier("com.flurry.crash.map_id", "string", context2.getPackageName())) == 0) {
                    str3 = "";
                } else {
                    str3 = context2.getResources().getString(identifier);
                }
                dataOutputStream.writeUTF(str3);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeUTF("device.arch");
                dataOutputStream.writeUTF(property);
                dataOutputStream.writeByte(0);
                dataOutputStream.writeShort(map2 != null ? map2.keySet().size() : 0);
                if (map2 != null) {
                    C2530db.m5474a(3, f5573b, "sending referrer values because it exists");
                    for (Map.Entry next2 : map2.entrySet()) {
                        String str7 = f5573b;
                        C2530db.m5474a(3, str7, "Referrer Entry:  " + ((String) next2.getKey()) + "=" + next2.getValue());
                        dataOutputStream.writeUTF((String) next2.getKey());
                        String str8 = f5573b;
                        C2530db.m5474a(3, str8, "referrer key is :" + ((String) next2.getKey()));
                        dataOutputStream.writeShort(((List) next2.getValue()).size());
                        for (String str9 : (List) next2.getValue()) {
                            dataOutputStream.writeUTF(str9);
                            C2530db.m5474a(3, f5573b, "referrer value is :".concat(String.valueOf(str9)));
                        }
                    }
                }
                String str10 = (String) egVar2.mo17819a("notificationToken");
                if (!TextUtils.isEmpty(str10)) {
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeUTF(str10);
                } else {
                    dataOutputStream.writeBoolean(false);
                }
                dataOutputStream.writeBoolean(((Boolean) egVar2.mo17819a("notificationsEnabled")).booleanValue());
                int size = map3 != null ? map3.keySet().size() : 0;
                C2530db.m5474a(3, f5573b, "optionsMapSize is:  ".concat(String.valueOf(size)));
                dataOutputStream.writeShort(size);
                if (map3 != null) {
                    C2530db.m5474a(3, f5573b, "sending launch options");
                    for (Map.Entry next3 : map3.entrySet()) {
                        String str11 = f5573b;
                        C2530db.m5474a(3, str11, "Launch Options Key:  " + ((String) next3.getKey()));
                        dataOutputStream.writeUTF((String) next3.getKey());
                        dataOutputStream.writeShort(((List) next3.getValue()).size());
                        for (String str12 : (List) next3.getValue()) {
                            dataOutputStream.writeUTF(str12);
                            C2530db.m5474a(3, f5573b, "Launch Options value is :".concat(String.valueOf(str12)));
                        }
                    }
                }
                int size2 = map4 != null ? map4.keySet().size() : 0;
                C2530db.m5474a(3, f5573b, "numOriginAttributions is:  ".concat(String.valueOf(size)));
                dataOutputStream.writeShort(size2);
                if (map4 != null) {
                    for (Map.Entry next4 : map4.entrySet()) {
                        String str13 = f5573b;
                        C2530db.m5474a(3, str13, "Origin Atttribute Key:  " + ((String) next4.getKey()));
                        dataOutputStream.writeUTF((String) next4.getKey());
                        dataOutputStream.writeShort(((Map) next4.getValue()).size());
                        String str14 = f5573b;
                        C2530db.m5474a(3, str14, "Origin Attribute Map Size for " + ((String) next4.getKey()) + ":  " + ((Map) next4.getValue()).size());
                        for (Map.Entry entry : ((Map) next4.getValue()).entrySet()) {
                            String str15 = f5573b;
                            C2530db.m5474a(3, str15, "Origin Atttribute for " + ((String) next4.getKey()) + ":  " + ((String) entry.getKey()) + CertificateUtil.DELIMITER + ((String) entry.getValue()));
                            if (entry.getKey() != null) {
                                str4 = (String) entry.getKey();
                            } else {
                                str4 = "";
                            }
                            dataOutputStream.writeUTF(str4);
                            if (entry.getValue() != null) {
                                str5 = (String) entry.getValue();
                            } else {
                                str5 = "";
                            }
                            dataOutputStream.writeUTF(str5);
                        }
                    }
                }
                dataOutputStream.writeUTF(C2615ej.m5682a(C2494ck.m5371a().f5832a));
                Consent flurryConsent = FlurryAgent.getFlurryConsent();
                if (flurryConsent == null) {
                    map5 = null;
                } else {
                    map5 = flurryConsent.getConsentStrings();
                }
                if (flurryConsent == null) {
                    i = 0;
                } else {
                    i = flurryConsent.isGdprScope() ? 1 : 2;
                }
                dataOutputStream.writeByte(i);
                if (map5 == null) {
                    dataOutputStream.writeShort(0);
                } else {
                    dataOutputStream.writeShort(map5.size());
                }
                if (map5 != null) {
                    for (Map.Entry next5 : map5.entrySet()) {
                        String str16 = f5573b;
                        C2530db.m5474a(3, str16, "Consent string for " + ((String) next5.getKey()) + ": " + ((String) next5.getValue()));
                        dataOutputStream.writeUTF((String) next5.getKey());
                        dataOutputStream.writeUTF((String) next5.getValue());
                    }
                }
                dataOutputStream.writeShort(list.size());
                for (C2414bl blVar : list) {
                    dataOutputStream.write(blVar.f5586a);
                }
                dataOutputStream.writeShort(0);
                dataOutputStream.writeShort(0);
                digestOutputStream.on(false);
                dataOutputStream.write(crVar.mo17708a());
                dataOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                C2619em.m5698a((Closeable) dataOutputStream);
            } catch (Throwable th) {
                th = th;
                try {
                    C2530db.m5475a(6, f5573b, "Error when generating report", th);
                    C2619em.m5698a((Closeable) dataOutputStream);
                    bArr = null;
                    this.f5574a = bArr;
                } catch (Throwable th2) {
                    C2619em.m5698a((Closeable) dataOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
            C2530db.m5475a(6, f5573b, "Error when generating report", th);
            C2619em.m5698a((Closeable) dataOutputStream);
            bArr = null;
            this.f5574a = bArr;
        }
        this.f5574a = bArr;
    }
}
